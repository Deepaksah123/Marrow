package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface fromAsset {

    public static final class IconCompatParcelizer implements fromAsset {
        private final String IconCompatParcelizer;

        public IconCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromAsset$AudioAttributesCompatParcelizer;", "Lo/fromAsset;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements fromAsset {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromAsset$read;", "Lo/fromAsset;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements fromAsset {
        public static final read INSTANCE = new read();

        private read() {
        }
    }

    public static final class RemoteActionCompatParcelizer implements fromAsset {
        private final String write;

        public RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String write() {
            return this.write;
        }
    }

    public static final class write implements fromAsset {
        private final String read;

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }
    }
}
