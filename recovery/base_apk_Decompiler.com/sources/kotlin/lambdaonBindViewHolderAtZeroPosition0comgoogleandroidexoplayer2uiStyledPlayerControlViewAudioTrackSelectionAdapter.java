package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaonBindViewHolderAtZeroPosition0comgoogleandroidexoplayer2uiStyledPlayerControlViewAudioTrackSelectionAdapter extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload IconCompatParcelizer;
    private sendSetStopReason read;
    private setDownloadingStatesToQueued write;

    public lambdaonBindViewHolderAtZeroPosition0comgoogleandroidexoplayer2uiStyledPlayerControlViewAudioTrackSelectionAdapter(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.write = setdownloadingstatestoqueued;
        this.IconCompatParcelizer = sendremovedownload;
        this.read = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((updateTrackLists) obj).read(this.write, downloadHelper2, this.read);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        updateTrackLists updatetracklists = new updateTrackLists();
        updatetracklists.read(this.write, downloadHelperExternalSyntheticLambda4, this.IconCompatParcelizer);
        return updatetracklists;
    }
}
