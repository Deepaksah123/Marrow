package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException {
    private final int IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final int write;

    public PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException(int i, int i2, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    public final int read() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException)) {
            return false;
        }
        PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException = (PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException) obj;
        return this.IconCompatParcelizer == publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException.IconCompatParcelizer && this.write == publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.write)) * 31) + this.read.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.IconCompatParcelizer;
        int i2 = this.write;
        String str = this.read;
        String str2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaUiModel(correctCount=");
        sb.append(i);
        sb.append(", totalCount=");
        sb.append(i2);
        sb.append(", schemaId=");
        sb.append(str);
        sb.append(", schemaName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
