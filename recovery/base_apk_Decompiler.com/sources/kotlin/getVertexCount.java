package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getVertexCount extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat RemoteActionCompatParcelizer;
    private static final byte[] $$l = {104, -54, 119, 45};
    private static final int $$m = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {9, -34, 82, 56, -61, 61, 2, 19, -30, 19, 23, -7, 9, -3, -9, 0, 7, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17};
    private static final int $$k = 46;
    private static final byte[] $$d = {10, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 13, 109, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 16;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    private static char[] read = {28321, 28338, 28348, 28238, 28339, 28345, 28402, 28239, 28304, 28351, 28349, 28341, 28233, 28333, 28237, 28236, 28289, 28336, 28340, 28302, 28401, 28350, 28299, 28298, 28405, 28296, 28346, 28300, 28297, 28400, 28342, 28234, 28347, 28335, 28312, 28344, 28319, 28343};
    private static int MediaBrowserCompatItemReceiver = 411397824;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private static boolean AudioAttributesImplApi26Parcelizer = true;
    private static char[] AudioAttributesImplApi21Parcelizer = {56429, 18984, 61692, 7840, 34123, 13079, 22996, 49188, 28221, 38118, 664, 43276, 55093, 32173, 58484, 4659, 47322, 9871, 19788, 64267, 24976, 34934, 13858, 23759, 51869, 29010, 56431, 19059, 61608, 7860, 34119, 13082, 22993, 49256, 28264, 38048, 731, 43291, 55057, 32168, 58468, 4719, 47260, 9859, 19803, 64322, 25079, 34939, 13878, 23699, 51908, 29008, 40892, 1443, 44071, 55903, 16530, 61130, 5417, 33716, 10734, 20599, 65030, 25821, 37522, 14717, 43000, 52709, 29713, 57943, 2188, 46903, 56614, 19455, 56380, 18981, 61691, 7906, 34067, 13087, 22919, 49212, 28265, 38049, 652, 43328, 55108, 32255, 58468, 4716, 47309, 9859, 19801, 64331, 25074, 34854, 13924, 23699, 51870, 28935, 40889, 1522, 44077, 55897, 16530, 61130, 5500, 33714, 10682, 20513, 65026, 25740, 37571, 14714, 42916, 52705, 29770, 57862, 2256, 46952, 56689, 19454, 61916, 6175, 34381, 11394, 23349, 49511, 28580, 38367, 15364, 43536, 53421, 32609, 58721, 5067, 47571, 8205, 56430, 19063, 61689, 7862, 34069, 13132, 22995, 49202, 28216, 38130, 733, 43283, 55116, 32175, 58468, 4670, 47252, 9863, 19802, 64323, 25078, 34863, 13923, 23704, 51909, 29011, 40940, 1531, 44071, 55896, 16529, 61122, 5496, 33767, 10735, 20599, 65029, 25819, 37571, 14636, 42925, 52708, 29773, 57938, 2263, 46908, 56688, 19451, 61913, 6210, 34334, 11475, 23349, 49512, 28579, 38281, 15373, 43540, 53501, 32608, 58722, 5017, 47574, 8194, 56420, 18994, 61676, 7842, 34135, 13124, 22943, 49189, 28216, 38135, 641, 43342, 55053, 32188, 58479, 4655, 47298, 9858, 19787, 64348, 25008, 34934, 13858, 23759, 51869, 28994, 40939, 1443, 44135, 55834, 16526, 61085, 5433, 33767, 10666, 20598, 65047, 25807, 37509, 14635, 42990, 52659, 29702, 57857, 2267, 46947, 56687, 19451, 61852, 6223, 34391, 11483, 23402, 49465, 28661, 38297, 15432, 43609, 53438, 32560, 58747, 5067, 47510, 8287, 20194, 62642, 25451, 56373, 19048, 61609, 7910, 34058, 13132, 56425, 18986, 61689, 7842, 34135, 13083, 22996, 49240, 28217, 38135, 644, 43350, 55069, 32163, 58469, 56376, 19060, 61601, 7910, 34077, 13128, 22919, 49208, 28261, 38048, 728, 8119, 35316, 13101, 56673, 18067, 61646, 39428, 945, 44521, 22311, 49503};
    private static long AudioAttributesImplBaseParcelizer = -2385887696219518394L;
    private final Object write = new Object();
    private boolean IconCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r7, byte r8, int r9) {
        /*
            byte[] r0 = kotlin.getVertexCount.$$l
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r9 = r9 * 3
            int r9 = 101 - r9
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getVertexCount.$$n(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 44 - r6
            int r5 = r5 + 4
            int r7 = 114 - r7
            byte[] r1 = kotlin.getVertexCount.$$d
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r5]
        L25:
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            int r5 = r5 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getVertexCount.g(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = kotlin.getVertexCount.$$j
            int r1 = 28 - r8
            int r6 = r6 + 82
            byte[] r1 = new byte[r1]
            int r8 = 27 - r8
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2b
        L12:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2b:
            int r7 = r7 + r6
            int r7 = r7 + (-4)
            int r6 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getVertexCount.h(int, byte, short, java.lang.Object[]):void");
    }

    getVertexCount() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getVertexCount.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getVertexCount.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = RatingCompat + 121;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MediaBrowserCompatItemReceiver() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.getVertexCount.RatingCompat
            int r1 = r1 + 33
            int r2 = r1 % 128
            kotlin.getVertexCount.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L25
            o.isHighlighted r1 = r3.AudioAttributesImplBaseParcelizer()
            o.getSubjectStat r1 = r1.write()
            r3.RemoteActionCompatParcelizer = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            r2 = 32
            int r2 = r2 / 0
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L47
            goto L35
        L25:
            o.isHighlighted r1 = r3.AudioAttributesImplBaseParcelizer()
            o.getSubjectStat r1 = r1.write()
            r3.RemoteActionCompatParcelizer = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            if (r1 == 0) goto L47
        L35:
            o.getSubjectStat r1 = r3.RemoteActionCompatParcelizer
            o.withFieldVisibility r3 = r3.getDefaultViewModelCreationExtras()
            r1.IconCompatParcelizer(r3)
            int r3 = kotlin.getVertexCount.RatingCompat
            int r3 = r3 + 113
            int r1 = r3 % 128
            kotlin.getVertexCount.MediaBrowserCompatMediaItem = r1
            int r3 = r3 % r0
        L47:
            int r3 = kotlin.getVertexCount.RatingCompat
            int r3 = r3 + 89
            int r1 = r3 % 128
            kotlin.getVertexCount.MediaBrowserCompatMediaItem = r1
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getVertexCount.MediaBrowserCompatItemReceiver():void");
    }

    private static void f(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer[i2 + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36620), ImageFormat.getBitsPerPixel(0) + 2341, 28 - View.getDefaultSize(0, 0), 480654850, false, $$n(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesImplBaseParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 9701 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.indexOf("", ""), 23783 - TextUtils.indexOf((CharSequence) "", '0', 0), 32 - Process.getGidForName(""), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        int i7 = $11 + 73;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 2 / 4;
        }
        while (downloadService.write < i) {
            int i9 = $11 + 95;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23785 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void e(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = read;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 44862), (Process.myTid() >> 22) + 18944, TextUtils.indexOf("", "", 0, 0) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatItemReceiver)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 19033 - Color.blue(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i4 = -1593953308;
        if (!(!AudioAttributesImplApi26Parcelizer)) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Process.myTid() >> 22), 11439 - View.resolveSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i4 = -1593953308;
            }
            String str = new String(cArr4);
            int i5 = $10 + 113;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            objArr[0] = str;
            return;
        }
        if (!MediaBrowserCompatCustomActionResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i7 = $10 + 3;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer + 1) * notifydownloads.IconCompatParcelizer] >> i] - iIntValue);
                } else {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                }
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 11439 - KeyEvent.normalizeMetaState(0), 14 - Color.green(0), -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i8 = $10 + 97;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a4  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 2201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getVertexCount.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 37;
        RatingCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
            if (getsubjectstat != null) {
                int i3 = MediaBrowserCompatMediaItem + 85;
                RatingCompat = i3 % 128;
                int i4 = i3 % 2;
                getsubjectstat.AudioAttributesCompatParcelizer();
                if (i4 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
            int i5 = MediaBrowserCompatMediaItem + 105;
            RatingCompat = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super.onDestroy();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 41;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (i3 == 0) {
            return ishighlightedAudioAttributesImplBaseParcelizer.af_();
        }
        ishighlightedAudioAttributesImplBaseParcelizer.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = RatingCompat + 21;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        if (!this.IconCompatParcelizer) {
            int i2 = RatingCompat + 69;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            this.IconCompatParcelizer = true;
        }
        int i4 = MediaBrowserCompatMediaItem + 95;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = RatingCompat + 7;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = RatingCompat + 71;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), ViewConfiguration.getScrollBarSize() >> 8, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(new byte[]{-126, -123, -122, -112, -127, -118, -122, -109, -110, -110, -111, -112, -126, -117, -124, -124, -113, -118}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 123, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = RatingCompat + 103;
            MediaBrowserCompatMediaItem = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6055 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 42 - TextUtils.getOffsetAfter("", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 16783246 + Color.rgb(0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 4487), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6053, 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6030, 24 - TextUtils.getTrimmedLength(""), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        int i4 = MediaBrowserCompatMediaItem + 1;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getVertexCount.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0961 A[Catch: all -> 0x0a19, TryCatch #11 {all -> 0x0a19, blocks: (B:133:0x094d, B:135:0x0961, B:136:0x098e), top: B:270:0x094d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09a1 A[Catch: all -> 0x0a0f, TryCatch #8 {all -> 0x0a0f, blocks: (B:137:0x0994, B:139:0x09a1, B:140:0x0a07), top: B:264:0x0994, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0ba2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0e50  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0f2e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0f7c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0fcd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x12a0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0933 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) {
        /*
            Method dump skipped, instruction units count: 5179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getVertexCount.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 55;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = RatingCompat + 35;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }
}
