package in.juspay.hypersdk.core;

import android.app.ActivityManager;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.TrackerInterface;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersmshandler.Tracker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SdkTracker implements TrackerInterface, Tracker {
    private static final String LOG_TAG = "SdkTracker";
    private static final int MAX_LOG_SIZE = 22528;
    private static final Queue<JSONObject> bootLogs = new ConcurrentLinkedQueue();
    private String godelBuildVersion;
    private String godelVersion;
    private String hyperSdkVersion;
    private final JuspayServices juspayServices;
    private AtomicInteger serialNumberCounter = new AtomicInteger(1);
    private final JSONObject logProperties = new JSONObject();
    private final HashSet<String> labelsToDrop = new HashSet<>();

    SdkTracker(JuspayServices juspayServices) {
        this.hyperSdkVersion = "";
        this.godelVersion = "";
        this.godelBuildVersion = "";
        this.juspayServices = juspayServices;
        try {
            this.hyperSdkVersion = IntegrationUtils.getSdkVersion(juspayServices.getContext());
            this.godelVersion = IntegrationUtils.getGodelVersion(juspayServices.getContext());
            this.godelBuildVersion = IntegrationUtils.getGodelBuildVersion(juspayServices.getContext());
        } catch (Exception unused) {
        }
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorManager.setTrackerThreadId(Thread.currentThread().getId());
            }
        });
    }

    public static void addToBootLogs(final String str) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.lambda$addToBootLogs$1(str);
            }
        });
    }

    private static JSONObject cloneJSON(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String str = (String) jSONArrayNames.opt(i);
            Object objOpt = jSONObject.opt(str);
            if (objOpt instanceof JSONObject) {
                jSONObject2.put(str, cloneJSON((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                jSONObject2.put(str, cloneJSONArray((JSONArray) objOpt));
            } else {
                jSONObject2.put(str, objOpt);
            }
        }
        return jSONObject2;
    }

    private static JSONArray cloneJSONArray(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                jSONArray2.put(cloneJSON((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                jSONArray2.put(cloneJSONArray((JSONArray) objOpt));
            } else {
                jSONArray2.put(objOpt);
            }
        }
        return jSONArray2;
    }

    private static Object cloneObject(Object obj) {
        try {
            return obj instanceof JSONObject ? cloneJSON((JSONObject) obj) : obj instanceof JSONArray ? cloneJSONArray((JSONArray) obj) : obj;
        } catch (Exception unused) {
            return obj;
        }
    }

    private JSONObject createApiExceptionLog(String str, String str2, String str3, Long l, Long l2, Object obj, String str4, String str5, String str6, Throwable th, JSONArray jSONArray, JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("url", str4);
            jSONObject3.put("start_time", l);
            jSONObject3.put("end_time", l2);
            jSONObject3.put("payload", obj == null ? JSONObject.NULL : cloneObject(obj));
            jSONObject3.put("method", str5);
            StringBuilder sb = new StringBuilder();
            sb.append(str6);
            sb.append(". ");
            sb.append(th.getLocalizedMessage());
            jSONObject3.put("message", sb.toString());
            jSONObject3.put("stacktrace", formatThrowable(th));
            jSONObject2.put("category", str);
            jSONObject2.put("subcategory", str2);
            jSONObject2.put("level", "exception");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append("_");
            sb2.append(Utils.getLogLevelFromThrowable(th));
            jSONObject2.put("label", sb2.toString());
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject3);
            jSONObject2.put("at", System.currentTimeMillis());
            jSONObject2.put("service", PaymentConstants.Category.SDK);
            jSONObject2.put("channels", jSONArray);
            if (jSONObject != null && (jSONArrayNames = jSONObject.names()) != null) {
                for (int i = 0; i < jSONArrayNames.length(); i++) {
                    String string = jSONArrayNames.getString(i);
                    jSONObject2.put(string, jSONObject.getString(string));
                }
            }
            return jSONObject2;
        } catch (Exception e) {
            JuspayLogger.e(LOG_TAG, "Error while adding API exception log: ", e);
            return jSONObject2;
        }
    }

    private static JSONObject createApiLog(String str, String str2, String str3, Integer num, String str4, Long l, Long l2, Object obj, Object obj2, String str5) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str4);
            jSONObject2.put("status_code", num);
            jSONObject2.put("start_time", l);
            jSONObject2.put("end_time", l2);
            jSONObject2.put("payload", obj == null ? JSONObject.NULL : cloneObject(obj));
            jSONObject2.put("response", cloneObject(obj2));
            jSONObject2.put("method", str5);
            jSONObject.put("category", LogCategory.API_CALL);
            jSONObject.put("subcategory", str);
            jSONObject.put("level", str2);
            jSONObject.put("label", str3);
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject2);
            jSONObject.put("at", System.currentTimeMillis());
            jSONObject.put("service", PaymentConstants.Category.SDK);
            return jSONObject;
        } catch (JSONException e) {
            JuspayLogger.e(LOG_TAG, "Error while adding boot log: ", e);
            return jSONObject;
        }
    }

    private static JSONObject createExceptionLog(String str, String str2, String str3, String str4, Throwable th, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(". ");
            sb.append(th.getLocalizedMessage());
            jSONObject2.put("message", sb.toString());
            if (z) {
                jSONObject2.put("stacktrace", formatThrowable(th));
            } else {
                jSONObject2.put("stacktrace", Log.getStackTraceString(th));
            }
            jSONObject.put("category", str);
            jSONObject.put("subcategory", str2);
            jSONObject.put("level", "exception");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append("_");
            sb2.append(Utils.getLogLevelFromThrowable(th));
            jSONObject.put("label", sb2.toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject2);
            jSONObject.put("service", PaymentConstants.Category.SDK);
            jSONObject.put("at", System.currentTimeMillis());
            return jSONObject;
        } catch (JSONException e) {
            JuspayLogger.e(LOG_TAG, "Error while adding log: ", e);
            return jSONObject;
        }
    }

    private static JSONObject createLog(String str, String str2, String str3, String str4, String str5, Object obj) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str5, obj == null ? JSONObject.NULL : cloneObject(obj));
            jSONObject.put("category", str);
            jSONObject.put("subcategory", str2);
            jSONObject.put("level", str3);
            jSONObject.put("label", str4);
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject2);
            jSONObject.put("at", System.currentTimeMillis());
            jSONObject.put("service", PaymentConstants.Category.SDK);
            return jSONObject;
        } catch (JSONException e) {
            JuspayLogger.e(LOG_TAG, "Error while adding boot log: ", e);
            return jSONObject;
        }
    }

    private static JSONObject createLogWithValue(String str, String str2, String str3, String str4, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", str);
            jSONObject.put("subcategory", str2);
            jSONObject.put("level", str3);
            jSONObject.put("label", str4);
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, cloneObject(obj));
            jSONObject.put("at", System.currentTimeMillis());
            jSONObject.put("service", PaymentConstants.Category.SDK);
            return jSONObject;
        } catch (JSONException e) {
            JuspayLogger.e(LOG_TAG, "Error while adding boot log: ", e);
            return jSONObject;
        }
    }

    private static String formatThrowable(Throwable th) {
        StringBuilder sb = new StringBuilder(getStackTraceAsString(th));
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("\nCaused by ");
            sb.append(getStackTraceAsString(cause));
        }
        return sb.toString();
    }

    private static String getStackTraceAsString(Throwable th) {
        StringBuilder sb = new StringBuilder(th.toString());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\n\tat ");
            sb.append(stackTraceElement.toString());
        }
        return sb.toString();
    }

    static /* synthetic */ void lambda$addToBootLogs$1(String str) {
        JuspayLogger.log(LOG_TAG, "DEBUG", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("at")) {
                jSONObject.put("at", System.currentTimeMillis());
            }
            bootLogs.add(jSONObject);
        } catch (Exception e) {
            JuspayLogger.e(LOG_TAG, "addToBootLogs", e);
        }
    }

    static /* synthetic */ void lambda$trackAndLogBootException$5(String str, String str2, Throwable th, String str3, String str4, String str5) {
        JuspayLogger.e(str, str2, th);
        bootLogs.add(createExceptionLog(str3, str4, str5, str2, th));
    }

    private void processBootLogs() {
        while (true) {
            Queue<JSONObject> queue = bootLogs;
            if (queue.isEmpty()) {
                return;
            }
            JSONObject jSONObjectPoll = queue.poll();
            if (jSONObjectPoll != null) {
                try {
                    if (!shouldDropLog(jSONObjectPoll.optString("label", ""))) {
                        signLog(jSONObjectPoll);
                        this.juspayServices.getLogManager().addLogLine(this.juspayServices.getSessionInfo().getSessionId(), jSONObjectPoll);
                    }
                } catch (Exception e) {
                    trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while signing log line", e);
                }
            }
        }
    }

    private boolean shouldDropLog(String str) {
        return this.labelsToDrop.contains(str);
    }

    private void signLog(JSONObject jSONObject) throws JSONException {
        SessionInfo sessionInfo = this.juspayServices.getSessionInfo();
        if (!jSONObject.has("session_id")) {
            jSONObject.put("session_id", sessionInfo.getSessionId());
        }
        String clientId = sessionInfo.getClientId();
        if (!jSONObject.has(PaymentConstants.CLIENT_ID) && !clientId.isEmpty()) {
            String[] strArrSplit = clientId.split("_", 2);
            if (strArrSplit.length > 0) {
                jSONObject.put(PaymentConstants.CLIENT_ID, strArrSplit[0].toLowerCase(Locale.getDefault()));
            }
        }
        String merchantId = sessionInfo.getMerchantId();
        if (!merchantId.isEmpty() && !jSONObject.has(PaymentConstants.MERCHANT_ID)) {
            jSONObject.put(PaymentConstants.MERCHANT_ID, merchantId);
        }
        String orderId = sessionInfo.getOrderId();
        if (!orderId.isEmpty() && !jSONObject.has(PaymentConstants.ORDER_ID)) {
            jSONObject.put(PaymentConstants.ORDER_ID, orderId);
        }
        if (!jSONObject.has("package_name")) {
            jSONObject.put("package_name", sessionInfo.getPackageName());
        }
        if (!jSONObject.has("log_version")) {
            jSONObject.put("log_version", PaymentConstants.LOG_VERSION);
        }
        jSONObject.put("sn", this.serialNumberCounter.getAndIncrement());
        if (!jSONObject.has("hyper_sdk_version")) {
            jSONObject.put("hyper_sdk_version", this.hyperSdkVersion);
        }
        if (!jSONObject.has(PaymentConstants.GODEL_VERSION)) {
            jSONObject.put(PaymentConstants.GODEL_VERSION, this.godelVersion);
        }
        if (!jSONObject.has(PaymentConstants.GODEL_BUILD_VERSION)) {
            jSONObject.put(PaymentConstants.GODEL_BUILD_VERSION, this.godelBuildVersion);
        }
        Iterator<String> itKeys = this.logProperties.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, this.logProperties.optString(next));
        }
    }

    public static void trackAndLogBootException(final String str, final String str2, final String str3, final String str4, final String str5, final Throwable th) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.lambda$trackAndLogBootException$5(str, str5, th, str2, str3, str4);
            }
        });
    }

    public static void trackBootAction(final String str, final String str2, final String str3, final String str4, final Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.bootLogs.add(SdkTracker.createLog("action", str, str2, str3, str4, obj));
            }
        });
    }

    public static void trackBootException(final String str, final String str2, final String str3, final String str4, final Throwable th) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.bootLogs.add(SdkTracker.createExceptionLog(str, str2, str3, str4, th));
            }
        });
    }

    public static void trackBootLifecycle(final String str, final String str2, final String str3, final String str4, final Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.bootLogs.add(SdkTracker.createLog(LogCategory.LIFECYCLE, str, str2, str3, str4, obj));
            }
        });
    }

    private void trackParsed(JSONObject jSONObject) {
        try {
            if (!this.juspayServices.getLogManager().logConfig.shouldPush) {
                bootLogs.clear();
                return;
            }
            truncateLog(jSONObject);
            signLog(jSONObject);
            this.juspayServices.getLogManager().addLogLine(this.juspayServices.getSessionInfo().getSessionId(), jSONObject);
            processBootLogs();
        } catch (Exception e) {
            trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while signing log line", e);
        }
    }

    private void trackPhoneState() {
        try {
            JSONObject jSONObject = new JSONObject();
            SessionInfo sessionInfo = this.juspayServices.getSessionInfo();
            ActivityManager.MemoryInfo memoryInfo = Utils.getMemoryInfo(this.juspayServices.getContext());
            if (memoryInfo != null) {
                jSONObject.put("available_memory", memoryInfo.availMem);
                jSONObject.put("threshold_memory", memoryInfo.threshold);
                jSONObject.put("total_memory", memoryInfo.totalMem);
            }
            jSONObject.put("network_info", sessionInfo.getNetworkInfo());
            jSONObject.put("network_type", String.valueOf(sessionInfo.getNetworkType()));
            jSONObject.put("ip_address", Utils.getIPAddress(this.juspayServices));
            trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.PHONE_STATE, jSONObject);
        } catch (Exception unused) {
        }
    }

    private void truncateLog(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() > MAX_LOG_SIZE) {
                    jSONObject.put(next, str.substring(0, MAX_LOG_SIZE));
                }
            } else if (obj instanceof JSONObject) {
                truncateLog((JSONObject) obj);
            }
        }
    }

    public final void addLogProperties(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = this.juspayServices.getLogManager().logConfig.logProperties;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject2.getString(next);
                int iIndexOf = string.indexOf(36);
                int iIndexOf2 = string.indexOf(123);
                int iLastIndexOf = string.lastIndexOf(125);
                if (iIndexOf != -1 && iIndexOf2 != -1 && iLastIndexOf != -1 && iIndexOf2 - iIndexOf == 1 && iIndexOf2 < iLastIndexOf) {
                    String strSubstring = string.substring(iIndexOf2 + 1, iLastIndexOf);
                    if (jSONObject.has(strSubstring)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("${");
                        sb.append(strSubstring);
                        sb.append("}");
                        this.logProperties.put(next, string.replace(sb.toString(), jSONObject.optString(strSubstring)));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // in.juspay.hyper.core.TrackerInterface
    public final void addLogToPersistedQueue(final JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m342lambda$addLogToPersistedQueue$14$injuspayhypersdkcoreSdkTracker(jSONObject);
            }
        });
    }

    public final JSONObject getExceptionLog(String str, String str2, String str3, String str4, Throwable th) {
        JSONObject jSONObjectCreateExceptionLog = createExceptionLog(str, str2, str3, str4, th, true);
        try {
            signLog(jSONObjectCreateExceptionLog);
            return jSONObjectCreateExceptionLog;
        } catch (Exception e) {
            JuspayLogger.e(LOG_TAG, "getExceptionLog failed", e);
            return jSONObjectCreateExceptionLog;
        }
    }

    /* JADX INFO: renamed from: lambda$addLogToPersistedQueue$14$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m342lambda$addLogToPersistedQueue$14$injuspayhypersdkcoreSdkTracker(JSONObject jSONObject) {
        try {
            this.juspayServices.getLogManager().addLogsToPersistedQueue(jSONObject);
        } catch (Exception e) {
            JuspayLogger.e(LOG_TAG, "addLogToPersistedQueue failed", e);
        }
    }

    /* JADX INFO: renamed from: lambda$setEndPointSandbox$18$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m343lambda$setEndPointSandbox$18$injuspayhypersdkcoreSdkTracker(Boolean bool) {
        this.juspayServices.getLogManager().setEndPointSandbox(bool.booleanValue());
    }

    /* JADX INFO: renamed from: lambda$track$17$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m344lambda$track$17$injuspayhypersdkcoreSdkTracker(JSONObject jSONObject) {
        try {
            if (shouldDropLog(jSONObject.optString("label", ""))) {
                return;
            }
            jSONObject.put("at", System.currentTimeMillis());
            trackParsed(jSONObject);
        } catch (JSONException e) {
            trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while parsing the JSON", e);
        }
    }

    /* JADX INFO: renamed from: lambda$trackAction$8$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m345lambda$trackAction$8$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, String str4, Object obj) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject jSONObjectCreateLog = createLog("action", str2, str3, str, str4, obj);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateLog);
        } else {
            bootLogs.add(jSONObjectCreateLog);
        }
    }

    /* JADX INFO: renamed from: lambda$trackAndLogApiException$16$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m346lambda$trackAndLogApiException$16$injuspayhypersdkcoreSdkTracker(String str, String str2, Throwable th, String str3, String str4, String str5, Long l, Long l2, Object obj, String str6, String str7, JSONArray jSONArray, JSONObject jSONObject) {
        JuspayLogger.e(str, str2, th);
        if (shouldDropLog(str3)) {
            return;
        }
        trackPhoneState();
        JSONObject jSONObjectCreateApiExceptionLog = createApiExceptionLog(str4, str5, str3, l, l2, obj, str6, str7, str2, th, jSONArray, jSONObject);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateApiExceptionLog);
        } else {
            bootLogs.add(jSONObjectCreateApiExceptionLog);
        }
    }

    /* JADX INFO: renamed from: lambda$trackAndLogException$15$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m347lambda$trackAndLogException$15$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, Throwable th, String str4, String str5) {
        if (shouldDropLog(str)) {
            return;
        }
        JuspayLogger.e(str2, str3, th);
        trackPhoneState();
        JSONObject jSONObjectCreateExceptionLog = createExceptionLog(str4, str5, str, str3, th);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateExceptionLog);
        } else {
            bootLogs.add(jSONObjectCreateExceptionLog);
        }
    }

    /* JADX INFO: renamed from: lambda$trackApiCalls$10$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m348lambda$trackApiCalls$10$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, Integer num, String str4, String str5, long j, Long l, Object obj, Object obj2, String str6, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObjectCreateApiLog = createApiLog(str, str2, str3, num, str4, str5, Long.valueOf(j), l, obj, obj2, str6, jSONArray, jSONObject);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateApiLog);
        } else {
            bootLogs.add(jSONObjectCreateApiLog);
        }
    }

    /* JADX INFO: renamed from: lambda$trackApiCalls$9$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m349lambda$trackApiCalls$9$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, Integer num, String str4, Long l, Long l2, Object obj, Object obj2, String str5) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject jSONObjectCreateApiLog = createApiLog(str2, str3, str, num, str4, l, l2, obj, obj2, str5);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateApiLog);
        } else {
            bootLogs.add(jSONObjectCreateApiLog);
        }
    }

    /* JADX INFO: renamed from: lambda$trackContext$11$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m350lambda$trackContext$11$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, String str4, Object obj) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject jSONObjectCreateLog = createLog(LogCategory.CONTEXT, str2, str3, str, str4, obj);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateLog);
        } else {
            bootLogs.add(jSONObjectCreateLog);
        }
    }

    /* JADX INFO: renamed from: lambda$trackContext$12$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m351lambda$trackContext$12$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, Object obj) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject jSONObjectCreateLogWithValue = createLogWithValue(LogCategory.CONTEXT, str2, str3, str, obj);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateLogWithValue);
        } else {
            bootLogs.add(jSONObjectCreateLogWithValue);
        }
    }

    /* JADX INFO: renamed from: lambda$trackException$13$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m352lambda$trackException$13$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, String str4, Throwable th) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject jSONObjectCreateExceptionLog = createExceptionLog(str2, str3, str, str4, th);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateExceptionLog);
        } else {
            bootLogs.add(jSONObjectCreateExceptionLog);
        }
    }

    /* JADX INFO: renamed from: lambda$trackLifecycle$6$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m353lambda$trackLifecycle$6$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, String str4, Object obj) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject jSONObjectCreateLog = createLog(LogCategory.LIFECYCLE, str2, str3, str, str4, obj);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateLog);
        } else {
            bootLogs.add(jSONObjectCreateLog);
        }
    }

    /* JADX INFO: renamed from: lambda$trackLifecycle$7$in-juspay-hypersdk-core-SdkTracker, reason: not valid java name */
    final /* synthetic */ void m354lambda$trackLifecycle$7$injuspayhypersdkcoreSdkTracker(String str, String str2, String str3, JSONObject jSONObject) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject jSONObjectCreateLogWithValue = createLogWithValue(LogCategory.LIFECYCLE, str2, str3, str, jSONObject);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(jSONObjectCreateLogWithValue);
        } else {
            bootLogs.add(jSONObjectCreateLogWithValue);
        }
    }

    public final void resetSerialNumber() {
        this.serialNumberCounter = new AtomicInteger(1);
    }

    public final void setEndPointSandbox(final Boolean bool) {
        ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m343lambda$setEndPointSandbox$18$injuspayhypersdkcoreSdkTracker(bool);
            }
        });
    }

    public final void setLabelsToDrop(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("labelsToDrop");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.labelsToDrop.add(jSONArray.getString(i));
            }
        } catch (Exception unused) {
        }
    }

    @Override // in.juspay.hyper.core.TrackerInterface
    public final void track(final JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m344lambda$track$17$injuspayhypersdkcoreSdkTracker(jSONObject);
            }
        });
    }

    @Override // in.juspay.hyper.core.TrackerInterface, in.juspay.hypersmshandler.Tracker
    public final void trackAction(final String str, final String str2, final String str3, final String str4, final Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m345lambda$trackAction$8$injuspayhypersdkcoreSdkTracker(str3, str, str2, str4, obj);
            }
        });
    }

    public final void trackAndLogApiException(final String str, final String str2, final String str3, final String str4, final Long l, final Long l2, final Object obj, final String str5, final String str6, final String str7, final Throwable th, final JSONArray jSONArray, final JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m346lambda$trackAndLogApiException$16$injuspayhypersdkcoreSdkTracker(str, str7, th, str4, str2, str3, l, l2, obj, str5, str6, jSONArray, jSONObject);
            }
        });
    }

    @Override // in.juspay.hyper.core.TrackerInterface, in.juspay.hypersmshandler.Tracker
    public final void trackAndLogException(final String str, final String str2, final String str3, final String str4, final String str5, final Throwable th) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m347lambda$trackAndLogException$15$injuspayhypersdkcoreSdkTracker(str4, str, str5, th, str2, str3);
            }
        });
    }

    @Override // in.juspay.hyper.core.TrackerInterface
    public final void trackApiCalls(final String str, final String str2, final String str3, final Integer num, final String str4, final Long l, final Long l2, final Object obj, final Object obj2, final String str5) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m349lambda$trackApiCalls$9$injuspayhypersdkcoreSdkTracker(str3, str, str2, num, str4, l, l2, obj, obj2, str5);
            }
        });
    }

    public final void trackContext(final String str, final String str2, final String str3, final String str4, final Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m350lambda$trackContext$11$injuspayhypersdkcoreSdkTracker(str3, str, str2, str4, obj);
            }
        });
    }

    public final void trackException(final String str, final String str2, final String str3, final String str4, final Throwable th) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m352lambda$trackException$13$injuspayhypersdkcoreSdkTracker(str3, str, str2, str4, th);
            }
        });
    }

    @Override // in.juspay.hyper.core.TrackerInterface
    public final void trackLifecycle(final String str, final String str2, final String str3, final String str4, final Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m353lambda$trackLifecycle$6$injuspayhypersdkcoreSdkTracker(str3, str, str2, str4, obj);
            }
        });
    }

    public final void trackApiCalls(final String str, final String str2, final String str3, final Integer num, final String str4, final String str5, final long j, final Long l, final Object obj, final Object obj2, final String str6, final JSONArray jSONArray, final JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m348lambda$trackApiCalls$10$injuspayhypersdkcoreSdkTracker(str, str2, str3, num, str4, str5, j, l, obj, obj2, str6, jSONArray, jSONObject);
            }
        });
    }

    public final void trackContext(final String str, final String str2, final String str3, final Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m351lambda$trackContext$12$injuspayhypersdkcoreSdkTracker(str3, str, str2, obj);
            }
        });
    }

    public final void trackLifecycle(final String str, final String str2, final String str3, final JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.SdkTracker$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m354lambda$trackLifecycle$7$injuspayhypersdkcoreSdkTracker(str3, str, str2, jSONObject);
            }
        });
    }

    private static JSONObject createExceptionLog(String str, String str2, String str3, String str4, Throwable th) {
        return createExceptionLog(str, str2, str3, str4, th, false);
    }

    private static JSONObject createApiLog(String str, String str2, String str3, Integer num, String str4, String str5, Long l, Long l2, Object obj, Object obj2, String str6, JSONArray jSONArray, JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("url", str4);
            jSONObject3.put("status_code", num);
            jSONObject3.put("start_time", l);
            jSONObject3.put("end_time", l2);
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject3.put("payload", obj);
            jSONObject3.put("response", obj2);
            jSONObject3.put("method", str6);
            if (str5 != null) {
                jSONObject3.put("api_tag", str5);
            }
            jSONObject2.put("category", LogCategory.API_CALL);
            jSONObject2.put("subcategory", str);
            jSONObject2.put("level", str2);
            jSONObject2.put("label", str3);
            jSONObject2.put("channels", jSONArray);
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject3);
            jSONObject2.put("at", System.currentTimeMillis());
            jSONObject2.put("service", PaymentConstants.Category.SDK);
            if (jSONObject != null && (jSONArrayNames = jSONObject.names()) != null) {
                for (int i = 0; i < jSONArrayNames.length(); i++) {
                    String string = jSONArrayNames.getString(i);
                    jSONObject2.put(string, jSONObject.getString(string));
                }
            }
            return jSONObject2;
        } catch (JSONException e) {
            JuspayLogger.e(LOG_TAG, "Error while adding boot log: ", e);
            return jSONObject2;
        }
    }
}
