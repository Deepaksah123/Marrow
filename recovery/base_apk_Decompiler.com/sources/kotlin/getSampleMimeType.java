package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u000f"}, d2 = {"Lo/getSampleMimeType;", "", "<init>", "()V", "Lorg/json/JSONObject;", "", "p0", "write", "(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;", "Lo/notifyManifestPublishTimeExpired;", "T", "p1", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/notifyManifestPublishTimeExpired;)Lo/notifyManifestPublishTimeExpired;", "", "(Lorg/json/JSONObject;)Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSampleMimeType {
    public static final getSampleMimeType INSTANCE = new getSampleMimeType();

    private getSampleMimeType() {
    }

    public static JSONObject write(JSONObject jSONObject, String str) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        JSONObject jSONObjectPut = new JSONObject().put(str, jSONObject);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        return jSONObjectPut;
    }

    @getMagicModuleMeta
    public static final <T extends notifyManifestPublishTimeExpired> T RemoteActionCompatParcelizer(String p0, T p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 == null) {
            p0 = "";
        }
        JSONObject jSONObjectAudioAttributesCompatParcelizer = parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(p0);
        if (jSONObjectAudioAttributesCompatParcelizer != null) {
            return (T) isDvbProfileDeclared.write(jSONObjectAudioAttributesCompatParcelizer, p1);
        }
        return null;
    }

    public static Map<String, String> write(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
        getTopRankers gettoprankers = StateResult.read((Iterator) itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itWrite = gettoprankers.write();
        while (itWrite.hasNext()) {
            Object next = itWrite.next();
            linkedHashMap.put(next, jSONObject.optString((String) next));
        }
        return linkedHashMap;
    }
}
