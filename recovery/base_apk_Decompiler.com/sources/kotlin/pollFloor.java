package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class pollFloor {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public pollFloor(String str, String str2, String str3, String str4, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.write = str5;
        this.AudioAttributesCompatParcelizer = str6;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pollFloor)) {
            return false;
        }
        pollFloor pollfloor = (pollFloor) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) pollfloor.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) pollfloor.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) pollfloor.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) pollfloor.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) pollfloor.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) pollfloor.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        String str5 = this.write;
        String str6 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("LessonSubjectUCModel(lessonTitle=");
        sb.append(str);
        sb.append(", lessonId=");
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
