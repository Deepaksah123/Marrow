package kotlin;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.onFlushCompleted;

/* JADX INFO: loaded from: classes5.dex */
public final class WavSeekMap implements WavHeaderReaderChunkHeader {
    private final AtomicReference<setFirstFrameOffset> IconCompatParcelizer = new AtomicReference<>();
    private final onFlushCompleted<setFirstFrameOffset> write;

    public WavSeekMap(onFlushCompleted<setFirstFrameOffset> onflushcompleted) {
        this.write = onflushcompleted;
        onflushcompleted.write(new onFlushCompleted.AudioAttributesCompatParcelizer() { // from class: o.AsynchronousMediaCodecAdapter
            @Override // o.onFlushCompleted.AudioAttributesCompatParcelizer
            public final void read(onInputBufferAvailable oninputbufferavailable) {
                this.IconCompatParcelizer.write(oninputbufferavailable);
            }
        });
    }

    final /* synthetic */ void write(onInputBufferAvailable oninputbufferavailable) {
        this.IconCompatParcelizer.set((setFirstFrameOffset) oninputbufferavailable.write());
    }
}
