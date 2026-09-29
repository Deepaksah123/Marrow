package kotlin;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u001aJ\u0015\u0010\b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0014\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010&"}, d2 = {"Lo/addIgnorable;", "", "Landroid/text/Layout;", "p0", "<init>", "(Landroid/text/Layout;)V", "", "Ljava/text/Bidi;", "IconCompatParcelizer", "(I)Ljava/text/Bidi;", "", "p1", "RemoteActionCompatParcelizer", "(IZ)I", "(I)I", "read", "(I)Z", "p2", "", "(IZZ)F", "write", "(IZ)F", "AudioAttributesCompatParcelizer", "(II)I", "", "Lo/addIgnorable$IconCompatParcelizer;", "(I)[Lo/addIgnorable$IconCompatParcelizer;", "", "(C)Z", "Landroid/text/Layout;", "", "Ljava/util/List;", "", "", "[Z", "", "AudioAttributesImplApi21Parcelizer", "[C", "I", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addIgnorable {
    private final List<Bidi> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private char[] read;
    private final Layout IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean[] write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<Integer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    public addIgnorable(Layout layout) {
        this.IconCompatParcelizer = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(this.IconCompatParcelizer.getText(), '\n', length, false, 4);
            length = iIconCompatParcelizer < 0 ? this.IconCompatParcelizer.getText().length() : iIconCompatParcelizer + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.IconCompatParcelizer.getText().length());
        this.RemoteActionCompatParcelizer = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.AudioAttributesCompatParcelizer = arrayList2;
        this.write = new boolean[this.RemoteActionCompatParcelizer.size()];
        this.AudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi IconCompatParcelizer(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.write
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r11 = r11.AudioAttributesCompatParcelizer
            java.lang.Object r11 = r11.get(r12)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.RemoteActionCompatParcelizer
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.RemoteActionCompatParcelizer
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.read
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.IconCompatParcelizer
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            boolean r9 = r11.read(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L60
        L5f:
            r0 = r1
        L60:
            java.util.List<java.text.Bidi> r3 = r11.AudioAttributesCompatParcelizer
            r3.set(r12, r0)
            boolean[] r3 = r11.write
            r3[r12] = r2
            if (r0 == 0) goto L72
            char[] r12 = r11.read
            if (r10 != r12) goto L71
            r10 = r1
            goto L72
        L71:
            r10 = r12
        L72:
            r11.read = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addIgnorable.IconCompatParcelizer(int):java.text.Bidi");
    }

    public static /* synthetic */ int RemoteActionCompatParcelizer$default(addIgnorable addignorable, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return addignorable.RemoteActionCompatParcelizer(i, z);
    }

    public final int RemoteActionCompatParcelizer(int p0, boolean p1) {
        List<Integer> list = this.RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(list, Integer.valueOf(p0), 0, list.size());
        int i = iRemoteActionCompatParcelizer < 0 ? -(iRemoteActionCompatParcelizer + 1) : iRemoteActionCompatParcelizer + 1;
        if (p1 && i > 0) {
            int i2 = i - 1;
            if (p0 == this.RemoteActionCompatParcelizer.get(i2).intValue()) {
                return i2;
            }
        }
        return i;
    }

    public final int RemoteActionCompatParcelizer(int p0) {
        if (p0 == 0) {
            return 0;
        }
        return this.RemoteActionCompatParcelizer.get(p0 - 1).intValue();
    }

    public final boolean read(int p0) {
        return this.IconCompatParcelizer.getParagraphDirection(this.IconCompatParcelizer.getLineForOffset(RemoteActionCompatParcelizer(p0))) == -1;
    }

    public final float IconCompatParcelizer(int p0, boolean p1, boolean p2) {
        int iAudioAttributesCompatParcelizer = p0;
        if (!p2) {
            return IconCompatParcelizer(p0, p1);
        }
        int iWrite = addInjectable.write(this.IconCompatParcelizer, iAudioAttributesCompatParcelizer, p2);
        int lineStart = this.IconCompatParcelizer.getLineStart(iWrite);
        int lineEnd = this.IconCompatParcelizer.getLineEnd(iWrite);
        if (iAudioAttributesCompatParcelizer != lineStart && iAudioAttributesCompatParcelizer != lineEnd) {
            return IconCompatParcelizer(p0, p1);
        }
        if (iAudioAttributesCompatParcelizer == 0 || iAudioAttributesCompatParcelizer == this.IconCompatParcelizer.getText().length()) {
            return IconCompatParcelizer(p0, p1);
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, p2);
        boolean z = read(iRemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(lineEnd, lineStart);
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
        Bidi bidiIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
        Bidi bidiCreateLineBidi = bidiIconCompatParcelizer != null ? bidiIconCompatParcelizer.createLineBidi(lineStart - iRemoteActionCompatParcelizer2, iAudioAttributesCompatParcelizer2 - iRemoteActionCompatParcelizer2) : null;
        boolean z2 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.IconCompatParcelizer.isRtlCharAt(lineStart);
            if (p1 || z == zIsRtlCharAt) {
                z = !z;
            }
            if (iAudioAttributesCompatParcelizer == lineStart) {
                z2 = z;
            } else if (!z) {
                z2 = true;
            }
            Layout layout = this.IconCompatParcelizer;
            return z2 ? layout.getLineLeft(iWrite) : layout.getLineRight(iWrite);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        IconCompatParcelizer[] iconCompatParcelizerArr = new IconCompatParcelizer[runCount];
        for (int i = 0; i < runCount; i++) {
            iconCompatParcelizerArr[i] = new IconCompatParcelizer(bidiCreateLineBidi.getRunStart(i) + lineStart, bidiCreateLineBidi.getRunLimit(i) + lineStart, bidiCreateLineBidi.getRunLevel(i) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i2 = 0; i2 < runCount2; i2++) {
            bArr[i2] = (byte) bidiCreateLineBidi.getRunLevel(i2);
        }
        Bidi.reorderVisually(bArr, 0, iconCompatParcelizerArr, 0, runCount);
        int i3 = -1;
        if (iAudioAttributesCompatParcelizer == lineStart) {
            int i4 = 0;
            while (true) {
                if (i4 >= runCount) {
                    break;
                }
                if (iconCompatParcelizerArr[i4].getRemoteActionCompatParcelizer() == iAudioAttributesCompatParcelizer) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[i3];
            if (p1 || z == iconCompatParcelizer.getWrite()) {
                z = !z;
            }
            if (i3 == 0 && z) {
                return this.IconCompatParcelizer.getLineLeft(iWrite);
            }
            if (i3 == getOrderDetails.MediaDescriptionCompat(iconCompatParcelizerArr) && !z) {
                return this.IconCompatParcelizer.getLineRight(iWrite);
            }
            if (z) {
                return this.IconCompatParcelizer.getPrimaryHorizontal(iconCompatParcelizerArr[i3 - 1].getRemoteActionCompatParcelizer());
            }
            return this.IconCompatParcelizer.getPrimaryHorizontal(iconCompatParcelizerArr[i3 + 1].getRemoteActionCompatParcelizer());
        }
        if (iAudioAttributesCompatParcelizer > iAudioAttributesCompatParcelizer2) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, lineStart);
        }
        int i5 = 0;
        while (true) {
            if (i5 >= runCount) {
                break;
            }
            if (iconCompatParcelizerArr[i5].getRead() == iAudioAttributesCompatParcelizer) {
                i3 = i5;
                break;
            }
            i5++;
        }
        IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizerArr[i3];
        if (!p1 && z != iconCompatParcelizer2.getWrite()) {
            z = !z;
        }
        if (i3 == 0 && z) {
            return this.IconCompatParcelizer.getLineLeft(iWrite);
        }
        if (i3 == getOrderDetails.MediaDescriptionCompat(iconCompatParcelizerArr) && !z) {
            return this.IconCompatParcelizer.getLineRight(iWrite);
        }
        if (z) {
            return this.IconCompatParcelizer.getPrimaryHorizontal(iconCompatParcelizerArr[i3 - 1].getRead());
        }
        return this.IconCompatParcelizer.getPrimaryHorizontal(iconCompatParcelizerArr[i3 + 1].getRead());
    }

    public final int write(int p0) {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer.getLineEnd(p0), this.IconCompatParcelizer.getLineStart(p0));
    }

    private final float IconCompatParcelizer(int p0, boolean p1) {
        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(p0, this.IconCompatParcelizer.getLineEnd(this.IconCompatParcelizer.getLineForOffset(p0)));
        if (p1) {
            return this.IconCompatParcelizer.getPrimaryHorizontal(iRemoteActionCompatParcelizer);
        }
        return this.IconCompatParcelizer.getSecondaryHorizontal(iRemoteActionCompatParcelizer);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017"}, d2 = {"Lo/addIgnorable$IconCompatParcelizer;", "", "", "p0", "p1", "", "p2", "<init>", "(IIZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        public IconCompatParcelizer(int i, int i2, boolean z) {
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
            this.write = z;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getRead() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && this.read == iconCompatParcelizer.read && this.write == iconCompatParcelizer.write;
        }

        public final int hashCode() {
            return (((Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + Integer.hashCode(this.read)) * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", read=");
            sb.append(this.read);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }

    private final int AudioAttributesCompatParcelizer(int p0, int p1) {
        while (p0 > p1 && IconCompatParcelizer(this.IconCompatParcelizer.getText().charAt(p0 - 1))) {
            p0--;
        }
        return p0;
    }

    public final IconCompatParcelizer[] AudioAttributesCompatParcelizer(int p0) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.IconCompatParcelizer.getLineStart(p0);
        int lineEnd = this.IconCompatParcelizer.getLineEnd(p0);
        int iRemoteActionCompatParcelizer$default = RemoteActionCompatParcelizer$default(this, lineStart, false, 2, null);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer$default);
        Bidi bidiIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer$default);
        if (bidiIconCompatParcelizer == null || (bidiCreateLineBidi = bidiIconCompatParcelizer.createLineBidi(lineStart - iRemoteActionCompatParcelizer, lineEnd - iRemoteActionCompatParcelizer)) == null) {
            return new IconCompatParcelizer[]{new IconCompatParcelizer(lineStart, lineEnd, this.IconCompatParcelizer.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        IconCompatParcelizer[] iconCompatParcelizerArr = new IconCompatParcelizer[runCount];
        for (int i = 0; i < runCount; i++) {
            int runStart = bidiCreateLineBidi.getRunStart(i);
            int runLimit = bidiCreateLineBidi.getRunLimit(i);
            boolean z = true;
            if (bidiCreateLineBidi.getRunLevel(i) % 2 != 1) {
                z = false;
            }
            iconCompatParcelizerArr[i] = new IconCompatParcelizer(runStart + lineStart, runLimit + lineStart, z);
        }
        return iconCompatParcelizerArr;
    }

    public final boolean IconCompatParcelizer(char p0) {
        if (p0 == ' ' || p0 == '\n' || p0 == 5760) {
            return true;
        }
        return (toMagicModuleMetaRepoModel.read((int) p0, 8192) >= 0 && toMagicModuleMetaRepoModel.read((int) p0, 8202) <= 0 && p0 != 8199) || p0 == 8287 || p0 == 12288;
    }
}
