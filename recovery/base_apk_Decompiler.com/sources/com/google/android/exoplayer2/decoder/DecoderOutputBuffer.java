package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class DecoderOutputBuffer extends Buffer {
    public int skippedOutputBufferCount;
    public long timeUs;

    public interface Owner<S extends DecoderOutputBuffer> {
        void releaseOutputBuffer(S s);
    }

    public abstract void release();
}
