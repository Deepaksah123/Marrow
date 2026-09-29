package kotlin;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH\u0096\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0096\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0019J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\u0004\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b \u0010\"J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b$\u0010%R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0016\u0010(R\u0014\u0010\u0011\u001a\u00020\u000b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r"}, d2 = {"Lo/isInjectionOnly;", "Lo/_verifySetter;", "", "Lo/deserializeAndSet;", "p0", "<init>", "(Ljava/util/List;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "(Lo/deserializeAndSet;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "IconCompatParcelizer", "(I)Lo/deserializeAndSet;", "write", "(Lo/deserializeAndSet;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "p1", "subList", "(II)Ljava/util/List;", "read", "Ljava/util/List;", "()Ljava/util/List;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isInjectionOnly extends _verifySetter implements List<deserializeAndSet>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<deserializeAndSet> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public isInjectionOnly(List<? extends deserializeAndSet> list) {
        super(null);
        this.RemoteActionCompatParcelizer = list;
        if (list.isEmpty()) {
            withStackTrace.AudioAttributesCompatParcelizer("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof deserializeAndSet) {
            return AudioAttributesCompatParcelizer((deserializeAndSet) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof deserializeAndSet) {
            return write((deserializeAndSet) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof deserializeAndSet) {
            return IconCompatParcelizer((deserializeAndSet) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return write();
    }

    public final List<deserializeAndSet> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof isInjectionOnly) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((isInjectionOnly) p0).RemoteActionCompatParcelizer);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontListFontFamily(fonts=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, deserializeAndSet deserializeandset) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends deserializeAndSet> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends deserializeAndSet> collection) {
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

    public final boolean AudioAttributesCompatParcelizer(deserializeAndSet p0) {
        return this.RemoteActionCompatParcelizer.contains(p0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> p0) {
        return this.RemoteActionCompatParcelizer.containsAll(p0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final deserializeAndSet get(int p0) {
        return this.RemoteActionCompatParcelizer.get(p0);
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public final int write(deserializeAndSet p0) {
        return this.RemoteActionCompatParcelizer.indexOf(p0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.RemoteActionCompatParcelizer.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<deserializeAndSet> iterator() {
        return this.RemoteActionCompatParcelizer.iterator();
    }

    public final int IconCompatParcelizer(deserializeAndSet p0) {
        return this.RemoteActionCompatParcelizer.lastIndexOf(p0);
    }

    @Override // java.util.List
    public final ListIterator<deserializeAndSet> listIterator() {
        return this.RemoteActionCompatParcelizer.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<deserializeAndSet> listIterator(int p0) {
        return this.RemoteActionCompatParcelizer.listIterator(p0);
    }

    @Override // java.util.List
    public final /* synthetic */ deserializeAndSet remove(int i) {
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
    public final void replaceAll(UnaryOperator<deserializeAndSet> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ deserializeAndSet set(int i, deserializeAndSet deserializeandset) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super deserializeAndSet> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<deserializeAndSet> subList(int p0, int p1) {
        return this.RemoteActionCompatParcelizer.subList(p0, p1);
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
