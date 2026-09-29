package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda6;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda9;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002 \u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u00150\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u000e\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006*\u00020#0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda61;", "", "<init>", "()V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda61$AudioAttributesCompatParcelizer;", "p0", "", "write", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda61$AudioAttributesCompatParcelizer;)V", "", "Lorg/json/JSONObject;", "read", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6;", "MediaBrowserCompatCustomActionResultReceiver", "p1", "IconCompatParcelizer", "(Ljava/lang/String;Lorg/json/JSONObject;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6;", "", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6$read;", "(Lorg/json/JSONObject;)Ljava/util/Map;", "AudioAttributesImplApi26Parcelizer", "", "(Ljava/lang/String;Z)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6;", "", "Ljava/util/List;", "Ljava/lang/String;", "Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "RemoteActionCompatParcelizer", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda61$RemoteActionCompatParcelizer;", "AudioAttributesImplApi21Parcelizer", "Ljava/util/concurrent/atomic/AtomicReference;", "MediaBrowserCompatItemReceiver", "Z", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda61 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda6> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private static final AtomicReference<RemoteActionCompatParcelizer> write;
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda61 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda61();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final List<String> read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private static boolean AudioAttributesImplBaseParcelizer;
    private static final ConcurrentLinkedQueue<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final String AudioAttributesCompatParcelizer;

    /* JADX INFO: loaded from: classes2.dex */
    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda61$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public enum RemoteActionCompatParcelizer {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("FetchedAppSettingsManager", "");
        AudioAttributesCompatParcelizer = "FetchedAppSettingsManager";
        read = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"});
        IconCompatParcelizer = new ConcurrentHashMap();
        write = new AtomicReference<>(RemoteActionCompatParcelizer.NOT_LOADED);
        RemoteActionCompatParcelizer = new ConcurrentLinkedQueue<>();
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda61() {
    }

    @getMagicModuleMeta
    public static final void MediaBrowserCompatCustomActionResultReceiver() {
        final Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
        final String strWrite = lambdaonMediaMetadataChanged48.write();
        if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strWrite)) {
            write.set(RemoteActionCompatParcelizer.ERROR);
            INSTANCE.AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (IconCompatParcelizer.containsKey(strWrite)) {
            write.set(RemoteActionCompatParcelizer.SUCCESS);
            INSTANCE.AudioAttributesImplApi26Parcelizer();
            return;
        }
        AtomicReference<RemoteActionCompatParcelizer> atomicReference = write;
        if (!setBackInvokedCallbackEnabled.read(atomicReference, RemoteActionCompatParcelizer.NOT_LOADED, RemoteActionCompatParcelizer.LOADING) && !setBackInvokedCallbackEnabled.read(atomicReference, RemoteActionCompatParcelizer.ERROR, RemoteActionCompatParcelizer.LOADING)) {
            INSTANCE.AudioAttributesImplApi26Parcelizer();
            return;
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strWrite}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda61.2
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = contextAudioAttributesCompatParcelizer.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                        DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6IconCompatParcelizer = null;
                        String string = sharedPreferences.getString(str, null);
                        if (!DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(string)) {
                            if (string == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            try {
                                jSONObject = new JSONObject(string);
                            } catch (JSONException e) {
                                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer("FacebookSDK", e);
                                jSONObject = null;
                            }
                            if (jSONObject != null) {
                                DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda61 = DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE;
                                String str2 = strWrite;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                                defaultAnalyticsCollectorExternalSyntheticLambda6IconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.IconCompatParcelizer(str2, jSONObject);
                            }
                        }
                        DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda612 = DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE;
                        String str3 = strWrite;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                        JSONObject jSONObject2 = DefaultAnalyticsCollectorExternalSyntheticLambda61.read(str3);
                        if (jSONObject2 != null) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda613 = DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE;
                            String str4 = strWrite;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
                            DefaultAnalyticsCollectorExternalSyntheticLambda61.IconCompatParcelizer(str4, jSONObject2);
                            sharedPreferences.edit().putString(str, jSONObject2.toString()).apply();
                        }
                        if (defaultAnalyticsCollectorExternalSyntheticLambda6IconCompatParcelizer != null) {
                            String mediaMetadataCompat = defaultAnalyticsCollectorExternalSyntheticLambda6IconCompatParcelizer.getMediaMetadataCompat();
                            DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda614 = DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE;
                            if (!DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesImplBaseParcelizer && mediaMetadataCompat != null && mediaMetadataCompat.length() > 0) {
                                DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda615 = DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE;
                                DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesImplBaseParcelizer = true;
                                DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda616 = DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE;
                                String unused = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer;
                            }
                        }
                        String str5 = strWrite;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
                        DefaultAnalyticsCollectorExternalSyntheticLambda63.IconCompatParcelizer(str5);
                        DefaultAnalyticsCollectorExternalSyntheticLambda31.IconCompatParcelizer();
                        DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda617 = DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE;
                        AtomicReference atomicReference2 = DefaultAnalyticsCollectorExternalSyntheticLambda61.write;
                        DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda618 = DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE;
                        atomicReference2.set(DefaultAnalyticsCollectorExternalSyntheticLambda61.IconCompatParcelizer.containsKey(strWrite) ? RemoteActionCompatParcelizer.SUCCESS : RemoteActionCompatParcelizer.ERROR);
                        DefaultAnalyticsCollectorExternalSyntheticLambda61.INSTANCE.AudioAttributesImplApi26Parcelizer();
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                } catch (Throwable th2) {
                    getMinWindowSequenceNumber.read(th2, this);
                }
            }
        });
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda6 AudioAttributesCompatParcelizer(String p0) {
        if (p0 != null) {
            return IconCompatParcelizer.get(p0);
        }
        return null;
    }

    @getMagicModuleMeta
    public static final void write(AudioAttributesCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        RemoteActionCompatParcelizer.add(p0);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        synchronized (this) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = write.get();
            if (RemoteActionCompatParcelizer.NOT_LOADED != remoteActionCompatParcelizer && RemoteActionCompatParcelizer.LOADING != remoteActionCompatParcelizer) {
                final DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6 = IconCompatParcelizer.get(lambdaonMediaMetadataChanged48.write());
                Handler handler = new Handler(Looper.getMainLooper());
                if (RemoteActionCompatParcelizer.ERROR == remoteActionCompatParcelizer) {
                    while (true) {
                        ConcurrentLinkedQueue<AudioAttributesCompatParcelizer> concurrentLinkedQueue = RemoteActionCompatParcelizer;
                        if (concurrentLinkedQueue.isEmpty()) {
                            return;
                        }
                        final AudioAttributesCompatParcelizer audioAttributesCompatParcelizerPoll = concurrentLinkedQueue.poll();
                        handler.post(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda61.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                    return;
                                }
                                try {
                                    getMinWindowSequenceNumber.IconCompatParcelizer(this);
                                } catch (Throwable th) {
                                    getMinWindowSequenceNumber.read(th, this);
                                }
                            }
                        });
                    }
                } else {
                    while (true) {
                        ConcurrentLinkedQueue<AudioAttributesCompatParcelizer> concurrentLinkedQueue2 = RemoteActionCompatParcelizer;
                        if (concurrentLinkedQueue2.isEmpty()) {
                            return;
                        }
                        final AudioAttributesCompatParcelizer audioAttributesCompatParcelizerPoll2 = concurrentLinkedQueue2.poll();
                        handler.post(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda61.1
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
                                        audioAttributesCompatParcelizerPoll2.AudioAttributesCompatParcelizer();
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
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda6 AudioAttributesCompatParcelizer(String p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!p1) {
            Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda6> map = IconCompatParcelizer;
            if (map.containsKey(p0)) {
                return map.get(p0);
            }
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda61 defaultAnalyticsCollectorExternalSyntheticLambda61 = INSTANCE;
        JSONObject jSONObject = read(p0);
        if (jSONObject == null) {
            return null;
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6IconCompatParcelizer = IconCompatParcelizer(p0, jSONObject);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) lambdaonMediaMetadataChanged48.write())) {
            write.set(RemoteActionCompatParcelizer.SUCCESS);
            defaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesImplApi26Parcelizer();
        }
        return defaultAnalyticsCollectorExternalSyntheticLambda6IconCompatParcelizer;
    }

    public static DefaultAnalyticsCollectorExternalSyntheticLambda6 IconCompatParcelizer(String p0, JSONObject p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        DefaultAnalyticsCollectorExternalSyntheticLambda55 defaultAnalyticsCollectorExternalSyntheticLambda55Write = DefaultAnalyticsCollectorExternalSyntheticLambda55.INSTANCE.write(p1.optJSONArray("android_sdk_error_categories"));
        if (defaultAnalyticsCollectorExternalSyntheticLambda55Write == null) {
            defaultAnalyticsCollectorExternalSyntheticLambda55Write = DefaultAnalyticsCollectorExternalSyntheticLambda55.INSTANCE.IconCompatParcelizer();
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda55 defaultAnalyticsCollectorExternalSyntheticLambda55 = defaultAnalyticsCollectorExternalSyntheticLambda55Write;
        int iOptInt = p1.optInt("app_events_feature_bitmask", 0);
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        boolean z4 = (iOptInt & 256) != 0;
        boolean z5 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray = p1.optJSONArray("auto_event_mapping_android");
        if (jSONArrayOptJSONArray != null) {
            DefaultAnalyticsCollectorExternalSyntheticLambda66.RemoteActionCompatParcelizer();
        }
        boolean zOptBoolean = p1.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = p1.optString("gdpv4_nux_content", "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
        boolean zOptBoolean2 = p1.optBoolean("gdpv4_nux_enabled", false);
        DefaultAnalyticsCollectorExternalSyntheticLambda30.AudioAttributesCompatParcelizer();
        int iOptInt2 = p1.optInt("app_events_session_timeout", 60);
        DefaultAnalyticsCollectorExternalSyntheticLambda9.Companion companion = DefaultAnalyticsCollectorExternalSyntheticLambda9.INSTANCE;
        EnumSet<DefaultAnalyticsCollectorExternalSyntheticLambda9> enumSetWrite = DefaultAnalyticsCollectorExternalSyntheticLambda9.Companion.write(p1.optLong("seamless_login"));
        Map<String, Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda6.read>> mapIconCompatParcelizer = IconCompatParcelizer(p1.optJSONObject("android_dialog_configs"));
        String strOptString2 = p1.optString("smart_login_bookmark_icon_url");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
        String strOptString3 = p1.optString("smart_login_menu_icon_url");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString3, "");
        String strOptString4 = p1.optString("sdk_update_message");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString4, "");
        DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6 = new DefaultAnalyticsCollectorExternalSyntheticLambda6(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetWrite, mapIconCompatParcelizer, z, defaultAnalyticsCollectorExternalSyntheticLambda55, strOptString2, strOptString3, z2, z3, jSONArrayOptJSONArray, strOptString4, z4, z5, p1.optString("aam_rules"), p1.optString("suggested_events_setting"), p1.optString("restrictive_data_filter_params"));
        IconCompatParcelizer.put(p0, defaultAnalyticsCollectorExternalSyntheticLambda6);
        return defaultAnalyticsCollectorExternalSyntheticLambda6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject read(String p0) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(read);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest.Companion iconCompatParcelizer = GraphRequest.INSTANCE;
        GraphRequest graphRequestIconCompatParcelizer = GraphRequest.Companion.IconCompatParcelizer(null, p0, null);
        graphRequestIconCompatParcelizer.onAddQueueItem();
        graphRequestIconCompatParcelizer.read(bundle);
        JSONObject jSONObject = graphRequestIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getAudioAttributesImplBaseParcelizer();
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    private static Map<String, Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda6.read>> IconCompatParcelizer(JSONObject p0) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (p0 != null && (jSONArrayOptJSONArray = p0.optJSONArray("data")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                DefaultAnalyticsCollectorExternalSyntheticLambda6.read.Companion companion = DefaultAnalyticsCollectorExternalSyntheticLambda6.read.INSTANCE;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectOptJSONObject, "");
                DefaultAnalyticsCollectorExternalSyntheticLambda6.read readVarWrite = companion.write(jSONObjectOptJSONObject);
                if (readVarWrite != null) {
                    String read2 = readVarWrite.getRead();
                    HashMap map2 = (Map) map.get(read2);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(read2, map2);
                    }
                    map2.put(readVarWrite.getIconCompatParcelizer(), readVarWrite);
                }
            }
        }
        return map;
    }
}
