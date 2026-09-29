package kotlin;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class decreaseVolume {
    private final JSONObject RemoteActionCompatParcelizer;
    private final JSONArray read;

    public decreaseVolume(JSONObject jSONObject, JSONArray jSONArray) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        this.RemoteActionCompatParcelizer = jSONObject;
        this.read = jSONArray;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(',');
        String string = this.read.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String strSubstring = string.substring(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        sb.append(strSubstring);
        return sb.toString();
    }
}
