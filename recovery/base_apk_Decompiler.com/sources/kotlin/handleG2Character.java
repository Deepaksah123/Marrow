package kotlin;

import com.marrow.data.api.models.request.PlayIntegrityTokenRequestBody;
import com.marrow.data.api.models.request.common.SecurityRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.common.AttestationResponseBody;
import com.marrow.data.api.models.response.common.FIDResponseBody;
import com.marrow.data.api.models.response.common.SecurityResponseBody;
import com.marrow.data.api.models.response.security.playintegrity.PlayIntegrityResponseBody;
import com.marrow2.data.user.remote.model.ImageTokenRSModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\r\u0010\u0011J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lo/handleG2Character;", "", "Lcom/marrow/data/api/models/request/common/SecurityRequestBody;", "p0", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/response/ApiResponse;", "Lcom/marrow/data/api/models/response/common/SecurityResponseBody;", "AudioAttributesCompatParcelizer", "(Lcom/marrow/data/api/models/request/common/SecurityRequestBody;)Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/response/common/FIDResponseBody;", "read", "Lcom/marrow/data/api/models/request/PlayIntegrityTokenRequestBody;", "Lcom/marrow/data/api/models/response/security/playintegrity/PlayIntegrityResponseBody;", "RemoteActionCompatParcelizer", "(Lcom/marrow/data/api/models/request/PlayIntegrityTokenRequestBody;)Lo/LessonDynamicResponseBody;", "", "Lcom/marrow2/data/user/remote/model/ImageTokenRSModel;", "(Ljava/lang/String;)Lo/LessonDynamicResponseBody;", "Lo/ThemeKtExternalSyntheticLambda2;", "Lcom/marrow/data/api/models/response/common/AttestationResponseBody;", "IconCompatParcelizer", "(Lo/ThemeKtExternalSyntheticLambda2;)Lo/LessonDynamicResponseBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface handleG2Character {
    @getReviewTimeMs(read = "dr_device/i/log_device_info")
    LessonDynamicResponseBody<ApiResponse<SecurityResponseBody>> AudioAttributesCompatParcelizer(@getTimeTook SecurityRequestBody p0);

    @getReviewTimeMs(read = "dr_device/i/log_dv_a_attr")
    LessonDynamicResponseBody<ApiResponse<AttestationResponseBody>> IconCompatParcelizer(@getTimeTook ThemeKtExternalSyntheticLambda2 p0);

    @getReviewTimeMs(read = "dr_device/i/0x9Bq4T2aMZ8")
    LessonDynamicResponseBody<ApiResponse<PlayIntegrityResponseBody>> RemoteActionCompatParcelizer(@getTimeTook PlayIntegrityTokenRequestBody p0);

    @setMcqTimingDetails(read = "user/i/get_timezone")
    LessonDynamicResponseBody<ApiResponse<ImageTokenRSModel>> RemoteActionCompatParcelizer(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String p0);

    @getReviewTimeMs(read = "dr_device/i/event")
    LessonDynamicResponseBody<ApiResponse<FIDResponseBody>> read(@getTimeTook SecurityRequestBody p0);
}
