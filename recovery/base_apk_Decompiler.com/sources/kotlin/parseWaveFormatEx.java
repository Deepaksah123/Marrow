package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class parseWaveFormatEx {
    static void IconCompatParcelizer(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        write(checkableImageButton, onLongClickListener);
    }

    static void RemoteActionCompatParcelizer(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        write(checkableImageButton, onLongClickListener);
    }

    private static void write(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zOnPrepareFromMediaId = InvalidTypeIdException.onPrepareFromMediaId(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zOnPrepareFromMediaId || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zOnPrepareFromMediaId);
        checkableImageButton.setPressable(zOnPrepareFromMediaId);
        checkableImageButton.setLongClickable(z);
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(checkableImageButton, z2 ? 1 : 2);
    }

    static void write(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable, ColorStateList.valueOf(colorStateList.getColorForState(AudioAttributesCompatParcelizer(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable, colorStateList);
            }
            if (mode != null) {
                findFormatOverrides.read(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static void read(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(AudioAttributesCompatParcelizer(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
        findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    private static int[] AudioAttributesCompatParcelizer(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void read(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    static void IconCompatParcelizer(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    static ImageView.ScaleType IconCompatParcelizer(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i == 5) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i == 6) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER;
    }
}
