package kotlin;

/* JADX INFO: loaded from: classes.dex */
public interface onFlushCompleted<T> {

    /* JADX INFO: loaded from: classes3.dex */
    public interface AudioAttributesCompatParcelizer<T> {
        void read(onInputBufferAvailable<T> oninputbufferavailable);
    }

    void write(AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer);
}
