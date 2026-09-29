package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
final class asAnnotationMap extends AnnotatedMethodMap<Double> implements forDeserialization.write, RandomAccess, getConstructorParameters {
    private int read;
    private double[] write;

    static {
        new asAnnotationMap(new double[0], 0).RemoteActionCompatParcelizer();
    }

    asAnnotationMap() {
        this(new double[10], 0);
    }

    private asAnnotationMap(double[] dArr, int i) {
        this.write = dArr;
        this.read = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        IconCompatParcelizer();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.write;
        System.arraycopy(dArr, i2, dArr, i, this.read - i2);
        this.read -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asAnnotationMap)) {
            return super.equals(obj);
        }
        asAnnotationMap asannotationmap = (asAnnotationMap) obj;
        if (this.read != asannotationmap.read) {
            return false;
        }
        double[] dArr = asannotationmap.write;
        for (int i = 0; i < this.read; i++) {
            if (Double.doubleToLongBits(this.write[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.read; i2++) {
            i = (i * 31) + forDeserialization.read(Double.doubleToLongBits(this.write[i2]));
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public forDeserialization.write AudioAttributesCompatParcelizer(int i) {
        if (i < this.read) {
            throw new IllegalArgumentException();
        }
        return new asAnnotationMap(Arrays.copyOf(this.write, i), this.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(read(i));
    }

    private double read(int i) {
        IconCompatParcelizer(i);
        return this.write[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d) {
        return Double.valueOf(read(i, d.doubleValue()));
    }

    private double read(int i, double d) {
        IconCompatParcelizer();
        IconCompatParcelizer(i);
        double[] dArr = this.write;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d) {
        RemoteActionCompatParcelizer(d.doubleValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void add(int i, Double d) {
        write(i, d.doubleValue());
    }

    public final void RemoteActionCompatParcelizer(double d) {
        IconCompatParcelizer();
        int i = this.read;
        double[] dArr = this.write;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.write = dArr2;
        }
        double[] dArr3 = this.write;
        int i2 = this.read;
        this.read = i2 + 1;
        dArr3[i2] = d;
    }

    private void write(int i, double d) {
        int i2;
        IconCompatParcelizer();
        if (i < 0 || i > (i2 = this.read)) {
            throw new IndexOutOfBoundsException(write(i));
        }
        double[] dArr = this.write;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.write, i, dArr2, i + 1, this.read - i);
            this.write = dArr2;
        }
        this.write[i] = d;
        this.read++;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        IconCompatParcelizer();
        forDeserialization.read(collection);
        if (!(collection instanceof asAnnotationMap)) {
            return super.addAll(collection);
        }
        asAnnotationMap asannotationmap = (asAnnotationMap) collection;
        int i = asannotationmap.read;
        if (i == 0) {
            return false;
        }
        int i2 = this.read;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.write;
        if (i3 > dArr.length) {
            this.write = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(asannotationmap.write, 0, this.write, this.read, asannotationmap.read);
        this.read = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        IconCompatParcelizer();
        for (int i = 0; i < this.read; i++) {
            if (obj.equals(Double.valueOf(this.write[i]))) {
                double[] dArr = this.write;
                System.arraycopy(dArr, i + 1, dArr, i, (this.read - i) - 1);
                this.read--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        IconCompatParcelizer();
        IconCompatParcelizer(i);
        double[] dArr = this.write;
        double d = dArr[i];
        if (i < this.read - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.read--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    private void IconCompatParcelizer(int i) {
        if (i < 0 || i >= this.read) {
            throw new IndexOutOfBoundsException(write(i));
        }
    }

    private String write(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.read);
        return sb.toString();
    }
}
