package kotlin;

import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public final class setStatuses {
    private static final byte[] RemoteActionCompatParcelizer = setMarkers.read("0123456789abcdef");

    public static final byte[] AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static final boolean read(getMarkerPaint getmarkerpaint, int i, byte[] bArr, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(getmarkerpaint, "");
        toMagicModuleMetaRepoModel.write(bArr, "");
        int i4 = getmarkerpaint.limit;
        byte[] bArr2 = getmarkerpaint.data;
        while (i2 < i3) {
            if (i == i4) {
                getmarkerpaint = getmarkerpaint.next;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                byte[] bArr3 = getmarkerpaint.data;
                bArr2 = bArr3;
                i = getmarkerpaint.pos;
                i4 = getmarkerpaint.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String RemoteActionCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws EOFException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        if (j > 0) {
            long j2 = j - 1;
            if (resetcurrentselectedposition.IconCompatParcelizer(j2) == 13) {
                String strRemoteActionCompatParcelizer = resetcurrentselectedposition.RemoteActionCompatParcelizer(j2);
                resetcurrentselectedposition.AudioAttributesImplBaseParcelizer(2L);
                return strRemoteActionCompatParcelizer;
            }
        }
        String strRemoteActionCompatParcelizer2 = resetcurrentselectedposition.RemoteActionCompatParcelizer(j);
        resetcurrentselectedposition.AudioAttributesImplBaseParcelizer(1L);
        return strRemoteActionCompatParcelizer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r19 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[LOOP:0: B:8:0x0024->B:45:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int write(kotlin.resetCurrentSelectedPosition r17, kotlin.Options r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r0, r1)
            r2 = r18
            kotlin.toMagicModuleMetaRepoModel.write(r2, r1)
            o.getMarkerPaint r0 = r0.head
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L16
            if (r19 == 0) goto L15
            return r1
        L15:
            return r3
        L16:
            byte[] r4 = r0.data
            int r5 = r0.pos
            int r6 = r0.limit
            int[] r2 = r18.getWrite()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L24:
            r11 = r2[r8]
            int r12 = r8 + 2
            r13 = 1
            int r8 = r8 + r13
            r8 = r2[r8]
            if (r8 == r3) goto L2f
            r10 = r8
        L2f:
            if (r9 == 0) goto La4
            r8 = 0
            if (r11 >= 0) goto L73
            r14 = r12
        L35:
            int r15 = r5 + 1
            r5 = r4[r5]
            int r3 = r14 + 1
            r5 = r5 & 255(0xff, float:3.57E-43)
            r14 = r2[r14]
            if (r5 != r14) goto La7
            int r5 = r12 - r11
            if (r3 != r5) goto L47
            r5 = r13
            goto L48
        L47:
            r5 = r7
        L48:
            if (r15 != r6) goto L65
            kotlin.toMagicModuleMetaRepoModel.write(r9)
            o.getMarkerPaint r4 = r9.next
            kotlin.toMagicModuleMetaRepoModel.write(r4)
            int r6 = r4.pos
            byte[] r9 = r4.data
            int r14 = r4.limit
            if (r4 != r0) goto L5f
            if (r5 == 0) goto La4
            r4 = r9
            r9 = r8
            goto L67
        L5f:
            r16 = r9
            r9 = r4
            r4 = r16
            goto L67
        L65:
            r14 = r6
            r6 = r15
        L67:
            if (r5 == 0) goto L6e
            r3 = r2[r3]
            r5 = r6
            r6 = r14
            goto L9b
        L6e:
            r5 = r6
            r6 = r14
            r14 = r3
            r3 = -1
            goto L35
        L73:
            int r3 = r5 + 1
            r5 = r4[r5]
            r13 = r12
        L78:
            int r14 = r12 + r11
            if (r13 != r14) goto L7d
            goto La7
        L7d:
            r14 = r5 & 255(0xff, float:3.57E-43)
            r15 = r2[r13]
            if (r14 != r15) goto La1
            int r13 = r13 + r11
            r5 = r2[r13]
            if (r3 != r6) goto L96
            o.getMarkerPaint r9 = r9.next
            kotlin.toMagicModuleMetaRepoModel.write(r9)
            int r3 = r9.pos
            byte[] r4 = r9.data
            int r6 = r9.limit
            if (r9 != r0) goto L96
            r9 = r8
        L96:
            r16 = r5
            r5 = r3
            r3 = r16
        L9b:
            if (r3 < 0) goto L9e
            return r3
        L9e:
            int r8 = -r3
            r3 = -1
            goto L24
        La1:
            int r13 = r13 + 1
            goto L78
        La4:
            if (r19 == 0) goto La7
            return r1
        La7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setStatuses.write(o.resetCurrentSelectedPosition, o.CustomButton, boolean):int");
    }
}
