package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getContent_id {
    private final getCreatedOnDateMs<Boolean> read;

    public getContent_id(getCreatedOnDateMs<Boolean> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.read = getcreatedondatems;
    }

    public final getCreatedOnDateMs<Boolean> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getContent_id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((getContent_id) obj).read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        getCreatedOnDateMs<Boolean> getcreatedondatems = this.read;
        StringBuilder sb = new StringBuilder("HeaderEncryptionConfig(isRemoteConfigEnabled=");
        sb.append(getcreatedondatems);
        sb.append(")");
        return sb.toString();
    }
}
