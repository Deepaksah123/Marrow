package kotlin;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
final class _appendShort<V> {
    private int AudioAttributesCompatParcelizer;
    private final SparseArray<V> IconCompatParcelizer;
    private final TypeSerializer<V> read;

    public _appendShort() {
        this(new TypeSerializer() { // from class: o._asBytes
            @Override // kotlin.TypeSerializer
            public final void read(Object obj) {
            }
        });
    }

    public _appendShort(TypeSerializer<V> typeSerializer) {
        this.IconCompatParcelizer = new SparseArray<>();
        this.read = typeSerializer;
        this.AudioAttributesCompatParcelizer = -1;
    }

    public final V RemoteActionCompatParcelizer(int i) {
        if (this.AudioAttributesCompatParcelizer == -1) {
            this.AudioAttributesCompatParcelizer = 0;
        }
        while (true) {
            int i2 = this.AudioAttributesCompatParcelizer;
            if (i2 <= 0 || i >= this.IconCompatParcelizer.keyAt(i2)) {
                break;
            }
            this.AudioAttributesCompatParcelizer--;
        }
        while (this.AudioAttributesCompatParcelizer < this.IconCompatParcelizer.size() - 1 && i >= this.IconCompatParcelizer.keyAt(this.AudioAttributesCompatParcelizer + 1)) {
            this.AudioAttributesCompatParcelizer++;
        }
        return this.IconCompatParcelizer.valueAt(this.AudioAttributesCompatParcelizer);
    }

    public final void IconCompatParcelizer(int i, V v) {
        if (this.AudioAttributesCompatParcelizer == -1) {
            buildTypeSerializer.write(this.IconCompatParcelizer.size() == 0);
            this.AudioAttributesCompatParcelizer = 0;
        }
        if (this.IconCompatParcelizer.size() > 0) {
            SparseArray<V> sparseArray = this.IconCompatParcelizer;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            buildTypeSerializer.IconCompatParcelizer(i >= iKeyAt);
            if (iKeyAt == i) {
                TypeSerializer<V> typeSerializer = this.read;
                SparseArray<V> sparseArray2 = this.IconCompatParcelizer;
                typeSerializer.read(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.IconCompatParcelizer.append(i, v);
    }

    public final V RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.valueAt(r1.size() - 1);
    }

    public final void IconCompatParcelizer(int i) {
        int i2 = 0;
        while (i2 < this.IconCompatParcelizer.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.IconCompatParcelizer.keyAt(i3)) {
                return;
            }
            this.read.read(this.IconCompatParcelizer.valueAt(i2));
            this.IconCompatParcelizer.removeAt(i2);
            int i4 = this.AudioAttributesCompatParcelizer;
            if (i4 > 0) {
                this.AudioAttributesCompatParcelizer = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final void write(int i) {
        for (int size = this.IconCompatParcelizer.size() - 1; size >= 0 && i < this.IconCompatParcelizer.keyAt(size); size--) {
            this.read.read(this.IconCompatParcelizer.valueAt(size));
            this.IconCompatParcelizer.removeAt(size);
        }
        this.AudioAttributesCompatParcelizer = this.IconCompatParcelizer.size() > 0 ? Math.min(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer.size() - 1) : -1;
    }

    public final void AudioAttributesCompatParcelizer() {
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            this.read.read(this.IconCompatParcelizer.valueAt(i));
        }
        this.AudioAttributesCompatParcelizer = -1;
        this.IconCompatParcelizer.clear();
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.size() == 0;
    }
}
