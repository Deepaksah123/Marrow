package kotlin;

import com.marrow.data.api.models.response.payment.PayloadKt;
import com.marrow.data.api.models.response.payment.SdkPayloadKt;
import in.juspay.hyper.constants.Labels;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.services.HyperServices;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.readShort;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00126\u0010\t\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u00100\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u00101\u001a\u00020.H\u0002J\u0010\u00102\u001a\u00020.2\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u00103\u001a\u000204R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bRA\u0010\t\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR#\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR!\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/marrow2/ui/payment/paymentgateway/JusPayGatewayImpl;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "onSdkPaymentSuccess", "Lkotlin/Function0;", "", "onCodInitiated", "onBackPressedOrCancelled", "onAuthorizationFailed", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "errorCode", "errorMsg", "onNoInternet", "onHideLoader", "logAnalytics", "", "onException", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getOnSdkPaymentSuccess", "()Lkotlin/jvm/functions/Function0;", "getOnCodInitiated", "getOnBackPressedOrCancelled", "getOnAuthorizationFailed", "()Lkotlin/jvm/functions/Function2;", "getOnNoInternet", "getOnHideLoader", "getLogAnalytics", "getOnException", "()Lkotlin/jvm/functions/Function1;", "hyperServices", "Lin/juspay/services/HyperServices;", "startPayment", "params", "Lcom/marrow2/domain/payment/model/SdkPayloadParams$JusPaySdkPayloadParams;", "createHyperPaymentsCallbackAdapter", "Lin/juspay/hypersdk/ui/HyperPaymentsCallbackAdapter;", "handleJusPayEvent", "jsonObject", "Lorg/json/JSONObject;", "processResult", "logErrorAnalytics", "createInitiatePayload", "createSdkPayload", "isBackPressHandled", "", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class serializeToIntentExtra {
    public static final read RemoteActionCompatParcelizer = new read(null);
    private final MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesImplApi21Parcelizer;
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesImplApi26Parcelizer;
    private final getAnswerMap<Exception, getShowPopup> AudioAttributesImplBaseParcelizer;
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
    private final getCreatedOnDateMs<getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
    private final getCreatedOnDateMs<getShowPopup> MediaBrowserCompatItemReceiver;
    private HyperServices read;
    private final MagicModuleSubmissionRequestBody<String, String, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    public serializeToIntentExtra(maybeGetTypeVariable maybegettypevariable, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getCreatedOnDateMs<getShowPopup> getcreatedondatems3, MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, getCreatedOnDateMs<getShowPopup> getcreatedondatems4, getCreatedOnDateMs<getShowPopup> getcreatedondatems5, MagicModuleSubmissionRequestBody<? super Integer, ? super String, getShowPopup> magicModuleSubmissionRequestBody2, getAnswerMap<? super Exception, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems5, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody2, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesImplApi21Parcelizer = getcreatedondatems;
        this.AudioAttributesImplApi26Parcelizer = getcreatedondatems2;
        this.IconCompatParcelizer = getcreatedondatems3;
        this.write = magicModuleSubmissionRequestBody;
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems4;
        this.MediaBrowserCompatItemReceiver = getcreatedondatems5;
        this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody2;
        this.AudioAttributesImplBaseParcelizer = getanswermap;
        HyperServices hyperServices = new HyperServices(maybegettypevariable);
        this.read = hyperServices;
        if (hyperServices.isInitialised()) {
            return;
        }
        this.read.initiate(IconCompatParcelizer(), write());
    }

    public final void IconCompatParcelizer(readShort.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.read.process(RemoteActionCompatParcelizer(audioAttributesCompatParcelizer));
    }

    public static final class write extends HyperPaymentsCallbackAdapter {
        write() {
        }

        @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
        public final void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler) {
            toMagicModuleMetaRepoModel.write(jSONObject, "");
            serializeToIntentExtra.this.read(jSONObject);
        }
    }

    private final HyperPaymentsCallbackAdapter write() {
        return new write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("event");
            if (string != null) {
                int iHashCode = string.hashCode();
                if (iHashCode == -174112336) {
                    if (string.equals("hide_loader")) {
                        this.MediaBrowserCompatItemReceiver.invoke();
                    }
                } else if (iHashCode != 24468461) {
                    if (iHashCode == 1858061443) {
                        string.equals("initiate_result");
                    }
                } else if (string.equals("process_result")) {
                    RemoteActionCompatParcelizer(jSONObject);
                }
            }
        } catch (Exception e) {
            this.AudioAttributesImplBaseParcelizer.invoke(e);
        }
    }

    private final void RemoteActionCompatParcelizer(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("status") : null;
        boolean zOptBoolean = jSONObject.optBoolean("error");
        String strOptString2 = jSONObject.optString("errorCode");
        String strOptString3 = jSONObject.optString("errorMessage");
        if (zOptBoolean) {
            toMagicModuleMetaRepoModel.write((Object) strOptString2);
            toMagicModuleMetaRepoModel.write((Object) strOptString3);
            RemoteActionCompatParcelizer(strOptString2, strOptString3);
        }
        if (strOptString != null) {
            switch (strOptString.hashCode()) {
                case -1875974461:
                    if (!strOptString.equals("authorization_failed")) {
                    }
                    MagicModuleSubmissionRequestBody<String, String, getShowPopup> magicModuleSubmissionRequestBody = this.write;
                    toMagicModuleMetaRepoModel.write((Object) strOptString2);
                    toMagicModuleMetaRepoModel.write((Object) strOptString3);
                    magicModuleSubmissionRequestBody.invoke(strOptString2, strOptString3);
                    break;
                case -592873500:
                    if (!strOptString.equals("authentication_failed")) {
                    }
                    MagicModuleSubmissionRequestBody<String, String, getShowPopup> magicModuleSubmissionRequestBody2 = this.write;
                    toMagicModuleMetaRepoModel.write((Object) strOptString2);
                    toMagicModuleMetaRepoModel.write((Object) strOptString3);
                    magicModuleSubmissionRequestBody2.invoke(strOptString2, strOptString3);
                    break;
                case 226612223:
                    if (strOptString.equals("no_internet")) {
                        this.MediaBrowserCompatCustomActionResultReceiver.invoke();
                    }
                    break;
                case 330873691:
                    if (!strOptString.equals("user_aborted")) {
                    }
                    this.IconCompatParcelizer.invoke();
                    break;
                case 722587238:
                    if (!strOptString.equals("authorizing")) {
                    }
                    MagicModuleSubmissionRequestBody<String, String, getShowPopup> magicModuleSubmissionRequestBody22 = this.write;
                    toMagicModuleMetaRepoModel.write((Object) strOptString2);
                    toMagicModuleMetaRepoModel.write((Object) strOptString3);
                    magicModuleSubmissionRequestBody22.invoke(strOptString2, strOptString3);
                    break;
                case 739062832:
                    if (strOptString.equals("charged")) {
                        this.AudioAttributesImplApi21Parcelizer.invoke();
                    }
                    break;
                case 1039967579:
                    if (!strOptString.equals("backpressed")) {
                    }
                    this.IconCompatParcelizer.invoke();
                    break;
                case 1113644194:
                    if (!strOptString.equals("pending_vbv")) {
                    }
                    MagicModuleSubmissionRequestBody<String, String, getShowPopup> magicModuleSubmissionRequestBody222 = this.write;
                    toMagicModuleMetaRepoModel.write((Object) strOptString2);
                    toMagicModuleMetaRepoModel.write((Object) strOptString3);
                    magicModuleSubmissionRequestBody222.invoke(strOptString2, strOptString3);
                    break;
                case 1416742628:
                    if (strOptString.equals("cod_initiated")) {
                        this.AudioAttributesImplApi26Parcelizer.invoke();
                    }
                    break;
                case 1722194021:
                    if (!strOptString.equals("api_failure")) {
                    }
                    MagicModuleSubmissionRequestBody<String, String, getShowPopup> magicModuleSubmissionRequestBody2222 = this.write;
                    toMagicModuleMetaRepoModel.write((Object) strOptString2);
                    toMagicModuleMetaRepoModel.write((Object) strOptString3);
                    magicModuleSubmissionRequestBody2222.invoke(strOptString2, strOptString3);
                    break;
            }
        }
    }

    private final void RemoteActionCompatParcelizer(String str, String str2) {
        this.AudioAttributesCompatParcelizer.invoke(Integer.valueOf(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "JP_002") ? 1 : 0), str2);
    }

    private final JSONObject IconCompatParcelizer() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", Labels.HyperSdk.INITIATE);
            jSONObject2.put("merchantId", "marrowmed");
            jSONObject2.put("clientId", "marrowmed");
            jSONObject2.put("environment", "production");
            jSONObject.put(SdkPayloadKt.KEY_JP_REQUEST_ID, UUID.randomUUID().toString());
            jSONObject.put("service", "in.juspay.hyperpay");
            jSONObject.put("payload", jSONObject2);
            return jSONObject;
        } catch (Exception e) {
            this.AudioAttributesImplBaseParcelizer.invoke(e);
            return jSONObject;
        }
    }

    private final JSONObject RemoteActionCompatParcelizer(readShort.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", audioAttributesCompatParcelizer.read());
            jSONObject2.put("amount", audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            jSONObject2.put("clientId", audioAttributesCompatParcelizer.write());
            jSONObject2.put("merchantId", audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
            jSONObject2.put("environment", audioAttributesCompatParcelizer.MediaDescriptionCompat());
            jSONObject2.put(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
            jSONObject2.put(PayloadKt.KEY_JP_CLIENT_AUTH_TOKEN_EXPIRY, audioAttributesCompatParcelizer.IconCompatParcelizer());
            jSONObject2.put(PayloadKt.KEY_JP_CUSTOMER_ID, audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver());
            jSONObject2.put(PayloadKt.KEY_JP_RETURN_URL, "www.marrow.com");
            jSONObject2.put(PayloadKt.KEY_JP_CURRENCY, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer());
            jSONObject2.put(PayloadKt.KEY_JP_CUSTOMER_PHONE, audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer());
            jSONObject2.put(PayloadKt.KEY_JP_CUSTOMER_EMAIL, audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
            jSONObject2.put("orderId", audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem());
            jSONObject2.put("description", audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer());
            jSONObject.put(SdkPayloadKt.KEY_JP_REQUEST_ID, audioAttributesCompatParcelizer.RatingCompat());
            jSONObject.put("service", audioAttributesCompatParcelizer.MediaMetadataCompat());
            jSONObject.put("payload", jSONObject2);
            return jSONObject;
        } catch (Exception e) {
            this.AudioAttributesImplBaseParcelizer.invoke(e);
            return jSONObject;
        }
    }

    public final boolean read() {
        if (this.read.isInitialised()) {
            return this.read.onBackPressed();
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/serializeToIntentExtra$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
