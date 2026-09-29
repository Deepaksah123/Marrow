package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface checkCallingOrSelfPermission {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/checkCallingOrSelfPermission$read;", "Lo/checkCallingOrSelfPermission;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements checkCallingOrSelfPermission {
        public static final read INSTANCE = new read();

        private read() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/checkCallingOrSelfPermission$AudioAttributesCompatParcelizer;", "Lo/checkCallingOrSelfPermission;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements checkCallingOrSelfPermission {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/checkCallingOrSelfPermission$write;", "Lo/checkCallingOrSelfPermission;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write implements checkCallingOrSelfPermission {
        public static final write INSTANCE = new write();

        private write() {
        }
    }

    public static final class RemoteActionCompatParcelizer implements checkCallingOrSelfPermission {
        private final String read;

        public RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }
    }
}
