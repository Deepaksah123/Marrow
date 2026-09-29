package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getGroups extends TimelinePeriodExternalSyntheticLambda0 {
    private final getUids AudioAttributesCompatParcelizer;
    private final CleverTapInstanceConfig RemoteActionCompatParcelizer;
    private final copyWithPlaceholderTimeline read;
    private final RendererWakeupListener write;

    public getGroups(CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline, getUids getuids) {
        this.RemoteActionCompatParcelizer = cleverTapInstanceConfig;
        this.write = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.read = copywithplaceholdertimeline;
        this.AudioAttributesCompatParcelizer = getuids;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        this.write.write(this.RemoteActionCompatParcelizer.write(), "Processing Product Config response...");
        if (this.RemoteActionCompatParcelizer.MediaMetadataCompat()) {
            this.write.write(this.RemoteActionCompatParcelizer.write(), "CleverTap instance is configured to analytics only, not processing Product Config response");
            return;
        }
        if (jSONObject == null) {
            this.write.write(this.RemoteActionCompatParcelizer.write(), "Product Config : Can't parse Product Config Response, JSON response object is null");
            AudioAttributesCompatParcelizer();
            return;
        }
        if (!jSONObject.has("pc_notifs")) {
            this.write.write(this.RemoteActionCompatParcelizer.write(), "Product Config : JSON object doesn't contain the Product Config key");
            AudioAttributesCompatParcelizer();
            return;
        }
        try {
            this.write.write(this.RemoteActionCompatParcelizer.write(), "Product Config : Processing Product Config response");
            IconCompatParcelizer(jSONObject.getJSONObject("pc_notifs"));
        } catch (Throwable unused) {
            AudioAttributesCompatParcelizer();
            RendererWakeupListener rendererWakeupListener = this.write;
            this.RemoteActionCompatParcelizer.write();
            rendererWakeupListener.IconCompatParcelizer();
        }
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.read.onRemoveQueueItem()) {
            if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer() != null) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
            }
            this.read.onSetCaptioningEnabled();
        }
    }

    private void IconCompatParcelizer(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getJSONArray("kv") != null && this.AudioAttributesCompatParcelizer.IconCompatParcelizer() != null) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer().read(jSONObject);
        } else {
            AudioAttributesCompatParcelizer();
        }
    }
}
