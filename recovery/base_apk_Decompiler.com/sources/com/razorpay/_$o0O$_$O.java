package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.razorpay.BaseCheckoutActivity;
import com.razorpay.CheckoutBridge;
import com.razorpay.CheckoutPresenterImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class _$o0O$_$O extends OO$_0o_ implements PluginCheckoutInteractor {
    private RzpPlugin extActiveRzpPluginInstance;
    private boolean isExtPluginFuncTriggered;
    private boolean isExtRzpPluginActive;
    private HashMap<String, String> pluginsMap;
    private final RzpInternalCallback rzpInternalCallback;

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void backPressed(Map map) {
        super.backPressed(map);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void callNativeIntent(String str, String str2) {
        super.callNativeIntent(str, str2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void checkSmsPermission() {
        super.checkSmsPermission();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void cleanUpOnDestroy() {
        super.cleanUpOnDestroy();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void destroyActivity(int i, String str) {
        super.destroyActivity(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void fetchCondfig() {
        super.fetchCondfig();
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public /* bridge */ /* synthetic */ void forwardEventToMerchant(String str) {
        super.forwardEventToMerchant(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ OoOo_ getCheckoutOptions() {
        return super.getCheckoutOptions();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void getDownloadFileString(String str, String str2, String str3) {
        super.getDownloadFileString(str, str2, str3);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ String getGPayFOPs(Double d) {
        return super.getGPayFOPs(d);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void getPdfString(String str, String str2) {
        super.getPdfString(str, str2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ String getProgressBarColor() {
        return super.getProgressBarColor();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ String getSdkPlugins() {
        return super.getSdkPlugins();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ List getWalletsWithAppToAppRedirection() {
        return super.getWalletsWithAppToAppRedirection();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void handleCardSaving() {
        super.handleCardSaving();
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public /* bridge */ /* synthetic */ void handleMerchantActivityResult(int i, Intent intent) {
        super.handleMerchantActivityResult(i, intent);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void invokePopup(String str) {
        super.invokePopup(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean isAllowRotation() {
        return super.isAllowRotation();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean isMagicPresent() {
        return super.isMagicPresent();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ boolean isUserRegistered(String str) {
        return super.isUserRegistered(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ boolean isUserRegisteredOnUPI(String str) {
        return super.isUserRegisteredOnUPI(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void isWebViewSafe(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        super.isWebViewSafe(i, webViewSafeCheckCallback);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void isWebViewSafeOnUI(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        super.isWebViewSafeOnUI(i, webViewSafeCheckCallback);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void loadFetchedForm(String str, String str2) {
        super.loadFetchedForm(str, str2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void loadForm(String str) {
        super.loadForm(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onCheckoutBackPress() {
        super.onCheckoutBackPress();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onCheckoutRendered() {
        super.onCheckoutRendered();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onComplete(String str) {
        super.onComplete(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onDismiss() {
        super.onDismiss();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onDismiss(String str) {
        super.onDismiss(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onError(String str) {
        super.onError(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onEvent(String str) {
        super.onEvent(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onFault(String str) {
        super.onFault(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onLoad() {
        super.onLoad();
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onPageFinished(int i, WebView webView, String str) {
        super.onPageFinished(i, webView, str);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onPageStarted(int i, WebView webView, String str) {
        super.onPageStarted(i, webView, str);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onProgressChanges(int i, int i2) {
        super.onProgressChanges(i, i2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onRequestAction(String str) {
        super.onRequestAction(str);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onResumeTriggered() {
        super.onResumeTriggered();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onSubmit(String str) {
        super.onSubmit(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void passPrefillToSegment() {
        super.passPrefillToSegment();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void redirectToNfcSettings() {
        super.redirectToNfcSettings();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void registerSmsListener() {
        super.registerSmsListener();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void relay(String str) {
        super.relay(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void requestExtraAnalyticsData() {
        super.requestExtraAnalyticsData();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void requestOtpPermission() {
        super.requestOtpPermission();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void saveInstanceState(Bundle bundle) {
        super.saveInstanceState(bundle);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void sendDataToWebView(int i, String str) {
        super.sendDataToWebView(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void sendOtpPermissionCallback(boolean z) {
        super.sendOtpPermissionCallback(z);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setAppToken(String str) {
        super.setAppToken(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setAttributes(String str) {
        super.setAttributes(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setCheckoutLoadStartAt() {
        super.setCheckoutLoadStartAt();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setDeviceToken(String str) {
        super.setDeviceToken(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setDimensions(int i, int i2) {
        super.setDimensions(i, i2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setEventCallback(EventCallback eventCallback) {
        super.setEventCallback(eventCallback);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setMerchantOptions(String str) {
        super.setMerchantOptions(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean setOptions(Bundle bundle, boolean z) {
        return super.setOptions(bundle, z);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setOptionsWithDynamicUrl(Context context, Bundle bundle, boolean z, BaseCheckoutActivity.SetOptionsCallback setOptionsCallback) {
        super.setOptionsWithDynamicUrl(context, bundle, z, setOptionsCallback);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setPaymentID(String str) {
        super.setPaymentID(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setSubscribedAnalyticsEvents(ArrayList arrayList) {
        super.setSubscribedAnalyticsEvents(arrayList);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setUpAddOn() {
        super.setUpAddOn();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void showAlertDialog(String str, String str2, String str3) {
        super.showAlertDialog(str, str2, str3);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void showLoaderDialog(int i, String str) {
        super.showLoaderDialog(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void showRetryDialog(int i, String str) {
        super.showRetryDialog(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void toast(String str, int i) {
        super.toast(str, i);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void triggerNfcCardScanner() {
        super.triggerNfcCardScanner();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void triggerPhoneNumberHintApi() {
        super.triggerPhoneNumberHintApi();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void unregisterNfcScanner() {
        super.unregisterNfcScanner();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void unregisterReceivers() {
        super.unregisterReceivers();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void unregisterSmsListener() {
        super.unregisterSmsListener();
    }

    public _$o0O$_$O(Activity activity, CheckoutPresenterImpl.CheckoutView checkoutView, HashMap<String, String> map) {
        super(activity, checkoutView, map);
        this.isExtRzpPluginActive = false;
        this.isExtPluginFuncTriggered = false;
        this.rzpInternalCallback = new RzpInternalCallback() { // from class: com.razorpay._$o0O$_$O.1
            /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: JSONException -> 0x0068, TryCatch #0 {JSONException -> 0x0068, blocks: (B:3:0x0002, B:5:0x000d, B:11:0x0026, B:24:0x004b, B:25:0x0055, B:14:0x0030, B:17:0x003a, B:26:0x005e), top: B:30:0x0002 }] */
            @Override // com.razorpay.RzpInternalCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onPaymentSuccess(java.lang.String r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = "provider"
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L68
                    r1.<init>(r7)     // Catch: org.json.JSONException -> L68
                    boolean r2 = r1.has(r0)     // Catch: org.json.JSONException -> L68
                    if (r2 == 0) goto L5e
                    java.lang.String r0 = r1.getString(r0)     // Catch: org.json.JSONException -> L68
                    int r2 = r0.hashCode()     // Catch: org.json.JSONException -> L68
                    r3 = -1307457359(0xffffffffb211c8b1, float:-8.485743E-9)
                    r4 = 1
                    r5 = 2
                    if (r2 == r3) goto L3a
                    r3 = -1048776318(0xffffffffc17cf182, float:-15.808962)
                    if (r2 == r3) goto L30
                    r3 = 1839316877(0x6da1bf8d, float:6.257332E27)
                    if (r2 != r3) goto L44
                    java.lang.String r2 = "UPI_TURBO"
                    boolean r0 = r0.equals(r2)     // Catch: org.json.JSONException -> L68
                    if (r0 == 0) goto L44
                    r0 = r4
                    goto L45
                L30:
                    java.lang.String r2 = "GOOGLE_PAY"
                    boolean r0 = r0.equals(r2)     // Catch: org.json.JSONException -> L68
                    if (r0 == 0) goto L44
                    r0 = 0
                    goto L45
                L3a:
                    java.lang.String r2 = "GPAY_IN_A_BOX"
                    boolean r0 = r0.equals(r2)     // Catch: org.json.JSONException -> L68
                    if (r0 == 0) goto L44
                    r0 = r5
                    goto L45
                L44:
                    r0 = -1
                L45:
                    if (r0 == 0) goto L55
                    if (r0 == r4) goto L55
                    if (r0 == r5) goto L55
                    com.razorpay._$o0O$_$O r6 = com.razorpay._$o0O$_$O.this     // Catch: org.json.JSONException -> L68
                    java.lang.String r0 = r1.toString()     // Catch: org.json.JSONException -> L68
                    r6.onComplete(r0)     // Catch: org.json.JSONException -> L68
                    goto L5e
                L55:
                    com.razorpay._$o0O$_$O r6 = com.razorpay._$o0O$_$O.this     // Catch: org.json.JSONException -> L68
                    java.lang.String r0 = r1.toString()     // Catch: org.json.JSONException -> L68
                    r6.sendExternalSdkResponse(r0)     // Catch: org.json.JSONException -> L68
                L5e:
                    com.razorpay.AnalyticsEvent r6 = com.razorpay.AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_SUCCESS     // Catch: org.json.JSONException -> L68
                    org.json.JSONObject r7 = com.razorpay.AnalyticsUtil.getJSONResponse(r7)     // Catch: org.json.JSONException -> L68
                    com.razorpay.AnalyticsUtil.trackEvent(r6, r7)     // Catch: org.json.JSONException -> L68
                    return
                L68:
                    com.razorpay.AnalyticsEvent r6 = com.razorpay.AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR
                    com.razorpay.AnalyticsUtil.trackEvent(r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.razorpay._$o0O$_$O.AnonymousClass1.onPaymentSuccess(java.lang.String):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
            @Override // com.razorpay.RzpInternalCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onPaymentError(int r6, java.lang.String r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "provider"
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    java.lang.String r2 = "response"
                    r1.put(r2, r7)
                    java.lang.String r2 = "code"
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r1.put(r2, r6)
                    com.razorpay.AnalyticsEvent r6 = com.razorpay.AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR
                    org.json.JSONObject r1 = com.razorpay.AnalyticsUtil.getJSONResponse(r1)
                    com.razorpay.AnalyticsUtil.trackEvent(r6, r1)
                    org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7b
                    r6.<init>(r7)     // Catch: java.lang.Exception -> L7b
                    boolean r1 = r6.has(r0)     // Catch: java.lang.Exception -> L7b
                    if (r1 == 0) goto L7a
                    java.lang.String r0 = r6.getString(r0)     // Catch: java.lang.Exception -> L7b
                    int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L7b
                    r2 = -1307457359(0xffffffffb211c8b1, float:-8.485743E-9)
                    r3 = 1
                    r4 = 2
                    if (r1 == r2) goto L56
                    r2 = -1048776318(0xffffffffc17cf182, float:-15.808962)
                    if (r1 == r2) goto L4c
                    r2 = 1839316877(0x6da1bf8d, float:6.257332E27)
                    if (r1 != r2) goto L60
                    java.lang.String r1 = "UPI_TURBO"
                    boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7b
                    if (r0 == 0) goto L60
                    r0 = r3
                    goto L61
                L4c:
                    java.lang.String r1 = "GOOGLE_PAY"
                    boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7b
                    if (r0 == 0) goto L60
                    r0 = 0
                    goto L61
                L56:
                    java.lang.String r1 = "GPAY_IN_A_BOX"
                    boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7b
                    if (r0 == 0) goto L60
                    r0 = r4
                    goto L61
                L60:
                    r0 = -1
                L61:
                    if (r0 == 0) goto L71
                    if (r0 == r3) goto L71
                    if (r0 == r4) goto L71
                    com.razorpay._$o0O$_$O r0 = com.razorpay._$o0O$_$O.this     // Catch: java.lang.Exception -> L7b
                    java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L7b
                    r0.onComplete(r6)     // Catch: java.lang.Exception -> L7b
                    return
                L71:
                    com.razorpay._$o0O$_$O r0 = com.razorpay._$o0O$_$O.this     // Catch: java.lang.Exception -> L7b
                    java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L7b
                    r0.sendExternalSdkResponse(r6)     // Catch: java.lang.Exception -> L7b
                L7a:
                    return
                L7b:
                    com.razorpay.AnalyticsEvent r6 = com.razorpay.AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR_EXCEPTION
                    com.razorpay.AnalyticsUtil.trackEvent(r6)
                    com.razorpay._$o0O$_$O r5 = com.razorpay._$o0O$_$O.this
                    r5.onComplete(r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.razorpay._$o0O$_$O.AnonymousClass1.onPaymentError(int, java.lang.String):void");
            }
        };
        this.pluginsMap = map;
    }

    @Override // com.razorpay.PluginCheckoutInteractor
    public void triggerExternalSdkFunc(String str) {
        HashMap<String, String> map = this.pluginsMap;
        if (map == null || map.size() == 0) {
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("provider");
            if (string.hashCode() == 1839316877 && string.equals("UPI_TURBO") && jSONObject.getString("action").equalsIgnoreCase("LINK_NEW_ACCOUNT")) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.TRIGGER_EXTERNAL_SDK_FUNC_LINK_CALLED);
                this.upiTurbo.linkNewUpiAccountCheckout(jSONObject.getJSONObject("data").optString(TtmlNode.ATTR_TTS_COLOR), jSONObject.getJSONObject("data").optString("amountInDisplayFormat"), new GenericPluginCallback() { // from class: com.razorpay._$o0O$_$O.2
                    @Override // com.razorpay.GenericPluginCallback
                    public void onSuccess(Object obj) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("payload", obj);
                            jSONObject.put("data", jSONObject2);
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }

                    @Override // com.razorpay.GenericPluginCallback
                    public void onError(JSONObject jSONObject2) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("error", jSONObject2);
                            jSONObject.put("data", jSONObject3);
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.razorpay.PluginCheckoutInteractor
    public void processPayment(String str) {
        RzpPlugin rzpPlugin;
        HashMap<String, String> map = this.pluginsMap;
        if (map == null || map.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map2 = new HashMap();
            map2.put("data", str);
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_CALLING_PROCESS_PAYMENT, AnalyticsUtil.getJSONResponse(map2));
            if (this.pluginsMap.containsKey("com.razorpay.plugin.googlepay_all") && this.pluginsMap.containsValue("com.razorpay.plugin.googlepay")) {
                this.pluginsMap.remove("com.razorpay.plugin.googlepay");
            }
            for (String str2 : this.pluginsMap.values()) {
                try {
                    rzpPlugin = (RzpPlugin) RzpPlugin.class.getClassLoader().loadClass(str2).newInstance();
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | JSONException e) {
                    AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
                }
                if (rzpPlugin.doesHandlePayload(this.merchantKey, jSONObject, this.activity)) {
                    this.isExtRzpPluginActive = true;
                    this.extActiveRzpPluginInstance = rzpPlugin;
                    if (str2.equalsIgnoreCase("com.razorpay.RazorpayTurbo")) {
                        JSONObject asJson = this.checkoutOptions.getAsJson();
                        asJson.put("apiResponse", jSONObject.getJSONObject("data").getJSONObject("apiResponse"));
                        asJson.put("upiAccount", jSONObject.getJSONObject("data").getJSONObject("upiAccount"));
                        asJson.put("apiPayload", jSONObject.getJSONObject("data").getJSONObject("apiPayload"));
                        rzpPlugin.processPayment(this.merchantKey, asJson, this.activity, this.rzpInternalCallback);
                        return;
                    }
                    rzpPlugin.processPayment(this.merchantKey, jSONObject, this.activity, this.rzpInternalCallback);
                    return;
                }
            }
        } catch (JSONException unused) {
            HashMap map3 = new HashMap();
            map3.put("data", str);
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_CALLING_PROCESS_PAYMENT_EXCEPTION, AnalyticsUtil.getJSONResponse(map3));
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void sendExternalSdkResponse(String str) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.SEND_EXTERNAL_SDK_RESPONSE);
        super.sendExternalSdkResponse(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    @Override // com.razorpay.CheckoutPresenterImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected org.json.JSONObject getOptionsForHandleMessage() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay._$o0O$_$O.getOptionsForHandleMessage():org.json.JSONObject");
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    protected void onError(JSONObject jSONObject) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_ON_ERROR_CALLED, jSONObject);
        if (this.isExtRzpPluginActive) {
            this.view.loadUrl(1, String.format("javascript: window.onComplete(%s)", jSONObject.toString()));
            this.isExtRzpPluginActive = false;
            return;
        }
        super.onError(jSONObject);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void onActivityResultReceived(int i, int i2, Intent intent) {
        if (this.isExtRzpPluginActive) {
            this.extActiveRzpPluginInstance.onActivityResult(this.merchantKey, i, i2, intent);
        } else {
            super.onActivityResultReceived(i, i2, intent);
        }
    }
}
