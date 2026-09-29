package kotlin;

import com.marrow2.data.pref.repo.model.PlanBUpgradeLSModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class createCacheEntry extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued AudioAttributesCompatParcelizer;
    private sendRemoveDownload read;
    private sendSetStopReason write;

    public createCacheEntry(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.AudioAttributesCompatParcelizer = setdownloadingstatestoqueued;
        this.read = sendremovedownload;
        this.write = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((PlanBUpgradeLSModel) obj).read(this.AudioAttributesCompatParcelizer, downloadHelper2, this.write);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        PlanBUpgradeLSModel planBUpgradeLSModel = new PlanBUpgradeLSModel();
        planBUpgradeLSModel.read(this.AudioAttributesCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.read);
        return planBUpgradeLSModel;
    }
}
