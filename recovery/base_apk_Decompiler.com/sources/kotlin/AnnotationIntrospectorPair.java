package kotlin;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
final class AnnotationIntrospectorPair extends AnnotatedMethodMap<Float> implements forDeserialization.MediaBrowserCompatCustomActionResultReceiver, RandomAccess, getConstructorParameters {
    private float[] AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;

    static {
        new AnnotationIntrospectorPair(new float[0], 0).RemoteActionCompatParcelizer();
    }

    AnnotationIntrospectorPair() {
        this(new float[10], 0);
    }

    private AnnotationIntrospectorPair(float[] fArr, int i) {
        this.AudioAttributesCompatParcelizer = fArr;
        this.IconCompatParcelizer = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        IconCompatParcelizer();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.AudioAttributesCompatParcelizer;
        System.arraycopy(fArr, i2, fArr, i, this.IconCompatParcelizer - i2);
        this.IconCompatParcelizer -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotationIntrospectorPair)) {
            return super.equals(obj);
        }
        AnnotationIntrospectorPair annotationIntrospectorPair = (AnnotationIntrospectorPair) obj;
        if (this.IconCompatParcelizer != annotationIntrospectorPair.IconCompatParcelizer) {
            return false;
        }
        float[] fArr = annotationIntrospectorPair.AudioAttributesCompatParcelizer;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            if (Float.floatToIntBits(this.AudioAttributesCompatParcelizer[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.AudioAttributesCompatParcelizer[i]);
        }
        return iFloatToIntBits;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public forDeserialization.MediaBrowserCompatCustomActionResultReceiver AudioAttributesCompatParcelizer(int i) {
        if (i < this.IconCompatParcelizer) {
            throw new IllegalArgumentException();
        }
        return new AnnotationIntrospectorPair(Arrays.copyOf(this.AudioAttributesCompatParcelizer, i), this.IconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(write(i));
    }

    private float write(int i) {
        RemoteActionCompatParcelizer(i);
        return this.AudioAttributesCompatParcelizer[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(write(i, f.floatValue()));
    }

    private float write(int i, float f) {
        IconCompatParcelizer();
        RemoteActionCompatParcelizer(i);
        float[] fArr = this.AudioAttributesCompatParcelizer;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        write(f.floatValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        AudioAttributesCompatParcelizer(i, f.floatValue());
    }

    public final void write(float f) {
        IconCompatParcelizer();
        int i = this.IconCompatParcelizer;
        float[] fArr = this.AudioAttributesCompatParcelizer;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.AudioAttributesCompatParcelizer = fArr2;
        }
        float[] fArr3 = this.AudioAttributesCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        fArr3[i2] = f;
    }

    private void AudioAttributesCompatParcelizer(int i, float f) {
        int i2;
        IconCompatParcelizer();
        if (i < 0 || i > (i2 = this.IconCompatParcelizer)) {
            throw new IndexOutOfBoundsException(IconCompatParcelizer(i));
        }
        float[] fArr = this.AudioAttributesCompatParcelizer;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.AudioAttributesCompatParcelizer, i, fArr2, i + 1, this.IconCompatParcelizer - i);
            this.AudioAttributesCompatParcelizer = fArr2;
        }
        this.AudioAttributesCompatParcelizer[i] = f;
        this.IconCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        IconCompatParcelizer();
        forDeserialization.read(collection);
        if (!(collection instanceof AnnotationIntrospectorPair)) {
            return super.addAll(collection);
        }
        AnnotationIntrospectorPair annotationIntrospectorPair = (AnnotationIntrospectorPair) collection;
        int i = annotationIntrospectorPair.IconCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.IconCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.AudioAttributesCompatParcelizer;
        if (i3 > fArr.length) {
            this.AudioAttributesCompatParcelizer = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(annotationIntrospectorPair.AudioAttributesCompatParcelizer, 0, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, annotationIntrospectorPair.IconCompatParcelizer);
        this.IconCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        IconCompatParcelizer();
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            if (obj.equals(Float.valueOf(this.AudioAttributesCompatParcelizer[i]))) {
                float[] fArr = this.AudioAttributesCompatParcelizer;
                System.arraycopy(fArr, i + 1, fArr, i, (this.IconCompatParcelizer - i) - 1);
                this.IconCompatParcelizer--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        IconCompatParcelizer();
        RemoteActionCompatParcelizer(i);
        float[] fArr = this.AudioAttributesCompatParcelizer;
        float f = fArr[i];
        if (i < this.IconCompatParcelizer - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.IconCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    private void RemoteActionCompatParcelizer(int i) {
        if (i < 0 || i >= this.IconCompatParcelizer) {
            throw new IndexOutOfBoundsException(IconCompatParcelizer(i));
        }
    }

    private String IconCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
