package kotlin;

import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import com.marrow2.domain.custom_module.model.CustomModuleTopicListModel;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface getArray {
    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super Boolean> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super Integer> sampleVideos);

    Object AudioAttributesImplApi26Parcelizer(SampleVideos<? super List<CustomModuleSubjectListModel>> sampleVideos);

    Object AudioAttributesImplBaseParcelizer(SampleVideos<? super Boolean> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super Integer> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super CustomModuleUCModel> sampleVideos);

    Object IconCompatParcelizer(boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    Object MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super List<CustomModuleTopicListModel>> sampleVideos);

    Object RemoteActionCompatParcelizer(RepeatModeUtil repeatModeUtil, SampleVideos<? super List<putInt>> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super Boolean> sampleVideos);

    Object read(String str, SampleVideos<? super List<getBytePosition>> sampleVideos);

    Object read(SampleVideos<? super getShowPopup> sampleVideos);

    Object write(String str, long j, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(String str, SampleVideos<? super String> sampleVideos);

    Object write(SampleVideos<? super CustomModuleQuotaResponseBody> sampleVideos);
}
