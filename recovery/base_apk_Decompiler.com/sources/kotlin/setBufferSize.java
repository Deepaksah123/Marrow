package kotlin;

import com.marrow.data.api.models.request.lesson.LessonDynamicApiRequestBody;
import com.marrow.data.api.models.response.lesson.LessonDynamicResponseBody;
import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.lesson.remote.model.MarkCompleteResponseBody;
import com.marrow2.data.lesson.remote.model.MarkLessonCompleteRequestBody;
import com.marrow2.data.lesson.remote.model.QBankStatsResponse;
import com.marrow2.data.lesson.remote.model.ResetLessonRequestBody;
import com.marrow2.data.lesson.remote.model.ResetLessonResponseBody;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH§@¢\u0006\u0004\b\f\u0010\u0012J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0013H§@¢\u0006\u0004\b\f\u0010\u0015J&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@¢\u0006\u0004\b\f\u0010\u0018À\u0006\u0003"}, d2 = {"Lo/setBufferSize;", "", "Lcom/marrow2/data/lesson/remote/model/ResetLessonRequestBody;", "p0", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow2/data/lesson/remote/model/ResetLessonResponseBody;", "write", "(Lcom/marrow2/data/lesson/remote/model/ResetLessonRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "", "Lcom/marrow/data/api/models/response/lesson/LessonResponseBody;", "Lcom/marrow2/data/lesson/remote/model/LessonDetailRSModel;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "", "p1", "p2", "Lcom/marrow2/data/lesson/remote/model/QBankStatsResponse;", "(Ljava/lang/String;IILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/lesson/remote/model/MarkLessonCompleteRequestBody;", "Lcom/marrow2/data/lesson/remote/model/MarkCompleteResponseBody;", "(Ljava/lang/String;Lcom/marrow2/data/lesson/remote/model/MarkLessonCompleteRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/api/models/request/lesson/LessonDynamicApiRequestBody;", "Lcom/marrow/data/api/models/response/lesson/LessonDynamicResponseBody;", "(Lcom/marrow/data/api/models/request/lesson/LessonDynamicApiRequestBody;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface setBufferSize {
    @getReviewTimeMs(read = "lesson/i/dynamics")
    Object AudioAttributesCompatParcelizer(@getTimeTook LessonDynamicApiRequestBody lessonDynamicApiRequestBody, SampleVideos<? super NetworkApiResponse<List<LessonDynamicResponseBody>>> sampleVideos);

    @setMcqTimingDetails(read = "lesson/i/qbank_stats")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = "Course_id") String str, @RankPairModel(read = "month") int i, @RankPairModel(read = "year") int i2, SampleVideos<? super NetworkApiResponse<QBankStatsResponse>> sampleVideos);

    @getReviewTimeMs(read = "lesson/{id}/result")
    Object AudioAttributesCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MarkLessonCompleteRequestBody markLessonCompleteRequestBody, SampleVideos<? super NetworkApiResponse<MarkCompleteResponseBody>> sampleVideos);

    @setMcqTimingDetails(read = "lesson/i/bulk")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = "_id") String str, SampleVideos<? super NetworkApiResponse<List<LessonResponseBody>>> sampleVideos);

    @getReviewTimeMs(read = "lesson/i/reset_all_attempt")
    Object write(@getTimeTook ResetLessonRequestBody resetLessonRequestBody, SampleVideos<? super NetworkApiResponse<ResetLessonResponseBody>> sampleVideos);
}
