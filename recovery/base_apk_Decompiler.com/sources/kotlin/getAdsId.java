package kotlin;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class getAdsId {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public getAdsId(String str, String str2, String str3, String str4) {
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(" [PushType:");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("] ");
        return sb.toString();
    }

    public final JSONObject write() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ctProviderClassName", this.IconCompatParcelizer);
            jSONObject.put("messagingSDKClassName", this.read);
            jSONObject.put("tokenPrefKey", this.RemoteActionCompatParcelizer);
            jSONObject.put("type", this.AudioAttributesCompatParcelizer);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static getAdsId read(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("ctProviderClassName");
            String string2 = jSONObject.getString("messagingSDKClassName");
            return new getAdsId(jSONObject.getString("type"), jSONObject.getString("tokenPrefKey"), string, string2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAdsId)) {
            return false;
        }
        getAdsId getadsid = (getAdsId) obj;
        return Objects.equals(this.IconCompatParcelizer, getadsid.IconCompatParcelizer) && Objects.equals(this.read, getadsid.read) && Objects.equals(this.RemoteActionCompatParcelizer, getadsid.RemoteActionCompatParcelizer) && Objects.equals(this.AudioAttributesCompatParcelizer, getadsid.AudioAttributesCompatParcelizer);
    }

    public int hashCode() {
        return Objects.hash(this.IconCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }
}
