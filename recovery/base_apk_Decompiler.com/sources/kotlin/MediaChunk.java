package kotlin;

import com.marrow.data.models.user.UserConfigResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaChunk implements getDataHolder {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;

    @setSdkPayload
    public MediaChunk(getStreamPositionUsForContent getstreampositionusforcontent) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
    }

    @Override // kotlin.getDataHolder
    public final void read(UserConfigResponse userConfigResponse) {
        toMagicModuleMetaRepoModel.write(userConfigResponse, "");
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer("user_config_data", UserConfigResponse.INSTANCE.toJson(userConfigResponse));
        AdaptationSet.read(this.AudioAttributesCompatParcelizer, "userConfigLastSYnc", System.currentTimeMillis());
    }
}
