package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Tracks extends TimelinePeriodExternalSyntheticLambda0 {
    private final addAllCommands AudioAttributesCompatParcelizer;
    private final getUids AudioAttributesImplApi26Parcelizer;
    private final RendererWakeupListener MediaBrowserCompatItemReceiver;
    private final Context RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig read;
    private final lambdaprepare7 write;

    public Tracks(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, lambdaprepare7 lambdaprepare7Var, addAllCommands addallcommands, getUids getuids) {
        this.RemoteActionCompatParcelizer = context;
        this.read = cleverTapInstanceConfig;
        this.MediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.write = lambdaprepare7Var;
        this.AudioAttributesCompatParcelizer = addallcommands;
        this.AudioAttributesImplApi26Parcelizer = getuids;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        if (this.read.MediaMetadataCompat()) {
            this.MediaBrowserCompatItemReceiver.write(this.read.write(), "CleverTap instance is configured to analytics only, not processing push amp response");
            return;
        }
        try {
            if (jSONObject.has("pushamp_notifs")) {
                this.MediaBrowserCompatItemReceiver.write(this.read.write(), "Processing pushamp messages...");
                JSONObject jSONObject2 = jSONObject.getJSONObject("pushamp_notifs");
                JSONArray jSONArray = jSONObject2.getJSONArray("list");
                if (jSONArray.length() > 0) {
                    this.MediaBrowserCompatItemReceiver.write(this.read.write(), "Handling Push payload locally");
                    RemoteActionCompatParcelizer(jSONArray);
                }
                if (jSONObject2.has("pf")) {
                    try {
                        this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(context, jSONObject2.getInt("pf"));
                    } catch (Throwable th) {
                        RendererWakeupListener rendererWakeupListener = this.MediaBrowserCompatItemReceiver;
                        th.getMessage();
                        rendererWakeupListener.read();
                    }
                }
                if (jSONObject2.has("ack")) {
                    boolean z = jSONObject2.getBoolean("ack");
                    this.MediaBrowserCompatItemReceiver.read();
                    if (z) {
                        JSONArray jSONArrayIconCompatParcelizer = AnalyticsCollector.IconCompatParcelizer(this.write.AudioAttributesCompatParcelizer(context).IconCompatParcelizer());
                        int length = jSONArrayIconCompatParcelizer.length();
                        String[] strArr = new String[length];
                        for (int i = 0; i < length; i++) {
                            strArr[i] = jSONArrayIconCompatParcelizer.getString(i);
                        }
                        this.MediaBrowserCompatItemReceiver.read();
                        this.write.AudioAttributesCompatParcelizer(context).IconCompatParcelizer(strArr);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void RemoteActionCompatParcelizer(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Bundle bundle = new Bundle();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("wzrk_ttl")) {
                    bundle.putLong("wzrk_ttl", jSONObject.getLong("wzrk_ttl"));
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String string = itKeys.next().toString();
                    bundle.putString(string, jSONObject.getString(string));
                }
                if (!bundle.isEmpty() && !this.write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).IconCompatParcelizer(jSONObject.getString("wzrk_pid"))) {
                    this.MediaBrowserCompatItemReceiver.read();
                    if (this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer() != null) {
                        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                    } else {
                        getAdGroupCount.IconCompatParcelizer().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, bundle, getAdGroupIndexAfterPositionUs.IconCompatParcelizer.toString());
                    }
                } else {
                    RendererWakeupListener rendererWakeupListener = this.MediaBrowserCompatItemReceiver;
                    String strWrite = this.read.write();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Push Notification already shown, ignoring local notification :");
                    sb.append(jSONObject.getString("wzrk_pid"));
                    rendererWakeupListener.write(strWrite, sb.toString());
                }
            } catch (JSONException unused) {
                this.MediaBrowserCompatItemReceiver.write(this.read.write(), "Error parsing push notification JSON");
                return;
            }
        }
    }
}
