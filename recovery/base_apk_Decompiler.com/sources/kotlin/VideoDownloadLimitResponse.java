package kotlin;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.getProLimit;
import kotlin.getRootSubjectIds;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDownloadLimitResponse {
    private static final Map<String, Map<Context, VideoDownloadLimitResponse>> AudioAttributesCompatParcelizer = new HashMap();
    private static final getProLimit RemoteActionCompatParcelizer = new getProLimit();
    private static Future<SharedPreferences> write;
    private final getRootSubjectIds AudioAttributesImplApi21Parcelizer;
    private getDate AudioAttributesImplApi26Parcelizer;
    private final Map<String, String> AudioAttributesImplBaseParcelizer;
    private final Context IconCompatParcelizer;
    private final Map<String, Object> MediaBrowserCompatCustomActionResultReceiver;
    private final Map<String, Long> MediaBrowserCompatItemReceiver;
    private final getWoqData MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final WoqMarrowthon MediaDescriptionCompat;
    private final Boolean MediaMetadataCompat;
    private final AudioAttributesCompatParcelizer RatingCompat;
    private final PlanResponsePromo read;

    /* JADX INFO: loaded from: classes4.dex */
    interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(VideoDownloadLimitResponse videoDownloadLimitResponse);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface write {
        void AudioAttributesCompatParcelizer(String str, double d);

        boolean IconCompatParcelizer();

        void RemoteActionCompatParcelizer(String str, Object obj);

        void read();

        void write();
    }

    private VideoDownloadLimitResponse(Context context, Future<SharedPreferences> future, String str, boolean z, JSONObject jSONObject, String str2, boolean z2) {
        this(context, future, str, PlanResponsePromo.AudioAttributesCompatParcelizer(context), false, null, str2, z2);
    }

    private VideoDownloadLimitResponse(Context context, Future<SharedPreferences> future, String str, PlanResponsePromo planResponsePromo, boolean z, JSONObject jSONObject, String str2, boolean z2) {
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompatSearchResultReceiver = str;
        this.RatingCompat = new AudioAttributesCompatParcelizer(this, (byte) 0);
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap();
        this.read = planResponsePromo;
        this.MediaMetadataCompat = Boolean.valueOf(z2);
        HashMap map = new HashMap();
        map.put("$android_lib_version", "7.4.1");
        map.put("$android_os", "Android");
        map.put("$android_os_version", Build.VERSION.RELEASE == null ? "UNKNOWN" : Build.VERSION.RELEASE);
        map.put("$android_manufacturer", Build.MANUFACTURER == null ? "UNKNOWN" : Build.MANUFACTURER);
        map.put("$android_brand", Build.BRAND == null ? "UNKNOWN" : Build.BRAND);
        map.put("$android_model", Build.MODEL != null ? Build.MODEL : "UNKNOWN");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            map.put("$android_app_version", packageInfo.versionName);
            map.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableMap(map);
        this.MediaDescriptionCompat = new WoqMarrowthon();
        this.AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        getWoqData getwoqdataAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, future, str, str2);
        this.MediaBrowserCompatMediaItem = getwoqdataAudioAttributesCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = getwoqdataAudioAttributesCompatParcelizer.MediaDescriptionCompat();
        if (z && (AudioAttributesCompatParcelizer() || !getwoqdataAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str))) {
            MediaBrowserCompatMediaItem();
        }
        if (jSONObject != null) {
            RemoteActionCompatParcelizer(jSONObject);
        }
        boolean zExists = getFreeLimit.IconCompatParcelizer(this.IconCompatParcelizer, this.read).MediaBrowserCompatCustomActionResultReceiver().exists();
        MediaBrowserCompatSearchResultReceiver();
        if (getwoqdataAudioAttributesCompatParcelizer.IconCompatParcelizer(zExists, this.MediaBrowserCompatSearchResultReceiver) && this.MediaMetadataCompat.booleanValue()) {
            read("$ae_first_open", null, true);
            getwoqdataAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatSearchResultReceiver);
        }
        if (RatingCompat() && this.MediaMetadataCompat.booleanValue()) {
            read("$app_open", (JSONObject) null);
        }
        if (!getwoqdataAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver) && !z && !AudioAttributesCompatParcelizer()) {
            try {
                write("Integration", "85053bf24bba75239b16a601d9387e17", str);
                getwoqdataAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatSearchResultReceiver);
            } catch (JSONException unused2) {
            }
        }
        if (this.MediaBrowserCompatMediaItem.write((String) map.get("$android_app_version_code")) && this.MediaMetadataCompat.booleanValue()) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("$ae_updated_version", map.get("$android_app_version"));
                read("$ae_updated", jSONObject2, true);
            } catch (JSONException unused3) {
            }
        }
        if (!this.read.read()) {
            SlidesResponse.RemoteActionCompatParcelizer();
        }
        if (this.read.MediaBrowserCompatSearchResultReceiver()) {
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(new File(this.IconCompatParcelizer.getApplicationInfo().dataDir));
        }
    }

    private void write(String str, String str2, String str3) throws JSONException {
        String str4;
        JSONObject jSONObjectMediaDescriptionCompat = MediaDescriptionCompat();
        String str5 = null;
        try {
            String str6 = (String) jSONObjectMediaDescriptionCompat.get("mp_lib");
            try {
                str4 = (String) jSONObjectMediaDescriptionCompat.get("$lib_version");
            } catch (JSONException unused) {
                str4 = null;
            }
            str5 = str6;
        } catch (JSONException unused2) {
            str4 = null;
        }
        JSONObject jSONObject = new JSONObject();
        if (str5 == null) {
            str5 = "Android";
        }
        jSONObject.put("mp_lib", str5);
        jSONObject.put("distinct_id", str3);
        if (str4 == null) {
            str4 = "7.4.1";
        }
        jSONObject.put("$lib_version", str4);
        jSONObject.put("Project Token", str3);
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(new getRootSubjectIds.write(str, jSONObject, str2));
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(new getRootSubjectIds.AudioAttributesCompatParcelizer(str2));
    }

    public static VideoDownloadLimitResponse AudioAttributesCompatParcelizer(Context context, String str, String str2) {
        return AudioAttributesCompatParcelizer(context, str, str2, false);
    }

    private static VideoDownloadLimitResponse AudioAttributesCompatParcelizer(Context context, String str, String str2, boolean z) {
        VideoDownloadLimitResponse videoDownloadLimitResponse;
        if (str == null || context == null) {
            return null;
        }
        Map<String, Map<Context, VideoDownloadLimitResponse>> map = AudioAttributesCompatParcelizer;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (write == null) {
                write = RemoteActionCompatParcelizer.read(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
            }
            String str3 = str2 != null ? str2 : str;
            Map<Context, VideoDownloadLimitResponse> map2 = map.get(str3);
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(str3, map2);
            }
            Map<Context, VideoDownloadLimitResponse> map3 = map2;
            videoDownloadLimitResponse = map3.get(applicationContext);
            if (videoDownloadLimitResponse == null && PlanResponse.write(applicationContext)) {
                VideoDownloadLimitResponse videoDownloadLimitResponse2 = new VideoDownloadLimitResponse(applicationContext, write, str, false, null, str2, false);
                IconCompatParcelizer(context, videoDownloadLimitResponse2);
                map3.put(applicationContext, videoDownloadLimitResponse2);
                videoDownloadLimitResponse = videoDownloadLimitResponse2;
            }
            RemoteActionCompatParcelizer(context);
        }
        return videoDownloadLimitResponse;
    }

    public final Boolean RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        AudioAttributesCompatParcelizer(str, true);
    }

    private void AudioAttributesCompatParcelizer(String str, boolean z) {
        if (AudioAttributesCompatParcelizer() || str == null) {
            return;
        }
        synchronized (this.MediaBrowserCompatMediaItem) {
            String strMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver();
            if (!str.equals(strMediaBrowserCompatCustomActionResultReceiver)) {
                if (str.startsWith("$device:")) {
                    return;
                }
                this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver(str);
                this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer(strMediaBrowserCompatCustomActionResultReceiver);
                this.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("$anon_distinct_id", strMediaBrowserCompatCustomActionResultReceiver);
                    read("$identify", jSONObject);
                } catch (JSONException unused) {
                }
            }
            if (z) {
                this.RatingCompat.write(str);
            }
        }
    }

    public final void read(String str, JSONObject jSONObject) {
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        read(str, jSONObject, false);
    }

    private void AudioAttributesImplBaseParcelizer() {
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(new getRootSubjectIds.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver));
    }

    private JSONObject MediaDescriptionCompat() {
        JSONObject jSONObject = new JSONObject();
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(jSONObject);
        return jSONObject;
    }

    private String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver();
    }

    private String MediaMetadataCompat() {
        return this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer();
    }

    private void RemoteActionCompatParcelizer(JSONObject jSONObject) {
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        this.MediaBrowserCompatMediaItem.write(jSONObject);
    }

    public final write write() {
        return this.RatingCompat;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        AudioAttributesImplApi21Parcelizer().write(new getRootSubjectIds.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver));
        AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer(), false);
        AudioAttributesImplBaseParcelizer();
    }

    private void MediaBrowserCompatMediaItem() {
        AudioAttributesImplApi21Parcelizer().read(new getRootSubjectIds.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver));
        if (write().IconCompatParcelizer()) {
            write().write();
            write().read();
        }
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatItemReceiver.clear();
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        }
        this.MediaBrowserCompatMediaItem.read();
        this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        if (this.IconCompatParcelizer.getApplicationContext() instanceof Application) {
            Application application = (Application) this.IconCompatParcelizer.getApplicationContext();
            getDate getdate = new getDate(this, this.read);
            this.AudioAttributesImplApi26Parcelizer = getdate;
            application.registerActivityLifecycleCallbacks(getdate);
        }
    }

    final void read() {
        if (this.read.AudioAttributesImplApi21Parcelizer()) {
            AudioAttributesImplBaseParcelizer();
        }
    }

    final void MediaBrowserCompatItemReceiver() {
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
    }

    static void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Map<String, Map<Context, VideoDownloadLimitResponse>> map = AudioAttributesCompatParcelizer;
        synchronized (map) {
            Iterator<Map<Context, VideoDownloadLimitResponse>> it = map.values().iterator();
            while (it.hasNext()) {
                Iterator<VideoDownloadLimitResponse> it2 = it.next().values().iterator();
                while (it2.hasNext()) {
                    remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(it2.next());
                }
            }
        }
    }

    private getRootSubjectIds AudioAttributesImplApi21Parcelizer() {
        return getRootSubjectIds.IconCompatParcelizer(this.IconCompatParcelizer, this.read);
    }

    private getWoqData AudioAttributesCompatParcelizer(Context context, Future<SharedPreferences> future, String str, String str2) {
        getProLimit.read readVar = new getProLimit.read() { // from class: o.VideoDownloadLimitResponse.2
            @Override // o.getProLimit.read
            public final void read(SharedPreferences sharedPreferences) {
                String str3 = getWoqData.read(sharedPreferences);
                if (str3 != null) {
                    VideoDownloadLimitResponse.this.read(str3);
                }
            }
        };
        if (str2 != null) {
            str = str2;
        }
        String strConcat = "com.mixpanel.android.mpmetrics.MixpanelAPI_".concat(String.valueOf(str));
        getProLimit getprolimit = RemoteActionCompatParcelizer;
        return new getWoqData(future, getprolimit.read(context, strConcat, readVar), getprolimit.read(context, "com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_".concat(String.valueOf(str)), null), getprolimit.read(context, "com.mixpanel.android.mpmetrics.Mixpanel", null));
    }

    private boolean RatingCompat() {
        return !this.read.IconCompatParcelizer();
    }

    /* JADX INFO: loaded from: classes4.dex */
    class AudioAttributesCompatParcelizer implements write {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(VideoDownloadLimitResponse videoDownloadLimitResponse, byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(String str) {
            synchronized (VideoDownloadLimitResponse.this.MediaBrowserCompatMediaItem) {
                VideoDownloadLimitResponse.this.MediaBrowserCompatMediaItem.RatingCompat(str);
            }
            VideoDownloadLimitResponse.this.read(str);
        }

        private void AudioAttributesCompatParcelizer(JSONObject jSONObject) {
            if (VideoDownloadLimitResponse.this.AudioAttributesCompatParcelizer()) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(VideoDownloadLimitResponse.this.AudioAttributesImplBaseParcelizer);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                VideoDownloadLimitResponse.this.read(IconCompatParcelizer("$set", jSONObject2));
            } catch (JSONException unused) {
            }
        }

        @Override // o.VideoDownloadLimitResponse.write
        public final void RemoteActionCompatParcelizer(String str, Object obj) {
            if (VideoDownloadLimitResponse.this.AudioAttributesCompatParcelizer()) {
                return;
            }
            try {
                AudioAttributesCompatParcelizer(new JSONObject().put(str, obj));
            } catch (JSONException unused) {
            }
        }

        private void AudioAttributesCompatParcelizer(Map<String, ? extends Number> map) {
            if (VideoDownloadLimitResponse.this.AudioAttributesCompatParcelizer()) {
                return;
            }
            try {
                VideoDownloadLimitResponse.this.read(IconCompatParcelizer("$add", new JSONObject(map)));
            } catch (JSONException unused) {
            }
        }

        @Override // o.VideoDownloadLimitResponse.write
        public final void AudioAttributesCompatParcelizer(String str, double d) {
            if (VideoDownloadLimitResponse.this.AudioAttributesCompatParcelizer()) {
                return;
            }
            HashMap map = new HashMap();
            map.put(str, Double.valueOf(d));
            AudioAttributesCompatParcelizer(map);
        }

        private void AudioAttributesCompatParcelizer(String str) {
            if (VideoDownloadLimitResponse.this.AudioAttributesCompatParcelizer()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                VideoDownloadLimitResponse.this.read(IconCompatParcelizer("$unset", jSONArray));
            } catch (JSONException unused) {
            }
        }

        @Override // o.VideoDownloadLimitResponse.write
        public final void read() {
            AudioAttributesCompatParcelizer("$transactions");
        }

        @Override // o.VideoDownloadLimitResponse.write
        public final void write() {
            try {
                VideoDownloadLimitResponse.this.read(IconCompatParcelizer("$delete", JSONObject.NULL));
            } catch (JSONException unused) {
            }
        }

        private String RemoteActionCompatParcelizer() {
            return VideoDownloadLimitResponse.this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer();
        }

        private JSONObject IconCompatParcelizer(String str, Object obj) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            String strIconCompatParcelizer = VideoDownloadLimitResponse.this.IconCompatParcelizer();
            jSONObject.put(str, obj);
            jSONObject.put("$token", VideoDownloadLimitResponse.this.MediaBrowserCompatSearchResultReceiver);
            jSONObject.put("$time", System.currentTimeMillis());
            jSONObject.put("$had_persisted_distinct_id", VideoDownloadLimitResponse.this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer());
            if (strIconCompatParcelizer != null) {
                jSONObject.put("$device_id", strIconCompatParcelizer);
            }
            if (strRemoteActionCompatParcelizer != null) {
                jSONObject.put("$distinct_id", strRemoteActionCompatParcelizer);
                jSONObject.put("$user_id", strRemoteActionCompatParcelizer);
            }
            jSONObject.put("$mp_metadata", VideoDownloadLimitResponse.this.MediaDescriptionCompat.RemoteActionCompatParcelizer());
            return jSONObject;
        }

        @Override // o.VideoDownloadLimitResponse.write
        public final boolean IconCompatParcelizer() {
            return RemoteActionCompatParcelizer() != null;
        }
    }

    protected final void read(String str, JSONObject jSONObject, boolean z) {
        Long l;
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        if (!z || this.MediaMetadataCompat.booleanValue()) {
            synchronized (this.MediaBrowserCompatItemReceiver) {
                l = this.MediaBrowserCompatItemReceiver.get(str);
                this.MediaBrowserCompatItemReceiver.remove(str);
                this.MediaBrowserCompatMediaItem.read(str);
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : this.MediaBrowserCompatMediaItem.MediaMetadataCompat().entrySet()) {
                    try {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    } catch (JSONException unused) {
                        return;
                    }
                }
                this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(jSONObject2);
                double dCurrentTimeMillis = System.currentTimeMillis() / 1000.0d;
                String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                String strIconCompatParcelizer = IconCompatParcelizer();
                String strMediaMetadataCompat = MediaMetadataCompat();
                jSONObject2.put("time", System.currentTimeMillis());
                jSONObject2.put("distinct_id", strAudioAttributesImplApi26Parcelizer);
                jSONObject2.put("$had_persisted_distinct_id", this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer());
                if (strIconCompatParcelizer != null) {
                    jSONObject2.put("$device_id", strIconCompatParcelizer);
                }
                if (strMediaMetadataCompat != null) {
                    jSONObject2.put("$user_id", strMediaMetadataCompat);
                }
                if (l != null) {
                    jSONObject2.put("$duration", dCurrentTimeMillis - (l.longValue() / 1000.0d));
                }
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(new getRootSubjectIds.write(str, jSONObject2, this.MediaBrowserCompatSearchResultReceiver, z, this.MediaDescriptionCompat.write()));
            } catch (JSONException unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(JSONObject jSONObject) {
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(new getRootSubjectIds.IconCompatParcelizer(jSONObject, this.MediaBrowserCompatSearchResultReceiver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str) {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(new getRootSubjectIds.AudioAttributesImplApi21Parcelizer(str, this.MediaBrowserCompatSearchResultReceiver));
    }

    private static void IconCompatParcelizer(Context context, VideoDownloadLimitResponse videoDownloadLimitResponse) {
        try {
            Class<?> cls = Class.forName("o.getProvider");
            cls.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), new BroadcastReceiver() { // from class: o.VideoDownloadLimitResponse.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    JSONObject jSONObject = new JSONObject();
                    Bundle bundleExtra = intent.getBundleExtra("event_args");
                    if (bundleExtra != null) {
                        for (String str : bundleExtra.keySet()) {
                            try {
                                jSONObject.put(str, bundleExtra.get(str));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    VideoDownloadLimitResponse videoDownloadLimitResponse2 = VideoDownloadLimitResponse.this;
                    StringBuilder sb = new StringBuilder("$");
                    sb.append(intent.getStringExtra("event_name"));
                    videoDownloadLimitResponse2.read(sb.toString(), jSONObject);
                }
            }, new IntentFilter("com.parse.bolts.measurement_event"));
        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (IllegalAccessException e2) {
            e2.getMessage();
        } catch (NoSuchMethodException e3) {
            e3.getMessage();
        } catch (InvocationTargetException unused) {
        }
    }

    private static void RemoteActionCompatParcelizer(Context context) {
        if (context instanceof Activity) {
            try {
                Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
            } catch (ClassNotFoundException e) {
                e.getMessage();
            } catch (IllegalAccessException e2) {
                e2.getMessage();
            } catch (NoSuchMethodException e3) {
                e3.getMessage();
            } catch (InvocationTargetException unused) {
            }
        }
    }
}
