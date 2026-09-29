package kotlin;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface NestfgetmThumbnailWidth {
    isPaused AudioAttributesCompatParcelizer(read readVar);

    isResultAvailable AudioAttributesCompatParcelizer(getNotesCount getnotescount);

    Set<String> RemoteActionCompatParcelizer(getNotesCount getnotescount);

    public static final class read {
        private final byte[] IconCompatParcelizer;
        private final RevisionSubjectStatusModel RemoteActionCompatParcelizer;
        private final isPaused write;

        private read(RevisionSubjectStatusModel revisionSubjectStatusModel, byte[] bArr, isPaused ispaused) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            this.RemoteActionCompatParcelizer = revisionSubjectStatusModel;
            this.IconCompatParcelizer = bArr;
            this.write = ispaused;
        }

        public /* synthetic */ read(RevisionSubjectStatusModel revisionSubjectStatusModel, byte[] bArr, isPaused ispaused, int i) {
            this(revisionSubjectStatusModel, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : ispaused);
        }

        public final RevisionSubjectStatusModel IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, readVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, readVar.write);
        }

        public final int hashCode() {
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            byte[] bArr = this.IconCompatParcelizer;
            int iHashCode2 = bArr == null ? 0 : Arrays.hashCode(bArr);
            isPaused ispaused = this.write;
            return (((iHashCode * 31) + iHashCode2) * 31) + (ispaused != null ? ispaused.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Request(classId=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", previouslyFoundClassFileContent=");
            sb.append(Arrays.toString(this.IconCompatParcelizer));
            sb.append(", outerClass=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }
}
