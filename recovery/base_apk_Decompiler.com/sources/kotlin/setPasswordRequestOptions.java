package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lo/setPasswordRequestOptions;", "", "<init>", "()V", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "Lo/setPasswordRequestOptions$read;", "Lo/setPasswordRequestOptions$AudioAttributesCompatParcelizer;", "Lo/setPasswordRequestOptions$RemoteActionCompatParcelizer;", "Lo/setPasswordRequestOptions$write;", "Lo/setPasswordRequestOptions$IconCompatParcelizer;", "Lo/setPasswordRequestOptions$AudioAttributesImplBaseParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setPasswordRequestOptions {

    public static final class AudioAttributesImplBaseParcelizer extends setPasswordRequestOptions {
        private final boolean IconCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
            this.IconCompatParcelizer = false;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }
    }

    private setPasswordRequestOptions() {
    }

    public static final class IconCompatParcelizer extends setPasswordRequestOptions {
        private final boolean AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(boolean z) {
            super(null);
            this.AudioAttributesCompatParcelizer = z;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public /* synthetic */ setPasswordRequestOptions(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setPasswordRequestOptions$write;", "Lo/setPasswordRequestOptions;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends setPasswordRequestOptions {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends setPasswordRequestOptions {
        private final boolean RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class read extends setPasswordRequestOptions {
        private final boolean RemoteActionCompatParcelizer;

        public read(boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setPasswordRequestOptions$AudioAttributesCompatParcelizer;", "Lo/setPasswordRequestOptions;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setPasswordRequestOptions {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }
}
