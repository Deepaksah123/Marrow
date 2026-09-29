package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.mystique.Callback;
import in.juspay.hypersdk.mystique.DUIWebViewClient;
import in.juspay.hypersdk.mystique.WebClientCallback;
import in.juspay.hypersdk.ota.ApplicationManager;
import in.juspay.hypersdk.ota.OTABaseHTML;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class DynamicUI implements JsCallback {
    private Activity activity;
    private final AndroidInterface androidInterface;
    private Context appContext;
    private ApplicationManager applicationManager;
    private final String baseContent;
    private final BridgeComponents bridgeComponents;
    private WebView browser;
    private final Callback callback;
    private FrameLayout container;
    private final DUIMerchantView duiMerchantView;
    private HashMap<String, ViewGroup> fragments;
    private final InflateView inflateView;
    final Map<String, Object> jsInterfaces;
    private String loadCallJS;
    private final DuiLogger mLogger;
    private final Renderer renderer;
    private final Map<String, Object> screenMap;
    private final HashMap<String, JSONArray> storedFunctions;
    private final AtomicReference<WebViewState> webViewState;
    private Exception webViewCrashException = null;
    private final HashMap<String, Object> globalState = new HashMap<>();
    private final HashMap<String, String> activityData = new HashMap<>();
    private boolean isForeGround = true;
    private boolean isInitiated = false;
    private int totalWebViewFailure = 0;
    private boolean enableWebViewRecreate = false;

    /* JADX INFO: renamed from: in.juspay.hypersdk.core.DynamicUI$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$core$WebViewState;

        static {
            int[] iArr = new int[WebViewState.values().length];
            $SwitchMap$in$juspay$hypersdk$core$WebViewState = iArr;
            try {
                iArr[WebViewState.Recreating.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$core$WebViewState[WebViewState.Broken.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$core$WebViewState[WebViewState.Crashed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$core$WebViewState[WebViewState.Null.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$core$WebViewState[WebViewState.Created.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$core$WebViewState[WebViewState.Active.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public DynamicUI(Context context, DuiLogger duiLogger, Callback callback, BridgeComponents bridgeComponents, String str, Map<String, Object> map, JSONObject jSONObject, ApplicationManager applicationManager, DUIMerchantView dUIMerchantView, boolean z) {
        HashMap map2 = new HashMap();
        this.jsInterfaces = map2;
        this.mLogger = duiLogger;
        this.callback = callback;
        this.bridgeComponents = bridgeComponents;
        this.webViewState = new AtomicReference<>(WebViewState.Null);
        this.storedFunctions = new HashMap<>();
        if (context instanceof Activity) {
            this.activity = (Activity) context;
        }
        this.appContext = context.getApplicationContext();
        this.screenMap = new HashMap();
        this.fragments = new HashMap<>();
        this.duiMerchantView = dUIMerchantView;
        this.applicationManager = applicationManager;
        AndroidInterface androidInterface = new AndroidInterface(this);
        this.androidInterface = androidInterface;
        this.renderer = new Renderer(this, jSONObject);
        this.inflateView = new InflateJSON(this);
        this.baseContent = str == null ? OTABaseHTML.HTML : str;
        map2.put("Android", androidInterface);
        map2.putAll(map);
        if (z) {
            return;
        }
        ExecutorManager.runOnMainThread(new DynamicUI$$ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createWebView() {
        try {
            this.browser = new WebView(this.appContext);
            this.webViewState.set(WebViewState.Created);
            setupWebView();
            this.browser.getSettings().setJavaScriptEnabled(true);
            for (Map.Entry<String, Object> entry : this.jsInterfaces.entrySet()) {
                this.browser.addJavascriptInterface(entry.getValue(), entry.getKey());
            }
            loadBaseHtml();
            this.callback.webViewLoaded(null);
            this.totalWebViewFailure = 0;
        } catch (Exception e) {
            this.totalWebViewFailure++;
            if (isWebViewBroken()) {
                this.webViewState.set(WebViewState.Broken);
                this.webViewCrashException = e;
                this.callback.webViewLoaded(e);
                DuiLogger duiLogger = this.mLogger;
                StringBuilder sb = new StringBuilder("WebView creation failed ");
                sb.append(this.totalWebViewFailure);
                duiLogger.logLifeCycleException(Labels.Android.WEBVIEW, sb.toString(), e);
                return;
            }
            this.browser = null;
            this.webViewState.set(WebViewState.Recreating);
            DuiLogger duiLogger2 = this.mLogger;
            StringBuilder sb2 = new StringBuilder("Webview crashed, recreating ");
            sb2.append(this.totalWebViewFailure);
            duiLogger2.logLifeCycleException(Labels.Android.WEBVIEW, sb2.toString(), e);
            ExecutorManager.postOnMainThread((this.totalWebViewFailure + 1) * 50, new DynamicUI$$ExternalSyntheticLambda0(this));
        }
    }

    private String getStringStackTraceFromError(Error error) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : error.getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    private String getStringStackTraceFromException(Exception exc) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    private boolean isWebViewBroken() {
        return this.totalWebViewFailure > 3;
    }

    private void loadBaseHtml() {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DynamicUI$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.loadData();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadData() {
        WebView webView = this.browser;
        if (webView != null) {
            webView.loadDataWithBaseURL(null, this.baseContent, "text/html", "utf-8", null);
            this.mLogger.logLifeCycleInfo("url_loaded", "base.html");
        }
    }

    private void logError(String str) {
        this.mLogger.e("DynamicUI", str);
    }

    private void recreateWebView() {
        this.webViewState.set(WebViewState.Null);
        this.callback.onRenderProcessGone(this.enableWebViewRecreate);
        if (this.enableWebViewRecreate) {
            this.browser = null;
            if (this.isForeGround) {
                ExecutorManager.runOnMainThread(new DynamicUI$$ExternalSyntheticLambda0(this));
            } else {
                this.webViewState.set(WebViewState.Crashed);
            }
        }
    }

    private void setupWebView() {
        if (this.browser != null) {
            if (this.appContext.getResources().getBoolean(R.bool.godel_debuggable)) {
                this.browser.setWebChromeClient(new WebChromeClient());
            } else {
                this.browser.setWebChromeClient(new WebChromeClient() { // from class: in.juspay.hypersdk.core.DynamicUI.1
                    @Override // android.webkit.WebChromeClient
                    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                        return true;
                    }
                });
            }
            this.browser.setWebViewClient(new DUIWebViewClient(new WebClientCallback() { // from class: in.juspay.hypersdk.core.DynamicUI$$ExternalSyntheticLambda4
                @Override // in.juspay.hypersdk.mystique.WebClientCallback
                public final void onRenderProcessGone(WebView webView) {
                    this.f$0.m307lambda$setupWebView$0$injuspayhypersdkcoreDynamicUI(webView);
                }
            }));
        }
    }

    public final void addJavascriptInterface(final Object obj, final String str) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DynamicUI$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m305lambda$addJavascriptInterface$2$injuspayhypersdkcoreDynamicUI(obj, str);
            }
        });
    }

    @Override // in.juspay.hyper.core.JsCallback
    public final void addJsToWebView(final String str) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.DynamicUI$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m306lambda$addJsToWebView$1$injuspayhypersdkcoreDynamicUI(str);
            }
        });
    }

    public final String addToContainerList(ViewGroup viewGroup) {
        String string = UUID.randomUUID().toString();
        this.fragments.put(string, viewGroup);
        return string;
    }

    public final void addToScreenMap(String str, Object obj) {
        this.screenMap.put(str, obj);
    }

    public final String encodeUtfAndWrapDecode(String str, String str2) {
        try {
            return String.format("decodeURIComponent('%s')", URLEncoder.encode(str, CharsetNames.UTF_8).replace("+", "%20"));
        } catch (UnsupportedEncodingException unused) {
            JuspayLogger.e(str2, "Failed to encode using URLEncoder");
            return String.format("atob('%s')", Base64.encodeToString(str.getBytes(), 2));
        }
    }

    final Activity getActivity() {
        return this.activity;
    }

    public final String getActivityData(String str) {
        return this.activityData.containsKey(str) ? this.activityData.get(str) : "";
    }

    public final HashMap<String, JSONArray> getAllFunctions() {
        return this.storedFunctions;
    }

    public final HashMap<String, Object> getAllGlobalState() {
        return this.globalState;
    }

    public final AndroidInterface getAndroidInterface() {
        return this.androidInterface;
    }

    final Context getAppContext() {
        return this.appContext;
    }

    final ApplicationManager getApplicationManager() {
        return this.applicationManager;
    }

    public final BridgeComponents getBridgeComponents() {
        return this.bridgeComponents;
    }

    final ViewGroup getContainer(String str) {
        return str == null ? this.container : this.fragments.get(str);
    }

    public final Callback getErrorCallback() {
        return this.callback;
    }

    public final JSONArray getFunction(String str) {
        return this.storedFunctions.get(str);
    }

    public final Object getGlobalState(String str) {
        return this.globalState.get(str);
    }

    final InflateView getInflateView() {
        return this.inflateView;
    }

    public final DuiLogger getLogger() {
        return this.mLogger;
    }

    public final View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
        return this.duiMerchantView.getMerchantView(viewGroup, merchantViewType);
    }

    final Renderer getRenderer() {
        return this.renderer;
    }

    public final String getState() {
        return this.androidInterface.getState();
    }

    public final Object getViewFromScreenName(String str) {
        if (this.screenMap.containsKey(str)) {
            return this.screenMap.get(str);
        }
        return null;
    }

    public final Exception getWebViewCrashException() {
        return this.webViewCrashException;
    }

    final boolean initiate() {
        this.loadCallJS = "window.bootLoad()";
        this.totalWebViewFailure = 0;
        this.isInitiated = true;
        int i = AnonymousClass2.$SwitchMap$in$juspay$hypersdk$core$WebViewState[this.webViewState.get().ordinal()];
        if (i != 1) {
            if (i == 3) {
                ExecutorManager.runOnMainThread(new DynamicUI$$ExternalSyntheticLambda0(this));
            } else if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return false;
                    }
                    addJsToWebView(this.loadCallJS);
                    return true;
                }
            }
            ExecutorManager.runOnMainThread(new DynamicUI$$ExternalSyntheticLambda0(this));
        }
        return true;
    }

    /* JADX INFO: renamed from: lambda$addJavascriptInterface$2$in-juspay-hypersdk-core-DynamicUI, reason: not valid java name */
    final /* synthetic */ void m305lambda$addJavascriptInterface$2$injuspayhypersdkcoreDynamicUI(Object obj, String str) {
        WebView webView = this.browser;
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
        }
        this.jsInterfaces.put(str, obj);
    }

    /* JADX INFO: renamed from: lambda$addJsToWebView$1$in-juspay-hypersdk-core-DynamicUI, reason: not valid java name */
    final /* synthetic */ void m306lambda$addJsToWebView$1$injuspayhypersdkcoreDynamicUI(String str) {
        try {
            WebView webView = this.browser;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            } else {
                logError("browser null, call start first");
            }
        } catch (Exception e) {
            String stringStackTraceFromException = getStringStackTraceFromException(e);
            logError("Exception :".concat(String.valueOf(stringStackTraceFromException)));
            this.callback.onError("addJsToWebView", stringStackTraceFromException);
        } catch (OutOfMemoryError e2) {
            String stringStackTraceFromError = getStringStackTraceFromError(e2);
            logError("OutOfMemoryError :".concat(String.valueOf(stringStackTraceFromError)));
            this.callback.onError("addJsToWebView", stringStackTraceFromError);
        }
    }

    /* JADX INFO: renamed from: lambda$setupWebView$0$in-juspay-hypersdk-core-DynamicUI, reason: not valid java name */
    final /* synthetic */ void m307lambda$setupWebView$0$injuspayhypersdkcoreDynamicUI(WebView webView) {
        if (webView == this.browser) {
            recreateWebView();
        }
    }

    public final void onPauseCallback() {
        this.isForeGround = false;
    }

    public final void onResumeCallback() {
        this.isForeGround = true;
        if (this.webViewState.get() == WebViewState.Crashed) {
            ExecutorManager.runOnMainThread(new DynamicUI$$ExternalSyntheticLambda0(this));
        }
    }

    public final void putFunction(String str, JSONArray jSONArray) {
        this.storedFunctions.put(str, jSONArray);
    }

    public final void resetActivity() {
        this.activity = null;
        getInflateView().resetState();
    }

    public final void setActivity(Activity activity) {
        if (this.activity != activity) {
            this.fragments = new HashMap<>();
            getInflateView().resetState();
        }
        this.activity = activity;
        this.appContext = activity.getApplicationContext();
    }

    final void setApplicationManager(ApplicationManager applicationManager) {
        this.applicationManager = applicationManager;
    }

    public final void setContainer(FrameLayout frameLayout) {
        this.container = frameLayout;
        if (frameLayout == null || !frameLayout.isHardwareAccelerated()) {
            return;
        }
        this.container.setLayerType(2, null);
    }

    public final void setGlobalState(String str, Object obj) {
        this.globalState.put(str, obj);
    }

    public final void setState(String str) {
        this.androidInterface.setState(str);
    }

    public final void setWebViewActive() {
        if (this.isInitiated) {
            addJsToWebView(this.loadCallJS);
        }
        this.webViewState.set(WebViewState.Active);
    }

    public final void setWebViewRecreate(boolean z) {
        this.enableWebViewRecreate = z;
    }

    public final void storeActivityData(String str, String str2) {
        this.activityData.put(str, str2);
    }

    public final void terminate() {
        if (this.browser == null) {
            logError("Browser is not present");
            return;
        }
        this.isInitiated = false;
        this.webViewState.set(WebViewState.Null);
        this.browser.loadDataWithBaseURL("http://juspay.in", "<html></html>", "text/html", "utf-8", null);
        this.browser.stopLoading();
        this.browser.destroy();
        this.browser = null;
    }
}
