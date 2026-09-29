package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.marrow.data.models.ResponseError;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.ErrorStateDrmSession;
import kotlin.mediaDrmStateExceptionToErrorCode;
import kotlin.setOnExpirationUpdateListener;
import kotlin.setPropertyByteArray;
import kotlin.setPropertyString;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class mediaDrmStateExceptionToErrorCode implements FrameworkMediaDrmApi31 {
    private final Context AudioAttributesCompatParcelizer;
    private final BinarySearchSeeker AudioAttributesImplApi21Parcelizer;
    private final ConnectivityManager IconCompatParcelizer;
    private final BinarySearchSeeker MediaBrowserCompatItemReceiver;
    private URL RemoteActionCompatParcelizer;
    private final maybeBlockOnQueueing read;
    private final int write;

    private static URL IconCompatParcelizer(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: ".concat(String.valueOf(str)), e);
        }
    }

    private mediaDrmStateExceptionToErrorCode(Context context, BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2, byte b) {
        this.read = setOnEventListener.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer = context;
        this.IconCompatParcelizer = (ConnectivityManager) context.getSystemService("connectivity");
        this.RemoteActionCompatParcelizer = IconCompatParcelizer(DrmUtilApi23.IconCompatParcelizer);
        this.MediaBrowserCompatItemReceiver = binarySearchSeeker2;
        this.AudioAttributesImplApi21Parcelizer = binarySearchSeeker;
        this.write = 130000;
    }

    public mediaDrmStateExceptionToErrorCode(Context context, BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2) {
        this(context, binarySearchSeeker, binarySearchSeeker2, (byte) 0);
    }

    private static TelephonyManager AudioAttributesCompatParcelizer(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static int read(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            executeKeyRequest.IconCompatParcelizer("CctTransportBackend");
            return -1;
        }
    }

    @Override // kotlin.FrameworkMediaDrmApi31
    public final ExoMediaDrmOnEventListener IconCompatParcelizer(ExoMediaDrmOnEventListener exoMediaDrmOnEventListener) {
        NetworkInfo activeNetworkInfo = this.IconCompatParcelizer.getActiveNetworkInfo();
        return exoMediaDrmOnEventListener.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer("sdk-version", Build.VERSION.SDK_INT).read("model", Build.MODEL).read("hardware", Build.HARDWARE).read(LogSubCategory.Context.DEVICE, Build.DEVICE).read("product", Build.PRODUCT).read("os-uild", Build.ID).read("manufacturer", Build.MANUFACTURER).read("fingerprint", Build.FINGERPRINT).read("tz-offset", IconCompatParcelizer()).RemoteActionCompatParcelizer("net-type", read(activeNetworkInfo)).RemoteActionCompatParcelizer("mobile-subtype", RemoteActionCompatParcelizer(activeNetworkInfo)).read("country", Locale.getDefault().getCountry()).read("locale", Locale.getDefault().getLanguage()).read("mcc_mnc", AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer).getSimOperator()).read("application_build", Integer.toString(read(this.AudioAttributesCompatParcelizer))).AudioAttributesCompatParcelizer();
    }

    private static int read(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return ErrorStateDrmSession.AudioAttributesCompatParcelizer.NONE.write();
        }
        return networkInfo.getType();
    }

    private static int RemoteActionCompatParcelizer(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return ErrorStateDrmSession.RemoteActionCompatParcelizer.UNKNOWN_MOBILE_SUBTYPE.RemoteActionCompatParcelizer();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return ErrorStateDrmSession.RemoteActionCompatParcelizer.COMBINED.RemoteActionCompatParcelizer();
        }
        if (ErrorStateDrmSession.RemoteActionCompatParcelizer.IconCompatParcelizer(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private setOnEventListener AudioAttributesCompatParcelizer(newInstance newinstance) {
        setPropertyString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer;
        HashMap map = new HashMap();
        for (ExoMediaDrmOnEventListener exoMediaDrmOnEventListener : newinstance.RemoteActionCompatParcelizer()) {
            String strRemoteActionCompatParcelizer = exoMediaDrmOnEventListener.RemoteActionCompatParcelizer();
            if (!map.containsKey(strRemoteActionCompatParcelizer)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(exoMediaDrmOnEventListener);
                map.put(strRemoteActionCompatParcelizer, arrayList);
            } else {
                ((List) map.get(strRemoteActionCompatParcelizer)).add(exoMediaDrmOnEventListener);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            ExoMediaDrmOnEventListener exoMediaDrmOnEventListener2 = (ExoMediaDrmOnEventListener) ((List) entry.getValue()).get(0);
            setPropertyByteArray.IconCompatParcelizer IconCompatParcelizer2 = setPropertyByteArray.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(setPlayerIdForSession.DEFAULT).AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()).RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()).IconCompatParcelizer(setOnExpirationUpdateListener.IconCompatParcelizer().RemoteActionCompatParcelizer(setOnExpirationUpdateListener.write.ANDROID_FIREBASE).RemoteActionCompatParcelizer(getKeyRequest.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Integer.valueOf(exoMediaDrmOnEventListener2.RemoteActionCompatParcelizer("sdk-version"))).AudioAttributesImplApi26Parcelizer(exoMediaDrmOnEventListener2.IconCompatParcelizer("model")).IconCompatParcelizer(exoMediaDrmOnEventListener2.IconCompatParcelizer("hardware")).AudioAttributesCompatParcelizer(exoMediaDrmOnEventListener2.IconCompatParcelizer(LogSubCategory.Context.DEVICE)).MediaBrowserCompatMediaItem(exoMediaDrmOnEventListener2.IconCompatParcelizer("product")).AudioAttributesImplApi21Parcelizer(exoMediaDrmOnEventListener2.IconCompatParcelizer("os-uild")).AudioAttributesImplBaseParcelizer(exoMediaDrmOnEventListener2.IconCompatParcelizer("manufacturer")).RemoteActionCompatParcelizer(exoMediaDrmOnEventListener2.IconCompatParcelizer("fingerprint")).read(exoMediaDrmOnEventListener2.IconCompatParcelizer("country")).MediaBrowserCompatItemReceiver(exoMediaDrmOnEventListener2.IconCompatParcelizer("locale")).MediaBrowserCompatCustomActionResultReceiver(exoMediaDrmOnEventListener2.IconCompatParcelizer("mcc_mnc")).write(exoMediaDrmOnEventListener2.IconCompatParcelizer("application_build")).AudioAttributesCompatParcelizer()).write());
            try {
                IconCompatParcelizer2.IconCompatParcelizer(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                IconCompatParcelizer2.AudioAttributesCompatParcelizer((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (ExoMediaDrmOnEventListener exoMediaDrmOnEventListener3 : (List) entry.getValue()) {
                ExoMediaDrmKeyRequest exoMediaDrmKeyRequestWrite = exoMediaDrmOnEventListener3.write();
                DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReferenceWrite = exoMediaDrmKeyRequestWrite.write();
                if (drmSessionManagerDrmSessionReferenceWrite.equals(DrmSessionManagerDrmSessionReference.IconCompatParcelizer("proto"))) {
                    audioAttributesCompatParcelizerIconCompatParcelizer = setPropertyString.read(exoMediaDrmKeyRequestWrite.IconCompatParcelizer());
                } else if (drmSessionManagerDrmSessionReferenceWrite.equals(DrmSessionManagerDrmSessionReference.IconCompatParcelizer("json"))) {
                    audioAttributesCompatParcelizerIconCompatParcelizer = setPropertyString.IconCompatParcelizer(new String(exoMediaDrmKeyRequestWrite.IconCompatParcelizer(), Charset.forName(CharsetNames.UTF_8)));
                } else {
                    executeKeyRequest.IconCompatParcelizer("CctTransportBackend", drmSessionManagerDrmSessionReferenceWrite);
                }
                audioAttributesCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer(exoMediaDrmOnEventListener3.IconCompatParcelizer()).RemoteActionCompatParcelizer(exoMediaDrmOnEventListener3.AudioAttributesImplBaseParcelizer()).write(exoMediaDrmOnEventListener3.write("tz-offset")).read(ErrorStateDrmSession.IconCompatParcelizer().read(ErrorStateDrmSession.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(exoMediaDrmOnEventListener3.RemoteActionCompatParcelizer("net-type"))).write(ErrorStateDrmSession.RemoteActionCompatParcelizer.IconCompatParcelizer(exoMediaDrmOnEventListener3.RemoteActionCompatParcelizer("mobile-subtype"))).write());
                if (exoMediaDrmOnEventListener3.AudioAttributesCompatParcelizer() != null) {
                    audioAttributesCompatParcelizerIconCompatParcelizer.write(exoMediaDrmOnEventListener3.AudioAttributesCompatParcelizer());
                }
                arrayList3.add(audioAttributesCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer());
            }
            IconCompatParcelizer2.write(arrayList3);
            arrayList2.add(IconCompatParcelizer2.AudioAttributesCompatParcelizer());
        }
        return setOnEventListener.read(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public read AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        executeKeyRequest.write("CctTransportBackend", iconCompatParcelizer.RemoteActionCompatParcelizer);
        HttpURLConnection httpURLConnection = (HttpURLConnection) iconCompatParcelizer.RemoteActionCompatParcelizer.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.write);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", iconCompatParcelizer.AudioAttributesCompatParcelizer);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.read.IconCompatParcelizer(iconCompatParcelizer.read, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    executeKeyRequest.write("CctTransportBackend", Integer.valueOf(responseCode));
                    executeKeyRequest.read("CctTransportBackend", httpURLConnection.getHeaderField(RtspHeaders.CONTENT_TYPE));
                    executeKeyRequest.read("CctTransportBackend", httpURLConnection.getHeaderField(RtspHeaders.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new read(responseCode, new URL(httpURLConnection.getHeaderField(RtspHeaders.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new read(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStream2 = read(inputStream, httpURLConnection.getHeaderField(RtspHeaders.CONTENT_ENCODING));
                        try {
                            read readVar = new read(responseCode, null, setOnKeyStatusChangeListener.AudioAttributesCompatParcelizer(new BufferedReader(new InputStreamReader(inputStream2))).read());
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return readVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException unused) {
            executeKeyRequest.IconCompatParcelizer("CctTransportBackend");
            return new read(500, null, 0L);
        } catch (IOException | dequeueInputBufferIndex unused2) {
            executeKeyRequest.IconCompatParcelizer("CctTransportBackend");
            return new read(ResponseError.NO_INTERNET_ERROR, null, 0L);
        }
    }

    private static InputStream read(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // kotlin.FrameworkMediaDrmApi31
    public final needsForceWidevineL3Workaround RemoteActionCompatParcelizer(newInstance newinstance) {
        setOnEventListener setoneventlistenerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(newinstance);
        URL urlIconCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (newinstance.read() != null) {
            try {
                DrmUtilApi23 drmUtilApi23AudioAttributesCompatParcelizer = DrmUtilApi23.AudioAttributesCompatParcelizer(newinstance.read());
                strRemoteActionCompatParcelizer = drmUtilApi23AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() != null ? drmUtilApi23AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() : null;
                if (drmUtilApi23AudioAttributesCompatParcelizer.IconCompatParcelizer() != null) {
                    urlIconCompatParcelizer = IconCompatParcelizer(drmUtilApi23AudioAttributesCompatParcelizer.IconCompatParcelizer());
                }
            } catch (IllegalArgumentException unused) {
                return needsForceWidevineL3Workaround.IconCompatParcelizer();
            }
        }
        try {
            read readVar = (read) LocalMediaDrmCallback.write(new IconCompatParcelizer(urlIconCompatParcelizer, setoneventlistenerAudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer), new acquireFirstSessionOnHandlerThread() { // from class: o.isMediaDrmResetException
                @Override // kotlin.acquireFirstSessionOnHandlerThread
                public final Object RemoteActionCompatParcelizer(Object obj) {
                    return this.write.AudioAttributesCompatParcelizer((mediaDrmStateExceptionToErrorCode.IconCompatParcelizer) obj);
                }
            }, new OfflineLicenseHelper() { // from class: o.DrmUtilErrorSource
                @Override // kotlin.OfflineLicenseHelper
                public final Object read(Object obj, Object obj2) {
                    return mediaDrmStateExceptionToErrorCode.AudioAttributesCompatParcelizer((mediaDrmStateExceptionToErrorCode.IconCompatParcelizer) obj, (mediaDrmStateExceptionToErrorCode.read) obj2);
                }
            });
            if (readVar.write == 200) {
                return needsForceWidevineL3Workaround.read(readVar.RemoteActionCompatParcelizer);
            }
            if (readVar.write < 500 && readVar.write != 404) {
                if (readVar.write == 400) {
                    return needsForceWidevineL3Workaround.read();
                }
                return needsForceWidevineL3Workaround.IconCompatParcelizer();
            }
            return needsForceWidevineL3Workaround.write();
        } catch (IOException unused2) {
            executeKeyRequest.IconCompatParcelizer("CctTransportBackend");
            return needsForceWidevineL3Workaround.write();
        }
    }

    static /* synthetic */ IconCompatParcelizer AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, read readVar) {
        if (readVar.read == null) {
            return null;
        }
        executeKeyRequest.read("CctTransportBackend", readVar.read);
        return iconCompatParcelizer.RemoteActionCompatParcelizer(readVar.read);
    }

    private static long IconCompatParcelizer() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    static final class read {
        final long RemoteActionCompatParcelizer;
        final URL read;
        final int write;

        read(int i, URL url, long j) {
            this.write = i;
            this.read = url;
            this.RemoteActionCompatParcelizer = j;
        }
    }

    static final class IconCompatParcelizer {
        final String AudioAttributesCompatParcelizer;
        final URL RemoteActionCompatParcelizer;
        final setOnEventListener read;

        IconCompatParcelizer(URL url, setOnEventListener setoneventlistener, String str) {
            this.RemoteActionCompatParcelizer = url;
            this.read = setoneventlistener;
            this.AudioAttributesCompatParcelizer = str;
        }

        final IconCompatParcelizer RemoteActionCompatParcelizer(URL url) {
            return new IconCompatParcelizer(url, this.read, this.AudioAttributesCompatParcelizer);
        }
    }
}
