package kotlin;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.onFlushCompleted;

/* JADX INFO: loaded from: classes5.dex */
public final class skipToChunk implements WavHeaderReaderChunkHeader {
    private final AtomicReference<verifyBitstreamType> RemoteActionCompatParcelizer = new AtomicReference<>();
    private final onFlushCompleted<verifyBitstreamType> write;

    public skipToChunk(onFlushCompleted<verifyBitstreamType> onflushcompleted) {
        this.write = onflushcompleted;
        onflushcompleted.write(new onFlushCompleted.AudioAttributesCompatParcelizer() { // from class: o.blockIndexToTimeUs
            @Override // o.onFlushCompleted.AudioAttributesCompatParcelizer
            public final void read(onInputBufferAvailable oninputbufferavailable) {
                this.AudioAttributesCompatParcelizer.read(oninputbufferavailable);
            }
        });
    }

    final /* synthetic */ void read(onInputBufferAvailable oninputbufferavailable) {
        this.RemoteActionCompatParcelizer.set((verifyBitstreamType) oninputbufferavailable.write());
    }
}
