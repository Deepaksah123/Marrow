package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class parseTkhd {
    static {
        AudioAttributesCompatParcelizer();
    }

    private static boolean write(String str) {
        return str == null || str.isEmpty();
    }

    static String read(String str) {
        return str == null ? "" : str;
    }

    static String IconCompatParcelizer(String str) {
        if (write(str)) {
            return null;
        }
        return str;
    }

    private static parseTrak AudioAttributesCompatParcelizer() {
        return new RemoteActionCompatParcelizer((byte) 0);
    }

    static final class RemoteActionCompatParcelizer implements parseTrak {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }
}
