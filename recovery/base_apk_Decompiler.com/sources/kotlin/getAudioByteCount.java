package kotlin;

import com.marrow.data.api.models.response.plan.SdkPayloadData;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getAudioByteCount extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued AudioAttributesCompatParcelizer;
    private sendRemoveDownload RemoteActionCompatParcelizer;
    private sendSetStopReason write;

    public getAudioByteCount(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.AudioAttributesCompatParcelizer = setdownloadingstatestoqueued;
        this.RemoteActionCompatParcelizer = sendremovedownload;
        this.write = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((SdkPayloadData) obj).AudioAttributesCompatParcelizer(downloadHelper2, this.write);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        SdkPayloadData sdkPayloadData = new SdkPayloadData();
        sdkPayloadData.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4, this.RemoteActionCompatParcelizer);
        return sdkPayloadData;
    }
}
