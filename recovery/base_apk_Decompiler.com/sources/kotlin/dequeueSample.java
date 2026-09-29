package kotlin;

import com.marrow.data.models.common.Editor;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class dequeueSample extends isBeforeFirst implements sendResumeDownloads {
    private sendRemoveDownload AudioAttributesCompatParcelizer;
    private sendSetStopReason IconCompatParcelizer;
    private setDownloadingStatesToQueued read;

    public dequeueSample(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.read = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = sendremovedownload;
        this.IconCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((Editor) obj).write(downloadHelper2, this.IconCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        Editor editor = new Editor();
        editor.write(downloadHelperExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer);
        return editor;
    }
}
