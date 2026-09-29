package kotlin;

import android.content.Context;
import com.marrow.data.models.user.State;
import com.marrow2.data.user.remote.model.CourseModelV3;
import com.marrow2.data.user.remote.model.LoginResponseBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\n\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001mBW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J6\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0096@¢\u0006\u0002\u0010,J6\u0010-\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020 2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0096@¢\u0006\u0002\u0010.J&\u0010/\u001a\u00020\u00172\u0006\u0010&\u001a\u00020 2\u0006\u0010(\u001a\u00020'2\u0006\u00100\u001a\u00020'H\u0096@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0096@¢\u0006\u0002\u00106J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0096@¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0096@¢\u0006\u0002\u0010@J\u0016\u0010A\u001a\u0002082\u0006\u0010>\u001a\u00020BH\u0096@¢\u0006\u0002\u0010CJ\u0016\u0010D\u001a\u00020E2\u0006\u0010>\u001a\u00020FH\u0096@¢\u0006\u0002\u0010GJ\u0016\u0010H\u001a\u00020I2\u0006\u00104\u001a\u00020JH\u0096@¢\u0006\u0002\u0010KJ\u0016\u0010L\u001a\u0002082\u0006\u0010>\u001a\u00020MH\u0096@¢\u0006\u0002\u0010NJ\u0018\u0010O\u001a\f\u0012\b\u0012\u00060Qj\u0002`R0PH\u0096@¢\u0006\u0002\u0010\u001dJ$\u0010S\u001a\b\u0012\u0004\u0012\u00020T0P2\u0006\u0010U\u001a\u00020'2\u0006\u0010V\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010WJ\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0PH\u0096@¢\u0006\u0002\u0010\u001dJ\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0PH\u0096@¢\u0006\u0002\u0010\u001dJ\u001e\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020 2\u0006\u0010^\u001a\u00020 H\u0096@¢\u0006\u0002\u0010_J\u0016\u0010`\u001a\u00020\u00172\u0006\u0010a\u001a\u00020'H\u0096@¢\u0006\u0002\u0010bJ\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020'0dH\u0096@¢\u0006\u0002\u0010\u001dJ\u001e\u0010e\u001a\u00020\u00172\u0006\u0010f\u001a\u00020 2\u0006\u0010g\u001a\u00020 H\u0096@¢\u0006\u0002\u0010_J\u000e\u0010h\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u000e\u0010i\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001dJ\b\u0010j\u001a\u00020\u0017H\u0016J\u000e\u0010k\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u000e\u0010l\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lcom/marrow2/domain/onboard/OnBoardingUseCaseImpl;", "Lcom/marrow2/domain/onboard/OnboardUseCase;", "preferenceRepository", "Lcom/marrow2/data/pref/repo/PreferenceRepository;", "courseConfigRepository", "Lcom/marrow2/data/course_config/repo/CourseConfigRepository;", "userRepository", "Lcom/marrow2/data/user/repo/UserRepository;", "stateRepository", "Lcom/marrow2/data/state/repo/StateRepository;", "remoteConfigRepository", "Lcom/marrow2/data/remoteconfig/repo/RemoteConfigRepository;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "applicationContext", "Landroid/content/Context;", "<init>", "(Lcom/marrow2/data/pref/repo/PreferenceRepository;Lcom/marrow2/data/course_config/repo/CourseConfigRepository;Lcom/marrow2/data/user/repo/UserRepository;Lcom/marrow2/data/state/repo/StateRepository;Lcom/marrow2/data/remoteconfig/repo/RemoteConfigRepository;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Landroid/content/Context;)V", "setServerInfo", "", "serverInfoModel", "Lcom/marrow2/ui/onboarding/landing/model/ServerInfoModel;", "(Lcom/marrow2/ui/onboarding/landing/model/ServerInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isProductionHost", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setServerType", "serverType", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginWithPhoneNumber", "Lcom/marrow2/domain/user/model/onboarding/PhoneLoginResponseUCModel;", "otpRetryType", "Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "countryCode", "", "phoneNumber", "forceLogin", "otpDeliveryChannel", "Lcom/marrow2/domain/onboard/model/OtpDeliveryChannel;", "(Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;Ljava/lang/String;Ljava/lang/String;ZLcom/marrow2/domain/onboard/model/OtpDeliveryChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newUserVerifyPhoneNumber", "(Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;ILjava/lang/String;ZLcom/marrow2/domain/onboard/model/OtpDeliveryChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newUserVerifyOtpPhoneNumber", "otp", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOtp", "Lcom/marrow2/domain/user/model/onboarding/OtpValidateIntermediateUCModel;", "requestBody", "Lcom/marrow2/domain/user/model/onboarding/OtpRequestUCModel;", "(Lcom/marrow2/domain/user/model/onboarding/OtpRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chooseAccount", "Lcom/marrow2/domain/onboard/model/SaveUserResponseUCModel;", "requestUCModel", "Lcom/marrow2/domain/user/model/AccountSelectionRequestUCModel;", "(Lcom/marrow2/domain/user/model/AccountSelectionRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailAuthenticationType", "Lcom/marrow2/domain/user/model/sign_in/EmailLoginResponseUCModel;", "request", "Lcom/marrow2/domain/user/model/sign_in/EmailLoginRequestUCModel;", "(Lcom/marrow2/domain/user/model/sign_in/EmailLoginRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailPasswordOtpLogin", "Lcom/marrow2/domain/user/model/sign_in/EmailPasswordOtpRequestUCModel;", "(Lcom/marrow2/domain/user/model/sign_in/EmailPasswordOtpRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailForgotPassword", "Lcom/marrow2/domain/user/model/sign_in/EmailForgotPasswordResponseUCModel;", "Lcom/marrow2/domain/user/model/sign_in/EmailForgotPasswordRequestUCModel;", "(Lcom/marrow2/domain/user/model/sign_in/EmailForgotPasswordRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailAuthentication", "Lcom/marrow2/data/user/remote/model/LoginResponseBody;", "Lcom/marrow2/domain/onboard/model/LoginRequestUCModel;", "(Lcom/marrow2/domain/onboard/model/LoginRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/marrow2/domain/onboard/model/SignUpRequestUCModel;", "(Lcom/marrow2/domain/onboard/model/SignUpRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStateList", "", "Lcom/marrow/data/models/user/State;", "Lcom/marrow2/domain/state/model/StateUCModel;", "loadColleges", "Lcom/marrow2/domain/onboard/model/InstitutesUCModel;", "id", "isFMGE", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFmgeCountries", "Lcom/marrow2/domain/onboard/model/CountriesUCModel;", "getCourses", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "setCurrentCourse", "selectedCourseId", "selectedEditionId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCurrentCourseName", "courseNameWithEdition", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdmissionYearList", "", "setFirstSyncComplete", "courseId", "editionId", "isFMGECourse", "setNotificationPermissionDeniedTime", "getCoursesV1", "isPlaystoreInstallEnforced", "detectChromeOS", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class skipLineTerminator implements peekChar {
    public static final read AudioAttributesCompatParcelizer = new read(null);
    private final getVideoResolutionFromMpeg4VideoConfig AudioAttributesImplApi21Parcelizer;
    private final r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc AudioAttributesImplApi26Parcelizer;
    private final isProtectedContentExtensionSupported AudioAttributesImplBaseParcelizer;
    private final Context IconCompatParcelizer;
    private final getPlatform MediaBrowserCompatCustomActionResultReceiver;
    private final unlockFolder MediaBrowserCompatItemReceiver;
    private final TopUserCompanion RemoteActionCompatParcelizer;
    private final getSingletonInstance read;
    private final isSeekPending write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return skipLineTerminator.this.IconCompatParcelizer((getPcmFormat) null, this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return skipLineTerminator.this.read(this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return skipLineTerminator.this.AudioAttributesCompatParcelizer((getSystemLocales) null, this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int read;
        Object write;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return skipLineTerminator.this.AudioAttributesCompatParcelizer((getStreamTypeForAudioUsage) null, this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        boolean write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return skipLineTerminator.this.AudioAttributesCompatParcelizer((String) null, false, (SampleVideos<? super List<peekUnsignedByte>>) this);
        }
    }

    static final class MediaBrowserCompatMediaItem extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.AudioAttributesImplBaseParcelizer |= Integer.MIN_VALUE;
            return skipLineTerminator.this.IconCompatParcelizer(0, null, null, this);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        boolean AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
            return skipLineTerminator.this.IconCompatParcelizer(null, 0, null, false, null, this);
        }
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;

        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return skipLineTerminator.this.RemoteActionCompatParcelizer((createStringArray) null, this);
        }
    }

    static final class MediaDescriptionCompat extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        boolean MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return skipLineTerminator.this.AudioAttributesCompatParcelizer(null, null, null, null, this);
        }
    }

    static final class MediaMetadataCompat extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int write;

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return skipLineTerminator.this.AudioAttributesImplBaseParcelizer(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return skipLineTerminator.this.RemoteActionCompatParcelizer((getLocaleLanguageTag) null, this);
        }
    }

    static final class onAddQueueItem extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;

        onAddQueueItem(SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return skipLineTerminator.this.read((readInt24) null, this);
        }
    }

    static final class onCommand extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return skipLineTerminator.this.write(null, this);
        }
    }

    @setSdkPayload
    public skipLineTerminator(unlockFolder unlockfolder, getSingletonInstance getsingletoninstance, isProtectedContentExtensionSupported isprotectedcontentextensionsupported, getVideoResolutionFromMpeg4VideoConfig getvideoresolutionfrommpeg4videoconfig, r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc r8lambdapcverwyxpseovkadoo9np03hivc, isSeekPending isseekpending, TopUserCompanion topUserCompanion, getPlatform getplatform, Context context) {
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        toMagicModuleMetaRepoModel.write(getsingletoninstance, "");
        toMagicModuleMetaRepoModel.write(isprotectedcontentextensionsupported, "");
        toMagicModuleMetaRepoModel.write(getvideoresolutionfrommpeg4videoconfig, "");
        toMagicModuleMetaRepoModel.write(r8lambdapcverwyxpseovkadoo9np03hivc, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(context, "");
        this.MediaBrowserCompatItemReceiver = unlockfolder;
        this.read = getsingletoninstance;
        this.AudioAttributesImplBaseParcelizer = isprotectedcontentextensionsupported;
        this.AudioAttributesImplApi21Parcelizer = getvideoresolutionfrommpeg4videoconfig;
        this.AudioAttributesImplApi26Parcelizer = r8lambdapcverwyxpseovkadoo9np03hivc;
        this.write = isseekpending;
        this.RemoteActionCompatParcelizer = topUserCompanion;
        this.MediaBrowserCompatCustomActionResultReceiver = getplatform;
        this.IconCompatParcelizer = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r5.AudioAttributesImplBaseParcelizer(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.createStringArray r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.skipLineTerminator.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r0 == 0) goto L14
            r0 = r7
            o.skipLineTerminator$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r0 = (o.skipLineTerminator.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            o.skipLineTerminator$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r0 = new o.skipLineTerminator$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            o.createStringArray r5 = (kotlin.createStringArray) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L7e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            o.createStringArray r6 = (kotlin.createStringArray) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L6c
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            java.lang.String r7 = r6.getWrite()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L82
            java.lang.String r7 = r6.getAudioAttributesCompatParcelizer()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L82
            o.unlockFolder r7 = r5.MediaBrowserCompatItemReceiver
            java.lang.String r2 = r6.getWrite()
            r0.RemoteActionCompatParcelizer = r6
            r0.read = r4
            java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r2, r0)
            if (r7 == r1) goto L81
        L6c:
            o.unlockFolder r5 = r5.MediaBrowserCompatItemReceiver
            java.lang.String r6 = r6.getAudioAttributesCompatParcelizer()
            r7 = 0
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r3
            java.lang.Object r5 = r5.AudioAttributesImplBaseParcelizer(r6, r0)
            if (r5 != r1) goto L7e
            goto L81
        L7e:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L81:
            return r1
        L82:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.RemoteActionCompatParcelizer(o.createStringArray, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.peekChar
    public final Object MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super Boolean> sampleVideos) {
        return this.MediaBrowserCompatItemReceiver.addObserverForBackInvoker(sampleVideos);
    }

    @Override // kotlin.peekChar
    public final Object read(int i, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(i, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(com.marrow2.data.user.remote.model.onboarding.OtpRetryType r11, java.lang.String r12, java.lang.String r13, kotlin.limit r14, kotlin.SampleVideos<? super kotlin.getPcmEncoding> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof o.skipLineTerminator.MediaDescriptionCompat
            if (r0 == 0) goto L14
            r0 = r15
            o.skipLineTerminator$MediaDescriptionCompat r0 = (o.skipLineTerminator.MediaDescriptionCompat) r0
            int r1 = r0.MediaBrowserCompatItemReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.MediaBrowserCompatItemReceiver
            int r15 = r15 + r2
            r0.MediaBrowserCompatItemReceiver = r15
            goto L19
        L14:
            o.skipLineTerminator$MediaDescriptionCompat r0 = new o.skipLineTerminator$MediaDescriptionCompat
            r0.<init>(r15)
        L19:
            java.lang.Object r15 = r0.AudioAttributesImplBaseParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.MediaBrowserCompatItemReceiver
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r10 = r0.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r10 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r10 = r0.IconCompatParcelizer
            java.lang.Object r10 = r0.write
            java.lang.Object r10 = r0.RemoteActionCompatParcelizer
            java.lang.Object r10 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)
            goto L6e
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)
            com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails r15 = new com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r15
            r5 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            o.getPcmFrameSize r12 = new o.getPcmFrameSize
            r13 = 0
            r12.<init>(r11, r15, r13, r14)
            o.isProtectedContentExtensionSupported r10 = r10.AudioAttributesImplBaseParcelizer
            o.createEglPbufferSurface r11 = kotlin.inferContentType.RemoteActionCompatParcelizer(r12)
            r12 = 0
            r0.read = r12
            r0.RemoteActionCompatParcelizer = r12
            r0.write = r12
            r0.IconCompatParcelizer = r12
            r0.AudioAttributesCompatParcelizer = r12
            r0.MediaBrowserCompatCustomActionResultReceiver = r13
            r0.MediaBrowserCompatItemReceiver = r3
            java.lang.Object r15 = r10.RemoteActionCompatParcelizer(r11, r0)
            if (r15 != r1) goto L6e
            return r1
        L6e:
            o.getEglConfig r15 = (kotlin.getEglConfig) r15
            o.getPcmEncoding r10 = kotlin.inferContentType.read(r15)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.AudioAttributesCompatParcelizer(com.marrow2.data.user.remote.model.onboarding.OtpRetryType, java.lang.String, java.lang.String, o.limit, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
    
        if (r1 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(com.marrow2.data.user.remote.model.onboarding.OtpRetryType r17, int r18, java.lang.String r19, boolean r20, kotlin.limit r21, kotlin.SampleVideos<? super kotlin.getPcmEncoding> r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r22
            boolean r2 = r1 instanceof o.skipLineTerminator.MediaBrowserCompatSearchResultReceiver
            if (r2 == 0) goto L18
            r2 = r1
            o.skipLineTerminator$MediaBrowserCompatSearchResultReceiver r2 = (o.skipLineTerminator.MediaBrowserCompatSearchResultReceiver) r2
            int r3 = r2.MediaBrowserCompatCustomActionResultReceiver
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + r4
            r2.MediaBrowserCompatCustomActionResultReceiver = r1
            goto L1d
        L18:
            o.skipLineTerminator$MediaBrowserCompatSearchResultReceiver r2 = new o.skipLineTerminator$MediaBrowserCompatSearchResultReceiver
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.MediaBrowserCompatItemReceiver
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.MediaBrowserCompatCustomActionResultReceiver
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L60
            if (r4 == r6) goto L49
            if (r4 != r5) goto L41
            boolean r0 = r2.AudioAttributesImplApi26Parcelizer
            int r0 = r2.RemoteActionCompatParcelizer
            java.lang.Object r0 = r2.IconCompatParcelizer
            o.getPcmFrameSize r0 = (kotlin.getPcmFrameSize) r0
            java.lang.Object r0 = r2.write
            java.lang.Object r0 = r2.read
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto Lb9
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L49:
            boolean r0 = r2.AudioAttributesImplApi26Parcelizer
            int r4 = r2.RemoteActionCompatParcelizer
            java.lang.Object r6 = r2.AudioAttributesImplApi21Parcelizer
            o.isProtectedContentExtensionSupported r6 = (kotlin.isProtectedContentExtensionSupported) r6
            java.lang.Object r8 = r2.IconCompatParcelizer
            o.getPcmFrameSize r8 = (kotlin.getPcmFrameSize) r8
            java.lang.Object r9 = r2.write
            java.lang.Object r9 = r2.read
            java.lang.Object r9 = r2.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            r9 = r4
            goto L9c
        L60:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails r1 = new com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails
            java.lang.String r11 = java.lang.String.valueOf(r18)
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r1
            r12 = r19
            r10.<init>(r11, r12, r13, r14, r15)
            o.getPcmFrameSize r8 = new o.getPcmFrameSize
            r4 = 0
            r9 = r17
            r10 = r21
            r8.<init>(r9, r1, r4, r10)
            o.isProtectedContentExtensionSupported r1 = r0.AudioAttributesImplBaseParcelizer
            o.unlockFolder r0 = r0.MediaBrowserCompatItemReceiver
            r2.AudioAttributesCompatParcelizer = r7
            r2.read = r7
            r2.write = r7
            r2.IconCompatParcelizer = r8
            r2.AudioAttributesImplApi21Parcelizer = r1
            r9 = r18
            r2.RemoteActionCompatParcelizer = r9
            r2.AudioAttributesImplApi26Parcelizer = r4
            r2.MediaBrowserCompatCustomActionResultReceiver = r6
            java.lang.Object r0 = r0.MediaSessionCompatToken(r2)
            if (r0 == r3) goto Lc0
            r6 = r1
            r1 = r0
            r0 = r20
        L9c:
            java.lang.String r1 = (java.lang.String) r1
            o.createEglPbufferSurface r4 = kotlin.inferContentType.RemoteActionCompatParcelizer(r8)
            r2.AudioAttributesCompatParcelizer = r7
            r2.read = r7
            r2.write = r7
            r2.IconCompatParcelizer = r7
            r2.AudioAttributesImplApi21Parcelizer = r7
            r2.RemoteActionCompatParcelizer = r9
            r2.AudioAttributesImplApi26Parcelizer = r0
            r2.MediaBrowserCompatCustomActionResultReceiver = r5
            java.lang.Object r1 = r6.read(r1, r4, r2)
            if (r1 != r3) goto Lb9
            goto Lc0
        Lb9:
            o.getEglConfig r1 = (kotlin.getEglConfig) r1
            o.getPcmEncoding r0 = kotlin.inferContentType.read(r1)
            return r0
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.IconCompatParcelizer(com.marrow2.data.user.remote.model.onboarding.OtpRetryType, int, java.lang.String, boolean, o.limit, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if (r8.IconCompatParcelizer(r10, (kotlin.SampleVideos<? super kotlin.getShowPopup>) r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(int r9, java.lang.String r10, java.lang.String r11, kotlin.SampleVideos<? super kotlin.getShowPopup> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof o.skipLineTerminator.MediaBrowserCompatMediaItem
            if (r0 == 0) goto L14
            r0 = r12
            o.skipLineTerminator$MediaBrowserCompatMediaItem r0 = (o.skipLineTerminator.MediaBrowserCompatMediaItem) r0
            int r1 = r0.AudioAttributesImplBaseParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.AudioAttributesImplBaseParcelizer
            int r12 = r12 + r2
            r0.AudioAttributesImplBaseParcelizer = r12
            goto L19
        L14:
            o.skipLineTerminator$MediaBrowserCompatMediaItem r0 = new o.skipLineTerminator$MediaBrowserCompatMediaItem
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.AudioAttributesImplApi21Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesImplBaseParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L68
            if (r2 == r5) goto L56
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            int r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r8 = r0.IconCompatParcelizer
            com.marrow2.data.user.remote.model.SaveUserResponseModel r8 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r8
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            o.focusRenderTarget r8 = (kotlin.focusRenderTarget) r8
            java.lang.Object r8 = r0.write
            java.lang.Object r8 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            goto Lc0
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            int r9 = r0.RemoteActionCompatParcelizer
            java.lang.Object r10 = r0.AudioAttributesCompatParcelizer
            o.focusRenderTarget r10 = (kotlin.focusRenderTarget) r10
            java.lang.Object r10 = r0.write
            java.lang.Object r10 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            goto La1
        L56:
            int r9 = r0.RemoteActionCompatParcelizer
            java.lang.Object r10 = r0.IconCompatParcelizer
            o.isProtectedContentExtensionSupported r10 = (kotlin.isProtectedContentExtensionSupported) r10
            java.lang.Object r11 = r0.AudioAttributesCompatParcelizer
            o.focusRenderTarget r11 = (kotlin.focusRenderTarget) r11
            java.lang.Object r2 = r0.write
            java.lang.Object r2 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            goto L8d
        L68:
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            o.focusRenderTarget r12 = new o.focusRenderTarget
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r12.<init>(r2, r10, r11)
            o.isProtectedContentExtensionSupported r10 = r8.AudioAttributesImplBaseParcelizer
            o.unlockFolder r11 = r8.MediaBrowserCompatItemReceiver
            r0.read = r6
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r12
            r0.IconCompatParcelizer = r10
            r0.RemoteActionCompatParcelizer = r9
            r0.AudioAttributesImplBaseParcelizer = r5
            java.lang.Object r11 = r11.MediaSessionCompatToken(r0)
            if (r11 == r1) goto Lc3
            r7 = r12
            r12 = r11
            r11 = r7
        L8d:
            java.lang.String r12 = (java.lang.String) r12
            r0.read = r6
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r6
            r0.IconCompatParcelizer = r6
            r0.RemoteActionCompatParcelizer = r9
            r0.AudioAttributesImplBaseParcelizer = r4
            java.lang.Object r12 = r10.IconCompatParcelizer(r12, r11, r0)
            if (r12 == r1) goto Lc3
        La1:
            com.marrow2.data.user.remote.model.SaveUserResponseModel r12 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r12
            o.unlockFolder r8 = r8.MediaBrowserCompatItemReceiver
            com.marrow2.data.user.remote.model.CourseDetail r10 = r12.getCourseDetail()
            int r10 = r10.getDefaultEdition()
            r0.read = r6
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r6
            r0.IconCompatParcelizer = r6
            r0.RemoteActionCompatParcelizer = r9
            r0.AudioAttributesImplBaseParcelizer = r3
            java.lang.Object r8 = r8.IconCompatParcelizer(r10, r0)
            if (r8 != r1) goto Lc0
            goto Lc3
        Lc0:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.IconCompatParcelizer(int, java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.getMediaDurationForPlayoutDuration r8, kotlin.SampleVideos<? super kotlin.getNowUnixTimeMs> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.skipLineTerminator.onCommand
            if (r0 == 0) goto L14
            r0 = r9
            o.skipLineTerminator$onCommand r0 = (o.skipLineTerminator.onCommand) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.IconCompatParcelizer
            int r9 = r9 + r2
            r0.IconCompatParcelizer = r9
            goto L19
        L14:
            o.skipLineTerminator$onCommand r0 = new o.skipLineTerminator$onCommand
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.write
            o.setToIdentity r7 = (kotlin.setToIdentity) r7
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L9f
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r8 = r0.write
            o.setToIdentity r8 = (kotlin.setToIdentity) r8
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L8b
        L49:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L62
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.isProtectedContentExtensionSupported r9 = r7.AudioAttributesImplBaseParcelizer
            o.GlUtilApi17 r8 = kotlin.handlePauseButtonAction.AudioAttributesCompatParcelizer(r8)
            r0.AudioAttributesCompatParcelizer = r6
            r0.IconCompatParcelizer = r5
            java.lang.Object r9 = r9.AudioAttributesCompatParcelizer(r8, r0)
            if (r9 == r1) goto La5
        L62:
            o.setToIdentity r9 = (kotlin.setToIdentity) r9
            java.util.List r8 = r9.IconCompatParcelizer()
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto La0
            o.obtainMessage r8 = r9.getSaveUserResponseRepoModel()
            o.zaB r8 = r8.getKycMeta()
            if (r8 != 0) goto La0
            o.unlockFolder r8 = r7.MediaBrowserCompatItemReceiver
            o.obtainMessage r2 = r9.getSaveUserResponseRepoModel()
            r0.AudioAttributesCompatParcelizer = r6
            r0.write = r9
            r0.IconCompatParcelizer = r4
            java.lang.Object r8 = r8.write(r2, r0)
            if (r8 == r1) goto La5
            r8 = r9
        L8b:
            o.unlockFolder r7 = r7.MediaBrowserCompatItemReceiver
            long r4 = java.lang.System.currentTimeMillis()
            r0.AudioAttributesCompatParcelizer = r6
            r0.write = r8
            r0.IconCompatParcelizer = r3
            java.lang.Object r7 = r7.IconCompatParcelizer(r4, r0)
            if (r7 != r1) goto L9e
            goto La5
        L9e:
            r7 = r8
        L9f:
            r9 = r7
        La0:
            o.getNowUnixTimeMs r7 = kotlin.handlePauseButtonAction.AudioAttributesCompatParcelizer(r9)
            return r7
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.write(o.getMediaDurationForPlayoutDuration, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.getLocaleLanguageTag r8, kotlin.SampleVideos<? super kotlin.readDouble> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.skipLineTerminator.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.skipLineTerminator$RemoteActionCompatParcelizer r0 = (o.skipLineTerminator.RemoteActionCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.AudioAttributesCompatParcelizer
            int r9 = r9 + r2
            r0.AudioAttributesCompatParcelizer = r9
            goto L19
        L14:
            o.skipLineTerminator$RemoteActionCompatParcelizer r0 = new o.skipLineTerminator$RemoteActionCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.write
            o.obtainMessage r7 = (kotlin.obtainMessage) r7
            java.lang.Object r8 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L8d
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r8 = r0.write
            o.obtainMessage r8 = (kotlin.obtainMessage) r8
            java.lang.Object r2 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L79
        L49:
            java.lang.Object r8 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L62
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.isProtectedContentExtensionSupported r9 = r7.AudioAttributesImplBaseParcelizer
            o.isYuvTargetExtensionSupported r8 = kotlin.handlePlayButtonAction.AudioAttributesCompatParcelizer(r8)
            r0.IconCompatParcelizer = r6
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r9 = r9.write(r8, r0)
            if (r9 == r1) goto L93
        L62:
            o.obtainMessage r9 = (kotlin.obtainMessage) r9
            o.zaB r8 = r9.getKycMeta()
            if (r8 != 0) goto L8e
            o.unlockFolder r8 = r7.MediaBrowserCompatItemReceiver
            r0.IconCompatParcelizer = r6
            r0.write = r9
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r8 = r8.write(r9, r0)
            if (r8 == r1) goto L93
            r8 = r9
        L79:
            o.unlockFolder r7 = r7.MediaBrowserCompatItemReceiver
            long r4 = java.lang.System.currentTimeMillis()
            r0.IconCompatParcelizer = r6
            r0.write = r8
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r7 = r7.IconCompatParcelizer(r4, r0)
            if (r7 != r1) goto L8c
            goto L93
        L8c:
            r7 = r8
        L8d:
            r9 = r7
        L8e:
            o.readDouble r7 = kotlin.readInt.IconCompatParcelizer(r9)
            return r7
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.RemoteActionCompatParcelizer(o.getLocaleLanguageTag, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.getSystemLocales r5, kotlin.SampleVideos<? super kotlin.getStringForTime> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.skipLineTerminator.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.skipLineTerminator$IconCompatParcelizer r0 = (o.skipLineTerminator.IconCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.skipLineTerminator$IconCompatParcelizer r0 = new o.skipLineTerminator$IconCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L49
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.isProtectedContentExtensionSupported r4 = r4.AudioAttributesImplBaseParcelizer
            o.sendEmptyMessageAtTime r5 = kotlin.isAutomotive.RemoteActionCompatParcelizer(r5)
            r6 = 0
            r0.RemoteActionCompatParcelizer = r6
            r0.write = r3
            java.lang.Object r6 = r4.AudioAttributesCompatParcelizer(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.marrow2.data.user.remote.model.sign_in.EmailLoginResponseRepoModel r6 = (com.marrow2.data.user.remote.model.sign_in.EmailLoginResponseRepoModel) r6
            o.getStringForTime r4 = kotlin.isAutomotive.RemoteActionCompatParcelizer(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.AudioAttributesCompatParcelizer(o.getSystemLocales, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.getStreamTypeForAudioUsage r8, kotlin.SampleVideos<? super kotlin.readDouble> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.skipLineTerminator.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L14
            r0 = r9
            o.skipLineTerminator$MediaBrowserCompatCustomActionResultReceiver r0 = (o.skipLineTerminator.MediaBrowserCompatCustomActionResultReceiver) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.read
            int r9 = r9 + r2
            r0.read = r9
            goto L19
        L14:
            o.skipLineTerminator$MediaBrowserCompatCustomActionResultReceiver r0 = new o.skipLineTerminator$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.write
            o.obtainMessage r7 = (kotlin.obtainMessage) r7
            java.lang.Object r8 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L8d
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r8 = r0.write
            o.obtainMessage r8 = (kotlin.obtainMessage) r8
            java.lang.Object r2 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L79
        L49:
            java.lang.Object r8 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L62
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.isProtectedContentExtensionSupported r9 = r7.AudioAttributesImplBaseParcelizer
            o.sendEmptyMessage r8 = kotlin.isAutomotive.RemoteActionCompatParcelizer(r8)
            r0.IconCompatParcelizer = r6
            r0.read = r5
            java.lang.Object r9 = r9.IconCompatParcelizer(r8, r0)
            if (r9 == r1) goto L93
        L62:
            o.obtainMessage r9 = (kotlin.obtainMessage) r9
            o.zaB r8 = r9.getKycMeta()
            if (r8 != 0) goto L8e
            o.unlockFolder r8 = r7.MediaBrowserCompatItemReceiver
            r0.IconCompatParcelizer = r6
            r0.write = r9
            r0.read = r4
            java.lang.Object r8 = r8.write(r9, r0)
            if (r8 == r1) goto L93
            r8 = r9
        L79:
            o.unlockFolder r7 = r7.MediaBrowserCompatItemReceiver
            long r4 = java.lang.System.currentTimeMillis()
            r0.IconCompatParcelizer = r6
            r0.write = r8
            r0.read = r3
            java.lang.Object r7 = r7.IconCompatParcelizer(r4, r0)
            if (r7 != r1) goto L8c
            goto L93
        L8c:
            r7 = r8
        L8d:
            r9 = r7
        L8e:
            o.readDouble r7 = kotlin.readInt.IconCompatParcelizer(r9)
            return r7
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.AudioAttributesCompatParcelizer(o.getStreamTypeForAudioUsage, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.getPcmFormat r5, kotlin.SampleVideos<? super kotlin.getSystemLanguageCodes> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.skipLineTerminator.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.skipLineTerminator$AudioAttributesCompatParcelizer r0 = (o.skipLineTerminator.AudioAttributesCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.skipLineTerminator$AudioAttributesCompatParcelizer r0 = new o.skipLineTerminator$AudioAttributesCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L49
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.isProtectedContentExtensionSupported r4 = r4.AudioAttributesImplBaseParcelizer
            o.HandlerWrapper r5 = kotlin.isAutomotive.AudioAttributesCompatParcelizer(r5)
            r6 = 0
            r0.IconCompatParcelizer = r6
            r0.write = r3
            java.lang.Object r6 = r4.RemoteActionCompatParcelizer(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            o.GlUtilGlException r6 = (kotlin.GlUtilGlException) r6
            o.getSystemLanguageCodes r4 = kotlin.isAutomotive.read(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.IconCompatParcelizer(o.getPcmFormat, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.peekChar
    public final Object IconCompatParcelizer(readDelimiterTerminatedString readdelimiterterminatedstring, SampleVideos<? super LoginResponseBody> sampleVideos) {
        return this.AudioAttributesImplBaseParcelizer.read(readLittleEndianInt.AudioAttributesCompatParcelizer(readdelimiterterminatedstring), sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.readInt24 r8, kotlin.SampleVideos<? super kotlin.readDouble> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.skipLineTerminator.onAddQueueItem
            if (r0 == 0) goto L14
            r0 = r9
            o.skipLineTerminator$onAddQueueItem r0 = (o.skipLineTerminator.onAddQueueItem) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.read
            int r9 = r9 + r2
            r0.read = r9
            goto L19
        L14:
            o.skipLineTerminator$onAddQueueItem r0 = new o.skipLineTerminator$onAddQueueItem
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            o.obtainMessage r7 = (kotlin.obtainMessage) r7
            java.lang.Object r8 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L87
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            o.obtainMessage r8 = (kotlin.obtainMessage) r8
            java.lang.Object r2 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L73
        L49:
            java.lang.Object r8 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L62
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.isProtectedContentExtensionSupported r9 = r7.AudioAttributesImplBaseParcelizer
            o.hasMessages r8 = kotlin.readLittleEndianInt.RemoteActionCompatParcelizer(r8)
            r0.IconCompatParcelizer = r6
            r0.read = r5
            java.lang.Object r9 = r9.write(r8, r0)
            if (r9 == r1) goto L8c
        L62:
            o.obtainMessage r9 = (kotlin.obtainMessage) r9
            o.unlockFolder r8 = r7.MediaBrowserCompatItemReceiver
            r0.IconCompatParcelizer = r6
            r0.RemoteActionCompatParcelizer = r9
            r0.read = r4
            java.lang.Object r8 = r8.write(r9, r0)
            if (r8 == r1) goto L8c
            r8 = r9
        L73:
            o.unlockFolder r7 = r7.MediaBrowserCompatItemReceiver
            long r4 = java.lang.System.currentTimeMillis()
            r0.IconCompatParcelizer = r6
            r0.RemoteActionCompatParcelizer = r8
            r0.read = r3
            java.lang.Object r7 = r7.IconCompatParcelizer(r4, r0)
            if (r7 != r1) goto L86
            goto L8c
        L86:
            r7 = r8
        L87:
            o.readDouble r7 = kotlin.readInt.IconCompatParcelizer(r7)
            return r7
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.read(o.readInt24, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.peekChar
    public final Object IconCompatParcelizer(SampleVideos<? super List<? extends State>> sampleVideos) {
        return this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r5, boolean r6, kotlin.SampleVideos<? super java.util.List<kotlin.peekUnsignedByte>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.skipLineTerminator.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r7
            o.skipLineTerminator$MediaBrowserCompatItemReceiver r0 = (o.skipLineTerminator.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.skipLineTerminator$MediaBrowserCompatItemReceiver r0 = new o.skipLineTerminator$MediaBrowserCompatItemReceiver
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r4 = r0.write
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.isProtectedContentExtensionSupported r4 = r4.AudioAttributesImplBaseParcelizer
            r7 = 0
            r0.RemoteActionCompatParcelizer = r7
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r7 = r4.IconCompatParcelizer(r5, r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.util.List r7 = (java.util.List) r7
            java.util.List r4 = kotlin.readLittleEndianInt.AudioAttributesCompatParcelizer(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.AudioAttributesCompatParcelizer(java.lang.String, boolean, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplBaseParcelizer(kotlin.SampleVideos<? super java.util.List<kotlin.ensureCapacity>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.skipLineTerminator.MediaMetadataCompat
            if (r0 == 0) goto L14
            r0 = r5
            o.skipLineTerminator$MediaMetadataCompat r0 = (o.skipLineTerminator.MediaMetadataCompat) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.write
            int r5 = r5 + r2
            r0.write = r5
            goto L19
        L14:
            o.skipLineTerminator$MediaMetadataCompat r0 = new o.skipLineTerminator$MediaMetadataCompat
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.isProtectedContentExtensionSupported r4 = r4.AudioAttributesImplBaseParcelizer
            r0.write = r3
            java.lang.Object r5 = r4.AudioAttributesImplBaseParcelizer(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.util.List r5 = (java.util.List) r5
            java.util.List r4 = kotlin.readLittleEndianInt.read(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.AudioAttributesImplBaseParcelizer(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.peekChar
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super List<CourseModelV3>> sampleVideos) {
        return this.read.read(sampleVideos);
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (skipLineTerminator.this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.write, this.IconCompatParcelizer, this) == objIconCompatParcelizer) {
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
        RatingCompat(int i, int i2, SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
            this.write = i;
            this.IconCompatParcelizer = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return skipLineTerminator.this.new RatingCompat(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.peekChar
    public final Object AudioAttributesCompatParcelizer(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, new RatingCompat(i, i2, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (skipLineTerminator.this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.read, this) == objIconCompatParcelizer) {
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
        handleMediaPlayPauseIfPendingOnHandler(String str, SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return skipLineTerminator.this.new handleMediaPlayPauseIfPendingOnHandler(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((handleMediaPlayPauseIfPendingOnHandler) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.peekChar
    public final Object IconCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, new handleMediaPlayPauseIfPendingOnHandler(str, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.peekChar
    public final Object AudioAttributesCompatParcelizer() {
        String strOnPlay = this.AudioAttributesImplApi26Parcelizer.onPlay();
        if (strOnPlay.length() == 0) {
            strOnPlay = "2026";
        }
        getDecryptedContent getdecryptedcontent = getQues.read(Integer.parseInt(strOnPlay), 2000);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(getdecryptedcontent, 10));
        Iterator<Integer> it = getdecryptedcontent.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer()));
        }
        return IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList);
    }

    @Override // kotlin.peekChar
    public final Object read(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = this.MediaBrowserCompatItemReceiver.read(i, i2, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.peekChar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.skipLineTerminator.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r5
            o.skipLineTerminator$AudioAttributesImplApi26Parcelizer r0 = (o.skipLineTerminator.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.write
            int r5 = r5 + r2
            r0.write = r5
            goto L19
        L14:
            o.skipLineTerminator$AudioAttributesImplApi26Parcelizer r0 = new o.skipLineTerminator$AudioAttributesImplApi26Parcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.unlockFolder r4 = r4.MediaBrowserCompatItemReceiver
            r0.write = r3
            java.lang.Object r5 = r4.AudioAttributesImplBaseParcelizer(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r5.intValue()
            r5 = 4
            if (r4 == r5) goto L4a
            r3 = 0
        L4a:
            java.lang.Boolean r4 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.skipLineTerminator.read(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.peekChar
    public final Object MediaBrowserCompatItemReceiver(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = this.MediaBrowserCompatItemReceiver.write(System.currentTimeMillis(), sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (skipLineTerminator.this.read.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return skipLineTerminator.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.peekChar
    public final void IconCompatParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.peekCharacterAndSize
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return skipLineTerminator.IconCompatParcelizer((String) obj2);
            }
        });
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc r8lambdapcverwyxpseovkadoo9np03hivc = skipLineTerminator.this.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesCompatParcelizer = 1;
            return r8lambdapcverwyxpseovkadoo9np03hivc.onPlayFromMediaId();
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return skipLineTerminator.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.peekChar
    public final Object write(SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AudioAttributesImplApi21Parcelizer(null), sampleVideos);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            buildLanguageOrLabelString buildlanguageorlabelstring = buildLanguageOrLabelString.INSTANCE;
            buildLanguageString buildlanguagestringRemoteActionCompatParcelizer = buildLanguageOrLabelString.RemoteActionCompatParcelizer(skipLineTerminator.this.IconCompatParcelizer);
            isSeekPending isseekpending = skipLineTerminator.this.write;
            createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
            isseekpending.write(createParcelSparseArray.AudioAttributesCompatParcelizer(buildlanguagestringRemoteActionCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return skipLineTerminator.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.peekChar
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, new write(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/skipLineTerminator$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
