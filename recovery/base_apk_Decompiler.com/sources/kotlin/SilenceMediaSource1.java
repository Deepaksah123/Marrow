package kotlin;

import com.marrow.data.api.models.response.plan.SdkPayload;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class SilenceMediaSource1 extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued AudioAttributesCompatParcelizer;
    private sendRemoveDownload IconCompatParcelizer;
    private sendSetStopReason RemoteActionCompatParcelizer;

    public SilenceMediaSource1(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.AudioAttributesCompatParcelizer = setdownloadingstatestoqueued;
        this.IconCompatParcelizer = sendremovedownload;
        this.RemoteActionCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((SdkPayload) obj).write(this.AudioAttributesCompatParcelizer, downloadHelper2, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        SdkPayload sdkPayload = new SdkPayload();
        sdkPayload.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.IconCompatParcelizer);
        return sdkPayload;
    }
}
