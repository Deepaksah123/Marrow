package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/zzhc;", "", "<init>", "()V", "write", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer", "Lo/zzhc$write;", "Lo/zzhc$IconCompatParcelizer;", "Lo/zzhc$read;", "Lo/zzhc$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzhc {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzhc$write;", "Lo/zzhc;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends zzhc {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private zzhc() {
    }

    public static final class IconCompatParcelizer extends zzhc {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public /* synthetic */ zzhc(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends zzhc {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class RemoteActionCompatParcelizer extends zzhc {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }
    }
}
