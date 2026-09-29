package kotlin;

import com.marrow.data.models.user.User;

/* JADX INFO: loaded from: classes3.dex */
public final class destroyEglContext implements focusEglSurface {
    private final getPlatform IconCompatParcelizer;
    private final getRepresentations RemoteActionCompatParcelizer;

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super destroyEglSurface>, Object> {
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            User userA_ = destroyEglContext.this.RemoteActionCompatParcelizer.a_(this.RemoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.write(userA_);
            return focusFramebuffer.RemoteActionCompatParcelizer(userA_);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return destroyEglContext.this.new IconCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super destroyEglSurface> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @setSdkPayload
    public destroyEglContext(getRepresentations getrepresentations, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(getrepresentations, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = getrepresentations;
        this.IconCompatParcelizer = getplatform;
    }

    @Override // kotlin.focusEglSurface
    public final Object write(String str, SampleVideos<? super destroyEglSurface> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new IconCompatParcelizer(str, null), sampleVideos);
    }

    @Override // kotlin.focusEglSurface
    public final Object IconCompatParcelizer(destroyEglSurface destroyeglsurface) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(gzip.read(destroyeglsurface));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.focusEglSurface
    public final Object read(String str, int i) {
        this.RemoteActionCompatParcelizer.write(i, str);
        return getShowPopup.INSTANCE;
    }
}
