package kotlin;

import com.marrow.data.api.models.response.plan.PlanBUpgradeData;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getNextIndex extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason AudioAttributesCompatParcelizer;
    private sendRemoveDownload IconCompatParcelizer;
    private setDownloadingStatesToQueued read;

    public getNextIndex(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.IconCompatParcelizer = sendremovedownload;
        this.AudioAttributesCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((PlanBUpgradeData) obj).IconCompatParcelizer(this.read, downloadHelper2, this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        PlanBUpgradeData planBUpgradeData = new PlanBUpgradeData();
        planBUpgradeData.write(this.read, downloadHelperExternalSyntheticLambda4, this.IconCompatParcelizer);
        return planBUpgradeData;
    }
}
