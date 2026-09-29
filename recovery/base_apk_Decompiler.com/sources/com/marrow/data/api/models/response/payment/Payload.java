package com.marrow.data.api.models.response.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J¸\u0001\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0014R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0014R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u0014R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u0014R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u0014R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010\u0014R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010\u0014R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010\u0014R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b?\u0010\u0014R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010,\u001a\u0004\bA\u0010\u0014R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010\u0014R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010,\u001a\u0004\bE\u0010\u0014R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u0010\u0014"}, d2 = {"Lcom/marrow/data/api/models/response/payment/Payload;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/response/payment/Payload;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "clientId", "Ljava/lang/String;", "getClientId", "amount", "getAmount", "merchantId", "getMerchantId", PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN, "getClientAuthToken", PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY, "getClientAuthTokenExpiry", "environment", "getEnvironment", "action", "getAction", PayloadKt.KEY_JP_CUSTOMER_ID, "getCustomerId", PayloadKt.KEY_JP_RETURN_URL, "getReturnUrl", PayloadKt.KEY_JP_CURRENCY, "getCurrency", PayloadKt.KEY_JP_CUSTOMER_PHONE, "getCustomerPhone", PayloadKt.KEY_JP_CUSTOMER_EMAIL, "getCustomerEmail", "orderId", "getOrderId", "description", "getDescription"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Payload {

    @isFirst(RemoteActionCompatParcelizer = "action")
    private final String action;

    @isFirst(RemoteActionCompatParcelizer = "amount")
    private final String amount;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN)
    private final String clientAuthToken;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY)
    private final String clientAuthTokenExpiry;

    @isFirst(RemoteActionCompatParcelizer = "clientId")
    private final String clientId;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_CURRENCY)
    private final String currency;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_CUSTOMER_EMAIL)
    private final String customerEmail;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_CUSTOMER_ID)
    private final String customerId;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_CUSTOMER_PHONE)
    private final String customerPhone;

    @isFirst(RemoteActionCompatParcelizer = "description")
    private final String description;

    @isFirst(RemoteActionCompatParcelizer = "environment")
    private final String environment;

    @isFirst(RemoteActionCompatParcelizer = "merchantId")
    private final String merchantId;

    @isFirst(RemoteActionCompatParcelizer = "orderId")
    private final String orderId;

    @isFirst(RemoteActionCompatParcelizer = PayloadKt.KEY_JP_RETURN_URL)
    private final String returnUrl;

    public Payload(@JsonProperty("clientId") String str, @JsonProperty("amount") String str2, @JsonProperty("merchantId") String str3, @JsonProperty(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN) String str4, @JsonProperty(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY) String str5, @JsonProperty("environment") String str6, @JsonProperty("action") String str7, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_ID) String str8, @JsonProperty(PayloadKt.KEY_JP_RETURN_URL) String str9, @JsonProperty(PayloadKt.KEY_JP_CURRENCY) String str10, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_PHONE) String str11, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_EMAIL) String str12, @JsonProperty("orderId") String str13, @JsonProperty("description") String str14) {
        this.clientId = str;
        this.amount = str2;
        this.merchantId = str3;
        this.clientAuthToken = str4;
        this.clientAuthTokenExpiry = str5;
        this.environment = str6;
        this.action = str7;
        this.customerId = str8;
        this.returnUrl = str9;
        this.currency = str10;
        this.customerPhone = str11;
        this.customerEmail = str12;
        this.orderId = str13;
        this.description = str14;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getClientAuthToken() {
        return this.clientAuthToken;
    }

    public final String getClientAuthTokenExpiry() {
        return this.clientAuthTokenExpiry;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientAuthToken() {
        return this.clientAuthToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getClientAuthTokenExpiry() {
        return this.clientAuthTokenExpiry;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final Payload copy(@JsonProperty("clientId") String p0, @JsonProperty("amount") String p1, @JsonProperty("merchantId") String p2, @JsonProperty(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN) String p3, @JsonProperty(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY) String p4, @JsonProperty("environment") String p5, @JsonProperty("action") String p6, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_ID) String p7, @JsonProperty(PayloadKt.KEY_JP_RETURN_URL) String p8, @JsonProperty(PayloadKt.KEY_JP_CURRENCY) String p9, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_PHONE) String p10, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_EMAIL) String p11, @JsonProperty("orderId") String p12, @JsonProperty("description") String p13) {
        return new Payload(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.clientId, (Object) payload.clientId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.amount, (Object) payload.amount) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.merchantId, (Object) payload.merchantId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.clientAuthToken, (Object) payload.clientAuthToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.clientAuthTokenExpiry, (Object) payload.clientAuthTokenExpiry) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.environment, (Object) payload.environment) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.action, (Object) payload.action) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.customerId, (Object) payload.customerId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.returnUrl, (Object) payload.returnUrl) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.currency, (Object) payload.currency) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.customerPhone, (Object) payload.customerPhone) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.customerEmail, (Object) payload.customerEmail) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.orderId, (Object) payload.orderId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) payload.description);
    }

    public final int hashCode() {
        String str = this.clientId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.merchantId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.clientAuthToken;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.clientAuthTokenExpiry;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.environment;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.action;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.customerId;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.returnUrl;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.currency;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.customerPhone;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.customerEmail;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.orderId;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.description;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.clientId;
        String str2 = this.amount;
        String str3 = this.merchantId;
        String str4 = this.clientAuthToken;
        String str5 = this.clientAuthTokenExpiry;
        String str6 = this.environment;
        String str7 = this.action;
        String str8 = this.customerId;
        String str9 = this.returnUrl;
        String str10 = this.currency;
        String str11 = this.customerPhone;
        String str12 = this.customerEmail;
        String str13 = this.orderId;
        String str14 = this.description;
        StringBuilder sb = new StringBuilder("Payload(clientId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(str2);
        sb.append(", merchantId=");
        sb.append(str3);
        sb.append(", clientAuthToken=");
        sb.append(str4);
        sb.append(", clientAuthTokenExpiry=");
        sb.append(str5);
        sb.append(", environment=");
        sb.append(str6);
        sb.append(", action=");
        sb.append(str7);
        sb.append(", customerId=");
        sb.append(str8);
        sb.append(", returnUrl=");
        sb.append(str9);
        sb.append(", currency=");
        sb.append(str10);
        sb.append(", customerPhone=");
        sb.append(str11);
        sb.append(", customerEmail=");
        sb.append(str12);
        sb.append(", orderId=");
        sb.append(str13);
        sb.append(", description=");
        sb.append(str14);
        sb.append(")");
        return sb.toString();
    }
}
