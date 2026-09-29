package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class getApproxBytesPerFrame extends FlacMetadataReaderFlacStreamMetadataHolder<View> {
    private final float AudioAttributesImplApi21Parcelizer;
    private final float MediaBrowserCompatCustomActionResultReceiver;
    private final float read;

    public getApproxBytesPerFrame(View view) {
        super(view);
        Resources resources = view.getResources();
        this.MediaBrowserCompatCustomActionResultReceiver = resources.getDimension(calculateNextSearchBytePosition.write.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.read = resources.getDimension(calculateNextSearchBytePosition.write.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.AudioAttributesImplApi21Parcelizer = resources.getDimension(calculateNextSearchBytePosition.write.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void IconCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        super.read(audioAttributesImplApi26Parcelizer);
    }

    public final void IconCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, int i) {
        if (super.write(audioAttributesImplApi26Parcelizer) == null) {
            return;
        }
        read(audioAttributesImplApi26Parcelizer.getWrite(), audioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer() == 0, i);
    }

    public final void read(float f, boolean z, int i) {
        int right;
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(f);
        boolean zIconCompatParcelizer = IconCompatParcelizer(i);
        boolean z2 = z == zIconCompatParcelizer;
        int width = this.write.getWidth();
        int height = this.write.getHeight();
        float f2 = width;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            float f3 = height;
            if (f3 > BitmapDescriptorFactory.HUE_RED) {
                float f4 = this.MediaBrowserCompatCustomActionResultReceiver / f2;
                float f5 = this.read / f2;
                float f6 = this.AudioAttributesImplApi21Parcelizer / f3;
                V v = this.write;
                if (zIconCompatParcelizer) {
                    f2 = 0.0f;
                }
                v.setPivotX(f2);
                if (!z2) {
                    f5 = -f4;
                }
                float f7 = BinarySearchSeekerSeekOperationParams.read(BitmapDescriptorFactory.HUE_RED, f5, fRemoteActionCompatParcelizer);
                float f8 = f7 + 1.0f;
                this.write.setScaleX(f8);
                float f9 = 1.0f - BinarySearchSeekerSeekOperationParams.read(BitmapDescriptorFactory.HUE_RED, f6, fRemoteActionCompatParcelizer);
                this.write.setScaleY(f9);
                if (this.write instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) this.write;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (zIconCompatParcelizer) {
                            right = (width - childAt.getRight()) + childAt.getWidth();
                        } else {
                            right = -childAt.getLeft();
                        }
                        childAt.setPivotX(right);
                        childAt.setPivotY(-childAt.getTop());
                        float f10 = z2 ? 1.0f - f7 : 1.0f;
                        float f11 = f9 != BitmapDescriptorFactory.HUE_RED ? (f8 / f9) * f10 : 1.0f;
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f11);
                    }
                }
            }
        }
    }

    public final void write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, final int i, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z = audioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer() == 0;
        boolean zIconCompatParcelizer = IconCompatParcelizer(i);
        float width = (this.write.getWidth() * this.write.getScaleX()) + read(zIconCompatParcelizer);
        V v = this.write;
        Property property = View.TRANSLATION_X;
        if (zIconCompatParcelizer) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new _selectSetterFromMultiple());
        objectAnimatorOfFloat.setDuration(BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, audioAttributesImplApi26Parcelizer.getWrite()));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: o.getApproxBytesPerFrame.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                getApproxBytesPerFrame.this.write.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                getApproxBytesPerFrame.this.read(BitmapDescriptorFactory.HUE_RED, z, i);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public final void write() {
        if (super.AudioAttributesCompatParcelizer() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (this.write instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.write;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.AudioAttributesCompatParcelizer);
        animatorSet.start();
    }

    private boolean IconCompatParcelizer(int i) {
        return (_clearIfStdImpl.write(i, InvalidTypeIdException.MediaBrowserCompatMediaItem(this.write)) & 3) == 3;
    }

    private int read(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.write.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }
}
