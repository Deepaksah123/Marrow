package kotlin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class Rinteger {
    private static final boolean RemoteActionCompatParcelizer = true;

    public static View read(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        ab.IconCompatParcelizer(view, matrix);
        ab.AudioAttributesCompatParcelizer(viewGroup, matrix);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapIconCompatParcelizer = IconCompatParcelizer(view, matrix, rectF, viewGroup);
        if (bitmapIconCompatParcelizer != null) {
            imageView.setImageBitmap(bitmapIconCompatParcelizer);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    private static Bitmap IconCompatParcelizer(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        int i = 0;
        boolean z = viewGroup != null && viewGroup.isAttachedToWindow();
        Bitmap bitmapCreateBitmap = null;
        if (zIsAttachedToWindow) {
            viewGroup2 = null;
        } else {
            if (!z) {
                return null;
            }
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            int iIndexOfChild = viewGroup3.indexOfChild(view);
            InvalidTypeIdException.write(viewGroup, view);
            viewGroup2 = viewGroup3;
            i = iIndexOfChild;
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (RemoteActionCompatParcelizer) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = write.write(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (!zIsAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmapCreateBitmap;
    }

    public static Animator write(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class RemoteActionCompatParcelizer implements TypeEvaluator<Matrix> {
        final float[] read = new float[9];
        final float[] IconCompatParcelizer = new float[9];
        final Matrix RemoteActionCompatParcelizer = new Matrix();

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.read);
            matrix2.getValues(this.IconCompatParcelizer);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.IconCompatParcelizer;
                float f2 = fArr[i];
                float f3 = this.read[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.RemoteActionCompatParcelizer.setValues(this.IconCompatParcelizer);
            return this.RemoteActionCompatParcelizer;
        }
    }

    static class write {
        static Bitmap write(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }
}
