package kotlin;

import com.marrow.data.models.video.VideoResumeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class verifyCurrentThread implements ListenerSetExternalSyntheticLambda0 {
    private final getPlatform AudioAttributesCompatParcelizer;
    private final copyWithNewSelectedBaseUrl RemoteActionCompatParcelizer;

    @setSdkPayload
    public verifyCurrentThread(copyWithNewSelectedBaseUrl copywithnewselectedbaseurl, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(copywithnewselectedbaseurl, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = copywithnewselectedbaseurl;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super ListenerSetListenerHolder>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            VideoResumeInfo videoResumeInfoMediaBrowserCompatCustomActionResultReceiver = verifyCurrentThread.this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(this.write);
            if (videoResumeInfoMediaBrowserCompatCustomActionResultReceiver != null) {
                return ListenerSetIterationFinishedEvent.write(videoResumeInfoMediaBrowserCompatCustomActionResultReceiver);
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return verifyCurrentThread.this.new AudioAttributesCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super ListenerSetListenerHolder> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.ListenerSetExternalSyntheticLambda0
    public final Object read(String str, SampleVideos<? super ListenerSetListenerHolder> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new AudioAttributesCompatParcelizer(str, null), sampleVideos);
    }
}
