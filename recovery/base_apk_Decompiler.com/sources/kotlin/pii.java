package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/pii;", "", "<init>", "()V", "write", "AudioAttributesCompatParcelizer", "Lo/pii$AudioAttributesCompatParcelizer;", "Lo/pii$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class pii {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/pii$write;", "Lo/pii;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends pii {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private pii() {
    }

    public static final class AudioAttributesCompatParcelizer extends pii {
        private final getOrStartHandlerThread RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(getOrStartHandlerThread getorstarthandlerthread) {
            super(null);
            toMagicModuleMetaRepoModel.write(getorstarthandlerthread, "");
            this.RemoteActionCompatParcelizer = getorstarthandlerthread;
        }

        public final getOrStartHandlerThread read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public /* synthetic */ pii(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
