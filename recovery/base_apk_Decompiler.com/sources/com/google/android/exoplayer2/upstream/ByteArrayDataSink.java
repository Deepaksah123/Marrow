package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class ByteArrayDataSink implements DataSink {
    private ByteArrayOutputStream stream;

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void open(DataSpec dataSpec) {
        if (dataSpec.length == -1) {
            this.stream = new ByteArrayOutputStream();
        } else {
            Assertions.checkArgument(dataSpec.length <= 2147483647L);
            this.stream = new ByteArrayOutputStream((int) dataSpec.length);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void close() throws IOException {
        ((ByteArrayOutputStream) Util.castNonNull(this.stream)).close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((ByteArrayOutputStream) Util.castNonNull(this.stream)).write(bArr, i, i2);
    }

    public final byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.stream;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
