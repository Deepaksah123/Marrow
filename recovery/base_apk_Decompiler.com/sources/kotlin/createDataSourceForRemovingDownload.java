package kotlin;

import com.marrow2.data.magic_module.remote.model.MagicModuleStatusUcModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class createDataSourceForRemovingDownload extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload AudioAttributesCompatParcelizer;
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendSetStopReason RemoteActionCompatParcelizer;

    public createDataSourceForRemovingDownload(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = sendremovedownload;
        this.RemoteActionCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((MagicModuleStatusUcModel) obj).read(downloadHelper2, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        MagicModuleStatusUcModel magicModuleStatusUcModel = new MagicModuleStatusUcModel();
        magicModuleStatusUcModel.write(downloadHelperExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer);
        return magicModuleStatusUcModel;
    }
}
