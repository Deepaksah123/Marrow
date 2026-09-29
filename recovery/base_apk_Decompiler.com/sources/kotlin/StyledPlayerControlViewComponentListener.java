package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class StyledPlayerControlViewComponentListener extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendRemoveDownload RemoteActionCompatParcelizer;
    private sendSetStopReason read;

    public StyledPlayerControlViewComponentListener(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.RemoteActionCompatParcelizer = sendremovedownload;
        this.read = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0) obj).read(this.IconCompatParcelizer, downloadHelper2, this.read);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = new StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0();
        styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.RemoteActionCompatParcelizer);
        return styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;
    }
}
