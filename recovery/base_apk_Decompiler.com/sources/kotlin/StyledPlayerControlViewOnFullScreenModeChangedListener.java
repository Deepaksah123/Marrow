package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class StyledPlayerControlViewOnFullScreenModeChangedListener extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload IconCompatParcelizer;
    private sendSetStopReason RemoteActionCompatParcelizer;
    private setDownloadingStatesToQueued write;

    public StyledPlayerControlViewOnFullScreenModeChangedListener(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.write = setdownloadingstatestoqueued;
        this.IconCompatParcelizer = sendremovedownload;
        this.RemoteActionCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((updateSelectedIndex) obj).read(this.write, downloadHelper2, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        updateSelectedIndex updateselectedindex = new updateSelectedIndex();
        updateselectedindex.IconCompatParcelizer(this.write, downloadHelperExternalSyntheticLambda4, this.IconCompatParcelizer);
        return updateselectedindex;
    }
}
