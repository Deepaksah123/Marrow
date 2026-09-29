package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.video.components.playbackurl.remote.models.L3FallbackApprovalResponseBody;
import com.marrow.video.components.playbackurl.remote.models.TemporarySessionResponseBody;
import com.marrow.video.components.playbackurl.remote.models.VideoPlaybackRSModel;
import com.marrow.video.components.playbackurl.remote.models.VideoResolutionDownloadResponseBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH'¢\u0006\u0004\b\r\u0010\u0011J/\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lo/setSmallIconResourceId;", "", "", "p0", "Lo/PlayerNotificationManagerCustomActionReceiver;", "p1", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/api/models/response/ApiResponse;", "Lcom/marrow/video/components/playbackurl/remote/models/VideoPlaybackRSModel;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/PlayerNotificationManagerCustomActionReceiver;)Lo/accessgetEmptyStatecp;", "Lo/getCurrentSubText;", "Lcom/marrow/video/components/playbackurl/remote/models/VideoResolutionDownloadResponseBody;", "read", "(Ljava/lang/String;Lo/getCurrentSubText;)Lo/accessgetEmptyStatecp;", "Lo/createCustomActions;", "Lcom/marrow/video/components/playbackurl/remote/models/TemporarySessionResponseBody;", "(Ljava/lang/String;Lo/createCustomActions;)Lo/accessgetEmptyStatecp;", "Lo/setPreviousActionIconResourceId;", "Lcom/marrow/video/components/playbackurl/remote/models/L3FallbackApprovalResponseBody;", "write", "(Ljava/lang/String;Lo/setPreviousActionIconResourceId;)Lo/accessgetEmptyStatecp;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface setSmallIconResourceId {
    @getReviewTimeMs(read = "dr_locale/c2IKAlP3LuX05Tn/JOGz4j4Cya6vXvU")
    accessgetEmptyStatecp<ApiResponse<VideoPlaybackRSModel>> AudioAttributesCompatParcelizer(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String p0, @getTimeTook PlayerNotificationManagerCustomActionReceiver p1);

    @getReviewTimeMs(read = "dr_locale/BkhNvkL55YP2ku0/Esb84w1nTVtMetl")
    accessgetEmptyStatecp<ApiResponse<TemporarySessionResponseBody>> read(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String p0, @getTimeTook createCustomActions p1);

    @getReviewTimeMs(read = "dr_locale/G2ed4sBwrpoTi6r/ZYaZAoT4tWXX7Ss")
    accessgetEmptyStatecp<ApiResponse<VideoResolutionDownloadResponseBody>> read(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String p0, @getTimeTook getCurrentSubText p1);

    @getReviewTimeMs(read = "dr_locale/nW5hPkucqoT9VeF/kZHPSzCsDzHBzk3")
    accessgetEmptyStatecp<ApiResponse<L3FallbackApprovalResponseBody>> write(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String p0, @getTimeTook setPreviousActionIconResourceId p1);
}
