package kotlin;

import com.marrow.data.models.test.TestGroupLSModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FileTypes implements getTrackStatusString {
    private final getPlatform AudioAttributesCompatParcelizer;
    private final loadManifest read;

    @setSdkPayload
    public FileTypes(loadManifest loadmanifest, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(loadmanifest, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = loadmanifest;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    @Override // kotlin.getTrackStatusString
    public final Object IconCompatParcelizer(List<TestGroupLSModel> list) {
        this.read.IconCompatParcelizer(list.toArray(new TestGroupLSModel[0]));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.getTrackStatusString
    public final Object RemoteActionCompatParcelizer(String str) {
        return this.read.MediaBrowserCompatCustomActionResultReceiver(str);
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private /* synthetic */ String read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            FileTypes.this.read.read(this.read, this.AudioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, long j, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return FileTypes.this.new read(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getTrackStatusString
    public final Object RemoteActionCompatParcelizer(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new read(str, j, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }
}
