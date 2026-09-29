package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getVideoUpdatedTime {
    private final boolean RemoteActionCompatParcelizer;

    public static final class write extends getVideoUpdatedTime {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public write(String str) {
            super(false, 0 == true ? 1 : 0);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }
    }

    private getVideoUpdatedTime(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static final class RemoteActionCompatParcelizer extends getVideoUpdatedTime {
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        /* JADX WARN: Multi-variable type inference failed */
        private RemoteActionCompatParcelizer() {
            super(false, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ getVideoUpdatedTime(boolean z, byte b) {
        this(z);
    }

    public static final class read extends getVideoUpdatedTime {
        public static final read read = new read();

        private read() {
            super(true, (byte) 0);
        }
    }
}
