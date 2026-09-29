package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class hasChangeDiff {
    private static int AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    private static int IconCompatParcelizer(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    private static int write(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean read(byte[] bArr) {
        return RemoteActionCompatParcelizer(bArr, 0, bArr.length);
    }

    public static boolean RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        return AudioAttributesCompatParcelizer(bArr, i, i2) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] <= (-65)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        if (r7[r8] > (-65)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0081, code lost:
    
        if (r7[r8] > (-65)) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int write(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L87
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1a
            r6 = -62
            if (r0 < r6) goto L19
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 > r3) goto L19
            goto L84
        L19:
            return r2
        L1a:
            r4 = -16
            if (r0 >= r4) goto L47
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L32
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L2f
            int r6 = IconCompatParcelizer(r0, r8)
            return r6
        L2f:
            r5 = r8
            r8 = r6
            r6 = r5
        L32:
            if (r6 > r3) goto L46
            r4 = -96
            if (r0 != r1) goto L3a
            if (r6 < r4) goto L46
        L3a:
            r1 = -19
            if (r0 != r1) goto L40
            if (r6 >= r4) goto L46
        L40:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L84
        L46:
            return r2
        L47:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5d
            int r6 = r8 + 1
            r1 = r7[r8]
            if (r6 < r9) goto L58
            int r6 = IconCompatParcelizer(r0, r1)
            return r6
        L58:
            r8 = 0
            r5 = r8
            r8 = r6
            r6 = r5
            goto L60
        L5d:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
        L60:
            if (r6 != 0) goto L70
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L6d
            int r6 = AudioAttributesCompatParcelizer(r0, r1, r8)
            return r6
        L6d:
            r5 = r8
            r8 = r6
            r6 = r5
        L70:
            if (r1 > r3) goto L86
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L86
            if (r6 > r3) goto L86
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L84
            goto L86
        L84:
            r8 = r6
            goto L87
        L86:
            return r2
        L87:
            int r6 = AudioAttributesCompatParcelizer(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasChangeDiff.write(int, byte[], int, int):int");
    }

    private static int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return read(bArr, i, i2);
    }

    private static int read(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return IconCompatParcelizer(bArr, i3, i2);
                    }
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0 && bArr[i + 2] <= -65) {
                        i3 = i + 4;
                        if (bArr[i + 3] > -65) {
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 1) {
                    return IconCompatParcelizer(bArr, i3, i2);
                }
                byte b3 = bArr[i3];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i3 = i + 3;
                    if (bArr[i + 2] > -65) {
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    private static int IconCompatParcelizer(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return write(b);
        }
        if (i3 == 1) {
            return IconCompatParcelizer(b, bArr[i]);
        }
        if (i3 == 2) {
            return AudioAttributesCompatParcelizer(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
