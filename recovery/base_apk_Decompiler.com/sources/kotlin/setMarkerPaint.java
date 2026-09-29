package kotlin;

import com.google.android.exoplayer2.C;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\f\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013"}, d2 = {"Lo/setMarkerPaint;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/getMarkerPaint;", "write", "()Ljava/util/concurrent/atomic/AtomicReference;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/getMarkerPaint;)V", "AudioAttributesCompatParcelizer", "()Lo/getMarkerPaint;", "", "IconCompatParcelizer", "I", "Lo/getMarkerPaint;", "", "[Ljava/util/concurrent/atomic/AtomicReference;", "read"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setMarkerPaint {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final AtomicReference<getMarkerPaint>[] read;
    private static final int IconCompatParcelizer;
    public static final setMarkerPaint INSTANCE = new setMarkerPaint();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final int AudioAttributesCompatParcelizer = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final getMarkerPaint write = new getMarkerPaint(new byte[0], 0, 0, false);

    private setMarkerPaint() {
    }

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() << 1) - 1);
        IconCompatParcelizer = iHighestOneBit;
        AtomicReference<getMarkerPaint>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        read = atomicReferenceArr;
    }

    @getMagicModuleMeta
    public static final getMarkerPaint AudioAttributesCompatParcelizer() {
        AtomicReference<getMarkerPaint> atomicReferenceWrite = write();
        getMarkerPaint getmarkerpaint = write;
        getMarkerPaint andSet = atomicReferenceWrite.getAndSet(getmarkerpaint);
        if (andSet == getmarkerpaint) {
            return new getMarkerPaint();
        }
        if (andSet == null) {
            atomicReferenceWrite.set(null);
            return new getMarkerPaint();
        }
        atomicReferenceWrite.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(getMarkerPaint p0) {
        AtomicReference<getMarkerPaint> atomicReferenceWrite;
        getMarkerPaint getmarkerpaint;
        getMarkerPaint andSet;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.next != null || p0.prev != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (p0.shared || (andSet = (atomicReferenceWrite = write()).getAndSet((getmarkerpaint = write))) == getmarkerpaint) {
            return;
        }
        int i = andSet != null ? andSet.limit : 0;
        if (i >= AudioAttributesCompatParcelizer) {
            atomicReferenceWrite.set(andSet);
            return;
        }
        p0.next = andSet;
        p0.pos = 0;
        p0.limit = i + 8192;
        atomicReferenceWrite.set(p0);
    }

    private static AtomicReference<getMarkerPaint> write() {
        return read[(int) (Thread.currentThread().getId() & (((long) IconCompatParcelizer) - 1))];
    }
}
