package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface zzscd {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzscd$RemoteActionCompatParcelizer;", "Lo/zzscd;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements zzscd {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }

    public static final class write implements zzscd {
        private final int AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;

        public write(String str, int i, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = i;
            this.read = str2;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) writeVar.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == writeVar.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) writeVar.read);
        }

        public final int hashCode() {
            return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.read.hashCode();
        }

        public final String toString() {
            String str = this.RemoteActionCompatParcelizer;
            int i = this.AudioAttributesCompatParcelizer;
            String str2 = this.read;
            StringBuilder sb = new StringBuilder("ShowFeedbackDialog(lessonId=");
            sb.append(str);
            sb.append(", rating=");
            sb.append(i);
            sb.append(", slide=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class AudioAttributesCompatParcelizer implements zzscd {
        private final int IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == ((AudioAttributesCompatParcelizer) obj).IconCompatParcelizer;
        }

        public final int hashCode() {
            return Integer.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            int i = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("DeferredScrollToPosition(position=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/zzscd$read;", "Lo/zzscd;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class read implements zzscd {
        public static final read INSTANCE = new read();

        public final int hashCode() {
            return 752364482;
        }

        private read() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "read";
        }
    }
}
