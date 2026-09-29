package kotlin;

import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.test.TestIndex;
import com.marrow2.data.pearl.remote.model.PearlResponseBody;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onUpdate implements storeIncremental {
    private final DashSegmentIndex IconCompatParcelizer;
    private final getPlatform RemoteActionCompatParcelizer;

    @setSdkPayload
    public onUpdate(DashSegmentIndex dashSegmentIndex, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(dashSegmentIndex, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.IconCompatParcelizer = dashSegmentIndex;
        this.RemoteActionCompatParcelizer = getplatform;
    }

    @Override // kotlin.storeIncremental
    public final void read(List<? extends Pearl> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer.IconCompatParcelizer((List<Pearl>) list);
    }

    @Override // kotlin.storeIncremental
    public final Object read() {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.write());
    }

    @Override // kotlin.storeIncremental
    public final Object RemoteActionCompatParcelizer(String str, int i) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(str, i);
        return new PearlResponseBody(str, QBankStatsResponse.RemoteActionCompatParcelizer(System.currentTimeMillis()), QBankStatsResponse.RemoteActionCompatParcelizer(i));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super isMetadataEqual>, Object> {
        private /* synthetic */ onUpdate AudioAttributesCompatParcelizer;
        private /* synthetic */ String read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) TestIndex.ALL_INDIA_ID)) {
                DashSegmentIndex unused = this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
                Pearl pearlMediaDescriptionCompat = DashSegmentIndex.MediaDescriptionCompat();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pearlMediaDescriptionCompat, "");
                return getBytes.IconCompatParcelizer(pearlMediaDescriptionCompat);
            }
            Pearl pearlMediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(this.read);
            if (pearlMediaBrowserCompatCustomActionResultReceiver != null) {
                return getBytes.IconCompatParcelizer(pearlMediaBrowserCompatCustomActionResultReceiver);
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, onUpdate onupdate, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
            this.AudioAttributesCompatParcelizer = onupdate;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super isMetadataEqual> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.storeIncremental
    public final Object IconCompatParcelizer(String str, SampleVideos<? super isMetadataEqual> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new read(str, this, null), sampleVideos);
    }

    @Override // kotlin.storeIncremental
    public final Object AudioAttributesCompatParcelizer(String str) {
        Pearl pearlMediaBrowserCompatItemReceiver = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(str);
        if (pearlMediaBrowserCompatItemReceiver != null) {
            return getBytes.IconCompatParcelizer(pearlMediaBrowserCompatItemReceiver);
        }
        return null;
    }
}
