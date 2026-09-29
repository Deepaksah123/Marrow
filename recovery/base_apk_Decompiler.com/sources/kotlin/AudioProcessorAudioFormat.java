package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioProcessorAudioFormat extends AudioRendererEventListenerEventDispatcher {
    public AudioProcessorAudioFormat(String str, AudioProcessor audioProcessor) {
        super(DefaultAudioSinkOutputMode.read.write(), str, audioProcessor);
    }
}
