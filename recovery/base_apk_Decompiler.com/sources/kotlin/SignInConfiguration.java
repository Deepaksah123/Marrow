package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface SignInConfiguration {

    public static final class RemoteActionCompatParcelizer implements SignInConfiguration {
        private final boolean RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && this.RemoteActionCompatParcelizer == ((RemoteActionCompatParcelizer) obj).RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            boolean z = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("SendCtaResult(switchEdition=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/SignInConfiguration$IconCompatParcelizer;", "Lo/SignInConfiguration;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer implements SignInConfiguration {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        public final int hashCode() {
            return 61703327;
        }

        private IconCompatParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "IconCompatParcelizer";
        }
    }
}
