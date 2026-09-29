package kotlin;

import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow2.core.network.model.NetworkApiResponse;
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
import com.marrow2.data.user.remote.model.ProCallbackRequestBody;
import com.marrow2.data.user.remote.model.ResetContentInfoResponse;
import com.marrow2.data.user.remote.model.SaveProfileRequestBody;
import com.marrow2.data.user.remote.model.SaveUserAcknowledgementsRequestBody;
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
import in.juspay.hyper.constants.LogSubCategory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0012J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0006\u0010\u0014J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0006\u0010\u0016J$\u0010\u0006\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00172\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001b\u0010\u001eJ*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u001fH§@¢\u0006\u0004\b\u001b\u0010!J4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u001fH§@¢\u0006\u0004\b\u001b\u0010#J4\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020$H§@¢\u0006\u0004\b&\u0010'J*\u0010&\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020(H§@¢\u0006\u0004\b&\u0010*J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020+H§@¢\u0006\u0004\b\u001b\u0010,J*\u0010&\u001a\b\u0012\u0004\u0012\u00020.0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020-H§@¢\u0006\u0004\b&\u0010/J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u000200H§@¢\u0006\u0004\b&\u00101J*\u0010&\u001a\b\u0012\u0004\u0012\u0002030\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u000202H§@¢\u0006\u0004\b&\u00104J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u000205H§@¢\u0006\u0004\b\u000f\u00107J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u000208H§@¢\u0006\u0004\b&\u00109J&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0007J&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b&\u0010\u0007J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0:0\u0004H§@¢\u0006\u0004\b&\u0010\u0012J&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0:0\u00042\b\b\u0001\u0010\u0003\u001a\u00020=H§@¢\u0006\u0004\b\u001b\u0010?J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020@H§@¢\u0006\u0004\b&\u0010AJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020BH§@¢\u0006\u0004\b\u000f\u0010CJ&\u0010\u0006\u001a\u00020E2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020DH§@¢\u0006\u0004\b\u0006\u0010FJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020G0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0007J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020HH§@¢\u0006\u0004\b\u0006\u0010IÀ\u0006\u0003"}, d2 = {"Lo/focusPlaceholderEglSurface;", "", "", "p0", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow2/data/user/remote/model/SaveUserResponseModel;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/ProCallbackRequestBody;", "Lcom/marrow2/data/user/remote/model/ProCallbackRSModel;", "IconCompatParcelizer", "(Lcom/marrow2/data/user/remote/model/ProCallbackRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/ForgotPasswordRequest;", "p1", "Lcom/marrow2/data/user/remote/model/ForgotPasswordResponse;", "write", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/ForgotPasswordRequest;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse;", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/SaveProfileRequestBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/SaveProfileRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/DefaultCourseRequestBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/DefaultCourseRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/UserKycStatusRepoModel;", "(Lcom/marrow2/data/user/remote/model/UserKycStatusRepoModel;Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpRequestBody;", "Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpResponseBody;", "AudioAttributesCompatParcelizer", "(Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpVerifyRequestBody;", "(Lcom/marrow2/data/kyc/remote/model/AuthBridgeOtpVerifyRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneLoginRequestBody;", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneLoginResponseBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneLoginRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "p2", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneLoginRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/onboarding/OtpVerifyRequestBody;", "Lcom/marrow2/data/user/remote/model/onboarding/OtpVerifyResponseBody;", "read", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/OtpVerifyRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/onboarding/OtpValidateRequestBody;", "Lcom/marrow2/data/user/remote/model/onboarding/OtpValidateIntermediateResponseModel;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/OtpValidateRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/onboarding/AccountSelectionRequestBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/AccountSelectionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginRequestBody;", "Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginResponseBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/sign_in/EmailLoginRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/sign_in/EmailPasswordOtpRequestBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/sign_in/EmailPasswordOtpRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/sign_in/EmailForgotPasswordRequestBody;", "Lcom/marrow2/data/user/remote/model/sign_in/EmailForgotPasswordResponseBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/sign_in/EmailForgotPasswordRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/LoginRequestBody;", "Lcom/marrow2/data/user/remote/model/LoginResponseBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/LoginRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/SignUpRequestBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/SignUpRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "Lcom/marrow2/data/user/remote/model/Institutes;", "Lcom/marrow2/data/user/remote/model/Countries;", "", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "(ILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/LegalAgreementRequest;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/LegalAgreementRequest;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/TnCRequest;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/TnCRequest;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/GCMRegistrationRequest;", "", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/GCMRegistrationRequest;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/user/remote/model/ImageTokenRSModel;", "Lcom/marrow2/data/user/remote/model/SaveUserAcknowledgementsRequestBody;", "(Ljava/lang/String;Lcom/marrow2/data/user/remote/model/SaveUserAcknowledgementsRequestBody;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface focusPlaceholderEglSurface {
    @setMcqTimingDetails(read = "course_config")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = CourseConfigKeyConstantsKt.KEY_CONFIG_VERSION) int i, SampleVideos<? super NetworkApiResponse<List<CourseModelV3>>> sampleVideos);

    @getReviewTimeMs(read = "authbridge/i/generate_otp")
    Object AudioAttributesCompatParcelizer(@getTimeTook AuthBridgeOtpRequestBody authBridgeOtpRequestBody, SampleVideos<? super NetworkApiResponse<AuthBridgeOtpResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "authbridge/i/verify_otp")
    Object AudioAttributesCompatParcelizer(@getTimeTook AuthBridgeOtpVerifyRequestBody authBridgeOtpVerifyRequestBody, SampleVideos<? super NetworkApiResponse<AuthBridgeOtpResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "login")
    Object AudioAttributesCompatParcelizer(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook AccountSelectionRequestBody accountSelectionRequestBody, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @getReviewTimeMs(read = "login")
    Object AudioAttributesCompatParcelizer(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook PhoneLoginRequestBody phoneLoginRequestBody, SampleVideos<? super NetworkApiResponse<PhoneLoginResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/otp_verify_contact_v2")
    Object AudioAttributesCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str2, @getTimeTook PhoneLoginRequestBody phoneLoginRequestBody, SampleVideos<? super NetworkApiResponse<PhoneLoginResponseBody>> sampleVideos);

    @setMcqTimingDetails(read = "institute")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = "state_id") String str, SampleVideos<? super NetworkApiResponse<List<Institutes>>> sampleVideos);

    @getReviewTimeMs(read = "user/i/pro_request")
    Object IconCompatParcelizer(@getTimeTook ProCallbackRequestBody proCallbackRequestBody, SampleVideos<? super NetworkApiResponse<ProCallbackRSModel>> sampleVideos);

    @getReviewTimeMs(read = "user/i/user_device_status_update")
    Object RemoteActionCompatParcelizer(@getTimeTook UserKycStatusRepoModel userKycStatusRepoModel, @McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Token") String str, SampleVideos<Object> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/set_user_default_course")
    Object RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook DefaultCourseRequestBody defaultCourseRequestBody, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/notification")
    Object RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook GCMRegistrationRequest gCMRegistrationRequest, SampleVideos<? super getShowPopup> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/settings_v3")
    Object RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook SaveProfileRequestBody saveProfileRequestBody, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/settings_v3")
    Object RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook SaveUserAcknowledgementsRequestBody saveUserAcknowledgementsRequestBody, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @setMcqTimingDetails(read = "user/{id}")
    Object RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/settings_v3")
    Object read(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook LegalAgreementRequest legalAgreementRequest, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @getReviewTimeMs(read = LogSubCategory.Action.USER)
    Object read(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook SignUpRequestBody signUpRequestBody, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @getReviewTimeMs(read = "login")
    Object read(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook OtpValidateRequestBody otpValidateRequestBody, SampleVideos<? super NetworkApiResponse<OtpValidateIntermediateResponseModel>> sampleVideos);

    @getReviewTimeMs(read = "forgot_password")
    Object read(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook EmailForgotPasswordRequestBody emailForgotPasswordRequestBody, SampleVideos<? super NetworkApiResponse<EmailForgotPasswordResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "login_email")
    Object read(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook EmailLoginRequestBody emailLoginRequestBody, SampleVideos<? super NetworkApiResponse<EmailLoginResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "login_email")
    Object read(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook EmailPasswordOtpRequestBody emailPasswordOtpRequestBody, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/otp_verify_contact_v2")
    Object read(@setRankRange(IconCompatParcelizer = "id") String str, @McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str2, @getTimeTook OtpVerifyRequestBody otpVerifyRequestBody, SampleVideos<? super NetworkApiResponse<OtpVerifyResponseBody>> sampleVideos);

    @setMcqTimingDetails(read = "institute")
    Object read(@RankPairModel(read = "country") String str, SampleVideos<? super NetworkApiResponse<List<Institutes>>> sampleVideos);

    @setMcqTimingDetails(read = "country")
    Object read(SampleVideos<? super NetworkApiResponse<List<Countries>>> sampleVideos);

    @getReviewTimeMs(read = "forgot_password")
    Object write(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook ForgotPasswordRequest forgotPasswordRequest, SampleVideos<? super NetworkApiResponse<ForgotPasswordResponse>> sampleVideos);

    @getReviewTimeMs(read = "login")
    Object write(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, @getTimeTook LoginRequestBody loginRequestBody, SampleVideos<? super NetworkApiResponse<LoginResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/settings_v3")
    Object write(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook TnCRequest tnCRequest, SampleVideos<? super NetworkApiResponse<SaveUserResponseModel>> sampleVideos);

    @setMcqTimingDetails(read = "user/i/get_timezone")
    Object write(@McqTimingRequestData(RemoteActionCompatParcelizer = "Dr-Local") String str, SampleVideos<? super NetworkApiResponse<ImageTokenRSModel>> sampleVideos);

    @setMcqTimingDetails(read = "user/i/content_reset_status")
    Object write(SampleVideos<? super NetworkApiResponse<ResetContentInfoResponse>> sampleVideos);
}
