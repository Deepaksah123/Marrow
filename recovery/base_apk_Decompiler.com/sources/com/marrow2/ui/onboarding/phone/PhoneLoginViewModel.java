package com.marrow2.ui.onboarding.phone;

import android.os.CountDownTimer;
import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.data.user.remote.model.onboarding.OtpRetryType;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import com.marrow2.ui.onboarding.phone.PhoneLoginViewModel;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ThemeState;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.createParcelSparseArray;
import kotlin.getAnswerMap;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleStats;
import kotlin.getMediaDurationForPlayoutDuration;
import kotlin.getNowUnixTimeMs;
import kotlin.getPcmEncoding;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher;
import kotlin.limit;
import kotlin.peekChar;
import kotlin.readLine;
import kotlin.setCountry;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import kotlin.updateLoadingFinished;
import kotlin.writeDoubleSparseArray;
import kotlin.writeFloatSparseArray;
import kotlin.writeIBinderList;
import kotlin.writeIBinderSparseArray;
import kotlin.writeInt;
import kotlin.writeIntArray;
import kotlin.zaF;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0010\u0010\u0013J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0019J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\f\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020'0)8\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u0012\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R \u0010#\u001a\b\u0012\u0004\u0012\u00020-0/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001d\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001f0/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b.\u00102R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002040&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R \u00105\u001a\b\u0012\u0004\u0012\u0002040/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b\u0015\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010(R \u00108\u001a\b\u0012\u0004\u0012\u0002060/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b#\u00102"}, d2 = {"Lcom/marrow2/ui/onboarding/phone/PhoneLoginViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "Lo/isSeekPending;", "p1", "Lo/getPlatform;", "p2", "<init>", "(Lo/peekChar;Lo/isSeekPending;Lo/getPlatform;)V", "Lo/writeIBinderSparseArray;", "", "write", "(Lo/writeIBinderSparseArray;)V", "AudioAttributesImplApi26Parcelizer", "()V", "AudioAttributesImplApi21Parcelizer", "", "read", "(Ljava/lang/String;)V", "Lo/limit;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Lo/limit;)V", "Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "p3", "(Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;Ljava/lang/String;Ljava/lang/String;Lo/limit;)V", "Lo/getPcmEncoding;", "(Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;Lo/limit;Lo/getPcmEncoding;)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)I", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Z", "Lo/peekChar;", "MediaBrowserCompatItemReceiver", "Lo/isSeekPending;", "Lo/getPlatform;", "Lo/getResolutionSize;", "Lo/writeIntArray;", "Lo/getResolutionSize;", "Lo/isDark;", "MediaBrowserCompatSearchResultReceiver", "Lo/isDark;", "()Lo/isDark;", "Lo/writeFloatSparseArray;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setUpdatedStatus;", "MediaMetadataCompat", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer", "Lo/writeIBinderList;", "MediaBrowserCompatMediaItem", "Lo/writeInt;", "MediaDescriptionCompat", "RatingCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhoneLoginViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<writeIBinderList> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getPlatform IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final peekChar AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<writeInt> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final isSeekPending read;
    private final setUpdatedStatus<writeIBinderList> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final isDark<writeIntArray> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<writeInt> RatingCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<writeFloatSparseArray> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<writeIntArray> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<writeFloatSparseArray> MediaBrowserCompatCustomActionResultReceiver;

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[limit.values().length];
            try {
                iArr[limit.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[limit.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    @setSdkPayload
    public PhoneLoginViewModel(peekChar peekchar, isSeekPending isseekpending, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.AudioAttributesCompatParcelizer = peekchar;
        this.read = isseekpending;
        this.IconCompatParcelizer = getplatform;
        getResolutionSize<writeIntArray> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new writeIntArray(null, null, false, false, 15, null));
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<writeFloatSparseArray> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new writeFloatSparseArray(null, false, null, null, false, false, 63, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<writeIBinderList> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(writeIBinderList.RemoteActionCompatParcelizer);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<writeInt> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(writeInt.read.INSTANCE);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getresolutionsizeRemoteActionCompatParcelizer4.write(writeIBinderList.RemoteActionCompatParcelizer);
    }

    public final isDark<writeIntArray> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<writeFloatSparseArray> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<writeIBinderList> IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<writeInt> MediaBrowserCompatItemReceiver() {
        return this.RatingCompat;
    }

    public final void write(writeIBinderSparseArray p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof writeIBinderSparseArray.IconCompatParcelizer) {
            getResolutionSize<writeIntArray> getresolutionsize = this.write;
            writeIntArray writeintarrayIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            writeIBinderSparseArray.IconCompatParcelizer iconCompatParcelizer = (writeIBinderSparseArray.IconCompatParcelizer) p0;
            getresolutionsize.write(writeIntArray.write(iconCompatParcelizer.write(), iconCompatParcelizer.read(), writeintarrayIconCompatParcelizer.read, writeintarrayIconCompatParcelizer.write));
            IconCompatParcelizer(iconCompatParcelizer.write(), iconCompatParcelizer.read(), iconCompatParcelizer.AudioAttributesCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, writeIBinderSparseArray.RemoteActionCompatParcelizer.INSTANCE)) {
            this.MediaDescriptionCompat.write(writeInt.AudioAttributesImplApi26Parcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof writeIBinderSparseArray.read) {
            read(((writeIBinderSparseArray.read) p0).write());
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, writeIBinderSparseArray.write.INSTANCE)) {
            AudioAttributesImplApi26Parcelizer();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, writeIBinderSparseArray.AudioAttributesCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.MediaDescriptionCompat.write(writeInt.read.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getAudioAttributesCompatParcelizer() == writeDoubleSparseArray.read) {
            IconCompatParcelizer(OtpRetryType.OTP_TYPE_RESEND_TEXT, this.write.IconCompatParcelizer().getIconCompatParcelizer(), this.write.IconCompatParcelizer().getAudioAttributesCompatParcelizer(), limit.AudioAttributesCompatParcelizer);
            this.read.write(createParcelSparseArray.AudioAttributesCompatParcelizer("sms", "login", this.write.IconCompatParcelizer().getIconCompatParcelizer(), this.write.IconCompatParcelizer().getAudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            getResolutionSize<writeFloatSparseArray> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
            getresolutionsize.write(writeFloatSparseArray.RemoteActionCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, false, null, writeDoubleSparseArray.AudioAttributesCompatParcelizer, false, false, 55));
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getAudioAttributesCompatParcelizer() == writeDoubleSparseArray.RemoteActionCompatParcelizer) {
            IconCompatParcelizer(OtpRetryType.OTP_TYPE_CALL, this.write.IconCompatParcelizer().getIconCompatParcelizer(), this.write.IconCompatParcelizer().getAudioAttributesCompatParcelizer(), limit.AudioAttributesCompatParcelizer);
            this.read.write(createParcelSparseArray.AudioAttributesCompatParcelizer("call", "login", this.write.IconCompatParcelizer().getIconCompatParcelizer(), this.write.IconCompatParcelizer().getAudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            getResolutionSize<writeFloatSparseArray> getresolutionsize2 = this.MediaBrowserCompatCustomActionResultReceiver;
            getresolutionsize2.write(writeFloatSparseArray.RemoteActionCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), null, false, null, writeDoubleSparseArray.RemoteActionCompatParcelizer, false, false, 55));
        }
    }

    public static final class RemoteActionCompatParcelizer extends CountDownTimer {
        RemoteActionCompatParcelizer() {
            super(60000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
            getResolutionSize getresolutionsize = PhoneLoginViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
            writeFloatSparseArray writefloatsparsearray = (writeFloatSparseArray) PhoneLoginViewModel.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            getresolutionsize.write(writeFloatSparseArray.RemoteActionCompatParcelizer(writefloatsparsearray, null, false, str, null, false, false, 59));
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            PhoneLoginViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(writeFloatSparseArray.RemoteActionCompatParcelizer((writeFloatSparseArray) PhoneLoginViewModel.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), null, false, "", writeDoubleSparseArray.RemoteActionCompatParcelizer, false, false, 51));
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        new RemoteActionCompatParcelizer().start();
    }

    private final void read(String p0) {
        if (!RemoteActionCompatParcelizer(p0) || p0.length() < 4 || p0.length() > 8) {
            return;
        }
        getResolutionSize<writeFloatSparseArray> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
        getresolutionsize.write(writeFloatSparseArray.RemoteActionCompatParcelizer(getresolutionsize.IconCompatParcelizer(), p0, true, null, null, false, false, 60));
        AudioAttributesImplApi21Parcelizer(p0);
    }

    private final void AudioAttributesImplApi21Parcelizer(String p0) {
        this.AudioAttributesImplBaseParcelizer.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(p0, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.writeBigIntegerArray
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PhoneLoginViewModel.IconCompatParcelizer(this.IconCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ PhoneLoginViewModel RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getMediaDurationForPlayoutDuration getmediadurationforplayoutduration = new getMediaDurationForPlayoutDuration(this.write, new PhoneNumberDetails(((writeIntArray) this.RemoteActionCompatParcelizer.write.IconCompatParcelizer()).getIconCompatParcelizer(), ((writeIntArray) this.RemoteActionCompatParcelizer.write.IconCompatParcelizer()).getAudioAttributesCompatParcelizer(), 0, 4, null), false, 4, null);
                this.read = null;
                this.AudioAttributesCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer, new AnonymousClass5(this.RemoteActionCompatParcelizer, getmediadurationforplayoutduration, null), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: com.marrow2.ui.onboarding.phone.PhoneLoginViewModel$MediaBrowserCompatItemReceiver$5, reason: invalid class name */
        static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ getMediaDurationForPlayoutDuration AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private /* synthetic */ PhoneLoginViewModel read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer = 1;
                    obj = this.read.AudioAttributesCompatParcelizer.write(this.AudioAttributesCompatParcelizer, this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                getNowUnixTimeMs getnowunixtimems = (getNowUnixTimeMs) obj;
                this.read.AudioAttributesImplBaseParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                if (getnowunixtimems.getIntermediateToken().length() > 0 && !getnowunixtimems.read().isEmpty() && getnowunixtimems.read().size() > 1) {
                    this.read.MediaDescriptionCompat.write(new writeInt.MediaBrowserCompatCustomActionResultReceiver(getnowunixtimems.read(), getnowunixtimems.getIntermediateToken(), ((writeIntArray) this.read.write.IconCompatParcelizer()).getIconCompatParcelizer(), ((writeIntArray) this.read.write.IconCompatParcelizer()).getAudioAttributesCompatParcelizer()));
                } else if (getnowunixtimems.getSaveUserModel().getKycMeta() != null) {
                    isSeekPending isseekpending = this.read.read;
                    zaF zaf = zaF.INSTANCE;
                    isseekpending.write(zaF.IconCompatParcelizer(getnowunixtimems.getSaveUserModel().getKycMeta(), "otp"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
                    this.read.MediaDescriptionCompat.write(new writeInt.AudioAttributesImplApi21Parcelizer(getnowunixtimems.getSaveUserModel().getKycMeta()));
                } else {
                    isSeekPending isseekpending2 = this.read.read;
                    Map<String, ? extends Object> mapRemoteActionCompatParcelizer = getLatestBitrateEstimate.RemoteActionCompatParcelizer(readLine.read(getnowunixtimems.getSaveUserModel()), 0, 0, 0, 0);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer, "");
                    isseekpending2.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer);
                    CollegeDetails college = getnowunixtimems.getSaveUserModel().getCollege();
                    if (college == null || college.isUserCollegeDataAvailable()) {
                        this.read.MediaDescriptionCompat.write(writeInt.IconCompatParcelizer.INSTANCE);
                    } else {
                        this.read.MediaDescriptionCompat.write(writeInt.RemoteActionCompatParcelizer.INSTANCE);
                    }
                    this.read.read.write("login_complete", createParcelSparseArray.read(getnowunixtimems.getSaveUserModel().getUserId(), getnowunixtimems.getSaveUserModel().getPhoneNumber().getCountryCode(), "phone", -1, ""), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
                    isSeekPending isseekpending3 = this.read.read;
                    createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
                    isseekpending3.write(createParcelSparseArray.IconCompatParcelizer(createParcelSparseArray.IconCompatParcelizer.AudioAttributesCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(PhoneLoginViewModel phoneLoginViewModel, getMediaDurationForPlayoutDuration getmediadurationforplayoutduration, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.read = phoneLoginViewModel;
                this.AudioAttributesCompatParcelizer = getmediadurationforplayoutduration;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass5(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(String str, PhoneLoginViewModel phoneLoginViewModel, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
            this.RemoteActionCompatParcelizer = phoneLoginViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatItemReceiver(this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(PhoneLoginViewModel phoneLoginViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        phoneLoginViewModel.AudioAttributesImplBaseParcelizer.write(Boolean.FALSE);
        phoneLoginViewModel.MediaDescriptionCompat.write(new writeInt.MediaDescriptionCompat(str));
        phoneLoginViewModel.read.write("login_complete", createParcelSparseArray.read(phoneLoginViewModel.write.IconCompatParcelizer().getAudioAttributesCompatParcelizer(), (String) null, "phone", i, str), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(String p0, String p1, limit p2) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, p1);
        if (iAudioAttributesCompatParcelizer != 200) {
            switch (iAudioAttributesCompatParcelizer) {
                case 101:
                    this.MediaDescriptionCompat.write(writeInt.AudioAttributesImplBaseParcelizer.INSTANCE);
                    break;
                case 102:
                    this.MediaDescriptionCompat.write(writeInt.RatingCompat.INSTANCE);
                    break;
                case 103:
                    this.MediaDescriptionCompat.write(writeInt.MediaMetadataCompat.INSTANCE);
                    break;
                case 104:
                    this.MediaDescriptionCompat.write(writeInt.MediaBrowserCompatSearchResultReceiver.INSTANCE);
                    break;
            }
            return;
        }
        IconCompatParcelizer(OtpRetryType.DEFAULT, p0, p1, p2);
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ limit RemoteActionCompatParcelizer;
        private /* synthetic */ OtpRetryType read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                PhoneLoginViewModel.this.AudioAttributesImplBaseParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.IconCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(PhoneLoginViewModel.this.IconCompatParcelizer, new AnonymousClass1(PhoneLoginViewModel.this, this.RemoteActionCompatParcelizer, this.write, this.read, this.AudioAttributesCompatParcelizer, null), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: com.marrow2.ui.onboarding.phone.PhoneLoginViewModel$read$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ OtpRetryType AudioAttributesCompatParcelizer;
            private /* synthetic */ PhoneLoginViewModel AudioAttributesImplApi26Parcelizer;
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ limit RemoteActionCompatParcelizer;
            private int read;
            private /* synthetic */ String write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    isSeekPending isseekpending = this.AudioAttributesImplApi26Parcelizer.read;
                    lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher lambdadroppedframes3comgoogleandroidexoplayer2videovideorenderereventlistenereventdispatcher = lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher.INSTANCE;
                    isseekpending.write(lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher.read.IconCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    this.read = 1;
                    obj = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                getPcmEncoding getpcmencoding = (getPcmEncoding) obj;
                if (getpcmencoding.getIconCompatParcelizer()) {
                    this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.write(writeInt.AudioAttributesCompatParcelizer.INSTANCE);
                    this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                    getResolutionSize getresolutionsize = this.AudioAttributesImplApi26Parcelizer.write;
                    writeIntArray writeintarray = (writeIntArray) this.AudioAttributesImplApi26Parcelizer.write.IconCompatParcelizer();
                    getresolutionsize.write(writeIntArray.write(this.IconCompatParcelizer, this.write, writeintarray.read, writeintarray.write));
                    if (this.AudioAttributesCompatParcelizer != OtpRetryType.DEFAULT) {
                        this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.write(new writeInt.MediaDescriptionCompat(getpcmencoding.getRemoteActionCompatParcelizer()));
                    } else {
                        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver.write(writeFloatSparseArray.RemoteActionCompatParcelizer((writeFloatSparseArray) this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), null, false, null, writeDoubleSparseArray.read, false, false, 55));
                    }
                    this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer.write(writeIBinderList.AudioAttributesCompatParcelizer);
                }
                this.AudioAttributesImplApi26Parcelizer.write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, getpcmencoding);
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PhoneLoginViewModel phoneLoginViewModel, limit limitVar, String str, OtpRetryType otpRetryType, String str2, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi26Parcelizer = phoneLoginViewModel;
                this.RemoteActionCompatParcelizer = limitVar;
                this.IconCompatParcelizer = str;
                this.AudioAttributesCompatParcelizer = otpRetryType;
                this.write = str2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(limit limitVar, String str, OtpRetryType otpRetryType, String str2, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = limitVar;
            this.write = str;
            this.read = otpRetryType;
            this.AudioAttributesCompatParcelizer = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PhoneLoginViewModel.this.new read(this.RemoteActionCompatParcelizer, this.write, this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(OtpRetryType p0, final String p1, final String p2, limit p3) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p3, p1, p0, p2, null), new MagicModuleSubmissionRequestBody() { // from class: o.writeByteArrayArray
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PhoneLoginViewModel.RemoteActionCompatParcelizer(this.read, p1, p2, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(PhoneLoginViewModel phoneLoginViewModel, String str, String str2, int i, String str3) {
        toMagicModuleMetaRepoModel.write(str3, "");
        phoneLoginViewModel.AudioAttributesImplBaseParcelizer.write(Boolean.FALSE);
        phoneLoginViewModel.MediaDescriptionCompat.write(writeInt.write.INSTANCE);
        if (1301 == i) {
            phoneLoginViewModel.read.write(createParcelSparseArray.read(str, str2), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new updateLoadingFinished[]{updateLoadingFinished.RemoteActionCompatParcelizer, updateLoadingFinished.AudioAttributesCompatParcelizer}));
            phoneLoginViewModel.MediaDescriptionCompat.write(new writeInt.MediaBrowserCompatItemReceiver(phoneLoginViewModel.write.IconCompatParcelizer().getIconCompatParcelizer(), phoneLoginViewModel.write.IconCompatParcelizer().getAudioAttributesCompatParcelizer()));
        } else {
            phoneLoginViewModel.MediaDescriptionCompat.write(new writeInt.MediaDescriptionCompat(str3));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(OtpRetryType p0, limit p1, getPcmEncoding p2) {
        if (p0 != OtpRetryType.DEFAULT) {
            return;
        }
        int i = write.IconCompatParcelizer[p1.ordinal()];
        if (i == 1) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(p2, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.writeByteArraySparseArray
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PhoneLoginViewModel.write((String) obj2);
                }
            });
        } else {
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            getResolutionSize<writeFloatSparseArray> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
            getresolutionsize.write(writeFloatSparseArray.RemoteActionCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, false, null, null, false, true, 15));
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getPcmEncoding AudioAttributesCompatParcelizer;
        private /* synthetic */ PhoneLoginViewModel IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;
        private long write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Long write = this.AudioAttributesCompatParcelizer.getWrite();
                if (write != null) {
                    long jLongValue = write.longValue();
                    this.write = jLongValue;
                    this.read = 0;
                    this.RemoteActionCompatParcelizer = 1;
                    if (setCountry.IconCompatParcelizer(jLongValue * 1000, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.write(writeFloatSparseArray.RemoteActionCompatParcelizer((writeFloatSparseArray) this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), null, false, null, null, this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), false, 15));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(getPcmEncoding getpcmencoding, PhoneLoginViewModel phoneLoginViewModel, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = getpcmencoding;
            this.IconCompatParcelizer = phoneLoginViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private static int AudioAttributesCompatParcelizer(String p0, String p1) {
        int length;
        if (p0.length() == 0) {
            return 101;
        }
        String strSubstring = p0.substring(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        if (!RemoteActionCompatParcelizer(strSubstring)) {
            return 102;
        }
        if (p1.length() == 0) {
            return 103;
        }
        return (!RemoteActionCompatParcelizer(p1) || 8 > (length = p1.length()) || length >= 15) ? 104 : 200;
    }

    private static boolean RemoteActionCompatParcelizer(String str) {
        String str2 = str;
        if (str2.length() == 0) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!Character.isDigit(str2.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
