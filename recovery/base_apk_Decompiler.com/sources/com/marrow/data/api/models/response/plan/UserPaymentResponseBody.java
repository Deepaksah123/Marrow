package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u001c\b\u0003\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J=\u0010\u0013\u001a\u00020\u00002\u001c\b\u0003\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R*\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/marrow/data/api/models/response/plan/UserPaymentResponseBody;", "", "data", "Ljava/util/ArrayList;", "Lcom/marrow/data/api/models/response/plan/ModuleSubscriptionData;", "Lkotlin/collections/ArrayList;", "errorMsg", "", "status", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/util/ArrayList;", "getErrorMsg", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserPaymentResponseBody {

    @isFirst(RemoteActionCompatParcelizer = "data")
    private final ArrayList<ModuleSubscriptionData> data;

    @isFirst(RemoteActionCompatParcelizer = "error_msg")
    private final String errorMsg;

    @isFirst(RemoteActionCompatParcelizer = "status")
    private final String status;

    public UserPaymentResponseBody(@JsonProperty("data") ArrayList<ModuleSubscriptionData> arrayList, @JsonProperty("error_msg") String str, @JsonProperty("status") String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        this.data = arrayList;
        this.errorMsg = str;
        this.status = str2;
    }

    public /* synthetic */ UserPaymentResponseBody(ArrayList arrayList, String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str, str2);
    }

    public final ArrayList<ModuleSubscriptionData> getData() {
        return this.data;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserPaymentResponseBody copy$default(UserPaymentResponseBody userPaymentResponseBody, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = userPaymentResponseBody.data;
        }
        if ((i & 2) != 0) {
            str = userPaymentResponseBody.errorMsg;
        }
        if ((i & 4) != 0) {
            str2 = userPaymentResponseBody.status;
        }
        return userPaymentResponseBody.copy(arrayList, str, str2);
    }

    public final ArrayList<ModuleSubscriptionData> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final UserPaymentResponseBody copy(@JsonProperty("data") ArrayList<ModuleSubscriptionData> data, @JsonProperty("error_msg") String errorMsg, @JsonProperty("status") String status) {
        toMagicModuleMetaRepoModel.write(status, "");
        return new UserPaymentResponseBody(data, errorMsg, status);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPaymentResponseBody)) {
            return false;
        }
        UserPaymentResponseBody userPaymentResponseBody = (UserPaymentResponseBody) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.data, userPaymentResponseBody.data) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.errorMsg, (Object) userPaymentResponseBody.errorMsg) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.status, (Object) userPaymentResponseBody.status);
    }

    public final int hashCode() {
        ArrayList<ModuleSubscriptionData> arrayList = this.data;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.errorMsg;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.status.hashCode();
    }

    public final String toString() {
        ArrayList<ModuleSubscriptionData> arrayList = this.data;
        String str = this.errorMsg;
        String str2 = this.status;
        StringBuilder sb = new StringBuilder("UserPaymentResponseBody(data=");
        sb.append(arrayList);
        sb.append(", errorMsg=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
