package kotlin;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes2.dex */
public final class hasPreviousMediaItem implements getCurrentWindowIndex {
    private final handlePlatformAudioFocusChange AudioAttributesCompatParcelizer;
    private final setEnableDecoderFallback write;

    public hasPreviousMediaItem(handlePlatformAudioFocusChange handleplatformaudiofocuschange, setEnableDecoderFallback setenabledecoderfallback) {
        toMagicModuleMetaRepoModel.write(handleplatformaudiofocuschange, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
        this.AudioAttributesCompatParcelizer = handleplatformaudiofocuschange;
        this.write = setenabledecoderfallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(hasPreviousMediaItem haspreviousmediaitem, lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, WorkerParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        haspreviousmediaitem.AudioAttributesCompatParcelizer.IconCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, remoteActionCompatParcelizer);
    }

    @Override // kotlin.getCurrentWindowIndex
    public final void AudioAttributesCompatParcelizer(final lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, final WorkerParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, "");
        this.write.RemoteActionCompatParcelizer(new Runnable() { // from class: o.hasNextMediaItem
            @Override // java.lang.Runnable
            public final void run() {
                hasPreviousMediaItem.read(this.AudioAttributesCompatParcelizer, lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, remoteActionCompatParcelizer);
            }
        });
    }

    @Override // kotlin.getCurrentWindowIndex
    public final void write(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, int i) {
        toMagicModuleMetaRepoModel.write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, "");
        this.write.RemoteActionCompatParcelizer(new forceEnableMediaCodecAsynchronousQueueing(this.AudioAttributesCompatParcelizer, lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, false, i));
    }
}
