package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface shouldInterceptRequest {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/shouldInterceptRequest$IconCompatParcelizer;", "Lo/shouldInterceptRequest;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer implements shouldInterceptRequest {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        public final int hashCode() {
            return 714703211;
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

    public static final class read implements shouldInterceptRequest {
        private final String AudioAttributesCompatParcelizer;

        public read(String str) {
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) ((read) obj).AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.AudioAttributesCompatParcelizer;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("NoVideoNotes(notesSlideMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class AudioAttributesCompatParcelizer implements shouldInterceptRequest {
        private final String read;

        public AudioAttributesCompatParcelizer(String str) {
            this.read = str;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ((AudioAttributesCompatParcelizer) obj).read);
        }

        public final int hashCode() {
            String str = this.read;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            String str = this.read;
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class write implements shouldInterceptRequest {
        private final zwk AudioAttributesCompatParcelizer;
        private final List<cs> RemoteActionCompatParcelizer;

        public write(List<cs> list, zwk zwkVar) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(zwkVar, "");
            this.RemoteActionCompatParcelizer = list;
            this.AudioAttributesCompatParcelizer = zwkVar;
        }

        public final List<cs> RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final zwk write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, writeVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            List<cs> list = this.RemoteActionCompatParcelizer;
            zwk zwkVar = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("VideoNotesLoadedState(notes=");
            sb.append(list);
            sb.append(", noteViewInfo=");
            sb.append(zwkVar);
            sb.append(")");
            return sb.toString();
        }
    }
}
