package kotlin;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda10;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda13 {
    private static DefaultAnalyticsCollectorExternalSyntheticLambda1 AudioAttributesImplApi21Parcelizer;
    private static SensorManager AudioAttributesImplBaseParcelizer;
    private static String IconCompatParcelizer;
    private static final DefaultAnalyticsCollectorExternalSyntheticLambda10 MediaBrowserCompatItemReceiver = new DefaultAnalyticsCollectorExternalSyntheticLambda10();
    private static final AtomicBoolean AudioAttributesCompatParcelizer = new AtomicBoolean(true);
    private static final AtomicBoolean read = new AtomicBoolean(false);
    private static volatile Boolean write = Boolean.FALSE;
    private static IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda13.3
        @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda13.IconCompatParcelizer
        public final void IconCompatParcelizer(String str) {
            DefaultAnalyticsCollectorExternalSyntheticLambda13.read(str);
        }
    };

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(String str);
    }

    static /* synthetic */ IconCompatParcelizer AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return null;
        }
        try {
            return RemoteActionCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
            return null;
        }
    }

    static /* synthetic */ String IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return null;
        }
        try {
            IconCompatParcelizer = null;
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
            return null;
        }
    }

    static /* synthetic */ DefaultAnalyticsCollectorExternalSyntheticLambda1 RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return null;
        }
        try {
            return AudioAttributesImplApi21Parcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
            return null;
        }
    }

    static /* synthetic */ Boolean read(Boolean bool) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return null;
        }
        try {
            write = bool;
            return bool;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
            return null;
        }
    }

    static /* synthetic */ AtomicBoolean read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return null;
        }
        try {
            return read;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
            return null;
        }
    }

    public static void AudioAttributesCompatParcelizer(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return;
        }
        try {
            if (AudioAttributesCompatParcelizer.get()) {
                DefaultAnalyticsCollectorExternalSyntheticLambda12.read().write(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strWrite = lambdaonMediaMetadataChanged48.write();
                final DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(strWrite);
                if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer == null || !defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getRead()) {
                    MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    AudioAttributesImplBaseParcelizer = sensorManager;
                    if (sensorManager == null) {
                        return;
                    }
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    AudioAttributesImplApi21Parcelizer = new DefaultAnalyticsCollectorExternalSyntheticLambda1(activity);
                    DefaultAnalyticsCollectorExternalSyntheticLambda10 defaultAnalyticsCollectorExternalSyntheticLambda10 = MediaBrowserCompatItemReceiver;
                    defaultAnalyticsCollectorExternalSyntheticLambda10.RemoteActionCompatParcelizer(new DefaultAnalyticsCollectorExternalSyntheticLambda10.write() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda13.4
                        @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda10.write
                        public final void RemoteActionCompatParcelizer() {
                            DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6 = defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer;
                            boolean z = defaultAnalyticsCollectorExternalSyntheticLambda6 != null && defaultAnalyticsCollectorExternalSyntheticLambda6.getRead();
                            boolean zBooleanValue = ((Boolean) lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), 2134417389, lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), -2134417385)).booleanValue();
                            if (z && zBooleanValue) {
                                DefaultAnalyticsCollectorExternalSyntheticLambda13.AudioAttributesCompatParcelizer().IconCompatParcelizer(strWrite);
                            }
                        }
                    });
                    AudioAttributesImplBaseParcelizer.registerListener(defaultAnalyticsCollectorExternalSyntheticLambda10, defaultSensor, 2);
                    if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer != null && defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getRead()) {
                        AudioAttributesImplApi21Parcelizer.write();
                    }
                }
                MediaBrowserCompatCustomActionResultReceiver();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
        }
    }

    public static void RemoteActionCompatParcelizer(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return;
        }
        try {
            if (AudioAttributesCompatParcelizer.get()) {
                DefaultAnalyticsCollectorExternalSyntheticLambda12.read().read(activity);
                DefaultAnalyticsCollectorExternalSyntheticLambda1 defaultAnalyticsCollectorExternalSyntheticLambda1 = AudioAttributesImplApi21Parcelizer;
                if (defaultAnalyticsCollectorExternalSyntheticLambda1 != null) {
                    defaultAnalyticsCollectorExternalSyntheticLambda1.read();
                }
                SensorManager sensorManager = AudioAttributesImplBaseParcelizer;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(MediaBrowserCompatItemReceiver);
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
        }
    }

    public static void read(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda12.read().IconCompatParcelizer(activity);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
        }
    }

    public static void MediaBrowserCompatItemReceiver() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return;
        }
        try {
            AudioAttributesCompatParcelizer.set(true);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
        }
    }

    public static void write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return;
        }
        try {
            AudioAttributesCompatParcelizer.set(false);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
        }
    }

    static void read(final String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return;
        }
        try {
            if (write.booleanValue()) {
                return;
            }
            write = Boolean.TRUE;
            lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda13.2
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = SessionDescription.SUPPORTED_SDP_VERSION;
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        GraphRequest graphRequestIconCompatParcelizer = GraphRequest.IconCompatParcelizer(null, String.format(Locale.US, "%s/app_indexing_session", str), null, null);
                        Bundle mediaBrowserCompatMediaItem = graphRequestIconCompatParcelizer.getMediaBrowserCompatMediaItem();
                        if (mediaBrowserCompatMediaItem == null) {
                            mediaBrowserCompatMediaItem = new Bundle();
                        }
                        DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51Write = DefaultAnalyticsCollectorExternalSyntheticLambda51.write(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(Build.MODEL != null ? Build.MODEL : "");
                        if (defaultAnalyticsCollectorExternalSyntheticLambda51Write != null && defaultAnalyticsCollectorExternalSyntheticLambda51Write.RemoteActionCompatParcelizer() != null) {
                            jSONArray.put(defaultAnalyticsCollectorExternalSyntheticLambda51Write.RemoteActionCompatParcelizer());
                        } else {
                            jSONArray.put("");
                        }
                        jSONArray.put(SessionDescription.SUPPORTED_SDP_VERSION);
                        if (DefaultAnalyticsCollectorExternalSyntheticLambda29.AudioAttributesCompatParcelizer()) {
                            str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                        }
                        jSONArray.put(str2);
                        Locale localeRemoteActionCompatParcelizer = DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer();
                        StringBuilder sb = new StringBuilder();
                        sb.append(localeRemoteActionCompatParcelizer.getLanguage());
                        sb.append("_");
                        sb.append(localeRemoteActionCompatParcelizer.getCountry());
                        jSONArray.put(sb.toString());
                        String string = jSONArray.toString();
                        mediaBrowserCompatMediaItem.putString("device_session_id", DefaultAnalyticsCollectorExternalSyntheticLambda13.AudioAttributesImplApi21Parcelizer());
                        mediaBrowserCompatMediaItem.putString("extinfo", string);
                        graphRequestIconCompatParcelizer.read(mediaBrowserCompatMediaItem);
                        JSONObject read2 = graphRequestIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getRead();
                        AtomicBoolean atomicBoolean = DefaultAnalyticsCollectorExternalSyntheticLambda13.read();
                        boolean z = false;
                        if (read2 != null && read2.optBoolean("is_app_indexing_enabled", false)) {
                            z = true;
                        }
                        atomicBoolean.set(z);
                        if (!DefaultAnalyticsCollectorExternalSyntheticLambda13.read().get()) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda13.IconCompatParcelizer();
                        } else if (DefaultAnalyticsCollectorExternalSyntheticLambda13.RemoteActionCompatParcelizer() != null) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda13.RemoteActionCompatParcelizer().write();
                        }
                        DefaultAnalyticsCollectorExternalSyntheticLambda13.read(Boolean.FALSE);
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
        }
    }

    static String AudioAttributesImplApi21Parcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return null;
        }
        try {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = UUID.randomUUID().toString();
            }
            return IconCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
            return null;
        }
    }

    static boolean AudioAttributesImplBaseParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return false;
        }
        try {
            return read.get();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
            return false;
        }
    }

    static void IconCompatParcelizer(Boolean bool) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class)) {
            return;
        }
        try {
            read.set(bool.booleanValue());
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
        }
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver() {
        getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda13.class);
        return false;
    }
}
