package kotlin;

import kotlin.SimpleBasePlayerExternalSyntheticLambda12;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerExternalSyntheticLambda11 {
    public static final SimpleBasePlayerExternalSyntheticLambda12 write(JSONObject jSONObject, String str) {
        int write;
        toMagicModuleMetaRepoModel.write(str, "");
        if (jSONObject != null) {
            write = jSONObject.optInt(str, SimpleBasePlayerExternalSyntheticLambda12.write.getWrite());
        } else {
            write = SimpleBasePlayerExternalSyntheticLambda12.write.getWrite();
        }
        SimpleBasePlayerExternalSyntheticLambda12.Companion companion = SimpleBasePlayerExternalSyntheticLambda12.INSTANCE;
        return SimpleBasePlayerExternalSyntheticLambda12.Companion.write(write);
    }
}
