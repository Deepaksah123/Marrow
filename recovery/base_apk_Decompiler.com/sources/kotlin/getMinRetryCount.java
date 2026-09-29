package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.getDownloadIndex;

/* JADX INFO: loaded from: classes3.dex */
final class getMinRetryCount extends handleDownloadHelperCallbackMessage<Integer> implements getDownloadIndex.IconCompatParcelizer, RandomAccess, onDownloadTaskStopped {
    private static final getMinRetryCount AudioAttributesCompatParcelizer;
    private int[] RemoteActionCompatParcelizer;
    private int read;

    static {
        getMinRetryCount getminretrycount = new getMinRetryCount(new int[0], 0);
        AudioAttributesCompatParcelizer = getminretrycount;
        getminretrycount.RemoteActionCompatParcelizer();
    }

    public static getMinRetryCount IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    getMinRetryCount() {
        this(new int[10], 0);
    }

    private getMinRetryCount(int[] iArr, int i) {
        this.RemoteActionCompatParcelizer = iArr;
        this.read = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        read();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        System.arraycopy(iArr, i2, iArr, i, this.read - i2);
        this.read -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMinRetryCount)) {
            return super.equals(obj);
        }
        getMinRetryCount getminretrycount = (getMinRetryCount) obj;
        if (this.read != getminretrycount.read) {
            return false;
        }
        int[] iArr = getminretrycount.RemoteActionCompatParcelizer;
        for (int i = 0; i < this.read; i++) {
            if (this.RemoteActionCompatParcelizer[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.read; i2++) {
            i = (i * 31) + this.RemoteActionCompatParcelizer[i2];
        }
        return i;
    }

    @Override // o.getDownloadIndex.MediaBrowserCompatItemReceiver
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getDownloadIndex.IconCompatParcelizer AudioAttributesCompatParcelizer(int i) {
        if (i < this.read) {
            throw new IllegalArgumentException();
        }
        return new getMinRetryCount(Arrays.copyOf(this.RemoteActionCompatParcelizer, i), this.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(write(i));
    }

    @Override // o.getDownloadIndex.IconCompatParcelizer
    public final int write(int i) {
        IconCompatParcelizer(i);
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.RemoteActionCompatParcelizer[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(read(i, num.intValue()));
    }

    private int read(int i, int i2) {
        read();
        IconCompatParcelizer(i);
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        RemoteActionCompatParcelizer(num.intValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        write(i, num.intValue());
    }

    @Override // o.getDownloadIndex.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(int i) {
        read();
        int i2 = this.read;
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.RemoteActionCompatParcelizer = iArr2;
        }
        int[] iArr3 = this.RemoteActionCompatParcelizer;
        int i3 = this.read;
        this.read = i3 + 1;
        iArr3[i3] = i;
    }

    private void write(int i, int i2) {
        int i3;
        read();
        if (i < 0 || i > (i3 = this.read)) {
            throw new IndexOutOfBoundsException(MediaBrowserCompatCustomActionResultReceiver(i));
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.RemoteActionCompatParcelizer, i, iArr2, i + 1, this.read - i);
            this.RemoteActionCompatParcelizer = iArr2;
        }
        this.RemoteActionCompatParcelizer[i] = i2;
        this.read++;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        read();
        getDownloadIndex.RemoteActionCompatParcelizer(collection);
        if (!(collection instanceof getMinRetryCount)) {
            return super.addAll(collection);
        }
        getMinRetryCount getminretrycount = (getMinRetryCount) collection;
        int i = getminretrycount.read;
        if (i == 0) {
            return false;
        }
        int i2 = this.read;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (i3 > iArr.length) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(getminretrycount.RemoteActionCompatParcelizer, 0, this.RemoteActionCompatParcelizer, this.read, getminretrycount.read);
        this.read = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        read();
        IconCompatParcelizer(i);
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i2 = iArr[i];
        if (i < this.read - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.read--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    private void IconCompatParcelizer(int i) {
        if (i < 0 || i >= this.read) {
            throw new IndexOutOfBoundsException(MediaBrowserCompatCustomActionResultReceiver(i));
        }
    }

    private String MediaBrowserCompatCustomActionResultReceiver(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.read);
        return sb.toString();
    }
}
