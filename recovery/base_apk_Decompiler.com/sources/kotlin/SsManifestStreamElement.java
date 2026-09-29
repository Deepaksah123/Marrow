package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.kt.base.BaseDaggerActivity;
import com.marrow.kt.ui.activities.sync.SyncingActivity;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class SsManifestStreamElement<P extends getExtendedEsFrChar> extends BaseDaggerActivity<P> implements SubjectStat {
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private static final byte[] $$l = {27, 74, 113, 65};
    private static final int $$o = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {16, -101, -28, -55, 16, 2, -59, 61, 12, 4, -4, 9, -3, -51, TarConstants.LF_CONTIG, 17, -6, 18, 1, -2, -1, -50, 61, 10, 10, -65, 57, 16, 2, 4, 6, 3, -60, TarConstants.LF_GNUTYPE_LONGLINK, 3, -7, 7, -58, 80, 4, -21, -9, 0, 7, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -46, TarConstants.LF_LINK, -7, 25, -81, 33, 56, -13, 9, 10, -42, TarConstants.LF_CONTIG, 4, 2, -5, -3, 23, 3, -11, 18, -38, 40, 7, 0, -38, 35, 22, -10, -17, 21, 21, -11, 6, 11, 1, 21, -17, 17, -1, -5, 15, -11};
    private static final int $$k = 36;
    private static final byte[] $$d = {114, -20, -35, -46, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 93;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    private static char[] write = {9065, 19799, 65294, 27113, 39843, 1428, 46666, 8305, 21231, 64706, 28364, 40771, 2358, 47898, 9669, 22450, 49259, 29242, 8475, 20286, 64833, 27532, 39382, 23034, 14276, 34205, 4986, 57648, 32519, 52441, 23266, 10354, 34386, 5121, 58798, 29590, 49541, 24385, 11565, 47869, 2227, 59037, 29761, 49691, 21494, 8671, 49049, 3426, 39734, 31603, 5460, 42752, 12785, 50097, 23947, 60994, 30726, 2792, 42201, 13974, 51042, 20799, 58124, 32202, 4006, 39023, 10815, 56380, 45662, '\r', 38575, 25855, 64152, 18717, 57197, 44465, 898, 37250, 24693, 63088, 17472, 56006, 43237, 16253, 36136, 25375, 61846, 18414, 54833, 41998, 14930, 35062, 7924, 60615, 17175, 53609, 42934, 13696, 35795, 6684, 59497, 32492, 52364, 41614, 12587, 34681, 5451, 60316, 31202, 51300, 24147, 11268, 33527, 4339, 59031, 29964, 52052, 22955, 12287, 48585, 3088, 57966, 28862, 50828, 21635, 11123, 47396, 3909, 40388, 29665, 49716, 56422, 45660, 24, 38654, 25830, 64149, 18763, 57141, 44515, 923, 37301, 24686, 63027, 17413, 56007, 43198, 56421, 45657, 11, 38641, 25788, 64144, 18782, 57122, 44492, 980, 37269, 24703, 62979, 17438, 56006, 43190};
    private static long MediaBrowserCompatCustomActionResultReceiver = -7948729332954451395L;
    private static int[] MediaBrowserCompatSearchResultReceiver = {1842577128, -871752778, -740942782, -1510080070, -1557502695, -567100184, 809442444, -505171141, -1669528739, -1173260284, -291700522, -435547853, 938559988, -1604879247, -13531953, 149594930, 2015609329, -1570101182};
    private final Object read = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    private static String $$r(byte b, int i, byte b2) {
        int i2 = 101 - (i * 4);
        byte[] bArr = $$l;
        int i3 = b + 4;
        int i4 = b2 * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
        }
        while (true) {
            i3++;
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 114 - r8
            byte[] r0 = kotlin.SsManifestStreamElement.$$d
            int r7 = 44 - r7
            int r6 = 191 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r6]
        L22:
            int r3 = -r3
            int r8 = r8 + r3
            int r6 = r6 + 1
            int r8 = r8 + (-1)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsManifestStreamElement.g(short, int, int, java.lang.Object[]):void");
    }

    private static void h(int i, short s, short s2, Object[] objArr) {
        int i2 = 112 - s;
        byte[] bArr = $$j;
        int i3 = 119 - s2;
        byte[] bArr2 = new byte[i + 4];
        int i4 = i + 3;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + i4) - 4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            i2++;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + bArr[i2]) - 4;
        }
    }

    public SsManifestStreamElement() {
        onCommand();
    }

    private void onCommand() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.SsManifestStreamElement.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                SsManifestStreamElement.this.onCustomAction();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 121;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 67;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = onPlayFromMediaId().write();
            this.IconCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = RatingCompat + 95;
                MediaBrowserCompatMediaItem = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = MediaBrowserCompatMediaItem + 83;
            RatingCompat = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        getSubjectStat getsubjectstatWrite2 = onPlayFromMediaId().write();
        this.IconCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 33;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(write[i << i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.getSize(0) + 36621), 2340 - (KeyEvent.getMaxKeyCode() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 29, 480654850, false, $$r(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), View.resolveSize(0, 0) + 9701, 26 - TextUtils.getCapsMode("", 0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (Process.myTid() >> 22), (Process.myTid() >> 22) + 23784, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
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
            } else {
                int i6 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(write[i + i6])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36621), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2339, (ViewConfiguration.getLongPressTimeout() >> 16) + 28, 480654850, false, $$r(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionType(0L) + 9701, 25 - ExpandableListView.getPackedPositionChild(0L), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) Color.argb(0, 0, 0, 0), 23784 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 32 - MotionEvent.axisFromString(""), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            int i7 = $11 + 23;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 23784 - View.MeasureSpec.getMode(0), 34 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = MediaBrowserCompatSearchResultReceiver;
        int i5 = -470782045;
        int i6 = 43695;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 111;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (i6 - ((Process.getThreadPriority(0) + 20) >> 6)), 23297 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.blue(0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        i8 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 43696), TextUtils.lastIndexOf("", '0', 0) + 23298, 15 - Color.green(0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                i3 = 2;
                i6 = 43695;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = MediaBrowserCompatSearchResultReceiver;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 73;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr4 = new Object[1];
                objArr4[i7] = Integer.valueOf(iArr5[i10]);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i5);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.argb(i7, i7, i7, i7) + 43695), (ViewConfiguration.getLongPressTimeout() >> 16) + 23297, (ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)) + 16, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                i10++;
                i5 = -470782045;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $10 + 47;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i13];
                    try {
                        Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43695), 23298 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                        buildremovealldownloadsintent.read = iIntValue;
                        i13 += 27;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i13];
                    Object[] objArr6 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (43695 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.alpha(0) + 23297, TextUtils.getCapsMode("", 0, 0) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue2;
                    i13++;
                }
                int i16 = $11 + 55;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i18;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i20 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr7 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer6 == null) {
                objRemoteActionCompatParcelizer6 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 48194), 20126 - Color.red(0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00c0  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsManifestStreamElement.onCreate(android.os.Bundle):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = RatingCompat + 27;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.IconCompatParcelizer;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
                int i3 = MediaBrowserCompatMediaItem + 67;
                RatingCompat = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        super.onDestroy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedOnPlayFromMediaId = onPlayFromMediaId();
        if (i3 == 0) {
            return ishighlightedOnPlayFromMediaId.af_();
        }
        ishighlightedOnPlayFromMediaId.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted onPlay() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = RatingCompat + 55;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted onPlayFromMediaId() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = onPlay();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void onCustomAction() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        int i5 = i3 + 81;
        MediaBrowserCompatMediaItem = i5 % 128;
        this.AudioAttributesCompatParcelizer = i5 % 2 == 0;
        ((newChildParser) af_()).RemoteActionCompatParcelizer((SyncingActivity) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        int i6 = RatingCompat + 51;
        MediaBrowserCompatMediaItem = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = RatingCompat + 49;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            int i3 = 50 / 0;
        } else {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        }
        int i4 = RatingCompat + 45;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsManifestStreamElement.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013e  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsManifestStreamElement.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0f97  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x108a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x10dc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x1134  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x141f  */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07bf A[Catch: all -> 0x0876, TryCatch #12 {all -> 0x0876, blocks: (B:88:0x07b9, B:90:0x07bf, B:91:0x07eb), top: B:300:0x07b9, outer: #14 }] */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r42) {
        /*
            Method dump skipped, instruction units count: 5816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsManifestStreamElement.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 91;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = MediaBrowserCompatMediaItem + 21;
        RatingCompat = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
