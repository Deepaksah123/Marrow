package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class isTypeSelected extends TimelinePeriodExternalSyntheticLambda0 {
    private final getChildTimelines AudioAttributesCompatParcelizer;
    private final getMaxStars RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig read;
    private final RendererWakeupListener write;

    public isTypeSelected(CleverTapInstanceConfig cleverTapInstanceConfig, getChildTimelines getchildtimelines, getMaxStars getmaxstars) {
        this.read = cleverTapInstanceConfig;
        this.write = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.AudioAttributesCompatParcelizer = getchildtimelines;
        this.RemoteActionCompatParcelizer = getmaxstars;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        try {
            if (jSONObject.has("g")) {
                String string = jSONObject.getString("g");
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(string);
                RendererWakeupListener rendererWakeupListener = this.write;
                String strWrite = this.read.write();
                StringBuilder sb = new StringBuilder("Got a new device ID: ");
                sb.append(string);
                rendererWakeupListener.write(strWrite, sb.toString());
            }
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListener2 = this.write;
            this.read.write();
            rendererWakeupListener2.IconCompatParcelizer();
        }
        try {
            if (jSONObject.has("_i")) {
                this.RemoteActionCompatParcelizer.read(context, jSONObject.getLong("_i"));
            }
        } catch (Throwable unused2) {
        }
        try {
            if (jSONObject.has("_j")) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(context, jSONObject.getLong("_j"));
            }
        } catch (Throwable unused3) {
        }
    }
}
