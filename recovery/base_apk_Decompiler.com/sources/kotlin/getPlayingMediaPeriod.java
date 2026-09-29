package kotlin;

import com.facebook.GraphRequest;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.getLoadingMediaPeriod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getPlayingMediaPeriod;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "p0", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "Ljava/lang/Thread;", "", "p1", "", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "write", "Ljava/lang/Thread$UncaughtExceptionHandler;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class getPlayingMediaPeriod implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String IconCompatParcelizer = getPlayingMediaPeriod.class.getCanonicalName();
    private static getPlayingMediaPeriod RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Thread.UncaughtExceptionHandler RemoteActionCompatParcelizer;

    public /* synthetic */ getPlayingMediaPeriod(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(uncaughtExceptionHandler);
    }

    private getPlayingMediaPeriod(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.RemoteActionCompatParcelizer = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread p0, Throwable p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (getReadingMediaPeriod.write(p1)) {
            isMatchingMediaPeriod.read(p1);
            getLoadingMediaPeriod.read.read(p1, getLoadingMediaPeriod.IconCompatParcelizer.CrashReport).AudioAttributesCompatParcelizer();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.RemoteActionCompatParcelizer;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(p0, p1);
        }
    }

    /* JADX INFO: renamed from: o.getPlayingMediaPeriod$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getPlayingMediaPeriod$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "", "Ljava/lang/String;", "write", "Lo/getPlayingMediaPeriod;", "RemoteActionCompatParcelizer", "Lo/getPlayingMediaPeriod;", "read"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public final void AudioAttributesCompatParcelizer() {
            synchronized (this) {
                if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
                    Companion companion = this;
                    IconCompatParcelizer();
                }
                if (getPlayingMediaPeriod.RemoteActionCompatParcelizer != null) {
                    String unused = getPlayingMediaPeriod.IconCompatParcelizer;
                } else {
                    getPlayingMediaPeriod.RemoteActionCompatParcelizer = new getPlayingMediaPeriod(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(getPlayingMediaPeriod.RemoteActionCompatParcelizer);
                }
            }
        }

        private static void IconCompatParcelizer() {
            if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.MediaBrowserCompatCustomActionResultReceiver()) {
                return;
            }
            File[] fileArrIconCompatParcelizer = getReadingMediaPeriod.IconCompatParcelizer();
            ArrayList arrayList = new ArrayList(fileArrIconCompatParcelizer.length);
            for (File file : fileArrIconCompatParcelizer) {
                arrayList.add(getLoadingMediaPeriod.read.RemoteActionCompatParcelizer(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((getLoadingMediaPeriod) obj).IconCompatParcelizer()) {
                    arrayList2.add(obj);
                }
            }
            final List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList2, (Comparator) new Comparator<getLoadingMediaPeriod>() { // from class: o.getPlayingMediaPeriod.AudioAttributesCompatParcelizer.5
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
            getReadingMediaPeriod.RemoteActionCompatParcelizer("crash_reports", jSONArray, new GraphRequest.write() { // from class: o.getPlayingMediaPeriod.AudioAttributesCompatParcelizer.2
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
        }
    }
}
