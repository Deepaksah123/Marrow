package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class openRead {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final long read;
    private final String write;

    public openRead(String str, String str2, long j, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = j;
        this.write = str3;
        this.AudioAttributesCompatParcelizer = str4;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof openRead)) {
            return false;
        }
        openRead openread = (openRead) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) openread.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) openread.IconCompatParcelizer) && this.read == openread.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) openread.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) openread.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.read)) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        long j = this.read;
        String str3 = this.write;
        String str4 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaLessonLSModel(lessonId=");
        sb.append(str);
        sb.append(", lessonName=");
        sb.append(str2);
        sb.append(", solvedOn=");
        sb.append(j);
        sb.append(", rootSubjectName=");
        sb.append(str3);
        sb.append(", stepId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
