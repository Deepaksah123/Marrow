package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getSelectedText extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendSetStopReason read;
    private sendRemoveDownload write;

    public getSelectedText(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.write = sendremovedownload;
        this.read = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((StyledPlayerControlViewSettingViewHolder) obj).read(this.IconCompatParcelizer, downloadHelper2, this.read);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        StyledPlayerControlViewSettingViewHolder styledPlayerControlViewSettingViewHolder = new StyledPlayerControlViewSettingViewHolder();
        styledPlayerControlViewSettingViewHolder.IconCompatParcelizer(this.IconCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.write);
        return styledPlayerControlViewSettingViewHolder;
    }
}
