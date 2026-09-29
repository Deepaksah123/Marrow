package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private static final int MSG_UPDATE_TIMELINE = 4;
    private static final MediaItem PLACEHOLDER_MEDIA_ITEM = new MediaItem.Builder().setUri(Uri.EMPTY).build();
    private final Set<MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private Set<HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;
    private final Set<HandlerAndRunnable> pendingOnCompletionActions;
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected final void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final boolean isSingleWindow() {
        return false;
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, MediaSource... mediaSourceArr) {
        this(z, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        this(z, false, shuffleOrder, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, boolean z2, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        this.pendingOnCompletionActions = new HashSet();
        this.enabledMediaSourceHolders = new HashSet();
        this.isAtomic = z;
        this.useLazyPreparation = z2;
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final Timeline getInitialTimeline() {
        ShuffleOrder shuffleOrderCloneAndInsert;
        ConcatenatedTimeline concatenatedTimeline;
        synchronized (this) {
            if (this.shuffleOrder.getLength() != this.mediaSourcesPublic.size()) {
                shuffleOrderCloneAndInsert = this.shuffleOrder.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size());
            } else {
                shuffleOrderCloneAndInsert = this.shuffleOrder;
            }
            concatenatedTimeline = new ConcatenatedTimeline(this.mediaSourcesPublic, shuffleOrderCloneAndInsert, this.isAtomic);
        }
        return concatenatedTimeline;
    }

    public final void addMediaSource(MediaSource mediaSource) {
        synchronized (this) {
            addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
        }
    }

    public final void addMediaSource(MediaSource mediaSource, Handler handler, Runnable runnable) {
        synchronized (this) {
            addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
        }
    }

    public final void addMediaSource(int i, MediaSource mediaSource) {
        synchronized (this) {
            addPublicMediaSources(i, Collections.singletonList(mediaSource), null, null);
        }
    }

    public final void addMediaSource(int i, MediaSource mediaSource, Handler handler, Runnable runnable) {
        synchronized (this) {
            addPublicMediaSources(i, Collections.singletonList(mediaSource), handler, runnable);
        }
    }

    public final void addMediaSources(Collection<MediaSource> collection) {
        synchronized (this) {
            addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
        }
    }

    public final void addMediaSources(Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        synchronized (this) {
            addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
        }
    }

    public final void addMediaSources(int i, Collection<MediaSource> collection) {
        synchronized (this) {
            addPublicMediaSources(i, collection, null, null);
        }
    }

    public final void addMediaSources(int i, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        synchronized (this) {
            addPublicMediaSources(i, collection, handler, runnable);
        }
    }

    public final MediaSource removeMediaSource(int i) {
        MediaSource mediaSource;
        synchronized (this) {
            mediaSource = getMediaSource(i);
            removePublicMediaSources(i, i + 1, null, null);
        }
        return mediaSource;
    }

    public final MediaSource removeMediaSource(int i, Handler handler, Runnable runnable) {
        MediaSource mediaSource;
        synchronized (this) {
            mediaSource = getMediaSource(i);
            removePublicMediaSources(i, i + 1, handler, runnable);
        }
        return mediaSource;
    }

    public final void removeMediaSourceRange(int i, int i2) {
        synchronized (this) {
            removePublicMediaSources(i, i2, null, null);
        }
    }

    public final void removeMediaSourceRange(int i, int i2, Handler handler, Runnable runnable) {
        synchronized (this) {
            removePublicMediaSources(i, i2, handler, runnable);
        }
    }

    public final void moveMediaSource(int i, int i2) {
        synchronized (this) {
            movePublicMediaSource(i, i2, null, null);
        }
    }

    public final void moveMediaSource(int i, int i2, Handler handler, Runnable runnable) {
        synchronized (this) {
            movePublicMediaSource(i, i2, handler, runnable);
        }
    }

    public final void clear() {
        synchronized (this) {
            removeMediaSourceRange(0, getSize());
        }
    }

    public final void clear(Handler handler, Runnable runnable) {
        synchronized (this) {
            removeMediaSourceRange(0, getSize(), handler, runnable);
        }
    }

    public final int getSize() {
        int size;
        synchronized (this) {
            size = this.mediaSourcesPublic.size();
        }
        return size;
    }

    public final MediaSource getMediaSource(int i) {
        MaskingMediaSource maskingMediaSource;
        synchronized (this) {
            maskingMediaSource = this.mediaSourcesPublic.get(i).mediaSource;
        }
        return maskingMediaSource;
    }

    public final void setShuffleOrder(ShuffleOrder shuffleOrder) {
        synchronized (this) {
            setPublicShuffleOrder(shuffleOrder, null, null);
        }
    }

    public final void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        synchronized (this) {
            setPublicShuffleOrder(shuffleOrder, handler, runnable);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem getMediaItem() {
        return PLACEHOLDER_MEDIA_ITEM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(TransferListener transferListener) {
        synchronized (this) {
            super.prepareSourceInternal(transferListener);
            this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: com.google.android.exoplayer2.source.ConcatenatingMediaSource$$ExternalSyntheticLambda0
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f$0.handleMessage(message);
                }
            });
            if (this.mediaSourcesPublic.isEmpty()) {
                updateTimelineAndScheduleOnCompletionActions();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
                addMediaSourcesInternal(0, this.mediaSourcesPublic);
                scheduleTimelineUpdate();
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        MediaSourceHolder mediaSourceHolder = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (mediaSourceHolder == null) {
            mediaSourceHolder = new MediaSourceHolder(new FakeMediaSource(), this.useLazyPreparation);
            mediaSourceHolder.isRemoved = true;
            prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        }
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected final void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
        synchronized (this) {
            super.releaseSourceInternal();
            this.mediaSourceHolders.clear();
            this.enabledMediaSourceHolders.clear();
            this.mediaSourceByUid.clear();
            this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            Handler handler = this.playbackThreadHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.playbackThreadHandler = null;
            }
            this.timelineUpdateScheduled = false;
            this.nextTimelineUpdateOnCompletionActions.clear();
            dispatchOnCompletionActions(this.pendingOnCompletionActions);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void m101lambda$prepareChildSource$0$comgoogleandroidexoplayer2sourceCompositeMediaSource(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.activeMediaPeriodIds.size(); i++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i) {
        return i + mediaSourceHolder.firstWindowIndexInChild;
    }

    private void addPublicMediaSources(int i, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Iterator<MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            Assertions.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new MediaSourceHolder(it2.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new MessageData(i, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void removePublicMediaSources(int i, int i2, Handler handler, Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Util.removeRange(this.mediaSourcesPublic, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(1, new MessageData(i, Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void movePublicMediaSource(int i, int i2, Handler handler, Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        List<MediaSourceHolder> list = this.mediaSourcesPublic;
        list.add(i2, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(2, new MessageData(i, Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(3, new MessageData(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private HandlerAndRunnable createOnCompletionAction(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        HandlerAndRunnable handlerAndRunnable = new HandlerAndRunnable(handler, runnable);
        this.pendingOnCompletionActions.add(handlerAndRunnable);
        return handlerAndRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            MessageData messageData = (MessageData) Util.castNonNull(message.obj);
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, ((Collection) messageData.customData).size());
            addMediaSourcesInternal(messageData.index, (Collection) messageData.customData);
            scheduleTimelineUpdate(messageData.onCompletionAction);
        } else if (i == 1) {
            MessageData messageData2 = (MessageData) Util.castNonNull(message.obj);
            int i2 = messageData2.index;
            int iIntValue = ((Integer) messageData2.customData).intValue();
            if (i2 == 0 && iIntValue == this.shuffleOrder.getLength()) {
                this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i2, iIntValue);
            }
            while (true) {
                iIntValue--;
                if (iIntValue < i2) {
                    break;
                }
                removeMediaSourceInternal(iIntValue);
            }
            scheduleTimelineUpdate(messageData2.onCompletionAction);
        } else if (i == 2) {
            MessageData messageData3 = (MessageData) Util.castNonNull(message.obj);
            ShuffleOrder shuffleOrderCloneAndRemove = this.shuffleOrder.cloneAndRemove(messageData3.index, messageData3.index + 1);
            this.shuffleOrder = shuffleOrderCloneAndRemove;
            this.shuffleOrder = shuffleOrderCloneAndRemove.cloneAndInsert(((Integer) messageData3.customData).intValue(), 1);
            moveMediaSourceInternal(messageData3.index, ((Integer) messageData3.customData).intValue());
            scheduleTimelineUpdate(messageData3.onCompletionAction);
        } else if (i == 3) {
            MessageData messageData4 = (MessageData) Util.castNonNull(message.obj);
            this.shuffleOrder = (ShuffleOrder) messageData4.customData;
            scheduleTimelineUpdate(messageData4.onCompletionAction);
        } else if (i == 4) {
            updateTimelineAndScheduleOnCompletionActions();
        } else if (i == 5) {
            dispatchOnCompletionActions((Set) Util.castNonNull(message.obj));
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    private void scheduleTimelineUpdate(HandlerAndRunnable handlerAndRunnable) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(4).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (handlerAndRunnable != null) {
            this.nextTimelineUpdateOnCompletionActions.add(handlerAndRunnable);
        }
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        Set<HandlerAndRunnable> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        refreshSourceInfo(new ConcatenatedTimeline(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5, set).sendToTarget();
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (Handler) Assertions.checkNotNull(this.playbackThreadHandler);
    }

    private void dispatchOnCompletionActions(Set<HandlerAndRunnable> set) {
        synchronized (this) {
            Iterator<HandlerAndRunnable> it = set.iterator();
            while (it.hasNext()) {
                it.next().dispatch();
            }
            this.pendingOnCompletionActions.removeAll(set);
        }
    }

    private void addMediaSourcesInternal(int i, Collection<MediaSourceHolder> collection) {
        Iterator<MediaSourceHolder> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i, it.next());
            i++;
        }
    }

    private void addMediaSourceInternal(int i, MediaSourceHolder mediaSourceHolder) {
        if (i > 0) {
            MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i - 1);
            mediaSourceHolder.reset(i, mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
        } else {
            mediaSourceHolder.reset(i, 0);
        }
        correctOffsets(i, 1, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i, mediaSourceHolder);
        this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        } else {
            disableChildSource(mediaSourceHolder);
        }
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder.childIndex + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(mediaSourceHolder.childIndex + 1).firstWindowIndexInChild - mediaSourceHolder.firstWindowIndexInChild);
            if (windowCount != 0) {
                correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    private void removeMediaSourceInternal(int i) {
        MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceHolders.remove(i);
        this.mediaSourceByUid.remove(mediaSourceHolderRemove.uid);
        correctOffsets(i, -1, -mediaSourceHolderRemove.mediaSource.getTimeline().getWindowCount());
        mediaSourceHolderRemove.isRemoved = true;
        maybeReleaseChildSource(mediaSourceHolderRemove);
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        List<MediaSourceHolder> list = this.mediaSourceHolders;
        list.add(i2, list.remove(i));
        while (iMin <= iMax) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(iMin);
            mediaSourceHolder.childIndex = iMin;
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
    }

    private void correctOffsets(int i, int i2, int i3) {
        while (i < this.mediaSourceHolders.size()) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            mediaSourceHolder.childIndex += i2;
            mediaSourceHolder.firstWindowIndexInChild += i3;
            i++;
        }
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
            releaseChildSource(mediaSourceHolder);
        }
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        enableChildSource(mediaSourceHolder);
    }

    private void disableUnusedMediaSources() {
        Iterator<MediaSourceHolder> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            MediaSourceHolder next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return ConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getChildPeriodUid(Object obj) {
        return ConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        return ConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    static final class MediaSourceHolder {
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z);
        }

        public final void reset(int i, int i2) {
            this.childIndex = i;
            this.firstWindowIndexInChild = i2;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }
    }

    static final class MessageData<T> {
        public final T customData;
        public final int index;
        public final HandlerAndRunnable onCompletionAction;

        public MessageData(int i, T t, HandlerAndRunnable handlerAndRunnable) {
            this.index = i;
            this.customData = t;
            this.onCompletionAction = handlerAndRunnable;
        }
    }

    static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, ShuffleOrder shuffleOrder, boolean z) {
            super(z, shuffleOrder);
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            this.childIndexByUid = new HashMap<>();
            int windowCount = 0;
            int periodCount = 0;
            int i = 0;
            for (MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i] = mediaSourceHolder.mediaSource.getTimeline();
                this.firstWindowInChildIndices[i] = windowCount;
                this.firstPeriodInChildIndices[i] = periodCount;
                windowCount += this.timelines[i].getWindowCount();
                periodCount += this.timelines[i].getPeriodCount();
                this.uids[i] = mediaSourceHolder.uid;
                this.childIndexByUid.put(this.uids[i], Integer.valueOf(i));
                i++;
            }
            this.windowCount = windowCount;
            this.periodCount = periodCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByPeriodIndex(int i) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByWindowIndex(int i) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByChildUid(Object obj) {
            Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final Timeline getTimelineByChildIndex(int i) {
            return this.timelines[i];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getFirstPeriodIndexByChildIndex(int i) {
            return this.firstPeriodInChildIndices[i];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getFirstWindowIndexByChildIndex(int i) {
            return this.firstWindowInChildIndices[i];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final Object getChildUidByChildIndex(int i) {
            return this.uids[i];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getWindowCount() {
            return this.windowCount;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getPeriodCount() {
            return this.periodCount;
        }
    }

    static final class FakeMediaSource extends BaseMediaSource {
        @Override // com.google.android.exoplayer2.source.MediaSource
        public final void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        protected final void prepareSourceInternal(TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public final void releasePeriod(MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        protected final void releaseSourceInternal() {
        }

        private FakeMediaSource() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public final MediaItem getMediaItem() {
            return ConcatenatingMediaSource.PLACEHOLDER_MEDIA_ITEM;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
            throw new UnsupportedOperationException();
        }
    }

    static final class HandlerAndRunnable {
        private final Handler handler;
        private final Runnable runnable;

        public HandlerAndRunnable(Handler handler, Runnable runnable) {
            this.handler = handler;
            this.runnable = runnable;
        }

        public final void dispatch() {
            this.handler.post(this.runnable);
        }
    }
}
