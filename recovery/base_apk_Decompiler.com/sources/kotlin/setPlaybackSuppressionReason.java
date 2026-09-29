package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class setPlaybackSuppressionReason implements setTotalBufferedDurationMs {
    private final List<getCreatedOnDateMs<getShowPopup>> write = new ArrayList();

    public final void write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.write.add(getcreatedondatems);
    }

    @Override // kotlin.setTotalBufferedDurationMs
    public final void AudioAttributesCompatParcelizer(JSONArray jSONArray, boolean z) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) jSONArray.getJSONObject(i).optString("evtName"), (Object) "App Launched") && z) {
                IconCompatParcelizer();
                return;
            }
        }
    }

    private final void IconCompatParcelizer() {
        Iterator<T> it = this.write.iterator();
        while (it.hasNext()) {
            ((getCreatedOnDateMs) it.next()).invoke();
        }
    }
}
