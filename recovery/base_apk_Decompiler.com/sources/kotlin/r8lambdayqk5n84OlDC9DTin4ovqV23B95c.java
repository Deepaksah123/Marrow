package kotlin;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdayqk5n84OlDC9DTin4ovqV23B95c {
    private final List<getPositionInWindowUs> AudioAttributesCompatParcelizer;
    private final Context write;

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdayqk5n84OlDC9DTin4ovqV23B95c(Context context, List<? extends getPositionInWindowUs> list) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = context;
        this.AudioAttributesCompatParcelizer = list;
    }

    public final void AudioAttributesCompatParcelizer(boolean z, JSONObject jSONObject, String str, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (z2) {
            List<getPositionInWindowUs> list = this.AudioAttributesCompatParcelizer;
            ArrayList<getPositionInWindowUs> arrayList = new ArrayList();
            for (Object obj : list) {
                getPositionInWindowUs getpositioninwindowus = (getPositionInWindowUs) obj;
                if (!(getpositioninwindowus instanceof getDefaultPositionMs) && !(getpositioninwindowus instanceof TimelineRemotableTimeline) && !(getpositioninwindowus instanceof getPositionInFirstPeriodMs)) {
                    arrayList.add(obj);
                }
            }
            for (getPositionInWindowUs getpositioninwindowus2 : arrayList) {
                getpositioninwindowus2.IconCompatParcelizer = z;
                if (getpositioninwindowus2 instanceof getDefaultPositionUs) {
                    ((getDefaultPositionUs) getpositioninwindowus2).RemoteActionCompatParcelizer(jSONObject, this.write, true);
                } else {
                    getpositioninwindowus2.IconCompatParcelizer(jSONObject, str, this.write);
                }
            }
            return;
        }
        for (getPositionInWindowUs getpositioninwindowus3 : this.AudioAttributesCompatParcelizer) {
            getpositioninwindowus3.IconCompatParcelizer = z;
            getpositioninwindowus3.IconCompatParcelizer(jSONObject, str, this.write);
        }
    }
}
