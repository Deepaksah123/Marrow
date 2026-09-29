package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class setWindowCallback<T> implements Iterator<T>, isModuleGeneratedVisible {
    private int AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;

    protected abstract void AudioAttributesCompatParcelizer(int i);

    protected abstract T write(int i);

    public setWindowCallback(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.AudioAttributesCompatParcelizer < this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tWrite = write(this.AudioAttributesCompatParcelizer);
        this.AudioAttributesCompatParcelizer++;
        this.IconCompatParcelizer = true;
        return tWrite;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.IconCompatParcelizer) {
            AppCompatImageButton.RemoteActionCompatParcelizer("Call next() before removing an element.");
        }
        int i = this.AudioAttributesCompatParcelizer - 1;
        this.AudioAttributesCompatParcelizer = i;
        AudioAttributesCompatParcelizer(i);
        this.RemoteActionCompatParcelizer--;
        this.IconCompatParcelizer = false;
    }
}
