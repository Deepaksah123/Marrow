package kotlin;

import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class generateUnshuffledIndices {
    private String AudioAttributesCompatParcelizer;
    private final Map<String, String> IconCompatParcelizer = Collections.synchronizedMap(new HashMap());
    private final CleverTapInstanceConfig read;
    private final AnalyticsListenerEventTime write;

    @Deprecated
    generateUnshuffledIndices(String str, CleverTapInstanceConfig cleverTapInstanceConfig, AnalyticsListenerEventTime analyticsListenerEventTime) {
        this.AudioAttributesCompatParcelizer = str;
        this.read = cleverTapInstanceConfig;
        this.write = analyticsListenerEventTime;
        AudioAttributesImplApi21Parcelizer();
    }

    private void IconCompatParcelizer(final AnalyticsListenerEventTime analyticsListenerEventTime) {
        if (analyticsListenerEventTime == null) {
            throw new IllegalArgumentException("FileUtils can't be null");
        }
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).IconCompatParcelizer().read("ProductConfigSettings#eraseStoredSettingsFile", new Callable<Void>() { // from class: o.generateUnshuffledIndices.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Void call() {
                synchronized (this) {
                    try {
                        String str = generateUnshuffledIndices.this.read();
                        analyticsListenerEventTime.IconCompatParcelizer(str);
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = generateUnshuffledIndices.this.read.MediaBrowserCompatItemReceiver();
                        String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(generateUnshuffledIndices.this.read);
                        StringBuilder sb = new StringBuilder("Deleted settings file");
                        sb.append(str);
                        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = generateUnshuffledIndices.this.read.MediaBrowserCompatItemReceiver();
                        String strRemoteActionCompatParcelizer2 = getPeriodPositionUs.RemoteActionCompatParcelizer(generateUnshuffledIndices.this.read);
                        StringBuilder sb2 = new StringBuilder("Error while resetting settings");
                        sb2.append(e.getLocalizedMessage());
                        rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strRemoteActionCompatParcelizer2, sb2.toString());
                    }
                }
                return null;
            }
        });
    }

    final String write() {
        StringBuilder sb = new StringBuilder("Product_Config_");
        sb.append(this.read.write());
        sb.append("_");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    final String read() {
        StringBuilder sb = new StringBuilder();
        sb.append(write());
        sb.append("/config_settings.json");
        return sb.toString();
    }

    @Deprecated
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    final void IconCompatParcelizer(String str) {
        this.AudioAttributesCompatParcelizer = str;
    }

    private JSONObject RemoteActionCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
            String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
            StringBuilder sb = new StringBuilder("LoadSettings failed: ");
            sb.append(e.getLocalizedMessage());
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
            return null;
        }
    }

    private long MediaBrowserCompatCustomActionResultReceiver() {
        long j;
        synchronized (this) {
            String str = this.IconCompatParcelizer.get("ts");
            j = 0;
            try {
                if (!TextUtils.isEmpty(str)) {
                    j = (long) Double.parseDouble(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
                StringBuilder sb = new StringBuilder("GetLastFetchTimeStampInMillis failed: ");
                sb.append(e.getLocalizedMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
            }
        }
        return j;
    }

    final void write(long j) {
        synchronized (this) {
            long jMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            if (j >= 0 && jMediaBrowserCompatCustomActionResultReceiver != j) {
                this.IconCompatParcelizer.put("ts", String.valueOf(j));
                AudioAttributesImplBaseParcelizer();
            }
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.IconCompatParcelizer.put("rc_n", "5");
        this.IconCompatParcelizer.put("rc_w", "60");
        this.IconCompatParcelizer.put("ts", SessionDescription.SUPPORTED_SDP_VERSION);
        this.IconCompatParcelizer.put("fetch_min_interval_seconds", String.valueOf(isLastPeriod.IconCompatParcelizer));
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
        String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
        StringBuilder sb = new StringBuilder("Settings loaded with default values: ");
        sb.append(this.IconCompatParcelizer);
        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
    }

    final void read(AnalyticsListenerEventTime analyticsListenerEventTime) {
        synchronized (this) {
            if (analyticsListenerEventTime == null) {
                throw new IllegalArgumentException("fileutils can't be null");
            }
            try {
                read(RemoteActionCompatParcelizer(analyticsListenerEventTime.RemoteActionCompatParcelizer(read())));
            } catch (Exception e) {
                e.printStackTrace();
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
                StringBuilder sb = new StringBuilder("LoadSettings failed while reading file: ");
                sb.append(e.getLocalizedMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
            }
        }
    }

    private void read(JSONObject jSONObject) {
        synchronized (this) {
            if (jSONObject == null) {
                return;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        String strValueOf = String.valueOf(jSONObject.get(next));
                        if (!TextUtils.isEmpty(strValueOf)) {
                            this.IconCompatParcelizer.put(next, strValueOf);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                        String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed loading setting for key ");
                        sb.append(next);
                        sb.append(" Error: ");
                        sb.append(e.getLocalizedMessage());
                        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                    }
                }
            }
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.read.MediaBrowserCompatItemReceiver();
            String strRemoteActionCompatParcelizer2 = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LoadSettings completed with settings: ");
            sb2.append(this.IconCompatParcelizer);
            rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strRemoteActionCompatParcelizer2, sb2.toString());
        }
    }

    final void AudioAttributesCompatParcelizer(AnalyticsListenerEventTime analyticsListenerEventTime) {
        AudioAttributesImplApi21Parcelizer();
        IconCompatParcelizer(analyticsListenerEventTime);
    }

    final void IconCompatParcelizer(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (!TextUtils.isEmpty(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof Number) {
                            int iDoubleValue = (int) ((Number) obj).doubleValue();
                            if ("rc_n".equalsIgnoreCase(next) || "rc_w".equalsIgnoreCase(next)) {
                                AudioAttributesCompatParcelizer(next, iDoubleValue);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                    String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
                    StringBuilder sb = new StringBuilder("Product Config setARPValue failed ");
                    sb.append(e.getLocalizedMessage());
                    rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                }
            }
        }
    }

    private int RemoteActionCompatParcelizer() {
        int i;
        synchronized (this) {
            String str = this.IconCompatParcelizer.get("rc_n");
            i = 5;
            try {
                if (!TextUtils.isEmpty(str)) {
                    i = (int) Double.parseDouble(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
                StringBuilder sb = new StringBuilder("GetNoOfCallsInAllowedWindow failed: ");
                sb.append(e.getLocalizedMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
            }
        }
        return i;
    }

    private void write(int i) {
        synchronized (this) {
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (i > 0 && jRemoteActionCompatParcelizer != i) {
                this.IconCompatParcelizer.put("rc_n", String.valueOf(i));
                AudioAttributesImplBaseParcelizer();
            }
        }
    }

    private int IconCompatParcelizer() {
        int i;
        synchronized (this) {
            String str = this.IconCompatParcelizer.get("rc_w");
            i = 60;
            try {
                if (!TextUtils.isEmpty(str)) {
                    i = (int) Double.parseDouble(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.read);
                StringBuilder sb = new StringBuilder("GetWindowIntervalInMinutes failed: ");
                sb.append(e.getLocalizedMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
            }
        }
        return i;
    }

    private void RemoteActionCompatParcelizer(int i) {
        synchronized (this) {
            int iIconCompatParcelizer = IconCompatParcelizer();
            if (i > 0 && iIconCompatParcelizer != i) {
                this.IconCompatParcelizer.put("rc_w", String.valueOf(i));
                AudioAttributesImplBaseParcelizer();
            }
        }
    }

    private void AudioAttributesCompatParcelizer(String str, int i) {
        str.hashCode();
        if (str.equals("rc_n")) {
            write(i);
        } else if (str.equals("rc_w")) {
            RemoteActionCompatParcelizer(i);
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        synchronized (this) {
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).IconCompatParcelizer().RemoteActionCompatParcelizer(new TracksGroupExternalSyntheticLambda0<Boolean>() { // from class: o.generateUnshuffledIndices.3
                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.TracksGroupExternalSyntheticLambda0
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public void read(Boolean bool) {
                    if (bool.booleanValue()) {
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = generateUnshuffledIndices.this.read.MediaBrowserCompatItemReceiver();
                        String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(generateUnshuffledIndices.this.read);
                        StringBuilder sb = new StringBuilder("Product Config settings: writing Success ");
                        sb.append(generateUnshuffledIndices.this.IconCompatParcelizer);
                        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                        return;
                    }
                    generateUnshuffledIndices.this.read.MediaBrowserCompatItemReceiver().write(getPeriodPositionUs.RemoteActionCompatParcelizer(generateUnshuffledIndices.this.read), "Product Config settings: writing Failed");
                }
            }).read("ProductConfigSettings#updateConfigToFile", new Callable<Boolean>() { // from class: o.generateUnshuffledIndices.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public Boolean call() {
                    try {
                        HashMap map = new HashMap(generateUnshuffledIndices.this.IconCompatParcelizer);
                        map.remove("fetch_min_interval_seconds");
                        generateUnshuffledIndices.this.write.read(generateUnshuffledIndices.this.write(), "config_settings.json", new JSONObject(map));
                        return Boolean.TRUE;
                    } catch (Exception e) {
                        e.printStackTrace();
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = generateUnshuffledIndices.this.read.MediaBrowserCompatItemReceiver();
                        String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(generateUnshuffledIndices.this.read);
                        StringBuilder sb = new StringBuilder("UpdateConfigToFile failed: ");
                        sb.append(e.getLocalizedMessage());
                        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                        return Boolean.FALSE;
                    }
                }
            });
        }
    }
}
