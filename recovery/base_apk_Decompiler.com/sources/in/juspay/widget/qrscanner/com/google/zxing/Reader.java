package in.juspay.widget.qrscanner.com.google.zxing;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface Reader {
    Result decode(BinaryBitmap binaryBitmap);

    Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map);

    void reset();
}
