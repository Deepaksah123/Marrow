package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.Mp4ExtractorMp4Track;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z, factory, null, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z, DataSource.Factory factory, Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map).build(new HttpMediaDrmCallback(str, z, factory)), eventDispatcher);
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: com.google.android.exoplayer2.drm.OfflineLicenseHelper.1
            @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }
        });
    }

    public final byte[] downloadLicense(Format format) throws DrmSession.DrmSessionException {
        byte[] bArrAcquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread;
        synchronized (this) {
            Assertions.checkArgument(format.drmInitData != null);
            bArrAcquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread = acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
        }
        return bArrAcquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread;
    }

    public final byte[] renewLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        byte[] bArrAcquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread;
        synchronized (this) {
            Assertions.checkNotNull(bArr);
            bArrAcquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread = acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
        }
        return bArrAcquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread;
    }

    public final void releaseLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        synchronized (this) {
            Assertions.checkNotNull(bArr);
            acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) throws DrmSession.DrmSessionException {
        Pair<Long, Long> pair;
        synchronized (this) {
            Assertions.checkNotNull(bArr);
            try {
                final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
                final Mp4ExtractorMp4Track mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver = Mp4ExtractorMp4Track.MediaBrowserCompatCustomActionResultReceiver();
                this.handler.post(new Runnable() { // from class: com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m86lambda$getLicenseDurationRemainingSec$0$comgoogleandroidexoplayer2drmOfflineLicenseHelper(mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver, drmSessionAcquireFirstSessionOnHandlerThread);
                    }
                });
                try {
                    try {
                        pair = (Pair) mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver.get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new IllegalStateException(e);
                    }
                } finally {
                    releaseManagerOnHandlerThread();
                }
            } catch (DrmSession.DrmSessionException e2) {
                if (e2.getCause() instanceof KeysExpiredException) {
                    return Pair.create(0L, 0L);
                }
                throw e2;
            }
        }
        return pair;
    }

    /* JADX INFO: renamed from: lambda$getLicenseDurationRemainingSec$0$com-google-android-exoplayer2-drm-OfflineLicenseHelper, reason: not valid java name */
    final /* synthetic */ void m86lambda$getLicenseDurationRemainingSec$0$comgoogleandroidexoplayer2drmOfflineLicenseHelper(Mp4ExtractorMp4Track mp4ExtractorMp4Track, DrmSession drmSession) {
        try {
            mp4ExtractorMp4Track.read((Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(drmSession)));
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void release() {
        this.handlerThread.quit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i, byte[] bArr, Format format) throws DrmSession.DrmSessionException {
        final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i, bArr, format);
        final Mp4ExtractorMp4Track mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver = Mp4ExtractorMp4Track.MediaBrowserCompatCustomActionResultReceiver();
        this.handler.post(new Runnable() { // from class: com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m85lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1$comgoogleandroidexoplayer2drmOfflineLicenseHelper(mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver, drmSessionAcquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                return (byte[]) Assertions.checkNotNull((byte[]) mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } finally {
            releaseManagerOnHandlerThread();
        }
    }

    /* JADX INFO: renamed from: lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1$com-google-android-exoplayer2-drm-OfflineLicenseHelper, reason: not valid java name */
    final /* synthetic */ void m85lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1$comgoogleandroidexoplayer2drmOfflineLicenseHelper(Mp4ExtractorMp4Track mp4ExtractorMp4Track, DrmSession drmSession) {
        try {
            mp4ExtractorMp4Track.read(drmSession.getOfflineLicenseKeySetId());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DrmSession acquireFirstSessionOnHandlerThread(final int i, final byte[] bArr, final Format format) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(format.drmInitData);
        final Mp4ExtractorMp4Track mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver = Mp4ExtractorMp4Track.MediaBrowserCompatCustomActionResultReceiver();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m83lambda$acquireFirstSessionOnHandlerThread$2$comgoogleandroidexoplayer2drmOfflineLicenseHelper(i, bArr, mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver, format);
            }
        });
        try {
            DrmSession drmSession = (DrmSession) mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver.get();
            this.drmListenerConditionVariable.block();
            Mp4ExtractorMp4Track mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver2 = Mp4ExtractorMp4Track.MediaBrowserCompatCustomActionResultReceiver();
            this.handler.post(new OfflineLicenseHelper$$ExternalSyntheticLambda4(this, drmSession, mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver2));
            try {
                if (mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver2.get() == 0) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver2.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: lambda$acquireFirstSessionOnHandlerThread$2$com-google-android-exoplayer2-drm-OfflineLicenseHelper, reason: not valid java name */
    final /* synthetic */ void m83lambda$acquireFirstSessionOnHandlerThread$2$comgoogleandroidexoplayer2drmOfflineLicenseHelper(int i, byte[] bArr, Mp4ExtractorMp4Track mp4ExtractorMp4Track, Format format) {
        try {
            this.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), PlayerId.UNSET);
            this.drmSessionManager.prepare();
            try {
                this.drmSessionManager.setMode(i, bArr);
                mp4ExtractorMp4Track.read((DrmSession) Assertions.checkNotNull(this.drmSessionManager.acquireSession(this.eventDispatcher, format)));
            } catch (Throwable th) {
                this.drmSessionManager.release();
                throw th;
            }
        } catch (Throwable th2) {
            mp4ExtractorMp4Track.IconCompatParcelizer(th2);
        }
    }

    /* JADX INFO: renamed from: lambda$acquireFirstSessionOnHandlerThread$3$com-google-android-exoplayer2-drm-OfflineLicenseHelper, reason: not valid java name */
    final /* synthetic */ void m84lambda$acquireFirstSessionOnHandlerThread$3$comgoogleandroidexoplayer2drmOfflineLicenseHelper(DrmSession drmSession, Mp4ExtractorMp4Track mp4ExtractorMp4Track) {
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(this.eventDispatcher);
                this.drmSessionManager.release();
            }
            mp4ExtractorMp4Track.read(error);
        } catch (Throwable th) {
            mp4ExtractorMp4Track.IconCompatParcelizer(th);
            drmSession.release(this.eventDispatcher);
            this.drmSessionManager.release();
        }
    }

    private void releaseManagerOnHandlerThread() {
        final Mp4ExtractorMp4Track mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver = Mp4ExtractorMp4Track.MediaBrowserCompatCustomActionResultReceiver();
        this.handler.post(new Runnable() { // from class: com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m87lambda$releaseManagerOnHandlerThread$4$comgoogleandroidexoplayer2drmOfflineLicenseHelper(mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver);
            }
        });
        try {
            mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: lambda$releaseManagerOnHandlerThread$4$com-google-android-exoplayer2-drm-OfflineLicenseHelper, reason: not valid java name */
    final /* synthetic */ void m87lambda$releaseManagerOnHandlerThread$4$comgoogleandroidexoplayer2drmOfflineLicenseHelper(Mp4ExtractorMp4Track mp4ExtractorMp4Track) {
        try {
            this.drmSessionManager.release();
            mp4ExtractorMp4Track.read((Object) null);
        } catch (Throwable th) {
            mp4ExtractorMp4Track.IconCompatParcelizer(th);
        }
    }
}
