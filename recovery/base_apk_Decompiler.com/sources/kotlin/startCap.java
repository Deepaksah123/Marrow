package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface startCap {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/startCap$read;", "Lo/startCap;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements startCap {
        public static final read INSTANCE = new read();

        private read() {
        }
    }

    public static final class IconCompatParcelizer implements startCap {
        private final String AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }
    }

    public static final class RemoteActionCompatParcelizer implements startCap {
        private final String read;

        public RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String write() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/startCap$AudioAttributesCompatParcelizer;", "Lo/startCap;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements startCap {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }
}
