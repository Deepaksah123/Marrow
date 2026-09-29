package kotlin;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lo/addIf;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Lorg/json/JSONObject;", "IconCompatParcelizer", "(Landroid/os/Bundle;)Lorg/json/JSONObject;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addIf {
    public static final addIf INSTANCE = new addIf();

    private addIf() {
    }

    @getMagicModuleMeta
    public static final JSONObject IconCompatParcelizer(Bundle p0) throws JSONException {
        toMagicModuleMetaRepoModel.write(p0, "");
        JSONObject jSONObject = new JSONObject();
        for (String str : p0.keySet()) {
            Object obj = p0.get(str);
            if (obj instanceof Bundle) {
                JSONObject jSONObjectIconCompatParcelizer = IconCompatParcelizer((Bundle) obj);
                Iterator<String> itKeys = jSONObjectIconCompatParcelizer.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectIconCompatParcelizer.get(next));
                }
            } else {
                toMagicModuleMetaRepoModel.write((Object) str);
                if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "wzrk_")) {
                    jSONObject.put(str, p0.get(str));
                }
            }
        }
        return jSONObject;
    }

    @getMagicModuleMeta
    public static final JSONObject AudioAttributesCompatParcelizer(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectIconCompatParcelizer = IconCompatParcelizer(p0);
            jSONObject.put("evtName", "Notification Viewed");
            jSONObject.put("evtData", jSONObjectIconCompatParcelizer);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @getMagicModuleMeta
    public static final JSONObject RemoteActionCompatParcelizer(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectIconCompatParcelizer = IconCompatParcelizer(p0);
            jSONObject.put("evtName", "Notification Clicked");
            jSONObject.put("evtData", jSONObjectIconCompatParcelizer);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
