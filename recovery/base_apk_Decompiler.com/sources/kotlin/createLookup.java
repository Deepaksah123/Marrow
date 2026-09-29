package kotlin;

import com.marrow2.data.pref.repo.model.UserConfigResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class createLookup extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload IconCompatParcelizer;
    private setDownloadingStatesToQueued read;
    private sendSetStopReason write;

    public createLookup(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.IconCompatParcelizer = sendremovedownload;
        this.write = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((UserConfigResponse) obj).AudioAttributesCompatParcelizer(downloadHelper2, this.write);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        UserConfigResponse userConfigResponse = new UserConfigResponse();
        userConfigResponse.IconCompatParcelizer(this.read, downloadHelperExternalSyntheticLambda4, this.IconCompatParcelizer);
        return userConfigResponse;
    }
}
