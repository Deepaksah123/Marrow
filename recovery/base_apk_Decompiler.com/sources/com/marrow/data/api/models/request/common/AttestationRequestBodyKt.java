package com.marrow.data.api.models.request.common;

import kotlin.MediaType;
import kotlin.Metadata;
import kotlin.ThemeKtExternalSyntheticLambda2;
import kotlin.getSampleMimeType;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lorg/json/JSONObject;", "Lo/ThemeKtExternalSyntheticLambda2;", "toAttestationRequestBody", "(Lorg/json/JSONObject;)Lo/ThemeKtExternalSyntheticLambda2;", "", "KEY_ATTESTATION", "Ljava/lang/String;", "KEY_PARENT_KEY_ATTR", "MEDIA_CONTENT_TYPE_JSON"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AttestationRequestBodyKt {
    private static final String KEY_ATTESTATION = "attestation";
    private static final String KEY_PARENT_KEY_ATTR = "dv_a_attr";
    private static final String MEDIA_CONTENT_TYPE_JSON = "application/json";

    public static final ThemeKtExternalSyntheticLambda2 toAttestationRequestBody(JSONObject jSONObject) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        getSampleMimeType getsamplemimetype = getSampleMimeType.INSTANCE;
        getSampleMimeType getsamplemimetype2 = getSampleMimeType.INSTANCE;
        ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2Create = ThemeKtExternalSyntheticLambda2.create(MediaType.read(MEDIA_CONTENT_TYPE_JSON), getSampleMimeType.write(getSampleMimeType.write(jSONObject, KEY_ATTESTATION), KEY_PARENT_KEY_ATTR).toString());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(themeKtExternalSyntheticLambda2Create, "");
        return themeKtExternalSyntheticLambda2Create;
    }
}
