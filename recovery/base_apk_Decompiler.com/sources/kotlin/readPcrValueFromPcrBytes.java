package kotlin;

import kotlin.readFileType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
final class readPcrValueFromPcrBytes implements WavExtractorExternalSyntheticLambda0 {
    readPcrValueFromPcrBytes() {
    }

    @Override // kotlin.WavExtractorExternalSyntheticLambda0
    public final readFileType IconCompatParcelizer(isVclBodyNalUnit isvclbodynalunit, JSONObject jSONObject) {
        return AudioAttributesCompatParcelizer(isvclbodynalunit);
    }

    static readFileType AudioAttributesCompatParcelizer(isVclBodyNalUnit isvclbodynalunit) {
        return new readFileType(isvclbodynalunit.RemoteActionCompatParcelizer() + 3600000, new readFileType.read(8), new readFileType.AudioAttributesCompatParcelizer(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }
}
