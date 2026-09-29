package kotlin;

import android.os.Build;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0017\u000f\u001bB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tB\u001d\b\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\n\u0012\b\u0010\b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0011\u0010 \u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0018\u0010\"\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lo/getLoadingMediaPeriod;", "", "Lorg/json/JSONArray;", "p0", "<init>", "(Lorg/json/JSONArray;)V", "", "Lo/getLoadingMediaPeriod$IconCompatParcelizer;", "p1", "(Ljava/lang/Throwable;Lo/getLoadingMediaPeriod$IconCompatParcelizer;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/io/File;", "(Ljava/io/File;)V", "", "write", "()V", "", "(Lo/getLoadingMediaPeriod;)I", "AudioAttributesCompatParcelizer", "toString", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "read", "()Lorg/json/JSONObject;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "Lorg/json/JSONArray;", "AudioAttributesImplApi21Parcelizer", "", "()Z", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "", "Ljava/lang/Long;", "AudioAttributesImplBaseParcelizer", "Lo/getLoadingMediaPeriod$IconCompatParcelizer;", "MediaBrowserCompatMediaItem"}, k = 1, mv = {1, 4, 0})
public final class getLoadingMediaPeriod {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private JSONArray AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private IconCompatParcelizer MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    public /* synthetic */ getLoadingMediaPeriod(File file, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(file);
    }

