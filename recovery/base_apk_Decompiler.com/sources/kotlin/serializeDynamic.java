package kotlin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class serializeDynamic {
    public static byte[] AudioAttributesCompatParcelizer(byte[] bArr) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 27 ? bArr : LaissezFaireSubTypeValidator.IconCompatParcelizer(RemoteActionCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(bArr)));
    }

    public static byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(AudioAttributesCompatParcelizer(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(AudioAttributesCompatParcelizer(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return LaissezFaireSubTypeValidator.IconCompatParcelizer(sb.toString());
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("Failed to adjust response data: ");
            sb2.append(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(bArr));
            prune.read("ClearKeyUtil", sb2.toString(), e);
            return bArr;
        }
    }

    private static String RemoteActionCompatParcelizer(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String AudioAttributesCompatParcelizer(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
