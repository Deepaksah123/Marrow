package kotlin;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import java.net.URLDecoder;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class getEventTimeForErrorEvent {
    public static Bundle read(String str, boolean z) {
        if (str == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.parseUrl(str);
            for (String str2 : urlQuerySanitizer.getParameterSet()) {
                String str3 = read(str2, urlQuerySanitizer, false);
                if (str3 != null) {
                    if (z || str2.equals("wzrk_c2a")) {
                        bundle.putString(str2, str3);
                    } else {
                        bundle.putString(str2, URLDecoder.decode(str3, CharsetNames.UTF_8));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    public static JSONObject write(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseUrl(uri.toString());
            String strWrite = write("source", urlQuerySanitizer);
            String strWrite2 = write("medium", urlQuerySanitizer);
            String strWrite3 = write("campaign", urlQuerySanitizer);
            jSONObject.put("us", strWrite);
            jSONObject.put("um", strWrite2);
            jSONObject.put("uc", strWrite3);
            String str = read("medium", urlQuerySanitizer);
            if (str != null && str.matches("^email$|^social$|^search$")) {
                jSONObject.put("wm", str);
            }
            jSONObject.toString(4);
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static String write(String str, UrlQuerySanitizer urlQuerySanitizer) {
        String strIconCompatParcelizer = IconCompatParcelizer(str, urlQuerySanitizer);
        if (strIconCompatParcelizer != null) {
            return strIconCompatParcelizer;
        }
        String str2 = read(str, urlQuerySanitizer);
        if (str2 != null) {
            return str2;
        }
        return null;
    }

    private static String IconCompatParcelizer(String str, UrlQuerySanitizer urlQuerySanitizer) {
        return read("utm_".concat(String.valueOf(str)), urlQuerySanitizer, true);
    }

    private static String read(String str, UrlQuerySanitizer urlQuerySanitizer, boolean z) {
        if (str != null && urlQuerySanitizer != null) {
            try {
                String value = urlQuerySanitizer.getValue(str);
                if (value == null) {
                    return null;
                }
                return (!z || value.length() <= 120) ? value : value.substring(0, 120);
            } catch (Throwable unused) {
                RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        }
        return null;
    }

    private static String read(String str, UrlQuerySanitizer urlQuerySanitizer) {
        return read("wzrk_".concat(String.valueOf(str)), urlQuerySanitizer, true);
    }
}
