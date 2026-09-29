package kotlin;

import com.marrow.data.models.magicModule.MagicModuleTimeline;
import com.marrow2.data.magic_module.remote.model.MagicModuleModel;
import com.marrow2.data.magic_module.remote.model.MagicModuleSubmissionRequestBody;
import com.marrow2.data.magic_module.remote.model.MagicModuleSubmissionResponseBody;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onCachedBytesRead implements CacheDataSourceFactory {
    private final Lazy<getCache> AudioAttributesCompatParcelizer;
    private final CacheDataSourceEventListener IconCompatParcelizer;

    @setSdkPayload
    public onCachedBytesRead(Lazy<getCache> lazy, CacheDataSourceEventListener cacheDataSourceEventListener) {
        toMagicModuleMetaRepoModel.write(lazy, "");
        toMagicModuleMetaRepoModel.write(cacheDataSourceEventListener, "");
        this.AudioAttributesCompatParcelizer = lazy;
        this.IconCompatParcelizer = cacheDataSourceEventListener;
    }

    private final getCache write() {
        getCache getcache = this.AudioAttributesCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getcache, "");
        return getcache;
    }

    @Override // kotlin.CacheDataSourceFactory
    public final Object read(String str, SampleVideos<? super MagicModuleModel> sampleVideos) {
        return write().AudioAttributesCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.CacheDataSourceFactory
    public final Object write(String str, List<CacheFileMetadataIndex> list, SampleVideos<? super MagicModuleSubmissionResponseBody> sampleVideos) {
        List<CacheFileMetadataIndex> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10)), 16));
        for (CacheFileMetadataIndex cacheFileMetadataIndex : list2) {
            Pair pair = new Pair(cacheFileMetadataIndex.getWrite(), QBankStatsResponse.RemoteActionCompatParcelizer(cacheFileMetadataIndex.getAudioAttributesCompatParcelizer()));
            linkedHashMap.put(pair.write(), pair.IconCompatParcelizer());
        }
        return write().IconCompatParcelizer(str, new MagicModuleSubmissionRequestBody(linkedHashMap), sampleVideos);
    }

    @Override // kotlin.CacheDataSourceFactory
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super MagicModuleModel> sampleVideos) {
        return write().RemoteActionCompatParcelizer(sampleVideos);
    }

    @Override // kotlin.CacheDataSourceFactory
    public final Object write(SampleVideos<? super List<notifyCacheIgnored>> sampleVideos) {
        return this.IconCompatParcelizer.read();
    }

    @Override // kotlin.CacheDataSourceFactory
    public final Object AudioAttributesCompatParcelizer(List<MagicModuleTimeline> list, SampleVideos<? super getShowPopup> sampleVideos) {
        this.IconCompatParcelizer.read(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }
}
