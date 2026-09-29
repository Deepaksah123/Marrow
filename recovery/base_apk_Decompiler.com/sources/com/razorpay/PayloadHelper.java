package com.razorpay;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.marrow.data.api.models.response.payment.PayloadKt;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bz\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010'\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R$\u0010*\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R$\u0010-\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R$\u00100\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0010\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R$\u00103\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R$\u00106\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0010\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R$\u00109\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001c\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010 R$\u0010<\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010@R\"\u0010A\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001c\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010 R$\u0010D\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001c\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R$\u0010G\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\u001c\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R$\u0010J\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u001c\u001a\u0004\bK\u0010\u001e\"\u0004\bL\u0010 R$\u0010M\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010\u001c\u001a\u0004\bN\u0010\u001e\"\u0004\bO\u0010 R$\u0010P\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001c\u001a\u0004\bQ\u0010\u001e\"\u0004\bR\u0010 R$\u0010S\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010\u001c\u001a\u0004\bT\u0010\u001e\"\u0004\bU\u0010 R$\u0010V\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010\u001c\u001a\u0004\bW\u0010\u001e\"\u0004\bX\u0010 R$\u0010Y\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010\u001c\u001a\u0004\bZ\u0010\u001e\"\u0004\b[\u0010 R$\u0010\\\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u001c\u001a\u0004\b]\u0010\u001e\"\u0004\b^\u0010 R$\u0010_\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010\u0010\u001a\u0004\b`\u0010\u0012\"\u0004\ba\u0010\u0014R$\u0010b\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010\u0010\u001a\u0004\bc\u0010\u0012\"\u0004\bd\u0010\u0014R$\u0010e\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010\u0010\u001a\u0004\bf\u0010\u0012\"\u0004\bg\u0010\u0014R$\u0010h\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010n\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010\u0010\u001a\u0004\bo\u0010\u0012\"\u0004\bp\u0010\u0014R$\u0010q\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010\u0010\u001a\u0004\br\u0010\u0012\"\u0004\bs\u0010\u0014R$\u0010t\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010\u0010\u001a\u0004\bu\u0010\u0012\"\u0004\bv\u0010\u0014R$\u0010w\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010}\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b}\u0010\u0010\u001a\u0004\b~\u0010\u0012\"\u0004\b\u007f\u0010\u0014R(\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\u0010\u001a\u0005\b\u0081\u0001\u0010\u0012\"\u0005\b\u0082\u0001\u0010\u0014R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010\u001c\u001a\u0005\b\u0084\u0001\u0010\u001e\"\u0005\b\u0085\u0001\u0010 R(\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010x\u001a\u0005\b\u0087\u0001\u0010z\"\u0005\b\u0088\u0001\u0010|"}, d2 = {"Lcom/razorpay/PayloadHelper;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "checkColorValidityAndSanitize", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", "", "allowRotation", "Ljava/lang/Boolean;", "getAllowRotation", "()Ljava/lang/Boolean;", "setAllowRotation", "(Ljava/lang/Boolean;)V", "amount", "I", "getAmount", "()I", "setAmount", "(I)V", "backDropColor", "Ljava/lang/String;", "getBackDropColor", "()Ljava/lang/String;", "setBackDropColor", "(Ljava/lang/String;)V", "callbackUrl", "getCallbackUrl", "setCallbackUrl", TtmlNode.ATTR_TTS_COLOR, "getColor", "setColor", PayloadKt.KEY_JP_CURRENCY, "getCurrency", "setCurrency", PayloadKt.KEY_JP_CUSTOMER_ID, "getCustomerId", "setCustomerId", "description", "getDescription", "setDescription", "hideTopBar", "getHideTopBar", "setHideTopBar", "image", "getImage", "setImage", "modalConfirmClose", "getModalConfirmClose", "setModalConfirmClose", "name", "getName", "setName", CourseConfigKeyConstantsKt.KEY_NOTES, "Lorg/json/JSONObject;", "getNotes", "setNotes", "(Lorg/json/JSONObject;)V", "orderId", "getOrderId", "setOrderId", "prefillBankName", "getPrefillBankName", "setPrefillBankName", "prefillCardCvv", "getPrefillCardCvv", "setPrefillCardCvv", "prefillCardExp", "getPrefillCardExp", "setPrefillCardExp", "prefillCardNum", "getPrefillCardNum", "setPrefillCardNum", "prefillContact", "getPrefillContact", "setPrefillContact", "prefillEmail", "getPrefillEmail", "setPrefillEmail", "prefillMethod", "getPrefillMethod", "setPrefillMethod", "prefillName", "getPrefillName", "setPrefillName", "prefillVpa", "getPrefillVpa", "setPrefillVpa", "readOnlyContact", "getReadOnlyContact", "setReadOnlyContact", "readOnlyEmail", "getReadOnlyEmail", "setReadOnlyEmail", "readOnlyName", "getReadOnlyName", "setReadOnlyName", "recurring", "Ljava/lang/Object;", "getRecurring", "()Ljava/lang/Object;", "setRecurring", "(Ljava/lang/Object;)V", "redirect", "getRedirect", "setRedirect", "rememberCustomer", "getRememberCustomer", "setRememberCustomer", "retryEnabled", "getRetryEnabled", "setRetryEnabled", "retryMaxCount", "Ljava/lang/Integer;", "getRetryMaxCount", "()Ljava/lang/Integer;", "setRetryMaxCount", "(Ljava/lang/Integer;)V", "sendSmsHash", "getSendSmsHash", "setSendSmsHash", "subscriptionCardChange", "getSubscriptionCardChange", "setSubscriptionCardChange", "subscriptionId", "getSubscriptionId", "setSubscriptionId", "timeout", "getTimeout", "setTimeout"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PayloadHelper {
    private Boolean allowRotation;
    private int amount;
    private String backDropColor;
    private String callbackUrl;
    private String color;
    private String currency;
    private String customerId;
    private String description;
    private Boolean hideTopBar;
    private String image;
    private Boolean modalConfirmClose;
    private String name;
    private JSONObject notes;
    private String orderId;
    private String prefillBankName;
    private String prefillCardCvv;
    private String prefillCardExp;
    private String prefillCardNum;
    private String prefillContact;
    private String prefillEmail;
    private String prefillMethod;
    private String prefillName;
    private String prefillVpa;
    private Boolean readOnlyContact;
    private Boolean readOnlyEmail;
    private Boolean readOnlyName;
    private Object recurring;
    private Boolean redirect;
    private Boolean rememberCustomer;
    private Boolean retryEnabled;
    private Integer retryMaxCount;
    private Boolean sendSmsHash;
    private Boolean subscriptionCardChange;
    private String subscriptionId;
    private Integer timeout;

    public PayloadHelper(String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.currency = str;
        this.amount = i;
        this.orderId = str2;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final void setAmount(int i) {
        this.amount = i;
    }

    public final void setCurrency(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.currency = str;
    }

    public final void setOrderId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.orderId = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final String getImage() {
        return this.image;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final String getPrefillName() {
        return this.prefillName;
    }

    public final void setPrefillName(String str) {
        this.prefillName = str;
    }

    public final String getPrefillEmail() {
        return this.prefillEmail;
    }

    public final void setPrefillEmail(String str) {
        this.prefillEmail = str;
    }

    public final String getPrefillContact() {
        return this.prefillContact;
    }

    public final void setPrefillContact(String str) {
        this.prefillContact = str;
    }

    public final String getPrefillMethod() {
        return this.prefillMethod;
    }

    public final void setPrefillMethod(String str) {
        this.prefillMethod = str;
    }

    public final String getPrefillCardNum() {
        return this.prefillCardNum;
    }

    public final void setPrefillCardNum(String str) {
        this.prefillCardNum = str;
    }

    public final String getPrefillCardExp() {
        return this.prefillCardExp;
    }

    public final void setPrefillCardExp(String str) {
        this.prefillCardExp = str;
    }

    public final String getPrefillCardCvv() {
        return this.prefillCardCvv;
    }

    public final void setPrefillCardCvv(String str) {
        this.prefillCardCvv = str;
    }

    public final String getPrefillBankName() {
        return this.prefillBankName;
    }

    public final void setPrefillBankName(String str) {
        this.prefillBankName = str;
    }

    public final String getPrefillVpa() {
        return this.prefillVpa;
    }

    public final void setPrefillVpa(String str) {
        this.prefillVpa = str;
    }

    public final JSONObject getNotes() {
        return this.notes;
    }

    public final void setNotes(JSONObject jSONObject) {
        this.notes = jSONObject;
    }

    public final String getColor() {
        return this.color;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final Boolean getHideTopBar() {
        return this.hideTopBar;
    }

    public final void setHideTopBar(Boolean bool) {
        this.hideTopBar = bool;
    }

    public final String getBackDropColor() {
        return this.backDropColor;
    }

    public final void setBackDropColor(String str) {
        this.backDropColor = str;
    }

    public final Boolean getModalConfirmClose() {
        return this.modalConfirmClose;
    }

    public final void setModalConfirmClose(Boolean bool) {
        this.modalConfirmClose = bool;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final void setSubscriptionId(String str) {
        this.subscriptionId = str;
    }

    public final Boolean getSubscriptionCardChange() {
        return this.subscriptionCardChange;
    }

    public final void setSubscriptionCardChange(Boolean bool) {
        this.subscriptionCardChange = bool;
    }

    public final Object getRecurring() {
        return this.recurring;
    }

    public final void setRecurring(Object obj) {
        this.recurring = obj;
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public final Boolean getRedirect() {
        return this.redirect;
    }

    public final void setRedirect(Boolean bool) {
        this.redirect = bool;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final void setCustomerId(String str) {
        this.customerId = str;
    }

    public final Integer getTimeout() {
        return this.timeout;
    }

    public final void setTimeout(Integer num) {
        this.timeout = num;
    }

    public final Boolean getRememberCustomer() {
        return this.rememberCustomer;
    }

    public final void setRememberCustomer(Boolean bool) {
        this.rememberCustomer = bool;
    }

    public final Boolean getReadOnlyName() {
        return this.readOnlyName;
    }

    public final void setReadOnlyName(Boolean bool) {
        this.readOnlyName = bool;
    }

    public final Boolean getReadOnlyEmail() {
        return this.readOnlyEmail;
    }

    public final void setReadOnlyEmail(Boolean bool) {
        this.readOnlyEmail = bool;
    }

    public final Boolean getReadOnlyContact() {
        return this.readOnlyContact;
    }

    public final void setReadOnlyContact(Boolean bool) {
        this.readOnlyContact = bool;
    }

    public final Boolean getSendSmsHash() {
        return this.sendSmsHash;
    }

    public final void setSendSmsHash(Boolean bool) {
        this.sendSmsHash = bool;
    }

    public final Boolean getAllowRotation() {
        return this.allowRotation;
    }

    public final void setAllowRotation(Boolean bool) {
        this.allowRotation = bool;
    }

    public final Boolean getRetryEnabled() {
        return this.retryEnabled;
    }

    public final void setRetryEnabled(Boolean bool) {
        this.retryEnabled = bool;
    }

    public final Integer getRetryMaxCount() {
        return this.retryMaxCount;
    }

    public final void setRetryMaxCount(Integer num) {
        this.retryMaxCount = num;
    }

    public final JSONObject getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject.put(PayloadKt.KEY_JP_CURRENCY, this.currency);
            jSONObject.put("amount", this.amount);
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(this.orderId, "order_")) {
                jSONObject.put(PaymentConstants.ORDER_ID, this.orderId);
                String str = this.name;
                if (str != null) {
                    jSONObject.put("name", str);
                }
                String str2 = this.description;
                if (str2 != null) {
                    jSONObject.put("description", str2);
                }
                String str3 = this.image;
                if (str3 != null) {
                    jSONObject.put("image", str3);
                }
                String str4 = this.prefillName;
                if (str4 != null) {
                    jSONObject3.put("name", str4);
                }
                String str5 = this.prefillContact;
                if (str5 != null) {
                    jSONObject3.put(NotesDispatchAddressRequestKt.KEY_CONTACT, str5);
                }
                String str6 = this.prefillEmail;
                if (str6 != null) {
                    jSONObject3.put("email", str6);
                }
                String str7 = this.prefillMethod;
                if (str7 != null) {
                    jSONObject3.put("method", str7);
                }
                String str8 = this.prefillCardNum;
                if (str8 != null) {
                    jSONObject3.put("card[number]", str8);
                }
                String str9 = this.prefillCardExp;
                if (str9 != null) {
                    jSONObject3.put("card[expiry]", str9);
                }
                String str10 = this.prefillCardCvv;
                if (str10 != null) {
                    jSONObject3.put("card[cvv]", str10);
                }
                String str11 = this.prefillBankName;
                if (str11 != null) {
                    jSONObject3.put(PaymentConstants.BANK, str11);
                }
                String str12 = this.prefillVpa;
                if (str12 != null) {
                    jSONObject3.put("vpa", str12);
                }
                if (jSONObject3.length() > 0) {
                    jSONObject.put("prefill", jSONObject3);
                }
                JSONObject jSONObject5 = this.notes;
                if (jSONObject5 != null) {
                    jSONObject.put(CourseConfigKeyConstantsKt.KEY_NOTES, jSONObject5);
                }
                String str13 = this.color;
                if (str13 != null) {
                    String strCheckColorValidityAndSanitize = checkColorValidityAndSanitize(str13);
                    if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strCheckColorValidityAndSanitize, "#")) {
                        jSONObject4.put(TtmlNode.ATTR_TTS_COLOR, strCheckColorValidityAndSanitize);
                    } else {
                        JSONObject jSONObjectPut = new JSONObject().put("error", strCheckColorValidityAndSanitize);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
                        return jSONObjectPut;
                    }
                }
                Boolean bool = this.hideTopBar;
                if (bool != null) {
                    jSONObject4.put("hide_topbar", bool.booleanValue());
                }
                String str14 = this.backDropColor;
                if (str14 != null) {
                    String strCheckColorValidityAndSanitize2 = checkColorValidityAndSanitize(str14);
                    if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strCheckColorValidityAndSanitize2, "#")) {
                        jSONObject4.put("backdrop_color", strCheckColorValidityAndSanitize2);
                    } else {
                        JSONObject jSONObjectPut2 = new JSONObject().put("error", strCheckColorValidityAndSanitize2);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut2, "");
                        return jSONObjectPut2;
                    }
                }
                if (jSONObject4.length() > 0) {
                    jSONObject.put(CourseConfigKeyConstantsKt.KEY_THEME, jSONObject4);
                }
                Boolean bool2 = this.modalConfirmClose;
                if (bool2 != null) {
                    boolean zBooleanValue = bool2.booleanValue();
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("confirm_close", zBooleanValue);
                    jSONObject.put("modal", jSONObject6);
                }
                String str15 = this.subscriptionId;
                if (str15 != null) {
                    jSONObject.put("subscription_id", str15);
                }
                Boolean bool3 = this.subscriptionCardChange;
                if (bool3 != null) {
                    jSONObject.put("subscription_card_change", bool3.booleanValue());
                }
                Object obj = this.recurring;
                if (obj != null) {
                    jSONObject.put("recurring", obj);
                }
                String str16 = this.callbackUrl;
                if (str16 != null) {
                    jSONObject.put("callback_url", str16);
                }
                Boolean bool4 = this.redirect;
                if (bool4 != null) {
                    jSONObject.put("redirect", bool4.booleanValue());
                }
                String str17 = this.customerId;
                if (str17 != null) {
                    if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str17, "cust_")) {
                        jSONObject.put(PaymentConstants.CUSTOMER_ID, str17);
                    } else {
                        JSONObject jSONObjectPut3 = new JSONObject().put("error", "Invalid Customer ID. It starts with cust_");
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut3, "");
                        return jSONObjectPut3;
                    }
                }
                Integer num = this.timeout;
                if (num != null) {
                    jSONObject.put("timeout", num.intValue());
                }
                Boolean bool5 = this.rememberCustomer;
                if (bool5 != null) {
                    jSONObject.put("remember_customer", bool5.booleanValue());
                }
                Boolean bool6 = this.retryEnabled;
                if (bool6 != null) {
                    boolean zBooleanValue2 = bool6.booleanValue();
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("enabled", zBooleanValue2);
                    Integer num2 = this.retryMaxCount;
                    jSONObject7.put("max_count", num2 != null ? num2.intValue() : 4);
                    jSONObject.put("retry", jSONObject7);
                }
                Boolean bool7 = this.readOnlyName;
                if (bool7 != null) {
                    jSONObject2.put("name", bool7.booleanValue());
                }
                Boolean bool8 = this.readOnlyContact;
                if (bool8 != null) {
                    jSONObject2.put(NotesDispatchAddressRequestKt.KEY_CONTACT, bool8.booleanValue());
                }
                Boolean bool9 = this.readOnlyEmail;
                if (bool9 != null) {
                    jSONObject2.put("email", bool9.booleanValue());
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put("readonly", jSONObject2);
                }
                Boolean bool10 = this.allowRotation;
                if (bool10 != null) {
                    jSONObject.put("allow_rotation", bool10.booleanValue());
                }
                Boolean bool11 = this.sendSmsHash;
                if (bool11 != null) {
                    jSONObject.put("send_sms_hash", bool11.booleanValue());
                }
                return jSONObject;
            }
            JSONObject jSONObjectPut4 = new JSONObject().put("error", "Invalid order id. Order ID starts with order_");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut4, "");
            return jSONObjectPut4;
        } catch (JSONException e) {
            JSONObject jSONObjectPut5 = new JSONObject().put("error", e.getLocalizedMessage());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut5, "");
            return jSONObjectPut5;
        }
    }

    private final String checkColorValidityAndSanitize(String p0) {
        return p0.length() < 6 ? "Invalid color" : p0.length() == 6 ? TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "#") ? "Invalid color" : "#".concat(String.valueOf(p0)) : (p0.length() == 7 && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "#")) ? p0 : "Invalid color";
    }
}
