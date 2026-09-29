package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.video.UserDeviceInfoModel;
import com.marrow.data.api.models.response.video.PlaybackSettings;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserChunkExtractorTrackOutputProviderAdapter implements MediaParserChunkExtractorExternalSyntheticLambda0 {
    private final compareBaseUrl IconCompatParcelizer;

    @setSdkPayload
    public MediaParserChunkExtractorTrackOutputProviderAdapter(compareBaseUrl comparebaseurl) {
        toMagicModuleMetaRepoModel.write(comparebaseurl, "");
        this.IconCompatParcelizer = comparebaseurl;
    }

    @Override // kotlin.MediaParserChunkExtractorExternalSyntheticLambda0
    public final LessonDynamicResponseBody<MarrowResponse<PlaybackSettings>> RemoteActionCompatParcelizer(UserDeviceInfoModel userDeviceInfoModel) {
        toMagicModuleMetaRepoModel.write(userDeviceInfoModel, "");
        return ResponseExtensionsKt.toMarrowResponse(this.IconCompatParcelizer.read(userDeviceInfoModel));
    }
}
