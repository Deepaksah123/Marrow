package kotlin;

import com.facebook.GraphRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58;
import kotlin.Metadata;
import kotlin.getLoadingMediaPeriod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lo/isMatchingMediaPeriod;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "", "p0", "read", "(Ljava/lang/Throwable;)V", "AudioAttributesCompatParcelizer", "", "IconCompatParcelizer", "Z", "write"}, k = 1, mv = {1, 4, 0})
public final class isMatchingMediaPeriod {
    public static final isMatchingMediaPeriod INSTANCE = new isMatchingMediaPeriod();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static boolean write;

    private isMatchingMediaPeriod() {
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer() {
        write = true;
        if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            AudioAttributesCompatParcelizer();
        }
    }

    @getMagicModuleMeta
    public static final void read(Throwable p0) {
        if (!write || p0 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = p0.getStackTrace();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stackTrace, "");
        for (StackTraceElement stackTraceElement : stackTrace) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stackTraceElement, "");
            String className = stackTraceElement.getClassName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(className, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(className);
            if (remoteActionCompatParcelizerIconCompatParcelizer != DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.Unknown) {
                DefaultAnalyticsCollectorExternalSyntheticLambda58.read(remoteActionCompatParcelizerIconCompatParcelizer);
                hashSet.add(remoteActionCompatParcelizerIconCompatParcelizer.toString());
            }
        }
        if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            HashSet hashSet2 = hashSet;
            if (hashSet2.isEmpty()) {
                return;
            }
            getLoadingMediaPeriod.read.write(new JSONArray((Collection) hashSet2)).AudioAttributesCompatParcelizer();
        }
    }

    private static void AudioAttributesCompatParcelizer() {
        if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        File[] fileArrAudioAttributesCompatParcelizer = getReadingMediaPeriod.AudioAttributesCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrAudioAttributesCompatParcelizer) {
            final getLoadingMediaPeriod getloadingmediaperiodRemoteActionCompatParcelizer = getLoadingMediaPeriod.read.RemoteActionCompatParcelizer(file);
            if (getloadingmediaperiodRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", getloadingmediaperiodRemoteActionCompatParcelizer.toString());
                    GraphRequest.Companion iconCompatParcelizer = GraphRequest.INSTANCE;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{lambdaonMediaMetadataChanged48.write()}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                    arrayList.add(GraphRequest.Companion.AudioAttributesCompatParcelizer(null, str, jSONObject, new GraphRequest.write() { // from class: o.isMatchingMediaPeriod.5
                        @Override // com.facebook.GraphRequest.write
                        public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                            JSONObject jSONObject2;
                            toMagicModuleMetaRepoModel.write(lambdaonplayererror41, "");
                            try {
                                if (lambdaonplayererror41.getWrite() == null && (jSONObject2 = lambdaonplayererror41.getAudioAttributesImplBaseParcelizer()) != null && jSONObject2.getBoolean("success")) {
                                    getloadingmediaperiodRemoteActionCompatParcelizer.write();
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new lambdaonPlaybackSuppressionReasonChanged37(arrayList).read();
    }
}
