package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ChunkHolder {
    public Chunk chunk;
    public boolean endOfStream;

    public final void clear() {
        this.chunk = null;
        this.endOfStream = false;
    }
}
