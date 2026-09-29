package com.google.android.exoplayer2.upsteam.base;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class Aes128DataSource implements DataSource {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    private CipherInputStream cipherInputStream;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;
    private final DataSource upstream;

    public Aes128DataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.upstream = dataSource;
        this.encryptionKey = bArr;
        this.encryptionIv = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 & 47;
        int i4 = -(-((i2 ^ 47) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        write = i5 % 128;
        if (i5 % 2 == 0) {
            Assertions.checkNotNull(transferListener);
            this.upstream.addTransferListener(transferListener);
            int i6 = 21 / 0;
        } else {
            Assertions.checkNotNull(transferListener);
            this.upstream.addTransferListener(transferListener);
        }
        int i7 = IconCompatParcelizer;
        int i8 = ((i7 & 38) + (i7 | 38)) - 1;
        write = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        int i = 2 % 2;
        try {
            Cipher cipherInstance = getCipherInstance();
            try {
                cipherInstance.init(2, new SecretKeySpec(this.encryptionKey, "AES"), new IvParameterSpec(this.encryptionIv));
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.upstream, dataSpec);
                this.cipherInputStream = new CipherInputStream(dataSourceInputStream, cipherInstance);
                dataSourceInputStream.open();
                int i2 = IconCompatParcelizer;
                int i3 = i2 & 7;
                int i4 = i3 + ((i2 ^ 7) | i3);
                write = i4 % 128;
                if (i4 % 2 != 0) {
                    return -1L;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = write + 29;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            Assertions.checkNotNull(this.cipherInputStream);
            CipherInputStream cipherInputStream = this.cipherInputStream;
            int i5 = IconCompatParcelizer;
            int i6 = ((i5 ^ 31) | (i5 & 31)) << 1;
            int i7 = -(((~i5) & 31) | (i5 & (-32)));
            int i8 = (i6 & i7) + (i7 | i6);
            write = i8 % 128;
            int i9 = i8 % 2;
            int i10 = cipherInputStream.read(bArr, i, i2);
            if (i10 < 0) {
                int i11 = IconCompatParcelizer + 9;
                write = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 22 / 0;
                }
                i10 = -1;
            }
            int i13 = IconCompatParcelizer + 121;
            write = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 / 0;
            }
            return i10;
        }
        Assertions.checkNotNull(this.cipherInputStream);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = (((i2 ^ 39) | (i2 & 39)) << 1) - (((~i2) & 39) | (i2 & (-40)));
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Uri uri = this.upstream.getUri();
        int i5 = IconCompatParcelizer + 35;
        write = i5 % 128;
        if (i5 % 2 != 0) {
            return uri;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map<String, List<String>> getResponseHeaders() {
        int i = 2 % 2;
        int i2 = write + 63;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        DataSource dataSource = this.upstream;
        if (i3 != 0) {
            dataSource.getResponseHeaders();
            throw null;
        }
        Map<String, List<String>> responseHeaders = dataSource.getResponseHeaders();
        int i4 = IconCompatParcelizer;
        int i5 = i4 & 65;
        int i6 = -(-((i4 ^ 65) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        write = i7 % 128;
        int i8 = i7 % 2;
        return responseHeaders;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 & 45;
        int i4 = (i3 - (~(-(-((i2 ^ 45) | i3))))) - 1;
        write = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.cipherInputStream != null) {
            int i5 = (i2 | 89) << 1;
            int i6 = -(((~i2) & 89) | (i2 & (-90)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            write = i7 % 128;
            int i8 = i7 % 2;
            this.cipherInputStream = null;
            this.upstream.close();
            int i9 = write;
            int i10 = ((i9 | 27) << 1) - (i9 ^ 27);
            IconCompatParcelizer = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 5 % 4;
            }
        }
        int i12 = IconCompatParcelizer;
        int i13 = ((i12 & (-32)) | ((~i12) & 31)) + ((i12 & 31) << 1);
        write = i13 % 128;
        int i14 = i13 % 2;
    }

    protected Cipher getCipherInstance() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = write + 85;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        int i4 = write + 89;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return cipher;
    }
}
