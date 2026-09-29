package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.common.KycRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.common.KycResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class withContentDurationUs implements withAdResumePositionUs {
    private final TrackGroupExternalSyntheticLambda0 read;

    @setSdkPayload
    public withContentDurationUs(TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(trackGroupExternalSyntheticLambda0, "");
        this.read = trackGroupExternalSyntheticLambda0;
    }

    @Override // kotlin.withAdResumePositionUs
    public final MarrowResponse<KycResponseBody> read(String str, String str2, String str3, int i, int i2, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        SearchTextResponseBody<ApiResponse<KycResponseBody>> searchTextResponseBodyAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(str3, new KycRequestBody(str, str2, i, str4, i2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(searchTextResponseBodyAudioAttributesCompatParcelizer, "");
        return ResponseExtensionsKt.executeSync(searchTextResponseBodyAudioAttributesCompatParcelizer);
    }
}
