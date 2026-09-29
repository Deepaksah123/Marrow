package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class removeQueryParameter {
    private final boolean AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public removeQueryParameter(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeQueryParameter)) {
            return false;
        }
        removeQueryParameter removequeryparameter = (removeQueryParameter) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) removequeryparameter.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == removequeryparameter.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("ShareDetailUcModel(emailId=");
        sb.append(str);
        sb.append(", hasAnySubscription=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
