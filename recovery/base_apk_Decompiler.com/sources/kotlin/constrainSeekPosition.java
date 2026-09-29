package kotlin;

import com.marrow.data.api.models.response.video.ConfigMinPlayback;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class constrainSeekPosition extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload AudioAttributesCompatParcelizer;
    private sendSetStopReason RemoteActionCompatParcelizer;
    private setDownloadingStatesToQueued read;

    public constrainSeekPosition(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = sendremovedownload;
        this.RemoteActionCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((ConfigMinPlayback) obj).write(this.read, downloadHelper2, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        ConfigMinPlayback configMinPlayback = new ConfigMinPlayback();
        configMinPlayback.RemoteActionCompatParcelizer(this.read, downloadHelperExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer);
        return configMinPlayback;
    }
}
