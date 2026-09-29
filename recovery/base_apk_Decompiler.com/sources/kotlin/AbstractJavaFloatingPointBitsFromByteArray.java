package kotlin;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0011R\"\u0010\u0010\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0012\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0010\u0010\u0015"}, d2 = {"Lo/AbstractJavaFloatingPointBitsFromByteArray;", "E", "", "", "p0", "p1", "<init>", "(II)V", "", "hasNext", "()Z", "hasPrevious", "nextIndex", "()I", "previousIndex", "", "AudioAttributesCompatParcelizer", "()V", "read", "I", "write", "(I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractJavaFloatingPointBitsFromByteArray<E> implements ListIterator<E>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    public AbstractJavaFloatingPointBitsFromByteArray(int i, int i2) {
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.IconCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void read(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.AudioAttributesCompatParcelizer < this.IconCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.AudioAttributesCompatParcelizer > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.AudioAttributesCompatParcelizer - 1;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void read() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
