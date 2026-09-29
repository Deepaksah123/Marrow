package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0005R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013"}, d2 = {"Lo/setCompoundDrawables;", "Lo/ActivityChooserView;", "", "p0", "<init>", "(I)V", "", "RemoteActionCompatParcelizer", "()V", "IconCompatParcelizer", "", "(J)I", "(I)I", "AudioAttributesCompatParcelizer", "write", "(J)V", "", "read", "(J)Z", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setCompoundDrawables extends ActivityChooserView {
    private int write;

    public setCompoundDrawables(int i) {
        super(null);
        if (i < 0) {
            AppCompatImageButton.read("Capacity must be a positive value.");
        }
        RemoteActionCompatParcelizer(setAutoSizeTextTypeUniformWithPresetSizes.write(i));
    }

    public /* synthetic */ setCompoundDrawables(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void RemoteActionCompatParcelizer(int p0) {
        int iMax = p0 > 0 ? Math.max(7, setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(p0)) : 0;
        this.IconCompatParcelizer = iMax;
        write(iMax);
        this.AudioAttributesCompatParcelizer = new long[iMax];
    }

    private final void write(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer;
        } else {
            jArr = new long[((p0 + 15) & (-8)) >> 3];
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
        }
        this.RemoteActionCompatParcelizer = jArr;
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        int i = p0 >> 3;
        long j = 255 << ((p0 & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        AudioAttributesCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer() {
        this.write = setAutoSizeTextTypeUniformWithPresetSizes.RemoteActionCompatParcelizer(getIconCompatParcelizer()) - this.read;
    }

    public final void RemoteActionCompatParcelizer(long p0) {
        this.AudioAttributesCompatParcelizer[IconCompatParcelizer(p0)] = p0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(long r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r0
            o.ActivityChooserView r1 = (kotlin.ActivityChooserView) r1
            int r2 = java.lang.Long.hashCode(r19)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r1.IconCompatParcelizer
            int r4 = r2 >>> 7
            r4 = r4 & r3
            r6 = 0
        L16:
            long[] r7 = r1.RemoteActionCompatParcelizer
            int r8 = r4 >> 3
            r9 = r4 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r15 = 63
            long r13 = r13 >> r15
            long r7 = r7 & r13
            long r9 = r10 >>> r9
            long r7 = r7 | r9
            r9 = r2 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            r15 = r6
            long r5 = ~r9
            long r9 = r9 - r13
            long r5 = r5 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r9
        L44:
            r13 = 0
            int r16 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r16 == 0) goto L61
            int r13 = java.lang.Long.numberOfTrailingZeros(r5)
            int r13 = r13 >> 3
            int r13 = r13 + r4
            r13 = r13 & r3
            long[] r14 = r1.AudioAttributesCompatParcelizer
            r16 = r14[r13]
            int r14 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r14 != 0) goto L5b
            goto L6d
        L5b:
            r13 = 1
            long r13 = r5 - r13
            long r5 = r5 & r13
            goto L44
        L61:
            long r5 = ~r7
            r16 = 6
            long r5 = r5 << r16
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 == 0) goto L78
            r13 = -1
        L6d:
            if (r13 < 0) goto L71
            r5 = r12
            goto L72
        L71:
            r5 = 0
        L72:
            if (r5 == 0) goto L77
            r0.AudioAttributesCompatParcelizer(r13)
        L77:
            return r5
        L78:
            int r6 = r15 + 8
            int r4 = r4 + r6
            r4 = r4 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCompoundDrawables.read(long):boolean");
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        this.read--;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i = this.IconCompatParcelizer;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
    }

    private final int IconCompatParcelizer(int p0) {
        int i = this.IconCompatParcelizer;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer > 8 && Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.read) << 5), setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.IconCompatParcelizer) * 25)) <= 0) {
            IconCompatParcelizer();
        } else {
            read(setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        }
    }

    private void IconCompatParcelizer() {
        char c;
        int i;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        long[] jArr2 = this.AudioAttributesCompatParcelizer;
        char c2 = 0;
        for (int i3 = 0; i3 < ((i2 + 7) >> 3); i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int iIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(jArr);
        int i4 = iIconCompatParcelizer - 1;
        long j2 = 72057594037927935L;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[iIconCompatParcelizer] = jArr[0];
        int i5 = 0;
        while (i5 != i2) {
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j3 = (jArr[i6] >> i7) & 255;
            if (j3 != 128 && j3 == 254) {
                int iHashCode = Long.hashCode(jArr2[i5]) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                int i9 = i8 >>> 7;
                int iIconCompatParcelizer2 = IconCompatParcelizer(i9);
                int i10 = i9 & i2;
                if (((iIconCompatParcelizer2 - i10) & i2) / 8 == ((i5 - i10) & i2) / 8) {
                    jArr[i6] = (((long) (i8 & 127)) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                } else {
                    int i11 = iIconCompatParcelizer2 >> 3;
                    long j4 = jArr[i11];
                    int i12 = (iIconCompatParcelizer2 & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        int i13 = i5;
                        jArr[i11] = ((~(255 << i12)) & j4) | (((long) (i8 & 127)) << i12);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        jArr2[iIconCompatParcelizer2] = jArr2[i13];
                        jArr2[i13] = 0;
                        i = i13;
                    } else {
                        int i14 = i5;
                        jArr[i11] = (((long) (i8 & 127)) << i12) | ((~(255 << i12)) & j4);
                        long j5 = jArr2[iIconCompatParcelizer2];
                        jArr2[iIconCompatParcelizer2] = jArr2[i14];
                        jArr2[i14] = j5;
                        i = i14 - 1;
                    }
                    c = 0;
                    j2 = 72057594037927935L;
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i5 = i + 1;
                    c2 = c;
                }
            } else {
                c = c2;
                i5++;
                c2 = c;
            }
        }
        AudioAttributesCompatParcelizer();
    }

    private void read(int p0) {
        long[] jArr = this.RemoteActionCompatParcelizer;
        long[] jArr2 = this.AudioAttributesCompatParcelizer;
        int i = this.IconCompatParcelizer;
        RemoteActionCompatParcelizer(p0);
        long[] jArr3 = this.RemoteActionCompatParcelizer;
        long[] jArr4 = this.AudioAttributesCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        for (int i3 = 0; i3 < i; i3++) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr2[i3];
                int iHashCode = Long.hashCode(j) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iIconCompatParcelizer = IconCompatParcelizer(i4 >>> 7);
                long j2 = i4 & 127;
                int i5 = iIconCompatParcelizer >> 3;
                int i6 = (iIconCompatParcelizer & 7) << 3;
                long j3 = (jArr3[i5] & (~(255 << i6))) | (j2 << i6);
                jArr3[i5] = j3;
                jArr3[(((iIconCompatParcelizer - 7) & i2) + (i2 & 7)) >> 3] = j3;
                jArr4[iIconCompatParcelizer] = j;
            }
        }
    }

    private final int IconCompatParcelizer(long p0) {
        int iHashCode = Long.hashCode(p0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = this.IconCompatParcelizer;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = i & 127;
            int i8 = i5;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.AudioAttributesCompatParcelizer[iNumberOfTrailingZeros] == p0) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iIconCompatParcelizer = IconCompatParcelizer(i2);
                if (this.write == 0 && ((this.RemoteActionCompatParcelizer[iIconCompatParcelizer >> 3] >> ((iIconCompatParcelizer & 7) << 3)) & 255) != 254) {
                    RemoteActionCompatParcelizer();
                    iIconCompatParcelizer = IconCompatParcelizer(i2);
                }
                this.read++;
                int i9 = iIconCompatParcelizer >> 3;
                int i10 = (iIconCompatParcelizer & 7) << 3;
                this.write -= ((this.RemoteActionCompatParcelizer[i9] >> i10) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.RemoteActionCompatParcelizer;
                int i11 = this.IconCompatParcelizer;
                long j5 = ((~(255 << i10)) & jArr2[i9]) | (j2 << i10);
                jArr2[i9] = j5;
                jArr2[(((iIconCompatParcelizer - 7) & i11) + (i11 & 7)) >> 3] = j5;
                return iIconCompatParcelizer;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public setCompoundDrawables() {
        this(0, 1, null);
    }
}
