package kotlin;

import android.os.Bundle;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class isTransportReady {
    public static final Bundle RemoteActionCompatParcelizer(JSONObject jSONObject) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof String) {
                bundle.putString(next, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Number) obj).longValue());
            } else if (obj instanceof JSONObject) {
                bundle.putBundle(next, RemoteActionCompatParcelizer((JSONObject) obj));
            }
        }
        return bundle;
    }
}
