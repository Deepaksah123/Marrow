package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lo/BrowserPublicKeyCredentialCreationOptions;", "", "<init>", "()V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "read", "write", "Lo/BrowserPublicKeyCredentialCreationOptions$write;", "Lo/BrowserPublicKeyCredentialCreationOptions$IconCompatParcelizer;", "Lo/BrowserPublicKeyCredentialCreationOptions$read;", "Lo/BrowserPublicKeyCredentialCreationOptions$RemoteActionCompatParcelizer;", "Lo/BrowserPublicKeyCredentialCreationOptions$AudioAttributesCompatParcelizer;", "Lo/BrowserPublicKeyCredentialCreationOptions$AudioAttributesImplApi21Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrowserPublicKeyCredentialCreationOptions {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/BrowserPublicKeyCredentialCreationOptions$IconCompatParcelizer;", "Lo/BrowserPublicKeyCredentialCreationOptions;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends BrowserPublicKeyCredentialCreationOptions {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    private BrowserPublicKeyCredentialCreationOptions() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/BrowserPublicKeyCredentialCreationOptions$AudioAttributesCompatParcelizer;", "Lo/BrowserPublicKeyCredentialCreationOptions;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends BrowserPublicKeyCredentialCreationOptions {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ BrowserPublicKeyCredentialCreationOptions(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class AudioAttributesImplApi21Parcelizer extends BrowserPublicKeyCredentialCreationOptions {
        private final String IconCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }
    }

    public static final class RemoteActionCompatParcelizer extends BrowserPublicKeyCredentialCreationOptions {
        private final setMapper IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(setMapper setmapper) {
            super(null);
            toMagicModuleMetaRepoModel.write(setmapper, "");
            this.IconCompatParcelizer = setmapper;
        }

        public final setMapper write() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class read extends BrowserPublicKeyCredentialCreationOptions {
        private final zaq read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(zaq zaqVar) {
            super(null);
            toMagicModuleMetaRepoModel.write(zaqVar, "");
            this.read = zaqVar;
        }

        public final zaq AudioAttributesCompatParcelizer() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/BrowserPublicKeyCredentialCreationOptions$write;", "Lo/BrowserPublicKeyCredentialCreationOptions;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends BrowserPublicKeyCredentialCreationOptions {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
