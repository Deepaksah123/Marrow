package kotlin;

import com.marrow.data.api.models.request.video.UserDeviceInfoModel;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.video.PlaybackSettings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lo/compareBaseUrl;", "", "Lcom/marrow/data/api/models/request/video/UserDeviceInfoModel;", "p0", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/response/ApiResponse;", "Lcom/marrow/data/api/models/response/video/PlaybackSettings;", "read", "(Lcom/marrow/data/api/models/request/video/UserDeviceInfoModel;)Lo/LessonDynamicResponseBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface compareBaseUrl {
    @getReviewTimeMs(read = "client_config/playback/settings")
    LessonDynamicResponseBody<ApiResponse<PlaybackSettings>> read(@getTimeTook UserDeviceInfoModel p0);
}
