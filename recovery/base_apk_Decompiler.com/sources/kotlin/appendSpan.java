package kotlin;

import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.api.models.request.common.RatingRequestBody;
import com.marrow.data.api.models.request.lesson.MarkVideoCompleteRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow.data.api.models.response.lesson.MarkCompleteResponseBody;
import com.marrow.data.api.models.response.lesson.MarkIncompleteResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public interface appendSpan {
    @setMcqTimingDetails(read = "lesson/i/bulk")
    accessgetEmptyStatecp<ApiResponse<LessonResponseBody[]>> IconCompatParcelizer(@RankPairModel(read = "_id") String str);

    @getReviewTimeMs(read = "lesson/{id}/reset_attempt")
    LessonDynamicResponseBody<ApiResponse<MarkIncompleteResponseBody>> RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MarrowRequestBody marrowRequestBody);

    @getReviewTimeMs(read = "lesson/{id}/result")
    LessonDynamicResponseBody<ApiResponse<MarkCompleteResponseBody>> RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MarkVideoCompleteRequestBody markVideoCompleteRequestBody);

    @getReviewTimeMs(read = "lesson/{lesson_id}/rating")
    accessgetEmptyStatecp<ApiResponse<RatingResponseBody>> read(@setRankRange(IconCompatParcelizer = "lesson_id") String str, @getTimeTook RatingRequestBody ratingRequestBody);
}
