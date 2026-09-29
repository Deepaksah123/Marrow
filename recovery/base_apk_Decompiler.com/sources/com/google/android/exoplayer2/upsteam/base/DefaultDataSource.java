package com.google.android.exoplayer2.upsteam.base;

import android.net.Uri;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001b0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001f"}, d2 = {"Lcom/google/android/exoplayer2/upsteam/base/DefaultDataSource;", "Lcom/google/android/exoplayer2/upstream/BaseDataSource;", "", "p0", "Lcom/google/android/exoplayer2/upstream/DataSource;", "p1", "<init>", "(ZLcom/google/android/exoplayer2/upstream/DataSource;)V", "Lcom/google/android/exoplayer2/upstream/DataSpec;", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "(Lcom/google/android/exoplayer2/upstream/DataSpec;)J", "getOverridingSource", "(Lcom/google/android/exoplayer2/upstream/DataSpec;)Lcom/google/android/exoplayer2/upstream/DataSource;", "", "", "p2", "read", "([BII)I", "", "close", "()V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "", "", "getResponseHeaders", "()Ljava/util/Map;", "defaultSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "openedDataSource"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class DefaultDataSource extends BaseDataSource {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    private final DataSource defaultSource;
    private DataSource openedDataSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDataSource(boolean z, DataSource dataSource) {
        super(z);
        toMagicModuleMetaRepoModel.write(dataSource, "");
        this.defaultSource = dataSource;
        this.openedDataSource = dataSource;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec p0) throws IOException {
        DataSource overridingSource;
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = ((i2 | 23) << 1) - (i2 ^ 23);
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            overridingSource = getOverridingSource(p0);
            this.openedDataSource = overridingSource;
            int i4 = 27 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            overridingSource = getOverridingSource(p0);
            this.openedDataSource = overridingSource;
        }
        int i5 = AudioAttributesCompatParcelizer;
        int i6 = i5 & 3;
        int i7 = ((i5 ^ 3) | i6) << 1;
        int i8 = -((i5 | 3) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        RemoteActionCompatParcelizer = i9 % 128;
        if (i9 % 2 == 0) {
            return overridingSource.open(p0);
        }
        overridingSource.open(p0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DataSource getOverridingSource(DataSpec p0) throws IOException {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        DataSource dataSource = this.defaultSource;
        int i3 = (-2) - ((AudioAttributesCompatParcelizer + 80) ^ (-1));
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return dataSource;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] p0, int p1, int p2) throws IOException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
        AudioAttributesCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        int i5 = this.openedDataSource.read(p0, p1, p2);
        int i6 = RemoteActionCompatParcelizer;
        int i7 = i6 | 89;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 89)) & i7);
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        AudioAttributesCompatParcelizer = i10 % 128;
        if (i10 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        DataSource dataSource;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 99;
        int i4 = i2 | 99;
        int i5 = (i3 & i4) + (i4 | i3);
        AudioAttributesCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            this.openedDataSource.close();
            dataSource = this.defaultSource;
            int i6 = 93 / 0;
        } else {
            this.openedDataSource.close();
            dataSource = this.defaultSource;
        }
        int i7 = AudioAttributesCompatParcelizer;
        int i8 = i7 & 55;
        int i9 = (((i7 ^ 55) | i8) << 1) - ((i7 | 55) & (~i8));
        RemoteActionCompatParcelizer = i9 % 128;
        int i10 = i9 % 2;
        this.openedDataSource = dataSource;
        if (i10 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 51;
        int i4 = (i3 - (~((i2 ^ 51) | i3))) - 1;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        DataSource dataSource = this.openedDataSource;
        if (i5 == 0) {
            dataSource.getUri();
            throw null;
        }
        Uri uri = dataSource.getUri();
        int i6 = AudioAttributesCompatParcelizer;
        int i7 = (i6 & (-64)) | ((~i6) & 63);
        int i8 = (i6 & 63) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        RemoteActionCompatParcelizer = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 72 / 0;
        }
        return uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 97;
        int i4 = -(-((i2 ^ 97) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        Map<String, List<String>> responseHeaders = this.openedDataSource.getResponseHeaders();
        int i7 = AudioAttributesCompatParcelizer;
        int i8 = ((i7 & 42) + (i7 | 42)) - 1;
        RemoteActionCompatParcelizer = i8 % 128;
        int i9 = i8 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(responseHeaders, "");
        int i10 = RemoteActionCompatParcelizer + 23;
        AudioAttributesCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        return responseHeaders;
    }
}
