package in.juspay.widget.qrscanner.com.google.zxing;

import in.juspay.widget.qrscanner.com.google.zxing.common.BitArray;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes5.dex */
public final class BinaryBitmap {
    private final Binarizer a;
    private BitMatrix b;

    public BinaryBitmap(Binarizer binarizer) {
        if (binarizer == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.a = binarizer;
    }

    public final BinaryBitmap crop(int i, int i2, int i3, int i4) {
        return new BinaryBitmap(this.a.createBinarizer(this.a.getLuminanceSource().crop(i, i2, i3, i4)));
    }

    public final BitMatrix getBlackMatrix() {
        if (this.b == null) {
            this.b = this.a.getBlackMatrix();
        }
        return this.b;
    }

    public final BitArray getBlackRow(int i, BitArray bitArray) {
        return this.a.getBlackRow(i, bitArray);
    }

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final int getWidth() {
        return this.a.getWidth();
    }

    public final boolean isCropSupported() {
        return this.a.getLuminanceSource().isCropSupported();
    }

    public final boolean isRotateSupported() {
        return this.a.getLuminanceSource().isRotateSupported();
    }

    public final BinaryBitmap rotateCounterClockwise() {
        return new BinaryBitmap(this.a.createBinarizer(this.a.getLuminanceSource().rotateCounterClockwise()));
    }

    public final BinaryBitmap rotateCounterClockwise45() {
        return new BinaryBitmap(this.a.createBinarizer(this.a.getLuminanceSource().rotateCounterClockwise45()));
    }

    public final String toString() {
        try {
            return getBlackMatrix().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
