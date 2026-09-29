package kotlin;

import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.api.models.response.test.TestResponseBody;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.test.TestStatusResponse;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.test.remote.model.GTNudgeRSModel;
import com.marrow2.data.test.remote.model.GTNudgeRequestModel;
import com.marrow2.data.test.remote.model.MarkTestCompleteRequestBody;
import com.marrow2.data.test.remote.model.TestAnalyticsRSModel;
import com.marrow2.data.test.remote.model.TestScoreRSModel;
import com.marrow2.data.test.remote.model.TestTimerRSModel;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010JD\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072$\b\u0001\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\u0014H§@¢\u0006\u0002\u0010\u0015J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0003H§@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020%2\b\b\u0001\u0010\u000e\u001a\u00020&H§@¢\u0006\u0002\u0010'¨\u0006(À\u0006\u0003"}, d2 = {"Lcom/marrow2/data/test/remote/TestService;", "", "getTest", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lcom/marrow/data/models/test/TestIndex;", "testId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestDetail", "Lcom/marrow/data/api/models/response/test/TestResponseBody;", "getActiveDeviceInfo", "Lcom/marrow/data/models/test/TestStatusResponse;", "updateDeviceInfo", "requestBody", "Lcom/marrow/data/api/models/request/MarrowRequestBody;", "(Ljava/lang/String;Lcom/marrow/data/api/models/request/MarrowRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTestTimer", "Lcom/marrow2/data/test/remote/model/TestTimerRSModel;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitTest", "body", "Lcom/marrow2/data/test/remote/model/MarkTestCompleteRequestBody;", "(Ljava/lang/String;Lcom/marrow2/data/test/remote/model/MarkTestCompleteRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTopUsers", "Lcom/marrow2/data/test/remote/model/TestScoreRSModel;", "stateId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllIndiaTopUsers", "fetchAnalytics", "Lcom/marrow2/data/test/remote/model/TestAnalyticsRSModel;", "getGtNudgeStatus", "Lcom/marrow2/data/test/remote/model/GTNudgeRSModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeGTNudgeShownApiCall", "", "Lcom/marrow2/data/test/remote/model/GTNudgeRequestModel;", "(Lcom/marrow2/data/test/remote/model/GTNudgeRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GlProgram {
    @setMcqTimingDetails(read = "test")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = "_id") String str, SampleVideos<? super NetworkApiResponse<TestIndex[]>> sampleVideos);

    @setMcqTimingDetails(read = "test/{id}/result")
    Object IconCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, SampleVideos<? super NetworkApiResponse<TestScoreRSModel>> sampleVideos);

    @getReviewTimeMs(read = "/v3.1/test/i/gt_nudge")
    Object RemoteActionCompatParcelizer(@getTimeTook GTNudgeRequestModel gTNudgeRequestModel, SampleVideos<? super getShowPopup> sampleVideos);

    @setMcqTimingDetails(read = "test/{id}/analytics")
    Object RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, SampleVideos<? super NetworkApiResponse<TestAnalyticsRSModel>> sampleVideos);

    @setMcqTimingDetails(read = "test/{id}/result")
    Object read(@setRankRange(IconCompatParcelizer = "id") String str, @RankPairModel(read = "state_id") String str2, SampleVideos<? super NetworkApiResponse<TestScoreRSModel>> sampleVideos);

    @getReviewTimeMs(read = "test/{id}/start")
    Object read(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook HashMap<String, Object> map, SampleVideos<? super NetworkApiResponse<TestTimerRSModel>> sampleVideos);

    @setMcqTimingDetails(read = "test/i/bulk_v2")
    Object read(@RankPairModel(read = "_id") String str, SampleVideos<? super NetworkApiResponse<TestResponseBody[]>> sampleVideos);

    @getReviewTimeMs(read = "test/{id}/update_device_info")
    Object write(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MarrowRequestBody marrowRequestBody, SampleVideos<? super NetworkApiResponse<TestStatusResponse>> sampleVideos);

    @getReviewTimeMs(read = "test/{id}/result")
    Object write(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MarkTestCompleteRequestBody markTestCompleteRequestBody, SampleVideos<? super NetworkApiResponse<TestIndex>> sampleVideos);

    @setMcqTimingDetails(read = "test/{id}/test_status")
    Object write(@setRankRange(IconCompatParcelizer = "id") String str, SampleVideos<? super NetworkApiResponse<TestStatusResponse>> sampleVideos);

    @setMcqTimingDetails(read = "/v3.1/test/i/gt_nudge")
    Object write(SampleVideos<? super NetworkApiResponse<GTNudgeRSModel>> sampleVideos);
}
