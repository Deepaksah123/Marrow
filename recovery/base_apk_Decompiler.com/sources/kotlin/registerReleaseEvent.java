package kotlin;

import android.os.Process;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/registerReleaseEvent;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "read", "Lo/registerReleaseEvent$read;", "Lo/registerReleaseEvent$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class registerReleaseEvent {
    public static int RemoteActionCompatParcelizer;
    public static int read;

    public static final class RemoteActionCompatParcelizer extends registerReleaseEvent {
        private final readUnsignedInt AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(readUnsignedInt readunsignedint) {
            super(null);
            toMagicModuleMetaRepoModel.write(readunsignedint, "");
            this.AudioAttributesCompatParcelizer = readunsignedint;
        }

        public final readUnsignedInt AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private registerReleaseEvent() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/registerReleaseEvent$read;", "Lo/registerReleaseEvent;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends registerReleaseEvent {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public /* synthetic */ registerReleaseEvent(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static int IconCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 6039315;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMyPid = Process.myPid();
        read = iMyPid;
        return iMyPid;
    }
}
