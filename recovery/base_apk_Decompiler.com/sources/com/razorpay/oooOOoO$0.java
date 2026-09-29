package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import in.juspay.hypersdk.core.PaymentConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class oooOOoO$0 implements SmsAgentInterface {
    String lastSms;
    C$$O_$ magicData;
    String merchantKey;
    SmsAgent smsAgent;
    WebView webView;
    boolean hasOtpPermission = false;
    boolean isMagicEnabled = false;
    boolean jsInsertedInCurrentPage = false;
    Context context = this.context;
    Context context = this.context;

    public void onProgressChanged(int i) {
    }

    oooOOoO$0(Activity activity, WebView webView) {
        this.webView = webView;
        SmsAgent smsAgentInstance = SmsAgent.getSmsAgentInstance();
        this.smsAgent = smsAgentInstance;
        smsAgentInstance.registerForCallbacks(this);
        C$$O_$ c$$o_$ = new C$$O_$(activity);
        this.magicData = c$$o_$;
        c$$o_$.checkForUpdates();
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.jsInsertedInCurrentPage) {
            return;
        }
        try {
            JSONObject magicSettings = _Oo_O_$.getInstance().getMagicSettings();
            magicSettings.put("merchant_key", this.merchantKey);
            magicSettings.put("otp_permission", this.hasOtpPermission);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", _Oo_O_$.SDK_TYPE);
            jSONObject.put("version_code", _Oo_O_$.SDK_VERSION_CODE);
            magicSettings.put(PaymentConstants.Category.SDK, jSONObject);
            StringBuilder sb = new StringBuilder("window.__rzp_options = ");
            sb.append(magicSettings.toString());
            O$$$__o0Oo(sb.toString());
        } catch (Exception e) {
            Logger.e("Unable to load magic settings", e);
        }
        O$$$__o0Oo(this.magicData.getMagicJs());
        String str2 = this.lastSms;
        if (str2 != null) {
            O$$$__o0Oo(String.format("Magic.elfBridge.setSms(%s)", str2));
            this.lastSms = null;
        }
        this.jsInsertedInCurrentPage = true;
    }

    public void onPageStarted(WebView webView, String str) {
        this.jsInsertedInCurrentPage = false;
    }

    public void paymentFlowEnd() {
        this.smsAgent.deregisterForCallbacks(this);
        this.smsAgent.removeSMSBroadcastReceiver((Activity) this.context);
    }

    private void O$$$__o0Oo(String str) {
        this.webView.loadUrl(String.format("javascript: %s", str));
    }

    @Override // com.razorpay.SmsAgentInterface
    public void postSms(String str, String str2) {
        if (this.isMagicEnabled) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sender", str);
                jSONObject.put("message", str2);
                this.lastSms = jSONObject.toString();
                O$$$__o0Oo(String.format("Magic.elfBridge.setSms(%s)", jSONObject.toString()));
            } catch (Exception e) {
                Logger.e("Exception", e);
            }
        }
    }

    void setMagicEnabled(boolean z) {
        this.isMagicEnabled = z;
    }

    @Override // com.razorpay.SmsAgentInterface
    public void setSmsPermission(boolean z) {
        this.hasOtpPermission = z;
    }
}
