package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getStreetViewPanoramaCamera;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseTvaAudioPurposeCsValue;", "write", "Lo/parseTvaAudioPurposeCsValue;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getStreetViewPanoramaCamera extends getPanoramaId {
    private static int AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static byte[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static short[] MediaBrowserCompatItemReceiver;
    private static long RemoteActionCompatParcelizer;
    private static int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private parseTvaAudioPurposeCsValue read;
    private static final byte[] $$l = {45, 96, -22, -65};
    private static final int $$m = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {16, -111, 25, -45, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -50, 47, -5, -19, 17, -13, 4, -3, -35, 26, 1, -2, -5, 8, 24, 10, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$k = 85;
    private static final byte[] $$d = {16, -111, 25, -45, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = PsExtractor.PRIVATE_STREAM_1;
    private static int RatingCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = kotlin.getStreetViewPanoramaCamera.$$l
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r7 = r7 + 4
            int r6 = r6 * 8
            int r6 = r6 + 104
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L30
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreetViewPanoramaCamera.$$n(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            int r8 = 114 - r8
            int r6 = 191 - r6
            byte[] r1 = kotlin.getStreetViewPanoramaCamera.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreetViewPanoramaCamera.g(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 111 - r6
            int r7 = r7 + 4
            int r0 = r8 + 19
            byte[] r1 = kotlin.getStreetViewPanoramaCamera.$$j
            byte[] r0 = new byte[r0]
            int r8 = r8 + 18
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + 2
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreetViewPanoramaCamera.h(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.getStreetViewPanoramaCamera$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getStreetViewPanoramaCamera$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "write", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent write(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) getStreetViewPanoramaCamera.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 97;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 12424 - TextUtils.getCapsMode("", 0, 0), 20 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), 1868 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10 - Drawable.resolveOpacity(0, 0), 1983509525, false, $$n(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $11 + 39;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 8 / 0;
            objArr[0] = str;
        }
    }

    private static void f(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(read)};
            int i5 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j2 = 0;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) View.getDefaultSize(0, 0), 24296 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $10 + 103;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = AudioAttributesImplBaseParcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(bArr[i9]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) 1;
                            byte b3 = (byte) (-b2);
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionType(j2), (ExpandableListView.getPackedPositionForGroup(i5) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == j2 ? 0 : -1)) + 3082, ((Process.getThreadPriority(i5) + 20) >> 6) + 128, 2145850993, false, $$n(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i5 = 0;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplBaseParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 24297 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) read) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatItemReceiver[i + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) read) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) AudioAttributesCompatParcelizer) ^ j)) + i6;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplApi21Parcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - Color.red(0)), TextUtils.indexOf("", "", 0, 0) + 13432, Color.green(0) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplBaseParcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i11 = $10 + 77;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    z = true;
                } else {
                    int i13 = $10 + 93;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 4 / 2;
                    }
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    int i15 = $11 + 41;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    if (z) {
                        byte[] bArr6 = AudioAttributesImplBaseParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = MediaBrowserCompatItemReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x011b  */
    @Override // kotlin.getPanoramaId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreetViewPanoramaCamera.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0123  */
    @Override // kotlin.getPanoramaId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreetViewPanoramaCamera.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    @Override // kotlin.getPanoramaId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreetViewPanoramaCamera.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00eb  */
    @Override // kotlin.getPanoramaId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreetViewPanoramaCamera.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi26Parcelizer = 0;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 77;
        AudioAttributesImplApi26Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.getPanoramaId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 113;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        RemoteActionCompatParcelizer = 724810555140423262L;
        AudioAttributesCompatParcelizer = -689830688;
        read = -819363086;
        AudioAttributesImplApi21Parcelizer = 156964530;
        AudioAttributesImplBaseParcelizer = new byte[]{37, 28, -60, 20, 19, 28, 45, 15, 20, 40, 21, 22, 18, 99, -59, 28, 25, 47, 18, 21, 0, -8, -54, -26, -28, -5, -31, -88, -54, -110, -8, -26, -6, -56, -29, -86, TarConstants.LF_SYMLINK, -7, -26, -7, -107, -54, -87, -55, -8, -108, -26, TarConstants.LF_DIR, -28, -86, -7, TarConstants.LF_SYMLINK, -4, -106, -7, -26, -53, -31, -6, -27, -107, -26, -6, -26, -6, TarConstants.LF_LINK, -4, -107, -86, 80, -2, 92, -96, -81, -16, -85, -83, -93, -106, -83, -93, -94, -107, 82, -5, TarConstants.LF_GNUTYPE_SPARSE, -84, -82, -84, -13, -81, -106, -95, -83, 82, -5, 93, -16, -86, -82, -96, -93, -96, -107, -81, -82, 95, -11, -87, -94, -84, -95, 70, -94, -86, -13, 92, -5, -83, 80, -96, -15, -84, -81, -81, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -12, -105, 81, -82, -5, -116, -113, -115, -70, -47, -69, -35, -80, -34, -127, -119, -66, -125, -116, -33, -70, -35, -128, -65, -37, -77, -37, -115, -77, -37, -80, -118, -126, -48, -72, -47, -126, -9, -125, -117, -124, -71, -113, -46, -9, -113, -116, -113, -115, -65, -115, -43, -70, -114, -117, -43, -9, -126, -67, -114, -46, -71, -35, -115, -79, -117, -34, -65, -66, -89, -92, 78, -84, -9, -80, 113, -26, 114, -68, -81, -65, -76, -72, -13, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -76, -82, -117, 123, -65, -95, -120, 100, 74, -84, 65, -71, -65, -82, TarConstants.LF_GNUTYPE_LONGLINK, -84, 65, -81, -12, 115, -68, -85, -65, 78, -86, -79, 74, -93, 73, -25, 114, -82, -73, -76, -89, -80, -76, -96, -70, -91, -80, -120, -67, 72, 102, -70, -79, -67, -95, 100, 11, 123, 114, 70, 71, 37, 115, 111, 119, -66, 47, 1, 87, 117, -95, -75, -90, -128, TarConstants.LF_GNUTYPE_SPARSE, -95, 72, -72, -65, -125, -124, 126, -91, -8, 111, -66, -65, -68, -85, -77, -84, -69, -81, -66, -85, -88, -89, -112, -75, -92, -79, -96, -108, -66, -84, 44, 34, 32, 45, 42, 47, 42, 36, 41, 37, -39, -58, -52, -40, -62, -58, -50, -40, -52, -59, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};
    }
}
