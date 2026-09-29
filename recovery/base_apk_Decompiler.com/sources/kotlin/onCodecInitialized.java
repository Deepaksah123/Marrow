package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onCodecInitialized extends AudioRendererEventListenerEventDispatcher {
    public onCodecInitialized(String str, AudioProcessor audioProcessor) {
        super(releaseAudioTrackAsync.AudioAttributesCompatParcelizer.write(), str, audioProcessor);
    }
}
