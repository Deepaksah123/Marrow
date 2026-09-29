package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface isEmailRequired {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/isEmailRequired$AudioAttributesCompatParcelizer;", "Lo/isEmailRequired;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer implements isEmailRequired {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        public final int hashCode() {
            return -1443421293;
        }

        private AudioAttributesCompatParcelizer() {
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

    public static final class write implements isEmailRequired {
        private final getSavedState read;

        public write(getSavedState getsavedstate) {
            toMagicModuleMetaRepoModel.write(getsavedstate, "");
            this.read = getsavedstate;
        }

        public final getSavedState read() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((write) obj).read);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final String toString() {
            getSavedState getsavedstate = this.read;
            StringBuilder sb = new StringBuilder("Content(data=");
            sb.append(getsavedstate);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class read implements isEmailRequired {
        private final int IconCompatParcelizer;
        private final String read;

        public read(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = i;
            this.read = str;
        }

        public final String read() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return this.IconCompatParcelizer == readVar.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) readVar.read);
        }

        public final int hashCode() {
            return (Integer.hashCode(this.IconCompatParcelizer) * 31) + this.read.hashCode();
        }

        public final String toString() {
            int i = this.IconCompatParcelizer;
            String str = this.read;
            StringBuilder sb = new StringBuilder("Error(errorCode=");
            sb.append(i);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }
}
