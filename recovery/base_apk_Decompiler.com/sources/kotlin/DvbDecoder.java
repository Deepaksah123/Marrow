package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lo/DvbDecoder;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "Lo/DvbDecoder$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DvbDecoder {

    public static final class RemoteActionCompatParcelizer extends DvbDecoder {
        private final boolean AudioAttributesCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
            this.AudioAttributesCompatParcelizer = z;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }

        public final boolean read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) remoteActionCompatParcelizer.write) && this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (this.write.hashCode() * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            String str = this.write;
            boolean z = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("SendEmail(emailId=");
            sb.append(str);
            sb.append(", hasAnySubscription=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    private DvbDecoder() {
    }

    public /* synthetic */ DvbDecoder(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
