package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/concatByteArrays;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class concatByteArrays extends concat {
    private static long AudioAttributesCompatParcelizer;
    private static char[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] write;
    private static final byte[] $$l = {27, -119, -113, 73};
    private static final int $$m = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {28, -38, TarConstants.LF_DIR, -29, 70, -71, 5, 18, -2, -21, -7, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, -14, -3, 3, 0, 20, 41, -29, -12, 16, -1, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, 70, -26, -19, 6, 0, 13, 35, -39, 16, 4, 7, 18, -14, 10, 4, -5, 34, -14, -4, 15, 4, -8, 18, -8, TarConstants.LF_BLK, -39, 16, 4, 7, 27, -15, -18, 39, -6, -6, -4, 21, -9, 18, 9, 2};
    private static final int $$k = 245;
    private static final byte[] $$d = {5, 107, -8, 109, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 118;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r7 = r7 + 4
            byte[] r1 = kotlin.concatByteArrays.$$l
            int r8 = r8 * 2
            int r8 = r8 + 101
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concatByteArrays.$$n(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = r7 + 4
            byte[] r1 = kotlin.concatByteArrays.$$d
            int r8 = r8 + 65
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
        L28:
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concatByteArrays.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.concatByteArrays.$$j
            int r7 = 39 - r7
            int r9 = r9 + 73
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r5 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L25:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + 5
            int r8 = r8 + 1
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concatByteArrays.h(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.concatByteArrays$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/concatByteArrays$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/mapOf;", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/mapOf;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent RemoteActionCompatParcelizer(Context p0, mapOf p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) concatByteArrays.class);
            p1.IconCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $11 + 119;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i2 >> i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getTapTimeout() >> 16)), 2340 - Color.green(0), 27 - TextUtils.lastIndexOf("", '0', 0), 480654850, false, $$n(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.keyCodeFromString(""), 9700 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), View.combineMeasuredStates(0, 0) + 23784, 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(IconCompatParcelizer[i2 + i6])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 36622), TextUtils.indexOf((CharSequence) "", '0', 0) + 2341, ExpandableListView.getPackedPositionGroup(0L) + 28, 480654850, false, $$n(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (Process.myTid() >> 22), 9702 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) View.combineMeasuredStates(0, 0), View.MeasureSpec.getMode(0) + 23784, 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 23784, 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
            int i7 = $10 + 37;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str = new String(cArr);
        int i9 = $11 + 11;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = write;
        char c = '0';
        int i4 = -470782045;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 31;
                $10 = i7 % 128;
                if (i7 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", c, 0) + 43696), TextUtils.getTrimmedLength("") + 23297, 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        i6 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (Process.myTid() >> 22)), 23297 - TextUtils.indexOf("", ""), 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i6++;
                }
                i2 = 2;
                c = '0';
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = write;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 115;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr4 = new Object[1];
                objArr4[i5] = Integer.valueOf(iArr5[i8]);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43694 - TextUtils.lastIndexOf("", '0', i5, i5)), (ViewConfiguration.getEdgeSlop() >> 16) + 23297, Process.getGidForName("") + 16, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                i8++;
                i5 = 0;
                i4 = -470782045;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i5;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i11 = $11 + 29;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i13];
                Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (43695 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 23298 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i13++;
            }
            int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i15;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i17 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16825410), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20126, (-16777196) - Color.rgb(0, 0, 0), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009f  */
    @Override // kotlin.concat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concatByteArrays.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d1  */
    @Override // kotlin.concat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concatByteArrays.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    @Override // kotlin.concat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concatByteArrays.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0987 A[Catch: all -> 0x037c, TryCatch #20 {all -> 0x037c, blocks: (B:134:0x0981, B:136:0x0987, B:137:0x09ad, B:195:0x0b9e, B:197:0x0ba4, B:198:0x0bc9, B:228:0x100c, B:230:0x1012, B:231:0x1038, B:264:0x1486, B:266:0x148c, B:267:0x14b4, B:245:0x126f, B:247:0x1292, B:248:0x12dd, B:17:0x00f7, B:19:0x00fd, B:20:0x0127, B:22:0x02e9, B:24:0x031b, B:25:0x0376), top: B:326:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0a7b A[PHI: r1 r4
      0x0a7b: PHI (r1v20 android.content.Context) = (r1v19 android.content.Context), (r1v207 android.content.Context), (r1v210 android.content.Context) binds: [B:141:0x0a42, B:153:0x0a71, B:150:0x0a65] A[DONT_GENERATE, DONT_INLINE]
      0x0a7b: PHI (r4v41 ??) = (r4v113 ??), (r4v114 ??), (r4v115 ??) binds: [B:141:0x0a42, B:153:0x0a71, B:150:0x0a65] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0ace A[Catch: all -> 0x0b42, TRY_LEAVE, TryCatch #2 {all -> 0x0b42, blocks: (B:165:0x0ac1, B:167:0x0ace), top: B:293:0x0ac1 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0ba4 A[Catch: all -> 0x037c, TryCatch #20 {all -> 0x037c, blocks: (B:134:0x0981, B:136:0x0987, B:137:0x09ad, B:195:0x0b9e, B:197:0x0ba4, B:198:0x0bc9, B:228:0x100c, B:230:0x1012, B:231:0x1038, B:264:0x1486, B:266:0x148c, B:267:0x14b4, B:245:0x126f, B:247:0x1292, B:248:0x12dd, B:17:0x00f7, B:19:0x00fd, B:20:0x0127, B:22:0x02e9, B:24:0x031b, B:25:0x0376), top: B:326:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0fec  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x10c7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x110d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x1466  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0a91 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v20, types: [int[]] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r4v103 */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v106 */
    /* JADX WARN: Type inference failed for: r4v107 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91 */
    @Override // kotlin.concat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concatByteArrays.attachBaseContext(android.content.Context):void");
    }

    static {
        RemoteActionCompatParcelizer = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 53;
        RemoteActionCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.concat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 53;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = MediaBrowserCompatItemReceiver + 93;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        write = new int[]{1946092957, 315432079, 884446768, 1652667209, 1182936565, -2113843724, -740502432, 1160177503, -2098824313, -156452533, -1732292540, 857264284, 732316042, -1967365486, 1847565178, 1599219555, -930978397, 174104417};
        IconCompatParcelizer = new char[]{36145, 33027, 38213, 43335, 48544, 55019, 56002, 52898, 62090, 59005, 59997, 40458, 33710, 47067, 48044, 44934, 21254, 18179, 19207, 31978, 24793, 5276, 6245, 3154, 12321, 9254, 10748, 56764, 49541, 62843, 63832, 56380, 53321, 50211, 63566, 60579, 57555, 38111, 35120, 48393, 45421, 42260, 22988, 19956, 16851, 30332, 27136, 7693, 4847, 1729, 15079, 11970, 9002, 55164, 52063, 65534, 62347, 59361, 37950, 34845, 48245, 45130, 42150, 22780, 19678, 16738, 29965, 26930, 7488, 4507, 1526, 14788, 11821, 8786, 54794, 51936, 65220, 62185, 59026, 39708, 36723, 33621, 47022, 43909, 24555, 19516, 16403, 29796, 26652, 7413, 4269, 1233, 14695, 11531, 8545, 29638, 32691, 27529, 22450, 17165, 20264, 15139, 9878, 4848, 7830, 2797, 63031, 57940, 60971, 55764, 50682, 45564, 48451, 43370, 38215, 33134, 35979, 30931, 25852, 20493, 23671, 18460, 15263, 10175, 5084, 8161, 2822, 63312, 58147, 61087, 56051, 50845, 45759, 48691, 43528, 38501, 33152, 36349, 31222, 25935, 20792, 23872, 18751, 13489, 8326, 11438, 6231, 1069, 61516, 58259, 61421, 56261, 51120, 45837, 48900, 43898, 38557, 33446, 36550, 56420, 53342, 50228, 63502, 60647, 57480, 38087, 35113, 48472, 45371, 42265, 22978, 19901, 16784, 30327, 27203, 7682, 4846, 1747, 15088, 11904, 9082, 55098, 51971, 65533, 62414, 59315, 37999, 34903, 48182, 45142, 42225, 22713, 19595, 16754, 30042, 26919, 7427, 4573, 1447, 14734, 11903, 8734, 54797, 51947, 65231, 62199, 59031, 39772, 36643, 33615, 47095, 43994, 24501, 19565, 16469, 29736, 26709, 7398, 4348, 1227, 14695, 11598, 8499, 54754, 51678, 64947, 9725, 10704, 15789, 388, 5409, 6469, 27922, 28915, 17600, 18671, 23736, 41036, 46124, 47117, 36838, 37824, 45653, 48766, 43541, 38432, 33488, 36587, 64172, 59215, 54084, 57099, 52019, 14326, 9143, 12221, 6220, 1123};
        AudioAttributesCompatParcelizer = -4454803959256002518L;
    }
}
