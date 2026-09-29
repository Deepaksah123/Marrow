package kotlin;

import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class checkIndex implements Assertions {
    private final getPlatform read;
    private final onManifestLoadError write;

    @setSdkPayload
    public checkIndex(onManifestLoadError onmanifestloaderror, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(onmanifestloaderror, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.write = onmanifestloaderror;
        this.read = getplatform;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends fromBundleSparseArray>>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            List<FilterItemRecord> listAudioAttributesImplApi21Parcelizer = checkIndex.this.write.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplApi21Parcelizer, 10));
            for (FilterItemRecord filterItemRecord : listAudioAttributesImplApi21Parcelizer) {
                arrayList.add(new fromBundleSparseArray(filterItemRecord.itemId, filterItemRecord.itemTitle, filterItemRecord.count));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return checkIndex.this.new read(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<fromBundleSparseArray>> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.Assertions
    public final Object IconCompatParcelizer(String str, SampleVideos<? super List<fromBundleSparseArray>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new read(str, null), sampleVideos);
    }
}
