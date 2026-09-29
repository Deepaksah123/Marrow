package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class DecoderOutputBuffer extends AudioRendererEventListenerEventDispatcher {
    public DecoderOutputBuffer(ArrayList arrayList) {
        super(createReplacementByteBuffer.AudioAttributesCompatParcelizer.write(), arrayList, onAudioDevicesAdded.AudioAttributesCompatParcelizer);
    }
}
