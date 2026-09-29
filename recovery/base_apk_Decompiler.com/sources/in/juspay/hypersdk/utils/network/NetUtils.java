package in.juspay.hypersdk.utils.network;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.security.HyperSSLSocketFactory;
import in.juspay.hypersdk.utils.network.NetworkSummarizer;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.C0156TypeKt;
import kotlin.LessonCompletedDialogonViewCreatedllm1;
import kotlin.MediaType;
import kotlin.ThemeKtExternalSyntheticLambda0;
import kotlin.ThemeKtExternalSyntheticLambda2;
import kotlin.ThemeKtExternalSyntheticLambda3;
import kotlin.dolbyVisionStringToProfile;
import kotlin.getPlaybackUrlsEncrypt;
import kotlin.toDownloadInfo;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class NetUtils {
    private static final String HTTP_CACHE_NAME = "hyper-http-cache";
    private static final String TAG = "NetUtils";
    private static String USER_AGENT;
    private int connectionTimeout;
    private final ThemeKtExternalSyntheticLambda3 httpClient;
    private final NetworkSummarizer networkSummarizer;
    private int readTimeout;
    private String sessionId;
    private final boolean sslPinningRequired;
    private SSLSocketFactory sslSocketFactory;
    private boolean trackMetrics;
    private static final MediaType MEDIA_TYPE_TEXT = MediaType.RemoteActionCompatParcelizer("text/plain");
    private static String packageName = null;
    private static String godelAppName = null;
    public static final ThemeKtExternalSyntheticLambda3 DEFAULT_HTTP_CLIENT = buildHttpClient();

    static {
        String property = System.getProperty("http.agent");
        USER_AGENT = property;
        if (property == null || property.length() == 0) {
            USER_AGENT = "Juspay Express Checkout Android SDK";
        }
    }

    public NetUtils(int i, int i2) {
        this(i, i2, false);
    }

    private static ThemeKtExternalSyntheticLambda3 buildHttpClient() {
        return new ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new getPlaybackUrlsEncrypt(JuspayCoreLib.getApplicationContext().getDir(HTTP_CACHE_NAME, 0), 10485760L)).IconCompatParcelizer().RemoteActionCompatParcelizer();
    }

    public static void cancelAPICall(String str, SdkTracker sdkTracker) {
        try {
            for (toDownloadInfo todownloadinfo : DEFAULT_HTTP_CLIENT.getDispatcher().RemoteActionCompatParcelizer()) {
                if (str.equals(todownloadinfo.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver())) {
                    todownloadinfo.RemoteActionCompatParcelizer();
                    sdkTracker.trackAction(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.CANCEL_API, "Cancelling api call from running calls", str);
                    return;
                }
            }
            for (toDownloadInfo todownloadinfo2 : DEFAULT_HTTP_CLIENT.getDispatcher().IconCompatParcelizer()) {
                if (str.equals(todownloadinfo2.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver())) {
                    todownloadinfo2.RemoteActionCompatParcelizer();
                    sdkTracker.trackAction(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.CANCEL_API, "Cancelling api call from queued calls", str);
                    return;
                }
            }
            sdkTracker.trackAction(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.CANCEL_API, "Not able to Cancel api call from queued/running calls", str);
        } catch (Exception e) {
            sdkTracker.trackAndLogException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.Network.CANCEL_API, "Exception while Cancelling API with tag ".concat(String.valueOf(str)), e);
        }
    }

    private static ThemeKtExternalSyntheticLambda2 createRequestBody(final byte[] bArr, final String str) {
        return new ThemeKtExternalSyntheticLambda2() { // from class: in.juspay.hypersdk.utils.network.NetUtils.1
            @Override // kotlin.ThemeKtExternalSyntheticLambda2
            public MediaType contentType() {
                String str2 = str;
                return (str2 == null || MediaType.RemoteActionCompatParcelizer(str2) == null) ? NetUtils.MEDIA_TYPE_TEXT : MediaType.RemoteActionCompatParcelizer(str);
            }

            @Override // kotlin.ThemeKtExternalSyntheticLambda2
            public void writeTo(LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) throws IOException {
                lessonCompletedDialogonViewCreatedllm1.RemoteActionCompatParcelizer(bArr);
            }
        };
    }

    private C0156TypeKt doMethod(String str, String str2, Map<String, String> map, Map<String, String> map2, byte[] bArr, String str3, JSONObject jSONObject, String str4) throws IOException {
        X509TrustManager x509TrustManager;
        String strGenerateQueryString = generateQueryString(map);
        StringBuilder sb = new StringBuilder(str2);
        if (!strGenerateQueryString.isEmpty()) {
            sb.append("?");
            sb.append(strGenerateQueryString);
            str2 = sb.toString();
        }
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer IconCompatParcelizer = new ThemeKtExternalSyntheticLambda0.IconCompatParcelizer().IconCompatParcelizer(str2);
        if (str4 != null) {
            IconCompatParcelizer.read(str4);
        }
        if (map2 != null) {
            setHeaders(IconCompatParcelizer, map2);
        }
        setHeaders(IconCompatParcelizer, getDefaultSDKHeaders());
        if (bArr != null) {
            String contentType = getContentType(map2);
            if (contentType != null) {
                str3 = contentType;
            }
            IconCompatParcelizer.AudioAttributesCompatParcelizer(str, createRequestBody(bArr, str3));
        } else {
            IconCompatParcelizer.AudioAttributesCompatParcelizer(str, (ThemeKtExternalSyntheticLambda2) null);
        }
        ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPlayFromMediaId = DEFAULT_HTTP_CLIENT.onPlayFromMediaId();
        if (jSONObject != null) {
            setOptions(audioAttributesCompatParcelizerOnPlayFromMediaId, jSONObject);
        }
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
        if (sSLSocketFactory != null && (x509TrustManager = HyperSSLSocketFactory.DEFAULT_TRUST_MANAGER) != null) {
            audioAttributesCompatParcelizerOnPlayFromMediaId.RemoteActionCompatParcelizer(sSLSocketFactory, x509TrustManager);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0156TypeKt c0156TypeKt = dolbyVisionStringToProfile.read(audioAttributesCompatParcelizerOnPlayFromMediaId.RemoteActionCompatParcelizer().IconCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer()));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        String str5 = "CACHE-MISS";
        if (str.equalsIgnoreCase("GET")) {
            C0156TypeKt networkResponse = c0156TypeKt.getNetworkResponse();
            int code = networkResponse != null ? networkResponse.getCode() : -1;
            if (c0156TypeKt.getCacheResponse() != null && code == 304) {
                str5 = "CONDITIONAL-HIT";
            } else if (c0156TypeKt.getCacheResponse() != null && code == -1) {
                str5 = "CACHE-HIT";
            }
            JuspayLogger.d(TAG, String.format("GET %s %s -> %s ms [%s] [x-cache: %s]", str2, Integer.valueOf(c0156TypeKt.getCode()), Long.valueOf(jCurrentTimeMillis2), str5, c0156TypeKt.read("x-cache")));
        } else {
            JuspayLogger.d(TAG, String.format("%s %s %s -> %s ms", str, str2, Integer.valueOf(c0156TypeKt.getCode()), Long.valueOf(jCurrentTimeMillis2)));
        }
        if (!str5.equalsIgnoreCase("CACHE-HIT") && this.trackMetrics) {
            this.networkSummarizer.addMetric(c0156TypeKt, jCurrentTimeMillis2);
        }
        return c0156TypeKt;
    }

    private static String getContentType(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String str = map.get("content-type");
        return str == null ? map.get(RtspHeaders.CONTENT_TYPE) : str;
    }

    public static void setApplicationHeaders(Context context) {
        packageName = context.getPackageName();
        godelAppName = context.getString(R.string.godel_app_name);
    }

    private void setDefaultSDKHeaders(HttpsURLConnection httpsURLConnection) {
        for (Map.Entry<String, String> entry : getDefaultSDKHeaders().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                httpsURLConnection.setRequestProperty(key, value);
            }
        }
    }

    private static void setHeaders(ThemeKtExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer, Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null && (!key.equalsIgnoreCase("accept-encoding") || !value.equalsIgnoreCase("gzip"))) {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(key, value);
                }
            }
        }
    }

    private void setOptions(ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("connectionTimeout", this.connectionTimeout);
        int iOptInt2 = jSONObject.optInt("readTimeout", this.readTimeout);
        int iOptInt3 = jSONObject.optInt("writeTimeout", -1);
        boolean zOptBoolean = jSONObject.optBoolean("retryOnConnectionFailure", true);
        if (iOptInt != -1) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(iOptInt, TimeUnit.MILLISECONDS);
        }
        if (iOptInt2 != -1) {
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iOptInt2, TimeUnit.MILLISECONDS);
        }
        if (iOptInt3 != -1) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iOptInt3, TimeUnit.MILLISECONDS);
        }
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(zOptBoolean);
    }

    public C0156TypeKt deleteUrl(URL url, Map<String, String> map, JSONObject jSONObject) {
        return doDelete(url, generateQueryString(map).getBytes(), "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public C0156TypeKt doDelete(URL url, byte[] bArr, String str, Map<String, String> map, JSONObject jSONObject, String str2) {
        return doMethod("DELETE", url.toString(), null, map, bArr, str, jSONObject, str2);
    }

    public C0156TypeKt doGet(String str) {
        return doGet(str, null, null, null, null);
    }

    public C0156TypeKt doHead(String str, Map<String, String> map, Map<String, String> map2, JSONObject jSONObject, String str2) {
        return doMethod("HEAD", str, map2, map, null, null, jSONObject, str2);
    }

    public C0156TypeKt doPost(URL url, byte[] bArr, String str, Map<String, String> map, JSONObject jSONObject, String str2) {
        return doMethod("POST", url.toString(), null, map, bArr, str, jSONObject, str2);
    }

    public C0156TypeKt doPut(Context context, URL url, byte[] bArr, Map<String, String> map, NetUtils netUtils, JSONObject jSONObject, String str) {
        return doMethod("PUT", url.toString(), null, map, bArr, null, jSONObject, str);
    }

    public byte[] fetchIfModified(String str, Map<String, String> map) {
        C0156TypeKt c0156TypeKtDoGet = doGet(str, map, null, new JSONObject(), null);
        if (c0156TypeKtDoGet.getCode() == 200) {
            return new JuspayHttpsResponse(c0156TypeKtDoGet).responsePayload;
        }
        return null;
    }

    public String generateQueryString(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), CharsetNames.UTF_8));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), CharsetNames.UTF_8));
            }
        }
        return sb.toString();
    }

    protected Map<String, String> getDefaultSDKHeaders() {
        HashMap map = new HashMap();
        map.put(RtspHeaders.USER_AGENT, USER_AGENT);
        map.put("Accept-Language", "en-US,en;q=0.5");
        map.put("X-Powered-By", "Juspay EC SDK for Android");
        map.put("X-App-Name", godelAppName);
        map.put("Referer", packageName);
        map.put("x-multiclient-integration", String.valueOf(JuspayCoreLib.isMultiClientIntegration()));
        return map;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public C0156TypeKt postForm(URL url, Map<String, String> map, JSONObject jSONObject) {
        return doPost(url, generateQueryString(map).getBytes(), "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public <T> C0156TypeKt postJson(URL url, T t, JSONObject jSONObject) {
        return doPost(url, t.toString().getBytes(), "application/json", null, jSONObject, null);
    }

    public void postMetrics(String str, String str2, String str3, boolean z) {
        try {
            NetworkSummarizer.Summary summaryPublishSummary = this.networkSummarizer.publishSummary(str2, str3, z);
            HashMap map = new HashMap();
            map.put("summary", summaryPublishSummary.toJSON().toString());
            doMethod("GET", str, map, null, null, null, null, null).close();
        } catch (Exception unused) {
        }
    }

    public C0156TypeKt postUrl(URL url, Map<String, String> map, JSONObject jSONObject) {
        return doPost(url, generateQueryString(map).getBytes(), "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public void setConnectionTimeout(int i) {
        this.connectionTimeout = i;
    }

    public void setReadTimeout(int i) {
        this.readTimeout = i;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTrackMetrics(boolean z) {
        this.trackMetrics = z;
    }

    public NetUtils(int i, int i2, boolean z) {
        this.trackMetrics = false;
        this.networkSummarizer = new NetworkSummarizer();
        this.connectionTimeout = i;
        this.readTimeout = i2;
        this.sslPinningRequired = z;
        ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPlayFromMediaId = DEFAULT_HTTP_CLIENT.onPlayFromMediaId();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.httpClient = audioAttributesCompatParcelizerOnPlayFromMediaId.AudioAttributesCompatParcelizer(j, timeUnit).IconCompatParcelizer(i, timeUnit).RemoteActionCompatParcelizer();
        this.sslSocketFactory = new JuspaySSLSocketFactory();
    }

    public C0156TypeKt deleteUrl(URL url, Map<String, String> map, Map<String, String> map2, JSONObject jSONObject, String str) {
        return doDelete(url, generateQueryString(map2).getBytes(), "application/json", map, jSONObject, str);
    }

    public C0156TypeKt doGet(String str, Map<String, String> map) {
        return doMethod("GET", str, null, map, null, null, null, null);
    }

    public C0156TypeKt postUrl(URL url, Map<String, String> map, Map<String, String> map2, JSONObject jSONObject, String str) {
        return doPost(url, generateQueryString(map2).getBytes(), "application/json", map, jSONObject, str);
    }

    public C0156TypeKt deleteUrl(URL url, Map<String, String> map, String str, JSONObject jSONObject, String str2) {
        return doDelete(url, str.getBytes(), "application/x-www-form-urlencoded", map, jSONObject, str2);
    }

    public C0156TypeKt doGet(String str, Map<String, String> map, Map<String, String> map2, JSONObject jSONObject, String str2) {
        return doMethod("GET", str, map2, map, null, null, jSONObject, str2);
    }

    public C0156TypeKt postUrl(URL url, Map<String, String> map, String str, JSONObject jSONObject, String str2) {
        return doPost(url, str.getBytes(), "application/x-www-form-urlencoded", map, jSONObject, str2);
    }

    public C0156TypeKt deleteUrl(URL url, JSONObject jSONObject) {
        return doDelete(url, null, "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public C0156TypeKt postUrl(URL url, JSONObject jSONObject) {
        return doPost(url, null, "application/x-www-form-urlencoded", null, jSONObject, null);
    }
}
