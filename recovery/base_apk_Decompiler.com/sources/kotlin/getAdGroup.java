package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.common.FeedbackRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.common.FeedbackResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdGroup {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final SingleSampleMediaPeriodSourceLoadable RemoteActionCompatParcelizer;

    @setSdkPayload
    public getAdGroup(SingleSampleMediaPeriodSourceLoadable singleSampleMediaPeriodSourceLoadable, getStreamPositionUsForContent getstreampositionusforcontent) {
        toMagicModuleMetaRepoModel.write(singleSampleMediaPeriodSourceLoadable, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.RemoteActionCompatParcelizer = singleSampleMediaPeriodSourceLoadable;
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
    }

    public final accessgetEmptyStatecp<MarrowResponse<FeedbackResponseBody>> read(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        accessgetEmptyStatecp<ApiResponse<FeedbackResponseBody>> accessgetemptystatecpIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(new FeedbackRequestBody(this.AudioAttributesCompatParcelizer.onRemoveQueueItem()).setContentType(str).setContentId(str2).setTitle(str3).setType(1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpIconCompatParcelizer, "");
        return ResponseExtensionsKt.toMarrowResponse(accessgetemptystatecpIconCompatParcelizer);
    }
}
