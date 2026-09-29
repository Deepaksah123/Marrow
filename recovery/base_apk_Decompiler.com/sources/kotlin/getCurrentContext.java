package kotlin;

import com.marrow2.data.kyc.remote.model.AuthBridgeOtpRequestBody;
import com.marrow2.data.kyc.remote.model.AuthBridgeOtpResponseBody;
import com.marrow2.data.kyc.remote.model.AuthBridgeOtpVerifyRequestBody;
import com.marrow2.data.user.remote.model.Countries;
import com.marrow2.data.user.remote.model.CourseModelV3;
import com.marrow2.data.user.remote.model.DefaultCourseRequestBody;
import com.marrow2.data.user.remote.model.ForgotPasswordRequest;
import com.marrow2.data.user.remote.model.ForgotPasswordResponse;
import com.marrow2.data.user.remote.model.GCMRegistrationRequest;
import com.marrow2.data.user.remote.model.ImageTokenRSModel;
import com.marrow2.data.user.remote.model.Institutes;
import com.marrow2.data.user.remote.model.LegalAgreementRequest;
import com.marrow2.data.user.remote.model.LoginRequestBody;
import com.marrow2.data.user.remote.model.LoginResponseBody;
import com.marrow2.data.user.remote.model.ProCallbackRSModel;
import com.marrow2.data.user.remote.model.ResetContentInfoResponse;
import com.marrow2.data.user.remote.model.SaveProfileRequestBody;
import com.marrow2.data.user.remote.model.SaveUserResponseModel;
import com.marrow2.data.user.remote.model.SignUpRequestBody;
import com.marrow2.data.user.remote.model.TnCRequest;
import com.marrow2.data.user.remote.model.UserKycStatusRepoModel;
import com.marrow2.data.user.remote.model.onboarding.AccountSelectionRequestBody;
import com.marrow2.data.user.remote.model.onboarding.OtpValidateIntermediateResponseModel;
import com.marrow2.data.user.remote.model.onboarding.OtpValidateRequestBody;
import com.marrow2.data.user.remote.model.onboarding.OtpVerifyRequestBody;
import com.marrow2.data.user.remote.model.onboarding.OtpVerifyResponseBody;
import com.marrow2.data.user.remote.model.onboarding.PhoneLoginRequestBody;
import com.marrow2.data.user.remote.model.onboarding.PhoneLoginResponseBody;
import com.marrow2.data.user.remote.model.sign_in.EmailForgotPasswordRequestBody;
import com.marrow2.data.user.remote.model.sign_in.EmailForgotPasswordResponseBody;
import com.marrow2.data.user.remote.model.sign_in.EmailLoginRequestBody;
import com.marrow2.data.user.remote.model.sign_in.EmailLoginResponseBody;
import com.marrow2.data.user.remote.model.sign_in.EmailPasswordOtpRequestBody;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface getCurrentContext {
    Object AudioAttributesCompatParcelizer(String str, DefaultCourseRequestBody defaultCourseRequestBody, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, GCMRegistrationRequest gCMRegistrationRequest, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, LegalAgreementRequest legalAgreementRequest, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, String str2, PhoneLoginRequestBody phoneLoginRequestBody, SampleVideos<? super PhoneLoginResponseBody> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, boolean z, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object IconCompatParcelizer(AuthBridgeOtpRequestBody authBridgeOtpRequestBody, SampleVideos<? super AuthBridgeOtpResponseBody> sampleVideos);

    Object IconCompatParcelizer(UserKycStatusRepoModel userKycStatusRepoModel, String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(String str, LoginRequestBody loginRequestBody, SampleVideos<? super LoginResponseBody> sampleVideos);

    Object IconCompatParcelizer(String str, AccountSelectionRequestBody accountSelectionRequestBody, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object IconCompatParcelizer(String str, String str2, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, PhoneLoginRequestBody phoneLoginRequestBody, SampleVideos<? super PhoneLoginResponseBody> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, EmailForgotPasswordRequestBody emailForgotPasswordRequestBody, SampleVideos<? super EmailForgotPasswordResponseBody> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, EmailLoginRequestBody emailLoginRequestBody, SampleVideos<? super EmailLoginResponseBody> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, EmailPasswordOtpRequestBody emailPasswordOtpRequestBody, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, boolean z, SampleVideos<? super List<Institutes>> sampleVideos);

    Object read(AuthBridgeOtpVerifyRequestBody authBridgeOtpVerifyRequestBody, SampleVideos<? super AuthBridgeOtpResponseBody> sampleVideos);

    Object read(String str, SignUpRequestBody signUpRequestBody, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object read(String str, TnCRequest tnCRequest, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object read(String str, OtpValidateRequestBody otpValidateRequestBody, SampleVideos<? super OtpValidateIntermediateResponseModel> sampleVideos);

    Object read(String str, boolean z, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object read(SampleVideos<? super List<Countries>> sampleVideos);

    Object write(int i, SampleVideos<? super Pair<Integer, ? extends List<CourseModelV3>>> sampleVideos);

    Object write(String str, ForgotPasswordRequest forgotPasswordRequest, SampleVideos<? super ForgotPasswordResponse> sampleVideos);

    Object write(String str, SaveProfileRequestBody saveProfileRequestBody, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object write(String str, String str2, OtpVerifyRequestBody otpVerifyRequestBody, SampleVideos<? super OtpVerifyResponseBody> sampleVideos);

    Object write(String str, String str2, String str3, SampleVideos<? super ProCallbackRSModel> sampleVideos);

    Object write(String str, SampleVideos<? super ImageTokenRSModel> sampleVideos);

    Object write(String str, boolean z, SampleVideos<? super SaveUserResponseModel> sampleVideos);

    Object write(SampleVideos<? super ResetContentInfoResponse> sampleVideos);
}
