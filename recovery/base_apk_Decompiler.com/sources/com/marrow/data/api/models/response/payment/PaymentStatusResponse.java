package com.marrow.data.api.models.response.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.plan.Subscription;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/marrow/data/api/models/response/payment/PaymentStatusResponse;", "", "", "p0", "p1", "p2", "", "Lcom/marrow/data/models/plan/Subscription;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/marrow/data/models/plan/Subscription;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()[Lcom/marrow/data/models/plan/Subscription;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/marrow/data/models/plan/Subscription;)Lcom/marrow/data/api/models/response/payment/PaymentStatusResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "errorMessage", "Ljava/lang/String;", "getErrorMessage", "paymentRefId", "getPaymentRefId", "status", "getStatus", "subscriptionList", "[Lcom/marrow/data/models/plan/Subscription;", "getSubscriptionList"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentStatusResponse {
    private final String errorMessage;
    private final String paymentRefId;
    private final String status;
    private final Subscription[] subscriptionList;

    public PaymentStatusResponse(@JsonProperty(PaymentStatusResponseKt.KEY_ERROR_MESSAGE) String str, @JsonProperty("payment_ref_id") String str2, @JsonProperty("status") String str3, @JsonProperty(PaymentStatusResponseKt.KEY_SUBSCRIPTION) Subscription[] subscriptionArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(subscriptionArr, "");
        this.errorMessage = str;
        this.paymentRefId = str2;
        this.status = str3;
        this.subscriptionList = subscriptionArr;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getPaymentRefId() {
        return this.paymentRefId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Subscription[] getSubscriptionList() {
        return this.subscriptionList;
    }

    public static /* synthetic */ PaymentStatusResponse copy$default(PaymentStatusResponse paymentStatusResponse, String str, String str2, String str3, Subscription[] subscriptionArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentStatusResponse.errorMessage;
        }
        if ((i & 2) != 0) {
            str2 = paymentStatusResponse.paymentRefId;
        }
        if ((i & 4) != 0) {
            str3 = paymentStatusResponse.status;
        }
        if ((i & 8) != 0) {
            subscriptionArr = paymentStatusResponse.subscriptionList;
        }
        return paymentStatusResponse.copy(str, str2, str3, subscriptionArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentRefId() {
        return this.paymentRefId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Subscription[] getSubscriptionList() {
        return this.subscriptionList;
    }

    public final PaymentStatusResponse copy(@JsonProperty(PaymentStatusResponseKt.KEY_ERROR_MESSAGE) String p0, @JsonProperty("payment_ref_id") String p1, @JsonProperty("status") String p2, @JsonProperty(PaymentStatusResponseKt.KEY_SUBSCRIPTION) Subscription[] p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new PaymentStatusResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PaymentStatusResponse)) {
            return false;
        }
        PaymentStatusResponse paymentStatusResponse = (PaymentStatusResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.errorMessage, (Object) paymentStatusResponse.errorMessage) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.paymentRefId, (Object) paymentStatusResponse.paymentRefId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.status, (Object) paymentStatusResponse.status) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subscriptionList, paymentStatusResponse.subscriptionList);
    }

    public final int hashCode() {
        int iHashCode = this.errorMessage.hashCode();
        String str = this.paymentRefId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.status;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.subscriptionList);
    }

    public final String toString() {
        String str = this.errorMessage;
        String str2 = this.paymentRefId;
        String str3 = this.status;
        String string = Arrays.toString(this.subscriptionList);
        StringBuilder sb = new StringBuilder("PaymentStatusResponse(errorMessage=");
        sb.append(str);
        sb.append(", paymentRefId=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(str3);
        sb.append(", subscriptionList=");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
