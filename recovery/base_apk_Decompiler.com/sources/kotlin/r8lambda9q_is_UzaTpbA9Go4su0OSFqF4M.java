package kotlin;

import com.marrow.data.api.models.response.common.LearnMoreResponse;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.common.Editor;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.course_config.remote.model.SampleVideosRSModel;
import com.marrow2.data.course_config.remote.model.ShareCopyRSModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u000fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lo/r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M;", "", "", "p0", "p1", "p2", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow/data/api/models/response/common/LearnMoreResponse;", "AudioAttributesCompatParcelizer", "(IIILo/SampleVideos;)Ljava/lang/Object;", "", "Lcom/marrow/data/models/common/Editor;", "write", "(ILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/course_config/remote/model/SampleVideosRSModel;", "(IILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/course_config/remote/model/ShareCopyRSModel;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M {
    @setMcqTimingDetails(read = "course_config/i/learn_more_data")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = FilterParams.KEY_COURSE_ID) int i, @RankPairModel(read = "edition") int i2, @RankPairModel(read = CourseConfigKeyConstantsKt.KEY_CONFIG_VERSION) int i3, SampleVideos<? super NetworkApiResponse<LearnMoreResponse>> sampleVideos);

    @setMcqTimingDetails(read = "course_config/i/sample_video_config")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = FilterParams.KEY_COURSE_ID) int i, @RankPairModel(read = "edition") int i2, SampleVideos<? super NetworkApiResponse<SampleVideosRSModel>> sampleVideos);

    @setMcqTimingDetails(read = "course_config/i/copies_config")
    Object IconCompatParcelizer(@RankPairModel(read = FilterParams.KEY_COURSE_ID) int i, @RankPairModel(read = "edition") int i2, SampleVideos<? super NetworkApiResponse<ShareCopyRSModel>> sampleVideos);

    @setMcqTimingDetails(read = "editor")
    Object write(@RankPairModel(read = "edition") int i, SampleVideos<? super NetworkApiResponse<Editor[]>> sampleVideos);
}
