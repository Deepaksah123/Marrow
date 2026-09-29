package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
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
public abstract class getAuthenticationExtensions extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat RemoteActionCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {104, 100, TarConstants.LF_GNUTYPE_SPARSE, -75};
    private static final int $$f = 214;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {111, -63, 80, 27, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 58, -1, 16, -31, 21, 14, -7, -10, 13, -12, 9, 4, -22, 30, -5, -71, 47, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 37;
    private static final byte[] $$a = {66, 100, 74, -7, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 98;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static long IconCompatParcelizer = 8763953179145495158L;
    private static char[] AudioAttributesImplApi21Parcelizer = {56431, 58110, 41328, 26603, 9845, 58561, 43858, 27132, 10308, 61123, 44326, 29608, 12859, 61622, 46874, 30092, 13331, 64149, 56431, 58046, 41266, 26623, 9843, 58571, 43847, 27103, 10240, 61061, 44409, 29688, 12861, 61617, 46858, 30160, 13388, 64158, 47377, 30777, 16051, 64890, 33776, 16916, 156, 51013, 34190, 17488, 2811, 51574, 36844, 20069, 3209, 54105, 37332, 20508, 5778, 54764, 37988, 23210, 6512, 57248, 40467, 23700, 25344, 8590, 57384, 42656, 65068, 49400, 33649, 17849, 1079, 50910, 35073, 19355, 2577, 52372, 36670, 20915, 4216, 54006, 38170, 22467, 5645, 55438, 39683, 23072, 7334, 57143, 41394, 24580, 8918, 58626, 42907, 26129, 10465, 60256, 44540, 27765, 11980, 61775, 45968, 29274, 13446, 63405, 46629, 30909, 15164, 64948, 48216, 32469, 16716, 961, 49775, 33969, 18300, 2546, 51319, 35529, 19777, 4054, 52818, 37160, 21420, 4725, 54511, 38754, 22925, 6226, 55965, 40210, 9733, 6353, 23304, 40342, 56394, 7926, 20782, 37870, 53819, 5308, 22292, 35227, 51211, 2781, 19809, 36842, 52783, 241, 17275, 33363, 50393, 1861, 31182, 47220, 64246, 15661, 32693, 48739, 61584, 13082, 30084, 46086, 63155, 10593, 27582, 43639, 60666, 12161, 28254, 41104, 58190, 9674, 25636, 42746, 39216, 56302, 6677, 23759, 40706, 53716, 4191, 21219, 38202, 55202, 5678, 18693, 35806, 51722, 3268, 20248, 33269, 49275, 739, 17766, 41245, 40845, 56347, 6789, 23318, 39349, 56382, 58042, 41312, 26542, 9766, 58525, 43799, 27020, 10265, 61067, 44332, 29689, 12862, 61690, 46938, 30163, 13384, 64204, 47455, 30768, 16098, 64813, 33702, 16896, 194, 50964, 34267, 17411, 2815, 51490, 36797, 20019, 3293, 54026, 37332, 20559, 56421, 58095, 41319, 26615, 9828, 58566, 43858, 27076, 10364, 61138, 44345, 29609, 12827, 61624, 46858, 30080};
    private static long MediaBrowserCompatCustomActionResultReceiver = -3949314401442405749L;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r7, short r8, byte r9) {
        /*
            int r7 = r7 * 2
            int r7 = 121 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = kotlin.getAuthenticationExtensions.$$c
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticationExtensions.$$i(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getAuthenticationExtensions.$$a
            int r8 = 114 - r8
            int r7 = r7 + 4
            int r1 = 44 - r6
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-1)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticationExtensions.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 96 - r6
            byte[] r0 = kotlin.getAuthenticationExtensions.$$g
            int r8 = 111 - r8
            int r1 = 47 - r7
            byte[] r1 = new byte[r1]
            int r7 = 46 - r7
            r2 = -1
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticationExtensions.d(int, byte, int, java.lang.Object[]):void");
    }

    getAuthenticationExtensions() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getAuthenticationExtensions.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getAuthenticationExtensions.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 125;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 11;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
            this.RemoteActionCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                int i3 = AudioAttributesImplBaseParcelizer + 3;
                AudioAttributesImplApi26Parcelizer = i3 % 128;
                if (i3 % 2 == 0) {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                    throw null;
                }
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i4 = AudioAttributesImplBaseParcelizer + 125;
                AudioAttributesImplApi26Parcelizer = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = AudioAttributesImplBaseParcelizer + 93;
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatItemReceiver().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        obj.hashCode();
        throw null;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i3 = $10 + 101;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = $11 + 53;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getOffsetAfter("", 0) + 38461), KeyEvent.getDeadChar(0, 0) + 532, 8 - (ViewConfiguration.getTouchSlop() >> 8), -735610793, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (IconCompatParcelizer + 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2340, 28 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 188119637, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (38461 - View.MeasureSpec.getSize(0)), 532 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSize(0, 0) + 8, -735610793, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (IconCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) 1;
                    byte b8 = (byte) (b7 - 1);
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.resolveSizeAndState(0, 0, 0) + 36621), TextUtils.lastIndexOf("", '0', 0) + 2341, KeyEvent.getDeadChar(0, 0) + 28, 188119637, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i8 = $10 + 45;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer5 == null) {
                byte b9 = (byte) 1;
                byte b10 = (byte) (b9 - 1);
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (Color.blue(0) + 36621), 2340 - View.getDefaultSize(0, 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 188119637, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer[i2 + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 36622), Color.argb(0, 0, 0, 0) + 2340, 28 - TextUtils.getOffsetAfter("", 0), 480654850, false, $$i((byte) 10, b, b), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9701, (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 23784, KeyEvent.normalizeMetaState(0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        int i5 = $11 + 63;
        $10 = i5 % 128;
        while (true) {
            int i6 = i5 % 2;
            if (downloadService.write >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) View.MeasureSpec.getMode(0), 23784 - TextUtils.indexOf("", "", 0), 33 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i5 = $10 + 91;
            $11 = i5 % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0070  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instruction units count: 2247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticationExtensions.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 73;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i3 = AudioAttributesImplBaseParcelizer + 87;
            AudioAttributesImplApi26Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onDestroy();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 101;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            return ishighlightedMediaBrowserCompatItemReceiver.af_();
        }
        ishighlightedMediaBrowserCompatItemReceiver.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplApi26Parcelizer + 89;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.write == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.write == null) {
                    this.write = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 31;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (this.read) {
            return;
        }
        this.read = true;
        int i4 = AudioAttributesImplApi26Parcelizer + 69;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 89;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplBaseParcelizer + 91;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 75;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = AudioAttributesImplBaseParcelizer + 13;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 9931, new char[]{61916, 55046, 48243, 34224, 27270, 13309, 6439, 65088, 51060, 44208, 30111, 23220, 8192, 2319, 61039, 47023, 40091, 26097, 19251, 4107, 63821, 57004, 42881, 36091, 21028, 15124}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 93, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi26Parcelizer + 123;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6054, 41 - ImageFormat.getBitsPerPixel(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(0), 6030 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 25, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 105;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = AudioAttributesImplBaseParcelizer + 83;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 9937, new char[]{61916, 55046, 48243, 34224, 27270, 13309, 6439, 65088, 51060, 44208, 30111, 23220, 8192, 2319, 61039, 47023, 40091, 26097, 19251, 4107, 63821, 57004, 42881, 36091, 21028, 15124}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 36), KeyEvent.getDeadChar(0, 0), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi26Parcelizer + 101;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (AndroidCharacter.getMirror('0') + 4487), 6054 - View.combineMeasuredStates(0, 0), 42 - (ViewConfiguration.getEdgeSlop() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myPid() >> 22), 6030 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:127:0x08a8 A[Catch: all -> 0x035c, TryCatch #13 {all -> 0x035c, blocks: (B:125:0x08a2, B:127:0x08a8, B:128:0x08d2, B:202:0x0efe, B:204:0x0f04, B:205:0x0f2e, B:241:0x130d, B:243:0x1313, B:244:0x1336, B:222:0x111d, B:224:0x113f, B:225:0x118b, B:169:0x0ac1, B:171:0x0ac7, B:172:0x0af0, B:19:0x00ef, B:21:0x00f5, B:22:0x011f, B:24:0x02c9, B:26:0x02fa, B:27:0x0356), top: B:290:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b7  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 5433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticationExtensions.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 25;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 23;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
