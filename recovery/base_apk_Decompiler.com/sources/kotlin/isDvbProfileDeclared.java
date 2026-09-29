package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class isDvbProfileDeclared {
    public static final void write(JSONObject jSONObject, String str, String str2) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (str2 == null) {
            str2 = "";
        }
        write(jSONObject, str, (Object) str2);
    }

    public static final void read(JSONObject jSONObject, String str, Number number) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        write(jSONObject, str, number);
    }

    public static final void AudioAttributesCompatParcelizer(JSONObject jSONObject, String str, Boolean bool) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        write(jSONObject, str, bool);
    }

    public static final void read(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        write(jSONObject, str, jSONObject2);
    }

    public static final void write(JSONObject jSONObject, String str, JSONArray jSONArray) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        write(jSONObject, str, (Object) jSONArray);
    }

    public static final void read(JSONObject jSONObject, String str, String[] strArr) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        JSONArray jSONArray = new JSONArray();
        if (strArr != null) {
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
        }
        write(jSONObject, str, (Object) jSONArray);
    }

    private static final void write(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
        }
    }

    public static final <T extends notifyManifestPublishTimeExpired> T write(JSONObject jSONObject, T t) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(t, "");
        t.fromJSON(jSONObject);
        return t;
    }

    public static final <T> Map<String, T> read(JSONObject jSONObject, getAnswerMap<? super String, ? extends T> getanswermap) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            toMagicModuleMetaRepoModel.write((Object) next);
            linkedHashMap.put(next, getanswermap.invoke(next));
        }
        return linkedHashMap;
    }

    public static final <T> List<T> read(JSONArray jSONArray, getAnswerMap<? super JSONObject, ? extends T> getanswermap) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(getanswermap.invoke(RemoteActionCompatParcelizer(jSONArray.optJSONObject(i))));
        }
        return arrayList;
    }

    private static <T> List<T> write(JSONArray jSONArray, getAnswerMap<? super Integer, ? extends T> getanswermap) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(getanswermap.invoke(Integer.valueOf(i)));
        }
        return arrayList;
    }

    public static final JSONArray write(JSONArray jSONArray) {
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public static final JSONObject RemoteActionCompatParcelizer(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IconCompatParcelizer(JSONArray jSONArray, int i) {
        return jSONArray.optString(i);
    }

    public static final List<String> IconCompatParcelizer(final JSONArray jSONArray) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        return write(jSONArray, new getAnswerMap() { // from class: o.getFinalAvailabilityTimeOffset
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return isDvbProfileDeclared.IconCompatParcelizer(jSONArray, ((Integer) obj).intValue());
            }
        });
    }
}
