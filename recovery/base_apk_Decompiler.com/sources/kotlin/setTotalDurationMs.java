package kotlin;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\rR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setTotalDurationMs;", "T", "", "", "p0", "<init>", "(I)V", "RemoteActionCompatParcelizer", "()I", "IconCompatParcelizer", "(I)Ljava/lang/Object;", "p1", "", "(ILjava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTotalDurationMs<T> {
    private volatile AtomicReferenceArray<T> array;

    public setTotalDurationMs(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int RemoteActionCompatParcelizer() {
        return this.array.length();
    }

    public final T IconCompatParcelizer(int p0) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (p0 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(p0);
        }
        return null;
    }

    public final void RemoteActionCompatParcelizer(int p0, T p1) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (p0 < length) {
            atomicReferenceArray.set(p0, p1);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(getQues.write(p0 + 1, length << 1));
        for (int i = 0; i < length; i++) {
            atomicReferenceArray2.set(i, atomicReferenceArray.get(i));
        }
        atomicReferenceArray2.set(p0, p1);
        this.array = atomicReferenceArray2;
    }
}
