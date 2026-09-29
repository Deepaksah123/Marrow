package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class addWithOverflowDefault {
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public addWithOverflowDefault(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addWithOverflowDefault)) {
            return false;
        }
        addWithOverflowDefault addwithoverflowdefault = (addWithOverflowDefault) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) addwithoverflowdefault.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) addwithoverflowdefault.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SubjectLaunchUCModel(subjectId=");
        sb.append(str);
        sb.append(", subjectName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
