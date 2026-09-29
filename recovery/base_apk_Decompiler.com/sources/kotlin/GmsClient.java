package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/GmsClient;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "write", "read", "Lo/GmsClient$write;", "Lo/GmsClient$AudioAttributesCompatParcelizer;", "Lo/GmsClient$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GmsClient {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/GmsClient$AudioAttributesCompatParcelizer;", "Lo/GmsClient;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends GmsClient {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    private GmsClient() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/GmsClient$write;", "Lo/GmsClient;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends GmsClient {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public /* synthetic */ GmsClient(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends GmsClient {
        private final skipBit read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(skipBit skipbit) {
            super(null);
            toMagicModuleMetaRepoModel.write(skipbit, "");
            this.read = skipbit;
        }

        public final skipBit IconCompatParcelizer() {
            return this.read;
        }
    }
}
