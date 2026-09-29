package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.test.remote.model.GTAnalyticsV2ResponseModel;
import com.marrow2.data.test.remote.model.GTSubjectAnalyticsV2ResponseModel;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.createEglContext, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0007\u0010\fÀ\u0006\u0003"}, d2 = {"Lo/createEglContext;", "", "", "p0", "p1", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow2/data/test/remote/model/GTAnalyticsV2ResponseModel;", "read", "(IILo/SampleVideos;)Ljava/lang/Object;", "", "p2", "Lcom/marrow2/data/test/remote/model/GTSubjectAnalyticsV2ResponseModel;", "(IILjava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InterfaceC0166createEglContext {
    @setMcqTimingDetails(read = "test/i/gt_progress_v2")
    Object read(@RankPairModel(read = "limit") int i, @RankPairModel(read = FilterParams.KEY_COURSE_ID) int i2, @RankPairModel(read = "root_subject_id") String str, SampleVideos<? super NetworkApiResponse<GTSubjectAnalyticsV2ResponseModel>> sampleVideos);

    @setMcqTimingDetails(read = "test/i/gt_progress_v2")
    Object read(@RankPairModel(read = "limit") int i, @RankPairModel(read = FilterParams.KEY_COURSE_ID) int i2, SampleVideos<? super NetworkApiResponse<GTAnalyticsV2ResponseModel>> sampleVideos);
}
