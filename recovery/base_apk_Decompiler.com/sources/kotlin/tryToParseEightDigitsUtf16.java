package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/tryToParseEightDigitsUtf16;", "K", "V", "Lo/fma;", "", "Lo/tryToParseEightHexDigits;", "p0", "<init>", "(Lo/tryToParseEightHexDigits;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tryToParseEightDigitsUtf16<K, V> extends fma<K, V, Map.Entry<? extends K, ? extends V>> {
    /* JADX WARN: Illegal instructions before constructor call */
    public tryToParseEightDigitsUtf16(tryToParseEightHexDigits<K, V> trytoparseeighthexdigits) {
        tryToParseFourDigitsUtf16[] trytoparsefourdigitsutf16Arr = new tryToParseFourDigitsUtf16[8];
        for (int i = 0; i < 8; i++) {
            trytoparsefourdigitsutf16Arr[i] = new tryToParseFourHexDigitsUtf16();
        }
        super(trytoparseeighthexdigits, trytoparsefourdigitsutf16Arr);
    }
}
