package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface ProjectionMesh {

    public static final class read implements ProjectionMesh {
        private final String write;

        public read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }
    }

    public static final class write implements ProjectionMesh {
        private final boolean AudioAttributesCompatParcelizer;

        public write(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
        }

        public final boolean write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ProjectionMesh$AudioAttributesCompatParcelizer;", "Lo/ProjectionMesh;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements ProjectionMesh {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ProjectionMesh$RemoteActionCompatParcelizer;", "Lo/ProjectionMesh;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements ProjectionMesh {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }
}
