package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import kotlin.getActivityBanner;

/* JADX INFO: loaded from: classes5.dex */
final class GaplessInfoHolder extends setFromXingHeaderValue<ObjectAnimator> {
    getActivityBanner.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatMediaItem;
    private final getMetadataCopyWithAppendedEntriesFrom MediaBrowserCompatSearchResultReceiver;
    private ObjectAnimator MediaDescriptionCompat;
    private ObjectAnimator MediaMetadataCompat;
    private int RatingCompat;
    private final _selectSetterFromMultiple handleMediaPlayPauseIfPendingOnHandler;
    private static final int[] MediaBrowserCompatItemReceiver = {0, 1350, 2700, 4050};
    private static final int[] AudioAttributesImplBaseParcelizer = {667, 2017, 3367, 4717};
    private static final int[] AudioAttributesImplApi26Parcelizer = {1000, 2350, 3700, 5050};
    private static final Property<GaplessInfoHolder, Float> write = new Property<GaplessInfoHolder, Float>(Float.class, "animationFraction") { // from class: o.GaplessInfoHolder.1
        @Override // android.util.Property
        public final /* synthetic */ Float get(GaplessInfoHolder gaplessInfoHolder) {
            return RemoteActionCompatParcelizer(gaplessInfoHolder);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(GaplessInfoHolder gaplessInfoHolder, Float f) {
            IconCompatParcelizer(gaplessInfoHolder, f);
        }

        private static Float RemoteActionCompatParcelizer(GaplessInfoHolder gaplessInfoHolder) {
            return Float.valueOf(gaplessInfoHolder.MediaBrowserCompatCustomActionResultReceiver());
        }

        private static void IconCompatParcelizer(GaplessInfoHolder gaplessInfoHolder, Float f) {
            gaplessInfoHolder.read(f.floatValue());
        }
    };
    private static final Property<GaplessInfoHolder, Float> AudioAttributesImplApi21Parcelizer = new Property<GaplessInfoHolder, Float>(Float.class, "completeEndFraction") { // from class: o.GaplessInfoHolder.3
        @Override // android.util.Property
        public final /* synthetic */ Float get(GaplessInfoHolder gaplessInfoHolder) {
            return IconCompatParcelizer(gaplessInfoHolder);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(GaplessInfoHolder gaplessInfoHolder, Float f) {
            RemoteActionCompatParcelizer(gaplessInfoHolder, f);
        }

        private static Float IconCompatParcelizer(GaplessInfoHolder gaplessInfoHolder) {
            return Float.valueOf(gaplessInfoHolder.AudioAttributesImplBaseParcelizer());
        }

        private static void RemoteActionCompatParcelizer(GaplessInfoHolder gaplessInfoHolder, Float f) {
            gaplessInfoHolder.write(f.floatValue());
        }
    };

    public GaplessInfoHolder(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.RatingCompat = 0;
        this.AudioAttributesCompatParcelizer = null;
        this.MediaBrowserCompatSearchResultReceiver = circularProgressIndicatorSpec;
        this.handleMediaPlayPauseIfPendingOnHandler = new _selectSetterFromMultiple();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.setFromXingHeaderValue
    public final void AudioAttributesCompatParcelizer() {
        AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatItemReceiver();
        this.MediaMetadataCompat.start();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (this.MediaMetadataCompat == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, write, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.MediaMetadataCompat = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.MediaMetadataCompat.setInterpolator(null);
            this.MediaMetadataCompat.setRepeatCount(-1);
            this.MediaMetadataCompat.addListener(new AnimatorListenerAdapter() { // from class: o.GaplessInfoHolder.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    GaplessInfoHolder gaplessInfoHolder = GaplessInfoHolder.this;
                    gaplessInfoHolder.RatingCompat = (gaplessInfoHolder.RatingCompat + 4) % GaplessInfoHolder.this.MediaBrowserCompatSearchResultReceiver.write.length;
                }
            });
        }
        if (this.MediaDescriptionCompat == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, AudioAttributesImplApi21Parcelizer, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.MediaDescriptionCompat = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.MediaDescriptionCompat.setInterpolator(this.handleMediaPlayPauseIfPendingOnHandler);
            this.MediaDescriptionCompat.addListener(new AnimatorListenerAdapter() { // from class: o.GaplessInfoHolder.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    GaplessInfoHolder.this.RemoteActionCompatParcelizer();
                    if (GaplessInfoHolder.this.AudioAttributesCompatParcelizer != null) {
                        GaplessInfoHolder.this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(GaplessInfoHolder.this.IconCompatParcelizer);
                    }
                }
            });
        }
    }

    @Override // kotlin.setFromXingHeaderValue
    final void RemoteActionCompatParcelizer() {
        ObjectAnimator objectAnimator = this.MediaMetadataCompat;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.setFromXingHeaderValue
    public final void write() {
        ObjectAnimator objectAnimator = this.MediaDescriptionCompat;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.IconCompatParcelizer.isVisible()) {
            this.MediaDescriptionCompat.start();
        } else {
            RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void read() {
        MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void IconCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = null;
    }

    private void AudioAttributesCompatParcelizer(int i) {
        this.read[0] = (this.MediaBrowserCompatCustomActionResultReceiver * 1520.0f) - 20.0f;
        this.read[1] = this.MediaBrowserCompatCustomActionResultReceiver * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, MediaBrowserCompatItemReceiver[i2], 667);
            float[] fArr = this.read;
            fArr[1] = fArr[1] + (this.handleMediaPlayPauseIfPendingOnHandler.getInterpolation(fRemoteActionCompatParcelizer) * 250.0f);
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i, AudioAttributesImplBaseParcelizer[i2], 667);
            float[] fArr2 = this.read;
            fArr2[0] = fArr2[0] + (this.handleMediaPlayPauseIfPendingOnHandler.getInterpolation(fRemoteActionCompatParcelizer2) * 250.0f);
        }
        float[] fArr3 = this.read;
        fArr3[0] = fArr3[0] + ((this.read[1] - this.read[0]) * this.MediaBrowserCompatMediaItem);
        float[] fArr4 = this.read;
        fArr4[0] = fArr4[0] / 360.0f;
        float[] fArr5 = this.read;
        fArr5[1] = fArr5[1] / 360.0f;
    }

    private void write(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, AudioAttributesImplApi26Parcelizer[i2], 333);
            if (fRemoteActionCompatParcelizer >= BitmapDescriptorFactory.HUE_RED && fRemoteActionCompatParcelizer <= 1.0f) {
                int length = (i2 + this.RatingCompat) % this.MediaBrowserCompatSearchResultReceiver.write.length;
                int length2 = this.MediaBrowserCompatSearchResultReceiver.write.length;
                this.RemoteActionCompatParcelizer[0] = getFloorBytePosition.write(this.handleMediaPlayPauseIfPendingOnHandler.getInterpolation(fRemoteActionCompatParcelizer), Integer.valueOf(createExtractors.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.write[length], this.IconCompatParcelizer.getAlpha())), Integer.valueOf(createExtractors.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.write[(length + 1) % length2], this.IconCompatParcelizer.getAlpha()))).intValue();
                return;
            }
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        this.RatingCompat = 0;
        this.RemoteActionCompatParcelizer[0] = createExtractors.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.write[0], this.IconCompatParcelizer.getAlpha());
        this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    final void read(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        int i = (int) (f * 5400.0f);
        AudioAttributesCompatParcelizer(i);
        write(i);
        this.IconCompatParcelizer.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(float f) {
        this.MediaBrowserCompatMediaItem = f;
    }
}
