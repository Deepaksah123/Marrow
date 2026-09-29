package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface r8lambdafirD8q3VfW_fV4cnoFCk8FsND60 {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/r8lambdafirD8q3VfW_fV4cnoFCk8FsND60$AudioAttributesCompatParcelizer;", "Lo/r8lambdafirD8q3VfW_fV4cnoFCk8FsND60;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer implements r8lambdafirD8q3VfW_fV4cnoFCk8FsND60 {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        public final int hashCode() {
            return 834509647;
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

    public static final class IconCompatParcelizer implements r8lambdafirD8q3VfW_fV4cnoFCk8FsND60 {
        private final int RemoteActionCompatParcelizer;
        private final int read;

        public IconCompatParcelizer(int i, int i2) {
            this.read = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.read == iconCompatParcelizer.read && this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (Integer.hashCode(this.read) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            int i = this.read;
            int i2 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("CompleteActiveRecall(completedArqCount=");
            sb.append(i);
            sb.append(", totalArqCount=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class write implements r8lambdafirD8q3VfW_fV4cnoFCk8FsND60 {
        private final int AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final int read;
        private final String write;

        public write(String str, String str2, String str3, int i, int i2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
            this.write = str3;
            this.read = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final int write() {
            return this.read;
        }

        public final int RemoteActionCompatParcelizer() {
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
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) writeVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) writeVar.write) && this.read == writeVar.read && this.AudioAttributesCompatParcelizer == writeVar.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (((((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.RemoteActionCompatParcelizer;
            String str3 = this.write;
            int i = this.read;
            int i2 = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("PreviousYearPapers(subjectId=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", imageUrl=");
            sb.append(str3);
            sb.append(", completedCount=");
            sb.append(i);
            sb.append(", totalCount=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class RemoteActionCompatParcelizer implements r8lambdafirD8q3VfW_fV4cnoFCk8FsND60 {
        private final List<unregisterConnectionCallbacks> read;

        public RemoteActionCompatParcelizer(List<unregisterConnectionCallbacks> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.read = list;
        }

        public final List<unregisterConnectionCallbacks> read() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((RemoteActionCompatParcelizer) obj).read);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final String toString() {
            List<unregisterConnectionCallbacks> list = this.read;
            StringBuilder sb = new StringBuilder("TestSuggestions(tests=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }
}
