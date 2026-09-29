package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class addValues {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int read;

    public addValues(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = i;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addValues)) {
            return false;
        }
        addValues addvalues = (addValues) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) addvalues.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) addvalues.RemoteActionCompatParcelizer) && this.read == addvalues.read;
    }

    public final int hashCode() {
        return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        int i = this.read;
        StringBuilder sb = new StringBuilder("PearlSubjectModel(subjectId=");
        sb.append(str);
        sb.append(", subjectTitle=");
        sb.append(str2);
        sb.append(", itemCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
