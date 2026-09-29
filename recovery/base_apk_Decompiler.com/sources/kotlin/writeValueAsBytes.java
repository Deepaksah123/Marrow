package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aW\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0018\u001aW\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0018\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\t\u0010\u001a\u001a#\u0010\t\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u001b"}, d2 = {"", "p0", "p1", "Lo/addBeanDeserializerModifier;", "p2", "Lo/appendAnnotationIntrospector;", "IconCompatParcelizer", "(IILo/addBeanDeserializerModifier;)Lo/appendAnnotationIntrospector;", "", "read", "(Lo/appendAnnotationIntrospector;Lo/addBeanDeserializerModifier;)V", "write", "(IILo/addBeanDeserializerModifier;)V", "p3", "p4", "Lo/KeyDeserializerNone;", "p5", "p6", "", "p7", "", "RemoteActionCompatParcelizer", "(IIIILo/addBeanDeserializerModifier;[I[I[I)Z", "p8", "(IIIILo/addBeanDeserializerModifier;[I[II[I)Z", "AudioAttributesCompatParcelizer", "(IIIIZ[I)V", "([III)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeValueAsBytes {
    private static final appendAnnotationIntrospector IconCompatParcelizer(int i, int i2, addBeanDeserializerModifier addbeandeserializermodifier) {
        int i3 = ((i + i2) + 1) / 2;
        appendAnnotationIntrospector appendannotationintrospector = new appendAnnotationIntrospector(i3 * 3);
        appendAnnotationIntrospector appendannotationintrospector2 = new appendAnnotationIntrospector(i3 << 2);
        appendannotationintrospector2.IconCompatParcelizer(0, i, 0, i2);
        int i4 = (i3 << 1) + 1;
        int[] iArrIconCompatParcelizer = KeyDeserializerNone.IconCompatParcelizer(new int[i4]);
        int[] iArrIconCompatParcelizer2 = KeyDeserializerNone.IconCompatParcelizer(new int[i4]);
        int[] iArr = createForDefaults.read(new int[5]);
        while (appendannotationintrospector2.AudioAttributesCompatParcelizer()) {
            int i5 = appendannotationintrospector2.read();
            int i6 = appendannotationintrospector2.read();
            int i7 = appendannotationintrospector2.read();
            int i8 = appendannotationintrospector2.read();
            int[] iArr2 = iArr;
            if (RemoteActionCompatParcelizer(i8, i7, i6, i5, addbeandeserializermodifier, iArrIconCompatParcelizer, iArrIconCompatParcelizer2, iArr2)) {
                if (Math.min(iArr2[2] - iArr2[0], iArr2[3] - iArr2[1]) > 0) {
                    createForDefaults.AudioAttributesCompatParcelizer(iArr2, appendannotationintrospector);
                }
                appendannotationintrospector2.IconCompatParcelizer(i8, iArr2[0], i6, iArr2[1]);
                appendannotationintrospector2.IconCompatParcelizer(iArr2[2], i7, iArr2[3], i5);
                iArr = iArr2;
            } else {
                iArr = iArr2;
            }
        }
        appendannotationintrospector.write();
        appendannotationintrospector.AudioAttributesCompatParcelizer(i, i2, 0);
        return appendannotationintrospector;
    }

    private static final void read(appendAnnotationIntrospector appendannotationintrospector, addBeanDeserializerModifier addbeandeserializermodifier) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < appendannotationintrospector.RemoteActionCompatParcelizer()) {
            int iAudioAttributesCompatParcelizer = appendannotationintrospector.AudioAttributesCompatParcelizer(i);
            int i4 = i + 2;
            int iAudioAttributesCompatParcelizer2 = appendannotationintrospector.AudioAttributesCompatParcelizer(i4);
            int iAudioAttributesCompatParcelizer3 = appendannotationintrospector.AudioAttributesCompatParcelizer(i + 1);
            int iAudioAttributesCompatParcelizer4 = appendannotationintrospector.AudioAttributesCompatParcelizer(i4);
            i += 3;
            while (i3 < iAudioAttributesCompatParcelizer - iAudioAttributesCompatParcelizer2) {
                addbeandeserializermodifier.read(i2, i3);
                i3++;
            }
            while (i2 < iAudioAttributesCompatParcelizer3 - iAudioAttributesCompatParcelizer4) {
                addbeandeserializermodifier.AudioAttributesCompatParcelizer(i2);
                i2++;
            }
            for (int iAudioAttributesCompatParcelizer5 = appendannotationintrospector.AudioAttributesCompatParcelizer(i4); iAudioAttributesCompatParcelizer5 > 0; iAudioAttributesCompatParcelizer5--) {
                addbeandeserializermodifier.AudioAttributesCompatParcelizer(i3, i2);
                i3++;
                i2++;
            }
        }
    }

    public static final void write(int i, int i2, addBeanDeserializerModifier addbeandeserializermodifier) {
        read(IconCompatParcelizer(i, i2, addbeandeserializermodifier), addbeandeserializermodifier);
    }

    private static final boolean RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, addBeanDeserializerModifier addbeandeserializermodifier, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 > 0 && i6 > 0) {
            int i7 = ((i5 + i6) + 1) / 2;
            KeyDeserializerNone.RemoteActionCompatParcelizer(iArr, 1, i);
            KeyDeserializerNone.RemoteActionCompatParcelizer(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (RemoteActionCompatParcelizer(i, i2, i3, i4, addbeandeserializermodifier, iArr, iArr2, i8, iArr3) || AudioAttributesCompatParcelizer(i, i2, i3, i4, addbeandeserializermodifier, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    private static final boolean RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, addBeanDeserializerModifier addbeandeserializermodifier, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iWrite;
        int i6;
        int i7 = i2;
        int i8 = (i7 - i) - (i4 - i3);
        int i9 = 1;
        boolean z = (Math.abs(i8) & 1) == 1;
        int i10 = -i5;
        int i11 = i10;
        while (i11 <= i5) {
            if (i11 == i10 || (i11 != i5 && KeyDeserializerNone.write(iArr, i11 + 1) > KeyDeserializerNone.write(iArr, i11 - 1))) {
                iWrite = KeyDeserializerNone.write(iArr, i11 + 1);
                i6 = iWrite;
            } else {
                iWrite = KeyDeserializerNone.write(iArr, i11 - 1);
                i6 = iWrite + 1;
            }
            int i12 = (i3 + (i6 - i)) - i11;
            int i13 = i5 != 0 ? i9 : 0;
            int i14 = i6 == iWrite ? i9 : 0;
            int i15 = i12;
            while (i6 < i7 && i15 < i4) {
                if (!addbeandeserializermodifier.RemoteActionCompatParcelizer(i6, i15)) {
                    break;
                }
                i6++;
                i15++;
            }
            KeyDeserializerNone.RemoteActionCompatParcelizer(iArr, i11, i6);
            if (z) {
                int i16 = i8 - i11;
                if (i16 >= i10 + 1 && i16 <= i5 - 1) {
                    if (KeyDeserializerNone.write(iArr2, i16) <= i6) {
                        read(iWrite, i12 - (i13 & i14), i6, i15, false, iArr3);
                        return true;
                    }
                }
                i9 = 1;
            }
            i11 += 2;
            i7 = i2;
        }
        return false;
    }

    private static final boolean AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, addBeanDeserializerModifier addbeandeserializermodifier, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iWrite;
        int i6;
        int i7;
        int i8 = i;
        int i9 = (i2 - i8) - (i4 - i3);
        boolean z = (i9 & 1) == 0;
        int i10 = -i5;
        int i11 = i10;
        while (i11 <= i5) {
            if (i11 == i10 || (i11 != i5 && KeyDeserializerNone.write(iArr2, i11 + 1) < KeyDeserializerNone.write(iArr2, i11 - 1))) {
                iWrite = KeyDeserializerNone.write(iArr2, i11 + 1);
                i6 = iWrite;
            } else {
                iWrite = KeyDeserializerNone.write(iArr2, i11 - 1);
                i6 = iWrite - 1;
            }
            int i12 = i4 - ((i2 - i6) - i11);
            int i13 = i5 != 0 ? 1 : 0;
            int i14 = i6 == iWrite ? 1 : 0;
            int i15 = i12;
            while (i6 > i8 && i15 > i3) {
                if (!addbeandeserializermodifier.RemoteActionCompatParcelizer(i6 - 1, i15 - 1)) {
                    break;
                }
                i6--;
                i15--;
                i8 = i;
            }
            KeyDeserializerNone.RemoteActionCompatParcelizer(iArr2, i11, i6);
            if (z && (i7 = i9 - i11) >= i10 && i7 <= i5) {
                if (KeyDeserializerNone.write(iArr, i7) >= i6) {
                    read(i6, i15, iWrite, (i13 & i14) + i12, true, iArr3);
                    return true;
                }
            }
            i11 += 2;
            i8 = i;
        }
        return false;
    }

    public static final void read(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
