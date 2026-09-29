package kotlin;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class getPeriodPosition {
    private final CleverTapInstanceConfig AudioAttributesImplApi26Parcelizer;
    private final addAllCommands AudioAttributesImplBaseParcelizer;
    final AnalyticsListenerEventTime IconCompatParcelizer;
    private final copyWithPlaceholderTimeline MediaBrowserCompatCustomActionResultReceiver;
    private final Context MediaBrowserCompatItemReceiver;

    @Deprecated
    private final generateUnshuffledIndices RatingCompat;
    private final PlayerCommandsExternalSyntheticLambda0 RemoteActionCompatParcelizer;

    @Deprecated
    final Map<String, String> AudioAttributesCompatParcelizer = Collections.synchronizedMap(new HashMap());

    @Deprecated
    final Map<String, String> read = Collections.synchronizedMap(new HashMap());
    AtomicBoolean write = new AtomicBoolean(false);
    private final AtomicBoolean AudioAttributesImplApi21Parcelizer = new AtomicBoolean(false);
    private final Map<String, String> MediaBrowserCompatSearchResultReceiver = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: loaded from: classes2.dex */
    enum RemoteActionCompatParcelizer {
        INIT,
        FETCHED,
        ACTIVATED
    }

    private void RemoteActionCompatParcelizer() {
    }

    @Deprecated
    getPeriodPosition(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, PlayerCommandsExternalSyntheticLambda0 playerCommandsExternalSyntheticLambda0, copyWithPlaceholderTimeline copywithplaceholdertimeline, addAllCommands addallcommands, generateUnshuffledIndices generateunshuffledindices, AnalyticsListenerEventTime analyticsListenerEventTime) {
        this.MediaBrowserCompatItemReceiver = context;
        this.AudioAttributesImplApi26Parcelizer = cleverTapInstanceConfig;
        this.MediaBrowserCompatCustomActionResultReceiver = copywithplaceholdertimeline;
        this.AudioAttributesImplBaseParcelizer = addallcommands;
        this.RemoteActionCompatParcelizer = playerCommandsExternalSyntheticLambda0;
        this.RatingCompat = generateunshuffledindices;
        this.IconCompatParcelizer = analyticsListenerEventTime;
        AudioAttributesImplApi26Parcelizer();
    }

    @Deprecated
    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (TextUtils.isEmpty(this.RatingCompat.AudioAttributesCompatParcelizer())) {
            return;
        }
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer().RemoteActionCompatParcelizer(new TracksGroupExternalSyntheticLambda0<Void>() { // from class: o.getPeriodPosition.2
            @Override // kotlin.TracksGroupExternalSyntheticLambda0
            public final /* synthetic */ void read(Void r1) {
                IconCompatParcelizer();
            }

            private void IconCompatParcelizer() {
                getPeriodPosition.this.write(RemoteActionCompatParcelizer.ACTIVATED);
            }
        }).read("activateProductConfigs", new Callable<Void>() { // from class: o.getPeriodPosition.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() {
                synchronized (this) {
                    try {
                        HashMap map = new HashMap();
                        if (!getPeriodPosition.this.MediaBrowserCompatSearchResultReceiver.isEmpty()) {
                            map.putAll(getPeriodPosition.this.MediaBrowserCompatSearchResultReceiver);
                            getPeriodPosition.this.MediaBrowserCompatSearchResultReceiver.clear();
                        } else {
                            getPeriodPosition getperiodposition = getPeriodPosition.this;
                            map = getperiodposition.RemoteActionCompatParcelizer(getperiodposition.write());
                        }
                        getPeriodPosition.this.AudioAttributesCompatParcelizer.clear();
                        if (!getPeriodPosition.this.read.isEmpty()) {
                            getPeriodPosition.this.AudioAttributesCompatParcelizer.putAll(getPeriodPosition.this.read);
                        }
                        getPeriodPosition.this.AudioAttributesCompatParcelizer.putAll(map);
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = getPeriodPosition.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                        String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(getPeriodPosition.this.AudioAttributesImplApi26Parcelizer);
                        StringBuilder sb = new StringBuilder("Activated successfully with configs: ");
                        sb.append(getPeriodPosition.this.AudioAttributesCompatParcelizer);
                        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = getPeriodPosition.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                        String strRemoteActionCompatParcelizer2 = getPeriodPositionUs.RemoteActionCompatParcelizer(getPeriodPosition.this.AudioAttributesImplApi26Parcelizer);
                        StringBuilder sb2 = new StringBuilder("Activate failed: ");
                        sb2.append(e.getLocalizedMessage());
                        rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strRemoteActionCompatParcelizer2, sb2.toString());
                    }
                }
                return null;
            }
        });
    }

    @Deprecated
    private boolean AudioAttributesImplApi21Parcelizer() {
        return this.write.get();
    }

    @Deprecated
    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.compareAndSet(true, false);
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver().write(getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer), "Fetch Failed");
    }

    @Deprecated
    public final void read(JSONObject jSONObject) {
        if (TextUtils.isEmpty(this.RatingCompat.AudioAttributesCompatParcelizer())) {
            return;
        }
        synchronized (this) {
            if (jSONObject != null) {
                try {
                    IconCompatParcelizer(jSONObject);
                    this.IconCompatParcelizer.read(AudioAttributesImplBaseParcelizer(), "activated.json", new JSONObject(this.MediaBrowserCompatSearchResultReceiver));
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                    String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                    StringBuilder sb = new StringBuilder("Fetch file-[");
                    sb.append(write());
                    sb.append("] write success: ");
                    sb.append(this.MediaBrowserCompatSearchResultReceiver);
                    rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                    TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer).write().read("sendPCFetchSuccessCallback", new Callable<Void>() { // from class: o.getPeriodPosition.4
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // java.util.concurrent.Callable
                        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                        public Void call() {
                            getPeriodPosition.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver().write(getPeriodPositionUs.RemoteActionCompatParcelizer(getPeriodPosition.this.AudioAttributesImplApi26Parcelizer), "Product Config: fetch Success");
                            getPeriodPosition.this.write(RemoteActionCompatParcelizer.FETCHED);
                            return null;
                        }
                    });
                    if (this.AudioAttributesImplApi21Parcelizer.getAndSet(false)) {
                        MediaBrowserCompatCustomActionResultReceiver();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver().write(getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer), "Product Config: fetch Failed");
                    write(RemoteActionCompatParcelizer.FETCHED);
                    this.AudioAttributesImplApi21Parcelizer.compareAndSet(true, false);
                }
            }
        }
    }

    @Deprecated
    public final void IconCompatParcelizer() {
        this.RatingCompat.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    @Deprecated
    public final void RemoteActionCompatParcelizer(JSONObject jSONObject) {
        this.RatingCompat.IconCompatParcelizer(jSONObject);
    }

    @Deprecated
    public final void write(String str) {
        if (AudioAttributesImplApi21Parcelizer() || TextUtils.isEmpty(str)) {
            return;
        }
        this.RatingCompat.IconCompatParcelizer(str);
        AudioAttributesImplApi26Parcelizer();
    }

    final String write() {
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesImplBaseParcelizer());
        sb.append("/activated.json");
        return sb.toString();
    }

    private String AudioAttributesImplBaseParcelizer() {
        StringBuilder sb = new StringBuilder("Product_Config_");
        sb.append(this.AudioAttributesImplApi26Parcelizer.write());
        sb.append("_");
        sb.append(this.RatingCompat.AudioAttributesCompatParcelizer());
        return sb.toString();
    }

    @Deprecated
    public final generateUnshuffledIndices read() {
        return this.RatingCompat;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (TextUtils.isEmpty(this.RatingCompat.AudioAttributesCompatParcelizer())) {
            return;
        }
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer().RemoteActionCompatParcelizer(new TracksGroupExternalSyntheticLambda0<Boolean>() { // from class: o.getPeriodPosition.5
            @Override // kotlin.TracksGroupExternalSyntheticLambda0
            public final /* synthetic */ void read(Boolean bool) {
                AudioAttributesCompatParcelizer();
            }

            private void AudioAttributesCompatParcelizer() {
                getPeriodPosition.this.write(RemoteActionCompatParcelizer.INIT);
            }
        }).read("ProductConfig#initAsync", new Callable<Boolean>() { // from class: o.getPeriodPosition.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                synchronized (this) {
                    try {
                        try {
                            if (!getPeriodPosition.this.read.isEmpty()) {
                                getPeriodPosition.this.AudioAttributesCompatParcelizer.putAll(getPeriodPosition.this.read);
                            }
                            getPeriodPosition getperiodposition = getPeriodPosition.this;
                            HashMap mapRemoteActionCompatParcelizer = getperiodposition.RemoteActionCompatParcelizer(getperiodposition.write());
                            if (!mapRemoteActionCompatParcelizer.isEmpty()) {
                                getPeriodPosition.this.MediaBrowserCompatSearchResultReceiver.putAll(mapRemoteActionCompatParcelizer);
                            }
                            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = getPeriodPosition.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                            String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(getPeriodPosition.this.AudioAttributesImplApi26Parcelizer);
                            StringBuilder sb = new StringBuilder("Loaded configs ready to be applied: ");
                            sb.append(getPeriodPosition.this.MediaBrowserCompatSearchResultReceiver);
                            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                            getPeriodPosition.this.RatingCompat.read(getPeriodPosition.this.IconCompatParcelizer);
                            getPeriodPosition.this.write.set(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = getPeriodPosition.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                            String strRemoteActionCompatParcelizer2 = getPeriodPositionUs.RemoteActionCompatParcelizer(getPeriodPosition.this.AudioAttributesImplApi26Parcelizer);
                            StringBuilder sb2 = new StringBuilder("InitAsync failed - ");
                            sb2.append(e.getLocalizedMessage());
                            rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strRemoteActionCompatParcelizer2, sb2.toString());
                            return Boolean.FALSE;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Boolean.TRUE;
            }
        });
    }

    private HashMap<String, String> write(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("kv");
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                        if (jSONObject2 != null) {
                            String string = jSONObject2.getString("n");
                            String string2 = jSONObject2.getString("v");
                            if (!TextUtils.isEmpty(string)) {
                                map.put(string, string2);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                        String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                        StringBuilder sb = new StringBuilder("ConvertServerJsonToMap failed: ");
                        sb.append(e.getLocalizedMessage());
                        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
                    }
                }
            }
            return map;
        } catch (JSONException e2) {
            e2.printStackTrace();
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
            String strRemoteActionCompatParcelizer2 = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            StringBuilder sb2 = new StringBuilder("ConvertServerJsonToMap failed - ");
            sb2.append(e2.getLocalizedMessage());
            rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strRemoteActionCompatParcelizer2, sb2.toString());
            return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> RemoteActionCompatParcelizer(String str) throws Throwable {
        HashMap<String, String> map = new HashMap<>();
        try {
            String strRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
            String strRemoteActionCompatParcelizer2 = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            StringBuilder sb = new StringBuilder("GetStoredValues reading file success:[ ");
            sb.append(str);
            sb.append("]--[Content]");
            sb.append(strRemoteActionCompatParcelizer);
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer2, sb.toString());
            if (!TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                try {
                    JSONObject jSONObject = new JSONObject(strRemoteActionCompatParcelizer);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            try {
                                String strValueOf = String.valueOf(jSONObject.get(next));
                                if (!TextUtils.isEmpty(strValueOf)) {
                                    map.put(next, strValueOf);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                                String strRemoteActionCompatParcelizer3 = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                                StringBuilder sb2 = new StringBuilder("GetStoredValues for key ");
                                sb2.append(next);
                                sb2.append(" while parsing json: ");
                                sb2.append(e.getLocalizedMessage());
                                rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strRemoteActionCompatParcelizer3, sb2.toString());
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                    String strRemoteActionCompatParcelizer4 = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                    StringBuilder sb3 = new StringBuilder("GetStoredValues failed due to malformed json: ");
                    sb3.append(e2.getLocalizedMessage());
                    rendererWakeupListenerMediaBrowserCompatItemReceiver3.write(strRemoteActionCompatParcelizer4, sb3.toString());
                }
            }
            return map;
        } catch (Exception e3) {
            e3.printStackTrace();
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver4 = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
            String strRemoteActionCompatParcelizer5 = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            StringBuilder sb4 = new StringBuilder("GetStoredValues reading file failed: ");
            sb4.append(e3.getLocalizedMessage());
            rendererWakeupListenerMediaBrowserCompatItemReceiver4.write(strRemoteActionCompatParcelizer5, sb4.toString());
            return map;
        }
    }

    private void IconCompatParcelizer(JSONObject jSONObject) {
        Integer num;
        synchronized (this) {
            HashMap<String, String> mapWrite = write(jSONObject);
            this.MediaBrowserCompatSearchResultReceiver.clear();
            this.MediaBrowserCompatSearchResultReceiver.putAll(mapWrite);
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
            String strRemoteActionCompatParcelizer = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            StringBuilder sb = new StringBuilder("Product Config: Fetched response:");
            sb.append(jSONObject);
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strRemoteActionCompatParcelizer, sb.toString());
            try {
                num = (Integer) jSONObject.get("ts");
            } catch (Exception e) {
                e.printStackTrace();
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                String strRemoteActionCompatParcelizer2 = getPeriodPositionUs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                StringBuilder sb2 = new StringBuilder("ParseFetchedResponse failed: ");
                sb2.append(e.getLocalizedMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strRemoteActionCompatParcelizer2, sb2.toString());
                num = null;
            }
            if (num != null) {
                this.RatingCompat.write(((long) num.intValue()) * 1000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.ordinal() != 0) {
            return;
        }
        RemoteActionCompatParcelizer();
    }
}
