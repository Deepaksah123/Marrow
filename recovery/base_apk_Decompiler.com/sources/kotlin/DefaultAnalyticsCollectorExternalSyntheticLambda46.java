package kotlin;

import android.content.SharedPreferences;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultAnalyticsCollectorExternalSyntheticLambda46 {
    private static final Map<String, String> AudioAttributesCompatParcelizer = new HashMap();
    private static final AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);
    private static SharedPreferences read;

    DefaultAnalyticsCollectorExternalSyntheticLambda46() {
    }

    private static void read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda46.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = IconCompatParcelizer;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            read = sharedPreferences;
            AudioAttributesCompatParcelizer.putAll(DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda46.class);
        }
    }

    static void AudioAttributesCompatParcelizer(String str, String str2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda46.class)) {
            return;
        }
        try {
            if (!IconCompatParcelizer.get()) {
                read();
            }
            Map<String, String> map = AudioAttributesCompatParcelizer;
            map.put(str, str2);
            read.edit().putString("SUGGESTED_EVENTS_HISTORY", DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(map)).apply();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda46.class);
        }
    }

    static String RemoteActionCompatParcelizer(View view, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda46.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = DefaultAnalyticsCollectorExternalSyntheticLambda17.AudioAttributesImplApi26Parcelizer(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(jSONObject.toString());
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda46.class);
            return null;
        }
    }

    static String write(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda46.class)) {
            return null;
        }
        try {
            Map<String, String> map = AudioAttributesCompatParcelizer;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda46.class);
            return null;
        }
    }
}
