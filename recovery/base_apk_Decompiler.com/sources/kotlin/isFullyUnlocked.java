package kotlin;

import java.io.IOException;
import kotlin.buildCacheKey;

/* JADX INFO: loaded from: classes3.dex */
public final class isFullyUnlocked extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason AudioAttributesCompatParcelizer;
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendRemoveDownload RemoteActionCompatParcelizer;

    public isFullyUnlocked(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.RemoteActionCompatParcelizer = sendremovedownload;
        this.AudioAttributesCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((buildCacheKey.IconCompatParcelizer.RemoteActionCompatParcelizer) obj).write(downloadHelper2, this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        buildCacheKey.IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new buildCacheKey.IconCompatParcelizer.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.IconCompatParcelizer(downloadHelperExternalSyntheticLambda4, this.RemoteActionCompatParcelizer);
        return remoteActionCompatParcelizer;
    }
}
