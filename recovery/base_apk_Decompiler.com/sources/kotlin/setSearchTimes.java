package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setSearchTimes<T> implements Iterable<T>, getCurrentAnsweredMcqProgress {
    public abstract T AudioAttributesCompatParcelizer(int i);

    public abstract void AudioAttributesCompatParcelizer(int i, T t);

    public abstract int RemoteActionCompatParcelizer();

    private setSearchTimes() {
    }

    public /* synthetic */ setSearchTimes(byte b) {
        this();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
