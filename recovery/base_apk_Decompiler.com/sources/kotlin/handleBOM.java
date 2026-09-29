package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c"}, d2 = {"Lo/handleBOM;", "T", "", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "p0", "", "p1", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "", "add", "(Ljava/lang/Object;)V", "hasNext", "next", "remove", "()V", "set", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "I", "RemoteActionCompatParcelizer", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleBOM<T> implements ListIterator<T>, getOffline {
    private int AudioAttributesCompatParcelizer;
    private final SnapshotStateList<T> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int write = -1;
    private int read;

    public handleBOM(SnapshotStateList<T> snapshotStateList, int i) {
        this.IconCompatParcelizer = snapshotStateList;
        this.AudioAttributesCompatParcelizer = i - 1;
        this.read = flog10threeQuartersPow2.IconCompatParcelizer(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.AudioAttributesCompatParcelizer >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.AudioAttributesCompatParcelizer + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        AudioAttributesCompatParcelizer();
        flog10threeQuartersPow2.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer.size());
        int i = this.AudioAttributesCompatParcelizer;
        this.write = i;
        this.AudioAttributesCompatParcelizer--;
        return this.IconCompatParcelizer.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public final void add(T p0) {
        AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer.add(this.AudioAttributesCompatParcelizer + 1, p0);
        this.write = -1;
        this.AudioAttributesCompatParcelizer++;
        this.read = flog10threeQuartersPow2.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.AudioAttributesCompatParcelizer < this.IconCompatParcelizer.size() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        AudioAttributesCompatParcelizer();
        int i = this.AudioAttributesCompatParcelizer + 1;
        this.write = i;
        flog10threeQuartersPow2.IconCompatParcelizer(i, this.IconCompatParcelizer.size());
        T t = this.IconCompatParcelizer.get(i);
        this.AudioAttributesCompatParcelizer = i;
        return t;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer.remove(this.write);
        this.AudioAttributesCompatParcelizer--;
        this.write = -1;
        this.read = flog10threeQuartersPow2.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    @Override // java.util.ListIterator
    public final void set(T p0) {
        AudioAttributesCompatParcelizer();
        int i = this.write;
        if (i < 0) {
            flog10threeQuartersPow2.write();
            throw new PlanDetailsCreator();
        }
        this.IconCompatParcelizer.set(i, p0);
        this.read = flog10threeQuartersPow2.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    private final void AudioAttributesCompatParcelizer() {
        if (flog10threeQuartersPow2.IconCompatParcelizer(this.IconCompatParcelizer) != this.read) {
            throw new ConcurrentModificationException();
        }
    }
}
