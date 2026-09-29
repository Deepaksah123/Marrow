package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class getBitsPerSampleLookupKey extends FlacMetadataReaderFlacStreamMetadataHolder<View> {
    private final float AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private final float AudioAttributesImplBaseParcelizer;
    private Rect MediaBrowserCompatCustomActionResultReceiver;
    private Rect MediaBrowserCompatItemReceiver;
    private Integer read;

    public getBitsPerSampleLookupKey(View view) {
        super(view);
        Resources resources = view.getResources();
        this.AudioAttributesImplBaseParcelizer = resources.getDimension(calculateNextSearchBytePosition.write.m3_back_progress_main_container_min_edge_gap);
        this.AudioAttributesImplApi21Parcelizer = resources.getDimension(calculateNextSearchBytePosition.write.m3_back_progress_main_container_max_translation_y);
    }

    public final Rect RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final Rect write() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void read(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, View view) {
        super.read(audioAttributesImplApi26Parcelizer);
        RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer.getRead(), view);
    }

    private void RemoteActionCompatParcelizer(float f, View view) {
        this.MediaBrowserCompatItemReceiver = checkAndPeekStreamMarker.IconCompatParcelizer(this.write);
        if (view != null) {
            this.MediaBrowserCompatCustomActionResultReceiver = checkAndPeekStreamMarker.IconCompatParcelizer(this.write, view);
        }
        this.AudioAttributesImplApi26Parcelizer = f;
    }

    public final void RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, View view, float f) {
        if (super.write(audioAttributesImplApi26Parcelizer) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        read(audioAttributesImplApi26Parcelizer.getWrite(), audioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer() == 0, audioAttributesImplApi26Parcelizer.getRead(), f);
    }

    private void read(float f, boolean z, float f2, float f3) {
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(f);
        float width = this.write.getWidth();
        float height = this.write.getHeight();
        if (width <= BitmapDescriptorFactory.HUE_RED || height <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f4 = BinarySearchSeekerSeekOperationParams.read(1.0f, 0.9f, fRemoteActionCompatParcelizer);
        float f5 = BinarySearchSeekerSeekOperationParams.read(BitmapDescriptorFactory.HUE_RED, Math.max(BitmapDescriptorFactory.HUE_RED, ((width - (0.9f * width)) / 2.0f) - this.AudioAttributesImplBaseParcelizer), fRemoteActionCompatParcelizer);
        int i = z ? 1 : -1;
        float fMin = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, ((height - (f4 * height)) / 2.0f) - this.AudioAttributesImplBaseParcelizer), this.AudioAttributesImplApi21Parcelizer);
        float f6 = f2 - this.AudioAttributesImplApi26Parcelizer;
        float fAbs = Math.abs(f6) / height;
        float fSignum = Math.signum(f6);
        float f7 = BinarySearchSeekerSeekOperationParams.read(BitmapDescriptorFactory.HUE_RED, fMin, fAbs);
        this.write.setScaleX(f4);
        this.write.setScaleY(f4);
        this.write.setTranslationX(f5 * i);
        this.write.setTranslationY(f7 * fSignum);
        if (this.write instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) this.write).read(BinarySearchSeekerSeekOperationParams.read(read(), f3, fRemoteActionCompatParcelizer));
        }
    }

    public final void AudioAttributesCompatParcelizer(long j, View view) {
        AnimatorSet animatorSetRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view);
        animatorSetRemoteActionCompatParcelizer.setDuration(j);
        animatorSetRemoteActionCompatParcelizer.start();
        AudioAttributesImplApi21Parcelizer();
    }

    public final void IconCompatParcelizer(View view) {
        if (super.AudioAttributesCompatParcelizer() == null) {
            return;
        }
        AnimatorSet animatorSetRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view);
        if (this.write instanceof ClippableRoundedCornerLayout) {
            animatorSetRemoteActionCompatParcelizer.playTogether(read((ClippableRoundedCornerLayout) this.write));
        }
        animatorSetRemoteActionCompatParcelizer.setDuration(this.AudioAttributesCompatParcelizer);
        animatorSetRemoteActionCompatParcelizer.start();
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatItemReceiver = null;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
    }

    private AnimatorSet RemoteActionCompatParcelizer(final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED), ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.TRANSLATION_Y, BitmapDescriptorFactory.HUE_RED));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: o.getBitsPerSampleLookupKey.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                View view2 = view;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    private ValueAnimator read(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.write(), read());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.FlacSeekTableSeekMap
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                clippableRoundedCornerLayout.read(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    public final int read() {
        if (this.read == null) {
            this.read = Integer.valueOf(AudioAttributesImplBaseParcelizer() ? AudioAttributesImplApi26Parcelizer() : 0);
        }
        return this.read.intValue();
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        int[] iArr = new int[2];
        this.write.getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private int AudioAttributesImplApi26Parcelizer() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.write.getRootWindowInsets()) == null) {
            return 0;
        }
        return Math.max(Math.max(read(rootWindowInsets, 0), read(rootWindowInsets, 1)), Math.max(read(rootWindowInsets, 3), read(rootWindowInsets, 2)));
    }

    private static int read(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }
}
