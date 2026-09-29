package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setHeight {
    private float read;
    private float write;

    public setHeight(float f, float f2) {
        this.read = f;
        this.write = f2;
    }

    public setHeight() {
        this(1.0f, 1.0f);
    }

    public final float RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final float read() {
        return this.write;
    }

    public final void AudioAttributesCompatParcelizer(float f, float f2) {
        this.read = f;
        this.write = f2;
    }

    public final boolean IconCompatParcelizer() {
        return this.read == 1.0f && this.write == 1.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoteActionCompatParcelizer());
        sb.append("x");
        sb.append(read());
        return sb.toString();
    }
}
