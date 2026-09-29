package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultPositionMs extends TimelinePeriodExternalSyntheticLambda0 {
    private final Object AudioAttributesCompatParcelizer;
    private final RendererWakeupListener MediaBrowserCompatCustomActionResultReceiver;
    private final addAllCommands RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig read;
    private final getUids write;

    public getDefaultPositionMs(CleverTapInstanceConfig cleverTapInstanceConfig, PlayerListener playerListener, addAllCommands addallcommands, getUids getuids) {
        this.read = cleverTapInstanceConfig;
        this.RemoteActionCompatParcelizer = addallcommands;
        this.MediaBrowserCompatCustomActionResultReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.AudioAttributesCompatParcelizer = playerListener.RemoteActionCompatParcelizer();
        this.write = getuids;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        if (this.read.MediaMetadataCompat()) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "CleverTap instance is configured to analytics only, not processing inbox messages");
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "Inbox: Processing response");
        if (!jSONObject.has("inbox_notifs")) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(this.read.write(), "Inbox: Response JSON object doesn't contain the inbox key");
            return;
        }
        try {
            read(jSONObject.getJSONArray("inbox_notifs"));
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListener = this.MediaBrowserCompatCustomActionResultReceiver;
            this.read.write();
            rendererWakeupListener.IconCompatParcelizer();
        }
    }

    private void read(JSONArray jSONArray) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (this.write.read() == null) {
                this.write.AudioAttributesImplApi21Parcelizer();
            }
            if (this.write.read() != null) {
                this.write.read().AudioAttributesCompatParcelizer(jSONArray);
            }
        }
    }
}
