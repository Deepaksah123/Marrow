package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultConstructor {
    public static void AudioAttributesCompatParcelizer(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        RemoteActionCompatParcelizer.write(checkedTextView, colorStateList);
    }

    public static void read(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        RemoteActionCompatParcelizer.write(checkedTextView, mode);
    }

    @Deprecated
    public static Drawable IconCompatParcelizer(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    static class RemoteActionCompatParcelizer {
        static void write(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void write(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }
}
