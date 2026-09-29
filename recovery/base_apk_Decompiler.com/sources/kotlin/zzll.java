package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface zzll {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzll$read;", "Lo/zzll;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements zzll {
        public static final read INSTANCE = new read();

        private read() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzll$IconCompatParcelizer;", "Lo/zzll;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer implements zzll {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }
    }

    public static final class RemoteActionCompatParcelizer implements zzll {
        private final String read;

        public RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String write() {
            return this.read;
        }
    }
}
