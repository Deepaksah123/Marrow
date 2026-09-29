package com.marrow.data.models;

import com.google.android.gms.wallet.WalletConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eR$\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R$\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR$\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00078\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/marrow/data/models/ResponseError;", "", "", "p0", "p1", "<init>", "(II)V", "", "", "p2", "(ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "isVideoNetworkError", "()Z", "isResolutionNotSupported", "errorCode", "I", "getErrorCode", "()I", "errorMessageId", "getErrorMessageId", "isDbFlushIgnored", "Z", "errorMessage", "Ljava/lang/String;", "getErrorMessage", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResponseError {
    public static final int CUSTOM_ERR = -44;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int INVALID_ERR_RES_ID = -1;
    public static final int NO_INTERNET_ERROR = 400;
    private int errorCode;
    private String errorMessage;
    private int errorMessageId;
    private boolean isDbFlushIgnored;

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getErrorMessageId() {
        return this.errorMessageId;
    }

    /* JADX INFO: renamed from: isDbFlushIgnored, reason: from getter */
    public final boolean getIsDbFlushIgnored() {
        return this.isDbFlushIgnored;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public ResponseError(int i, int i2) {
        this.errorMessage = "";
        this.errorCode = i;
        this.errorMessageId = i2;
    }

    public ResponseError(int i, String str, boolean z) {
        this.errorMessage = "";
        this.errorCode = i;
        this.errorMessageId = -1;
        this.errorMessage = str == null ? "" : str;
        this.isDbFlushIgnored = z;
    }

    public /* synthetic */ ResponseError(int i, String str, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, str, (i2 & 4) != 0 ? false : z);
    }

    public final String toString() {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        Locale locale = Locale.getDefault();
        int i = this.errorCode;
        String str = String.format(locale, "{ \"error_code\" : %d, \"error_msg\" : %s }", Arrays.copyOf(new Object[]{Integer.valueOf(i), this.errorMessage}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public final boolean isVideoNetworkError() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{1527, 1528}).contains(Integer.valueOf(this.errorCode));
    }

    public final boolean isResolutionNotSupported() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{1540, 1541, 1538, 1539}).contains(Integer.valueOf(this.errorCode));
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Lcom/marrow/data/models/ResponseError$Companion;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/models/ResponseError;", "customError", "(Ljava/lang/String;)Lcom/marrow/data/models/ResponseError;", "", "p1", "(ILjava/lang/String;)Lcom/marrow/data/models/ResponseError;", "customVideoError", "", "isTimestampInvalidError", "(Lcom/marrow/data/models/ResponseError;)Z", "isAuthError", "isApiBlockError", "isLogoutRequired", "isKycAuditIncomplete", "isHdPlaybackError", "isRateLimitingError", "(I)Z", "CUSTOM_ERR", "I", "NO_INTERNET_ERROR", "INVALID_ERR_RES_ID"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final ResponseError customError(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new ResponseError(-44, p0, false, 4, null);
        }

        @getMagicModuleMeta
        public final ResponseError customError(int p0, String p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            StringBuilder sb = new StringBuilder("Err-");
            sb.append(p0);
            sb.append(": ");
            sb.append(p1);
            return new ResponseError(-44, sb.toString(), false, 4, null);
        }

        @getMagicModuleMeta
        public final ResponseError customVideoError(int p0, String p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            StringBuilder sb = new StringBuilder("Err-");
            sb.append(p0);
            sb.append(": ");
            sb.append(p1);
            return new ResponseError(p0, sb.toString(), false, 4, null);
        }

        @getMagicModuleMeta
        public final boolean isTimestampInvalidError(ResponseError p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getErrorCode() == 1201 || p0.getErrorCode() == 1451;
        }

        @getMagicModuleMeta
        public final boolean isAuthError(ResponseError p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{Integer.valueOf(WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE), 401, 1202, 1203, 1404}).contains(Integer.valueOf(p0.getErrorCode()));
        }

        @getMagicModuleMeta
        public final boolean isApiBlockError(ResponseError p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getErrorCode() == 1208;
        }

        @getMagicModuleMeta
        public final boolean isLogoutRequired(ResponseError p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{1204, 1206, 9999, 9998, 1307, 1207, 1210, 15001, 15002, 15003}).contains(Integer.valueOf(p0.getErrorCode()));
        }

        @getMagicModuleMeta
        public final boolean isKycAuditIncomplete(ResponseError p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getErrorCode() == 1211;
        }

        @getMagicModuleMeta
        public final boolean isHdPlaybackError(ResponseError p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getErrorCode() == 1454;
        }

        @getMagicModuleMeta
        public final boolean isRateLimitingError(int p0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{9012, 9013}).contains(Integer.valueOf(p0));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public ResponseError(int i, String str) {
        this(i, str, false, 4, null);
    }

    @getMagicModuleMeta
    public static final ResponseError customError(int i, String str) {
        return INSTANCE.customError(i, str);
    }

    @getMagicModuleMeta
    public static final ResponseError customError(String str) {
        return INSTANCE.customError(str);
    }

    @getMagicModuleMeta
    public static final ResponseError customVideoError(int i, String str) {
        return INSTANCE.customVideoError(i, str);
    }

    @getMagicModuleMeta
    public static final boolean isApiBlockError(ResponseError responseError) {
        return INSTANCE.isApiBlockError(responseError);
    }

    @getMagicModuleMeta
    public static final boolean isAuthError(ResponseError responseError) {
        return INSTANCE.isAuthError(responseError);
    }

    @getMagicModuleMeta
    public static final boolean isHdPlaybackError(ResponseError responseError) {
        return INSTANCE.isHdPlaybackError(responseError);
    }

    @getMagicModuleMeta
    public static final boolean isKycAuditIncomplete(ResponseError responseError) {
        return INSTANCE.isKycAuditIncomplete(responseError);
    }

    @getMagicModuleMeta
    public static final boolean isLogoutRequired(ResponseError responseError) {
        return INSTANCE.isLogoutRequired(responseError);
    }

    @getMagicModuleMeta
    public static final boolean isRateLimitingError(int i) {
        return INSTANCE.isRateLimitingError(i);
    }

    @getMagicModuleMeta
    public static final boolean isTimestampInvalidError(ResponseError responseError) {
        return INSTANCE.isTimestampInvalidError(responseError);
    }
}
