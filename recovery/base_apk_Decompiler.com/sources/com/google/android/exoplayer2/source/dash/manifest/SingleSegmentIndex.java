package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class SingleSegmentIndex implements DashSegmentIndex {
    private final RangedUri uri;

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getAvailableSegmentCount(long j, long j2) {
        return 1L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getDurationUs(long j, long j2) {
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getFirstAvailableSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getFirstSegmentNum() {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getNextSegmentAvailableTimeUs(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getSegmentCount(long j) {
        return 1L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getTimeUs(long j) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final boolean isExplicit() {
        return true;
    }

    public SingleSegmentIndex(RangedUri rangedUri) {
        this.uri = rangedUri;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final RangedUri getSegmentUrl(long j) {
        return this.uri;
    }
}
