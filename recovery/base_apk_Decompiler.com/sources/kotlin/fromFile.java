package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface fromFile {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromFile$IconCompatParcelizer;", "Lo/fromFile;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer implements fromFile {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }
    }

    public static final class read implements fromFile {
        private final int RemoteActionCompatParcelizer;

        public read(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        public final int read() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
