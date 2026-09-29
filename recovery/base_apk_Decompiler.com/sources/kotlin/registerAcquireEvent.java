package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/registerAcquireEvent;", "", "<init>", "()V", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "Lo/registerAcquireEvent$AudioAttributesCompatParcelizer;", "Lo/registerAcquireEvent$write;", "Lo/registerAcquireEvent$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class registerAcquireEvent {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/registerAcquireEvent$IconCompatParcelizer;", "Lo/registerAcquireEvent;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends registerAcquireEvent {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    private registerAcquireEvent() {
    }

    public static final class write extends registerAcquireEvent {
        private final readUnsignedInt write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(readUnsignedInt readunsignedint) {
            super(null);
            toMagicModuleMetaRepoModel.write(readunsignedint, "");
            this.write = readunsignedint;
        }

        public final readUnsignedInt RemoteActionCompatParcelizer() {
            return this.write;
        }
    }

    public /* synthetic */ registerAcquireEvent(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/registerAcquireEvent$AudioAttributesCompatParcelizer;", "Lo/registerAcquireEvent;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends registerAcquireEvent {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }
}
