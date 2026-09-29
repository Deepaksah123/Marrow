package kotlin;

import com.marrow.R;
import com.marrow.data.api.models.response.payment.Payload;
import com.marrow.data.api.models.response.payment.PayloadKt;
import com.marrow.data.api.models.response.payment.SdkPayload;
import com.marrow.data.api.models.response.payment.SdkPayloadKt;
import in.juspay.hyper.constants.Labels;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.services.HyperServices;
import java.util.UUID;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ\u0081\u0001\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010\u0016\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\"R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#"}, d2 = {"Lo/deriveMaxSize;", "Lo/convertTextAlignment;", "Lo/maybeGetTypeVariable;", "p0", "Lkotlin/Function0;", "", "p1", "Lkotlin/Function1;", "", "p2", "p3", "p4", "p5", "Lkotlin/Function2;", "", "p6", "<init>", "(Lo/maybeGetTypeVariable;Lo/getCreatedOnDateMs;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getCreatedOnDateMs;Lo/getAnswerMap;Lo/MagicModuleSubmissionRequestBody;)V", "Lcom/marrow/data/api/models/response/payment/SdkPayload;", "RemoteActionCompatParcelizer", "(Lcom/marrow/data/api/models/response/payment/SdkPayload;)V", "", "AudioAttributesCompatParcelizer", "()Z", "Lorg/json/JSONObject;", "read", "()Lorg/json/JSONObject;", "(Lcom/marrow/data/api/models/response/payment/SdkPayload;)Lorg/json/JSONObject;", "Lin/juspay/hypersdk/ui/HyperPaymentsCallbackAdapter;", "IconCompatParcelizer", "(Lo/getCreatedOnDateMs;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getCreatedOnDateMs;Lo/getAnswerMap;Lo/MagicModuleSubmissionRequestBody;)Lin/juspay/hypersdk/ui/HyperPaymentsCallbackAdapter;", "Lo/maybeGetTypeVariable;", "write", "Lin/juspay/services/HyperServices;", "Lin/juspay/services/HyperServices;", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class deriveMaxSize implements convertTextAlignment {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final maybeGetTypeVariable write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private HyperServices AudioAttributesCompatParcelizer;

    public deriveMaxSize(maybeGetTypeVariable maybegettypevariable, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getAnswerMap<? super String, getShowPopup> getanswermap, getAnswerMap<? super String, getShowPopup> getanswermap2, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getAnswerMap<? super String, getShowPopup> getanswermap3, MagicModuleSubmissionRequestBody<? super Integer, ? super String, getShowPopup> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        this.write = maybegettypevariable;
        this.read = "";
        HyperServices hyperServices = new HyperServices(maybegettypevariable);
        this.AudioAttributesCompatParcelizer = hyperServices;
        if (hyperServices.isInitialised()) {
            return;
        }
        this.AudioAttributesCompatParcelizer.initiate(read(), IconCompatParcelizer(getcreatedondatems, getanswermap, getanswermap2, getcreatedondatems2, getanswermap3, magicModuleSubmissionRequestBody));
    }

    public final void RemoteActionCompatParcelizer(SdkPayload p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.process(read(p0));
    }

    public final boolean AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer.isInitialised()) {
            return this.AudioAttributesCompatParcelizer.onBackPressed();
        }
        return false;
    }

    private static JSONObject read() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("action", Labels.HyperSdk.INITIATE);
            jSONObject2.put("merchantId", "marrowmed");
            jSONObject2.put("clientId", "marrowmed");
            jSONObject2.put("environment", "production");
            UUID uuidRandomUUID = UUID.randomUUID();
            StringBuilder sb = new StringBuilder();
            sb.append(uuidRandomUUID);
            jSONObject.put(SdkPayloadKt.KEY_JP_REQUEST_ID, sb.toString());
            jSONObject.put("service", "in.juspay.hyperpay");
            jSONObject.put("payload", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject read(SdkPayload p0) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Payload payload = p0.getPayload();
            jSONObject2.put("action", payload != null ? payload.getAction() : null);
            Payload payload2 = p0.getPayload();
            jSONObject2.put("amount", payload2 != null ? payload2.getAmount() : null);
            Payload payload3 = p0.getPayload();
            jSONObject2.put("clientId", payload3 != null ? payload3.getClientId() : null);
            Payload payload4 = p0.getPayload();
            jSONObject2.put("merchantId", payload4 != null ? payload4.getClientId() : null);
            Payload payload5 = p0.getPayload();
            jSONObject2.put("environment", payload5 != null ? payload5.getEnvironment() : null);
            Payload payload6 = p0.getPayload();
            jSONObject2.put(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN, payload6 != null ? payload6.getClientAuthToken() : null);
            Payload payload7 = p0.getPayload();
            jSONObject2.put(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY, payload7 != null ? payload7.getClientAuthTokenExpiry() : null);
            Payload payload8 = p0.getPayload();
            jSONObject2.put(PayloadKt.KEY_JP_CUSTOMER_ID, payload8 != null ? payload8.getCustomerId() : null);
            jSONObject2.put(PayloadKt.KEY_JP_RETURN_URL, "www.marrow.com");
            Payload payload9 = p0.getPayload();
            jSONObject2.put(PayloadKt.KEY_JP_CURRENCY, payload9 != null ? payload9.getCurrency() : null);
            Payload payload10 = p0.getPayload();
            jSONObject2.put(PayloadKt.KEY_JP_CUSTOMER_PHONE, payload10 != null ? payload10.getCustomerPhone() : null);
            Payload payload11 = p0.getPayload();
            jSONObject2.put(PayloadKt.KEY_JP_CUSTOMER_EMAIL, payload11 != null ? payload11.getCustomerEmail() : null);
            Payload payload12 = p0.getPayload();
            jSONObject2.put("orderId", payload12 != null ? payload12.getOrderId() : null);
            Payload payload13 = p0.getPayload();
            jSONObject2.put("description", payload13 != null ? payload13.getDescription() : null);
            Payload payload14 = p0.getPayload();
            this.read = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(payload14 != null ? payload14.getOrderId() : null);
            jSONObject.put(SdkPayloadKt.KEY_JP_REQUEST_ID, p0.getRequestId());
            jSONObject.put("service", p0.getService());
            jSONObject.put("payload", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static final class AudioAttributesCompatParcelizer extends HyperPaymentsCallbackAdapter {
        private /* synthetic */ getAnswerMap<String, getShowPopup> AudioAttributesCompatParcelizer;
        private /* synthetic */ deriveMaxSize AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> IconCompatParcelizer;
        private /* synthetic */ getAnswerMap<String, getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> read;
        private /* synthetic */ getAnswerMap<String, getShowPopup> write;

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems, deriveMaxSize derivemaxsize, getAnswerMap<? super String, getShowPopup> getanswermap, getAnswerMap<? super String, getShowPopup> getanswermap2, MagicModuleSubmissionRequestBody<? super Integer, ? super String, getShowPopup> magicModuleSubmissionRequestBody, getAnswerMap<? super String, getShowPopup> getanswermap3, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
            this.read = getcreatedondatems;
            this.AudioAttributesImplApi26Parcelizer = derivemaxsize;
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.MediaBrowserCompatCustomActionResultReceiver = getanswermap2;
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            this.write = getanswermap3;
            this.RemoteActionCompatParcelizer = getcreatedondatems2;
        }

        @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
        public final void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler) {
            toMagicModuleMetaRepoModel.write(jSONObject, "");
            try {
                String string = jSONObject.getString("event");
                if (string != null) {
                    int iHashCode = string.hashCode();
                    if (iHashCode == -174112336) {
                        if (string.equals("hide_loader")) {
                            this.read.invoke();
                            return;
                        }
                        return;
                    }
                    if (iHashCode != 24468461) {
                        if (iHashCode == 1858061443) {
                            string.equals("initiate_result");
                        }
                        return;
                    }
                    if (string.equals("process_result")) {
                        boolean zOptBoolean = jSONObject.optBoolean("error");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
                        String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("status") : null;
                        if (!zOptBoolean) {
                            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strOptString, (Object) "charged")) {
                                if (this.AudioAttributesImplApi26Parcelizer.read.length() > 0) {
                                    this.AudioAttributesCompatParcelizer.invoke(this.AudioAttributesImplApi26Parcelizer.read);
                                    return;
                                }
                                return;
                            } else {
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strOptString, (Object) "cod_initiated")) {
                                    this.MediaBrowserCompatCustomActionResultReceiver.invoke("COD is not allowed");
                                    return;
                                }
                                return;
                            }
                        }
                        String strOptString2 = jSONObject.optString("errorMessage");
                        String strOptString3 = jSONObject.optString("errorCode");
                        String string2 = this.AudioAttributesImplApi26Parcelizer.write.getString(R.string.label_order_id);
                        String str = this.AudioAttributesImplApi26Parcelizer.read;
                        String string3 = this.AudioAttributesImplApi26Parcelizer.write.getString(R.string.label_payment_try_again_detail);
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(string2);
                        sb.append(" ");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(strOptString2);
                        sb.append(" ");
                        sb.append(string3);
                        sb.append(" [ERR: ");
                        sb.append(strOptString3);
                        sb.append("]");
                        String string4 = sb.toString();
                        this.IconCompatParcelizer.invoke(Integer.valueOf(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strOptString3, (Object) "JP_002") ? 1 : 0), PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(jSONObject.toString()));
                        if (strOptString != null) {
                            switch (strOptString.hashCode()) {
                                case -1875974461:
                                    if (!strOptString.equals("authorization_failed")) {
                                    }
                                    this.write.invoke(string4);
                                    break;
                                case -1867873600:
                                    if (strOptString.equals("no internet")) {
                                        this.RemoteActionCompatParcelizer.invoke();
                                        break;
                                    }
                                    break;
                                case -592873500:
                                    if (!strOptString.equals("authentication_failed")) {
                                    }
                                    this.write.invoke(string4);
                                    break;
                                case 330873691:
                                    if (!strOptString.equals("user_aborted")) {
                                    }
                                    this.MediaBrowserCompatCustomActionResultReceiver.invoke("Payment Cancelled");
                                    break;
                                case 722587238:
                                    if (!strOptString.equals("authorizing")) {
                                    }
                                    this.write.invoke(string4);
                                    break;
                                case 1039967579:
                                    if (!strOptString.equals("backpressed")) {
                                    }
                                    this.MediaBrowserCompatCustomActionResultReceiver.invoke("Payment Cancelled");
                                    break;
                                case 1113644194:
                                    if (!strOptString.equals("pending_vbv")) {
                                    }
                                    this.write.invoke(string4);
                                    break;
                                case 1722194021:
                                    if (!strOptString.equals("api_failure")) {
                                    }
                                    this.write.invoke(string4);
                                    break;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                this.read.invoke();
            }
        }
    }

    private final HyperPaymentsCallbackAdapter IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0, getAnswerMap<? super String, getShowPopup> p1, getAnswerMap<? super String, getShowPopup> p2, getCreatedOnDateMs<getShowPopup> p3, getAnswerMap<? super String, getShowPopup> p4, MagicModuleSubmissionRequestBody<? super Integer, ? super String, getShowPopup> p5) {
        return new AudioAttributesCompatParcelizer(p0, this, p1, p2, p5, p4, p3);
    }
}
