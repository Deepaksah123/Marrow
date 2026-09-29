package kotlin;

import kotlin.SimpleBasePlayerExternalSyntheticLambda10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer {
    private final int AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final SimpleBasePlayerExternalSyntheticLambda10 read;

    public lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        SimpleBasePlayerExternalSyntheticLambda10.Companion companion = SimpleBasePlayerExternalSyntheticLambda10.INSTANCE;
        String strOptString = jSONObject.optString("type");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
        this.read = SimpleBasePlayerExternalSyntheticLambda10.Companion.read(strOptString);
        this.RemoteActionCompatParcelizer = jSONObject.optInt("limit");
        this.AudioAttributesCompatParcelizer = jSONObject.optInt("frequency");
    }

    public final SimpleBasePlayerExternalSyntheticLambda10 write() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
