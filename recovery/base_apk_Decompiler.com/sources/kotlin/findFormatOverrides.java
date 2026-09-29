package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class findFormatOverrides {
    public static Drawable AudioAttributesImplApi26Parcelizer(Drawable drawable) {
        return drawable;
    }

    @Deprecated
    public static void AudioAttributesImplBaseParcelizer(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @Deprecated
    public static void read(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    @Deprecated
    public static boolean MediaBrowserCompatItemReceiver(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void AudioAttributesCompatParcelizer(Drawable drawable, float f, float f2) {
        AudioAttributesCompatParcelizer.IconCompatParcelizer(drawable, f, f2);
    }

    public static void write(Drawable drawable, int i, int i2, int i3, int i4) {
        AudioAttributesCompatParcelizer.IconCompatParcelizer(drawable, i, i2, i3, i4);
    }

    public static void AudioAttributesCompatParcelizer(Drawable drawable, int i) {
        AudioAttributesCompatParcelizer.read(drawable, i);
    }

    public static void AudioAttributesCompatParcelizer(Drawable drawable, ColorStateList colorStateList) {
        AudioAttributesCompatParcelizer.write(drawable, colorStateList);
    }

    public static void read(Drawable drawable, PorterDuff.Mode mode) {
        AudioAttributesCompatParcelizer.read(drawable, mode);
    }

    @Deprecated
    public static int RemoteActionCompatParcelizer(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void read(Drawable drawable, Resources.Theme theme) {
        AudioAttributesCompatParcelizer.write(drawable, theme);
    }

    public static boolean AudioAttributesCompatParcelizer(Drawable drawable) {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(drawable);
    }

    public static ColorFilter read(Drawable drawable) {
        return AudioAttributesCompatParcelizer.IconCompatParcelizer(drawable);
    }

    public static void IconCompatParcelizer(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static void RemoteActionCompatParcelizer(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T AudioAttributesImplApi21Parcelizer(Drawable drawable) {
        return drawable instanceof isDefaultDeserializer ? (T) ((isDefaultDeserializer) drawable).IconCompatParcelizer() : drawable;
    }

    public static boolean RemoteActionCompatParcelizer(Drawable drawable, int i) {
        return read.RemoteActionCompatParcelizer(drawable, i);
    }

    public static int write(Drawable drawable) {
        return read.IconCompatParcelizer(drawable);
    }

    static class AudioAttributesCompatParcelizer {
        static void IconCompatParcelizer(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        static void read(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        static void write(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void read(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        static void write(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean AudioAttributesCompatParcelizer(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter IconCompatParcelizer(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void RemoteActionCompatParcelizer(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void IconCompatParcelizer(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    static class read {
        static boolean RemoteActionCompatParcelizer(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }

        static int IconCompatParcelizer(Drawable drawable) {
            return drawable.getLayoutDirection();
        }
    }
}
