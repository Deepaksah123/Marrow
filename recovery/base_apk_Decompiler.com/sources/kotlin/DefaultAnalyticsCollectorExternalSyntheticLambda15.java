package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda15 {
    private final String AudioAttributesCompatParcelizer;
    private final read AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final List<DefaultAnalyticsCollectorExternalSyntheticLambda18> MediaBrowserCompatCustomActionResultReceiver;
    private final List<DefaultAnalyticsCollectorExternalSyntheticLambda14> MediaBrowserCompatItemReceiver;
    private final IconCompatParcelizer RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public enum IconCompatParcelizer {
        /* JADX INFO: Fake field, exist only in values array */
        MANUAL,
        /* JADX INFO: Fake field, exist only in values array */
        INFERENCE
    }

    public enum read {
        /* JADX INFO: Fake field, exist only in values array */
        CLICK,
        /* JADX INFO: Fake field, exist only in values array */
        SELECTED,
        /* JADX INFO: Fake field, exist only in values array */
        TEXT_CHANGED
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda15(String str, IconCompatParcelizer iconCompatParcelizer, read readVar, String str2, List<DefaultAnalyticsCollectorExternalSyntheticLambda14> list, List<DefaultAnalyticsCollectorExternalSyntheticLambda18> list2, String str3, String str4, String str5) {
        this.write = str;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = readVar;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompatItemReceiver = list;
        this.MediaBrowserCompatCustomActionResultReceiver = list2;
        this.read = str3;
        this.AudioAttributesImplBaseParcelizer = str4;
        this.AudioAttributesCompatParcelizer = str5;
    }

    public static List<DefaultAnalyticsCollectorExternalSyntheticLambda15> IconCompatParcelizer(JSONArray jSONArray) {
        int length;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                length = jSONArray.length();
            } catch (IllegalArgumentException | JSONException unused) {
            }
        } else {
            length = 0;
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(AudioAttributesCompatParcelizer(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    private static DefaultAnalyticsCollectorExternalSyntheticLambda15 AudioAttributesCompatParcelizer(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        IconCompatParcelizer iconCompatParcelizerValueOf = IconCompatParcelizer.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        read readVarValueOf = read.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new DefaultAnalyticsCollectorExternalSyntheticLambda14(jSONArray.getJSONObject(i)));
        }
        String strOptString = jSONObject.optString("path_type", "absolute");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList2.add(new DefaultAnalyticsCollectorExternalSyntheticLambda18(jSONArrayOptJSONArray.getJSONObject(i2)));
            }
        }
        return new DefaultAnalyticsCollectorExternalSyntheticLambda15(string, iconCompatParcelizerValueOf, readVarValueOf, string2, arrayList, arrayList2, jSONObject.optString("component_id"), strOptString, jSONObject.optString("activity_name"));
    }

    public final List<DefaultAnalyticsCollectorExternalSyntheticLambda14> AudioAttributesCompatParcelizer() {
        return Collections.unmodifiableList(this.MediaBrowserCompatItemReceiver);
    }

    public final List<DefaultAnalyticsCollectorExternalSyntheticLambda18> write() {
        return Collections.unmodifiableList(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
