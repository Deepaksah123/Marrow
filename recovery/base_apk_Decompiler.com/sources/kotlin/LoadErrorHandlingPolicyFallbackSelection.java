package kotlin;

import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow2.data.feedback.remote.model.FeedbackResponseBody;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface LoadErrorHandlingPolicyFallbackSelection {
    Object IconCompatParcelizer(String str, int i, String str2, List<String> list, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(LoadErrorHandlingPolicyFallbackType loadErrorHandlingPolicyFallbackType, int i, String str, String str2, String str3, SampleVideos<? super FeedbackResponseBody> sampleVideos);

    Object read(String str, String str2, String str3, String str4, int i, int i2, List<String> list, SampleVideos<? super RatingResponseBody> sampleVideos);

    Object write(int i, String str, String str2, String str3, List<Integer> list, LoadErrorHandlingPolicyFallbackType loadErrorHandlingPolicyFallbackType, SampleVideos<? super FeedbackResponseBody> sampleVideos);
}
