package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class StatsDataSource implements DataSource {
    private long bytesRead;
    private final DataSource dataSource;
    private Uri lastOpenedUri = Uri.EMPTY;
    private Map<String, List<String>> lastResponseHeaders = Collections.emptyMap();

    public StatsDataSource(DataSource dataSource) {
        this.dataSource = (DataSource) Assertions.checkNotNull(dataSource);
    }

    public final void resetBytesRead() {
        this.bytesRead = 0L;
    }

    public final long getBytesRead() {
        return this.bytesRead;
    }

    public final Uri getLastOpenedUri() {
        return this.lastOpenedUri;
    }

    public final Map<String, List<String>> getLastResponseHeaders() {
        return this.lastResponseHeaders;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.dataSource.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        this.lastOpenedUri = dataSpec.uri;
        this.lastResponseHeaders = Collections.emptyMap();
        long jOpen = this.dataSource.open(dataSpec);
        this.lastOpenedUri = (Uri) Assertions.checkNotNull(getUri());
        this.lastResponseHeaders = getResponseHeaders();
        return jOpen;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.dataSource.read(bArr, i, i2);
        if (i3 != -1) {
            this.bytesRead += (long) i3;
        }
        return i3;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map<String, List<String>> getResponseHeaders() {
        return this.dataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        this.dataSource.close();
    }
}
