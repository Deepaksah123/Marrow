package kotlin;

import com.marrow2.data.pref.repo.model.UpgradeContentRepoModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleCacheSpan extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendRemoveDownload RemoteActionCompatParcelizer;
    private sendSetStopReason write;

    public SimpleCacheSpan(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.RemoteActionCompatParcelizer = sendremovedownload;
        this.write = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((UpgradeContentRepoModel) obj).AudioAttributesCompatParcelizer(downloadHelper2, this.write);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        UpgradeContentRepoModel upgradeContentRepoModel = new UpgradeContentRepoModel();
        upgradeContentRepoModel.RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4, this.RemoteActionCompatParcelizer);
        return upgradeContentRepoModel;
    }
}
