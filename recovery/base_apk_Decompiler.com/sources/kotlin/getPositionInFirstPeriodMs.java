package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getPositionInFirstPeriodMs extends TimelinePeriodExternalSyntheticLambda0 {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final getUids RemoteActionCompatParcelizer;
    private final addAllCommands write;

    public getPositionInFirstPeriodMs(CleverTapInstanceConfig cleverTapInstanceConfig, getUids getuids, addAllCommands addallcommands) {
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.RemoteActionCompatParcelizer = getuids;
        this.write = addallcommands;
    }

    private static void IconCompatParcelizer(String str) {
        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
    }

    private static void read(String str) {
        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
    }

    private static void AudioAttributesCompatParcelizer(String str, Throwable th) {
        RendererWakeupListener.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        read("Processing Variable response...");
        StringBuilder sb = new StringBuilder("processResponse() called with: response = [");
        sb.append(jSONObject);
        sb.append("], stringBody = [");
        sb.append(str);
        sb.append("], context = [");
        sb.append(context);
        sb.append("]");
        IconCompatParcelizer(sb.toString());
        if (this.AudioAttributesCompatParcelizer.MediaMetadataCompat()) {
            read("CleverTap instance is configured to analytics only, not processing Variable response");
            return;
        }
        if (jSONObject == null) {
            read("Can't parse Variable Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("vars")) {
            read("JSON object doesn't contain the vars key");
            return;
        }
        try {
            read("Processing Request Variables response");
            JSONObject jSONObject2 = jSONObject.getJSONObject("vars");
            if (this.RemoteActionCompatParcelizer.write() != null) {
                this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(jSONObject2, this.write.write());
                this.write.MediaDescriptionCompat();
                return;
            }
            read("Can't parse Variable Response, CTVariables is null");
        } catch (Throwable th) {
            AudioAttributesCompatParcelizer("Failed to parse response", th);
        }
    }
}
