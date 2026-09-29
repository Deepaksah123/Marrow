package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.payment.PayloadKt;
import java.io.IOException;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.sendRemoveDownload;
import kotlin.sendSetStopReason;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J¬\u0001\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013R$\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010-R$\u00101\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010*\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010-R$\u00104\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010-R$\u00107\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010*\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010-R$\u0010:\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010-R$\u0010=\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010*\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010-R$\u0010@\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010*\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010-R$\u0010C\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u0010-R$\u0010F\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010*\u001a\u0004\bG\u0010\u0013\"\u0004\bH\u0010-R$\u0010I\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010*\u001a\u0004\bJ\u0010\u0013\"\u0004\bK\u0010-R$\u0010L\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010*\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010-R$\u0010O\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010*\u001a\u0004\bP\u0010\u0013\"\u0004\bQ\u0010-"}, d2 = {"Lcom/marrow/data/api/models/response/plan/SdkPayloadData;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/response/plan/SdkPayloadData;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "action", "Ljava/lang/String;", "getAction", "setAction", "(Ljava/lang/String;)V", "amount", "getAmount", "setAmount", "clientId", "getClientId", "setClientId", "merchantId", "getMerchantId", "setMerchantId", "environment", "getEnvironment", "setEnvironment", PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN, "getClientAuthToken", "setClientAuthToken", PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY, "getClientAuthTokenExpiry", "setClientAuthTokenExpiry", PayloadKt.KEY_JP_CUSTOMER_ID, "getCustomerId", "setCustomerId", PayloadKt.KEY_JP_CURRENCY, "getCurrency", "setCurrency", PayloadKt.KEY_JP_CUSTOMER_PHONE, "getCustomerPhone", "setCustomerPhone", PayloadKt.KEY_JP_CUSTOMER_EMAIL, "getCustomerEmail", "setCustomerEmail", "orderId", "getOrderId", "setOrderId", "description", "getDescription", "setDescription"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SdkPayloadData {
    private String action;
    private String amount;
    private String clientAuthToken;
    private String clientAuthTokenExpiry;
    private String clientId;
    private String currency;
    private String customerEmail;
    private String customerId;
    private String customerPhone;
    private String description;
    private String environment;
    private String merchantId;
    private String orderId;

    public SdkPayloadData(@JsonProperty("action") String str, @JsonProperty("amount") String str2, @JsonProperty("clientId") String str3, @JsonProperty("merchantId") String str4, @JsonProperty("environment") String str5, @JsonProperty(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN) String str6, @JsonProperty(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY) String str7, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_ID) String str8, @JsonProperty(PayloadKt.KEY_JP_CURRENCY) String str9, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_PHONE) String str10, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_EMAIL) String str11, @JsonProperty("orderId") String str12, @JsonProperty("description") String str13) {
        this.action = str;
        this.amount = str2;
        this.clientId = str3;
        this.merchantId = str4;
        this.environment = str5;
        this.clientAuthToken = str6;
        this.clientAuthTokenExpiry = str7;
        this.customerId = str8;
        this.currency = str9;
        this.customerPhone = str10;
        this.customerEmail = str11;
        this.orderId = str12;
        this.description = str13;
    }

    public /* synthetic */ SdkPayloadData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
    }

    public final String getAction() {
        return this.action;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final void setAmount(String str) {
        this.amount = str;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(String str) {
        this.merchantId = str;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final void setEnvironment(String str) {
        this.environment = str;
    }

    public final String getClientAuthToken() {
        return this.clientAuthToken;
    }

    public final void setClientAuthToken(String str) {
        this.clientAuthToken = str;
    }

    public final String getClientAuthTokenExpiry() {
        return this.clientAuthTokenExpiry;
    }

    public final void setClientAuthTokenExpiry(String str) {
        this.clientAuthTokenExpiry = str;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final void setCustomerId(String str) {
        this.customerId = str;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    public final void setCustomerPhone(String str) {
        this.customerPhone = str;
    }

    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    public final void setCustomerEmail(String str) {
        this.customerEmail = str;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public SdkPayloadData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getClientAuthToken() {
        return this.clientAuthToken;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getClientAuthTokenExpiry() {
        return this.clientAuthTokenExpiry;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final SdkPayloadData copy(@JsonProperty("action") String p0, @JsonProperty("amount") String p1, @JsonProperty("clientId") String p2, @JsonProperty("merchantId") String p3, @JsonProperty("environment") String p4, @JsonProperty(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN) String p5, @JsonProperty(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY) String p6, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_ID) String p7, @JsonProperty(PayloadKt.KEY_JP_CURRENCY) String p8, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_PHONE) String p9, @JsonProperty(PayloadKt.KEY_JP_CUSTOMER_EMAIL) String p10, @JsonProperty("orderId") String p11, @JsonProperty("description") String p12) {
        return new SdkPayloadData(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SdkPayloadData)) {
            return false;
        }
        SdkPayloadData sdkPayloadData = (SdkPayloadData) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.action, (Object) sdkPayloadData.action) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.amount, (Object) sdkPayloadData.amount) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.clientId, (Object) sdkPayloadData.clientId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.merchantId, (Object) sdkPayloadData.merchantId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.environment, (Object) sdkPayloadData.environment) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.clientAuthToken, (Object) sdkPayloadData.clientAuthToken) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.clientAuthTokenExpiry, (Object) sdkPayloadData.clientAuthTokenExpiry) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.customerId, (Object) sdkPayloadData.customerId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.currency, (Object) sdkPayloadData.currency) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.customerPhone, (Object) sdkPayloadData.customerPhone) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.customerEmail, (Object) sdkPayloadData.customerEmail) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.orderId, (Object) sdkPayloadData.orderId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) sdkPayloadData.description);
    }

    public final int hashCode() {
        String str = this.action;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.clientId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.merchantId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.environment;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.clientAuthToken;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.clientAuthTokenExpiry;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.customerId;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.currency;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.customerPhone;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.customerEmail;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.orderId;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.description;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        String str = this.action;
        String str2 = this.amount;
        String str3 = this.clientId;
        String str4 = this.merchantId;
        String str5 = this.environment;
        String str6 = this.clientAuthToken;
        String str7 = this.clientAuthTokenExpiry;
        String str8 = this.customerId;
        String str9 = this.currency;
        String str10 = this.customerPhone;
        String str11 = this.customerEmail;
        String str12 = this.orderId;
        String str13 = this.description;
        StringBuilder sb = new StringBuilder("SdkPayloadData(action=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(str2);
        sb.append(", clientId=");
        sb.append(str3);
        sb.append(", merchantId=");
        sb.append(str4);
        sb.append(", environment=");
        sb.append(str5);
        sb.append(", clientAuthToken=");
        sb.append(str6);
        sb.append(", clientAuthTokenExpiry=");
        sb.append(str7);
        sb.append(", customerId=");
        sb.append(str8);
        sb.append(", currency=");
        sb.append(str9);
        sb.append(", customerPhone=");
        sb.append(str10);
        sb.append(", customerEmail=");
        sb.append(str11);
        sb.append(", orderId=");
        sb.append(str12);
        sb.append(", description=");
        sb.append(str13);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        IconCompatParcelizer(downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 13);
        downloadHelper2.AudioAttributesCompatParcelizer(this.action);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 101);
        downloadHelper2.AudioAttributesCompatParcelizer(this.amount);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 176);
        downloadHelper2.AudioAttributesCompatParcelizer(this.clientAuthToken);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, TarConstants.PREFIXLEN);
        downloadHelper2.AudioAttributesCompatParcelizer(this.clientAuthTokenExpiry);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 32);
        downloadHelper2.AudioAttributesCompatParcelizer(this.clientId);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 182);
        downloadHelper2.AudioAttributesCompatParcelizer(this.currency);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 51);
        downloadHelper2.AudioAttributesCompatParcelizer(this.customerEmail);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 167);
        downloadHelper2.AudioAttributesCompatParcelizer(this.customerId);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 1);
        downloadHelper2.AudioAttributesCompatParcelizer(this.customerPhone);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 9);
        downloadHelper2.AudioAttributesCompatParcelizer(this.description);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 37);
        downloadHelper2.AudioAttributesCompatParcelizer(this.environment);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 132);
        downloadHelper2.AudioAttributesCompatParcelizer(this.merchantId);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 107);
        downloadHelper2.AudioAttributesCompatParcelizer(this.orderId);
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            read(downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        switch (i) {
            case 2:
                if (!z) {
                    this.customerId = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.customerId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.customerId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 16:
                if (!z) {
                    this.amount = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.amount = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.amount = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 31:
                if (!z) {
                    this.description = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.description = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.description = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 45:
                if (!z) {
                    this.action = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.action = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.action = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 47:
                if (!z) {
                    this.clientAuthTokenExpiry = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.clientAuthTokenExpiry = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.clientAuthTokenExpiry = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 57:
                if (!z) {
                    this.customerEmail = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.customerEmail = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.customerEmail = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 80:
                if (!z) {
                    this.environment = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.environment = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.environment = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 87:
                if (!z) {
                    this.customerPhone = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.customerPhone = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.customerPhone = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 96:
                if (!z) {
                    this.clientAuthToken = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.clientAuthToken = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.clientAuthToken = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 133:
                if (!z) {
                    this.merchantId = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.merchantId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.merchantId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 142:
                if (!z) {
                    this.orderId = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.orderId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.orderId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 143:
                if (!z) {
                    this.clientId = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.clientId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.clientId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 177:
                if (!z) {
                    this.currency = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.currency = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.currency = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            default:
                downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                break;
        }
    }
}
