package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getFixedSampleSize<T> extends getCurrentSampleFlags<T> {
    private T AudioAttributesCompatParcelizer;
    private AudioAttributesCompatParcelizer write = AudioAttributesCompatParcelizer.NOT_READY;

    enum AudioAttributesCompatParcelizer {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T write();

    protected getFixedSampleSize() {
    }

    protected final T IconCompatParcelizer() {
        this.write = AudioAttributesCompatParcelizer.DONE;
        return null;
    }

    /* JADX INFO: renamed from: o.getFixedSampleSize$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[AudioAttributesCompatParcelizer.values().length];
            write = iArr;
            try {
                iArr[AudioAttributesCompatParcelizer.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[AudioAttributesCompatParcelizer.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        parseStsd.IconCompatParcelizer(this.write != AudioAttributesCompatParcelizer.FAILED);
        int i = AnonymousClass1.write[this.write.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return RemoteActionCompatParcelizer();
        }
        return true;
    }

    private boolean RemoteActionCompatParcelizer() {
        this.write = AudioAttributesCompatParcelizer.FAILED;
        this.AudioAttributesCompatParcelizer = write();
        if (this.write == AudioAttributesCompatParcelizer.DONE) {
            return false;
        }
        this.write = AudioAttributesCompatParcelizer.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.write = AudioAttributesCompatParcelizer.NOT_READY;
        T t = (T) parseTfdt.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        this.AudioAttributesCompatParcelizer = null;
        return t;
    }
}
