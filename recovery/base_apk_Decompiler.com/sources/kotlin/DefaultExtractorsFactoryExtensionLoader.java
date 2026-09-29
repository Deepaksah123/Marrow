package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultExtractorsFactoryExtensionLoader {
    public static void RemoteActionCompatParcelizer(Drawable drawable, int i) {
        if (i != 0) {
            findFormatOverrides.AudioAttributesCompatParcelizer(drawable, i);
        } else {
            findFormatOverrides.AudioAttributesCompatParcelizer(drawable, (ColorStateList) null);
        }
    }

    public static PorterDuffColorFilter read(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static AttributeSet write(Context context, int i, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!TextUtils.equals(xml.getName(), charSequence)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Must have a <");
                sb.append((Object) charSequence);
                sb.append("> start tag");
                throw new XmlPullParserException(sb.toString());
            }
            return Xml.asAttributeSet(xml);
        } catch (IOException | XmlPullParserException e) {
            StringBuilder sb2 = new StringBuilder("Can't load badge resource ID #0x");
            sb2.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb2.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    public static void RemoteActionCompatParcelizer(RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    public static Drawable RemoteActionCompatParcelizer(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return AudioAttributesCompatParcelizer(drawable, colorStateList, mode);
    }

    public static Drawable IconCompatParcelizer(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return AudioAttributesCompatParcelizer(drawable, colorStateList, mode);
    }

    private static Drawable AudioAttributesCompatParcelizer(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
            if (mode != null) {
                findFormatOverrides.read(drawable, mode);
            }
        }
        return drawable;
    }

    public static Drawable read(Drawable drawable, Drawable drawable2) {
        return write(drawable, drawable2, -1, -1);
    }

    public static Drawable write(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1) {
            i = AudioAttributesCompatParcelizer(drawable, drawable2);
        }
        if (i2 == -1) {
            i2 = write(drawable, drawable2);
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    private static int AudioAttributesCompatParcelizer(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    private static int write(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    public static int[] write(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static int[] AudioAttributesCompatParcelizer(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    public static void RemoteActionCompatParcelizer(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static ColorStateList IconCompatParcelizer(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }
}
