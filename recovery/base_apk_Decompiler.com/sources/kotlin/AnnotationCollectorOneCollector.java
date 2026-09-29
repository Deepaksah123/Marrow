package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
final class AnnotationCollectorOneCollector extends AnnotatedMethodMap<Integer> implements forDeserialization.MediaBrowserCompatItemReceiver, RandomAccess, getConstructorParameters {
    private int[] RemoteActionCompatParcelizer;
    private int read;

    static {
        new AnnotationCollectorOneCollector(new int[0], 0).RemoteActionCompatParcelizer();
    }

    AnnotationCollectorOneCollector() {
        this(new int[10], 0);
    }

    private AnnotationCollectorOneCollector(int[] iArr, int i) {
        this.RemoteActionCompatParcelizer = iArr;
        this.read = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        IconCompatParcelizer();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        System.arraycopy(iArr, i2, iArr, i, this.read - i2);
        this.read -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotationCollectorOneCollector)) {
            return super.equals(obj);
        }
        AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) obj;
        if (this.read != annotationCollectorOneCollector.read) {
            return false;
        }
        int[] iArr = annotationCollectorOneCollector.RemoteActionCompatParcelizer;
        for (int i = 0; i < this.read; i++) {
            if (this.RemoteActionCompatParcelizer[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.read; i2++) {
            i = (i * 31) + this.RemoteActionCompatParcelizer[i2];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public forDeserialization.MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer(int i) {
        if (i < this.read) {
            throw new IllegalArgumentException();
        }
        return new AnnotationCollectorOneCollector(Arrays.copyOf(this.RemoteActionCompatParcelizer, i), this.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(RemoteActionCompatParcelizer(i));
    }

    public final int RemoteActionCompatParcelizer(int i) {
        IconCompatParcelizer(i);
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(write(i, num.intValue()));
    }

    private int write(int i, int i2) {
        IconCompatParcelizer();
        IconCompatParcelizer(i);
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        write(num.intValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        read(i, num.intValue());
    }

    public final void write(int i) {
        IconCompatParcelizer();
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

    private void read(int i, int i2) {
        int i3;
        IconCompatParcelizer();
        if (i < 0 || i > (i3 = this.read)) {
            throw new IndexOutOfBoundsException(read(i));
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

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        IconCompatParcelizer();
        forDeserialization.read(collection);
        if (!(collection instanceof AnnotationCollectorOneCollector)) {
            return super.addAll(collection);
        }
        AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) collection;
        int i = annotationCollectorOneCollector.read;
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
        System.arraycopy(annotationCollectorOneCollector.RemoteActionCompatParcelizer, 0, this.RemoteActionCompatParcelizer, this.read, annotationCollectorOneCollector.read);
        this.read = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        IconCompatParcelizer();
        for (int i = 0; i < this.read; i++) {
            if (obj.equals(Integer.valueOf(this.RemoteActionCompatParcelizer[i]))) {
                int[] iArr = this.RemoteActionCompatParcelizer;
                System.arraycopy(iArr, i + 1, iArr, i, (this.read - i) - 1);
                this.read--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        IconCompatParcelizer();
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
