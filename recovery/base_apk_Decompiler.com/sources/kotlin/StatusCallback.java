package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lo/StatusCallback;", "", "<init>", "()V", "IconCompatParcelizer", "read", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/StatusCallback$AudioAttributesCompatParcelizer;", "Lo/StatusCallback$IconCompatParcelizer;", "Lo/StatusCallback$read;", "Lo/StatusCallback$RemoteActionCompatParcelizer;", "Lo/StatusCallback$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StatusCallback {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StatusCallback$IconCompatParcelizer;", "Lo/StatusCallback;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends StatusCallback {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    private StatusCallback() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StatusCallback$read;", "Lo/StatusCallback;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends StatusCallback {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public /* synthetic */ StatusCallback(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class write extends StatusCallback {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class RemoteActionCompatParcelizer extends StatusCallback {
        private final int IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = i;
        }

        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends StatusCallback {
        private final boolean AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str, boolean z, boolean z2, boolean z3) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
            this.IconCompatParcelizer = z;
            this.RemoteActionCompatParcelizer = z2;
            this.AudioAttributesCompatParcelizer = z3;
        }

        public final String read() {
            return this.read;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
