package kotlin;

import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.timeline.VideoTimelineResponseBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\nÀ\u0006\u0003"}, d2 = {"Lo/SingleSampleMediaPeriod1;", "", "", "p0", "Lcom/marrow/data/api/models/request/MarrowRequestBody;", "p1", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/api/models/response/ApiResponse;", "Lcom/marrow/data/api/models/response/timeline/VideoTimelineResponseBody;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lcom/marrow/data/api/models/request/MarrowRequestBody;)Lo/accessgetEmptyStatecp;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SingleSampleMediaPeriod1 {
    @getReviewTimeMs(read = "video_timeline/{timeline_id}/bookmark")
    accessgetEmptyStatecp<ApiResponse<VideoTimelineResponseBody>> AudioAttributesCompatParcelizer(@setRankRange(IconCompatParcelizer = "timeline_id") String p0, @getTimeTook MarrowRequestBody p1);

    @getReviewTimeMs(read = "video_timeline/{timeline_id}/unbookmark")
    accessgetEmptyStatecp<ApiResponse<VideoTimelineResponseBody>> IconCompatParcelizer(@setRankRange(IconCompatParcelizer = "timeline_id") String p0, @getTimeTook MarrowRequestBody p1);
}
