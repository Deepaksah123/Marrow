package kotlin;

import com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdasetAdPlaybackStates0comgoogleandroidexoplayer2sourceadsServerSideAdInsertionMediaSource extends isBeforeFirst implements sendResumeDownloads {
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendSetStopReason RemoteActionCompatParcelizer;
    private sendRemoveDownload write;

    public lambdasetAdPlaybackStates0comgoogleandroidexoplayer2sourceadsServerSideAdInsertionMediaSource(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.write = sendremovedownload;
        this.RemoteActionCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((MagicModuleMetaLSModel) obj).RemoteActionCompatParcelizer(this.IconCompatParcelizer, downloadHelper2, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        MagicModuleMetaLSModel magicModuleMetaLSModel = new MagicModuleMetaLSModel();
        magicModuleMetaLSModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.write);
        return magicModuleMetaLSModel;
    }
}
