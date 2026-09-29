package kotlin;

import com.facebook.GraphRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.getLoadingMediaPeriod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b"}, d2 = {"Lo/onQueueUpdated;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {1, 4, 0})
public final class onQueueUpdated {
    public static final onQueueUpdated INSTANCE = new onQueueUpdated();
    private static final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);

    private onQueueUpdated() {
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer() {
        synchronized (onQueueUpdated.class) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(onQueueUpdated.class)) {
                return;
            }
            try {
                if (RemoteActionCompatParcelizer.getAndSet(true)) {
                    return;
                }
                if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
                    AudioAttributesCompatParcelizer();
                }
                DefaultPlaybackSessionManager.AudioAttributesCompatParcelizer();
                return;
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, onQueueUpdated.class);
                return;
            }
        }
    }

    @getMagicModuleMeta
    private static void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(onQueueUpdated.class)) {
            return;
        }
        try {
            if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.MediaBrowserCompatCustomActionResultReceiver()) {
                return;
            }
            File[] fileArrRemoteActionCompatParcelizer = getReadingMediaPeriod.RemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList(fileArrRemoteActionCompatParcelizer.length);
            for (File file : fileArrRemoteActionCompatParcelizer) {
                arrayList.add(getLoadingMediaPeriod.read.RemoteActionCompatParcelizer(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((getLoadingMediaPeriod) obj).IconCompatParcelizer()) {
                    arrayList2.add(obj);
                }
            }
            final List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList2, (Comparator) new Comparator<getLoadingMediaPeriod>() { // from class: o.onQueueUpdated.4
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final int compare(getLoadingMediaPeriod getloadingmediaperiod, getLoadingMediaPeriod getloadingmediaperiod2) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getloadingmediaperiod2, "");
                    return getloadingmediaperiod.write(getloadingmediaperiod2);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = getQues.IconCompatParcelizer(0, Math.min(listAudioAttributesCompatParcelizer.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listAudioAttributesCompatParcelizer.get(((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer()));
            }
            getReadingMediaPeriod.RemoteActionCompatParcelizer("anr_reports", jSONArray, new GraphRequest.write() { // from class: o.onQueueUpdated.2
                @Override // com.facebook.GraphRequest.write
                public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                    JSONObject audioAttributesImplBaseParcelizer;
                    toMagicModuleMetaRepoModel.write(lambdaonplayererror41, "");
                    try {
                        if (lambdaonplayererror41.getWrite() == null && (audioAttributesImplBaseParcelizer = lambdaonplayererror41.getAudioAttributesImplBaseParcelizer()) != null && audioAttributesImplBaseParcelizer.getBoolean("success")) {
                            Iterator it2 = listAudioAttributesCompatParcelizer.iterator();
                            while (it2.hasNext()) {
                                ((getLoadingMediaPeriod) it2.next()).write();
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, onQueueUpdated.class);
        }
    }
}
