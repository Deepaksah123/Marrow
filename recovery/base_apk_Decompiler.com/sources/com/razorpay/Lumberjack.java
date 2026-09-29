package com.razorpay;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.razorpay.AnalyticsProperty;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class Lumberjack {
    private static int $$_$I1l1_ = 0;
    private static final Set<String> $lIII_$$;
    private static float $l_I$1 = 0.0f;
    private static boolean $lll$_lIl = false;
    private static int I1lII = 0;
    private static String IIII$1$_I = null;
    private static ScheduledFuture<?> I__1l = null;
    private static String _$_l_$1l$ = null;
    private static boolean __II$$ = false;
    private static boolean __Il11I1l = false;
    private static JSONObject ___Il$ = null;
    private static final int __l1_ = 10;
    private static ScheduledExecutorService _l_1l__ = null;
    private static String _l_l_1IlI = null;
    private static final int _llI = 10;
    private static JSONObject l$$$11Il1 = null;
    private static final String l$1_I$l$ = "SavedEventsData";
    private static final String lI$$I1$l = "default";
    private static final Map<String, Set<String>> l_lIl;
    private static String ll_$$111;
    private static final Object _1__ = new Object();
    private static String $I__I = Build.MANUFACTURER;
    private static String $l$I1I11I1 = Build.MODEL;
    private static String lI_l1Il_ = Build.DEVICE;
    private static boolean llIl = false;
    private static String I1I_l1 = "standalone";
    private static ArrayList<JSONObject> ___I1$lI = new ArrayList<>();
    private static Map<String, Object> $$II__1$l_ = new ConcurrentHashMap();
    private static Map<String, Object> II1$II$_1 = new ConcurrentHashMap();
    private static final Set<String> Il__I1Il = new HashSet(Arrays.asList(AnalyticsEvent.DEVICE_UPI_APPS_DISCOVERY_START.getEventName(), AnalyticsEvent.DEVICE_UPI_APPS_DISCOVERY_SUCCESS.getEventName(), AnalyticsEvent.CUSTOM_UI_GET_APPS_SUPPORTING_UPI.getEventName(), AnalyticsEvent.CUSTOM_UI_UPI_APPS_DISCOVERY_START.getEventName(), AnalyticsEvent.CUSTOM_UI_UPI_APPS_DISCOVERY_SUCCESS.getEventName(), AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_RECEIVED_SMS.getEventName(), AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_SHOWED_ONE_TIME_CONSENT.getEventName(), AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_TIMEOUT.getEventName(), AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCH_FAILED.getEventName(), AnalyticsEvent.WEB_VIEW_PRIMARY_TO_SECONDARY_SWITCH.getEventName(), AnalyticsEvent.WEB_VIEW_SECONDARY_TO_PRIMARY_SWITCH.getEventName(), AnalyticsEvent.CHECKOUT_HARD_BACK_PRESSED.getEventName()));
    private static Map<String, Integer> l$Illl = new ConcurrentHashMap();

    Lumberjack() {
    }

    static {
        HashMap map = new HashMap();
        l_lIl = map;
        map.put(AnalyticsEvent.DEVICE_UPI_APPS_DISCOVERY_SUCCESS.getEventName(), new HashSet(Arrays.asList("deviceApps")));
        map.put(AnalyticsEvent.CUSTOM_UI_UPI_APPS_DISCOVERY_SUCCESS.getEventName(), new HashSet(Arrays.asList("allUpiDeviceApps")));
        map.put(AnalyticsEvent.DEVICE_UPI_APPS_DISCOVERY_START.getEventName(), new HashSet());
        map.put(AnalyticsEvent.CUSTOM_UI_UPI_APPS_DISCOVERY_START.getEventName(), new HashSet());
        map.put(AnalyticsEvent.CUSTOM_UI_GET_APPS_SUPPORTING_UPI.getEventName(), new HashSet());
        map.put(AnalyticsEvent.CHECKOUT_HARD_BACK_PRESSED.getEventName(), new HashSet());
        map.put(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_RECEIVED_SMS.getEventName(), new HashSet());
        map.put(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_SHOWED_ONE_TIME_CONSENT.getEventName(), new HashSet());
        map.put(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_TIMEOUT.getEventName(), new HashSet());
        map.put(AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCH_FAILED.getEventName(), new HashSet());
        map.put(AnalyticsEvent.WEB_VIEW_PRIMARY_TO_SECONDARY_SWITCH.getEventName(), new HashSet());
        map.put(AnalyticsEvent.WEB_VIEW_SECONDARY_TO_PRIMARY_SWITCH.getEventName(), new HashSet());
        HashSet hashSet = new HashSet();
        $lIII_$$ = hashSet;
        hashSet.add(AnalyticsEvent.CUSTOM_UI_INIT_END.getEventName());
        hashSet.add(AnalyticsEvent.FETCH_PREFERENCES_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.FETCH_PREFERENCES_CALL_SUCCESS.getEventName());
        hashSet.add(AnalyticsEvent.FETCH_PREFERENCES_METHODS_CALL_FAIL.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_SUBMIT_START.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_PAYLOAD_PASSED.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_TLS_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_NATIVE_INTENT_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_UPI_APP_LAUNCHED.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_NATIVE_INTENT_ONACTIVITY_RESULT.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_PAYMENT_COMPLETE.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_BACK_PRESSED_HARD.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_BACK_PRESSED_SOFT.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_UPI_APPS_DISCOVERY_START.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_UPI_APPS_DISCOVERY_SUCCESS.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_INIT.getEventName());
        hashSet.add(AnalyticsEvent.ACTIVITY_ONCREATE_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_LOADED.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_RENDERED_COMPLETE.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_SUBMIT.getEventName());
        hashSet.add(AnalyticsEvent.NATIVE_INTENT_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.NATIVE_INTENT_SYSTEM_CHOOSER_SELECTED.getEventName());
        hashSet.add(AnalyticsEvent.NATIVE_INTENT_ONACTIVITY_RESULT.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_PAYMENT_COMPLETE.getEventName());
        hashSet.add(AnalyticsEvent.CALLING_ON_SUCCESS.getEventName());
        hashSet.add(AnalyticsEvent.CALLING_ON_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.HANDOVER_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_SOFT_BACK_PRESSED.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_HARD_BACK_PRESSED.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_JS_DISMISSED.getEventName());
        hashSet.add(AnalyticsEvent.ACTIVITY_ONDESTROY_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_TLS_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.WEBVIEW_CREATION_FAILED.getEventName());
        hashSet.add(AnalyticsEvent.WEBVIEW_RENDERER_CRASHED.getEventName());
        hashSet.add(AnalyticsEvent.WEB_VIEW_NETWORK_ERROR_RETRY.getEventName());
        hashSet.add(AnalyticsEvent.WEB_VIEW_NETWORK_RETRY_EXHAUSTED.getEventName());
        hashSet.add(AnalyticsEvent.WEB_VIEW_NETWORK_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.WEB_VIEW_SECONDARY_NETWORK_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.SDK_CRASH_LOGGED.getEventName());
        hashSet.add(AnalyticsEvent.SDK_PROCESS_EXIT_LOGGED.getEventName());
        hashSet.add(AnalyticsEvent.CRITICAL_DEPENDENCY_FAILED.getEventName());
    }

    private static boolean l$1_I$l$(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    private static CharSequence l$1_I$l$() {
        return AnalyticsUtil.returnUndefinedIfNull(System.getProperty("http.agent"));
    }

    private static CharSequence __l1_() {
        return AnalyticsUtil.returnUndefinedIfNull(TimeZone.getDefault().getID());
    }

    private static void l$1_I$l$(Context context) {
        _$_l_$1l$ = BaseUtils.getCellularNetworkType(context);
        IIII$1$_I = BaseUtils.getCellularNetworkProviderName(context);
        int i = AnonymousClass3.$SwitchMap$com$razorpay$NetworkType[BaseUtils.getDataNetworkType(context).ordinal()];
        if (i == 1) {
            __Il11I1l = true;
        } else if (i == 2) {
            $lll$_lIl = true;
        } else {
            if (i != 3) {
                return;
            }
            __II$$ = true;
        }
    }

    /* JADX INFO: renamed from: com.razorpay.Lumberjack$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$razorpay$NetworkType;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$com$razorpay$NetworkType = iArr;
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$razorpay$NetworkType[NetworkType.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$razorpay$NetworkType[NetworkType.BLUETOOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void __l1_(Context context) {
        Display defaultDisplay = ((WindowManager) BaseUtils.getSystemService(context, "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        $l_I$1 = displayMetrics.density;
        $$_$I1l1_ = displayMetrics.heightPixels;
        I1lII = displayMetrics.widthPixels;
    }

    private static String _llI() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    private static String _l_1l__() {
        if ("custom".equalsIgnoreCase(I1I_l1)) {
            return "checkout-custom";
        }
        return "checkout";
    }

    private static String I__1l() {
        if ("custom".equalsIgnoreCase(I1I_l1)) {
            return "customui_android";
        }
        return "checkout_android";
    }

    private static String _1__() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
    }

    private static String $I__I() {
        Object obj = II1$II$_1.get("merchant_key");
        return obj != null ? obj.toString() : "";
    }

    private static JSONObject _llI(Context context) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", BaseConfig.getAdvertisingId(context));
        jSONObject.put("manufacturer", $I__I);
        jSONObject.put("model", $l$I1I11I1);
        jSONObject.put("name", lI_l1Il_);
        jSONObject.put("type", "phone");
        StringBuilder sb = new StringBuilder("Android");
        sb.append(Build.VERSION.RELEASE);
        jSONObject.put("version", sb.toString());
        jSONObject.put($I__I, Build.MANUFACTURER);
        jSONObject.put($l$I1I11I1, Build.MODEL);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BaseUtils.getDisplayWidth(context));
        sb2.append("w X ");
        sb2.append(BaseUtils.getDisplayHeight(context));
        sb2.append(CmcdHeadersFactory.STREAMING_FORMAT_HLS);
        jSONObject.put("device_size", sb2.toString());
        jSONObject.put("device_resolution", BaseUtils.getDisplayResolution(context));
        long totalRamMB = BaseUtils.getTotalRamMB(context);
        jSONObject.put("total_ram_mb", totalRamMB);
        jSONObject.put("free_ram_mb", BaseUtils.getFreeRamMB(context));
        jSONObject.put("cpu_cores", BaseUtils.getCpuCores());
        jSONObject.put("performance_class", PerformanceUtil.getPerformanceClass(context));
        jSONObject.put("is_low_end_device", PerformanceUtil.isLowEndDevice(context));
        jSONObject.put("power_save_mode", BaseUtils.isPowerSaveMode(context));
        jSONObject.put("battery_level", BaseUtils.getBatteryLevel(context));
        jSONObject.put("is_charging", BaseUtils.isCharging(context));
        jSONObject.put("is_low_ram_device", totalRamMB <= 4096);
        jSONObject.put("gpu_renderer", GpuInfoUtil.getGpuRenderer());
        jSONObject.put("gpu_vendor", GpuInfoUtil.getGpuVendor());
        return jSONObject;
    }

    private static JSONObject $l$I1I11I1() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", ll_$$111);
        jSONObject.put("platform", LogSubCategory.LifeCycle.ANDROID);
        jSONObject.put("type", I1I_l1);
        jSONObject.put("framework", AnalyticsUtil.getFramework());
        StringBuilder sb = new StringBuilder();
        sb.append(I1I_l1);
        sb.append("_android_");
        sb.append(AnalyticsUtil.getFramework());
        jSONObject.put("name", sb.toString());
        return jSONObject;
    }

    private static JSONObject _l_1l__(Context context) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bluetooth", __II$$);
        jSONObject.put("carrier", IIII$1$_I);
        jSONObject.put("cellular", $lll$_lIl);
        jSONObject.put("cellular_network_type", _$_l_$1l$);
        jSONObject.put("wifi", __Il11I1l);
        jSONObject.put("carrier_network", BaseUtils.getCarrierOperatorName(context));
        jSONObject.put("network_type", BaseUtils.getNetworkType(context));
        jSONObject.put("ip_address", BaseUtils.ipAddress);
        jSONObject.put("is_roming", BaseUtils.isNetworkRoaming(context));
        Map<String, String> deviceAttributes = BaseUtils.getDeviceAttributes(context);
        jSONObject.put("device_Id", deviceAttributes.get("device_Id"));
        String str = $I__I;
        jSONObject.put(str, deviceAttributes.get(str));
        String str2 = $l$I1I11I1;
        jSONObject.put(str2, deviceAttributes.get(str2));
        return jSONObject;
    }

    private static JSONObject lI_l1Il_() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("density", $l_I$1);
        jSONObject.put("width", I1lII);
        jSONObject.put("height", $$_$I1l1_);
        return jSONObject;
    }

    private static JSONObject I__1l(Context context) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FilterParams.KEY_MODE, AnalyticsUtil.getKeyType());
        jSONObject.put(LogSubCategory.Context.DEVICE, _llI(context));
        jSONObject.put(PaymentConstants.Category.SDK, $l$I1I11I1());
        jSONObject.put(LogSubCategory.ApiCall.NETWORK, _l_1l__(context));
        jSONObject.put(PaymentConstants.Event.SCREEN, lI_l1Il_());
        jSONObject.put("locale", BaseUtils.getLocale());
        jSONObject.put("timezone", __l1_());
        StringBuilder sb = new StringBuilder();
        sb.append(I1I_l1);
        sb.append("_android_");
        sb.append(AnalyticsUtil.getFramework());
        jSONObject.put("framework", sb.toString());
        jSONObject.put("user_agent", l$1_I$l$());
        jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
        jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
        jSONObject.put("webview_user_agent", BaseUtils.getWebViewUserAgent(context));
        return jSONObject;
    }

    static void setBaseImportJSON(Context context) {
        try {
            l$1_I$l$(context);
            __l1_(context);
            GpuInfoUtil.loadFromCache(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", CoreConfig.getInstance().getLumberjackKey());
            jSONObject.put("events", new JSONArray());
            JSONObject jSONObjectI__1l = I__1l(context);
            ___Il$ = jSONObjectI__1l;
            jSONObject.put(LogCategory.CONTEXT, jSONObjectI__1l);
            jSONObject.put(FilterParams.KEY_MODE, "live");
            l$$$11Il1 = jSONObject;
            Logger.d(jSONObject.toString());
            _llI(getSessionCreatedJson());
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in creating BaseImportJSON");
            l$$$11Il1 = new JSONObject();
        }
    }

    static void updateGpuInfo() {
        JSONObject jSONObjectOptJSONObject;
        try {
            if (___Il$ == null || !GpuInfoUtil.isGpuInfoAvailable() || (jSONObjectOptJSONObject = ___Il$.optJSONObject(LogSubCategory.Context.DEVICE)) == null) {
                return;
            }
            jSONObjectOptJSONObject.put("gpu_renderer", GpuInfoUtil.getGpuRenderer());
            jSONObjectOptJSONObject.put("gpu_vendor", GpuInfoUtil.getGpuVendor());
            StringBuilder sb = new StringBuilder("GPU info updated: ");
            sb.append(GpuInfoUtil.getGpuRenderer());
            Logger.d(sb.toString());
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", "Error updating GPU info in context");
        }
    }

    private static void l$1_I$l$(JSONObject jSONObject) {
        int length;
        int iIntValue;
        if (!llIl) {
            ___I1$lI.add(jSONObject);
            return;
        }
        try {
            JSONObject jSONObjectAddGlobalProperties = addGlobalProperties(jSONObject);
            String strOptString = jSONObjectAddGlobalProperties.optString("event", "");
            if (Il__I1Il.contains(strOptString) && (iIntValue = l$Illl.merge(strOptString, 1, new BiFunction() { // from class: com.razorpay.Lumberjack$$ExternalSyntheticLambda0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return Integer.valueOf(Integer.sum(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                }
            }).intValue()) > 1) {
                if (l$1_I$l$(strOptString, jSONObjectAddGlobalProperties, iIntValue)) {
                    return;
                } else {
                    jSONObjectAddGlobalProperties.put("attempt", iIntValue);
                }
            }
            synchronized (l$$$11Il1) {
                JSONArray jSONArray = l$$$11Il1.getJSONArray("events");
                jSONArray.put(jSONObjectAddGlobalProperties);
                length = jSONArray.length();
            }
            if (length == 1) {
                __Il11I1l();
            }
            if (length >= 10) {
                StringBuilder sb = new StringBuilder("Lumberjack: Auto-flushing batch (");
                sb.append(length);
                sb.append(" events exceeded threshold of 10)");
                Logger.d(sb.toString());
                postData();
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
    }

    private static boolean l$1_I$l$(String str, JSONObject jSONObject, int i) {
        synchronized (l$$$11Il1) {
            try {
                JSONArray jSONArray = l$$$11Il1.getJSONArray("events");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (str.equals(jSONObject2.optString("event"))) {
                        Set<String> set = l_lIl.get(str);
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("properties");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("properties");
                        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject2 != null && set != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("attempt");
                            sb.append(i);
                            sb.append("_");
                            String string = sb.toString();
                            for (String str2 : set) {
                                if (jSONObjectOptJSONObject2.has(str2)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(string);
                                    sb2.append(str2);
                                    jSONObjectOptJSONObject.put(sb2.toString(), jSONObjectOptJSONObject2.get(str2));
                                }
                            }
                        }
                        return true;
                    }
                }
            } catch (Exception e) {
                AnalyticsUtil.reportError(e.getMessage(), "S0", "Error merging dedup event properties");
            }
            return false;
        }
    }

    static void addPaymentProperty(String str, Object obj) {
        $$II__1$l_.put(str, obj);
    }

    static void addOrderProperty(String str, Object obj) {
        II1$II$_1.put(str, obj);
    }

    static JSONObject createBaseTrackEvent(String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", str);
            jSONObject.put(PaymentConstants.TIMESTAMP, jCurrentTimeMillis);
            return jSONObject;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in creating base for trackEvent");
            return null;
        }
    }

    static void trackEvent(String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder("Error adding analytics property ");
                sb.append(entry.getKey());
                sb.append(" to JSONObject");
                AnalyticsUtil.reportError(message, "S0", sb.toString());
            }
        }
        trackEvent(str, jSONObject);
    }

    static void trackEvent(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectCreateBaseTrackEvent = createBaseTrackEvent(str);
            if (jSONObjectCreateBaseTrackEvent == null) {
                jSONObjectCreateBaseTrackEvent = new JSONObject();
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("local_payment_id", AnalyticsUtil.getLocalPaymentId());
            jSONObjectCreateBaseTrackEvent.put("properties", jSONObject);
            l$1_I$l$(jSONObjectCreateBaseTrackEvent);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in adding properties to base json for event tracking");
        }
    }

    static void trackEvent(String str) {
        trackEvent(str, new JSONObject());
    }

    static void trackErrorEvent(String str, JSONObject jSONObject, String str2) {
        l$1_I$l$(str, jSONObject, str2);
    }

    static void trackExceptionEvent(String str, JSONObject jSONObject, String str2) {
        l$1_I$l$(str, jSONObject, str2);
    }

    private static void l$1_I$l$(String str, JSONObject jSONObject, String str2) {
        try {
            JSONObject jSONObjectCreateBaseTrackEvent = createBaseTrackEvent(str);
            if (jSONObjectCreateBaseTrackEvent == null) {
                jSONObjectCreateBaseTrackEvent = new JSONObject();
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("local_payment_id", AnalyticsUtil.getLocalPaymentId());
            jSONObjectCreateBaseTrackEvent.put("properties", jSONObject);
            if (str2 != null && !str2.isEmpty()) {
                jSONObjectCreateBaseTrackEvent.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
            }
            l$1_I$l$(jSONObjectCreateBaseTrackEvent);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in tracking event with value/content");
        }
    }

    static void trackEventWithMetric(String str, JSONObject jSONObject, long j) {
        try {
            JSONObject jSONObjectCreateBaseTrackEvent = createBaseTrackEvent(str);
            if (jSONObjectCreateBaseTrackEvent == null) {
                jSONObjectCreateBaseTrackEvent = new JSONObject();
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("local_payment_id", AnalyticsUtil.getLocalPaymentId());
            jSONObjectCreateBaseTrackEvent.put("properties", jSONObject);
            jSONObjectCreateBaseTrackEvent.put("metric", j);
            l$1_I$l$(jSONObjectCreateBaseTrackEvent);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in tracking event with metric");
        }
    }

    static void trackPage(String str, String str2) {
        StringBuilder sb = new StringBuilder("Viewed ");
        sb.append(str);
        sb.append(" Page");
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put("url", str2);
        trackEvent(string, map);
    }

    static JSONObject addGlobalProperties(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.has("properties") ? jSONObject.getJSONObject("properties") : null;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("merchant_app_name", AnalyticsUtil.MERCHANT_APP_NAME);
            jSONObject2.put("merchant_app_version", AnalyticsUtil.MERCHANT_APP_VERSION);
            jSONObject2.put("merchant_app_package", AnalyticsUtil.MERCHANT_APP_NAMESPACE);
            jSONObject2.put("merchant_app_target_sdk", AnalyticsUtil.MERCHANT_APP_TARGET_SDK);
            jSONObject2.put("merchant_app_build", AnalyticsUtil.MERCHANT_APP_BUILD);
            jSONObject2.put("platform", "mobile_sdk");
            jSONObject2.put("platform_version", ll_$$111);
            jSONObject2.put("os", LogSubCategory.LifeCycle.ANDROID);
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("library", AnalyticsUtil.libraryType);
            for (Map.Entry<String, Object> entry : $$II__1$l_.entrySet()) {
                try {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error adding analytics property ");
                    sb.append(entry.getKey());
                    sb.append(" to JSONObject");
                    AnalyticsUtil.reportError(message, "S0", sb.toString());
                }
            }
            for (Map.Entry<String, Object> entry2 : II1$II$_1.entrySet()) {
                try {
                    jSONObject2.put(entry2.getKey(), entry2.getValue());
                } catch (Exception e2) {
                    String message2 = e2.getMessage();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error adding analytics property ");
                    sb2.append(entry2.getKey());
                    sb2.append(" to JSONObject");
                    AnalyticsUtil.reportError(message2, "S0", sb2.toString());
                }
            }
            jSONObject.put("properties", jSONObject2);
            if (CoreConfig.getInstance().isLumberjackV2Enabled().booleanValue()) {
                jSONObject.put("event_type", _l_1l__());
                jSONObject.put("event_version", "v2");
                jSONObject.put("origin", I__1l());
                jSONObject.put("uuid", _l_l_1IlI);
                jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
                jSONObject.put("build_id", ll_$$111);
                jSONObject.put("platform", 2L);
                jSONObject.put("env", 1L);
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                Object obj = II1$II$_1.get("merchant_key");
                if (obj != null) {
                    jSONObject.put("merchant_key", obj.toString());
                }
                jSONObject.put(PaymentConstants.MERCHANT_ID, "");
                Object obj2 = II1$II$_1.get(PaymentConstants.ORDER_ID);
                if (obj2 != null) {
                    jSONObject.put(PaymentConstants.ORDER_ID, obj2.toString());
                }
                Object obj3 = $$II__1$l_.get("method");
                if (obj3 != null) {
                    jSONObject.put("method", obj3.toString());
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    static void postData() {
        synchronized (l$$$11Il1) {
            JSONObject jSONObjectFilterPayload = filterPayload(l$$$11Il1);
            l$$$11Il1 = jSONObjectFilterPayload;
            Logger.d(jSONObjectFilterPayload.toString());
            __l1_(l$$$11Il1);
        }
        _$_l_$1l$();
    }

    private static void __l1_(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            if (!CoreConfig.getInstance().isLumberjackEnabled().booleanValue() || CoreConfig.getInstance().isVersionBlocked(ll_$$111) || jSONArray.length() == 0) {
                return;
            }
            HashMap map = new HashMap();
            map.put("x-identifier", CoreConfig.getInstance().getLumberjackSdkIdentifier());
            map.put(RtspHeaders.CONTENT_TYPE, "application/json");
            Logger.d("Sending data to lumberjack");
            l$1_I$l$(jSONObject, jSONArray);
            String string = jSONObject.toString();
            String str$I__I = $I__I();
            String trackUrl = GlobalUrlConfig.instance().getTrackUrl();
            if (!str$I__I.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(trackUrl);
                sb.append("?key_id=");
                sb.append(str$I__I);
                trackUrl = sb.toString();
            }
            Owl.post(trackUrl, string, map, new Callback() { // from class: com.razorpay.Lumberjack.1
                @Override // com.razorpay.Callback
                public void run(ResponseObject responseObject) {
                    StringBuilder sb2 = new StringBuilder("Response from lumberjack: ");
                    sb2.append(responseObject.getResponseResult());
                    Logger.d(sb2.toString());
                }
            });
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "makePostRequest: failed to read events array");
        }
    }

    private static void l$1_I$l$(JSONObject jSONObject, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(LogCategory.CONTEXT);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 == null) {
                StringBuilder sb = new StringBuilder("Lumberjack event verification: index=");
                sb.append(i);
                sb.append(", event=<non-json>, properties={}, context=");
                sb.append(jSONObjectOptJSONObject);
                Logger.d(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Lumberjack event verification: index=");
                sb2.append(i);
                sb2.append(", event=");
                sb2.append(jSONObjectOptJSONObject2.optString("event"));
                sb2.append(", properties=");
                sb2.append(jSONObjectOptJSONObject2.optJSONObject("properties"));
                sb2.append(", context=");
                sb2.append(jSONObjectOptJSONObject);
                Logger.d(sb2.toString());
            }
        }
    }

    private static void _$_l_$1l$() {
        try {
            JSONObject jSONObject = l$$$11Il1;
            if (jSONObject == null) {
                return;
            }
            synchronized (jSONObject) {
                l$$$11Il1.put("events", new JSONArray());
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
    }

    static void init(Context context, String str, String str2) {
        $l_I$1();
        I1I_l1 = str;
        ll_$$111 = str2;
        _l_l_1IlI = BaseConfig.getAdvertisingId(context);
        l$Illl.clear();
        setBaseImportJSON(context);
        llIl = true;
        IIII$1$_I();
        transmitSavedEvents(context);
    }

    static void transmitSavedEvents(Context context) {
        String protectedValue = SharedPreferenceUtil.getProtectedValue(context, l$1_I$l$, null);
        if (protectedValue == null || protectedValue.isEmpty()) {
            return;
        }
        try {
            __l1_(new JSONObject(protectedValue));
            SharedPreferenceUtil.removeValue(context, l$1_I$l$);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
        }
    }

    private static void IIII$1$_I() {
        Iterator<JSONObject> it = ___I1$lI.iterator();
        while (it.hasNext()) {
            l$1_I$l$(it.next());
        }
        $lll$_lIl();
    }

    private static void $lll$_lIl() {
        ___I1$lI = new ArrayList<>();
    }

    private static void l$1_I$l$(JSONObject jSONObject, String str, AnalyticsProperty.Scope scope) {
        try {
            Object valueFromJsonObject = getValueFromJsonObject(jSONObject, str);
            if (valueFromJsonObject != null) {
                if (scope == AnalyticsProperty.Scope.PAYMENT) {
                    addPaymentProperty(str, valueFromJsonObject);
                } else if (scope == AnalyticsProperty.Scope.ORDER) {
                    addOrderProperty(str, valueFromJsonObject);
                }
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    static Object getValueFromJsonObject(JSONObject jSONObject, String str) {
        try {
            return jSONObject.get(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return null;
        }
    }

    static String getStringFromJsonObject(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return null;
        }
    }

    static boolean getBooleanFromJsonObject(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getBoolean(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return false;
        }
    }

    static void addAmountToProperties(JSONObject jSONObject) {
        try {
            addOrderProperty("amount", Long.valueOf(Long.parseLong(getStringFromJsonObject(jSONObject, "amount"))));
        } catch (Exception unused) {
        }
    }

    static void addFrameworkToProperties(JSONObject jSONObject) {
        try {
            addOrderProperty("framework", jSONObject.has("framework") ? getStringFromJsonObject(jSONObject, "framework") : "native");
        } catch (Exception unused) {
        }
    }

    static void addFilteredPropertiesFromPayload(JSONObject jSONObject) {
        try {
            addAmountToProperties(jSONObject);
            addFrameworkToProperties(jSONObject);
            l$1_I$l$(jSONObject, NotesDispatchAddressRequestKt.KEY_CONTACT, AnalyticsProperty.Scope.ORDER);
            l$1_I$l$(jSONObject, "email", AnalyticsProperty.Scope.ORDER);
            l$1_I$l$(jSONObject, PaymentConstants.ORDER_ID, AnalyticsProperty.Scope.ORDER);
            String stringFromJsonObject = getStringFromJsonObject(jSONObject, "method");
            if (stringFromJsonObject != null) {
                if (jSONObject.has(LoggedUserResponse.KEY_TOKEN)) {
                    stringFromJsonObject = "saved card";
                }
                addPaymentProperty("method", stringFromJsonObject);
                if (stringFromJsonObject.equals("card")) {
                    String stringFromJsonObject2 = getStringFromJsonObject(jSONObject, "card[number]");
                    if (AnalyticsUtil.isNullOrEmpty(stringFromJsonObject2) || stringFromJsonObject2.length() < 6) {
                        return;
                    }
                    addPaymentProperty("card_number", stringFromJsonObject2.substring(0, 6));
                    return;
                }
                if (stringFromJsonObject.equals("saved card")) {
                    boolean booleanFromJsonObject = getBooleanFromJsonObject(jSONObject, "razorpay_otp");
                    StringBuilder sb = new StringBuilder();
                    sb.append(!booleanFromJsonObject);
                    addOrderProperty("Checkout Login", sb.toString());
                    return;
                }
                if (stringFromJsonObject.equals("netbanking")) {
                    l$1_I$l$(jSONObject, PaymentConstants.BANK, AnalyticsProperty.Scope.PAYMENT);
                } else if (stringFromJsonObject.equals("wallet")) {
                    l$1_I$l$(jSONObject, "wallet", AnalyticsProperty.Scope.PAYMENT);
                } else if (stringFromJsonObject.equals(PaymentConstants.WIDGET_UPI)) {
                    addPaymentProperty("flow", getStringFromJsonObject(jSONObject, "_[flow]"));
                }
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Failed to add props to lumberjack: ");
            sb2.append(e.getMessage());
            Logger.d(sb2.toString());
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    static void destroy() {
        $l_I$1();
        I1lII();
        clearOrderProperties();
        clearPaymentProperties();
        __II$$();
        l$Illl.clear();
        llIl = false;
    }

    static void clearPaymentProperties() {
        $$II__1$l_ = new ConcurrentHashMap();
    }

    static void clearOrderProperties() {
        II1$II$_1 = new ConcurrentHashMap();
    }

    private static void __II$$() {
        _$_l_$1l$();
        $lll$_lIl();
    }

    private static void __Il11I1l() {
        if (llIl) {
            synchronized (_1__) {
                ScheduledFuture<?> scheduledFuture = I__1l;
                if (scheduledFuture == null || scheduledFuture.isCancelled() || I__1l.isDone()) {
                    ScheduledExecutorService scheduledExecutorService = _l_1l__;
                    if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                        _l_1l__ = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.razorpay.Lumberjack$$ExternalSyntheticLambda1
                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return Lumberjack.l$1_I$l$(runnable);
                            }
                        });
                    }
                    I__1l = _l_1l__.scheduleWithFixedDelay(new Runnable() { // from class: com.razorpay.Lumberjack$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Lumberjack.$$_$I1l1_();
                        }
                    }, 10L, 10L, TimeUnit.SECONDS);
                    Logger.d("Lumberjack: Started time-based flush timer (10s interval)");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread l$1_I$l$(Runnable runnable) {
        Thread thread = new Thread(runnable, "Lumberjack-FlushTimer");
        thread.setDaemon(true);
        return thread;
    }

    private static void $l_I$1() {
        synchronized (_1__) {
            ScheduledFuture<?> scheduledFuture = I__1l;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                I__1l = null;
                Logger.d("Lumberjack: Stopped time-based flush timer");
            }
        }
    }

    private static void I1lII() {
        synchronized (_1__) {
            ScheduledExecutorService scheduledExecutorService = _l_1l__;
            if (scheduledExecutorService != null) {
                try {
                    scheduledExecutorService.shutdownNow();
                } catch (Exception e) {
                    Logger.e("Error shutting down flush scheduler", e);
                }
                _l_1l__ = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void $$_$I1l1_() {
        int length;
        if (!llIl) {
            $l_I$1();
            return;
        }
        try {
            synchronized (l$$$11Il1) {
                JSONArray jSONArrayOptJSONArray = l$$$11Il1.optJSONArray("events");
                length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
            }
            if (length > 0) {
                StringBuilder sb = new StringBuilder("Lumberjack: Time-based flush triggered (");
                sb.append(length);
                sb.append(" events)");
                Logger.d(sb.toString());
                postData();
            }
            synchronized (l$$$11Il1) {
                JSONArray jSONArrayOptJSONArray2 = l$$$11Il1.optJSONArray("events");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                    $l_I$1();
                }
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", "Error in timed flush");
        }
    }

    static JSONObject filterPayload(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            String lumberjackAllowedEventsRegex = CoreConfig.getInstance().getLumberjackAllowedEventsRegex();
            StringBuilder sb = new StringBuilder("Lumberjack event verification: allowed_events_regex=");
            sb.append(lumberjackAllowedEventsRegex);
            Logger.d(sb.toString());
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            if (lumberjackAllowedEventsRegex == null || lumberjackAllowedEventsRegex.trim().isEmpty()) {
                while (i < jSONArray.length()) {
                    jSONArray2.put(filterEvent(jSONArray.getJSONObject(i)));
                    i++;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str : lumberjackAllowedEventsRegex.split(",")) {
                    String strTrim = str.trim();
                    if ("default".equals(strTrim)) {
                        arrayList.addAll($lIII_$$);
                    } else if (!strTrim.isEmpty()) {
                        arrayList.add(strTrim);
                    }
                }
                while (i < jSONArray.length()) {
                    JSONObject jSONObjectFilterEvent = filterEvent(jSONArray.getJSONObject(i));
                    if (l$1_I$l$(jSONObjectFilterEvent.optString("event", ""), arrayList)) {
                        jSONArray2.put(jSONObjectFilterEvent);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Lumberjack event verification: dropped event=");
                        sb2.append(jSONObjectFilterEvent.optString("event", ""));
                        sb2.append(", allowed_events_regex=");
                        sb2.append(lumberjackAllowedEventsRegex);
                        sb2.append(", properties=");
                        sb2.append(jSONObjectFilterEvent.optJSONObject("properties"));
                        Logger.d(sb2.toString());
                    }
                    i++;
                }
            }
            jSONObject.put("events", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            Logger.e("Error in filtering payload", e);
            return jSONObject;
        }
    }

    private static boolean l$1_I$l$(String str, List<String> list) {
        for (String str2 : list) {
            try {
                if (str2.contains(")+") || str2.contains(")*") || str2.contains(")?") || str2.contains("}+") || str2.contains("}*")) {
                    Logger.w("Lumberjack: skipping potentially unsafe regex pattern");
                } else if (str.matches(str2)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    static JSONObject filterEvent(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("properties")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
            if (jSONObject2.has("url")) {
                jSONObject2.put("url", filterUrl(jSONObject2.getString("url")));
            }
            jSONObject.put("properties", jSONObject2);
        }
        return jSONObject;
    }

    static String filterUrl(String str) {
        return str.startsWith("data:") ? "Data present in url" : str;
    }

    static JSONObject getLumberjackPayload() {
        return l$$$11Il1;
    }

    static JSONObject getContextPayload() {
        return ___Il$;
    }

    static ArrayList<JSONObject> getPreInitBatch() {
        return ___I1$lI;
    }

    static Map<String, Object> getPaymentProperties() {
        return $$II__1$l_;
    }

    static Map<String, Object> getOrderProperties() {
        return II1$II$_1;
    }

    static void saveEventsToPreferences(Context context) {
        synchronized (l$$$11Il1) {
            SharedPreferenceUtil.setProtectedValue(context, l$1_I$l$, filterPayload(l$$$11Il1).toString(), ll_$$111);
        }
    }

    static JSONObject getSessionCreatedJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", CoreConfig.getInstance().getLumberjackKey());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "checkout.mobile.sessionCreated.metrics");
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "session_created");
            jSONObject3.put("platform", LogSubCategory.LifeCycle.ANDROID);
            StringBuilder sb = new StringBuilder();
            sb.append(I1I_l1);
            sb.append("_android_");
            sb.append(AnalyticsUtil.getFramework());
            jSONObject3.put("framework", sb.toString());
            jSONArray2.put(jSONObject3);
            jSONObject2.put("labels", jSONArray2);
            jSONArray.put(jSONObject2);
            jSONObject.put("metrics", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return jSONObject;
        }
    }

    static JSONObject getSessionErroredJson(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", CoreConfig.getInstance().getLumberjackKey());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "checkout.mobile.sessionErrored.metrics");
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "session_errored");
            jSONObject3.put("platform", LogSubCategory.LifeCycle.ANDROID);
            StringBuilder sb = new StringBuilder();
            sb.append(I1I_l1);
            sb.append("_android_");
            sb.append(AnalyticsUtil.getFramework());
            jSONObject3.put("framework", sb.toString());
            jSONObject3.put("severity", str);
            jSONArray2.put(jSONObject3);
            jSONObject2.put("labels", jSONArray2);
            jSONArray.put(jSONObject2);
            jSONObject.put("metrics", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return jSONObject;
        }
    }

    static void logVajraCritialError(String str) {
        _llI(getSessionErroredJson(str));
    }

    private static void _llI(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("accept", "application/json");
        map.put("content-type", "applications/json");
        Owl.post("https://lumberjack-metrics.razorpay.com/v1/frontend-metrics", jSONObject.toString(), map, new Callback() { // from class: com.razorpay.Lumberjack.2
            @Override // com.razorpay.Callback
            public void run(ResponseObject responseObject) {
                StringBuilder sb = new StringBuilder("Response from vjDash: ");
                sb.append(responseObject.getResponseResult());
                Logger.d(sb.toString());
            }
        });
    }
}
