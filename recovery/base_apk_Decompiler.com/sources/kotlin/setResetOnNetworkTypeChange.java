package kotlin;

import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow.data.api.models.response.custommodule.CustomModuleResponseBody;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.data.custom_module.remote.model.CustomModuleLSModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface setResetOnNetworkTypeChange {
    Object AudioAttributesCompatParcelizer(String str, long j, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super CustomModuleResponseBody> sampleVideos);

    Object AudioAttributesCompatParcelizer(CmcdHeadersFactoryStreamType cmcdHeadersFactoryStreamType, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super CustomModuleLSModel> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super String> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(FilterParams filterParams, SampleVideos<? super CustomModuleLSModel> sampleVideos);

    Object RemoteActionCompatParcelizer(CustomModuleLSModel customModuleLSModel, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super CustomModuleResponseBody> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, setCache setcache, int i, SampleVideos<? super String> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super CustomModuleQuotaResponseBody> sampleVideos);

    Object read(int i, String str, boolean z, long j, List<dropTable> list, long j2, long j3, boolean z2, SampleVideos<? super setFloats> sampleVideos);

    Object read(String str, int i, SampleVideos<? super Integer> sampleVideos);

    Object read(SampleVideos<? super List<CustomModuleLSModel>> sampleVideos);

    Object write(SampleVideos<? super Boolean> sampleVideos);
}
