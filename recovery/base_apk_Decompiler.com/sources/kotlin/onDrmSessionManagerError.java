package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onDrmSessionManagerError {
    private final String read;
    private final String write;

    public onDrmSessionManagerError(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.write = str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onDrmSessionManagerError)) {
            return false;
        }
        onDrmSessionManagerError ondrmsessionmanagererror = (onDrmSessionManagerError) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ondrmsessionmanagererror.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) ondrmsessionmanagererror.write);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageData(url=");
        sb.append(this.read);
        sb.append(", altText=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
