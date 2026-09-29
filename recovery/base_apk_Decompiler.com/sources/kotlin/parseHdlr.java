package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class parseHdlr<T> implements Iterator<T> {
    private T read;
    private read write = read.NOT_READY;

    enum read {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T read();

    protected parseHdlr() {
    }

    protected final T write() {
        this.write = read.DONE;
        return null;
    }

    /* JADX INFO: renamed from: o.parseHdlr$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[read.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[read.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[read.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        parseStsd.IconCompatParcelizer(this.write != read.FAILED);
        int i = AnonymousClass1.IconCompatParcelizer[this.write.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return RemoteActionCompatParcelizer();
        }
        return true;
    }

    private boolean RemoteActionCompatParcelizer() {
        this.write = read.FAILED;
        this.read = read();
        if (this.write == read.DONE) {
            return false;
        }
        this.write = read.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.write = read.NOT_READY;
        T t = (T) parseSampleEntryEncryptionData.IconCompatParcelizer(this.read);
        this.read = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
