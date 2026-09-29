package kotlin;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.getFreeLimit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class getRootSubjectIds {
    private static final Map<Context, getRootSubjectIds> RemoteActionCompatParcelizer = new HashMap();
    private final AudioAttributesImplBaseParcelizer IconCompatParcelizer = AudioAttributesCompatParcelizer();
    protected final Context read;
    protected final PlanResponsePromo write;

    private getRootSubjectIds(Context context, PlanResponsePromo planResponsePromo) {
        this.read = context;
        this.write = planResponsePromo;
        read().RemoteActionCompatParcelizer();
    }

    private AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer() {
        return new AudioAttributesImplBaseParcelizer();
    }

    public static getRootSubjectIds IconCompatParcelizer(Context context, PlanResponsePromo planResponsePromo) {
        getRootSubjectIds getrootsubjectids;
        Map<Context, getRootSubjectIds> map = RemoteActionCompatParcelizer;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (!map.containsKey(applicationContext)) {
                getrootsubjectids = new getRootSubjectIds(applicationContext, planResponsePromo);
                map.put(applicationContext, getrootsubjectids);
            } else {
                getrootsubjectids = map.get(applicationContext);
            }
        }
        return getrootsubjectids;
    }

    public final void RemoteActionCompatParcelizer(write writeVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = writeVar;
        this.IconCompatParcelizer.write(messageObtain);
    }

    public final void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = iconCompatParcelizer;
        this.IconCompatParcelizer.write(messageObtain);
    }

    public final void AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = audioAttributesImplApi21Parcelizer;
        this.IconCompatParcelizer.write(messageObtain);
    }

    public final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.obj = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer.write(messageObtain);
    }

    public final void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = audioAttributesCompatParcelizer.read();
        messageObtain.arg1 = 0;
        this.IconCompatParcelizer.write(messageObtain);
    }

    public final void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 6;
        messageObtain.obj = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer.write(messageObtain);
    }

    public final void IconCompatParcelizer(File file) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 9;
        messageObtain.obj = file;
        this.IconCompatParcelizer.write(messageObtain);
    }

    protected final getFreeLimit write(Context context) {
        return getFreeLimit.IconCompatParcelizer(context, this.write);
    }

    protected static getLessons read() {
        return new getLiveTitle();
    }

    static class write extends RemoteActionCompatParcelizer {
        private final boolean RemoteActionCompatParcelizer;
        private final JSONObject read;
        private final String write;

        public write(String str, JSONObject jSONObject, String str2) {
            this(str, jSONObject, str2, false, new JSONObject());
        }

        public write(String str, JSONObject jSONObject, String str2, boolean z, JSONObject jSONObject2) {
            super(str2, jSONObject);
            this.write = str;
            this.RemoteActionCompatParcelizer = z;
            this.read = jSONObject2;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }

        public final JSONObject write() {
            return AudioAttributesCompatParcelizer();
        }

        public final JSONObject RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    static class IconCompatParcelizer extends RemoteActionCompatParcelizer {
        public IconCompatParcelizer(JSONObject jSONObject, String str) {
            super(str, jSONObject);
        }

        public final String toString() {
            return AudioAttributesCompatParcelizer().toString();
        }

        public final boolean IconCompatParcelizer() {
            return !AudioAttributesCompatParcelizer().has("$distinct_id");
        }
    }

    static class read extends RemoteActionCompatParcelizer {
        public final String toString() {
            return AudioAttributesCompatParcelizer().toString();
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends AudioAttributesCompatParcelizer {
        private final String read;

        public AudioAttributesImplApi21Parcelizer(String str, String str2) {
            super(str2);
            this.read = str;
        }

        public final String toString() {
            return this.read;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    static class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer {
        private final JSONObject RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(String str, JSONObject jSONObject) {
            super(str);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.get(next);
                    } catch (AssertionError unused) {
                        jSONObject.remove(next);
                    } catch (JSONException unused2) {
                    }
                }
            }
            this.RemoteActionCompatParcelizer = jSONObject;
        }

        public final JSONObject AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends AudioAttributesCompatParcelizer {
        private final Map<String, String> write;

        public final Map<String, String> write() {
            return this.write;
        }
    }

    static class AudioAttributesCompatParcelizer {
        private final String write;

        public AudioAttributesCompatParcelizer(String str) {
            this.write = str;
        }

        public final String read() {
            return this.write;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(String str) {
        Thread.currentThread().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(String str) {
        Thread.currentThread().getId();
    }

    class AudioAttributesImplBaseParcelizer {
        private WoqMarrowthonResponse MediaBrowserCompatItemReceiver;
        private final Object IconCompatParcelizer = new Object();
        private long AudioAttributesCompatParcelizer = 0;
        private long RemoteActionCompatParcelizer = 0;
        private long AudioAttributesImplBaseParcelizer = -1;
        private Handler read = AudioAttributesCompatParcelizer();

        static /* synthetic */ Handler write(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            audioAttributesImplBaseParcelizer.read = null;
            return null;
        }

        public AudioAttributesImplBaseParcelizer() {
        }

        public final void write(Message message) {
            synchronized (this.IconCompatParcelizer) {
                Handler handler = this.read;
                if (handler == null) {
                    StringBuilder sb = new StringBuilder("Dead mixpanel worker dropping a message: ");
                    sb.append(message.what);
                    getRootSubjectIds.AudioAttributesCompatParcelizer(sb.toString());
                } else {
                    handler.sendMessage(message);
                }
            }
        }

        private Handler AudioAttributesCompatParcelizer() {
            HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            return new AudioAttributesCompatParcelizer(handlerThread.getLooper());
        }

        class AudioAttributesCompatParcelizer extends Handler {
            private getFreeLimit AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private long RemoteActionCompatParcelizer;
            private final long read;

            public AudioAttributesCompatParcelizer(Looper looper) {
                super(looper);
                this.AudioAttributesCompatParcelizer = null;
                AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver = WoqMarrowthonResponse.RemoteActionCompatParcelizer(getRootSubjectIds.this.read);
                this.read = getRootSubjectIds.this.write.AudioAttributesImplBaseParcelizer();
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                String str;
                int iAudioAttributesCompatParcelizer;
                String str2;
                if (this.AudioAttributesCompatParcelizer == null) {
                    getFreeLimit getfreelimitWrite = getRootSubjectIds.this.write(getRootSubjectIds.this.read);
                    this.AudioAttributesCompatParcelizer = getfreelimitWrite;
                    getfreelimitWrite.IconCompatParcelizer(System.currentTimeMillis() - getRootSubjectIds.this.write.AudioAttributesCompatParcelizer(), getFreeLimit.AudioAttributesCompatParcelizer.EVENTS);
                    this.AudioAttributesCompatParcelizer.IconCompatParcelizer(System.currentTimeMillis() - getRootSubjectIds.this.write.AudioAttributesCompatParcelizer(), getFreeLimit.AudioAttributesCompatParcelizer.PEOPLE);
                }
                try {
                    if (message.what == 0) {
                        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) message.obj;
                        getFreeLimit.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer() ? getFreeLimit.AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE : getFreeLimit.AudioAttributesCompatParcelizer.PEOPLE;
                        getRootSubjectIds getrootsubjectids = getRootSubjectIds.this;
                        getRootSubjectIds.AudioAttributesCompatParcelizer("Queuing people record for sending later");
                        getRootSubjectIds getrootsubjectids2 = getRootSubjectIds.this;
                        StringBuilder sb = new StringBuilder("    ");
                        sb.append(iconCompatParcelizer.toString());
                        getRootSubjectIds.AudioAttributesCompatParcelizer(sb.toString());
                        str2 = iconCompatParcelizer.read();
                        iAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer(), str2, audioAttributesCompatParcelizer);
                        if (iconCompatParcelizer.IconCompatParcelizer()) {
                            iAudioAttributesCompatParcelizer = 0;
                        }
                    } else if (message.what == 3) {
                        read readVar = (read) message.obj;
                        getRootSubjectIds getrootsubjectids3 = getRootSubjectIds.this;
                        getRootSubjectIds.AudioAttributesCompatParcelizer("Queuing group record for sending later");
                        getRootSubjectIds getrootsubjectids4 = getRootSubjectIds.this;
                        StringBuilder sb2 = new StringBuilder("    ");
                        sb2.append(readVar.toString());
                        getRootSubjectIds.AudioAttributesCompatParcelizer(sb2.toString());
                        str2 = readVar.read();
                        iAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), str2, getFreeLimit.AudioAttributesCompatParcelizer.GROUPS);
                    } else {
                        String str3 = null;
                        if (message.what == 1) {
                            write writeVar = (write) message.obj;
                            try {
                                JSONObject jSONObject = read(writeVar);
                                getRootSubjectIds getrootsubjectids5 = getRootSubjectIds.this;
                                getRootSubjectIds.AudioAttributesCompatParcelizer("Queuing event for sending later");
                                getRootSubjectIds getrootsubjectids6 = getRootSubjectIds.this;
                                StringBuilder sb3 = new StringBuilder("    ");
                                sb3.append(jSONObject.toString());
                                getRootSubjectIds.AudioAttributesCompatParcelizer(sb3.toString());
                                str3 = writeVar.read();
                                iAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(jSONObject, str3, getFreeLimit.AudioAttributesCompatParcelizer.EVENTS);
                                str2 = str3;
                            } catch (JSONException unused) {
                                writeVar.IconCompatParcelizer();
                                str = str3;
                                iAudioAttributesCompatParcelizer = -3;
                                str2 = str;
                            }
                        } else if (message.what == 4) {
                            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (AudioAttributesImplApi21Parcelizer) message.obj;
                            String strRemoteActionCompatParcelizer = audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
                            str2 = audioAttributesImplApi21Parcelizer.read();
                            iAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str2, strRemoteActionCompatParcelizer);
                        } else {
                            if (message.what == 7) {
                                str = ((AudioAttributesCompatParcelizer) message.obj).read();
                                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getFreeLimit.AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE, str);
                            } else {
                                if (message.what == 8) {
                                    MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) message.obj;
                                    this.AudioAttributesCompatParcelizer.write(mediaBrowserCompatCustomActionResultReceiver.write(), mediaBrowserCompatCustomActionResultReceiver.read());
                                } else if (message.what == 2) {
                                    getRootSubjectIds getrootsubjectids7 = getRootSubjectIds.this;
                                    getRootSubjectIds.AudioAttributesCompatParcelizer("Flushing queue due to scheduled or forced flush");
                                    AudioAttributesImplBaseParcelizer.this.RemoteActionCompatParcelizer();
                                    str = (String) message.obj;
                                    write(this.AudioAttributesCompatParcelizer, str);
                                } else if (message.what == 6) {
                                    str = ((AudioAttributesCompatParcelizer) message.obj).read();
                                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getFreeLimit.AudioAttributesCompatParcelizer.EVENTS, str);
                                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getFreeLimit.AudioAttributesCompatParcelizer.PEOPLE, str);
                                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getFreeLimit.AudioAttributesCompatParcelizer.GROUPS, str);
                                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getFreeLimit.AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE, str);
                                } else if (message.what == 5) {
                                    Thread.currentThread().getId();
                                    synchronized (AudioAttributesImplBaseParcelizer.this.IconCompatParcelizer) {
                                        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                                        AudioAttributesImplBaseParcelizer.write(AudioAttributesImplBaseParcelizer.this);
                                        Looper.myLooper().quit();
                                    }
                                } else if (message.what == 9) {
                                    getShowBanner.write((File) message.obj);
                                } else {
                                    Objects.toString(message);
                                }
                                iAudioAttributesCompatParcelizer = -3;
                                str2 = str3;
                            }
                            iAudioAttributesCompatParcelizer = -3;
                            str2 = str;
                        }
                    }
                    if ((iAudioAttributesCompatParcelizer >= getRootSubjectIds.this.write.write() || iAudioAttributesCompatParcelizer == -2) && this.IconCompatParcelizer <= 0 && str2 != null) {
                        getRootSubjectIds getrootsubjectids8 = getRootSubjectIds.this;
                        StringBuilder sb4 = new StringBuilder("Flushing queue due to bulk upload limit (");
                        sb4.append(iAudioAttributesCompatParcelizer);
                        sb4.append(") for project ");
                        sb4.append(str2);
                        getRootSubjectIds.AudioAttributesCompatParcelizer(sb4.toString());
                        AudioAttributesImplBaseParcelizer.this.RemoteActionCompatParcelizer();
                        write(this.AudioAttributesCompatParcelizer, str2);
                        return;
                    }
                    if (iAudioAttributesCompatParcelizer <= 0 || hasMessages(2, str2)) {
                        return;
                    }
                    getRootSubjectIds getrootsubjectids9 = getRootSubjectIds.this;
                    StringBuilder sb5 = new StringBuilder("Queue depth ");
                    sb5.append(iAudioAttributesCompatParcelizer);
                    sb5.append(" - Adding flush in ");
                    sb5.append(this.read);
                    getRootSubjectIds.AudioAttributesCompatParcelizer(sb5.toString());
                    if (this.read >= 0) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 2;
                        messageObtain.obj = str2;
                        messageObtain.arg1 = 1;
                        sendMessageDelayed(messageObtain, this.read);
                    }
                } catch (RuntimeException unused2) {
                    synchronized (AudioAttributesImplBaseParcelizer.this.IconCompatParcelizer) {
                        AudioAttributesImplBaseParcelizer.write(AudioAttributesImplBaseParcelizer.this);
                        try {
                            Looper.myLooper().quit();
                        } catch (Exception unused3) {
                        }
                    }
                }
            }

            private void write(getFreeLimit getfreelimit, String str) throws Throwable {
                getRootSubjectIds getrootsubjectids = getRootSubjectIds.this;
                if (!getRootSubjectIds.read().RemoteActionCompatParcelizer(getRootSubjectIds.this.read, getRootSubjectIds.this.write.MediaDescriptionCompat())) {
                    getRootSubjectIds getrootsubjectids2 = getRootSubjectIds.this;
                    getRootSubjectIds.AudioAttributesCompatParcelizer("Not flushing data to Mixpanel because the device is not connected to the internet.");
                } else {
                    read(getfreelimit, str, getFreeLimit.AudioAttributesCompatParcelizer.EVENTS, getRootSubjectIds.this.write.RemoteActionCompatParcelizer());
                    read(getfreelimit, str, getFreeLimit.AudioAttributesCompatParcelizer.PEOPLE, getRootSubjectIds.this.write.RatingCompat());
                    read(getfreelimit, str, getFreeLimit.AudioAttributesCompatParcelizer.GROUPS, getRootSubjectIds.this.write.AudioAttributesImplApi26Parcelizer());
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x013e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0028 A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void read(kotlin.getFreeLimit r17, java.lang.String r18, o.getFreeLimit.AudioAttributesCompatParcelizer r19, java.lang.String r20) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 400
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getRootSubjectIds.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.read(o.getFreeLimit, java.lang.String, o.getFreeLimit$AudioAttributesCompatParcelizer, java.lang.String):void");
            }

            private JSONObject write() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mp_lib", LogSubCategory.LifeCycle.ANDROID);
                jSONObject.put("$lib_version", "7.4.1");
                jSONObject.put("$os", "Android");
                jSONObject.put("$os_version", Build.VERSION.RELEASE == null ? "UNKNOWN" : Build.VERSION.RELEASE);
                jSONObject.put("$manufacturer", Build.MANUFACTURER == null ? "UNKNOWN" : Build.MANUFACTURER);
                jSONObject.put("$brand", Build.BRAND == null ? "UNKNOWN" : Build.BRAND);
                jSONObject.put("$model", Build.MODEL != null ? Build.MODEL : "UNKNOWN");
                DisplayMetrics displayMetricsRemoteActionCompatParcelizer = AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
                jSONObject.put("$screen_dpi", displayMetricsRemoteActionCompatParcelizer.densityDpi);
                jSONObject.put("$screen_height", displayMetricsRemoteActionCompatParcelizer.heightPixels);
                jSONObject.put("$screen_width", displayMetricsRemoteActionCompatParcelizer.widthPixels);
                String strWrite = AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.write();
                if (strWrite != null) {
                    jSONObject.put("$app_version", strWrite);
                    jSONObject.put("$app_version_string", strWrite);
                }
                Integer numAudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
                if (numAudioAttributesCompatParcelizer != null) {
                    String strValueOf = String.valueOf(numAudioAttributesCompatParcelizer);
                    jSONObject.put("$app_release", strValueOf);
                    jSONObject.put("$app_build_number", strValueOf);
                }
                Boolean boolValueOf = Boolean.valueOf(AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver());
                if (boolValueOf != null) {
                    jSONObject.put("$has_nfc", boolValueOf.booleanValue());
                }
                Boolean boolValueOf2 = Boolean.valueOf(AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
                if (boolValueOf2 != null) {
                    jSONObject.put("$has_telephone", boolValueOf2.booleanValue());
                }
                String strIconCompatParcelizer = AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
                if (strIconCompatParcelizer != null && !strIconCompatParcelizer.trim().isEmpty()) {
                    jSONObject.put("$carrier", strIconCompatParcelizer);
                }
                Boolean boolMediaBrowserCompatItemReceiver = AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver();
                if (boolMediaBrowserCompatItemReceiver != null) {
                    jSONObject.put("$wifi", boolMediaBrowserCompatItemReceiver.booleanValue());
                }
                Boolean boolAudioAttributesImplApi26Parcelizer = AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
                if (boolAudioAttributesImplApi26Parcelizer != null) {
                    jSONObject.put("$bluetooth_enabled", boolAudioAttributesImplApi26Parcelizer);
                }
                jSONObject.put("$bluetooth_version", AudioAttributesImplBaseParcelizer.this.MediaBrowserCompatItemReceiver.read());
                return jSONObject;
            }

            private JSONObject read(write writeVar) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectWrite = writeVar.write();
                JSONObject jSONObjectWrite2 = write();
                jSONObjectWrite2.put(LoggedUserResponse.KEY_TOKEN, writeVar.read());
                if (jSONObjectWrite != null) {
                    Iterator<String> itKeys = jSONObjectWrite.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectWrite2.put(next, jSONObjectWrite.get(next));
                    }
                }
                jSONObject.put("event", writeVar.IconCompatParcelizer());
                jSONObject.put("properties", jSONObjectWrite2);
                jSONObject.put("$mp_metadata", writeVar.RemoteActionCompatParcelizer());
                return jSONObject;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void RemoteActionCompatParcelizer() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.AudioAttributesCompatParcelizer;
            long j2 = 1 + j;
            long j3 = this.AudioAttributesImplBaseParcelizer;
            if (j3 > 0) {
                long j4 = ((jCurrentTimeMillis - j3) + (this.RemoteActionCompatParcelizer * j)) / j2;
                this.RemoteActionCompatParcelizer = j4;
                StringBuilder sb = new StringBuilder("Average send frequency approximately ");
                sb.append(j4 / 1000);
                sb.append(" seconds.");
                getRootSubjectIds.AudioAttributesCompatParcelizer(sb.toString());
            }
            this.AudioAttributesImplBaseParcelizer = jCurrentTimeMillis;
            this.AudioAttributesCompatParcelizer = j2;
        }
    }
}
