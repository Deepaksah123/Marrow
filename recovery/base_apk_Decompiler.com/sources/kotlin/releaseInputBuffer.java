package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.ui.activities.base.BaseActivity;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public abstract class releaseInputBuffer extends BaseActivity implements SubjectStat {
    private getSubjectStat RemoteActionCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$c = {36, 0, 10, -55};
    private static final int $$f = 143;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {36, -60, 17, 26, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, -59, 63, 4, 21, -32, 29, 21, 9, -2, 9, -1, -17, 43, -3, -5, -25, TarConstants.LF_SYMLINK, 3, 4, -36, TarConstants.LF_SYMLINK, 5, 6, -3, 4, 23, -5, 19, -7, 17, 11, -38, 26, 19, -7, 12, 4, 19, 1, -3, 17, -9};
    private static final int $$h = 72;
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, -51, -30, -2, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 20;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;
    private static char[] AudioAttributesCompatParcelizer = {56429, 1689, 27038, 19599, 46991, 39554, 64906, 8447, 3003, 28332, 20972, 46229, 40890, 49884, 9685, 2268, 29647, 22228, 56431, 1666, 27016, 19599, 46981, 39557, 64922, 8336, 2980, 28335, 20910, 46252, 40875, 49874, 9666, 2256, 29651, 22217, 56380, 1684, 27033, 19661, 47063, 39562, 64985, 8423, 3041, 28392, 20902, 46247, 40952, 49794, 9682, 2191, 29661, 22210, 47563, 40084, 51110, 10915, 3498, 28856, 23526, 48830, 57667, 50245, 12097, 4692, 30036, 22617, 33628, 58979, 51512, 11374, 5926, 31353, 23933, 32769, 60172, 52744, 12608, 5185, 32588, 41589, 34087, 59517, 54060, 13886, 6463, 31805, 42689, 35266, 60618, 55252, 15068, 7561, 16567, 43958, 36589, 61862, 54517, 16382, 48098, 24906, 3607, 11029, 53341, 64853, 39425, 18277, 27708, 2359, 13947, 54136, 63612, 42334, 16990, 28497, 5128, 12618, 56900, 64272, 41006, 19750, 27169, 5951, 15409, 55654, 34458, 41920, 18631, 30169, 4827, 16349, 58580, 33210, 44769, 19380, 28845, 7586, 15089, 59355, 35977, 43393, 22219, 29593, 6343, 50605, 58026, 36852, 46245, 20975, 32480, 7136, 49485, 60993, 35649, 45070, 23897, 31233, 10091, 52283, 59746, 38520, 45948, 22653, 56420, 1667, 27022, 19597, 46995, 39633, 64961, 8446, 2992, 28350, 20907, 46249, 40881, 49857, 9689, 2252, 29650, 22211, 47577, 40067, 51172, 10995, 3564, 28900, 23525, 48891, 57617, 50196, 12043, 4631, 30024, 22542, 33561, 58934, 51496, 11321, 5939, 31290, 23867, 32848, 60230, 52826, 12556, 5190, 32583, 41598, 34105, 59512, 54124, 13934, 6437, 31844, 42654, 35228, 60571, 55186, 14992, 7616, 16548, 44007, 36599, 61862, 54448, 16300, 25250, 17859, 43209, 56373, 1753, 27083, 19657, 47054, 39641, 56422, 1686, 27020, 19612, 47054, 39559, 64911, 8383, 2995, 28401, 20881, 46268, 40891, 49863, 9683, 2260, 56429, 1689, 27038, 19599, 46991, 39554, 64906, 8447, 3003, 28332, 20972, 46230, 40881, 49856, 9666, 2268, 29649, 22244, 47558, 40130, 51187, 10992, 15164, 57806, 36558, 43992, 20678, 32219, 6879, 51158, 60644, 35307, 46843, 21476, 30964, 9611, 49798};
    private static long MediaBrowserCompatCustomActionResultReceiver = 3069226009581651703L;
    private static long RatingCompat = -9213164888164151569L;
    private final Object IconCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, short r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = kotlin.releaseInputBuffer.$$c
            int r8 = r8 * 2
            int r8 = 121 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.releaseInputBuffer.$$i(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = 191 - r9
            int r7 = r7 + 65
            byte[] r0 = kotlin.releaseInputBuffer.$$a
            int r8 = 44 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L29
        L10:
            r3 = r2
        L11:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.releaseInputBuffer.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 155 - r7
            int r8 = r8 + 5
            byte[] r0 = kotlin.releaseInputBuffer.$$g
            int r6 = 119 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r7 = r7 + 1
            r3 = r0[r7]
        L24:
            int r6 = r6 + r3
            int r6 = r6 + (-6)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.releaseInputBuffer.d(byte, int, byte, java.lang.Object[]):void");
    }

    releaseInputBuffer() {
        MediaDescriptionCompat();
    }

    private void MediaDescriptionCompat() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.releaseInputBuffer.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                releaseInputBuffer.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = MediaBrowserCompatSearchResultReceiver + 45;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = onCommand().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 85;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i6 = MediaDescriptionCompat + 33;
            MediaBrowserCompatSearchResultReceiver = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $10 + 83;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 38461);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 532;
                    int iNormalizeMetaState = 8 - KeyEvent.normalizeMetaState(0);
                    byte b = $$c[1];
                    byte b2 = (byte) (b - 1);
                    byte b3 = b;
                    objRemoteActionCompatParcelizer = startForeground.read(offsetBefore, trimmedLength, iNormalizeMetaState, -735610793, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (RatingCompat ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36621);
                    int capsMode = 2340 - TextUtils.getCapsMode("", 0, 0);
                    int iResolveSize = View.resolveSize(0, 0) + 28;
                    byte b4 = $$c[1];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    objRemoteActionCompatParcelizer2 = startForeground.read(c, capsMode, iResolveSize, 188119637, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $11 + 67;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char c2 = (char) (36622 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2340;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
                    byte b7 = $$c[1];
                    byte b8 = (byte) (b7 - 1);
                    byte b9 = b7;
                    objRemoteActionCompatParcelizer3 = startForeground.read(c2, keyRepeatDelay, iLastIndexOf, 188119637, false, $$i(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer4 == null) {
                char mode = (char) (36621 - View.MeasureSpec.getMode(0));
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2340;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte b10 = $$c[1];
                byte b11 = (byte) (b10 - 1);
                byte b12 = b10;
                objRemoteActionCompatParcelizer4 = startForeground.read(mode, fadingEdgeLength, doubleTapTimeout, 188119637, false, $$i(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $11 + 77;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesCompatParcelizer[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 36621);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2340;
                    int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte b = $$c[1];
                    objRemoteActionCompatParcelizer = startForeground.read(mode, iNormalizeMetaState, touchSlop, 480654850, false, $$i((byte) (b - 1), b, r10[2]), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter("", 0) + 9701, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), AndroidCharacter.getMirror('0') + 23736, View.getDefaultSize(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $10 + 61;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23784, 33 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 51;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a((char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + TsExtractor.TS_STREAM_TYPE_E_AC3, new char[]{23881, 24022, 23655, 23788, 24428}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 51940, new char[]{23877, 38831, 51338, 15865, 30431, 43828, 39966, 53577, 2669, 32601, 45478, 60125, 57305, 4326, 17878, 48678, 62210, 9336, 6474, 21410, 33940, 63877, 13048, 26578, 22589, 36125}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a((char) View.combineMeasuredStates(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 82, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 96, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = MediaBrowserCompatSearchResultReceiver + 69;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.getMode(0) + 4535), ExpandableListView.getPackedPositionType(0L) + 6054, 41 - ((byte) KeyEvent.getModifierMetaStateMask()), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(15461 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{23879, 24948, 9694, 59501, 44243, 28857, 14107, 64389, 48696, 17055, 1765, 50506, 35325, 19555, 4294, 54522, 39748, 24564, 25181, 9835, 60147, 43272, 28140, 12302, 62564, 47263, 32594, 994, 50715, 35428, 20160, 3375, 53729, 37907, 22648, 7310, 9074, 59358, 43960, 28272, 12936, 61754, 46479, 31206, 15424, 49372, 34660, 19402}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.combineMeasuredStates(0, 0) + 36, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 45, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 26473), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 15, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 63, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myPid() >> 22) + 164, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 57, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a((char) (ViewConfiguration.getScrollBarSize() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 195, 6 - KeyEvent.normalizeMetaState(0), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31794, new char[]{23830, 8484, 42276, 10624, 44502, 12771, 46131, 14402, 48257, 165, 33960, 2823, 36622, 4980, 38846, 7117, 40448, 25170, 59003, 27326, 61074, 27923, 61730, 30062, 63962, 32218, 49599, 17469, 51279, 19660, 53497, 21677, 56117, 24340, 9104, 42913}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), KeyEvent.normalizeMetaState(0) + 6030, TextUtils.getCapsMode("", 0, 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13184);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1650;
            int scrollBarFadeDuration = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr = $$a;
            byte b = bArr[113];
            byte b2 = bArr[5];
            Object[] objArr13 = new Object[1];
            c(b, b2, (short) (b2 | 187), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cLastIndexOf, iLastIndexOf, scrollBarFadeDuration, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 13184);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1649;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 26;
                byte[] bArr2 = $$a;
                Object[] objArr14 = new Object[1];
                c(bArr2[5], bArr2[30], (short) 144, objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(modifierMetaStateMask, longPressTimeout, tapTimeout, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 233, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 64222, new char[]{23885, 42575, 43871, 44135, 45420, 47622, 48906, 32820, 34068, 36546, 37825, 38121, 39379, 57992, 59282, 59552}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 114749257};
                Object[] objArr18 = new Object[1];
                d(r0[74], (short) 152, (byte) ($$g[50] + 1), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d((byte) 54, (short) ($$h | 23), r0[3], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                    int iKeyCodeFromString = 1649 - KeyEvent.keyCodeFromString("");
                    int iRgb = Color.rgb(0, 0, 0) + 16777242;
                    byte[] bArr3 = $$a;
                    Object[] objArr20 = new Object[1];
                    c(bArr3[5], bArr3[30], (short) 144, objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cNormalizeMetaState, iKeyCodeFromString, iRgb, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a((char) View.MeasureSpec.getMode(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 204, KeyEvent.keyCodeFromString("") + 22, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a((char) (59269 - AndroidCharacter.getMirror('0')), 275 - (ViewConfiguration.getJumpTapTimeout() >> 16), 15 - View.combineMeasuredStates(0, 0), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char doubleTapTimeout = (char) (13183 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1650;
                        int iResolveSize = 26 - View.resolveSize(0, 0);
                        byte[] bArr4 = $$a;
                        byte b3 = bArr4[5];
                        byte b4 = bArr4[30];
                        Object[] objArr23 = new Object[1];
                        c(b3, b4, (short) (b4 | 101), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(doubleTapTimeout, iLastIndexOf2, iResolveSize, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char packedPositionChild = (char) (13182 - ExpandableListView.getPackedPositionChild(0L));
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1649;
                        int i6 = 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[113];
                        byte b6 = bArr5[5];
                        Object[] objArr24 = new Object[1];
                        c(b5, b6, (short) (b6 | 187), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(packedPositionChild, iMakeMeasureSpec, i6, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (Color.alpha(0) + 4535), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6054, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i9 = MediaBrowserCompatSearchResultReceiver + 53;
            MediaDescriptionCompat = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr25 = {-990697714, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6030, 24 - Color.red(0));
                Object[] objArr26 = new Object[1];
                d(r1[46], (short) ($$g[17] - 1), r1[82], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        MediaBrowserCompatMediaItem();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaDescriptionCompat + 17;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = MediaDescriptionCompat + 31;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 109;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = onCommand().af_();
        int i4 = MediaDescriptionCompat + 101;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return objAf_;
        }
        throw null;
    }

    private isHighlighted MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 81;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted onCommand() {
        if (this.read == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.read == null) {
                    this.read = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            }
        }
        return this.read;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 41;
        int i3 = i2 % 128;
        MediaDescriptionCompat = i3;
        if (i2 % 2 != 0) {
            if (this.write) {
                return;
            }
            int i4 = i3 + 27;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            this.write = true;
            ((Cea708DecoderDtvCcPacket) af_()).read((CeaDecoderExternalSyntheticLambda0) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
            int i6 = MediaDescriptionCompat + 93;
            MediaBrowserCompatSearchResultReceiver = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaDescriptionCompat + 125;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 61;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 51827, new char[]{23877, 38831, 51338, 15865, 30431, 43828, 39966, 53577, 2669, 32601, 45478, 60125, 57305, 4326, 17878, 48678, 62210, 9336, 6474, 21410, 33940, 63877, 13048, 26578, 22589, 36125}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 93, ((byte) KeyEvent.getModifierMetaStateMask()) + 19, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 49;
            MediaDescriptionCompat = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i5 = MediaDescriptionCompat + 9;
                MediaBrowserCompatSearchResultReceiver = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 6054 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 6031, (ViewConfiguration.getPressedStateDuration() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        super.onResume();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 51940, new char[]{23877, 38831, 51338, 15865, 30431, 43828, 39966, 53577, 2669, 32601, 45478, 60125, 57305, 4326, 17878, 48678, 62210, 9336, 6474, 21410, 33940, 63877, 13048, 26578, 22589, 36125}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 114), View.resolveSizeAndState(0, 0, 0) + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 9;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = MediaDescriptionCompat + 125;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0)), 6055 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6029, 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i6 = MediaDescriptionCompat + 113;
                MediaBrowserCompatSearchResultReceiver = i6 % 128;
                int i7 = i6 % 2;
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

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Context applicationContext;
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        int i2 = 0;
        Object[] objArr3 = new Object[1];
        a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 31, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + TsExtractor.TS_STREAM_TYPE_E_AC3, new char[]{23881, 24022, 23655, 23788, 24428}, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (context == null) {
                applicationContext = context;
            } else if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
                int i3 = MediaBrowserCompatSearchResultReceiver + 55;
                MediaDescriptionCompat = i3 % 128;
                int i4 = i3 % 2;
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
            if (applicationContext != null) {
                int i5 = MediaBrowserCompatSearchResultReceiver + 51;
                MediaDescriptionCompat = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.getTrimmedLength("")), 6053 - Process.getGidForName(""), 41 - ImageFormat.getBitsPerPixel(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 15457, new char[]{23879, 24948, 9694, 59501, 44243, 28857, 14107, 64389, 48696, 17055, 1765, 50506, 35325, 19555, 4294, 54522, 39748, 24564, 25181, 9835, 60147, 43272, 28140, 12302, 62564, 47263, 32594, 994, 50715, 35428, 20160, 3375, 53729, 37907, 22648, 7310, 9074, 59358, 43960, 28272, 12936, 61754, 46479, 31206, 15424, 49372, 34660, 19402}, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2), TextUtils.indexOf((CharSequence) "", '0') + 65, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a((char) (TextUtils.getCapsMode("", 0, 0) + 26508), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 90, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 28, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), 164 - Drawable.resolveOpacity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 63, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a((char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 230, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(31794 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{23830, 8484, 42276, 10624, 44502, 12771, 46131, 14402, 48257, 165, 33960, 2823, 36622, 4980, 38846, 7117, 40448, 25170, 59003, 27326, 61074, 27923, 61730, 30062, 63962, 32218, 49599, 17469, 51279, 19660, 53497, 21677, 56117, 24340, 9104, 42913}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6030, 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        try {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cAlpha = (char) (Color.alpha(0) + 61148);
                int iAlpha = 2145 - Color.alpha(0);
                int trimmedLength = 12 - TextUtils.getTrimmedLength("");
                Object[] objArr12 = new Object[1];
                c((byte) (-$$a[9]), (byte) ($$b << 1), (short) 78, objArr12);
                objRemoteActionCompatParcelizer3 = startForeground.read(cAlpha, iAlpha, trimmedLength, -2136739198, false, (String) objArr12[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                int i7 = MediaDescriptionCompat + 47;
                MediaBrowserCompatSearchResultReceiver = i7 % 128;
                int i8 = i7 % 2;
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cLastIndexOf = (char) (61147 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2145;
                    int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11;
                    byte[] bArr = $$a;
                    Object[] objArr13 = new Object[1];
                    c(bArr[113], bArr[19], (short) 75, objArr13);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cLastIndexOf, keyRepeatDelay, i9, -1530294468, false, (String) objArr13[0], null);
                }
                list = (List) ((Field) objRemoteActionCompatParcelizer4).get(null);
                int i10 = MediaDescriptionCompat + 5;
                MediaBrowserCompatSearchResultReceiver = i10 % 128;
                int i11 = i10 % 2;
            } else {
                Object[] objArr14 = new Object[1];
                a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 109), View.combineMeasuredStates(0, 0) + 237, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, objArr14);
                Class<?> cls2 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 64236, new char[]{23885, 42575, 43871, 44135, 45420, 47622, 48906, 32820, 34068, 36546, 37825, 38121, 39379, 57992, 59282, 59552}, objArr15);
                int iIntValue2 = ((Integer) cls2.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr16 = {-1063001695};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-173351824);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (45845 - Drawable.resolveOpacity(0, 0)), Color.rgb(0, 0, 0) + 16778129, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, -1948051227, false, null, new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr17 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr16)};
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1891595430);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char cGreen = (char) (61148 - Color.green(0));
                            int doubleTapTimeout = 2145 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i12 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11;
                            byte b = $$a[37];
                            Object[] objArr18 = new Object[1];
                            c(b, (byte) (b | 16), r8[15], objArr18);
                            objRemoteActionCompatParcelizer6 = startForeground.read(cGreen, doubleTapTimeout, i12, 251047987, false, (String) objArr18[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (Process.getGidForName("") + 1), 557 - (ViewConfiguration.getFadingEdgeLength() >> 16), 18 - View.combineMeasuredStates(0, 0))});
                        }
                        list = (List) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr17);
                        Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer7 == null) {
                            char c = (char) (61148 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            int iRgb = (-16775071) - Color.rgb(0, 0, 0);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 13;
                            byte[] bArr2 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr2[113], bArr2[19], (short) 75, objArr19);
                            objRemoteActionCompatParcelizer7 = startForeground.read(c, iRgb, packedPositionChild, -1530294468, false, (String) objArr19[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer7).set(null, list);
                        Object[] objArr20 = new Object[1];
                        a((char) Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 218, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13, objArr20);
                        Class<?> cls3 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 59217), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 274, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 14, objArr21);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(301834150);
                        if (objRemoteActionCompatParcelizer8 == null) {
                            char c2 = (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 61148);
                            int iLastIndexOf = 2144 - TextUtils.lastIndexOf("", '0', 0, 0);
                            int tapTimeout = 12 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte b2 = (byte) ($$b - 3);
                            byte[] bArr3 = $$a;
                            Object[] objArr22 = new Object[1];
                            c(b2, bArr3[45], bArr3[33], objArr22);
                            objRemoteActionCompatParcelizer8 = startForeground.read(c2, iLastIndexOf, tapTimeout, 1874090803, false, (String) objArr22[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-18205161);
                        if (objRemoteActionCompatParcelizer9 == null) {
                            char c3 = (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 61147);
                            int iLastIndexOf2 = 2144 - TextUtils.lastIndexOf("", '0', 0);
                            int iIndexOf = 12 - TextUtils.indexOf("", "");
                            Object[] objArr23 = new Object[1];
                            c((byte) (-$$a[9]), (byte) ($$b << 1), (short) 78, objArr23);
                            objRemoteActionCompatParcelizer9 = startForeground.read(c3, iLastIndexOf2, iIndexOf, -2136739198, false, (String) objArr23[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf2);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            for (Object[] objArr24 : list) {
                int i13 = ((int[]) objArr24[3])[i2];
                int i14 = ((int[]) objArr24[1])[i2];
                if (i14 != i13) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr24[2];
                    if (strArr != null) {
                        int i15 = MediaDescriptionCompat + 47;
                        MediaBrowserCompatSearchResultReceiver = i15 % 128;
                        int i16 = i15 % 2;
                        for (int i17 = i2; i17 < strArr.length; i17++) {
                            arrayList.add(strArr[i17]);
                        }
                    }
                    long j = ((long) i2) << 32;
                    long j2 = -1;
                    long j3 = 0;
                    long j4 = (((j2 - ((j2 >> 63) << 32)) | j) & ((long) (i14 ^ i13))) | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                    try {
                        Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer10 == null) {
                            objRemoteActionCompatParcelizer10 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4535), 6054 - (ViewConfiguration.getEdgeSlop() >> 16), 42 - View.getDefaultSize(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, null);
                        try {
                            Object[] objArr25 = {-1063001695, Long.valueOf(j4), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                            Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.combineMeasuredStates(0, 0), KeyEvent.normalizeMetaState(0) + 6030, 24 - TextUtils.indexOf("", "", 0, 0));
                            Object[] objArr26 = new Object[1];
                            d(r5[46], (short) ($$g[17] - 1), r5[82], objArr26);
                            cls4.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 == null) {
                            throw th5;
                        }
                        throw cause5;
                    }
                }
                i2 = 0;
            }
        } catch (Throwable th6) {
            Object[] objArr27 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 47834, new char[]{23824, 59371, 10471, 28135, 46825, 64483, 15613, 16893, 35573, 53239, 4342}, objArr27);
            String str6 = (String) objArr27[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th6.printStackTrace(printStream);
                printStream.close();
                strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
            } catch (Throwable unused) {
                strValueOf = String.valueOf(th6);
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(strValueOf);
            arrayList2.add(str6);
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer11 == null) {
                objRemoteActionCompatParcelizer11 = startForeground.read((char) (View.MeasureSpec.getSize(0) + 4535), 6054 - (ViewConfiguration.getEdgeSlop() >> 16), 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
            try {
                Object[] objArr28 = {-1063001695, 81604378625L, arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6030 - (Process.myTid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24);
                Object[] objArr29 = new Object[1];
                d(r4[46], (short) ($$g[17] - 1), r4[82], objArr29);
                cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr28);
            } catch (Throwable th7) {
                Throwable cause6 = th7.getCause();
                if (cause6 == null) {
                    throw th7;
                }
                throw cause6;
            }
        }
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            try {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr30 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60458, new char[]{23836, 45400, 34184, 39411, 60452, 49302, 54493, 11015, 16250, 5027, 26130}, objArr30);
                String str7 = (String) objArr30[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                    th8.printStackTrace(printStream2);
                    printStream2.close();
                    strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                } catch (Throwable unused2) {
                    strValueOf2 = String.valueOf(th8);
                }
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(strValueOf2);
                arrayList3.add(str7);
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) (4535 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 6054 - Color.alpha(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
                Object[] objArr31 = {-1063001695, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) Drawable.resolveOpacity(0, 0), 6030 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - TextUtils.getOffsetAfter("", 0));
                Object[] objArr32 = new Object[1];
                d(r4[46], (short) ($$g[17] - 1), r4[82], objArr32);
                cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr31);
            }
        }
        try {
            Object[] objArr33 = {-1063001695};
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer13 == null) {
                objRemoteActionCompatParcelizer13 = startForeground.read((char) Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 1991, 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr34 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr33)};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 19323);
                    int iMyPid = (Process.myPid() >> 22) + 2759;
                    int i18 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 98;
                    byte b3 = (byte) ($$b - 3);
                    byte[] bArr4 = $$a;
                    Object[] objArr35 = new Object[1];
                    c(b3, bArr4[45], bArr4[33], objArr35);
                    objRemoteActionCompatParcelizer14 = startForeground.read(cNormalizeMetaState, iMyPid, i18, 1799372695, false, (String) objArr35[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (9580 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 3445 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 144 - (Process.myTid() >> 22))});
                }
                ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr34);
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 13184);
                    int i19 = 1649 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr5 = $$a;
                    byte b4 = bArr5[113];
                    byte b5 = bArr5[5];
                    Object[] objArr36 = new Object[1];
                    c(b4, b5, (short) (b5 | 187), objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(bitsPerPixel, i19, iNormalizeMetaState, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 13184);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1649;
                        int fadingEdgeLength = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr6 = $$a;
                        Object[] objArr37 = new Object[1];
                        c(bArr6[5], bArr6[30], (short) 144, objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(bitsPerPixel2, iResolveSizeAndState, fadingEdgeLength, -1033747278, false, (String) objArr37[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                } else {
                    Object[] objArr38 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ExpandableListView.getPackedPositionType(0L) + 237, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 33, objArr38);
                    Class<?> cls7 = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 64261, new char[]{23885, 42575, 43871, 44135, 45420, 47622, 48906, 32820, 34068, 36546, 37825, 38121, 39379, 57992, 59282, 59552}, objArr39);
                    try {
                        Object[] objArr40 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue()), 0, 151302849};
                        byte[] bArr7 = $$g;
                        Object[] objArr41 = new Object[1];
                        d(bArr7[19], (short) (-bArr7[149]), bArr7[40], objArr41);
                        Class<?> cls8 = Class.forName((String) objArr41[0]);
                        byte b6 = bArr7[35];
                        short s = b6;
                        Object[] objArr42 = new Object[1];
                        d(b6, s, (byte) s, objArr42);
                        objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
                            int mirror = AndroidCharacter.getMirror('0') + 1601;
                            int iResolveOpacity = 26 - Drawable.resolveOpacity(0, 0);
                            byte[] bArr8 = $$a;
                            Object[] objArr43 = new Object[1];
                            c(bArr8[5], bArr8[30], (short) 144, objArr43);
                            objRemoteActionCompatParcelizer17 = startForeground.read(keyRepeatDelay2, mirror, iResolveOpacity, -1033747278, false, (String) objArr43[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                        try {
                            Object[] objArr44 = new Object[1];
                            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 252, 22 - ((Process.getThreadPriority(0) + 20) >> 6), objArr44);
                            Class<?> cls9 = Class.forName((String) objArr44[0]);
                            Object[] objArr45 = new Object[1];
                            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 59217), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + PsExtractor.VIDEO_STREAM_MASK, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 11, objArr45);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 13183);
                                int i20 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1650;
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                                byte[] bArr9 = $$a;
                                byte b7 = bArr9[5];
                                byte b8 = bArr9[30];
                                Object[] objArr46 = new Object[1];
                                c(b7, b8, (short) (b8 | 101), objArr46);
                                objRemoteActionCompatParcelizer18 = startForeground.read(doubleTapTimeout2, i20, packedPositionType, 54351865, false, (String) objArr46[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 13183);
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1649;
                                int i21 = 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                byte[] bArr10 = $$a;
                                byte b9 = bArr10[113];
                                byte b10 = bArr10[5];
                                Object[] objArr47 = new Object[1];
                                c(b9, b10, (short) (b10 | 187), objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(cResolveOpacity, minimumFlingVelocity, i21, -133433128, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf4);
                        } catch (Exception unused3) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th9) {
                        Throwable cause7 = th9.getCause();
                        if (cause7 == null) {
                            throw th9;
                        }
                        throw cause7;
                    }
                }
                int i22 = ((int[]) objArr[3])[0];
                int i23 = ((int[]) objArr[2])[0];
                if (i23 != i22) {
                    long j5 = -1;
                    long j6 = ((long) (i23 ^ i22)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
                    long j7 = 0;
                    long j8 = (((long) 2) << 32) | (j7 - ((j7 >> 63) << 32)) | j6;
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        objRemoteActionCompatParcelizer20 = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 4535), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6054, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
                    Object[] objArr48 = {-1063001695, Long.valueOf(j8), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSize(0, 0), 6030 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - (ViewConfiguration.getEdgeSlop() >> 16));
                    Object[] objArr49 = new Object[1];
                    d(r2[46], (short) ($$g[17] - 1), r2[82], objArr49);
                    cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
                }
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer21 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 944;
                    int packedPositionGroup = 36 - ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr50 = new Object[1];
                    c((byte) (-$$a[9]), (byte) ($$b << 1), (short) 78, objArr50);
                    objRemoteActionCompatParcelizer21 = startForeground.read(cResolveSize, iLastIndexOf3, packedPositionGroup, -167186806, false, (String) objArr50[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
                    int i24 = MediaBrowserCompatSearchResultReceiver + 55;
                    MediaDescriptionCompat = i24 % 128;
                    if (i24 % 2 == 0) {
                        Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer22 == null) {
                            int i25 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 942;
                            int offsetBefore = 36 - TextUtils.getOffsetBefore("", 0);
                            byte[] bArr11 = $$a;
                            Object[] objArr51 = new Object[1];
                            c(bArr11[113], bArr11[19], (short) 75, objArr51);
                            objRemoteActionCompatParcelizer22 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i25, offsetBefore, -1398865628, false, (String) objArr51[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer22).get(null);
                        int i26 = 97 / 0;
                    } else {
                        Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer23 == null) {
                            char c4 = (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 943;
                            int iRgb2 = (-16777180) - Color.rgb(0, 0, 0);
                            byte[] bArr12 = $$a;
                            Object[] objArr52 = new Object[1];
                            c(bArr12[113], bArr12[19], (short) 75, objArr52);
                            objRemoteActionCompatParcelizer23 = startForeground.read(c4, iCombineMeasuredStates, iRgb2, -1398865628, false, (String) objArr52[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
                    }
                } else {
                    Object[] objArr53 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4), 237 - (ViewConfiguration.getTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, objArr53);
                    Class<?> cls11 = Class.forName((String) objArr53[0]);
                    Object[] objArr54 = new Object[1];
                    b((ViewConfiguration.getTouchSlop() >> 8) + 64271, new char[]{23885, 42575, 43871, 44135, 45420, 47622, 48906, 32820, 34068, 36546, 37825, 38121, 39379, 57992, 59282, 59552}, objArr54);
                    Object[] objArr55 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr54[0], Object.class).invoke(null, this)).intValue()), 0, -57890730};
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int tapTimeout2 = 943 - (ViewConfiguration.getTapTimeout() >> 16);
                        int mode = View.MeasureSpec.getMode(0) + 36;
                        byte b11 = $$a[5];
                        Object[] objArr56 = new Object[1];
                        c(b11, r5[13], b11, objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(gidForName, tapTimeout2, mode, -2131402098, false, (String) objArr56[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer24).invoke(null, objArr55);
                    Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer25 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int i27 = 944 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int size = 36 - View.MeasureSpec.getSize(0);
                        byte[] bArr13 = $$a;
                        Object[] objArr57 = new Object[1];
                        c(bArr13[113], bArr13[19], (short) 75, objArr57);
                        objRemoteActionCompatParcelizer25 = startForeground.read(modifierMetaStateMask, i27, size, -1398865628, false, (String) objArr57[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer25).set(null, objArr2);
                    try {
                        Object[] objArr58 = new Object[1];
                        a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 216, Process.getGidForName("") + 23, objArr58);
                        Class<?> cls12 = Class.forName((String) objArr58[0]);
                        Object[] objArr59 = new Object[1];
                        a((char) (Color.green(0) + 59221), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 271, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 94, objArr59);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr59[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char c5 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int modifierMetaStateMask2 = 942 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int i28 = 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte b12 = (byte) ($$b - 3);
                            byte[] bArr14 = $$a;
                            Object[] objArr60 = new Object[1];
                            c(b12, bArr14[45], bArr14[33], objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(c5, modifierMetaStateMask2, i28, -629981381, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer27 == null) {
                            char c6 = (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                            int i29 = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 943;
                            int iCombineMeasuredStates2 = 36 - View.combineMeasuredStates(0, 0);
                            Object[] objArr61 = new Object[1];
                            c((byte) (-$$a[9]), (byte) ($$b << 1), (short) 78, objArr61);
                            objRemoteActionCompatParcelizer27 = startForeground.read(c6, i29, iCombineMeasuredStates2, -167186806, false, (String) objArr61[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i30 = ((int[]) objArr2[2])[0];
                int i31 = ((int[]) objArr2[0])[0];
                if (i31 != i30) {
                    long j9 = -1;
                    long j10 = ((long) (i31 ^ i30)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)));
                    long j11 = 0;
                    long j12 = j10 | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer28 == null) {
                        objRemoteActionCompatParcelizer28 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4535), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6053, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer28).invoke(null, null);
                    Object[] objArr62 = {-1063001695, Long.valueOf(j12), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) KeyEvent.getDeadChar(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 6030, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                    Object[] objArr63 = new Object[1];
                    d(r3[46], (short) ($$g[17] - 1), r3[82], objArr63);
                    cls13.getMethod((String) objArr63[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr62);
                }
            } catch (Throwable th10) {
                Throwable cause8 = th10.getCause();
                if (cause8 == null) {
                    throw th10;
                }
                throw cause8;
            }
        } catch (Throwable th11) {
            Throwable cause9 = th11.getCause();
            if (cause9 == null) {
                throw th11;
            }
            throw cause9;
        }
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 105;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
