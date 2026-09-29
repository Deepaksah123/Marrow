package kotlin;

import com.marrow.data.models.magicModule.MagicModuleTimeline;
import com.marrow2.data.magic_module.remote.model.MagicModuleModel;
import com.marrow2.data.magic_module.remote.model.MagicModuleSubmissionResponseBody;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface CacheDataSourceFactory {
    Object AudioAttributesCompatParcelizer(List<MagicModuleTimeline> list, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super MagicModuleModel> sampleVideos);

    Object read(String str, SampleVideos<? super MagicModuleModel> sampleVideos);

    Object write(String str, List<CacheFileMetadataIndex> list, SampleVideos<? super MagicModuleSubmissionResponseBody> sampleVideos);

    Object write(SampleVideos<? super List<notifyCacheIgnored>> sampleVideos);
}
