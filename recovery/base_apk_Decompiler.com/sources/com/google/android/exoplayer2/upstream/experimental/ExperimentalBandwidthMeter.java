package com.google.android.exoplayer2.upstream.experimental;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TimeToFirstByteEstimator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.experimental.SplitParallelSampleBandwidthEstimator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.initExtraTracks;
import kotlin.onMoovContainerAtomRead;
import kotlin.parseMdhd;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class ExperimentalBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final float DEFAULT_TIME_TO_FIRST_BYTE_PERCENTILE = 0.5f;
    public static final int DEFAULT_TIME_TO_FIRST_BYTE_SAMPLES = 20;
    private final BandwidthEstimator bandwidthEstimator;
    private long initialBitrateEstimate;
    private final onMoovContainerAtomRead<Integer, Long> initialBitrateEstimates;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private final TimeToFirstByteEstimator timeToFirstByteEstimator;
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

    public static final class Builder {
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private TimeToFirstByteEstimator timeToFirstByteEstimator = new PercentileTimeToFirstByteEstimator(20, 0.5f);
        private BandwidthEstimator bandwidthEstimator = new SplitParallelSampleBandwidthEstimator.Builder().build();
        private boolean resetOnNetworkTypeChange = true;

        public Builder(Context context) {
            this.context = context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
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

        public final Builder setTimeToFirstByteEstimator(TimeToFirstByteEstimator timeToFirstByteEstimator) {
            this.timeToFirstByteEstimator = timeToFirstByteEstimator;
            return this;
        }

        public final Builder setBandwidthEstimator(BandwidthEstimator bandwidthEstimator) {
            this.bandwidthEstimator = bandwidthEstimator;
            return this;
        }

        public final Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        public final ExperimentalBandwidthMeter build() {
            return new ExperimentalBandwidthMeter(this.context, this.initialBitrateEstimates, this.timeToFirstByteEstimator, this.bandwidthEstimator, this.resetOnNetworkTypeChange);
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = ExperimentalBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            map.put(2, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]));
            map.put(3, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            map.put(4, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            map.put(5, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            map.put(10, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            map.put(9, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            map.put(7, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]));
            return map;
        }
    }

    private ExperimentalBandwidthMeter(Context context, Map<Integer, Long> map, TimeToFirstByteEstimator timeToFirstByteEstimator, BandwidthEstimator bandwidthEstimator, boolean z) {
        this.initialBitrateEstimates = onMoovContainerAtomRead.write(map);
        this.timeToFirstByteEstimator = timeToFirstByteEstimator;
        this.bandwidthEstimator = bandwidthEstimator;
        this.resetOnNetworkTypeChange = z;
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.initialBitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: com.google.android.exoplayer2.upstream.experimental.ExperimentalBandwidthMeter$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i) {
                this.f$0.onNetworkTypeChanged(i);
            }
        });
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
        long bandwidthEstimate;
        synchronized (this) {
            bandwidthEstimate = this.bandwidthEstimator.getBandwidthEstimate();
            if (bandwidthEstimate == Long.MIN_VALUE) {
                bandwidthEstimate = this.initialBitrateEstimate;
            }
        }
        return bandwidthEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final long getTimeToFirstByteEstimateUs() {
        return this.timeToFirstByteEstimator.getTimeToFirstByteEstimateUs();
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.bandwidthEstimator.addEventListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.bandwidthEstimator.removeEventListener(eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            this.timeToFirstByteEstimator.onTransferInitializing(dataSpec);
            this.bandwidthEstimator.onTransferInitializing(dataSource);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                this.timeToFirstByteEstimator.onTransferStart(dataSpec);
                this.bandwidthEstimator.onTransferStart(dataSource);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                this.bandwidthEstimator.onBytesTransferred(dataSource, i);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                this.bandwidthEstimator.onTransferEnd(dataSource);
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
                long initialBitrateEstimateForNetworkType = getInitialBitrateEstimateForNetworkType(i);
                this.initialBitrateEstimate = initialBitrateEstimateForNetworkType;
                this.bandwidthEstimator.onNetworkTypeChange(initialBitrateEstimateForNetworkType);
                this.timeToFirstByteEstimator.reset();
            }
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.experimental.ExperimentalBandwidthMeter.getInitialBitrateCountryGroupAssignment(java.lang.String):int[]");
    }
}
