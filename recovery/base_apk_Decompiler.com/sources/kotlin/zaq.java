package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class zaq {
    private final boolean AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    public zaq(String str, String str2, String str3, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = i;
        this.AudioAttributesCompatParcelizer = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaq)) {
            return false;
        }
        zaq zaqVar = (zaq) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zaqVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) zaqVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) zaqVar.RemoteActionCompatParcelizer) && this.read == zaqVar.read && this.AudioAttributesCompatParcelizer == zaqVar.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.write;
        String str3 = this.RemoteActionCompatParcelizer;
        int i = this.read;
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqOptionModel(contentId=");
        sb.append(str);
        sb.append(", featureCardId=");
        sb.append(str2);
        sb.append(", mcqId=");
        sb.append(str3);
        sb.append(", selectedAnswer=");
        sb.append(i);
        sb.append(", isAnswerCorrectly=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
