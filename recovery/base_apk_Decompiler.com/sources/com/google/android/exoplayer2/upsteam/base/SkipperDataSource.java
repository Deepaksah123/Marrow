package com.google.android.exoplayer2.upsteam.base;

import android.net.Uri;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0001*B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u001e*\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010)\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010&"}, d2 = {"Lcom/google/android/exoplayer2/upsteam/base/SkipperDataSource;", "Lcom/google/android/exoplayer2/upstream/DataSource;", "p0", "", "p1", "p2", "<init>", "(Lcom/google/android/exoplayer2/upstream/DataSource;II)V", "", "read", "([BII)I", "Lcom/google/android/exoplayer2/upstream/TransferListener;", "", "addTransferListener", "(Lcom/google/android/exoplayer2/upstream/TransferListener;)V", "Lcom/google/android/exoplayer2/upstream/DataSpec;", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "(Lcom/google/android/exoplayer2/upstream/DataSpec;)J", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "close", "()V", "", "shouldSkip", "(I)Z", "readAndSkip", "fullySkip", "(I)I", "", "logd", "(Ljava/lang/String;)V", "simplify", "(Ljava/lang/String;)Ljava/lang/String;", "upstream", "Lcom/google/android/exoplayer2/upstream/DataSource;", "skipLength", "I", "skipStartIndex", "readSoFar", "skippedSoFar", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SkipperDataSource implements DataSource {
    private static int AudioAttributesCompatParcelizer = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean DEBUG_LOGGING = false;
    public static final int DEFAULT_SKIP_START_INDEX = 1000;
    private static int IconCompatParcelizer = 0;
    private static final String TAG = "PADDING_CHECK";
    private static int read = 1;
    private static int write = 1;
    private int readSoFar;
    private final int skipLength;
    private final int skipStartIndex;
    private int skippedSoFar;
    private final DataSource upstream;

    public SkipperDataSource(DataSource dataSource, int i, int i2) {
        toMagicModuleMetaRepoModel.write(dataSource, "");
        this.upstream = dataSource;
        this.skipLength = i;
        this.skipStartIndex = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SkipperDataSource(DataSource dataSource, int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i3 & 4) != 0) {
            int i4 = IconCompatParcelizer;
            int i5 = ((i4 & 112) + (i4 | 112)) - 1;
            write = i5 % 128;
            int i6 = i5 % 2 == 0 ? 25109 : 1000;
            int i7 = i4 & 91;
            int i8 = (i7 - (~(-(-((i4 ^ 91) | i7))))) - 1;
            write = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 4;
            } else {
                int i10 = 2 % 2;
            }
            i2 = i6;
        }
        this(dataSource, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        r1 = r5.readSoFar;
        r2 = new java.lang.StringBuilder("Read So Far: ");
        r3 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer + 43;
        com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write = r3 % 128;
        r3 = r3 % 2;
        r2.append(r1);
        r2.append(", Input Offset: ");
        r2.append(r7);
        r7 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write + 13;
        com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        if ((r7 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        r2.append(", Input Length: ");
        r2.append(r8);
        logd(r2.toString());
        r0 = 2 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        r2.append(", Input Length: ");
        r2.append(r8);
        logd(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        r7 = r5.readSoFar;
        r8 = -(-r6);
        r1 = r7 & r8;
        r7 = r7 | r8;
        r5.readSoFar = ((r1 | r7) << 1) - (r7 ^ r1);
        r5 = r3 & 57;
        r7 = (r3 ^ 57) | r5;
        r8 = (r5 & r7) + (r5 | r7);
        com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (r6 == (-1)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r6 == (-1)) goto L10;
     */
    @Override // com.google.android.exoplayer2.upstream.DataReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upsteam.base.SkipperDataSource.read(byte[], int, int):int");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener p0) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 47;
        int i4 = ((i2 ^ 47) | i3) << 1;
        int i5 = -((i2 | 47) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        IconCompatParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.upstream.addTransferListener(p0);
            int i7 = 37 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.upstream.addTransferListener(p0);
        }
        int i8 = IconCompatParcelizer;
        int i9 = i8 & 21;
        int i10 = ((((i8 ^ 21) | i9) << 1) - (~(-((i8 | 21) & (~i9))))) - 1;
        write = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long open(DataSpec p0) throws IOException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        write = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.readSoFar = 0;
        this.skippedSoFar = 0;
        int i4 = IconCompatParcelizer;
        int i5 = i4 & 19;
        int i6 = ((i4 | 19) & (~i5)) + (i5 << 1);
        write = i6 % 128;
        int i7 = i6 % 2;
        long jOpen = this.upstream.open(p0);
        int i8 = IconCompatParcelizer;
        int i9 = i8 & 117;
        int i10 = (i8 ^ 117) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        write = i11 % 128;
        int i12 = i11 % 2;
        return jOpen;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 87;
        int i4 = (i2 | 87) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        DataSource dataSource = this.upstream;
        if (i7 == 0) {
            return dataSource.getUri();
        }
        dataSource.getUri();
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        int i = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i2 = ~iIdentityHashCode;
        int i3 = ~((i2 & 613679911) | (613679911 ^ i2));
        int i4 = ~iIdentityHashCode;
        int i5 = ~(((-156877858) & i4) | (iIdentityHashCode & 156877857) | ((-156877858) & iIdentityHashCode));
        int i6 = i3 ^ i5;
        int i7 = i3 & i5;
        int i8 = ((i7 & i6) | (i6 ^ i7)) * 1900;
        int i9 = (-286546701) & i8;
        int i10 = (i8 ^ (-286546701)) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        int i12 = (i4 & (-156877858)) | ((~i4) & 156877857);
        int i13 = i4 & 156877857;
        int i14 = (i12 & i13) | (i12 ^ i13);
        int i15 = (i14 | (~i14)) & (~i14);
        int i16 = (-613679912) ^ iIdentityHashCode;
        int i17 = (-613679912) & iIdentityHashCode;
        int i18 = ~((i16 & i17) | (i16 ^ i17));
        int i19 = ((i15 & i18) | (i15 ^ i18)) * (-950);
        int i20 = i11 & i19;
        int i21 = i20 + ((i19 ^ i11) | i20);
        int i22 = i4 & (-613679912);
        int i23 = (i4 | (-613679912)) & (~i22);
        int i24 = (i22 & i23) | (i23 ^ i22);
        int i25 = (i24 | (~i24)) & (~i24);
        int i26 = ~((iIdentityHashCode & 156877857) | (156877857 ^ iIdentityHashCode));
        int i27 = i25 ^ i26;
        int i28 = i26 & i25;
        int i29 = -(~(-(-(((i28 & i27) | (i27 ^ i28)) * 950))));
        int i30 = ((i21 & i29) + (i29 | i21)) - 1;
        int iRemoteActionCompatParcelizer = AuthApiStatusCodes.RemoteActionCompatParcelizer();
        int i31 = ~iRemoteActionCompatParcelizer;
        int i32 = i31 & (-1692435401);
        int i33 = (~i32) & (i31 | (-1692435401));
        int i34 = (i32 & i33) | (i33 ^ i32);
        int i35 = i34 & 1914196356;
        int i36 = (i34 | 1914196356) & (~i35);
        int i37 = (-1211948705) + ((~((i36 & i35) | (i36 ^ i35))) * 52);
        int i38 = ~(((~iRemoteActionCompatParcelizer) & (i31 | iRemoteActionCompatParcelizer)) | (-1914196357));
        int i39 = i38 & 1610613120;
        int i40 = (i38 | 1610613120) & (~i39);
        int i41 = (i40 & i39) | (i40 ^ i39);
        int i42 = i31 & (-1692435401);
        int i43 = (i31 | (-1692435401)) & (~i42);
        int i44 = ~((i43 & i42) | (i43 ^ i42));
        int i45 = i41 ^ i44;
        int i46 = i44 & i41;
        int i47 = ((i46 & i45) | (i45 ^ i46)) * (-52);
        int i48 = i37 & i47;
        int i49 = -(-((i47 ^ i37) | i48));
        int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
        int i51 = ~iRemoteActionCompatParcelizer;
        int i52 = ~((i51 & 1692435400) | ((~i51) & 1692435400) | ((-1692435401) & i51));
        int i53 = ((i52 & (-1996018637)) | (1996018636 & i52) | ((~i52) & (-1996018637))) * 52;
        int i54 = i50 & i53;
        int i55 = (i53 ^ i50) | i54;
        int i56 = (i54 & i55) + (i55 | i54);
        this.upstream.close();
        if (i30 > i56) {
            throw null;
        }
        int i57 = IconCompatParcelizer;
        int i58 = i57 & 17;
        int i59 = i58 + ((i57 ^ 17) | i58);
        write = i59 % 128;
        int i60 = i59 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean shouldSkip(int r22) {
        /*
            Method dump skipped, instruction units count: 1025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upsteam.base.SkipperDataSource.shouldSkip(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[PHI: r8
      0x003d: PHI (r8v4 int) = (r8v3 int), (r8v80 int) binds: [B:10:0x003b, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023a A[PHI: r8
      0x023a: PHI (r8v79 int) = (r8v3 int), (r8v4 int), (r8v4 int), (r8v80 int) binds: [B:10:0x003b, B:27:0x0223, B:24:0x01fa, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int readAndSkip(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 2301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upsteam.base.SkipperDataSource.readAndSkip(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x016c A[PHI: r4
      0x016c: PHI (r4v29 int) = (r4v28 int), (r4v44 int) binds: [B:29:0x016a, B:26:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0195 A[PHI: r4
      0x0195: PHI (r4v43 int) = (r4v28 int), (r4v44 int) binds: [B:29:0x016a, B:26:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int fullySkip(int r17) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upsteam.base.SkipperDataSource.fullySkip(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void logd(java.lang.String r5) {
        /*
            r4 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer
            r1 = r0 & 63
            r0 = r0 | 63
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write = r0
            int r1 = r1 % r5
            boolean r1 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.DEBUG_LOGGING
            r1 = r1 ^ 1
            if (r1 == 0) goto L17
            goto Lac
        L17:
            r1 = r0 & (-100)
            int r2 = ~r0
            r2 = r2 & 99
            r1 = r1 | r2
            r0 = r0 & 99
            int r0 = r0 << 1
            int r0 = -r0
            int r0 = -r0
            r2 = r1 & r0
            r0 = r0 | r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer = r0
            int r2 = r2 % r5
            r0 = 0
            if (r2 != 0) goto Lbf
            com.google.android.exoplayer2.upstream.DataSource r1 = r4.upstream
            android.net.Uri r1 = r1.getUri()
            if (r1 == 0) goto L5d
            int r2 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer
            int r2 = r2 + 29
            int r3 = r2 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write = r3
            int r2 = r2 % r5
            if (r2 == 0) goto L56
            java.lang.String r1 = r1.getLastPathSegment()
            if (r1 == 0) goto L5d
            java.lang.String r0 = r4.simplify(r1)
            int r4 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write
            int r4 = r4 + 53
            int r1 = r4 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer = r1
            int r4 = r4 % r5
            goto L70
        L56:
            r1.getLastPathSegment()
            r0.hashCode()
            throw r0
        L5d:
            int r4 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer
            r1 = r4 | 61
            int r1 = r1 << 1
            r2 = r4 & (-62)
            int r4 = ~r4
            r3 = 61
            r4 = r4 & r3
            r4 = r4 | r2
            int r1 = r1 - r4
            int r4 = r1 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write = r4
            int r1 = r1 % r5
        L70:
            if (r0 != 0) goto L8b
            int r4 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer
            r0 = r4 ^ 58
            r1 = r4 & 58
            int r1 = r1 << 1
            int r0 = r0 + r1
            r0 = r0 ^ (-1)
            int r0 = (-2) - r0
            int r1 = r0 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write = r1
            int r0 = r0 % r5
            int r4 = r4 + 87
            int r0 = r4 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write = r0
            int r4 = r4 % r5
        L8b:
            int r4 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer
            r0 = r4 | 58
            int r0 = r0 << 1
            r4 = r4 ^ 58
            int r0 = r0 - r4
            int r0 = r0 + (-1)
            int r4 = r0 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write = r4
            int r0 = r0 % r5
            r0 = r4 & 105(0x69, float:1.47E-43)
            r4 = r4 | 105(0x69, float:1.47E-43)
            int r4 = -r4
            int r4 = -r4
            r1 = r0 ^ r4
            r4 = r4 & r0
            int r4 = r4 << 1
            int r1 = r1 + r4
            int r4 = r1 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer = r4
            int r1 = r1 % r5
        Lac:
            int r4 = com.google.android.exoplayer2.upsteam.base.SkipperDataSource.write
            r0 = r4 | 41
            int r0 = r0 << 1
            r1 = r4 & (-42)
            int r4 = ~r4
            r4 = r4 & 41
            r4 = r4 | r1
            int r0 = r0 - r4
            int r4 = r0 % 128
            com.google.android.exoplayer2.upsteam.base.SkipperDataSource.IconCompatParcelizer = r4
            int r0 = r0 % r5
            return
        Lbf:
            com.google.android.exoplayer2.upstream.DataSource r4 = r4.upstream
            r4.getUri()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upsteam.base.SkipperDataSource.logd(java.lang.String):void");
    }

    private final String simplify(String str) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 91;
        int i4 = (i2 | 91) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        IconCompatParcelizer = i6 % 128;
        if (i6 % 2 == 0 ? str.length() < 15 : str.length() < 42) {
            int i7 = write;
            int i8 = (i7 & (-58)) | ((~i7) & 57);
            int i9 = (i7 & 57) << 1;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            IconCompatParcelizer = i10 % 128;
            int i11 = i10 % 2;
            return str;
        }
        String strRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer(str, 5);
        String strRatingCompat = TestGroupLSModel.RatingCompat(str);
        StringBuilder sb = new StringBuilder();
        int i12 = write;
        int i13 = i12 & 11;
        int i14 = ((i12 | 11) & (~i13)) + (i13 << 1);
        IconCompatParcelizer = i14 % 128;
        if (i14 % 2 != 0) {
            sb.append(strRemoteActionCompatParcelizer);
            sb.append("...");
            sb.append(strRatingCompat);
            sb.toString();
            throw null;
        }
        sb.append(strRemoteActionCompatParcelizer);
        sb.append("...");
        sb.append(strRatingCompat);
        return sb.toString();
    }

    static {
        int i = read;
        int i2 = (((i & (-14)) | ((~i) & 13)) - (~((i & 13) << 1))) - 1;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/google/android/exoplayer2/upsteam/base/SkipperDataSource$Companion;", "", "<init>", "()V", "", "DEFAULT_SKIP_START_INDEX", "I", "", "DEBUG_LOGGING", "Z", "", "TAG", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
