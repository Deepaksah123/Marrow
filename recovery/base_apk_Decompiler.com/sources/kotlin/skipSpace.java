package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u001f\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ%\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010\fJ\u001d\u0010&\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u0017\u0010'\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0011J\u001d\u0010(\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b(\u0010\u000fJ \u0010)\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b)\u0010*J%\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b-\u0010 R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00101R$\u0010-\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b0\u00103"}, d2 = {"Lo/skipSpace;", "T", "", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "p0", "", "p1", "p2", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "AudioAttributesCompatParcelizer", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "write", "I", "read", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class skipSpace<T> implements List<T>, getModulesCompleted {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final SnapshotStateList<T> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    public skipSpace(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.write = snapshotStateList;
        this.read = i;
        this.AudioAttributesCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(snapshotStateList);
        this.IconCompatParcelizer = i2 - i;
    }

    @Override // java.util.List
    public final T remove(int i) {
        return AudioAttributesCompatParcelizer(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getIconCompatParcelizer();
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object p0) {
        return indexOf(p0) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> p0) {
        Collection<?> collection = p0;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int p0) {
        IconCompatParcelizer();
        flog10threeQuartersPow2.IconCompatParcelizer(p0, size());
        return this.write.get(this.read + p0);
    }

    @Override // java.util.List
    public final int indexOf(Object p0) {
        IconCompatParcelizer();
        int i = this.read;
        Iterator<Integer> it = getQues.IconCompatParcelizer(i, size() + i).iterator();
        while (it.hasNext()) {
            int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write.get(iRemoteActionCompatParcelizer))) {
                return iRemoteActionCompatParcelizer - this.read;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object p0) {
        IconCompatParcelizer();
        int size = this.read + size();
        do {
            size--;
            if (size < this.read) {
                return -1;
            }
        } while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write.get(size)));
        return size - this.read;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T p0) {
        IconCompatParcelizer();
        this.write.add(this.read + size(), p0);
        this.IconCompatParcelizer = size() + 1;
        this.AudioAttributesCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(this.write);
        return true;
    }

    @Override // java.util.List
    public final void add(int p0, T p1) {
        IconCompatParcelizer();
        this.write.add(this.read + p0, p1);
        this.IconCompatParcelizer = size() + 1;
        this.AudioAttributesCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(this.write);
    }

    @Override // java.util.List
    public final boolean addAll(int p0, Collection<? extends T> p1) {
        IconCompatParcelizer();
        boolean zAddAll = this.write.addAll(p0 + this.read, p1);
        if (zAddAll) {
            this.IconCompatParcelizer = size() + p1.size();
            this.AudioAttributesCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(this.write);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> p0) {
        return addAll(size(), p0);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (size() > 0) {
            IconCompatParcelizer();
            SnapshotStateList<T> snapshotStateList = this.write;
            int i = this.read;
            snapshotStateList.AudioAttributesCompatParcelizer(i, size() + i);
            this.IconCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(this.write);
        }
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int p0) {
        IconCompatParcelizer();
        MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer = p0 - 1;
        return new AudioAttributesCompatParcelizer(iconCompatParcelizer, this);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000e"}, d2 = {"Lo/skipSpace$AudioAttributesCompatParcelizer;", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "read", "()Ljava/lang/Void;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements ListIterator<T>, getOffline {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer AudioAttributesCompatParcelizer;
        final /* synthetic */ skipSpace<T> RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, skipSpace<T> skipspace) {
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = skipspace;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer >= 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            flog10threeQuartersPow2.IconCompatParcelizer(i, this.RemoteActionCompatParcelizer.size());
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = i - 1;
            return this.RemoteActionCompatParcelizer.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Void add(T p0) {
            flog10threeQuartersPow2.AudioAttributesCompatParcelizer();
            throw new PlanDetailsCreator();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer < this.RemoteActionCompatParcelizer.size() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer + 1;
            flog10threeQuartersPow2.IconCompatParcelizer(i, this.RemoteActionCompatParcelizer.size());
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = i;
            return this.RemoteActionCompatParcelizer.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Void remove() {
            flog10threeQuartersPow2.AudioAttributesCompatParcelizer();
            throw new PlanDetailsCreator();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Void set(T p0) {
            flog10threeQuartersPow2.AudioAttributesCompatParcelizer();
            throw new PlanDetailsCreator();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> p0) {
        boolean z;
        Iterator<?> it = p0.iterator();
        while (true) {
            while (it.hasNext()) {
                z = remove(it.next()) || z;
            }
            return z;
        }
    }

    public final T AudioAttributesCompatParcelizer(int p0) {
        IconCompatParcelizer();
        T tRemove = this.write.remove(this.read + p0);
        this.IconCompatParcelizer = size() - 1;
        this.AudioAttributesCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(this.write);
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> p0) {
        IconCompatParcelizer();
        SnapshotStateList<T> snapshotStateList = this.write;
        int i = this.read;
        int iRemoteActionCompatParcelizer = snapshotStateList.RemoteActionCompatParcelizer(p0, i, size() + i);
        if (iRemoteActionCompatParcelizer > 0) {
            this.AudioAttributesCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(this.write);
            this.IconCompatParcelizer = size() - iRemoteActionCompatParcelizer;
        }
        return iRemoteActionCompatParcelizer > 0;
    }

    @Override // java.util.List
    public final T set(int p0, T p1) {
        flog10threeQuartersPow2.IconCompatParcelizer(p0, size());
        IconCompatParcelizer();
        T t = this.write.set(p0 + this.read, p1);
        this.AudioAttributesCompatParcelizer = flog10threeQuartersPow2.IconCompatParcelizer(this.write);
        return t;
    }

    @Override // java.util.List
    public final List<T> subList(int p0, int p1) {
        if (p0 < 0 || p0 > p1 || p1 > size()) {
            getInputCodeUtf8JsNames.write("fromIndex or toIndex are out of bounds");
        }
        IconCompatParcelizer();
        SnapshotStateList<T> snapshotStateList = this.write;
        int i = this.read;
        return new skipSpace(snapshotStateList, p0 + i, p1 + i);
    }

    private final void IconCompatParcelizer() {
        if (flog10threeQuartersPow2.IconCompatParcelizer(this.write) != this.AudioAttributesCompatParcelizer) {
            throw new ConcurrentModificationException();
        }
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
