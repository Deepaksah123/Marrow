package kotlin;

import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.plan.Subscription;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class haveReadFromMediaChunk implements discardUpstreamMediaChunksFromIndex {
    private final ApplicationData AudioAttributesCompatParcelizer;
    private final newChunkExtractor RemoteActionCompatParcelizer;
    private final getAvailableSegmentCount read;

    @setSdkPayload
    public haveReadFromMediaChunk(newChunkExtractor newchunkextractor, getAvailableSegmentCount getavailablesegmentcount, ApplicationData applicationData) {
        toMagicModuleMetaRepoModel.write(newchunkextractor, "");
        toMagicModuleMetaRepoModel.write(getavailablesegmentcount, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        this.RemoteActionCompatParcelizer = newchunkextractor;
        this.read = getavailablesegmentcount;
        this.AudioAttributesCompatParcelizer = applicationData;
    }

    @Override // kotlin.discardUpstreamMediaChunksFromIndex
    public final void write(List<? extends Subscription> list) {
        Object next;
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(list.toArray(new Subscription[0]));
        this.AudioAttributesCompatParcelizer.refreshSubscription();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Subscription) next).isVideo()) {
                    break;
                }
            }
        }
        if (next != null) {
            this.read.AudioAttributesCompatParcelizer();
            this.read.write();
        }
    }

    @Override // kotlin.discardUpstreamMediaChunksFromIndex
    public final void read() {
        this.RemoteActionCompatParcelizer.ah_();
    }
}
