package in.juspay.widget.qrscanner.com.google.zxing.qrcode.encoder;

import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.Mode;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.Version;

/* JADX INFO: loaded from: classes5.dex */
public final class QRCode {
    public static final int NUM_MASK_PATTERNS = 8;
    private Mode a;
    private ErrorCorrectionLevel b;
    private Version c;
    private int d = -1;
    private ByteMatrix e;

    public static boolean isValidMaskPattern(int i) {
        return i >= 0 && i < 8;
    }

    public final ErrorCorrectionLevel getECLevel() {
        return this.b;
    }

    public final int getMaskPattern() {
        return this.d;
    }

    public final ByteMatrix getMatrix() {
        return this.e;
    }

    public final Mode getMode() {
        return this.a;
    }

    public final Version getVersion() {
        return this.c;
    }

    public final void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        this.b = errorCorrectionLevel;
    }

    public final void setMaskPattern(int i) {
        this.d = i;
    }

    public final void setMatrix(ByteMatrix byteMatrix) {
        this.e = byteMatrix;
    }

    public final void setMode(Mode mode) {
        this.a = mode;
    }

    public final void setVersion(Version version) {
        this.c = version;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
