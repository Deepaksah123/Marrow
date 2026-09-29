package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class appendNumberOfSamples<T> implements onInputBufferAvailable<T> {
    private static final Object write = new Object();
    private volatile Object AudioAttributesCompatParcelizer = write;
    private volatile onInputBufferAvailable<T> read;

    public appendNumberOfSamples(onInputBufferAvailable<T> oninputbufferavailable) {
        this.read = oninputbufferavailable;
    }

    @Override // kotlin.onInputBufferAvailable
    public final T write() {
        T tWrite;
        T t = (T) this.AudioAttributesCompatParcelizer;
        Object obj = write;
        if (t != obj) {
            return t;
        }
        synchronized (this) {
            tWrite = (T) this.AudioAttributesCompatParcelizer;
            if (tWrite == obj) {
                tWrite = this.read.write();
                this.AudioAttributesCompatParcelizer = tWrite;
                this.read = null;
            }
        }
        return tWrite;
    }
}
