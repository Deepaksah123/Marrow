package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class forceEnableMediaCodecAsynchronousQueueing implements Runnable {
    private final handlePlatformAudioFocusChange AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final boolean read;
    private final lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener write;

    public forceEnableMediaCodecAsynchronousQueueing(handlePlatformAudioFocusChange handleplatformaudiofocuschange, lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, boolean z, int i) {
        toMagicModuleMetaRepoModel.write(handleplatformaudiofocuschange, "");
        toMagicModuleMetaRepoModel.write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, "");
        this.AudioAttributesCompatParcelizer = handleplatformaudiofocuschange;
        this.write = lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener;
        this.read = z;
        this.IconCompatParcelizer = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.read) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write, this.IconCompatParcelizer);
        } else {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.write, this.IconCompatParcelizer);
        }
        n.write();
        n.write("StopWorkRunnable");
        this.write.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
    }
}
