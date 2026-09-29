package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes2.dex */
public final class _methods {
    public static void write(CompoundButton compoundButton, ColorStateList colorStateList) {
        write.write(compoundButton, colorStateList);
    }

    public static ColorStateList write(CompoundButton compoundButton) {
        return write.IconCompatParcelizer(compoundButton);
    }

    public static void RemoteActionCompatParcelizer(CompoundButton compoundButton, PorterDuff.Mode mode) {
        write.RemoteActionCompatParcelizer(compoundButton, mode);
    }

    public static PorterDuff.Mode read(CompoundButton compoundButton) {
        return write.RemoteActionCompatParcelizer(compoundButton);
    }

    public static Drawable IconCompatParcelizer(CompoundButton compoundButton) {
        return AudioAttributesCompatParcelizer.write(compoundButton);
    }

    static class write {
        static void write(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static ColorStateList IconCompatParcelizer(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static void RemoteActionCompatParcelizer(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }

        static PorterDuff.Mode RemoteActionCompatParcelizer(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }
    }

    static class AudioAttributesCompatParcelizer {
        static Drawable write(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }
}
