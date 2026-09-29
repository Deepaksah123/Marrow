package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface writeIBinderSparseArray {

    public static final class IconCompatParcelizer implements writeIBinderSparseArray {
        private final String IconCompatParcelizer;
        private final limit RemoteActionCompatParcelizer;
        private final String write;

        public IconCompatParcelizer(String str, String str2, limit limitVar) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(limitVar, "");
            this.write = str;
            this.IconCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = limitVar;
        }

        public final String write() {
            return this.write;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }

        public final limit AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/writeIBinderSparseArray$RemoteActionCompatParcelizer;", "Lo/writeIBinderSparseArray;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements writeIBinderSparseArray {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }

    public static final class read implements writeIBinderSparseArray {
        private final String read;

        public read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String write() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/writeIBinderSparseArray$write;", "Lo/writeIBinderSparseArray;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write implements writeIBinderSparseArray {
        public static final write INSTANCE = new write();

        private write() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/writeIBinderSparseArray$AudioAttributesCompatParcelizer;", "Lo/writeIBinderSparseArray;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements writeIBinderSparseArray {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }
}
