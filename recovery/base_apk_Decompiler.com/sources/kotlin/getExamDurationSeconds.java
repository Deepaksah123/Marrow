package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum getExamDurationSeconds {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    private final String write;

    getExamDurationSeconds(String str) {
        this.write = str;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    static {
        new IconCompatParcelizer((byte) 0);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this == WARN;
    }

    public final boolean write() {
        return this == IGNORE;
    }
}
