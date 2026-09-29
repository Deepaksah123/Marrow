package kotlin;

import com.marrow.data.api.models.response.user.UserConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class SinglePeriodTimeline extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason IconCompatParcelizer;
    private sendRemoveDownload read;
    private setDownloadingStatesToQueued write;

    public SinglePeriodTimeline(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.write = setdownloadingstatestoqueued;
        this.read = sendremovedownload;
        this.IconCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((UserConfig) obj).AudioAttributesCompatParcelizer(downloadHelper2, this.IconCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        UserConfig userConfig = new UserConfig();
        userConfig.IconCompatParcelizer(this.write, downloadHelperExternalSyntheticLambda4, this.read);
        return userConfig;
    }
}
