package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class getTrackType {
    private static final String AudioAttributesCompatParcelizer;

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ CVideoChangeFrameRateStrategy AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        final /* synthetic */ getState RemoteActionCompatParcelizer;
        final /* synthetic */ getMediaClock write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<setMediaItems> newNumberOtpResendRequest = this.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer);
                final getMediaClock getmediaclock = this.write;
                final CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy = this.AudioAttributesCompatParcelizer;
                this.IconCompatParcelizer = 1;
                if (newNumberOtpResendRequest.write(new getValidationToken() { // from class: o.getTrackType.RemoteActionCompatParcelizer.3
                    private Object RemoteActionCompatParcelizer(setMediaItems setmediaitems) {
                        getmediaclock.write(cVideoChangeFrameRateStrategy, setmediaitems);
                        return getShowPopup.INSTANCE;
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((setMediaItems) obj2);
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(getState getstate, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, getMediaClock getmediaclock, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getstate;
            this.AudioAttributesCompatParcelizer = cVideoChangeFrameRateStrategy;
            this.write = getmediaclock;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final setPassingYear RemoteActionCompatParcelizer(getState getstate, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, getPlatform getplatform, getMediaClock getmediaclock) {
        toMagicModuleMetaRepoModel.write(getstate, "");
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(getmediaclock, "");
        return C0201setMcqCount.IconCompatParcelizer(College.AudioAttributesCompatParcelizer(getplatform), null, null, new RemoteActionCompatParcelizer(getstate, cVideoChangeFrameRateStrategy, getmediaclock, null), 3);
    }

    static {
        String strWrite = n.write("WorkConstraintsTracker");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        AudioAttributesCompatParcelizer = strWrite;
    }

    public static final setPlaybackSpeed AudioAttributesCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        Object systemService = context.getSystemService("connectivity");
        toMagicModuleMetaRepoModel.read(systemService, "");
        return new setPlaybackSpeed((ConnectivityManager) systemService, 0L, 2, null);
    }
}
