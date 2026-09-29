package in.juspay.hypersdk.ota;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.buildSetStopReasonIntent;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00022\u00020\u0002*\f\b\u0000\u0010\u0005\"\u00020\u00042\u00020\u0004"}, d2 = {"Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "Config", "Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "Package", "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "Resources"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReleaseConfigKt {
    private static char AudioAttributesCompatParcelizer;
    private static long IconCompatParcelizer;
    private static char[] MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;
    private static int read;
    private static int write;
    private static final byte[] $$c = {18, 96, 87, -114};
    private static final int $$d = 203;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {18, -4, -80, 95, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$b = 119;
    private static final byte[] AudioAttributesImplBaseParcelizer = {112, -82, -21, -22, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -27, -37, -6, 15, -2, 2, -13, 21, -11, -9, 16, 22, -23, -5, -6, 30, -11, -11, -9, 16, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -29, -26, -20, TarConstants.LF_BLK, -49, 17, -9, -6, -1, -3, 5, 12, -11, 3, -17, 21, 24, -24, -15, 19, 14, -33, 19, -19, 15, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -40, -19, 4, -18, TarConstants.LF_BLK, -44, 1, 8, -3, 2, -14, 3, 17, -19, 11, -6, 1, 2, -15, 32, -27, -6, 18, -5, 21, -25, -3, -1, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -38, -20, -10, 3, -8, 22, -1, -10, 7, 2, -15, TarConstants.LF_LINK, -30, -20, 2, 14, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -30, -35, 1, 7, -5, 9, 11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -19, -34, 0, -2, -14, 0, 10, 7, -10, 7, 22, -19, -8, 5, 2, -17, 14, -15, TarConstants.LF_CHR, -34, 0, -2, -14, 0, 10, 7, -10, 7, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -31, -24, -15, 12, -7, 11, -5, -8, 7, 4, 6, 15, -30, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 57};
    private static final int AudioAttributesImplApi26Parcelizer = PsExtractor.PRIVATE_STREAM_1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = in.juspay.hypersdk.ota.ReleaseConfigKt.$$c
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = r7 + 103
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
        L2a:
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.ota.ReleaseConfigKt.$$e(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = r9 * 4
            int r9 = r9 + 73
            byte[] r0 = in.juspay.hypersdk.ota.ReleaseConfigKt.$$a
            int r8 = r8 * 3
            int r8 = 20 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.ota.ReleaseConfigKt.d(short, byte, int, java.lang.Object[]):void");
    }

    private static void c(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) + 22748, 35 - TextUtils.indexOf((CharSequence) "", '0', 0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 31369), 2721 - ExpandableListView.getPackedPositionGroup(0L), View.resolveSize(0, 0) + 38, 1895162189, false, $$e(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 15713, 63 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6122, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (IconCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 19;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 18 / 0;
            objArr[0] = str;
        }
    }

    private static void a(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = MediaBrowserCompatItemReceiver;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 11614, (Process.myPid() >> 22) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
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
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            char[] cArr4 = new char[i2];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i6 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.alpha(0), 22959 - Color.red(0), 44 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i7 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31588), View.MeasureSpec.getSize(0) + 9863, 65 - TextUtils.indexOf("", "", 0, 0), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.MeasureSpec.getSize(0) + 37822), TextUtils.getOffsetBefore("", 0) + 9754, TextUtils.getCapsMode("", 0, 0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i8 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i8, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i2 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void RemoteActionCompatParcelizer(android.content.Context r25, long r26, long r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.ota.ReleaseConfigKt.RemoteActionCompatParcelizer(android.content.Context, long, long):void");
    }

    static {
        RemoteActionCompatParcelizer();
        read = 0;
        RemoteActionCompatParcelizer = 1;
        IconCompatParcelizer = -3498762522182953692L;
        write = -136981212;
        AudioAttributesCompatParcelizer = (char) 36947;
    }

    static void RemoteActionCompatParcelizer() {
        MediaBrowserCompatItemReceiver = new char[]{44947, 44965, 44964, 44987, 44965, 44987, 44985, 44965, 44966, 44984, 44991, 44964, 44986, 44985, 44965, 44966, 44984, 44990, 44964, 44986, 44984, 44965, 44966, 44987, 44990, 44964, 44986, 44984, 44965, 44966, 44986, 44985, 44964, 44965, 44984, 44965, 44966, 44965, 44987, 44965, 44966, 44964, 44987, 44965, 44966, 44965, 44984, 44964, 44964, 44986, 44965, 44966, 44965, 44984, 44964, 44984, 44985, 44966, 44965, 44987, 44964, 44984, 44984, 44966, 44987, 44984, 44966, 44964, 44986, 44964, 44984, 44984, 44984, 44984, 44987, 44987, 44966, 44986, 44987, 44966, 44986, 44986, 44966, 44965, 44986, 44966, 44965, 44965, 44966, 44965, 44965, 44965, 44965, 44964, 44964, 44964, 44965, 44987, 44990, 44986, 44966, 44986, 44990, 44986, 44966, 44986, 44985, 44986, 44966, 44965, 44985, 44986, 44966, 44965, 44985, 44986, 44984, 44990, 44964, 44984, 44991, 44965, 44966, 44965, 44985, 44986, 44964, 44984, 44986, 44964, 44984, 44986, 44984, 44991, 44965, 44966, 44965, 44984, 44986, 44966, 44965, 44984, 44986, 44966, 44964, 44984, 44986, 44966, 44964, 44987, 44986, 44966, 44984, 44991, 44965, 44984, 44991, 44965, 44966, 44987, 44991, 44965, 44987, 44990, 44965, 44986, 44990, 44965, 44986, 44985, 44965, 44984, 44991, 44965, 44966, 44987, 44990, 44965, 44966, 44965, 44985, 44965, 44965, 44984, 44965, 44987, 44990, 44965, 44966, 44987, 44990, 44964, 44964, 44984, 44965, 44986, 44985, 44965, 44966, 44987, 44990, 44964, 44986, 44985, 44965, 44966, 44964, 44987, 44965, 44965, 44984, 44965, 44966, 44965, 44984, 44965, 44965, 44984, 44964, 44965, 44984, 44965, 44966, 44986, 44985, 44965, 44964, 44987, 44965, 44966, 44984, 44991, 44965, 44964, 44987, 44965, 44966, 44984, 44991, 44965, 44984, 44991, 44965, 44966, 44984, 44990, 44964, 44984, 44990, 44965, 44966, 44987, 44990, 44965, 44966, 44986, 44985, 44965, 44987, 44990, 44965, 44987, 44990, 44965, 44986, 44985, 44965, 44986, 44985, 44965, 44965, 44984, 44965, 44965, 44956};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = in.juspay.hypersdk.ota.ReleaseConfigKt.AudioAttributesImplBaseParcelizer
            int r9 = 34 - r9
            int r7 = 118 - r7
            int r8 = 258 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r5 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L25:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.ota.ReleaseConfigKt.b(short, int, short, java.lang.Object[]):void");
    }
}
