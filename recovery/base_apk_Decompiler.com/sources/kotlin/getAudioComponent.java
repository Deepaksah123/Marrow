package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0012H\u0096\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001fJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010\u0015\u001a\u00020\u00128\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010$"}, d2 = {"Lo/getAudioComponent;", "", "Lo/getAudioComponent$AudioAttributesCompatParcelizer;", "", "p0", "<init>", "(Ljava/util/List;)V", "()V", "", "RemoteActionCompatParcelizer", "(Lo/getAudioComponent$AudioAttributesCompatParcelizer;)V", "read", "", "write", "(Lo/getAudioComponent$AudioAttributesCompatParcelizer;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "", "AudioAttributesCompatParcelizer", "(I)Lo/getAudioComponent$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(Lo/getAudioComponent$AudioAttributesCompatParcelizer;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "p1", "subList", "(II)Ljava/util/List;", "Ljava/util/List;", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAudioComponent implements List<AudioAttributesCompatParcelizer>, getCurrentAnsweredMcqProgress {
    private final List<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getAudioComponent$AudioAttributesCompatParcelizer;", "", "write", "()Ljava/lang/Object;", "", "IconCompatParcelizer", "()I", "read", "Lo/clearVideoFrameMetadataListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AudioAttributesCompatParcelizer {
        int IconCompatParcelizer();

        Object write();
    }

    private getAudioComponent(List<AudioAttributesCompatParcelizer> list) {
        this.AudioAttributesCompatParcelizer = list;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof AudioAttributesCompatParcelizer) {
            return write((AudioAttributesCompatParcelizer) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof AudioAttributesCompatParcelizer) {
            return IconCompatParcelizer((AudioAttributesCompatParcelizer) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof AudioAttributesCompatParcelizer) {
            return AudioAttributesCompatParcelizer((AudioAttributesCompatParcelizer) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return write();
    }

    public getAudioComponent() {
        this(new SnapshotStateList());
    }

    public final void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer p0) {
        this.AudioAttributesCompatParcelizer.add(p0);
    }

    public final void read(AudioAttributesCompatParcelizer p0) {
        this.AudioAttributesCompatParcelizer.remove(p0);
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AudioAttributesCompatParcelizer> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends AudioAttributesCompatParcelizer> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean write(AudioAttributesCompatParcelizer p0) {
        return this.AudioAttributesCompatParcelizer.contains(p0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> p0) {
        return this.AudioAttributesCompatParcelizer.containsAll(p0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final AudioAttributesCompatParcelizer get(int p0) {
        return this.AudioAttributesCompatParcelizer.get(p0);
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    public final int IconCompatParcelizer(AudioAttributesCompatParcelizer p0) {
        return this.AudioAttributesCompatParcelizer.indexOf(p0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.AudioAttributesCompatParcelizer.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<AudioAttributesCompatParcelizer> iterator() {
        return this.AudioAttributesCompatParcelizer.iterator();
    }

    public final int AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer p0) {
        return this.AudioAttributesCompatParcelizer.lastIndexOf(p0);
    }

    @Override // java.util.List
    public final ListIterator<AudioAttributesCompatParcelizer> listIterator() {
        return this.AudioAttributesCompatParcelizer.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<AudioAttributesCompatParcelizer> listIterator(int p0) {
        return this.AudioAttributesCompatParcelizer.listIterator(p0);
    }

    @Override // java.util.List
    public final /* synthetic */ AudioAttributesCompatParcelizer remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AudioAttributesCompatParcelizer> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ AudioAttributesCompatParcelizer set(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AudioAttributesCompatParcelizer> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AudioAttributesCompatParcelizer> subList(int p0, int p1) {
        return this.AudioAttributesCompatParcelizer.subList(p0, p1);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return markCompletelambda1.read(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
    }
}
