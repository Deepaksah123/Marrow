package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class PlaceholderDataSource implements DataSource {
    public static final PlaceholderDataSource INSTANCE = new PlaceholderDataSource();
    public static final DataSource.Factory FACTORY = new DataSource.Factory() { // from class: com.google.android.exoplayer2.upstream.PlaceholderDataSource$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            return PlaceholderDataSource.$r8$lambda$vDuk6rTp1JuQSAVZdUUcM4qsx4k();
        }
    };

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return null;
    }

    private PlaceholderDataSource() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ PlaceholderDataSource $r8$lambda$vDuk6rTp1JuQSAVZdUUcM4qsx4k() {
        return new PlaceholderDataSource();
    }
}
