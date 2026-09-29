package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getActivityBanner;

/* JADX INFO: loaded from: classes5.dex */
public final class PositionHolder extends setFromXingHeaderValue<ObjectAnimator> {
    private final getMetadataCopyWithAppendedEntriesFrom AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private ObjectAnimator MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private final Interpolator[] MediaDescriptionCompat;
    private ObjectAnimator MediaMetadataCompat;
    private int RatingCompat;
    getActivityBanner.RemoteActionCompatParcelizer write;
    private static final int[] MediaBrowserCompatItemReceiver = {533, 567, 850, 750};
    private static final int[] AudioAttributesImplApi21Parcelizer = {1267, 1000, 333, 0};
    private static final Property<PositionHolder, Float> AudioAttributesCompatParcelizer = new Property<PositionHolder, Float>(Float.class, "animationFraction") { // from class: o.PositionHolder.3
        @Override // android.util.Property
        public final /* synthetic */ Float get(PositionHolder positionHolder) {
            return write(positionHolder);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(PositionHolder positionHolder, Float f) {
            read(positionHolder, f);
        }

        private static Float write(PositionHolder positionHolder) {
            return Float.valueOf(positionHolder.MediaBrowserCompatItemReceiver());
        }

        private static void read(PositionHolder positionHolder, Float f) {
            positionHolder.write(f.floatValue());
        }
    };

    static /* synthetic */ boolean AudioAttributesCompatParcelizer(PositionHolder positionHolder) {
        positionHolder.MediaBrowserCompatSearchResultReceiver = true;
        return true;
    }

    public PositionHolder(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.RatingCompat = 0;
        this.write = null;
        this.AudioAttributesImplApi26Parcelizer = linearProgressIndicatorSpec;
        this.MediaDescriptionCompat = new Interpolator[]{extendVerificationTimeout.write(context, calculateNextSearchBytePosition.AudioAttributesCompatParcelizer.linear_indeterminate_line1_head_interpolator), extendVerificationTimeout.write(context, calculateNextSearchBytePosition.AudioAttributesCompatParcelizer.linear_indeterminate_line1_tail_interpolator), extendVerificationTimeout.write(context, calculateNextSearchBytePosition.AudioAttributesCompatParcelizer.linear_indeterminate_line2_head_interpolator), extendVerificationTimeout.write(context, calculateNextSearchBytePosition.AudioAttributesCompatParcelizer.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void AudioAttributesCompatParcelizer() {
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi21Parcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver.start();
    }

    private void AudioAttributesImplBaseParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, AudioAttributesCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.MediaBrowserCompatCustomActionResultReceiver = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.MediaBrowserCompatCustomActionResultReceiver.setInterpolator(null);
            this.MediaBrowserCompatCustomActionResultReceiver.setRepeatCount(-1);
            this.MediaBrowserCompatCustomActionResultReceiver.addListener(new AnimatorListenerAdapter() { // from class: o.PositionHolder.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    PositionHolder positionHolder = PositionHolder.this;
                    positionHolder.RatingCompat = (positionHolder.RatingCompat + 1) % PositionHolder.this.AudioAttributesImplApi26Parcelizer.write.length;
                    PositionHolder.AudioAttributesCompatParcelizer(PositionHolder.this);
                }
            });
        }
        if (this.MediaMetadataCompat == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, AudioAttributesCompatParcelizer, 1.0f);
            this.MediaMetadataCompat = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.MediaMetadataCompat.setInterpolator(null);
            this.MediaMetadataCompat.addListener(new AnimatorListenerAdapter() { // from class: o.PositionHolder.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    PositionHolder.this.RemoteActionCompatParcelizer();
                    if (PositionHolder.this.write != null) {
                        PositionHolder.this.write.AudioAttributesCompatParcelizer(PositionHolder.this.IconCompatParcelizer);
                    }
                }
            });
        }
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void RemoteActionCompatParcelizer() {
        ObjectAnimator objectAnimator = this.MediaBrowserCompatCustomActionResultReceiver;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void write() {
        ObjectAnimator objectAnimator = this.MediaMetadataCompat;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        RemoteActionCompatParcelizer();
        if (this.IconCompatParcelizer.isVisible()) {
            this.MediaMetadataCompat.setFloatValues(this.AudioAttributesImplBaseParcelizer, 1.0f);
            this.MediaMetadataCompat.setDuration((long) ((1.0f - this.AudioAttributesImplBaseParcelizer) * 1800.0f));
            this.MediaMetadataCompat.start();
        }
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void read() {
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void IconCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.write = remoteActionCompatParcelizer;
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void IconCompatParcelizer() {
        this.write = null;
    }

    private void write(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.read[i2] = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, this.MediaDescriptionCompat[i2].getInterpolation(RemoteActionCompatParcelizer(i, AudioAttributesImplApi21Parcelizer[i2], MediaBrowserCompatItemReceiver[i2]))));
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (this.MediaBrowserCompatSearchResultReceiver) {
            Arrays.fill(this.RemoteActionCompatParcelizer, createExtractors.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.write[this.RatingCompat], this.IconCompatParcelizer.getAlpha()));
            this.MediaBrowserCompatSearchResultReceiver = false;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.RatingCompat = 0;
        int iIconCompatParcelizer = createExtractors.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.write[0], this.IconCompatParcelizer.getAlpha());
        this.RemoteActionCompatParcelizer[0] = iIconCompatParcelizer;
        this.RemoteActionCompatParcelizer[1] = iIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    final void write(float f) {
        this.AudioAttributesImplBaseParcelizer = f;
        write((int) (f * 1800.0f));
        AudioAttributesImplApi26Parcelizer();
        this.IconCompatParcelizer.invalidateSelf();
    }
}
