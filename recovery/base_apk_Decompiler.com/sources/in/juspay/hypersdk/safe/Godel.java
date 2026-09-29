package in.juspay.hypersdk.safe;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.FrameLayout;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.core.AcsInterface;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.GodelJsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.PaymentUtils;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import kotlin.C0156TypeKt;
import kotlin.getAvcProfileAndLevel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Godel {
    private static final String GODEL = "Godel";
    private static final String LOG_TAG = "PaymentUtils";
    private static final long ON_EXCEPTION_GODEL_OFF_STICKINESS = 86400000;
    private final AcsInterface acsInterface;
    private final JSONObject bundleParameters;
    private JSONObject config;
    private final Context context;
    private final DuiInterface duiInterface;
    private final JuspayServices juspayServices;
    private final JuspayWebChromeClient juspayWebChromeClient;
    private final JuspayWebView juspayWebView;
    private final JuspayWebViewClient juspayWebViewClient;
    private final JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback;
    private final PaymentSessionInfo paymentSessionInfo;
    private final JSONObject processPayload;
    private final SdkTracker sdkTracker;
    private final Workspace workspace;
    private final List<String> allowedDeeplinkPackages = new ArrayList();
    public boolean isRupaySupportedAdded = false;

    public Godel(JuspayServices juspayServices) {
        Context context = juspayServices.getContext();
        this.context = context;
        this.juspayServices = juspayServices;
        this.workspace = juspayServices.getWorkspace();
        Activity activity = juspayServices.getActivity();
        JuspayWebView juspayWebView = new JuspayWebView(activity != null ? activity : context);
        this.juspayWebView = juspayWebView;
        this.juspayWebViewClient = new JuspayWebViewClient(this, juspayWebView);
        this.juspayWebChromeClient = new JuspayWebChromeClient(this);
        this.acsInterface = new AcsInterface(juspayServices);
        this.juspayWebViewConfigurationCallback = juspayServices.getWebViewConfigurationCallback();
        this.sdkTracker = juspayServices.getSdkTracker();
        this.duiInterface = juspayServices.getJBridge();
        this.paymentSessionInfo = juspayServices.getPaymentSessionInfo();
        this.bundleParameters = juspayServices.getSessionInfo().getBundleParams();
        this.processPayload = juspayServices.getLastProcessPayload();
        this.config = new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0001, B:5:0x0009, B:11:0x0036, B:13:0x0040, B:15:0x0046, B:18:0x0054, B:20:0x005a, B:22:0x006a, B:24:0x0072, B:25:0x0087, B:27:0x008d, B:28:0x00a8, B:30:0x00ae, B:32:0x00ba, B:33:0x00c0, B:34:0x00c9, B:35:0x00d1, B:37:0x00db, B:6:0x0013, B:8:0x001b), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db A[Catch: Exception -> 0x00e2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0001, B:5:0x0009, B:11:0x0036, B:13:0x0040, B:15:0x0046, B:18:0x0054, B:20:0x005a, B:22:0x006a, B:24:0x0072, B:25:0x0087, B:27:0x008d, B:28:0x00a8, B:30:0x00ae, B:32:0x00ba, B:33:0x00c0, B:34:0x00c9, B:35:0x00d1, B:37:0x00db, B:6:0x0013, B:8:0x001b), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.webkit.WebResourceResponse addAcsToJSFile(android.webkit.WebResourceRequest r9, java.lang.String r10, java.lang.String r11, org.json.JSONObject r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.safe.Godel.addAcsToJSFile(android.webkit.WebResourceRequest, java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONObject):android.webkit.WebResourceResponse");
    }

    private String getAcsScript() {
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        StringBuilder sb = new StringBuilder("window.juspayContext = {}; juspayContext['web_lab_rules'] = ");
        sb.append(getWebLabRules());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(", ");
        sb2.append(fileProviderService.readFromFile(this.juspayServices.getContext(), PaymentConstants.ACS));
        return sb2.toString();
    }

    private String getConnectionData(Reader reader, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[i];
            while (true) {
                int i2 = reader.read(cArr);
                if (i2 == -1) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i2);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private InputStream getDataAcsFromPostRequest(C0156TypeKt c0156TypeKt, String str) {
        try {
            if (".html".matches(str)) {
                return handleHtmlFile(c0156TypeKt);
            }
            if (!".js".matches(str) && !".jsp".matches(str)) {
                return null;
            }
            return handleJsFile(c0156TypeKt);
        } catch (Exception unused) {
            return null;
        }
    }

    private InputStream getDataFromGetRequest(NetUtils netUtils, WebResourceRequest webResourceRequest) {
        try {
            return new SequenceInputStream(new ByteArrayInputStream(String.format("window.addEventListener('load', function() { if(!window.GK) { %s } });", getAcsScript()).getBytes(StandardCharsets.UTF_8)), netUtils.doGet(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), null, null, null).getBody().IconCompatParcelizer());
        } catch (Exception unused) {
            return null;
        }
    }

    private List<Pattern> getExcludeUrlsPatternList() {
        Exception exc;
        JSONException jSONException;
        LinkedList linkedList = null;
        try {
            LinkedList linkedList2 = new LinkedList();
            try {
                JSONArray jSONArray = this.config.getJSONArray("exclude_url_patterns");
                if (isNotNull(jSONArray)) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        linkedList2.add(Pattern.compile(jSONArray.get(i).toString()));
                    }
                }
                return linkedList2;
            } catch (JSONException e) {
                jSONException = e;
                linkedList = linkedList2;
                this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Json Exception while fetching excludeUrlPatterns from config", jSONException);
                return linkedList;
            } catch (Exception e2) {
                exc = e2;
                linkedList = linkedList2;
                this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Exception while compiling patterns in excludeUrlPatterns from config", exc);
                return linkedList;
            }
        } catch (JSONException e3) {
            jSONException = e3;
        } catch (Exception e4) {
            exc = e4;
        }
    }

    private C0156TypeKt getPostRequestConnection(JSONObject jSONObject, JSONObject jSONObject2, WebResourceRequest webResourceRequest) {
        try {
            String sessionAttribute = this.juspayServices.getJBridge().getSessionAttribute("iframe_form_data", "wait_for_me");
            JSONObject jSONObject3 = this.config.getJSONObject("waiting_time_postparams");
            int iOptInt = jSONObject3.optInt("interval", 50);
            for (int iOptInt2 = jSONObject3.optInt("total_time", 1000); sessionAttribute.equals("wait_for_me") && iOptInt2 > 0; iOptInt2 -= iOptInt) {
                TimeUnit.MILLISECONDS.sleep(iOptInt);
                sessionAttribute = this.juspayServices.getJBridge().getSessionAttribute("iframe_form_data", "wait_for_me");
            }
            if (sessionAttribute.equals("wait_for_me")) {
                return null;
            }
            this.juspayServices.getJBridge().setSessionAttribute("iframe_form_data", "wait_for_me");
            HashMap<String, String> map = toMap(sessionAttribute);
            NetUtils netUtils = new NetUtils(jSONObject.optInt("connection_timeout", 10000), jSONObject.optInt("read_timeout", 10000));
            HashMap map2 = new HashMap();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map2.put(next, jSONObject2.getString(next));
            }
            return netUtils.postUrl(new URL(webResourceRequest.getUrl().toString()), map2, map, new JSONObject(), (String) null);
        } catch (Exception unused) {
            return null;
        }
    }

    private List<String> getRupaySpecificDomains() {
        Exception exc;
        JSONException jSONException;
        ArrayList arrayList = null;
        try {
            JSONArray jSONArray = this.config.getJSONArray("rupay_specific_domains");
            JuspayServices juspayServices = this.juspayServices;
            String str = LOG_TAG;
            StringBuilder sb = new StringBuilder("printing urlArray");
            sb.append(jSONArray);
            juspayServices.sdkDebug(str, sb.toString());
            if (!isNotNull(jSONArray)) {
                return null;
            }
            int length = jSONArray.length();
            ArrayList arrayList2 = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                try {
                    arrayList2.add(jSONArray.get(i).toString());
                } catch (JSONException e) {
                    jSONException = e;
                    arrayList = arrayList2;
                } catch (Exception e2) {
                    exc = e2;
                    arrayList = arrayList2;
                    this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Exception while getting rupay urls from config", exc);
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (JSONException e3) {
            jSONException = e3;
        } catch (Exception e4) {
            exc = e4;
        }
        this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Json Exception while fetching Rupay Urls from config", jSONException);
        return arrayList;
    }

    private InputStream handleJsFile(C0156TypeKt c0156TypeKt) {
        if (c0156TypeKt == null) {
            return null;
        }
        try {
            return new SequenceInputStream(new ByteArrayInputStream(String.format("window.addEventListener('load', function() { if(!window.GK) { %s } });", getAcsScript()).getBytes(StandardCharsets.UTF_8)), c0156TypeKt.getBody().IconCompatParcelizer());
        } catch (Exception unused) {
            return null;
        }
    }

    private void initializeJuspayWebView(Context context) {
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "started", context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.juspayWebView.setId(R.id.juspay_browser_view);
        this.juspayWebView.setLayoutParams(layoutParams);
        this.juspayWebView.setHorizontalScrollBarEnabled(false);
        this.juspayWebView.setVerticalScrollBarEnabled(false);
        this.juspayWebView.addJavascriptInterface(this.acsInterface, "ACSGatekeeper");
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        this.paymentSessionInfo.setPaymentDetails(this.bundleParameters);
        fileProviderService.addToFileCacheWhiteList("acs.jsa");
        prepareWebView();
    }

    private boolean isAcsToBeAddedToResource(URL url) {
        List<String> rupaySpecificDomains = getRupaySpecificDomains();
        if (rupaySpecificDomains == null) {
            return false;
        }
        Iterator<String> it = rupaySpecificDomains.iterator();
        while (it.hasNext()) {
            if (url.toString().toLowerCase(Locale.getDefault()).contains(it.next()) && url.getPath().toLowerCase(Locale.getDefault()).endsWith(".js") && !url.getPath().toLowerCase(Locale.getDefault()).endsWith(".jsp")) {
                return true;
            }
        }
        return false;
    }

    private boolean isClientWhitelistedForWebViewAccess(String str) {
        JSONArray jSONArrayOptJSONArray = Utils.optJSONArray(Utils.optJSONObject(Utils.optJSONObject(this.juspayServices.getSdkConfigService().getSdkConfig(), "godelConfig"), "webViewAccess"), "whitelistedClientIds");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                if (str.contains(jSONArrayOptJSONArray.getString(i))) {
                    return true;
                }
            } catch (JSONException e) {
                this.sdkTracker.trackAndLogException(GODEL, "action", LogSubCategory.Action.SYSTEM, Labels.System.GODEL_WEBVIEW_WHITELIST, "Failed to read whitelisted config", e);
            }
        }
        return false;
    }

    private static boolean isNotNull(JSONArray jSONArray) {
        return (jSONArray == null || jSONArray == JSONObject.NULL) ? false : true;
    }

    private boolean shouldDisableGodel(Context context) {
        long jCurrentTimeMillis;
        if (context == null || !this.workspace.isInSharedPreference("GODEL_EXCEPTION_OFF")) {
            return false;
        }
        long jOptLong = getConfig().optLong("ON_EXCEPTION_GODEL_OFF_STICKINESS", ON_EXCEPTION_GODEL_OFF_STICKINESS);
        try {
            jCurrentTimeMillis = System.currentTimeMillis() - Long.parseLong(this.workspace.getFromSharedPreference("GODEL_EXCEPTION_OFF", String.valueOf(System.currentTimeMillis())));
        } catch (NumberFormatException e) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.sdkTracker.trackAndLogException(GODEL, "action", LogSubCategory.Action.USER, Labels.User.SHOULD_DISABLE_GODEL, "Failed while parsing number", e);
            jCurrentTimeMillis = jCurrentTimeMillis2;
        }
        this.sdkTracker.trackAction(LogSubCategory.Action.USER, "info", Labels.User.SHOULD_DISABLE_GODEL, "exception_info", this.workspace.getFromSharedPreference("EXCEPTION_INFO", null));
        if (jCurrentTimeMillis <= jOptLong) {
            return true;
        }
        this.workspace.removeFromSharedPreference("GODEL_EXCEPTION_OFF");
        this.workspace.removeFromSharedPreference("EXCEPTION_OFF");
        return false;
    }

    private WebResourceResponse shouldExcludeResource(String str) {
        String str2;
        Pattern patternCompile = Pattern.compile(".*\\.(gif|jpg|jpeg|png)([;?].*)?$");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        List<Pattern> excludeUrlsPatternList = getExcludeUrlsPatternList();
        if (excludeUrlsPatternList == null) {
            excludeUrlsPatternList = new ArrayList<>();
        }
        Iterator<Pattern> it = excludeUrlsPatternList.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                if (patternCompile.matcher(str).matches()) {
                    str2 = "text/html";
                } else {
                    byteArray = "[blocked]".getBytes();
                    str2 = "text/plain";
                }
                return new WebResourceResponse(str2, "utf-8", new ByteArrayInputStream(byteArray));
            }
        }
        return null;
    }

    private HashMap<String, String> toMap(String str) {
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException unused) {
            JuspayLogger.d(LOG_TAG, "Not a json string. Passing as such");
            return null;
        }
    }

    private void turnOffGodelIfNeeded() {
        if (shouldDisableGodel(this.context)) {
            this.paymentSessionInfo.setGodelDisabled(PaymentConstants.GodelOffReasons.ON_GODEL_EXCEPTION);
        }
        if (!PaymentUtils.hasTelephonyService(this.juspayServices)) {
            this.juspayServices.sdkDebug(GODEL, "No telephony service found.. disabling JB");
            this.paymentSessionInfo.setGodelDisabled(PaymentConstants.GodelOffReasons.TELEPHONY_NOT_FOUND);
        }
        PaymentUtils.switchOffGodelIfLowOnMemory(this, this.juspayServices, this.paymentSessionInfo);
    }

    public void addWebView(Activity activity, String str) {
        initializeJuspayWebView(this.context);
        FrameLayout frameLayout = this.juspayServices.getContainer() != null ? (FrameLayout) this.juspayServices.getContainer().findViewById(Integer.parseInt(str)) : null;
        if (frameLayout != null || activity == null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ADD_WEBVIEW, "missing", "activity");
        } else {
            frameLayout = (FrameLayout) activity.findViewById(Integer.parseInt(str));
        }
        if (frameLayout == null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ADD_WEBVIEW, "missing", "view");
            return;
        }
        if (this.juspayWebView.getParent() == frameLayout) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.WARNING, Labels.System.ADD_WEBVIEW, "parent", "parent view is same as before");
            return;
        }
        turnOffGodelIfNeeded();
        ViewParent parent = this.juspayWebView.getParent();
        if (parent != null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.WARNING, Labels.System.ADD_WEBVIEW, "parent", "already present");
            if (!(parent instanceof ViewGroup)) {
                this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ADD_WEBVIEW, "parent", "not a ViewGroup");
                return;
            }
            ((ViewGroup) parent).removeView(this.juspayWebView);
        }
        frameLayout.addView(this.juspayWebView, 0);
    }

    public void exit() {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.safe.Godel$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.resetWebView();
            }
        });
    }

    public AcsInterface getAcsInterface() {
        return this.acsInterface;
    }

    public List<String> getAllowedDeeplinkPackages() {
        return this.allowedDeeplinkPackages;
    }

    public JSONObject getConfig() {
        return this.config;
    }

    public Context getContext() {
        return this.context;
    }

    public DuiInterface getDuiInterface() {
        return this.duiInterface;
    }

    public JuspayServices getJuspayServices() {
        return this.juspayServices;
    }

    public JuspayWebView getJuspayWebView() {
        return this.juspayWebView;
    }

    public PaymentSessionInfo getPaymentSessionInfo() {
        return this.paymentSessionInfo;
    }

    public JSONObject getWebLabRules() {
        try {
            return this.config.getJSONObject("weblab");
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Unable to find weblab key in config", e);
            return null;
        }
    }

    public boolean isDuiLoaded() {
        return true;
    }

    /* JADX INFO: renamed from: lambda$onBrowserReady$0$in-juspay-hypersdk-safe-Godel, reason: not valid java name */
    /* synthetic */ void m361lambda$onBrowserReady$0$injuspayhypersdksafeGodel(Activity activity, String str, String str2, String str3) {
        addWebView(activity, str);
        loadPage(str2, str3);
    }

    /* JADX INFO: renamed from: lambda$onBrowserReady$1$in-juspay-hypersdk-safe-Godel, reason: not valid java name */
    /* synthetic */ void m362lambda$onBrowserReady$1$injuspayhypersdksafeGodel(Activity activity, String str, String str2, String str3, String str4, String str5, String str6) {
        addWebView(activity, str);
        this.juspayWebView.loadDataWithBaseURL(str2, str3, str4, str5, str6);
    }

    public void loadPage() {
        if (this.bundleParameters.has("url")) {
            loadPage("file:///android_assets/juspay/acs_blank.html", null);
        } else {
            loadPage(this.bundleParameters.optString("url"), this.bundleParameters.optString(PaymentConstants.POST_DATA));
        }
    }

    public void onBrowserReady(final Activity activity, final String str, final String str2, final String str3) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.safe.Godel$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m361lambda$onBrowserReady$0$injuspayhypersdksafeGodel(activity, str3, str, str2);
            }
        });
    }

    public void onDuiReady() {
        this.paymentSessionInfo.setGodelManager(this);
        this.juspayServices.getJBridge().attach(PaymentConstants.NETWORK_STATUS, "{}", "");
        setupAllowedDeeplinkPackages();
        this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.ON_DUI_READY, "class", "HyperFragment");
    }

    public void onDuiReleased() {
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.ON_DUI_RELEASED, "exit_sdk", JSONObject.NULL);
        exit();
        this.paymentSessionInfo.setGodelManager(null);
    }

    protected void prepareWebView() {
        this.juspayWebView.getSettings().setJavaScriptEnabled(true);
        this.juspayWebView.getSettings().setDomStorageEnabled(true);
        JSONObject jSONObject = null;
        try {
            jSONObject = this.bundleParameters.getJSONObject("payload");
            if (jSONObject.optBoolean("godel_receive_merchant_messages")) {
                this.juspayWebView.addJavascriptInterface(new GodelJsInterface(this.juspayServices), "GodelInterface");
            }
        } catch (JSONException e) {
            this.sdkTracker.trackAndLogException(GODEL, "action", LogSubCategory.Action.SYSTEM, Labels.System.INITIALISE_JUSPAY_WEBVIEW, "Initiate payload is missing", e);
        }
        this.juspayWebView.setDefaultWebViewClient(this.juspayWebViewClient);
        this.juspayWebView.setDefaultWebChromeClient(this.juspayWebChromeClient);
        this.juspayWebView.getSettings().setAllowFileAccess(true);
        this.juspayWebView.getSettings().setCacheMode(-1);
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "enabling_third_party_cookies", Boolean.TRUE);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.juspayWebView, true);
        if (!this.juspayServices.getJBridge().execute(PaymentConstants.NETWORK_STATUS, "", "{}", "").equals("true")) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "no_network", "Setting web view to load from cache if there is no network");
            this.juspayWebView.getSettings().setCacheMode(1);
        }
        if (this.bundleParameters.has("clearCookies") && this.bundleParameters.optBoolean("clearCookies")) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "clearing", "cookies");
            PaymentUtils.clearCookies(this.juspayServices);
        }
        if (jSONObject == null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "missing", "JuspayWebView");
            return;
        }
        String strOptString = jSONObject.optString("clientId", "");
        if (this.juspayWebViewConfigurationCallback == null || !isClientWhitelistedForWebViewAccess(strOptString)) {
            return;
        }
        this.juspayWebViewConfigurationCallback.configureJuspayWebView(this.juspayWebView);
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.GODEL_WEBVIEW_WHITELIST, "configured", "JuspayWebView");
    }

    protected void resetWebView() {
        JuspayWebView juspayWebView = this.juspayWebView;
        juspayWebView.setDefaultWebChromeClient(juspayWebView.getWebChromeClient());
        JuspayWebView juspayWebView2 = this.juspayWebView;
        juspayWebView2.setDefaultWebViewClient(juspayWebView2.getWebViewClient());
        this.juspayWebView.stopLoading();
        this.juspayWebView.removeJavascriptInterface("ACSGatekeeper");
        this.juspayWebView.clearHistory();
        this.juspayWebView.destroy();
        if (this.juspayWebView.getParent() != null) {
            ((ViewManager) this.juspayWebView.getParent()).removeView(this.juspayWebView);
        }
    }

    public void setConfig(JSONObject jSONObject) {
        this.config = jSONObject;
    }

    public void setIsRupaySupportedAdded(boolean z) {
        this.isRupaySupportedAdded = z;
    }

    public void setupAllowedDeeplinkPackages() {
        JSONObject jSONObject = this.processPayload;
        JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("payload") : null;
        if (jSONObjectOptJSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("allowedDeepLinkPackages");
            this.allowedDeeplinkPackages.clear();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (strOptString != null) {
                        this.allowedDeeplinkPackages.add(strOptString);
                    }
                }
            }
        }
    }

    public WebResourceResponse shouldInterceptRequest(String str) {
        try {
            JuspayServices juspayServices = this.juspayServices;
            String str2 = LOG_TAG;
            juspayServices.sdkDebug(str2, String.format("Intercepted URL: %s", str));
            if (!URLUtil.isValidUrl(str) || !isAcsToBeAddedToResource(new URL(str)) || this.isRupaySupportedAdded) {
                WebResourceResponse webResourceResponseShouldExcludeResource = shouldExcludeResource(str);
                if (webResourceResponseShouldExcludeResource == null) {
                    return null;
                }
                this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.UTIL, "url_excluded", str);
                return webResourceResponseShouldExcludeResource;
            }
            URL url = new URL(str);
            this.juspayServices.sdkDebug(str2, String.format("Intercepted URL and modified: %s", str));
            setIsRupaySupportedAdded(true);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(getAcsScript().getBytes(StandardCharsets.UTF_8));
            try {
                SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream, getAvcProfileAndLevel.AudioAttributesCompatParcelizer(url));
                try {
                    WebResourceResponse webResourceResponse = new WebResourceResponse("text/javascript", "utf-8", sequenceInputStream);
                    sequenceInputStream.close();
                    byteArrayInputStream.close();
                    return webResourceResponse;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Error while Caching Files", e);
            return null;
        }
    }

    public void onBrowserReady(final Activity activity, final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.safe.Godel$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m362lambda$onBrowserReady$1$injuspayhypersdksafeGodel(activity, str6, str, str2, str3, str4, str5);
            }
        });
    }

    private InputStream handleHtmlFile(C0156TypeKt c0156TypeKt) {
        BufferedReader bufferedReader;
        String connectionData;
        if (c0156TypeKt == null) {
            return null;
        }
        try {
            String str = String.format("<script>{ %s } </script></body>", getAcsScript());
            String str2 = c0156TypeKt.read("content-encoding");
            if (str2 != null && str2.equalsIgnoreCase("gzip")) {
                bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(c0156TypeKt.getBody().IconCompatParcelizer()), StandardCharsets.UTF_8), 8000);
                try {
                    connectionData = getConnectionData(bufferedReader, 8000);
                    bufferedReader.close();
                } finally {
                }
            } else if (str2 == null || str2.equals("")) {
                bufferedReader = new BufferedReader(new InputStreamReader(c0156TypeKt.getBody().IconCompatParcelizer()), 8000);
                try {
                    connectionData = getConnectionData(bufferedReader, 8000);
                    bufferedReader.close();
                } finally {
                }
            } else {
                connectionData = null;
            }
            if (connectionData != null) {
                return new ByteArrayInputStream(connectionData.replace("</body>", str).getBytes(StandardCharsets.UTF_8));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void loadPage(String str, String str2) {
        try {
            this.bundleParameters.put("url", str);
            this.bundleParameters.put(PaymentConstants.POST_DATA, str2);
        } catch (JSONException e) {
            this.sdkTracker.trackAndLogException(GODEL, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.System.LOAD_PAGE, "Failed to write to JSON bundle parameters", e);
        }
        if (str2 != null) {
            this.juspayWebView.postUrl(str, str2.getBytes());
        } else {
            this.juspayWebView.loadUrl(str);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        JSONArray jSONArrayOptJSONArray;
        try {
            int i = 0;
            if (this.juspayServices.getSessionInfo().get("inject_acs_into_iframes", "false").equals("true") && webResourceRequest.getMethod().equals("GET")) {
                JSONArray jSONArrayOptJSONArray2 = this.config.optJSONArray("bank_js_urls_v2");
                if (jSONArrayOptJSONArray2 == null) {
                    JSONArray jSONArrayOptJSONArray3 = this.config.optJSONArray("bank_js_urls");
                    if (jSONArrayOptJSONArray3 != null) {
                        while (i < jSONArrayOptJSONArray3.length()) {
                            if (Pattern.compile(jSONArrayOptJSONArray3.getString(i)).matcher(webResourceRequest.getUrl().toString()).find()) {
                                return addAcsToJSFile(webResourceRequest, "GET", ".*\\.jsp?$", new JSONObject(), new JSONObject());
                            }
                            i++;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        JSONArray jSONArray = jSONArrayOptJSONArray2.getJSONArray(i2);
                        if (Pattern.compile(jSONArray.getString(0)).matcher(webResourceRequest.getUrl().toString()).find()) {
                            return addAcsToJSFile(webResourceRequest, "GET", jSONArray.getString(1), new JSONObject(), new JSONObject());
                        }
                    }
                }
                return null;
            }
            if (!webResourceRequest.getMethod().equals("POST") || (jSONArrayOptJSONArray = this.config.optJSONArray("post_urls")) == null) {
                return null;
            }
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                if (Pattern.compile(jSONObject.getString("url")).matcher(webResourceRequest.getUrl().toString()).find()) {
                    return addAcsToJSFile(webResourceRequest, "POST", jSONObject.getString("file_type"), jSONObject.getJSONObject("headers"), jSONObject.getJSONObject("timeout"));
                }
                i++;
            }
            return null;
        } catch (Exception e) {
            this.sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Exception while adding ACS to js file", e);
            return null;
        }
    }
}
