package kotlin;

import android.util.Patterns;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultAnalyticsCollectorExternalSyntheticLambda5 {
    private static boolean AudioAttributesCompatParcelizer = false;
    private static Map<String, String> IconCompatParcelizer;
    private static Map<String, String> RemoteActionCompatParcelizer;
    private static Map<String, String> read;
    private static JSONObject write;

    DefaultAnalyticsCollectorExternalSyntheticLambda5() {
    }

    static void read(File file) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return;
        }
        try {
            try {
                write = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                write = new JSONObject(new String(bArr, CharsetNames.UTF_8));
                HashMap map = new HashMap();
                RemoteActionCompatParcelizer = map;
                map.put("ENGLISH", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                RemoteActionCompatParcelizer.put("GERMAN", "2");
                RemoteActionCompatParcelizer.put("SPANISH", "3");
                RemoteActionCompatParcelizer.put("JAPANESE", "4");
                HashMap map2 = new HashMap();
                read = map2;
                map2.put("VIEW_CONTENT", SessionDescription.SUPPORTED_SDP_VERSION);
                read.put("SEARCH", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                read.put("ADD_TO_CART", "2");
                read.put("ADD_TO_WISHLIST", "3");
                read.put("INITIATE_CHECKOUT", "4");
                read.put("ADD_PAYMENT_INFO", "5");
                read.put("PURCHASE", "6");
                read.put("LEAD", "7");
                read.put("COMPLETE_REGISTRATION", "8");
                HashMap map3 = new HashMap();
                IconCompatParcelizer = map3;
                map3.put("BUTTON_TEXT", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                IconCompatParcelizer.put("PAGE_TITLE", "2");
                IconCompatParcelizer.put("RESOLVED_DOCUMENT_LINK", "3");
                IconCompatParcelizer.put("BUTTON_ID", "4");
                AudioAttributesCompatParcelizer = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
        }
    }

    static boolean IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return false;
        }
        try {
            return AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return false;
        }
    }

    static String IconCompatParcelizer(String str, String str2, String str3) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(" | ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str);
            return sb.toString().toLowerCase();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return null;
        }
    }

    static float[] RemoteActionCompatParcelizer(JSONObject jSONObject, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return null;
        }
        try {
            if (!AudioAttributesCompatParcelizer) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            try {
                String lowerCase = str.toLowerCase();
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String strOptString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                IconCompatParcelizer(jSONObject2, jSONArray);
                AudioAttributesCompatParcelizer(fArr, RemoteActionCompatParcelizer(jSONObject2));
                JSONObject jSONObjectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jSONObject2);
                if (jSONObjectAudioAttributesCompatParcelizer == null) {
                    return null;
                }
                AudioAttributesCompatParcelizer(fArr, write(jSONObjectAudioAttributesCompatParcelizer, jSONArray, strOptString, jSONObject2.toString(), lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return null;
        }
    }

    private static float[] RemoteActionCompatParcelizer(JSONObject jSONObject) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            String lowerCase = jSONObject.optString("text").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (AudioAttributesCompatParcelizer(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = (float) (((double) fArr[0]) + 1.0d);
            }
            if (AudioAttributesCompatParcelizer(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = (float) (((double) fArr[1]) + 1.0d);
            }
            if (AudioAttributesCompatParcelizer(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = (float) (((double) fArr[2]) + 1.0d);
            }
            if (AudioAttributesCompatParcelizer(new String[]{"search"}, strArr)) {
                fArr[4] = (float) (((double) fArr[4]) + 1.0d);
            }
            if (iOptInt >= 0) {
                fArr[5] = (float) (((double) fArr[5]) + 1.0d);
            }
            if (iOptInt == 3 || iOptInt == 2) {
                fArr[6] = (float) (((double) fArr[6]) + 1.0d);
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = (float) (((double) fArr[7]) + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                fArr[8] = (float) (((double) fArr[8]) + 1.0d);
            }
            if (AudioAttributesCompatParcelizer(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = (float) (((double) fArr[10]) + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                fArr[12] = (float) (((double) fArr[12]) + 1.0d);
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    AudioAttributesCompatParcelizer(fArr, RemoteActionCompatParcelizer(jSONArrayOptJSONArray.getJSONObject(i)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return null;
        }
    }

    private static float[] write(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            float f = BitmapDescriptorFactory.HUE_RED;
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            fArr[3] = jSONArray.length() > 1 ? r11 - 1 : 0;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (read(jSONArray.getJSONObject(i))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('|');
            sb.append(str3);
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            read(jSONObject, sb3, sb2);
            String string2 = sb2.toString();
            String string3 = sb3.toString();
            fArr[15] = read("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string3) ? 1.0f : 0.0f;
            fArr[16] = read("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", string) ? 1.0f : 0.0f;
            fArr[17] = read("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string2) ? 1.0f : 0.0f;
            fArr[18] = str2.contains("password") ? 1.0f : 0.0f;
            fArr[19] = read("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = read("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = read("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = read("ENGLISH", "PURCHASE", "BUTTON_TEXT", string3) ? 1.0f : 0.0f;
            fArr[24] = read("ENGLISH", "PURCHASE", "PAGE_TITLE", string) ? 1.0f : 0.0f;
            fArr[25] = read("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string3) ? 1.0f : 0.0f;
            fArr[27] = read("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", string) ? 1.0f : 0.0f;
            fArr[28] = read("ENGLISH", "LEAD", "BUTTON_TEXT", string3) ? 1.0f : 0.0f;
            if (read("ENGLISH", "LEAD", "PAGE_TITLE", string)) {
                f = 1.0f;
            }
            fArr[29] = f;
            return fArr;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return null;
        }
    }

    private static boolean read(String str, String str2, String str3, String str4) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return false;
        }
        try {
            return read(write.optJSONObject("rulesForLanguage").optJSONObject(RemoteActionCompatParcelizer.get(str)).optJSONObject("rulesForEvent").optJSONObject(read.get(str2)).optJSONObject("positiveRules").optString(IconCompatParcelizer.get(str3)), str4);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return false;
        }
    }

    private static boolean read(String str, String str2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return false;
        }
    }

    private static boolean AudioAttributesCompatParcelizer(String[] strArr, String[] strArr2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (str2.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return false;
        }
    }

    private static boolean IconCompatParcelizer(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i >= jSONArrayOptJSONArray.length()) {
                    z = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    break;
                }
                i++;
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                }
                return true;
            }
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                if (IconCompatParcelizer(jSONObject2, jSONArray)) {
                    jSONArray2.put(jSONObject2);
                    z = true;
                }
            }
            jSONObject.put("childviews", jSONArray2);
            return z;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return false;
        }
    }

    private static void AudioAttributesCompatParcelizer(float[] fArr, float[] fArr2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            try {
                fArr[i] = fArr[i] + fArr2[i];
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
                return;
            }
        }
    }

    private static boolean read(JSONObject jSONObject) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return false;
        }
        try {
            return (jSONObject.optInt("classtypebitmask") & 32) > 0;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
            return false;
        }
    }

    private static void read(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return;
        }
        try {
            String lowerCase = jSONObject.optString("text", "").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
            if (!lowerCase.isEmpty()) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (!lowerCase2.isEmpty()) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    try {
                        read(jSONArrayOptJSONArray.getJSONObject(i), sb, sb2);
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
        }
    }

    private static JSONObject AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda5.class)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jSONArrayOptJSONArray.getJSONObject(i));
                if (jSONObjectAudioAttributesCompatParcelizer != null) {
                    return jSONObjectAudioAttributesCompatParcelizer;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda5.class);
        }
        return null;
    }
}
