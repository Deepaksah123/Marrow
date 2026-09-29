package kotlin;

import com.marrow2.data.user.remote.model.sign_in.EmailForgotPasswordRequestBody;
import com.marrow2.data.user.remote.model.sign_in.EmailForgotPasswordResponseBody;
import com.marrow2.data.user.remote.model.sign_in.EmailLoginRequestBody;
import com.marrow2.data.user.remote.model.sign_in.EmailLoginResponseBody;
import com.marrow2.data.user.remote.model.sign_in.EmailLoginResponseRepoModel;
import com.marrow2.data.user.remote.model.sign_in.EmailPasswordOtpRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class sendEmptyMessageDelayed {
    public static final EmailLoginRequestBody AudioAttributesCompatParcelizer(sendEmptyMessageAtTime sendemptymessageattime, String str) {
        toMagicModuleMetaRepoModel.write(sendemptymessageattime, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return EmailLoginRequestBody.copy$default(new EmailLoginRequestBody(sendemptymessageattime.getRead(), sendemptymessageattime.getWrite(), null, null, 12, null), null, null, null, str, 7, null);
    }

    public static final EmailLoginResponseRepoModel write(EmailLoginResponseBody emailLoginResponseBody) {
        toMagicModuleMetaRepoModel.write(emailLoginResponseBody, "");
        return new EmailLoginResponseRepoModel(emailLoginResponseBody.getMessage(), emailLoginResponseBody.getLoginType());
    }

    public static final EmailPasswordOtpRequestBody AudioAttributesCompatParcelizer(sendEmptyMessage sendemptymessage, String str) {
        toMagicModuleMetaRepoModel.write(sendemptymessage, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return EmailPasswordOtpRequestBody.copy$default(new EmailPasswordOtpRequestBody(sendemptymessage.getRemoteActionCompatParcelizer(), sendemptymessage.getWrite(), sendemptymessage.getIconCompatParcelizer(), null, null, 24, null), null, null, null, null, str, 15, null);
    }

    public static final EmailForgotPasswordRequestBody read(HandlerWrapper handlerWrapper) {
        toMagicModuleMetaRepoModel.write(handlerWrapper, "");
        return new EmailForgotPasswordRequestBody(handlerWrapper.getRemoteActionCompatParcelizer(), null, 2, null);
    }

    public static final GlUtilGlException read(EmailForgotPasswordResponseBody emailForgotPasswordResponseBody) {
        toMagicModuleMetaRepoModel.write(emailForgotPasswordResponseBody, "");
        return new GlUtilGlException(emailForgotPasswordResponseBody.getMsg());
    }
}
