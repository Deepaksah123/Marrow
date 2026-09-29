package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class setKeyRequestProperty {
    private final long AudioAttributesCompatParcelizer;
    private final long read;

    static {
        new IconCompatParcelizer().AudioAttributesCompatParcelizer();
    }

    setKeyRequestProperty(long j, long j2) {
        this.read = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    public static IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return new IconCompatParcelizer();
    }

    public final long write() {
        return this.read;
    }

    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static final class IconCompatParcelizer {
        private long read = 0;
        private long RemoteActionCompatParcelizer = 0;

        IconCompatParcelizer() {
        }

        public final setKeyRequestProperty AudioAttributesCompatParcelizer() {
            return new setKeyRequestProperty(this.read, this.RemoteActionCompatParcelizer);
        }

        public final IconCompatParcelizer read(long j) {
            this.read = j;
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = j;
            return this;
        }
    }
}
