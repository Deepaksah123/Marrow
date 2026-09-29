package in.juspay.hypersdk.core;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.bridge.ThreeDS2Bridge;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.mystique.SwypeLayout;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.security.HyperSSLSocketFactory;
import in.juspay.hypersdk.security.JOSEUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.NetUtils;
import in.juspay.hypersdk.utils.network.SessionizedNetUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLHandshakeException;
import kotlin.getProvider;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JBridge extends DuiInterface {
    private static final String LOG_TAG = "JBridge";
    private final int JUSPAY_LOADER_ID;
    private final Set<String> acceptedCerts;
    private final AtomicInteger apiTag;
    private BroadcastReceiver broadcastReceiver;
    private NetUtils netUtils;
    private NetUtils netUtilsSsl;

    public JBridge(JuspayServices juspayServices) {
        super(juspayServices);
        this.JUSPAY_LOADER_ID = 898989;
        this.broadcastReceiver = null;
        this.apiTag = new AtomicInteger(0);
        this.acceptedCerts = new HashSet();
        try {
            this.netUtils = new SessionizedNetUtils(((DuiInterface) this).sessionInfo, 0, 0, false);
            this.netUtilsSsl = new SessionizedNetUtils(((DuiInterface) this).sessionInfo, 0, 0, true);
        } catch (Exception e) {
            juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while instantiating NetUtils", e);
        }
    }

    public static float dpToPx(float f, Context context) {
        return f * (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    private void drawIcon(final Drawable drawable, final int i) {
        final SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JBridge$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m317lambda$drawIcon$2$injuspayhypersdkcoreJBridge(i, drawable, sdkTracker);
            }
        });
    }

    private String extractStoredPublicKey(String str, String str2) throws Exception {
        if (!str2.equals(Constants.KEY_ORIGIN_SHARED_PREF)) {
            return getPublicKeyAsString(str).replaceAll("\n", "");
        }
        String dataFromSharedPrefs = getDataFromSharedPrefs(str.contains(".") ? str.split("\\.")[0] : str, "");
        if (!str.contains(".")) {
            return dataFromSharedPrefs.replaceAll("\n", "");
        }
        String nestedJsonValue = getNestedJsonValue(dataFromSharedPrefs, str.substring(str.indexOf(".") + 1));
        if (nestedJsonValue == null || nestedJsonValue.isEmpty()) {
            throw new Exception("Key not found in nested path".concat(String.valueOf(str)));
        }
        return nestedJsonValue.replaceAll("\n", "");
    }

    private Map<String, String> getDecodedQueryParameters(String str) {
        if (str == null || str.trim().length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf("=");
            map.put(URLDecoder.decode(str2.substring(0, iIndexOf), CharsetNames.UTF_8).trim(), URLDecoder.decode(str2.substring(iIndexOf + 1), CharsetNames.UTF_8).trim());
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [in.juspay.hypersdk.core.JBridge] */
    /* JADX WARN: Type inference failed for: r7v1, types: [in.juspay.hypersdk.core.JsInterface] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    private String getNestedJsonValue(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String[] strArrSplit = str2.split("\\.");
            for (int i = 0; i < strArrSplit.length; i++) {
                String str3 = strArrSplit[i];
                if (i == strArrSplit.length - 1) {
                    this = jSONObject.getString(str3);
                    return this;
                }
                jSONObject = jSONObject.getJSONObject(str3);
            }
            return null;
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error in getting Value from Nested JSON", e);
            return null;
        }
    }

    private String getPersistentDeviceFingerprint(Context context) {
        return context.getSharedPreferences("DevicePrefs", 0).getString("device_fingerprint", "");
    }

    private PrivateKey getPrivateKey(String str) throws Exception {
        KeyStore keyStore = KeyStore.getInstance(Constants.ANDROID_KEYSTORE);
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry(str, null);
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            return ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
        }
        throw new Exception("Private Key not found against alias".concat(String.valueOf(str)));
    }

    private PublicKey getPublicKey(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(Constants.ANDROID_KEYSTORE);
            keyStore.load(null);
            KeyStore.Entry entry = keyStore.getEntry(str, null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                return ((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey();
            }
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error in getPublicKey", e);
        }
        return null;
    }

    @JavascriptInterface
    public static String hmacDigest(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), str3);
            Mac mac = Mac.getInstance(str3);
            mac.init(secretKeySpec);
            byte[] bArrDoFinal = mac.doFinal(str.getBytes(StandardCharsets.US_ASCII));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private DatePickerDialog newDialogWithoutDateField(final String str, String str2, int i) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: in.juspay.hypersdk.core.JBridge$$ExternalSyntheticLambda3
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                this.f$0.m319lambda$newDialogWithoutDateField$3$injuspayhypersdkcoreJBridge(str, datePicker, i2, i3, i4);
            }
        };
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: in.juspay.hypersdk.core.JBridge$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f$0.m320lambda$newDialogWithoutDateField$4$injuspayhypersdkcoreJBridge(str, dialogInterface);
            }
        };
        if (str2 != null && !str2.isEmpty() && !str2.equals("undefined")) {
            calendar.setTimeInMillis(dateToMillisecond(str2));
        }
        if (this.activity == null) {
            return null;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.activity, i, onDateSetListener, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.setOnCancelListener(onCancelListener);
        return datePickerDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void receiverCallback(Intent intent) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            String action = intent.getAction();
            if (action == null) {
                throw new Exception("action is null");
            }
            if (action.equals("customtab-result")) {
                handleCustomTabResult(intent);
            } else {
                sdkTracker.trackApiCalls(LogSubCategory.ApiCall.SDK, "error", Labels.SDK.RECEIVER_CALLBACK, null, null, null, null, null, "unknown_intent", null);
            }
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.RECEIVER_CALLBACK, "JSON Exception", e);
        }
    }

    private int versionCompare(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length && strArrSplit[i].equalsIgnoreCase(strArrSplit2[i])) {
            i++;
        }
        return (i >= strArrSplit.length || i >= strArrSplit2.length) ? Integer.signum(strArrSplit.length - strArrSplit2.length) : Integer.signum(Integer.valueOf(strArrSplit[i]).compareTo(Integer.valueOf(strArrSplit2[i])));
    }

    @JavascriptInterface
    public void addCertificates(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                this.acceptedCerts.add(jSONArray.getString(i));
            }
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while manipulating JSON", e);
        }
    }

    @JavascriptInterface
    @Deprecated
    public void amazonNonTokenPay(String str, String str2) {
        launchCustomTab(str, str2);
    }

    @JavascriptInterface
    public void attachBase64ImageToId(String str, String str2) {
        try {
            ImageView imageView = (ImageView) this.activity.findViewById(Integer.parseInt(str2));
            byte[] bArrDecode = Base64.decode(str, 0);
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void blurBackground(String str, String str2, int i) {
    }

    @JavascriptInterface
    public String callAPI(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        return callAPIWithOptions(str, str2, str3, str4, z, z2, new JSONObject().toString(), str5);
    }

    @JavascriptInterface
    public String callAPIWithOptions(final String str, final String str2, final String str3, final String str4, final boolean z, boolean z2, String str5, final String str6) {
        JSONObject jSONObject;
        SessionizedNetUtils sessionizedNetUtils;
        NetUtils netUtils;
        final SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        final DynamicUI dynamicUI = this.juspayServices.getDynamicUI();
        try {
            jSONObject = new JSONObject(str5);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("tag");
        sb.append(this.apiTag.incrementAndGet());
        final String string = sb.toString();
        sdkTracker.trackApiCalls(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.BEFORE_REQUEST, null, str2, string, jCurrentTimeMillis, null, JSONObject.NULL, null, str, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
        NetUtils netUtils2 = z2 ? this.netUtilsSsl : this.netUtils;
        if (netUtils2 == null) {
            try {
                if (z2) {
                    sessionizedNetUtils = new SessionizedNetUtils(((DuiInterface) this).sessionInfo, 0, 0, true);
                    this.netUtilsSsl = sessionizedNetUtils;
                } else {
                    sessionizedNetUtils = new SessionizedNetUtils(((DuiInterface) this).sessionInfo, 0, 0, false);
                    this.netUtils = sessionizedNetUtils;
                }
                netUtils = sessionizedNetUtils;
            } catch (Exception e) {
                this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while instantiating NetUtils in callAPI", e);
                netUtils = netUtils2;
            }
        } else {
            netUtils = netUtils2;
        }
        if (netUtils == null) {
            if (str6 != null) {
                dynamicUI.addJsToWebView(String.format("window.callUICallback('%s','%s','%s','%s','%s','%s');", str6, "failure", Base64.encodeToString("{}".getBytes(), 2), -1, Base64.encodeToString(str2.getBytes(), 2), "%7B%7D"));
            }
            sdkTracker.trackApiCalls(LogSubCategory.ApiCall.NETWORK, "error", Labels.Network.NETWORK_CALL, -1, str2, null, jCurrentTimeMillis, Long.valueOf(System.currentTimeMillis()), str3, "Unable to create netUtils object", str, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
            return "";
        }
        if (z2) {
            try {
                netUtils.setSslSocketFactory(new HyperSSLSocketFactory(this.acceptedCerts).getSslSocketFactory());
            } catch (Exception e2) {
                JuspayLogger.e(LOG_TAG, "Exception: ", e2);
            }
        }
        final NetUtils netUtils3 = netUtils;
        new AsyncTask<Object, Object, Object>() { // from class: in.juspay.hypersdk.core.JBridge.2
            private HashMap<String, String> toMap(String str7) {
                HashMap<String, String> map = new HashMap<>();
                try {
                    JSONObject jSONObject3 = new JSONObject(str7);
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject3.getString(next));
                    }
                    return map;
                } catch (JSONException unused2) {
                    JBridge.this.juspayServices.sdkDebug(JBridge.LOG_TAG, "Not a json string. Passing as such");
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: doInBackground, reason: merged with bridge method [inline-methods] */
            public Object doInBackground2(Object[] objArr) {
                try {
                    HashMap<String, String> map = toMap(str4);
                    HashMap<String, String> map2 = z ? toMap(str3) : null;
                    if ("GET".equals(str)) {
                        return new JuspayHttpsResponse(netUtils3.doGet(str2, map, map2, jSONObject2, string));
                    }
                    if ("HEAD".equals(str)) {
                        return new JuspayHttpsResponse(netUtils3.doHead(str2, map, map2, jSONObject2, string));
                    }
                    if ("POST".equals(str)) {
                        return map2 == null ? new JuspayHttpsResponse(netUtils3.postUrl(new URL(str2), map, str3, jSONObject2, string)) : new JuspayHttpsResponse(netUtils3.postUrl(new URL(str2), map, map2, jSONObject2, string));
                    }
                    if ("DELETE".equals(str)) {
                        return map2 == null ? new JuspayHttpsResponse(netUtils3.deleteUrl(new URL(str2), map, str3, jSONObject2, string)) : new JuspayHttpsResponse(netUtils3.deleteUrl(new URL(str2), map, map2, jSONObject2, string));
                    }
                    if ("PUT".equals(str)) {
                        return new JuspayHttpsResponse(netUtils3.doPut(JBridge.this.juspayServices.getContext(), new URL(str2), str3.getBytes(), map, netUtils3, jSONObject2, string));
                    }
                    return null;
                } catch (SocketTimeoutException e3) {
                    sdkTracker.trackAndLogApiException(JBridge.LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.NETWORK, Labels.Network.NETWORK_CALL, Long.valueOf(jCurrentTimeMillis), Long.valueOf(System.currentTimeMillis()), str3, str2, str, "SocketTimeoutException while calling api", e3, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
                    return new JuspayHttpsResponse(-3, "Socket Timeout".getBytes(), null);
                } catch (SSLHandshakeException e4) {
                    sdkTracker.trackAndLogApiException(JBridge.LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.NETWORK, Labels.Network.NETWORK_CALL, Long.valueOf(jCurrentTimeMillis), Long.valueOf(System.currentTimeMillis()), str3, str2, str, "SSLHandshakeException while calling api", e4, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
                    return new JuspayHttpsResponse(-2, "SSL Handshake Failed".getBytes(), null);
                } catch (IOException e5) {
                    sdkTracker.trackAndLogApiException(JBridge.LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.NETWORK, Labels.Network.NETWORK_CALL, Long.valueOf(jCurrentTimeMillis), Long.valueOf(System.currentTimeMillis()), str3, str2, str, "IOException while calling api", e5, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
                    return new JuspayHttpsResponse(-1, "Network Error".getBytes(), null);
                } catch (Exception e6) {
                    sdkTracker.trackAndLogApiException(JBridge.LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.NETWORK, Labels.Network.NETWORK_CALL, Long.valueOf(jCurrentTimeMillis), Long.valueOf(System.currentTimeMillis()), str3, str2, str, "Exception while calling api", e6, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
                    byte[] bytes = new byte[0];
                    if (e6.getLocalizedMessage() != null) {
                        bytes = e6.getLocalizedMessage().getBytes();
                    }
                    return new JuspayHttpsResponse(-1, bytes, null);
                }
            }

            @Override // android.os.AsyncTask
            protected void onPostExecute(Object obj) {
                String str7;
                String strEncodeToString;
                String strReplace;
                String strReplace2;
                String str8;
                if (obj == null) {
                    sdkTracker.trackApiCalls(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.NETWORK_CALL, -1, str2, string, jCurrentTimeMillis, Long.valueOf(System.currentTimeMillis()), str3, "failure", str, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
                    if (str6 != null) {
                        dynamicUI.addJsToWebView(String.format("window.callUICallback('%s','%s','%s','%s','%s','%s');", str6, "failure", Base64.encodeToString("{}".getBytes(), 2), -1, Base64.encodeToString(str2.getBytes(), 2), "%7B%7D"));
                        return;
                    }
                    return;
                }
                JuspayHttpsResponse juspayHttpsResponse = (JuspayHttpsResponse) obj;
                if (juspayHttpsResponse.responsePayload != null) {
                    sdkTracker.trackApiCalls(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.NETWORK_CALL, Integer.valueOf(juspayHttpsResponse.responseCode), str2, string, jCurrentTimeMillis, Long.valueOf(System.currentTimeMillis()), str3, new String(juspayHttpsResponse.responsePayload), str, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
                } else {
                    sdkTracker.trackApiCalls(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.NETWORK_CALL, Integer.valueOf(juspayHttpsResponse.responseCode), str2, string, jCurrentTimeMillis, Long.valueOf(System.currentTimeMillis()), str3, null, str, jSONObject2.optJSONArray("channels"), jSONObject2.optJSONObject("rootLogFields"));
                }
                int i = juspayHttpsResponse.responseCode;
                String strEncodeToString2 = "";
                if (i == -1 || i == -2 || i == -3) {
                    byte[] bytes = "{}".getBytes();
                    String strEncodeToString3 = Base64.encodeToString(bytes, 2);
                    String str9 = str6;
                    if (str9 != null) {
                        try {
                            str7 = String.format("window.callUICallback('%s','%s','%s','%s','%s','%s', '%s');", str9, "failure", strEncodeToString3, Integer.valueOf(juspayHttpsResponse.responseCode), Base64.encodeToString(str2.getBytes(), 2), "", URLEncoder.encode(Arrays.toString(bytes), CharsetNames.UTF_8).replace("+", "%20"));
                        } catch (UnsupportedEncodingException unused2) {
                            str7 = String.format("window.callUICallback('%s','%s','%s','%s','%s');", str6, "failure", strEncodeToString3, Integer.valueOf(juspayHttpsResponse.responseCode), Base64.encodeToString(str2.getBytes(), 2));
                        }
                        dynamicUI.addJsToWebView(str7);
                        return;
                    }
                    return;
                }
                byte[] bArr = juspayHttpsResponse.responsePayload;
                if (bArr == null) {
                    strEncodeToString = "";
                    str8 = strEncodeToString;
                } else {
                    String str10 = new String(bArr);
                    try {
                        String string2 = new JSONObject(str10).toString();
                        JBridge.this.juspayServices.sdkDebug("message", string2);
                        strEncodeToString = Base64.encodeToString(string2.getBytes(), 2);
                        strReplace2 = URLEncoder.encode(string2, CharsetNames.UTF_8).replace("+", "%20");
                    } catch (Exception e3) {
                        strEncodeToString = Base64.encodeToString(str10.getBytes(), 2);
                        try {
                            strReplace = URLEncoder.encode(str10, CharsetNames.UTF_8).replace("+", "%20");
                        } catch (Exception unused3) {
                            strReplace = "";
                        }
                        JuspayLogger.e(JBridge.LOG_TAG, "This happened: ", e3);
                        strReplace2 = strReplace;
                    }
                    str8 = strReplace2;
                }
                JuspayServices juspayServices = JBridge.this.juspayServices;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strEncodeToString);
                sb2.append(" ");
                sb2.append(juspayHttpsResponse.responseCode);
                juspayServices.sdkDebug("Response inserted: ", sb2.toString());
                if (juspayHttpsResponse.headers != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry<String, List<String>> entry : juspayHttpsResponse.headers.entrySet()) {
                        try {
                            jSONObject3.put(entry.getKey(), new JSONArray((Collection) entry.getValue()));
                        } catch (Exception unused4) {
                        }
                    }
                    try {
                        JBridge.this.juspayServices.sdkDebug("headers", jSONObject3.toString());
                        strEncodeToString2 = Base64.encodeToString(jSONObject3.toString().getBytes(), 2);
                    } catch (Exception e4) {
                        JuspayLogger.e(JBridge.LOG_TAG, "This happened: ", e4);
                    }
                }
                JuspayServices juspayServices2 = JBridge.this.juspayServices;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strEncodeToString2);
                sb3.append(" ");
                sb3.append(juspayHttpsResponse.responseCode);
                juspayServices2.sdkDebug("Headers inserted: ", sb3.toString());
                String str11 = str6;
                if (str11 != null) {
                    String str12 = strEncodeToString;
                    String str13 = String.format("window.callUICallback('%s','%s','%s','%s','%s','%s', '%s');", str11, "success", str12, Integer.valueOf(juspayHttpsResponse.responseCode), Base64.encodeToString(str2.getBytes(), 2), strEncodeToString2, str8);
                    JBridge.this.juspayServices.sdkDebug("Js inserted: ", str13);
                    dynamicUI.addJsToWebView(str13);
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        return string;
    }

    @JavascriptInterface
    public void cancelAPI(String str) {
        NetUtils.cancelAPICall(str, this.juspayServices.getSdkTracker());
    }

    @JavascriptInterface
    public void checkAmazonNonTokenSdk(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            Class.forName("o.setTabContainer");
            invokeCallbackInDUIWebview(str, "true");
        } catch (ClassNotFoundException e) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.AMAZON_UTILS, "Amazon Sdk Not found Exception", e);
            invokeCallbackInDUIWebview(str, "false");
        }
    }

    @JavascriptInterface
    public boolean checkCustomTabs() {
        try {
            Class.forName("o.setTabContainer");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public boolean checkPhonePeSdk() {
        try {
            Class.forName("com.phonepe.android.sdk.api.PhonePe");
            Class.forName("com.phonepe.android.sdk.api.PhonePeInitException");
            Class.forName("com.phonepe.android.sdk.api.builders.TransactionRequestBuilder");
            Class.forName("com.phonepe.android.sdk.base.model.TransactionRequest");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public void copyLink(String str, String str2, String str3) {
        ((ClipboardManager) this.juspayServices.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str));
        invokeCallbackInDUIWebview(str3, "true");
    }

    @JavascriptInterface
    public int cursorPosition(int i) {
        EditText editText;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            Activity activity = this.activity;
            if (activity == null || (editText = (EditText) activity.findViewById(i)) == null) {
                return 0;
            }
            return editText.getSelectionStart();
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Cursor Position Exception", e);
            return 0;
        }
    }

    public long dateToMillisecond(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error in date to millis", e);
            return 0L;
        }
    }

    @JavascriptInterface
    public String decryptJWE(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            sb.append(".");
            sb.append(str3);
            sb.append(".");
            sb.append(str4);
            sb.append(".");
            sb.append(str5);
            String string = sb.toString();
            PrivateKey privateKey = getPrivateKey(str6);
            if (privateKey == null) {
                StringBuilder sb2 = new StringBuilder("Private key not found for alias: ");
                sb2.append(str6);
                throw new Exception(sb2.toString());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payload", JOSEUtils.jweDecrypt(string, privateKey).getString("payload"));
            jSONObject.put("error", false);
            return jSONObject.toString();
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error in JWE Decryption", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e.getMessage());
        }
    }

    @JavascriptInterface
    public boolean doesPhonePeAppExist(String str) {
        long j;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        PackageInfo packageInfo = null;
        try {
            packageInfo = this.juspayServices.getContext().getPackageManager().getPackageInfo(str, 1);
            j = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, Labels.System.JBRIDGE, "Failed to get phonepe package name", e);
            packageInfo = packageInfo;
            j = -1;
        }
        return packageInfo != null && j > 94033;
    }

    @JavascriptInterface
    public void drawAppIcon(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
                drawIcon(packageManager.getApplicationInfo(jSONObject.getString("packageName"), 0).loadIcon(packageManager), Integer.parseInt(jSONObject.getString("id")));
            }
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error happened while parsing json", e);
        }
    }

    @JavascriptInterface
    public String encryptJWE(String str, String str2, String str3, String str4) {
        try {
            return jweEncrypt(str, str2, extractStoredPublicKey(str3, str4));
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error in JWE Encryption", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e);
        }
    }

    @JavascriptInterface
    public String encryptRSA(String str, String str2) {
        byte[] bArrEncryptRSAHelper = encryptRSAHelper(str, str2);
        return bArrEncryptRSAHelper == null ? "" : Base64.encodeToString(bArrEncryptRSAHelper, 2);
    }

    public byte[] encryptRSAHelper(String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(Constants.ALG_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyGeneratePublic);
            return cipher.doFinal(str2.getBytes());
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception when encrypting using RSA", e);
            return null;
        }
    }

    @Override // in.juspay.hypersdk.core.HyperJsInterface
    @JavascriptInterface
    public void exitApp(int i, String str) {
        SwypeLayout.clear();
        super.exitApp(i, str);
    }

    @JavascriptInterface
    public String fetchDeviceDetails() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.juspayServices.getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        CookieManager cookieManager = CookieManager.getInstance();
        JSONObject jSONObject = new JSONObject();
        try {
            String persistentDeviceFingerprint = getPersistentDeviceFingerprint(context);
            boolean zIsEmpty = persistentDeviceFingerprint.isEmpty();
            if (zIsEmpty) {
                persistentDeviceFingerprint = UUID.randomUUID().toString();
                context.getSharedPreferences("DevicePrefs", 0).edit().putString("device_fingerprint", persistentDeviceFingerprint).apply();
            }
            jSONObject.put("Application type", "Android");
            jSONObject.put("Browser language", Locale.getDefault().getLanguage());
            boolean z = !new java.net.CookieManager().getCookieStore().getCookies().isEmpty();
            if (cookieManager.acceptCookie()) {
                z = true;
            }
            jSONObject.put("Cookies enabled", z);
            jSONObject.put("Device matched", !zIsEmpty);
            jSONObject.put("deviceID_firstseen", zIsEmpty);
            jSONObject.put("Device fingerprint", persistentDeviceFingerprint);
            jSONObject.put("Flash enabled", false);
            jSONObject.put("Flash operating system", "");
            jSONObject.put("Flash version", "");
            jSONObject.put("Images enabled", false);
            jSONObject.put("JavaScript enabled", true);
            jSONObject.put("Jailbreak", SessionInfo.isRooted());
            jSONObject.put("Profiled URL", "");
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            sb.append(" x ");
            sb.append(displayMetrics.heightPixels);
            jSONObject.put("Screen resolution", sb.toString());
            jSONObject.put("True IP address", "");
            jSONObject.put("Proxy IP address", "");
            jSONObject.put("os_name", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("hardware_model", Build.MODEL);
            jSONObject.put("Profiling duration", System.currentTimeMillis() - jCurrentTimeMillis);
            jSONObject.put("Time on page", 0);
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while fetching Device Details", e);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String findApps(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
        Intent intent = new Intent();
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Collections.sort(listQueryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        JSONArray jSONArray = new JSONArray();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            JSONObject jSONObject = new JSONObject();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(((PackageItemInfo) resolveInfo.activityInfo).packageName, 0);
                jSONObject.put("packageName", ((PackageItemInfo) applicationInfo).packageName);
                jSONObject.put("appName", packageManager.getApplicationLabel(applicationInfo));
                jSONArray.put(jSONObject);
            } catch (PackageManager.NameNotFoundException e) {
                sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while searching for the app", e);
            } catch (JSONException e2) {
                sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error While add to json", e2);
            }
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public String get3DS2SdkList() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, HyperBridge> entry : this.juspayServices.getJBridgeList().entrySet()) {
            if (entry.getValue() instanceof ThreeDS2Bridge) {
                jSONArray.put(((ThreeDS2Bridge) entry.getValue()).getThreeDS2SdkName());
            }
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public String getApplicationContent() {
        return this.juspayServices.getApplicationManager().getApplicationContent();
    }

    @JavascriptInterface
    public String getBuildInfo() {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("BOARD", Build.BOARD);
            jSONObject.put("BRAND", Build.BRAND);
            jSONObject.put("CPU_ABI", Build.CPU_ABI);
            jSONObject.put("CPU_ABI2", Build.CPU_ABI2);
            jSONObject.put("DEVICE", Build.DEVICE);
            jSONObject.put("DISPLAY", Build.DISPLAY);
            jSONObject.put("FINGERPRINT", Build.FINGERPRINT);
            jSONObject.put("HARDWARE", Build.HARDWARE);
            jSONObject.put("HOST", Build.HOST);
            jSONObject.put("ID", Build.ID);
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            jSONObject.put("MODEL", Build.MODEL);
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("RADIO", Build.getRadioVersion());
            jSONObject.put("TAGS", Build.TAGS);
            jSONObject.put("TIME", Build.TIME);
            jSONObject.put("USER", Build.USER);
            jSONObject.put("SUPPORTED_32_BIT_ABIS", new JSONArray(Build.SUPPORTED_32_BIT_ABIS));
            jSONObject.put("SUPPORTED_64_BIT_ABIS", new JSONArray(Build.SUPPORTED_64_BIT_ABIS));
            jSONObject.put("SUPPORTED_ABIS", new JSONArray(Build.SUPPORTED_ABIS));
            JSONObject jSONObject2 = new JSONObject();
            int i = Build.VERSION.SDK_INT;
            jSONObject2.put("BASE_OS", Build.VERSION.BASE_OS);
            jSONObject2.put("INCREMENTAL", Build.VERSION.INCREMENTAL);
            jSONObject2.put("PREVIEW_SDK_INT", Build.VERSION.PREVIEW_SDK_INT);
            jSONObject2.put("SECURITY_PATCH", Build.VERSION.SECURITY_PATCH);
            jSONObject2.put("RELEASE", Build.VERSION.RELEASE);
            jSONObject2.put("SDK_INT", i);
            jSONObject.put("VERSION", jSONObject2);
            return jSONObject.toString();
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception fetching build info", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getContainerMetrics() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout container = this.juspayServices.getContainer();
        JSONObject jSONObject = new JSONObject();
        if (container != null && this.activity != null && this.juspayServices.getActivity() != null && Build.VERSION.SDK_INT >= 30) {
            try {
                container.getLocationOnScreen(new int[2]);
                float f = this.activity.getResources().getDisplayMetrics().density;
                this.juspayServices.getActivity().getWindowManager().getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                int i = (int) (r4.heightPixels / f);
                int i2 = (int) (r4.widthPixels / f);
                int measuredHeight = (int) (container.getMeasuredHeight() / f);
                int measuredWidth = (int) (container.getMeasuredWidth() / f);
                Insets insets = container.getRootWindowInsets().getInsets(WindowInsets.Type.systemBars());
                int i3 = (int) (insets.top / f);
                int i4 = (int) (insets.bottom / f);
                int i5 = (int) (insets.left / f);
                int i6 = (int) (insets.right / f);
                ViewGroup viewGroup = this.container;
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                    jSONObject.put("isHeightWrapContent", layoutParams.height == -2);
                }
                jSONObject.put("containerLocation", new JSONObject().put("containerX", (int) (r2[0] / f)).put("containerY", (int) (r2[1] / f)));
                jSONObject.put("windowMetrics", new JSONObject().put("windowHeight", i).put("windowWidth", i2));
                jSONObject.put("containerMetrics", new JSONObject().put("containerHeight", measuredHeight).put("containerWidth", measuredWidth));
                jSONObject.put("insets", new JSONObject().put("topInset", i3).put("bottomInset", i4).put("leftInset", i5).put("rightInset", i6));
            } catch (Exception unused) {
            }
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public float getDensity() {
        return this.juspayServices.getContext().getResources().getDisplayMetrics().densityDpi / 160.0f;
    }

    @JavascriptInterface
    public String getDeviceInfo() {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        JSONObject sessionData = this.juspayServices.getSessionInfo().getSessionData();
        try {
            sessionData.put("android_id_raw", this.juspayServices.getSessionInfo().getAndroidId());
            return sessionData.toString();
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while extracting android id", e);
            return getSessionInfo();
        }
    }

    @JavascriptInterface
    @Deprecated
    public void getPackageName(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            invokeCallbackInDUIWebview(str, this.juspayServices.getContext().getPackageName());
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "NULL Pointer Exception while getting package name", e);
            invokeCallbackInDUIWebview(str, "ERROR");
        }
    }

    @JavascriptInterface
    public long getPhonePeVersionCode(String str) {
        PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
        if (!doesPhonePeAppExist(str)) {
            return -1L;
        }
        try {
            return packageManager.getPackageInfo(str, 1).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1L;
        }
    }

    @JavascriptInterface
    public String getPublicKeyAsString(String str) {
        try {
            PublicKey publicKey = getPublicKey(str);
            if (publicKey == null) {
                return String.format("{\"error\":true,\"payload\":\"%s\"}", "publicKey is null");
            }
            String strEncodeToString = Base64.encodeToString(publicKey.getEncoded(), 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", false);
            jSONObject.put("payload", strEncodeToString);
            return String.valueOf(jSONObject);
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error in getPublicKeyAsString", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e);
        }
    }

    @JavascriptInterface
    public String getResourceByName(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            int identifier = this.juspayServices.getContext().getResources().getIdentifier(str, str2, str3);
            return identifier > 0 ? super.getResourceById(identifier) : SessionDescription.SUPPORTED_SDP_VERSION;
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Get Resource Exception", e);
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
    }

    @JavascriptInterface
    public String getSHA256Hash(String str) {
        if (str == null) {
            return null;
        }
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            String strBytesToHexString = EncryptionHelper.bytesToHexString(messageDigest.digest());
            StringBuilder sb = new StringBuilder("result is ");
            sb.append(strBytesToHexString);
            JuspayLogger.d(LOG_TAG, sb.toString());
            return strBytesToHexString;
        } catch (NoSuchAlgorithmException e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception caught trying to SHA-256 hash", e);
            return null;
        }
    }

    @JavascriptInterface
    public String getStatusBarHeight(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            int identifier = this.juspayServices.getContext().getResources().getIdentifier(str, str2, str3);
            if (identifier <= 0) {
                return SessionDescription.SUPPORTED_SDP_VERSION;
            }
            StringBuilder sb = new StringBuilder("");
            sb.append(this.juspayServices.getContext().getResources().getDimensionPixelSize(identifier));
            return sb.toString();
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Get Resource Exception", e);
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
    }

    public void handleCustomTabResult(Intent intent) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            if (intent == null) {
                invokeCallbackInDUIWebview((String) this.listenerMap.get("customtab-result-cb"), "{}");
            } else {
                invokeCallbackInDUIWebview((String) this.listenerMap.get("customtab-result-cb"), Utils.toJSON(intent.getExtras()).toString());
            }
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.CUSTOM_TAB, "JSON Exception", e);
            invokeCallbackInDUIWebview((String) this.listenerMap.get("customtab-result-cb"), "{}");
        }
    }

    @JavascriptInterface
    public void handlePhonepayActivityResult(String str) {
        invokeCallbackInDUIWebview("", str);
    }

    @JavascriptInterface
    public void hideJuspayLoader(final String str) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JBridge$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m318lambda$hideJuspayLoader$1$injuspayhypersdkcoreJBridge(str);
            }
        });
    }

    @JavascriptInterface
    public void hideSoftInput() {
        InputMethodManager inputMethodManager;
        Activity activity = this.activity;
        if (activity == null || activity.getCurrentFocus() == null || (inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.activity.getCurrentFocus().getWindowToken(), 0);
    }

    @JavascriptInterface
    public boolean isCCTSupportedChromeAvailable(String str) {
        try {
            return CustomtabActivity.isChromeInstalled(CustomtabActivity.getCustomTabsPackages(this.juspayServices.getContext(), str));
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public boolean isNoLimitsActivity() {
        Activity activity = this.activity;
        return activity != null && (activity.getWindow().getAttributes().flags & 512) == 512;
    }

    @JavascriptInterface
    public boolean isShimmerPossible() {
        try {
            Class.forName("com.facebook.shimmer.ShimmerFrameLayout");
            Class.forName("com.facebook.shimmer.Shimmer");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public String jweDecrypt(String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            KeyPair keyPair = EncryptionHelper.getKeyPair(str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payload", JOSEUtils.jweDecrypt(str, keyPair.getPrivate()));
            jSONObject.put("error", false);
            return jSONObject.toString();
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to decrypt JSON Web Token", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e);
        }
    }

    @JavascriptInterface
    public String jweEncrypt(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            return String.format("{\"error\":false,\"payload\":\"%s\"}", JOSEUtils.jweEncrypt(str, str2, Base64.decode(str3, 2)));
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to encrypt JSON Web Token", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e);
        }
    }

    @JavascriptInterface
    public String jwsSign(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            return String.format("{\"error\":false,\"payload\":\"%s\"}", JOSEUtils.jwsSign(str, str2, EncryptionHelper.getKeyPair(str3).getPrivate()));
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to sign JSON Web Token", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e);
        }
    }

    @JavascriptInterface
    public boolean jwsVerify(String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            return JOSEUtils.jwsVerify(str, Base64.decode(str2, 2));
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to verify JSON Web Token", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: lambda$drawIcon$2$in-juspay-hypersdk-core-JBridge, reason: not valid java name */
    /* synthetic */ void m317lambda$drawIcon$2$injuspayhypersdkcoreJBridge(int i, Drawable drawable, SdkTracker sdkTracker) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        View viewFindViewById = activity.findViewById(i);
        ImageView imageView = new ImageView(this.activity);
        imageView.setImageDrawable(drawable);
        if (viewFindViewById != null) {
            ((ViewGroup) viewFindViewById).addView(imageView);
            return;
        }
        StringBuilder sb = new StringBuilder("No view at ");
        sb.append(i);
        sb.append(" found to attach the image.");
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.JBRIDGE, "draw_icon", sb.toString());
    }

    /* JADX INFO: renamed from: lambda$hideJuspayLoader$1$in-juspay-hypersdk-core-JBridge, reason: not valid java name */
    /* synthetic */ void m318lambda$hideJuspayLoader$1$injuspayhypersdkcoreJBridge(String str) {
        View viewFindViewById;
        int i;
        float f;
        Activity activity = this.activity;
        if (activity == null || (viewFindViewById = activity.findViewById(898989)) == null) {
            return;
        }
        float f2 = 1.0f;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = Integer.parseInt(jSONObject.optString("animationDuration", "1000"));
            try {
                f2 = Float.parseFloat(jSONObject.optString("startAlpha", "1.0"));
                f = Float.parseFloat(jSONObject.optString("endAlpha", "0.0"));
            } catch (Exception unused) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
        } catch (Exception unused2) {
            i = 1000;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(i);
        viewFindViewById.setAnimation(alphaAnimation);
        FrameLayout container = this.juspayServices.getContainer();
        if (container != null) {
            container.removeView(viewFindViewById);
        }
    }

    /* JADX INFO: renamed from: lambda$newDialogWithoutDateField$3$in-juspay-hypersdk-core-JBridge, reason: not valid java name */
    /* synthetic */ void m319lambda$newDialogWithoutDateField$3$injuspayhypersdkcoreJBridge(String str, DatePicker datePicker, int i, int i2, int i3) {
        StringBuilder sb = i3 / 10 == 0 ? new StringBuilder(SessionDescription.SUPPORTED_SDP_VERSION) : new StringBuilder("");
        sb.append(i3);
        String string = sb.toString();
        int i4 = i2 + 1;
        StringBuilder sb2 = i4 / 10 == 0 ? new StringBuilder(SessionDescription.SUPPORTED_SDP_VERSION) : new StringBuilder("");
        sb2.append(i4);
        String string2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append("-");
        sb3.append(string2);
        sb3.append("-");
        sb3.append(string);
        invokeCallbackInDUIWebview(str, sb3.toString());
    }

    /* JADX INFO: renamed from: lambda$newDialogWithoutDateField$4$in-juspay-hypersdk-core-JBridge, reason: not valid java name */
    /* synthetic */ void m320lambda$newDialogWithoutDateField$4$injuspayhypersdkcoreJBridge(String str, DialogInterface dialogInterface) {
        invokeCallbackInDUIWebview(str, "NaN-NaN");
    }

    /* JADX INFO: renamed from: lambda$showJuspayLoader$0$in-juspay-hypersdk-core-JBridge, reason: not valid java name */
    /* synthetic */ void m321lambda$showJuspayLoader$0$injuspayhypersdkcoreJBridge(String str) {
        int i;
        String strOptString = "Processing your payment";
        Activity activity = this.activity;
        if (activity == null || activity.findViewById(898989) != null) {
            return;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = 1.0f;
        int i2 = 1000;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = Integer.parseInt(jSONObject.optString("rotationDuration", "2100"));
            try {
                i2 = Integer.parseInt(jSONObject.optString("animationDuration", "1000"));
                f = Float.parseFloat(jSONObject.optString("startAlpha", "0.0"));
                f2 = Float.parseFloat(jSONObject.optString("endAlpha", "1.0"));
                strOptString = jSONObject.optString("message", "Processing your payment");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            i = 2100;
        }
        LinearLayout linearLayout = new LinearLayout(this.activity);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
        linearLayout.setGravity(17);
        linearLayout.setId(898989);
        linearLayout.setClickable(true);
        LinearLayout linearLayout2 = new LinearLayout(this.activity);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        ImageView imageView = new ImageView(this.activity);
        imageView.setBackgroundResource(R.drawable.juspay_icon);
        imageView.setLayoutParams(new LinearLayout.LayoutParams((int) dpToPx(48.0f, this.activity), (int) dpToPx(48.0f, this.activity)));
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 350.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(i);
        imageView.startAnimation(rotateAnimation);
        TextView textView = new TextView(this.activity);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setPadding(0, (int) dpToPx(10.0f, this.activity), 0, (int) dpToPx(20.0f, this.activity));
        textView.setTextSize(16.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        textView.setText(strOptString);
        ImageView imageView2 = new ImageView(this.activity);
        imageView2.setBackgroundResource(R.drawable.juspay_safe);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams((int) dpToPx(90.0f, this.activity), (int) dpToPx(12.0f, this.activity)));
        ((LinearLayout.LayoutParams) imageView2.getLayoutParams()).setMargins(0, (int) dpToPx(24.0f, this.activity), 0, 0);
        linearLayout2.addView(imageView);
        linearLayout2.addView(imageView2);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(i2);
        linearLayout.setAnimation(alphaAnimation);
        FrameLayout container = this.juspayServices.getContainer();
        if (container != null) {
            container.addView(linearLayout);
        }
    }

    /* JADX INFO: renamed from: lambda$startDatePicker$5$in-juspay-hypersdk-core-JBridge, reason: not valid java name */
    /* synthetic */ void m322lambda$startDatePicker$5$injuspayhypersdkcoreJBridge(String str, String str2, int i, String str3, String str4, boolean z) {
        DatePickerDialog datePickerDialogNewDialogWithoutDateField = newDialogWithoutDateField(str, str2, i);
        if (datePickerDialogNewDialogWithoutDateField == null) {
            return;
        }
        if (str3 != null && !str3.isEmpty() && !str3.equals("undefined")) {
            datePickerDialogNewDialogWithoutDateField.getDatePicker().setMinDate(dateToMillisecond(str3));
        }
        if (str4 != null && !str4.isEmpty() && !str4.equals("undefined")) {
            datePickerDialogNewDialogWithoutDateField.getDatePicker().setMaxDate(dateToMillisecond(str4));
        }
        View viewFindViewById = datePickerDialogNewDialogWithoutDateField.getDatePicker().findViewById(Resources.getSystem().getIdentifier("day", "id", LogSubCategory.LifeCycle.ANDROID));
        if (viewFindViewById != null) {
            if (z) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        datePickerDialogNewDialogWithoutDateField.show();
    }

    /* JADX INFO: renamed from: lambda$startLottieAnimation$6$in-juspay-hypersdk-core-JBridge, reason: not valid java name */
    /* synthetic */ void m323lambda$startLottieAnimation$6$injuspayhypersdkcoreJBridge(int i, String str, boolean z, float f, float f2, SdkTracker sdkTracker) {
        try {
            Activity activity = this.activity;
            if (activity == null) {
                return;
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) activity.findViewById(i);
            lottieAnimationView.read(true);
            lottieAnimationView.setAnimation(str);
            lottieAnimationView.setRepeatCount(z ? -1 : 0);
            lottieAnimationView.setMinAndMaxProgress(f, f2);
            lottieAnimationView.write();
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while playing Lottie animation", e);
        }
    }

    @JavascriptInterface
    public void launchCustomTab(String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        this.listenerMap.put("customtab-result-cb", str2);
        try {
            if (!this.juspayServices.isPaused()) {
                Intent intent = new Intent(this.juspayServices.getContext(), (Class<?>) CustomtabActivity.class);
                intent.putExtra("url", str);
                registerReceiver("customtab-result");
                this.juspayServices.startActivityForResult(intent, -1, null);
                return;
            }
            sdkTracker.trackAction(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.CUSTOM_TAB, "onPause called before launch customtab");
            unRegisterReceiver();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "onPause");
            invokeCallbackInDUIWebview(str2, jSONObject.toString());
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.CUSTOM_TAB, "Exception at launch customtab", e);
            unRegisterReceiver();
            invokeCallbackInDUIWebview(str2, e.toString());
        }
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3, int i, int i2) {
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction(str3);
        intent.setData(Uri.parse(str2));
        intent.setFlags(i);
        this.juspayServices.startActivityForResult(intent, i2, null);
    }

    @JavascriptInterface
    public String readResource(String str) {
        return this.juspayServices.getApplicationManager().readResourceByName(str);
    }

    @JavascriptInterface
    public String readSplit(String str) {
        return this.juspayServices.getApplicationManager().readSplit(str);
    }

    @JavascriptInterface
    public String readSplits(String str) {
        return this.juspayServices.getApplicationManager().readSplits(str);
    }

    @JavascriptInterface
    public void registerReceiver(String str) {
        if (this.broadcastReceiver != null) {
            return;
        }
        this.broadcastReceiver = new BroadcastReceiver() { // from class: in.juspay.hypersdk.core.JBridge.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                JBridge.this.receiverCallback(intent);
            }
        };
        getProvider.getInstance(this.juspayServices.getContext()).registerReceiver(this.broadcastReceiver, new IntentFilter(str));
    }

    @Override // in.juspay.hypersdk.core.DuiInterface
    public void reset() {
        super.reset();
        unRegisterReceiver();
    }

    @JavascriptInterface
    @Deprecated
    public String rsaEncryption(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance(Constants.ALG_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 2)));
            Cipher cipher = Cipher.getInstance(str2);
            cipher.init(1, rSAPublicKey);
            return String.format("{\"error\":false,\"payload\":\"%s\"}", Base64.encodeToString(cipher.doFinal(str.getBytes()), 2));
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to encrypt using RSA", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e);
        }
    }

    @JavascriptInterface
    public void shareLink(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.juspayServices.startActivityForResult(Intent.createChooser(intent, str2), -1, null);
        invokeCallbackInDUIWebview(str3, "true");
    }

    @JavascriptInterface
    public void showJuspayLoader(final String str) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JBridge$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m321lambda$showJuspayLoader$0$injuspayhypersdkcoreJBridge(str);
            }
        });
    }

    @JavascriptInterface
    public void startDatePicker(String str, String str2, String str3) {
        startDatePicker(str, str2, str3, null, 2, false);
    }

    @JavascriptInterface
    public void startLottieAnimation(final int i, final String str, final boolean z, final float f, final float f2) {
        final SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JBridge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m323lambda$startLottieAnimation$6$injuspayhypersdkcoreJBridge(i, str, z, f, f2, sdkTracker);
            }
        });
    }

    @JavascriptInterface
    public void startPaytmRequest(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (versionCompare(str2, "8.6.0") < 0) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("nativeSdkForMerchantAmount", jSONObject.optString("nativeSdkForMerchantAmount"));
                bundle.putString("orderid", jSONObject.optString("orderid"));
                bundle.putString("mid", jSONObject.optString("mid"));
                bundle.putString("txnToken", jSONObject.optString("txnToken"));
                intent.setComponent(new ComponentName("net.one97.paytm", jSONObject.optString("net.one97.paytm")));
                intent.putExtra("paymentmode", jSONObject.optInt("paymentmode"));
                intent.putExtra("bill", bundle);
                this.juspayServices.startActivityForResult(intent, 116, null);
                this.juspayServices.sdkDebug("paytmSDkParams1", intent.toString());
                return;
            }
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName("net.one97.paytm", jSONObject.optString("net.one97.paytm")));
            intent2.putExtra("paymentmode", jSONObject.optInt("paymentmode"));
            intent2.putExtra("enable_paytm_invoke", jSONObject.optBoolean("enable_paytm_invoke"));
            intent2.putExtra("paytm_invoke", jSONObject.optBoolean("paytm_invoke"));
            intent2.putExtra("price", jSONObject.optString("price"));
            intent2.putExtra("nativeSdkEnabled", jSONObject.optBoolean("nativeSdkEnabled"));
            intent2.putExtra("orderid", jSONObject.optString("orderid"));
            intent2.putExtra("txnToken", jSONObject.optString("txnToken"));
            intent2.putExtra("mid", jSONObject.optString("mid"));
            this.juspayServices.startActivityForResult(intent2, 116, null);
            this.juspayServices.sdkDebug("paytmSDkParams2", intent2.toString());
        } catch (JSONException e) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.PAYTM_UTILS, "Paytm Init Exception", e);
            invokeCallbackInDUIWebview(str3, e.toString());
        }
    }

    @JavascriptInterface
    @Deprecated
    public void startPhonepeRequest(String str, String str2, String str3, String str4) {
        invokeCallbackInDUIWebview(str4, "Function deprecated");
    }

    @JavascriptInterface
    public void unRegisterReceiver() {
        if (this.broadcastReceiver == null) {
            return;
        }
        getProvider.getInstance(this.juspayServices.getContext()).IconCompatParcelizer(this.broadcastReceiver);
        this.broadcastReceiver = null;
    }

    @JavascriptInterface
    public String verifyJws(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            return String.format("{\"error\":false,\"payload\":\"%s\"}", Boolean.valueOf(jwsVerify(str, extractStoredPublicKey(str2, str3))));
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to sign JSON Web Token", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e);
        }
    }

    @JavascriptInterface
    public void writeFileToDisk(String str, String str2, String str3) {
        invokeCallbackInDUIWebview(str3, this.juspayServices.getFileProviderService().writeFileToDisk(this.juspayServices.getContext(), str, str2));
    }

    @JavascriptInterface
    public void startDatePicker(final String str, final String str2, final String str3, final String str4, final int i, final boolean z) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.JBridge$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m322lambda$startDatePicker$5$injuspayhypersdkcoreJBridge(str, str4, i, str2, str3, z);
            }
        });
    }

    @JavascriptInterface
    public void startPhonepeRequest(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setPackage(str2);
        this.juspayServices.startActivityForResult(intent, 113, null);
    }

    @JavascriptInterface
    @Deprecated
    public void checkPhonePeSdk(String str) {
        invokeCallbackInDUIWebview(str, String.valueOf(checkPhonePeSdk()));
    }

    @JavascriptInterface
    public String generateRSAKeyPair(String str) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(Constants.ALG_RSA, Constants.ANDROID_KEYSTORE);
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 15).setEncryptionPaddings("OAEPPadding").setSignaturePaddings("PKCS1").setDigests("SHA-256").setKeySize(2048).build());
            keyPairGenerator.generateKeyPair();
            return String.format("{\"error\":false,\"payload\":\"%s\"}", "SUCCESS");
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error in generateRSAKeyPair", e);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e);
        }
    }
}
