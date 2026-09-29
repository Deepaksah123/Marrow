package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import in.juspay.widget.qrscanner.com.google.zxing.BarcodeFormat;
import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.MultiFormatReader;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class f implements c {
    private Collection<BarcodeFormat> a;
    private Map<DecodeHintType, ?> b;
    private String c;

    public f() {
    }

    public f(Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str) {
        this.a = collection;
        this.b = map;
        this.c = str;
    }

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.c
    public b a(Map<DecodeHintType, ?> map) {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.putAll(map);
        Map<DecodeHintType, ?> map2 = this.b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<BarcodeFormat> collection = this.a;
        if (collection != null) {
            enumMap.put(DecodeHintType.POSSIBLE_FORMATS, collection);
        }
        String str = this.c;
        if (str != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, str);
        }
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        multiFormatReader.setHints(enumMap);
        return new b(multiFormatReader);
    }
}
