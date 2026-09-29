package kotlin;

import com.marrow.data.models.user.Country;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerEmsgHandlerPlayerEmsgCallback extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload AudioAttributesCompatParcelizer;
    private setDownloadingStatesToQueued read;
    private sendSetStopReason write;

    public PlayerEmsgHandlerPlayerEmsgCallback(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = sendremovedownload;
        this.write = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((Country) obj).RemoteActionCompatParcelizer(downloadHelper2, this.write);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        Country country = new Country();
        country.write(downloadHelperExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer);
        return country;
    }
}
