package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class ensureArrayCapacity extends assertInCues {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final String read;
    private final long write;

    ensureArrayCapacity(int i, long j, long j2, int i2, String str) {
        this.IconCompatParcelizer = i;
        this.write = j;
        this.RemoteActionCompatParcelizer = j2;
        this.AudioAttributesCompatParcelizer = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.read = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof assertInCues)) {
            return false;
        }
        assertInCues assertincues = (assertInCues) obj;
        return this.IconCompatParcelizer == assertincues.read() && this.write == assertincues.IconCompatParcelizer() && this.RemoteActionCompatParcelizer == assertincues.RemoteActionCompatParcelizer() && this.AudioAttributesCompatParcelizer == assertincues.AudioAttributesCompatParcelizer() && this.read.equals(assertincues.write());
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        long j = this.write;
        long j2 = this.RemoteActionCompatParcelizer;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        return this.read.hashCode() ^ ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2) * 1000003) ^ this.AudioAttributesCompatParcelizer) * 1000003);
    }

    public final String toString() {
        int i = this.IconCompatParcelizer;
        long j = this.write;
        long j2 = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesCompatParcelizer;
        String str = this.read;
        StringBuilder sb = new StringBuilder("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // kotlin.assertInCues
    public final long IconCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.assertInCues
    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.assertInCues
    public final int read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.assertInCues
    public final String write() {
        return this.read;
    }

    @Override // kotlin.assertInCues
    public final long RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
