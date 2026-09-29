package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@submitMagicModule
public final class setClientAuthTokenExpiry implements Collection<setClientAuthToken>, getCurrentAnsweredMcqProgress {
    private final byte[] write;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof setClientAuthToken) {
            return IconCompatParcelizer(((setClientAuthToken) obj).getRead());
        }
        return false;
    }

    private static int AudioAttributesCompatParcelizer(byte[] bArr) {
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int size() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    private static Iterator<setClientAuthToken> write(byte[] bArr) {
        return new RemoteActionCompatParcelizer(bArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<setClientAuthToken> iterator() {
        return write(this.write);
    }

    static final class RemoteActionCompatParcelizer implements Iterator<setClientAuthToken>, getCurrentAnsweredMcqProgress {
        private final byte[] IconCompatParcelizer;
        private int read;

        public RemoteActionCompatParcelizer(byte[] bArr) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            this.IconCompatParcelizer = bArr;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ setClientAuthToken next() {
            return setClientAuthToken.AudioAttributesCompatParcelizer(IconCompatParcelizer());
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.read < this.IconCompatParcelizer.length;
        }

        private byte IconCompatParcelizer() {
            int i = this.read;
            byte[] bArr = this.IconCompatParcelizer;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.read));
            }
            this.read = i + 1;
            return setClientAuthToken.IconCompatParcelizer(bArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private boolean IconCompatParcelizer(byte b) {
        return read(this.write, b);
    }

    private static boolean read(byte[] bArr, byte b) {
        return getOrderDetails.write(bArr, b);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return IconCompatParcelizer(this.write, collection);
    }

    private static boolean IconCompatParcelizer(byte[] bArr, Collection<setClientAuthToken> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        Collection<setClientAuthToken> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof setClientAuthToken) || !getOrderDetails.write(bArr, ((setClientAuthToken) obj).getRead())) {
                return false;
            }
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return RemoteActionCompatParcelizer(this.write);
    }

    private static boolean read(byte[] bArr, Object obj) {
        return (obj instanceof setClientAuthTokenExpiry) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(bArr, ((setClientAuthTokenExpiry) obj).read());
    }

    private static int read(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    private static String IconCompatParcelizer(byte[] bArr) {
        StringBuilder sb = new StringBuilder("UByteArray(storage=");
        sb.append(Arrays.toString(bArr));
        sb.append(')');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(setClientAuthToken setclientauthtoken) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends setClientAuthToken> collection) {
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
        return read(this.write);
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
        return IconCompatParcelizer(this.write);
    }

    public final /* synthetic */ byte[] read() {
        return this.write;
    }
}
