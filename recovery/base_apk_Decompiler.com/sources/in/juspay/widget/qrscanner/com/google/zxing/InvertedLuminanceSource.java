package in.juspay.widget.qrscanner.com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class InvertedLuminanceSource extends LuminanceSource {
    private final LuminanceSource c;

    public InvertedLuminanceSource(LuminanceSource luminanceSource) {
        super(luminanceSource.getWidth(), luminanceSource.getHeight());
        this.c = luminanceSource;
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource
    public final LuminanceSource crop(int i, int i2, int i3, int i4) {
        return new InvertedLuminanceSource(this.c.crop(i, i2, i3, i4));
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource
    public final byte[] getMatrix() {
        byte[] matrix = this.c.getMatrix();
        int width = getWidth() * getHeight();
        byte[] bArr = new byte[width];
        for (int i = 0; i < width; i++) {
            bArr[i] = (byte) (255 - (matrix[i] & 255));
        }
        return bArr;
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource
    public final byte[] getRow(int i, byte[] bArr) {
        byte[] row = this.c.getRow(i, bArr);
        int width = getWidth();
        for (int i2 = 0; i2 < width; i2++) {
            row[i2] = (byte) (255 - (row[i2] & 255));
        }
        return row;
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource
    public final LuminanceSource invert() {
        return this.c;
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource
    public final boolean isCropSupported() {
        return this.c.isCropSupported();
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource
    public final boolean isRotateSupported() {
        return this.c.isRotateSupported();
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource
    public final LuminanceSource rotateCounterClockwise() {
        return new InvertedLuminanceSource(this.c.rotateCounterClockwise());
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource
    public final LuminanceSource rotateCounterClockwise45() {
        return new InvertedLuminanceSource(this.c.rotateCounterClockwise45());
    }
}
