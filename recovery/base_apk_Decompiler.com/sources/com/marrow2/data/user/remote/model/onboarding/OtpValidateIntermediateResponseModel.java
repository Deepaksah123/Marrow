package com.marrow2.data.user.remote.model.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow2.data.user.remote.model.SaveUserResponseModel;
import java.io.Serializable;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/marrow2/data/user/remote/model/onboarding/OtpValidateIntermediateResponseModel;", "Lcom/marrow2/data/user/remote/model/SaveUserResponseModel;", "Ljava/io/Serializable;", "", "p0", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "p1", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/marrow2/data/user/remote/model/onboarding/OtpValidateIntermediateResponseModel;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "intermediateToken", "Ljava/lang/String;", "getIntermediateToken", "userMini", "Ljava/util/List;", "getUserMini"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtpValidateIntermediateResponseModel extends SaveUserResponseModel implements Serializable {
    public static final int $stable = 8;

    @JsonProperty("t_token")
    private final String intermediateToken;

    @JsonProperty("users")
    private final List<UserBasicDetails> userMini;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpValidateIntermediateResponseModel(String str, List<UserBasicDetails> list) {
        super(null, null, null, false, null, null, null, null, null, null, false, null, null, 0, 0, 0L, null, false, 0L, false, null, null, null, 8388607, null);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.intermediateToken = str;
        this.userMini = list;
    }

    public /* synthetic */ OtpValidateIntermediateResponseModel(String str, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final String getIntermediateToken() {
        return this.intermediateToken;
    }

    public final List<UserBasicDetails> getUserMini() {
        return this.userMini;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OtpValidateIntermediateResponseModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtpValidateIntermediateResponseModel copy$default(OtpValidateIntermediateResponseModel otpValidateIntermediateResponseModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otpValidateIntermediateResponseModel.intermediateToken;
        }
        if ((i & 2) != 0) {
            list = otpValidateIntermediateResponseModel.userMini;
        }
        return otpValidateIntermediateResponseModel.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntermediateToken() {
        return this.intermediateToken;
    }

    public final List<UserBasicDetails> component2() {
        return this.userMini;
    }

    public final OtpValidateIntermediateResponseModel copy(String p0, List<UserBasicDetails> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new OtpValidateIntermediateResponseModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OtpValidateIntermediateResponseModel)) {
            return false;
        }
        OtpValidateIntermediateResponseModel otpValidateIntermediateResponseModel = (OtpValidateIntermediateResponseModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.intermediateToken, (Object) otpValidateIntermediateResponseModel.intermediateToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.userMini, otpValidateIntermediateResponseModel.userMini);
    }

    public final int hashCode() {
        return (this.intermediateToken.hashCode() * 31) + this.userMini.hashCode();
    }

    public final String toString() {
        String str = this.intermediateToken;
        List<UserBasicDetails> list = this.userMini;
        StringBuilder sb = new StringBuilder("OtpValidateIntermediateResponseModel(intermediateToken=");
        sb.append(str);
        sb.append(", userMini=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
