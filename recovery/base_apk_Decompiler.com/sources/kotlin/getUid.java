package kotlin;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getUid {
    private final List<sendMessageToTarget> RemoteActionCompatParcelizer;
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer>> read;
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path>> write;

    public getUid(List<sendMessageToTarget> list) {
        this.RemoteActionCompatParcelizer = list;
        this.write = new ArrayList(list.size());
        this.read = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.write.add(list.get(i).read().read());
            this.read.add(list.get(i).write().read());
        }
    }

    public final List<sendMessageToTarget> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path>> write() {
        return this.write;
    }

    public final List<ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer>> IconCompatParcelizer() {
        return this.read;
    }
}
