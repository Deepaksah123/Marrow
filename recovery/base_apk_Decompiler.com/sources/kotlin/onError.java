package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onError<T> {
    public final float[] read;
    protected float write = 1.0f;
    protected float AudioAttributesCompatParcelizer = 1.0f;
    private int IconCompatParcelizer = 0;
    private int AudioAttributesImplBaseParcelizer = 0;
    protected int RemoteActionCompatParcelizer = 0;

    public onError(int i) {
        this.read = new float[i];
    }

    public final void write() {
        this.RemoteActionCompatParcelizer = 0;
    }

    public final int read() {
        return this.read.length;
    }

    public final void write(float f, float f2) {
        this.write = f;
        this.AudioAttributesCompatParcelizer = f2;
    }
}
