package com.google.android.exoplayer2.upsteam.base;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes5.dex */
public class StringDataSource extends BaseDataSource {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private long bytesRemaining;
    private DataSpec dataSpec;
    private boolean opened;
    InputStream stream;
    private String streamingContent;

    public StringDataSource() {
        super(false);
    }

    protected void setStreamContent(String str) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 79;
        int i4 = (i3 - (~((i2 ^ 79) | i3))) - 1;
        int i5 = i4 % 128;
        IconCompatParcelizer = i5;
        int i6 = i4 % 2;
        this.streamingContent = str;
        if (i6 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i5 & 73;
        int i8 = ((i5 ^ 73) | i7) << 1;
        int i9 = -((~i7) & (i5 | 73));
        int i10 = (i8 & i9) + (i8 | i9);
        read = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 89 / 0;
        }
    }

    protected void clearStreamContent() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 45;
        int i4 = ((i2 ^ 45) | i3) << 1;
        int i5 = -((~i3) & (i2 | 45));
        int i6 = (i4 & i5) + (i4 | i5);
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        this.streamingContent = null;
        int i8 = i2 + 20;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        IconCompatParcelizer = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws StringDataSourceException {
        long length;
        int i = 2 % 2;
        int i2 = read;
        int i3 = (i2 & 115) + (i2 | 115);
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        this.dataSpec = dataSpec;
        String str = this.streamingContent;
        if (str == null) {
            throw new NullPointerException("No content to stream");
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        int i5 = IconCompatParcelizer;
        int i6 = ((i5 | 37) << 1) - (i5 ^ 37);
        read = i6 % 128;
        if (i6 % 2 == 0) {
            this.stream = byteArrayInputStream;
            long j = dataSpec.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.stream = byteArrayInputStream;
        if (dataSpec.length == -1) {
            int i7 = read;
            int i8 = i7 & 25;
            int i9 = (i7 | 25) & (~i8);
            int i10 = i8 << 1;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            IconCompatParcelizer = i11 % 128;
            length = i11 % 2 != 0 ? ((long) bytes.length) % dataSpec.position : ((long) bytes.length) - dataSpec.position;
        } else {
            length = dataSpec.length;
            int i12 = read;
            int i13 = i12 & 67;
            int i14 = (i12 | 67) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = (i14 & i15) + (i14 | i15);
            IconCompatParcelizer = i16 % 128;
            int i17 = i16 % 2;
        }
        this.bytesRemaining = length;
        if (length < 0) {
            throw new StringDataSourceException(new IOException("Out of range"), dataSpec, 1);
        }
        int i18 = IconCompatParcelizer + 3;
        read = i18 % 128;
        int i19 = i18 % 2;
        this.opened = true;
        transferStarted(dataSpec);
        int i20 = read;
        int i21 = i20 ^ 93;
        int i22 = ((i20 & 93) | i21) << 1;
        int i23 = -i21;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        IconCompatParcelizer = i24 % 128;
        int i25 = i24 % 2;
        long j2 = this.bytesRemaining;
        int i26 = ((i20 | 91) << 1) - (i20 ^ 91);
        IconCompatParcelizer = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 90 / 0;
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws StringDataSourceException {
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer;
        int i5 = (i4 ^ 49) + ((i4 & 49) << 1);
        int i6 = i5 % 128;
        read = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i2 == 0) {
            int i7 = i6 & 107;
            int i8 = i7 + ((i6 ^ 107) | i7);
            IconCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            int i10 = ((i4 ^ 1) | (i4 & 1)) << 1;
            int i11 = -((i4 & (-2)) | ((~i4) & 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            read = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 16 / 0;
            }
            int i14 = (((i4 ^ 41) | (i4 & 41)) << 1) - ((i4 & (-42)) | ((~i4) & 41));
            read = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 27 / 0;
            }
            return -1;
        }
        try {
            InputStream inputStream = this.stream;
            long jMin = Math.min(j, i2);
            int i16 = IconCompatParcelizer;
            int i17 = (i16 | 33) << 1;
            int i18 = -(i16 ^ 33);
            int i19 = (i17 & i18) + (i18 | i17);
            read = i19 % 128;
            int i20 = (int) jMin;
            if (i19 % 2 == 0) {
                inputStream.read(bArr, i, i20);
                throw null;
            }
            int i21 = inputStream.read(bArr, i, i20);
            if (i21 > 0) {
                this.bytesRemaining -= (long) i21;
                bytesTransferred(i21);
                int i22 = IconCompatParcelizer;
                int i23 = (-2) - (((i22 & 16) + (i22 | 16)) ^ (-1));
                read = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 4 / 4;
                }
            }
            int i25 = read;
            int i26 = i25 ^ 89;
            int i27 = (i25 & 89) << 1;
            int i28 = (i26 & i27) + (i27 | i26);
            IconCompatParcelizer = i28 % 128;
            int i29 = i28 % 2;
            return i21;
        } catch (IOException e) {
            throw new StringDataSourceException(e, this.dataSpec, 2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 1;
        int i4 = (i3 - (~(-(-((i2 ^ 1) | i3))))) - 1;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        Uri uri = this.dataSpec.uri;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = read;
        int i7 = ((i6 | 43) << 1) - (i6 ^ 43);
        IconCompatParcelizer = i7 % 128;
        if (i7 % 2 == 0) {
            return uri;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.exoplayer2.upstream.DataSpec, int] */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws StringDataSourceException {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 89;
        int i4 = (i3 - (~((i2 ^ 89) | i3))) - 1;
        IconCompatParcelizer = i4 % 128;
        ?? r2 = i4 % 2;
        try {
            try {
                if (r2 != 0) {
                    DataSpec dataSpec = this.dataSpec;
                    this.dataSpec = null;
                    throw null;
                }
                DataSpec dataSpec2 = this.dataSpec;
                this.dataSpec = null;
                InputStream inputStream = this.stream;
                int i5 = i2 & 11;
                int i6 = ((~i5) & (i2 | 11)) + (i5 << 1);
                IconCompatParcelizer = i6 % 128;
                int i7 = i6 % 2;
                if (inputStream != null) {
                    int i8 = i2 & 65;
                    int i9 = i8 + ((i2 ^ 65) | i8);
                    IconCompatParcelizer = i9 % 128;
                    int i10 = i9 % 2;
                    inputStream.close();
                    int i11 = read + 57;
                    IconCompatParcelizer = i11 % 128;
                    int i12 = i11 % 2;
                }
                this.stream = null;
                if (this.opened) {
                    int i13 = read;
                    int i14 = i13 & 83;
                    int i15 = (((i13 ^ 83) | i14) << 1) - ((i13 | 83) & (~i14));
                    IconCompatParcelizer = i15 % 128;
                    int i16 = i15 % 2;
                    this.opened = false;
                    transferEnded();
                    int i17 = read;
                    int i18 = i17 & 53;
                    int i19 = (((i17 ^ 53) | i18) << 1) - ((i17 | 53) & (~i18));
                    IconCompatParcelizer = i19 % 128;
                    int i20 = i19 % 2;
                }
                int i21 = IconCompatParcelizer;
                int i22 = ((i21 & 112) + (i21 | 112)) - 1;
                read = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
            } catch (IOException e) {
                throw new StringDataSourceException(e, r2, 3);
            }
        } catch (Throwable th) {
            this.stream = null;
            if (!(!this.opened)) {
                int i23 = IconCompatParcelizer + 95;
                read = i23 % 128;
                int i24 = i23 % 2;
                this.opened = false;
                transferEnded();
                int i25 = IconCompatParcelizer;
                int i26 = (-2) - (((i25 & 84) + (i25 | 84)) ^ (-1));
                read = i26 % 128;
                int i27 = i26 % 2;
            }
            throw th;
        }
    }

    public static class StringDataSourceException extends HttpDataSource.HttpDataSourceException {
        public StringDataSourceException(IOException iOException, DataSpec dataSpec, int i) {
            super(iOException, dataSpec, 2000, i);
        }
    }
}
