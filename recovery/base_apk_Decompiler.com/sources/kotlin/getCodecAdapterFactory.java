package kotlin;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class getCodecAdapterFactory {
    private static final String RemoteActionCompatParcelizer;

    public static final Object RemoteActionCompatParcelizer(Context context, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, j jVar, onUpgrade onupgrade, setEnableDecoderFallback setenabledecoderfallback, SampleVideos<? super getShowPopup> sampleVideos) {
        if (!cVideoChangeFrameRateStrategy.write || Build.VERSION.SDK_INT >= 31) {
            return getShowPopup.INSTANCE;
        }
        Executor executorAudioAttributesCompatParcelizer = setenabledecoderfallback.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(executorAudioAttributesCompatParcelizer, "");
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(getDegree.write(executorAudioAttributesCompatParcelizer), new write(jVar, cVideoChangeFrameRateStrategy, onupgrade, context, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Void>, Object> {
        final /* synthetic */ CVideoChangeFrameRateStrategy AudioAttributesCompatParcelizer;
        final /* synthetic */ j IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        final /* synthetic */ Context read;
        final /* synthetic */ onUpgrade write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Mp4ExtractorExternalSyntheticLambda0<eb> mp4ExtractorExternalSyntheticLambda0 = this.IconCompatParcelizer.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0, "");
                this.RemoteActionCompatParcelizer = 1;
                obj = pause.read(mp4ExtractorExternalSyntheticLambda0, this.IconCompatParcelizer, this);
                if (obj != objIconCompatParcelizer) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            eb ebVar = (eb) obj;
            if (ebVar != null) {
                String unused = getCodecAdapterFactory.RemoteActionCompatParcelizer;
                CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy = this.AudioAttributesCompatParcelizer;
                n.write();
                String str = cVideoChangeFrameRateStrategy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                Mp4ExtractorExternalSyntheticLambda0<Void> mp4ExtractorExternalSyntheticLambda0RemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(this.read, this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(), ebVar);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0RemoteActionCompatParcelizer, "");
                this.RemoteActionCompatParcelizer = 2;
                Object obj2 = deserializerForCreator.read(mp4ExtractorExternalSyntheticLambda0RemoteActionCompatParcelizer, this);
                return obj2 == objIconCompatParcelizer ? objIconCompatParcelizer : obj2;
            }
            StringBuilder sb = new StringBuilder("Worker was marked important (");
            sb.append(this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            sb.append(") but did not provide ForegroundInfo");
            throw new IllegalStateException(sb.toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(j jVar, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, onUpgrade onupgrade, Context context, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = jVar;
            this.AudioAttributesCompatParcelizer = cVideoChangeFrameRateStrategy;
            this.write = onupgrade;
            this.read = context;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Void> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static {
        String strWrite = n.write("WorkForegroundRunnable");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        RemoteActionCompatParcelizer = strWrite;
    }
}
