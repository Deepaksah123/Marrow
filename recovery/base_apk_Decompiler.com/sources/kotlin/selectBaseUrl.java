package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.dataprovider.video.playbackconfig.remote.models.PlaybackConfigRootRequestBody;
import com.marrow.data.dataprovider.video.playbackconfig.remote.models.PlaybackConfigRootResponseBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lo/selectBaseUrl;", "", "", "p0", "Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRootRequestBody;", "p1", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/api/models/response/ApiResponse;", "Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRootResponseBody;", "write", "(Ljava/lang/String;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRootRequestBody;)Lo/accessgetEmptyStatecp;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface selectBaseUrl {
    @getReviewTimeMs(read = "dr_locale/8thp90mnIpSY3l7/gl5PmLzuijdiFFc")
    accessgetEmptyStatecp<ApiResponse<PlaybackConfigRootResponseBody>> write(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String p0, @getTimeTook PlaybackConfigRootRequestBody p1);
}
