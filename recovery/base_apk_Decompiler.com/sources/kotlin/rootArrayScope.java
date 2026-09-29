package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class rootArrayScope {
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;

    public final void IconCompatParcelizer(int i) {
        write(i, 0);
    }

    public final void write(int i, int i2) {
        if (i2 == 1) {
            this.RemoteActionCompatParcelizer = i;
        } else {
            this.IconCompatParcelizer = i;
        }
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer | this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer() {
        read(0);
    }

    public final void read(int i) {
        if (i == 1) {
            this.RemoteActionCompatParcelizer = 0;
        } else {
            this.IconCompatParcelizer = 0;
        }
    }
}
