package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class concatenateVorbisMetadata extends FlacMetadataReaderFlacStreamMetadataHolder<View> {
    private final float AudioAttributesImplApi26Parcelizer;
    private final float read;

    public concatenateVorbisMetadata(View view) {
        super(view);
        Resources resources = view.getResources();
        this.read = resources.getDimension(calculateNextSearchBytePosition.write.m3_back_progress_bottom_container_max_scale_x_distance);
        this.AudioAttributesImplApi26Parcelizer = resources.getDimension(calculateNextSearchBytePosition.write.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final void RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        super.read(audioAttributesImplApi26Parcelizer);
    }

    public final void IconCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        if (super.write(audioAttributesImplApi26Parcelizer) == null) {
            return;
        }
        write(audioAttributesImplApi26Parcelizer.getWrite());
    }

    public final void write(float f) {
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(f);
        float width = this.write.getWidth();
        float height = this.write.getHeight();
        if (width <= BitmapDescriptorFactory.HUE_RED || height <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f2 = this.read / width;
        float f3 = this.AudioAttributesImplApi26Parcelizer / height;
        float f4 = 1.0f - BinarySearchSeekerSeekOperationParams.read(BitmapDescriptorFactory.HUE_RED, f2, fRemoteActionCompatParcelizer);
        float f5 = 1.0f - BinarySearchSeekerSeekOperationParams.read(BitmapDescriptorFactory.HUE_RED, f3, fRemoteActionCompatParcelizer);
        this.write.setScaleX(f4);
        this.write.setPivotY(height);
        this.write.setScaleY(f5);
        if (this.write instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.write;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(f5 != BitmapDescriptorFactory.HUE_RED ? f4 / f5 : 1.0f);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        Animator animatorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        animatorRemoteActionCompatParcelizer.setDuration(BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, audioAttributesImplApi26Parcelizer.getWrite()));
        animatorRemoteActionCompatParcelizer.start();
    }

    public final void AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.TRANSLATION_Y, this.write.getHeight() * this.write.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new _selectSetterFromMultiple());
        objectAnimatorOfFloat.setDuration(BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, audioAttributesImplApi26Parcelizer.getWrite()));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: o.concatenateVorbisMetadata.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                concatenateVorbisMetadata.this.write.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                concatenateVorbisMetadata.this.write(BitmapDescriptorFactory.HUE_RED);
            }
        });
        objectAnimatorOfFloat.addListener(animatorListener);
        objectAnimatorOfFloat.start();
    }

    public final void read() {
        if (super.AudioAttributesCompatParcelizer() == null) {
            return;
        }
        Animator animatorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        animatorRemoteActionCompatParcelizer.setDuration(this.AudioAttributesCompatParcelizer);
        animatorRemoteActionCompatParcelizer.start();
    }

    private Animator RemoteActionCompatParcelizer() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.write, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (this.write instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.write;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new _selectSetterFromMultiple());
        return animatorSet;
    }
}
