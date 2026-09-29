package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class GoogleApiSettingsBuilder {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;

    public GoogleApiSettingsBuilder(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleApiSettingsBuilder)) {
            return false;
        }
        GoogleApiSettingsBuilder googleApiSettingsBuilder = (GoogleApiSettingsBuilder) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) googleApiSettingsBuilder.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) googleApiSettingsBuilder.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) googleApiSettingsBuilder.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("LabelVMModel(text=");
        sb.append(str);
        sb.append(", color=");
        sb.append(str2);
        sb.append(", backgroundColor=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
