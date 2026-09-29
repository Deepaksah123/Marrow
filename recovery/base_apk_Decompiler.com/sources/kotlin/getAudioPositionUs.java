package kotlin;

import com.marrow.data.api.models.response.plan.UpgradePlanResponseV2;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getAudioPositionUs extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued AudioAttributesCompatParcelizer;
    private sendSetStopReason IconCompatParcelizer;
    private sendRemoveDownload write;

    public getAudioPositionUs(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.AudioAttributesCompatParcelizer = setdownloadingstatestoqueued;
        this.write = sendremovedownload;
        this.IconCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((UpgradePlanResponseV2) obj).read(this.AudioAttributesCompatParcelizer, downloadHelper2, this.IconCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        UpgradePlanResponseV2 upgradePlanResponseV2 = new UpgradePlanResponseV2();
        upgradePlanResponseV2.write(this.AudioAttributesCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.write);
        return upgradePlanResponseV2;
    }
}
