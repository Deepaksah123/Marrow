package com.google.android.exoplayer2.upstream.experimental;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.SlidingPercentile;
import com.google.android.exoplayer2.upstream.TimeToFirstByteEstimator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class PercentileTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final float DEFAULT_PERCENTILE = 0.5f;
    private static final int MAX_DATA_SPECS = 10;
    private final Clock clock;
    private final LinkedHashMap<DataSpec, Long> initializedDataSpecs;
    private boolean isEmpty;
    private final float percentile;
    private final SlidingPercentile slidingPercentile;

    public PercentileTimeToFirstByteEstimator() {
        this(10, 0.5f);
    }

    public PercentileTimeToFirstByteEstimator(int i, float f) {
        this(i, f, Clock.DEFAULT);
    }

    PercentileTimeToFirstByteEstimator(int i, float f, Clock clock) {
        Assertions.checkArgument(i > 0 && f > BitmapDescriptorFactory.HUE_RED && f <= 1.0f);
        this.percentile = f;
        this.clock = clock;
        this.initializedDataSpecs = new FixedSizeLinkedHashMap(10);
        this.slidingPercentile = new SlidingPercentile(i);
        this.isEmpty = true;
    }

    @Override // com.google.android.exoplayer2.upstream.TimeToFirstByteEstimator
    public final long getTimeToFirstByteEstimateUs() {
        return !this.isEmpty ? (long) this.slidingPercentile.getPercentile(this.percentile) : C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.upstream.TimeToFirstByteEstimator
    public final void reset() {
        this.slidingPercentile.reset();
        this.isEmpty = true;
    }

    @Override // com.google.android.exoplayer2.upstream.TimeToFirstByteEstimator
    public final void onTransferInitializing(DataSpec dataSpec) {
        this.initializedDataSpecs.remove(dataSpec);
        this.initializedDataSpecs.put(dataSpec, Long.valueOf(Util.msToUs(this.clock.elapsedRealtime())));
    }

    @Override // com.google.android.exoplayer2.upstream.TimeToFirstByteEstimator
    public final void onTransferStart(DataSpec dataSpec) {
        if (this.initializedDataSpecs.remove(dataSpec) == null) {
            return;
        }
        this.slidingPercentile.addSample(1, Util.msToUs(this.clock.elapsedRealtime()) - r6.longValue());
        this.isEmpty = false;
    }

    static class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize;

        public FixedSizeLinkedHashMap(int i) {
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.maxSize;
        }
    }
}
