package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class Id3DecoderExternalSyntheticLambda0 {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String write;

    public Id3DecoderExternalSyntheticLambda0(String str, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Id3DecoderExternalSyntheticLambda0)) {
            return false;
        }
        Id3DecoderExternalSyntheticLambda0 id3DecoderExternalSyntheticLambda0 = (Id3DecoderExternalSyntheticLambda0) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) id3DecoderExternalSyntheticLambda0.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) id3DecoderExternalSyntheticLambda0.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) id3DecoderExternalSyntheticLambda0.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) id3DecoderExternalSyntheticLambda0.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", versionName=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", appBuildVersion=");
        sb.append(this.write);
        sb.append(", deviceManufacturer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
