package kotlin;

import com.marrow.data.api.models.response.plan.Coupon;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ShuffleOrderDefaultShuffleOrder extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason RemoteActionCompatParcelizer;
    private setDownloadingStatesToQueued read;
    private sendRemoveDownload write;

    public ShuffleOrderDefaultShuffleOrder(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.write = sendremovedownload;
        this.RemoteActionCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((Coupon) obj).write(this.read, downloadHelper2, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        Coupon coupon = new Coupon();
        coupon.AudioAttributesCompatParcelizer(this.read, downloadHelperExternalSyntheticLambda4, this.write);
        return coupon;
    }
}
