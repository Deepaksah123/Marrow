package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getDebugString {
    private final String AudioAttributesCompatParcelizer;
    private final String read;

    public getDebugString(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDebugString)) {
            return false;
        }
        getDebugString getdebugstring = (getDebugString) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getdebugstring.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getdebugstring.read);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        StringBuilder sb = new StringBuilder("SuggestedSubjectLSModel(subjectId=");
        sb.append(str);
        sb.append(", criterion=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
