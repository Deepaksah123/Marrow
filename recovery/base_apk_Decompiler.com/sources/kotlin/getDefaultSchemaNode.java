package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultSchemaNode {
    public final int AudioAttributesCompatParcelizer;
    public final long IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final float read;
    public final keyFormat write;

    /* synthetic */ getDefaultSchemaNode(keyFormat keyformat, int i, int i2, float f, long j, byte b) {
        this(keyformat, i, i2, f, j);
    }

    public static final class IconCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private float IconCompatParcelizer = 1.0f;
        private int RemoteActionCompatParcelizer;
        private long read;
        private keyFormat write;

        public IconCompatParcelizer(keyFormat keyformat, int i, int i2) {
            this.write = keyformat;
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(float f) {
            this.IconCompatParcelizer = f;
            return this;
        }

        public final getDefaultSchemaNode IconCompatParcelizer() {
            return new getDefaultSchemaNode(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read, (byte) 0);
        }
    }

    private getDefaultSchemaNode(keyFormat keyformat, int i, int i2, float f, long j) {
        buildTypeSerializer.write(i > 0, "width must be positive, but is: ".concat(String.valueOf(i)));
        buildTypeSerializer.write(i2 > 0, "height must be positive, but is: ".concat(String.valueOf(i2)));
        this.write = keyformat;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = f;
        this.IconCompatParcelizer = j;
    }
}
