package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface setPositionWithSource {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setPositionWithSource$RemoteActionCompatParcelizer;", "Lo/setPositionWithSource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements setPositionWithSource {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }

    public static final class IconCompatParcelizer implements setPositionWithSource {
        private final int AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class write implements setPositionWithSource {
        private final String IconCompatParcelizer;

        public write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesCompatParcelizer implements setPositionWithSource {
        private final boolean IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(String str, boolean z) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = z;
        }

        public final boolean IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
