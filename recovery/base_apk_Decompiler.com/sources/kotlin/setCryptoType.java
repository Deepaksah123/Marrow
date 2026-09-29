package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setCryptoType {
    private float AudioAttributesCompatParcelizer;
    private int read;

    public final void AudioAttributesCompatParcelizer(float f) {
        float f2 = this.AudioAttributesCompatParcelizer + f;
        this.AudioAttributesCompatParcelizer = f2;
        int i = this.read + 1;
        this.read = i;
        if (i == Integer.MAX_VALUE) {
            this.AudioAttributesCompatParcelizer = f2 / 2.0f;
            this.read = i / 2;
        }
    }
}
