package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class TimelineRemotableTimeline extends TimelinePeriodExternalSyntheticLambda0 {
    private final Object AudioAttributesCompatParcelizer = new Object();
    private final RendererWakeupListener MediaBrowserCompatCustomActionResultReceiver;
    private final getUids RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig read;
    private final addAllCommands write;

    public TimelineRemotableTimeline(CleverTapInstanceConfig cleverTapInstanceConfig, addAllCommands addallcommands, getUids getuids) {
        this.read = cleverTapInstanceConfig;
        this.MediaBrowserCompatCustomActionResultReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.write = addallcommands;
        this.RemoteActionCompatParcelizer = getuids;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "Processing Display Unit items...");
        if (this.read.MediaMetadataCompat()) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "CleverTap instance is configured to analytics only, not processing Display Unit response");
            return;
        }
        if (jSONObject == null) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "DisplayUnit : Can't parse Display Unit Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("adUnit_notifs")) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "DisplayUnit : JSON object doesn't contain the Display Units key");
            return;
        }
        try {
            this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "DisplayUnit : Processing Display Unit response");
            AudioAttributesCompatParcelizer(jSONObject.getJSONArray("adUnit_notifs"));
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListener = this.MediaBrowserCompatCustomActionResultReceiver;
            this.read.write();
            rendererWakeupListener.IconCompatParcelizer();
        }
    }

    private void AudioAttributesCompatParcelizer(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "DisplayUnit : Can't parse Display Units, jsonArray is either empty or null");
            return;
        }
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == null) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new lambdasetPlayWhenReady1());
            }
        }
        this.write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(jSONArray));
    }
}
