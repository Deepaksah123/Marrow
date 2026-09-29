package kotlin;

import com.marrow2.data.magic_module.remote.model.MagicModuleMetaLSModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class onCacheIgnored extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason AudioAttributesCompatParcelizer;
    private sendRemoveDownload RemoteActionCompatParcelizer;
    private setDownloadingStatesToQueued read;

    public onCacheIgnored(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.RemoteActionCompatParcelizer = sendremovedownload;
        this.AudioAttributesCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((MagicModuleMetaLSModel) obj).IconCompatParcelizer(this.read, downloadHelper2, this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        MagicModuleMetaLSModel magicModuleMetaLSModel = new MagicModuleMetaLSModel();
        magicModuleMetaLSModel.IconCompatParcelizer(this.read, downloadHelperExternalSyntheticLambda4, this.RemoteActionCompatParcelizer);
        return magicModuleMetaLSModel;
    }
}
