package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TaskExecutors extends addObserverForBackInvoker implements SubjectStat {
    private static short[] MediaBrowserCompatCustomActionResultReceiver;
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private final Object read;
    private boolean write;
    private static final byte[] $$l = {80, -72, 126, -24};
    private static final int $$m = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {9, -121, -22, -93, 70, -71, 5, 18, -2, -21, -7, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, -14, -3, 3, 0, 20, 41, -29, -12, 16, -1, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8};
    private static final int $$k = 145;
    private static final byte[] $$d = {37, -1, TarConstants.LF_CONTIG, -26, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 255;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int RatingCompat = 1;
    private static char[] AudioAttributesCompatParcelizer = {44673, 44916, 44698, 44698, 44680, 44682, 44678, 44677, 44903, 44865, 44698, 44678, 44865, 44683, 44684, 44678, 44677, 44683, 45052, 44900, 44909, 44901, 44913, 44803, 44697, 44699, 44697, 44677, 44685, 44673, 44677, 44697, 44703, 44919, 44917, 44700, 44676, 44698, 44701, 44690, 44699, 45015, 44846, 44800, 44841, 44854, 44849, 44848, 44851, 44841, 44807, 44806, 44804, 44845, 44855, 44855, 44846, 44800, 44840, 44854, 44843, 44803, 44846, 44855, 44845, 44826, 44845, 44847, 44840, 44840, 44800, 44803, 44803, 44840, 44841, 44806, 44847, 44849, 44848, 44848, 44846, 44847, 44841, 44804, 44805, 44804, 44826, 44845, 44855, 45012, 44848, 44891, 44888, 44891, 44899, 44896, 44894, 44849, 44851, 44849, 44848, 44863, 44861, 44854, 44851, 44869, 44869, 44890, 44896, 44899, 44898, 44891, 44854, 44851, 44860, 44861, 44891, 44891, 44869, 44890, 44861, 44863, 44860, 44851, 44855, 44851, 44863, 44860, 44868, 44888, 44849, 44849, 44854, 44854, 44888, 44898, 44898, 44890, 44888, 44869, 44863, 44868, 44898, 44888, 44849, 44848, 44849, 44891, 44891, 44850, 44868, 44898, 44868, 44969, 45006, 45007, 45004, 45001, 45005, 44967, 45054, 44818, 44818, 44824, 44818, 44828, 44819, 44842, 44841, 44825, 45031, 45053, 44829, 44830, 44825, 44990, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 44944, 44985, 44991, 44988, 44988, 44989, 44988, 44990, 44991, 44989, 44985};
    private static int MediaBrowserCompatItemReceiver = -1155638143;
    private static int AudioAttributesImplApi21Parcelizer = -819363155;
    private static int AudioAttributesImplBaseParcelizer = -1642330973;
    private static byte[] AudioAttributesImplApi26Parcelizer = {-73, -59, -36, -43, -50, TarConstants.LF_BLK, -3, -61, -51, -43, -53, -45, TarConstants.LF_CONTIG, 38, TarConstants.LF_DIR, -102, -40, -55, 21, -114, -35, -34, -37, -54, -46, -53, -111, -49, -62, -64, -3, 20, -2, 16, -13, 17, -60, -52, -15, -58, -49, 18, -3, 16, -61, -14, 30, -10, 30, -64, -10, 30, -13, -51, -59, 19, -5, 20, -59, -54, -58, -50, -57, -4, -62, 21, -54, -62, -49, -62, -64, -14, -64, 40, -3, -63, -50, 40, -54, -59, -16, -63, 21, -4, 16, -64, -12, -50, 17, -14, -98, -88, -111, -98, -72, -122, -31, -86, 107, -48, 108, -106, -103, -87, -82, -110, -19, 81, -82, -104, -27, 85, -87, -101, -30, 94, -92, -122, -69, -109, -87, -104, -91, -122, -69, -103, -18, 109, -106, -123, -87, -72, -124, -85, -92, -99, -93, -47, 108, -104, -95, -82, -111, -86, -82, -102, -108, -97, -86, -30, -105, -94, 80, -108, -85, -105, -101, -67, -4, -105, -52, -95, -7, -2, -50, -25, -85, -62, -85, TarConstants.LF_CHR, -1, -2, -84, -61, -32, -10, -7, -2, -6, -27, -91, -50, -86, -50, -31, -16, -4, -3, -16, -3, -105, -53, -3, TarConstants.LF_GNUTYPE_LONGLINK, -85, -65, -96, -118, 93, -85, -78, -94, -71, -115, -114, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -81, -30, 105, -72, -71, -90, -107, -67, -106, 66, -119, -3, -116, -7, -26, -11, -18, -125, -14, -113, -2, -30, -116, -6, 70, 35, 57, 39, 36, 33, 38, 33, 59, 32, 60};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r5, int r6, int r7) {
        /*
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = kotlin.TaskExecutors.$$l
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = 112 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r6]
        L26:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskExecutors.$$n(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.TaskExecutors.$$d
            int r7 = r7 + 65
            int r9 = r9 + 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-1)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskExecutors.g(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 6
            int r8 = r8 + 73
            int r6 = r6 + 4
            byte[] r1 = kotlin.TaskExecutors.$$j
            byte[] r0 = new byte[r0]
            int r7 = r7 + 5
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + 5
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskExecutors.h(short, int, short, java.lang.Object[]):void");
    }

    TaskExecutors() {
        this.read = new Object();
        this.write = false;
        AudioAttributesImplApi21Parcelizer();
    }

    TaskExecutors(byte b) {
        super(R.layout.activity_test_introduction_marrow2);
        this.read = new Object();
        this.write = false;
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.TaskExecutors.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                TaskExecutors.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = RatingCompat + 105;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
        this.IconCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 45;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = AudioAttributesCompatParcelizer;
        if (cArr != null) {
            int i6 = $11 + 21;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Process.getGidForName("") + 1), TextUtils.indexOf("", "") + 11613, 20 - TextUtils.indexOf("", ""), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 22959, 43 - TextUtils.getCapsMode("", 0, 0), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    int i10 = $10 + 31;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31588 - TextUtils.lastIndexOf("", '0', 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9863, 65 - ExpandableListView.getPackedPositionType(0L), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                try {
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 37822), 9754 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0', 0, 0) + 28, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i13 = $11 + 91;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 1, i3);
                System.arraycopy(cArr5, 1, cArr3, i3 / i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 1, i3 * i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i14 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i14, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i14);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void f(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
            int i8 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 24297, 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10 + 59;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j = 7899112766888837815L;
            } else {
                int i11 = $11 + 9;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                byte[] bArr = AudioAttributesImplApi26Parcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $10 + 7;
                        $11 = i14 % 128;
                        if (i14 % i6 == 0) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i8] = Integer.valueOf(bArr[i13]);
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b2 = (byte) i8;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ImageFormat.getBitsPerPixel(i8) + 1), TextUtils.lastIndexOf("", '0') + 3083, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 128, 2145850993, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i13] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i13])};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3081, 129 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2145850993, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i13] = ((Byte) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).byteValue();
                        }
                        i13++;
                        i6 = 2;
                        i8 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplApi26Parcelizer;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatItemReceiver)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L) + 24297, (ViewConfiguration.getEdgeSlop() >> 16) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatCustomActionResultReceiver[i + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i15 = ((i + iIntValue) - 2) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ j));
                if (z) {
                    int i16 = $10 + 53;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                buildresumedownloadsintent.read = i15 + i4;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplBaseParcelizer), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (34134 - TextUtils.getOffsetAfter("", 0)), (-16763784) - Color.rgb(0, 0, 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplApi26Parcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z2) {
                        int i19 = $11 + 71;
                        $10 = i19 % 128;
                        if (i19 % 2 != 0) {
                            byte[] bArr6 = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read;
                            i5 = buildresumedownloadsintent.RemoteActionCompatParcelizer - (((byte) (((byte) (((long) bArr6[r3]) & 7899112766888837815L)) * s)) ^ b);
                        } else {
                            byte[] bArr7 = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            i5 = buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r3]) ^ 7899112766888837815L)) + s)) ^ b);
                        }
                        buildresumedownloadsintent.IconCompatParcelizer = (char) i5;
                    } else {
                        short[] sArr = MediaBrowserCompatCustomActionResultReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 49;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        Object obj = null;
        e(null, new int[]{0, 18, 157, 2}, true, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(new byte[]{0, 1, 0, 0, 0}, new int[]{18, 5, 136, 5}, true, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = RatingCompat + 103;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                f((short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 112), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 1949818536, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 31, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1362462135, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{23, 18, 165, 0}, true, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i6 = RatingCompat + 103;
                MediaBrowserCompatSearchResultReceiver = i6 % 128;
                if (i6 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i7 = MediaBrowserCompatSearchResultReceiver + 111;
                    RatingCompat = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.getTrimmedLength("")), 6102 - AndroidCharacter.getMirror('0'), 41 - Process.getGidForName(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(new byte[]{1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1}, new int[]{41, 48, 88, 48}, false, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(new byte[]{0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1}, new int[]{89, 64, 133, 0}, true, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((short) ((Process.myTid() >> 22) - 118), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1949818395, (ViewConfiguration.getJumpTapTimeout() >> 16) - 27, (-1362462130) - TextUtils.getOffsetBefore("", 0), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1949818367, (ViewConfiguration.getLongPressTimeout() >> 16) - 27, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1362462159, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(new byte[]{0, 0, 0, 1, 1, 1}, new int[]{153, 6, 20, 0}, true, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 110), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 49), (ViewConfiguration.getLongPressTimeout() >> 16) - 1949818265, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 63, (ViewConfiguration.getPressedStateDuration() >> 16) - 1362462178, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), Color.red(0) + 6030, 24 - (ViewConfiguration.getTapTimeout() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 13183);
            int tapTimeout = 1649 - (ViewConfiguration.getTapTimeout() >> 16);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 26;
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            g(bArr[113], (byte) ($$e & 40), bArr[1], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(doubleTapTimeout, tapTimeout, iCombineMeasuredStates, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i9 = RatingCompat + 39;
            MediaBrowserCompatSearchResultReceiver = i9 % 128;
            if (i9 % 2 != 0) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char defaultSize = (char) (13183 - View.getDefaultSize(0, 0));
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                    int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25;
                    byte[] bArr2 = $$d;
                    Object[] objArr14 = new Object[1];
                    g(bArr2[5], bArr2[8], bArr2[65], objArr14);
                    objRemoteActionCompatParcelizer4 = startForeground.read(defaultSize, doubleTapTimeout2, i10, -1033747278, false, (String) objArr14[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer5 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 13183);
                int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1648;
                int iBlue = Color.blue(0) + 26;
                byte[] bArr3 = $$d;
                Object[] objArr15 = new Object[1];
                g(bArr3[5], bArr3[8], bArr3[65], objArr15);
                objRemoteActionCompatParcelizer5 = startForeground.read(capsMode, i11, iBlue, -1033747278, false, (String) objArr15[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
        } else {
            Object[] objArr16 = new Object[1];
            e(new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1}, new int[]{159, 16, 45, 5}, true, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            e(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{175, 16, 0, 0}, false, objArr17);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
            int i12 = MediaBrowserCompatSearchResultReceiver + 59;
            RatingCompat = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr18 = {Integer.valueOf(iIntValue2), 0, -1488075035};
                byte[] bArr4 = $$j;
                byte b = bArr4[37];
                byte b2 = bArr4[31];
                Object[] objArr19 = new Object[1];
                h(b, b2, (byte) (b2 | 38), objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                h((byte) (bArr4[6] - 1), bArr4[14], bArr4[31], objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cRed = (char) (Color.red(0) + 13183);
                    int iMyPid = 1649 - (Process.myPid() >> 22);
                    int iRgb = Color.rgb(0, 0, 0) + 16777242;
                    byte[] bArr5 = $$d;
                    Object[] objArr21 = new Object[1];
                    g(bArr5[5], bArr5[8], bArr5[65], objArr21);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cRed, iMyPid, iRgb, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    f((short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 21), (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), (-1949818229) - (ViewConfiguration.getPressedStateDuration() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 31, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 1362462180, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 107), (byte) View.getDefaultSize(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 1949818256, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 28, (-1362462127) - View.combineMeasuredStates(0, 0), objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char mode = (char) (13183 - View.MeasureSpec.getMode(0));
                        int i14 = 1649 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 27;
                        byte[] bArr6 = $$d;
                        Object[] objArr24 = new Object[1];
                        g(bArr6[5], bArr6[8], (short) ($$e & 331), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(mode, i14, modifierMetaStateMask, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char cAlpha = (char) (13183 - Color.alpha(0));
                        int iRed = 1649 - Color.red(0);
                        int iKeyCodeFromString = 26 - KeyEvent.keyCodeFromString("");
                        byte[] bArr7 = $$d;
                        Object[] objArr25 = new Object[1];
                        g(bArr7[113], (byte) ($$e & 40), bArr7[1], objArr25);
                        objRemoteActionCompatParcelizer8 = startForeground.read(cAlpha, iRed, iKeyCodeFromString, -133433128, false, (String) objArr25[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf2);
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
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            long j = -1;
            long j2 = ((long) (i16 ^ i15)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) (4535 - (ViewConfiguration.getScrollBarSize() >> 8)), 6054 - (ViewConfiguration.getJumpTapTimeout() >> 16), 41 - TextUtils.lastIndexOf("", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
            try {
                Object[] objArr26 = {645846352, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 6031 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 24 - KeyEvent.keyCodeFromString(""));
                byte b3 = (byte) 23;
                Object[] objArr27 = new Object[1];
                h(b3, (byte) (b3 >>> 1), $$j[0], objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 15;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 33;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = MediaBrowserCompatSearchResultReceiver + 13;
            RatingCompat = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 75;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatItemReceiver().af_();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 91;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 33;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        if (this.write) {
            return;
        }
        int i5 = i2 + 75;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        this.write = true;
        int i7 = RatingCompat + 81;
        MediaBrowserCompatSearchResultReceiver = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 119;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            throw null;
        }
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i3 = MediaBrowserCompatSearchResultReceiver + 107;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 147), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (-1949818457) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 76, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1362462141, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{23, 18, 165, 0}, true, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = MediaBrowserCompatSearchResultReceiver + 115;
            RatingCompat = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i5 = MediaBrowserCompatSearchResultReceiver + 27;
                RatingCompat = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (MotionEvent.axisFromString("") + 4536), 6054 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 6029 - Process.getGidForName(""), KeyEvent.keyCodeFromString("") + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i7 = RatingCompat + 111;
                MediaBrowserCompatSearchResultReceiver = i7 % 128;
                int i8 = i7 % 2;
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 55;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 146), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 1949818426, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 28, (-1362462131) - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{23, 18, 165, 0}, true, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 15;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = MediaBrowserCompatSearchResultReceiver + 15;
                RatingCompat = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 4536), 6054 - View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 6030 - (ViewConfiguration.getScrollBarSize() >> 8), 24 - View.combineMeasuredStates(0, 0), -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:135:0x09c4 A[Catch: all -> 0x0a77, TryCatch #12 {all -> 0x0a77, blocks: (B:133:0x09b0, B:135:0x09c4, B:136:0x09f2), top: B:275:0x09b0, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0a05 A[Catch: all -> 0x0a6d, TryCatch #6 {all -> 0x0a6d, blocks: (B:137:0x09f8, B:139:0x0a05, B:140:0x0a66), top: B:264:0x09f8, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0ca9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x1019  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x10f2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x1140  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x11a6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x14ed  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0995 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskExecutors.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
    }
}
