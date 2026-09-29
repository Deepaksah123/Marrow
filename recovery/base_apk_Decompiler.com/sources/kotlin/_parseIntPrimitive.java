package kotlin;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.List;
import kotlin._byteOverflow;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
final class _parseIntPrimitive {
    static Shader IconCompatParcelizer(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        TypedArray typedArrayWrite = _parseLongPrimitive.write(resources, theme, attributeSet, _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor);
        float f = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "startX", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_startX, BitmapDescriptorFactory.HUE_RED);
        float f2 = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "startY", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_startY, BitmapDescriptorFactory.HUE_RED);
        float f3 = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "endX", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_endX, BitmapDescriptorFactory.HUE_RED);
        float f4 = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "endY", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_endY, BitmapDescriptorFactory.HUE_RED);
        float f5 = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "centerX", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_centerX, BitmapDescriptorFactory.HUE_RED);
        float f6 = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "centerY", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_centerY, BitmapDescriptorFactory.HUE_RED);
        int i = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "type", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_type, 0);
        int iAudioAttributesCompatParcelizer = _parseLongPrimitive.AudioAttributesCompatParcelizer(typedArrayWrite, xmlPullParser, "startColor", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_startColor);
        boolean z = _parseLongPrimitive.read(xmlPullParser, "centerColor");
        int iAudioAttributesCompatParcelizer2 = _parseLongPrimitive.AudioAttributesCompatParcelizer(typedArrayWrite, xmlPullParser, "centerColor", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_centerColor);
        int iAudioAttributesCompatParcelizer3 = _parseLongPrimitive.AudioAttributesCompatParcelizer(typedArrayWrite, xmlPullParser, "endColor", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_endColor);
        int i2 = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "tileMode", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_tileMode, 0);
        float f7 = _parseLongPrimitive.read(typedArrayWrite, xmlPullParser, "gradientRadius", _byteOverflow.MediaBrowserCompatItemReceiver.GradientColor_android_gradientRadius, BitmapDescriptorFactory.HUE_RED);
        typedArrayWrite.recycle();
        IconCompatParcelizer iconCompatParcelizerWrite = write(RemoteActionCompatParcelizer(resources, xmlPullParser, attributeSet, theme), iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer3, z, iAudioAttributesCompatParcelizer2);
        if (i != 1) {
            if (i == 2) {
                return new SweepGradient(f5, f6, iconCompatParcelizerWrite.IconCompatParcelizer, iconCompatParcelizerWrite.AudioAttributesCompatParcelizer);
            }
            return new LinearGradient(f, f2, f3, f4, iconCompatParcelizerWrite.IconCompatParcelizer, iconCompatParcelizerWrite.AudioAttributesCompatParcelizer, read(i2));
        }
        if (f7 <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        return new RadialGradient(f5, f6, f7, iconCompatParcelizerWrite.IconCompatParcelizer, iconCompatParcelizerWrite.AudioAttributesCompatParcelizer, read(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r4.size() <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        return new o._parseIntPrimitive.IconCompatParcelizer(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o._parseIntPrimitive.IconCompatParcelizer RemoteActionCompatParcelizer(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L83
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L83
        L21:
            r6 = 2
            if (r3 != r6) goto L12
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L12
            int[] r3 = o._byteOverflow.MediaBrowserCompatItemReceiver.GradientColorItem
            android.content.res.TypedArray r3 = kotlin._parseLongPrimitive.write(r8, r11, r10, r3)
            int r5 = o._byteOverflow.MediaBrowserCompatItemReceiver.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = o._byteOverflow.MediaBrowserCompatItemReceiver.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L68
            if (r6 == 0) goto L68
            int r5 = o._byteOverflow.MediaBrowserCompatItemReceiver.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = o._byteOverflow.MediaBrowserCompatItemReceiver.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L68:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r9 = r9.getPositionDescription()
            r8.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r10.<init>(r8)
            throw r10
        L83:
            int r8 = r4.size()
            if (r8 <= 0) goto L8f
            o._parseIntPrimitive$IconCompatParcelizer r8 = new o._parseIntPrimitive$IconCompatParcelizer
            r8.<init>(r4, r2)
            return r8
        L8f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._parseIntPrimitive.RemoteActionCompatParcelizer(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o._parseIntPrimitive$IconCompatParcelizer");
    }

    private static IconCompatParcelizer write(IconCompatParcelizer iconCompatParcelizer, int i, int i2, boolean z, int i3) {
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer;
        }
        if (z) {
            return new IconCompatParcelizer(i, i3, i2);
        }
        return new IconCompatParcelizer(i, i2);
    }

    private static Shader.TileMode read(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.CLAMP;
    }

    static final class IconCompatParcelizer {
        final float[] AudioAttributesCompatParcelizer;
        final int[] IconCompatParcelizer;

        IconCompatParcelizer(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.IconCompatParcelizer = new int[size];
            this.AudioAttributesCompatParcelizer = new float[size];
            for (int i = 0; i < size; i++) {
                this.IconCompatParcelizer[i] = list.get(i).intValue();
                this.AudioAttributesCompatParcelizer[i] = list2.get(i).floatValue();
            }
        }

        IconCompatParcelizer(int i, int i2) {
            this.IconCompatParcelizer = new int[]{i, i2};
            this.AudioAttributesCompatParcelizer = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        }

        IconCompatParcelizer(int i, int i2, int i3) {
            this.IconCompatParcelizer = new int[]{i, i2, i3};
            this.AudioAttributesCompatParcelizer = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        }
    }
}
