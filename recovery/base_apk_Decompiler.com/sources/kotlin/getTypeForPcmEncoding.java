package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getTypeForPcmEncoding {
    public final String AudioAttributesCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public getTypeForPcmEncoding(String str, String str2, String str3) {
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTypeForPcmEncoding)) {
            return false;
        }
        getTypeForPcmEncoding gettypeforpcmencoding = (getTypeForPcmEncoding) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) gettypeforpcmencoding.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) gettypeforpcmencoding.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) gettypeforpcmencoding.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() + ((this.write.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInfo(cameraName=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", cameraType=");
        sb.append(this.write);
        sb.append(", cameraOrientation=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
