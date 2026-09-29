package com.google.android.exoplayer2.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 0;
    private final MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final initExtraTracks<MediaSourceHolder> mediaSourceHolders;
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    private static long getChildWindowSequenceNumber(long j, int i, int i2) {
        return (j * ((long) i)) + ((long) i2);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected final void enableInternal() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(Integer num, int i) {
        return 0;
    }

    public static final class Builder {
        private int index;
        private MediaItem mediaItem;
        private MediaSource.Factory mediaSourceFactory;
        private final initExtraTracks.IconCompatParcelizer<MediaSourceHolder> mediaSourceHoldersBuilder = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();

        public final Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }

        public final Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.mediaSourceFactory = (MediaSource.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        public final Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public final Builder add(MediaItem mediaItem) {
            return add(mediaItem, C.TIME_UNSET);
        }

        public final Builder add(MediaItem mediaItem, long j) {
            Assertions.checkNotNull(mediaItem);
            Assertions.checkStateNotNull(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j);
        }

        public final Builder add(MediaSource mediaSource) {
            return add(mediaSource, C.TIME_UNSET);
        }

        public final Builder add(MediaSource mediaSource, long j) {
            Assertions.checkNotNull(mediaSource);
            Assertions.checkState(((mediaSource instanceof ProgressiveMediaSource) && j == C.TIME_UNSET) ? false : true, "Progressive media source must define an initial placeholder duration.");
            initExtraTracks.IconCompatParcelizer<MediaSourceHolder> iconCompatParcelizer = this.mediaSourceHoldersBuilder;
            int i = this.index;
            this.index = i + 1;
            iconCompatParcelizer.read(new MediaSourceHolder(mediaSource, i, Util.msToUs(j)));
            return this;
        }

        public final ConcatenatingMediaSource2 build() {
            Assertions.checkArgument(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = MediaItem.fromUri(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.IconCompatParcelizer());
        }
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, initExtraTracks<MediaSourceHolder> initextratracks) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = initextratracks;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem getMediaItem() {
        return this.mediaItem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: com.google.android.exoplayer2.source.ConcatenatingMediaSource2$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.handleMessage(message);
            }
        });
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            prepareChildSource(Integer.valueOf(i), this.mediaSourceHolders.get(i).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), mediaSourceHolder.index));
        enableChildSource(Integer.valueOf(mediaSourceHolder.index));
        mediaSourceHolder.activeMediaPeriods++;
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithWindowSequenceNumber, allocator, j);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        ((MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod))).mediaSource.releasePeriod(mediaPeriod);
        r0.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void m101lambda$prepareChildSource$0$comgoogleandroidexoplayer2sourceCompositeMediaSource(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return true;
        }
        updateTimeline();
        return true;
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        ((Handler) Assertions.checkNotNull(this.playbackThreadHandler)).obtainMessage(0).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        ConcatenatedTimeline concatenatedTimelineMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (concatenatedTimelineMaybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(concatenatedTimelineMaybeCreateConcatenatedTimeline);
        }
    }

    private void disableUnusedMediaSources() {
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    private ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        Timeline.Period period;
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer;
        long j;
        Timeline timeline;
        int i;
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period2 = new Timeline.Period();
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver2 = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver3 = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        int i2 = 0;
        int periodCount = 0;
        Object obj = null;
        boolean z4 = false;
        long j2 = 0;
        boolean z5 = false;
        long j3 = 0;
        long j4 = 0;
        while (i2 < this.mediaSourceHolders.size()) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i2);
            Timeline timeline2 = mediaSourceHolder.mediaSource.getTimeline();
            Assertions.checkArgument(timeline2.isEmpty() ^ z, "Can't concatenate empty child Timeline.");
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(timeline2);
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver2.read(Integer.valueOf(periodCount));
            periodCount += timeline2.getPeriodCount();
            int i3 = 0;
            while (i3 < timeline2.getWindowCount()) {
                timeline2.getWindow(i3, window);
                if (!z4) {
                    obj = window.manifest;
                    z4 = true;
                }
                if (z2 && Util.areEqual(obj, window.manifest)) {
                    timeline = timeline2;
                    z2 = true;
                } else {
                    timeline = timeline2;
                    z2 = false;
                }
                long j5 = window.durationUs;
                if (j5 == C.TIME_UNSET) {
                    if (mediaSourceHolder.initialPlaceholderDurationUs == C.TIME_UNSET) {
                        return null;
                    }
                    j5 = mediaSourceHolder.initialPlaceholderDurationUs;
                }
                j3 += j5;
                if (mediaSourceHolder.index == 0 && i3 == 0) {
                    i = i2;
                    j4 = window.defaultPositionUs;
                    j2 = -window.positionInFirstPeriodUs;
                } else {
                    i = i2;
                    Assertions.checkArgument(window.positionInFirstPeriodUs == 0, "Can't concatenate windows. A window has a non-zero offset in a period.");
                }
                z3 &= window.isSeekable || window.isPlaceholder;
                z5 |= window.isDynamic;
                i3++;
                timeline2 = timeline;
                i2 = i;
            }
            Timeline timeline3 = timeline2;
            int i4 = i2;
            int periodCount2 = timeline3.getPeriodCount();
            int i5 = 0;
            while (i5 < periodCount2) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver3.read(Long.valueOf(j2));
                Timeline timeline4 = timeline3;
                timeline4.getPeriod(i5, period2);
                long j6 = period2.durationUs;
                if (j6 == C.TIME_UNSET) {
                    period = period2;
                    Assertions.checkArgument(periodCount2 == 1, "Can't concatenate multiple periods with unknown duration in one window.");
                    if (window.durationUs != C.TIME_UNSET) {
                        j = window.durationUs;
                    } else {
                        j = mediaSourceHolder.initialPlaceholderDurationUs;
                    }
                    iconCompatParcelizer = iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver;
                    j6 = j + window.positionInFirstPeriodUs;
                } else {
                    period = period2;
                    iconCompatParcelizer = iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver;
                }
                j2 += j6;
                i5++;
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
                period2 = period;
                timeline3 = timeline4;
            }
            i2 = i4 + 1;
            z = true;
        }
        return new ConcatenatedTimeline(this.mediaItem, iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver2.IconCompatParcelizer(), iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver3.IconCompatParcelizer(), z3, z5, j3, j4, !z2 ? null : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i, Object obj) {
        return Pair.create(Integer.valueOf(i), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j, int i) {
        return (int) (j % ((long) i));
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j, int i) {
        return j / ((long) i);
    }

    static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;

        public MediaSourceHolder(MediaSource mediaSource, int i, long j) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i;
            this.initialPlaceholderDurationUs = j;
        }
    }

    static final class ConcatenatedTimeline extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final initExtraTracks<Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;
        private final Object manifest;
        private final MediaItem mediaItem;
        private final initExtraTracks<Long> periodOffsetsInWindowUs;
        private final initExtraTracks<Timeline> timelines;

        @Override // com.google.android.exoplayer2.Timeline
        public final int getWindowCount() {
            return 1;
        }

        public ConcatenatedTimeline(MediaItem mediaItem, initExtraTracks<Timeline> initextratracks, initExtraTracks<Integer> initextratracks2, initExtraTracks<Long> initextratracks3, boolean z, boolean z2, long j, long j2, Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = initextratracks;
            this.firstPeriodIndices = initextratracks2;
            this.periodOffsetsInWindowUs = initextratracks3;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.durationUs = j;
            this.defaultPositionUs = j2;
            this.manifest = obj;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -this.periodOffsetsInWindowUs.get(0).longValue());
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = this.timelines.get(childIndex);
            int iIntValue = this.firstPeriodIndices.get(childIndex).intValue();
            int indexOfPeriod = timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(iIntValue + indexOfPeriod).longValue();
            period.uid = obj;
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            this.timelines.get(childIndexByPeriodIndex).getPeriod(i - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue(), period, z);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(i).longValue();
            if (z) {
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, Assertions.checkNotNull(period.uid));
            }
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = this.timelines.get(childIndex).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.firstPeriodIndices.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Object getUidOfPeriod(int i) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, this.timelines.get(childIndexByPeriodIndex).getUidOfPeriod(i - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue()));
        }

        private int getChildIndexByPeriodIndex(int i) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i + 1), false, false);
        }
    }
}
