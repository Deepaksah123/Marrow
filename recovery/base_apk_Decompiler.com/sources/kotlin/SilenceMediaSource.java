package kotlin;

import com.marrow.data.api.models.response.plan.RenewEligible;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class SilenceMediaSource extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload AudioAttributesCompatParcelizer;
    private sendSetStopReason RemoteActionCompatParcelizer;
    private setDownloadingStatesToQueued read;

    public SilenceMediaSource(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = sendremovedownload;
        this.RemoteActionCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((RenewEligible) obj).write(this.read, downloadHelper2, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        RenewEligible renewEligible = new RenewEligible();
        renewEligible.RemoteActionCompatParcelizer(this.read, downloadHelperExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer);
        return renewEligible;
    }
}
