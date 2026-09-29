package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
final class findFactoryMethodMetadata extends AnnotatedMethodMap<Long> implements forDeserialization.AudioAttributesImplApi26Parcelizer, RandomAccess, getConstructorParameters {
    private long[] IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;

    static {
        new findFactoryMethodMetadata(new long[0], 0).RemoteActionCompatParcelizer();
    }

    findFactoryMethodMetadata() {
        this(new long[10], 0);
    }

    private findFactoryMethodMetadata(long[] jArr, int i) {
        this.IconCompatParcelizer = jArr;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        IconCompatParcelizer();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.IconCompatParcelizer;
        System.arraycopy(jArr, i2, jArr, i, this.RemoteActionCompatParcelizer - i2);
        this.RemoteActionCompatParcelizer -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findFactoryMethodMetadata)) {
            return super.equals(obj);
        }
        findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) obj;
        if (this.RemoteActionCompatParcelizer != findfactorymethodmetadata.RemoteActionCompatParcelizer) {
            return false;
        }
        long[] jArr = findfactorymethodmetadata.IconCompatParcelizer;
        for (int i = 0; i < this.RemoteActionCompatParcelizer; i++) {
            if (this.IconCompatParcelizer[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.RemoteActionCompatParcelizer; i2++) {
            i = (i * 31) + forDeserialization.read(this.IconCompatParcelizer[i2]);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public forDeserialization.AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer(int i) {
        if (i < this.RemoteActionCompatParcelizer) {
            throw new IllegalArgumentException();
        }
        return new findFactoryMethodMetadata(Arrays.copyOf(this.IconCompatParcelizer, i), this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(read(i));
    }

    public final long read(int i) {
        write(i);
        return this.IconCompatParcelizer[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l) {
        return Long.valueOf(read(i, l.longValue()));
    }

    private long read(int i, long j) {
        IconCompatParcelizer();
        write(i);
        long[] jArr = this.IconCompatParcelizer;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        AudioAttributesCompatParcelizer(l.longValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l) {
        write(i, l.longValue());
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        IconCompatParcelizer();
        int i = this.RemoteActionCompatParcelizer;
        long[] jArr = this.IconCompatParcelizer;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.IconCompatParcelizer = jArr2;
        }
        long[] jArr3 = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        jArr3[i2] = j;
    }

    private void write(int i, long j) {
        int i2;
        IconCompatParcelizer();
        if (i < 0 || i > (i2 = this.RemoteActionCompatParcelizer)) {
            throw new IndexOutOfBoundsException(IconCompatParcelizer(i));
        }
        long[] jArr = this.IconCompatParcelizer;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.IconCompatParcelizer, i, jArr2, i + 1, this.RemoteActionCompatParcelizer - i);
            this.IconCompatParcelizer = jArr2;
        }
        this.IconCompatParcelizer[i] = j;
        this.RemoteActionCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        IconCompatParcelizer();
        forDeserialization.read(collection);
        if (!(collection instanceof findFactoryMethodMetadata)) {
            return super.addAll(collection);
        }
        findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) collection;
        int i = findfactorymethodmetadata.RemoteActionCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.RemoteActionCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.IconCompatParcelizer;
        if (i3 > jArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(findfactorymethodmetadata.IconCompatParcelizer, 0, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, findfactorymethodmetadata.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        IconCompatParcelizer();
        for (int i = 0; i < this.RemoteActionCompatParcelizer; i++) {
            if (obj.equals(Long.valueOf(this.IconCompatParcelizer[i]))) {
                long[] jArr = this.IconCompatParcelizer;
                System.arraycopy(jArr, i + 1, jArr, i, (this.RemoteActionCompatParcelizer - i) - 1);
                this.RemoteActionCompatParcelizer--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        IconCompatParcelizer();
        write(i);
        long[] jArr = this.IconCompatParcelizer;
        long j = jArr[i];
        if (i < this.RemoteActionCompatParcelizer - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.RemoteActionCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    private void write(int i) {
        if (i < 0 || i >= this.RemoteActionCompatParcelizer) {
            throw new IndexOutOfBoundsException(IconCompatParcelizer(i));
        }
    }

    private String IconCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.RemoteActionCompatParcelizer);
        return sb.toString();
    }
}
