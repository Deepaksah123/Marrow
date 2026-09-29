package com.marrow.data.api.models.response.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u000fR\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u000fR\u001c\u0010)\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010,\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0017"}, d2 = {"Lcom/marrow/data/api/models/response/payment/CreateOrderResponse;", "", "", "p0", "", "p1", "p2", "p3", "Lcom/marrow/data/api/models/response/payment/PaymentLinks;", "p4", "Lcom/marrow/data/api/models/response/payment/SdkPayload;", "p5", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/marrow/data/api/models/response/payment/PaymentLinks;Lcom/marrow/data/api/models/response/payment/SdkPayload;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Lcom/marrow/data/api/models/response/payment/PaymentLinks;", "component6", "()Lcom/marrow/data/api/models/response/payment/SdkPayload;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/marrow/data/api/models/response/payment/PaymentLinks;Lcom/marrow/data/api/models/response/payment/SdkPayload;)Lcom/marrow/data/api/models/response/payment/CreateOrderResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "orderId", "Ljava/lang/String;", "getOrderId", "amount", "I", "getAmount", PayloadKt.KEY_JP_CURRENCY, "getCurrency", "gateway", "getGateway", "paymentLinks", "Lcom/marrow/data/api/models/response/payment/PaymentLinks;", "getPaymentLinks", "sdkPayload", "Lcom/marrow/data/api/models/response/payment/SdkPayload;", "getSdkPayload"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateOrderResponse {

    @isFirst(RemoteActionCompatParcelizer = "amount")
    private final int amount;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_CURRENCY)
    private final String currency;

    @isFirst(RemoteActionCompatParcelizer = "gateway")
    private final String gateway;

    @isFirst(RemoteActionCompatParcelizer = PaymentConstants.ORDER_ID)
    private final String orderId;

    @isFirst(RemoteActionCompatParcelizer = "payment_links")
    private final PaymentLinks paymentLinks;

    @isFirst(RemoteActionCompatParcelizer = "sdk_payload")
    private final SdkPayload sdkPayload;

    public CreateOrderResponse(@JsonProperty(PaymentConstants.ORDER_ID) String str, @JsonProperty("amount") int i, @JsonProperty(PayloadKt.KEY_JP_CURRENCY) String str2, @JsonProperty("gateway") String str3, @JsonProperty("payment_links") PaymentLinks paymentLinks, @JsonProperty("sdk_payload") SdkPayload sdkPayload) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.orderId = str;
        this.amount = i;
        this.currency = str2;
        this.gateway = str3;
        this.paymentLinks = paymentLinks;
        this.sdkPayload = sdkPayload;
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

    public final String getGateway() {
        return this.gateway;
    }

    public final PaymentLinks getPaymentLinks() {
        return this.paymentLinks;
    }

    public final SdkPayload getSdkPayload() {
        return this.sdkPayload;
    }

    public static /* synthetic */ CreateOrderResponse copy$default(CreateOrderResponse createOrderResponse, String str, int i, String str2, String str3, PaymentLinks paymentLinks, SdkPayload sdkPayload, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createOrderResponse.orderId;
        }
        if ((i2 & 2) != 0) {
            i = createOrderResponse.amount;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = createOrderResponse.currency;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = createOrderResponse.gateway;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            paymentLinks = createOrderResponse.paymentLinks;
        }
        PaymentLinks paymentLinks2 = paymentLinks;
        if ((i2 & 32) != 0) {
            sdkPayload = createOrderResponse.sdkPayload;
        }
        return createOrderResponse.copy(str, i3, str4, str5, paymentLinks2, sdkPayload);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGateway() {
        return this.gateway;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaymentLinks getPaymentLinks() {
        return this.paymentLinks;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SdkPayload getSdkPayload() {
        return this.sdkPayload;
    }

    public final CreateOrderResponse copy(@JsonProperty(PaymentConstants.ORDER_ID) String p0, @JsonProperty("amount") int p1, @JsonProperty(PayloadKt.KEY_JP_CURRENCY) String p2, @JsonProperty("gateway") String p3, @JsonProperty("payment_links") PaymentLinks p4, @JsonProperty("sdk_payload") SdkPayload p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new CreateOrderResponse(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CreateOrderResponse)) {
            return false;
        }
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.orderId, (Object) createOrderResponse.orderId) && this.amount == createOrderResponse.amount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.currency, (Object) createOrderResponse.currency) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.gateway, (Object) createOrderResponse.gateway) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.paymentLinks, createOrderResponse.paymentLinks) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sdkPayload, createOrderResponse.sdkPayload);
    }

    public final int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = Integer.hashCode(this.amount);
        int iHashCode3 = this.currency.hashCode();
        int iHashCode4 = this.gateway.hashCode();
        PaymentLinks paymentLinks = this.paymentLinks;
        int iHashCode5 = paymentLinks == null ? 0 : paymentLinks.hashCode();
        SdkPayload sdkPayload = this.sdkPayload;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (sdkPayload != null ? sdkPayload.hashCode() : 0);
    }

    public final String toString() {
        String str = this.orderId;
        int i = this.amount;
        String str2 = this.currency;
        String str3 = this.gateway;
        PaymentLinks paymentLinks = this.paymentLinks;
        SdkPayload sdkPayload = this.sdkPayload;
        StringBuilder sb = new StringBuilder("CreateOrderResponse(orderId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(i);
        sb.append(", currency=");
        sb.append(str2);
        sb.append(", gateway=");
        sb.append(str3);
        sb.append(", paymentLinks=");
        sb.append(paymentLinks);
        sb.append(", sdkPayload=");
        sb.append(sdkPayload);
        sb.append(")");
        return sb.toString();
    }
}
