package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class MetadataRenderer extends readMetadata {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    MetadataRenderer(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.RemoteActionCompatParcelizer = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.AudioAttributesCompatParcelizer = str2;
    }

    @Override // kotlin.readMetadata
    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.readMetadata
    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", version=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof readMetadata)) {
            return false;
        }
        readMetadata readmetadata = (readMetadata) obj;
        return this.RemoteActionCompatParcelizer.equals(readmetadata.IconCompatParcelizer()) && this.AudioAttributesCompatParcelizer.equals(readmetadata.read());
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode() ^ ((this.RemoteActionCompatParcelizer.hashCode() ^ 1000003) * 1000003);
    }
}
