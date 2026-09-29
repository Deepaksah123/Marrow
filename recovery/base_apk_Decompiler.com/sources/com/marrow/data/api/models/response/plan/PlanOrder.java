package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.payment.PayloadKt;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/marrow/data/api/models/response/plan/PlanOrder;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/marrow/data/api/models/response/plan/PlanOrder;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "orderId", "Ljava/lang/String;", "getOrderId", "amount", "I", "getAmount", PayloadKt.KEY_JP_CURRENCY, "getCurrency"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanOrder {

    @isFirst(RemoteActionCompatParcelizer = "amount")
    private final int amount;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_CURRENCY)
    private final String currency;

    @isFirst(RemoteActionCompatParcelizer = PaymentConstants.ORDER_ID)
    private final String orderId;

    public PlanOrder(@JsonProperty(PaymentConstants.ORDER_ID) String str, @JsonProperty("amount") int i, @JsonProperty(PayloadKt.KEY_JP_CURRENCY) String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.orderId = str;
        this.amount = i;
        this.currency = str2;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public static /* synthetic */ PlanOrder copy$default(PlanOrder planOrder, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = planOrder.orderId;
        }
        if ((i2 & 2) != 0) {
            i = planOrder.amount;
        }
        if ((i2 & 4) != 0) {
            str2 = planOrder.currency;
        }
        return planOrder.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final PlanOrder copy(@JsonProperty(PaymentConstants.ORDER_ID) String p0, @JsonProperty("amount") int p1, @JsonProperty(PayloadKt.KEY_JP_CURRENCY) String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new PlanOrder(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanOrder)) {
            return false;
        }
        PlanOrder planOrder = (PlanOrder) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.orderId, (Object) planOrder.orderId) && this.amount == planOrder.amount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.currency, (Object) planOrder.currency);
    }

    public final int hashCode() {
        return (((this.orderId.hashCode() * 31) + Integer.hashCode(this.amount)) * 31) + this.currency.hashCode();
    }

    public final String toString() {
        String str = this.orderId;
        int i = this.amount;
        String str2 = this.currency;
        StringBuilder sb = new StringBuilder("PlanOrder(orderId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(i);
        sb.append(", currency=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
