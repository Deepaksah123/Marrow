package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin._isBlank;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class _convertIfNonNull {
    private int write = -1;
    private int AudioAttributesCompatParcelizer = -1;
    private int RemoteActionCompatParcelizer = -1;
    private SparseArray<IconCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver = new SparseArray<>();
    private SparseArray<ReferenceTypeDeserializer> IconCompatParcelizer = new SparseArray<>();
    private StackTraceElementDeserializerAdapter read = null;

    public _convertIfNonNull(Context context, XmlPullParser xmlPullParser) {
        write(context, xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = o._isBlank.read.StateSet
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = o._isBlank.read.StateSet_defaultState
            if (r4 != r5) goto L22
            int r5 = r8.write
            int r4 = r0.getResourceId(r4, r5)
            r8.write = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            r0.recycle()
            int r0 = r10.getEventType()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r1 = 0
        L2d:
            r3 = 1
            if (r0 == r3) goto La8
            if (r0 == 0) goto L97
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L47
            if (r0 == r5) goto L3c
            goto L9a
        L3c:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r0 == 0) goto L9a
            return
        L47:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            int r7 = r0.hashCode()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            switch(r7) {
                case 80204913: goto L6e;
                case 1301459538: goto L64;
                case 1382829617: goto L5d;
                case 1901439077: goto L53;
                default: goto L52;
            }     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
        L52:
            goto L78
        L53:
            java.lang.String r3 = "Variant"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r0 == 0) goto L78
            r3 = r5
            goto L79
        L5d:
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r0 == 0) goto L78
            goto L79
        L64:
            java.lang.String r3 = "LayoutDescription"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r0 == 0) goto L78
            r3 = r2
            goto L79
        L6e:
            java.lang.String r3 = "State"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r0 == 0) goto L78
            r3 = r6
            goto L79
        L78:
            r3 = -1
        L79:
            if (r3 == r6) goto L89
            if (r3 == r5) goto L7e
            goto L9a
        L7e:
            o._convertIfNonNull$RemoteActionCompatParcelizer r0 = new o._convertIfNonNull$RemoteActionCompatParcelizer     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            if (r1 == 0) goto L9a
            r1.RemoteActionCompatParcelizer(r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            goto L9a
        L89:
            o._convertIfNonNull$IconCompatParcelizer r0 = new o._convertIfNonNull$IconCompatParcelizer     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            android.util.SparseArray<o._convertIfNonNull$IconCompatParcelizer> r1 = r8.MediaBrowserCompatCustomActionResultReceiver     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            int r3 = r0.RemoteActionCompatParcelizer     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r1.put(r3, r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            r1 = r0
            goto L9a
        L97:
            r10.getName()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
        L9a:
            int r0 = r10.next()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La4
            goto L2d
        L9f:
            r8 = move-exception
            r8.printStackTrace()
            return
        La4:
            r8 = move-exception
            r8.printStackTrace()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._convertIfNonNull.write(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final int read(int i, int i2, int i3) {
        return RemoteActionCompatParcelizer(i, -1.0f, -1.0f);
    }

    public final int RemoteActionCompatParcelizer(int i, int i2, float f, float f2) {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.get(i2);
        if (iconCompatParcelizer == null) {
            return i2;
        }
        if (f == -1.0f || f2 == -1.0f) {
            if (iconCompatParcelizer.read != i) {
                Iterator<RemoteActionCompatParcelizer> it = iconCompatParcelizer.write.iterator();
                while (it.hasNext()) {
                    if (i == it.next().read) {
                    }
                }
                return iconCompatParcelizer.read;
            }
        } else {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer2 : iconCompatParcelizer.write) {
                if (remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer(f, f2)) {
                    if (i != remoteActionCompatParcelizer2.read) {
                        remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                    }
                }
            }
            if (remoteActionCompatParcelizer != null) {
                return remoteActionCompatParcelizer.read;
            }
            return iconCompatParcelizer.read;
        }
        return i;
    }

    private int RemoteActionCompatParcelizer(int i, float f, float f2) {
        IconCompatParcelizer iconCompatParcelizerValueAt;
        int i2;
        if (-1 != i) {
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.get(i);
            if (iconCompatParcelizer == null) {
                return -1;
            }
            int i3 = iconCompatParcelizer.read(f, f2);
            return i3 == -1 ? iconCompatParcelizer.read : iconCompatParcelizer.write.get(i3).read;
        }
        if (i == -1) {
            iconCompatParcelizerValueAt = this.MediaBrowserCompatCustomActionResultReceiver.valueAt(0);
        } else {
            iconCompatParcelizerValueAt = this.MediaBrowserCompatCustomActionResultReceiver.get(this.AudioAttributesCompatParcelizer);
        }
        if (iconCompatParcelizerValueAt == null) {
            return -1;
        }
        if ((this.RemoteActionCompatParcelizer == -1 || !iconCompatParcelizerValueAt.write.get(-1).AudioAttributesCompatParcelizer(f, f2)) && -1 != (i2 = iconCompatParcelizerValueAt.read(f, f2))) {
            return i2 == -1 ? iconCompatParcelizerValueAt.read : iconCompatParcelizerValueAt.write.get(i2).read;
        }
        return -1;
    }

    static class IconCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;
        ArrayList<RemoteActionCompatParcelizer> write = new ArrayList<>();

        public IconCompatParcelizer(Context context, XmlPullParser xmlPullParser) {
            this.read = -1;
            this.AudioAttributesCompatParcelizer = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.State_android_id) {
                    this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, this.RemoteActionCompatParcelizer);
                } else if (index == _isBlank.read.State_constraints) {
                    this.read = typedArrayObtainStyledAttributes.getResourceId(index, this.read);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.read);
                    context.getResources().getResourceName(this.read);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.AudioAttributesCompatParcelizer = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        final void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.write.add(remoteActionCompatParcelizer);
        }

        public final int read(float f, float f2) {
            for (int i = 0; i < this.write.size(); i++) {
                if (this.write.get(i).AudioAttributesCompatParcelizer(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class RemoteActionCompatParcelizer {
        private float AudioAttributesCompatParcelizer;
        private float IconCompatParcelizer;
        private float MediaBrowserCompatItemReceiver;
        private boolean RemoteActionCompatParcelizer;
        int read;
        private float write;

        public RemoteActionCompatParcelizer(Context context, XmlPullParser xmlPullParser) {
            this.MediaBrowserCompatItemReceiver = Float.NaN;
            this.IconCompatParcelizer = Float.NaN;
            this.write = Float.NaN;
            this.AudioAttributesCompatParcelizer = Float.NaN;
            this.read = -1;
            this.RemoteActionCompatParcelizer = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.Variant_constraints) {
                    this.read = typedArrayObtainStyledAttributes.getResourceId(index, this.read);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.read);
                    context.getResources().getResourceName(this.read);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.RemoteActionCompatParcelizer = true;
                    }
                } else if (index == _isBlank.read.Variant_region_heightLessThan) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getDimension(index, this.AudioAttributesCompatParcelizer);
                } else if (index == _isBlank.read.Variant_region_heightMoreThan) {
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimension(index, this.IconCompatParcelizer);
                } else if (index == _isBlank.read.Variant_region_widthLessThan) {
                    this.write = typedArrayObtainStyledAttributes.getDimension(index, this.write);
                } else if (index == _isBlank.read.Variant_region_widthMoreThan) {
                    this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getDimension(index, this.MediaBrowserCompatItemReceiver);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        final boolean AudioAttributesCompatParcelizer(float f, float f2) {
            if (!Float.isNaN(this.MediaBrowserCompatItemReceiver) && f < this.MediaBrowserCompatItemReceiver) {
                return false;
            }
            if (!Float.isNaN(this.IconCompatParcelizer) && f2 < this.IconCompatParcelizer) {
                return false;
            }
            if (Float.isNaN(this.write) || f <= this.write) {
                return Float.isNaN(this.AudioAttributesCompatParcelizer) || f2 <= this.AudioAttributesCompatParcelizer;
            }
            return false;
        }
    }
}
