package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class isReadingFromUpstream {
    private final String AudioAttributesCompatParcelizer;
    private final getContentMetadata write;

    public isReadingFromUpstream(getContentMetadata getcontentmetadata, String str) {
        toMagicModuleMetaRepoModel.write(getcontentmetadata, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = getcontentmetadata;
        this.AudioAttributesCompatParcelizer = str;
    }

    public final getContentMetadata RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isReadingFromUpstream)) {
            return false;
        }
        isReadingFromUpstream isreadingfromupstream = (isReadingFromUpstream) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, isreadingfromupstream.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) isreadingfromupstream.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        getContentMetadata getcontentmetadata = this.write;
        String str = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("QBankRepoModel(lessonMetaData=");
        sb.append(getcontentmetadata);
        sb.append(", stepId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
