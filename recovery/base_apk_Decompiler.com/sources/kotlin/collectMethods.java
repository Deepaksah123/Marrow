package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
final class collectMethods extends AnnotatedMethodMap<Boolean> implements forDeserialization.read, RandomAccess, getConstructorParameters {
    private boolean[] IconCompatParcelizer;
    private int read;

    static {
        new collectMethods(new boolean[0], 0).RemoteActionCompatParcelizer();
    }

    collectMethods() {
        this(new boolean[10], 0);
    }

    private collectMethods(boolean[] zArr, int i) {
        this.IconCompatParcelizer = zArr;
        this.read = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        IconCompatParcelizer();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.IconCompatParcelizer;
        System.arraycopy(zArr, i2, zArr, i, this.read - i2);
        this.read -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof collectMethods)) {
            return super.equals(obj);
        }
        collectMethods collectmethods = (collectMethods) obj;
        if (this.read != collectmethods.read) {
            return false;
        }
        boolean[] zArr = collectmethods.IconCompatParcelizer;
        for (int i = 0; i < this.read; i++) {
            if (this.IconCompatParcelizer[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iIconCompatParcelizer = 1;
        for (int i = 0; i < this.read; i++) {
            iIconCompatParcelizer = (iIconCompatParcelizer * 31) + forDeserialization.IconCompatParcelizer(this.IconCompatParcelizer[i]);
        }
        return iIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public forDeserialization.read AudioAttributesCompatParcelizer(int i) {
        if (i < this.read) {
            throw new IllegalArgumentException();
        }
        return new collectMethods(Arrays.copyOf(this.IconCompatParcelizer, i), this.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(write(i));
    }

    private boolean write(int i) {
        read(i);
        return this.IconCompatParcelizer[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(write(i, bool.booleanValue()));
    }

    private boolean write(int i, boolean z) {
        IconCompatParcelizer();
        read(i);
        boolean[] zArr = this.IconCompatParcelizer;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        write(bool.booleanValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        AudioAttributesCompatParcelizer(i, bool.booleanValue());
    }

    public final void write(boolean z) {
        IconCompatParcelizer();
        int i = this.read;
        boolean[] zArr = this.IconCompatParcelizer;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.IconCompatParcelizer = zArr2;
        }
        boolean[] zArr3 = this.IconCompatParcelizer;
        int i2 = this.read;
        this.read = i2 + 1;
        zArr3[i2] = z;
    }

    private void AudioAttributesCompatParcelizer(int i, boolean z) {
        int i2;
        IconCompatParcelizer();
        if (i < 0 || i > (i2 = this.read)) {
            throw new IndexOutOfBoundsException(IconCompatParcelizer(i));
        }
        boolean[] zArr = this.IconCompatParcelizer;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.IconCompatParcelizer, i, zArr2, i + 1, this.read - i);
            this.IconCompatParcelizer = zArr2;
        }
        this.IconCompatParcelizer[i] = z;
        this.read++;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        IconCompatParcelizer();
        forDeserialization.read(collection);
        if (!(collection instanceof collectMethods)) {
            return super.addAll(collection);
        }
        collectMethods collectmethods = (collectMethods) collection;
        int i = collectmethods.read;
        if (i == 0) {
            return false;
        }
        int i2 = this.read;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.IconCompatParcelizer;
        if (i3 > zArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(collectmethods.IconCompatParcelizer, 0, this.IconCompatParcelizer, this.read, collectmethods.read);
        this.read = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        IconCompatParcelizer();
        for (int i = 0; i < this.read; i++) {
            if (obj.equals(Boolean.valueOf(this.IconCompatParcelizer[i]))) {
                boolean[] zArr = this.IconCompatParcelizer;
                System.arraycopy(zArr, i + 1, zArr, i, (this.read - i) - 1);
                this.read--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        IconCompatParcelizer();
        read(i);
        boolean[] zArr = this.IconCompatParcelizer;
        boolean z = zArr[i];
        if (i < this.read - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.read--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    private void read(int i) {
        if (i < 0 || i >= this.read) {
            throw new IndexOutOfBoundsException(IconCompatParcelizer(i));
        }
    }

    private String IconCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.read);
        return sb.toString();
    }
}
