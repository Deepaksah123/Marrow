package com.razorpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class CheckoutUtils {
    private static Dialog O$$$__o0Oo = null;
    private static boolean _$O0_o = false;

    /* JADX INFO: loaded from: classes5.dex */
    interface BackButtonDialogCallback {
        void onNegativeButtonClick();

        void onPositiveButtonClick();
    }

    CheckoutUtils() {
    }

    static void addAddons(Context context, String str) {
        AnalyticsUtil.setup(context, str, _Oo_O_$.SDK_TYPE, _Oo_O_$.SDK_VERSION_CODE, _Oo_O_$.SDK_VERSION);
    }

    static String getCheckoutUrlWithOptions(OoOo_ ooOo_) {
        String strAddParamToUrl = addParamToUrl(GlobalUrlConfig.instance().getCheckoutUrl(), "version", _Oo_O_$.SDK_VERSION);
        Map<String, String> checkoutUrlConfig = _Oo_O_$.getInstance().getCheckoutUrlConfig();
        for (String str : checkoutUrlConfig.keySet()) {
            strAddParamToUrl = addParamToUrl(strAddParamToUrl, str, checkoutUrlConfig.get(str));
        }
        for (String str2 : _Oo_O_$.getInstance().getCheckoutAppendKeys()) {
            if (ooOo_.has(str2)) {
                strAddParamToUrl = addParamToUrl(strAddParamToUrl, str2, (String) ooOo_.get(str2));
            }
        }
        Logger.d("Modified Url: ".concat(String.valueOf(strAddParamToUrl)));
        return strAddParamToUrl;
    }

    static boolean isDynamicUrlConfigUsed(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return new OoOo_(bundle.getString(C$0o__.OPTIONS)).getAsJson().has("hosted_config");
    }

    static void isFeatureEnabled(String str, final String str2, final Callback callback) {
        final ResponseObject responseObject = new ResponseObject();
        Owl.post("https://api.razorpay.com/v2/preferences?key_id=".concat(String.valueOf(str)), "{\"query\":[{\"resource\":\"merchant_features\"}],\"action\":\"get\"}", new Callback() { // from class: com.razorpay.CheckoutUtils.1
            @Override // com.razorpay.Callback
            public void run(ResponseObject responseObject2) {
                if (responseObject2 != null) {
                    try {
                        if (responseObject2.getResponseCode() >= 400) {
                            boolean unused = CheckoutUtils._$O0_o = false;
                            return;
                        }
                        if (responseObject2.getResponseResult() != null) {
                            JSONObject jSONObject = new JSONObject(responseObject2.getResponseResult());
                            if (jSONObject.has("features")) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("features");
                                if (jSONObject2.has("data")) {
                                    JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                                    if (jSONObject3.has(str2)) {
                                        responseObject.setResponseResult(String.valueOf(jSONObject3.getBoolean(str2)));
                                        callback.run(responseObject);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        AnalyticsUtil.reportError(CheckoutUtils.class.getName(), "S0", e.getMessage());
                        responseObject.setResponseResult("false");
                        callback.run(responseObject);
                    }
                }
            }
        });
    }

    static String getCheckoutUrlWithOptions(OoOo_ ooOo_, String str) {
        JSONObject asJson = ooOo_.getAsJson();
        if (str != null) {
            if (!str.contains(".html")) {
                str = addParamToUrl(str, "version", _Oo_O_$.SDK_VERSION);
            }
            Map<String, String> checkoutUrlConfig = _Oo_O_$.getInstance().getCheckoutUrlConfig();
            for (String str2 : checkoutUrlConfig.keySet()) {
                str = addParamToUrl(str, str2, checkoutUrlConfig.get(str2));
            }
            for (String str3 : _Oo_O_$.getInstance().getCheckoutAppendKeys()) {
                if (ooOo_.has(str3)) {
                    str = addParamToUrl(str, str3, (String) ooOo_.get(str3));
                }
            }
            Logger.d("Modified Url: ".concat(String.valueOf(str)));
            return str;
        }
        if (ooOo_.has("hosted_config")) {
            try {
                JSONObject jSONObject = asJson.getJSONObject("hosted_config");
                String hostedFrameBaseUrl = getHostedFrameBaseUrl(jSONObject.getString("frame"));
                StringBuilder sb = new StringBuilder();
                sb.append(hostedFrameBaseUrl);
                sb.append(CoreConfig.getInstance().getHostedFrameBuild());
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                boolean z = true;
                for (int i = 0; i < jSONObject.length(); i++) {
                    String string2 = jSONObject.names().getString(i);
                    if (!string2.equals("frame")) {
                        if (z) {
                            sb2.append("?");
                            z = false;
                        } else {
                            sb2.append("&");
                        }
                        String strEncode = URLEncoder.encode(string2, CharsetNames.UTF_8);
                        String strEncode2 = URLEncoder.encode(jSONObject.getString(string2), CharsetNames.UTF_8);
                        sb2.append(strEncode);
                        sb2.append("=");
                        sb2.append(strEncode2);
                    }
                }
                return getCheckoutUrlWithOptions(ooOo_, sb2.toString());
            } catch (UnsupportedEncodingException | JSONException unused) {
                return getCheckoutUrlWithOptions(ooOo_);
            }
        }
        return getCheckoutUrlWithOptions(ooOo_);
    }

    public static String getHostedFrameBaseUrl(String str) {
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append("://");
            sb.append(url.getHost());
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    static boolean isCheckoutUrl(WebView webView) {
        return (webView.getTag() == null ? "" : webView.getTag().toString()).contains(GlobalUrlConfig.instance().getL$1_I$l$());
    }

    static String addParamToUrl(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&" : "?");
        sb.append(str2);
        String string = sb.toString();
        if (str3 == null) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("=");
        sb2.append(str3);
        return sb2.toString();
    }

    static void disableFullScreenMode(Activity activity) {
        activity.getWindow().addFlags(2048);
        activity.getWindow().clearFlags(1024);
    }

    static boolean shouldRetryPayment(int i) {
        int retryMaxCount = _Oo_O_$.getInstance().getRetryMaxCount();
        if (_Oo_O_$.getInstance().isRetryEnabled()) {
            return retryMaxCount == -1 || retryMaxCount >= i;
        }
        return false;
    }

    static String getBase64FromCurrentAppsResource(Activity activity, int i) {
        return BaseUtils.getBase64FromResource(activity.getResources(), i);
    }

    static void setUserEmail(Context context, String str) {
        SharedPreferenceUtil.setProtectedValue(context, "rzp_user_email", str, null);
    }

    static void setMerchantOptions(Context context, String str, String str2) {
        if (str2 == null) {
            SharedPreferenceUtil.removeValue(context, "pref_merchant_options_".concat(String.valueOf(str)));
        } else {
            SharedPreferenceUtil.setProtectedValue(context, "pref_merchant_options_".concat(String.valueOf(str)), str2, null);
        }
    }

    static String getMerchantOptions(Context context, String str) {
        return SharedPreferenceUtil.getProtectedValue(context, "pref_merchant_options_".concat(String.valueOf(str)), null);
    }

    static void setUserContact(Context context, String str) {
        SharedPreferenceUtil.setProtectedValue(context, "rzp_user_contact", str, null);
    }

    static String getUserEmail(Context context) {
        return SharedPreferenceUtil.getProtectedValue(context, "rzp_user_email", null);
    }

    static String getUserContact(Context context) {
        return SharedPreferenceUtil.getProtectedValue(context, "rzp_user_contact", null);
    }

    static void showDialog(Context context, String str, String str2, String str3, final BackButtonDialogCallback backButtonDialogCallback) {
        new AlertDialog.Builder(context).setMessage(str).setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: com.razorpay.CheckoutUtils.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                backButtonDialogCallback.onPositiveButtonClick();
            }
        }).setNegativeButton(str3, new DialogInterface.OnClickListener() { // from class: com.razorpay.CheckoutUtils.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                backButtonDialogCallback.onNegativeButtonClick();
            }
        }).show();
    }

    static JSONObject isPackageInstalled(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.resolvePackageName = packageManager.getPackageInfo(str, 0).packageName;
            return getAppExistenceDataInJson(context, resolveInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    static JSONObject getAppExistenceDataInJson(Context context, ResolveInfo resolveInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (resolveInfo.resolvePackageName.equalsIgnoreCase(BaseConstants.CRED_PACKAGE)) {
                jSONObject.put("shortcode", "cred");
                jSONObject.put("uri", "credpay");
                jSONObject.put("package_name", resolveInfo.resolvePackageName);
                return jSONObject;
            }
            if (resolveInfo.resolvePackageName.equalsIgnoreCase(BaseConstants.BHIM_PACKAGE_NAME)) {
                jSONObject.put("shortcode", "bhim");
                jSONObject.put("uri", "upi://pay");
                jSONObject.put("package_name", resolveInfo.resolvePackageName);
                return jSONObject;
            }
            jSONObject.put("package_name", resolveInfo.resolvePackageName);
            return jSONObject;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getLocalizedMessage(), "S2", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    static JSONArray getUpiIntentsDataInJsonArray(Context context) {
        List<ResolveInfo> listOfAppsWhichHandleDeepLink = BaseUtils.getListOfAppsWhichHandleDeepLink(context, "upi://pay");
        if (listOfAppsWhichHandleDeepLink == null || listOfAppsWhichHandleDeepLink.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<ResolveInfo> it = listOfAppsWhichHandleDeepLink.iterator();
        while (it.hasNext()) {
            jSONArray.put(getIntentDataInJson(context, it.next()));
        }
        return jSONArray;
    }

    static JSONArray getAppIntentDataInJsonArray(Context context) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        arrayList.add("credpay://checkout");
        arrayList.add("truecallersdk://truesdk");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<ResolveInfo> listOfAppsWhichHandleDeepLink = BaseUtils.getListOfAppsWhichHandleDeepLink(context, (String) it.next());
            if (listOfAppsWhichHandleDeepLink != null && listOfAppsWhichHandleDeepLink.size() > 0) {
                Iterator<ResolveInfo> it2 = listOfAppsWhichHandleDeepLink.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(getAppIntentDataInJson(context, it2.next()));
                }
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }

    static JSONObject getAppIntentDataInJson(Context context, ResolveInfo resolveInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!((PackageItemInfo) resolveInfo.activityInfo).packageName.contains(BaseConstants.CRED_PACKAGE)) {
                if (((PackageItemInfo) resolveInfo.activityInfo).packageName.contains("com.truecaller")) {
                    jSONObject.put("package_name", "com.truecaller");
                    jSONObject.put("shortcode", (Object) null);
                    jSONObject.put("uri", (Object) null);
                }
                return jSONObject;
            }
            jSONObject.put("package_name", BaseConstants.CRED_PACKAGE);
            jSONObject.put("shortcode", "cred");
            jSONObject.put("uri", "credpay");
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
            return null;
        }
    }

    static JSONObject getIntentDataInJson(Context context, ResolveInfo resolveInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("package_name", ((PackageItemInfo) resolveInfo.activityInfo).packageName);
            jSONObject.put("app_name", BaseUtils.getAppNameOfResolveInfo(resolveInfo, context));
            jSONObject.put("app_icon", BaseUtils.getBase64FromOtherAppsResource(context, ((PackageItemInfo) resolveInfo.activityInfo).packageName));
            return jSONObject;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            e.printStackTrace();
            return jSONObject;
        }
    }

    static void showLoader(Context context) {
        if (!_Oo_O_$.getInstance().isNativeLoaderEnabled() || context == null || ((Activity) context).isFinishing()) {
            return;
        }
        Dialog dialog = O$$$__o0Oo;
        if (dialog == null || !dialog.isShowing()) {
            Dialog dialog2 = new Dialog(context);
            O$$$__o0Oo = dialog2;
            dialog2.requestWindowFeature(1);
            O$$$__o0Oo.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            O$$$__o0Oo.setContentView(com.razorpay.checkout.lib.R.layout.rzp_loader);
            try {
                ((CircularProgressView) O$$$__o0Oo.findViewById(com.razorpay.checkout.lib.R.id.progressBar)).setColor(Color.parseColor(_Oo_O_$.getInstance().getNativeLoaderColor()));
            } catch (Exception unused) {
            }
            ((LinearLayout) O$$$__o0Oo.findViewById(com.razorpay.checkout.lib.R.id.ll_loader)).setOnClickListener(new View.OnClickListener() { // from class: com.razorpay.CheckoutUtils.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CheckoutUtils.dismissLoader();
                }
            });
            try {
                O$$$__o0Oo.show();
            } catch (Exception e) {
                Logger.e("Error showing loader", e);
            }
        }
    }

    static void showLoaderForMagicX(Context context, String str) {
        if (context == null || ((Activity) context).isFinishing()) {
            return;
        }
        Dialog dialog = O$$$__o0Oo;
        if (dialog == null || !dialog.isShowing()) {
            Dialog dialog2 = new Dialog(context);
            O$$$__o0Oo = dialog2;
            dialog2.requestWindowFeature(1);
            O$$$__o0Oo.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            O$$$__o0Oo.setContentView(com.razorpay.checkout.lib.R.layout.rzp_loader);
            ((CircularProgressView) O$$$__o0Oo.findViewById(com.razorpay.checkout.lib.R.id.progressBar)).setColor(Color.parseColor(str));
            ((LinearLayout) O$$$__o0Oo.findViewById(com.razorpay.checkout.lib.R.id.ll_loader)).setOnClickListener(new View.OnClickListener() { // from class: com.razorpay.CheckoutUtils.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CheckoutUtils.dismissLoader();
                }
            });
            try {
                O$$$__o0Oo.show();
            } catch (Exception e) {
                Logger.e("Error showing loader", e);
            }
        }
    }

    static boolean isDialogShowing() {
        Dialog dialog = O$$$__o0Oo;
        if (dialog == null) {
            return false;
        }
        return dialog.isShowing();
    }

    static void dismissLoader() {
        Dialog dialog = O$$$__o0Oo;
        if (dialog == null) {
            return;
        }
        if (dialog.isShowing()) {
            try {
                O$$$__o0Oo.dismiss();
            } catch (Exception e) {
                Logger.e("Error dismissing loader", e);
            }
        }
        O$$$__o0Oo = null;
    }

    static void clearUserData(Context context) {
        setUserContact(context, null);
        setUserEmail(context, null);
        _$O0_o.setDeviceToken(context, null);
        clearUserRelatedCookies();
    }

    static void clearUserRelatedCookies() {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie("https://api.razorpay.com", "razorpay_api_session=");
        WebStorage.getInstance().deleteAllData();
        cookieManager.removeSessionCookies(new ValueCallback<Boolean>() { // from class: com.razorpay.CheckoutUtils.6
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                if (bool.booleanValue()) {
                    CookieManager.getInstance().removeAllCookies(null);
                    CookieManager.getInstance().flush();
                }
            }
        });
    }

    public static void toggleWebviewBackground(WebView webView, boolean z) {
        if (webView != null) {
            if (z) {
                webView.setBackgroundColor(Color.parseColor("#99000000"));
                return;
            }
            Drawable background = webView.getBackground();
            if (background instanceof ColorDrawable) {
                int color = ((ColorDrawable) background).getColor();
                if (Color.alpha(color) == 0 || color == Color.parseColor("#99000000")) {
                    webView.setBackgroundColor(-1);
                    return;
                } else {
                    webView.setBackgroundColor(Color.parseColor("#99000000"));
                    return;
                }
            }
            webView.setBackgroundColor(Color.parseColor("#99000000"));
        }
    }

    public static Bundle getCheckoutActivityStateBundle(Activity activity) {
        try {
            String value = SharedPreferenceUtil.getValue(activity, "SAVED_STATE_BUNDLE_MAP");
            if (value == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(value);
            Bundle bundle = new Bundle();
            if (jSONObject.has(C$0o__.OPTIONS)) {
                bundle.putString(C$0o__.OPTIONS, jSONObject.getString(C$0o__.OPTIONS));
            }
            if (jSONObject.has("DASH_OPTIONS")) {
                bundle.putString("DASH_OPTIONS", jSONObject.getString("DASH_OPTIONS"));
            }
            if (jSONObject.has(C$0o__.IMAGE)) {
                bundle.putInt(C$0o__.IMAGE, jSONObject.getInt(C$0o__.IMAGE));
            }
            if (jSONObject.has(C$0o__.DISABLE_FULL_SCREEN)) {
                bundle.putBoolean(C$0o__.DISABLE_FULL_SCREEN, jSONObject.getBoolean(C$0o__.DISABLE_FULL_SCREEN));
            }
            return bundle;
        } catch (Exception e) {
            AnalyticsUtil.reportError("CheckoutUtils.getCheckoutActivityStateBundle()", "S1", e.getMessage());
            return null;
        }
    }

    public static JSONObject checkoutActivityStateBundleToJSONObject(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C$0o__.OPTIONS, bundle.getString(C$0o__.OPTIONS));
            jSONObject.put("DASH_OPTIONS", bundle.getString("DASH_OPTIONS"));
            if (bundle.containsKey(C$0o__.IMAGE)) {
                jSONObject.put(C$0o__.IMAGE, bundle.getInt(C$0o__.IMAGE));
            }
            if (bundle.containsKey(C$0o__.DISABLE_FULL_SCREEN)) {
                jSONObject.put(C$0o__.DISABLE_FULL_SCREEN, bundle.getBoolean(C$0o__.DISABLE_FULL_SCREEN));
            }
            return jSONObject;
        } catch (Exception e) {
            AnalyticsUtil.reportError("CheckoutUtils.checkoutActivityStateBundleToJSONObject()", "S1", e.getMessage());
            return null;
        }
    }

    static boolean shouldDisableHardwareAcceleration(Context context, OoOo_ ooOo_) {
        try {
            if (context == null || ooOo_ == null) {
                Logger.d("context or checkout options null, keeping HW accel enabled");
                return false;
            }
            String str = Build.MANUFACTURER;
            int performanceClass = PerformanceUtil.getPerformanceClass(context);
            boolean zIsLowEndDevice = PerformanceUtil.isLowEndDevice(context);
            HashMap map = new HashMap();
            map.put("manufacturer", str);
            map.put("performance_class", Integer.valueOf(performanceClass));
            map.put("is_low_end_device", Boolean.valueOf(zIsLowEndDevice));
            map.put("merchant_flag_enabled", Boolean.valueOf(ooOo_.shouldDisableHardwareAccelerationForLowEndDevices()));
            if (!ooOo_.shouldDisableHardwareAccelerationForLowEndDevices()) {
                map.put("hw_acceleration_status", "enabled");
                map.put("reason", "merchant_flag_not_set");
                AnalyticsUtil.trackEventWithMetric(AnalyticsEvent.CHECKOUT_HARDWARE_ACCELERATION_CHECK, AnalyticsUtil.getJSONResponse(map), performanceClass);
                return false;
            }
            if (!zIsLowEndDevice) {
                map.put("hw_acceleration_status", "enabled");
                map.put("reason", "high_end_device");
                AnalyticsUtil.trackEventWithMetric(AnalyticsEvent.CHECKOUT_HARDWARE_ACCELERATION_CHECK, AnalyticsUtil.getJSONResponse(map), performanceClass);
                return false;
            }
            String str2 = "OPPO";
            boolean z = str != null && str.equalsIgnoreCase("OPPO");
            boolean z2 = str != null && str.equalsIgnoreCase("VIVO");
            if (!z && !z2) {
                map.put("hw_acceleration_status", "enabled");
                map.put("reason", "not_oppo_or_vivo_manufacturer");
                AnalyticsUtil.trackEventWithMetric(AnalyticsEvent.CHECKOUT_HARDWARE_ACCELERATION_CHECK, AnalyticsUtil.getJSONResponse(map), performanceClass);
                return false;
            }
            map.put("hw_acceleration_status", "disabled");
            map.put("reason", z ? "oppo_low_end_device" : "vivo_low_end_device");
            AnalyticsUtil.trackEventWithMetric(AnalyticsEvent.CHECKOUT_HARDWARE_ACCELERATION_CHECK, AnalyticsUtil.getJSONResponse(map), performanceClass);
            StringBuilder sb = new StringBuilder("Hardware acceleration disabled: ");
            if (!z) {
                str2 = "VIVO";
            }
            sb.append(str2);
            sb.append(" low-end device detected");
            Logger.d(sb.toString());
            return true;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Error in shouldDisableHardwareAcceleration: ");
            sb2.append(e.getMessage());
            Logger.e(sb2.toString());
            return false;
        }
    }
}
