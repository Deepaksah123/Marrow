package kotlin;

import com.marrow.data.api.models.request.common.KycRequestBody;
import com.marrow.data.api.models.request.user.FetchTokenRequest;
import com.marrow.data.api.models.request.user.ProRequestBody;
import com.marrow.data.api.models.request.user.SaveProfileRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.common.KycResponseBody;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.api.models.response.user.ProResponse;
import com.marrow.data.models.home.RecentUpdatesLastSyncedModel;
import com.marrow.data.models.user.Country;
import com.marrow.data.models.user.UserConfigResponse;

/* JADX INFO: loaded from: classes.dex */
public interface TrackGroupExternalSyntheticLambda0 {
    @getReviewTimeMs(read = "user_kyc/{id}/user_kyc_upload_v2")
    SearchTextResponseBody<ApiResponse<KycResponseBody>> AudioAttributesCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook KycRequestBody kycRequestBody);

    @setMcqTimingDetails(read = "qbank_updates/i/recent_published")
    accessgetEmptyStatecp<ApiResponse<RecentUpdatesLastSyncedModel>> AudioAttributesCompatParcelizer();

    @setMcqTimingDetails(read = "client_config/i/user_config")
    LessonDynamicResponseBody<ApiResponse<UserConfigResponse>> IconCompatParcelizer();

    @setMcqTimingDetails(read = "country")
    accessgetEmptyStatecp<ApiResponse<Country[]>> RemoteActionCompatParcelizer();

    @getReviewTimeMs(read = LoggedUserResponse.KEY_TOKEN)
    accessgetEmptyStatecp<ApiResponse<LoggedUserResponse>> RemoteActionCompatParcelizer(@getTimeTook FetchTokenRequest fetchTokenRequest);

    @getReviewTimeMs(read = "user/{id}/settings_v3")
    accessgetEmptyStatecp<ApiResponse<LoggedUserResponse>> RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook SaveProfileRequestBody saveProfileRequestBody);

    @getReviewTimeMs(read = "user/i/pro_request")
    accessgetEmptyStatecp<ApiResponse<ProResponse>> write(@getTimeTook ProRequestBody proRequestBody);
}
