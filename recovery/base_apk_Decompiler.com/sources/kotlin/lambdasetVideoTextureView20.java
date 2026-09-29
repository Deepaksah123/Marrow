package kotlin;

import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class lambdasetVideoTextureView20 {
    private String AudioAttributesImplBaseParcelizer;
    AnalyticsListenerEventTime IconCompatParcelizer;
    final addAllCommands RemoteActionCompatParcelizer;
    private CleverTapInstanceConfig read;
    final PlayerCommandsExternalSyntheticLambda0 write;
    boolean AudioAttributesCompatParcelizer = false;
    private final Map<String, Boolean> MediaBrowserCompatCustomActionResultReceiver = Collections.synchronizedMap(new HashMap());

    private void MediaBrowserCompatItemReceiver() {
    }

    @Deprecated
    public final String write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Deprecated
    lambdasetVideoTextureView20(String str, CleverTapInstanceConfig cleverTapInstanceConfig, addAllCommands addallcommands, PlayerCommandsExternalSyntheticLambda0 playerCommandsExternalSyntheticLambda0, AnalyticsListenerEventTime analyticsListenerEventTime) {
        this.AudioAttributesImplBaseParcelizer = str;
        this.read = cleverTapInstanceConfig;
        this.RemoteActionCompatParcelizer = addallcommands;
        this.write = playerCommandsExternalSyntheticLambda0;
        this.IconCompatParcelizer = analyticsListenerEventTime;
        AudioAttributesImplApi26Parcelizer();
    }

    @Deprecated
    public final void RemoteActionCompatParcelizer() {
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).write().read("fetchFeatureFlags", new Callable<Void>() { // from class: o.lambdasetVideoTextureView20.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Void call() {
                try {
                    lambdasetVideoTextureView20.this.write.RemoteActionCompatParcelizer();
                    return null;
                } catch (Exception e) {
                    lambdasetVideoTextureView20.this.IconCompatParcelizer().write(lambdasetVideoTextureView20.this.MediaBrowserCompatCustomActionResultReceiver(), e.getLocalizedMessage());
                    return null;
                }
            }
        });
    }

    @Deprecated
    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Deprecated
    public final void read(String str) {
        this.AudioAttributesImplBaseParcelizer = str;
        AudioAttributesImplApi26Parcelizer();
    }

    @Deprecated
    public final void IconCompatParcelizer(String str) {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = str;
        AudioAttributesImplApi26Parcelizer();
    }

    @Deprecated
    public final void read(JSONObject jSONObject) throws JSONException {
        synchronized (this) {
            JSONArray jSONArray = jSONObject.getJSONArray("kv");
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    this.MediaBrowserCompatCustomActionResultReceiver.put(jSONObject2.getString("n"), Boolean.valueOf(jSONObject2.getBoolean("v")));
                } catch (JSONException e) {
                    RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = IconCompatParcelizer();
                    String strMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error parsing Feature Flag array ");
                    sb.append(e.getLocalizedMessage());
                    rendererWakeupListenerIconCompatParcelizer.write(strMediaBrowserCompatCustomActionResultReceiver, sb.toString());
                }
            }
            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer2 = IconCompatParcelizer();
            String strMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Updating feature flags...");
            sb2.append(this.MediaBrowserCompatCustomActionResultReceiver);
            rendererWakeupListenerIconCompatParcelizer2.write(strMediaBrowserCompatCustomActionResultReceiver2, sb2.toString());
            RemoteActionCompatParcelizer(jSONObject);
            MediaBrowserCompatItemReceiver();
        }
    }

    private String AudioAttributesImplApi21Parcelizer() {
        StringBuilder sb = new StringBuilder("Feature_Flag_");
        sb.append(this.read.write());
        sb.append("_");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        return sb.toString();
    }

    private static String AudioAttributesImplBaseParcelizer() {
        return "ff_cache.json";
    }

    final String read() {
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesImplApi21Parcelizer());
        sb.append("/");
        sb.append(AudioAttributesImplBaseParcelizer());
        return sb.toString();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (TextUtils.isEmpty(this.AudioAttributesImplBaseParcelizer)) {
            return;
        }
        isTrackSupported istracksupportedIconCompatParcelizer = TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).IconCompatParcelizer();
        istracksupportedIconCompatParcelizer.RemoteActionCompatParcelizer(new TracksGroupExternalSyntheticLambda0<Boolean>() { // from class: o.lambdasetVideoTextureView20.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.TracksGroupExternalSyntheticLambda0
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public void read(Boolean bool) {
                lambdasetVideoTextureView20.this.AudioAttributesCompatParcelizer = bool.booleanValue();
            }
        });
        istracksupportedIconCompatParcelizer.read("initFeatureFlags", new Callable<Boolean>() { // from class: o.lambdasetVideoTextureView20.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                synchronized (this) {
                    lambdasetVideoTextureView20.this.IconCompatParcelizer().write(lambdasetVideoTextureView20.this.MediaBrowserCompatCustomActionResultReceiver(), "Feature flags init is called");
                    String str = lambdasetVideoTextureView20.this.read();
                    try {
                        lambdasetVideoTextureView20.this.MediaBrowserCompatCustomActionResultReceiver.clear();
                        String strRemoteActionCompatParcelizer = lambdasetVideoTextureView20.this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
                        if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = lambdasetVideoTextureView20.this.IconCompatParcelizer();
                            String strMediaBrowserCompatCustomActionResultReceiver = lambdasetVideoTextureView20.this.MediaBrowserCompatCustomActionResultReceiver();
                            StringBuilder sb = new StringBuilder("Feature flags file is empty-");
                            sb.append(str);
                            rendererWakeupListenerIconCompatParcelizer.write(strMediaBrowserCompatCustomActionResultReceiver, sb.toString());
                        } else {
                            JSONArray jSONArray = new JSONObject(strRemoteActionCompatParcelizer).getJSONArray("kv");
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                                    if (jSONObject != null) {
                                        String string = jSONObject.getString("n");
                                        String string2 = jSONObject.getString("v");
                                        if (!TextUtils.isEmpty(string)) {
                                            lambdasetVideoTextureView20.this.MediaBrowserCompatCustomActionResultReceiver.put(string, Boolean.valueOf(Boolean.parseBoolean(string2)));
                                        }
                                    }
                                }
                            }
                            RendererWakeupListener rendererWakeupListenerIconCompatParcelizer2 = lambdasetVideoTextureView20.this.IconCompatParcelizer();
                            String strMediaBrowserCompatCustomActionResultReceiver2 = lambdasetVideoTextureView20.this.MediaBrowserCompatCustomActionResultReceiver();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Feature flags initialized from file ");
                            sb2.append(str);
                            sb2.append(" with configs  ");
                            sb2.append(lambdasetVideoTextureView20.this.MediaBrowserCompatCustomActionResultReceiver);
                            rendererWakeupListenerIconCompatParcelizer2.write(strMediaBrowserCompatCustomActionResultReceiver2, sb2.toString());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        RendererWakeupListener rendererWakeupListenerIconCompatParcelizer3 = lambdasetVideoTextureView20.this.IconCompatParcelizer();
                        String strMediaBrowserCompatCustomActionResultReceiver3 = lambdasetVideoTextureView20.this.MediaBrowserCompatCustomActionResultReceiver();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("UnArchiveData failed file- ");
                        sb3.append(str);
                        sb3.append(" ");
                        sb3.append(e.getLocalizedMessage());
                        rendererWakeupListenerIconCompatParcelizer3.write(strMediaBrowserCompatCustomActionResultReceiver3, sb3.toString());
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        });
    }

    private void RemoteActionCompatParcelizer(JSONObject jSONObject) {
        synchronized (this) {
            if (jSONObject != null) {
                try {
                    this.IconCompatParcelizer.read(AudioAttributesImplApi21Parcelizer(), AudioAttributesImplBaseParcelizer(), jSONObject);
                    RendererWakeupListener rendererWakeupListenerIconCompatParcelizer = IconCompatParcelizer();
                    String strMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                    StringBuilder sb = new StringBuilder("Feature flags saved into file-[");
                    sb.append(read());
                    sb.append("]");
                    sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
                    rendererWakeupListenerIconCompatParcelizer.write(strMediaBrowserCompatCustomActionResultReceiver, sb.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    RendererWakeupListener rendererWakeupListenerIconCompatParcelizer2 = IconCompatParcelizer();
                    String strMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver();
                    StringBuilder sb2 = new StringBuilder("ArchiveData failed - ");
                    sb2.append(e.getLocalizedMessage());
                    rendererWakeupListenerIconCompatParcelizer2.write(strMediaBrowserCompatCustomActionResultReceiver2, sb2.toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RendererWakeupListener IconCompatParcelizer() {
        return this.read.MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String MediaBrowserCompatCustomActionResultReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read.write());
        sb.append("[Feature Flag]");
        return sb.toString();
    }
}
