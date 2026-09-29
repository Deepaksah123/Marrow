package com.razorpay;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.marrow.data.models.custommodule.FilterParams;
import com.razorpay.AnalyticsProperty;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class AnalyticsUtil {
    private static int $I__I = 0;
    private static String $l$I1I11I1 = null;
    static String BUILD_TYPE = null;
    static String FRAMEWORK = null;
    static String KEY_TYPE = null;
    static int MERCHANT_APP_BUILD = 0;
    static CharSequence MERCHANT_APP_NAME = null;
    static CharSequence MERCHANT_APP_NAMESPACE = null;
    static int MERCHANT_APP_TARGET_SDK = 0;
    static CharSequence MERCHANT_APP_VERSION = null;
    private static String __l1_ = null;
    private static String _llI = null;
    private static boolean l$1_I$l$ = false;
    public static String libraryType;
    private static final Object _l_1l__ = new Object();
    private static final List<PendingEvent> I__1l = new ArrayList();
    private static String _1__ = "standealone";
    static int sessionErroredApiCalls = 0;

    AnalyticsUtil() {
    }

    static void setup(Context context, String str, String str2, int i, String str3) {
        _1__ = str2;
        $I__I = i;
        $l$I1I11I1 = str3;
        MonitoringUtil.setSdkInfo(str2, str3);
        setAppDetails(context, str);
        l$1_I$l$(context, str);
    }

    private static void l$1_I$l$(Context context, String str) {
        if (context == null) {
            throw new RuntimeException("Context not set");
        }
        if (str == null) {
            throw new RuntimeException("Merchant key not set");
        }
        Lumberjack.init(context, _1__, $l$I1I11I1);
        Lumberjack.addOrderProperty("merchant_key", str);
        Lumberjack.addOrderProperty("merchant_package", context.getPackageName());
        l$1_I$l$(context);
        RazorpayExceptionHandler.register(context);
        l$1_I$l$ = true;
        if (l$1_I$l$()) {
            Lumberjack.postData();
        }
        MonitoringUtil.capturePreviousProcessExit(context);
    }

    private static void l$1_I$l$(Context context) {
        try {
            String value = SharedPreferenceUtil.getValue(context, "country_code");
            if (value == null || value.isEmpty()) {
                return;
            }
            Lumberjack.addOrderProperty("country_code", value);
            StringBuilder sb = new StringBuilder("Loaded cached country code: ");
            sb.append(value);
            Logger.d(sb.toString());
        } catch (Exception e) {
            Logger.e("Failed to load cached country code", e);
        }
    }

    static String getBuildType() {
        return BUILD_TYPE;
    }

    static String getKeyType() {
        return KEY_TYPE;
    }

    static void trackEvent(AnalyticsEvent analyticsEvent) {
        Logger.d(analyticsEvent.getEventName());
        if (l$1_I$l$(analyticsEvent.getEventName(), null, null)) {
            return;
        }
        Lumberjack.trackEvent(analyticsEvent.getEventName());
    }

    static void postData() {
        if (l$1_I$l$) {
            Lumberjack.postData();
        }
    }

    static void trackEvent(AnalyticsEvent analyticsEvent, Map<String, Object> map) {
        if (l$1_I$l$(analyticsEvent.getEventName(), map == null ? null : getJSONResponse(map), null)) {
            return;
        }
        Lumberjack.trackEvent(analyticsEvent.getEventName(), map);
    }

    static void trackEvent(AnalyticsEvent analyticsEvent, JSONObject jSONObject) {
        Logger.d(analyticsEvent.getEventName());
        if (l$1_I$l$(analyticsEvent.getEventName(), jSONObject, null)) {
            return;
        }
        Lumberjack.trackEvent(analyticsEvent.getEventName(), jSONObject);
    }

    static void trackEventWithMetric(AnalyticsEvent analyticsEvent, JSONObject jSONObject, long j) {
        Logger.d(analyticsEvent.getEventName());
        if (l$1_I$l$(analyticsEvent.getEventName(), jSONObject, Long.valueOf(j))) {
            return;
        }
        Lumberjack.trackEventWithMetric(analyticsEvent.getEventName(), jSONObject, j);
    }

    private static boolean l$1_I$l$(String str, JSONObject jSONObject, Long l) {
        if (l$1_I$l$) {
            return false;
        }
        synchronized (_l_1l__) {
            if (l$1_I$l$) {
                return false;
            }
            List<PendingEvent> list = I__1l;
            list.add(new PendingEvent(str, l$1_I$l$(jSONObject), l));
            StringBuilder sb = new StringBuilder("Analytics pending event queued: event=");
            sb.append(str);
            sb.append(", pending_count=");
            sb.append(list.size());
            sb.append(", properties=");
            sb.append(jSONObject);
            sb.append(", metric=");
            sb.append(l);
            Logger.d(sb.toString());
            return true;
        }
    }

    private static boolean l$1_I$l$() {
        synchronized (_l_1l__) {
            List<PendingEvent> list = I__1l;
            if (list.isEmpty()) {
                return false;
            }
            ArrayList<PendingEvent> arrayList = new ArrayList(list);
            list.clear();
            StringBuilder sb = new StringBuilder("Analytics pending event flush: count=");
            sb.append(arrayList.size());
            Logger.d(sb.toString());
            for (PendingEvent pendingEvent : arrayList) {
                StringBuilder sb2 = new StringBuilder("Analytics pending event flush: event=");
                sb2.append(pendingEvent.eventName);
                sb2.append(", properties=");
                sb2.append(pendingEvent.properties);
                sb2.append(", metric=");
                sb2.append(pendingEvent.metric);
                Logger.d(sb2.toString());
                if (pendingEvent.metric == null) {
                    Lumberjack.trackEvent(pendingEvent.eventName, l$1_I$l$(pendingEvent.properties));
                } else {
                    Lumberjack.trackEventWithMetric(pendingEvent.eventName, l$1_I$l$(pendingEvent.properties), pendingEvent.metric.longValue());
                }
            }
            return true;
        }
    }

    private static JSONObject l$1_I$l$(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    static List<String> getPendingEventNames() {
        ArrayList arrayList;
        synchronized (_l_1l__) {
            arrayList = new ArrayList();
            Iterator<PendingEvent> it = I__1l.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().eventName);
            }
        }
        return arrayList;
    }

    static class PendingEvent {
        final String eventName;
        final Long metric;
        final JSONObject properties;

        PendingEvent(String str, JSONObject jSONObject, Long l) {
            this.eventName = str;
            this.properties = jSONObject;
            this.metric = l;
        }
    }

    static void addProperty(String str, AnalyticsProperty analyticsProperty) {
        if (analyticsProperty.scope == AnalyticsProperty.Scope.PAYMENT) {
            Lumberjack.addPaymentProperty(str, analyticsProperty.value);
        } else if (analyticsProperty.scope == AnalyticsProperty.Scope.ORDER) {
            Lumberjack.addOrderProperty(str, analyticsProperty.value);
        }
    }

    static void addFilteredPropertiesFromPayload(JSONObject jSONObject) {
        Lumberjack.addFilteredPropertiesFromPayload(jSONObject);
    }

    static String getAppDetail() {
        if (!l$1_I$l$) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) MERCHANT_APP_NAME);
        sb.append("-");
        sb.append((Object) MERCHANT_APP_VERSION);
        sb.append("-");
        sb.append(MERCHANT_APP_BUILD);
        return sb.toString();
    }

    static void trackPage(String str, String str2) {
        Lumberjack.trackPage(str, str2);
    }

    static void reportError(String str, String str2, String str3) {
        Lumberjack.trackErrorEvent(AnalyticsEvent.ERROR_LOGGED.getEventName(), getJSONErrorResponse(str, getErrorProperties(str2, str3)), str2);
        if ((str2.equalsIgnoreCase("S0") || str2.equalsIgnoreCase("S1")) && sessionErroredApiCalls <= 0) {
            Lumberjack.logVajraCritialError(str2);
            sessionErroredApiCalls++;
        }
    }

    static void reportError(AbstractMethodError abstractMethodError, String str, String str2) {
        Lumberjack.trackErrorEvent(AnalyticsEvent.ERROR_LOGGED.getEventName(), getJSONErrorResponse(null, getErrorProperties(str, str2)), str);
        if ((str.equalsIgnoreCase("S0") || str.equalsIgnoreCase("S1")) && sessionErroredApiCalls <= 0) {
            Lumberjack.logVajraCritialError(str);
            sessionErroredApiCalls++;
        }
    }

    static Map<String, Object> getErrorProperties(String str, String str2) {
        HashMap map = new HashMap();
        map.put("severity", str);
        map.put("unhandled", Boolean.TRUE);
        map.put("source", "self");
        map.put("stack", "");
        map.put("message", str2);
        return map;
    }

    static JSONObject getAnalyticsDataForCheckout(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "mobile_sdk");
            jSONObject.put("platform_version", $l$I1I11I1);
            jSONObject.put("os", LogSubCategory.LifeCycle.ANDROID);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            if (ResourceUtils.isTablet(context)) {
                jSONObject.put(LogSubCategory.Context.DEVICE, "tablet");
                return jSONObject;
            }
            jSONObject.put(LogSubCategory.Context.DEVICE, "mobile");
            return jSONObject;
        } catch (Exception e) {
            reportError(e.getLocalizedMessage(), LogLevel.CRITICAL, e.getMessage());
            return jSONObject;
        }
    }

    static void trackPageLoadStart(String str) {
        trackEvent(isCheckoutUrl(str) ? AnalyticsEvent.CHECKOUT_PAGE_LOAD_START : AnalyticsEvent.PAGE_LOAD_START, getJSONResponse(getPageLoadStartProperties(str)));
    }

    static Map<String, Object> getPageLoadStartProperties(String str) {
        HashMap map = new HashMap();
        map.put("url", str);
        return map;
    }

    static void trackPageLoadEnd(String str, long j) {
        trackEvent(isCheckoutUrl(str) ? AnalyticsEvent.CHECKOUT_PAGE_LOAD_FINISH : AnalyticsEvent.PAGE_LOAD_FINISH, getJSONResponse(getPageLoadEndProperties(str, j)));
    }

    static boolean isCheckoutUrl(String str) {
        return str.indexOf(CoreConfig.getInstance().getCheckoutEndpoint()) == 0;
    }

    static Map<String, Object> getPageLoadEndProperties(String str, long j) {
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("page_load_time", Double.valueOf(j / 1.0E9d));
        return map;
    }

    static void reset() {
        l$1_I$l$ = false;
        __l1_ = null;
        _llI = null;
        synchronized (_l_1l__) {
            List<PendingEvent> list = I__1l;
            if (!list.isEmpty()) {
                StringBuilder sb = new StringBuilder("Analytics pending event clear on reset: count=");
                sb.append(list.size());
                Logger.d(sb.toString());
            }
            list.clear();
        }
        MonitoringUtil.reset();
        Lumberjack.destroy();
    }

    static void setAppDetails(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            MERCHANT_APP_NAME = returnUndefinedIfNull(packageInfo.applicationInfo.loadLabel(packageManager));
            MERCHANT_APP_VERSION = returnUndefinedIfNull(packageInfo.versionName);
            MERCHANT_APP_NAMESPACE = returnUndefinedIfNull(packageInfo.packageName);
            MERCHANT_APP_TARGET_SDK = packageInfo.applicationInfo.targetSdkVersion;
            MERCHANT_APP_BUILD = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            reportError(e.getMessage(), "S0", e.getMessage());
        }
        BUILD_TYPE = BaseUtils.getAppBuildType(context);
        KEY_TYPE = getKeyType(str);
    }

    static String getKeyType(String str) {
        if (isNullOrEmpty(str) || str.length() < 8) {
            return null;
        }
        String strSubstring = str.substring(0, 8);
        if (strSubstring.equals("rzp_live")) {
            return "live";
        }
        if (strSubstring.equals("rzp_test")) {
            return "test";
        }
        return null;
    }

    static boolean isNullOrEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (length > i && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        return length - i == 0;
    }

    static CharSequence returnUndefinedIfNull(CharSequence charSequence) {
        return isNullOrEmpty(charSequence) ? "undefined" : charSequence;
    }

    static String getLocalPaymentId() {
        if (__l1_ == null) {
            __l1_ = getUniqueId();
        }
        return __l1_;
    }

    static String getLocalOrderId() {
        if (_llI == null) {
            _llI = getUniqueId();
        }
        return _llI;
    }

    static void refreshPaymentSession() {
        __l1_ = getUniqueId();
        Lumberjack.clearPaymentProperties();
    }

    static void refreshOrderSession() {
        _llI = getUniqueId();
        __l1_ = getUniqueId();
        Lumberjack.clearOrderProperties();
        Lumberjack.clearPaymentProperties();
    }

    static void setLocalOrderId(String str) {
        _llI = str;
    }

    static String getUniqueId() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jFloor = (long) Math.floor(Math.random() * 1.4776336E7d);
        StringBuilder sb = new StringBuilder();
        sb.append(tobase62((jCurrentTimeMillis - 1388534400000L) * 1000000));
        sb.append(tobase62(jFloor));
        String string = sb.toString();
        return string.length() > 14 ? string.substring(0, 14) : string;
    }

    static String tobase62(long j) {
        String string = "";
        String[] strArrSplit = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");
        while (j > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(strArrSplit[(int) (j % 62)]));
            sb.append(string);
            string = sb.toString();
            j = (long) Math.floor(j / 62);
        }
        return string;
    }

    static void reportUncaughtException(Throwable th) {
        reportUncaughtException(th, null, null);
    }

    static void reportUncaughtException(Throwable th, Thread thread, Context context) {
        String stackTrace = getStackTrace(th);
        if (stackTrace.contains("com.razorpay")) {
            Logger.d(stackTrace);
            HashMap map = new HashMap(getErrorProperties("S0", th.getMessage()));
            String strSanitizeStackTrace = sanitizeStackTrace(stackTrace);
            MonitoringUtil.trackSdkCrash(context, th, thread, strSanitizeStackTrace);
            Lumberjack.trackExceptionEvent(AnalyticsEvent.EXCEPTION_LOGGED.getEventName(), getJSONResponse(map), strSanitizeStackTrace);
        }
    }

    static void reportCaughtException(Throwable th) {
        String stackTrace = getStackTrace(th);
        Logger.d(stackTrace);
        HashMap map = new HashMap(getErrorProperties("S1", th.getMessage()));
        Lumberjack.trackExceptionEvent(AnalyticsEvent.ERROR_LOGGED.getEventName(), getJSONResponse(map), sanitizeStackTrace(stackTrace));
    }

    static void reportBlockingCaughtException(Context context, Throwable th) {
        MonitoringUtil.trackBlockingCaughtException(context, th, Thread.currentThread(), sanitizeStackTrace(getStackTrace(th)));
    }

    static void logCheckoutFunctionEntry(String str, String str2, boolean z) {
        if (z) {
            try {
                HashMap map = new HashMap();
                map.put("class_name", str);
                map.put("function_name", str2);
                trackEvent(AnalyticsEvent.CHECKOUT_FUNCTION_ENTRY, map);
            } catch (Exception unused) {
            }
        }
    }

    static void logCheckoutFunctionExit(String str, String str2, boolean z) {
        if (z) {
            try {
                HashMap map = new HashMap();
                map.put("class_name", str);
                map.put("function_name", str2);
                trackEvent(AnalyticsEvent.CHECKOUT_FUNCTION_EXIT, map);
            } catch (Exception unused) {
            }
        }
    }

    static void logCustomUIFunctionEntry(String str, String str2, boolean z) {
        if (z) {
            try {
                HashMap map = new HashMap();
                map.put("class_name", str);
                map.put("function_name", str2);
                trackEvent(AnalyticsEvent.CUSTOMUI_FUNCTION_ENTRY, map);
            } catch (Exception unused) {
            }
        }
    }

    static void logCustomUIFunctionExit(String str, String str2, boolean z) {
        if (z) {
            try {
                HashMap map = new HashMap();
                map.put("class_name", str);
                map.put("function_name", str2);
                trackEvent(AnalyticsEvent.CUSTOMUI_FUNCTION_EXIT, map);
            } catch (Exception unused) {
            }
        }
    }

    static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    static String sanitizeStackTrace(String str) {
        if (isNullOrEmpty(str)) {
            return "";
        }
        try {
            String[] strArrSplit = str.split("\n");
            StringBuilder sb = new StringBuilder();
            int iMin = Math.min(strArrSplit.length, 20);
            int i = 0;
            while (true) {
                if (i >= iMin) {
                    break;
                }
                String str2 = strArrSplit[i];
                if (!str2.trim().isEmpty()) {
                    String strReplaceAll = str2.replaceAll("\\b[a-zA-Z0-9_-]{32,}\\b", "<token>").replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", "<email>").replaceAll("\\b\\d{13,19}\\b", "****").replaceAll("\\b\\d{10,12}\\b", "<phone>");
                    if (strReplaceAll.length() > 500) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strReplaceAll.substring(0, 497));
                        sb2.append("...");
                        strReplaceAll = sb2.toString();
                    }
                    sb.append(strReplaceAll);
                    sb.append("\n");
                    if (sb.length() > 5000) {
                        sb.append("... (truncated for size)");
                        break;
                    }
                }
                i++;
            }
            return sb.toString().trim();
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("Stack trace sanitization failed: ");
            sb3.append(e.getClass().getSimpleName());
            return sb3.toString();
        }
    }

    static void setFramework(String str) {
        FRAMEWORK = str;
    }

    static String getFramework() {
        return isNullOrEmpty(FRAMEWORK) ? "native" : FRAMEWORK;
    }

    public static void saveEventsToPreferences(Context context) {
        Lumberjack.saveEventsToPreferences(context);
    }

    public static JSONObject getExtraAnalyticsPayload() {
        return Lumberjack.getContextPayload();
    }

    public static JSONObject getJSONResponse(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("response", str);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static JSONObject getJSONResponse(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                String localizedMessage = e.getLocalizedMessage();
                StringBuilder sb = new StringBuilder("Error adding analytics property ");
                sb.append(entry.getKey());
                sb.append(" to JSONObject");
                reportError(localizedMessage, "S0", sb.toString());
            }
        }
        return jSONObject;
    }

    public static JSONObject getJSONErrorResponse(String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("severity", map.get("severity"));
            jSONObject3.put("unhandled", map.get("unhandled"));
            jSONObject3.put("source", map.get("source"));
            JSONObject jSONObject4 = new JSONObject();
            if (str == null) {
                jSONObject4.put("stack", "AbstractMethodError");
            } else {
                jSONObject4.put("stack", str);
            }
            jSONObject4.put("message", map.get("message"));
            jSONObject4.put(FilterParams.KEY_TAGS, jSONObject3);
            jSONObject2.put("error", jSONObject4);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            StringBuilder sb = new StringBuilder("Error adding analytics property ");
            sb.append(map.get("message"));
            sb.append(" to JSONObject");
            reportError(localizedMessage, "S0", sb.toString());
            return jSONObject;
        }
    }
}
