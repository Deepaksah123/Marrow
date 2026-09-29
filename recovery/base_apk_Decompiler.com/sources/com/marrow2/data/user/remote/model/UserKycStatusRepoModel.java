package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow2/data/user/remote/model/UserKycStatusRepoModel;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/UserKycStatusRepoModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "newStatus", "Ljava/lang/String;", "getNewStatus", "transactionId", "getTransactionId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserKycStatusRepoModel {
    public static final int $stable = 0;
    private final String newStatus;
    private final String transactionId;

    public UserKycStatusRepoModel(String str, String str2) {
        this.newStatus = str;
        this.transactionId = str2;
    }

    public /* synthetic */ UserKycStatusRepoModel(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @JsonProperty("new_status")
    public final String getNewStatus() {
        return this.newStatus;
    }

    @JsonProperty("transaction_id")
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserKycStatusRepoModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserKycStatusRepoModel copy$default(UserKycStatusRepoModel userKycStatusRepoModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userKycStatusRepoModel.newStatus;
        }
        if ((i & 2) != 0) {
            str2 = userKycStatusRepoModel.transactionId;
        }
        return userKycStatusRepoModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNewStatus() {
        return this.newStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final UserKycStatusRepoModel copy(String p0, String p1) {
        return new UserKycStatusRepoModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UserKycStatusRepoModel)) {
            return false;
        }
        UserKycStatusRepoModel userKycStatusRepoModel = (UserKycStatusRepoModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.newStatus, (Object) userKycStatusRepoModel.newStatus) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.transactionId, (Object) userKycStatusRepoModel.transactionId);
    }

    public final int hashCode() {
        String str = this.newStatus;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.transactionId;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.newStatus;
        String str2 = this.transactionId;
        StringBuilder sb = new StringBuilder("UserKycStatusRepoModel(newStatus=");
        sb.append(str);
        sb.append(", transactionId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
