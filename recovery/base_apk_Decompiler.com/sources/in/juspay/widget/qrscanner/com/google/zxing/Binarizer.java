package in.juspay.widget.qrscanner.com.google.zxing;

import in.juspay.widget.qrscanner.com.google.zxing.common.BitArray;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Binarizer {
    private final LuminanceSource a;

    public Binarizer(LuminanceSource luminanceSource) {
        this.a = luminanceSource;
    }

    public abstract Binarizer createBinarizer(LuminanceSource luminanceSource);

    public abstract BitMatrix getBlackMatrix();

    public abstract BitArray getBlackRow(int i, BitArray bitArray);

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final LuminanceSource getLuminanceSource() {
        return this.a;
    }

    public final int getWidth() {
        return this.a.getWidth();
    }
}
