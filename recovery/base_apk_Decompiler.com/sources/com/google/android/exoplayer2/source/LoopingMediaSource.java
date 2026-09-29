package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class LoopingMediaSource extends WrappingMediaSource {
    private final Map<MediaSource.MediaPeriodId, MediaSource.MediaPeriodId> childMediaPeriodIdToMediaPeriodId;
    private final int loopCount;
    private final Map<MediaPeriod, MediaSource.MediaPeriodId> mediaPeriodToChildMediaPeriodId;

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final boolean isSingleWindow() {
        return false;
    }

    public LoopingMediaSource(MediaSource mediaSource) {
        this(mediaSource, Integer.MAX_VALUE);
    }

    public LoopingMediaSource(MediaSource mediaSource, int i) {
        super(new MaskingMediaSource(mediaSource, false));
        Assertions.checkArgument(i > 0);
        this.loopCount = i;
        this.childMediaPeriodIdToMediaPeriodId = new HashMap();
        this.mediaPeriodToChildMediaPeriodId = new HashMap();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final Timeline getInitialTimeline() {
        MaskingMediaSource maskingMediaSource = (MaskingMediaSource) this.mediaSource;
        if (this.loopCount != Integer.MAX_VALUE) {
            return new LoopingTimeline(maskingMediaSource.getTimeline(), this.loopCount);
        }
        return new InfinitelyLoopingTimeline(maskingMediaSource.getTimeline());
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        if (this.loopCount == Integer.MAX_VALUE) {
            return this.mediaSource.createPeriod(mediaPeriodId, allocator, j);
        }
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(LoopingTimeline.getChildPeriodUidFromConcatenatedUid(mediaPeriodId.periodUid));
        this.childMediaPeriodIdToMediaPeriodId.put(mediaPeriodIdCopyWithPeriodUid, mediaPeriodId);
        MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j);
        this.mediaPeriodToChildMediaPeriodId.put(mediaPeriodCreatePeriod, mediaPeriodIdCopyWithPeriodUid);
        return mediaPeriodCreatePeriod;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        this.mediaSource.releasePeriod(mediaPeriod);
        MediaSource.MediaPeriodId mediaPeriodIdRemove = this.mediaPeriodToChildMediaPeriodId.remove(mediaPeriod);
        if (mediaPeriodIdRemove != null) {
            this.childMediaPeriodIdToMediaPeriodId.remove(mediaPeriodIdRemove);
        }
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    protected final void onChildSourceInfoRefreshed(Timeline timeline) {
        Timeline infinitelyLoopingTimeline;
        if (this.loopCount != Integer.MAX_VALUE) {
            infinitelyLoopingTimeline = new LoopingTimeline(timeline, this.loopCount);
        } else {
            infinitelyLoopingTimeline = new InfinitelyLoopingTimeline(timeline);
        }
        refreshSourceInfo(infinitelyLoopingTimeline);
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    protected final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return this.loopCount != Integer.MAX_VALUE ? this.childMediaPeriodIdToMediaPeriodId.get(mediaPeriodId) : mediaPeriodId;
    }

    static final class LoopingTimeline extends AbstractConcatenatedTimeline {
        private final int childPeriodCount;
        private final Timeline childTimeline;
        private final int childWindowCount;
        private final int loopCount;

        public LoopingTimeline(Timeline timeline, int i) {
            super(false, new ShuffleOrder.UnshuffledShuffleOrder(i));
            this.childTimeline = timeline;
            int periodCount = timeline.getPeriodCount();
            this.childPeriodCount = periodCount;
            this.childWindowCount = timeline.getWindowCount();
            this.loopCount = i;
            if (periodCount > 0) {
                Assertions.checkState(i <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getWindowCount() {
            return this.childWindowCount * this.loopCount;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getPeriodCount() {
            return this.childPeriodCount * this.loopCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByPeriodIndex(int i) {
            return i / this.childPeriodCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByWindowIndex(int i) {
            return i / this.childWindowCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByChildUid(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final Timeline getTimelineByChildIndex(int i) {
            return this.childTimeline;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getFirstPeriodIndexByChildIndex(int i) {
            return i * this.childPeriodCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getFirstWindowIndexByChildIndex(int i) {
            return i * this.childWindowCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final Object getChildUidByChildIndex(int i) {
            return Integer.valueOf(i);
        }
    }

    static final class InfinitelyLoopingTimeline extends ForwardingTimeline {
        public InfinitelyLoopingTimeline(Timeline timeline) {
            super(timeline);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final int getNextWindowIndex(int i, int i2, boolean z) {
            int nextWindowIndex = this.timeline.getNextWindowIndex(i, i2, z);
            return nextWindowIndex == -1 ? getFirstWindowIndex(z) : nextWindowIndex;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final int getPreviousWindowIndex(int i, int i2, boolean z) {
            int previousWindowIndex = this.timeline.getPreviousWindowIndex(i, i2, z);
            return previousWindowIndex == -1 ? getLastWindowIndex(z) : previousWindowIndex;
        }
    }
}
