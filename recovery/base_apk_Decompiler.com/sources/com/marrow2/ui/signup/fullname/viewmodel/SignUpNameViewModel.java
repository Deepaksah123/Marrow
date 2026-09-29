package com.marrow2.ui.signup.fullname.viewmodel;

import com.marrow.TrainingApplication;
import com.marrow2.ui.signup.fullname.viewmodel.SignUpNameViewModel;
import java.util.Date;
import java.util.Map;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.RoundCap;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StreetViewPanoramaCameraBuilder;
import kotlin.TestGroupLSModel;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.createParcelSparseArray;
import kotlin.getAnswerMap;
import kotlin.getInfoWindowAnchorV;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.loadBitmap;
import kotlin.newYearNameItem;
import kotlin.peekChar;
import kotlin.readDouble;
import kotlin.readInt24;
import kotlin.readLine;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.startCap;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u000e\u0010&R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b\"\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020(0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b\u0017\u0010&"}, d2 = {"Lcom/marrow2/ui/signup/fullname/viewmodel/SignUpNameViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "Lcom/marrow/TrainingApplication;", "p2", "Lo/isSeekPending;", "p3", "<init>", "(Lo/peekChar;Lo/POJOPropertyBuilder5;Lcom/marrow/TrainingApplication;Lo/isSeekPending;)V", "Lo/StreetViewPanoramaCameraBuilder;", "", "read", "(Lo/StreetViewPanoramaCameraBuilder;)V", "AudioAttributesImplBaseParcelizer", "()V", "", "", "(Ljava/lang/String;)Z", "MediaBrowserCompatCustomActionResultReceiver", "Lo/peekChar;", "AudioAttributesCompatParcelizer", "RatingCompat", "Lo/POJOPropertyBuilder5;", "write", "AudioAttributesImplApi21Parcelizer", "Lcom/marrow/TrainingApplication;", "Lo/isSeekPending;", "RemoteActionCompatParcelizer", "Lo/getResolutionSize;", "Lo/RoundCap;", "Lo/getResolutionSize;", "IconCompatParcelizer", "Lo/setUpdatedStatus;", "MediaBrowserCompatItemReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "AudioAttributesImplApi26Parcelizer", "Lo/startCap;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignUpNameViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final TrainingApplication read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<startCap> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<startCap> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final peekChar AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<RoundCap> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<RoundCap> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    @setSdkPayload
    public SignUpNameViewModel(peekChar peekchar, POJOPropertyBuilder5 pOJOPropertyBuilder5, TrainingApplication trainingApplication, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(trainingApplication, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = peekchar;
        this.write = pOJOPropertyBuilder5;
        this.read = trainingApplication;
        this.RemoteActionCompatParcelizer = isseekpending;
        getResolutionSize<RoundCap> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new RoundCap(null, false, 3, null));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<startCap> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(startCap.read.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
    }

    public final setUpdatedStatus<RoundCap> read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<Boolean> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<startCap> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void read(StreetViewPanoramaCameraBuilder p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, StreetViewPanoramaCameraBuilder.IconCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi26Parcelizer.write(startCap.read.INSTANCE);
            return;
        }
        if (p0 instanceof StreetViewPanoramaCameraBuilder.read) {
            StreetViewPanoramaCameraBuilder.read readVar = (StreetViewPanoramaCameraBuilder.read) p0;
            this.IconCompatParcelizer.write(new RoundCap(readVar.AudioAttributesCompatParcelizer(), read(readVar.AudioAttributesCompatParcelizer())));
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, StreetViewPanoramaCameraBuilder.AudioAttributesCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            AudioAttributesImplBaseParcelizer();
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        final String str = (String) this.write.write("email");
        if (str == null) {
            str = "";
        }
        String str2 = (String) this.write.write("password");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(str, str2 == null ? "" : str2, this.IconCompatParcelizer.IconCompatParcelizer().getWrite(), null), new MagicModuleSubmissionRequestBody() { // from class: o.getOrientation
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SignUpNameViewModel.IconCompatParcelizer(this.write, str, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                SignUpNameViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                readInt24 readint24 = new readInt24(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, null, 8, null);
                this.write = null;
                this.IconCompatParcelizer = 1;
                obj = SignUpNameViewModel.this.AudioAttributesCompatParcelizer.read(readint24, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            SignUpNameViewModel.this.RemoteActionCompatParcelizer.write("signup_complete", createParcelSparseArray.read(true, this.read, "email", -1, (String) null), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            isSeekPending isseekpending = SignUpNameViewModel.this.RemoteActionCompatParcelizer;
            createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
            isseekpending.write(createParcelSparseArray.read(loadBitmap.RemoteActionCompatParcelizer(new Date().getTime(), "dd/MM/yyyy")), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.read));
            isSeekPending isseekpending2 = SignUpNameViewModel.this.RemoteActionCompatParcelizer;
            getInfoWindowAnchorV getinfowindowanchorv = getInfoWindowAnchorV.INSTANCE;
            isseekpending2.write(getInfoWindowAnchorV.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            SignUpNameViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            SignUpNameViewModel.this.AudioAttributesImplApi26Parcelizer.write(new startCap.IconCompatParcelizer(((RoundCap) SignUpNameViewModel.this.IconCompatParcelizer.IconCompatParcelizer()).getWrite()));
            isSeekPending isseekpending3 = SignUpNameViewModel.this.RemoteActionCompatParcelizer;
            Map<String, ? extends Object> mapRemoteActionCompatParcelizer = getLatestBitrateEstimate.RemoteActionCompatParcelizer(readLine.read((readDouble) obj), 0, 0, 0, 0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer, "");
            isseekpending3.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, String str2, String str3, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
            this.RemoteActionCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = str3;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SignUpNameViewModel.this.new AudioAttributesCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(SignUpNameViewModel signUpNameViewModel, String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        signUpNameViewModel.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        signUpNameViewModel.RemoteActionCompatParcelizer.write("signup_complete", createParcelSparseArray.read(false, str, "email", i, str2), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        if (i == 502) {
            signUpNameViewModel.AudioAttributesImplApi26Parcelizer.write(startCap.AudioAttributesCompatParcelizer.INSTANCE);
        } else {
            signUpNameViewModel.AudioAttributesImplApi26Parcelizer.write(new startCap.RemoteActionCompatParcelizer(str2));
        }
        return getShowPopup.INSTANCE;
    }

    private static boolean read(String p0) {
        String str = TestGroupLSModel.read(p0, " ", "", false);
        String str2 = str;
        return str2.length() > 0 && str.length() >= 2 && new newYearNameItem("^[a-zA-Z]+[a-zA-Z-,.']*$").write(str2);
    }
}
