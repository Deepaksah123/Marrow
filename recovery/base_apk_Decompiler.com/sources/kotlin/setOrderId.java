package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@submitMagicModule
public final class setOrderId implements Collection<setClientId>, getCurrentAnsweredMcqProgress {
    private final long[] write;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof setClientId) {
            return RemoteActionCompatParcelizer(((setClientId) obj).getIconCompatParcelizer());
        }
        return false;
    }

    public static final long IconCompatParcelizer(long[] jArr, int i) {
        return setClientId.RemoteActionCompatParcelizer(jArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int size() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    private static int AudioAttributesCompatParcelizer(long[] jArr) {
        return jArr.length;
    }

    private static Iterator<setClientId> write(long[] jArr) {
        return new RemoteActionCompatParcelizer(jArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<setClientId> iterator() {
        return write(this.write);
    }

    static final class RemoteActionCompatParcelizer implements Iterator<setClientId>, getCurrentAnsweredMcqProgress {
        private final long[] RemoteActionCompatParcelizer;
        private int write;

        public RemoteActionCompatParcelizer(long[] jArr) {
            toMagicModuleMetaRepoModel.write(jArr, "");
            this.RemoteActionCompatParcelizer = jArr;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ setClientId next() {
            return setClientId.read(read());
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.write < this.RemoteActionCompatParcelizer.length;
        }

        private long read() {
            int i = this.write;
            long[] jArr = this.RemoteActionCompatParcelizer;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.write));
            }
            this.write = i + 1;
            return setClientId.RemoteActionCompatParcelizer(jArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private boolean RemoteActionCompatParcelizer(long j) {
        return read(this.write, j);
    }

    private static boolean read(long[] jArr, long j) {
        return getOrderDetails.RemoteActionCompatParcelizer(jArr, j);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return IconCompatParcelizer(this.write, (Collection<setClientId>) collection);
    }

    private static boolean IconCompatParcelizer(long[] jArr, Collection<setClientId> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        Collection<setClientId> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof setClientId) || !getOrderDetails.RemoteActionCompatParcelizer(jArr, ((setClientId) obj).getIconCompatParcelizer())) {
                return false;
            }
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(long[] jArr) {
        return jArr.length == 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return RemoteActionCompatParcelizer(this.write);
    }

    private static boolean read(long[] jArr, Object obj) {
        return (obj instanceof setOrderId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(jArr, ((setOrderId) obj).IconCompatParcelizer());
    }

    private static int IconCompatParcelizer(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    private static String read(long[] jArr) {
        StringBuilder sb = new StringBuilder("ULongArray(storage=");
        sb.append(Arrays.toString(jArr));
        sb.append(')');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(setClientId setclientid) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends setClientId> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return read(this.write, obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return IconCompatParcelizer(this.write);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return markCompletelambda1.read(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
    }

    public final String toString() {
        return read(this.write);
    }

    public final /* synthetic */ long[] IconCompatParcelizer() {
        return this.write;
    }
}
