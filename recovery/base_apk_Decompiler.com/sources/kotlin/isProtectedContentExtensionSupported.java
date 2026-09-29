package kotlin;

import android.graphics.Bitmap;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow2.data.kyc.remote.model.AuthBridgeOtpResponseBody;
import com.marrow2.data.user.remote.model.Countries;
import com.marrow2.data.user.remote.model.ForgotPasswordRequest;
import com.marrow2.data.user.remote.model.ForgotPasswordResponse;
import com.marrow2.data.user.remote.model.Institutes;
import com.marrow2.data.user.remote.model.LoginResponseBody;
import com.marrow2.data.user.remote.model.SaveUserResponseModel;
import com.marrow2.data.user.remote.model.UserKycStatusRepoModel;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import com.marrow2.data.user.remote.model.sign_in.EmailLoginResponseRepoModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u001fJ\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H¦@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u0016\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u0018\u0010'\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020*H¦@¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H¦@¢\u0006\u0002\u0010-J\u001e\u0010.\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020/H¦@¢\u0006\u0002\u00100J\u0018\u00101\u001a\u0002022\b\b\u0001\u0010)\u001a\u000203H¦@¢\u0006\u0002\u00104J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H¦@¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020;2\u0006\u0010)\u001a\u00020<H¦@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u0002062\u0006\u0010)\u001a\u00020?H¦@¢\u0006\u0002\u0010@J\u0016\u0010A\u001a\u00020B2\u0006\u0010)\u001a\u00020CH¦@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020F2\u0006\u0010)\u001a\u00020GH¦@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u0002062\u0006\u0010)\u001a\u00020JH¦@¢\u0006\u0002\u0010KJ$\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020QH¦@¢\u0006\u0002\u0010RJ\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020T0MH¦@¢\u0006\u0002\u0010\u0019J(\u0010U\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0M0V2\u0006\u0010X\u001a\u00020!H¦@¢\u0006\u0002\u0010YJ&\u0010Z\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010^J\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020`0MH¦@¢\u0006\u0002\u0010\u0019J\u0016\u0010a\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u0016\u0010b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J.\u0010c\u001a\u00020\u001b2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010fJ\u0010\u0010g\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0019J\u000e\u0010h\u001a\u00020iH¦@¢\u0006\u0002\u0010\u0019J\u001e\u0010j\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010k\u001a\u00020QH¦@¢\u0006\u0002\u0010RJ\u000e\u0010l\u001a\u00020QH¦@¢\u0006\u0002\u0010\u0019J\u000e\u0010m\u001a\u00020QH¦@¢\u0006\u0002\u0010\u0019J\u001e\u0010n\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010o\u001a\u00020QH¦@¢\u0006\u0002\u0010RJ\u001a\u0010p\u001a\u00060qj\u0002`r2\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u000e\u0010s\u001a\u00020QH¦@¢\u0006\u0002\u0010\u0019J\u001e\u0010t\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010u\u001a\u00020QH¦@¢\u0006\u0002\u0010RJ\u001e\u0010v\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010w\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0016J\u0016\u0010x\u001a\u00020Q2\u0006\u0010w\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007¨\u0006yÀ\u0006\u0003"}, d2 = {"Lcom/marrow2/data/user/repo/UserRepository;", "", "getUser", "Lcom/marrow2/data/user/local/model/UserLSModel;", "Lcom/marrow2/data/user/local/model/UserRepoModel;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendForgotPasswordRequest", "Lcom/marrow2/data/user/remote/model/ForgotPasswordResponse;", "forgotPasswordRequest", "Lcom/marrow2/data/user/remote/model/ForgotPasswordRequest;", "(Lcom/marrow2/data/user/remote/model/ForgotPasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUser", "Lcom/marrow2/data/user/remote/model/SaveUserResponseModel;", "bitmap", "Landroid/graphics/Bitmap;", "userUCModel", "Lcom/marrow2/domain/user/model/UserUCModel;", "(Landroid/graphics/Bitmap;Lcom/marrow2/domain/user/model/UserUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeCourse", "courseId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getContentResetDetails", "Lcom/marrow2/data/user/repo/model/ResetContentInfoRepoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserKycStatus", "", "userKycStatusRequestModel", "Lcom/marrow2/data/user/remote/model/UserKycStatusRepoModel;", LoggedUserResponse.KEY_TOKEN, "(Lcom/marrow2/data/user/remote/model/UserKycStatusRepoModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kycStatus", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateAuthBridgeOtp", "Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpResponseBody;", "verifyAuthBridgeOtp", "otp", "loginWithPhoneNumber", "Lcom/marrow2/data/user/repo/model/PhoneLoginResponseRepoModel;", "requestBody", "Lcom/marrow2/data/user/repo/model/PhoneLoginRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/PhoneLoginRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newUserVerifyPhoneNumber", "(Ljava/lang/String;Lcom/marrow2/data/user/repo/model/PhoneLoginRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newUserVerifyOtpPhoneNumber", "Lcom/marrow2/data/user/repo/model/OtpVerifyRepoModel;", "(Ljava/lang/String;Lcom/marrow2/data/user/repo/model/OtpVerifyRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOtp", "Lcom/marrow2/data/user/repo/model/OtpValidateIntermediateRepoModel;", "Lcom/marrow2/data/user/repo/model/OtpRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/OtpRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chooseAccount", "Lcom/marrow2/data/user/repo/model/SaveUserResponseRepoModel;", "requestRepoModel", "Lcom/marrow2/data/user/repo/model/AccountSelectionRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/AccountSelectionRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailAuthenticationType", "Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginResponseRepoModel;", "Lcom/marrow2/data/user/repo/model/sign_in/EmailLoginRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/sign_in/EmailLoginRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailPasswordOtpLogin", "Lcom/marrow2/data/user/repo/model/sign_in/EmailPasswordOtpRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/sign_in/EmailPasswordOtpRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailForgotPassword", "Lcom/marrow2/data/user/repo/model/sign_in/EmailForgotPasswordResponseRepoModel;", "Lcom/marrow2/data/user/repo/model/sign_in/EmailForgotPasswordRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/sign_in/EmailForgotPasswordRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailAuthentication", "Lcom/marrow2/data/user/remote/model/LoginResponseBody;", "Lcom/marrow2/data/user/repo/model/LoginRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/LoginRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/marrow2/data/user/repo/model/SignUpRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/SignUpRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadColleges", "", "Lcom/marrow2/data/user/remote/model/Institutes;", "id", "isFmge", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFmgeCountries", "Lcom/marrow2/data/user/remote/model/Countries;", "getCourses", "Lkotlin/Pair;", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "courseVersion", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeProCallbackRequest", "message", "phoneNumber", "pageSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getYearMappingList", "Lcom/marrow2/data/user/constant/model/CollegeYearCSModel;", "showLegalTerm", "agreeTnC", "registerGcm", "country", "deviceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageToken", "getMediaTokenWithExpiry", "Lcom/marrow2/data/user/repo/MediaTokenModel;", "savePracticalCornerUserInteractionData", "practicalCornerInteracted", "isPracticalCornerIntroInteracted", "hasDiscoveredInteractiveVideoSubjectInsideRevision", "setInteractiveVideoSubjectDiscoveredInsideRevision", "hasDiscovered", "getUserContactInformation", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "Lcom/marrow2/data/user/local/model/UserPhoneRepoModel;", "hasAcknowledgedCadavericVideosPopup", "setCadavericVideosPopupAcknowledged", "hasAcknowledged", "saveEditionUpdatePopupAcknowledgement", "ackKey", "isEditionUpdatePopupAcknowledged", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface isProtectedContentExtensionSupported {
    Object AudioAttributesCompatParcelizer(Bitmap bitmap, getLocaleLanguageTagV21 getlocalelanguagetagv21, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super Boolean> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(@getTimeTook GlUtilApi17 glUtilApi17, SampleVideos<? super setToIdentity> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super postAtFrontOfQueue> sampleVideos);

    Object AudioAttributesCompatParcelizer(sendEmptyMessageAtTime sendemptymessageattime, SampleVideos<? super EmailLoginResponseRepoModel> sampleVideos);

    Object AudioAttributesImplApi21Parcelizer(SampleVideos<? super Boolean> sampleVideos);

    Object AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object AudioAttributesImplBaseParcelizer(SampleVideos<? super List<Countries>> sampleVideos);

    Object IconCompatParcelizer(String str, int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(String str, String str2, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super destroyEglSurface> sampleVideos);

    Object IconCompatParcelizer(String str, focusRenderTarget focusrendertarget, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object IconCompatParcelizer(String str, boolean z, SampleVideos<? super List<Institutes>> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super Boolean> sampleVideos);

    Object IconCompatParcelizer(sendEmptyMessage sendemptymessage, SampleVideos<? super obtainMessage> sampleVideos);

    Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super AuthBridgeOtpResponseBody> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, String str2, String str3, String str4, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super AuthBridgeOtpResponseBody> sampleVideos);

    Object RemoteActionCompatParcelizer(HandlerWrapper handlerWrapper, SampleVideos<? super GlUtilGlException> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super String> sampleVideos);

    Object RemoteActionCompatParcelizer(@getTimeTook createEglPbufferSurface createeglpbuffersurface, SampleVideos<? super getEglConfig> sampleVideos);

    Object read(ForgotPasswordRequest forgotPasswordRequest, SampleVideos<? super ForgotPasswordResponse> sampleVideos);

    Object read(UserKycStatusRepoModel userKycStatusRepoModel, String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(String str, SampleVideos<? super PhoneNumberDetails> sampleVideos);

    Object read(String str, createEglPbufferSurface createeglpbuffersurface, SampleVideos<? super getEglConfig> sampleVideos);

    Object read(String str, boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(SampleVideos<? super Boolean> sampleVideos);

    Object read(isBt2020PqExtensionSupported isbt2020pqextensionsupported, SampleVideos<? super LoginResponseBody> sampleVideos);

    Object write(String str, String str2, String str3, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(String str, String str2, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(String str, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object write(String str, boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(SampleVideos<? super isSurfacelessContextExtensionSupported> sampleVideos);

    Object write(hasMessages hasmessages, SampleVideos<? super obtainMessage> sampleVideos);

    Object write(isYuvTargetExtensionSupported isyuvtargetextensionsupported, SampleVideos<? super obtainMessage> sampleVideos);
}
