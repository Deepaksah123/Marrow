package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class emptyMap {
    public static MenuItem RemoteActionCompatParcelizer(MenuItem menuItem, ThrowableDeserializer throwableDeserializer) {
        return menuItem instanceof handleMissingEndArrayForSingle ? ((handleMissingEndArrayForSingle) menuItem).AudioAttributesCompatParcelizer(throwableDeserializer) : menuItem;
    }

    public static void AudioAttributesCompatParcelizer(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof handleMissingEndArrayForSingle) {
            ((handleMissingEndArrayForSingle) menuItem).setContentDescription(charSequence);
        } else {
            IconCompatParcelizer.write(menuItem, charSequence);
        }
    }

    public static void write(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof handleMissingEndArrayForSingle) {
            ((handleMissingEndArrayForSingle) menuItem).setTooltipText(charSequence);
        } else {
            IconCompatParcelizer.read(menuItem, charSequence);
        }
    }

    public static void write(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof handleMissingEndArrayForSingle) {
            ((handleMissingEndArrayForSingle) menuItem).setNumericShortcut(c, i);
        } else {
            IconCompatParcelizer.IconCompatParcelizer(menuItem, c, i);
        }
    }

    public static void IconCompatParcelizer(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof handleMissingEndArrayForSingle) {
            ((handleMissingEndArrayForSingle) menuItem).setAlphabeticShortcut(c, i);
        } else {
            IconCompatParcelizer.AudioAttributesCompatParcelizer(menuItem, c, i);
        }
    }

    public static void write(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof handleMissingEndArrayForSingle) {
            ((handleMissingEndArrayForSingle) menuItem).setIconTintList(colorStateList);
        } else {
            IconCompatParcelizer.write(menuItem, colorStateList);
        }
    }

    public static void read(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof handleMissingEndArrayForSingle) {
            ((handleMissingEndArrayForSingle) menuItem).setIconTintMode(mode);
        } else {
            IconCompatParcelizer.read(menuItem, mode);
        }
    }

    static class IconCompatParcelizer {
        static MenuItem write(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem read(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        static MenuItem IconCompatParcelizer(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        static MenuItem AudioAttributesCompatParcelizer(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        static MenuItem write(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem read(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }
    }
}
