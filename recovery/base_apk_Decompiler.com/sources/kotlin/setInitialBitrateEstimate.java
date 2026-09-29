package kotlin;

import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow.data.api.models.response.custommodule.CustomModuleResponseBody;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.data.custom_module.remote.model.CustomModuleLSModel;
import com.marrow2.data.lesson.remote.model.MarkCMQBCompleteRequestBody;
import com.marrow2.data.lesson.remote.model.MarkCompleteResponseBody;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface setInitialBitrateEstimate {
    Object AudioAttributesCompatParcelizer(CmcdHeadersFactoryStreamType cmcdHeadersFactoryStreamType, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(int i, String str, List<dropTable> list, boolean z, boolean z2, boolean z3, SampleVideos<? super MarkCompleteResponseBody> sampleVideos);

    Object read(FilterParams filterParams, SampleVideos<? super CustomModuleLSModel> sampleVideos);

    Object read(String str, SampleVideos<? super CustomModuleResponseBody> sampleVideos);

    Object write(String str, MarkCMQBCompleteRequestBody markCMQBCompleteRequestBody, SampleVideos<? super MarkCompleteResponseBody> sampleVideos);

    Object write(String str, SampleVideos<? super CustomModuleResponseBody> sampleVideos);

    Object write(SampleVideos<? super CustomModuleQuotaResponseBody> sampleVideos);
}
