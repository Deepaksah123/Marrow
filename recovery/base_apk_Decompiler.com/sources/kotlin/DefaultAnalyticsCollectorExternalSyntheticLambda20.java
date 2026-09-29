package kotlin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J-\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0005\u0010\u000bJ\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda20;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "", "", "p0", "p1", "(Ljava/util/Map;Ljava/lang/String;)V", "", "Lo/lambdaonUpstreamDiscarded27;", "(Ljava/util/List;)V", "", "write", "Ljava/util/Set;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda20$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "Ljava/util/List;", "", "read", "Z"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda20 {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static boolean RemoteActionCompatParcelizer;
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda20 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda20();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final List<AudioAttributesCompatParcelizer> write = new ArrayList();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final Set<String> AudioAttributesCompatParcelizer = new HashSet();

    private DefaultAnalyticsCollectorExternalSyntheticLambda20() {
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda20.class)) {
            return;
        }
        try {
            RemoteActionCompatParcelizer = true;
            INSTANCE.AudioAttributesCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda20.class);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                String strWrite = lambdaonMediaMetadataChanged48.write();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
                DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(strWrite, false);
                if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer == null) {
                    return;
                }
                String mediaDescriptionCompat = defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getMediaDescriptionCompat();
                if (mediaDescriptionCompat != null && mediaDescriptionCompat.length() > 0) {
                    JSONObject jSONObject = new JSONObject(mediaDescriptionCompat);
                    write.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                Set<String> set = AudioAttributesCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                                set.add(next);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(next, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    audioAttributesCompatParcelizer.read(DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(jSONArrayOptJSONArray));
                                }
                                write.add(audioAttributesCompatParcelizer);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
            }
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(List<lambdaonUpstreamDiscarded27> p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda20.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (RemoteActionCompatParcelizer) {
                Iterator<lambdaonUpstreamDiscarded27> it = p0.iterator();
                while (it.hasNext()) {
                    if (AudioAttributesCompatParcelizer.contains(it.next().getAudioAttributesImplApi26Parcelizer())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda20.class);
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Map<String, String> p0, String p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda20.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (RemoteActionCompatParcelizer) {
                ArrayList<String> arrayList = new ArrayList(p0.keySet());
                for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : new ArrayList(write)) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), (Object) p1)) {
                        for (String str : arrayList) {
                            if (audioAttributesCompatParcelizer.IconCompatParcelizer().contains(str)) {
                                p0.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda20.class);
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        private String IconCompatParcelizer;
        private List<String> RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(String str, List<String> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = list;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final List<String> IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void read(List<String> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.RemoteActionCompatParcelizer = list;
        }
    }
}
