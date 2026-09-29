package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseLongPrimitive {
    public static boolean read(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static float read(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !read(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static boolean read(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !read(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static int read(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !read(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int AudioAttributesCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (read(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static _parseLong RemoteActionCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (read(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return _parseLong.write(typedValue.data);
            }
            _parseLong _parselongAudioAttributesCompatParcelizer = _parseLong.AudioAttributesCompatParcelizer(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (_parselongAudioAttributesCompatParcelizer != null) {
                return _parselongAudioAttributesCompatParcelizer;
            }
        }
        return _parseLong.write(i2);
    }

    public static ColorStateList read(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!read(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        if (typedValue.type == 2) {
            StringBuilder sb = new StringBuilder("Failed to resolve attribute at index ");
            sb.append(i);
            sb.append(": ");
            sb.append(typedValue);
            throw new UnsupportedOperationException(sb.toString());
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return AudioAttributesCompatParcelizer(typedValue);
        }
        return _parseBytePrimitive.write(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
    }

    private static ColorStateList AudioAttributesCompatParcelizer(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static int IconCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (read(xmlPullParser, str)) {
            return typedArray.getResourceId(0, 0);
        }
        return 0;
    }

    public static String RemoteActionCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (read(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static TypedArray write(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
