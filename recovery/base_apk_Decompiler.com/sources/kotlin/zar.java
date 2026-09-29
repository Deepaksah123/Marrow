package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/zar;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "read", "Lo/zar$read;", "Lo/zar$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zar {
    private zar() {
    }

    public static final class RemoteActionCompatParcelizer extends zar {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }
    }

    public /* synthetic */ zar(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zar$read;", "Lo/zar;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends zar {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }
}
