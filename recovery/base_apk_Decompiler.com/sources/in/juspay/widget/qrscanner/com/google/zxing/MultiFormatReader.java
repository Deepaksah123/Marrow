package in.juspay.widget.qrscanner.com.google.zxing;

import in.juspay.widget.qrscanner.com.google.zxing.qrcode.QRCodeReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class MultiFormatReader implements Reader {
    private Map<DecodeHintType, ?> a;
    private Reader[] b;

    private Result a(BinaryBitmap binaryBitmap) throws NotFoundException {
        Reader[] readerArr = this.b;
        if (readerArr != null) {
            for (Reader reader : readerArr) {
                if (Thread.currentThread().isInterrupted()) {
                    throw NotFoundException.getNotFoundInstance();
                }
                try {
                    return reader.decode(binaryBitmap, this.a);
                } catch (ReaderException unused) {
                }
            }
            binaryBitmap.getBlackMatrix().flip();
            for (Reader reader2 : this.b) {
                if (Thread.currentThread().isInterrupted()) {
                    throw NotFoundException.getNotFoundInstance();
                }
                try {
                    return reader2.decode(binaryBitmap, this.a);
                } catch (ReaderException unused2) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.Reader
    public final Result decode(BinaryBitmap binaryBitmap) {
        setHints(null);
        return a(binaryBitmap);
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.Reader
    public final Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) {
        setHints(map);
        return a(binaryBitmap);
    }

    public final Result decodeWithState(BinaryBitmap binaryBitmap) {
        if (this.b == null) {
            setHints(null);
        }
        return a(binaryBitmap);
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.Reader
    public final void reset() {
        Reader[] readerArr = this.b;
        if (readerArr != null) {
            for (Reader reader : readerArr) {
                reader.reset();
            }
        }
    }

    public final void setHints(Map<DecodeHintType, ?> map) {
        this.a = map;
        if (map != null) {
            map.containsKey(DecodeHintType.TRY_HARDER);
        }
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null && !collection.contains(BarcodeFormat.UPC_A) && !collection.contains(BarcodeFormat.UPC_E) && !collection.contains(BarcodeFormat.EAN_13) && !collection.contains(BarcodeFormat.EAN_8) && !collection.contains(BarcodeFormat.CODABAR) && !collection.contains(BarcodeFormat.CODE_39) && !collection.contains(BarcodeFormat.CODE_93) && !collection.contains(BarcodeFormat.CODE_128) && !collection.contains(BarcodeFormat.ITF) && !collection.contains(BarcodeFormat.RSS_14)) {
            collection.contains(BarcodeFormat.RSS_EXPANDED);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new QRCodeReader());
        }
        this.b = (Reader[]) arrayList.toArray(new Reader[arrayList.size()]);
    }
}
