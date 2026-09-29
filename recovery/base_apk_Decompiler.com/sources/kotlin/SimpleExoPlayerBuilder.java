package kotlin;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleExoPlayerBuilder implements setTotalBufferedDurationMs {
    private final addAllCommands write;

    public SimpleExoPlayerBuilder(addAllCommands addallcommands) {
        toMagicModuleMetaRepoModel.write(addallcommands, "");
        this.write = addallcommands;
    }

    @Override // kotlin.setTotalBufferedDurationMs
    public final void AudioAttributesCompatParcelizer(JSONArray jSONArray, boolean z) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        if (jSONArray.length() == 0) {
            this.write.IconCompatParcelizer();
            return;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("evtData");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) jSONObjectOptJSONObject.optString("evtName"), (Object) "wzrk_fetch") && jSONObjectOptJSONObject2.optInt("t") == 5) {
                this.write.IconCompatParcelizer();
                return;
            }
        }
    }
}
