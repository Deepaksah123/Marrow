package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;
    public final String schemeType;

    public TrackEncryptionBox(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        Assertions.checkArgument((bArr2 == null) ^ (i == 0));
        this.isEncrypted = z;
        this.schemeType = str;
        this.perSampleIvSize = i;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int schemeToCryptoMode(java.lang.String r4) {
        /*
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            r4.hashCode()
            int r1 = r4.hashCode()
            r2 = 3
            r3 = 2
            switch(r1) {
                case 3046605: goto L2f;
                case 3046671: goto L25;
                case 3049879: goto L1b;
                case 3049895: goto L11;
                default: goto L10;
            }
        L10:
            goto L39
        L11:
            java.lang.String r1 = "cens"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L39
            r1 = r2
            goto L3a
        L1b:
            java.lang.String r1 = "cenc"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L39
            r1 = r3
            goto L3a
        L25:
            java.lang.String r1 = "cbcs"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L39
            r1 = r0
            goto L3a
        L2f:
            java.lang.String r1 = "cbc1"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L39
            r1 = 0
            goto L3a
        L39:
            r1 = -1
        L3a:
            if (r1 == 0) goto L5b
            if (r1 == r0) goto L5b
            if (r1 == r3) goto L5a
            if (r1 == r2) goto L5a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported protection scheme type '"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "'. Assuming AES-CTR crypto mode."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "TrackEncryptionBox"
            com.google.android.exoplayer2.util.Log.w(r1, r4)
        L5a:
            return r0
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox.schemeToCryptoMode(java.lang.String):int");
    }
}
