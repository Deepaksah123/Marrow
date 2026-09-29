package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class clearAllKeyRequestProperties {
    private final KeysExpiredException IconCompatParcelizer;

    static {
        new IconCompatParcelizer().write();
    }

    clearAllKeyRequestProperties(KeysExpiredException keysExpiredException) {
        this.IconCompatParcelizer = keysExpiredException;
    }

    public static IconCompatParcelizer RemoteActionCompatParcelizer() {
        return new IconCompatParcelizer();
    }

    public final KeysExpiredException AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static final class IconCompatParcelizer {
        private KeysExpiredException IconCompatParcelizer = null;

        IconCompatParcelizer() {
        }

        public final clearAllKeyRequestProperties write() {
            return new clearAllKeyRequestProperties(this.IconCompatParcelizer);
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(KeysExpiredException keysExpiredException) {
            this.IconCompatParcelizer = keysExpiredException;
            return this;
        }
    }
}
