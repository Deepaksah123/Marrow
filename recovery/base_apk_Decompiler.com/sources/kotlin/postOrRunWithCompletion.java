package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0018B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/postOrRunWithCompletion;", "", "", "Lo/postOrRunWithCompletion$RemoteActionCompatParcelizer;", "p0", "Lo/postOrRunWithCompletion$write;", "p1", "<init>", "(Ljava/util/List;Lo/postOrRunWithCompletion$write;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/util/List;", "read", "()Ljava/util/List;", "RemoteActionCompatParcelizer", "Lo/postOrRunWithCompletion$write;", "write", "()Lo/postOrRunWithCompletion$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class postOrRunWithCompletion {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final write write;

    public postOrRunWithCompletion(List<RemoteActionCompatParcelizer> list, write writeVar) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
        this.write = writeVar;
    }

    public final List<RemoteActionCompatParcelizer> read() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final write getWrite() {
        return this.write;
    }

    public static final class RemoteActionCompatParcelizer {
        private final String AudioAttributesCompatParcelizer;
        private final List<read> read;

        public RemoteActionCompatParcelizer(String str, List<read> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.AudioAttributesCompatParcelizer = str;
            this.read = list;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final List<read> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public static final class read {
            private final String AudioAttributesCompatParcelizer;
            private final String IconCompatParcelizer;
            private final String RemoteActionCompatParcelizer;
            private final String read;
            private final String write;

            public read(String str, String str2, String str3, String str4, String str5) {
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(str2, "");
                toMagicModuleMetaRepoModel.write(str3, "");
                toMagicModuleMetaRepoModel.write(str4, "");
                toMagicModuleMetaRepoModel.write(str5, "");
                this.RemoteActionCompatParcelizer = str;
                this.IconCompatParcelizer = str2;
                this.write = str3;
                this.read = str4;
                this.AudioAttributesCompatParcelizer = str5;
            }

            public final String AudioAttributesCompatParcelizer() {
                return this.RemoteActionCompatParcelizer;
            }

            public final String read() {
                return this.IconCompatParcelizer;
            }

            public final String write() {
                return this.write;
            }

            public final String RemoteActionCompatParcelizer() {
                return this.read;
            }

            public final String IconCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof read)) {
                    return false;
                }
                read readVar = (read) obj;
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) readVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) readVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) readVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) readVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) readVar.AudioAttributesCompatParcelizer);
            }

            public final int hashCode() {
                return (((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
            }

            public final String toString() {
                String str = this.RemoteActionCompatParcelizer;
                String str2 = this.IconCompatParcelizer;
                String str3 = this.write;
                String str4 = this.read;
                String str5 = this.AudioAttributesCompatParcelizer;
                StringBuilder sb = new StringBuilder("SampleVideoListUcModel(lessonName=");
                sb.append(str);
                sb.append(", subjectName=");
                sb.append(str2);
                sb.append(", facultyName=");
                sb.append(str3);
                sb.append(", facultyImageUrl=");
                sb.append(str4);
                sb.append(", lessonId=");
                sb.append(str5);
                sb.append(")");
                return sb.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, remoteActionCompatParcelizer.read);
        }

        public final int hashCode() {
            return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode();
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            List<read> list = this.read;
            StringBuilder sb = new StringBuilder("SampleVideoSectionUcModel(sectionTitle=");
            sb.append(str);
            sb.append(", lessons=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof postOrRunWithCompletion)) {
            return false;
        }
        postOrRunWithCompletion postorrunwithcompletion = (postOrRunWithCompletion) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, postorrunwithcompletion.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, postorrunwithcompletion.write);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        write writeVar = this.write;
        return (iHashCode * 31) + (writeVar == null ? 0 : writeVar.hashCode());
    }

    public final String toString() {
        List<RemoteActionCompatParcelizer> list = this.RemoteActionCompatParcelizer;
        write writeVar = this.write;
        StringBuilder sb = new StringBuilder("postOrRunWithCompletion(RemoteActionCompatParcelizer=");
        sb.append(list);
        sb.append(", write=");
        sb.append(writeVar);
        sb.append(")");
        return sb.toString();
    }

    public static final class write {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String read;

        public write(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.AudioAttributesCompatParcelizer = str;
            this.read = str2;
            this.IconCompatParcelizer = str3;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writeVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) writeVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeVar.IconCompatParcelizer);
        }

        public final int hashCode() {
            return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.read;
            String str3 = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("SampleVideoPromotionModel(title=");
            sb.append(str);
            sb.append(", subtitle=");
            sb.append(str2);
            sb.append(", toolbarTitle=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }
}
