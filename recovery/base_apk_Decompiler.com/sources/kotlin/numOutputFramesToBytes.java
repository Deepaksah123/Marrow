package kotlin;

import kotlin.readFileType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
final class numOutputFramesToBytes implements WavExtractorExternalSyntheticLambda0 {
    numOutputFramesToBytes() {
    }

    @Override // kotlin.WavExtractorExternalSyntheticLambda0
    public final readFileType IconCompatParcelizer(isVclBodyNalUnit isvclbodynalunit, JSONObject jSONObject) throws JSONException {
        readFileType.read readVar;
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            readVar = read(jSONObject.getJSONObject("session"));
        } else {
            readVar = read(new JSONObject());
        }
        return new readFileType(IconCompatParcelizer(isvclbodynalunit, iOptInt2, jSONObject), readVar, AudioAttributesCompatParcelizer(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, dOptDouble, dOptDouble2, iOptInt3);
    }

    private static readFileType.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        return new readFileType.AudioAttributesCompatParcelizer(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static readFileType.read read(JSONObject jSONObject) {
        return new readFileType.read(jSONObject.optInt("max_custom_exception_events", 8));
    }

    private static long IconCompatParcelizer(isVclBodyNalUnit isvclbodynalunit, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return isvclbodynalunit.RemoteActionCompatParcelizer() + (j * 1000);
    }
}
