package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.initExtraTracks;
import kotlin.onMoovContainerAtomRead;
import kotlin.parseMdhd;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final onMoovContainerAtomRead<Integer, Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final initExtraTracks<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = initExtraTracks.read(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final initExtraTracks<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = initExtraTracks.read(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final initExtraTracks<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = initExtraTracks.read(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final initExtraTracks<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = initExtraTracks.read(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final initExtraTracks<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = initExtraTracks.read(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final initExtraTracks<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = initExtraTracks.read(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final TransferListener getTransferListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    public static final class Builder {
        private Clock clock;
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        public final Builder setSlidingWindowMaxWeight(int i) {
            this.slidingWindowMaxWeight = i;
            return this;
        }

        public final Builder setInitialBitrateEstimate(long j) {
            Iterator<Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j);
            }
            return this;
        }

        public final Builder setInitialBitrateEstimate(int i, long j) {
            this.initialBitrateEstimates.put(Integer.valueOf(i), Long.valueOf(j));
            return this;
        }

        public final Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(parseMdhd.IconCompatParcelizer(str));
            return this;
        }

        public final Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public final Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        public final DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = DefaultBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            map.put(2, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]));
            map.put(3, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            map.put(4, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            map.put(5, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            map.put(10, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            map.put(9, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            map.put(7, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]));
            return map;
        }
    }

    public static DefaultBandwidthMeter getSingletonInstance(Context context) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        synchronized (DefaultBandwidthMeter.class) {
            if (singletonInstance == null) {
                singletonInstance = new Builder(context).build();
            }
            defaultBandwidthMeter = singletonInstance;
        }
        return defaultBandwidthMeter;
    }

    private DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i, Clock clock, boolean z) {
        this.initialBitrateEstimates = onMoovContainerAtomRead.write(map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z;
        if (context != null) {
            NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
            int networkType = networkTypeObserver.getNetworkType();
            this.networkType = networkType;
            this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
            networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: com.google.android.exoplayer2.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
                public final void onNetworkTypeChanged(int i2) {
                    this.f$0.onNetworkTypeChanged(i2);
                }
            });
            return;
        }
        this.networkType = 0;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(0);
    }

    public final void setNetworkTypeOverride(int i) {
        synchronized (this) {
            this.networkTypeOverride = i;
            this.networkTypeOverrideSet = true;
            onNetworkTypeChanged(i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final long getBitrateEstimate() {
        long j;
        synchronized (this) {
            j = this.bitrateEstimate;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                this.sampleBytesTransferred += (long) i;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
        synchronized (this) {
            try {
                if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                    Assertions.checkState(this.streamCount > 0);
                    long jElapsedRealtime = this.clock.elapsedRealtime();
                    int i = (int) (jElapsedRealtime - this.sampleStartTimeMs);
                    this.totalElapsedTimeMs += (long) i;
                    long j = this.totalBytesTransferred;
                    long j2 = this.sampleBytesTransferred;
                    this.totalBytesTransferred = j + j2;
                    if (i > 0) {
                        this.slidingPercentile.addSample((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                        if (this.totalElapsedTimeMs >= 2000 || this.totalBytesTransferred >= 524288) {
                            this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                        }
                        maybeNotifyBandwidthSample(i, this.sampleBytesTransferred, this.bitrateEstimate);
                        this.sampleStartTimeMs = jElapsedRealtime;
                        this.sampleBytesTransferred = 0L;
                    }
                    this.streamCount--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNetworkTypeChanged(int i) {
        synchronized (this) {
            int i2 = this.networkType;
            if (i2 == 0 || this.resetOnNetworkTypeChange) {
                if (this.networkTypeOverrideSet) {
                    i = this.networkTypeOverride;
                }
                if (i2 == i) {
                    return;
                }
                this.networkType = i;
                if (i == 1 || i == 0 || i == 8) {
                    return;
                }
                this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i);
                long jElapsedRealtime = this.clock.elapsedRealtime();
                maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (jElapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = jElapsedRealtime;
                this.sampleBytesTransferred = 0L;
                this.totalBytesTransferred = 0L;
                this.totalElapsedTimeMs = 0L;
                this.slidingPercentile.reset();
            }
        }
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j2;
        this.eventDispatcher.bandwidthSample(i, j, j2);
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        Long l = this.initialBitrateEstimates.get(Integer.valueOf(i));
        if (l == null) {
            l = this.initialBitrateEstimates.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0b53  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] getInitialBitrateCountryGroupAssignment(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 7962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.getInitialBitrateCountryGroupAssignment(java.lang.String):int[]");
    }
}
