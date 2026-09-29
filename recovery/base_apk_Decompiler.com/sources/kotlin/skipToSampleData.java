package kotlin;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class skipToSampleData {
    private final isVclBodyNalUnit read;

    skipToSampleData(isVclBodyNalUnit isvclbodynalunit) {
        this.read = isvclbodynalunit;
    }

    public final readFileType AudioAttributesCompatParcelizer(JSONObject jSONObject) throws JSONException {
        return RemoteActionCompatParcelizer(jSONObject.getInt("settings_version")).IconCompatParcelizer(this.read, jSONObject);
    }

    private static WavExtractorExternalSyntheticLambda0 RemoteActionCompatParcelizer(int i) {
        if (i == 3) {
            return new numOutputFramesToBytes();
        }
        DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
        StringBuilder sb = new StringBuilder("Could not determine SettingsJsonTransform for settings version ");
        sb.append(i);
        sb.append(". Using default settings values.");
        dvbSubtitleReader.RemoteActionCompatParcelizer(sb.toString());
        return new readPcrValueFromPcrBytes();
    }
}
