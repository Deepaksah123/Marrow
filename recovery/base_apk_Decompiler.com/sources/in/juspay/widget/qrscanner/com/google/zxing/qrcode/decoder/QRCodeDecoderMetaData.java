package in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder;

import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes5.dex */
public final class QRCodeDecoderMetaData {
    private final boolean a;

    QRCodeDecoderMetaData(boolean z) {
        this.a = z;
    }

    public final void applyMirroredCorrection(ResultPoint[] resultPointArr) {
        if (!this.a || resultPointArr == null || resultPointArr.length < 3) {
            return;
        }
        ResultPoint resultPoint = resultPointArr[0];
        resultPointArr[0] = resultPointArr[2];
        resultPointArr[2] = resultPoint;
    }

    public final boolean isMirrored() {
        return this.a;
    }
}
