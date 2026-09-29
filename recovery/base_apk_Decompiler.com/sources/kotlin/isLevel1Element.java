package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class isLevel1Element extends readFlvHeader {
    private final int read;
    private final boolean write;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof readFlvHeader)) {
            return false;
        }
        readFlvHeader readflvheader = (readFlvHeader) obj;
        return this.read == readflvheader.AudioAttributesCompatParcelizer() && this.write == readflvheader.RemoteActionCompatParcelizer();
    }

    public final String toString() {
        int i = this.read;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    /* synthetic */ isLevel1Element(int i, boolean z) {
        this.read = i;
        this.write = z;
    }

    @Override // kotlin.readFlvHeader
    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.readFlvHeader
    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final int hashCode() {
        return (true != this.write ? 1237 : 1231) ^ ((this.read ^ 1000003) * 1000003);
    }
}
