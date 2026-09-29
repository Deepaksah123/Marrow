package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class putBinderByReflection {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final int read;

    public putBinderByReflection(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = i;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof putBinderByReflection)) {
            return false;
        }
        putBinderByReflection putbinderbyreflection = (putBinderByReflection) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) putbinderbyreflection.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) putbinderbyreflection.AudioAttributesCompatParcelizer) && this.read == putbinderbyreflection.read;
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        int i = this.read;
        StringBuilder sb = new StringBuilder("SchemaFilterCount(schemaId=");
        sb.append(str);
        sb.append(", schemaName=");
        sb.append(str2);
        sb.append(", schemaCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
