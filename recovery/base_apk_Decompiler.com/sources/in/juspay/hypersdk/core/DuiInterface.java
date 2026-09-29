package in.juspay.hypersdk.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieSyncManager;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.marrow.data.api.models.response.ApiResponse;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.ResultAwaitingDuiHook;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersmshandler.JuspayDuiHook;
import in.juspay.hypersmshandler.OnResultHook;
import in.juspay.hypersmshandler.SmsEventInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.ThemeAlphaConstantsKt;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DuiInterface extends HyperJsInterface implements CallbackInvoker {
    private static final String LOG_TAG = "DuiInterface";
    protected Activity activity;
    protected Map<String, String> callBackMapper;
    protected ViewGroup container;
    private final Context context;
    private Godel godelManager;
    private int lastFocusedEditView;
    protected Map<String, Object> listenerMap;
    private final ArrayList<Integer> merchantViewIds;
    private final RemoteAssetService remoteAssetService;
    private final SdkTracker sdkTracker;
    protected final SessionInfo sessionInfo;

    /* JADX INFO: renamed from: in.juspay.hypersdk.core.DuiInterface$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents;

        static {
            int[] iArr = new int[SmsEventInterface.RetrieverEvents.values().length];
            $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents = iArr;
            try {
                iArr[SmsEventInterface.RetrieverEvents.ON_ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents[SmsEventInterface.RetrieverEvents.ON_EXECUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents[SmsEventInterface.RetrieverEvents.ON_RECEIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public DuiInterface(JuspayServices juspayServices) {
        super(juspayServices);
        this.merchantViewIds = new ArrayList<>();
        this.lastFocusedEditView = -1;
        this.context = juspayServices.getContext();
        this.sdkTracker = juspayServices.getSdkTracker();
        this.sessionInfo = juspayServices.getSessionInfo();
        this.remoteAssetService = juspayServices.getRemoteAssetService();
        this.listenerMap = new HashMap();
        this.callBackMapper = new HashMap();
    }

    static /* synthetic */ void lambda$loadUrl$6(String str, JuspayWebView juspayWebView, String str2) {
        if (str != null) {
            juspayWebView.postUrl(str2, str.getBytes());
        } else {
            juspayWebView.loadUrl(str2);
        }
    }

    private void trackWebViewEvent(String str) {
        this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", str, "message", "Received event from web view.");
    }

    @JavascriptInterface
    public void addDataToSharedPrefs(String str, String str2) {
        this.workspace.writeToSharedPreference(str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attach(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.DuiInterface.attach(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public void attachMerchantView(final int i, final String str) {
        if (this.juspayServices.getHyperCallback() != null) {
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DuiInterface$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m295lambda$attachMerchantView$1$injuspayhypersdkcoreDuiInterface(i, str);
                }
            });
        }
    }

    @Override // in.juspay.hypersdk.core.HyperJsInterface
    @JavascriptInterface
    public String checkPermission(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : strArr) {
                jSONObject.put(str.replace("android.permission.", ""), Utils.checkIfGranted(this.juspayServices, str));
            }
        } catch (JSONException e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.READ_SMS_PERMISSION, "Error while inserting in json", e);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String checkReadSMSPermission() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("android.permission.READ_SMS".replace("android.permission.", ""), Utils.checkIfGranted(this.juspayServices, "android.permission.READ_SMS"));
            jSONObject.put("android.permission.RECEIVE_SMS".replace("android.permission.", ""), Utils.checkIfGranted(this.juspayServices, "android.permission.RECEIVE_SMS"));
        } catch (JSONException e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.READ_SMS_PERMISSION, "Error while inserting in json", e);
        }
        return jSONObject.toString();
    }

    public void clearMerchantViews(final Activity activity) {
        if (activity == null) {
            return;
        }
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DuiInterface$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m296lambda$clearMerchantViews$0$injuspayhypersdkcoreDuiInterface(activity);
            }
        });
    }

    @JavascriptInterface
    public void closeBrowser(String str) {
        reset();
    }

    @JavascriptInterface
    public void detach(String[] strArr) {
        JuspayDuiHook juspayDuiHook;
        for (String str : strArr) {
            if (this.listenerMap.containsKey(str) && this.activity != null) {
                if ((this.listenerMap.get(str) instanceof JuspayDuiHook) && (juspayDuiHook = (JuspayDuiHook) this.listenerMap.get(str)) != null) {
                    juspayDuiHook.detach(this.activity);
                }
                this.listenerMap.remove(str);
            }
        }
    }

    @JavascriptInterface
    public void doHandShake(String str, String str2) {
        try {
            SdkTracker sdkTracker = this.sdkTracker;
            StringBuilder sb = new StringBuilder("Doing handshake with following parameters: ");
            sb.append(str);
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, "dui_interface_do_handshake", sb.toString());
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("packageName");
            String string2 = jSONObject.getString("className");
            int i = jSONObject.getInt("code");
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("payload"));
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject2.getString(next));
            }
            MPINUtil.communicate(string, string2, i, bundle, this.juspayServices, str2);
        } catch (Exception e) {
            MPINUtil.reportBindFailure(-1, this.juspayServices, str2);
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception at doHandShake", e);
        }
    }

    @JavascriptInterface
    public void enableWebViewRecreate(String str) {
        this.juspayServices.getDynamicUI().setWebViewRecreate(str.equals("true"));
    }

    @JavascriptInterface
    public String execute(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject(str3);
            if (!this.listenerMap.containsKey(str) || this.activity == null) {
                return "";
            }
            JuspayDuiHook juspayDuiHook = (JuspayDuiHook) this.listenerMap.get(str);
            if (juspayDuiHook == null) {
                return "__failed";
            }
            if (PaymentConstants.SMS_RETRIEVER.equals(str)) {
                if ("getOtp".equals(str2)) {
                    Map<String, String> map = this.callBackMapper;
                    StringBuilder sb = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                    sb.append(SmsEventInterface.RetrieverEvents.ON_RECEIVE);
                    map.put(sb.toString(), str4);
                } else if ("cancel".equals(str2)) {
                    Map<String, String> map2 = this.callBackMapper;
                    StringBuilder sb2 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                    sb2.append(SmsEventInterface.RetrieverEvents.ON_RECEIVE);
                    map2.put(sb2.toString(), null);
                }
            }
            return juspayDuiHook.execute(this.activity, str2, jSONObject);
        } catch (JSONException e) {
            SdkTracker sdkTracker = this.sdkTracker;
            StringBuilder sb3 = new StringBuilder("Error while executing ");
            sb3.append(str2);
            sb3.append(" with args ");
            sb3.append(str3);
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, sb3.toString(), e);
            return "";
        }
    }

    @JavascriptInterface
    public String fetchFromInbox(String str) {
        return this.juspayServices.getSmsServices().fetchSms(str, "inbox", null);
    }

    @JavascriptInterface
    public void fetchSMS(String str, String str2, String str3, String str4) {
        invokeCallbackInDUIWebview(str4, this.juspayServices.getSmsServices().fetchSms(str, str2, str3));
    }

    @JavascriptInterface
    public String findViewType(String str) {
        Activity activity;
        try {
            View viewFindViewById = this.juspayServices.getContainer() != null ? this.juspayServices.getContainer().findViewById(Integer.parseInt(str)) : null;
            if (viewFindViewById == null && (activity = this.activity) != null) {
                viewFindViewById = activity.findViewById(Integer.parseInt(str));
            }
            return viewFindViewById != null ? viewFindViewById.getClass().getName() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    @JavascriptInterface
    public String getActivityData(String str) {
        return this.juspayServices.getDynamicUI().getActivityData(str);
    }

    @JavascriptInterface
    public String getClipboardItems() {
        return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @JavascriptInterface
    public String getConfigVariables() {
        try {
            return PaymentUtils.getConfigVariableDeclarations(this.juspayServices.getContext(), this.juspayServices.getSessionInfo(), this.juspayServices.getTenant());
        } catch (JSONException e) {
            JuspayLogger.e(LOG_TAG, "", e);
            return "var clientId = null;var juspayDeviceId = null;var juspayAndroidId = null;var godelRemotesVersion = null;var godelVersion = null;var buildVersion = null;var os_version = null;";
        }
    }

    @JavascriptInterface
    public String getDataFromSharedPrefs(String str, String str2) {
        return this.workspace.getFromSharedPreference(str, str2);
    }

    @JavascriptInterface
    public String getIndexBundleHash(String str) {
        String strReplace = str.replace(".zip", ".jsa");
        try {
            return this.remoteAssetService.getMetadata(strReplace.substring(strReplace.lastIndexOf("/") + 1).replace(".zip", ".jsa")).getString(PaymentConstants.ATTR_HASH_IN_DISK);
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "exception during IndexBundleHash", e);
            return null;
        }
    }

    @JavascriptInterface
    public String getKeysInSharedPrefs() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = this.workspace.getKeysInSharedPreference().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray.toString();
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.SHARED_PREF, "Exception while getting all keys from shared prefs", e);
            return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    @JavascriptInterface
    public String getNetworkType() {
        return this.sessionInfo.getNetworkInfo();
    }

    @JavascriptInterface
    public String getPackageInfo(String str) {
        try {
            PackageInfo packageInfo = this.juspayServices.getContext().getPackageManager().getPackageInfo(str, 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", packageInfo.packageName);
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", packageInfo.versionCode);
            return jSONObject.toString();
        } catch (Exception e) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, Labels.System.JBRIDGE, "Exception at getPackageInfo", e);
            return "{}";
        }
    }

    @JavascriptInterface
    public String getPaymentDetails() {
        return this.juspayServices.getPaymentSessionInfo().getPaymentDetails().toString();
    }

    @JavascriptInterface
    public float getPixels() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    @JavascriptInterface
    public int getResourceIdentifier(String str, String str2) {
        try {
            return this.context.getResources().getIdentifier(str, str2, this.context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    @JavascriptInterface
    public String getSessionAttribute(String str) {
        return getSessionAttribute(str, "");
    }

    @JavascriptInterface
    public String getSessionDetails() {
        return this.juspayServices.getPaymentSessionInfo().getSessionDetails().toString();
    }

    @Override // in.juspay.hypersdk.core.JsInterface
    @JavascriptInterface
    public String getSessionInfo() {
        this.juspayServices.getPaymentSessionInfo().createSessionDataMap();
        return this.sessionInfo.getSessionData().toString();
    }

    SmsEventInterface getSmsEventInterface() {
        return new SmsEventInterface() { // from class: in.juspay.hypersdk.core.DuiInterface.1
            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onActivityResultEvent(String str) {
                DuiInterface duiInterface = DuiInterface.this;
                duiInterface.invokeCallbackInDUIWebview(duiInterface.callBackMapper.get(PaymentConstants.SMS_CONSENT), str);
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onSentReceiverEvent(int i) {
                String string;
                if (DuiInterface.this.callBackMapper.get(PaymentConstants.SEND_SMS) != null) {
                    StringBuilder sb = new StringBuilder("window.callUICallback(\"");
                    sb.append(DuiInterface.this.callBackMapper.get(PaymentConstants.SEND_SMS));
                    String string2 = sb.toString();
                    if (i == -1) {
                        Toast.makeText(DuiInterface.this.context, "SMS SENT", 0).show();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(string2);
                        sb2.append("\", \"SUCCESS\")");
                        string = sb2.toString();
                    } else if (i == 1) {
                        Toast.makeText(DuiInterface.this.context, "SMS GENERIC FAILURE", 0).show();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(string2);
                        sb3.append("\", \"Generic failure\", \"837\")");
                        string = sb3.toString();
                    } else if (i == 2) {
                        Toast.makeText(DuiInterface.this.context, "SMS RADIO OFF", 0).show();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(string2);
                        sb4.append("\", \"Radio off\", \"840\")");
                        string = sb4.toString();
                    } else if (i == 3) {
                        Toast.makeText(DuiInterface.this.context, "SMS NULL PDU", 0).show();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(string2);
                        sb5.append("\", \"Null PDU\", \"839\")");
                        string = sb5.toString();
                    } else if (i != 4) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(string2);
                        sb6.append("\", \"Unable to Send SMS\", \"837\")");
                        string = sb6.toString();
                    } else {
                        Toast.makeText(DuiInterface.this.context, "SMS NO SERVICE", 0).show();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(string2);
                        sb7.append("\", \"No service\", \"838\")");
                        string = sb7.toString();
                    }
                    DuiInterface.this.invokeFnInDUIWebview(string);
                }
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onSmsConsentEvent(Intent intent, int i, Bundle bundle) {
                DuiInterface.this.juspayServices.startActivityForResult(intent, i, bundle);
                DuiInterface.this.invokeFnInDUIWebview("onSMSConsentShown", "{ }");
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onSmsReceiverEvent(String str) {
                DuiInterface duiInterface = DuiInterface.this;
                duiInterface.invokeCallbackInDUIWebview(duiInterface.callBackMapper.get(PaymentConstants.SMS_RECEIVE), str);
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents retrieverEvents, String str) {
                int i = AnonymousClass3.$SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents[retrieverEvents.ordinal()];
                if (i == 1) {
                    DuiInterface duiInterface = DuiInterface.this;
                    Map<String, String> map = duiInterface.callBackMapper;
                    StringBuilder sb = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                    sb.append(SmsEventInterface.RetrieverEvents.ON_ATTACH);
                    duiInterface.invokeCallbackInDUIWebview(map.get(sb.toString()), str);
                    return;
                }
                if (i == 2) {
                    DuiInterface duiInterface2 = DuiInterface.this;
                    Map<String, String> map2 = duiInterface2.callBackMapper;
                    StringBuilder sb2 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                    sb2.append(SmsEventInterface.RetrieverEvents.ON_RECEIVE);
                    duiInterface2.invokeCallbackInDUIWebview(map2.get(sb2.toString()), str);
                    return;
                }
                if (i == 3) {
                    DuiInterface duiInterface3 = DuiInterface.this;
                    Map<String, String> map3 = duiInterface3.callBackMapper;
                    StringBuilder sb3 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                    SmsEventInterface.RetrieverEvents retrieverEvents2 = SmsEventInterface.RetrieverEvents.ON_RECEIVE;
                    sb3.append(retrieverEvents2);
                    duiInterface3.invokeCallbackInDUIWebview(map3.get(sb3.toString()), str);
                    if ("TIMEOUT".equals(str)) {
                        return;
                    }
                    DuiInterface.this.callBackMapper.put(PaymentConstants.SMS_RETRIEVER.concat(String.valueOf(retrieverEvents2)), null);
                }
            }
        };
    }

    @JavascriptInterface
    public void invokeCallbackInACSWebview(String str, String str2) {
        if (this.godelManager == null) {
            return;
        }
        this.godelManager.getJuspayWebView().addJsToWebView(String.format("window.__PROXY_FN['%s'](atob('%s'))", str, Base64.encodeToString(str2.getBytes(), 2)));
    }

    @Override // in.juspay.hyper.core.CallbackInvoker
    @JavascriptInterface
    public void invokeCallbackInDUIWebview(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            str2 = "null";
        }
        this.juspayServices.getDynamicUI().addJsToWebView(String.format("window.callUICallback('%s',atob('%s'));", str, Base64.encodeToString(str2.getBytes(), 2)));
    }

    @JavascriptInterface
    public void invokeCustomFnInDUIWebview(String str) {
        this.juspayServices.getDynamicUI().addJsToWebView(str);
    }

    @JavascriptInterface
    public void invokeFnInDUIWebview(String str, String str2, String str3) {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.getAcsInterface().invoke(str, str2, str3);
        }
    }

    @JavascriptInterface
    public void invokeInACSWebview(String str, String str2, String str3) {
        if (this.godelManager == null) {
            return;
        }
        this.godelManager.getJuspayWebView().addJsToWebView(String.format("javascript:window.onAcsFunctionCalled('%s',atob('%s'),'%s')", str, Base64.encodeToString(str2.getBytes(), 2), str3));
    }

    @JavascriptInterface
    public String isAppInstalled(String str) {
        try {
            this.juspayServices.getContext().getPackageManager().getPackageInfo(str, 128);
            return "true";
        } catch (PackageManager.NameNotFoundException unused) {
            return "false";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isHookSupported(java.lang.String r7) {
        /*
            r6 = this;
            r7.hashCode()
            r7.hashCode()
            int r6 = r7.hashCode()
            r0 = 0
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r6) {
                case -1102737597: goto L46;
                case -1031869708: goto L3c;
                case -901079619: goto L32;
                case -74735600: goto L28;
                case 1205336831: goto L1e;
                case 2031367170: goto L14;
                default: goto L13;
            }
        L13:
            goto L50
        L14:
            java.lang.String r6 = "SEND_SMS"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L50
            r6 = r1
            goto L51
        L1e:
            java.lang.String r6 = "DELIVER_SMS"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L50
            r6 = r2
            goto L51
        L28:
            java.lang.String r6 = "SMS_RETRIEVER"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L50
            r6 = r3
            goto L51
        L32:
            java.lang.String r6 = "SMS_RECEIVE"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L50
            r6 = r4
            goto L51
        L3c:
            java.lang.String r6 = "SMS_CONSENT"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L50
            r6 = r5
            goto L51
        L46:
            java.lang.String r6 = "NETWORK_STATUS"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L50
            r6 = r0
            goto L51
        L50:
            r6 = -1
        L51:
            if (r6 == 0) goto L5e
            if (r6 == r5) goto L5e
            if (r6 == r4) goto L5e
            if (r6 == r3) goto L5e
            if (r6 == r2) goto L5e
            if (r6 == r1) goto L5e
            return r0
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.DuiInterface.isHookSupported(java.lang.String):boolean");
    }

    @JavascriptInterface
    public boolean isOnline() {
        NetworkInfo activeNetworkInfo;
        Activity activity = this.activity;
        ConnectivityManager connectivityManager = activity != null ? (ConnectivityManager) activity.getSystemService("connectivity") : null;
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* JADX INFO: renamed from: lambda$attachMerchantView$1$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /* synthetic */ void m295lambda$attachMerchantView$1$injuspayhypersdkcoreDuiInterface(int i, String str) {
        ViewGroup viewGroup;
        try {
            Activity activity = this.activity;
            ViewGroup viewGroup2 = activity != null ? (ViewGroup) activity.findViewById(i) : null;
            if (viewGroup2 == null && (viewGroup = this.container) != null) {
                viewGroup2 = (ViewGroup) viewGroup.findViewById(i);
            }
            HyperPaymentsCallback hyperCallback = this.juspayServices.getHyperCallback();
            if (viewGroup2 == null || hyperCallback == null) {
                return;
            }
            this.merchantViewIds.add(Integer.valueOf(i));
            View merchantView = hyperCallback.getMerchantView(viewGroup2, MerchantViewType.valueOf(str));
            if (merchantView != null) {
                viewGroup2.addView(merchantView);
            }
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while attaching merchant view", e);
        }
    }

    /* JADX INFO: renamed from: lambda$clearMerchantViews$0$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /* synthetic */ void m296lambda$clearMerchantViews$0$injuspayhypersdkcoreDuiInterface(Activity activity) {
        Iterator<Integer> it = this.merchantViewIds.iterator();
        while (it.hasNext()) {
            View viewFindViewById = activity.findViewById(it.next().intValue());
            if (viewFindViewById instanceof ViewGroup) {
                ((ViewGroup) viewFindViewById).removeAllViews();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$onDuiReady$2$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /* synthetic */ void m297lambda$onDuiReady$2$injuspayhypersdkcoreDuiInterface() {
        if (this.godelManager != null) {
            return;
        }
        Godel godel = new Godel(this.juspayServices);
        this.godelManager = godel;
        godel.setupAllowedDeeplinkPackages();
        this.godelManager.onDuiReady();
    }

    /* JADX INFO: renamed from: lambda$requestKeyboardHide$9$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /* synthetic */ void m298lambda$requestKeyboardHide$9$injuspayhypersdkcoreDuiInterface() {
        try {
            Activity activity = this.activity;
            if (activity != null) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus == null) {
                    currentFocus = this.activity.getWindow().getDecorView();
                }
                InputMethodManager inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method");
                if (inputMethodManager == null || currentFocus.getRootView() == null) {
                    this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.KEYBOARD, "hidden", ApiResponse.STATUS_FAILURE);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getRootView().getWindowToken(), 0);
                    this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.KEYBOARD, "hidden", "success");
                }
            }
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.KEYBOARD, "Hide Keyboard Exception", e);
        }
    }

    /* JADX INFO: renamed from: lambda$requestKeyboardShow$7$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /* synthetic */ void m299lambda$requestKeyboardShow$7$injuspayhypersdkcoreDuiInterface(String str) {
        try {
            if (this.activity != null) {
                int i = Integer.parseInt(str);
                InputMethodManager inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method");
                View viewFindViewById = this.activity.findViewById(i);
                int i2 = this.lastFocusedEditView;
                View viewFindViewById2 = i2 != -1 ? this.activity.findViewById(i2) : null;
                if (inputMethodManager != null && viewFindViewById != null) {
                    if (viewFindViewById2 != null && this.lastFocusedEditView != i) {
                        viewFindViewById2.clearFocus();
                    }
                    viewFindViewById.requestFocus();
                    inputMethodManager.showSoftInput(viewFindViewById, 1);
                }
                if (i != this.lastFocusedEditView) {
                    this.lastFocusedEditView = Integer.parseInt(str);
                }
            }
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.KEYBOARD, "Show Keyboard Exception", e);
        }
    }

    /* JADX INFO: renamed from: lambda$runInJuspayBrowser$3$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /* synthetic */ void m300lambda$runInJuspayBrowser$3$injuspayhypersdkcoreDuiInterface(String str, SdkTracker sdkTracker) {
        Activity activity = this.activity;
        if (activity != null) {
            try {
                View viewFindViewById = activity.findViewById(Integer.parseInt(str));
                if (this.juspayServices.getHyperCallback() != null) {
                    this.juspayServices.getHyperCallback().onStartWaitingDialogCreated(viewFindViewById);
                }
            } catch (Exception e) {
                sdkTracker.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception while trying to find a view", e);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$runInJuspayBrowser$4$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /* synthetic */ void m301lambda$runInJuspayBrowser$4$injuspayhypersdkcoreDuiInterface(String str, final String str2, final SdkTracker sdkTracker) {
        try {
            if (this.juspayServices.getHyperCallback() != null) {
                this.juspayServices.getHyperCallback().onEvent(new JSONObject(str), new JuspayResponseHandler() { // from class: in.juspay.hypersdk.core.DuiInterface.2
                    @Override // in.juspay.hypersdk.data.JuspayResponseHandler
                    public void onError(String str3) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("status", "onError");
                            try {
                                jSONObject.put("payload", new JSONObject(str3));
                            } catch (Exception unused) {
                                jSONObject.put("payload", str3);
                            }
                            DuiInterface.this.invokeCallbackInDUIWebview(str2, jSONObject.toString());
                        } catch (Exception e) {
                            sdkTracker.trackAndLogException(DuiInterface.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception while manipulating JSON", e);
                        }
                    }

                    @Override // in.juspay.hypersdk.data.JuspayResponseHandler
                    public void onResponse(String str3) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("status", "onResponse");
                            try {
                                jSONObject.put("payload", new JSONObject(str3));
                            } catch (Exception unused) {
                                jSONObject.put("payload", str3);
                            }
                            DuiInterface.this.invokeCallbackInDUIWebview(str2, jSONObject.toString());
                        } catch (Exception e) {
                            sdkTracker.trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception while manipulating JSON", e);
                        }
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }

                    @Override // in.juspay.hypersdk.data.JuspayResponseHandler
                    public void onResponse(Bundle bundle) {
                        onResponse(Utils.toJSON(bundle).toString());
                    }
                });
            }
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception in onEvent handler", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX INFO: renamed from: lambda$runInJuspayWebView$5$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    /* synthetic */ void m302lambda$runInJuspayWebView$5$injuspayhypersdkcoreDuiInterface(java.lang.String r7, in.juspay.hypersdk.safe.JuspayWebView r8) {
        /*
            r6 = this;
            r7.hashCode()
            r7.hashCode()
            int r0 = r7.hashCode()
            switch(r0) {
                case -2056769213: goto L4a;
                case -1576267742: goto L40;
                case -1326530834: goto L36;
                case -1241591313: goto L2c;
                case -934641255: goto L22;
                case -318289731: goto L18;
                case 1275285273: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L54
        Le:
            java.lang.String r0 = "loadFirstPage"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L54
            r0 = 6
            goto L55
        L18:
            java.lang.String r0 = "goForward"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L54
            r0 = 5
            goto L55
        L22:
            java.lang.String r0 = "reload"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L54
            r0 = 4
            goto L55
        L2c:
            java.lang.String r0 = "goBack"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L54
            r0 = 3
            goto L55
        L36:
            java.lang.String r0 = "requestPasswordKeyboardShow"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L54
            r0 = 2
            goto L55
        L40:
            java.lang.String r0 = "requestNumericKeyboardShow"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L54
            r0 = 1
            goto L55
        L4a:
            java.lang.String r0 = "requestPhoneKeyboardShow"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L54
            r0 = 0
            goto L55
        L54:
            r0 = -1
        L55:
            switch(r0) {
                case 0: goto L87;
                case 1: goto L83;
                case 2: goto L7f;
                case 3: goto L7b;
                case 4: goto L77;
                case 5: goto L73;
                case 6: goto L6b;
                default: goto L58;
            }
        L58:
            in.juspay.hypersdk.core.JuspayServices r6 = r6.juspayServices
            in.juspay.hypersdk.core.SdkTracker r0 = r6.getSdkTracker()
            java.lang.String r1 = "system"
            java.lang.String r2 = "error"
            java.lang.String r3 = "run_in_juspay_webview"
            java.lang.String r4 = "missing"
            r5 = r7
            r0.trackAction(r1, r2, r3, r4, r5)
            return
        L6b:
            in.juspay.hypersdk.safe.Godel r6 = r6.godelManager
            if (r6 == 0) goto L72
            r6.loadPage()
        L72:
            return
        L73:
            r8.goForward()
            return
        L77:
            in.juspay.hypersdk.core.PaymentUtils.refreshPage(r8)
            return
        L7b:
            r8.goBack()
            return
        L7f:
            r8.requestPasswordKeyboardShow()
            return
        L83:
            r8.requestNumericKeyboardShow()
            return
        L87:
            r8.requestPhoneKeyboardShow()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.DuiInterface.m302lambda$runInJuspayWebView$5$injuspayhypersdkcoreDuiInterface(java.lang.String, in.juspay.hypersdk.safe.JuspayWebView):void");
    }

    /* JADX INFO: renamed from: lambda$suppressKeyboard$8$in-juspay-hypersdk-core-DuiInterface, reason: not valid java name */
    /* synthetic */ void m303lambda$suppressKeyboard$8$injuspayhypersdkcoreDuiInterface() {
        Activity activity = this.activity;
        if (activity != null) {
            activity.getWindow().setSoftInputMode(3);
        }
    }

    @JavascriptInterface
    public void loadUrl(final String str, final String str2) {
        Godel godel = this.godelManager;
        if (godel == null || str == null) {
            return;
        }
        final JuspayWebView juspayWebView = godel.getJuspayWebView();
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DuiInterface$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                DuiInterface.lambda$loadUrl$6(str2, juspayWebView, str);
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        for (Object obj : this.listenerMap.values()) {
            if ((obj instanceof ResultAwaitingDuiHook) && ((ResultAwaitingDuiHook) obj).onActivityResult(i, i2, intent)) {
                SdkTracker sdkTracker = this.sdkTracker;
                StringBuilder sb = new StringBuilder("Result consumed by ResultAwaitingDuiHook ");
                sb.append(obj.getClass().getName());
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, Labels.Android.ON_ACTIVITY_RESULT, sb.toString());
                return;
            }
            if ((obj instanceof OnResultHook) && ((OnResultHook) obj).onActivityResult(i, i2, intent)) {
                SdkTracker sdkTracker2 = this.sdkTracker;
                StringBuilder sb2 = new StringBuilder("Result consumed by OnResultHook ");
                sb2.append(obj.getClass().getName());
                sdkTracker2.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, Labels.Android.ON_ACTIVITY_RESULT, sb2.toString());
                return;
            }
        }
        if (intent == null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, Labels.Android.ON_ACTIVITY_RESULT, "Got empty data in onActivityResult. Passing callback to micro-app.");
            StringBuilder sb3 = new StringBuilder("window.onActivityResult('");
            sb3.append(i);
            sb3.append("', '");
            sb3.append(i2);
            sb3.append("', '{}')");
            invokeFnInDUIWebview(sb3.toString());
            return;
        }
        JSONObject json = Utils.toJSON(intent.getExtras());
        String strEncodeToString = Base64.encodeToString(json.toString().getBytes(), 2);
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, Labels.Android.ON_ACTIVITY_RESULT, "Passing data to micro-app. Data is ".concat(String.valueOf(json)));
        StringBuilder sb4 = new StringBuilder("window.onActivityResult('");
        sb4.append(i);
        sb4.append("', '");
        sb4.append(i2);
        sb4.append("', atob('");
        sb4.append(strEncodeToString);
        sb4.append("'))");
        invokeFnInDUIWebview(sb4.toString());
    }

    @JavascriptInterface
    public void onDuiReady() {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DuiInterface$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m297lambda$onDuiReady$2$injuspayhypersdkcoreDuiInterface();
            }
        });
    }

    @Override // in.juspay.hypersdk.core.HyperJsInterface
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            Map<String, Object> map = this.listenerMap;
            StringBuilder sb = new StringBuilder("ReqPermi");
            sb.append(i);
            Object obj = map.get(sb.toString());
            if (obj instanceof String) {
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    jSONObject.put(strArr[i2].replace("android.permission.", ""), iArr[i2] == 0);
                }
                invokeCallbackInDUIWebview((String) obj, jSONObject.toString());
                return;
            }
            if (obj instanceof Handler.Callback) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = iArr;
                ((Handler.Callback) obj).handleMessage(messageObtain);
            } else {
                JuspayLogger.e(LOG_TAG, "callback instance not understandable");
                SdkTracker sdkTracker = this.sdkTracker;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(" : onRequestPermissionsResult callback instance not understandable");
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ON_REQUEST_PERMISSION_RESULT, sb2.toString(), JSONObject.NULL);
            }
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.ON_REQUEST_PERMISSION_RESULT, "Error while inserting in json", e);
        }
    }

    @JavascriptInterface
    public void onWebViewReady(String str, String str2, String str3, String str4) {
        if (!str4.equalsIgnoreCase("base64")) {
            Godel godel = this.godelManager;
            if (godel != null) {
                godel.onBrowserReady(this.activity, str2, str3, "text/html", CharsetNames.UTF_8, null, str);
                return;
            }
            return;
        }
        try {
            byte[] bArrDecode = Base64.decode(str3, 2);
            Godel godel2 = this.godelManager;
            if (godel2 != null) {
                godel2.onBrowserReady(this.activity, str2, new String(bArrDecode), "text/html", CharsetNames.UTF_8, null, str);
            }
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.ON_WEBVIEW_READY, "Exception while trying to decode content", e);
        }
    }

    @JavascriptInterface
    public void onWebViewReleased() {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.onDuiReleased();
            this.godelManager = null;
        }
    }

    @JavascriptInterface
    public void openAppWithExplicitIntent(String str, String str2, String str3, int i, int i2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("data", str3);
            Intent intent = new Intent();
            if (i2 >= 0) {
                intent.setFlags(i2);
            }
            intent.putExtras(bundle);
            intent.setComponent(new ComponentName(str, str2));
            this.juspayServices.startActivityForResult(intent, Math.max(i, -1), null);
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "on method openAppWithExplicitIntent: ", e);
        }
    }

    @JavascriptInterface
    public void refreshPage() {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        PaymentUtils.refreshPage(godel.getJuspayWebView());
    }

    @JavascriptInterface
    public void requestKeyboardHide() {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DuiInterface$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m298lambda$requestKeyboardHide$9$injuspayhypersdkcoreDuiInterface();
            }
        });
    }

    @JavascriptInterface
    public void requestKeyboardShow() {
        Godel godel = this.godelManager;
        if (godel != null) {
            JuspayWebView juspayWebView = godel.getJuspayWebView();
            InputMethodManager inputMethodManager = (InputMethodManager) this.context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(juspayWebView, 1);
            }
        }
    }

    @JavascriptInterface
    public void requestPermission(String[] strArr, String str, String str2) {
        this.juspayServices.requestPermission(strArr, Integer.parseInt(str));
        this.listenerMap.put("ReqPermi".concat(String.valueOf(str)), str2);
    }

    @JavascriptInterface
    public void requestSMSPermission(String str) {
        requestPermission(new String[]{"android.permission.READ_SMS", "android.permission.RECEIVE_SMS"}, "7", str);
    }

    public void reset() {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : this.listenerMap.keySet()) {
                if (this.listenerMap.get(str) instanceof JuspayDuiHook) {
                    arrayList.add(str);
                }
            }
            detach((String[]) arrayList.toArray(new String[0]));
            Godel godel = this.godelManager;
            if (godel != null) {
                godel.onDuiReleased();
                this.godelManager = null;
            }
            this.container = null;
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while removing Dui Hooks", e);
        }
    }

    @JavascriptInterface
    public void revokePermissions(String[] strArr) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    arrayList.add(str);
                }
                this.context.revokeSelfPermissionsOnKill(arrayList);
            }
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.PERMISSION, "Error while revoking permission", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void runInJuspayBrowser(java.lang.String r10, final java.lang.String r11, final java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.DuiInterface.runInJuspayBrowser(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public void runInJuspayWebView(String str, String str2) {
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @JavascriptInterface
    public void setCardBrand(String str) {
        this.juspayServices.getPaymentSessionInfo().setPaymentDetails("card_brand", str);
    }

    @JavascriptInterface
    public void setConfig(String str) {
        if (this.godelManager == null) {
            return;
        }
        try {
            this.godelManager.setConfig(new JSONObject(str));
        } catch (JSONException e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while capturing config json", e);
        }
    }

    public void setContainer(ViewGroup viewGroup) {
        this.container = viewGroup;
    }

    @JavascriptInterface
    public void setIsRupaySupportedAdded(boolean z) {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.setIsRupaySupportedAdded(z);
        }
    }

    @JavascriptInterface
    public void setSessionDetails(String str, String str2) {
        this.juspayServices.getPaymentSessionInfo().addToSessionDetails(str, str2);
    }

    @JavascriptInterface
    public void setSessionInfo() {
    }

    @JavascriptInterface
    public String shouldShowRequestPermissionRationale(String str) {
        try {
            Activity activity = this.activity;
            if (activity != null) {
                return String.valueOf(activity.shouldShowRequestPermissionRationale(str));
            }
            return null;
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.PERMISSION, "Exception while checking shouldShowRequestPermissionRationale", e);
            return null;
        }
    }

    @JavascriptInterface
    public void storeActivityData(String str, String str2) {
        this.juspayServices.getDynamicUI().storeActivityData(str, str2);
    }

    @JavascriptInterface
    public void storeCookies() {
        CookieSyncManager.getInstance().sync();
    }

    @JavascriptInterface
    public void suppressKeyboard() {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DuiInterface$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m303lambda$suppressKeyboard$8$injuspayhypersdkcoreDuiInterface();
            }
        });
    }

    @JavascriptInterface
    public void updateLoaded(String str, String str2) {
        String str3;
        Exception exc;
        String string;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.has("fileName") ? jSONObject.getString("fileName") : "";
        } catch (Exception e) {
            exc = e;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(getDataFromSharedPrefs(PaymentConstants.JP_HASH_AND_STATUS, "{}"));
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject2.has(string)) {
                jSONObject3 = jSONObject2.getJSONObject(string);
            } else {
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.CRITICAL, Labels.HyperSdk.AUTO_FALLBACK, "loaded", "hash doesn't have a filename");
            }
            jSONObject3.put("status", str2);
            jSONObject2.put(string, jSONObject3);
            addDataToSharedPrefs(PaymentConstants.JP_HASH_AND_STATUS, jSONObject2.toString());
            JuspayLogger.d(LOG_TAG, "udpateLoaded: ");
        } catch (Exception e2) {
            exc = e2;
            str3 = string;
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.AUTO_FALLBACK, "Exception while updating the loaded status for file ".concat(String.valueOf(str3)), exc);
        }
    }

    @JavascriptInterface
    public String isDeviceSecure() {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) this.context.getSystemService("keyguard");
            return keyguardManager != null ? keyguardManager.isDeviceSecure() ? "SECURE" : "NOT_SECURE" : "UNKNOWN";
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while checking KeyguardManager.isDeviceSecure()", e);
            return "UNKNOWN";
        }
    }

    @JavascriptInterface
    public void runInJuspayWebView(final String str) {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        final JuspayWebView juspayWebView = godel.getJuspayWebView();
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DuiInterface$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m302lambda$runInJuspayWebView$5$injuspayhypersdkcoreDuiInterface(str, juspayWebView);
            }
        });
    }

    @JavascriptInterface
    public void invokeFnInDUIWebview(String str, String str2) {
        this.juspayServices.getDynamicUI().addJsToWebView(String.format("window[\"onEvent'\"]('%s',atob('%s'))", str, Base64.encodeToString(str2.getBytes(), 2)));
    }

    public void requestPermission(String[] strArr, String str, Handler.Callback callback) {
        this.juspayServices.requestPermission(strArr, Integer.parseInt(str));
        this.listenerMap.put("ReqPermi".concat(String.valueOf(str)), callback);
    }

    @Override // in.juspay.hyper.core.CallbackInvoker
    @JavascriptInterface
    public void invokeFnInDUIWebview(String str) {
        invokeCustomFnInDUIWebview(str);
    }

    @JavascriptInterface
    public void invokeInACSWebview(String str, String str2) {
        if (this.godelManager == null) {
            return;
        }
        this.godelManager.getJuspayWebView().addJsToWebView(String.format("javascript:window.onAcsFunctionCalled('%s',atob('%s'))", str, Base64.encodeToString(str2.getBytes(), 2)));
    }

    @JavascriptInterface
    public void requestKeyboardShow(final String str) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DuiInterface$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m299lambda$requestKeyboardShow$7$injuspayhypersdkcoreDuiInterface(str);
            }
        });
    }

    @JavascriptInterface
    public void onWebViewReady(String str, String str2) {
        if (URLUtil.isValidUrl(str2)) {
            onWebViewReady(str, str2, null);
        } else {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ON_WEBVIEW_READY, "valid_url", Boolean.FALSE);
        }
    }

    @JavascriptInterface
    public void onWebViewReady(String str, String str2, String str3) {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.onBrowserReady(this.activity, str2, str3, str);
        }
    }
}
