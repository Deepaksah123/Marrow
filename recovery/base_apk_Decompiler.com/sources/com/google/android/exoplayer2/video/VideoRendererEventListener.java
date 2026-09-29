package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface VideoRendererEventListener {
    default void onDroppedFrames(int i, long j) {
    }

    default void onRenderedFirstFrame(Object obj, long j) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    default void onVideoFrameProcessingOffset(long j, int i) {
    }

    @Deprecated
    default void onVideoInputFormatChanged(Format format) {
    }

    default void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }

    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.listener = videoRendererEventListener;
        }

        public final void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m165lambda$enabled$0$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(decoderCounters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$enabled$0$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m165lambda$enabled$0$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(DecoderCounters decoderCounters) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoEnabled(decoderCounters);
        }

        public final void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m161lambda$decoderInitialized$1$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$decoderInitialized$1$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m161lambda$decoderInitialized$1$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(String str, long j, long j2) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderInitialized(str, j, j2);
        }

        public final void inputFormatChanged(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m166lambda$inputFormatChanged$2$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$inputFormatChanged$2$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m166lambda$inputFormatChanged$2$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoInputFormatChanged(format);
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        public final void droppedFrames(final int i, final long j) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m164lambda$droppedFrames$3$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(i, j);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$droppedFrames$3$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m164lambda$droppedFrames$3$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(int i, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onDroppedFrames(i, j);
        }

        public final void reportVideoFrameProcessingOffset(long j, int i) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9(this, j, i));
            }
        }

        /* JADX INFO: renamed from: lambda$reportVideoFrameProcessingOffset$4$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m168lambda$reportVideoFrameProcessingOffset$4$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(long j, int i) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoFrameProcessingOffset(j, i);
        }

        public final void videoSizeChanged(final VideoSize videoSize) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m170lambda$videoSizeChanged$5$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(videoSize);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$videoSizeChanged$5$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m170lambda$videoSizeChanged$5$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(VideoSize videoSize) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoSizeChanged(videoSize);
        }

        public final void renderedFirstFrame(final Object obj) {
            if (this.handler != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m167lambda$renderedFirstFrame$6$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(obj, jElapsedRealtime);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$renderedFirstFrame$6$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m167lambda$renderedFirstFrame$6$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(Object obj, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onRenderedFirstFrame(obj, j);
        }

        public final void decoderReleased(final String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m162lambda$decoderReleased$7$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(str);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$decoderReleased$7$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m162lambda$decoderReleased$7$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(String str) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderReleased(str);
        }

        public final void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m163lambda$disabled$8$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(decoderCounters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$disabled$8$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m163lambda$disabled$8$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDisabled(decoderCounters);
        }

        public final void videoCodecError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m169lambda$videoCodecError$9$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$videoCodecError$9$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        final /* synthetic */ void m169lambda$videoCodecError$9$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(Exception exc) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoCodecError(exc);
        }
    }
}
