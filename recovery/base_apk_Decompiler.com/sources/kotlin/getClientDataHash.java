package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/getClientDataHash;", "", "<init>", "()V", "write", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer", "Lo/getClientDataHash$write;", "Lo/getClientDataHash$read;", "Lo/getClientDataHash$RemoteActionCompatParcelizer;", "Lo/getClientDataHash$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getClientDataHash {

    public static final class write extends getClientDataHash {
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }
    }

    private getClientDataHash() {
    }

    public static final class RemoteActionCompatParcelizer extends getClientDataHash {
        private final setMapper AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(setMapper setmapper) {
            super(null);
            toMagicModuleMetaRepoModel.write(setmapper, "");
            this.AudioAttributesCompatParcelizer = setmapper;
        }

        public final setMapper IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public /* synthetic */ getClientDataHash(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientDataHash$read;", "Lo/getClientDataHash;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getClientDataHash {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientDataHash$IconCompatParcelizer;", "Lo/getClientDataHash;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getClientDataHash {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }
}
