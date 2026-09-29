package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import java.util.Map;
import kotlin.AdWordsConversionReporter;
import kotlin.Rinteger;
import kotlin.Rstring;
import kotlin.registerReferrer;
import kotlin.reportWithConversionId;

/* JADX INFO: loaded from: classes4.dex */
public class ChangeImageTransform extends Transition {
    private static final String[] MediaDescriptionCompat = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator<Matrix> AudioAttributesImplApi21Parcelizer = new TypeEvaluator<Matrix>() { // from class: androidx.transition.ChangeImageTransform.2
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    };
    private static final Property<ImageView, Matrix> RemoteActionCompatParcelizer = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") { // from class: androidx.transition.ChangeImageTransform.4
        @Override // android.util.Property
        public final /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(ImageView imageView, Matrix matrix) {
            write(imageView, matrix);
        }

        private static void write(ImageView imageView, Matrix matrix) {
            AdWordsConversionReporter.RemoteActionCompatParcelizer(imageView, matrix);
        }
    };

    @Override // androidx.transition.Transition
    public final boolean read() {
        return true;
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void read(Rstring rstring, boolean z) {
        View view = rstring.AudioAttributesCompatParcelizer;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = rstring.read;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                Matrix matrixIconCompatParcelizer = z ? (Matrix) imageView.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_image_transform) : null;
                if (matrixIconCompatParcelizer == null) {
                    matrixIconCompatParcelizer = IconCompatParcelizer(imageView);
                }
                map.put("android:changeImageTransform:matrix", matrixIconCompatParcelizer);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void read(Rstring rstring) {
        read(rstring, true);
    }

    @Override // androidx.transition.Transition
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        read(rstring, false);
    }

    @Override // androidx.transition.Transition
    public final String[] write() {
        return MediaDescriptionCompat;
    }

    @Override // androidx.transition.Transition
    public final Animator read(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        if (rstring != null && rstring2 != null) {
            Rect rect = (Rect) rstring.read.get("android:changeImageTransform:bounds");
            Rect rect2 = (Rect) rstring2.read.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) rstring.read.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) rstring2.read.get("android:changeImageTransform:matrix");
                boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) rstring2.AudioAttributesCompatParcelizer;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    return write(imageView);
                }
                if (matrix == null) {
                    matrix = registerReferrer.write;
                }
                if (matrix2 == null) {
                    matrix2 = registerReferrer.write;
                }
                RemoteActionCompatParcelizer.set(imageView, matrix);
                ObjectAnimator objectAnimatorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(imageView, matrix, matrix2);
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(imageView, matrix, matrix2);
                objectAnimatorRemoteActionCompatParcelizer.addListener(iconCompatParcelizer);
                objectAnimatorRemoteActionCompatParcelizer.addPauseListener(iconCompatParcelizer);
                RemoteActionCompatParcelizer(iconCompatParcelizer);
                return objectAnimatorRemoteActionCompatParcelizer;
            }
        }
        return null;
    }

    private static ObjectAnimator write(ImageView imageView) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) RemoteActionCompatParcelizer, (TypeEvaluator) AudioAttributesImplApi21Parcelizer, (Object[]) new Matrix[]{registerReferrer.write, registerReferrer.write});
    }

    private static ObjectAnimator RemoteActionCompatParcelizer(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) RemoteActionCompatParcelizer, (TypeEvaluator) new Rinteger.RemoteActionCompatParcelizer(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    private static Matrix IconCompatParcelizer(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = AnonymousClass3.write[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return RemoteActionCompatParcelizer(imageView);
            }
            if (i == 2) {
                return AudioAttributesCompatParcelizer(imageView);
            }
            return new Matrix(imageView.getImageMatrix());
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            write = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static Matrix RemoteActionCompatParcelizer(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    private static Matrix AudioAttributesCompatParcelizer(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float fMax = Math.max(width / f, height / f2);
        int iRound = Math.round((width - (f * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    static class IconCompatParcelizer extends AnimatorListenerAdapter implements Transition.RemoteActionCompatParcelizer {
        private final ImageView AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer = true;
        private final Matrix RemoteActionCompatParcelizer;
        private final Matrix write;

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Transition transition) {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(Transition transition) {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void read(Transition transition) {
        }

        IconCompatParcelizer(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.AudioAttributesCompatParcelizer = imageView;
            this.RemoteActionCompatParcelizer = matrix;
            this.write = matrix2;
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            if (this.IconCompatParcelizer) {
                write(this.RemoteActionCompatParcelizer);
            }
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            write();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            this.IconCompatParcelizer = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.IconCompatParcelizer = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            this.IconCompatParcelizer = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.IconCompatParcelizer = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            write((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            write();
        }

        private void write() {
            Matrix matrix = (Matrix) this.AudioAttributesCompatParcelizer.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_image_transform);
            if (matrix != null) {
                AdWordsConversionReporter.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, matrix);
                this.AudioAttributesCompatParcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_image_transform, null);
            }
        }

        private void write(Matrix matrix) {
            this.AudioAttributesCompatParcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_image_transform, matrix);
            AdWordsConversionReporter.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write);
        }
    }
}
