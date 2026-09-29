package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.common.Scopes;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.getPeriodIndexFromWindowPosition;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambda3EoLwxJB4A25pAog2xOLUUC2nk {
    private static long AudioAttributesCompatParcelizer;
    private final getPeriodIndexFromWindowPosition AudioAttributesImplApi21Parcelizer;
    private final lambdaprepare7 IconCompatParcelizer;
    private final getChildTimelines MediaBrowserCompatCustomActionResultReceiver;
    private final Context RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig write;
    private final HashMap<String, Object> read = new HashMap<>();
    private final String AudioAttributesImplBaseParcelizer = "local_events";
    private final Set<String> MediaDescriptionCompat = Collections.synchronizedSet(new HashSet());
    private final Map<String, String> AudioAttributesImplApi26Parcelizer = new HashMap();
    private final ExecutorService MediaBrowserCompatItemReceiver = Executors.newFixedThreadPool(1);

    r8lambda3EoLwxJB4A25pAog2xOLUUC2nk(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition, getChildTimelines getchildtimelines, lambdaprepare7 lambdaprepare7Var) {
        this.RemoteActionCompatParcelizer = context;
        this.write = cleverTapInstanceConfig;
        this.AudioAttributesImplApi21Parcelizer = getperiodindexfromwindowposition;
        this.MediaBrowserCompatCustomActionResultReceiver = getchildtimelines;
        this.IconCompatParcelizer = lambdaprepare7Var;
    }

    public final void write() {
        this.MediaDescriptionCompat.clear();
        AudioAttributesImplApi21Parcelizer();
    }

    @Deprecated(since = "7.1.0")
    final lambdasetShuffleModeEnabled9 IconCompatParcelizer(String str) {
        String string;
        try {
            if (!read()) {
                return null;
            }
            if (!this.write.MediaBrowserCompatSearchResultReceiver()) {
                StringBuilder sb = new StringBuilder("local_events:");
                sb.append(this.write.write());
                string = sb.toString();
            } else {
                string = "local_events";
            }
            return write(str, read(str, string));
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = this.IconCompatParcelizer();
            this.AudioAttributesCompatParcelizer();
            rendererWakeupListenerIconCompatParcelizer.IconCompatParcelizer();
            return null;
        }
    }

    private boolean read(Set<String> set) {
        HashSet hashSet = new HashSet();
        IntermediateLoginResponseBody.read(set, hashSet, new getAnswerMap() { // from class: o.RendererCapabilities
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return this.write.read((String) obj);
            }
        });
        return write(hashSet);
    }

    final /* synthetic */ Pair read(String str) {
        return new Pair(str, AudioAttributesImplApi26Parcelizer(str));
    }

    public final boolean AudioAttributesImplBaseParcelizer(String str) {
        if (str == null) {
            return false;
        }
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
        String strWrite = this.write.write();
        try {
            StringBuilder sb = new StringBuilder("UserEventLog: Persisting EventLog for event ");
            sb.append(str);
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
            if (MediaBrowserCompatMediaItem(str)) {
                StringBuilder sb2 = new StringBuilder("UserEventLog: Updating EventLog for event ");
                sb2.append(str);
                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb2.toString());
                return RatingCompat(str);
            }
            StringBuilder sb3 = new StringBuilder("UserEventLog: Inserting EventLog for event ");
            sb3.append(str);
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb3.toString());
            return MediaMetadataCompat(str);
        } catch (Throwable unused) {
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
            return false;
        }
    }

    private boolean MediaBrowserCompatItemReceiver(String str, String str2) {
        boolean zAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).read().AudioAttributesCompatParcelizer(str, str2);
        IconCompatParcelizer().read();
        return zAudioAttributesCompatParcelizer;
    }

    private boolean RatingCompat(String str) {
        return MediaBrowserCompatItemReceiver(this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), AudioAttributesImplApi26Parcelizer(str));
    }

    private boolean write(Set<Pair<String, String>> set) {
        boolean zWrite = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).read().write(this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), set);
        IconCompatParcelizer().read();
        return zWrite;
    }

    private long AudioAttributesCompatParcelizer(String str, String str2, String str3) {
        long jIconCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).read().IconCompatParcelizer(str, str2, str3);
        IconCompatParcelizer().read();
        return jIconCompatParcelizer;
    }

    private String AudioAttributesImplApi26Parcelizer(final String str) {
        return (String) VideoTimelineResponseBody.write(this.AudioAttributesImplApi26Parcelizer, str, new getCreatedOnDateMs() { // from class: o.getDecoderSupport
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return RendererCapabilitiesListener.AudioAttributesCompatParcelizer(str);
            }
        });
    }

    private boolean MediaMetadataCompat(String str) {
        return AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), str, AudioAttributesImplApi26Parcelizer(str)) >= 0;
    }

    private boolean IconCompatParcelizer(String str, String str2) {
        boolean z = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).read().read(str, str2);
        IconCompatParcelizer().read();
        return z;
    }

    private boolean MediaBrowserCompatMediaItem(String str) {
        return IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), AudioAttributesImplApi26Parcelizer(str));
    }

    public final boolean AudioAttributesCompatParcelizer(String str) {
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(str);
        if (this.MediaDescriptionCompat.contains(strAudioAttributesImplApi26Parcelizer)) {
            return false;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), strAudioAttributesImplApi26Parcelizer);
        if (iAudioAttributesCompatParcelizer > 1) {
            this.MediaDescriptionCompat.add(strAudioAttributesImplApi26Parcelizer);
        }
        return iAudioAttributesCompatParcelizer == 1;
    }

    private notifySeekStarted RemoteActionCompatParcelizer(String str, String str2) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).read().IconCompatParcelizer(str, str2);
    }

    public final notifySeekStarted MediaBrowserCompatItemReceiver(String str) {
        return RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), AudioAttributesImplApi26Parcelizer(str));
    }

    private int AudioAttributesCompatParcelizer(String str, String str2) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).read().RemoteActionCompatParcelizer(str, str2);
    }

    public final void IconCompatParcelizer(JSONObject jSONObject) {
        try {
            if (!this.write.handleMediaPlayPauseIfPendingOnHandler()) {
                jSONObject.put("dsync", false);
                return;
            }
            String string = jSONObject.getString("type");
            if ("event".equals(string) && "App Launched".equals(jSONObject.getString("evtName"))) {
                IconCompatParcelizer().write(AudioAttributesCompatParcelizer(), "Local cache needs to be updated (triggered by App Launched)");
                jSONObject.put("dsync", true);
                return;
            }
            if (Scopes.PROFILE.equals(string)) {
                jSONObject.put("dsync", true);
                IconCompatParcelizer().write(AudioAttributesCompatParcelizer(), "Local cache needs to be updated (profile event)");
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (AudioAttributesCompatParcelizer("local_cache_last_update", iCurrentTimeMillis) + RemoteActionCompatParcelizer() < iCurrentTimeMillis) {
                jSONObject.put("dsync", true);
                IconCompatParcelizer().write(AudioAttributesCompatParcelizer(), "Local cache needs to be updated");
            } else {
                jSONObject.put("dsync", false);
                IconCompatParcelizer().write(AudioAttributesCompatParcelizer(), "Local cache doesn't need to be updated");
            }
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = IconCompatParcelizer();
            AudioAttributesCompatParcelizer();
            rendererWakeupListenerIconCompatParcelizer.IconCompatParcelizer();
        }
    }

    public final Object RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.read) {
            try {
                Object obj = this.read.get(str);
                if ((obj instanceof String) && getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer((String) obj)) {
                    IconCompatParcelizer().write(AudioAttributesCompatParcelizer(), "Failed to retrieve local profile property because it wasn't decrypted");
                    return null;
                }
                return this.read.get(str);
            } catch (Throwable unused) {
                RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = IconCompatParcelizer();
                AudioAttributesCompatParcelizer();
                rendererWakeupListenerIconCompatParcelizer.IconCompatParcelizer();
                return null;
            }
        }
    }

    @Deprecated(since = "7.1.0")
    private static lambdasetShuffleModeEnabled9 write(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\|");
        return new lambdasetShuffleModeEnabled9(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String AudioAttributesCompatParcelizer() {
        return this.write.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RendererWakeupListener IconCompatParcelizer() {
        return this.write.MediaBrowserCompatItemReceiver();
    }

    private int AudioAttributesCompatParcelizer(String str, int i) {
        if (this.write.MediaBrowserCompatSearchResultReceiver()) {
            int iRemoteActionCompatParcelizer = RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(str), -1000);
            return iRemoteActionCompatParcelizer != -1000 ? iRemoteActionCompatParcelizer : RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, str, i);
        }
        return RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(str), i);
    }

    private int RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer("local_cache_expires_in", 1200);
    }

    @Deprecated(since = "7.1.0")
    private String read(String str, String str2) {
        if (this.write.MediaBrowserCompatSearchResultReceiver()) {
            String str3 = RendererCapabilitiesFormatSupport.read(this.RemoteActionCompatParcelizer, str2, AudioAttributesImplApi21Parcelizer(str), (String) null);
            return str3 != null ? str3 : RendererCapabilitiesFormatSupport.read(this.RemoteActionCompatParcelizer, str2, str, (String) null);
        }
        return RendererCapabilitiesFormatSupport.read(this.RemoteActionCompatParcelizer, str2, AudioAttributesImplApi21Parcelizer(str), (String) null);
    }

    final void AudioAttributesCompatParcelizer(final Context context) {
        final String strWrite = this.write.write();
        IconCompatParcelizer("LocalDataStore#inflateLocalProfileAsync", new Runnable() { // from class: o.r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.5
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                lambdasetDeviceMuted29 lambdasetdevicemuted29AudioAttributesCompatParcelizer = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(context);
                synchronized (r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.read) {
                    try {
                        JSONObject jSONObjectWrite = lambdasetdevicemuted29AudioAttributesCompatParcelizer.write(strWrite, r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver());
                        if (jSONObjectWrite == null) {
                            return;
                        }
                        Iterator<String> itKeys = jSONObjectWrite.keys();
                        while (itKeys.hasNext()) {
                            try {
                                String next = itKeys.next();
                                Object obj = jSONObjectWrite.get(next);
                                if (obj instanceof JSONObject) {
                                    r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.read.put(next, jSONObjectWrite.getJSONObject(next));
                                } else if (obj instanceof JSONArray) {
                                    r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.read.put(next, jSONObjectWrite.getJSONArray(next));
                                } else {
                                    if ((obj instanceof String) && (str = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.AudioAttributesImplApi21Parcelizer.read((String) obj, next, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read)) != null) {
                                        obj = str;
                                    }
                                    r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.read.put(next, obj);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.IconCompatParcelizer();
                        String strAudioAttributesCompatParcelizer = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.AudioAttributesCompatParcelizer();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Local Data Store - Inflated local profile ");
                        sb.append(r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.read);
                        rendererWakeupListenerIconCompatParcelizer.write(strAudioAttributesCompatParcelizer, sb.toString());
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    private boolean read() {
        return this.write.handleMediaPlayPauseIfPendingOnHandler();
    }

    private void AudioAttributesImplBaseParcelizer() {
        final String strWrite = this.write.write();
        IconCompatParcelizer("LocalDataStore#persistLocalProfileAsync", new Runnable() { // from class: o.r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.read) {
                    HashMap map = new HashMap(r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.read);
                    boolean z = true;
                    for (String str : getTimelines.AudioAttributesImplBaseParcelizer) {
                        if (map.get(str) != null) {
                            Object obj = map.get(str);
                            if (obj instanceof String) {
                                String strIconCompatParcelizer = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer((String) obj, str, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read);
                                if (strIconCompatParcelizer == null) {
                                    z = false;
                                } else {
                                    map.put(str, strIconCompatParcelizer);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject(map);
                    if (!z) {
                        r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
                    }
                    long j = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.RemoteActionCompatParcelizer).read(strWrite, r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), jSONObject);
                    RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.IconCompatParcelizer();
                    String strAudioAttributesCompatParcelizer = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.AudioAttributesCompatParcelizer();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Persist Local Profile complete with status ");
                    sb.append(j);
                    sb.append(" for id ");
                    sb.append(strWrite);
                    rendererWakeupListenerIconCompatParcelizer.write(strAudioAttributesCompatParcelizer, sb.toString());
                }
            }
        });
    }

    private void IconCompatParcelizer(final String str, final Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == AudioAttributesCompatParcelizer) {
                runnable.run();
            } else {
                this.MediaBrowserCompatItemReceiver.submit(new Runnable() { // from class: o.r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        long unused = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.AudioAttributesCompatParcelizer = Thread.currentThread().getId();
                        try {
                            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.IconCompatParcelizer();
                            String strAudioAttributesCompatParcelizer = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.AudioAttributesCompatParcelizer();
                            StringBuilder sb = new StringBuilder("Local Data Store Executor service: Starting task - ");
                            sb.append(str);
                            rendererWakeupListenerIconCompatParcelizer.write(strAudioAttributesCompatParcelizer, sb.toString());
                            runnable.run();
                        } catch (Throwable unused2) {
                            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer2 = r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.IconCompatParcelizer();
                            r8lambda3EoLwxJB4A25pAog2xOLUUC2nk.this.AudioAttributesCompatParcelizer();
                            rendererWakeupListenerIconCompatParcelizer2.IconCompatParcelizer();
                        }
                    }
                });
            }
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = IconCompatParcelizer();
            AudioAttributesCompatParcelizer();
            rendererWakeupListenerIconCompatParcelizer.IconCompatParcelizer();
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        synchronized (this.read) {
            this.read.clear();
        }
        AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    private void MediaBrowserCompatCustomActionResultReceiver(String str) {
        synchronized (this.read) {
            try {
                this.read.remove(str);
            } catch (Throwable unused) {
                RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = IconCompatParcelizer();
                AudioAttributesCompatParcelizer();
                rendererWakeupListenerIconCompatParcelizer.IconCompatParcelizer();
            }
        }
    }

    private void IconCompatParcelizer(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            synchronized (this.read) {
                this.read.put(str, obj);
            }
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = IconCompatParcelizer();
            AudioAttributesCompatParcelizer();
            rendererWakeupListenerIconCompatParcelizer.IconCompatParcelizer();
        }
    }

    public final void read(Map<String, Object> map) {
        if (map.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        read(map.keySet());
        long jNanoTime2 = System.nanoTime();
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
        String strWrite = this.write.write();
        StringBuilder sb = new StringBuilder("UserEventLog: persistUserEventLog execution time = ");
        sb.append(jNanoTime2 - jNanoTime);
        sb.append(" nano seconds");
        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                MediaBrowserCompatCustomActionResultReceiver(key);
            }
            IconCompatParcelizer(key, value);
        }
        AudioAttributesImplBaseParcelizer();
    }

    private String AudioAttributesImplApi21Parcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(this.write.write());
        return sb.toString();
    }
}
