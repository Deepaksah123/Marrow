package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda18 {
    public final String AudioAttributesCompatParcelizer;
    public final List<DefaultAnalyticsCollectorExternalSyntheticLambda14> IconCompatParcelizer;
    public final String read;
    public final String write;

    public DefaultAnalyticsCollectorExternalSyntheticLambda18(JSONObject jSONObject) throws JSONException {
        this.write = jSONObject.getString("name");
        this.AudioAttributesCompatParcelizer = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new DefaultAnalyticsCollectorExternalSyntheticLambda14(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        this.IconCompatParcelizer = arrayList;
        this.read = jSONObject.optString("path_type", "absolute");
    }
}
