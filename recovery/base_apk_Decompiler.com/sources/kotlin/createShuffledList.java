package kotlin;

import com.marrow.data.api.models.response.plan.RenewBanner;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class createShuffledList extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendRemoveDownload RemoteActionCompatParcelizer;
    private sendSetStopReason read;

    public createShuffledList(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.RemoteActionCompatParcelizer = sendremovedownload;
        this.read = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((RenewBanner) obj).write(downloadHelper2, this.read);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        RenewBanner renewBanner = new RenewBanner();
        renewBanner.write(this.IconCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.RemoteActionCompatParcelizer);
        return renewBanner;
    }
}
