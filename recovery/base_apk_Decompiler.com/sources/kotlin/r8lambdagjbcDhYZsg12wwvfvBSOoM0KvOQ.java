package kotlin;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ {
    private final JSONArray RemoteActionCompatParcelizer;
    private final JSONObject read;

    public r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ(JSONObject jSONObject, JSONArray jSONArray) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        this.read = jSONObject;
        this.RemoteActionCompatParcelizer = jSONArray;
    }

    public final JSONObject AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final JSONArray write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        if (this.read == null) {
            String string = this.RemoteActionCompatParcelizer.toString();
            toMagicModuleMetaRepoModel.write((Object) string);
            return string;
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.read);
        sb.append(',');
        String string2 = this.RemoteActionCompatParcelizer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String strSubstring = string2.substring(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        sb.append(strSubstring);
        return sb.toString();
    }
}
