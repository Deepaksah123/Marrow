package kotlin;

import com.marrow.data.models.custommodule.CustomModule;
import com.marrow2.data.custom_module.remote.model.CustomModuleLSModelKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class addListenersToDataSource implements getInitialBitrateEstimatesForCountry {
    private final getPlatform AudioAttributesCompatParcelizer;
    private final setManifestParser IconCompatParcelizer;
    private final processManifest read;

    @setSdkPayload
    public addListenersToDataSource(processManifest processmanifest, setManifestParser setmanifestparser, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(processmanifest, "");
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = processmanifest;
        this.IconCompatParcelizer = setmanifestparser;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object RemoteActionCompatParcelizer() {
        CustomModule[] customModuleArrRatingCompat = this.read.RatingCompat();
        if (customModuleArrRatingCompat == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList(customModuleArrRatingCompat.length);
        for (CustomModule customModule : customModuleArrRatingCompat) {
            arrayList.add(CustomModuleLSModelKt.toLSModel(customModule));
        }
        return arrayList;
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object AudioAttributesCompatParcelizer() {
        CustomModule customModuleAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer((String) null, (String[]) null, (String) null);
        if (customModuleAudioAttributesCompatParcelizer != null) {
            return CustomModuleLSModelKt.toLSModel(customModuleAudioAttributesCompatParcelizer);
        }
        return null;
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object write(String str, int i, long j) {
        this.read.read(str, i, j);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object IconCompatParcelizer(String str) {
        return this.read.AudioAttributesImplBaseParcelizer(str);
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object read() {
        this.read.ah_();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object IconCompatParcelizer() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.read.AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object RemoteActionCompatParcelizer(String str, int i) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.read.IconCompatParcelizer(str, i));
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object RemoteActionCompatParcelizer(CustomModule customModule) {
        this.read.AudioAttributesCompatParcelizer(customModule);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ long RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            addListenersToDataSource.this.read.IconCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, long j, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return addListenersToDataSource.this.new read(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getInitialBitrateEstimatesForCountry
    public final Object AudioAttributesCompatParcelizer(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new read(str, j, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }
}
