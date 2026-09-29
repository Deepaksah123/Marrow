package com.marrow2.ui.common.google_sign_in;

import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.ui.common.google_sign_in.GoogleSignUpViewModel;
import java.util.Date;
import java.util.Map;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.ProjectionMesh;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
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
import kotlin.onOrientationChange;
import kotlin.peekChar;
import kotlin.readDouble;
import kotlin.readInt24;
import kotlin.readLine;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zaF;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\t\u0010\u0011J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\t\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#"}, d2 = {"Lcom/marrow2/ui/common/google_sign_in/GoogleSignUpViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "Lo/isSeekPending;", "p1", "<init>", "(Lo/peekChar;Lo/isSeekPending;)V", "", "read", "()V", "Lo/ProjectionMesh;", "AudioAttributesCompatParcelizer", "(Lo/ProjectionMesh;)V", "Lo/readDouble;", "", "RemoteActionCompatParcelizer", "(Lo/readDouble;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "Lo/peekChar;", "IconCompatParcelizer", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/onOrientationChange;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "write", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "", "I", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoogleSignUpViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final peekChar IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<onOrientationChange> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<onOrientationChange> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> write;

    @setSdkPayload
    public GoogleSignUpViewModel(peekChar peekchar, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.IconCompatParcelizer = peekchar;
        this.read = isseekpending;
        getResolutionSize<onOrientationChange> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(onOrientationChange.write.INSTANCE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        read();
    }

    public final setUpdatedStatus<onOrientationChange> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                GoogleSignUpViewModel googleSignUpViewModel = GoogleSignUpViewModel.this;
                this.AudioAttributesCompatParcelizer = googleSignUpViewModel;
                this.read = 1;
                obj = googleSignUpViewModel.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(this);
                if (obj == objIconCompatParcelizer) {
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return GoogleSignUpViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.rotateYtoSky
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return GoogleSignUpViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(ProjectionMesh p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof ProjectionMesh.read) {
            read(((ProjectionMesh.read) p0).RemoteActionCompatParcelizer(), "google");
            return;
        }
        if (p0 instanceof ProjectionMesh.write) {
            this.write.write(Boolean.valueOf(((ProjectionMesh.write) p0).write()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, ProjectionMesh.RemoteActionCompatParcelizer.INSTANCE)) {
            this.MediaBrowserCompatItemReceiver++;
            isSeekPending isseekpending = this.read;
            createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
            isseekpending.write(createParcelSparseArray.write(this.MediaBrowserCompatItemReceiver), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            return;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, ProjectionMesh.AudioAttributesCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        isSeekPending isseekpending2 = this.read;
        createParcelSparseArray createparcelsparsearray2 = createParcelSparseArray.write;
        isseekpending2.write(createParcelSparseArray.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(readDouble p0, String p1) throws Throwable {
        if (p0.getKycMeta() != null) {
            isSeekPending isseekpending = this.read;
            zaF zaf = zaF.INSTANCE;
            isseekpending.write(zaF.IconCompatParcelizer(p0.getKycMeta(), "google"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            this.RemoteActionCompatParcelizer.write(new onOrientationChange.RemoteActionCompatParcelizer(p0.getKycMeta()));
            return;
        }
        isSeekPending isseekpending2 = this.read;
        Map<String, ? extends Object> mapRemoteActionCompatParcelizer = getLatestBitrateEstimate.RemoteActionCompatParcelizer(readLine.read(p0), 0, 0, 0, 0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer, "");
        isseekpending2.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer);
        CollegeDetails college = p0.getCollege();
        if (college != null && !college.isUserCollegeDataAvailable()) {
            isSeekPending isseekpending3 = this.read;
            createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
            isseekpending3.write(createParcelSparseArray.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            this.RemoteActionCompatParcelizer.write(onOrientationChange.IconCompatParcelizer.INSTANCE);
        } else {
            isSeekPending isseekpending4 = this.read;
            createParcelSparseArray createparcelsparsearray2 = createParcelSparseArray.write;
            isseekpending4.write(createParcelSparseArray.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            this.RemoteActionCompatParcelizer.write(onOrientationChange.read.INSTANCE);
        }
        isSeekPending isseekpending5 = this.read;
        createParcelSparseArray createparcelsparsearray3 = createParcelSparseArray.write;
        isseekpending5.write(createParcelSparseArray.IconCompatParcelizer(createParcelSparseArray.IconCompatParcelizer.RemoteActionCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        this.read.write("login_complete", createParcelSparseArray.read(p0.getUserId(), p0.getPhoneNumber().getCountryCode(), p1, -1, ""), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(readDouble p0, String p1) throws Throwable {
        this.read.write("signup_complete", createParcelSparseArray.read(true, p0.getUserId(), p1, -1, (String) null), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        isSeekPending isseekpending = this.read;
        createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
        isseekpending.write(createParcelSparseArray.read(loadBitmap.RemoteActionCompatParcelizer(new Date().getTime(), "dd/MM/yyyy")), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.read));
        isSeekPending isseekpending2 = this.read;
        getInfoWindowAnchorV getinfowindowanchorv = getInfoWindowAnchorV.INSTANCE;
        isseekpending2.write(getInfoWindowAnchorV.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        this.RemoteActionCompatParcelizer.write(onOrientationChange.AudioAttributesImplBaseParcelizer.INSTANCE);
        isSeekPending isseekpending3 = this.read;
        Map<String, ? extends Object> mapRemoteActionCompatParcelizer = getLatestBitrateEstimate.RemoteActionCompatParcelizer(readLine.read(p0), 0, 0, 0, 0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer, "");
        isseekpending3.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private /* synthetic */ GoogleSignUpViewModel IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                readInt24 readint24 = new readInt24(null, null, null, this.write, 7, null);
                this.AudioAttributesCompatParcelizer = null;
                this.read = 1;
                obj = this.IconCompatParcelizer.IconCompatParcelizer.read(readint24, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            readDouble readdouble = (readDouble) obj;
            CollegeDetails college = readdouble.getCollege();
            if (college == null || college.isUserCollegeDataAvailable()) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(readdouble, this.RemoteActionCompatParcelizer);
            } else {
                this.IconCompatParcelizer.read(readdouble, this.RemoteActionCompatParcelizer);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, GoogleSignUpViewModel googleSignUpViewModel, String str2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
            this.IconCompatParcelizer = googleSignUpViewModel;
            this.RemoteActionCompatParcelizer = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(String p0, final String p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p0, this, p1, null), new MagicModuleSubmissionRequestBody() { // from class: o.onSensorChanged
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return GoogleSignUpViewModel.write(this.IconCompatParcelizer, p1, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(GoogleSignUpViewModel googleSignUpViewModel, String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        googleSignUpViewModel.read.write("signup_complete", createParcelSparseArray.read(false, "", str, i, str2), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        if (i == 502) {
            googleSignUpViewModel.RemoteActionCompatParcelizer.write(onOrientationChange.AudioAttributesCompatParcelizer.INSTANCE);
        } else {
            googleSignUpViewModel.RemoteActionCompatParcelizer.write(new onOrientationChange.AudioAttributesImplApi26Parcelizer(str2));
        }
        return getShowPopup.INSTANCE;
    }
}
