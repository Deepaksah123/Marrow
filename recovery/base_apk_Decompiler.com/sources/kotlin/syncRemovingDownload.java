package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class syncRemovingDownload implements DownloadManager1 {
    private final String IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final Object[] read;
    private final DownloadManagerExternalSyntheticLambda0 write;

    syncRemovingDownload(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, String str, Object[] objArr) {
        this.write = downloadManagerExternalSyntheticLambda0;
        this.IconCompatParcelizer = str;
        this.read = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.RemoteActionCompatParcelizer = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.RemoteActionCompatParcelizer = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2++;
            }
        }
    }

    final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    final Object[] IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.DownloadManager1
    public final DownloadManagerExternalSyntheticLambda0 AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.DownloadManager1
    public final onRemoveTaskStopped write() {
        return (this.RemoteActionCompatParcelizer & 1) == 1 ? onRemoveTaskStopped.PROTO2 : onRemoveTaskStopped.PROTO3;
    }

    @Override // kotlin.DownloadManager1
    public final boolean read() {
        return (this.RemoteActionCompatParcelizer & 2) == 2;
    }
}
