package kotlin;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.common.ApplicationData;
import com.marrow2.data.kyc.remote.model.AuthBridgeOtpRequestBody;
import com.marrow2.data.kyc.remote.model.AuthBridgeOtpResponseBody;
import com.marrow2.data.kyc.remote.model.AuthBridgeOtpVerifyRequestBody;
import com.marrow2.data.user.remote.model.Countries;
import com.marrow2.data.user.remote.model.ForgotPasswordRequest;
import com.marrow2.data.user.remote.model.ForgotPasswordResponse;
import com.marrow2.data.user.remote.model.GCMRegistrationRequest;
import com.marrow2.data.user.remote.model.Institutes;
import com.marrow2.data.user.remote.model.LegalAgreementRequest;
import com.marrow2.data.user.remote.model.LoginResponseBody;
import com.marrow2.data.user.remote.model.ProCallbackRSModel;
import com.marrow2.data.user.remote.model.SaveUserResponseModel;
import com.marrow2.data.user.remote.model.TnCRequest;
import com.marrow2.data.user.remote.model.Triggers;
import com.marrow2.data.user.remote.model.UserKycStatusRepoModel;
import com.marrow2.data.user.remote.model.onboarding.OtpValidateIntermediateResponseModel;
import com.marrow2.data.user.remote.model.onboarding.PhoneLoginResponseBody;
import com.marrow2.data.user.remote.model.sign_in.EmailForgotPasswordResponseBody;
import com.marrow2.data.user.remote.model.sign_in.EmailLoginResponseBody;
import com.marrow2.data.user.remote.model.sign_in.EmailLoginResponseRepoModel;
import dagger.Lazy;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0095\u00012\u00020\u0001:\u0002\u0095\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J \u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010*J\u001e\u0010-\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0096@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u0016\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u000e\u00108\u001a\u000209H\u0096@¢\u0006\u0002\u0010:J\u001e\u00100\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010>J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0096@¢\u0006\u0002\u0010CJ\u001e\u0010D\u001a\u00020@2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010A\u001a\u00020BH\u0096@¢\u0006\u0002\u0010EJ\u001e\u0010F\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010A\u001a\u00020GH\u0096@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020J2\u0006\u0010A\u001a\u00020KH\u0096@¢\u0006\u0002\u0010LJ\u0016\u0010M\u001a\u00020,2\u0006\u0010N\u001a\u00020OH\u0082@¢\u0006\u0002\u0010PJ\u0016\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0096@¢\u0006\u0002\u0010UJ\u0016\u0010V\u001a\u00020W2\u0006\u0010A\u001a\u00020XH\u0096@¢\u0006\u0002\u0010YJ\u0016\u0010Z\u001a\u00020R2\u0006\u0010A\u001a\u00020[H\u0096@¢\u0006\u0002\u0010\\J\u0016\u0010]\u001a\u00020^2\u0006\u0010A\u001a\u00020_H\u0096@¢\u0006\u0002\u0010`J\u0016\u0010a\u001a\u00020b2\u0006\u0010A\u001a\u00020cH\u0096@¢\u0006\u0002\u0010dJ\u0016\u0010e\u001a\u00020R2\u0006\u0010A\u001a\u00020fH\u0096@¢\u0006\u0002\u0010gJ$\u0010h\u001a\b\u0012\u0004\u0012\u00020j0i2\u0006\u0010k\u001a\u00020\u00192\u0006\u0010l\u001a\u00020mH\u0096@¢\u0006\u0002\u0010nJ\u0014\u0010o\u001a\b\u0012\u0004\u0012\u00020p0iH\u0096@¢\u0006\u0002\u0010:J(\u0010q\u001a\u0014\u0012\u0004\u0012\u000202\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0i0r2\u0006\u0010t\u001a\u000202H\u0096@¢\u0006\u0002\u0010uJ&\u0010v\u001a\u00020,2\u0006\u0010w\u001a\u00020\u00192\u0006\u0010x\u001a\u00020\u00192\u0006\u0010y\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010zJ\u0014\u0010{\u001a\b\u0012\u0004\u0012\u00020|0iH\u0096@¢\u0006\u0002\u0010:J\u0016\u0010}\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u0016\u0010~\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ1\u0010\u007f\u001a\u00020,2\u0007\u0010\u0080\u0001\u001a\u00020\u00192\u0007\u0010\u0081\u0001\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0003\u0010\u0082\u0001J\u000f\u0010\u0083\u0001\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010:J\u0010\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0096@¢\u0006\u0002\u0010:J \u0010\u0086\u0001\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u00192\u0007\u0010\u0087\u0001\u001a\u00020mH\u0096@¢\u0006\u0002\u0010nJ\u000f\u0010\u0088\u0001\u001a\u00020mH\u0096@¢\u0006\u0002\u0010:J \u0010\u0089\u0001\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u00192\u0007\u0010\u008a\u0001\u001a\u00020mH\u0096@¢\u0006\u0002\u0010nJ\u000f\u0010\u008b\u0001\u001a\u00020mH\u0096@¢\u0006\u0002\u0010:J\u001d\u0010\u008c\u0001\u001a\b0\u008d\u0001j\u0003`\u008e\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ \u0010\u008f\u0001\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u00192\u0007\u0010\u0090\u0001\u001a\u00020mH\u0096@¢\u0006\u0002\u0010nJ\u000f\u0010\u0091\u0001\u001a\u00020mH\u0096@¢\u0006\u0002\u0010:J \u0010\u0092\u0001\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u00192\u0007\u0010\u0093\u0001\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010/J\u0018\u0010\u0094\u0001\u001a\u00020m2\u0007\u0010\u0093\u0001\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0096\u0001"}, d2 = {"Lcom/marrow2/data/user/repo/UserRepositoryImpl;", "Lcom/marrow2/data/user/repo/UserRepository;", "userLocalSource", "Lcom/marrow2/data/user/local/UserLocalSource;", "userRemoteSourceLazy", "Ldagger/Lazy;", "Lcom/marrow2/data/user/remote/UserRemoteSource;", "deviceInfoSource", "Lcom/marrow2/data/device/DeviceInfoSource;", "userConstantSource", "Lcom/marrow2/data/user/constant/UserConstantSource;", "applicationData", "Lcom/marrow/data/models/common/ApplicationData;", "preferenceLocalSource", "Lcom/marrow2/data/pref/local/PreferenceLocalSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/marrow2/data/user/local/UserLocalSource;Ldagger/Lazy;Lcom/marrow2/data/device/DeviceInfoSource;Lcom/marrow2/data/user/constant/UserConstantSource;Lcom/marrow/data/models/common/ApplicationData;Lcom/marrow2/data/pref/local/PreferenceLocalSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "userRemoteSource", "getUserRemoteSource", "()Lcom/marrow2/data/user/remote/UserRemoteSource;", "getRemoteUser", "Lcom/marrow2/data/user/remote/model/SaveUserResponseModel;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/marrow2/data/user/local/model/UserLSModel;", "Lcom/marrow2/data/user/local/model/UserRepoModel;", "sendForgotPasswordRequest", "Lcom/marrow2/data/user/remote/model/ForgotPasswordResponse;", "forgotPasswordRequest", "Lcom/marrow2/data/user/remote/model/ForgotPasswordRequest;", "(Lcom/marrow2/data/user/remote/model/ForgotPasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUser", "bitmap", "Landroid/graphics/Bitmap;", "userUCModel", "Lcom/marrow2/domain/user/model/UserUCModel;", "(Landroid/graphics/Bitmap;Lcom/marrow2/domain/user/model/UserUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userResponseModel", "(Lcom/marrow2/data/user/remote/model/SaveUserResponseModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserLocal", "", "changeCourse", "courseId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserKycStatus", "kycStatus", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateAuthBridgeOtp", "Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpResponseBody;", "verifyAuthBridgeOtp", "otp", "getContentResetDetails", "Lcom/marrow2/data/user/repo/model/ResetContentInfoRepoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userKycStatusRequestModel", "Lcom/marrow2/data/user/remote/model/UserKycStatusRepoModel;", LoggedUserResponse.KEY_TOKEN, "(Lcom/marrow2/data/user/remote/model/UserKycStatusRepoModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginWithPhoneNumber", "Lcom/marrow2/data/user/repo/model/PhoneLoginResponseRepoModel;", "requestBody", "Lcom/marrow2/data/user/repo/model/PhoneLoginRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/PhoneLoginRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newUserVerifyPhoneNumber", "(Ljava/lang/String;Lcom/marrow2/data/user/repo/model/PhoneLoginRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newUserVerifyOtpPhoneNumber", "Lcom/marrow2/data/user/repo/model/OtpVerifyRepoModel;", "(Ljava/lang/String;Lcom/marrow2/data/user/repo/model/OtpVerifyRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOtp", "Lcom/marrow2/data/user/repo/model/OtpValidateIntermediateRepoModel;", "Lcom/marrow2/data/user/repo/model/OtpRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/OtpRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserAcknowledgements", "triggers", "Lcom/marrow2/data/user/remote/model/Triggers;", "(Lcom/marrow2/data/user/remote/model/Triggers;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chooseAccount", "Lcom/marrow2/data/user/repo/model/SaveUserResponseRepoModel;", "requestRepoModel", "Lcom/marrow2/data/user/repo/model/AccountSelectionRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/AccountSelectionRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailAuthenticationType", "Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginResponseRepoModel;", "Lcom/marrow2/data/user/repo/model/sign_in/EmailLoginRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/sign_in/EmailLoginRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailPasswordOtpLogin", "Lcom/marrow2/data/user/repo/model/sign_in/EmailPasswordOtpRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/sign_in/EmailPasswordOtpRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailForgotPassword", "Lcom/marrow2/data/user/repo/model/sign_in/EmailForgotPasswordResponseRepoModel;", "Lcom/marrow2/data/user/repo/model/sign_in/EmailForgotPasswordRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/sign_in/EmailForgotPasswordRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailAuthentication", "Lcom/marrow2/data/user/remote/model/LoginResponseBody;", "Lcom/marrow2/data/user/repo/model/LoginRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/LoginRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/marrow2/data/user/repo/model/SignUpRequestRepoModel;", "(Lcom/marrow2/data/user/repo/model/SignUpRequestRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadColleges", "", "Lcom/marrow2/data/user/remote/model/Institutes;", "id", "isFmge", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFmgeCountries", "Lcom/marrow2/data/user/remote/model/Countries;", "getCourses", "Lkotlin/Pair;", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "courseVersion", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeProCallbackRequest", "message", "phoneNumber", "pageSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getYearMappingList", "Lcom/marrow2/data/user/constant/model/CollegeYearCSModel;", "showLegalTerm", "agreeTnC", "registerGcm", "country", "deviceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageToken", "getMediaTokenWithExpiry", "Lcom/marrow2/data/user/repo/MediaTokenModel;", "savePracticalCornerUserInteractionData", "practicalCornerInteracted", "isPracticalCornerIntroInteracted", "setInteractiveVideoSubjectDiscoveredInsideRevision", "hasDiscovered", "hasDiscoveredInteractiveVideoSubjectInsideRevision", "getUserContactInformation", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "Lcom/marrow2/data/user/local/model/UserPhoneRepoModel;", "setCadavericVideosPopupAcknowledged", "hasAcknowledged", "hasAcknowledgedCadavericVideosPopup", "saveEditionUpdatePopupAcknowledgement", "ackKey", "isEditionUpdatePopupAcknowledged", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getTextureCoordinateBounds implements isProtectedContentExtensionSupported {
    public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer(null);
    private final notifySpanRemoved AudioAttributesCompatParcelizer;
    private final Lazy<getCurrentContext> AudioAttributesImplBaseParcelizer;
    private final getPlatform IconCompatParcelizer;
    private final createPbufferSurface MediaBrowserCompatCustomActionResultReceiver;
    private final deleteFbo MediaBrowserCompatItemReceiver;
    private final ApplicationData RemoteActionCompatParcelizer;
    private final getContentDataSource write;

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        long write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.write(this);
        }
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.write((String) null, (String) null, this);
        }
    }

    static final class MediaDescriptionCompat extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;
        Object write;

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.read((String) null, this);
        }
    }

    static final class MediaMetadataCompat extends getTotalMcq {
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.MediaBrowserCompatItemReceiver(null, this);
        }
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        handleMediaPlayPauseIfPendingOnHandler(SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer((Bitmap) null, (getLocaleLanguageTagV21) null, this);
        }
    }

    static final class onAddQueueItem extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        boolean AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        onAddQueueItem(SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.write(getTextureCoordinateBounds.this, this);
        }
    }

    static final class onCommand extends getTotalMcq {
        boolean AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.read((String) null, false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class onCustomAction extends getTotalMcq {
        Object IconCompatParcelizer;
        int read;
        /* synthetic */ Object write;

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.RemoteActionCompatParcelizer(getTextureCoordinateBounds.this, this);
        }
    }

    static final class onFastForward extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object read;
        boolean write;

        onFastForward(SampleVideos<? super onFastForward> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer((String) null, false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class onPause extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        boolean IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object write;

        onPause(SampleVideos<? super onPause> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.write((String) null, false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class onPlay extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        onPlay(SampleVideos<? super onPlay> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer((SaveUserResponseModel) null, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return getTextureCoordinateBounds.this.IconCompatParcelizer((String) null, (String) null, this);
        }
    }

    @setSdkPayload
    public getTextureCoordinateBounds(createPbufferSurface createpbuffersurface, Lazy<getCurrentContext> lazy, getContentDataSource getcontentdatasource, deleteFbo deletefbo, ApplicationData applicationData, notifySpanRemoved notifyspanremoved, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(createpbuffersurface, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        toMagicModuleMetaRepoModel.write(getcontentdatasource, "");
        toMagicModuleMetaRepoModel.write(deletefbo, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(notifyspanremoved, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.MediaBrowserCompatCustomActionResultReceiver = createpbuffersurface;
        this.AudioAttributesImplBaseParcelizer = lazy;
        this.write = getcontentdatasource;
        this.MediaBrowserCompatItemReceiver = deletefbo;
        this.RemoteActionCompatParcelizer = applicationData;
        this.AudioAttributesCompatParcelizer = notifyspanremoved;
        this.IconCompatParcelizer = getplatform;
    }

    public static final /* synthetic */ Object RemoteActionCompatParcelizer(getTextureCoordinateBounds gettexturecoordinatebounds, SampleVideos sampleVideos) {
        return gettexturecoordinatebounds.write((SaveUserResponseModel) null, (SampleVideos<? super SaveUserResponseModel>) sampleVideos);
    }

    public static final /* synthetic */ Object write(getTextureCoordinateBounds gettexturecoordinatebounds, SampleVideos sampleVideos) {
        return gettexturecoordinatebounds.AudioAttributesCompatParcelizer((Triggers) null, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getTextureCoordinateBounds$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getCurrentContext AudioAttributesCompatParcelizer() {
        getCurrentContext getcurrentcontext = this.AudioAttributesImplBaseParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getcurrentcontext, "");
        return getcurrentcontext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatItemReceiver(java.lang.String r7, kotlin.SampleVideos<? super com.marrow2.data.user.remote.model.SaveUserResponseModel> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.getTextureCoordinateBounds.MediaMetadataCompat
            if (r0 == 0) goto L14
            r0 = r8
            o.getTextureCoordinateBounds$MediaMetadataCompat r0 = (o.getTextureCoordinateBounds.MediaMetadataCompat) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            o.getTextureCoordinateBounds$MediaMetadataCompat r0 = new o.getTextureCoordinateBounds$MediaMetadataCompat
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            return r8
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.IconCompatParcelizer
            o.getTextureCoordinateBounds r6 = (kotlin.getTextureCoordinateBounds) r6
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L55
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getCurrentContext r8 = r6.AudioAttributesCompatParcelizer()
            r0.RemoteActionCompatParcelizer = r5
            r0.IconCompatParcelizer = r6
            r0.write = r4
            java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r7, r0)
            if (r8 == r1) goto L65
        L55:
            com.marrow2.data.user.remote.model.SaveUserResponseModel r8 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r8
            r0.RemoteActionCompatParcelizer = r5
            r0.IconCompatParcelizer = r5
            r0.write = r3
            java.lang.Object r6 = r6.write(r8, r0)
            if (r6 != r1) goto L64
            goto L65
        L64:
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.MediaBrowserCompatItemReceiver(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object IconCompatParcelizer(String str, SampleVideos<? super destroyEglSurface> sampleVideos) {
        return this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(str, sampleVideos);
    }

    static final class onMediaButtonEvent extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super ForgotPasswordResponse>, Object> {
        private /* synthetic */ ForgotPasswordRequest IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            Object objWrite = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().write(getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer(), this.IconCompatParcelizer, this);
            return objWrite == objIconCompatParcelizer ? objIconCompatParcelizer : objWrite;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMediaButtonEvent(ForgotPasswordRequest forgotPasswordRequest, SampleVideos<? super onMediaButtonEvent> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = forgotPasswordRequest;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new onMediaButtonEvent(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super ForgotPasswordResponse> sampleVideos) {
            return ((onMediaButtonEvent) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object read(ForgotPasswordRequest forgotPasswordRequest, SampleVideos<? super ForgotPasswordResponse> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new onMediaButtonEvent(forgotPasswordRequest, null), sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(android.graphics.Bitmap r21, kotlin.getLocaleLanguageTagV21 r22, kotlin.SampleVideos<? super com.marrow2.data.user.remote.model.SaveUserResponseModel> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            boolean r2 = r1 instanceof o.getTextureCoordinateBounds.handleMediaPlayPauseIfPendingOnHandler
            if (r2 == 0) goto L18
            r2 = r1
            o.getTextureCoordinateBounds$handleMediaPlayPauseIfPendingOnHandler r2 = (o.getTextureCoordinateBounds.handleMediaPlayPauseIfPendingOnHandler) r2
            int r3 = r2.MediaBrowserCompatItemReceiver
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.MediaBrowserCompatItemReceiver
            int r1 = r1 + r4
            r2.MediaBrowserCompatItemReceiver = r1
            goto L1d
        L18:
            o.getTextureCoordinateBounds$handleMediaPlayPauseIfPendingOnHandler r2 = new o.getTextureCoordinateBounds$handleMediaPlayPauseIfPendingOnHandler
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.AudioAttributesImplBaseParcelizer
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.MediaBrowserCompatItemReceiver
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L52
            if (r4 == r6) goto L46
            if (r4 != r5) goto L3e
            int r0 = r2.write
            java.lang.Object r0 = r2.AudioAttributesImplApi21Parcelizer
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            java.lang.Object r0 = r2.IconCompatParcelizer
            java.lang.Object r0 = r2.read
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            return r1
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L46:
            java.lang.Object r4 = r2.RemoteActionCompatParcelizer
            java.lang.Object r4 = r2.IconCompatParcelizer
            java.lang.Object r4 = r2.read
            java.lang.Object r4 = r2.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L9d
        L52:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            com.marrow2.data.user.remote.model.SaveProfileRequestBody r8 = kotlin.focusFramebufferUsingCurrentContext.RemoteActionCompatParcelizer(r22)
            if (r21 == 0) goto L61
            java.lang.String r1 = kotlin.buildLabelString.AudioAttributesCompatParcelizer(r21)
            if (r1 != 0) goto L65
        L61:
            java.lang.String r1 = r22.onCommand()
        L65:
            r17 = r1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 255(0xff, float:3.57E-43)
            r19 = 0
            com.marrow2.data.user.remote.model.SaveProfileRequestBody r1 = com.marrow2.data.user.remote.model.SaveProfileRequestBody.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.marrow2.data.user.remote.model.CollegeDetails r4 = r1.getCollege()
            java.util.Map r4 = r4.getWhichCollegeDataIsNotPresent()
            com.marrow.data.models.common.ApplicationData r8 = r0.RemoteActionCompatParcelizer
            r8.logFirebaseException(r4)
            o.getCurrentContext r4 = r20.AudioAttributesCompatParcelizer()
            java.lang.String r8 = r22.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            r2.AudioAttributesCompatParcelizer = r7
            r2.read = r7
            r2.IconCompatParcelizer = r7
            r2.RemoteActionCompatParcelizer = r7
            r2.MediaBrowserCompatItemReceiver = r6
            java.lang.Object r1 = r4.write(r8, r1, r2)
            if (r1 == r3) goto Lb6
        L9d:
            com.marrow2.data.user.remote.model.SaveUserResponseModel r1 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r1
            r2.AudioAttributesCompatParcelizer = r7
            r2.read = r7
            r2.IconCompatParcelizer = r7
            r2.RemoteActionCompatParcelizer = r7
            r2.AudioAttributesImplApi21Parcelizer = r7
            r4 = 0
            r2.write = r4
            r2.MediaBrowserCompatItemReceiver = r5
            java.lang.Object r0 = r0.write(r1, r2)
            if (r0 != r3) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.AudioAttributesCompatParcelizer(android.graphics.Bitmap, o.getLocaleLanguageTagV21, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object write(com.marrow2.data.user.remote.model.SaveUserResponseModel r5, kotlin.SampleVideos<? super com.marrow2.data.user.remote.model.SaveUserResponseModel> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.getTextureCoordinateBounds.onCustomAction
            if (r0 == 0) goto L14
            r0 = r6
            o.getTextureCoordinateBounds$onCustomAction r0 = (o.getTextureCoordinateBounds.onCustomAction) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.read
            int r6 = r6 + r2
            r0.read = r6
            goto L19
        L14:
            o.getTextureCoordinateBounds$onCustomAction r0 = new o.getTextureCoordinateBounds$onCustomAction
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.IconCompatParcelizer
            com.marrow2.data.user.remote.model.SaveUserResponseModel r4 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            return r4
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            com.marrow.data.models.common.ApplicationData r6 = r4.RemoteActionCompatParcelizer
            r2 = 0
            r6.onProfileUpdated(r2)
            r0.IconCompatParcelizer = r5
            r0.read = r3
            java.lang.Object r4 = r4.AudioAttributesCompatParcelizer(r5, r0)
            if (r4 != r1) goto L4a
            return r1
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.write(com.marrow2.data.user.remote.model.SaveUserResponseModel, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(com.marrow2.data.user.remote.model.SaveUserResponseModel r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.getTextureCoordinateBounds.onPlay
            if (r0 == 0) goto L14
            r0 = r7
            o.getTextureCoordinateBounds$onPlay r0 = (o.getTextureCoordinateBounds.onPlay) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.getTextureCoordinateBounds$onPlay r0 = new o.getTextureCoordinateBounds$onPlay
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r5 = r0.IconCompatParcelizer
            java.lang.Object r5 = r0.read
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            com.marrow2.data.user.remote.model.SaveUserResponseModel r5 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L6c
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            com.marrow2.data.user.remote.model.SaveUserResponseModel r6 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L55
        L45:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.createPbufferSurface r7 = r5.MediaBrowserCompatCustomActionResultReceiver
            o.destroyEglSurface r2 = kotlin.deleteTexture.RemoteActionCompatParcelizer(r6)
            r0.RemoteActionCompatParcelizer = r6
            r0.AudioAttributesCompatParcelizer = r4
            r7.AudioAttributesCompatParcelizer(r2)
        L55:
            com.marrow2.data.user.remote.model.Triggers r6 = r6.getTriggers()
            if (r6 == 0) goto L6c
            r7 = 0
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r7
            r7 = 0
            r0.IconCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r5.AudioAttributesCompatParcelizer(r6, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.AudioAttributesCompatParcelizer(com.marrow2.data.user.remote.model.SaveUserResponseModel, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r7, java.lang.String r8, kotlin.SampleVideos<? super com.marrow2.data.user.remote.model.SaveUserResponseModel> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof o.getTextureCoordinateBounds.read
            if (r0 == 0) goto L14
            r0 = r9
            o.getTextureCoordinateBounds$read r0 = (o.getTextureCoordinateBounds.read) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.read
            int r9 = r9 + r2
            r0.read = r9
            goto L19
        L14:
            o.getTextureCoordinateBounds$read r0 = new o.getTextureCoordinateBounds$read
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesImplApi26Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            int r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r6 = r0.write
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            return r9
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L5e
        L46:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.getCurrentContext r9 = r6.AudioAttributesCompatParcelizer()
            com.marrow2.data.user.remote.model.DefaultCourseRequestBody r2 = new com.marrow2.data.user.remote.model.DefaultCourseRequestBody
            r2.<init>(r8)
            r0.RemoteActionCompatParcelizer = r5
            r0.IconCompatParcelizer = r5
            r0.read = r4
            java.lang.Object r9 = r9.AudioAttributesCompatParcelizer(r7, r2, r0)
            if (r9 == r1) goto L73
        L5e:
            com.marrow2.data.user.remote.model.SaveUserResponseModel r9 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r9
            r0.RemoteActionCompatParcelizer = r5
            r0.IconCompatParcelizer = r5
            r0.write = r5
            r7 = 0
            r0.AudioAttributesCompatParcelizer = r7
            r0.read = r3
            java.lang.Object r6 = r6.write(r9, r0)
            if (r6 != r1) goto L72
            goto L73
        L72:
            return r6
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.IconCompatParcelizer(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object IconCompatParcelizer(String str, int i, SampleVideos<? super getShowPopup> sampleVideos) {
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(str, i);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super AuthBridgeOtpResponseBody> sampleVideos) {
        return AudioAttributesCompatParcelizer().IconCompatParcelizer(new AuthBridgeOtpRequestBody(str), sampleVideos);
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super AuthBridgeOtpResponseBody> sampleVideos) {
        return AudioAttributesCompatParcelizer().read(new AuthBridgeOtpVerifyRequestBody(str), sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.postAtFrontOfQueue> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o.getTextureCoordinateBounds.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.getTextureCoordinateBounds$AudioAttributesImplApi26Parcelizer r0 = (o.getTextureCoordinateBounds.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.RemoteActionCompatParcelizer
            int r7 = r7 + r2
            r0.RemoteActionCompatParcelizer = r7
            goto L19
        L14:
            o.getTextureCoordinateBounds$AudioAttributesImplApi26Parcelizer r0 = new o.getTextureCoordinateBounds$AudioAttributesImplApi26Parcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            com.marrow2.data.user.remote.model.ResetContentInfoResponse r6 = (com.marrow2.data.user.remote.model.ResetContentInfoResponse) r6
            java.lang.Object r0 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L60
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4e
        L3f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getCurrentContext r7 = r6.AudioAttributesCompatParcelizer()
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r7 = r7.write(r0)
            if (r7 == r1) goto L67
        L4e:
            com.marrow2.data.user.remote.model.ResetContentInfoResponse r7 = (com.marrow2.data.user.remote.model.ResetContentInfoResponse) r7
            o.deleteFbo r6 = r6.MediaBrowserCompatItemReceiver
            r1 = 0
            r0.write = r1
            r0.AudioAttributesCompatParcelizer = r7
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r6.write()
            r5 = r7
            r7 = r6
            r6 = r5
        L60:
            com.marrow2.data.user.remote.model.ResetContentInfoResponse$ScreenCopy r7 = (com.marrow2.data.user.remote.model.ResetContentInfoResponse.ScreenCopy) r7
            o.postAtFrontOfQueue r6 = kotlin.HandlerWrapperMessage.AudioAttributesCompatParcelizer(r6, r7)
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object read(UserKycStatusRepoModel userKycStatusRepoModel, String str, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer(userKycStatusRepoModel, str, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getEglConfig>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ createEglPbufferSurface RemoteActionCompatParcelizer;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
                String str = getTextureCoordinateBounds.this.write.read();
                this.AudioAttributesCompatParcelizer = null;
                this.write = null;
                this.IconCompatParcelizer = 1;
                obj = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, LibraryLoader.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return LibraryLoader.read((PhoneLoginResponseBody) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatMediaItem(createEglPbufferSurface createeglpbuffersurface, SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = createeglpbuffersurface;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new MediaBrowserCompatMediaItem(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getEglConfig> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object RemoteActionCompatParcelizer(createEglPbufferSurface createeglpbuffersurface, SampleVideos<? super getEglConfig> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new MediaBrowserCompatMediaItem(createeglpbuffersurface, null), sampleVideos);
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getEglConfig>, Object> {
        private /* synthetic */ createEglPbufferSurface AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
                String str = getTextureCoordinateBounds.this.write.read();
                this.IconCompatParcelizer = null;
                this.write = null;
                this.read = 1;
                obj = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, strRemoteActionCompatParcelizer, LibraryLoader.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, str), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return LibraryLoader.read((PhoneLoginResponseBody) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat(String str, createEglPbufferSurface createeglpbuffersurface, SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = createeglpbuffersurface;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new RatingCompat(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getEglConfig> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object read(String str, createEglPbufferSurface createeglpbuffersurface, SampleVideos<? super getEglConfig> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new RatingCompat(str, createeglpbuffersurface, null), sampleVideos);
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super SaveUserResponseModel>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ focusRenderTarget read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
                String str = getTextureCoordinateBounds.this.write.read();
                this.RemoteActionCompatParcelizer = null;
                this.write = null;
                this.IconCompatParcelizer = 1;
                if (getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().write(this.AudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer, LibraryLoader.write(this.read, str), this) != objIconCompatParcelizer) {
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
            this.RemoteActionCompatParcelizer = null;
            this.write = null;
            this.IconCompatParcelizer = 2;
            Object objMediaBrowserCompatItemReceiver = getTextureCoordinateBounds.this.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, this);
            return objMediaBrowserCompatItemReceiver == objIconCompatParcelizer ? objIconCompatParcelizer : objMediaBrowserCompatItemReceiver;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatSearchResultReceiver(String str, focusRenderTarget focusrendertarget, SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.read = focusrendertarget;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new MediaBrowserCompatSearchResultReceiver(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super SaveUserResponseModel> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object IconCompatParcelizer(String str, focusRenderTarget focusrendertarget, SampleVideos<? super SaveUserResponseModel> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new MediaBrowserCompatSearchResultReceiver(str, focusrendertarget, null), sampleVideos);
    }

    static final class onPlayFromUri extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super setToIdentity>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ GlUtilApi17 read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            OtpValidateIntermediateResponseModel otpValidateIntermediateResponseModel;
            OtpValidateIntermediateResponseModel otpValidateIntermediateResponseModel2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
                String str = getTextureCoordinateBounds.this.write.read();
                this.IconCompatParcelizer = null;
                this.RemoteActionCompatParcelizer = null;
                this.write = 1;
                obj = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().read(strRemoteActionCompatParcelizer, sendMessageAtFrontOfQueue.write(this.read, str), this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                otpValidateIntermediateResponseModel2 = (OtpValidateIntermediateResponseModel) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                otpValidateIntermediateResponseModel = otpValidateIntermediateResponseModel2;
                return sendMessageAtFrontOfQueue.write(otpValidateIntermediateResponseModel);
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            otpValidateIntermediateResponseModel = (OtpValidateIntermediateResponseModel) obj;
            if (otpValidateIntermediateResponseModel.getUserMini().isEmpty() && otpValidateIntermediateResponseModel.getKycMeta() == null) {
                this.IconCompatParcelizer = null;
                this.RemoteActionCompatParcelizer = null;
                this.AudioAttributesCompatParcelizer = otpValidateIntermediateResponseModel;
                this.write = 2;
                if (getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer(otpValidateIntermediateResponseModel, this) != objIconCompatParcelizer) {
                    otpValidateIntermediateResponseModel2 = otpValidateIntermediateResponseModel;
                    otpValidateIntermediateResponseModel = otpValidateIntermediateResponseModel2;
                }
                return objIconCompatParcelizer;
            }
            return sendMessageAtFrontOfQueue.write(otpValidateIntermediateResponseModel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlayFromUri(GlUtilApi17 glUtilApi17, SampleVideos<? super onPlayFromUri> sampleVideos) {
            super(2, sampleVideos);
            this.read = glUtilApi17;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new onPlayFromUri(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super setToIdentity> sampleVideos) {
            return ((onPlayFromUri) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object AudioAttributesCompatParcelizer(GlUtilApi17 glUtilApi17, SampleVideos<? super setToIdentity> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new onPlayFromUri(glUtilApi17, null), sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r2.AudioAttributesCompatParcelizer(r10, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object AudioAttributesCompatParcelizer(com.marrow2.data.user.remote.model.Triggers r9, kotlin.SampleVideos<? super kotlin.getShowPopup> r10) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.AudioAttributesCompatParcelizer(com.marrow2.data.user.remote.model.Triggers, o.SampleVideos):java.lang.Object");
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super obtainMessage>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private /* synthetic */ isYuvTargetExtensionSupported IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            SaveUserResponseModel saveUserResponseModel;
            SaveUserResponseModel saveUserResponseModel2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
                String str = getTextureCoordinateBounds.this.write.read();
                this.write = null;
                this.read = null;
                this.RemoteActionCompatParcelizer = 1;
                obj = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(strRemoteActionCompatParcelizer, removeMessages.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str), this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                saveUserResponseModel2 = (SaveUserResponseModel) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                saveUserResponseModel = saveUserResponseModel2;
                return sendToTarget.IconCompatParcelizer(saveUserResponseModel);
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            saveUserResponseModel = (SaveUserResponseModel) obj;
            if (saveUserResponseModel.getKycMeta() == null) {
                this.write = null;
                this.read = null;
                this.AudioAttributesCompatParcelizer = saveUserResponseModel;
                this.RemoteActionCompatParcelizer = 2;
                if (getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer(saveUserResponseModel, this) != objIconCompatParcelizer) {
                    saveUserResponseModel2 = saveUserResponseModel;
                    saveUserResponseModel = saveUserResponseModel2;
                }
                return objIconCompatParcelizer;
            }
            return sendToTarget.IconCompatParcelizer(saveUserResponseModel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(isYuvTargetExtensionSupported isyuvtargetextensionsupported, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = isyuvtargetextensionsupported;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new RemoteActionCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super obtainMessage> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object write(isYuvTargetExtensionSupported isyuvtargetextensionsupported, SampleVideos<? super obtainMessage> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new RemoteActionCompatParcelizer(isyuvtargetextensionsupported, null), sampleVideos);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super EmailLoginResponseRepoModel>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ sendEmptyMessageAtTime IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
                String str = getTextureCoordinateBounds.this.write.read();
                this.read = null;
                this.RemoteActionCompatParcelizer = null;
                this.AudioAttributesCompatParcelizer = 1;
                obj = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, sendEmptyMessageDelayed.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, str), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return sendEmptyMessageDelayed.write((EmailLoginResponseBody) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(sendEmptyMessageAtTime sendemptymessageattime, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = sendemptymessageattime;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new write(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super EmailLoginResponseRepoModel> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object AudioAttributesCompatParcelizer(sendEmptyMessageAtTime sendemptymessageattime, SampleVideos<? super EmailLoginResponseRepoModel> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new write(sendemptymessageattime, null), sampleVideos);
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super obtainMessage>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private /* synthetic */ sendEmptyMessage RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            SaveUserResponseModel saveUserResponseModel;
            SaveUserResponseModel saveUserResponseModel2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
                String str = getTextureCoordinateBounds.this.write.read();
                this.AudioAttributesCompatParcelizer = null;
                this.IconCompatParcelizer = null;
                this.write = 1;
                obj = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, sendEmptyMessageDelayed.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, str), this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                saveUserResponseModel2 = (SaveUserResponseModel) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
                saveUserResponseModel = saveUserResponseModel2;
                return sendToTarget.IconCompatParcelizer(saveUserResponseModel);
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            saveUserResponseModel = (SaveUserResponseModel) obj;
            if (saveUserResponseModel.getKycMeta() == null) {
                this.AudioAttributesCompatParcelizer = null;
                this.IconCompatParcelizer = null;
                this.read = saveUserResponseModel;
                this.write = 2;
                if (getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer(saveUserResponseModel, this) != objIconCompatParcelizer) {
                    saveUserResponseModel2 = saveUserResponseModel;
                    saveUserResponseModel = saveUserResponseModel2;
                }
                return objIconCompatParcelizer;
            }
            return sendToTarget.IconCompatParcelizer(saveUserResponseModel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(sendEmptyMessage sendemptymessage, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = sendemptymessage;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super obtainMessage> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object IconCompatParcelizer(sendEmptyMessage sendemptymessage, SampleVideos<? super obtainMessage> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new AudioAttributesImplApi21Parcelizer(sendemptymessage, null), sampleVideos);
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super GlUtilGlException>, Object> {
        private /* synthetic */ HandlerWrapper IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer(), sendEmptyMessageDelayed.read(this.IconCompatParcelizer), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return sendEmptyMessageDelayed.read((EmailForgotPasswordResponseBody) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(HandlerWrapper handlerWrapper, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = handlerWrapper;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super GlUtilGlException> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object RemoteActionCompatParcelizer(HandlerWrapper handlerWrapper, SampleVideos<? super GlUtilGlException> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new AudioAttributesImplBaseParcelizer(handlerWrapper, null), sampleVideos);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super LoginResponseBody>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ isBt2020PqExtensionSupported write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
            String str = getTextureCoordinateBounds.this.write.read();
            this.RemoteActionCompatParcelizer = null;
            this.AudioAttributesCompatParcelizer = null;
            this.IconCompatParcelizer = 1;
            Object objIconCompatParcelizer2 = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(strRemoteActionCompatParcelizer, removeCallbacksAndMessages.IconCompatParcelizer(this.write, str), this);
            return objIconCompatParcelizer2 == objIconCompatParcelizer ? objIconCompatParcelizer : objIconCompatParcelizer2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(isBt2020PqExtensionSupported isbt2020pqextensionsupported, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = isbt2020pqextensionsupported;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new IconCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super LoginResponseBody> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object read(isBt2020PqExtensionSupported isbt2020pqextensionsupported, SampleVideos<? super LoginResponseBody> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new IconCompatParcelizer(isbt2020pqextensionsupported, null), sampleVideos);
    }

    static final class onPlayFromMediaId extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super obtainMessage>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ hasMessages write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            SaveUserResponseModel saveUserResponseModel;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String strRemoteActionCompatParcelizer = getTextureCoordinateBounds.this.write.RemoteActionCompatParcelizer();
                String str = getTextureCoordinateBounds.this.write.read();
                this.AudioAttributesCompatParcelizer = null;
                this.read = null;
                this.RemoteActionCompatParcelizer = 1;
                obj = getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer().read(strRemoteActionCompatParcelizer, removeCallbacksAndMessages.read(this.write, str), this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                saveUserResponseModel = (SaveUserResponseModel) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                getTextureCoordinateBounds.this.RemoteActionCompatParcelizer.onProfileUpdated(false);
                return sendToTarget.IconCompatParcelizer(saveUserResponseModel);
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            SaveUserResponseModel saveUserResponseModel2 = (SaveUserResponseModel) obj;
            this.AudioAttributesCompatParcelizer = null;
            this.read = null;
            this.IconCompatParcelizer = saveUserResponseModel2;
            this.RemoteActionCompatParcelizer = 2;
            if (getTextureCoordinateBounds.this.AudioAttributesCompatParcelizer(saveUserResponseModel2, this) != objIconCompatParcelizer) {
                saveUserResponseModel = saveUserResponseModel2;
                getTextureCoordinateBounds.this.RemoteActionCompatParcelizer.onProfileUpdated(false);
                return sendToTarget.IconCompatParcelizer(saveUserResponseModel);
            }
            return objIconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlayFromMediaId(hasMessages hasmessages, SampleVideos<? super onPlayFromMediaId> sampleVideos) {
            super(2, sampleVideos);
            this.write = hasmessages;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTextureCoordinateBounds.this.new onPlayFromMediaId(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super obtainMessage> sampleVideos) {
            return ((onPlayFromMediaId) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object write(hasMessages hasmessages, SampleVideos<? super obtainMessage> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new onPlayFromMediaId(hasmessages, null), sampleVideos);
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object IconCompatParcelizer(String str, boolean z, SampleVideos<? super List<Institutes>> sampleVideos) {
        return AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(str, z, sampleVideos);
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object AudioAttributesImplBaseParcelizer(SampleVideos<? super List<Countries>> sampleVideos) {
        return AudioAttributesCompatParcelizer().read(sampleVideos);
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object write(String str, String str2, String str3, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = AudioAttributesCompatParcelizer().write(str, str2, str3, (SampleVideos<? super ProCallbackRSModel>) sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super SaveUserResponseModel> sampleVideos) {
        return AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(str, new LegalAgreementRequest(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), sampleVideos);
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object write(String str, SampleVideos<? super SaveUserResponseModel> sampleVideos) {
        return AudioAttributesCompatParcelizer().read(str, new TnCRequest(String.valueOf(System.currentTimeMillis())), sampleVideos);
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object RemoteActionCompatParcelizer(String str, String str2, String str3, String str4, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(str4, new GCMRegistrationRequest(str3, str2, LogSubCategory.LifeCycle.ANDROID, str), sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.getTextureCoordinateBounds.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L14
            r0 = r5
            o.getTextureCoordinateBounds$MediaBrowserCompatCustomActionResultReceiver r0 = (o.getTextureCoordinateBounds.MediaBrowserCompatCustomActionResultReceiver) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            o.getTextureCoordinateBounds$MediaBrowserCompatCustomActionResultReceiver r0 = new o.getTextureCoordinateBounds$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L3e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            r0.read = r3
            java.lang.Object r5 = r4.write(r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            o.isSurfacelessContextExtensionSupported r5 = (kotlin.isSurfacelessContextExtensionSupported) r5
            java.lang.String r4 = r5.IconCompatParcelizer()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.isSurfacelessContextExtensionSupported> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.write(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (r6.read(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r7, boolean r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof o.getTextureCoordinateBounds.onCommand
            if (r0 == 0) goto L14
            r0 = r9
            o.getTextureCoordinateBounds$onCommand r0 = (o.getTextureCoordinateBounds.onCommand) r0
            int r1 = r0.AudioAttributesImplApi21Parcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.AudioAttributesImplApi21Parcelizer
            int r9 = r9 + r2
            r0.AudioAttributesImplApi21Parcelizer = r9
            goto L19
        L14:
            o.getTextureCoordinateBounds$onCommand r0 = new o.getTextureCoordinateBounds$onCommand
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.MediaBrowserCompatItemReceiver
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesImplApi21Parcelizer
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            int r6 = r0.IconCompatParcelizer
            boolean r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r6 = r0.read
            java.lang.Object r6 = r0.write
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L74
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            boolean r8 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L5b
        L48:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.getCurrentContext r9 = r6.AudioAttributesCompatParcelizer()
            r0.RemoteActionCompatParcelizer = r5
            r0.AudioAttributesCompatParcelizer = r8
            r0.AudioAttributesImplApi21Parcelizer = r4
            java.lang.Object r9 = r9.AudioAttributesCompatParcelizer(r7, r8, r0)
            if (r9 == r1) goto L77
        L5b:
            r7 = r9
            com.marrow2.data.user.remote.model.SaveUserResponseModel r7 = (com.marrow2.data.user.remote.model.SaveUserResponseModel) r7
            o.notifySpanRemoved r6 = r6.AudioAttributesCompatParcelizer
            r0.RemoteActionCompatParcelizer = r5
            r0.write = r9
            r0.read = r5
            r0.AudioAttributesCompatParcelizer = r8
            r7 = 0
            r0.IconCompatParcelizer = r7
            r0.AudioAttributesImplApi21Parcelizer = r3
            java.lang.Object r6 = r6.read(r8, r0)
            if (r6 != r1) goto L74
            goto L77
        L74:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.read(java.lang.String, boolean, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object AudioAttributesImplApi21Parcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5.read(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r6, boolean r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o.getTextureCoordinateBounds.onFastForward
            if (r0 == 0) goto L14
            r0 = r8
            o.getTextureCoordinateBounds$onFastForward r0 = (o.getTextureCoordinateBounds.onFastForward) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.IconCompatParcelizer
            int r8 = r8 + r2
            r0.IconCompatParcelizer = r8
            goto L19
        L14:
            o.getTextureCoordinateBounds$onFastForward r0 = new o.getTextureCoordinateBounds$onFastForward
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            boolean r5 = r0.write
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L68
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            boolean r7 = r0.write
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.String r6 = (java.lang.String) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L56
        L45:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.notifySpanRemoved r8 = r5.AudioAttributesCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r6
            r0.write = r7
            r0.IconCompatParcelizer = r4
            java.lang.Object r8 = r8.write(r7, r0)
            if (r8 == r1) goto L6b
        L56:
            o.getCurrentContext r5 = r5.AudioAttributesCompatParcelizer()
            r8 = 0
            r0.AudioAttributesCompatParcelizer = r8
            r0.write = r7
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = r5.read(r6, r7, r0)
            if (r5 != r1) goto L68
            goto L6b
        L68:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.AudioAttributesCompatParcelizer(java.lang.String, boolean, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object IconCompatParcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r5, kotlin.SampleVideos<? super com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.getTextureCoordinateBounds.MediaDescriptionCompat
            if (r0 == 0) goto L14
            r0 = r6
            o.getTextureCoordinateBounds$MediaDescriptionCompat r0 = (o.getTextureCoordinateBounds.MediaDescriptionCompat) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.read
            int r6 = r6 + r2
            r0.read = r6
            goto L19
        L14:
            o.getTextureCoordinateBounds$MediaDescriptionCompat r0 = new o.getTextureCoordinateBounds$MediaDescriptionCompat
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.createPbufferSurface r4 = r4.MediaBrowserCompatCustomActionResultReceiver
            r6 = 0
            r0.write = r6
            r0.read = r3
            java.lang.Object r6 = r4.AudioAttributesCompatParcelizer(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            o.destroyEglSurface r6 = (kotlin.destroyEglSurface) r6
            com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails r4 = r6.RatingCompat()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.read(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5.write(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r6, boolean r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o.getTextureCoordinateBounds.onPause
            if (r0 == 0) goto L14
            r0 = r8
            o.getTextureCoordinateBounds$onPause r0 = (o.getTextureCoordinateBounds.onPause) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.getTextureCoordinateBounds$onPause r0 = new o.getTextureCoordinateBounds$onPause
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            boolean r5 = r0.IconCompatParcelizer
            java.lang.Object r5 = r0.write
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L68
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            boolean r7 = r0.IconCompatParcelizer
            java.lang.Object r6 = r0.write
            java.lang.String r6 = (java.lang.String) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L56
        L45:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.notifySpanRemoved r8 = r5.AudioAttributesCompatParcelizer
            r0.write = r6
            r0.IconCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r7, r0)
            if (r8 == r1) goto L6b
        L56:
            o.getCurrentContext r5 = r5.AudioAttributesCompatParcelizer()
            r8 = 0
            r0.write = r8
            r0.IconCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r5.write(r6, r7, r0)
            if (r5 != r1) goto L68
            goto L6b
        L68:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.write(java.lang.String, boolean, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object read(SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.write(sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r5.IconCompatParcelizer(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isProtectedContentExtensionSupported
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r6, java.lang.String r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o.getTextureCoordinateBounds.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r0 == 0) goto L14
            r0 = r8
            o.getTextureCoordinateBounds$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r0 = (o.getTextureCoordinateBounds.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            o.getTextureCoordinateBounds$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r0 = new o.getTextureCoordinateBounds$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.read
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L6d
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            java.lang.Object r6 = r0.read
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.String r6 = (java.lang.String) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L5b
        L4a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.notifySpanRemoved r8 = r5.AudioAttributesCompatParcelizer
            r0.RemoteActionCompatParcelizer = r6
            r0.read = r7
            r0.write = r4
            java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r7, r4, r0)
            if (r8 == r1) goto L70
        L5b:
            o.getCurrentContext r5 = r5.AudioAttributesCompatParcelizer()
            r8 = 0
            r0.RemoteActionCompatParcelizer = r8
            r0.read = r8
            r0.write = r3
            java.lang.Object r5 = r5.IconCompatParcelizer(r6, r7, r0)
            if (r5 != r1) goto L6d
            goto L70
        L6d:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTextureCoordinateBounds.write(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.isProtectedContentExtensionSupported
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str, sampleVideos);
    }
}
