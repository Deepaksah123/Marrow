package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setInitializationData<T> {
    private float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private float IconCompatParcelizer;
    private T MediaBrowserCompatCustomActionResultReceiver;
    private float RemoteActionCompatParcelizer;
    private T read;
    private float write;

    public final setInitializationData<T> IconCompatParcelizer(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.AudioAttributesImplApi21Parcelizer = f;
        this.write = f2;
        this.MediaBrowserCompatCustomActionResultReceiver = t;
        this.read = t2;
        this.RemoteActionCompatParcelizer = f3;
        this.AudioAttributesCompatParcelizer = f4;
        this.IconCompatParcelizer = f5;
        return this;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final T MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final T AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final float IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final float read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final float write() {
        return this.IconCompatParcelizer;
    }
}
