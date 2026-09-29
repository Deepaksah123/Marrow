package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class TimelineWindow extends TimelinePeriodExternalSyntheticLambda0 {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final RendererWakeupListener write;

    public TimelineWindow(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.write = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        int i;
        try {
            if (jSONObject.has("console")) {
                JSONArray jSONArray = (JSONArray) jSONObject.get("console");
                if (jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        this.write.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), jSONArray.get(i2).toString());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (!jSONObject.has("dbg_lvl") || (i = jSONObject.getInt("dbg_lvl")) < 0) {
                return;
            }
            PlayerTimelineChangeReason.IconCompatParcelizer(i);
            RendererWakeupListener rendererWakeupListener = this.write;
            String strWrite = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb = new StringBuilder();
            sb.append("Set debug level to ");
            sb.append(i);
            sb.append(" for this session (set by upstream)");
            rendererWakeupListener.write(strWrite, sb.toString());
        } catch (Throwable unused2) {
        }
    }
}
