package kotlin;

import com.marrow.data.api.models.response.plan.OrderDetails;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ShuffleOrderUnshuffledShuffleOrder extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload AudioAttributesCompatParcelizer;
    private setDownloadingStatesToQueued RemoteActionCompatParcelizer;
    private sendSetStopReason write;

    public ShuffleOrderUnshuffledShuffleOrder(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.RemoteActionCompatParcelizer = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = sendremovedownload;
        this.write = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((OrderDetails) obj).read(this.RemoteActionCompatParcelizer, downloadHelper2, this.write);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer);
        return orderDetails;
    }
}
