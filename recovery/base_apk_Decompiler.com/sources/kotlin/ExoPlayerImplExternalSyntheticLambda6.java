package kotlin;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ExoPlayerImplExternalSyntheticLambda6 extends Drawable implements Drawable.Callback, Animatable {
    private final setCodecs AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private Rect AudioAttributesImplApi26Parcelizer;
    private ExoPlayerImplExternalSyntheticLambda19 AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private RectF MediaBrowserCompatItemReceiver;
    private ExoPlayerImplExternalSyntheticLambda10 MediaBrowserCompatMediaItem;
    private maybeContinueLoading MediaBrowserCompatSearchResultReceiver;
    private isRendererEnabled MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private startRenderers MediaDescriptionCompat;
    private Map<String, Typeface> MediaMetadataCompat;
    private onVideoCodecError MediaSessionCompatResultReceiverWrapper;
    private final Runnable MediaSessionCompatToken;
    private boolean PlaybackStateCompat;
    private String RatingCompat;
    private ExoPlayerImplExternalSyntheticLambda12 handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private String onCommand;
    private boolean onCustomAction;
    private final onAudioDecoderInitialized onFastForward;
    private final ArrayList<AudioAttributesCompatParcelizer> onMediaButtonEvent;
    private boolean onPause;
    private float onPlay;
    private boolean onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private boolean onPlayFromUri;
    private read onPrepare;
    private final ValueAnimator.AnimatorUpdateListener onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private final Matrix onPrepareFromUri;
    private Bitmap onRemoveQueueItem;
    private onStreamTypeChanged onRemoveQueueItemAt;
    private boolean onRewind;
    private final Semaphore onSeekTo;
    private Matrix onSetCaptioningEnabled;
    private Canvas onSetPlaybackSpeed;
    private RectF onSetRating;
    private float[] onSetRepeatMode;
    private Rect onSetShuffleMode;
    private Matrix onSkipToNext;
    private Rect onSkipToPrevious;
    private boolean onSkipToQueueItem;
    private Paint onStop;
    private ExoPlayerImplExternalSyntheticLambda14 read;
    private RectF setSessionImpl;
    private int write;
    private static final List<String> RemoteActionCompatParcelizer = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    private static final Executor IconCompatParcelizer = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new setChannelCount());

    interface AudioAttributesCompatParcelizer {
        void read();
    }

    enum read {
        NONE,
        PLAY,
        RESUME
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    final /* synthetic */ void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (onRemoveQueueItemAt()) {
            invalidateSelf();
            return;
        }
        startRenderers startrenderers = this.MediaDescriptionCompat;
        if (startrenderers != null) {
            startrenderers.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        }
    }

    final /* synthetic */ void handleMediaPlayPauseIfPendingOnHandler() {
        startRenderers startrenderers = this.MediaDescriptionCompat;
        if (startrenderers == null) {
            return;
        }
        try {
            this.onSeekTo.acquire();
            startrenderers.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.onSeekTo.release();
            throw th;
        }
        this.onSeekTo.release();
    }

    public ExoPlayerImplExternalSyntheticLambda6() {
        setCodecs setcodecs = new setCodecs();
        this.AudioAttributesCompatParcelizer = setcodecs;
        this.onSkipToQueueItem = true;
        this.onAddQueueItem = false;
        this.onRewind = false;
        this.onPrepare = read.NONE;
        this.onMediaButtonEvent = new ArrayList<>();
        this.onFastForward = new onAudioDecoderInitialized();
        this.onPlayFromUri = false;
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.write = 255;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.onRemoveQueueItemAt = onStreamTypeChanged.AUTOMATIC;
        this.PlaybackStateCompat = false;
        this.onPrepareFromUri = new Matrix();
        this.onSetRepeatMode = new float[9];
        this.onPause = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o.ExoPlayerImplExternalSyntheticLambda9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        };
        this.onPrepareFromMediaId = animatorUpdateListener;
        this.onSeekTo = new Semaphore(1);
        this.MediaSessionCompatToken = new Runnable() { // from class: o.ExoPlayerImplComponentListener
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
            }
        };
        this.onPlay = -3.4028235E38f;
        setcodecs.addUpdateListener(animatorUpdateListener);
    }

    public final void read(onAudioDecoderReleased onaudiodecoderreleased, boolean z) {
        boolean zWrite = this.onFastForward.write(onaudiodecoderreleased, z);
        if (this.AudioAttributesImplBaseParcelizer == null || !zWrite) {
            return;
        }
        onFastForward();
    }

    public final boolean RemoteActionCompatParcelizer(onAudioDecoderReleased onaudiodecoderreleased) {
        return this.onFastForward.AudioAttributesCompatParcelizer(onaudiodecoderreleased);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (z != this.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            startRenderers startrenderers = this.MediaDescriptionCompat;
            if (startrenderers != null) {
                startrenderers.write(z);
            }
            invalidateSelf();
        }
    }

    public final void AudioAttributesImplApi21Parcelizer(String str) {
        this.onCommand = str;
    }

    public final String IconCompatParcelizer() {
        return this.onCommand;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.onPlayFromUri = z;
    }

    public final boolean write() {
        return this.onPlayFromUri;
    }

    public final boolean write(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        if (this.AudioAttributesImplBaseParcelizer == exoPlayerImplExternalSyntheticLambda19) {
            return false;
        }
        this.onPause = true;
        read();
        this.AudioAttributesImplBaseParcelizer = exoPlayerImplExternalSyntheticLambda19;
        onFastForward();
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(exoPlayerImplExternalSyntheticLambda19);
        AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.getAnimatedFraction());
        Iterator it = new ArrayList(this.onMediaButtonEvent).iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) it.next();
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.read();
            }
            it.remove();
        }
        this.onMediaButtonEvent.clear();
        exoPlayerImplExternalSyntheticLambda19.write(this.onPrepareFromSearch);
        onPlay();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void read(onStreamTypeChanged onstreamtypechanged) {
        this.onRemoveQueueItemAt = onstreamtypechanged;
        onPlay();
    }

    private ExoPlayerImplExternalSyntheticLambda14 onPrepareFromUri() {
        ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14 = this.read;
        return exoPlayerImplExternalSyntheticLambda14 != null ? exoPlayerImplExternalSyntheticLambda14 : ExoPlayerImplExternalSyntheticLambda18.AudioAttributesCompatParcelizer();
    }

    private boolean onRemoveQueueItemAt() {
        return onPrepareFromUri() == ExoPlayerImplExternalSyntheticLambda14.ENABLED;
    }

    public final void AudioAttributesCompatParcelizer(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14) {
        this.read = exoPlayerImplExternalSyntheticLambda14;
    }

    public final onStreamTypeChanged AudioAttributesImplBaseParcelizer() {
        return this.PlaybackStateCompat ? onStreamTypeChanged.SOFTWARE : onStreamTypeChanged.HARDWARE;
    }

    private void onPlay() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return;
        }
        this.PlaybackStateCompat = this.onRemoveQueueItemAt.IconCompatParcelizer(Build.VERSION.SDK_INT, exoPlayerImplExternalSyntheticLambda19.MediaDescriptionCompat(), exoPlayerImplExternalSyntheticLambda19.AudioAttributesImplApi21Parcelizer());
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.onPrepareFromSearch = z;
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 != null) {
            exoPlayerImplExternalSyntheticLambda19.write(z);
        }
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        if (this.onPlayFromSearch != z) {
            this.onPlayFromSearch = z;
            startRenderers startrenderers = this.MediaDescriptionCompat;
            if (startrenderers != null) {
                startrenderers.RemoteActionCompatParcelizer(z);
            }
        }
    }

    public final void read(boolean z) {
        this.onCustomAction = z;
    }

    public final void write(boolean z) {
        this.onPlayFromMediaId = z;
    }

    public final boolean MediaMetadataCompat() {
        return this.onCustomAction;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.onPlayFromMediaId;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z != this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = z;
            invalidateSelf();
        }
    }

    private void onFastForward() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return;
        }
        startRenderers startrenderers = new startRenderers(this, ExoPlayerImplInternalSeekPosition.IconCompatParcelizer(exoPlayerImplExternalSyntheticLambda19), exoPlayerImplExternalSyntheticLambda19.MediaBrowserCompatItemReceiver(), exoPlayerImplExternalSyntheticLambda19);
        this.MediaDescriptionCompat = startrenderers;
        if (this.onPlayFromSearch) {
            startrenderers.RemoteActionCompatParcelizer(true);
        }
        this.MediaDescriptionCompat.write(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final void read() {
        if (this.AudioAttributesCompatParcelizer.isRunning()) {
            this.AudioAttributesCompatParcelizer.cancel();
            if (!isVisible()) {
                this.onPrepare = read.NONE;
            }
        }
        this.AudioAttributesImplBaseParcelizer = null;
        this.MediaDescriptionCompat = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.onPlay = -3.4028235E38f;
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        invalidateSelf();
    }

    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.onRewind = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.onPause) {
            return;
        }
        this.onPause = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.write = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.write;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        access3000.AudioAttributesCompatParcelizer("Use addColorFilter instead.");
    }

    private boolean onRewind() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return false;
        }
        float f = this.onPlay;
        float fMediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        this.onPlay = fMediaBrowserCompatCustomActionResultReceiver;
        return Math.abs(fMediaBrowserCompatCustomActionResultReceiver - f) * exoPlayerImplExternalSyntheticLambda19.AudioAttributesCompatParcelizer() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        startRenderers startrenderers = this.MediaDescriptionCompat;
        if (startrenderers != null) {
            boolean zOnRemoveQueueItemAt = onRemoveQueueItemAt();
            if (zOnRemoveQueueItemAt) {
                try {
                    this.onSeekTo.acquire();
                } catch (InterruptedException unused) {
                    ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
                    if (!zOnRemoveQueueItemAt) {
                        return;
                    }
                    this.onSeekTo.release();
                    if (startrenderers.MediaBrowserCompatCustomActionResultReceiver() == this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                        return;
                    }
                } catch (Throwable th) {
                    ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
                    if (zOnRemoveQueueItemAt) {
                        this.onSeekTo.release();
                        if (startrenderers.MediaBrowserCompatCustomActionResultReceiver() != this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                            IconCompatParcelizer.execute(this.MediaSessionCompatToken);
                        }
                    }
                    throw th;
                }
            }
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            if (zOnRemoveQueueItemAt && onRewind()) {
                AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
            }
            if (this.onRewind) {
                try {
                    if (this.PlaybackStateCompat) {
                        IconCompatParcelizer(canvas, startrenderers);
                    } else {
                        read(canvas);
                    }
                } catch (Throwable th2) {
                    access3000.RemoteActionCompatParcelizer("Lottie crashed in draw!", th2);
                }
            } else if (this.PlaybackStateCompat) {
                IconCompatParcelizer(canvas, startrenderers);
            } else {
                read(canvas);
            }
            this.onPause = false;
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            if (zOnRemoveQueueItemAt) {
                this.onSeekTo.release();
                if (startrenderers.MediaBrowserCompatCustomActionResultReceiver() == this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return;
                }
                IconCompatParcelizer.execute(this.MediaSessionCompatToken);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(Canvas canvas, Matrix matrix) {
        startRenderers startrenderers = this.MediaDescriptionCompat;
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (startrenderers == null || exoPlayerImplExternalSyntheticLambda19 == null) {
            return;
        }
        boolean zOnRemoveQueueItemAt = onRemoveQueueItemAt();
        if (zOnRemoveQueueItemAt) {
            try {
                this.onSeekTo.acquire();
                if (onRewind()) {
                    AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
                }
            } catch (InterruptedException unused) {
                if (!zOnRemoveQueueItemAt) {
                    return;
                }
                this.onSeekTo.release();
                if (startrenderers.MediaBrowserCompatCustomActionResultReceiver() == this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return;
                }
            } catch (Throwable th) {
                if (zOnRemoveQueueItemAt) {
                    this.onSeekTo.release();
                    if (startrenderers.MediaBrowserCompatCustomActionResultReceiver() != this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                        IconCompatParcelizer.execute(this.MediaSessionCompatToken);
                    }
                }
                throw th;
            }
        }
        if (this.onRewind) {
            try {
                RemoteActionCompatParcelizer(canvas, matrix, startrenderers, this.write);
            } catch (Throwable th2) {
                access3000.RemoteActionCompatParcelizer("Lottie crashed in draw!", th2);
            }
        } else {
            RemoteActionCompatParcelizer(canvas, matrix, startrenderers, this.write);
        }
        this.onPause = false;
        if (zOnRemoveQueueItemAt) {
            this.onSeekTo.release();
            if (startrenderers.MediaBrowserCompatCustomActionResultReceiver() == this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                return;
            }
            IconCompatParcelizer.execute(this.MediaSessionCompatToken);
        }
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, startRenderers startrenderers, int i) {
        if (this.PlaybackStateCompat) {
            canvas.save();
            canvas.concat(matrix);
            IconCompatParcelizer(canvas, startrenderers);
            canvas.restore();
            return;
        }
        startrenderers.RemoteActionCompatParcelizer(canvas, matrix, i, (access3100) null);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        onCommand();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        onRemoveQueueItem();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return MediaDescriptionCompat();
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: merged with bridge method [inline-methods] */
    public final void onCommand() {
        if (this.MediaDescriptionCompat == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.lambdaonSkipSilenceEnabledChanged1
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.AudioAttributesCompatParcelizer.onCommand();
                }
            });
            return;
        }
        onPlay();
        if (AudioAttributesCompatParcelizer(onPlayFromUri()) || AudioAttributesImplApi26Parcelizer() == 0) {
            if (isVisible()) {
                this.AudioAttributesCompatParcelizer.MediaMetadataCompat();
                this.onPrepare = read.NONE;
            } else {
                this.onPrepare = read.PLAY;
            }
        }
        if (AudioAttributesCompatParcelizer(onPlayFromUri())) {
            return;
        }
        maybeUpdateLoadingPeriod maybeupdateloadingperiodAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (maybeupdateloadingperiodAudioAttributesImplApi21Parcelizer != null) {
            AudioAttributesCompatParcelizer((int) maybeupdateloadingperiodAudioAttributesImplApi21Parcelizer.IconCompatParcelizer);
        } else {
            AudioAttributesCompatParcelizer((int) (onSetShuffleMode() < BitmapDescriptorFactory.HUE_RED ? onSetPlaybackSpeed() : onSeekTo()));
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        if (isVisible()) {
            return;
        }
        this.onPrepare = read.NONE;
    }

    public final maybeUpdateLoadingPeriod AudioAttributesImplApi21Parcelizer() {
        Iterator<String> it = RemoteActionCompatParcelizer.iterator();
        maybeUpdateLoadingPeriod maybeupdateloadingperiodAudioAttributesCompatParcelizer = null;
        while (it.hasNext()) {
            maybeupdateloadingperiodAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(it.next());
            if (maybeupdateloadingperiodAudioAttributesCompatParcelizer != null) {
                break;
            }
        }
        return maybeupdateloadingperiodAudioAttributesCompatParcelizer;
    }

    private void onRemoveQueueItem() {
        this.onMediaButtonEvent.clear();
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        if (isVisible()) {
            return;
        }
        this.onPrepare = read.NONE;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: merged with bridge method [inline-methods] */
    public final void onAddQueueItem() {
        if (this.MediaDescriptionCompat == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.onAudioInputFormatChanged
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.RemoteActionCompatParcelizer.onAddQueueItem();
                }
            });
            return;
        }
        onPlay();
        if (AudioAttributesCompatParcelizer(onPlayFromUri()) || AudioAttributesImplApi26Parcelizer() == 0) {
            if (isVisible()) {
                this.AudioAttributesCompatParcelizer.MediaDescriptionCompat();
                this.onPrepare = read.NONE;
            } else {
                this.onPrepare = read.RESUME;
            }
        }
        if (AudioAttributesCompatParcelizer(onPlayFromUri())) {
            return;
        }
        AudioAttributesCompatParcelizer((int) (onSetShuffleMode() < BitmapDescriptorFactory.HUE_RED ? onSetPlaybackSpeed() : onSeekTo()));
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        if (isVisible()) {
            return;
        }
        this.onPrepare = read.NONE;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(final int i) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.lambdaonMetadata4comgoogleandroidexoplayer2ExoPlayerImplComponentListener
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.read.IconCompatParcelizer(i);
                }
            });
        } else {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
        }
    }

    private float onSetPlaybackSpeed() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final void RemoteActionCompatParcelizer(final float f) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.lambdaonMetadata5
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(f);
                }
            });
        } else {
            IconCompatParcelizer((int) setColorInfo.RemoteActionCompatParcelizer(exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat(), this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), f));
        }
    }

    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void RemoteActionCompatParcelizer(final int i) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.lambdaonStreamTypeChanged6
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.write.RemoteActionCompatParcelizer(i);
                }
            });
        } else {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i + 0.99f);
        }
    }

    private float onSeekTo() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void read(final float f) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.lambdaonVideoSizeChanged0
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.read.read(f);
                }
            });
        } else {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(setColorInfo.RemoteActionCompatParcelizer(exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat(), this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), f));
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public final void RemoteActionCompatParcelizer(final String str) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.ExoPlayerImplApi31
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
                }
            });
            return;
        }
        maybeUpdateLoadingPeriod maybeupdateloadingperiodAudioAttributesCompatParcelizer = exoPlayerImplExternalSyntheticLambda19.AudioAttributesCompatParcelizer(str);
        if (maybeupdateloadingperiodAudioAttributesCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        IconCompatParcelizer((int) maybeupdateloadingperiodAudioAttributesCompatParcelizer.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(final String str) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.ExoPlayerImpl1
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.write.IconCompatParcelizer(str);
                }
            });
            return;
        }
        maybeUpdateLoadingPeriod maybeupdateloadingperiodAudioAttributesCompatParcelizer = exoPlayerImplExternalSyntheticLambda19.AudioAttributesCompatParcelizer(str);
        if (maybeupdateloadingperiodAudioAttributesCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        RemoteActionCompatParcelizer((int) (maybeupdateloadingperiodAudioAttributesCompatParcelizer.IconCompatParcelizer + maybeupdateloadingperiodAudioAttributesCompatParcelizer.write));
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public final void read(final String str) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.ExoPlayerImplExternalSyntheticLambda5
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.write.read(str);
                }
            });
            return;
        }
        maybeUpdateLoadingPeriod maybeupdateloadingperiodAudioAttributesCompatParcelizer = exoPlayerImplExternalSyntheticLambda19.AudioAttributesCompatParcelizer(str);
        if (maybeupdateloadingperiodAudioAttributesCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) maybeupdateloadingperiodAudioAttributesCompatParcelizer.IconCompatParcelizer;
        AudioAttributesCompatParcelizer(i, ((int) maybeupdateloadingperiodAudioAttributesCompatParcelizer.write) + i);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(final String str, final String str2, final boolean z) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.registerMediaMetricsListener
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.write.IconCompatParcelizer(str, str2, z);
                }
            });
            return;
        }
        maybeUpdateLoadingPeriod maybeupdateloadingperiodAudioAttributesCompatParcelizer = exoPlayerImplExternalSyntheticLambda19.AudioAttributesCompatParcelizer(str);
        if (maybeupdateloadingperiodAudioAttributesCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) maybeupdateloadingperiodAudioAttributesCompatParcelizer.IconCompatParcelizer;
        maybeUpdateLoadingPeriod maybeupdateloadingperiodAudioAttributesCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(str2);
        if (maybeupdateloadingperiodAudioAttributesCompatParcelizer2 == null) {
            StringBuilder sb2 = new StringBuilder("Cannot find marker with name ");
            sb2.append(str2);
            sb2.append(".");
            throw new IllegalArgumentException(sb2.toString());
        }
        AudioAttributesCompatParcelizer(i, (int) (maybeupdateloadingperiodAudioAttributesCompatParcelizer2.IconCompatParcelizer + (z ? 1.0f : BitmapDescriptorFactory.HUE_RED)));
    }

    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void AudioAttributesCompatParcelizer(final int i, final int i2) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.onAudioCodecError
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, i2);
                }
            });
        } else {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i, i2 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void write(final float f, final float f2) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.lambdaonCues2
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.write.write(f, f2);
                }
            });
        } else {
            AudioAttributesCompatParcelizer((int) setColorInfo.RemoteActionCompatParcelizer(exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat(), this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), f), (int) setColorInfo.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.MediaMetadataCompat(), this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), f2));
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        this.AudioAttributesCompatParcelizer.read(f);
    }

    private float onSetShuffleMode() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    public final void AudioAttributesCompatParcelizer(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.AudioAttributesCompatParcelizer.addUpdateListener(animatorUpdateListener);
    }

    public final void write(Animator.AnimatorListener animatorListener) {
        this.AudioAttributesCompatParcelizer.addListener(animatorListener);
    }

    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final void AudioAttributesCompatParcelizer(final int i) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.ExoPlayerImplExternalSyntheticLambda8
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.write.AudioAttributesCompatParcelizer(i);
                }
            });
        } else {
            this.AudioAttributesCompatParcelizer.write(i);
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final void AudioAttributesCompatParcelizer(final float f) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.lambdaonCues3
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(f);
                }
            });
            return;
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        this.AudioAttributesCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer.read(f));
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    public final void AudioAttributesImplBaseParcelizer(int i) {
        this.AudioAttributesCompatParcelizer.setRepeatMode(i);
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer.getRepeatMode();
    }

    public final void AudioAttributesImplApi26Parcelizer(int i) {
        this.AudioAttributesCompatParcelizer.setRepeatCount(i);
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.getRepeatCount();
    }

    public final boolean MediaDescriptionCompat() {
        setCodecs setcodecs = this.AudioAttributesCompatParcelizer;
        if (setcodecs == null) {
            return false;
        }
        return setcodecs.isRunning();
    }

    public final boolean RatingCompat() {
        if (isVisible()) {
            return this.AudioAttributesCompatParcelizer.isRunning();
        }
        return this.onPrepare == read.PLAY || this.onPrepare == read.RESUME;
    }

    public final boolean AudioAttributesCompatParcelizer(Context context) {
        if (this.onAddQueueItem) {
            return true;
        }
        return this.onSkipToQueueItem && ExoPlayerImplExternalSyntheticLambda18.read().write(context) == handlePositionDiscontinuity.STANDARD_MOTION;
    }

    @Deprecated
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.onAddQueueItem = z;
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(z);
    }

    public final void RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12) {
        this.handleMediaPlayPauseIfPendingOnHandler = exoPlayerImplExternalSyntheticLambda12;
        isRendererEnabled isrendererenabled = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (isrendererenabled != null) {
            isrendererenabled.read(exoPlayerImplExternalSyntheticLambda12);
        }
    }

    public final void read(ExoPlayerImplExternalSyntheticLambda10 exoPlayerImplExternalSyntheticLambda10) {
        this.MediaBrowserCompatMediaItem = exoPlayerImplExternalSyntheticLambda10;
        maybeContinueLoading maybecontinueloading = this.MediaBrowserCompatSearchResultReceiver;
        if (maybecontinueloading != null) {
            maybecontinueloading.write(exoPlayerImplExternalSyntheticLambda10);
        }
    }

    public final void RemoteActionCompatParcelizer(Map<String, Typeface> map) {
        if (map == this.MediaMetadataCompat) {
            return;
        }
        this.MediaMetadataCompat = map;
        invalidateSelf();
    }

    public final void RemoteActionCompatParcelizer(onVideoCodecError onvideocodecerror) {
        this.MediaSessionCompatResultReceiverWrapper = onvideocodecerror;
    }

    public final onVideoCodecError MediaBrowserCompatSearchResultReceiver() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public final boolean onPause() {
        return this.MediaMetadataCompat == null && this.MediaSessionCompatResultReceiverWrapper == null && this.AudioAttributesImplBaseParcelizer.write().read() > 0;
    }

    public final ExoPlayerImplExternalSyntheticLambda19 RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void onCustomAction() {
        this.onMediaButtonEvent.clear();
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
        if (isVisible()) {
            return;
        }
        this.onPrepare = read.NONE;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return -1;
        }
        return exoPlayerImplExternalSyntheticLambda19.IconCompatParcelizer().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return -1;
        }
        return exoPlayerImplExternalSyntheticLambda19.IconCompatParcelizer().height();
    }

    private List<maybeTriggerPendingMessages> IconCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages) {
        if (this.MediaDescriptionCompat == null) {
            access3000.AudioAttributesCompatParcelizer("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(maybetriggerpendingmessages, 0, arrayList, new maybeTriggerPendingMessages(new String[0]));
        return arrayList;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final <T> void IconCompatParcelizer(final maybeTriggerPendingMessages maybetriggerpendingmessages, final T t, final setDrmInitData<T> setdrminitdata) {
        if (this.MediaDescriptionCompat == null) {
            this.onMediaButtonEvent.add(new AudioAttributesCompatParcelizer() { // from class: o.lambdaonStreamVolumeChanged7
                @Override // o.ExoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer
                public final void read() {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(maybetriggerpendingmessages, t, setdrminitdata);
                }
            });
            return;
        }
        if (maybetriggerpendingmessages == maybeTriggerPendingMessages.read) {
            this.MediaDescriptionCompat.read(t, setdrminitdata);
        } else if (maybetriggerpendingmessages.read() != null) {
            maybetriggerpendingmessages.read().read(t, setdrminitdata);
        } else {
            List<maybeTriggerPendingMessages> listIconCompatParcelizer = IconCompatParcelizer(maybetriggerpendingmessages);
            for (int i = 0; i < listIconCompatParcelizer.size(); i++) {
                listIconCompatParcelizer.get(i).read().read(t, setdrminitdata);
            }
            if (!(!listIconCompatParcelizer.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t == onAudioPositionAdvancing.onPrepareFromSearch) {
            AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver());
        }
    }

    public final Bitmap write(String str) {
        isRendererEnabled isrendererenabledOnPlayFromSearch = onPlayFromSearch();
        if (isrendererenabledOnPlayFromSearch != null) {
            return isrendererenabledOnPlayFromSearch.IconCompatParcelizer(str);
        }
        return null;
    }

    public final onAudioDisabled AudioAttributesCompatParcelizer(String str) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return null;
        }
        return exoPlayerImplExternalSyntheticLambda19.AudioAttributesImplBaseParcelizer().get(str);
    }

    private isRendererEnabled onPlayFromSearch() {
        isRendererEnabled isrendererenabled = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (isrendererenabled != null && !isrendererenabled.write(onPlayFromUri())) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new isRendererEnabled(getCallback(), this.onCommand, this.handleMediaPlayPauseIfPendingOnHandler, this.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer());
        }
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final Typeface RemoteActionCompatParcelizer(isUsingPlaceholderPeriod isusingplaceholderperiod) {
        Map<String, Typeface> map = this.MediaMetadataCompat;
        if (map != null) {
            String strIconCompatParcelizer = isusingplaceholderperiod.IconCompatParcelizer();
            if (map.containsKey(strIconCompatParcelizer)) {
                return map.get(strIconCompatParcelizer);
            }
            String strAudioAttributesCompatParcelizer = isusingplaceholderperiod.AudioAttributesCompatParcelizer();
            if (map.containsKey(strAudioAttributesCompatParcelizer)) {
                return map.get(strAudioAttributesCompatParcelizer);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(isusingplaceholderperiod.IconCompatParcelizer());
            sb.append("-");
            sb.append(isusingplaceholderperiod.RemoteActionCompatParcelizer());
            String string = sb.toString();
            if (map.containsKey(string)) {
                return map.get(string);
            }
        }
        maybeContinueLoading maybecontinueloadingOnPrepareFromSearch = onPrepareFromSearch();
        if (maybecontinueloadingOnPrepareFromSearch != null) {
            return maybecontinueloadingOnPrepareFromSearch.read(isusingplaceholderperiod);
        }
        return null;
    }

    private maybeContinueLoading onPrepareFromSearch() {
        if (getCallback() == null) {
            return null;
        }
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            maybeContinueLoading maybecontinueloading = new maybeContinueLoading(getCallback(), this.MediaBrowserCompatMediaItem);
            this.MediaBrowserCompatSearchResultReceiver = maybecontinueloading;
            String str = this.RatingCompat;
            if (str != null) {
                maybecontinueloading.IconCompatParcelizer(str);
            }
        }
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void MediaBrowserCompatItemReceiver(String str) {
        this.RatingCompat = str;
        maybeContinueLoading maybecontinueloadingOnPrepareFromSearch = onPrepareFromSearch();
        if (maybecontinueloadingOnPrepareFromSearch != null) {
            maybecontinueloadingOnPrepareFromSearch.IconCompatParcelizer(str);
        }
    }

    private Context onPlayFromUri() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            if (this.onPrepare == read.PLAY) {
                onCommand();
                return visible;
            }
            if (this.onPrepare == read.RESUME) {
                onAddQueueItem();
                return visible;
            }
        } else {
            if (this.AudioAttributesCompatParcelizer.isRunning()) {
                onCustomAction();
                this.onPrepare = read.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.onPrepare = read.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    private void read(Canvas canvas) {
        startRenderers startrenderers = this.MediaDescriptionCompat;
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplBaseParcelizer;
        if (startrenderers == null || exoPlayerImplExternalSyntheticLambda19 == null) {
            return;
        }
        this.onPrepareFromUri.reset();
        if (!getBounds().isEmpty()) {
            this.onPrepareFromUri.preTranslate(r2.left, r2.top);
            this.onPrepareFromUri.preScale(r2.width() / exoPlayerImplExternalSyntheticLambda19.IconCompatParcelizer().width(), r2.height() / exoPlayerImplExternalSyntheticLambda19.IconCompatParcelizer().height());
        }
        startrenderers.RemoteActionCompatParcelizer(canvas, this.onPrepareFromUri, this.write, (access3100) null);
    }

    private void IconCompatParcelizer(Canvas canvas, startRenderers startrenderers) {
        if (this.AudioAttributesImplBaseParcelizer == null || startrenderers == null) {
            return;
        }
        onPrepareFromMediaId();
        canvas.getMatrix(this.onSetCaptioningEnabled);
        canvas.getClipBounds(this.AudioAttributesImplApi26Parcelizer);
        AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver);
        this.onSetCaptioningEnabled.mapRect(this.MediaBrowserCompatItemReceiver);
        RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer);
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            this.setSessionImpl.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            startrenderers.read(this.setSessionImpl, (Matrix) null, false);
        }
        this.onSetCaptioningEnabled.mapRect(this.setSessionImpl);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        read(this.setSessionImpl, fWidth, fHeight);
        if (!onPrepare()) {
            this.setSessionImpl.intersect(this.AudioAttributesImplApi26Parcelizer.left, this.AudioAttributesImplApi26Parcelizer.top, this.AudioAttributesImplApi26Parcelizer.right, this.AudioAttributesImplApi26Parcelizer.bottom);
        }
        int iCeil = (int) Math.ceil(this.setSessionImpl.width());
        int iCeil2 = (int) Math.ceil(this.setSessionImpl.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        IconCompatParcelizer(iCeil, iCeil2);
        if (this.onPause) {
            this.onSetCaptioningEnabled.getValues(this.onSetRepeatMode);
            float[] fArr = this.onSetRepeatMode;
            float f = fArr[0];
            float f2 = fArr[4];
            this.onPrepareFromUri.set(this.onSetCaptioningEnabled);
            this.onPrepareFromUri.preScale(fWidth, fHeight);
            this.onPrepareFromUri.postTranslate(-this.setSessionImpl.left, -this.setSessionImpl.top);
            this.onPrepareFromUri.postScale(1.0f / f, 1.0f / f2);
            this.onRemoveQueueItem.eraseColor(0);
            this.onSetPlaybackSpeed.setMatrix(setEncoderPadding.write);
            this.onSetPlaybackSpeed.scale(f, f2);
            startrenderers.RemoteActionCompatParcelizer(this.onSetPlaybackSpeed, this.onPrepareFromUri, this.write, (access3100) null);
            this.onSetCaptioningEnabled.invert(this.onSkipToNext);
            this.onSkipToNext.mapRect(this.onSetRating, this.setSessionImpl);
            RemoteActionCompatParcelizer(this.onSetRating, this.onSetShuffleMode);
        }
        this.onSkipToPrevious.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.onRemoveQueueItem, this.onSkipToPrevious, this.onSetShuffleMode, this.onStop);
    }

    private void onPrepareFromMediaId() {
        if (this.onSetPlaybackSpeed != null) {
            return;
        }
        this.onSetPlaybackSpeed = new Canvas();
        this.setSessionImpl = new RectF();
        this.onSetCaptioningEnabled = new Matrix();
        this.onSkipToNext = new Matrix();
        this.AudioAttributesImplApi26Parcelizer = new Rect();
        this.MediaBrowserCompatItemReceiver = new RectF();
        this.onStop = new onSurfaceTextureDestroyed();
        this.onSkipToPrevious = new Rect();
        this.onSetShuffleMode = new Rect();
        this.onSetRating = new RectF();
    }

    private void IconCompatParcelizer(int i, int i2) {
        Bitmap bitmap = this.onRemoveQueueItem;
        if (bitmap == null || bitmap.getWidth() < i || this.onRemoveQueueItem.getHeight() < i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.onRemoveQueueItem = bitmapCreateBitmap;
            this.onSetPlaybackSpeed.setBitmap(bitmapCreateBitmap);
            this.onPause = true;
            return;
        }
        if (this.onRemoveQueueItem.getWidth() > i || this.onRemoveQueueItem.getHeight() > i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.onRemoveQueueItem, 0, 0, i, i2);
            this.onRemoveQueueItem = bitmapCreateBitmap2;
            this.onSetPlaybackSpeed.setBitmap(bitmapCreateBitmap2);
            this.onPause = true;
        }
    }

    private static void RemoteActionCompatParcelizer(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private static void AudioAttributesCompatParcelizer(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private static void read(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean onPrepare() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r2).getClipChildren();
        }
        return false;
    }
}
