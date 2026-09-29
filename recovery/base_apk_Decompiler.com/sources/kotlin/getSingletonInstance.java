package kotlin;

import com.marrow.data.api.models.response.common.LearnMoreResponse;
import com.marrow.data.models.common.Editor;
import com.marrow2.data.user.remote.model.CourseModelV3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface getSingletonInstance {
    Object IconCompatParcelizer(int i, int i2, int i3, SampleVideos<? super LearnMoreResponse> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos);

    Object read(int i, int i2, SampleVideos<? super isTransferAtFullNetworkSpeed> sampleVideos);

    Object read(SampleVideos<? super List<CourseModelV3>> sampleVideos);

    Object write(int i, int i2, SampleVideos<? super onTransferStart> sampleVideos);

    Object write(int i, SampleVideos<? super List<? extends Editor>> sampleVideos);
}
