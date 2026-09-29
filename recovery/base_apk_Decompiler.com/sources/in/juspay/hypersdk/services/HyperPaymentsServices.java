package in.juspay.hypersdk.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.PrefetchServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.data.JuspayResponseHandlerDummyImpl;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.LogType;
import in.juspay.hypersdk.utils.TrackerFallback;
import in.juspay.hypersdk.utils.network.NetUtils;
import in.juspay.services.TenantParams;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.maybeGetTypeVariable;
import kotlin.onRemoveQueueItemAt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class HyperPaymentsServices {
    private static final String LOG_TAG = "HyperPaymentsServices";
    private static final String REQUEST_ID = "requestId";
    protected maybeGetTypeVariable activity;
    private final HashMap<WeakReference<maybeGetTypeVariable>, String> activityIds;
    protected ViewGroup container;
    private final Context context;
    private String currentActivityId;
    private HyperExceptionHandler hyperExceptionHandler;
    protected boolean jpConsumingBackPress;
    private final JuspayServices juspayServices;
    protected HyperPaymentsCallback merchantCallback;
    private final onRemoveQueueItemAt onBackPressedCallback;
    private final Set<String> onBackPressedCallbackSet;
    private final Queue<Runnable> processWaitingQueue;
    private final AtomicReference<SDKState> sdkStateReference;
    private final TrackerFallback trackerFallBack;

    /* JADX INFO: renamed from: in.juspay.hypersdk.services.HyperPaymentsServices$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$services$SDKState;

        static {
            int[] iArr = new int[SDKState.values().length];
            $SwitchMap$in$juspay$hypersdk$services$SDKState = iArr;
            try {
                iArr[SDKState.INSTANTIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$services$SDKState[SDKState.INITIATE_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$services$SDKState[SDKState.INITIATE_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$services$SDKState[SDKState.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static class HyperExceptionHandler implements Thread.UncaughtExceptionHandler {
        private static final String LOG_TAG = "UncaughtExceptionHandler";
        private WeakReference<HyperPaymentsServices> hyperPaymentServices;
        private Thread.UncaughtExceptionHandler merchantHandler;

        HyperExceptionHandler(HyperPaymentsServices hyperPaymentsServices) {
            this.hyperPaymentServices = new WeakReference<>(hyperPaymentsServices);
            SdkTracker.trackBootLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.EXCEPTION_HANDLER, "ExceptionHandler", "created HyperExceptionHandler");
        }

        public void clearHyperExceptionHandler() {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.merchantHandler;
            if (uncaughtExceptionHandler == null || !(uncaughtExceptionHandler instanceof HyperExceptionHandler)) {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            this.hyperPaymentServices = new WeakReference<>(null);
            this.merchantHandler = null;
            SdkTracker.trackBootLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.EXCEPTION_HANDLER, "ExceptionHandler", "destroyed HyperExceptionHandler and registered merchant's exception handler as default");
        }

        public void setAsDefaultExceptionHandler() {
            this.merchantHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
            SdkTracker.trackBootLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.EXCEPTION_HANDLER, "ExceptionHandler", "registered HyperExceptionHandler as default uncaught exception handler");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            HyperPaymentsServices hyperPaymentsServices = this.hyperPaymentServices.get();
            if (hyperPaymentsServices != null) {
                JuspayLogger.w(LOG_TAG, "sending crash to tracker");
                hyperPaymentsServices.uncaughtException(th);
            }
            if (this.merchantHandler != null) {
                JuspayLogger.w(LOG_TAG, "forwarding crash to merchant");
                this.merchantHandler.uncaughtException(thread, th);
            } else {
                JuspayLogger.e(LOG_TAG, "merchant exception handler not found, exiting");
                System.exit(1);
            }
        }
    }

    public HyperPaymentsServices(Context context) {
        this(context, (TenantParams) null, (String) null);
    }

    private void doProcess(final JSONObject jSONObject) {
        try {
            logSafeEvents("info", Labels.HyperSdk.PROCESS, "started", jSONObject);
            this.trackerFallBack.log(jSONObject, this.juspayServices, LogType.PROCESS_START);
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            ViewGroup viewGroup = this.container;
            jSONObject2.put("merchant_root_view", viewGroup != null ? String.valueOf(viewGroup.getId()) : -1);
            maybeGetTypeVariable maybegettypevariable = this.activity;
            jSONObject2.put("merchant_keyboard_mode", maybegettypevariable != null ? maybegettypevariable.getWindow().getAttributes().softInputMode : -1);
            jSONObject2.put("processStartedTime", System.currentTimeMillis());
            jSONObject2.put("currentActivityId", this.currentActivityId);
            jSONObject.put("payload", jSONObject2);
            this.juspayServices.setUpMerchantFragments(jSONObject2);
        } catch (JSONException unused) {
        }
        if (!jSONObject.has("requestId")) {
            logSafeEvents("error", Labels.HyperSdk.PROCESS, "request_id_present", Boolean.FALSE);
        } else {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m364lambda$doProcess$7$injuspayhypersdkservicesHyperPaymentsServices(jCurrentTimeMillis, jSONObject);
                }
            });
        }
    }

    private String getIdForActivity(maybeGetTypeVariable maybegettypevariable) {
        for (Map.Entry<WeakReference<maybeGetTypeVariable>, String> entry : this.activityIds.entrySet()) {
            if (entry.getKey().get() == maybegettypevariable) {
                return entry.getValue();
            }
        }
        String string = UUID.randomUUID().toString();
        this.activityIds.put(new WeakReference<>(maybegettypevariable), string);
        return string;
    }

    public static JSONObject getVersions(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PaymentConstants.SDK_VERSION, IntegrationUtils.getSdkVersion(context));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private void initiateNotCalled() {
        throw new IllegalStateException("initiate() must be called before calling process()");
    }

    private void initiateTerminated(JSONObject jSONObject) {
        notifyMerchant("JP_017", "process() called after terminate()", "process_result", jSONObject);
        logSafeEvents("error", Labels.HyperSdk.PROCESS, "interrupted", "process() called after terminate()");
    }

    private void logSafeEvents(String str, String str2, String str3, Object obj) {
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, str, str2, str3, obj);
    }

    private void logSafeExceptions(String str, String str2, String str3, Throwable th) {
        this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, str, str2, str3, th);
    }

    private void notifyMerchant(String str, String str2, String str3, JSONObject jSONObject) {
        HyperPaymentsCallback hyperPaymentsCallback = this.merchantCallback;
        if (hyperPaymentsCallback != null) {
            logSafeEvents("error", str3.equals("initiate_result") ? Labels.HyperSdk.INITIATE : Labels.HyperSdk.PROCESS, "ended", notifyMerchant(hyperPaymentsCallback, str, str2, str3, jSONObject));
        }
    }

    private boolean objectMatch(Object obj, Object obj2) {
        if (Objects.equals(obj, null) || Objects.equals(obj2, null) || !obj.getClass().equals(obj2.getClass())) {
            return false;
        }
        if (!(obj2 instanceof JSONObject)) {
            return obj2 instanceof String ? obj2.equals(obj) : obj == obj2;
        }
        JSONObject jSONObject = (JSONObject) obj2;
        if (jSONObject.length() == 0) {
            return false;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!objectMatch(jSONObject2.opt(next), jSONObject.opt(next))) {
                return false;
            }
        }
        return true;
    }

    public static void preFetch(Context context, JSONObject jSONObject) {
        PrefetchServices.preFetch(context, jSONObject, jSONObject.has("clientId") ? jSONObject.optString("clientId", null) : null);
    }

    private void runProcessWaitQueue() {
        ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m370lambda$runProcessWaitQueue$4$injuspayhypersdkservicesHyperPaymentsServices();
            }
        });
    }

    private void setupJuspayServices(final JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        this.merchantCallback = hyperPaymentsCallback;
        modifyParams(jSONObject);
        this.juspayServices.setBundleParameter(jSONObject);
        this.juspayServices.setHyperCallback(new HyperPaymentsCallbackAdapter() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices.2
            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
            public WebViewClient createJuspaySafeWebViewClient() {
                return HyperPaymentsServices.this.merchantCallback.createJuspaySafeWebViewClient();
            }

            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
            public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
                return HyperPaymentsServices.this.merchantCallback.getMerchantView(viewGroup, merchantViewType);
            }

            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
            public void onEvent(JSONObject jSONObject2, JuspayResponseHandler juspayResponseHandler) {
                if (HyperPaymentsServices.this.handleOnEvent(jSONObject2)) {
                    HyperPaymentsServices.this.merchantCallback.onEvent(jSONObject2, juspayResponseHandler);
                }
            }

            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
            public void onStartWaitingDialogCreated(View view) {
                HyperPaymentsServices.this.merchantCallback.onStartWaitingDialogCreated(view);
            }
        });
        this.juspayServices.initiate(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m371lambda$setupJuspayServices$1$injuspayhypersdkservicesHyperPaymentsServices(jSONObject);
            }
        });
    }

    private boolean shouldPushExp(String str, JSONObject jSONObject) {
        if (!this.juspayServices.getLogManager().getExperimentalEnabled()) {
            return false;
        }
        try {
            JSONObject jSONObjectOptJSONObject = this.juspayServices.getSdkConfigService().getSdkConfig().optJSONObject("logsConfig");
            if (jSONObjectOptJSONObject == null) {
                return true;
            }
            if (str.equals(jSONObjectOptJSONObject.optString("bufferLogsTill", str))) {
                return shouldStopBuffer(jSONObjectOptJSONObject, jSONObject);
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean shouldStopBuffer(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!jSONObject.has("dontStopBufferOn")) {
            return true;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("dontStopBufferOn");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (objectMatch(jSONObject2, jSONArray.get(i))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uncaughtException(final Throwable th) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m373lambda$uncaughtException$9$injuspayhypersdkservicesHyperPaymentsServices(th);
            }
        });
    }

    protected boolean checkAndStartInitiate(JSONObject jSONObject) {
        SDKState sDKState = this.sdkStateReference.get();
        SDKState sDKState2 = SDKState.INITIATE_STARTED;
        if (sDKState == sDKState2 || sDKState == SDKState.INITIATE_COMPLETED) {
            notifyMerchant("JP_017", "initiate() can only be called once without terminate()", "initiate_result", jSONObject);
            logSafeEvents("error", Labels.HyperSdk.INITIATE, "interrupted", "initiate() can only be called once without terminate()");
            return false;
        }
        this.sdkStateReference.set(sDKState2);
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "started", "Started initiating the SDK");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean handleOnEvent(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.services.HyperPaymentsServices.handleOnEvent(org.json.JSONObject):boolean");
    }

    public void initiate(maybeGetTypeVariable maybegettypevariable, ViewGroup viewGroup, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        this.container = viewGroup;
        initiate(maybegettypevariable, jSONObject, hyperPaymentsCallback);
    }

    public boolean isInitialised() {
        SDKState sDKState = this.sdkStateReference.get();
        boolean z = sDKState == SDKState.INITIATE_STARTED || sDKState == SDKState.INITIATE_COMPLETED;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdkState", String.valueOf(sDKState));
            jSONObject.put("isInitialised", z);
        } catch (JSONException unused) {
        }
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "isInitialised()", jSONObject);
        return z;
    }

    /* JADX INFO: renamed from: lambda$doProcess$7$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m364lambda$doProcess$7$injuspayhypersdkservicesHyperPaymentsServices(long j, JSONObject jSONObject) {
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.DEBUG, Labels.HyperSdk.PROCESS, "main_thread_handover", Long.valueOf(System.currentTimeMillis() - j));
        this.juspayServices.onMerchantEvent(Labels.HyperSdk.PROCESS, jSONObject);
    }

    /* JADX INFO: renamed from: lambda$handleOnEvent$0$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m365lambda$handleOnEvent$0$injuspayhypersdkservicesHyperPaymentsServices() {
        this.onBackPressedCallback.setEnabled(this.jpConsumingBackPress);
    }

    /* JADX INFO: renamed from: lambda$initiate$2$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m366lambda$initiate$2$injuspayhypersdkservicesHyperPaymentsServices() {
        if (this.hyperExceptionHandler == null) {
            this.hyperExceptionHandler = new HyperExceptionHandler(this);
        }
        this.hyperExceptionHandler.setAsDefaultExceptionHandler();
    }

    /* JADX INFO: renamed from: lambda$initiate$3$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m367lambda$initiate$3$injuspayhypersdkservicesHyperPaymentsServices(long j, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.DEBUG, Labels.HyperSdk.INITIATE, "main_thread_handover", Long.valueOf(System.currentTimeMillis() - j));
        setupJuspayServices(jSONObject, hyperPaymentsCallback);
    }

    /* JADX INFO: renamed from: lambda$process$6$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m369lambda$process$6$injuspayhypersdkservicesHyperPaymentsServices(maybeGetTypeVariable maybegettypevariable) {
        try {
            maybegettypevariable.getIconCompatParcelizer().read(this.onBackPressedCallback);
        } catch (Exception e) {
            logSafeExceptions(LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.ON_BACKPRESSED_CALLBACK, "Exception while adding onBackPressedCallback", e);
        }
    }

    /* JADX INFO: renamed from: lambda$runProcessWaitQueue$4$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m370lambda$runProcessWaitQueue$4$injuspayhypersdkservicesHyperPaymentsServices() {
        logSafeEvents("info", Labels.HyperSdk.PROCESS_WAIT_QUEUE, "pending_processes", Integer.valueOf(this.processWaitingQueue.size()));
        while (!this.processWaitingQueue.isEmpty()) {
            Runnable runnablePoll = this.processWaitingQueue.poll();
            if (runnablePoll != null) {
                runnablePoll.run();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setupJuspayServices$1$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m371lambda$setupJuspayServices$1$injuspayhypersdkservicesHyperPaymentsServices(JSONObject jSONObject) {
        this.sdkStateReference.set(SDKState.INITIATE_COMPLETED);
        notifyMerchant("JP_020", "No web view is present in the device", "initiate_result", jSONObject);
    }

    /* JADX INFO: renamed from: lambda$terminate$8$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m372lambda$terminate$8$injuspayhypersdkservicesHyperPaymentsServices(long j) {
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.DEBUG, Labels.HyperSdk.TERMINATE, "main_thread_handover", Long.valueOf(System.currentTimeMillis() - j));
        try {
            this.juspayServices.terminate();
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.TERMINATE, "Failed to remove the fragment", e);
        }
        this.container = null;
        this.activity = null;
    }

    /* JADX INFO: renamed from: lambda$uncaughtException$9$in-juspay-hypersdk-services-HyperPaymentsServices, reason: not valid java name */
    /* synthetic */ void m373lambda$uncaughtException$9$injuspayhypersdkservicesHyperPaymentsServices(Throwable th) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        sdkTracker.addLogToPersistedQueue(sdkTracker.getExceptionLog(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.System.SDK_CRASHED, "SDK Crashed Uncaught exception handler", th));
    }

    protected void modifyParams(JSONObject jSONObject) {
        try {
            jSONObject.put("service_based", true);
            jSONObject.put("use_local_assets", jSONObject.optBoolean("useLocalAssets", this.context.getResources().getBoolean(R.bool.use_local_assets)));
            jSONObject.getJSONObject("payload").put("currentActivityId", this.currentActivityId);
        } catch (Exception e) {
            JuspayLogger.e(LOG_TAG, "Failed to write to JSON", e);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.juspayServices.onActivityResult(i & 65535, i2, intent);
    }

    public boolean onBackPressed() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consuming_backpress", this.jpConsumingBackPress);
            jSONObject.put("triggered_on", "HyperPaymentsServices.onBackPressed()");
        } catch (Exception unused) {
        }
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.ANDROID, "info", Labels.Android.BACK_PRESSED, jSONObject);
        if (!this.jpConsumingBackPress) {
            return false;
        }
        this.juspayServices.onBackPressed();
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.juspayServices.onRequestPermissionsResult(i & 65535, strArr, iArr);
    }

    public void process(maybeGetTypeVariable maybegettypevariable, JSONObject jSONObject) {
        m368lambda$process$5$injuspayhypersdkservicesHyperPaymentsServices(maybegettypevariable, (ViewGroup) maybegettypevariable.getWindow().getDecorView().findViewById(android.R.id.content), jSONObject);
    }

    public void resetActivity(maybeGetTypeVariable maybegettypevariable) {
        if (maybegettypevariable != this.activity) {
            return;
        }
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.TERMINATE, "resetActivity()", "called");
        this.juspayServices.reset();
        final onRemoveQueueItemAt onremovequeueitemat = this.onBackPressedCallback;
        Objects.requireNonNull(onremovequeueitemat);
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                onremovequeueitemat.remove();
            }
        });
        this.onBackPressedCallbackSet.clear();
        this.activity = null;
        this.currentActivityId = null;
        this.container = null;
    }

    public void setActivityLaunchDelegate(ActivityLaunchDelegate activityLaunchDelegate) {
        this.juspayServices.setActivityLaunchDelegate(activityLaunchDelegate);
    }

    public void setIntentSenderDelegate(IntentSenderDelegate intentSenderDelegate) {
        this.juspayServices.setIntentSenderDelegate(intentSenderDelegate);
    }

    public void setRequestPermissionDelegate(RequestPermissionDelegate requestPermissionDelegate) {
        this.juspayServices.setRequestPermissionDelegate(requestPermissionDelegate);
    }

    public void setWebViewConfigurationCallback(JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback) {
        this.juspayServices.setWebViewConfigurationCallback(juspayWebViewConfigurationCallback);
    }

    public void terminate(JSONObject jSONObject) {
        logSafeEvents("info", Labels.HyperSdk.TERMINATE_PROCESS, "request", jSONObject);
        this.juspayServices.onMerchantEvent(Labels.HyperSdk.TERMINATE, jSONObject);
    }

    public HyperPaymentsServices(Context context, String str) {
        this(context, (TenantParams) null, str);
    }

    /* JADX INFO: renamed from: process, reason: merged with bridge method [inline-methods] */
    public void m368lambda$process$5$injuspayhypersdkservicesHyperPaymentsServices(final maybeGetTypeVariable maybegettypevariable, final ViewGroup viewGroup, final JSONObject jSONObject) {
        int i = AnonymousClass3.$SwitchMap$in$juspay$hypersdk$services$SDKState[this.sdkStateReference.get().ordinal()];
        if (i == 1) {
            logSafeEvents("error", Labels.HyperSdk.PROCESS, "called_before_initiate", jSONObject);
            initiateNotCalled();
            return;
        }
        if (i == 2) {
            this.trackerFallBack.log(jSONObject, this.juspayServices, LogType.PROCESS_QUEUED);
            logSafeEvents("info", Labels.HyperSdk.PROCESS, "queued", jSONObject);
            this.processWaitingQueue.add(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m368lambda$process$5$injuspayhypersdkservicesHyperPaymentsServices(maybegettypevariable, viewGroup, jSONObject);
                }
            });
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            logSafeEvents("error", Labels.HyperSdk.PROCESS, "called_after_terminate", jSONObject);
            initiateTerminated(jSONObject);
            return;
        }
        logSafeEvents("info", Labels.HyperSdk.PROCESS, "called_and_started", jSONObject);
        if (!this.juspayServices.isWebViewAvailable()) {
            notifyMerchant("JP_020", "No web view is present in the device", "process_result", jSONObject);
            return;
        }
        if (maybegettypevariable != this.activity) {
            logSafeEvents("info", Labels.HyperSdk.PROCESS, "activity_changed", "true");
        }
        if (this.onBackPressedCallbackSet.add(getIdForActivity(maybegettypevariable))) {
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m369lambda$process$6$injuspayhypersdkservicesHyperPaymentsServices(maybegettypevariable);
                }
            });
        }
        this.container = viewGroup;
        this.activity = maybegettypevariable;
        this.currentActivityId = getIdForActivity(maybegettypevariable);
        this.juspayServices.getSessionInfo().addOrderIdInSessionData(jSONObject);
        this.juspayServices.process(maybegettypevariable, this.container);
        if (shouldPushExp(Labels.HyperSdk.PROCESS, jSONObject)) {
            this.juspayServices.getLogManager().startPushExp();
        }
        doProcess(jSONObject);
    }

    public HyperPaymentsServices(Context context, TenantParams tenantParams, String str) {
        this.processWaitingQueue = new LinkedList();
        this.onBackPressedCallbackSet = Collections.newSetFromMap(new ConcurrentHashMap());
        this.context = context;
        JuspayCoreLib.setApplicationContext(context.getApplicationContext());
        NetUtils.setApplicationHeaders(context);
        this.activityIds = new HashMap<>();
        this.jpConsumingBackPress = false;
        JuspayServices juspayServices = new JuspayServices(context, tenantParams, str, false);
        this.juspayServices = juspayServices;
        this.hyperExceptionHandler = new HyperExceptionHandler(this);
        this.sdkStateReference = new AtomicReference<>(SDKState.INSTANTIATED);
        this.trackerFallBack = new TrackerFallback(juspayServices.getSdkConfigService().getSdkConfig());
        this.onBackPressedCallback = new onRemoveQueueItemAt(false) { // from class: in.juspay.hypersdk.services.HyperPaymentsServices.1
            @Override // kotlin.onRemoveQueueItemAt
            public void handleOnBackPressed() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("triggered_on", "onBackPressedCallback.handleOnBackPressed()");
                } catch (Exception unused) {
                }
                HyperPaymentsServices.this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.ANDROID, "info", Labels.Android.BACK_PRESSED, jSONObject);
                HyperPaymentsServices.this.juspayServices.onBackPressed();
            }
        };
    }

    public void initiate(maybeGetTypeVariable maybegettypevariable, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        if (this.activity != maybegettypevariable) {
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "activity_changed", "true");
        }
        this.activity = maybegettypevariable;
        this.currentActivityId = getIdForActivity(maybegettypevariable);
        initiate(jSONObject, hyperPaymentsCallback);
    }

    public void terminate() {
        SDKState sDKState = this.sdkStateReference.get();
        SDKState sDKState2 = SDKState.TERMINATED;
        if (sDKState == sDKState2) {
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.WARNING, Labels.HyperSdk.TERMINATE, "started", "Terminate called again, skipping");
            return;
        }
        if (sDKState == SDKState.INSTANTIATED) {
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.WARNING, Labels.HyperSdk.TERMINATE, "started", "Terminate called without initiate, skipping");
            return;
        }
        this.sdkStateReference.set(sDKState2);
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.TERMINATE, "started", "Terminating the SDK");
        this.jpConsumingBackPress = false;
        HyperExceptionHandler hyperExceptionHandler = this.hyperExceptionHandler;
        if (hyperExceptionHandler != null) {
            hyperExceptionHandler.clearHyperExceptionHandler();
            this.hyperExceptionHandler = null;
        }
        resetActivity(this.activity);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m372lambda$terminate$8$injuspayhypersdkservicesHyperPaymentsServices(jCurrentTimeMillis);
            }
        });
        this.juspayServices.getSessionInfo().resetSession();
        this.juspayServices.getLogManager().stopPushTasks();
    }

    private JSONObject notifyMerchant(HyperPaymentsCallback hyperPaymentsCallback, String str, String str2, String str3, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("requestId", jSONObject.optString("requestId", ""));
            jSONObject2.put("service", jSONObject.optString("service", "service"));
            jSONObject2.put("error", true);
            jSONObject2.put("errorCode", str);
            jSONObject2.put("errorMessage", str2);
            jSONObject2.put("event", str3);
            jSONObject2.put("payload", new JSONObject());
            hyperPaymentsCallback.onEvent(jSONObject2, new JuspayResponseHandlerDummyImpl());
            return jSONObject2;
        } catch (Exception e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.HyperSdk.EXIT_SDK_ERROR, "Error while sending response to merchant", e);
            return jSONObject2;
        }
    }

    public static void preFetch(Context context, JSONObject jSONObject, String str) {
        PrefetchServices.preFetch(context, jSONObject, str);
    }

    public void initiate(final JSONObject jSONObject, final HyperPaymentsCallback hyperPaymentsCallback) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            jSONObject2.put("initiateStartedTime", System.currentTimeMillis());
            jSONObject.put("payload", jSONObject2);
        } catch (JSONException unused) {
        }
        if (checkAndStartInitiate(jSONObject)) {
            this.trackerFallBack.log(jSONObject, this.juspayServices, LogType.INITIATE_START);
            this.juspayServices.getSdkTracker().resetSerialNumber();
            this.juspayServices.getSessionInfo().setSessionId();
            this.juspayServices.getLogManager().startPushTasks(shouldPushExp(Labels.HyperSdk.INITIATE, jSONObject));
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "started", jSONObject);
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "fragment_activity_used", String.valueOf(this.activity != null));
            ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m366lambda$initiate$2$injuspayhypersdkservicesHyperPaymentsServices();
                }
            });
            final long jCurrentTimeMillis = System.currentTimeMillis();
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.services.HyperPaymentsServices$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m367lambda$initiate$3$injuspayhypersdkservicesHyperPaymentsServices(jCurrentTimeMillis, jSONObject, hyperPaymentsCallback);
                }
            });
        }
    }

    @Deprecated
    public HyperPaymentsServices(Activity activity) throws InstantiationException {
        String str;
        this.processWaitingQueue = new LinkedList();
        this.onBackPressedCallbackSet = Collections.newSetFromMap(new ConcurrentHashMap());
        if (activity == null) {
            str = "";
        } else {
            str = String.format(" (%s)", activity.getClass().getName());
        }
        StringBuilder sb = new StringBuilder("Instantiating HyperPaymentsServices with plain Activity");
        sb.append(str);
        sb.append(" is not allowed, please pass FragmentActivity");
        throw new InstantiationException(sb.toString());
    }

    public void process(JSONObject jSONObject) {
        SDKState sDKState = this.sdkStateReference.get();
        if (sDKState == SDKState.INSTANTIATED) {
            initiateNotCalled();
            return;
        }
        if (sDKState == SDKState.TERMINATED) {
            initiateTerminated(jSONObject);
            return;
        }
        maybeGetTypeVariable maybegettypevariable = this.activity;
        if (maybegettypevariable == null) {
            notifyMerchant("JP_003", "FragmentActivity needs to be send in process", "process_result", jSONObject);
            return;
        }
        ViewGroup viewGroup = this.container;
        if (viewGroup != null) {
            m368lambda$process$5$injuspayhypersdkservicesHyperPaymentsServices(maybegettypevariable, viewGroup, jSONObject);
        } else {
            process(maybegettypevariable, jSONObject);
        }
    }

    public HyperPaymentsServices(maybeGetTypeVariable maybegettypevariable) {
        this(maybegettypevariable, (ViewGroup) maybegettypevariable.getWindow().getDecorView().findViewById(android.R.id.content), (String) null);
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.HYPER_SERVICE, "view_group", Boolean.FALSE);
    }

    public HyperPaymentsServices(maybeGetTypeVariable maybegettypevariable, String str) {
        this(maybegettypevariable, (ViewGroup) maybegettypevariable.getWindow().getDecorView().findViewById(android.R.id.content), str);
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.HYPER_SERVICE, "view_group", Boolean.FALSE);
    }

    public HyperPaymentsServices(maybeGetTypeVariable maybegettypevariable, ViewGroup viewGroup) {
        this(maybegettypevariable, viewGroup, (String) null);
    }

    public HyperPaymentsServices(maybeGetTypeVariable maybegettypevariable, ViewGroup viewGroup, String str) {
        this(maybegettypevariable, viewGroup, null, str);
    }

    public HyperPaymentsServices(maybeGetTypeVariable maybegettypevariable, ViewGroup viewGroup, TenantParams tenantParams, String str) {
        this(maybegettypevariable.getApplicationContext(), tenantParams, str);
        this.activity = maybegettypevariable;
        this.container = viewGroup;
        this.currentActivityId = getIdForActivity(maybegettypevariable);
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.HYPER_SERVICE, "sdk_create", "success");
    }
}
