package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseLong {
    private final Shader RemoteActionCompatParcelizer;
    private int read;
    private final ColorStateList write;

    private _parseLong(Shader shader, ColorStateList colorStateList, int i) {
        this.RemoteActionCompatParcelizer = shader;
        this.write = colorStateList;
        this.read = i;
    }

    static _parseLong read(Shader shader) {
        return new _parseLong(shader, null, 0);
    }

    static _parseLong write(ColorStateList colorStateList) {
        return new _parseLong(null, colorStateList, colorStateList.getDefaultColor());
    }

    static _parseLong write(int i) {
        return new _parseLong(null, null, i);
    }

    public final Shader write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return this.read;
    }

    public final void IconCompatParcelizer(int i) {
        this.read = i;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer != null;
    }

    public final boolean IconCompatParcelizer() {
        ColorStateList colorStateList;
        return this.RemoteActionCompatParcelizer == null && (colorStateList = this.write) != null && colorStateList.isStateful();
    }

    public final boolean AudioAttributesCompatParcelizer(int[] iArr) {
        if (!IconCompatParcelizer()) {
            return false;
        }
        ColorStateList colorStateList = this.write;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.read) {
            return false;
        }
        this.read = colorForState;
        return true;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer() || this.read != 0;
    }

    public static _parseLong AudioAttributesCompatParcelizer(Resources resources, int i, Resources.Theme theme) {
        try {
            return RemoteActionCompatParcelizer(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static _parseLong RemoteActionCompatParcelizer(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return read(_parseIntPrimitive.IconCompatParcelizer(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return write(_parseBytePrimitive.RemoteActionCompatParcelizer(resources, xml, attributeSetAsAttributeSet, theme));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xml.getPositionDescription());
        sb.append(": unsupported complex color tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
}
