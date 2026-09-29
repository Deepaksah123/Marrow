package kotlin;

import com.marrow2.data.test.remote.model.GTAnalyticsV2RSModel;
import com.marrow2.data.test.remote.model.GTSubjectAnalyticsV2RSModel;

/* JADX INFO: loaded from: classes3.dex */
public interface FrameInfo1 {
    Object RemoteActionCompatParcelizer(int i, int i2, SampleVideos<? super GTAnalyticsV2RSModel> sampleVideos);

    Object write(int i, int i2, String str, SampleVideos<? super GTSubjectAnalyticsV2RSModel> sampleVideos);
}
