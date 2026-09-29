package kotlin;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class BasePlayer {
    private static final String AudioAttributesCompatParcelizer;
    private static final long RemoteActionCompatParcelizer;

    static {
        String strWrite = n.write("UnfinishedWorkListener");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        AudioAttributesCompatParcelizer = strWrite;
        RemoteActionCompatParcelizer = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void write(TopUserCompanion topUserCompanion, Context context, b bVar, WorkDatabase workDatabase) {
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bVar, "");
        toMagicModuleMetaRepoModel.write(workDatabase, "");
        if (createRenderers.AudioAttributesCompatParcelizer(context, bVar)) {
            VerifyNewNumberRequest.AudioAttributesCompatParcelizer(VerifyNewNumberRequest.IconCompatParcelizer(VerifyNewNumberRequest.read(VerifyNewNumberRequest.write(VerifyNewNumberRequest.write(workDatabase.onMediaButtonEvent().AudioAttributesImplApi21Parcelizer(), new RemoteActionCompatParcelizer(null)))), (MagicModuleSubmissionRequestBody) new IconCompatParcelizer(context, null)), topUserCompanion);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getMagicModuleStat<getValidationToken<? super Boolean>, Throwable, Long, SampleVideos<? super Boolean>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ long read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                long j = this.read;
                n.write();
                String unused = BasePlayer.AudioAttributesCompatParcelizer;
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(Math.min(j * 30000, BasePlayer.RemoteActionCompatParcelizer), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return QBankStatsResponse.AudioAttributesCompatParcelizer(true);
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(4, sampleVideos);
        }

        @Override // kotlin.getMagicModuleStat
        public final /* bridge */ /* synthetic */ Object write(getValidationToken<? super Boolean> getvalidationtoken, Throwable th, Long l, SampleVideos<? super Boolean> sampleVideos) {
            return write(th, l.longValue(), sampleVideos);
        }

        private static Object write(Throwable th, long j, SampleVideos<? super Boolean> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(sampleVideos);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = th;
            remoteActionCompatParcelizer.read = j;
            return remoteActionCompatParcelizer.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<Boolean, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ Context IconCompatParcelizer;
        private /* synthetic */ boolean read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            buildVideoRenderers.RemoteActionCompatParcelizer(this.IconCompatParcelizer, seekToNext.class, this.read);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(Context context, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = context;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
            iconCompatParcelizer.read = ((Boolean) obj).booleanValue();
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(Boolean bool, SampleVideos<? super getShowPopup> sampleVideos) {
            return AudioAttributesCompatParcelizer(bool.booleanValue(), sampleVideos);
        }

        private Object AudioAttributesCompatParcelizer(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(Boolean.valueOf(z), sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }
}
