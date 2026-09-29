package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\"\u0010\u0015\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u0019"}, d2 = {"Lcom/marrow2/data/user/remote/model/ForgotPasswordRequest;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/marrow2/data/user/remote/model/ForgotPasswordRequest;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "email", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "courseId", "I", "getCourseId", "setCourseId", "(I)V", "rcToken", "getRcToken", "setRcToken"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ForgotPasswordRequest {
    public static final int $stable = 8;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private int courseId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("config_hash")
    private String rcToken;

    public ForgotPasswordRequest(String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.email = str;
        this.courseId = i;
        this.rcToken = str2;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.email = str;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final void setCourseId(int i) {
        this.courseId = i;
    }

    public /* synthetic */ ForgotPasswordRequest(String str, int i, String str2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, (i2 & 4) != 0 ? "" : str2);
    }

    public final String getRcToken() {
        return this.rcToken;
    }

    public final void setRcToken(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.rcToken = str;
    }

    public static /* synthetic */ ForgotPasswordRequest copy$default(ForgotPasswordRequest forgotPasswordRequest, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = forgotPasswordRequest.email;
        }
        if ((i2 & 2) != 0) {
            i = forgotPasswordRequest.courseId;
        }
        if ((i2 & 4) != 0) {
            str2 = forgotPasswordRequest.rcToken;
        }
        return forgotPasswordRequest.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRcToken() {
        return this.rcToken;
    }

    public final ForgotPasswordRequest copy(String p0, int p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new ForgotPasswordRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ForgotPasswordRequest)) {
            return false;
        }
        ForgotPasswordRequest forgotPasswordRequest = (ForgotPasswordRequest) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.email, (Object) forgotPasswordRequest.email) && this.courseId == forgotPasswordRequest.courseId && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rcToken, (Object) forgotPasswordRequest.rcToken);
    }

    public final int hashCode() {
        return (((this.email.hashCode() * 31) + Integer.hashCode(this.courseId)) * 31) + this.rcToken.hashCode();
    }

    public final String toString() {
        String str = this.email;
        int i = this.courseId;
        String str2 = this.rcToken;
        StringBuilder sb = new StringBuilder("ForgotPasswordRequest(email=");
        sb.append(str);
        sb.append(", courseId=");
        sb.append(i);
        sb.append(", rcToken=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
