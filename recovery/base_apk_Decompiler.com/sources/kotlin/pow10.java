package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00148\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R*\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00190\u00188\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b"}, d2 = {"Lo/pow10;", "", "T", "<init>", "()V", "p0", "", "read", "(Ljava/lang/Object;)Z", "", "p1", "write", "(Ljava/lang/Object;I)I", "p2", "RemoteActionCompatParcelizer", "(ILjava/lang/Object;I)I", "AudioAttributesCompatParcelizer", "I", "()I", "(I)V", "", "IconCompatParcelizer", "[I", "()[I", "", "Lo/copyInto;", "[Lo/copyInto;", "()[Lo/copyInto;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pow10<T> {
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int[] read = new int[16];

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private copyInto<T>[] RemoteActionCompatParcelizer = new copyInto[16];

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int[] getRead() {
        return this.read;
    }

    public final copyInto<T>[] IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean read(T p0) {
        int iWrite;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = addTimesIInto.read(p0);
        if (i > 0) {
            iWrite = write(p0, i2);
            if (iWrite >= 0) {
                return false;
            }
        } else {
            iWrite = -1;
        }
        int i3 = -(iWrite + 1);
        copyInto<T>[] copyintoArr = this.RemoteActionCompatParcelizer;
        int length = copyintoArr.length;
        if (i == length) {
            int i4 = length << 1;
            copyInto<T>[] copyintoArr2 = new copyInto[i4];
            int[] iArr = new int[i4];
            int i5 = i3 + 1;
            System.arraycopy(copyintoArr, i3, copyintoArr2, i5, i - i3);
            System.arraycopy(this.RemoteActionCompatParcelizer, 0, copyintoArr2, 0, i3);
            getOrderDetails.read(this.read, iArr, i5, i3, i);
            getOrderDetails.RemoteActionCompatParcelizer(this.read, iArr, 0, i3, 6);
            this.RemoteActionCompatParcelizer = copyintoArr2;
            this.read = iArr;
        } else {
            int i6 = i3 + 1;
            System.arraycopy(copyintoArr, i3, copyintoArr, i6, i - i3);
            int[] iArr2 = this.read;
            getOrderDetails.read(iArr2, iArr2, i6, i3, i);
        }
        this.RemoteActionCompatParcelizer[i3] = new copyInto<>(p0);
        this.read[i3] = i2;
        this.AudioAttributesCompatParcelizer++;
        return true;
    }

    private final int write(T p0, int p1) {
        int i = this.AudioAttributesCompatParcelizer - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int i4 = this.read[i3];
            if (i4 < p1) {
                i2 = i3 + 1;
            } else {
                if (i4 <= p1) {
                    copyInto<T> copyinto = this.RemoteActionCompatParcelizer[i3];
                    return p0 == (copyinto != null ? copyinto.get() : null) ? i3 : RemoteActionCompatParcelizer(i3, p0, p1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r4 = r4 + 1;
        r0 = r3.AudioAttributesCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r3.read[r4] == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        r2 = r3.RemoteActionCompatParcelizer[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (r2 != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        return -(r3.AudioAttributesCompatParcelizer + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int RemoteActionCompatParcelizer(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            if (r0 < 0) goto L1b
            int[] r2 = r3.read
            r2 = r2[r0]
            if (r2 != r6) goto L1b
            o.copyInto<T>[] r2 = r3.RemoteActionCompatParcelizer
            r2 = r2[r0]
            if (r2 == 0) goto L15
            java.lang.Object r1 = r2.get()
        L15:
            if (r1 != r5) goto L18
            return r0
        L18:
            int r0 = r0 + (-1)
            goto L2
        L1b:
            int r4 = r4 + 1
            int r0 = r3.AudioAttributesCompatParcelizer
        L1f:
            if (r4 >= r0) goto L3d
            int[] r2 = r3.read
            r2 = r2[r4]
            if (r2 == r6) goto L2b
            int r4 = r4 + 1
            int r3 = -r4
            return r3
        L2b:
            o.copyInto<T>[] r2 = r3.RemoteActionCompatParcelizer
            r2 = r2[r4]
            if (r2 == 0) goto L36
            java.lang.Object r2 = r2.get()
            goto L37
        L36:
            r2 = r1
        L37:
            if (r2 != r5) goto L3a
            return r4
        L3a:
            int r4 = r4 + 1
            goto L1f
        L3d:
            int r3 = r3.AudioAttributesCompatParcelizer
            int r3 = r3 + 1
            int r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.pow10.RemoteActionCompatParcelizer(int, java.lang.Object, int):int");
    }
}
