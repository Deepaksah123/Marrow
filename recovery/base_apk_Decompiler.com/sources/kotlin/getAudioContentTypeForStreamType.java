package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getAudioContentTypeForStreamType {
    private final String IconCompatParcelizer;
    private final getAttributeArrayLocationAndEnable read;

    public getAudioContentTypeForStreamType(String str, getAttributeArrayLocationAndEnable getattributearraylocationandenable) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getattributearraylocationandenable, "");
        this.IconCompatParcelizer = str;
        this.read = getattributearraylocationandenable;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final getAttributeArrayLocationAndEnable RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAudioContentTypeForStreamType)) {
            return false;
        }
        getAudioContentTypeForStreamType getaudiocontenttypeforstreamtype = (getAudioContentTypeForStreamType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getaudiocontenttypeforstreamtype.IconCompatParcelizer) && this.read == getaudiocontenttypeforstreamtype.read;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        getAttributeArrayLocationAndEnable getattributearraylocationandenable = this.read;
        StringBuilder sb = new StringBuilder("SubmitTestUCModel(ownerCategory=");
        sb.append(str);
        sb.append(", testSubmitStatus=");
        sb.append(getattributearraylocationandenable);
        sb.append(")");
        return sb.toString();
    }
}
