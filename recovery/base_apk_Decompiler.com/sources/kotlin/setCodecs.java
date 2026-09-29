package kotlin;

import android.view.Choreographer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class setCodecs extends access3200 implements Choreographer.FrameCallback {
    private ExoPlayerImplExternalSyntheticLambda19 AudioAttributesCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver = 1.0f;
    private boolean AudioAttributesImplApi21Parcelizer = false;
    private long read = 0;
    private float RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    private float write = BitmapDescriptorFactory.HUE_RED;
    private int MediaBrowserCompatItemReceiver = 0;
    private float AudioAttributesImplApi26Parcelizer = -2.1474836E9f;
    private float IconCompatParcelizer = 2.1474836E9f;
    private boolean AudioAttributesImplBaseParcelizer = false;
    private boolean MediaMetadataCompat = false;

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(MediaBrowserCompatCustomActionResultReceiver());
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesCompatParcelizer;
        return exoPlayerImplExternalSyntheticLambda19 == null ? BitmapDescriptorFactory.HUE_RED : (this.write - exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat()) / (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() - this.AudioAttributesCompatParcelizer.MediaMetadataCompat());
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fAudioAttributesImplBaseParcelizer;
        float fAudioAttributesImplApi21Parcelizer;
        float fAudioAttributesImplBaseParcelizer2;
        if (this.AudioAttributesCompatParcelizer == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            fAudioAttributesImplBaseParcelizer = AudioAttributesImplApi21Parcelizer() - this.write;
            fAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
            fAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer();
        } else {
            fAudioAttributesImplBaseParcelizer = this.write - AudioAttributesImplBaseParcelizer();
            fAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
            fAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer();
        }
        return fAudioAttributesImplBaseParcelizer / (fAudioAttributesImplApi21Parcelizer - fAudioAttributesImplBaseParcelizer2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesCompatParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return 0L;
        }
        return (long) exoPlayerImplExternalSyntheticLambda19.AudioAttributesCompatParcelizer();
    }

    private float onAddQueueItem() {
        return this.write;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaMetadataCompat = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (this.AudioAttributesCompatParcelizer == null || !isRunning()) {
            return;
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        float fRatingCompat = (this.read != 0 ? j - r0 : 0L) / RatingCompat();
        float f = this.RemoteActionCompatParcelizer;
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            fRatingCompat = -fRatingCompat;
        }
        float f2 = f + fRatingCompat;
        boolean zIconCompatParcelizer = setColorInfo.IconCompatParcelizer(f2, AudioAttributesImplBaseParcelizer(), AudioAttributesImplApi21Parcelizer());
        float f3 = this.RemoteActionCompatParcelizer;
        float fAudioAttributesCompatParcelizer = setColorInfo.AudioAttributesCompatParcelizer(f2, AudioAttributesImplBaseParcelizer(), AudioAttributesImplApi21Parcelizer());
        this.RemoteActionCompatParcelizer = fAudioAttributesCompatParcelizer;
        if (this.MediaMetadataCompat) {
            fAudioAttributesCompatParcelizer = (float) Math.floor(fAudioAttributesCompatParcelizer);
        }
        this.write = fAudioAttributesCompatParcelizer;
        this.read = j;
        if (!zIconCompatParcelizer) {
            if (getRepeatCount() != -1 && this.MediaBrowserCompatItemReceiver >= getRepeatCount()) {
                float fAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatCustomActionResultReceiver < BitmapDescriptorFactory.HUE_RED ? AudioAttributesImplBaseParcelizer() : AudioAttributesImplApi21Parcelizer();
                this.RemoteActionCompatParcelizer = fAudioAttributesImplBaseParcelizer;
                this.write = fAudioAttributesImplBaseParcelizer;
                onCustomAction();
                AudioAttributesCompatParcelizer(f3);
                write(handleMediaPlayPauseIfPendingOnHandler());
            } else {
                if (getRepeatMode() == 2) {
                    this.AudioAttributesImplApi21Parcelizer = !this.AudioAttributesImplApi21Parcelizer;
                    onFastForward();
                } else {
                    float fAudioAttributesImplApi21Parcelizer = handleMediaPlayPauseIfPendingOnHandler() ? AudioAttributesImplApi21Parcelizer() : AudioAttributesImplBaseParcelizer();
                    this.RemoteActionCompatParcelizer = fAudioAttributesImplApi21Parcelizer;
                    this.write = fAudioAttributesImplApi21Parcelizer;
                }
                this.read = j;
                AudioAttributesCompatParcelizer(f3);
                IconCompatParcelizer();
                this.MediaBrowserCompatItemReceiver++;
            }
        } else {
            AudioAttributesCompatParcelizer(f3);
        }
        onCommand();
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesCompatParcelizer(float f) {
        if (this.MediaMetadataCompat && this.RemoteActionCompatParcelizer == f) {
            return;
        }
        AudioAttributesCompatParcelizer();
    }

    private float RatingCompat() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesCompatParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / exoPlayerImplExternalSyntheticLambda19.MediaBrowserCompatCustomActionResultReceiver()) / Math.abs(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.AudioAttributesCompatParcelizer = null;
        this.AudioAttributesImplApi26Parcelizer = -2.1474836E9f;
        this.IconCompatParcelizer = 2.1474836E9f;
    }

    public final void IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        boolean z = this.AudioAttributesCompatParcelizer == null;
        this.AudioAttributesCompatParcelizer = exoPlayerImplExternalSyntheticLambda19;
        if (z) {
            IconCompatParcelizer(Math.max(this.AudioAttributesImplApi26Parcelizer, exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat()), Math.min(this.IconCompatParcelizer, exoPlayerImplExternalSyntheticLambda19.RemoteActionCompatParcelizer()));
        } else {
            IconCompatParcelizer((int) exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat(), (int) exoPlayerImplExternalSyntheticLambda19.RemoteActionCompatParcelizer());
        }
        float f = this.write;
        this.write = BitmapDescriptorFactory.HUE_RED;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        write((int) f);
        AudioAttributesCompatParcelizer();
    }

    public final void write(float f) {
        if (this.RemoteActionCompatParcelizer == f) {
            return;
        }
        float fAudioAttributesCompatParcelizer = setColorInfo.AudioAttributesCompatParcelizer(f, AudioAttributesImplBaseParcelizer(), AudioAttributesImplApi21Parcelizer());
        this.RemoteActionCompatParcelizer = fAudioAttributesCompatParcelizer;
        if (this.MediaMetadataCompat) {
            fAudioAttributesCompatParcelizer = (float) Math.floor(fAudioAttributesCompatParcelizer);
        }
        this.write = fAudioAttributesCompatParcelizer;
        this.read = 0L;
        AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(int i) {
        IconCompatParcelizer(i, (int) this.IconCompatParcelizer);
    }

    public final void IconCompatParcelizer(float f) {
        IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, f);
    }

    public final void IconCompatParcelizer(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesCompatParcelizer;
        float fMediaMetadataCompat = exoPlayerImplExternalSyntheticLambda19 == null ? -3.4028235E38f : exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat();
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda192 = this.AudioAttributesCompatParcelizer;
        float fRemoteActionCompatParcelizer = exoPlayerImplExternalSyntheticLambda192 == null ? Float.MAX_VALUE : exoPlayerImplExternalSyntheticLambda192.RemoteActionCompatParcelizer();
        float fAudioAttributesCompatParcelizer = setColorInfo.AudioAttributesCompatParcelizer(f, fMediaMetadataCompat, fRemoteActionCompatParcelizer);
        float fAudioAttributesCompatParcelizer2 = setColorInfo.AudioAttributesCompatParcelizer(f2, fMediaMetadataCompat, fRemoteActionCompatParcelizer);
        if (fAudioAttributesCompatParcelizer == this.AudioAttributesImplApi26Parcelizer && fAudioAttributesCompatParcelizer2 == this.IconCompatParcelizer) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = fAudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = fAudioAttributesCompatParcelizer2;
        write((int) setColorInfo.AudioAttributesCompatParcelizer(this.write, fAudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer2));
    }

    private void onFastForward() {
        read(-MediaBrowserCompatMediaItem());
    }

    public final void read(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
    }

    public final float MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = false;
        onFastForward();
    }

    public final void MediaMetadataCompat() {
        this.AudioAttributesImplBaseParcelizer = true;
        AudioAttributesCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
        write((int) (handleMediaPlayPauseIfPendingOnHandler() ? AudioAttributesImplApi21Parcelizer() : AudioAttributesImplBaseParcelizer()));
        this.read = 0L;
        this.MediaBrowserCompatItemReceiver = 0;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        onCustomAction();
        write(handleMediaPlayPauseIfPendingOnHandler());
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        onCustomAction();
        read();
    }

    public final void MediaDescriptionCompat() {
        this.AudioAttributesImplBaseParcelizer = true;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.read = 0L;
        if (handleMediaPlayPauseIfPendingOnHandler() && onAddQueueItem() == AudioAttributesImplBaseParcelizer()) {
            write(AudioAttributesImplApi21Parcelizer());
        } else if (!handleMediaPlayPauseIfPendingOnHandler() && onAddQueueItem() == AudioAttributesImplApi21Parcelizer()) {
            write(AudioAttributesImplBaseParcelizer());
        }
        write();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        RemoteActionCompatParcelizer();
        onCustomAction();
    }

    private boolean handleMediaPlayPauseIfPendingOnHandler() {
        return MediaBrowserCompatMediaItem() < BitmapDescriptorFactory.HUE_RED;
    }

    public final float AudioAttributesImplBaseParcelizer() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesCompatParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.AudioAttributesImplApi26Parcelizer;
        return f == -2.1474836E9f ? exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat() : f;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesCompatParcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.IconCompatParcelizer;
        return f == 2.1474836E9f ? exoPlayerImplExternalSyntheticLambda19.RemoteActionCompatParcelizer() : f;
    }

    @Override // kotlin.access3200
    final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        write(handleMediaPlayPauseIfPendingOnHandler());
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (isRunning()) {
            read(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    private void onCustomAction() {
        read(true);
    }

    private void read(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.AudioAttributesImplBaseParcelizer = false;
        }
    }

    private void onCommand() {
        if (this.AudioAttributesCompatParcelizer != null) {
            float f = this.write;
            float f2 = this.AudioAttributesImplApi26Parcelizer;
            if (f < f2 || f > this.IconCompatParcelizer) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f2), Float.valueOf(this.IconCompatParcelizer), Float.valueOf(f)));
            }
        }
    }
}
