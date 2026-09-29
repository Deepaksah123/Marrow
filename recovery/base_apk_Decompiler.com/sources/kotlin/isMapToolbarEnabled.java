package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class isMapToolbarEnabled {
    private final String AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final String read;
    private final StreetViewPanoramaViewzzb write;

    public isMapToolbarEnabled(String str, String str2, long j, long j2, StreetViewPanoramaViewzzb streetViewPanoramaViewzzb) {
        toMagicModuleMetaRepoModel.write(streetViewPanoramaViewzzb, "");
        this.read = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
        this.write = streetViewPanoramaViewzzb;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final StreetViewPanoramaViewzzb AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isMapToolbarEnabled)) {
            return false;
        }
        isMapToolbarEnabled ismaptoolbarenabled = (isMapToolbarEnabled) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ismaptoolbarenabled.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) ismaptoolbarenabled.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == ismaptoolbarenabled.RemoteActionCompatParcelizer && this.IconCompatParcelizer == ismaptoolbarenabled.IconCompatParcelizer && this.write == ismaptoolbarenabled.write;
    }

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.AudioAttributesCompatParcelizer;
        return (((((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.AudioAttributesCompatParcelizer;
        long j = this.RemoteActionCompatParcelizer;
        long j2 = this.IconCompatParcelizer;
        StreetViewPanoramaViewzzb streetViewPanoramaViewzzb = this.write;
        StringBuilder sb = new StringBuilder("ResetContentVMData(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", lastResetDate=");
        sb.append(j);
        sb.append(", resetAfterDate=");
        sb.append(j2);
        sb.append(", contentType=");
        sb.append(streetViewPanoramaViewzzb);
        sb.append(")");
        return sb.toString();
    }
}
