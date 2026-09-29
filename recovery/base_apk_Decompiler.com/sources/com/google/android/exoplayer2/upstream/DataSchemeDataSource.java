package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.net.URLDecoder;
import kotlin.parseMdtaFromMeta;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRemaining;
    private byte[] data;
    private DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        Assertions.checkArgument("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] strArrSplit = Util.split(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.data = Util.getUtf8Bytes(URLDecoder.decode(str, parseMdtaFromMeta.RemoteActionCompatParcelizer.name()));
        }
        if (dataSpec.position > this.data.length) {
            this.data = null;
            throw new DataSourceException(2008);
        }
        int i = (int) dataSpec.position;
        this.readPosition = i;
        this.bytesRemaining = this.data.length - i;
        if (dataSpec.length != -1) {
            this.bytesRemaining = (int) Math.min(this.bytesRemaining, dataSpec.length);
        }
        transferStarted(dataSpec);
        return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }
}
