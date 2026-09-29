package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class addSpan {
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public addSpan(String str, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    public final String write() {
        return this.write;
    }

    public final String read() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addSpan)) {
            return false;
        }
        addSpan addspan = (addSpan) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) addspan.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) addspan.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) addspan.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) addspan.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.read;
        String str3 = this.IconCompatParcelizer;
        String str4 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqSchemaLSModel(mcqId=");
        sb.append(str);
        sb.append(", highYieldId=");
        sb.append(str2);
        sb.append(", parentId=");
        sb.append(str3);
        sb.append(", lessonId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
