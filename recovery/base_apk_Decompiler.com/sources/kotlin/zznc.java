package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zznc extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$c = {25, 68, TarConstants.LF_LINK, 97};
    private static final int $$f = 194;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {42, 85, 82, -118, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 25, TarConstants.LF_NORMAL, -8, 1, -24, 19, 3, 7, -7, 10, 7, -46, 42, -10, 16, 8, -8, 5, -10, 7, 0, -34, 27, 21, -53, 31, 3, 6, -2, -51, -4, -8, 12, -14};
    private static final int $$h = 64;
    private static final byte[] $$a = {TarConstants.LF_NORMAL, -59, 73, 39, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 49;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static char[] RemoteActionCompatParcelizer = {28394, 28415, 28393, 28411, 28412, 28386, 28479, 28408, 28381, 28392, 28390, 28414, 28402, 28374, 28413, 28362, 28409, 28407, 28377, 28389, 28477, 28468, 28471, 28470, 28395, 28474, 28466, 28469, 28473, 28475, 28472, 28391, 28467, 28476, 28385, 28406, 28388, 28410, 28478, 28376, 28360, 28384};
    private static int AudioAttributesImplBaseParcelizer = 411397901;
    private static boolean AudioAttributesImplApi26Parcelizer = true;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private static char[] AudioAttributesImplApi21Parcelizer = {56431, 43684, 12740, 47337, 1821, 36403, 5462, 40006, 27284, 61881, 30914, 50970, 20019, 54612, 23662, 10902, 45491, 14543, 22108, 8407, 48053, 13006, 36136, 1034, 40816, 5718, 57571, 31692, 62126, 19833, 50182, 24416, 54861, 41209, 15327, 45815, 3542, 33896, 8008, 38523, 24743, 64477, 29375, 52684, 17529, 57105, 22048, 8455, 48107, 13004, 36346, 1136, 40787, 5741, 57673, 31661, 62099, 19875, 50387, 24425, 54852, 41237, 15355, 45791, 3567, 33993, 54901, 41211, 15308, 45796, 3410, 33908, 8026, 38436, 24731, 64438, 29312, 52569, 17523, 57167, 22117, 8320, 48127, 13019, 36351, 1089, 40801, 5639, 57562, 31742, 62102, 19943, 50177, 24417, 54792, 41256, 15296, 45804, 3459, 33803, 8058, 38469, 24930, 64387, 29418, 52698, 17582, 57152, 22064, 8504, 48008, 13052, 36241, 1253, 40786, 5694, 57691, 30833, 62146, 19936, 50362, 24335, 54910, 41280, 14384, 45722, 3565, 33929, 8103, 38476, 56373, 43775, 12679, 47279, 1878, 36463, 56422, 43696, 12736, 47354, 1878, 36401, 5443, 40041, 27267, 61927, 30973, 50954, 20003, 54593, 23679, 10898, 21099, 9403, 49117, 14075, 35074, ':', 39768, 4720, 58530, 32678, 63187, 18709, 49181, 23380, 53872, 42132, 56425, 43709, 12759, 47339, 1803, 36408, 5446, 40021, 27265, 61864, 30914, 50951, 20025, 54616, 23679, 56376, 43747, 12687, 47279, 1857, 36459, 5397, 39989, 27357, 61951, 30878};
    private static long MediaBrowserCompatItemReceiver = 5340348802537532113L;
    private final Object IconCompatParcelizer = new Object();
    private boolean write = false;

    private static String $$i(int i, int i2, short s) {
        int i3 = i * 2;
        byte[] bArr = $$c;
        int i4 = 101 - (s * 2);
        int i5 = (i2 * 3) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i4 = i5 + (-i3);
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i5++;
            i4 += -bArr[i5];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 65
            byte[] r0 = kotlin.zznc.$$a
            int r8 = 44 - r8
            int r7 = 191 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L27:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zznc.c(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 73
            int r8 = 47 - r8
            int r9 = 127 - r9
            byte[] r0 = kotlin.zznc.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r9]
            r6 = r3
            r3 = r7
            r7 = r6
        L25:
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zznc.d(int, int, short, java.lang.Object[]):void");
    }

    zznc() {
        AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: o.zznc$4, reason: invalid class name */
    public final class AnonymousClass4 implements PlaybackStateCompatCustomAction {
        public static int AudioAttributesCompatParcelizer;
        public static int read;

        AnonymousClass4() {
        }

        @Override // kotlin.PlaybackStateCompatCustomAction
        public final void write(Context context) {
            zznc.this.MediaBrowserCompatCustomActionResultReceiver();
        }

        public static int IconCompatParcelizer() {
            int i = AudioAttributesCompatParcelizer;
            int i2 = i % 9241804;
            AudioAttributesCompatParcelizer = i + 1;
            if (i2 != 0) {
                return read;
            }
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            read = startElapsedRealtime;
            return startElapsedRealtime;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new AnonymousClass4());
        int i2 = MediaBrowserCompatSearchResultReceiver + 13;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 79;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
            this.AudioAttributesCompatParcelizer = getsubjectstatWrite;
            int i3 = 30 / 0;
            if (!getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                return;
            }
        } else {
            this.AudioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver().write();
            if (!r1.RemoteActionCompatParcelizer()) {
                return;
            }
        }
        int i4 = MediaMetadataCompat + 105;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $10 + 97;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer[i2 + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.MeasureSpec.getMode(0) + 2340, 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatItemReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 9701 - Color.green(0), 25 - TextUtils.lastIndexOf("", '0', 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.keyCodeFromString(""), 23784 - TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i7 = $11 + 125;
                $10 = i7 % 128;
                int i8 = i7 % 2;
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
        while (downloadService.write < i) {
            int i9 = $10 + 47;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), 23784 - Color.alpha(0), 'Q' - AndroidCharacter.getMirror('0'), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr6 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), Color.rgb(0, 0, 0) + 16801000, 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = RemoteActionCompatParcelizer;
        if (cArr2 != null) {
            int i3 = $11 + 5;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 44862), 18944 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "", 0) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplBaseParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getMode(0), 19032 - MotionEvent.axisFromString(""), TextUtils.indexOf((CharSequence) "", '0') + 76, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i6 = -1593953308;
        if (MediaBrowserCompatCustomActionResultReceiver) {
            int i7 = $11 + 81;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i9 = $10 + 25;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i6);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.green(0), 11439 - TextUtils.getOffsetBefore("", 0), 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i6 = -1593953308;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesImplApi26Parcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = $11 + 57;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 11439 - (ViewConfiguration.getFadingEdgeLength() >> 16), 14 - Gravity.getAbsoluteGravity(0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010e  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zznc.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 91;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaBrowserCompatSearchResultReceiver + 35;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 17;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 == 0) {
            return ishighlightedMediaBrowserCompatItemReceiver.af_();
        }
        ishighlightedMediaBrowserCompatItemReceiver.af_();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 39;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.read == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.read == null) {
                    this.read = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.read;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 87;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!this.write) {
            this.write = true;
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 17;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 53;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaMetadataCompat + 119;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return RemoteActionCompatParcelizer2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zznc.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 57;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 61;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(View.resolveSize(0, 0) + 18, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 49), KeyEvent.getDeadChar(0, 0), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatSearchResultReceiver + 15;
            MediaMetadataCompat = i6 % 128;
            int i7 = i6 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i8 = MediaBrowserCompatSearchResultReceiver + 101;
                MediaMetadataCompat = i8 % 128;
                int i9 = i8 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - KeyEvent.keyCodeFromString("")), 6054 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 42 - View.MeasureSpec.makeMeasureSpec(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 6029 - TextUtils.indexOf((CharSequence) "", '0'), 24 - TextUtils.getCapsMode("", 0, 0), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x08ac A[Catch: all -> 0x0318, TryCatch #13 {all -> 0x0318, blocks: (B:205:0x0f07, B:207:0x0f0d, B:208:0x0f31, B:241:0x1361, B:243:0x1367, B:244:0x138a, B:222:0x1131, B:224:0x1154, B:225:0x119e, B:172:0x0aa8, B:174:0x0aae, B:175:0x0ad3, B:128:0x08a6, B:130:0x08ac, B:131:0x08cf, B:17:0x00b0, B:19:0x00b6, B:20:0x00e2, B:22:0x0288, B:24:0x02b9, B:25:0x0312), top: B:290:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0782 A[Catch: all -> 0x0839, TryCatch #14 {all -> 0x0839, blocks: (B:88:0x077c, B:90:0x0782, B:91:0x07ac), top: B:292:0x077c, outer: #15 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zznc.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 125;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 99;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }
}
