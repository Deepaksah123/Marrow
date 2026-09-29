package in.juspay.hypersdk.core;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import in.juspay.hyper.bridge.BridgeList;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.FragmentHooks;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.SessionInfoInterface;
import in.juspay.hyper.core.TrackerInterface;
import in.juspay.hyperapay.APayBridge;
import in.juspay.hyperapayupi.APayUPIBridge;
import in.juspay.hypergpay.GPayBridge;
import in.juspay.hypergpayintl.GPayIntlBridge;
import in.juspay.hypernfc.NfcBridge;
import in.juspay.hyperpaypal.PaypalBridge;
import in.juspay.hyperpayu.PayUBridge;
import in.juspay.hyperqr.QrBridge;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.data.SdkInfo;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.lifecycle.ActivityResultHolder;
import in.juspay.hypersdk.lifecycle.EventListener;
import in.juspay.hypersdk.lifecycle.FragmentEvent;
import in.juspay.hypersdk.lifecycle.HyperActivityLaunchDelegate;
import in.juspay.hypersdk.lifecycle.HyperFragment;
import in.juspay.hypersdk.lifecycle.HyperIntentSenderDelegate;
import in.juspay.hypersdk.lifecycle.HyperRequestPermissionDelegate;
import in.juspay.hypersdk.lifecycle.RequestPermissionResult;
import in.juspay.hypersdk.mystique.Callback;
import in.juspay.hypersdk.ota.ApplicationManager;
import in.juspay.hypersdk.ota.Mode;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.services.SdkConfigService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersimpl.SimplBridge;
import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsEventInterface;
import in.juspay.hypersmshandler.SmsServices;
import in.juspay.hypersmshandler.Tracker;
import in.juspay.hypertrident.TridentBridge;
import in.juspay.hyperupi.UPIBridge;
import in.juspay.mobility.app.MobilityAppBridge;
import in.juspay.mobility.customer.MobilityCustomerBridge;
import in.juspay.mobility.driver.MobilityDriverBridge;
import in.juspay.services.TenantParams;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin._doAddInjectable;
import kotlin.maybeGetTypeVariable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JuspayServices implements FragmentHooks {
    private static final String DEFAULT_WORKSPACE_PATH = "juspay";
    private static final String fragmentTag = "JuspayServiceFragment";
    private maybeGetTypeVariable activity;
    private ActivityLaunchDelegate activityLaunchDelegate;
    private ApplicationManager applicationManager;
    private final BridgeComponents bridgeComponents;
    private final String buildId;
    private JSONObject bundleParameters;
    private final String clientId;
    private FrameLayout container;
    private final Context context;
    private final DynamicUI dynamicUI;
    private final FileProviderService fileProviderService;
    private final EnumSet<FragmentEvent> fragmentEvents;
    private HyperPaymentsCallback hyperCallback;
    private IntentSenderDelegate intentSenderDelegate;
    private boolean isPrefetch;
    private final JBridge jBridge;
    private JSONObject lastProcessPayload;
    private final LogManager logManager;
    private String merchantClientId;
    private final PaymentSessionInfo paymentSessionInfo;
    private final RemoteAssetService remoteAssetService;
    private RequestPermissionDelegate requestPermissionDelegate;
    private final SdkConfigService sdkConfigService;
    private final SdkInfo sdkInfo;
    private final SdkTracker sdkTracker;
    private final SessionInfo sessionInfo;
    private final SmsServices smsServices;
    private final TenantParams tenantParams;
    private JuspayWebViewConfigurationCallback webViewConfigurationCallback;
    Runnable webViewCrashCallback;
    private final Workspace workspace;
    private final String LOG_TAG = getClass().getSimpleName();
    private final BridgeList bridgeList = new BridgeList();
    HyperFragment fragment = null;
    private boolean paused = false;
    private boolean isWebViewAvailable = true;
    SmsComponents smsComponents = new SmsComponents() { // from class: in.juspay.hypersdk.core.JuspayServices.5
        @Override // in.juspay.hypersmshandler.SmsComponents
        public Context getContext() {
            return JuspayServices.this.context;
        }

        @Override // in.juspay.hypersmshandler.SmsComponents
        public SmsEventInterface getSmsEventInterface() {
            return JuspayServices.this.jBridge.getSmsEventInterface();
        }

        @Override // in.juspay.hypersmshandler.SmsComponents
        public Tracker getTracker() {
            return JuspayServices.this.sdkTracker;
        }
    };

    /* JADX INFO: renamed from: in.juspay.hypersdk.core.JuspayServices$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent;

        static {
            int[] iArr = new int[FragmentEvent.values().length];
            $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent = iArr;
            try {
                iArr[FragmentEvent.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.ON_ATTACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JuspayServices(Context context, TenantParams tenantParams, String str, boolean z) {
        this.isPrefetch = false;
        this.clientId = str;
        this.tenantParams = tenantParams;
        this.sdkInfo = IntegrationUtils.getSdkInfo(context);
        this.context = context.getApplicationContext();
        StringBuilder sb = new StringBuilder("jus_");
        sb.append(IntegrationUtils.getSdkVersion(context, "_"));
        sb.append("_");
        sb.append(IntegrationUtils.getAssetAarVersion(context, str));
        this.buildId = sb.toString();
        String tenant = getTenant();
        Workspace workspace = new Workspace(context, str != null ? String.format("%s/%s", tenant, str) : tenant);
        this.workspace = workspace;
        this.isPrefetch = z;
        Callback callback = new Callback() { // from class: in.juspay.hypersdk.core.JuspayServices.1
            @Override // in.juspay.hypersdk.mystique.Callback
            public void onError(String str2, String str3) {
                JuspayLogger.e("DynamicUI", String.format("%s %s", str2, str3));
                JuspayServices.this.sdkTracker.trackAction(LogSubCategory.Action.DUI, "error", Labels.HyperSdk.MYSTIQUE, str2.toLowerCase(Locale.getDefault()), str3);
            }

            @Override // in.juspay.hypersdk.mystique.Callback
            public void onException(String str2, String str3, Throwable th) {
                JuspayLogger.e("DynamicUI", String.format("%s %s", str2, str3));
                JuspayServices.this.sdkTracker.trackException("action", LogSubCategory.Action.DUI, Labels.HyperSdk.MYSTIQUE, str3, th);
            }

            @Override // in.juspay.hypersdk.mystique.Callback
            public void onRenderProcessGone(boolean z2) {
                if (JuspayServices.this.hyperCallback != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("action", "OnRenderProcessGone");
                        jSONObject.put("isRecreating", z2);
                        JuspayServices.this.hyperCallback.onEvent(jSONObject, null);
                    } catch (Exception unused) {
                    }
                    if (JuspayServices.this.bundleParameters != null) {
                        try {
                            JuspayServices.this.bundleParameters.put("isWebViewRecreated", true);
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }

            @Override // in.juspay.hypersdk.mystique.Callback
            public void webViewLoaded(Exception exc) {
                if (exc != null) {
                    JuspayServices juspayServices = JuspayServices.this;
                    if (juspayServices.webViewCrashCallback != null) {
                        juspayServices.isWebViewAvailable = false;
                        JuspayServices.this.webViewCrashCallback.run();
                    }
                }
                JuspayServices.this.webViewCrashCallback = null;
            }
        };
        DuiLogger duiLogger = new DuiLogger() { // from class: in.juspay.hypersdk.core.JuspayServices.2
            @Override // in.juspay.hypersdk.core.DuiLogger
            public void d(String str2, String str3) {
            }

            @Override // in.juspay.hypersdk.core.DuiLogger
            public void e(String str2, String str3) {
                JuspayLogger.e(str2, str3);
                JuspayServices.this.sdkTracker.trackAction(LogSubCategory.Action.DUI, "error", Labels.HyperSdk.MYSTIQUE, str2.toLowerCase(Locale.getDefault()), str3);
            }

            @Override // in.juspay.hypersdk.core.DuiLogger
            public void i(String str2, String str3) {
            }

            @Override // in.juspay.hypersdk.core.DuiLogger
            public void logLifeCycleException(String str2, String str3, Exception exc) {
                JuspayServices.this.sdkTracker.trackAndLogException(JuspayServices.this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.ANDROID, str2, str3, exc);
            }

            @Override // in.juspay.hypersdk.core.DuiLogger
            public void logLifeCycleInfo(String str2, String str3) {
                JuspayServices.this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.JUSPAY_SERVICES, str2, str3);
            }
        };
        DUIMerchantView dUIMerchantView = new DUIMerchantView() { // from class: in.juspay.hypersdk.core.JuspayServices.3
            @Override // in.juspay.hypersdk.core.DUIMerchantView
            public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
                if (JuspayServices.this.getHyperCallback() != null) {
                    return JuspayServices.this.getHyperCallback().getMerchantView(viewGroup, merchantViewType);
                }
                return null;
            }
        };
        SdkTracker sdkTracker = new SdkTracker(this);
        this.sdkTracker = sdkTracker;
        this.sessionInfo = new SessionInfo(this);
        this.fileProviderService = new FileProviderService(this);
        this.remoteAssetService = new RemoteAssetService(this);
        SdkConfigService sdkConfigService = new SdkConfigService(this);
        this.sdkConfigService = sdkConfigService;
        this.logManager = LogManager.registerWorkspace(context, workspace, sdkConfigService.getSdkConfig(), tenantParams != null ? tenantParams.getLogsEndPoint() : null, sdkConfigService);
        this.jBridge = new JBridge(this);
        this.activityLaunchDelegate = new HyperActivityLaunchDelegate(this);
        this.intentSenderDelegate = new HyperIntentSenderDelegate(this);
        this.requestPermissionDelegate = new HyperRequestPermissionDelegate(this);
        BridgeComponents bridgeComponentsCreateBridgeComponents = createBridgeComponents();
        this.bridgeComponents = bridgeComponentsCreateBridgeComponents;
        String baseContent = tenantParams != null ? tenantParams.getBaseContent() : null;
        this.applicationManager = createApplicationManager();
        this.dynamicUI = new DynamicUI(context, duiLogger, callback, bridgeComponentsCreateBridgeComponents, baseContent, getJavaScriptInterfaces(), sdkConfigService.getSdkConfig(), this.applicationManager, dUIMerchantView, z);
        this.paymentSessionInfo = new PaymentSessionInfo(this);
        logMemoryInfo(sdkTracker, context);
        this.fragmentEvents = EnumSet.allOf(FragmentEvent.class);
        this.smsServices = new SmsServices(this.smsComponents);
        final JSONObject jSONObjectOptJSONObject = sdkConfigService.getSdkConfig().optJSONObject("logsConfig");
        if (jSONObjectOptJSONObject != null) {
            ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m333lambda$new$0$injuspayhypersdkcoreJuspayServices(jSONObjectOptJSONObject);
                }
            });
        }
    }

    private void addFragment(final maybeGetTypeVariable maybegettypevariable) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m328lambda$addFragment$11$injuspayhypersdkcoreJuspayServices(maybegettypevariable);
            }
        });
    }

    private void commitFragmentTransaction(_doAddInjectable _doaddinjectable) {
        if (useCommit()) {
            _doaddinjectable.read();
        } else {
            _doaddinjectable.IconCompatParcelizer();
        }
    }

    private BridgeComponents createBridgeComponents() {
        return new BridgeComponents() { // from class: in.juspay.hypersdk.core.JuspayServices.4
            @Override // in.juspay.hyper.core.BridgeComponents
            public Activity getActivity() {
                return JuspayServices.this.activity;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public CallbackInvoker getCallbackInvoker() {
                return JuspayServices.this.jBridge;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public String getClientId() {
                try {
                    return JuspayServices.this.getSessionInfo().getClientId();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public Context getContext() {
                return JuspayServices.this.context;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public FileProviderInterface getFileProviderInterface() {
                return JuspayServices.this.fileProviderService;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public FragmentHooks getFragmentHooks() {
                return JuspayServices.this;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public JsCallback getJsCallback() {
                return JuspayServices.this.dynamicUI;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public JSONObject getSdkConfig() {
                return JuspayServices.this.sdkConfigService.getSdkConfig();
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public String getSdkName() {
                return JuspayServices.this.sdkInfo.getSdkName();
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public SessionInfoInterface getSessionInfoInterface() {
                return JuspayServices.this.sessionInfo;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public TrackerInterface getTrackerInterface() {
                return JuspayServices.this.sdkTracker;
            }
        };
    }

    private FrameLayout createSubLayout(Activity activity) {
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(0);
        return frameLayout;
    }

    private void firstTimeSetup() {
        this.sdkInfo.getSdkName();
        String fromSharedPreference = this.workspace.getFromSharedPreference(PaymentConstants.BUILD_ID, "__failed");
        String str = this.clientId;
        if (str == null) {
            String str2 = this.merchantClientId;
            str = str2 != null ? str2.toLowerCase(Locale.getDefault()).split("_")[0] : null;
        }
        String assetAarVersion = IntegrationUtils.getAssetAarVersion(this.context, str);
        if (assetAarVersion.equals("undefined")) {
            assetAarVersion = IntegrationUtils.getAssetAarVersion(this.context, null);
        }
        StringBuilder sb = new StringBuilder("jus_");
        sb.append(IntegrationUtils.getSdkVersion(this.context, "_"));
        sb.append("_");
        sb.append(assetAarVersion);
        String string = sb.toString();
        if (fromSharedPreference.equals(string)) {
            return;
        }
        this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.FIRST_TIME_SETUP, "started", null);
        this.workspace.writeToSharedPreference(PaymentConstants.BUILD_ID, string);
        this.workspace.removeFromSharedPreference("asset_metadata.json");
        try {
            this.workspace.clean(this.context);
            this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.FIRST_TIME_SETUP, "completed", null);
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.FIRST_TIME_SETUP, "Exception while fetching meta-data for manifest.json file", e);
        }
    }

    private String getBootloaderEndpoint(JSONObject jSONObject) {
        String str;
        String str2;
        String bootLoaderEndpoint;
        TenantParams tenantParams = this.tenantParams;
        if (tenantParams != null && (bootLoaderEndpoint = tenantParams.getBootLoaderEndpoint()) != null) {
            return bootLoaderEndpoint;
        }
        str = "common";
        if (jSONObject == null || !jSONObject.optBoolean(PaymentConstants.BETA_ASSETS, false)) {
            String str3 = this.merchantClientId;
            str = str3 != null ? str3.toLowerCase(Locale.getDefault()).split("_")[0] : "common";
            str2 = "";
        } else {
            str2 = "sandbox.";
        }
        return String.format(Constants.BOOTLOADER_REMOTE_ASSET_PATH_FORMAT, str2, str);
    }

    private Map<String, Object> getJavaScriptInterfaces() {
        HashMap map = new HashMap();
        map.put("JBridge", this.jBridge);
        map.put(this.bridgeList.getInterfaceName(), this.bridgeList);
        if (PaymentUtils.isClassAvailable("in.juspay.hyperupi.UPIBridge")) {
            this.bridgeList.addHyperBridge(new UPIBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperapayupi.APayUPIBridge")) {
            this.bridgeList.addHyperBridge(new APayUPIBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypersimpl.SimplBridge")) {
            this.bridgeList.addHyperBridge(new SimplBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypergpayintl.GPayIntlBridge")) {
            this.bridgeList.addHyperBridge(new GPayIntlBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperapay.APayBridge")) {
            this.bridgeList.addHyperBridge(new APayBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperpaypal.PaypalBridge")) {
            this.bridgeList.addHyperBridge(new PaypalBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperqr.QrBridge")) {
            this.bridgeList.addHyperBridge(new QrBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypernfc.NfcBridge")) {
            this.bridgeList.addHyperBridge(new NfcBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypergpay.GPayBridge")) {
            this.bridgeList.addHyperBridge(new GPayBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperpayu.PayUBridge")) {
            this.bridgeList.addHyperBridge(new PayUBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypertrident.TridentBridge")) {
            this.bridgeList.addHyperBridge(new TridentBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.mobility.customer.MobilityCustomerBridge")) {
            this.bridgeList.addHyperBridge(new MobilityCustomerBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.mobility.driver.MobilityDriverBridge")) {
            this.bridgeList.addHyperBridge(new MobilityDriverBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.mobility.app.MobilityAppBridge")) {
            this.bridgeList.addHyperBridge(new MobilityAppBridge(this.bridgeComponents));
        }
        try {
            TenantParams tenantParams = this.tenantParams;
            if (tenantParams != null) {
                Iterator<Class<? extends HyperBridge>> it = tenantParams.getBridgeClasses().iterator();
                while (it.hasNext()) {
                    for (Constructor<?> constructor : it.next().getConstructors()) {
                        if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0].equals(BridgeComponents.class)) {
                            this.bridgeList.addHyperBridge((HyperBridge) constructor.newInstance(this.bridgeComponents));
                        }
                    }
                }
            }
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.ADD_BRIDGE, "Exception while trying to add tenant bridge", e);
        }
        map.putAll(this.bridgeList.getBridgeList());
        return map;
    }

    private void insetUpdated(WindowInsets windowInsets) {
        float systemWindowInsetTop;
        float systemWindowInsetRight;
        float systemWindowInsetBottom;
        int systemWindowInsetLeft;
        float stableInsetTop;
        float stableInsetRight;
        float stableInsetBottom;
        int stableInsetLeft;
        maybeGetTypeVariable maybegettypevariable = this.activity;
        if (maybegettypevariable == null) {
            return;
        }
        float f = maybegettypevariable.getResources().getDisplayMetrics().density;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            systemWindowInsetTop = r3.top / f;
            systemWindowInsetRight = r3.right / f;
            systemWindowInsetBottom = r3.bottom / f;
            systemWindowInsetLeft = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime()).left;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() / f;
            systemWindowInsetRight = windowInsets.getSystemWindowInsetRight() / f;
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom() / f;
            systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
        }
        float f2 = systemWindowInsetLeft / f;
        if (i >= 30) {
            stableInsetTop = r10.top / f;
            stableInsetRight = r10.right / f;
            stableInsetBottom = r10.bottom / f;
            stableInsetLeft = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).left;
        } else {
            stableInsetTop = windowInsets.getStableInsetTop() / f;
            stableInsetRight = windowInsets.getStableInsetRight() / f;
            stableInsetBottom = windowInsets.getStableInsetBottom() / f;
            stableInsetLeft = windowInsets.getStableInsetLeft();
        }
        float f3 = stableInsetLeft / f;
        StringBuilder sb = new StringBuilder("window.insetUpdated(");
        sb.append(systemWindowInsetTop);
        sb.append(",");
        sb.append(systemWindowInsetRight);
        sb.append(",");
        sb.append(systemWindowInsetBottom);
        sb.append(",");
        sb.append(f2);
        sb.append(",");
        sb.append(stableInsetTop);
        sb.append(",");
        sb.append(stableInsetRight);
        sb.append(",");
        sb.append(stableInsetBottom);
        sb.append(",");
        sb.append(f3);
        sb.append(",)");
        this.dynamicUI.addJsToWebView(sb.toString());
    }

    private void logMemoryInfo(final SdkTracker sdkTracker, final Context context) {
        ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m332lambda$logMemoryInfo$1$injuspayhypersdkcoreJuspayServices(context, sdkTracker);
            }
        });
    }

    private void prefetchBootLoaderFile(JSONObject jSONObject, boolean z) {
        if (z) {
            this.remoteAssetService.renewFile(this.context, getBootloaderEndpoint(jSONObject), null, "v1-boot_loader.zip", System.currentTimeMillis());
        }
    }

    private void removeFragment() {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m336lambda$removeFragment$12$injuspayhypersdkcoreJuspayServices();
            }
        });
    }

    private void resetBridges() {
        Iterator<HyperBridge> it = this.bridgeList.getBridgeList().values().iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
    }

    private void setLastProcessPayload(JSONObject jSONObject) {
        this.lastProcessPayload = jSONObject;
    }

    private boolean useCommit() {
        if (this.merchantClientId == null) {
            return true;
        }
        return !Utils.optJSONObject(this.sdkConfigService.getSdkConfig(), "useCommitNowClientIds").optString(this.merchantClientId.toLowerCase(Locale.getDefault()).split("_")[0]).equals("true");
    }

    public void addJsToWebView(String str) {
        this.dynamicUI.addJsToWebView(str);
    }

    ApplicationManager createApplicationManager() {
        boolean z;
        String string;
        try {
            z = this.sdkConfigService.getSdkConfig().getJSONObject("flags").getBoolean("sendUpdateNetworkMetrics");
        } catch (Exception unused) {
            z = true;
        }
        try {
            string = this.sdkConfigService.getSdkConfig().getJSONObject("url").getJSONObject("assets").getString(PaymentConstants.ENVIRONMENT.PRODUCTION);
        } catch (Exception unused2) {
            string = "https://assets.juspay.in";
        }
        TenantParams tenantParams = this.tenantParams;
        return new ApplicationManager(this.context, (tenantParams == null || tenantParams.getBootLoaderEndpoint() == null) ? Constants.RELEASE_CONFIG_TEMPLATE_URL : this.tenantParams.getBootLoaderEndpoint(), this.workspace, this.sdkTracker, this.sessionInfo, this.fileProviderService, z ? String.format("%s/network-summary", string) : null);
    }

    public Activity getActivity() {
        return this.activity;
    }

    JSONObject getAppWithPackageName(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(this.jBridge.findApps(str));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.optString("packageName", "").contains(str2)) {
                    return jSONObject;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public ApplicationManager getApplicationManager() {
        return this.applicationManager;
    }

    public JSONObject getBundleParameters() {
        return this.bundleParameters;
    }

    public FrameLayout getContainer() {
        return this.container;
    }

    public Context getContext() {
        return this.context;
    }

    DynamicUI getDynamicUI() {
        return this.dynamicUI;
    }

    public FileProviderService getFileProviderService() {
        return this.fileProviderService;
    }

    public HyperFragment getFragment() {
        return this.fragment;
    }

    public HyperPaymentsCallback getHyperCallback() {
        return this.hyperCallback;
    }

    public JBridge getJBridge() {
        return this.jBridge;
    }

    Map<String, HyperBridge> getJBridgeList() {
        return this.bridgeList.getBridgeList();
    }

    public JSONObject getLastProcessPayload() {
        return this.lastProcessPayload;
    }

    public LogManager getLogManager() {
        return this.logManager;
    }

    public PaymentSessionInfo getPaymentSessionInfo() {
        return this.paymentSessionInfo;
    }

    public RemoteAssetService getRemoteAssetService() {
        return this.remoteAssetService;
    }

    public SdkConfigService getSdkConfigService() {
        return this.sdkConfigService;
    }

    public final SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    public SdkTracker getSdkTracker() {
        return this.sdkTracker;
    }

    public SessionInfo getSessionInfo() {
        return this.sessionInfo;
    }

    public SmsServices getSmsServices() {
        return this.smsServices;
    }

    public JuspayWebViewConfigurationCallback getWebViewConfigurationCallback() {
        return this.webViewConfigurationCallback;
    }

    public String getWorkingLogger() {
        return "json-array";
    }

    public Workspace getWorkspace() {
        return this.workspace;
    }

    public void initiate(final Runnable runnable) {
        firstTimeSetup();
        boolean zOptBoolean = this.context.getResources().getBoolean(R.bool.use_local_assets);
        JSONObject bundleParameters = getBundleParameters();
        if (bundleParameters != null) {
            zOptBoolean = bundleParameters.optBoolean("useLocalAssets", zOptBoolean);
        }
        this.applicationManager.setShouldUpdate(!zOptBoolean);
        if (this.isPrefetch) {
            if (this.clientId == null && this.merchantClientId == null) {
                return;
            }
            ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m331lambda$initiate$6$injuspayhypersdkcoreJuspayServices();
                }
            });
            return;
        }
        this.webViewCrashCallback = runnable;
        final String str = this.clientId;
        if (str == null) {
            str = this.merchantClientId;
        }
        if (str == null) {
            this.sdkTracker.trackContext(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.CRITICAL, Labels.HyperSdk.JUSPAY_SERVICES, "Cannot initiate sdk as clientId is null");
        } else {
            ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m329lambda$initiate$4$injuspayhypersdkcoreJuspayServices(str);
                }
            });
        }
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m330lambda$initiate$5$injuspayhypersdkcoreJuspayServices(runnable);
            }
        });
    }

    Boolean isCug() {
        return Boolean.valueOf(getAppWithPackageName(Constants.CUG_PACKAGE_URI, Constants.CUG_PACKAGE_NAME) != null);
    }

    String isDevQAUser() {
        JSONObject appWithPackageName = getAppWithPackageName(Constants.DEVQA_PACKAGE_URI, Constants.DEVQA_PACKAGE_NAME);
        if (appWithPackageName == null) {
            return null;
        }
        String strOptString = appWithPackageName.optString("packageName", "");
        return strOptString.length() > 15 ? strOptString.substring(15) : "";
    }

    Boolean isForceCug() {
        return Boolean.valueOf(getAppWithPackageName(Constants.CUG_PACKAGE_URI, Constants.FORCE_CUG_PACKAGE_NAME) != null);
    }

    public boolean isPaused() {
        return this.paused;
    }

    public boolean isPrefetch() {
        return this.isPrefetch;
    }

    public boolean isWebViewAvailable() {
        return this.isWebViewAvailable;
    }

    /* JADX INFO: renamed from: lambda$addFragment$10$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m327lambda$addFragment$10$injuspayhypersdkcoreJuspayServices(FragmentEvent fragmentEvent, String str, HyperFragment hyperFragment) {
        this.sdkTracker.trackLifecycle(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, Labels.Android.FRAGMENT_LIFECYCLE_EVENT, "event", fragmentEvent.getKey());
        int i = AnonymousClass6.$SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[fragmentEvent.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && hyperFragment == this.fragment) {
                        this.fragment = null;
                    }
                } else if (hyperFragment == this.fragment) {
                    ActivityLaunchDelegate activityLaunchDelegate = this.activityLaunchDelegate;
                    if (activityLaunchDelegate instanceof HyperActivityLaunchDelegate) {
                        ((HyperActivityLaunchDelegate) activityLaunchDelegate).fragmentAttached();
                    }
                    RequestPermissionDelegate requestPermissionDelegate = this.requestPermissionDelegate;
                    if (requestPermissionDelegate instanceof HyperRequestPermissionDelegate) {
                        ((HyperRequestPermissionDelegate) requestPermissionDelegate).fragmentAttached();
                    }
                    IntentSenderDelegate intentSenderDelegate = this.intentSenderDelegate;
                    if (intentSenderDelegate instanceof HyperIntentSenderDelegate) {
                        ((HyperIntentSenderDelegate) intentSenderDelegate).fragmentAttached();
                    }
                }
            } else if (hyperFragment == this.fragment) {
                this.paused = false;
                getDynamicUI().onResumeCallback();
            }
        } else if (hyperFragment == this.fragment) {
            this.paused = true;
            this.logManager.flushLogPush();
            getDynamicUI().onPauseCallback();
        }
        this.jBridge.invokeFnInDUIWebview(fragmentEvent.getKey(), str);
    }

    /* JADX INFO: renamed from: lambda$addFragment$11$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m328lambda$addFragment$11$injuspayhypersdkcoreJuspayServices(maybeGetTypeVariable maybegettypevariable) {
        try {
            this.fragment = new HyperFragment();
            commitFragmentTransaction(maybegettypevariable.getSupportFragmentManager().IconCompatParcelizer().IconCompatParcelizer(this.fragment, fragmentTag));
            this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.Android.FRAGMENT_OPERATION, "fragment_transaction", "Fragment Addition Done Successfully");
            for (final FragmentEvent fragmentEvent : this.fragmentEvents) {
                this.fragment.registerForEvent(fragmentEvent, new EventListener() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda6
                    @Override // in.juspay.hypersdk.lifecycle.EventListener
                    public final void onEvent(String str, HyperFragment hyperFragment) {
                        this.f$0.m327lambda$addFragment$10$injuspayhypersdkcoreJuspayServices(fragmentEvent, str, hyperFragment);
                    }
                });
            }
            this.fragment.registerOnActivityResult(new ActivityResultHolder() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda7
                @Override // in.juspay.hypersdk.lifecycle.ActivityResultHolder
                public final void onActivityResult(int i, int i2, Intent intent) {
                    this.f$0.onActivityResult(i, i2, intent);
                }
            });
            this.fragment.registerOnRequestPermissionResult(new RequestPermissionResult() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda8
                @Override // in.juspay.hypersdk.lifecycle.RequestPermissionResult
                public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                    this.f$0.onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        } catch (Exception e) {
            this.sdkTracker.trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.ANDROID, Labels.Android.FRAGMENT_OPERATION, "Exception while committing fragment", e);
        }
    }

    /* JADX INFO: renamed from: lambda$initiate$4$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m329lambda$initiate$4$injuspayhypersdkcoreJuspayServices(String str) {
        this.applicationManager.loadApplication(str);
    }

    /* JADX INFO: renamed from: lambda$initiate$5$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m330lambda$initiate$5$injuspayhypersdkcoreJuspayServices(Runnable runnable) {
        if (this.dynamicUI.initiate()) {
            return;
        }
        this.webViewCrashCallback = null;
        this.isWebViewAvailable = false;
        runnable.run();
    }

    /* JADX INFO: renamed from: lambda$initiate$6$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m331lambda$initiate$6$injuspayhypersdkcoreJuspayServices() {
        ApplicationManager applicationManager = this.applicationManager;
        String str = this.clientId;
        if (str == null) {
            str = this.merchantClientId;
        }
        applicationManager.loadApplication(str);
    }

    /* JADX INFO: renamed from: lambda$logMemoryInfo$1$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m332lambda$logMemoryInfo$1$injuspayhypersdkcoreJuspayServices(Context context, SdkTracker sdkTracker) {
        ActivityManager.MemoryInfo memoryInfo = Utils.getMemoryInfo(context);
        if (memoryInfo == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available_memory", memoryInfo.availMem);
            jSONObject.put("threshold_memory", memoryInfo.threshold);
            jSONObject.put("total_memory", memoryInfo.totalMem);
            sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.MEMORY, "memory_info", jSONObject);
        } catch (Exception e) {
            sdkTracker.trackAndLogException(this.LOG_TAG, "action", LogSubCategory.Action.SYSTEM, "session_info", "Exception while logging memory_info", e);
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m333lambda$new$0$injuspayhypersdkcoreJuspayServices(JSONObject jSONObject) {
        this.sdkTracker.setLabelsToDrop(jSONObject);
    }

    /* JADX INFO: renamed from: lambda$process$7$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ WindowInsets m334lambda$process$7$injuspayhypersdkcoreJuspayServices(View view, WindowInsets windowInsets) {
        view.onApplyWindowInsets(windowInsets);
        insetUpdated(windowInsets);
        return windowInsets;
    }

    /* JADX INFO: renamed from: lambda$process$8$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m335lambda$process$8$injuspayhypersdkcoreJuspayServices(ViewGroup viewGroup, maybeGetTypeVariable maybegettypevariable) {
        FrameLayout frameLayout = this.container;
        if (frameLayout == null || frameLayout.getParent() != viewGroup) {
            FrameLayout frameLayoutCreateSubLayout = createSubLayout(maybegettypevariable);
            viewGroup.addView(frameLayoutCreateSubLayout);
            FrameLayout frameLayout2 = this.container;
            if (frameLayout2 != null) {
                ViewParent parent = frameLayout2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.container);
                }
            }
            this.dynamicUI.setContainer(frameLayoutCreateSubLayout);
            viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda14
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return this.f$0.m334lambda$process$7$injuspayhypersdkcoreJuspayServices(view, windowInsets);
                }
            });
            this.container = frameLayoutCreateSubLayout;
            this.jBridge.setContainer(viewGroup);
            this.dynamicUI.setContainer(frameLayoutCreateSubLayout);
        }
    }

    /* JADX INFO: renamed from: lambda$removeFragment$12$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m336lambda$removeFragment$12$injuspayhypersdkcoreJuspayServices() {
        HyperFragment hyperFragment;
        if (this.activity != null && (hyperFragment = this.fragment) != null && hyperFragment.isAdded()) {
            try {
                FragmentManager supportFragmentManager = this.activity.getSupportFragmentManager();
                if (!supportFragmentManager.onPrepare() && supportFragmentManager.findFragmentByTag(fragmentTag) != null) {
                    commitFragmentTransaction(supportFragmentManager.IconCompatParcelizer().read(this.fragment));
                    this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.Android.FRAGMENT_OPERATION, "fragment_transaction", "Fragment Removed successfully");
                }
            } catch (Exception e) {
                this.sdkTracker.trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.ANDROID, Labels.Android.FRAGMENT_OPERATION, "Exception while removing fragment", e);
            }
        }
        this.fragment = null;
    }

    /* JADX INFO: renamed from: lambda$reset$9$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m337lambda$reset$9$injuspayhypersdkcoreJuspayServices() {
        this.jBridge.clearMerchantViews(this.activity);
        removeFragment();
        this.activity = null;
        this.jBridge.setActivity(null);
        this.dynamicUI.resetActivity();
        this.jBridge.reset();
        resetBridges();
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.container);
            }
        }
        this.container = null;
        this.dynamicUI.setContainer(null);
    }

    /* JADX INFO: renamed from: lambda$setBundleParameter$2$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m338lambda$setBundleParameter$2$injuspayhypersdkcoreJuspayServices(JSONObject jSONObject) {
        this.logManager.setLogHeaderValues(jSONObject, LogConstants.DEFAULT_CHANNEL);
    }

    /* JADX INFO: renamed from: lambda$setBundleParameter$3$in-juspay-hypersdk-core-JuspayServices, reason: not valid java name */
    /* synthetic */ void m339lambda$setBundleParameter$3$injuspayhypersdkcoreJuspayServices() {
        this.sessionInfo.createSessionDataMap();
        this.sessionInfo.logDeviceIdentifiers();
        final JSONObject sessionData = this.sessionInfo.getSessionData();
        try {
            sessionData.put(PaymentConstants.MERCHANT_ID, this.sessionInfo.getMerchantId());
            sessionData.put(PaymentConstants.CLIENT_ID, this.sessionInfo.getClientId().split("_")[0].toLowerCase(Locale.getDefault()));
            sessionData.put("session_id", this.sessionInfo.getSessionId());
        } catch (JSONException e) {
            this.sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.SET_BUNDLE_PARAMS, "Exception while setting bundle parameter", e);
        }
        this.sessionInfo.logSessionInfo();
        ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m338lambda$setBundleParameter$2$injuspayhypersdkcoreJuspayServices(sessionData);
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.Android.ON_ACTIVITY_RESULT, "result_code", "RESULT_OK");
            if (intent != null && intent.getExtras() != null) {
                this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.Android.ON_ACTIVITY_RESULT, "result_code", Utils.toJSON(intent.getExtras()));
            }
        } else if (i2 == 0) {
            this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.Android.ON_ACTIVITY_RESULT, "result_code", "RESULT_CANCELLED");
        }
        Iterator<HyperBridge> it = this.bridgeList.getBridgeList().values().iterator();
        while (it.hasNext()) {
            if (it.next().onActivityResult(i, i2, intent)) {
                return;
            }
        }
        this.jBridge.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.ANDROID, "info", Labels.Android.BACK_PRESSED, "class", "juspayServices");
        this.jBridge.requestKeyboardHide();
        this.jBridge.invokeFnInDUIWebview("onBackPressed", "{\"shouldShowBackPressDialog\":true}");
    }

    public void onMerchantEvent(JSONObject jSONObject) {
        onMerchantEvent(LogConstants.DEFAULT_CHANNEL, jSONObject);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        SdkTracker sdkTracker = this.sdkTracker;
        StringBuilder sb = new StringBuilder("requestCode = [");
        sb.append(i);
        sb.append("],permissions = [");
        sb.append(Arrays.toString(strArr));
        sb.append("], grantResults = [");
        sb.append(Arrays.toString(iArr));
        sb.append("]");
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.ON_REQUEST_PERMISSION_RESULT, "data", sb.toString());
        Iterator<HyperBridge> it = this.bridgeList.getBridgeList().values().iterator();
        while (it.hasNext()) {
            if (it.next().onRequestPermissionResult(i, strArr, iArr)) {
                return;
            }
        }
        this.jBridge.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void process(final maybeGetTypeVariable maybegettypevariable, final ViewGroup viewGroup) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        this.smsServices.createSMSConsent();
        if (maybegettypevariable == this.activity && (frameLayout2 = this.container) != null && viewGroup == frameLayout2.getParent()) {
            return;
        }
        if (this.activity != maybegettypevariable || ((frameLayout = this.container) != null && frameLayout.getParent() != viewGroup)) {
            this.jBridge.clearMerchantViews(this.activity);
            this.jBridge.clearMerchantViews(maybegettypevariable);
        }
        if (maybegettypevariable != this.activity) {
            removeFragment();
            addFragment(maybegettypevariable);
            this.activity = maybegettypevariable;
            this.jBridge.setActivity(maybegettypevariable);
            this.dynamicUI.setActivity(maybegettypevariable);
        }
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m335lambda$process$8$injuspayhypersdkcoreJuspayServices(viewGroup, maybegettypevariable);
            }
        });
    }

    @Override // in.juspay.hyper.core.FragmentHooks
    public void requestPermission(String[] strArr, int i) {
        this.requestPermissionDelegate.requestPermission(strArr, i);
    }

    public void reset() {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m337lambda$reset$9$injuspayhypersdkcoreJuspayServices();
            }
        });
    }

    public void sdkDebug(String str, String str2) {
        if (this.sdkInfo.isSdkDebuggable()) {
            JuspayLogger.d(str, str2);
        }
    }

    public void setActivityLaunchDelegate(ActivityLaunchDelegate activityLaunchDelegate) {
        this.activityLaunchDelegate = activityLaunchDelegate;
    }

    public void setBundleParameter(JSONObject jSONObject) {
        try {
            jSONObject.put(PaymentConstants.SDK_NAME, this.sdkInfo.getSdkName());
            jSONObject.put(PaymentConstants.SDK_VERSION, this.sdkInfo.getSdkVersion());
            this.bundleParameters = jSONObject;
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            this.sdkTracker.setEndPointSandbox(Boolean.valueOf(jSONObject2.has("environment") ? jSONObject2.getString("environment").equalsIgnoreCase(PaymentConstants.ENVIRONMENT.SANDBOX) : false));
            if (jSONObject2.has("clientId")) {
                this.merchantClientId = jSONObject2.getString("clientId");
            }
            setUpMerchantFragments(jSONObject2);
            jSONObject2.put("tenantId", getTenant());
            this.sessionInfo.setBundleParams(jSONObject);
            String strIsDevQAUser = isDevQAUser();
            if (strIsDevQAUser != null) {
                this.applicationManager.setMode(new Mode.DevQa(strIsDevQAUser));
            } else {
                JSONObject jSONObject3 = this.bundleParameters;
                if (jSONObject3 != null && jSONObject3.optBoolean(PaymentConstants.BETA_ASSETS, false)) {
                    this.applicationManager.setMode(Mode.Beta.INSTANCE);
                } else if (isCug().booleanValue() || isForceCug().booleanValue()) {
                    this.applicationManager.setMode(Mode.CUG.INSTANCE);
                }
            }
            ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.core.JuspayServices$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m339lambda$setBundleParameter$3$injuspayhypersdkcoreJuspayServices();
                }
            });
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.SET_BUNDLE_PARAMS, "Exception while setting bundle parameter", e);
        }
    }

    public void setHyperCallback(HyperPaymentsCallback hyperPaymentsCallback) {
        this.hyperCallback = hyperPaymentsCallback;
    }

    public void setIntentSenderDelegate(IntentSenderDelegate intentSenderDelegate) {
        this.intentSenderDelegate = intentSenderDelegate;
    }

    public void setPrefetch(boolean z) {
        this.isPrefetch = z;
    }

    public void setRequestPermissionDelegate(RequestPermissionDelegate requestPermissionDelegate) {
        this.requestPermissionDelegate = requestPermissionDelegate;
    }

    public void setUpMerchantFragments(JSONObject jSONObject) {
        if (!jSONObject.has(PaymentConstants.FRAGMENT_VIEW_GROUPS) || this.activity == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(PaymentConstants.FRAGMENT_VIEW_GROUPS);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject2.opt(next);
                if (objOpt instanceof ViewGroup) {
                    FrameLayout frameLayoutCreateSubLayout = createSubLayout(this.activity);
                    ((ViewGroup) objOpt).addView(frameLayoutCreateSubLayout);
                    jSONObject2.put(next, this.dynamicUI.addToContainerList(frameLayoutCreateSubLayout));
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void setWebViewConfigurationCallback(JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback) {
        this.webViewConfigurationCallback = juspayWebViewConfigurationCallback;
    }

    @Override // in.juspay.hyper.core.FragmentHooks
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.activityLaunchDelegate.startActivityForResult(intent, i, bundle);
    }

    @Override // in.juspay.hyper.core.FragmentHooks
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.intentSenderDelegate.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void terminate() {
        MPINUtil.closeAllConnections(getContext());
        this.jBridge.reset();
        ApplicationManager applicationManagerCreateApplicationManager = createApplicationManager();
        this.applicationManager = applicationManagerCreateApplicationManager;
        this.dynamicUI.setApplicationManager(applicationManagerCreateApplicationManager);
        Iterator<HyperBridge> it = this.bridgeList.getBridgeList().values().iterator();
        while (it.hasNext()) {
            it.next().terminate();
        }
        ActivityLaunchDelegate activityLaunchDelegate = this.activityLaunchDelegate;
        if (activityLaunchDelegate instanceof HyperActivityLaunchDelegate) {
            ((HyperActivityLaunchDelegate) activityLaunchDelegate).clearQueue();
        }
        IntentSenderDelegate intentSenderDelegate = this.intentSenderDelegate;
        if (intentSenderDelegate instanceof HyperIntentSenderDelegate) {
            ((HyperIntentSenderDelegate) intentSenderDelegate).clearQueue();
        }
        RequestPermissionDelegate requestPermissionDelegate = this.requestPermissionDelegate;
        if (requestPermissionDelegate instanceof HyperRequestPermissionDelegate) {
            ((HyperRequestPermissionDelegate) requestPermissionDelegate).clearQueue();
        }
        this.dynamicUI.terminate();
        this.smsServices.unregisterSmsConsent();
    }

    public String getTenant() {
        TenantParams tenantParams = this.tenantParams;
        return (tenantParams == null || tenantParams.getTenant() == null) ? DEFAULT_WORKSPACE_PATH : this.tenantParams.getTenant();
    }

    public void onMerchantEvent(String str, JSONObject jSONObject) {
        if (str.equals(Labels.HyperSdk.PROCESS)) {
            setLastProcessPayload(jSONObject);
        }
        this.jBridge.invokeCustomFnInDUIWebview(String.format("window.onMerchantEvent('%s',%s);", str, this.dynamicUI.encodeUtfAndWrapDecode(jSONObject.toString(), this.LOG_TAG)));
    }
}
