package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackStatsListener extends AudioRendererEventListenerEventDispatcher {
    public PlaybackStatsListener(Integer num, AudioProcessor audioProcessor) {
        super(setInitialInputBufferSize.AudioAttributesCompatParcelizer.write(), num, audioProcessor);
    }
}
