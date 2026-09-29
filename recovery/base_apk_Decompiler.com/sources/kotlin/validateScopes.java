package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/validateScopes;", "", "<init>", "()V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "Lo/validateScopes$AudioAttributesCompatParcelizer;", "Lo/validateScopes$write;", "Lo/validateScopes$IconCompatParcelizer;", "Lo/validateScopes$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class validateScopes {

    public static final class IconCompatParcelizer extends validateScopes {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }
    }

    private validateScopes() {
    }

    public static final class RemoteActionCompatParcelizer extends validateScopes {
        private final float read;

        public RemoteActionCompatParcelizer(float f) {
            super(null);
            this.read = f;
        }

        public final float AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && Float.compare(this.read, ((RemoteActionCompatParcelizer) obj).read) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.read);
        }

        public final String toString() {
            float f = this.read;
            StringBuilder sb = new StringBuilder("UpdateToolbarTintProgress(progress=");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ validateScopes(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/validateScopes$AudioAttributesCompatParcelizer;", "Lo/validateScopes;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer extends validateScopes {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        public final int hashCode() {
            return 763024289;
        }

        private AudioAttributesCompatParcelizer() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesCompatParcelizer";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/validateScopes$write;", "Lo/validateScopes;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends validateScopes {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
