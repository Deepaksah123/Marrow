package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class DashChunkSource {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;

    public DashChunkSource(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashChunkSource)) {
            return false;
        }
        DashChunkSource dashChunkSource = (DashChunkSource) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) dashChunkSource.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) dashChunkSource.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoConfigDbModel(videoId=");
        sb.append(str);
        sb.append(", config=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
