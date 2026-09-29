package kotlin;

import com.marrow.data.api.models.response.test.TestResponseBody;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.test.TestStatusResponse;
import com.marrow2.data.test.remote.model.GTNudgeRSModel;
import com.marrow2.data.test.remote.model.McqTimingRequestData;
import com.marrow2.data.test.remote.model.TestTimerRSModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.createEglSurface, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0167createEglSurface {
    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super TestResponseBody> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super GTNudgeRSModel> sampleVideos);

    Object IconCompatParcelizer(int i, String str, boolean z, long j, List<dropTable> list, long j2, long j3, boolean z2, Map<String, McqTimingRequestData> map, SampleVideos<? super TestIndex> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super TestStatusResponse> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(String str, SampleVideos<? super TestIndex> sampleVideos);

    Object write(String str, int i, SampleVideos<? super TestStatusResponse> sampleVideos);

    Object write(String str, boolean z, int i, SampleVideos<? super TestTimerRSModel> sampleVideos);
}
