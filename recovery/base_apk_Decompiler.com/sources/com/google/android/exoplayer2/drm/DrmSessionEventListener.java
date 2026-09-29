package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface DrmSessionEventListener {
    default void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Deprecated
    default void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
    }

    default void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }

    default void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public EventDispatcher withParameters(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void drmSessionAcquired(final int i) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m77lambda$drmSessionAcquired$0$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(drmSessionEventListener, i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmSessionAcquired$0$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m77lambda$drmSessionAcquired$0$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(DrmSessionEventListener drmSessionEventListener, int i) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId, i);
        }

        public void drmKeysLoaded() {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m74lambda$drmKeysLoaded$1$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmKeysLoaded$1$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m74lambda$drmKeysLoaded$1$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionManagerError(final Exception exc) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m78lambda$drmSessionManagerError$2$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(drmSessionEventListener, exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmSessionManagerError$2$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m78lambda$drmSessionManagerError$2$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(DrmSessionEventListener drmSessionEventListener, Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        public void drmKeysRestored() {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m76lambda$drmKeysRestored$3$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmKeysRestored$3$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m76lambda$drmKeysRestored$3$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        public void drmKeysRemoved() {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m75lambda$drmKeysRemoved$4$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmKeysRemoved$4$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m75lambda$drmKeysRemoved$4$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionReleased() {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4(this, listenerAndHandler.listener));
            }
        }

        /* JADX INFO: renamed from: lambda$drmSessionReleased$5$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m79lambda$drmSessionReleased$5$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }
    }
}