    public /* synthetic */ getLoadingMediaPeriod(String str, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2);
    }

    public /* synthetic */ getLoadingMediaPeriod(Throwable th, IconCompatParcelizer iconCompatParcelizer, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(th, iconCompatParcelizer);
    }

    public /* synthetic */ getLoadingMediaPeriod(JSONArray jSONArray, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(jSONArray);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\bj\u0002\b\u0007j\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/getLoadingMediaPeriod$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "write", "read"}, k = 1, mv = {1, 4, 0})
    public enum IconCompatParcelizer {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        @Override // java.lang.Enum
        public final String toString() {
            int i = updateMediaPeriodTimelines.read[ordinal()];
            if (i == 1) {
                return "Analysis";
            }
            if (i == 2) {
                return "AnrReport";
            }
            if (i == 3) {
                return "CrashReport";
            }
            if (i == 4) {
                return "CrashShield";
            }
            if (i == 5) {
                return "ThreadCheck";
            }
            return "Unknown";
        }

        public final String RemoteActionCompatParcelizer() {
            int i = updateMediaPeriodTimelines.AudioAttributesCompatParcelizer[ordinal()];
            if (i == 1) {
                return "analysis_log_";
            }
            if (i == 2) {
                return "anr_log_";
            }
            if (i == 3) {
                return "crash_log_";
            }
            if (i == 4) {
                return "shield_log_";
            }
            if (i == 5) {
                return "thread_check_log_";
            }
            return "Unknown";
        }
    }

    private getLoadingMediaPeriod(JSONArray jSONArray) {
        this.MediaBrowserCompatMediaItem = IconCompatParcelizer.Analysis;
        this.AudioAttributesImplBaseParcelizer = Long.valueOf(System.currentTimeMillis() / 1000);
        this.AudioAttributesCompatParcelizer = jSONArray;
        String string = new StringBuffer("analysis_log_").append(String.valueOf(this.AudioAttributesImplBaseParcelizer)).append(".json").toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        this.AudioAttributesImplApi21Parcelizer = string;
    }

    private getLoadingMediaPeriod(Throwable th, IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatMediaItem = iconCompatParcelizer;
        this.read = DefaultAnalyticsCollectorMediaPeriodQueueTracker.write();
        this.RemoteActionCompatParcelizer = getReadingMediaPeriod.IconCompatParcelizer(th);
        this.MediaBrowserCompatItemReceiver = getReadingMediaPeriod.RemoteActionCompatParcelizer(th);
        this.AudioAttributesImplBaseParcelizer = Long.valueOf(System.currentTimeMillis() / 1000);
        String string = new StringBuffer().append(iconCompatParcelizer.RemoteActionCompatParcelizer()).append(String.valueOf(this.AudioAttributesImplBaseParcelizer)).append(".json").toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        this.AudioAttributesImplApi21Parcelizer = string;
    }

    private getLoadingMediaPeriod(String str, String str2) {
        this.MediaBrowserCompatMediaItem = IconCompatParcelizer.AnrReport;
        this.read = DefaultAnalyticsCollectorMediaPeriodQueueTracker.write();
        this.RemoteActionCompatParcelizer = str;
        this.MediaBrowserCompatItemReceiver = str2;
        this.AudioAttributesImplBaseParcelizer = Long.valueOf(System.currentTimeMillis() / 1000);
        String string = new StringBuffer("anr_log_").append(String.valueOf(this.AudioAttributesImplBaseParcelizer)).append(".json").toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        this.AudioAttributesImplApi21Parcelizer = string;
    }

    private getLoadingMediaPeriod(File file) {
        String name = file.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        this.AudioAttributesImplApi21Parcelizer = name;
        this.MediaBrowserCompatMediaItem = Companion.AudioAttributesCompatParcelizer(name);
        JSONObject jSONObjectAudioAttributesCompatParcelizer = getReadingMediaPeriod.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        if (jSONObjectAudioAttributesCompatParcelizer != null) {
            this.AudioAttributesImplBaseParcelizer = Long.valueOf(jSONObjectAudioAttributesCompatParcelizer.optLong(PaymentConstants.TIMESTAMP, 0L));
            this.read = jSONObjectAudioAttributesCompatParcelizer.optString("app_version", null);
            this.RemoteActionCompatParcelizer = jSONObjectAudioAttributesCompatParcelizer.optString("reason", null);
            this.MediaBrowserCompatItemReceiver = jSONObjectAudioAttributesCompatParcelizer.optString("callstack", null);
            this.AudioAttributesCompatParcelizer = jSONObjectAudioAttributesCompatParcelizer.optJSONArray("feature_names");
        }
    }

    public final int write(getLoadingMediaPeriod p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Long l = this.AudioAttributesImplBaseParcelizer;
        if (l == null) {
            return -1;
        }
        long jLongValue = l.longValue();
        Long l2 = p0.AudioAttributesImplBaseParcelizer;
        if (l2 != null) {
            return (l2.longValue() > jLongValue ? 1 : (l2.longValue() == jLongValue ? 0 : -1));
        }
        return 1;
    }

    public final boolean IconCompatParcelizer() {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iconCompatParcelizer != null) {
            int i = getCurrentPlayerMediaPeriod.IconCompatParcelizer[iconCompatParcelizer.ordinal()];
            if (i != 1) {
                return i != 2 ? ((i != 3 && i != 4 && i != 5) || this.MediaBrowserCompatItemReceiver == null || this.AudioAttributesImplBaseParcelizer == null) ? false : true : (this.MediaBrowserCompatItemReceiver == null || this.RemoteActionCompatParcelizer == null || this.AudioAttributesImplBaseParcelizer == null) ? false : true;
            }
            if (this.AudioAttributesCompatParcelizer != null && this.AudioAttributesImplBaseParcelizer != null) {
                return true;
            }
        }
        return false;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (IconCompatParcelizer()) {
            getReadingMediaPeriod.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, toString());
        }
    }

    public final void write() {
        getReadingMediaPeriod.write(this.AudioAttributesImplApi21Parcelizer);
    }

    public final String toString() {
        JSONObject jSONObjectAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (jSONObjectAudioAttributesImplApi26Parcelizer == null) {
            String string = new JSONObject().toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }
        String string2 = jSONObjectAudioAttributesImplApi26Parcelizer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        return string2;
    }

    private final JSONObject AudioAttributesImplApi26Parcelizer() {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iconCompatParcelizer == null) {
            return null;
        }
        int i = getCurrentPlayerMediaPeriod.read[iconCompatParcelizer.ordinal()];
        if (i == 1) {
            return read();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return RemoteActionCompatParcelizer();
        }
        return null;
    }

    private final JSONObject read() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.AudioAttributesCompatParcelizer;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.AudioAttributesImplBaseParcelizer;
            if (l != null) {
                jSONObject.put(PaymentConstants.TIMESTAMP, l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject RemoteActionCompatParcelizer() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.read;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.AudioAttributesImplBaseParcelizer;
            if (l != null) {
                jSONObject.put(PaymentConstants.TIMESTAMP, l);
            }
            String str2 = this.RemoteActionCompatParcelizer;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.MediaBrowserCompatItemReceiver;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatMediaItem;
            if (iconCompatParcelizer != null) {
                jSONObject.put("type", iconCompatParcelizer);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/getLoadingMediaPeriod$read;", "", "<init>", "()V", "", "p0", "p1", "Lo/getLoadingMediaPeriod;", "write", "(Ljava/lang/String;Ljava/lang/String;)Lo/getLoadingMediaPeriod;", "", "Lo/getLoadingMediaPeriod$IconCompatParcelizer;", "read", "(Ljava/lang/Throwable;Lo/getLoadingMediaPeriod$IconCompatParcelizer;)Lo/getLoadingMediaPeriod;", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)Lo/getLoadingMediaPeriod;", "Ljava/io/File;", "RemoteActionCompatParcelizer", "(Ljava/io/File;)Lo/getLoadingMediaPeriod;"}, k = 1, mv = {1, 4, 0})
    public static final class read {
        public static final read INSTANCE = new read();

        private read() {
        }

        @getMagicModuleMeta
        public static final getLoadingMediaPeriod RemoteActionCompatParcelizer(File p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getLoadingMediaPeriod(p0, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }

        @getMagicModuleMeta
        public static final getLoadingMediaPeriod read(Throwable p0, IconCompatParcelizer p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            return new getLoadingMediaPeriod(p0, p1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }

        @getMagicModuleMeta
        public static final getLoadingMediaPeriod write(JSONArray p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getLoadingMediaPeriod(p0, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }

        @getMagicModuleMeta
        public static final getLoadingMediaPeriod write(String p0, String p1) {
            return new getLoadingMediaPeriod(p0, p1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }
    }

    /* JADX INFO: renamed from: o.getLoadingMediaPeriod$write, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getLoadingMediaPeriod$write;", "", "<init>", "()V", "", "p0", "Lo/getLoadingMediaPeriod$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/getLoadingMediaPeriod$IconCompatParcelizer;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static IconCompatParcelizer AudioAttributesCompatParcelizer(String p0) {
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "crash_log_")) {
                return IconCompatParcelizer.CrashReport;
            }
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "shield_log_")) {
                return IconCompatParcelizer.CrashShield;
            }
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "thread_check_log_")) {
                return IconCompatParcelizer.ThreadCheck;
            }
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "analysis_log_")) {
                return IconCompatParcelizer.Analysis;
            }
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "anr_log_")) {
                return IconCompatParcelizer.AnrReport;
            }
            return IconCompatParcelizer.Unknown;
        }
    }
}
