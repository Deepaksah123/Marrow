package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setBuffer extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason AudioAttributesCompatParcelizer;
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendRemoveDownload read;

    public setBuffer(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.read = sendremovedownload;
        this.AudioAttributesCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((setFloatsUniform) obj).read(this.IconCompatParcelizer, downloadHelper2, this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        setFloatsUniform setfloatsuniform = new setFloatsUniform();
        setfloatsuniform.IconCompatParcelizer(this.IconCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.read);
        return setfloatsuniform;
    }
}
