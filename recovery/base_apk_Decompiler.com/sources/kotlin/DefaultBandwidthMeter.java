package kotlin;

import com.marrow.data.api.models.response.common.LearnMoreResponse;
import com.marrow.data.models.common.Editor;
import com.marrow2.data.course_config.remote.model.SampleVideosRSModel;
import com.marrow2.data.course_config.remote.model.ShareCopyRSModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface DefaultBandwidthMeter {
    Object IconCompatParcelizer(int i, int i2, int i3, SampleVideos<? super LearnMoreResponse> sampleVideos);

    Object IconCompatParcelizer(int i, int i2, SampleVideos<? super ShareCopyRSModel> sampleVideos);

    Object RemoteActionCompatParcelizer(int i, int i2, SampleVideos<? super SampleVideosRSModel> sampleVideos);

    Object RemoteActionCompatParcelizer(int i, SampleVideos<? super List<? extends Editor>> sampleVideos);
}
