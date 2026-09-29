package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/setMediaItems;", "", "<init>", "()V", "read", "RemoteActionCompatParcelizer", "Lo/setMediaItems$read;", "Lo/setMediaItems$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class setMediaItems {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setMediaItems$read;", "Lo/setMediaItems;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class read extends setMediaItems {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    private setMediaItems() {
    }

    public /* synthetic */ setMediaItems(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends setMediaItems {
        private final int AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(int i) {
            super(null);
            this.AudioAttributesCompatParcelizer = i;
        }

        public final int write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == ((RemoteActionCompatParcelizer) obj).AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return Integer.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConstraintsNotMet(reason=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
