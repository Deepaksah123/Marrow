package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/marrow2/data/user/remote/model/ProCallbackRequestBody;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/ProCallbackRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "message", "Ljava/lang/String;", "getMessage", "phoneNumber", "getPhoneNumber", "pageSource", "getPageSource"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProCallbackRequestBody {
    public static final int $stable = 0;
    private final String message;
    private final String pageSource;
    private final String phoneNumber;

    public ProCallbackRequestBody(@JsonProperty("message") String str, @JsonProperty("phone_number") String str2, @JsonProperty("page_source") String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.message = str;
        this.phoneNumber = str2;
        this.pageSource = str3;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPageSource() {
        return this.pageSource;
    }

    public static /* synthetic */ ProCallbackRequestBody copy$default(ProCallbackRequestBody proCallbackRequestBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = proCallbackRequestBody.message;
        }
        if ((i & 2) != 0) {
            str2 = proCallbackRequestBody.phoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = proCallbackRequestBody.pageSource;
        }
        return proCallbackRequestBody.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageSource() {
        return this.pageSource;
    }

    public final ProCallbackRequestBody copy(@JsonProperty("message") String p0, @JsonProperty("phone_number") String p1, @JsonProperty("page_source") String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new ProCallbackRequestBody(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ProCallbackRequestBody)) {
            return false;
        }
        ProCallbackRequestBody proCallbackRequestBody = (ProCallbackRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.message, (Object) proCallbackRequestBody.message) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.phoneNumber, (Object) proCallbackRequestBody.phoneNumber) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pageSource, (Object) proCallbackRequestBody.pageSource);
    }

    public final int hashCode() {
        return (((this.message.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.pageSource.hashCode();
    }

    public final String toString() {
        String str = this.message;
        String str2 = this.phoneNumber;
        String str3 = this.pageSource;
        StringBuilder sb = new StringBuilder("ProCallbackRequestBody(message=");
        sb.append(str);
        sb.append(", phoneNumber=");
        sb.append(str2);
        sb.append(", pageSource=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
