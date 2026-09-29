package kotlin;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda14 {
    public final String AudioAttributesCompatParcelizer;
    public final String AudioAttributesImplApi26Parcelizer;
    public final int AudioAttributesImplBaseParcelizer;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatItemReceiver;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final int write;

    public enum RemoteActionCompatParcelizer {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int AudioAttributesImplBaseParcelizer;

        RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplBaseParcelizer = i;
        }

        public final int read() {
            return this.AudioAttributesImplBaseParcelizer;
        }
    }

    DefaultAnalyticsCollectorExternalSyntheticLambda14(JSONObject jSONObject) throws JSONException {
        this.AudioAttributesCompatParcelizer = jSONObject.getString("class_name");
        this.RemoteActionCompatParcelizer = jSONObject.optInt("index", -1);
        this.write = jSONObject.optInt("id");
        this.MediaBrowserCompatItemReceiver = jSONObject.optString("text");
        this.AudioAttributesImplApi26Parcelizer = jSONObject.optString("tag");
        this.read = jSONObject.optString("description");
        this.IconCompatParcelizer = jSONObject.optString("hint");
        this.AudioAttributesImplBaseParcelizer = jSONObject.optInt("match_bitmask");
    }
}
