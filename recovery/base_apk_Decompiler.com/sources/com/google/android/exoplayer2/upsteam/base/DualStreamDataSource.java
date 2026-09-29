package com.google.android.exoplayer2.upsteam.base;

import android.net.Uri;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H$¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/google/android/exoplayer2/upsteam/base/DualStreamDataSource;", "Lcom/google/android/exoplayer2/upstream/DataSource;", "FirstSource", "SecondSource", "p0", "p1", "<init>", "(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;)V", "Lcom/google/android/exoplayer2/upstream/TransferListener;", "", "addTransferListener", "(Lcom/google/android/exoplayer2/upstream/TransferListener;)V", "Lcom/google/android/exoplayer2/upstream/DataSpec;", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "(Lcom/google/android/exoplayer2/upstream/DataSpec;)J", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "", "p2", "read", "([BII)I", "close", "()V", "pickSource", "(Lcom/google/android/exoplayer2/upstream/DataSpec;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;)Lcom/google/android/exoplayer2/upstream/DataSource;", "firstSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "secondSource", "", "isFirstSourceOpened", "Z", "openedUri", "Landroid/net/Uri;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DualStreamDataSource<FirstSource extends DataSource, SecondSource extends DataSource> implements DataSource {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private final FirstSource firstSource;
    private boolean isFirstSourceOpened;
    private Uri openedUri;
    private final SecondSource secondSource;

    protected abstract DataSource pickSource(DataSpec p0, FirstSource p1, SecondSource p2);

    public DualStreamDataSource(FirstSource firstsource, SecondSource secondsource) {
        toMagicModuleMetaRepoModel.write(firstsource, "");
        toMagicModuleMetaRepoModel.write(secondsource, "");
        this.firstSource = firstsource;
        this.secondSource = secondsource;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener p0) {
        FirstSource firstsource;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 87;
        int i4 = (((i2 ^ 87) | i3) << 1) - ((i2 | 87) & (~i3));
        read = i4 % 128;
        if (i4 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Assertions.checkNotNull(p0);
            firstsource = this.firstSource;
            int i5 = 75 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            Assertions.checkNotNull(p0);
            firstsource = this.firstSource;
        }
        int i6 = RemoteActionCompatParcelizer;
        int i7 = (i6 & (-120)) | ((~i6) & 119);
        int i8 = (i6 & 119) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        read = i9 % 128;
        int i10 = i9 % 2;
        firstsource.addTransferListener(p0);
        this.secondSource.addTransferListener(p0);
        int i11 = RemoteActionCompatParcelizer;
        int i12 = (((i11 ^ 95) | (i11 & 95)) << 1) - (((~i11) & 95) | (i11 & (-96)));
        read = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec p0) throws IOException {
        boolean z;
        long jOpen;
        int i = 2 % 2;
        int i2 = read + 97;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.openedUri = p0.uri;
        int i4 = read;
        int i5 = i4 & 117;
        int i6 = -(-((i4 ^ 117) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        DataSource dataSourcePickSource = pickSource(p0, this.firstSource, this.secondSource);
        FirstSource firstsource = this.firstSource;
        int i9 = read;
        int i10 = i9 | 53;
        int i11 = ((i10 << 1) - (~(-(i10 & (~(i9 & 53)))))) - 1;
        int i12 = i11 % 128;
        RemoteActionCompatParcelizer = i12;
        int i13 = i11 % 2;
        if (dataSourcePickSource == firstsource) {
            int i14 = i12 & 125;
            int i15 = (i14 - (~(-(-((i12 ^ 125) | i14))))) - 1;
            read = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i12 & 87;
            int i18 = -(-((i12 ^ 87) | i17));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            read = i19 % 128;
            int i20 = i19 % 2;
            z = true;
        } else {
            int i21 = i9 + 1;
            RemoteActionCompatParcelizer = i21 % 128;
            int i22 = i21 % 2;
            z = false;
        }
        this.isFirstSourceOpened = z;
        Object obj = null;
        if (!z) {
            long jOpen2 = this.secondSource.open(p0);
            int i23 = RemoteActionCompatParcelizer;
            int i24 = i23 & 109;
            int i25 = (((i23 | 109) & (~i24)) - (~(i24 << 1))) - 1;
            read = i25 % 128;
            if (i25 % 2 != 0) {
                return jOpen2;
            }
            obj.hashCode();
            throw null;
        }
        int i26 = read;
        int i27 = i26 & 61;
        int i28 = -(-((i26 ^ 61) | i27));
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        RemoteActionCompatParcelizer = i29 % 128;
        if (i29 % 2 != 0) {
            jOpen = firstsource.open(p0);
            int i30 = 4 / 0;
        } else {
            jOpen = firstsource.open(p0);
        }
        int i31 = RemoteActionCompatParcelizer;
        int i32 = (i31 & 69) + (i31 | 69);
        read = i32 % 128;
        if (i32 % 2 != 0) {
            return jOpen;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 83;
        int i4 = -(-((i2 ^ 83) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        read = i5 % 128;
        int i6 = i5 % 2;
        Uri uri = this.openedUri;
        if (i6 == 0) {
            int i7 = 50 / 0;
        }
        int i8 = (i2 ^ 62) + ((i2 & 62) << 1);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        read = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 27 / 0;
        }
        return uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] p0, int p1, int p2) throws IOException {
        int i = 2 % 2;
        int i2 = read;
        int i3 = ((i2 & 92) + (i2 | 92)) - 1;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!this.isFirstSourceOpened) {
            int i5 = this.secondSource.read(p0, p1, p2);
            int i6 = RemoteActionCompatParcelizer;
            int i7 = i6 & 11;
            int i8 = i7 + ((i6 ^ 11) | i7);
            read = i8 % 128;
            if (i8 % 2 != 0) {
                return i5;
            }
            throw null;
        }
        int i9 = read;
        int i10 = i9 & 103;
        int i11 = (i9 ^ 103) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        RemoteActionCompatParcelizer = i12 % 128;
        int i13 = i12 % 2;
        int i14 = this.firstSource.read(p0, p1, p2);
        int i15 = read;
        int i16 = i15 & 3;
        int i17 = (((i15 | 3) & (~i16)) - (~(i16 << 1))) - 1;
        RemoteActionCompatParcelizer = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 82 / 0;
        }
        return i14;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 77;
        int i4 = ((i2 ^ 77) | i3) << 1;
        int i5 = -((~i3) & (i2 | 77));
        int i6 = (i4 & i5) + (i4 | i5);
        RemoteActionCompatParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (!this.isFirstSourceOpened) {
            this.secondSource.close();
            int i7 = RemoteActionCompatParcelizer;
            int i8 = i7 & 59;
            int i9 = (((i7 | 59) & (~i8)) - (~(i8 << 1))) - 1;
            read = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        int i11 = i2 & 99;
        int i12 = (i2 | 99) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        RemoteActionCompatParcelizer = i14 % 128;
        if (i14 % 2 != 0) {
            this.firstSource.close();
            throw null;
        }
        this.firstSource.close();
        int i15 = RemoteActionCompatParcelizer;
        int i16 = ((i15 ^ 22) + ((i15 & 22) << 1)) - 1;
        read = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }
}
