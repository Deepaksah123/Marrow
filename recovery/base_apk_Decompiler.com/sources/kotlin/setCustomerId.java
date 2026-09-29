package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@submitMagicModule
public final class setCustomerId implements Collection<setCustomerPhone>, getCurrentAnsweredMcqProgress {
    private final short[] AudioAttributesCompatParcelizer;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof setCustomerPhone) {
            return read(((setCustomerPhone) obj).getWrite());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int size() {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    private static int RemoteActionCompatParcelizer(short[] sArr) {
        return sArr.length;
    }

    private static Iterator<setCustomerPhone> write(short[] sArr) {
        return new read(sArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<setCustomerPhone> iterator() {
        return write(this.AudioAttributesCompatParcelizer);
    }

    static final class read implements Iterator<setCustomerPhone>, getCurrentAnsweredMcqProgress {
        private int IconCompatParcelizer;
        private final short[] write;

        public read(short[] sArr) {
            toMagicModuleMetaRepoModel.write(sArr, "");
            this.write = sArr;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ setCustomerPhone next() {
            return setCustomerPhone.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer());
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.IconCompatParcelizer < this.write.length;
        }

        private short AudioAttributesCompatParcelizer() {
            int i = this.IconCompatParcelizer;
            short[] sArr = this.write;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.IconCompatParcelizer));
            }
            this.IconCompatParcelizer = i + 1;
            return setCustomerPhone.IconCompatParcelizer(sArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private boolean read(short s) {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, s);
    }

    private static boolean IconCompatParcelizer(short[] sArr, short s) {
        return getOrderDetails.AudioAttributesCompatParcelizer(sArr, s);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (Collection<setCustomerPhone>) collection);
    }

    private static boolean IconCompatParcelizer(short[] sArr, Collection<setCustomerPhone> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        Collection<setCustomerPhone> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof setCustomerPhone) || !getOrderDetails.AudioAttributesCompatParcelizer(sArr, ((setCustomerPhone) obj).getWrite())) {
                return false;
            }
        }
        return true;
    }

    private static boolean read(short[] sArr) {
        return sArr.length == 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return read(this.AudioAttributesCompatParcelizer);
    }

    private static boolean IconCompatParcelizer(short[] sArr, Object obj) {
        return (obj instanceof setCustomerId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(sArr, ((setCustomerId) obj).write());
    }

    private static int AudioAttributesCompatParcelizer(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    private static String IconCompatParcelizer(short[] sArr) {
        StringBuilder sb = new StringBuilder("UShortArray(storage=");
        sb.append(Arrays.toString(sArr));
        sb.append(')');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(setCustomerPhone setcustomerphone) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends setCustomerPhone> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
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
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final /* synthetic */ short[] write() {
        return this.AudioAttributesCompatParcelizer;
    }
}
