package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig;
import java.net.URL;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;", "invoke", "(Ljava/lang/String;)Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ReleaseConfig$Companion$resourcesFromJSON$entries$1 extends MagicModuleUseCase implements getAnswerMap<String, ReleaseConfig.Resource> {
    final /* synthetic */ JSONObject $json;

    @Override // kotlin.getAnswerMap
    public final ReleaseConfig.Resource invoke(String str) throws JSONException {
        JSONObject jSONObject = this.$json.getJSONObject(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        ReleaseConfig.Companion companion = ReleaseConfig.INSTANCE;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObject, "");
        URL url = companion.getURL(jSONObject, "url");
        String string = jSONObject.getString("version");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = jSONObject.getString("extension");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        return new ReleaseConfig.Resource(str, url, string, string2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReleaseConfig$Companion$resourcesFromJSON$entries$1(JSONObject jSONObject) {
        super(1);
        this.$json = jSONObject;
    }
}
