package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getPositionInFirstPeriodUs extends TimelinePeriodExternalSyntheticLambda0 {
    private final CleverTapInstanceConfig RemoteActionCompatParcelizer;
    private final getUids read;
    private final RendererWakeupListener write;

    public getPositionInFirstPeriodUs(CleverTapInstanceConfig cleverTapInstanceConfig, getUids getuids) {
        this.RemoteActionCompatParcelizer = cleverTapInstanceConfig;
        this.write = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.read = getuids;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        this.write.write(this.RemoteActionCompatParcelizer.write(), "Processing Feature Flags response...");
        if (this.RemoteActionCompatParcelizer.MediaMetadataCompat()) {
            this.write.write(this.RemoteActionCompatParcelizer.write(), "CleverTap instance is configured to analytics only, not processing Feature Flags response");
            return;
        }
        if (jSONObject == null) {
            this.write.write(this.RemoteActionCompatParcelizer.write(), "Feature Flag : Can't parse Feature Flags Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("ff_notifs")) {
            this.write.write(this.RemoteActionCompatParcelizer.write(), "Feature Flag : JSON object doesn't contain the Feature Flags key");
            return;
        }
        try {
            this.write.write(this.RemoteActionCompatParcelizer.write(), "Feature Flag : Processing Feature Flags response");
            read(jSONObject.getJSONObject("ff_notifs"));
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListener = this.write;
            this.RemoteActionCompatParcelizer.write();
            rendererWakeupListener.IconCompatParcelizer();
        }
    }

    private void read(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getJSONArray("kv") != null && this.read.AudioAttributesCompatParcelizer() != null) {
            this.read.AudioAttributesCompatParcelizer().read(jSONObject);
        } else {
            this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.RemoteActionCompatParcelizer.write(), "Feature Flag : Can't parse feature flags, CTFeatureFlagsController is null");
        }
    }
}
