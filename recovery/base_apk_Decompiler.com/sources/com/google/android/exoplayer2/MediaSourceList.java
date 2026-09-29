package com.google.android.exoplayer2;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.buildSetStopReasonIntent;
import kotlin.needsStartedService;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class MediaSourceList {
    private static final String TAG = "MediaSourceList";
    private final HandlerWrapper eventHandler;
    private final AnalyticsCollector eventListener;
    private boolean isPrepared;
    private final MediaSourceListInfoRefreshListener mediaSourceListInfoListener;
    private TransferListener mediaTransferListener;
    private final PlayerId playerId;
    private ShuffleOrder shuffleOrder = new ShuffleOrder.DefaultShuffleOrder(0);
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod = new IdentityHashMap<>();
    private final Map<Object, MediaSourceHolder> mediaSourceByUid = new HashMap();
    private final List<MediaSourceHolder> mediaSourceHolders = new ArrayList();
    private final HashMap<MediaSourceHolder, MediaSourceAndListener> childSources = new HashMap<>();
    private final Set<MediaSourceHolder> enabledMediaSourceHolders = new HashSet();

    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, PlayerId playerId) {
        this.playerId = playerId;
        this.mediaSourceListInfoListener = mediaSourceListInfoRefreshListener;
        this.eventListener = analyticsCollector;
        this.eventHandler = handlerWrapper;
    }

    public final Timeline setMediaSources(List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        removeMediaSourcesInternal(0, this.mediaSourceHolders.size());
        return addMediaSources(this.mediaSourceHolders.size(), list, shuffleOrder);
    }

    public final Timeline addMediaSources(int i, List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        if (!list.isEmpty()) {
            this.shuffleOrder = shuffleOrder;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                MediaSourceHolder mediaSourceHolder = list.get(i2 - i);
                if (i2 > 0) {
                    MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i2 - 1);
                    mediaSourceHolder.reset(mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
                } else {
                    mediaSourceHolder.reset(0);
                }
                correctOffsets(i2, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
                this.mediaSourceHolders.add(i2, mediaSourceHolder);
                this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
                if (this.isPrepared) {
                    prepareChildSource(mediaSourceHolder);
                    if (this.mediaSourceByMediaPeriod.isEmpty()) {
                        this.enabledMediaSourceHolders.add(mediaSourceHolder);
                    } else {
                        disableChildSource(mediaSourceHolder);
                    }
                }
            }
        }
        return createTimeline();
    }

    public final Timeline removeMediaSourceRange(int i, int i2, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i >= 0 && i <= i2 && i2 <= getSize());
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(i, i2);
        return createTimeline();
    }

    public final Timeline moveMediaSource(int i, int i2, ShuffleOrder shuffleOrder) {
        return moveMediaSourceRange(i, i + 1, i2, shuffleOrder);
    }

    public final Timeline moveMediaSourceRange(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i >= 0 && i <= i2 && i2 <= getSize() && i3 >= 0);
        this.shuffleOrder = shuffleOrder;
        if (i == i2 || i == i3) {
            return createTimeline();
        }
        int iMin = Math.min(i, i3);
        int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        Util.moveItems(this.mediaSourceHolders, i, i2, i3);
        while (iMin <= iMax) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(iMin);
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
        return createTimeline();
    }

    public final Timeline clear(ShuffleOrder shuffleOrder) {
        if (shuffleOrder == null) {
            shuffleOrder = this.shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(0, getSize());
        return createTimeline();
    }

    public final boolean isPrepared() {
        return this.isPrepared;
    }

    public final int getSize() {
        return this.mediaSourceHolders.size();
    }

    public final Timeline setShuffleOrder(ShuffleOrder shuffleOrder) {
        int size = getSize();
        if (shuffleOrder.getLength() != size) {
            shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
        }
        this.shuffleOrder = shuffleOrder;
        return createTimeline();
    }

    public final void prepare(TransferListener transferListener) {
        Assertions.checkState(!this.isPrepared);
        this.mediaTransferListener = transferListener;
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            prepareChildSource(mediaSourceHolder);
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        }
        this.isPrepared = true;
    }

    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByUid.get(mediaSourceHolderUid));
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    public final void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    public final void release() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            try {
                mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            } catch (RuntimeException e) {
                Log.e(TAG, "Failed to release child source.", e);
            }
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
        this.enabledMediaSourceHolders.clear();
        this.isPrepared = false;
    }

    public final Timeline createTimeline() {
        if (this.mediaSourceHolders.isEmpty()) {
            return Timeline.EMPTY;
        }
        int windowCount = 0;
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
        }
        return new PlaylistTimeline(this.mediaSourceHolders, this.shuffleOrder);
    }

    public final ShuffleOrder getShuffleOrder() {
        return this.shuffleOrder;
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        MediaSourceAndListener mediaSourceAndListener = this.childSources.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
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

    private void disableChildSource(MediaSourceHolder mediaSourceHolder) {
        MediaSourceAndListener mediaSourceAndListener = this.childSources.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    private void removeMediaSourcesInternal(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceHolders.remove(i2);
            this.mediaSourceByUid.remove(mediaSourceHolderRemove.uid);
            correctOffsets(i2, -mediaSourceHolderRemove.mediaSource.getTimeline().getWindowCount());
            mediaSourceHolderRemove.isRemoved = true;
            if (this.isPrepared) {
                maybeReleaseChildSource(mediaSourceHolderRemove);
            }
        }
    }

    private void correctOffsets(int i, int i2) {
        while (i < this.mediaSourceHolders.size()) {
            this.mediaSourceHolders.get(i).firstWindowIndexInChild += i2;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.activeMediaPeriodIds.size(); i++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i) {
        return i + mediaSourceHolder.firstWindowIndexInChild;
    }

    private void prepareChildSource(MediaSourceHolder mediaSourceHolder) {
        MaskingMediaSource maskingMediaSource = mediaSourceHolder.mediaSource;
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.MediaSourceList$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                this.f$0.m38lambda$prepareChildSource$0$comgoogleandroidexoplayer2MediaSourceList(mediaSource, timeline);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(mediaSourceHolder);
        this.childSources.put(mediaSourceHolder, new MediaSourceAndListener(maskingMediaSource, mediaSourceCaller, forwardingEventListener));
        maskingMediaSource.addEventListener(Util.createHandlerForCurrentOrMainLooper(), forwardingEventListener);
        maskingMediaSource.addDrmEventListener(Util.createHandlerForCurrentOrMainLooper(), forwardingEventListener);
        maskingMediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, this.playerId);
    }

    /* JADX INFO: renamed from: lambda$prepareChildSource$0$com-google-android-exoplayer2-MediaSourceList, reason: not valid java name */
    final /* synthetic */ void m38lambda$prepareChildSource$0$comgoogleandroidexoplayer2MediaSourceList(MediaSource mediaSource, Timeline timeline) {
        this.mediaSourceListInfoListener.onPlaylistUpdateRequested();
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.remove(mediaSourceHolder));
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
        }
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return PlaylistTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getChildPeriodUid(Object obj) {
        return PlaylistTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        return PlaylistTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    static final class MediaSourceHolder implements MediaSourceInfoHolder {
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z);
        }

        public final void reset(int i) {
            this.firstWindowIndexInChild = i;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public final Object getUid() {
            return this.uid;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public final Timeline getTimeline() {
            return this.mediaSource.getTimeline();
        }
    }

    static final class MediaSourceAndListener {
        public final MediaSource.MediaSourceCaller caller;
        public final ForwardingEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, ForwardingEventListener forwardingEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = forwardingEventListener;
        }
    }

    final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        private final MediaSourceHolder id;

        public ForwardingEventListener(MediaSourceHolder mediaSourceHolder) {
            this.id = mediaSourceHolder;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m49lambda$onLoadStarted$0$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadStarted$0$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m49lambda$onLoadStarted$0$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onLoadStarted(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m47lambda$onLoadCompleted$1$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadCompleted$1$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m47lambda$onLoadCompleted$1$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onLoadCompleted(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m46lambda$onLoadCanceled$2$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadCanceled$2$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m46lambda$onLoadCanceled$2$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onLoadCanceled(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m48lambda$onLoadError$3$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters, loadEventInfo, mediaLoadData, iOException, z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadError$3$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m48lambda$onLoadError$3$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            MediaSourceList.this.eventListener.onLoadError(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, iOException, z);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m50lambda$onUpstreamDiscarded$4$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onUpstreamDiscarded$4$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m50lambda$onUpstreamDiscarded$4$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onUpstreamDiscarded(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) Assertions.checkNotNull((MediaSource.MediaPeriodId) pair.second), mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m39lambda$onDownstreamFormatChanged$5$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDownstreamFormatChanged$5$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m39lambda$onDownstreamFormatChanged$5$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onDownstreamFormatChanged(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, final int i2) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m43lambda$onDrmSessionAcquired$6$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters, i2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmSessionAcquired$6$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m43lambda$onDrmSessionAcquired$6$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair, int i) {
            MediaSourceList.this.eventListener.onDrmSessionAcquired(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, i);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m40lambda$onDrmKeysLoaded$7$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmKeysLoaded$7$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m40lambda$onDrmKeysLoaded$7$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair) {
            MediaSourceList.this.eventListener.onDrmKeysLoaded(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, final Exception exc) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m44lambda$onDrmSessionManagerError$8$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters, exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmSessionManagerError$8$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m44lambda$onDrmSessionManagerError$8$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair, Exception exc) {
            MediaSourceList.this.eventListener.onDrmSessionManagerError(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, exc);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m42lambda$onDrmKeysRestored$9$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmKeysRestored$9$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m42lambda$onDrmKeysRestored$9$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair) {
            MediaSourceList.this.eventListener.onDrmKeysRestored(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda7
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$d = {18, -64, -35, -97, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, -13, -4, 3, 5, -1, -2, 15};
                    private static final int $$e = 160;
                    private static final byte[] $$a = {123, -91, -44, 22, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, TarConstants.LF_FIFO, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
                    private static final int $$b = 43;
                    private static int write = 0;
                    private static int RemoteActionCompatParcelizer = 1;
                    private static char[] read = {6470, 6467, 6832, 6406, 6523, 6429, 6425, 6472, 6488, 6520, 6525, 6524, 6493, 6430, 6427, 6833, 6835, 6480, 6464, 6494, 6475, 6508, 6509, 6426, 6468, 6417, 6471, 6418, 6496, 6838, 6400, 6434, 6834, 6502, 6466, 6497, 6476, 6479, 6469, 6401, 6473, 6505, 6503, 6408, 6477, 6498, 6511, 6500, 6507, 6492, 6506, 6431, 6501, 6522, 6491, 6495, 6481, 6405, 6499, 6478, 6465, 6428, 6474, 6490};
                    private static char AudioAttributesCompatParcelizer = 11450;
                    private static char[] IconCompatParcelizer = {44950, 44984, 44979, 44999, 45022, 44979, 45050, 45030, 45036, 45021, 45010, 45029, 45036, 45033, 45051, 45050, 45025, 45017, 45021, 45027, 44696, 44681, 44687, 44681, 44683, 44678, 44917, 44696, 44699, 44678, 44909, 44983, 45041, 44811, 44812, 44984, 45027, 45025, 45012, 45038, 45030, 45030, 44991, 45028, 45050, 45051, 45024, 45027, 45025, 45027, 45027, 45020, 45014, 45031, 45039, 45010, 45038, 45029, 45010, 44982, 45017, 45052, 45028, 45031, 45049, 45030, 45038, 45030, 45018, 45005, 45025, 45025, 44985, 45036, 45030, 45009, 45022, 45025, 45049, 45028, 45037, 45037, 45036, 45032, 45024, 45030, 45022, 45023, 45038, 45039, 45025, 44811, 44903, 44881, 44886, 44884, 44827, 44695, 44713, 44713, 44917, 44674, 44718, 44694, 44718, 44705, 44719, 44716, 44708, 44673, 44682, 44694, 44713, 44705, 44675, 44922, 44678, 44713, 44705, 44716, 44693, 44693, 44692, 44688, 44712, 44718, 44679, 44673, 44688, 44713, 44707, 44706, 44711, 44815, 44675, 44683, 44912, 44884, 44899, 44678, 44686, 44681, 44675, 44680, 44912, 44680, 44908, 44887, 44683, 44683, 44913, 44919, 44680, 44682, 44914, 44918, 44919, 44919, 44686, 44675, 44683, 44896, 44868, 44976, 45030, 45017, 45009, 45031, 45036, 45039, 45025, 45028, 45039, 45025, 45025, 45005, 44996, 45025, 45030, 44996, 44978, 45015, 45030, 44882, 44884, 44886, 44887, 44888, 44890, 44907, 44887, 44877, 44868, 44906, 44991, 45039, 45025, 45025, 45005, 44996, 45025, 45030, 44996, 44978, 45009, 45031, 45036, 45039, 45025, 45033, 44873, 44855, 44852, 44852, 44976, 45030, 45036, 45012, 44850, 44852, 44852, 44816, 44842, 44851, 44848, 44855, 44823, 44826, 44858, 44875, 44855, 45048, 44987, 45036, 45028, 45052, 45028, 45032, 45026, 45026, 44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44994, 45027, 45028, 45051, 45030, 45027, 45051, 45019, 44997, 45028, 44999, 45002, 45012, 45026, 45024, 45037, 45024, 45054, 45049, 45025, 44984, 45030, 45051, 45028, 45011, 44978, 45019, 45051, 45027, 45030, 45051, 45028, 45027, 44994, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 45024, 45052, 44984, 45030, 45032, 45010, 45032, 45037, 45036, 45038, 45036, 45011, 45021, 45037, 45027, 45036, 44984, 45025, 45030, 45036, 45030, 45032, 45010, 45032, 45037, 45036, 45038, 45036, 45011, 45021, 45037, 45037, 45038, 44803, 44678, 44672, 44674, 44676, 44676, 44896, 44922, 44675, 44672, 44679, 44903, 44921, 44676, 44674, 44678, 44673, 44685, 44676, 44926, 44906, 44918, 44677, 44699, 44952, 45012, 44840, 44984, 45024, 45054, 45036, 45035, 45050, 45049, 45054, 45030, 45009, 45033, 45030, 45036, 45054, 44922, 44918, 45052, 44899, 44899, 44909, 44908, 44898, 44896, 44901, 44897, 44911, 44866, 44877, 44898, 44903, 44922, 44897, 44898, 44922, 44890, 44868, 44903, 44870, 44852, 44893, 44907, 44908, 44911, 44905, 44911, 44892, 44976, 45030, 45036, 45026, 45036, 45030, 44809, 44914, 44683, 44696, 44678, 44678, 44696, 44688};

                    private static void c(int i2, byte b, byte b2, Object[] objArr) {
                        int i3 = 35 - b;
                        int i4 = 114 - b2;
                        byte[] bArr = $$d;
                        byte[] bArr2 = new byte[i2 + 3];
                        int i5 = i2 + 2;
                        int i6 = -1;
                        if (bArr == null) {
                            i6 = -1;
                            i4 = i3 + i5;
                            i3 = i3;
                        }
                        while (true) {
                            int i7 = i3 + 1;
                            int i8 = i6 + 1;
                            bArr2[i8] = (byte) i4;
                            if (i8 == i5) {
                                objArr[0] = new String(bArr2, 0);
                                return;
                            } else {
                                i6 = i8;
                                i4 = bArr[i7] + i4;
                                i3 = i7;
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private static void d(byte r7, byte r8, int r9, java.lang.Object[] r10) {
                        /*
                            int r9 = r9 * 33
                            int r9 = 37 - r9
                            byte[] r0 = com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda7.$$a
                            int r7 = r7 * 3
                            int r7 = r7 + 103
                            int r8 = r8 * 17
                            int r8 = 34 - r8
                            byte[] r1 = new byte[r8]
                            r2 = 0
                            if (r0 != 0) goto L17
                            r3 = r8
                            r7 = r9
                            r4 = r2
                            goto L2f
                        L17:
                            r3 = r2
                        L18:
                            r6 = r9
                            r9 = r7
                            r7 = r6
                            int r4 = r3 + 1
                            byte r5 = (byte) r9
                            r1[r3] = r5
                            if (r4 != r8) goto L2a
                            java.lang.String r7 = new java.lang.String
                            r7.<init>(r1, r2)
                            r10[r2] = r7
                            return
                        L2a:
                            r3 = r0[r7]
                            r6 = r9
                            r9 = r7
                            r7 = r6
                        L2f:
                            int r9 = r9 + 1
                            int r7 = r7 + r3
                            int r7 = r7 + (-3)
                            r3 = r4
                            goto L18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda7.d(byte, byte, int, java.lang.Object[]):void");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = 2 % 2;
                        int i3 = write + 21;
                        RemoteActionCompatParcelizer = i3 % 128;
                        int i4 = i3 % 2;
                        this.f$0.m41lambda$onDrmKeysRemoved$10$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters);
                        int i5 = write + 115;
                        RemoteActionCompatParcelizer = i5 % 128;
                        if (i5 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
                        int i2;
                        int i3 = 2 % 2;
                        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
                        int i4 = iArr[0];
                        int i5 = iArr[1];
                        int i6 = iArr[2];
                        int i7 = iArr[3];
                        char[] cArr = IconCompatParcelizer;
                        if (cArr != null) {
                            int length = cArr.length;
                            char[] cArr2 = new char[length];
                            for (int i8 = 0; i8 < length; i8++) {
                                try {
                                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                                    if (objRemoteActionCompatParcelizer == null) {
                                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 11614 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                                    }
                                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            cArr = cArr2;
                        }
                        char[] cArr3 = new char[i5];
                        System.arraycopy(cArr, i4, cArr3, 0, i5);
                        if (bArr != null) {
                            char[] cArr4 = new char[i5];
                            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                            int i9 = $11 + 53;
                            $10 = i9 % 128;
                            int i10 = 2;
                            int i11 = i9 % 2;
                            char c = 0;
                            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                                int i12 = $10 + 27;
                                $11 = i12 % 128;
                                if (i12 % i10 != 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 0) {
                                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1859710730);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 31590), 9863 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                                } else {
                                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                                    if (objRemoteActionCompatParcelizer3 == null) {
                                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 22958 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                                }
                                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                                if (objRemoteActionCompatParcelizer4 == null) {
                                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((Process.myPid() >> 22) + 37822), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9754, 27 - Color.blue(0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                                i10 = 2;
                            }
                            int i15 = $10 + 13;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            cArr3 = cArr4;
                        }
                        if (i7 > 0) {
                            char[] cArr5 = new char[i5];
                            System.arraycopy(cArr3, 0, cArr5, 0, i5);
                            int i17 = i5 - i7;
                            System.arraycopy(cArr5, 0, cArr3, i17, i7);
                            System.arraycopy(cArr5, i7, cArr3, 0, i17);
                        }
                        if (z) {
                            char[] cArr6 = new char[i5];
                            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                                int i18 = $10 + 13;
                                $11 = i18 % 128;
                                if (i18 % 2 == 0) {
                                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[i5 << buildsetstopreasonintent.RemoteActionCompatParcelizer];
                                    i2 = buildsetstopreasonintent.RemoteActionCompatParcelizer / 0;
                                } else {
                                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                                    i2 = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                                }
                                buildsetstopreasonintent.RemoteActionCompatParcelizer = i2;
                            }
                            cArr3 = cArr6;
                        }
                        if (i6 > 0) {
                            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                            }
                        }
                        objArr[0] = new String(cArr3);
                    }

                    private static void a(int i2, char[] cArr, byte b, Object[] objArr) throws Throwable {
                        int i3;
                        Object obj;
                        int i4 = 2 % 2;
                        needsStartedService needsstartedservice = new needsStartedService();
                        char[] cArr2 = read;
                        Object obj2 = null;
                        long j = 0;
                        if (cArr2 != null) {
                            int length = cArr2.length;
                            char[] cArr3 = new char[length];
                            int i5 = 0;
                            while (i5 < length) {
                                int i6 = $10 + 105;
                                $11 = i6 % 128;
                                if (i6 % 2 == 0) {
                                    try {
                                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                                        if (objRemoteActionCompatParcelizer == null) {
                                            objRemoteActionCompatParcelizer = startForeground.read((char) ExpandableListView.getPackedPositionType(j), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7015, Color.red(0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                                        }
                                        cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } else {
                                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getMode(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7015, 29 - TextUtils.indexOf((CharSequence) "", '0', 0), -626716224, false, "o", new Class[]{Integer.TYPE});
                                    }
                                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                                    i5++;
                                }
                                j = 0;
                            }
                            cArr2 = cArr3;
                        }
                        Object[] objArr4 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 7015 - ExpandableListView.getPackedPositionType(0L), 29 - TextUtils.lastIndexOf("", '0', 0), -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                        char[] cArr4 = new char[i2];
                        if (i2 % 2 != 0) {
                            i3 = i2 - 1;
                            cArr4[i3] = (char) (cArr[i3] - b);
                        } else {
                            i3 = i2;
                        }
                        if (i3 > 1) {
                            needsstartedservice.AudioAttributesCompatParcelizer = 0;
                            while (needsstartedservice.AudioAttributesCompatParcelizer < i3) {
                                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                                    obj = obj2;
                                } else {
                                    Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(105000849);
                                    if (objRemoteActionCompatParcelizer4 == null) {
                                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 48195), 20126 - ExpandableListView.getPackedPositionType(0L), 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                                        int i7 = $10 + 51;
                                        $11 = i7 % 128;
                                        int i8 = i7 % 2;
                                        try {
                                            Object[] objArr6 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                                            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(50135433);
                                            if (objRemoteActionCompatParcelizer5 == null) {
                                                objRemoteActionCompatParcelizer5 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 19369 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 18 - TextUtils.indexOf("", "", 0, 0), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                            }
                                            obj = null;
                                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                                            int i9 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i9];
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 == null) {
                                                throw th2;
                                            }
                                            throw cause2;
                                        }
                                    } else {
                                        obj = null;
                                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                            int i10 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                            int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i10];
                                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                                        } else {
                                            int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                            int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                                        }
                                    }
                                }
                                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                                obj2 = obj;
                            }
                        }
                        int i14 = $11 + 31;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        for (int i16 = 0; i16 < i2; i16++) {
                            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                        }
                        objArr[0] = new String(cArr4);
                    }

                    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 7747 (expected less than 5000) */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v251, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r10v266, types: [java.nio.LongBuffer] */
                    /* JADX WARN: Type inference failed for: r11v10 */
                    /* JADX WARN: Type inference failed for: r11v100, types: [int] */
                    /* JADX WARN: Type inference failed for: r11v11 */
                    /* JADX WARN: Type inference failed for: r11v112 */
                    /* JADX WARN: Type inference failed for: r11v113 */
                    /* JADX WARN: Type inference failed for: r11v114 */
                    /* JADX WARN: Type inference failed for: r11v115 */
                    /* JADX WARN: Type inference failed for: r11v116 */
                    /* JADX WARN: Type inference failed for: r11v117 */
                    /* JADX WARN: Type inference failed for: r11v118 */
                    /* JADX WARN: Type inference failed for: r11v119 */
                    /* JADX WARN: Type inference failed for: r11v120 */
                    /* JADX WARN: Type inference failed for: r11v121 */
                    /* JADX WARN: Type inference failed for: r11v122 */
                    /* JADX WARN: Type inference failed for: r11v126 */
                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r11v135 */
                    /* JADX WARN: Type inference failed for: r11v136 */
                    /* JADX WARN: Type inference failed for: r11v138 */
                    /* JADX WARN: Type inference failed for: r11v139 */
                    /* JADX WARN: Type inference failed for: r11v14 */
                    /* JADX WARN: Type inference failed for: r11v140 */
                    /* JADX WARN: Type inference failed for: r11v148, types: [int] */
                    /* JADX WARN: Type inference failed for: r11v149 */
                    /* JADX WARN: Type inference failed for: r11v15 */
                    /* JADX WARN: Type inference failed for: r11v153 */
                    /* JADX WARN: Type inference failed for: r11v154 */
                    /* JADX WARN: Type inference failed for: r11v155 */
                    /* JADX WARN: Type inference failed for: r11v156 */
                    /* JADX WARN: Type inference failed for: r11v157 */
                    /* JADX WARN: Type inference failed for: r11v158 */
                    /* JADX WARN: Type inference failed for: r11v159 */
                    /* JADX WARN: Type inference failed for: r11v16 */
                    /* JADX WARN: Type inference failed for: r11v160 */
                    /* JADX WARN: Type inference failed for: r11v161 */
                    /* JADX WARN: Type inference failed for: r11v162 */
                    /* JADX WARN: Type inference failed for: r11v163 */
                    /* JADX WARN: Type inference failed for: r11v164 */
                    /* JADX WARN: Type inference failed for: r11v165 */
                    /* JADX WARN: Type inference failed for: r11v166 */
                    /* JADX WARN: Type inference failed for: r11v167 */
                    /* JADX WARN: Type inference failed for: r11v168 */
                    /* JADX WARN: Type inference failed for: r11v169 */
                    /* JADX WARN: Type inference failed for: r11v17 */
                    /* JADX WARN: Type inference failed for: r11v170 */
                    /* JADX WARN: Type inference failed for: r11v171 */
                    /* JADX WARN: Type inference failed for: r11v172 */
                    /* JADX WARN: Type inference failed for: r11v173 */
                    /* JADX WARN: Type inference failed for: r11v174 */
                    /* JADX WARN: Type inference failed for: r11v175 */
                    /* JADX WARN: Type inference failed for: r11v176 */
                    /* JADX WARN: Type inference failed for: r11v177 */
                    /* JADX WARN: Type inference failed for: r11v178 */
                    /* JADX WARN: Type inference failed for: r11v179 */
                    /* JADX WARN: Type inference failed for: r11v18 */
                    /* JADX WARN: Type inference failed for: r11v180 */
                    /* JADX WARN: Type inference failed for: r11v181 */
                    /* JADX WARN: Type inference failed for: r11v182 */
                    /* JADX WARN: Type inference failed for: r11v183 */
                    /* JADX WARN: Type inference failed for: r11v184 */
                    /* JADX WARN: Type inference failed for: r11v185 */
                    /* JADX WARN: Type inference failed for: r11v188 */
                    /* JADX WARN: Type inference failed for: r11v189 */
                    /* JADX WARN: Type inference failed for: r11v19 */
                    /* JADX WARN: Type inference failed for: r11v190 */
                    /* JADX WARN: Type inference failed for: r11v191 */
                    /* JADX WARN: Type inference failed for: r11v20 */
                    /* JADX WARN: Type inference failed for: r11v21 */
                    /* JADX WARN: Type inference failed for: r11v22 */
                    /* JADX WARN: Type inference failed for: r11v23 */
                    /* JADX WARN: Type inference failed for: r11v24 */
                    /* JADX WARN: Type inference failed for: r11v26 */
                    /* JADX WARN: Type inference failed for: r11v27 */
                    /* JADX WARN: Type inference failed for: r11v28 */
                    /* JADX WARN: Type inference failed for: r11v29 */
                    /* JADX WARN: Type inference failed for: r11v33 */
                    /* JADX WARN: Type inference failed for: r11v34 */
                    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r11v48 */
                    /* JADX WARN: Type inference failed for: r11v5 */
                    /* JADX WARN: Type inference failed for: r11v57, types: [java.lang.Object[]] */
                    /* JADX WARN: Type inference failed for: r11v58 */
                    /* JADX WARN: Type inference failed for: r11v6 */
                    /* JADX WARN: Type inference failed for: r11v61 */
                    /* JADX WARN: Type inference failed for: r11v67, types: [byte] */
                    /* JADX WARN: Type inference failed for: r11v68, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r11v69 */
                    /* JADX WARN: Type inference failed for: r11v7 */
                    /* JADX WARN: Type inference failed for: r11v70 */
                    /* JADX WARN: Type inference failed for: r11v71 */
                    /* JADX WARN: Type inference failed for: r11v75 */
                    /* JADX WARN: Type inference failed for: r11v78 */
                    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r11v82 */
                    /* JADX WARN: Type inference failed for: r11v83 */
                    /* JADX WARN: Type inference failed for: r11v84, types: [java.lang.CharSequence, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r11v85 */
                    /* JADX WARN: Type inference failed for: r11v86 */
                    /* JADX WARN: Type inference failed for: r11v87 */
                    /* JADX WARN: Type inference failed for: r11v88, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r11v89 */
                    /* JADX WARN: Type inference failed for: r11v90 */
                    /* JADX WARN: Type inference failed for: r11v91 */
                    /* JADX WARN: Type inference failed for: r11v92 */
                    /* JADX WARN: Type inference failed for: r11v93 */
                    /* JADX WARN: Type inference failed for: r11v94 */
                    /* JADX WARN: Type inference failed for: r1v1017, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r1v807 */
                    /* JADX WARN: Type inference failed for: r1v827, types: [java.lang.reflect.Field] */
                    /* JADX WARN: Type inference failed for: r1v897, types: [java.lang.Object, java.lang.StringBuilder] */
                    /* JADX WARN: Type inference failed for: r1v981, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r2v144, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r2v154, types: [java.lang.Object[]] */
                    /* JADX WARN: Type inference failed for: r2v155, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v343 */
                    /* JADX WARN: Type inference failed for: r2v440, types: [java.nio.LongBuffer[]] */
                    /* JADX WARN: Type inference failed for: r2v441 */
                    /* JADX WARN: Type inference failed for: r2v447 */
                    /* JADX WARN: Type inference failed for: r2v448 */
                    /* JADX WARN: Type inference failed for: r2v465, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r2v480 */
                    /* JADX WARN: Type inference failed for: r2v485, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r2v501, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r2v525, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r2v684 */
                    /* JADX WARN: Type inference failed for: r2v685 */
                    /* JADX WARN: Type inference failed for: r35v5 */
                    /* JADX WARN: Type inference failed for: r35v6, types: [int] */
                    /* JADX WARN: Type inference failed for: r35v7 */
                    /* JADX WARN: Type inference failed for: r35v8 */
                    /* JADX WARN: Type inference failed for: r36v0 */
                    /* JADX WARN: Type inference failed for: r36v1 */
                    /* JADX WARN: Type inference failed for: r36v10 */
                    /* JADX WARN: Type inference failed for: r36v11 */
                    /* JADX WARN: Type inference failed for: r36v12 */
                    /* JADX WARN: Type inference failed for: r36v13 */
                    /* JADX WARN: Type inference failed for: r36v14 */
                    /* JADX WARN: Type inference failed for: r36v16 */
                    /* JADX WARN: Type inference failed for: r36v18 */
                    /* JADX WARN: Type inference failed for: r36v19 */
                    /* JADX WARN: Type inference failed for: r36v2 */
                    /* JADX WARN: Type inference failed for: r36v20 */
                    /* JADX WARN: Type inference failed for: r36v22 */
                    /* JADX WARN: Type inference failed for: r36v23 */
                    /* JADX WARN: Type inference failed for: r36v27 */
                    /* JADX WARN: Type inference failed for: r36v28 */
                    /* JADX WARN: Type inference failed for: r36v29 */
                    /* JADX WARN: Type inference failed for: r36v3 */
                    /* JADX WARN: Type inference failed for: r36v31 */
                    /* JADX WARN: Type inference failed for: r36v32 */
                    /* JADX WARN: Type inference failed for: r36v33 */
                    /* JADX WARN: Type inference failed for: r36v34 */
                    /* JADX WARN: Type inference failed for: r36v35 */
                    /* JADX WARN: Type inference failed for: r36v36 */
                    /* JADX WARN: Type inference failed for: r36v37 */
                    /* JADX WARN: Type inference failed for: r36v38 */
                    /* JADX WARN: Type inference failed for: r36v39 */
                    /* JADX WARN: Type inference failed for: r36v4 */
                    /* JADX WARN: Type inference failed for: r36v40 */
                    /* JADX WARN: Type inference failed for: r36v41 */
                    /* JADX WARN: Type inference failed for: r36v42 */
                    /* JADX WARN: Type inference failed for: r36v43 */
                    /* JADX WARN: Type inference failed for: r36v44 */
                    /* JADX WARN: Type inference failed for: r36v45 */
                    /* JADX WARN: Type inference failed for: r36v46 */
                    /* JADX WARN: Type inference failed for: r36v5 */
                    /* JADX WARN: Type inference failed for: r36v7 */
                    /* JADX WARN: Type inference failed for: r36v8 */
                    /* JADX WARN: Type inference failed for: r36v9 */
                    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
                    /* JADX WARN: Type inference failed for: r3v499 */
                    /* JADX WARN: Type inference failed for: r3v516 */
                    /* JADX WARN: Type inference failed for: r3v517 */
                    /* JADX WARN: Type inference failed for: r3v540 */
                    /* JADX WARN: Type inference failed for: r3v566 */
                    /* JADX WARN: Type inference failed for: r3v599, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r3v613, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r3v681 */
                    /* JADX WARN: Type inference failed for: r3v682 */
                    /* JADX WARN: Type inference failed for: r3v683, types: [java.lang.Object, java.security.KeyStore] */
                    /* JADX WARN: Type inference failed for: r3v685, types: [java.lang.Object, java.security.KeyStore] */
                    /* JADX WARN: Type inference failed for: r3v687 */
                    /* JADX WARN: Type inference failed for: r3v688 */
                    /* JADX WARN: Type inference failed for: r3v690 */
                    /* JADX WARN: Type inference failed for: r3v694, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r3v702 */
                    /* JADX WARN: Type inference failed for: r3v708, types: [int] */
                    /* JADX WARN: Type inference failed for: r3v710, types: [java.lang.Object[]] */
                    /* JADX WARN: Type inference failed for: r3v718 */
                    /* JADX WARN: Type inference failed for: r3v719 */
                    /* JADX WARN: Type inference failed for: r3v720, types: [android.security.keystore.KeyGenParameterSpec$Builder] */
                    /* JADX WARN: Type inference failed for: r3v725 */
                    /* JADX WARN: Type inference failed for: r3v730, types: [java.lang.Object, java.security.KeyStore] */
                    /* JADX WARN: Type inference failed for: r3v825 */
                    /* JADX WARN: Type inference failed for: r3v857 */
                    /* JADX WARN: Type inference failed for: r3v866 */
                    /* JADX WARN: Type inference failed for: r3v867 */
                    /* JADX WARN: Type inference failed for: r3v868 */
                    /* JADX WARN: Type inference failed for: r49v0 */
                    /* JADX WARN: Type inference failed for: r49v1 */
                    /* JADX WARN: Type inference failed for: r49v100 */
                    /* JADX WARN: Type inference failed for: r49v101 */
                    /* JADX WARN: Type inference failed for: r49v102 */
                    /* JADX WARN: Type inference failed for: r49v103 */
                    /* JADX WARN: Type inference failed for: r49v104 */
                    /* JADX WARN: Type inference failed for: r49v105 */
                    /* JADX WARN: Type inference failed for: r49v106 */
                    /* JADX WARN: Type inference failed for: r49v107 */
                    /* JADX WARN: Type inference failed for: r49v108 */
                    /* JADX WARN: Type inference failed for: r49v109 */
                    /* JADX WARN: Type inference failed for: r49v110 */
                    /* JADX WARN: Type inference failed for: r49v111 */
                    /* JADX WARN: Type inference failed for: r49v112 */
                    /* JADX WARN: Type inference failed for: r49v113 */
                    /* JADX WARN: Type inference failed for: r49v114 */
                    /* JADX WARN: Type inference failed for: r49v115 */
                    /* JADX WARN: Type inference failed for: r49v116 */
                    /* JADX WARN: Type inference failed for: r49v117 */
                    /* JADX WARN: Type inference failed for: r49v118 */
                    /* JADX WARN: Type inference failed for: r49v119 */
                    /* JADX WARN: Type inference failed for: r49v120 */
                    /* JADX WARN: Type inference failed for: r49v14, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r49v15, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r49v16 */
                    /* JADX WARN: Type inference failed for: r49v17 */
                    /* JADX WARN: Type inference failed for: r49v18 */
                    /* JADX WARN: Type inference failed for: r49v19 */
                    /* JADX WARN: Type inference failed for: r49v2 */
                    /* JADX WARN: Type inference failed for: r49v20 */
                    /* JADX WARN: Type inference failed for: r49v21 */
                    /* JADX WARN: Type inference failed for: r49v22 */
                    /* JADX WARN: Type inference failed for: r49v24 */
                    /* JADX WARN: Type inference failed for: r49v25 */
                    /* JADX WARN: Type inference failed for: r49v26 */
                    /* JADX WARN: Type inference failed for: r49v27 */
                    /* JADX WARN: Type inference failed for: r49v28 */
                    /* JADX WARN: Type inference failed for: r49v29 */
                    /* JADX WARN: Type inference failed for: r49v3 */
                    /* JADX WARN: Type inference failed for: r49v30 */
                    /* JADX WARN: Type inference failed for: r49v32 */
                    /* JADX WARN: Type inference failed for: r49v34 */
                    /* JADX WARN: Type inference failed for: r49v4 */
                    /* JADX WARN: Type inference failed for: r49v41 */
                    /* JADX WARN: Type inference failed for: r49v5 */
                    /* JADX WARN: Type inference failed for: r49v6 */
                    /* JADX WARN: Type inference failed for: r49v66 */
                    /* JADX WARN: Type inference failed for: r49v7 */
                    /* JADX WARN: Type inference failed for: r49v79 */
                    /* JADX WARN: Type inference failed for: r49v8 */
                    /* JADX WARN: Type inference failed for: r49v80 */
                    /* JADX WARN: Type inference failed for: r49v81 */
                    /* JADX WARN: Type inference failed for: r49v82 */
                    /* JADX WARN: Type inference failed for: r49v83 */
                    /* JADX WARN: Type inference failed for: r49v84 */
                    /* JADX WARN: Type inference failed for: r49v85 */
                    /* JADX WARN: Type inference failed for: r49v86 */
                    /* JADX WARN: Type inference failed for: r49v87 */
                    /* JADX WARN: Type inference failed for: r49v88 */
                    /* JADX WARN: Type inference failed for: r49v89 */
                    /* JADX WARN: Type inference failed for: r49v90 */
                    /* JADX WARN: Type inference failed for: r49v91 */
                    /* JADX WARN: Type inference failed for: r49v92 */
                    /* JADX WARN: Type inference failed for: r49v93 */
                    /* JADX WARN: Type inference failed for: r49v94 */
                    /* JADX WARN: Type inference failed for: r49v95 */
                    /* JADX WARN: Type inference failed for: r49v96 */
                    /* JADX WARN: Type inference failed for: r49v97 */
                    /* JADX WARN: Type inference failed for: r49v98 */
                    /* JADX WARN: Type inference failed for: r49v99 */
                    /* JADX WARN: Type inference failed for: r4v239, types: [java.lang.Class, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v623, types: [java.lang.Class] */
                    /* JADX WARN: Type inference failed for: r4v635, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r5v310, types: [java.lang.Object, java.nio.LongBuffer] */
                    /* JADX WARN: Type inference failed for: r5v312, types: [java.lang.Object, java.nio.LongBuffer] */
                    /* JADX WARN: Type inference failed for: r6v108 */
                    /* JADX WARN: Type inference failed for: r6v109 */
                    /* JADX WARN: Type inference failed for: r6v111, types: [java.lang.Object[]] */
                    /* JADX WARN: Type inference failed for: r6v112 */
                    /* JADX WARN: Type inference failed for: r6v115, types: [java.lang.Object[]] */
                    /* JADX WARN: Type inference failed for: r6v116 */
                    /* JADX WARN: Type inference failed for: r6v117, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r6v137 */
                    /* JADX WARN: Type inference failed for: r6v138, types: [int] */
                    /* JADX WARN: Type inference failed for: r6v139 */
                    /* JADX WARN: Type inference failed for: r6v140 */
                    /* JADX WARN: Type inference failed for: r6v141 */
                    /* JADX WARN: Type inference failed for: r6v142 */
                    /* JADX WARN: Type inference failed for: r6v144 */
                    /* JADX WARN: Type inference failed for: r6v151 */
                    /* JADX WARN: Type inference failed for: r6v23 */
                    /* JADX WARN: Type inference failed for: r6v24 */
                    /* JADX WARN: Type inference failed for: r6v25 */
                    /* JADX WARN: Type inference failed for: r6v26 */
                    /* JADX WARN: Type inference failed for: r6v27 */
                    /* JADX WARN: Type inference failed for: r6v28 */
                    /* JADX WARN: Type inference failed for: r6v29 */
                    /* JADX WARN: Type inference failed for: r6v30 */
                    /* JADX WARN: Type inference failed for: r6v31 */
                    /* JADX WARN: Type inference failed for: r6v32 */
                    /* JADX WARN: Type inference failed for: r6v43 */
                    /* JADX WARN: Type inference failed for: r6v44 */
                    /* JADX WARN: Type inference failed for: r6v440, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r6v456 */
                    /* JADX WARN: Type inference failed for: r6v457 */
                    /* JADX WARN: Type inference failed for: r6v458 */
                    /* JADX WARN: Type inference failed for: r6v459 */
                    /* JADX WARN: Type inference failed for: r6v460 */
                    /* JADX WARN: Type inference failed for: r6v461 */
                    /* JADX WARN: Type inference failed for: r6v462 */
                    /* JADX WARN: Type inference failed for: r6v463 */
                    /* JADX WARN: Type inference failed for: r6v464 */
                    /* JADX WARN: Type inference failed for: r6v465 */
                    /* JADX WARN: Type inference failed for: r6v466 */
                    /* JADX WARN: Type inference failed for: r6v467 */
                    /* JADX WARN: Type inference failed for: r6v468 */
                    /* JADX WARN: Type inference failed for: r6v469 */
                    /* JADX WARN: Type inference failed for: r6v470 */
                    /* JADX WARN: Type inference failed for: r6v471 */
                    /* JADX WARN: Type inference failed for: r6v472 */
                    /* JADX WARN: Type inference failed for: r6v473 */
                    /* JADX WARN: Type inference failed for: r6v474 */
                    /* JADX WARN: Type inference failed for: r6v475 */
                    /* JADX WARN: Type inference failed for: r6v476 */
                    /* JADX WARN: Type inference failed for: r6v67 */
                    /* JADX WARN: Type inference failed for: r6v68 */
                    /* JADX WARN: Type inference failed for: r6v69 */
                    /* JADX WARN: Type inference failed for: r6v70, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r6v72 */
                    /* JADX WARN: Type inference failed for: r6v74 */
                    /* JADX WARN: Type inference failed for: r6v75 */
                    /* JADX WARN: Type inference failed for: r6v76 */
                    /* JADX WARN: Type inference failed for: r6v77 */
                    /* JADX WARN: Type inference failed for: r6v78 */
                    /* JADX WARN: Type inference failed for: r6v81, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r6v83 */
                    /* JADX WARN: Type inference failed for: r6v91 */
                    /* JADX WARN: Type inference failed for: r6v92, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r6v93 */
                    /* JADX WARN: Type inference failed for: r7v345, types: [java.lang.Object, java.lang.Object[]] */
                    /* JADX WARN: Type inference failed for: r7v362, types: [java.lang.Object, java.nio.LongBuffer] */
                    /* JADX WARN: Type inference failed for: r7v370 */
                    /* JADX WARN: Type inference failed for: r7v382, types: [java.lang.Object, java.nio.LongBuffer] */
                    /* JADX WARN: Type inference failed for: r7v56 */
                    /* JADX WARN: Type inference failed for: r7v57 */
                    /* JADX WARN: Type inference failed for: r8v100 */
                    /* JADX WARN: Type inference failed for: r8v105, types: [byte] */
                    /* JADX WARN: Type inference failed for: r8v107 */
                    /* JADX WARN: Type inference failed for: r8v109 */
                    /* JADX WARN: Type inference failed for: r8v110 */
                    /* JADX WARN: Type inference failed for: r8v111 */
                    /* JADX WARN: Type inference failed for: r8v116 */
                    /* JADX WARN: Type inference failed for: r8v119, types: [java.lang.Object, java.security.KeyStore] */
                    /* JADX WARN: Type inference failed for: r8v120 */
                    /* JADX WARN: Type inference failed for: r8v128, types: [java.lang.Class] */
                    /* JADX WARN: Type inference failed for: r8v135, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r8v140, types: [int] */
                    /* JADX WARN: Type inference failed for: r8v141 */
                    /* JADX WARN: Type inference failed for: r8v142 */
                    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
                    /* JADX WARN: Type inference failed for: r8v178 */
                    /* JADX WARN: Type inference failed for: r8v179 */
                    /* JADX WARN: Type inference failed for: r8v180 */
                    /* JADX WARN: Type inference failed for: r8v181 */
                    /* JADX WARN: Type inference failed for: r8v182 */
                    /* JADX WARN: Type inference failed for: r8v183 */
                    /* JADX WARN: Type inference failed for: r8v184 */
                    /* JADX WARN: Type inference failed for: r8v185 */
                    /* JADX WARN: Type inference failed for: r8v186 */
                    /* JADX WARN: Type inference failed for: r8v187 */
                    /* JADX WARN: Type inference failed for: r8v188 */
                    /* JADX WARN: Type inference failed for: r8v71 */
                    /* JADX WARN: Type inference failed for: r8v72 */
                    /* JADX WARN: Type inference failed for: r8v78 */
                    /* JADX WARN: Type inference failed for: r8v79 */
                    /* JADX WARN: Type inference failed for: r8v92, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r8v96 */
                    /* JADX WARN: Type inference failed for: r8v97 */
                    /* JADX WARN: Type inference failed for: r8v98 */
                    /* JADX WARN: Type inference failed for: r8v99, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r9v332, types: [java.lang.String[]] */
                    /* JADX WARN: Type inference failed for: r9v341 */
                    /* JADX WARN: Type inference failed for: r9v362, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r9v406 */
                    /* JADX WARN: Type inference failed for: r9v407, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v409 */
                    /* JADX WARN: Type inference failed for: r9v410, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r9v575, types: [java.lang.Class[]] */
                    /* JADX WARN: Type inference failed for: r9v818 */
                    /* JADX WARN: Type inference failed for: r9v819 */
                    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                        java.util.NoSuchElementException
                        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                        */
                    public static java.lang.Object[] IconCompatParcelizer(android.content.Context r64, java.lang.String[] r65, int r66, int r67, int r68) {
                        /*
                            Method dump skipped, instruction units count: 26620
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda7.IconCompatParcelizer(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmKeysRemoved$10$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m41lambda$onDrmKeysRemoved$10$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair) {
            MediaSourceList.this.eventListener.onDrmKeysRemoved(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m45lambda$onDrmSessionReleased$11$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(eventParameters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmSessionReleased$11$com-google-android-exoplayer2-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        final /* synthetic */ void m45lambda$onDrmSessionReleased$11$comgoogleandroidexoplayer2MediaSourceList$ForwardingEventListener(Pair pair) {
            MediaSourceList.this.eventListener.onDrmSessionReleased(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
        }

        private Pair<Integer, MediaSource.MediaPeriodId> getEventParameters(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId = MediaSourceList.getMediaPeriodIdForChildMediaPeriodId(this.id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return null;
                }
                mediaPeriodId2 = mediaPeriodIdForChildMediaPeriodId;
            }
            return Pair.create(Integer.valueOf(MediaSourceList.getWindowIndexForChildWindowIndex(this.id, i)), mediaPeriodId2);
        }
    }
}
