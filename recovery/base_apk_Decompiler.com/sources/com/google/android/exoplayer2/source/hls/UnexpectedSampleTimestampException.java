package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(MediaChunk mediaChunk, long j, long j2) {
        StringBuilder sb = new StringBuilder("Unexpected sample timestamp: ");
        sb.append(Util.usToMs(j2));
        sb.append(" in chunk [");
        sb.append(mediaChunk.startTimeUs);
        sb.append(", ");
        sb.append(mediaChunk.endTimeUs);
        sb.append("]");
        super(sb.toString());
        this.mediaChunk = mediaChunk;
        this.lastAcceptedSampleTimeUs = j;
        this.rejectedSampleTimeUs = j2;
    }
}
