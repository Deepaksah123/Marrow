package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/castNonNullTypeArray;", "", "<init>", "()V", "write", "RemoteActionCompatParcelizer", "read", "Lo/castNonNullTypeArray$read;", "Lo/castNonNullTypeArray$RemoteActionCompatParcelizer;", "Lo/castNonNullTypeArray$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class castNonNullTypeArray {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/castNonNullTypeArray$write;", "Lo/castNonNullTypeArray;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends castNonNullTypeArray {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private castNonNullTypeArray() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/castNonNullTypeArray$RemoteActionCompatParcelizer;", "Lo/castNonNullTypeArray;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends castNonNullTypeArray {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ castNonNullTypeArray(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends castNonNullTypeArray {
        private final String IconCompatParcelizer;
        private final int read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
            this.read = i;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }
    }
}
