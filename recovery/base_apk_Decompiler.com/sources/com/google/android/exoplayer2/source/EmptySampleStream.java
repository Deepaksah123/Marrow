package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class EmptySampleStream implements SampleStream {
    @Override // com.google.android.exoplayer2.source.SampleStream
    public final boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final void maybeThrowError() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int skipData(long j) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.setFlags(4);
        return -4;
    }
}
