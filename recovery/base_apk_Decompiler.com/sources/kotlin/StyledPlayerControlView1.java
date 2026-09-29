package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class StyledPlayerControlView1 extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload IconCompatParcelizer;
    private sendSetStopReason RemoteActionCompatParcelizer;
    private setDownloadingStatesToQueued write;

    public StyledPlayerControlView1(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.write = setdownloadingstatestoqueued;
        this.IconCompatParcelizer = sendremovedownload;
        this.RemoteActionCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((isFullyVisible) obj).write(this.write, downloadHelper2, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        isFullyVisible isfullyvisible = new isFullyVisible();
        isfullyvisible.read(this.write, downloadHelperExternalSyntheticLambda4, this.IconCompatParcelizer);
        return isfullyvisible;
    }
}
