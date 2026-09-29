package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setPreferredDeviceOnAudioTrack extends AudioRendererEventListenerEventDispatcher {
    public setPreferredDeviceOnAudioTrack(String str, AudioProcessor audioProcessor) {
        super(copyInputToOutput.AudioAttributesCompatParcelizer.write(), str, audioProcessor);
    }
}
