package com.google.ads.conversiontracking;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class GoogleConversionPing {

    @Deprecated
    public enum ConversionType {
        GOOGLE_CONVERSION,
        DOUBLECLICK_CONVERSION
    }

    @Deprecated
    public static void recordConversionPing(Context context, String str, String str2, String str3, boolean z) {
        AdWordsConversionReporter.reportWithConversionId(context, str, str2, str3, z);
    }

    @Deprecated
    public static void recordConversionPing(Context context, String str, ConversionType conversionType, String str2, String str3, boolean z) {
        if (conversionType == ConversionType.GOOGLE_CONVERSION) {
            AdWordsConversionReporter.reportWithConversionId(context, str, str2, str3, z);
        } else {
            DoubleClickConversionReporter.reportWithConversionId(context, str, str2, str3, z);
        }
    }

    @Deprecated
    public static void recordRemarketingPing(Context context, String str, String str2, String str3, Map<String, String> map) {
        HashMap map2;
        if (map == null && TextUtils.isEmpty(str3)) {
            map2 = null;
        } else {
            map2 = new HashMap();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                map2.put("screen_name", str3);
            }
        }
        AdWordsRemarketingReporter.reportWithConversionId(context, str, map2);
    }

    @Deprecated
    public static boolean registerReferrer(Context context, Uri uri) {
        return AdWordsConversionReporter.registerReferrer(context, uri);
    }
}
