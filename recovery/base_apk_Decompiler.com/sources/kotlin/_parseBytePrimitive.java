package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseBytePrimitive {
    private static final ThreadLocal<TypedValue> IconCompatParcelizer = new ThreadLocal<>();

    public static ColorStateList write(Resources resources, int i, Resources.Theme theme) {
        try {
            return read(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ColorStateList read(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return RemoteActionCompatParcelizer(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
    }

    public static ColorStateList RemoteActionCompatParcelizer(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid color state list tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        return AudioAttributesCompatParcelizer(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList AudioAttributesCompatParcelizer(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._parseBytePrimitive.AudioAttributesCompatParcelizer(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static boolean RemoteActionCompatParcelizer(Resources resources, int i) {
        TypedValue typedValueIconCompatParcelizer = IconCompatParcelizer();
        resources.getValue(i, typedValueIconCompatParcelizer, true);
        return typedValueIconCompatParcelizer.type >= 28 && typedValueIconCompatParcelizer.type <= 31;
    }

    private static TypedValue IconCompatParcelizer() {
        ThreadLocal<TypedValue> threadLocal = IconCompatParcelizer;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static TypedArray AudioAttributesCompatParcelizer(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static int IconCompatParcelizer(int i, float f, float f2) {
        boolean z = f2 >= BitmapDescriptorFactory.HUE_RED && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int i2 = StdKeyDeserializer.read((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            _parseBooleanFromInt _parsebooleanfromintRemoteActionCompatParcelizer = _parseBooleanFromInt.RemoteActionCompatParcelizer(i);
            i = _parseBooleanFromInt.RemoteActionCompatParcelizer(_parsebooleanfromintRemoteActionCompatParcelizer.read(), _parsebooleanfromintRemoteActionCompatParcelizer.IconCompatParcelizer(), f2);
        }
        return (i & 16777215) | (i2 << 24);
    }
}
