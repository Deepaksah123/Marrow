package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lo/zzgz;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "read", "Lo/zzgz$read;", "Lo/zzgz$RemoteActionCompatParcelizer;", "Lo/zzgz$IconCompatParcelizer;", "Lo/zzgz$AudioAttributesCompatParcelizer;", "Lo/zzgz$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzgz {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzgz$RemoteActionCompatParcelizer;", "Lo/zzgz;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends zzgz {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    private zzgz() {
    }

    public static final class IconCompatParcelizer extends zzgz {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public /* synthetic */ zzgz(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class AudioAttributesCompatParcelizer extends zzgz {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String read() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzgz$write;", "Lo/zzgz;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends zzgz {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public static final class read extends zzgz {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }
}
