package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class setTimedMetadata implements setTotalBufferedDurationMs {
    private final List<setTotalBufferedDurationMs> write = new ArrayList();

    public final void IconCompatParcelizer(setTotalBufferedDurationMs settotalbuffereddurationms) {
        toMagicModuleMetaRepoModel.write(settotalbuffereddurationms, "");
        this.write.add(settotalbuffereddurationms);
    }

    @Override // kotlin.setTotalBufferedDurationMs
    public final void AudioAttributesCompatParcelizer(JSONArray jSONArray, boolean z) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        Iterator<T> it = this.write.iterator();
        while (it.hasNext()) {
            ((setTotalBufferedDurationMs) it.next()).AudioAttributesCompatParcelizer(jSONArray, z);
        }
    }
}
