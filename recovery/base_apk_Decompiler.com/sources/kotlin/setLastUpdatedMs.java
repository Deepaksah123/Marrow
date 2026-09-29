package kotlin;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
final class setLastUpdatedMs extends setTotalFramesDropped<setLastUpdatedMs> {
    private final /* synthetic */ AtomicReferenceArray RemoteActionCompatParcelizer;

    public setLastUpdatedMs(long j, setLastUpdatedMs setlastupdatedms, int i) {
        super(j, setlastupdatedms, i);
        this.RemoteActionCompatParcelizer = new AtomicReferenceArray(setPytCount.read);
    }

    @Override // kotlin.setTotalFramesDropped
    public final int read() {
        return setPytCount.read;
    }

    @Override // kotlin.setTotalFramesDropped
    public final void write(int i, CurrentQuery currentQuery) {
        write().set(i, setPytCount.RemoteActionCompatParcelizer);
        MediaBrowserCompatSearchResultReceiver();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SemaphoreSegment[id=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", hashCode=");
        sb.append(hashCode());
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ AtomicReferenceArray write() {
        return this.RemoteActionCompatParcelizer;
    }
}
