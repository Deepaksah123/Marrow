package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019\u0082\u0001\u0001\u001e"}, d2 = {"Lo/setOverlayMode;", "", "<init>", "()V", "", "p0", "", "AudioAttributesCompatParcelizer", "(I)Z", "equals", "(Ljava/lang/Object;)Z", "write", "(I)I", "read", "p1", "IconCompatParcelizer", "hashCode", "()I", "()Z", "", "toString", "()Ljava/lang/String;", "I", "", "RemoteActionCompatParcelizer", "[I", "", "[J", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "Lo/setExpandActivityOverflowButtonContentDescription;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class setOverlayMode {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public long[] read;
    public int IconCompatParcelizer;
    public int[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public int[] AudioAttributesImplBaseParcelizer;
    public int write;

    private setOverlayMode() {
        this.read = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = setPopupTheme.RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = setPopupTheme.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    private int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer == 0;
    }

    public final int read(int p0) {
        int iWrite = write(p0);
        if (iWrite < 0) {
            AppCompatImageButton.write("Cannot find value for key ".concat(String.valueOf(p0)));
        }
        return this.AudioAttributesImplBaseParcelizer[iWrite];
    }

    public final int IconCompatParcelizer(int i) {
        int iWrite = write(i);
        if (iWrite >= 0) {
            return this.AudioAttributesImplBaseParcelizer[iWrite];
        }
        return -1;
    }

    public final boolean AudioAttributesCompatParcelizer(int p0) {
        return write(p0) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof kotlin.setOverlayMode
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.setOverlayMode r1 = (kotlin.setOverlayMode) r1
            int r3 = r1.getIconCompatParcelizer()
            int r5 = r17.getIconCompatParcelizer()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            int[] r3 = r0.RemoteActionCompatParcelizer
            int[] r5 = r0.AudioAttributesImplBaseParcelizer
            long[] r0 = r0.read
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L6b
            r7 = r4
        L27:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L66
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L41:
            if (r12 >= r10) goto L64
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L60
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r14 = r1.write(r14)
            if (r14 < 0) goto L5f
            int[] r15 = r1.AudioAttributesImplBaseParcelizer
            r14 = r15[r14]
            if (r13 == r14) goto L60
        L5f:
            return r4
        L60:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L41
        L64:
            if (r10 != r11) goto L6b
        L66:
            if (r7 == r6) goto L6b
            int r7 = r7 + 1
            goto L27
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverlayMode.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[PHI: r8
      0x0068: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r18.AudioAttributesCompatParcelizer()
            if (r1 == 0) goto Lb
            java.lang.String r0 = "{}"
            return r0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.RemoteActionCompatParcelizer
            int[] r3 = r0.AudioAttributesImplBaseParcelizer
            long[] r4 = r0.read
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6d
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L68
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L62
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.IconCompatParcelizer
            if (r8 >= r14) goto L62
            java.lang.String r14 = ", "
            r1.append(r14)
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L66:
            if (r11 != r12) goto L6d
        L68:
            if (r7 == r5) goto L6d
            int r7 = r7 + 1
            goto L20
        L6d:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverlayMode.toString():java.lang.String");
    }

    public int hashCode() {
        int[] iArr = this.RemoteActionCompatParcelizer;
        int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
        long[] jArr = this.read;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    private int write(int p0) {
        int iHashCode = Integer.hashCode(p0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this.write;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.read;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == p0) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public /* synthetic */ setOverlayMode(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
