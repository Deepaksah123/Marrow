package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class KeysExpiredException {
    private final long AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;

    static {
        new AudioAttributesCompatParcelizer().read();
    }

    KeysExpiredException(long j, long j2) {
        this.AudioAttributesCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
    }

    public static AudioAttributesCompatParcelizer read() {
        return new AudioAttributesCompatParcelizer();
    }

    public final long write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static final class AudioAttributesCompatParcelizer {
        private long RemoteActionCompatParcelizer = 0;
        private long IconCompatParcelizer = 0;

        AudioAttributesCompatParcelizer() {
        }

        public final KeysExpiredException read() {
            return new KeysExpiredException(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = j;
            return this;
        }

        public final AudioAttributesCompatParcelizer write(long j) {
            this.IconCompatParcelizer = j;
            return this;
        }
    }
}
