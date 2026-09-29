package kotlin;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda33;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000b\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0007¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0007\u0010\u0012J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0016J;\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017H\u0007¢\u0006\u0004\b\n\u0010\u001bJ'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\n\u0010\u001dJ'\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u000b\u001a\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!R\"\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020#0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "", "write", "(Lorg/json/JSONObject;)V", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "()Lorg/json/JSONObject;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$AudioAttributesCompatParcelizer;", "Ljava/io/File;", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$AudioAttributesCompatParcelizer;)Ljava/io/File;", "", "", "(J)Z", "Lorg/json/JSONArray;", "", "(Lorg/json/JSONArray;)[F", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "p1", "", "p2", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$AudioAttributesCompatParcelizer;[[F[Ljava/lang/String;)[Ljava/lang/String;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;[F)[Ljava/lang/String;", "IconCompatParcelizer", "", "Ljava/util/List;", "()Z", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$read;", "Ljava/util/Map;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda39 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda39 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda39();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final Map<String, read> RemoteActionCompatParcelizer = new ConcurrentHashMap();
    private static final List<String> IconCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});
    private static final List<String> read = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"none", "address", "health"});

    private DefaultAnalyticsCollectorExternalSyntheticLambda39() {
    }

    public static final /* synthetic */ boolean AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39 defaultAnalyticsCollectorExternalSyntheticLambda39, long j) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.class)) {
            return false;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda39.write(j);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda39.class);
            return false;
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39 defaultAnalyticsCollectorExternalSyntheticLambda39, JSONObject jSONObject) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.class)) {
            return;
        }
        try {
            defaultAnalyticsCollectorExternalSyntheticLambda39.write(jSONObject);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda39.class);
        }
    }

    public static final /* synthetic */ JSONObject RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39 defaultAnalyticsCollectorExternalSyntheticLambda39) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda39.AudioAttributesCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda39.class);
            return null;
        }
    }

    public static final /* synthetic */ float[] read(DefaultAnalyticsCollectorExternalSyntheticLambda39 defaultAnalyticsCollectorExternalSyntheticLambda39, JSONArray jSONArray) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda39.AudioAttributesCompatParcelizer(jSONArray);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda39.class);
            return null;
        }
    }

    public static final /* synthetic */ void write(DefaultAnalyticsCollectorExternalSyntheticLambda39 defaultAnalyticsCollectorExternalSyntheticLambda39) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.class)) {
            return;
        }
        try {
            defaultAnalyticsCollectorExternalSyntheticLambda39.read();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda39.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\bj\u0002\b\t"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$AudioAttributesCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "", "write", "()Ljava/lang/String;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public enum AudioAttributesCompatParcelizer {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public final String write() {
            int i = DefaultAnalyticsCollectorExternalSyntheticLambda38.AudioAttributesCompatParcelizer[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new RenewEligibleCreator();
        }

        public final String IconCompatParcelizer() {
            int i = DefaultAnalyticsCollectorExternalSyntheticLambda38.write[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new RenewEligibleCreator();
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.class)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda39.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            SharedPreferences sharedPreferences = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                            String string = sharedPreferences.getString("models", null);
                            JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
                            long j = sharedPreferences.getLong("model_request_timestamp", 0L);
                            if (!DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.ModelRequest) || jSONObject.length() == 0 || !DefaultAnalyticsCollectorExternalSyntheticLambda39.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.INSTANCE, j)) {
                                jSONObject = DefaultAnalyticsCollectorExternalSyntheticLambda39.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.INSTANCE);
                                if (jSONObject == null) {
                                    return;
                                } else {
                                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                                }
                            }
                            DefaultAnalyticsCollectorExternalSyntheticLambda39.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.INSTANCE, jSONObject);
                            DefaultAnalyticsCollectorExternalSyntheticLambda39.write(DefaultAnalyticsCollectorExternalSyntheticLambda39.INSTANCE);
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    } catch (Throwable th2) {
                        getMinWindowSequenceNumber.read(th2, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda39.class);
        }
    }

    private final boolean write(long p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this) || p0 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - p0 < 259200000;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return false;
        }
    }

    private final void write(JSONObject p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = p0.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    read.Companion companion = read.INSTANCE;
                    read readVar = read.Companion.read(p0.getJSONObject(next));
                    if (readVar != null) {
                        RemoteActionCompatParcelizer.put(readVar.getMediaBrowserCompatItemReceiver(), readVar);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private final JSONObject read(JSONObject p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = p0.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version_id", jSONObject2.getString("version_id"));
                    jSONObject3.put("use_case", jSONObject2.getString("use_case"));
                    jSONObject3.put("thresholds", jSONObject2.getJSONArray("thresholds"));
                    jSONObject3.put("asset_uri", jSONObject2.getString("asset_uri"));
                    if (jSONObject2.has("rules_uri")) {
                        jSONObject3.put("rules_uri", jSONObject2.getString("rules_uri"));
                    }
                    jSONObject.put(jSONObject2.getString("use_case"), jSONObject3);
                }
                return jSONObject;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    private final JSONObject AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("%s/model_asset", Arrays.copyOf(new Object[]{lambdaonMediaMetadataChanged48.write()}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            GraphRequest graphRequestIconCompatParcelizer = GraphRequest.Companion.IconCompatParcelizer(null, str, null);
            graphRequestIconCompatParcelizer.onAddQueueItem();
            graphRequestIconCompatParcelizer.read(bundle);
            JSONObject read2 = graphRequestIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getRead();
            if (read2 != null) {
                return read(read2);
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    private final void read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String remoteActionCompatParcelizer = null;
            int iMax = 0;
            for (Map.Entry<String, read> entry : RemoteActionCompatParcelizer.entrySet()) {
                String key = entry.getKey();
                read value = entry.getValue();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) key, (Object) AudioAttributesCompatParcelizer.MTML_APP_EVENT_PREDICTION.IconCompatParcelizer())) {
                    String remoteActionCompatParcelizer2 = value.getRemoteActionCompatParcelizer();
                    int iMax2 = Math.max(iMax, value.getMediaBrowserCompatCustomActionResultReceiver());
                    if (DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.SuggestedEvents) && IconCompatParcelizer()) {
                        arrayList.add(value.IconCompatParcelizer(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda39.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                    return;
                                }
                                try {
                                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                        return;
                                    }
                                    try {
                                        DefaultAnalyticsCollectorExternalSyntheticLambda48.read();
                                    } catch (Throwable th) {
                                        getMinWindowSequenceNumber.read(th, this);
                                    }
                                } catch (Throwable th2) {
                                    getMinWindowSequenceNumber.read(th2, this);
                                }
                            }
                        }));
                    }
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                    iMax = iMax2;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) key, (Object) AudioAttributesCompatParcelizer.MTML_INTEGRITY_DETECT.IconCompatParcelizer())) {
                    remoteActionCompatParcelizer = value.getRemoteActionCompatParcelizer();
                    iMax = Math.max(iMax, value.getMediaBrowserCompatCustomActionResultReceiver());
                    if (DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.IntelligentIntegrity)) {
                        arrayList.add(value.IconCompatParcelizer(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda39.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                    return;
                                }
                                try {
                                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                        return;
                                    }
                                    try {
                                        DefaultAnalyticsCollectorExternalSyntheticLambda27.AudioAttributesCompatParcelizer();
                                    } catch (Throwable th) {
                                        getMinWindowSequenceNumber.read(th, this);
                                    }
                                } catch (Throwable th2) {
                                    getMinWindowSequenceNumber.read(th2, this);
                                }
                            }
                        }));
                    }
                }
            }
            if (remoteActionCompatParcelizer == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            read.INSTANCE.RemoteActionCompatParcelizer(new read("MTML", remoteActionCompatParcelizer, null, iMax, null), arrayList);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private final boolean IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return false;
        }
        try {
            Locale localeAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer();
            if (localeAudioAttributesCompatParcelizer == null) {
                return true;
            }
            String language = localeAudioAttributesCompatParcelizer.getLanguage();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(language, "");
            return TestGroupLSModel.write((CharSequence) language, (CharSequence) "en", false);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return false;
        }
    }

    private final float[] AudioAttributesCompatParcelizer(JSONArray p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this) || p0 == null) {
            return null;
        }
        try {
            float[] fArr = new float[p0.length()];
            int length = p0.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = p0.getString(i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final File RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            read readVar = RemoteActionCompatParcelizer.get(p0.IconCompatParcelizer());
            if (readVar != null) {
                return readVar.getIconCompatParcelizer();
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda39.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final String[] read(AudioAttributesCompatParcelizer p0, float[][] p1, String[] p2) {
        DefaultAnalyticsCollectorExternalSyntheticLambda37 write;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            read readVar = RemoteActionCompatParcelizer.get(p0.IconCompatParcelizer());
            if (readVar != null && (write = readVar.getWrite()) != null) {
                float[] audioAttributesImplApi21Parcelizer = readVar.getAudioAttributesImplApi21Parcelizer();
                int length = p2.length;
                int length2 = p1[0].length;
                DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(new int[]{1, length2});
                for (int i = 0; i <= 0; i++) {
                    System.arraycopy(p1[0], 0, defaultAnalyticsCollectorExternalSyntheticLambda4.getRead(), 0, length2);
                }
                DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4AudioAttributesCompatParcelizer = write.AudioAttributesCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4, p2, p0.write());
                if (defaultAnalyticsCollectorExternalSyntheticLambda4AudioAttributesCompatParcelizer != null && audioAttributesImplApi21Parcelizer != null && defaultAnalyticsCollectorExternalSyntheticLambda4AudioAttributesCompatParcelizer.getRead().length != 0 && audioAttributesImplApi21Parcelizer.length != 0) {
                    int i2 = DefaultAnalyticsCollectorExternalSyntheticLambda40.AudioAttributesCompatParcelizer[p0.ordinal()];
                    if (i2 == 1) {
                        return INSTANCE.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4AudioAttributesCompatParcelizer, audioAttributesImplApi21Parcelizer);
                    }
                    if (i2 == 2) {
                        return INSTANCE.read(defaultAnalyticsCollectorExternalSyntheticLambda4AudioAttributesCompatParcelizer, audioAttributesImplApi21Parcelizer);
                    }
                    throw new RenewEligibleCreator();
                }
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda39.class);
            return null;
        }
    }

    private final String[] IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0, float[] p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(1);
            float[] read2 = p0.getRead();
            if (iAudioAttributesCompatParcelizer2 != p1.length) {
                return null;
            }
            newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, iAudioAttributesCompatParcelizer);
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer, 10));
            Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
                int length = p1.length;
                String str = "other";
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    if (read2[(iRemoteActionCompatParcelizer * iAudioAttributesCompatParcelizer2) + i2] >= p1[i]) {
                        str = IconCompatParcelizer.get(i2);
                    }
                    i++;
                    i2++;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    private final String[] read(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0, float[] p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(1);
            float[] read2 = p0.getRead();
            if (iAudioAttributesCompatParcelizer2 != p1.length) {
                return null;
            }
            newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, iAudioAttributesCompatParcelizer);
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer, 10));
            Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
                int length = p1.length;
                String str = "none";
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    if (read2[(iRemoteActionCompatParcelizer * iAudioAttributesCompatParcelizer2) + i2] >= p1[i]) {
                        str = read.get(i2);
                    }
                    i++;
                    i2++;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R$\u0010\r\u001a\u0004\u0018\u00010\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c\"\u0004\b\u0010\u0010\u001dR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\r\u0010\u0011R\u001e\u0010\"\u001a\u0004\u0018\u00010\b8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0012\u0010!R\u001c\u0010$\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\u001e\u001a\u00020\u00068\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$read;", "", "", "p0", "p1", "p2", "", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "Ljava/lang/Runnable;", "IconCompatParcelizer", "(Ljava/lang/Runnable;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$read;", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda37;", "AudioAttributesCompatParcelizer", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda37;", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda37;", "write", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda37;)V", "Ljava/lang/Runnable;", "Ljava/io/File;", "Ljava/io/File;", "()Ljava/io/File;", "(Ljava/io/File;)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "[F", "()[F", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "I", "()I"}, k = 1, mv = {1, 4, 0})
    static final class read {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private DefaultAnalyticsCollectorExternalSyntheticLambda37 write;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private float[] AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private String MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private String read;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private int MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private Runnable AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private File IconCompatParcelizer;

        public read(String str, String str2, String str3, int i, float[] fArr) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.MediaBrowserCompatItemReceiver = str;
            this.RemoteActionCompatParcelizer = str2;
            this.read = str3;
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            this.AudioAttributesImplApi21Parcelizer = fArr;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
        public final String getMediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final int getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final float[] getAudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final void read(File file) {
            this.IconCompatParcelizer = file;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final File getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final DefaultAnalyticsCollectorExternalSyntheticLambda37 getWrite() {
            return this.write;
        }

        public final void write(DefaultAnalyticsCollectorExternalSyntheticLambda37 defaultAnalyticsCollectorExternalSyntheticLambda37) {
            this.write = defaultAnalyticsCollectorExternalSyntheticLambda37;
        }

        public final read IconCompatParcelizer(Runnable p0) {
            this.AudioAttributesCompatParcelizer = p0;
            return this;
        }

        /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda39$read$RemoteActionCompatParcelizer, reason: from kotlin metadata */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$read$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$read;", "read", "(Lorg/json/JSONObject;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$read;", "", "", "p1", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;I)V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda33$read;", "p2", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda33$read;)V", "", "RemoteActionCompatParcelizer", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda39$read;Ljava/util/List;)V"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }

            public static read read(JSONObject p0) {
                if (p0 == null) {
                    return null;
                }
                try {
                    String string = p0.getString("use_case");
                    String string2 = p0.getString("asset_uri");
                    String strOptString = p0.optString("rules_uri", null);
                    int i = p0.getInt("version_id");
                    float[] fArr = DefaultAnalyticsCollectorExternalSyntheticLambda39.read(DefaultAnalyticsCollectorExternalSyntheticLambda39.INSTANCE, p0.getJSONArray("thresholds"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    return new read(string, string2, strOptString, i, fArr);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void RemoteActionCompatParcelizer(read p0, final List<read> p1) {
                toMagicModuleMetaRepoModel.write(p0, "");
                toMagicModuleMetaRepoModel.write(p1, "");
                AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver(), p0.getMediaBrowserCompatCustomActionResultReceiver());
                StringBuilder sb = new StringBuilder();
                sb.append(p0.getMediaBrowserCompatItemReceiver());
                sb.append("_");
                sb.append(p0.getMediaBrowserCompatCustomActionResultReceiver());
                IconCompatParcelizer(p0.getRemoteActionCompatParcelizer(), sb.toString(), new DefaultAnalyticsCollectorExternalSyntheticLambda33.read() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda39.read.RemoteActionCompatParcelizer.4
                    @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda33.read
                    public final void read(File file) {
                        toMagicModuleMetaRepoModel.write(file, "");
                        final DefaultAnalyticsCollectorExternalSyntheticLambda37 defaultAnalyticsCollectorExternalSyntheticLambda37 = DefaultAnalyticsCollectorExternalSyntheticLambda37.INSTANCE.read(file);
                        if (defaultAnalyticsCollectorExternalSyntheticLambda37 != null) {
                            for (final read readVar : p1) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(readVar.getMediaBrowserCompatItemReceiver());
                                sb2.append("_");
                                sb2.append(readVar.getMediaBrowserCompatCustomActionResultReceiver());
                                sb2.append("_rule");
                                String string = sb2.toString();
                                Companion companion = read.INSTANCE;
                                Companion.IconCompatParcelizer(readVar.getRead(), string, new DefaultAnalyticsCollectorExternalSyntheticLambda33.read() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda39.read.RemoteActionCompatParcelizer.4.4
                                    @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda33.read
                                    public final void read(File file2) {
                                        toMagicModuleMetaRepoModel.write(file2, "");
                                        readVar.write(defaultAnalyticsCollectorExternalSyntheticLambda37);
                                        readVar.read(file2);
                                        Runnable runnable = readVar.AudioAttributesCompatParcelizer;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                });
                            }
                        }
                    }
                });
            }

            private static void AudioAttributesCompatParcelizer(String p0, int p1) {
                File[] fileArrListFiles;
                File fileIconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda44.IconCompatParcelizer();
                if (fileIconCompatParcelizer == null || (fileArrListFiles = fileIconCompatParcelizer.listFiles()) == null || fileArrListFiles.length == 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(p0);
                sb.append("_");
                sb.append(p1);
                String string = sb.toString();
                for (File file : fileArrListFiles) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(file, "");
                    String name = file.getName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                    if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, p0) && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, string)) {
                        file.delete();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static void IconCompatParcelizer(String p0, String p1, DefaultAnalyticsCollectorExternalSyntheticLambda33.read p2) {
                File file = new File(DefaultAnalyticsCollectorExternalSyntheticLambda44.IconCompatParcelizer(), p1);
                if (p0 == null || file.exists()) {
                    p2.read(file);
                } else {
                    new DefaultAnalyticsCollectorExternalSyntheticLambda33(p0, file, p2).execute(new String[0]);
                }
            }
        }
    }
}
