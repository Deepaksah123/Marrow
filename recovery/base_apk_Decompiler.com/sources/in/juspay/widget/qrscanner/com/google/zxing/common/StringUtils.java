package in.juspay.widget.qrscanner.com.google.zxing.common;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class StringUtils {
    public static final String GB2312 = "GB2312";
    public static final String SHIFT_JIS = "SJIS";
    private static final String a;
    private static final boolean b;

    static {
        String strName = Charset.defaultCharset().name();
        a = strName;
        b = SHIFT_JIS.equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }

    private StringUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String guessEncoding(byte[] r21, java.util.Map<in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType, ?> r22) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.widget.qrscanner.com.google.zxing.common.StringUtils.guessEncoding(byte[], java.util.Map):java.lang.String");
    }
}
