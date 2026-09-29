package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface setIncludeUntagged {
    static {
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.write;
    }

    boolean IconCompatParcelizer();

    public static final class read implements setIncludeUntagged {
        public static final read IconCompatParcelizer = new read();

        @Override // kotlin.setIncludeUntagged
        public final boolean IconCompatParcelizer() {
            return false;
        }

        private read() {
        }
    }

    public static final class IconCompatParcelizer {
        static final /* synthetic */ IconCompatParcelizer write = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }
    }
}
