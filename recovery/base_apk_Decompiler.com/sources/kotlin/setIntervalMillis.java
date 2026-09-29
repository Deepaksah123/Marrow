package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/setIntervalMillis;", "", "<init>", "()V", "read", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Lo/setIntervalMillis$RemoteActionCompatParcelizer;", "Lo/setIntervalMillis$write;", "Lo/setIntervalMillis$AudioAttributesCompatParcelizer;", "Lo/setIntervalMillis$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setIntervalMillis {

    public static final class read extends setIntervalMillis {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private setIntervalMillis() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setIntervalMillis$AudioAttributesCompatParcelizer;", "Lo/setIntervalMillis;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setIntervalMillis {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ setIntervalMillis(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setIntervalMillis$write;", "Lo/setIntervalMillis;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends setIntervalMillis {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setIntervalMillis$RemoteActionCompatParcelizer;", "Lo/setIntervalMillis;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends setIntervalMillis {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
