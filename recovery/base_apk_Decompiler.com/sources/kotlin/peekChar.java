package kotlin;

import com.marrow.data.models.user.State;
import com.marrow2.data.user.remote.model.CourseModelV3;
import com.marrow2.data.user.remote.model.LoginResponseBody;
import com.marrow2.data.user.remote.model.onboarding.OtpRetryType;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ6\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018J6\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u001aJ&\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020!H¦@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H¦@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H¦@¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020$2\u0006\u0010*\u001a\u00020.H¦@¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u0002012\u0006\u0010*\u001a\u000202H¦@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u0002052\u0006\u0010 \u001a\u000206H¦@¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020$2\u0006\u0010*\u001a\u000209H¦@¢\u0006\u0002\u0010:J$\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\bH¦@¢\u0006\u0002\u0010@J\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020B0<H¦@¢\u0006\u0002\u0010\tJ\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020D0<H¦@¢\u0006\u0002\u0010\tJ\b\u0010E\u001a\u00020\u0003H&J\u000e\u0010F\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u001e\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH¦@¢\u0006\u0002\u0010JJ\u0016\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010MJ\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00130OH¦@¢\u0006\u0002\u0010\tJ\u0018\u0010P\u001a\f\u0012\b\u0012\u00060Qj\u0002`R0<H¦@¢\u0006\u0002\u0010\tJ\u001e\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\f2\u0006\u0010U\u001a\u00020\fH¦@¢\u0006\u0002\u0010JJ\u000e\u0010V\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u000e\u0010W\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\tJ\u000e\u0010X\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\t¨\u0006YÀ\u0006\u0003"}, d2 = {"Lcom/marrow2/domain/onboard/OnboardUseCase;", "", "setServerInfo", "", "serverInfoModel", "Lcom/marrow2/ui/onboarding/landing/model/ServerInfoModel;", "(Lcom/marrow2/ui/onboarding/landing/model/ServerInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isProductionHost", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setServerType", "serverType", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginWithPhoneNumber", "Lcom/marrow2/domain/user/model/onboarding/PhoneLoginResponseUCModel;", "otpRetryType", "Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "countryCode", "", "phoneNumber", "forceLogin", "otpDeliveryChannel", "Lcom/marrow2/domain/onboard/model/OtpDeliveryChannel;", "(Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;Ljava/lang/String;Ljava/lang/String;ZLcom/marrow2/domain/onboard/model/OtpDeliveryChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newUserVerifyPhoneNumber", "(Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;ILjava/lang/String;ZLcom/marrow2/domain/onboard/model/OtpDeliveryChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newUserVerifyOtpPhoneNumber", "otp", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOtp", "Lcom/marrow2/domain/user/model/onboarding/OtpValidateIntermediateUCModel;", "requestBody", "Lcom/marrow2/domain/user/model/onboarding/OtpRequestUCModel;", "(Lcom/marrow2/domain/user/model/onboarding/OtpRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chooseAccount", "Lcom/marrow2/domain/onboard/model/SaveUserResponseUCModel;", "requestUCModel", "Lcom/marrow2/domain/user/model/AccountSelectionRequestUCModel;", "(Lcom/marrow2/domain/user/model/AccountSelectionRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailAuthenticationType", "Lcom/marrow2/domain/user/model/sign_in/EmailLoginResponseUCModel;", "request", "Lcom/marrow2/domain/user/model/sign_in/EmailLoginRequestUCModel;", "(Lcom/marrow2/domain/user/model/sign_in/EmailLoginRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailPasswordOtpLogin", "Lcom/marrow2/domain/user/model/sign_in/EmailPasswordOtpRequestUCModel;", "(Lcom/marrow2/domain/user/model/sign_in/EmailPasswordOtpRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailForgotPassword", "Lcom/marrow2/domain/user/model/sign_in/EmailForgotPasswordResponseUCModel;", "Lcom/marrow2/domain/user/model/sign_in/EmailForgotPasswordRequestUCModel;", "(Lcom/marrow2/domain/user/model/sign_in/EmailForgotPasswordRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailAuthentication", "Lcom/marrow2/data/user/remote/model/LoginResponseBody;", "Lcom/marrow2/domain/onboard/model/LoginRequestUCModel;", "(Lcom/marrow2/domain/onboard/model/LoginRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/marrow2/domain/onboard/model/SignUpRequestUCModel;", "(Lcom/marrow2/domain/onboard/model/SignUpRequestUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadColleges", "", "Lcom/marrow2/domain/onboard/model/InstitutesUCModel;", "id", "isFMGE", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFmgeCountries", "Lcom/marrow2/domain/onboard/model/CountriesUCModel;", "getCourses", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "getCoursesV1", "isPlaystoreInstallEnforced", "setCurrentCourse", "selectedCourseId", "selectedEditionId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCurrentCourseName", "courseNameWithEdition", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdmissionYearList", "", "getStateList", "Lcom/marrow/data/models/user/State;", "Lcom/marrow2/domain/state/model/StateUCModel;", "setFirstSyncComplete", "courseId", "editionId", "isFMGECourse", "setNotificationPermissionDeniedTime", "detectChromeOS", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface peekChar {
    Object AudioAttributesCompatParcelizer();

    Object AudioAttributesCompatParcelizer(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(OtpRetryType otpRetryType, String str, String str2, limit limitVar, SampleVideos<? super getPcmEncoding> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, boolean z, SampleVideos<? super List<peekUnsignedByte>> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super List<CourseModelV3>> sampleVideos);

    Object AudioAttributesCompatParcelizer(getStreamTypeForAudioUsage getstreamtypeforaudiousage, SampleVideos<? super readDouble> sampleVideos);

    Object AudioAttributesCompatParcelizer(getSystemLocales getsystemlocales, SampleVideos<? super getStringForTime> sampleVideos);

    Object AudioAttributesImplBaseParcelizer(SampleVideos<? super List<ensureCapacity>> sampleVideos);

    Object IconCompatParcelizer(int i, String str, String str2, SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(OtpRetryType otpRetryType, int i, String str, boolean z, limit limitVar, SampleVideos<? super getPcmEncoding> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super List<? extends State>> sampleVideos);

    Object IconCompatParcelizer(getPcmFormat getpcmformat, SampleVideos<? super getSystemLanguageCodes> sampleVideos);

    Object IconCompatParcelizer(readDelimiterTerminatedString readdelimiterterminatedstring, SampleVideos<? super LoginResponseBody> sampleVideos);

    void IconCompatParcelizer();

    Object MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super Boolean> sampleVideos);

    Object MediaBrowserCompatItemReceiver(SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(createStringArray createstringarray, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(getLocaleLanguageTag getlocalelanguagetag, SampleVideos<? super readDouble> sampleVideos);

    Object read(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(SampleVideos<? super Boolean> sampleVideos);

    Object read(readInt24 readint24, SampleVideos<? super readDouble> sampleVideos);

    Object write(SampleVideos<? super Boolean> sampleVideos);

    Object write(@getTimeTook getMediaDurationForPlayoutDuration getmediadurationforplayoutduration, SampleVideos<? super getNowUnixTimeMs> sampleVideos);
}
