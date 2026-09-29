package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.GraphRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\f\u0010\u0016J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0017J\u000f\u0010\u0011\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda63;", "", "<init>", "()V", "", "p0", "Lorg/json/JSONObject;", "read", "(Ljava/lang/String;)Lorg/json/JSONObject;", "p1", "", "p2", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "(Ljava/lang/String;)Ljava/util/Map;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Long;)Z", "", "IconCompatParcelizer", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda63$read;", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda63$read;)V", "(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "Ljava/util/Map;", "Lo/findCurrentPlayerMediaPeriodInQueue;", "Lo/findCurrentPlayerMediaPeriodInQueue;", "write", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "AudioAttributesImplBaseParcelizer", "Ljava/lang/Long;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda63 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final ConcurrentLinkedQueue<read> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static Long IconCompatParcelizer;
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda63 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda63();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final AtomicBoolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static findCurrentPlayerMediaPeriodInQueue write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final Map<String, JSONObject> AudioAttributesCompatParcelizer;

    public interface read {
        void RemoteActionCompatParcelizer();
    }

    static {
        toMagicModuleMetaDataUcModel.write(DefaultAnalyticsCollectorExternalSyntheticLambda63.class).AudioAttributesImplApi26Parcelizer();
        read = new AtomicBoolean(false);
        RemoteActionCompatParcelizer = new ConcurrentLinkedQueue<>();
        AudioAttributesCompatParcelizer = new ConcurrentHashMap();
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda63() {
    }

    private static void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer((read) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[Catch: all -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0016, B:10:0x001e, B:13:0x0023, B:17:0x0041, B:19:0x0053, B:24:0x0064, B:25:0x006e, B:27:0x0074, B:31:0x007e, B:22:0x005b), top: B:41:0x0005, inners: #0 }] */
    @kotlin.getMagicModuleMeta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(o.DefaultAnalyticsCollectorExternalSyntheticLambda63.read r8) {
        /*
            java.lang.Class<o.DefaultAnalyticsCollectorExternalSyntheticLambda63> r0 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda63.class
            monitor-enter(r0)
            if (r8 == 0) goto La
            java.util.concurrent.ConcurrentLinkedQueue<o.DefaultAnalyticsCollectorExternalSyntheticLambda63$read> r1 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda63.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L8c
            r1.add(r8)     // Catch: java.lang.Throwable -> L8c
        La:
            java.lang.String r8 = kotlin.lambdaonMediaMetadataChanged48.write()     // Catch: java.lang.Throwable -> L8c
            java.lang.Long r1 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda63.IconCompatParcelizer     // Catch: java.lang.Throwable -> L8c
            boolean r1 = RemoteActionCompatParcelizer(r1)     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L23
            java.util.Map<java.lang.String, org.json.JSONObject> r1 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda63.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r1.containsKey(r8)     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L23
            RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)
            return
        L23:
            android.content.Context r1 = kotlin.lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L8c
            o.toMagicModuleStatusUcModel r2 = kotlin.toMagicModuleStatusUcModel.INSTANCE     // Catch: java.lang.Throwable -> L8c
            java.lang.Object[] r2 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            r4 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L41
            monitor-exit(r0)
            return
        L41:
            java.lang.String r3 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            r5 = 0
            android.content.SharedPreferences r3 = r1.getSharedPreferences(r3, r5)     // Catch: java.lang.Throwable -> L8c
            r6 = 0
            java.lang.String r3 = r3.getString(r2, r6)     // Catch: java.lang.Throwable -> L8c
            boolean r7 = kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(r3)     // Catch: java.lang.Throwable -> L8c
            if (r7 != 0) goto L6e
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5a java.lang.Throwable -> L8c
            r7.<init>(r3)     // Catch: org.json.JSONException -> L5a java.lang.Throwable -> L8c
            r6 = r7
            goto L62
        L5a:
            r3 = move-exception
            java.lang.String r7 = "FacebookSDK"
            java.lang.Exception r3 = (java.lang.Exception) r3     // Catch: java.lang.Throwable -> L8c
            kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(r7, r3)     // Catch: java.lang.Throwable -> L8c
        L62:
            if (r6 == 0) goto L6e
            o.DefaultAnalyticsCollectorExternalSyntheticLambda63 r3 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda63.INSTANCE     // Catch: java.lang.Throwable -> L8c
            java.lang.String r7 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8, r7)     // Catch: java.lang.Throwable -> L8c
            r3.IconCompatParcelizer(r8, r6)     // Catch: java.lang.Throwable -> L8c
        L6e:
            java.util.concurrent.Executor r3 = kotlin.lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver()     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto L8a
            java.util.concurrent.atomic.AtomicBoolean r6 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda63.read     // Catch: java.lang.Throwable -> L8c
            boolean r4 = r6.compareAndSet(r5, r4)     // Catch: java.lang.Throwable -> L8c
            if (r4 != 0) goto L7e
            monitor-exit(r0)
            return
        L7e:
            o.DefaultAnalyticsCollectorExternalSyntheticLambda63$1 r4 = new o.DefaultAnalyticsCollectorExternalSyntheticLambda63$1     // Catch: java.lang.Throwable -> L8c
            r4.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L8c
            r3.execute(r4)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)
            return
        L8a:
            monitor-exit(r0)
            return
        L8c:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda63.AudioAttributesCompatParcelizer(o.DefaultAnalyticsCollectorExternalSyntheticLambda63$read):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<read> concurrentLinkedQueue = RemoteActionCompatParcelizer;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final read readVarPoll = concurrentLinkedQueue.poll();
            if (readVarPoll != null) {
                handler.post(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda63.3
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
                                readVarPoll.RemoteActionCompatParcelizer();
                            } catch (Throwable th) {
                                getMinWindowSequenceNumber.read(th, this);
                            }
                        } catch (Throwable th2) {
                            getMinWindowSequenceNumber.read(th2, this);
                        }
                    }
                });
            }
        }
    }

    @getMagicModuleMeta
    public static final JSONObject IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        DefaultAnalyticsCollectorExternalSyntheticLambda63 defaultAnalyticsCollectorExternalSyntheticLambda63 = INSTANCE;
        JSONObject jSONObject = read(str);
        Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        contextAudioAttributesCompatParcelizer.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObject.toString()).apply();
        return defaultAnalyticsCollectorExternalSyntheticLambda63.IconCompatParcelizer(str, jSONObject);
    }

    private static Map<String, Boolean> AudioAttributesCompatParcelizer(String p0) {
        IconCompatParcelizer();
        if (p0 != null) {
            Map<String, JSONObject> map = AudioAttributesCompatParcelizer;
            if (map.containsKey(p0)) {
                findCurrentPlayerMediaPeriodInQueue findcurrentplayermediaperiodinqueue = write;
                List<addTimelineForMediaPeriodId> listWrite = findcurrentplayermediaperiodinqueue != null ? findcurrentplayermediaperiodinqueue.write(p0) : null;
                if (listWrite != null) {
                    HashMap map2 = new HashMap();
                    for (addTimelineForMediaPeriodId addtimelineformediaperiodid : listWrite) {
                        map2.put(addtimelineformediaperiodid.AudioAttributesCompatParcelizer(), Boolean.valueOf(addtimelineformediaperiodid.write()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = map.get(p0);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                    map3.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                findCurrentPlayerMediaPeriodInQueue findcurrentplayermediaperiodinqueue2 = write;
                if (findcurrentplayermediaperiodinqueue2 == null) {
                    findcurrentplayermediaperiodinqueue2 = new findCurrentPlayerMediaPeriodInQueue();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new addTimelineForMediaPeriodId((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                findcurrentplayermediaperiodinqueue2.IconCompatParcelizer(p0, arrayList);
                write = findcurrentplayermediaperiodinqueue2;
                return map3;
            }
        }
        return new HashMap();
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer(String p0, String p1, boolean p2) {
        Boolean bool;
        toMagicModuleMetaRepoModel.write(p0, "");
        Map<String, Boolean> mapAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p1);
        return (!mapAudioAttributesCompatParcelizer.containsKey(p0) || (bool = mapAudioAttributesCompatParcelizer.get(p0)) == null) ? p2 : bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject read(String p0) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", LogSubCategory.LifeCycle.ANDROID);
        bundle.putString("sdk_version", lambdaonMediaMetadataChanged48.RatingCompat());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.Companion iconCompatParcelizer = GraphRequest.INSTANCE;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{p0, "mobile_sdk_gk"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        GraphRequest graphRequestIconCompatParcelizer = GraphRequest.Companion.IconCompatParcelizer(null, str, null);
        graphRequestIconCompatParcelizer.onAddQueueItem();
        graphRequestIconCompatParcelizer.read(bundle);
        JSONObject jSONObject = graphRequestIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getAudioAttributesImplBaseParcelizer();
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    public final JSONObject IconCompatParcelizer(String p0, JSONObject p1) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            jSONObject = AudioAttributesCompatParcelizer.get(p0);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (p1 == null || (jSONArrayOptJSONArray = p1.optJSONArray("data")) == null || (jSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                    jSONObject.put(jSONObject3.getString("key"), jSONObject3.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                } catch (JSONException e) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer("FacebookSDK", e);
                }
            }
            AudioAttributesCompatParcelizer.put(p0, jSONObject);
        }
        return jSONObject;
    }

    private static boolean RemoteActionCompatParcelizer(Long p0) {
        return p0 != null && System.currentTimeMillis() - p0.longValue() < 3600000;
    }
}
