package kotlin;

import android.text.TextUtils;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class clearPositionDiscontinuity {
    private JSONObject AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private String IconCompatParcelizer;
    private List<String> MediaBrowserCompatCustomActionResultReceiver;
    private JSONObject MediaBrowserCompatItemReceiver;
    private long RemoteActionCompatParcelizer;
    private long read;
    private String write;

    public clearPositionDiscontinuity() {
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
    }

    private clearPositionDiscontinuity(String str, JSONObject jSONObject, long j, long j2, String str2, List<String> list, String str3, JSONObject jSONObject2) {
        new ArrayList();
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = jSONObject;
        this.AudioAttributesImplBaseParcelizer = false;
        this.read = j;
        this.RemoteActionCompatParcelizer = j2;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.write = str3;
        this.MediaBrowserCompatItemReceiver = jSONObject2;
    }

    final boolean IconCompatParcelizer() {
        RendererWakeupListener.MediaBrowserCompatItemReceiver();
        CTInboxMessageContent cTInboxMessageContent = new CTInboxMessage(MediaDescriptionCompat()).RemoteActionCompatParcelizer().get(0);
        return cTInboxMessageContent.onAddQueueItem() || cTInboxMessageContent.MediaDescriptionCompat();
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final void write(String str) {
        this.write = str;
    }

    public final long read() {
        return this.read;
    }

    public final void write(long j) {
        this.read = j;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer = str;
    }

    public final JSONObject AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        this.AudioAttributesCompatParcelizer = jSONObject;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return TextUtils.join(",", this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        this.MediaBrowserCompatCustomActionResultReceiver.addAll(Arrays.asList(str.split(",")));
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void read(String str) {
        this.AudioAttributesImplApi21Parcelizer = str;
    }

    public final JSONObject AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void IconCompatParcelizer(JSONObject jSONObject) {
        this.MediaBrowserCompatItemReceiver = jSONObject;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer ? 1 : 0;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesImplBaseParcelizer = i == 1;
    }

    public final JSONObject MediaDescriptionCompat() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.IconCompatParcelizer);
            jSONObject.put("msg", this.AudioAttributesCompatParcelizer);
            jSONObject.put("isRead", this.AudioAttributesImplBaseParcelizer);
            jSONObject.put("date", this.read);
            jSONObject.put("wzrk_ttl", this.RemoteActionCompatParcelizer);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.MediaBrowserCompatCustomActionResultReceiver.size(); i++) {
                jSONArray.put(this.MediaBrowserCompatCustomActionResultReceiver.get(i));
            }
            jSONObject.put(FilterParams.KEY_TAGS, jSONArray);
            jSONObject.put("wzrk_id", this.write);
            jSONObject.put("wzrkParams", this.MediaBrowserCompatItemReceiver);
            return jSONObject;
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return jSONObject;
        }
    }

    static clearPositionDiscontinuity write(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.has("_id") ? jSONObject.getString("_id") : null;
            long j = jSONObject.has("date") ? jSONObject.getInt("date") : System.currentTimeMillis() / 1000;
            long j2 = jSONObject.has("wzrk_ttl") ? jSONObject.getInt("wzrk_ttl") : (System.currentTimeMillis() + 86400000) / 1000;
            JSONObject jSONObject2 = jSONObject.has("msg") ? jSONObject.getJSONObject("msg") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null) {
                JSONArray jSONArray = jSONObject2.has(FilterParams.KEY_TAGS) ? jSONObject2.getJSONArray(FilterParams.KEY_TAGS) : null;
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                }
            }
            String string2 = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            if (string2.equalsIgnoreCase("0_0")) {
                jSONObject.put("wzrk_id", string2);
            }
            JSONObject jSONObjectWrite = write(jSONObject);
            if (string == null) {
                return null;
            }
            return new clearPositionDiscontinuity(string, jSONObject2, j, j2, str, arrayList, string2, jSONObjectWrite);
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return null;
        }
    }

    private static JSONObject write(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.startsWith("wzrk_")) {
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        return jSONObject2;
    }
}
