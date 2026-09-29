package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class onBindViewHolderAtZeroPosition extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued AudioAttributesCompatParcelizer;
    private sendSetStopReason IconCompatParcelizer;
    private sendRemoveDownload read;

    public onBindViewHolderAtZeroPosition(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.AudioAttributesCompatParcelizer = setdownloadingstatestoqueued;
        this.read = sendremovedownload;
        this.IconCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((hideImmediately) obj).AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, downloadHelper2, this.IconCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        hideImmediately hideimmediately = new hideImmediately();
        hideimmediately.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.read);
        return hideimmediately;
    }
}
