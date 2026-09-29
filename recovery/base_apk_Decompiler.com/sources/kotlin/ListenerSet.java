package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class ListenerSet implements lambdaqueueEvent0 {
    private final updateSelectedBaseUrl RemoteActionCompatParcelizer;
    private final getPlatform write;

    @setSdkPayload
    public ListenerSet(updateSelectedBaseUrl updateselectedbaseurl, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(updateselectedbaseurl, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = updateselectedbaseurl;
        this.write = getplatform;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.RemoteActionCompatParcelizer(ListenerSet.this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(int i, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ListenerSet.this.new read(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.lambdaqueueEvent0
    public final Object write(int i, SampleVideos<? super Integer> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new read(i, null), sampleVideos);
    }
}
