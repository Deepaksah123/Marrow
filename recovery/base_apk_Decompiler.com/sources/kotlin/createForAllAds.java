package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import kotlin.AdsMediaSourceAdLoadException;

/* JADX INFO: loaded from: classes3.dex */
public final class createForAllAds implements AdsMediaSourceAdLoadException.RemoteActionCompatParcelizer {
    private final appendSpan read;

    @setSdkPayload
    public createForAllAds(appendSpan appendspan) {
        toMagicModuleMetaRepoModel.write(appendspan, "");
        this.read = appendspan;
    }

    @Override // o.AdsMediaSourceAdLoadException.RemoteActionCompatParcelizer
    public final accessgetEmptyStatecp<MarrowResponse<LessonResponseBody>> IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        accessgetEmptyStatecp<ApiResponse<LessonResponseBody[]>> accessgetemptystatecpIconCompatParcelizer = this.read.IconCompatParcelizer(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpIconCompatParcelizer, "");
        return getManifestPublishTimeMsInEmsg.RemoteActionCompatParcelizer(ResponseExtensionsKt.toMarrowResponse(accessgetemptystatecpIconCompatParcelizer));
    }
}
