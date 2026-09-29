package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class StyledPlayerControlViewExternalSyntheticLambda2 extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload AudioAttributesCompatParcelizer;
    private sendSetStopReason IconCompatParcelizer;
    private setDownloadingStatesToQueued read;

    public StyledPlayerControlViewExternalSyntheticLambda2(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = sendremovedownload;
        this.IconCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((StyledPlayerControlViewExternalSyntheticLambda0) obj).IconCompatParcelizer(this.read, downloadHelper2, this.IconCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        StyledPlayerControlViewExternalSyntheticLambda0 styledPlayerControlViewExternalSyntheticLambda0 = new StyledPlayerControlViewExternalSyntheticLambda0();
        styledPlayerControlViewExternalSyntheticLambda0.write(this.read, downloadHelperExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer);
        return styledPlayerControlViewExternalSyntheticLambda0;
    }
}
