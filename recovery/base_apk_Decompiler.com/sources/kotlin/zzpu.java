package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/zzpu;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "write", "Lo/zzpu$write;", "Lo/zzpu$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzpu {
    private zzpu() {
    }

    public static final class AudioAttributesCompatParcelizer extends zzpu {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String write() {
            return this.read;
        }
    }

    public /* synthetic */ zzpu(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzpu$write;", "Lo/zzpu;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends zzpu {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
