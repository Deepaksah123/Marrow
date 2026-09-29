package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public class isWaitingForRequirements {
    private volatile DownloadManagerExternalSyntheticLambda0 AudioAttributesCompatParcelizer;
    private volatile DownloadIndex IconCompatParcelizer;
    private DownloadIndex write;

    public int hashCode() {
        return 1;
    }

    static {
        mergeRequest.AudioAttributesCompatParcelizer();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isWaitingForRequirements)) {
            return false;
        }
        isWaitingForRequirements iswaitingforrequirements = (isWaitingForRequirements) obj;
        DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0 = this.AudioAttributesCompatParcelizer;
        DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda02 = iswaitingforrequirements.AudioAttributesCompatParcelizer;
        if (downloadManagerExternalSyntheticLambda0 == null && downloadManagerExternalSyntheticLambda02 == null) {
            return AudioAttributesCompatParcelizer().equals(iswaitingforrequirements.AudioAttributesCompatParcelizer());
        }
        if (downloadManagerExternalSyntheticLambda0 != null && downloadManagerExternalSyntheticLambda02 != null) {
            return downloadManagerExternalSyntheticLambda0.equals(downloadManagerExternalSyntheticLambda02);
        }
        if (downloadManagerExternalSyntheticLambda0 != null) {
            return downloadManagerExternalSyntheticLambda0.equals(iswaitingforrequirements.IconCompatParcelizer(downloadManagerExternalSyntheticLambda0.onRemoveQueueItemAt()));
        }
        return IconCompatParcelizer(downloadManagerExternalSyntheticLambda02.onRemoveQueueItemAt()).equals(downloadManagerExternalSyntheticLambda02);
    }

    public final DownloadManagerExternalSyntheticLambda0 IconCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        RemoteActionCompatParcelizer(downloadManagerExternalSyntheticLambda0);
        return this.AudioAttributesCompatParcelizer;
    }

    public final DownloadManagerExternalSyntheticLambda0 AudioAttributesCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda02 = this.AudioAttributesCompatParcelizer;
        this.write = null;
        this.IconCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = downloadManagerExternalSyntheticLambda0;
        return downloadManagerExternalSyntheticLambda02;
    }

    public final int IconCompatParcelizer() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.write();
        }
        if (this.AudioAttributesCompatParcelizer != null) {
            return this.AudioAttributesCompatParcelizer.onRemoveQueueItem();
        }
        return 0;
    }

    public final DownloadIndex AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer;
        }
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                return this.IconCompatParcelizer;
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                this.IconCompatParcelizer = DownloadIndex.RemoteActionCompatParcelizer;
            } else {
                this.IconCompatParcelizer = this.AudioAttributesCompatParcelizer.onPlay();
            }
            return this.IconCompatParcelizer;
        }
    }

    private void RemoteActionCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this) {
                if (this.AudioAttributesCompatParcelizer != null) {
                    return;
                }
                try {
                    this.AudioAttributesCompatParcelizer = downloadManagerExternalSyntheticLambda0;
                    this.IconCompatParcelizer = DownloadIndex.RemoteActionCompatParcelizer;
                } catch (getMaxParallelDownloads unused) {
                    this.AudioAttributesCompatParcelizer = downloadManagerExternalSyntheticLambda0;
                    this.IconCompatParcelizer = DownloadIndex.RemoteActionCompatParcelizer;
                }
            }
        }
    }
}
