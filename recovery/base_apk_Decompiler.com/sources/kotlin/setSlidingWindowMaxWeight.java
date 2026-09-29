package kotlin;

import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow.data.api.models.response.custommodule.CustomModuleResponseBody;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.custommodule.CustomModule;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.lesson.remote.model.MarkCMQBCompleteRequestBody;
import com.marrow2.data.lesson.remote.model.MarkCompleteResponseBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\f\u0010\u000bJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\b\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\f\u001a\u00020\u00122\b\b\u0001\u0010\b\u001a\u00020\u0011H§@¢\u0006\u0004\b\f\u0010\u0013J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u000f\u0010\u0017J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\f\u0010\u0017J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0018\u0010\u0017À\u0006\u0003"}, d2 = {"Lo/setSlidingWindowMaxWeight;", "", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow/data/api/models/response/custommodule/CustomModuleQuotaResponseBody;", "Lcom/marrow2/data/custom_module/remote/model/CustomModuleQuotaModel;", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "p0", "Lcom/marrow/data/api/models/response/custommodule/CustomModuleResponseBody;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "read", "Lcom/marrow/data/models/custommodule/FilterParams;", "Lcom/marrow/data/models/custommodule/CustomModule;", "IconCompatParcelizer", "(Lcom/marrow/data/models/custommodule/FilterParams;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CmcdHeadersFactoryStreamType;", "", "(Lo/CmcdHeadersFactoryStreamType;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/lesson/remote/model/MarkCMQBCompleteRequestBody;", "p1", "Lcom/marrow2/data/lesson/remote/model/MarkCompleteResponseBody;", "(Ljava/lang/String;Lcom/marrow2/data/lesson/remote/model/MarkCMQBCompleteRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface setSlidingWindowMaxWeight {
    @setMcqTimingDetails(read = "custom_module/{id}")
    Object AudioAttributesCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, SampleVideos<? super NetworkApiResponse<CustomModuleResponseBody>> sampleVideos);

    @getReviewTimeMs(read = CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE)
    Object IconCompatParcelizer(@getTimeTook FilterParams filterParams, SampleVideos<? super NetworkApiResponse<CustomModule>> sampleVideos);

    @getReviewTimeMs(read = "custom_module/{id}/result")
    Object IconCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MarkCMQBCompleteRequestBody markCMQBCompleteRequestBody, SampleVideos<? super NetworkApiResponse<MarkCompleteResponseBody>> sampleVideos);

    @setMcqTimingDetails(read = "custom_module/i/custom_module_quota")
    Object RemoteActionCompatParcelizer(SampleVideos<? super NetworkApiResponse<CustomModuleQuotaResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "custom_module/{id}/result")
    Object read(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MarkCMQBCompleteRequestBody markCMQBCompleteRequestBody, SampleVideos<? super NetworkApiResponse<MarkCompleteResponseBody>> sampleVideos);

    @setMcqTimingDetails(read = "custom_module/i/custom_module_invite_code")
    Object read(@RankPairModel(read = "code") String str, SampleVideos<? super NetworkApiResponse<CustomModuleResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "custom_module/i/custom_module_quota_counter")
    Object read(@getTimeTook CmcdHeadersFactoryStreamType cmcdHeadersFactoryStreamType, SampleVideos<? super getShowPopup> sampleVideos);

    @getReviewTimeMs(read = "creator_mode_test/{id}/submit")
    Object write(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook MarkCMQBCompleteRequestBody markCMQBCompleteRequestBody, SampleVideos<? super NetworkApiResponse<MarkCompleteResponseBody>> sampleVideos);
}
