package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda39;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda27 {
    private static boolean IconCompatParcelizer = false;
    private static boolean read = false;

    public static void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda27.class)) {
            return;
        }
        try {
            IconCompatParcelizer = true;
            read = DefaultAnalyticsCollectorExternalSyntheticLambda63.AudioAttributesCompatParcelizer("FBSDKFeatureIntegritySample", lambdaonMediaMetadataChanged48.write(), false);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda27.class);
        }
    }

    public static void AudioAttributesCompatParcelizer(Map<String, String> map) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda27.class)) {
            return;
        }
        try {
            if (!IconCompatParcelizer || map.size() == 0) {
                return;
            }
            try {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : arrayList) {
                    String str2 = map.get(str);
                    if (AudioAttributesCompatParcelizer(str) || AudioAttributesCompatParcelizer(str2)) {
                        map.remove(str);
                        if (!read) {
                            str2 = "";
                        }
                        jSONObject.put(str, str2);
                    }
                }
                if (jSONObject.length() != 0) {
                    map.put("_onDeviceParams", jSONObject.toString());
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda27.class);
        }
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda27.class)) {
            return false;
        }
        try {
            return !"none".equals(write(str));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda27.class);
            return false;
        }
    }

    private static String write(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda27.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            String[] strArr = DefaultAnalyticsCollectorExternalSyntheticLambda39.read(DefaultAnalyticsCollectorExternalSyntheticLambda39.AudioAttributesCompatParcelizer.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            return strArr == null ? "none" : strArr[0];
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda27.class);
            return null;
        }
    }
}
