package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.security.EncryptionHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.MediaCodecInfo;
import kotlin.adjustMaxInputChannelCount;
import kotlin.getFirstSampleTimeUs;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaCodecAdapterConfiguration {
    private static final Pattern IconCompatParcelizer = Pattern.compile("[0-9]+s");
    private static final Charset read = Charset.forName(CharsetNames.UTF_8);
    private final Context AudioAttributesCompatParcelizer;
    private final getDiagnosticInfoV21 RemoteActionCompatParcelizer = new getDiagnosticInfoV21();
    private final onInputBufferAvailable<AsynchronousMediaCodecCallback> write;

    private static boolean RemoteActionCompatParcelizer(int i) {
        return i >= 200 && i < 300;
    }

    public MediaCodecAdapterConfiguration(Context context, onInputBufferAvailable<AsynchronousMediaCodecCallback> oninputbufferavailable) {
        this.AudioAttributesCompatParcelizer = context;
        this.write = oninputbufferavailable;
    }

    public final MediaCodecInfo IconCompatParcelizer(String str, String str2, String str3, String str4, String str5) throws getFirstSampleTimeUs {
        int responseCode;
        MediaCodecInfo mediaCodecInfoAudioAttributesCompatParcelizer;
        if (!this.RemoteActionCompatParcelizer.write()) {
            throw new getFirstSampleTimeUs("Firebase Installations Service is unavailable. Please try again later.", getFirstSampleTimeUs.read.UNAVAILABLE);
        }
        URL urlAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(String.format("projects/%s/installations", str3));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionIconCompatParcelizer = IconCompatParcelizer(urlAudioAttributesCompatParcelizer, str);
            try {
                try {
                    httpURLConnectionIconCompatParcelizer.setRequestMethod("POST");
                    httpURLConnectionIconCompatParcelizer.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionIconCompatParcelizer.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    AudioAttributesCompatParcelizer(httpURLConnectionIconCompatParcelizer, str2, str4);
                    responseCode = httpURLConnectionIconCompatParcelizer.getResponseCode();
                    this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(responseCode);
                } finally {
                    httpURLConnectionIconCompatParcelizer.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (RemoteActionCompatParcelizer(responseCode)) {
                mediaCodecInfoAudioAttributesCompatParcelizer = read(httpURLConnectionIconCompatParcelizer);
            } else {
                read(httpURLConnectionIconCompatParcelizer, str4, str, str3);
                if (responseCode == 429) {
                    throw new getFirstSampleTimeUs("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", getFirstSampleTimeUs.read.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    mediaCodecInfoAudioAttributesCompatParcelizer = MediaCodecInfo.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(MediaCodecInfo.read.BAD_CONFIG).AudioAttributesCompatParcelizer();
                } else {
                    httpURLConnectionIconCompatParcelizer.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            return mediaCodecInfoAudioAttributesCompatParcelizer;
        }
        throw new getFirstSampleTimeUs("Firebase Installations Service is unavailable. Please try again later.", getFirstSampleTimeUs.read.UNAVAILABLE);
    }

    private static void AudioAttributesCompatParcelizer(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        read(httpURLConnection, AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(str, str2)));
    }

    private static byte[] AudioAttributesCompatParcelizer(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes(CharsetNames.UTF_8);
    }

    private static void read(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static JSONObject AudioAttributesCompatParcelizer(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put(PaymentConstants.SDK_VERSION, "a:17.1.3");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void IconCompatParcelizer(HttpURLConnection httpURLConnection) throws IOException {
        read(httpURLConnection, AudioAttributesCompatParcelizer(read()));
    }

    private static JSONObject read() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PaymentConstants.SDK_VERSION, "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private static URL AudioAttributesCompatParcelizer(String str) throws getFirstSampleTimeUs {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", EncryptionHelper.ENCRYPTED_VERSION, str));
        } catch (MalformedURLException e) {
            throw new getFirstSampleTimeUs(e.getMessage(), getFirstSampleTimeUs.read.UNAVAILABLE);
        }
    }

    public final adjustMaxInputChannelCount write(String str, String str2, String str3, String str4) throws getFirstSampleTimeUs {
        int responseCode;
        adjustMaxInputChannelCount adjustmaxinputchannelcountAudioAttributesCompatParcelizer;
        if (!this.RemoteActionCompatParcelizer.write()) {
            throw new getFirstSampleTimeUs("Firebase Installations Service is unavailable. Please try again later.", getFirstSampleTimeUs.read.UNAVAILABLE);
        }
        URL urlAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionIconCompatParcelizer = IconCompatParcelizer(urlAudioAttributesCompatParcelizer, str);
            try {
                httpURLConnectionIconCompatParcelizer.setRequestMethod("POST");
                StringBuilder sb = new StringBuilder();
                sb.append("FIS_v2 ");
                sb.append(str4);
                httpURLConnectionIconCompatParcelizer.addRequestProperty(RtspHeaders.AUTHORIZATION, sb.toString());
                httpURLConnectionIconCompatParcelizer.setDoOutput(true);
                IconCompatParcelizer(httpURLConnectionIconCompatParcelizer);
                responseCode = httpURLConnectionIconCompatParcelizer.getResponseCode();
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(responseCode);
            } catch (IOException | AssertionError unused) {
            } catch (Throwable th) {
                httpURLConnectionIconCompatParcelizer.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (RemoteActionCompatParcelizer(responseCode)) {
                adjustmaxinputchannelcountAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(httpURLConnectionIconCompatParcelizer);
            } else {
                read(httpURLConnectionIconCompatParcelizer, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    adjustmaxinputchannelcountAudioAttributesCompatParcelizer = adjustMaxInputChannelCount.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(adjustMaxInputChannelCount.IconCompatParcelizer.AUTH_ERROR).write();
                } else {
                    if (responseCode == 429) {
                        throw new getFirstSampleTimeUs("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", getFirstSampleTimeUs.read.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        adjustmaxinputchannelcountAudioAttributesCompatParcelizer = adjustMaxInputChannelCount.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(adjustMaxInputChannelCount.IconCompatParcelizer.BAD_CONFIG).write();
                    } else {
                        httpURLConnectionIconCompatParcelizer.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            }
            httpURLConnectionIconCompatParcelizer.disconnect();
            TrafficStats.clearThreadStatsTag();
            return adjustmaxinputchannelcountAudioAttributesCompatParcelizer;
        }
        throw new getFirstSampleTimeUs("Firebase Installations Service is unavailable. Please try again later.", getFirstSampleTimeUs.read.UNAVAILABLE);
    }

    private HttpURLConnection IconCompatParcelizer(URL url, String str) throws getFirstSampleTimeUs {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty(RtspHeaders.ACCEPT, "application/json");
            httpURLConnection.addRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty(RtspHeaders.CACHE_CONTROL, "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.AudioAttributesCompatParcelizer.getPackageName());
            AsynchronousMediaCodecCallback asynchronousMediaCodecCallbackWrite = this.write.write();
            if (asynchronousMediaCodecCallbackWrite != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(asynchronousMediaCodecCallbackWrite.RemoteActionCompatParcelizer()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", AudioAttributesCompatParcelizer());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new getFirstSampleTimeUs("Firebase Installations Service is unavailable. Please try again later.", getFirstSampleTimeUs.read.UNAVAILABLE);
        }
    }

    private static MediaCodecInfo read(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, read));
        adjustMaxInputChannelCount.write writeVarRemoteActionCompatParcelizer = adjustMaxInputChannelCount.RemoteActionCompatParcelizer();
        MediaCodecInfo.IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi21Parcelizer = MediaCodecInfo.AudioAttributesImplApi21Parcelizer();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                iconCompatParcelizerAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                iconCompatParcelizerAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                iconCompatParcelizerAudioAttributesImplApi21Parcelizer.write(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals(LoggedUserResponse.KEY_TOKEN)) {
                        writeVarRemoteActionCompatParcelizer.read(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(write(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                iconCompatParcelizerAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer.write());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return iconCompatParcelizerAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(MediaCodecInfo.read.OK).AudioAttributesCompatParcelizer();
    }

    private static adjustMaxInputChannelCount AudioAttributesCompatParcelizer(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, read));
        adjustMaxInputChannelCount.write writeVarRemoteActionCompatParcelizer = adjustMaxInputChannelCount.RemoteActionCompatParcelizer();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(LoggedUserResponse.KEY_TOKEN)) {
                writeVarRemoteActionCompatParcelizer.read(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(write(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(adjustMaxInputChannelCount.IconCompatParcelizer.OK).write();
    }

    private String AudioAttributesCompatParcelizer() {
        try {
            Context context = this.AudioAttributesCompatParcelizer;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                this.AudioAttributesCompatParcelizer.getPackageName();
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            this.AudioAttributesCompatParcelizer.getPackageName();
            return null;
        }
    }

    private static long write(String str) {
        Preconditions.checkArgument(IconCompatParcelizer.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static void read(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (TextUtils.isEmpty(write(httpURLConnection))) {
            return;
        }
        RemoteActionCompatParcelizer(str, str2, str3);
    }

    private static String RemoteActionCompatParcelizer(String str, String str2, String str3) {
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, TextUtils.isEmpty(str) ? "" : ", ".concat(String.valueOf(str)));
    }

    private static String write(HttpURLConnection httpURLConnection) {
        StringBuilder sb;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, read));
        try {
            try {
                sb = new StringBuilder();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }
}
