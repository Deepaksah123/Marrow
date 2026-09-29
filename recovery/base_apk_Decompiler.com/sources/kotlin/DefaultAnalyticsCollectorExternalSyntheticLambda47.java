package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\u000eJ-\u0010\u0010\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000f2\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda47;", "", "<init>", "()V", "", "IconCompatParcelizer", "", "p0", "p1", "read", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "", "(Ljava/lang/String;)Z", "(Ljava/lang/String;)Ljava/lang/String;", "", "write", "(Ljava/util/Map;Ljava/lang/String;)V", "Z", "", "AudioAttributesCompatParcelizer", "Ljava/util/Set;", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda47$IconCompatParcelizer;", "Ljava/util/List;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda47 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static boolean IconCompatParcelizer;
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda47 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda47();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final List<IconCompatParcelizer> RemoteActionCompatParcelizer = new ArrayList();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final Set<String> write = new CopyOnWriteArraySet();

    private DefaultAnalyticsCollectorExternalSyntheticLambda47() {
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda47.class)) {
            return;
        }
        try {
            IconCompatParcelizer = true;
            INSTANCE.RemoteActionCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda47.class);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        String mediaDescriptionCompat;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            String strWrite = lambdaonMediaMetadataChanged48.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(strWrite, false);
            if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer == null || (mediaDescriptionCompat = defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getMediaDescriptionCompat()) == null || mediaDescriptionCompat.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(mediaDescriptionCompat);
            RemoteActionCompatParcelizer.clear();
            write.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                    IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(next, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        iconCompatParcelizer.read(DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(jSONObjectOptJSONObject));
                        RemoteActionCompatParcelizer.add(iconCompatParcelizer);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        write.add(iconCompatParcelizer.read());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    @getMagicModuleMeta
    public static final String IconCompatParcelizer(String p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda47.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            return IconCompatParcelizer ? INSTANCE.RemoteActionCompatParcelizer(p0) ? "_removed_" : p0 : p0;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda47.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void write(Map<String, String> p0, String p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda47.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (IconCompatParcelizer) {
                HashMap map = new HashMap();
                for (String str : new ArrayList(p0.keySet())) {
                    String str2 = INSTANCE.read(p1, str);
                    if (str2 != null) {
                        map.put(str, str2);
                        p0.remove(str);
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    p0.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda47.class);
        }
    }

    private final String read(String p0, String p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            try {
            } catch (Exception e) {
                Exception exc = e;
            }
            for (IconCompatParcelizer iconCompatParcelizer : new ArrayList(RemoteActionCompatParcelizer)) {
                if (iconCompatParcelizer != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) iconCompatParcelizer.read())) {
                    for (String str : iconCompatParcelizer.AudioAttributesCompatParcelizer().keySet()) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p1, (Object) str)) {
                            return iconCompatParcelizer.AudioAttributesCompatParcelizer().get(str);
                        }
                        return null;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    private final boolean RemoteActionCompatParcelizer(String p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return false;
        }
        try {
            return write.contains(p0);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return false;
        }
    }

    public static final class IconCompatParcelizer {
        private String RemoteActionCompatParcelizer;
        private Map<String, String> write;

        public IconCompatParcelizer(String str, Map<String, String> map) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(map, "");
            this.RemoteActionCompatParcelizer = str;
            this.write = map;
        }

        public final Map<String, String> AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void read(Map<String, String> map) {
            toMagicModuleMetaRepoModel.write(map, "");
            this.write = map;
        }
    }
}
