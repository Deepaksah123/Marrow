package kotlin;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _removeIgnored extends getNextWindowIndex {
    private final Map<String, setDescriptionList<_mergeAnnotations<? extends j>>> read;

    public _removeIgnored(Map<String, setDescriptionList<_mergeAnnotations<? extends j>>> map) {
        this.read = map;
    }

    @Override // kotlin.getNextWindowIndex
    public final j read(Context context, String str, WorkerParameters workerParameters) {
        setDescriptionList<_mergeAnnotations<? extends j>> setdescriptionlist = this.read.get(str);
        if (setdescriptionlist == null) {
            return null;
        }
        return setdescriptionlist.get().AudioAttributesCompatParcelizer(context, workerParameters);
    }
}
