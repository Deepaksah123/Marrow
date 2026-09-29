package kotlin;

import android.os.Parcel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class onSeekStarted {
    public static final String write(JSONObject jSONObject, String str) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final void IconCompatParcelizer(JSONArray jSONArray, Object obj) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        int i = 0;
        while (i < jSONArray.length()) {
            Object obj2 = jSONArray.get(i);
            jSONArray.put(i, obj);
            i++;
            obj = obj2;
        }
        jSONArray.put(obj);
    }

    public static final JSONObject write(Parcel parcel) {
        toMagicModuleMetaRepoModel.write(parcel, "");
        try {
            String string = parcel.readString();
            if (string != null) {
                return new JSONObject(string);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final void IconCompatParcelizer(Parcel parcel, JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(parcel, "");
        parcel.writeString(jSONObject != null ? jSONObject.toString() : null);
    }

    public static final JSONArray write(JSONArray jSONArray, getAnswerMap<? super JSONObject, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && getanswermap.invoke(jSONObjectOptJSONObject).booleanValue()) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }
}
