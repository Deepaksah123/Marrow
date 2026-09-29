package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import kotlin._isBlank;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class StdDelegatingDeserializer {
    private final ConstraintLayout IconCompatParcelizer;
    private ReferenceTypeDeserializer MediaBrowserCompatItemReceiver;
    private int write = -1;
    private int AudioAttributesCompatParcelizer = -1;
    private SparseArray<AudioAttributesCompatParcelizer> AudioAttributesImplApi26Parcelizer = new SparseArray<>();
    private SparseArray<ReferenceTypeDeserializer> read = new SparseArray<>();
    private StackTraceElementDeserializerAdapter RemoteActionCompatParcelizer = null;

    public StdDelegatingDeserializer(Context context, ConstraintLayout constraintLayout, int i) {
        this.IconCompatParcelizer = constraintLayout;
        IconCompatParcelizer(context, i);
    }

    public final void IconCompatParcelizer(int i, float f, float f2) {
        ReferenceTypeDeserializer referenceTypeDeserializer;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerValueAt;
        int i2;
        ReferenceTypeDeserializer referenceTypeDeserializer2;
        int i3 = this.write;
        if (i3 == i) {
            if (i == -1) {
                audioAttributesCompatParcelizerValueAt = this.AudioAttributesImplApi26Parcelizer.valueAt(0);
            } else {
                audioAttributesCompatParcelizerValueAt = this.AudioAttributesImplApi26Parcelizer.get(i3);
            }
            if ((this.AudioAttributesCompatParcelizer == -1 || !audioAttributesCompatParcelizerValueAt.write.get(this.AudioAttributesCompatParcelizer).read(f, f2)) && this.AudioAttributesCompatParcelizer != (i2 = audioAttributesCompatParcelizerValueAt.read(f, f2))) {
                if (i2 == -1) {
                    referenceTypeDeserializer2 = this.MediaBrowserCompatItemReceiver;
                } else {
                    referenceTypeDeserializer2 = audioAttributesCompatParcelizerValueAt.write.get(i2).RemoteActionCompatParcelizer;
                }
                if (i2 == -1) {
                    int i4 = audioAttributesCompatParcelizerValueAt.read;
                } else {
                    int i5 = audioAttributesCompatParcelizerValueAt.write.get(i2).IconCompatParcelizer;
                }
                if (referenceTypeDeserializer2 != null) {
                    this.AudioAttributesCompatParcelizer = i2;
                    referenceTypeDeserializer2.write(this.IconCompatParcelizer);
                    return;
                }
                return;
            }
            return;
        }
        this.write = i;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(i);
        int i6 = audioAttributesCompatParcelizer.read(f, f2);
        if (i6 == -1) {
            referenceTypeDeserializer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        } else {
            referenceTypeDeserializer = audioAttributesCompatParcelizer.write.get(i6).RemoteActionCompatParcelizer;
        }
        if (i6 == -1) {
            int i7 = audioAttributesCompatParcelizer.read;
        } else {
            int i8 = audioAttributesCompatParcelizer.write.get(i6).IconCompatParcelizer;
        }
        if (referenceTypeDeserializer == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer = i6;
        referenceTypeDeserializer.write(this.IconCompatParcelizer);
    }

    public final void write(StackTraceElementDeserializerAdapter stackTraceElementDeserializerAdapter) {
        this.RemoteActionCompatParcelizer = stackTraceElementDeserializerAdapter;
    }

    static class AudioAttributesCompatParcelizer {
        int AudioAttributesCompatParcelizer;
        ReferenceTypeDeserializer RemoteActionCompatParcelizer;
        int read;
        ArrayList<write> write = new ArrayList<>();

        public AudioAttributesCompatParcelizer(Context context, XmlPullParser xmlPullParser) {
            this.read = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.State_android_id) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, this.AudioAttributesCompatParcelizer);
                } else if (index == _isBlank.read.State_constraints) {
                    this.read = typedArrayObtainStyledAttributes.getResourceId(index, this.read);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.read);
                    context.getResources().getResourceName(this.read);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
                        this.RemoteActionCompatParcelizer = referenceTypeDeserializer;
                        referenceTypeDeserializer.RemoteActionCompatParcelizer(context, this.read);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        final void IconCompatParcelizer(write writeVar) {
            this.write.add(writeVar);
        }

        public final int read(float f, float f2) {
            for (int i = 0; i < this.write.size(); i++) {
                if (this.write.get(i).read(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class write {
        private float AudioAttributesCompatParcelizer;
        private float AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        ReferenceTypeDeserializer RemoteActionCompatParcelizer;
        private float read;
        private float write;

        public write(Context context, XmlPullParser xmlPullParser) {
            this.AudioAttributesImplBaseParcelizer = Float.NaN;
            this.AudioAttributesCompatParcelizer = Float.NaN;
            this.read = Float.NaN;
            this.write = Float.NaN;
            this.IconCompatParcelizer = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.Variant_constraints) {
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, this.IconCompatParcelizer);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.IconCompatParcelizer);
                    context.getResources().getResourceName(this.IconCompatParcelizer);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
                        this.RemoteActionCompatParcelizer = referenceTypeDeserializer;
                        referenceTypeDeserializer.RemoteActionCompatParcelizer(context, this.IconCompatParcelizer);
                    }
                } else if (index == _isBlank.read.Variant_region_heightLessThan) {
                    this.write = typedArrayObtainStyledAttributes.getDimension(index, this.write);
                } else if (index == _isBlank.read.Variant_region_heightMoreThan) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getDimension(index, this.AudioAttributesCompatParcelizer);
                } else if (index == _isBlank.read.Variant_region_widthLessThan) {
                    this.read = typedArrayObtainStyledAttributes.getDimension(index, this.read);
                } else if (index == _isBlank.read.Variant_region_widthMoreThan) {
                    this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getDimension(index, this.AudioAttributesImplBaseParcelizer);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        final boolean read(float f, float f2) {
            if (!Float.isNaN(this.AudioAttributesImplBaseParcelizer) && f < this.AudioAttributesImplBaseParcelizer) {
                return false;
            }
            if (!Float.isNaN(this.AudioAttributesCompatParcelizer) && f2 < this.AudioAttributesCompatParcelizer) {
                return false;
            }
            if (Float.isNaN(this.read) || f <= this.read) {
                return Float.isNaN(this.write) || f2 <= this.write;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L8c
            if (r0 == 0) goto L7b
            r3 = 2
            if (r0 == r3) goto L17
            goto L7e
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r5 = 3
            r6 = 4
            switch(r4) {
                case -1349929691: goto L4c;
                case 80204913: goto L42;
                case 1382829617: goto L39;
                case 1657696882: goto L2f;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        L24:
            goto L56
        L25:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r0 == 0) goto L56
            r2 = r5
            goto L57
        L2f:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r0 == 0) goto L56
            r2 = 0
            goto L57
        L39:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r0 == 0) goto L56
            goto L57
        L42:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r0 == 0) goto L56
            r2 = r3
            goto L57
        L4c:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r0 == 0) goto L56
            r2 = r6
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == r3) goto L6d
            if (r2 == r5) goto L62
            if (r2 == r6) goto L5e
            goto L7e
        L5e:
            r7.IconCompatParcelizer(r8, r9)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L62:
            o.StdDelegatingDeserializer$write r0 = new o.StdDelegatingDeserializer$write     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L7e
            r1.IconCompatParcelizer(r0)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L6d:
            o.StdDelegatingDeserializer$AudioAttributesCompatParcelizer r0 = new o.StdDelegatingDeserializer$AudioAttributesCompatParcelizer     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            android.util.SparseArray<o.StdDelegatingDeserializer$AudioAttributesCompatParcelizer> r1 = r7.AudioAttributesImplApi26Parcelizer     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            int r2 = r0.AudioAttributesCompatParcelizer     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1.put(r2, r0)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1 = r0
            goto L7e
        L7b:
            r9.getName()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        L7e:
            int r0 = r9.next()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto Ld
        L83:
            r7 = move-exception
            r7.printStackTrace()
            return
        L88:
            r7 = move-exception
            r7.printStackTrace()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StdDelegatingDeserializer.IconCompatParcelizer(android.content.Context, int):void");
    }

    private void IconCompatParcelizer(Context context, XmlPullParser xmlPullParser) {
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                referenceTypeDeserializer.RemoteActionCompatParcelizer(context, xmlPullParser);
                this.read.put(identifier, referenceTypeDeserializer);
                return;
            }
        }
    }
}
