package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionCacheBooleanTriStateFalse implements UByteKeyDeserializer {
    final UByteKeyDeserializer IconCompatParcelizer;
    private int RemoteActionCompatParcelizer = 0;
    private int read = -1;
    private int write = -1;
    private Object AudioAttributesCompatParcelizer = null;

    public ReflectionCacheBooleanTriStateFalse(UByteKeyDeserializer uByteKeyDeserializer) {
        this.IconCompatParcelizer = uByteKeyDeserializer;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.IconCompatParcelizer.read(this.read, this.write);
        } else if (i == 2) {
            this.IconCompatParcelizer.write(this.read, this.write);
        } else if (i == 3) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.read, this.write, this.AudioAttributesCompatParcelizer);
        }
        this.AudioAttributesCompatParcelizer = null;
        this.RemoteActionCompatParcelizer = 0;
    }

    @Override // kotlin.UByteKeyDeserializer
    public final void read(int i, int i2) {
        int i3;
        if (this.RemoteActionCompatParcelizer == 1 && i >= (i3 = this.read)) {
            int i4 = this.write;
            if (i <= i3 + i4) {
                this.write = i4 + i2;
                this.read = Math.min(i, i3);
                return;
            }
        }
        RemoteActionCompatParcelizer();
        this.read = i;
        this.write = i2;
        this.RemoteActionCompatParcelizer = 1;
    }

    @Override // kotlin.UByteKeyDeserializer
    public final void write(int i, int i2) {
        int i3;
        if (this.RemoteActionCompatParcelizer == 2 && (i3 = this.read) >= i && i3 <= i + i2) {
            this.write += i2;
            this.read = i;
        } else {
            RemoteActionCompatParcelizer();
            this.read = i;
            this.write = i2;
            this.RemoteActionCompatParcelizer = 2;
        }
    }

    @Override // kotlin.UByteKeyDeserializer
    public final void RemoteActionCompatParcelizer(int i, int i2) {
        RemoteActionCompatParcelizer();
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(i, i2);
    }

    @Override // kotlin.UByteKeyDeserializer
    public final void IconCompatParcelizer(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.RemoteActionCompatParcelizer == 3 && i <= (i4 = this.write + (i3 = this.read)) && (i5 = i + i2) >= i3 && this.AudioAttributesCompatParcelizer == obj) {
            this.read = Math.min(i, i3);
            this.write = Math.max(i4, i5) - this.read;
            return;
        }
        RemoteActionCompatParcelizer();
        this.read = i;
        this.write = i2;
        this.AudioAttributesCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = 3;
    }
}
