package kotlin;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class MlltFrame1 {
    private final onInputBufferAvailable<TrackSampleTable> RemoteActionCompatParcelizer;
    private final Map<String, String> write = Collections.synchronizedMap(new HashMap());

    public MlltFrame1(onInputBufferAvailable<TrackSampleTable> oninputbufferavailable) {
        this.RemoteActionCompatParcelizer = oninputbufferavailable;
    }

    public final void RemoteActionCompatParcelizer(String str, decodeGeobFrame decodegeobframe) {
        JSONObject jSONObjectOptJSONObject;
        TrackSampleTable trackSampleTableWrite = this.RemoteActionCompatParcelizer.write();
        if (trackSampleTableWrite != null) {
            JSONObject jSONObjectAudioAttributesImplApi21Parcelizer = decodegeobframe.AudioAttributesImplApi21Parcelizer();
            if (jSONObjectAudioAttributesImplApi21Parcelizer.length() <= 0) {
                return;
            }
            JSONObject jSONObjectIconCompatParcelizer = decodegeobframe.IconCompatParcelizer();
            if (jSONObjectIconCompatParcelizer.length() > 0 && (jSONObjectOptJSONObject = jSONObjectAudioAttributesImplApi21Parcelizer.optJSONObject(str)) != null) {
                String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                if (strOptString.isEmpty()) {
                    return;
                }
                synchronized (this.write) {
                    if (strOptString.equals(this.write.get(str))) {
                        return;
                    }
                    this.write.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectIconCompatParcelizer.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    trackSampleTableWrite.RemoteActionCompatParcelizer("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    trackSampleTableWrite.RemoteActionCompatParcelizer("fp", "_fpc", bundle2);
                }
            }
        }
    }
}
