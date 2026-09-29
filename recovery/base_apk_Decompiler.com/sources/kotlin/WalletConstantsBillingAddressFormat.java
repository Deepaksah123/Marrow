package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WalletConstantsBillingAddressFormat extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$c = {122, -64, TarConstants.LF_SYMLINK, -113};
    private static final int $$f = TarConstants.CHKSUM_OFFSET;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 23, -13, 96, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$h = 71;
    private static final byte[] $$a = {32, -1, TarConstants.LF_GNUTYPE_SPARSE, -45, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 231;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static char[] AudioAttributesCompatParcelizer = {56429, 3637, 30918, 43899, 38207, 51158, 12898, 7235, 20187, 47472, 60228, 54753, 'j', 29192, 23725, 36720, 63759, 11192, 52035, 6408, 28657, 48222, 33284, 53410, 9486, 2917, 23031, 44613, 64548, 49914, 5958, 25906, 19334, 38983, 60981, 15496, 326, 22384, 42387, 35424, 55331, 11935, 29538, 16672, 38814, 58471, 51932, 6276, 27959, 46021, 33214, 54909, 9431, 2730, 24420, 44489, 62388, 49163, 5825, 25761, 18755, 40917, 60848, 12813, 166, 22195, 47883, 35301, 57338, 11287, 29417, 18255, 38164, 64489, 51287, 7771, 27883, 45332, 34656, 54773, 14927, 2087, 24197, 41800, 61750, 40919, 19863, 15217, 59615, 54940, 33903, 56425, 3639, 30915, 43897, 38179, 51162, 12898, 7231, 20177, 47458, 60166, 54725, 'q', 29194, 23723};
    private static long MediaBrowserCompatCustomActionResultReceiver = -7989200612817236389L;
    private static long AudioAttributesImplBaseParcelizer = -3498762522182953692L;
    private static int AudioAttributesImplApi21Parcelizer = -1948708808;
    private static char AudioAttributesImplApi26Parcelizer = 54564;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r6 = r6 + 4
            byte[] r1 = kotlin.WalletConstantsBillingAddressFormat.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsBillingAddressFormat.$$i(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 65
            int r0 = r6 + 4
            int r8 = r8 + 4
            byte[] r1 = kotlin.WalletConstantsBillingAddressFormat.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsBillingAddressFormat.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = 31 - r7
            int r6 = r6 * 3
            int r6 = 54 - r6
            byte[] r1 = kotlin.WalletConstantsBillingAddressFormat.$$g
            int r8 = r8 + 65
            byte[] r0 = new byte[r0]
            int r7 = 30 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + 2
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsBillingAddressFormat.d(int, byte, byte, java.lang.Object[]):void");
    }

    WalletConstantsBillingAddressFormat() {
        AudioAttributesImplBaseParcelizer();
    }

    /* JADX INFO: renamed from: o.WalletConstantsBillingAddressFormat$1, reason: invalid class name */
    public class AnonymousClass1 implements PlaybackStateCompatCustomAction {
        public static int AudioAttributesCompatParcelizer;
        public static int write;

        AnonymousClass1() {
        }

        @Override // kotlin.PlaybackStateCompatCustomAction
        public final void write(Context context) {
            WalletConstantsBillingAddressFormat.this.AudioAttributesImplApi26Parcelizer();
        }

        public static int AudioAttributesCompatParcelizer() {
            int i = AudioAttributesCompatParcelizer;
            int i2 = i % 8584189;
            AudioAttributesCompatParcelizer = i + 1;
            if (i2 != 0) {
                return write;
            }
            int iMyTid = Process.myTid();
            write = iMyTid;
            return iMyTid;
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new AnonymousClass1());
        int i2 = MediaBrowserCompatItemReceiver + 7;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 29;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
            this.IconCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = MediaBrowserCompatSearchResultReceiver + 113;
                MediaBrowserCompatItemReceiver = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 % 2;
                    return;
                }
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatItemReceiver().write();
        this.IconCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        int i4 = $10 + 113;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (downloadService.write < i2) {
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesCompatParcelizer[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36622 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2340 - TextUtils.getTrimmedLength(""), 28 - View.resolveSize(0, 0), 480654850, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), 9701 - Gravity.getAbsoluteGravity(0, 0), 25 - TextUtils.lastIndexOf("", '0'), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 23785, Color.rgb(0, 0, 0) + 16777249, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 101;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23785 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 33 - Color.blue(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr6 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23785, KeyEvent.getDeadChar(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        String str = new String(cArr);
        int i8 = $11 + 121;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i3 = $11 + 43;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i5 = $10 + 67;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 22749, (ViewConfiguration.getPressedStateDuration() >> 16) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 2721, 38 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.blue(0), 15713 - ((Process.getThreadPriority(0) + 20) >> 6), 65 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                c2 = 2;
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.MeasureSpec.getSize(0) + 40976), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6122, 29 - View.combineMeasuredStates(0, 0), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                c2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesImplBaseParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00db  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r35) {
        /*
            Method dump skipped, instruction units count: 3034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsBillingAddressFormat.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 57;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 81;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i6 = MediaBrowserCompatItemReceiver + 31;
        MediaBrowserCompatSearchResultReceiver = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 67;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 == 0) {
            ishighlightedMediaBrowserCompatItemReceiver.af_();
            throw null;
        }
        Object objAf_ = ishighlightedMediaBrowserCompatItemReceiver.af_();
        int i4 = MediaBrowserCompatSearchResultReceiver + 41;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return objAf_;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 15;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.read == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.read == null) {
                    this.read = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.read;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 79;
        int i3 = i2 % 128;
        MediaBrowserCompatSearchResultReceiver = i3;
        int i4 = i2 % 2;
        if (!this.write) {
            int i5 = i3 + 107;
            MediaBrowserCompatItemReceiver = i5 % 128;
            if (i5 % 2 != 0) {
                this.write = false;
            } else {
                this.write = true;
            }
        }
        int i6 = MediaBrowserCompatSearchResultReceiver + 81;
        MediaBrowserCompatItemReceiver = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 87;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f8  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsBillingAddressFormat.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 89;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new char[]{43750, 7694, 29316, 28804}, (char) (33906 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), new char[]{0, 0, 0, 0}, new char[]{15141, 44291, 14300, 9637, 16974, 20835, 63936, 6031, 2209, 16520, 53078, 38188, 16600, 43506, 403, 30396, 28620, 28300, 14296, 42616, 23987, 41615, 28354, 41466, 21283, 57093}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 109, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{45038, 42801, 37984, 23118}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 20081), new char[]{0, 0, 0, 0}, new char[]{41922, 40338, 31370, 12470, 20480, 56829, 26512, 15767, 65149, 736, 13427, 41202, 8963, 50759, 33945, 8793, 22411, 63385}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaBrowserCompatItemReceiver + 17;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatSearchResultReceiver + 119;
            MediaBrowserCompatItemReceiver = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = MediaBrowserCompatSearchResultReceiver + 15;
            MediaBrowserCompatItemReceiver = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4535), View.resolveSizeAndState(0, 0, 0) + 6054, 42 - Color.red(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), TextUtils.lastIndexOf("", '0', 0, 0) + 6031, 24 - (ViewConfiguration.getJumpTapTimeout() >> 16), -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(28:(26:36|260|37|(3:39|40|(2:42|44)(1:43))(1:44)|80|275|81|(1:83)|84|(3:86|(1:88)|89)(19:90|91|267|92|(1:94)|95|96|258|97|(1:99)|100|101|102|(1:104)|105|(1:107)|108|(1:110)|111)|112|(4:115|(13:283|117|(3:119|(4:122|(3:289|124|292)(4:288|125|126|291)|290|120)|287)|127|276|128|(1:130)|131|132|133|269|134|286)(1:285)|284|113)|282|169|(1:171)|172|(3:174|(1:176)|177)(13:178|280|179|180|(1:182)|183|273|184|185|(1:187)|188|(1:190)|191)|192|(6:194|195|(1:197)|198|199|200)|201|(1:203)|204|(3:206|(1:208)|209)(14:211|212|(1:214)|215|216|(1:218)|219|263|220|221|(1:223)|224|(1:226)|227)|210|228|(7:230|231|(1:233)|234|235|236|237)(1:293))|278|53|(1:55)|56|57|80|275|81|(0)|84|(0)(0)|112|(1:113)|282|169|(0)|172|(0)(0)|192|(0)|201|(0)|204|(0)(0)|210|228|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0bd9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0bda, code lost:
    
        r9 = new java.lang.Object[1];
        b(new char[]{64153, 62563, 9187, 4727}, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), new char[]{0, 0, 0, 0}, new char[]{43548, 33482, 51604, 15478, 61026, 34402, 10541, 60733, 48928, 46958, 9422}, ((android.content.Context) java.lang.Class.forName(r22).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 470522921, r9);
        r3 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0c29, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r2 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0c40, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0c44, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0c53, code lost:
    
        r2 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0c57, code lost:
    
        if (r2 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0c59, code lost:
    
        r2 = kotlin.startForeground.read((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 4534), 6054 - (android.media.AudioTrack.getMinVolume() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.media.AudioTrack.getMinVolume() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 42 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0c8b, code lost:
    
        r2 = ((java.lang.reflect.Method) r2).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0c97, code lost:
    
        r6 = new java.lang.Object[]{1235345229, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r3 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) android.text.TextUtils.getCapsMode("", 0, 0), 6029 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 24);
        r4 = kotlin.WalletConstantsBillingAddressFormat.$$g;
        r11 = new java.lang.Object[1];
        d(r4[49], r4[42], r4[12], r11);
        r3.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r2, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0a96 A[Catch: all -> 0x0bd9, TryCatch #11 {all -> 0x0bd9, blocks: (B:81:0x0641, B:83:0x0647, B:84:0x0689, B:86:0x0696, B:88:0x069f, B:89:0x06e2, B:112:0x0a8c, B:113:0x0a90, B:115:0x0a96, B:117:0x0aac, B:120:0x0ab9, B:124:0x0ac8, B:125:0x0ad0, B:132:0x0b35, B:138:0x0bb3, B:140:0x0bb9, B:141:0x0bba, B:143:0x0bbc, B:145:0x0bc3, B:146:0x0bc4, B:90:0x06ed, B:102:0x088d, B:104:0x0893, B:105:0x08da, B:107:0x09e0, B:108:0x0a2a, B:110:0x0a41, B:111:0x0a86, B:148:0x0bc6, B:150:0x0bcd, B:151:0x0bce, B:153:0x0bd0, B:155:0x0bd7, B:156:0x0bd8, B:97:0x0802, B:99:0x0816, B:100:0x0881, B:92:0x07b6, B:94:0x07c7, B:95:0x07fb, B:134:0x0b3a, B:128:0x0afd, B:130:0x0b03, B:131:0x0b2e), top: B:275:0x0641, outer: #4, inners: #1, #7, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0d66  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0dc7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x11d2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x121b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x1272  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1579  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0647 A[Catch: all -> 0x0bd9, TryCatch #11 {all -> 0x0bd9, blocks: (B:81:0x0641, B:83:0x0647, B:84:0x0689, B:86:0x0696, B:88:0x069f, B:89:0x06e2, B:112:0x0a8c, B:113:0x0a90, B:115:0x0a96, B:117:0x0aac, B:120:0x0ab9, B:124:0x0ac8, B:125:0x0ad0, B:132:0x0b35, B:138:0x0bb3, B:140:0x0bb9, B:141:0x0bba, B:143:0x0bbc, B:145:0x0bc3, B:146:0x0bc4, B:90:0x06ed, B:102:0x088d, B:104:0x0893, B:105:0x08da, B:107:0x09e0, B:108:0x0a2a, B:110:0x0a41, B:111:0x0a86, B:148:0x0bc6, B:150:0x0bcd, B:151:0x0bce, B:153:0x0bd0, B:155:0x0bd7, B:156:0x0bd8, B:97:0x0802, B:99:0x0816, B:100:0x0881, B:92:0x07b6, B:94:0x07c7, B:95:0x07fb, B:134:0x0b3a, B:128:0x0afd, B:130:0x0b03, B:131:0x0b2e), top: B:275:0x0641, outer: #4, inners: #1, #7, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0696 A[Catch: all -> 0x0bd9, TryCatch #11 {all -> 0x0bd9, blocks: (B:81:0x0641, B:83:0x0647, B:84:0x0689, B:86:0x0696, B:88:0x069f, B:89:0x06e2, B:112:0x0a8c, B:113:0x0a90, B:115:0x0a96, B:117:0x0aac, B:120:0x0ab9, B:124:0x0ac8, B:125:0x0ad0, B:132:0x0b35, B:138:0x0bb3, B:140:0x0bb9, B:141:0x0bba, B:143:0x0bbc, B:145:0x0bc3, B:146:0x0bc4, B:90:0x06ed, B:102:0x088d, B:104:0x0893, B:105:0x08da, B:107:0x09e0, B:108:0x0a2a, B:110:0x0a41, B:111:0x0a86, B:148:0x0bc6, B:150:0x0bcd, B:151:0x0bce, B:153:0x0bd0, B:155:0x0bd7, B:156:0x0bd8, B:97:0x0802, B:99:0x0816, B:100:0x0881, B:92:0x07b6, B:94:0x07c7, B:95:0x07fb, B:134:0x0b3a, B:128:0x0afd, B:130:0x0b03, B:131:0x0b2e), top: B:275:0x0641, outer: #4, inners: #1, #7, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06ed A[Catch: all -> 0x0bd9, TRY_LEAVE, TryCatch #11 {all -> 0x0bd9, blocks: (B:81:0x0641, B:83:0x0647, B:84:0x0689, B:86:0x0696, B:88:0x069f, B:89:0x06e2, B:112:0x0a8c, B:113:0x0a90, B:115:0x0a96, B:117:0x0aac, B:120:0x0ab9, B:124:0x0ac8, B:125:0x0ad0, B:132:0x0b35, B:138:0x0bb3, B:140:0x0bb9, B:141:0x0bba, B:143:0x0bbc, B:145:0x0bc3, B:146:0x0bc4, B:90:0x06ed, B:102:0x088d, B:104:0x0893, B:105:0x08da, B:107:0x09e0, B:108:0x0a2a, B:110:0x0a41, B:111:0x0a86, B:148:0x0bc6, B:150:0x0bcd, B:151:0x0bce, B:153:0x0bd0, B:155:0x0bd7, B:156:0x0bd8, B:97:0x0802, B:99:0x0816, B:100:0x0881, B:92:0x07b6, B:94:0x07c7, B:95:0x07fb, B:134:0x0b3a, B:128:0x0afd, B:130:0x0b03, B:131:0x0b2e), top: B:275:0x0641, outer: #4, inners: #1, #7, #8, #12 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 6480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsBillingAddressFormat.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 1;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }
}
