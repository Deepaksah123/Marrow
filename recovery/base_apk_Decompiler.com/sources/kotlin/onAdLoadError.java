package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.api.models.request.common.RatingRequestBody;
import com.marrow.data.api.models.request.lesson.MarkVideoCompleteRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow.data.api.models.response.lesson.MarkCompleteResponseBody;
import com.marrow.data.api.models.response.lesson.MarkIncompleteResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class onAdLoadError implements onAdClicked {
    private final appendSpan AudioAttributesCompatParcelizer;

    @setSdkPayload
    public onAdLoadError(appendSpan appendspan) {
        toMagicModuleMetaRepoModel.write(appendspan, "");
        this.AudioAttributesCompatParcelizer = appendspan;
    }

    @Override // kotlin.onAdClicked
    public final LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> read(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonDynamicResponseBody<ApiResponse<MarkCompleteResponseBody>> lessonDynamicResponseBodyRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str, new MarkVideoCompleteRequestBody(i));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return ResponseExtensionsKt.toMarrowResponse(lessonDynamicResponseBodyRemoteActionCompatParcelizer);
    }

    @Override // kotlin.onAdClicked
    public final LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> AudioAttributesCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonDynamicResponseBody<ApiResponse<MarkIncompleteResponseBody>> lessonDynamicResponseBodyRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str, new MarrowRequestBody(i));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return ResponseExtensionsKt.toMarrowResponse(lessonDynamicResponseBodyRemoteActionCompatParcelizer);
    }

    @Override // kotlin.onAdClicked
    public final accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> read(String str, int i, String[] strArr, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        RatingRequestBody ratingRequestBody = new RatingRequestBody(i2, i);
        ratingRequestBody.tags = strArr;
        accessgetEmptyStatecp<ApiResponse<RatingResponseBody>> accessgetemptystatecp = this.AudioAttributesCompatParcelizer.read(str, ratingRequestBody);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecp, "");
        return ResponseExtensionsKt.toMarrowResponse(accessgetemptystatecp);
    }
}
