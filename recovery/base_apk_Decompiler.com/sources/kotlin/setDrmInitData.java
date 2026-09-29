package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public class setDrmInitData<T> {
    private T IconCompatParcelizer;
    private final setInitializationData<T> write;

    public setDrmInitData() {
        this.write = new setInitializationData<>();
        this.IconCompatParcelizer = null;
    }

    public setDrmInitData(T t) {
        this.write = new setInitializationData<>();
        this.IconCompatParcelizer = t;
    }

    public T write(setInitializationData<T> setinitializationdata) {
        return this.IconCompatParcelizer;
    }

    public final T RemoteActionCompatParcelizer(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return write(this.write.IconCompatParcelizer(f, f2, t, t2, f3, f4, f5));
    }
}
