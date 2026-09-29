package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class StyledPlayerControlViewExternalSyntheticLambda1 extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload AudioAttributesCompatParcelizer;
    private sendSetStopReason IconCompatParcelizer;
    private setDownloadingStatesToQueued write;

    public StyledPlayerControlViewExternalSyntheticLambda1(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.write = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = sendremovedownload;
        this.IconCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((notifyOnVisibilityChange) obj).RemoteActionCompatParcelizer(downloadHelper2, this.IconCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        notifyOnVisibilityChange notifyonvisibilitychange = new notifyOnVisibilityChange();
        notifyonvisibilitychange.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer);
        return notifyonvisibilitychange;
    }
}
