package kotlin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ExoPlayerImplExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class setShuffleModeEnabled<P extends ExoPlayerImplExternalSyntheticLambda0> {
    private final ArrayDeque<P> read;

    public setShuffleModeEnabled(int i, getCreatedOnDateMs<? extends P> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, i);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer, 10));
        Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
            arrayList.add(getcreatedondatems.invoke());
        }
        this.read = new ArrayDeque<>(arrayList);
    }

    public final P read() {
        P pPoll = this.read.poll();
        this.read.offer(pPoll);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pPoll, "");
        return pPoll;
    }

    public final void RemoteActionCompatParcelizer() {
        for (P p : this.read) {
        }
    }
}
