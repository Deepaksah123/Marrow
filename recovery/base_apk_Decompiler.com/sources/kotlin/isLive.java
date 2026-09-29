package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class isLive extends TimelinePeriodExternalSyntheticLambda0 {
    private final RendererWakeupListener AudioAttributesCompatParcelizer;
    private final addAllCommands RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig write;

    public isLive(CleverTapInstanceConfig cleverTapInstanceConfig, addAllCommands addallcommands) {
        this.write = cleverTapInstanceConfig;
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.RemoteActionCompatParcelizer = addallcommands;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        this.AudioAttributesCompatParcelizer.write(this.write.write(), "Processing GeoFences response...");
        if (this.write.MediaMetadataCompat()) {
            this.AudioAttributesCompatParcelizer.write(this.write.write(), "CleverTap instance is configured to analytics only, not processing geofence response");
            return;
        }
        if (jSONObject == null) {
            this.AudioAttributesCompatParcelizer.write(this.write.write(), "Geofences : Can't parse Geofences Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("geofences")) {
            this.AudioAttributesCompatParcelizer.write(this.write.write(), "Geofences : JSON object doesn't contain the Geofences key");
            return;
        }
        try {
            if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() != null) {
                new JSONObject().put("geofences", jSONObject.getJSONArray("geofences"));
                this.AudioAttributesCompatParcelizer.write(this.write.write(), "Geofences : Processing Geofences response");
                this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
                return;
            }
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write.write(), "Geofences : Geofence SDK has not been initialized to handle the response");
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListener = this.AudioAttributesCompatParcelizer;
            this.write.write();
            rendererWakeupListener.IconCompatParcelizer();
        }
    }
}
