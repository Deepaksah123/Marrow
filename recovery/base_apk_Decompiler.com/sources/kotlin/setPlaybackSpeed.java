package kotlin;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.concurrent.CancellationException;
import kotlin.BaseRenderer;
import kotlin.Metadata;
import kotlin.setMediaItems;
import kotlin.setPlaybackSpeed;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013"}, d2 = {"Lo/setPlaybackSpeed;", "Lo/isSourceReady;", "Landroid/net/ConnectivityManager;", "p0", "", "p1", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Lo/e;", "Lo/NewNumberOtpResendRequest;", "Lo/setMediaItems;", "AudioAttributesCompatParcelizer", "(Lo/e;)Lo/NewNumberOtpResendRequest;", "Lo/CVideoChangeFrameRateStrategy;", "", "write", "(Lo/CVideoChangeFrameRateStrategy;)Z", "Landroid/net/ConnectivityManager;", "RemoteActionCompatParcelizer", "J", "IconCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setPlaybackSpeed implements isSourceReady {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ConnectivityManager RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    private setPlaybackSpeed(ConnectivityManager connectivityManager, long j) {
        toMagicModuleMetaRepoModel.write(connectivityManager, "");
        this.RemoteActionCompatParcelizer = connectivityManager;
        this.IconCompatParcelizer = j;
    }

    public /* synthetic */ setPlaybackSpeed(ConnectivityManager connectivityManager, long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(connectivityManager, (i & 2) != 0 ? 1000L : j);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getShowPearlDeletionPopup<? super setMediaItems>, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setPlaybackSpeed AudioAttributesCompatParcelizer;
        final /* synthetic */ e IconCompatParcelizer;
        private /* synthetic */ Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            final getCreatedOnDateMs<getShowPopup> getcreatedondatemsRemoteActionCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final getShowPearlDeletionPopup getshowpearldeletionpopup = (getShowPearlDeletionPopup) this.read;
                NetworkRequest networkRequestRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
                if (networkRequestRemoteActionCompatParcelizer != null) {
                    final setPassingYear setpassingyearIconCompatParcelizer = C0201setMcqCount.IconCompatParcelizer(getshowpearldeletionpopup, null, null, new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, getshowpearldeletionpopup, null), 3);
                    getAnswerMap getanswermap = new getAnswerMap() { // from class: o.resetPosition
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return setPlaybackSpeed.RemoteActionCompatParcelizer.IconCompatParcelizer(setpassingyearIconCompatParcelizer, getshowpearldeletionpopup, (setMediaItems) obj2);
                        }
                    };
                    if (Build.VERSION.SDK_INT >= 30) {
                        getCapabilities getcapabilities = getCapabilities.read;
                        getcreatedondatemsRemoteActionCompatParcelizer = getCapabilities.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, networkRequestRemoteActionCompatParcelizer, getanswermap);
                    } else {
                        BaseRenderer.write writeVar = BaseRenderer.write;
                        getcreatedondatemsRemoteActionCompatParcelizer = BaseRenderer.write.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, networkRequestRemoteActionCompatParcelizer, getanswermap);
                    }
                    this.write = 1;
                    if (UserConfigResponse.RemoteActionCompatParcelizer(getshowpearldeletionpopup, new getCreatedOnDateMs() { // from class: o.getFormatHolder
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return setPlaybackSpeed.RemoteActionCompatParcelizer.write(getcreatedondatemsRemoteActionCompatParcelizer);
                        }
                    }, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    getshowpearldeletionpopup.onPlay().write((Throwable) null);
                    return getShowPopup.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ setPlaybackSpeed AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            final /* synthetic */ getShowPearlDeletionPopup<setMediaItems> write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer = 1;
                    if (setCountry.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                n.write();
                String unused = getTrackType.AudioAttributesCompatParcelizer;
                long unused2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
                this.write.read(new setMediaItems.RemoteActionCompatParcelizer(7));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            IconCompatParcelizer(setPlaybackSpeed setplaybackspeed, getShowPearlDeletionPopup<? super setMediaItems> getshowpearldeletionpopup, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = setplaybackspeed;
                this.write = getshowpearldeletionpopup;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup IconCompatParcelizer(setPassingYear setpassingyear, getShowPearlDeletionPopup getshowpearldeletionpopup, setMediaItems setmediaitems) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
            getshowpearldeletionpopup.read(setmediaitems);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
            getcreatedondatems.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(e eVar, setPlaybackSpeed setplaybackspeed, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = eVar;
            this.AudioAttributesCompatParcelizer = setplaybackspeed;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            remoteActionCompatParcelizer.read = obj;
            return remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getShowPearlDeletionPopup<? super setMediaItems> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(getshowpearldeletionpopup, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isSourceReady
    public final NewNumberOtpResendRequest<setMediaItems> AudioAttributesCompatParcelizer(e p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return VerifyNewNumberRequest.write(new RemoteActionCompatParcelizer(p0, this, null));
    }

    @Override // kotlin.isSourceReady
    public final boolean write(CVideoChangeFrameRateStrategy p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() != null;
    }
}
