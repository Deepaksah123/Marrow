package com.google.android.exoplayer2.drm;

import android.graphics.Color;
import android.media.AudioTrack;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.video.VideoPlaybackConfiguration;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.buildRemoveAllDownloadsIntent;
import kotlin.parseMdtaFromMeta;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class FrameworkMediaDrm implements ExoMediaDrm {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String CENC_SCHEME_MIME_TYPE = "cenc";
    public static final ExoMediaDrm.Provider DEFAULT_PROVIDER;
    private static int IconCompatParcelizer = 0;
    private static final String MOCK_LA_URL = "<LA_URL>https://x</LA_URL>";
    private static final String MOCK_LA_URL_VALUE = "https://x";
    private static final String TAG = "FrameworkMediaDrm";
    private static final int UTF_16_BYTES_PER_CHARACTER = 2;
    private static int[] write;
    private final MediaDrm mediaDrm;
    private int referenceCount;
    private final UUID uuid;
    private static final byte[] $$d = {70, -23, 8, 77, -63, TarConstants.LF_CONTIG, 4, 11, 8, -13, 15, -11, -2, 5, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, TarConstants.LF_DIR, 15, -8, 16, -1, -4, -3, -52, 57, 21, -7, 3, -2, -9, 26, -18, 15, -62, -2, 71, -2, 8, -1, -13, 4, -53, 56, -1, 20, -9, -56, 65, -10, 15, -3, -1, 1, 16, 3, -68, 38, 21, 13, 4, -11, 16, -12, 11, 8, -17, 21, -9, 8, 1, -72, 15, 21, 10, 4, 7, -13, -34, 36, 19, -9, 8, 1, -41, 46, 0, 5, -13, 21, -34, 19, 19, -13, 4, 9, -1, 19, -19, 15};
    private static final int $$e = 7;
    private static final byte[] $$a = {26, 47, -113, 59, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 24, 10, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -7, -11, 9, -17, -15, -6, 1};
    private static final int $$b = 41;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int AudioAttributesCompatParcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.$$a
            int r5 = r5 + 65
            int r7 = 31 - r7
            int r6 = 56 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r6]
        L24:
            int r5 = r5 + r4
            int r5 = r5 + 2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 82
            int r0 = 67 - r5
            int r6 = 80 - r6
            byte[] r1 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.$$d
            byte[] r0 = new byte[r0]
            int r5 = 66 - r5
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r5
            r7 = r6
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.c(byte, int, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final /* bridge */ /* synthetic */ CryptoConfig createCryptoConfig(byte[] bArr) throws MediaCryptoException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        read = i2 % 128;
        int i3 = i2 % 2;
        FrameworkCryptoConfig frameworkCryptoConfigCreateCryptoConfig = createCryptoConfig(bArr);
        int i4 = RemoteActionCompatParcelizer + 23;
        read = i4 % 128;
        int i5 = i4 % 2;
        return frameworkCryptoConfigCreateCryptoConfig;
    }

    static {
        IconCompatParcelizer = 1;
        read();
        DEFAULT_PROVIDER = new ExoMediaDrm.Provider() { // from class: com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda1
            @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
            public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
                return FrameworkMediaDrm.lambda$static$0(uuid);
            }
        };
        int i = AudioAttributesCompatParcelizer + 55;
        IconCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.android.exoplayer2.drm.ExoMediaDrm] */
    /* JADX WARN: Type inference failed for: r3v9 */
    static /* synthetic */ ExoMediaDrm lambda$static$0(UUID uuid) throws UnsupportedDrmException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        read = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                int i3 = 83 / 0;
                uuid = newInstance(uuid);
            } else {
                uuid = newInstance(uuid);
            }
            int i4 = read + 65;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                return uuid;
            }
            throw null;
        } catch (UnsupportedDrmException unused) {
            StringBuilder sb = new StringBuilder("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(uuid);
            sb.append(".");
            Log.e(TAG, sb.toString());
            return new DummyExoMediaDrm();
        }
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        read = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsCryptoSchemeSupported = MediaDrm.isCryptoSchemeSupported(adjustUuid(uuid));
        int i4 = read + 79;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return zIsCryptoSchemeSupported;
    }

    public static FrameworkMediaDrm newInstance(UUID uuid) throws UnsupportedDrmException {
        int i = 2 % 2;
        try {
            FrameworkMediaDrm frameworkMediaDrm = new FrameworkMediaDrm(uuid);
            int i2 = RemoteActionCompatParcelizer + 11;
            read = i2 % 128;
            int i3 = i2 % 2;
            return frameworkMediaDrm;
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Assertions.checkNotNull(uuid);
        Assertions.checkArgument(!C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        MediaDrm mediaDrm = new MediaDrm(adjustUuid(uuid));
        this.mediaDrm = mediaDrm;
        this.referenceCount = 1;
        if (C.WIDEVINE_UUID.equals(uuid) && needsForceWidevineL3Workaround()) {
            int i = read + 107;
            RemoteActionCompatParcelizer = i % 128;
            int i2 = i % 2;
            forceWidevineL3(mediaDrm);
            if (i2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = RemoteActionCompatParcelizer + 91;
            read = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void setOnEventListener(final ExoMediaDrm.OnEventListener onEventListener) {
        MediaDrm.OnEventListener onEventListener2;
        int i = 2 % 2;
        int i2 = read + 19;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        MediaDrm mediaDrm = this.mediaDrm;
        if (onEventListener == null) {
            int i5 = i3 + 71;
            read = i5 % 128;
            int i6 = i5 % 2;
            onEventListener2 = null;
        } else {
            MediaDrm.OnEventListener onEventListener3 = new MediaDrm.OnEventListener() { // from class: com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda3
                @Override // android.media.MediaDrm.OnEventListener
                public final void onEvent(MediaDrm mediaDrm2, byte[] bArr, int i7, int i8, byte[] bArr2) {
                    this.f$0.m80lambda$setOnEventListener$1$comgoogleandroidexoplayer2drmFrameworkMediaDrm(onEventListener, mediaDrm2, bArr, i7, i8, bArr2);
                }
            };
            int i7 = RemoteActionCompatParcelizer + 1;
            read = i7 % 128;
            int i8 = i7 % 2;
            onEventListener2 = onEventListener3;
        }
        mediaDrm.setOnEventListener(onEventListener2);
    }

    /* JADX INFO: renamed from: lambda$setOnEventListener$1$com-google-android-exoplayer2-drm-FrameworkMediaDrm, reason: not valid java name */
    final /* synthetic */ void m80lambda$setOnEventListener$1$comgoogleandroidexoplayer2drmFrameworkMediaDrm(ExoMediaDrm.OnEventListener onEventListener, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = 2 % 2;
        int i4 = read + 61;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            onEventListener.onEvent(this, bArr, i, i2, bArr2);
        } else {
            onEventListener.onEvent(this, bArr, i, i2, bArr2);
            throw null;
        }
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int length2;
        int[] iArr3;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = write;
        int i4 = -470782045;
        if (iArr4 != null) {
            int i5 = $11 + 55;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (43694 - TextUtils.lastIndexOf("", '0', 0, 0)), View.resolveSize(0, 0) + 23297, 15 - (Process.myPid() >> 22), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -470782045;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = write;
        int i9 = 43695;
        if (iArr6 != null) {
            int i10 = $10 + 5;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i2])};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + i9), View.MeasureSpec.getMode(0) + 23297, View.getDefaultSize(0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i2++;
                i9 = 43695;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i11];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23297, 15 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i11++;
            }
            int i13 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i13;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i14 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i15 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48195 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Color.alpha(0) + 20126, (ViewConfiguration.getFadingEdgeLength() >> 16) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i16 = $11 + 27;
        $10 = i16 % 128;
        if (i16 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[PHI: r1
      0x0022: PHI (r1v6 android.media.MediaDrm) = (r1v5 android.media.MediaDrm), (r1v9 android.media.MediaDrm) binds: [B:10:0x0020, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[PHI: r1
      0x0024: PHI (r1v8 android.media.MediaDrm) = (r1v5 android.media.MediaDrm), (r1v9 android.media.MediaDrm) binds: [B:10:0x0020, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setOnKeyStatusChangeListener(final com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 23
            if (r1 < r2) goto L3a
            int r1 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.read
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1e
            android.media.MediaDrm r1 = r4.mediaDrm
            r3 = 74
            int r3 = r3 / 0
            if (r5 != 0) goto L24
            goto L22
        L1e:
            android.media.MediaDrm r1 = r4.mediaDrm
            if (r5 != 0) goto L24
        L22:
            r3 = r2
            goto L36
        L24:
            com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda0
            r3.<init>()
            int r4 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.read
            int r4 = r4 + 85
            int r5 = r4 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L36
            int r0 = r0 / 5
        L36:
            r1.setOnKeyStatusChangeListener(r3, r2)
            return
        L3a:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.setOnKeyStatusChangeListener(com.google.android.exoplayer2.drm.ExoMediaDrm$OnKeyStatusChangeListener):void");
    }

    /* JADX INFO: renamed from: lambda$setOnKeyStatusChangeListener$2$com-google-android-exoplayer2-drm-FrameworkMediaDrm, reason: not valid java name */
    final /* synthetic */ void m82lambda$setOnKeyStatusChangeListener$2$comgoogleandroidexoplayer2drmFrameworkMediaDrm(ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i2 = RemoteActionCompatParcelizer + 55;
        read = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new ExoMediaDrm.KeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        onKeyStatusChangeListener.onKeyStatusChange(this, bArr, arrayList, z);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void setOnExpirationUpdateListener(final ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
        MediaDrm.OnExpirationUpdateListener onExpirationUpdateListener2;
        int i = 2 % 2;
        if (Util.SDK_INT < 23) {
            throw new UnsupportedOperationException();
        }
        MediaDrm mediaDrm = this.mediaDrm;
        Object obj = null;
        if (onExpirationUpdateListener == null) {
            int i2 = read + 13;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            onExpirationUpdateListener2 = null;
        } else {
            onExpirationUpdateListener2 = new MediaDrm.OnExpirationUpdateListener() { // from class: com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda2
                @Override // android.media.MediaDrm.OnExpirationUpdateListener
                public final void onExpirationUpdate(MediaDrm mediaDrm2, byte[] bArr, long j) {
                    this.f$0.m81lambda$setOnExpirationUpdateListener$3$comgoogleandroidexoplayer2drmFrameworkMediaDrm(onExpirationUpdateListener, mediaDrm2, bArr, j);
                }
            };
        }
        mediaDrm.setOnExpirationUpdateListener(onExpirationUpdateListener2, (Handler) null);
        int i4 = read + 117;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: lambda$setOnExpirationUpdateListener$3$com-google-android-exoplayer2-drm-FrameworkMediaDrm, reason: not valid java name */
    final /* synthetic */ void m81lambda$setOnExpirationUpdateListener$3$comgoogleandroidexoplayer2drmFrameworkMediaDrm(ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, MediaDrm mediaDrm, byte[] bArr, long j) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        read = i2 % 128;
        int i3 = i2 % 2;
        onExpirationUpdateListener.onExpirationUpdate(this, bArr, j);
        int i4 = read + 107;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final byte[] openSession() throws MediaDrmException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        read = i2 % 128;
        int i3 = i2 % 2;
        MediaDrm mediaDrm = this.mediaDrm;
        if (i3 == 0) {
            mediaDrm.openSession();
            throw null;
        }
        byte[] bArrOpenSession = mediaDrm.openSession();
        int i4 = read + 57;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return bArrOpenSession;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
        int i = 2 % 2;
        int i2 = read + 87;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.mediaDrm.closeSession(bArr);
        int i4 = RemoteActionCompatParcelizer + 123;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void setPlayerIdForSession(byte[] bArr, PlayerId playerId) {
        int i = 2 % 2;
        int i2 = read + 103;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0 ? Util.SDK_INT >= 31 : Util.SDK_INT >= 37) {
            try {
                Api31.setLogSessionIdOnMediaDrmSession(this.mediaDrm, bArr, playerId);
                return;
            } catch (UnsupportedOperationException unused) {
                Log.w(TAG, "setLogSessionId failed.");
            }
        }
        int i3 = RemoteActionCompatParcelizer + 83;
        read = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeData;
        byte[] bArrAdjustRequestInitData;
        String strAdjustRequestMimeType;
        int requestType;
        int i2 = 2 % 2;
        Object obj = null;
        if (list != null) {
            schemeData = getSchemeData(this.uuid, list);
            bArrAdjustRequestInitData = adjustRequestInitData(this.uuid, (byte[]) Assertions.checkNotNull(schemeData.data));
            strAdjustRequestMimeType = adjustRequestMimeType(this.uuid, schemeData.mimeType);
        } else {
            schemeData = null;
            bArrAdjustRequestInitData = null;
            strAdjustRequestMimeType = null;
        }
        MediaDrm.KeyRequest keyRequest = this.mediaDrm.getKeyRequest(bArr, bArrAdjustRequestInitData, strAdjustRequestMimeType, i, map);
        byte[] bArrAdjustRequestData = adjustRequestData(this.uuid, keyRequest.getData());
        String strAdjustLicenseServerUrl = adjustLicenseServerUrl(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strAdjustLicenseServerUrl) && schemeData != null) {
            int i3 = read + 107;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                TextUtils.isEmpty(schemeData.licenseServerUrl);
                obj.hashCode();
                throw null;
            }
            if (!TextUtils.isEmpty(schemeData.licenseServerUrl)) {
                strAdjustLicenseServerUrl = schemeData.licenseServerUrl;
            }
        }
        if (Util.SDK_INT >= 23) {
            int i4 = RemoteActionCompatParcelizer + 41;
            read = i4 % 128;
            int i5 = i4 % 2;
            requestType = keyRequest.getRequestType();
        } else {
            requestType = Integer.MIN_VALUE;
        }
        ExoMediaDrm.KeyRequest keyRequest2 = new ExoMediaDrm.KeyRequest(bArrAdjustRequestData, strAdjustLicenseServerUrl, requestType);
        int i6 = read + 95;
        RemoteActionCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return keyRequest2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String adjustLicenseServerUrl(java.lang.String r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = "<LA_URL>https://x</LA_URL>"
            boolean r1 = r1.equals(r4)
            java.lang.String r2 = ""
            if (r1 == 0) goto L17
            int r4 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer
            int r4 = r4 + 11
            int r1 = r4 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.read = r1
            int r4 = r4 % r0
            return r2
        L17:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 33
            if (r1 != r3) goto L3a
            int r1 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.read
            int r1 = r1 + 115
            int r3 = r1 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r0
            java.lang.String r0 = "https://default.url"
            boolean r0 = r0.equals(r4)
            if (r1 == 0) goto L37
            r1 = 99
            int r1 = r1 / 0
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L3a
            goto L39
        L37:
            if (r0 == 0) goto L3a
        L39:
            return r2
        L3a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.adjustLicenseServerUrl(java.lang.String):java.lang.String");
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        int i = 2 % 2;
        int i2 = read + 9;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            if (C.CLEARKEY_UUID.equals(this.uuid)) {
                bArr2 = ClearKeyUtil.adjustResponseData(bArr2);
            }
            byte[] bArrProvideKeyResponse = this.mediaDrm.provideKeyResponse(bArr, bArr2);
            int i3 = RemoteActionCompatParcelizer + 11;
            read = i3 % 128;
            int i4 = i3 % 2;
            return bArrProvideKeyResponse;
        }
        C.CLEARKEY_UUID.equals(this.uuid);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        int i = 2 % 2;
        MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        ExoMediaDrm.ProvisionRequest provisionRequest2 = new ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
        int i2 = read + 89;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return provisionRequest2;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.mediaDrm.provideProvisionResponse(bArr);
        int i4 = read + 101;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final Map<String, String> queryKeyStatus(byte[] bArr) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        read = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, String> mapQueryKeyStatus = this.mediaDrm.queryKeyStatus(bArr);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = RemoteActionCompatParcelizer + 23;
        read = i5 % 128;
        if (i5 % 2 != 0) {
            return mapQueryKeyStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final boolean requiresSecureDecoder(byte[] bArr, String str) {
        int i = 2 % 2;
        int i2 = read + 27;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0 ? Util.SDK_INT < 31 : Util.SDK_INT < 62) {
            try {
                MediaCrypto mediaCrypto = new MediaCrypto(this.uuid, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
                    mediaCrypto.release();
                    int i3 = read + 119;
                    RemoteActionCompatParcelizer = i3 % 128;
                    if (i3 % 2 == 0) {
                        return zRequiresSecureDecoderComponent;
                    }
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    mediaCrypto.release();
                    throw th;
                }
            } catch (MediaCryptoException unused) {
                return true;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 57;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            return Api31.requiresSecureDecoder(this.mediaDrm, str);
        }
        Api31.requiresSecureDecoder(this.mediaDrm, str);
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void acquire() {
        synchronized (this) {
            Assertions.checkState(this.referenceCount > 0);
            this.referenceCount++;
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void release() {
        synchronized (this) {
            int i = this.referenceCount - 1;
            this.referenceCount = i;
            if (i == 0) {
                this.mediaDrm.release();
            }
        }
    }

    static class Api31 {
        private Api31() {
        }

        public static boolean requiresSecureDecoder(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void setLogSessionIdOnMediaDrmSession(MediaDrm mediaDrm, byte[] bArr, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) Assertions.checkNotNull(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0da0  */
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void restoreKeys(byte[] r30, byte[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.restoreKeys(byte[], byte[]):void");
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final PersistableBundle getMetrics() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (Util.SDK_INT < 28) {
            int i4 = read + 51;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        PersistableBundle metrics = this.mediaDrm.getMetrics();
        int i6 = read + 23;
        RemoteActionCompatParcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            return metrics;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final String getPropertyString(String str) {
        int i = 2 % 2;
        int i2 = read + 125;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String propertyString = this.mediaDrm.getPropertyString(str);
        int i4 = RemoteActionCompatParcelizer + 121;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            return propertyString;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final byte[] getPropertyByteArray(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        read = i2 % 128;
        int i3 = i2 % 2;
        byte[] propertyByteArray = this.mediaDrm.getPropertyByteArray(str);
        int i4 = RemoteActionCompatParcelizer + 55;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            return propertyByteArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void setPropertyString(String str, String str2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.mediaDrm.setPropertyString(str, str2);
        int i4 = read + 113;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void setPropertyByteArray(String str, byte[] bArr) {
        int i = 2 % 2;
        int i2 = read + 85;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.mediaDrm.setPropertyByteArray(str, bArr);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.drm.FrameworkCryptoConfig createCryptoConfig(byte[] r6) throws android.media.MediaCryptoException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 21
            r3 = 0
            if (r1 >= r2) goto L4a
            java.util.UUID r1 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            java.util.UUID r2 = r5.uuid
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4a
            int r1 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.read = r2
            int r1 = r1 % r0
            java.lang.String r2 = "securityLevel"
            java.lang.String r4 = "L3"
            if (r1 != 0) goto L31
            java.lang.String r1 = r5.getPropertyString(r2)
            boolean r1 = r4.equals(r1)
            r2 = 65
            int r2 = r2 / r3
            if (r1 == 0) goto L4a
            goto L3b
        L31:
            java.lang.String r1 = r5.getPropertyString(r2)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L4a
        L3b:
            int r1 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.read
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L48
            r0 = 4
            int r0 = r0 / r0
        L48:
            r3 = 1
            goto L53
        L4a:
            int r1 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.read = r2
            int r1 = r1 % r0
        L53:
            java.util.UUID r5 = r5.uuid
            com.google.android.exoplayer2.drm.FrameworkCryptoConfig r0 = new com.google.android.exoplayer2.drm.FrameworkCryptoConfig
            java.util.UUID r5 = adjustUuid(r5)
            r0.<init>(r5, r6, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.createCryptoConfig(byte[]):com.google.android.exoplayer2.drm.FrameworkCryptoConfig");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee A[PHI: r2 r5
      0x00ee: PHI (r2v7 com.google.android.exoplayer2.drm.DrmInitData$SchemeData) = 
      (r2v6 com.google.android.exoplayer2.drm.DrmInitData$SchemeData)
      (r2v11 com.google.android.exoplayer2.drm.DrmInitData$SchemeData)
     binds: [B:38:0x00ec, B:35:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r5v4 int) = (r5v3 int), (r5v9 int) binds: [B:38:0x00ec, B:35:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0 A[PHI: r2 r5
      0x00f0: PHI (r2v9 com.google.android.exoplayer2.drm.DrmInitData$SchemeData) = 
      (r2v6 com.google.android.exoplayer2.drm.DrmInitData$SchemeData)
      (r2v7 com.google.android.exoplayer2.drm.DrmInitData$SchemeData)
      (r2v11 com.google.android.exoplayer2.drm.DrmInitData$SchemeData)
     binds: [B:38:0x00ec, B:39:0x00ee, B:35:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r5v5 int) = (r5v3 int), (r5v4 int), (r5v9 int) binds: [B:38:0x00ec, B:39:0x00ee, B:35:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.drm.DrmInitData.SchemeData getSchemeData(java.util.UUID r9, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.getSchemeData(java.util.UUID, java.util.List):com.google.android.exoplayer2.drm.DrmInitData$SchemeData");
    }

    private static UUID adjustUuid(UUID uuid) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            if (Util.SDK_INT >= 48) {
                return uuid;
            }
        } else if (Util.SDK_INT >= 27) {
            return uuid;
        }
        int i3 = RemoteActionCompatParcelizer + 109;
        read = i3 % 128;
        int i4 = i3 % 2;
        if (!C.CLEARKEY_UUID.equals(uuid)) {
            return uuid;
        }
        int i5 = RemoteActionCompatParcelizer + 63;
        read = i5 % 128;
        int i6 = i5 % 2;
        return C.COMMON_PSSH_UUID;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] adjustRequestInitData(java.util.UUID r4, byte[] r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.util.UUID r1 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r1 = r1.equals(r4)
            r2 = 0
            if (r1 == 0) goto L30
            int r1 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer
            int r1 = r1 + 9
            int r3 = r1 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.read = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L29
            byte[] r1 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r5, r4)
            if (r1 == 0) goto L1e
            r5 = r1
        L1e:
            java.util.UUID r1 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            byte[] r5 = addLaUrlAttributeIfMissing(r5)
            byte[] r5 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r1, r5)
            goto L30
        L29:
            com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r5, r4)
            r2.hashCode()
            throw r2
        L30:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 23
            if (r1 >= r3) goto L55
            int r1 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.RemoteActionCompatParcelizer
            int r1 = r1 + 115
            int r3 = r1 % 128
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.read = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L4c
            java.util.UUID r0 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            boolean r0 = r0.equals(r4)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L55
            goto L8f
        L4c:
            java.util.UUID r5 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            r5.equals(r4)
            r2.hashCode()
            throw r2
        L55:
            java.util.UUID r0 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L96
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L96
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTM"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L96
        L8f:
            byte[] r4 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r5, r4)
            if (r4 == 0) goto L96
            return r4
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.adjustRequestInitData(java.util.UUID, byte[]):byte[]");
    }

    private static String adjustRequestMimeType(UUID uuid, String str) {
        int i = 2 % 2;
        if (Util.SDK_INT < 26) {
            int i2 = read + 99;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                C.CLEARKEY_UUID.equals(uuid);
                throw null;
            }
            if (C.CLEARKEY_UUID.equals(uuid)) {
                if (MimeTypes.VIDEO_MP4.equals(str)) {
                    return "cenc";
                }
                int i3 = RemoteActionCompatParcelizer + 91;
                read = i3 % 128;
                if (i3 % 2 == 0) {
                    MimeTypes.AUDIO_MP4.equals(str);
                    throw null;
                }
                if (MimeTypes.AUDIO_MP4.equals(str)) {
                    return "cenc";
                }
            }
        }
        int i4 = read + 3;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static byte[] adjustRequestData(UUID uuid, byte[] bArr) {
        int i = 2 % 2;
        int i2 = read + 29;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (!C.CLEARKEY_UUID.equals(uuid)) {
            return bArr;
        }
        byte[] bArrAdjustRequestData = ClearKeyUtil.adjustRequestData(bArr);
        int i4 = RemoteActionCompatParcelizer + 67;
        read = i4 % 128;
        int i5 = i4 % 2;
        return bArrAdjustRequestData;
    }

    private static void forceWidevineL3(MediaDrm mediaDrm) {
        int i = 2 % 2;
        int i2 = read + 23;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        mediaDrm.setPropertyString("securityLevel", VideoPlaybackConfiguration.WIDEVINE_LVL_L3);
        int i4 = RemoteActionCompatParcelizer + 9;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    private static boolean needsForceWidevineL3Workaround() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        read = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = "ASUS_Z00AD".equals(Util.MODEL);
        int i4 = read + 105;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] bArr) {
        int i = 2 % 2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        short littleEndianShort = parsableByteArray.readLittleEndianShort();
        short littleEndianShort2 = parsableByteArray.readLittleEndianShort();
        if (littleEndianShort != 1 || littleEndianShort2 != 1) {
            Log.i(TAG, "Unexpected record count or type. Skipping LA_URL workaround.");
            int i2 = read + 115;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            return bArr;
        }
        int i4 = read + 17;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            String string = parsableByteArray.readString(parsableByteArray.readLittleEndianShort(), parseMdtaFromMeta.read);
            if (string.contains("<LA_URL>")) {
                return bArr;
            }
            int iIndexOf = string.indexOf("</DATA>");
            if (iIndexOf == -1) {
                Log.w(TAG, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(string.substring(0, iIndexOf));
            sb.append(MOCK_LA_URL);
            sb.append(string.substring(iIndexOf));
            String string2 = sb.toString();
            int i5 = littleEndianInt + 52;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i5);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(i5);
            byteBufferAllocate.putShort(littleEndianShort);
            byteBufferAllocate.putShort(littleEndianShort2);
            byteBufferAllocate.putShort((short) (string2.length() << 1));
            byteBufferAllocate.put(string2.getBytes(parseMdtaFromMeta.read));
            return byteBufferAllocate.array();
        }
        parsableByteArray.readString(parsableByteArray.readLittleEndianShort(), parseMdtaFromMeta.read).contains("<LA_URL>");
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final int getCryptoType() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 97;
        read = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        read = i5 % 128;
        if (i5 % 2 != 0) {
            return 2;
        }
        throw null;
    }

    static void read() {
        write = new int[]{-89741561, -2045589064, -1482127807, 227860450, 966394302, 642748575, -997190503, -1838108000, 590139737, -1057200246, -1065567593, 1125410358, -1226233336, 1668104851, -494965257, -1623312185, -1052394633, 684831147};
    }
}
