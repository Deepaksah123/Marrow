package kotlin;

import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleFeedbackRequestBody;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.feedback.remote.model.ComplainRequestBody;
import com.marrow2.data.feedback.remote.model.FeedbackRequestBody;
import com.marrow2.data.feedback.remote.model.FeedbackResponseBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\u0006\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lo/LoadErrorHandlingPolicyFallbackOptions;", "", "Lcom/marrow2/data/feedback/remote/model/FeedbackRequestBody;", "p0", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow2/data/feedback/remote/model/FeedbackResponseBody;", "RemoteActionCompatParcelizer", "(Lcom/marrow2/data/feedback/remote/model/FeedbackRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/feedback/remote/model/ComplainRequestBody;", "(Lcom/marrow2/data/feedback/remote/model/ComplainRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/isFallbackAvailable;", "Lcom/marrow/data/api/models/response/common/RatingResponseBody;", "write", "(Lo/isFallbackAvailable;Lo/SampleVideos;)Ljava/lang/Object;", "", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;", "p1", "IconCompatParcelizer", "(Ljava/lang/String;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoadErrorHandlingPolicyFallbackOptions {
    @getReviewTimeMs(read = "smart_recall/{id}/feedback")
    Object IconCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MagicModuleFeedbackRequestBody magicModuleFeedbackRequestBody, SampleVideos<? super NetworkApiResponse<FeedbackResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "feedback")
    Object RemoteActionCompatParcelizer(@getTimeTook ComplainRequestBody complainRequestBody, SampleVideos<? super NetworkApiResponse<FeedbackResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "feedback")
    Object RemoteActionCompatParcelizer(@getTimeTook FeedbackRequestBody feedbackRequestBody, SampleVideos<? super NetworkApiResponse<FeedbackResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "feedback/i/feedback_rating")
    Object write(@getTimeTook isFallbackAvailable isfallbackavailable, SampleVideos<? super NetworkApiResponse<RatingResponseBody>> sampleVideos);
}
