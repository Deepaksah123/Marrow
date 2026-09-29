package kotlin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.decodeGeobFrame;
import kotlin.decodeTextInformationFrame;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class decodeTxxxFrame {
    private static final Pattern write = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final long AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final Context IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public decodeTxxxFrame(Context context, String str, String str2, String str3, long j, long j2) {
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.AudioAttributesImplApi21Parcelizer = read(str);
        this.MediaBrowserCompatItemReceiver = str3;
        this.AudioAttributesCompatParcelizer = j;
        this.AudioAttributesImplBaseParcelizer = j2;
    }

    private static String read(String str) {
        Matcher matcher = write.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    final HttpURLConnection AudioAttributesCompatParcelizer() throws IcyInfo1 {
        try {
            return (HttpURLConnection) new URL(RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatItemReceiver)).openConnection();
        } catch (IOException e) {
            throw new IcyInfo1(e.getMessage());
        }
    }

    final decodeTextInformationFrame.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws IcyInfo1 {
        RemoteActionCompatParcelizer(httpURLConnection, str3, str2, map2);
        try {
            try {
                write(httpURLConnection, write(str, str2, map, l).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new CommentFrame1(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectIconCompatParcelizer = IconCompatParcelizer(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                decodeGeobFrame decodegeobframeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jSONObjectIconCompatParcelizer, date);
                if (!read(jSONObjectIconCompatParcelizer)) {
                    return decodeTextInformationFrame.RemoteActionCompatParcelizer.IconCompatParcelizer(date, decodegeobframeRemoteActionCompatParcelizer);
                }
                return decodeTextInformationFrame.RemoteActionCompatParcelizer.IconCompatParcelizer(decodegeobframeRemoteActionCompatParcelizer, headerField);
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException | JSONException e) {
            throw new ApicFrame1("The client had an error while calling the backend!", e);
        }
    }

    private void RemoteActionCompatParcelizer(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(this.AudioAttributesCompatParcelizer));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(this.AudioAttributesImplBaseParcelizer));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        read(httpURLConnection, str2);
        RemoteActionCompatParcelizer(httpURLConnection, map);
    }

    private static String RemoteActionCompatParcelizer(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    private void read(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.read);
        httpURLConnection.setRequestProperty("X-Android-Package", this.IconCompatParcelizer.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", read());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty(RtspHeaders.ACCEPT, "application/json");
    }

    private static void RemoteActionCompatParcelizer(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private String read() {
        try {
            Context context = this.IconCompatParcelizer;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                this.IconCompatParcelizer.getPackageName();
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            this.IconCompatParcelizer.getPackageName();
            return null;
        }
    }

    private JSONObject write(String str, String str2, Map<String, String> map, Long l) throws ApicFrame1 {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new ApicFrame1("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.RemoteActionCompatParcelizer);
        Locale locale = this.IconCompatParcelizer.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.IconCompatParcelizer.getPackageManager().getPackageInfo(this.IconCompatParcelizer.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(_parseDateFromArray.RemoteActionCompatParcelizer(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", this.IconCompatParcelizer.getPackageName());
        map2.put(PaymentConstants.SDK_VERSION, "21.4.1");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l != null) {
            map2.put("firstOpenTime", RemoteActionCompatParcelizer(l.longValue()));
        }
        return new JSONObject(map2);
    }

    private static String RemoteActionCompatParcelizer(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    private static void write(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private static JSONObject IconCompatParcelizer(URLConnection uRLConnection) throws JSONException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i != -1) {
                sb.append((char) i);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    private static boolean read(JSONObject jSONObject) {
        try {
            return true ^ jSONObject.get(NotesDispatchAddressRequestKt.KEY_STATE).equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private static decodeGeobFrame RemoteActionCompatParcelizer(JSONObject jSONObject, Date date) throws ApicFrame1 {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            decodeGeobFrame.read readVarAudioAttributesCompatParcelizer = decodeGeobFrame.write().AudioAttributesCompatParcelizer(date);
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                readVarAudioAttributesCompatParcelizer = readVarAudioAttributesCompatParcelizer.IconCompatParcelizer(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                readVarAudioAttributesCompatParcelizer = readVarAudioAttributesCompatParcelizer.write(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                readVarAudioAttributesCompatParcelizer = readVarAudioAttributesCompatParcelizer.write(jSONObject3);
            }
            String string = jSONObject.has("templateVersion") ? jSONObject.getString("templateVersion") : null;
            if (string != null) {
                readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(Long.parseLong(string));
            }
            return readVarAudioAttributesCompatParcelizer.write();
        } catch (JSONException e) {
            throw new ApicFrame1("Fetch failed: fetch response could not be parsed.", e);
        }
    }
}
