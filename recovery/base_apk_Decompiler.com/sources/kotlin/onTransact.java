package kotlin;

/* JADX INFO: loaded from: classes.dex */
public interface onTransact {
    public static final IconCompatParcelizer.read AudioAttributesCompatParcelizer;
    public static final IconCompatParcelizer.C0128IconCompatParcelizer read;

    static {
        byte b = 0;
        read = new IconCompatParcelizer.C0128IconCompatParcelizer(b);
        AudioAttributesCompatParcelizer = new IconCompatParcelizer.read(b);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        /* JADX INFO: renamed from: o.onTransact$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        public static final class C0128IconCompatParcelizer extends IconCompatParcelizer {
            /* synthetic */ C0128IconCompatParcelizer(byte b) {
                this();
            }

            private C0128IconCompatParcelizer() {
            }

            public final String toString() {
                return "SUCCESS";
            }
        }

        public static final class read extends IconCompatParcelizer {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
            }

            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class RemoteActionCompatParcelizer extends IconCompatParcelizer {
            private final Throwable RemoteActionCompatParcelizer;

            public RemoteActionCompatParcelizer(Throwable th) {
                this.RemoteActionCompatParcelizer = th;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FAILURE (");
                sb.append(this.RemoteActionCompatParcelizer.getMessage());
                sb.append(")");
                return sb.toString();
            }
        }
    }
}
