package kotlin;

import com.marrow.data.api.models.response.video.PlaybackSettings;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleSampleMediaPeriod extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason AudioAttributesCompatParcelizer;
    private setDownloadingStatesToQueued read;
    private sendRemoveDownload write;

    public SingleSampleMediaPeriod(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.write = sendremovedownload;
        this.AudioAttributesCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((PlaybackSettings) obj).IconCompatParcelizer(this.read, downloadHelper2, this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        PlaybackSettings playbackSettings = new PlaybackSettings();
        playbackSettings.read(this.read, downloadHelperExternalSyntheticLambda4, this.write);
        return playbackSettings;
    }
}
