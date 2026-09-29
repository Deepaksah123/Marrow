package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaParser;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class InputReaderAdapterV30 implements MediaParser.SeekableInputReader {
    private long currentPosition;
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public final void setDataReader(DataReader dataReader, long j) {
        this.dataReader = dataReader;
        this.resourceLength = j;
        this.lastSeekPosition = -1L;
    }

    public final void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public final long getAndResetSeekPosition() {
        long j = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j;
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public final void seekToPosition(long j) {
        this.lastSeekPosition = j;
    }

    @Override // android.media.MediaParser.InputReader
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((DataReader) Util.castNonNull(this.dataReader)).read(bArr, i, i2);
        this.currentPosition += (long) i3;
        return i3;
    }

    @Override // android.media.MediaParser.InputReader
    public final long getPosition() {
        return this.currentPosition;
    }

    @Override // android.media.MediaParser.InputReader
    public final long getLength() {
        return this.resourceLength;
    }
}
