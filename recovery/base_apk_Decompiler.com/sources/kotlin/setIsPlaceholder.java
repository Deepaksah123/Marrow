package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.access6000;
import kotlin.getTestPattern;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ¯\u0001\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u00152-\u0010\u0019\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00130\u001a2-\u0010 \u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00130\u001a2-\u0010!\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00130\u001aH\u0016J$\u0010\"\u001a\u00020\u00132\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\u00132\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0018H\u0016J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0018H\u0016JW\u0010+\u001a\u00020\u00132\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\b\b\u0002\u0010-\u001a\u00020.2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0017002#\b\u0002\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020.0\u001aH\u0002J\u0016\u00103\u001a\u00020\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015H\u0002J\b\u00105\u001a\u00020\u0013H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/repo/FileResourcesRepoImpl;", "Lcom/clevertap/android/sdk/inapp/images/repo/FileResourcesRepo;", "cleanupStrategy", "Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "preloaderStrategy", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "inAppAssetsStore", "Lcom/clevertap/android/sdk/inapp/store/preference/InAppAssetsStore;", "fileStore", "Lcom/clevertap/android/sdk/inapp/store/preference/FileStore;", "legacyInAppsStore", "Lcom/clevertap/android/sdk/inapp/store/preference/LegacyInAppStore;", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;Lcom/clevertap/android/sdk/inapp/store/preference/InAppAssetsStore;Lcom/clevertap/android/sdk/inapp/store/preference/FileStore;Lcom/clevertap/android/sdk/inapp/store/preference/LegacyInAppStore;)V", "getCleanupStrategy", "()Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "getPreloaderStrategy", "()Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "preloadFilesAndCache", "", "urlMeta", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "completionCallback", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "name", "urlStatusMap", "successBlock", "failureBlock", "updateRepoStatus", "meta", "downloadState", "Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "cleanupStaleFiles", "urls", "cleanupExpiredResources", "cacheTpe", "cleanupAllResources", "cleanupStaleFilesNow", "validUrls", "currentTime", "", "allFileUrls", "", "expiryTs", "url", "cleanupAllFiles", "cleanupUrls", "repoUpdated", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setIsPlaceholder implements access6000 {
    private static final HashMap<String, access5800> AudioAttributesCompatParcelizer;
    private static final long IconCompatParcelizer;
    private static final Object RemoteActionCompatParcelizer;
    private static final Set<access5700> read;
    public static final write write = new write(null);
    private final setWindowStartTimeMs AudioAttributesImplApi21Parcelizer;
    private final access5600 AudioAttributesImplApi26Parcelizer;
    private final access6700 AudioAttributesImplBaseParcelizer;
    private final SimpleBasePlayerExternalSyntheticLambda58 MediaBrowserCompatCustomActionResultReceiver;
    private final setUid MediaBrowserCompatItemReceiver;

    public setIsPlaceholder(SimpleBasePlayerExternalSyntheticLambda58 simpleBasePlayerExternalSyntheticLambda58, access5600 access5600Var, setUid setuid, setWindowStartTimeMs setwindowstarttimems, access6700 access6700Var) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda58, "");
        toMagicModuleMetaRepoModel.write(access5600Var, "");
        toMagicModuleMetaRepoModel.write(setuid, "");
        toMagicModuleMetaRepoModel.write(setwindowstarttimems, "");
        toMagicModuleMetaRepoModel.write(access6700Var, "");
        this.MediaBrowserCompatCustomActionResultReceiver = simpleBasePlayerExternalSyntheticLambda58;
        this.AudioAttributesImplApi26Parcelizer = access5600Var;
        this.MediaBrowserCompatItemReceiver = setuid;
        this.AudioAttributesImplApi21Parcelizer = setwindowstarttimems;
        this.AudioAttributesImplBaseParcelizer = access6700Var;
    }

    public final void RemoteActionCompatParcelizer(List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list) {
        access6000.read.write(this, list);
    }

    public final void write(List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list, getAnswerMap<? super Map<String, Boolean>, getShowPopup> getanswermap) {
        access6000.read.RemoteActionCompatParcelizer(this, list, getanswermap);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    private SimpleBasePlayerExternalSyntheticLambda58 getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    private access5600 getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a"}, d2 = {"Lo/setIsPlaceholder$write;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "Lo/lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer;", "p0", "Lo/setWindowStartTimeMs;", "Lo/setUid;", "p1", "", "RemoteActionCompatParcelizer", "(Lo/getSubscriptionExpiresOn;Lo/getSubscriptionExpiresOn;)V", "", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "", "Lo/access5700;", "read", "Ljava/util/Set;", "write", "Ljava/util/HashMap;", "Lo/access5800;", "Ljava/util/HashMap;", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {

        public final /* synthetic */ class AudioAttributesCompatParcelizer {
            public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

            static {
                int[] iArr = new int[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.values().length];
                try {
                    iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.read.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                RemoteActionCompatParcelizer = iArr;
            }
        }

        private write() {
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer(Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer> p0, Pair<setWindowStartTimeMs, setUid> p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            String strWrite = p0.write();
            long jCurrentTimeMillis = System.currentTimeMillis() + setIsPlaceholder.IconCompatParcelizer;
            setWindowStartTimeMs setwindowstarttimemsWrite = p1.write();
            setUid setuidIconCompatParcelizer = p1.IconCompatParcelizer();
            int i = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer[p0.IconCompatParcelizer().ordinal()];
            if (i == 1 || i == 2) {
                setuidIconCompatParcelizer.write(strWrite, jCurrentTimeMillis);
                setwindowstarttimemsWrite.AudioAttributesCompatParcelizer(strWrite, jCurrentTimeMillis);
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                setwindowstarttimemsWrite.AudioAttributesCompatParcelizer(strWrite, jCurrentTimeMillis);
            }
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
        IconCompatParcelizer = getTestPattern.read(getUserSubmissionTimestamp.IconCompatParcelizer(14, isAnonymous.write));
        read = new LinkedHashSet();
        AudioAttributesCompatParcelizer = new HashMap<>();
        RemoteActionCompatParcelizer = new Object();
    }

    @Override // kotlin.access6000
    public final void AudioAttributesCompatParcelizer(List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list, getAnswerMap<? super Map<String, Boolean>, getShowPopup> getanswermap, final getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap2, final getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap3) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        getAudioAttributesImplApi26Parcelizer().write(list, new getAnswerMap() { // from class: o.setPeriods
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setIsPlaceholder.read(this.AudioAttributesCompatParcelizer, getanswermap2, (Pair) obj);
            }
        }, new getAnswerMap() { // from class: o.setIsSeekable
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setIsPlaceholder.IconCompatParcelizer(this.IconCompatParcelizer, getanswermap3, (Pair) obj);
            }
        }, new getAnswerMap() { // from class: o.setPresentationStartTimeMs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setIsPlaceholder.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (Pair) obj);
            }
        }, getanswermap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setIsPlaceholder setisplaceholder, getAnswerMap getanswermap, Pair pair) {
        toMagicModuleMetaRepoModel.write(setisplaceholder, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(pair, "");
        write.RemoteActionCompatParcelizer(pair, new Pair(setisplaceholder.AudioAttributesImplApi21Parcelizer, setisplaceholder.MediaBrowserCompatItemReceiver));
        write((Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>) pair, access5800.AudioAttributesCompatParcelizer);
        getanswermap.invoke(pair);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setIsPlaceholder setisplaceholder, getAnswerMap getanswermap, Pair pair) {
        toMagicModuleMetaRepoModel.write(setisplaceholder, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(pair, "");
        write((Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>) pair, access5800.RemoteActionCompatParcelizer);
        getanswermap.invoke(pair);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setIsPlaceholder setisplaceholder, Pair pair) {
        toMagicModuleMetaRepoModel.write(setisplaceholder, "");
        toMagicModuleMetaRepoModel.write(pair, "");
        write((Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>) pair, access5800.write);
        return getShowPopup.INSTANCE;
    }

    private static void write(Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer> pair, access5800 access5800Var) {
        if (read.isEmpty()) {
            return;
        }
        synchronized (RemoteActionCompatParcelizer) {
            AudioAttributesCompatParcelizer.put(pair.write(), access5800Var);
            read();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void IconCompatParcelizer(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.AudioAttributesImplBaseParcelizer.write() < IconCompatParcelizer) {
            return;
        }
        read(this, list, jCurrentTimeMillis);
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(jCurrentTimeMillis);
    }

    private static /* synthetic */ void read(final setIsPlaceholder setisplaceholder, List list, long j) {
        setisplaceholder.AudioAttributesCompatParcelizer((List<String>) list, j, getKycMessage.RemoteActionCompatParcelizer(setisplaceholder.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), setisplaceholder.MediaBrowserCompatItemReceiver.read()), new getAnswerMap() { // from class: o.setPositionInFirstPeriodUs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Long.valueOf(setIsPlaceholder.RemoteActionCompatParcelizer(this.write, (String) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long RemoteActionCompatParcelizer(setIsPlaceholder setisplaceholder, String str) {
        toMagicModuleMetaRepoModel.write(setisplaceholder, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return Math.max(setisplaceholder.AudioAttributesImplApi21Parcelizer.write(str), setisplaceholder.MediaBrowserCompatItemReceiver.write(str));
    }

    private final void AudioAttributesCompatParcelizer(List<String> list, long j, Set<String> set, getAnswerMap<? super String, Long> getanswermap) {
        List<String> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(obj, (String) obj);
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        Set setOnPlayFromMediaId = IntermediateLoginResponseBody.onPlayFromMediaId(set);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setOnPlayFromMediaId) {
            String str = (String) obj2;
            boolean zContainsKey = linkedHashMap2.containsKey(str);
            boolean z = j > getanswermap.invoke(str).longValue();
            if (!zContainsKey && z) {
                arrayList.add(obj2);
            }
        }
        write(arrayList);
    }

    private final void write(List<String> list) {
        getMediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(list, new getAnswerMap() { // from class: o.setIsDynamic
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setIsPlaceholder.read(this.IconCompatParcelizer, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setIsPlaceholder setisplaceholder, String str) {
        toMagicModuleMetaRepoModel.write(setisplaceholder, "");
        toMagicModuleMetaRepoModel.write(str, "");
        setisplaceholder.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(str);
        setisplaceholder.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(str);
        return getShowPopup.INSTANCE;
    }

    private static void read() {
        for (access5700 access5700Var : read) {
            List<String> list = access5700Var.read();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    HashMap<String, access5800> map = AudioAttributesCompatParcelizer;
                    if (map.get(str) == access5800.AudioAttributesCompatParcelizer || map.get(str) == access5800.RemoteActionCompatParcelizer) {
                    }
                }
            }
            access5700Var.RemoteActionCompatParcelizer().invoke();
        }
    }
}
