package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.getDownloadIndex;

/* JADX INFO: loaded from: classes3.dex */
final class getNotMetRequirements extends handleDownloadHelperCallbackMessage<Long> implements getDownloadIndex.RemoteActionCompatParcelizer, RandomAccess, onDownloadTaskStopped {
    private long[] AudioAttributesCompatParcelizer;
    private int write;

    static {
        new getNotMetRequirements(new long[0], 0).RemoteActionCompatParcelizer();
    }

    getNotMetRequirements() {
        this(new long[10], 0);
    }

    private getNotMetRequirements(long[] jArr, int i) {
        this.AudioAttributesCompatParcelizer = jArr;
        this.write = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        read();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.AudioAttributesCompatParcelizer;
        System.arraycopy(jArr, i2, jArr, i, this.write - i2);
        this.write -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNotMetRequirements)) {
            return super.equals(obj);
        }
        getNotMetRequirements getnotmetrequirements = (getNotMetRequirements) obj;
        if (this.write != getnotmetrequirements.write) {
            return false;
        }
        long[] jArr = getnotmetrequirements.AudioAttributesCompatParcelizer;
        for (int i = 0; i < this.write; i++) {
            if (this.AudioAttributesCompatParcelizer[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.write; i2++) {
            i = (i * 31) + getDownloadIndex.read(this.AudioAttributesCompatParcelizer[i2]);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.getDownloadIndex.MediaBrowserCompatItemReceiver
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public getDownloadIndex.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
        if (i < this.write) {
            throw new IllegalArgumentException();
        }
        return new getNotMetRequirements(Arrays.copyOf(this.AudioAttributesCompatParcelizer, i), this.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(RemoteActionCompatParcelizer(i));
    }

    public final long RemoteActionCompatParcelizer(int i) {
        IconCompatParcelizer(i);
        return this.AudioAttributesCompatParcelizer[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.AudioAttributesCompatParcelizer[i] == jLongValue) {
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
        return this.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l) {
        return Long.valueOf(RemoteActionCompatParcelizer(i, l.longValue()));
    }

    private long RemoteActionCompatParcelizer(int i, long j) {
        read();
        IconCompatParcelizer(i);
        long[] jArr = this.AudioAttributesCompatParcelizer;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        AudioAttributesCompatParcelizer(l.longValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l) {
        write(i, l.longValue());
    }

    private void AudioAttributesCompatParcelizer(long j) {
        read();
        int i = this.write;
        long[] jArr = this.AudioAttributesCompatParcelizer;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.AudioAttributesCompatParcelizer = jArr2;
        }
        long[] jArr3 = this.AudioAttributesCompatParcelizer;
        int i2 = this.write;
        this.write = i2 + 1;
        jArr3[i2] = j;
    }

    private void write(int i, long j) {
        int i2;
        read();
        if (i < 0 || i > (i2 = this.write)) {
            throw new IndexOutOfBoundsException(read(i));
        }
        long[] jArr = this.AudioAttributesCompatParcelizer;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.AudioAttributesCompatParcelizer, i, jArr2, i + 1, this.write - i);
            this.AudioAttributesCompatParcelizer = jArr2;
        }
        this.AudioAttributesCompatParcelizer[i] = j;
        this.write++;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        read();
        getDownloadIndex.RemoteActionCompatParcelizer(collection);
        if (!(collection instanceof getNotMetRequirements)) {
            return super.addAll(collection);
        }
        getNotMetRequirements getnotmetrequirements = (getNotMetRequirements) collection;
        int i = getnotmetrequirements.write;
        if (i == 0) {
            return false;
        }
        int i2 = this.write;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.AudioAttributesCompatParcelizer;
        if (i3 > jArr.length) {
            this.AudioAttributesCompatParcelizer = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(getnotmetrequirements.AudioAttributesCompatParcelizer, 0, this.AudioAttributesCompatParcelizer, this.write, getnotmetrequirements.write);
        this.write = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        read();
        IconCompatParcelizer(i);
        long[] jArr = this.AudioAttributesCompatParcelizer;
        long j = jArr[i];
        if (i < this.write - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.write--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    private void IconCompatParcelizer(int i) {
        if (i < 0 || i >= this.write) {
            throw new IndexOutOfBoundsException(read(i));
        }
    }

    private String read(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.write);
        return sb.toString();
    }
}
