package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getSpans extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason AudioAttributesCompatParcelizer;
    private setDownloadingStatesToQueued RemoteActionCompatParcelizer;
    private sendRemoveDownload read;

    public getSpans(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.RemoteActionCompatParcelizer = setdownloadingstatestoqueued;
        this.read = sendremovedownload;
        this.AudioAttributesCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((buildCacheKey) obj).read(this.RemoteActionCompatParcelizer, downloadHelper2, this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        buildCacheKey buildcachekey = new buildCacheKey();
        buildcachekey.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.read);
        return buildcachekey;
    }
}
