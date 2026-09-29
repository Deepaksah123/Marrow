package kotlin;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetDeviceVolume22 {
    private lambdasetDeviceVolume23 IconCompatParcelizer;
    private JSONArray read;
    private String write;

    public lambdasetDeviceVolume22(lambdasetDeviceVolume23 lambdasetdevicevolume23) {
        toMagicModuleMetaRepoModel.write(lambdasetdevicevolume23, "");
        this.IconCompatParcelizer = lambdasetdevicevolume23;
    }

    public final lambdasetDeviceVolume23 IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final JSONArray read() {
        return this.read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        JSONArray jSONArray = this.read;
        return this.write == null || jSONArray == null || jSONArray.length() <= 0;
    }

    public final void read(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            if (itKeys.hasNext()) {
                String next = itKeys.next();
                this.write = next;
                try {
                    this.read = jSONObject.getJSONArray(next);
                } catch (JSONException unused) {
                    this.write = null;
                    this.read = null;
                }
            }
        }
    }

    public final String toString() {
        JSONArray jSONArray = this.read;
        int length = jSONArray != null ? jSONArray.length() : 0;
        if (AudioAttributesCompatParcelizer()) {
            StringBuilder sb = new StringBuilder("table: ");
            sb.append(this.IconCompatParcelizer);
            sb.append(" | numItems: ");
            sb.append(length);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("table: ");
        sb2.append(this.IconCompatParcelizer);
        sb2.append(" | lastId: ");
        sb2.append(this.write);
        sb2.append(" | numItems: ");
        sb2.append(length);
        sb2.append(" | items: ");
        sb2.append(this.read);
        return sb2.toString();
    }
}
