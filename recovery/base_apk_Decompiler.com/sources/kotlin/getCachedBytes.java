package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getCachedBytes {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public getCachedBytes(String str, String str2, String str3, String str4, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.write = str5;
        this.RemoteActionCompatParcelizer = str6;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCachedBytes)) {
            return false;
        }
        getCachedBytes getcachedbytes = (getCachedBytes) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getcachedbytes.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getcachedbytes.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getcachedbytes.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) getcachedbytes.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getcachedbytes.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getcachedbytes.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        String str3 = this.IconCompatParcelizer;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        String str5 = this.write;
        String str6 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("LessonSubjectLSModel(lessonId=");
        sb.append(str);
        sb.append(", lessonTitle=");
        sb.append(str2);
        sb.append(", rootSubjectId=");
        sb.append(str3);
        sb.append(", rootSubjectTitle=");
        sb.append(str4);
        sb.append(", childSubjectId=");
        sb.append(str5);
        sb.append(", childSubjectTitle=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
