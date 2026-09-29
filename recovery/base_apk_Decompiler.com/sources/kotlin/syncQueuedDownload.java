package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class syncQueuedDownload<E> extends handleDownloadHelperCallbackMessage<E> implements RandomAccess {
    private static final syncQueuedDownload<Object> IconCompatParcelizer;
    private E[] RemoteActionCompatParcelizer;
    private int read;

    static {
        syncQueuedDownload<Object> syncqueueddownload = new syncQueuedDownload<>(new Object[0], 0);
        IconCompatParcelizer = syncqueueddownload;
        syncqueueddownload.RemoteActionCompatParcelizer();
    }

    public static <E> syncQueuedDownload<E> write() {
        return (syncQueuedDownload<E>) IconCompatParcelizer;
    }

    syncQueuedDownload() {
        this(new Object[10], 0);
    }

    private syncQueuedDownload(E[] eArr, int i) {
        this.RemoteActionCompatParcelizer = eArr;
        this.read = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.getDownloadIndex.MediaBrowserCompatItemReceiver
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public syncQueuedDownload<E> AudioAttributesCompatParcelizer(int i) {
        if (i < this.read) {
            throw new IllegalArgumentException();
        }
        return new syncQueuedDownload<>(Arrays.copyOf(this.RemoteActionCompatParcelizer, i), this.read);
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        read();
        int i = this.read;
        E[] eArr = this.RemoteActionCompatParcelizer;
        if (i == eArr.length) {
            this.RemoteActionCompatParcelizer = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.RemoteActionCompatParcelizer;
        int i2 = this.read;
        this.read = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        read();
        if (i < 0 || i > (i2 = this.read)) {
            throw new IndexOutOfBoundsException(read(i));
        }
        E[] eArr = this.RemoteActionCompatParcelizer;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) IconCompatParcelizer(((i2 * 3) / 2) + 1);
            System.arraycopy(this.RemoteActionCompatParcelizer, 0, eArr2, 0, i);
            System.arraycopy(this.RemoteActionCompatParcelizer, i, eArr2, i + 1, this.read - i);
            this.RemoteActionCompatParcelizer = eArr2;
        }
        this.RemoteActionCompatParcelizer[i] = e;
        this.read++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        RemoteActionCompatParcelizer(i);
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        read();
        RemoteActionCompatParcelizer(i);
        E[] eArr = this.RemoteActionCompatParcelizer;
        E e = eArr[i];
        if (i < this.read - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.read--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        read();
        RemoteActionCompatParcelizer(i);
        E[] eArr = this.RemoteActionCompatParcelizer;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    private static <E> E[] IconCompatParcelizer(int i) {
        return (E[]) new Object[i];
    }

    private void RemoteActionCompatParcelizer(int i) {
        if (i < 0 || i >= this.read) {
            throw new IndexOutOfBoundsException(read(i));
        }
    }

    private String read(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.read);
        return sb.toString();
    }
}
