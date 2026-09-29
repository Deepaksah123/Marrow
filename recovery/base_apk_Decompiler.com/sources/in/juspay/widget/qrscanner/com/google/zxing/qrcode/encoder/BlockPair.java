package in.juspay.widget.qrscanner.com.google.zxing.qrcode.encoder;

/* JADX INFO: loaded from: classes5.dex */
final class BlockPair {
    private final byte[] a;
    private final byte[] b;

    BlockPair(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] getDataBytes() {
        return this.a;
    }

    public final byte[] getErrorCorrectionBytes() {
        return this.b;
    }
}
