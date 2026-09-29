package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class isServerSideInsertedAdGroup extends TimelinePeriodExternalSyntheticLambda0 {
    private final RendererWakeupListener AudioAttributesCompatParcelizer;
    private final lambdaonAudioDecoderInitialized4 MediaBrowserCompatCustomActionResultReceiver;
    private final CleverTapInstanceConfig RemoteActionCompatParcelizer;
    private final getPeriodPosition read;
    private final setVideoSize write;

    public isServerSideInsertedAdGroup(CleverTapInstanceConfig cleverTapInstanceConfig, lambdaonAudioDecoderInitialized4 lambdaonaudiodecoderinitialized4, getUids getuids, setVideoSize setvideosize) {
        this.RemoteActionCompatParcelizer = cleverTapInstanceConfig;
        this.read = getuids.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.MediaBrowserCompatCustomActionResultReceiver = lambdaonaudiodecoderinitialized4;
        this.write = setvideosize;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        try {
            if (jSONObject.has("arp")) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("arp");
                if (jSONObject2.length() > 0) {
                    getPeriodPosition getperiodposition = this.read;
                    if (getperiodposition != null) {
                        getperiodposition.RemoteActionCompatParcelizer(jSONObject2);
                    }
                    try {
                        RemoteActionCompatParcelizer(jSONObject2);
                    } catch (Throwable th) {
                        RendererWakeupListener rendererWakeupListener = this.AudioAttributesCompatParcelizer;
                        th.getLocalizedMessage();
                        rendererWakeupListener.read();
                    }
                    this.write.IconCompatParcelizer(context, jSONObject2);
                }
            }
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListener2 = this.AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer.write();
            rendererWakeupListener2.IconCompatParcelizer();
        }
    }

    private void RemoteActionCompatParcelizer(JSONObject jSONObject) {
        if (!jSONObject.has("d_e")) {
            this.AudioAttributesCompatParcelizer.write(this.RemoteActionCompatParcelizer.write(), "ARP doesn't contain the Discarded Events key");
            return;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("d_e");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
            lambdaonAudioDecoderInitialized4 lambdaonaudiodecoderinitialized4 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (lambdaonaudiodecoderinitialized4 != null) {
                lambdaonaudiodecoderinitialized4.IconCompatParcelizer(arrayList);
            } else {
                this.AudioAttributesCompatParcelizer.write(this.RemoteActionCompatParcelizer.write(), "Validator object is NULL");
            }
        } catch (JSONException e) {
            RendererWakeupListener rendererWakeupListener = this.AudioAttributesCompatParcelizer;
            String strWrite = this.RemoteActionCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("Error parsing discarded events list");
            sb.append(e.getLocalizedMessage());
            rendererWakeupListener.write(strWrite, sb.toString());
        }
    }
}
