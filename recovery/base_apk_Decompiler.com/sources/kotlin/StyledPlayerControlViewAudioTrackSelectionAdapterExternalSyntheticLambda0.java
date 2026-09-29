package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class StyledPlayerControlViewAudioTrackSelectionAdapterExternalSyntheticLambda0 extends isBeforeFirst implements sendResumeDownloads {
    private sendSetStopReason AudioAttributesCompatParcelizer;
    private setDownloadingStatesToQueued IconCompatParcelizer;
    private sendRemoveDownload read;

    public StyledPlayerControlViewAudioTrackSelectionAdapterExternalSyntheticLambda0(setDownloadingStatesToQueued setdownloadingstatestoqueued, sendRemoveDownload sendremovedownload, sendSetStopReason sendsetstopreason) {
        this.IconCompatParcelizer = setdownloadingstatestoqueued;
        this.read = sendremovedownload;
        this.AudioAttributesCompatParcelizer = sendsetstopreason;
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            ((lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) obj).read(this.IconCompatParcelizer, downloadHelper2, this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return null;
        }
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = new lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter();
        lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, downloadHelperExternalSyntheticLambda4, this.read);
        return lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter;
    }
}
