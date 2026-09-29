package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class read {
    public static final Map<String, String> IconCompatParcelizer(Map<String, String> map, Map<String, String> map2) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : map.keySet()) {
            String str2 = map2.get(map.get(str));
            if (str2 == null) {
                str2 = map.get(str);
            }
            if (str2 != null) {
                linkedHashMap.put(str, str2);
            }
        }
        return linkedHashMap;
    }

    public static final JSONObject RemoteActionCompatParcelizer(JSONObject jSONObject, Map<String, String> map) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(map, "");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            String str = map.get(next);
            if (str != null) {
                next = str;
            }
            if (objOpt instanceof JSONObject) {
                objOpt = RemoteActionCompatParcelizer((JSONObject) objOpt, map);
            } else if (objOpt instanceof JSONArray) {
                objOpt = RemoteActionCompatParcelizer((JSONArray) objOpt, map);
            }
            jSONObject2.put(next, objOpt);
        }
        return jSONObject2;
    }

    private static final JSONArray RemoteActionCompatParcelizer(JSONArray jSONArray, Map<String, String> map) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                objOpt = RemoteActionCompatParcelizer((JSONObject) objOpt, map);
            } else if (objOpt instanceof JSONArray) {
                objOpt = RemoteActionCompatParcelizer((JSONArray) objOpt, map);
            }
            jSONArray2.put(objOpt);
        }
        return jSONArray2;
    }
}
