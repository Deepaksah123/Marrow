package kotlin;

import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldEvictSample implements SlidingWeightedAverageBandwidthStatisticSample {
    private final onManifestLoadCompleted AudioAttributesCompatParcelizer;
    private final getPlatform IconCompatParcelizer;

    @setSdkPayload
    public shouldEvictSample(onManifestLoadCompleted onmanifestloadcompleted, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(onmanifestloadcompleted, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.AudioAttributesCompatParcelizer = onmanifestloadcompleted;
        this.IconCompatParcelizer = getplatform;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends fromBundleSparseArray>>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            List<FilterItemRecord> listWrite = shouldEvictSample.this.AudioAttributesCompatParcelizer.write();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
            for (FilterItemRecord filterItemRecord : listWrite) {
                arrayList.add(new fromBundleSparseArray(filterItemRecord.itemId, filterItemRecord.itemTitle, filterItemRecord.count));
            }
            return arrayList;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return shouldEvictSample.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<fromBundleSparseArray>> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.SlidingWeightedAverageBandwidthStatisticSample
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super List<fromBundleSparseArray>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new AudioAttributesCompatParcelizer(null), sampleVideos);
    }
}
