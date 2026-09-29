package kotlin;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class initializeOutput {
    private static final Map IconCompatParcelizer;
    private static final Map write;

    static {
        HashMap map = new HashMap();
        write = map;
        HashMap map2 = new HashMap();
        IconCompatParcelizer = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String write(int i) {
        Map map = write;
        if (!map.containsKey(-1)) {
            return "";
        }
        String str = (String) map.get(-1);
        String str2 = (String) IconCompatParcelizer.get(-1);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
