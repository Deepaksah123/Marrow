package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class loadFormatWithDrmInitData {
    private final String IconCompatParcelizer;
    private final String read;
    private final String write;

    public loadFormatWithDrmInitData(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loadFormatWithDrmInitData)) {
            return false;
        }
        loadFormatWithDrmInitData loadformatwithdrminitdata = (loadFormatWithDrmInitData) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) loadformatwithdrminitdata.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) loadformatwithdrminitdata.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) loadformatwithdrminitdata.read);
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        StringBuilder sb = new StringBuilder("SuggestedSubject(parentSubjectId=");
        sb.append(str);
        sb.append(", subjectId=");
        sb.append(str2);
        sb.append(", criterion=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
