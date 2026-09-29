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
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
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

/* JADX INFO: loaded from: classes4.dex */
public abstract class alpha extends addObserverForBackInvoker implements SubjectStat {
    private static short[] AudioAttributesImplBaseParcelizer;
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$c = {34, 127, 65, -22};
    private static final int $$f = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {18, -64, -35, -97, -61, 27, TarConstants.LF_CONTIG, -5, -27, 32, -7, 28, -16, 17, -37, 40, 7, 0, -37, TarConstants.LF_NORMAL, 2, 7, 3, 3, -5, 13, 10, -36, 33, 14, 5, -11, 13, -5, 17, -41, TarConstants.LF_CONTIG, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -43, 30, 16, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -34, 27, 19, 7, -4, 7, -3, -19, 41, -5, -7, -27, TarConstants.LF_NORMAL, 1, 2, -38, TarConstants.LF_NORMAL, 3, 4, -5, 2, 21, -7, 17, -9, 15, 9, -40, 24, 17, -9, 10, 2, 17, -1, -5, 15, -11};
    private static final int $$h = 184;
    private static final byte[] $$a = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, 37, 22, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 198;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static long AudioAttributesCompatParcelizer = -8803772122385568955L;
    private static int MediaBrowserCompatItemReceiver = 1789452664;
    private static int AudioAttributesImplApi26Parcelizer = -819363146;
    private static int MediaBrowserCompatCustomActionResultReceiver = 317949884;
    private static byte[] AudioAttributesImplApi21Parcelizer = {-77, -42, -127, -55, -103, -104, 37, 87, -69, -71, 56, -66, 117, 87, 15, 37, -69, 39, 85, -80, 119, 111, 38, -69, 38, 10, 87, 118, 86, 37, 9, -69, 106, -71, 119, 38, 111, 33, 11, 38, -69, 104, -66, 39, -70, 10, -69, 39, -69, 39, 110, 33, 10, -120, -79, 12, -66, 99, 90, 96, 78, 125, 79, 10, -78, 111, 8, -79, 92, 99, 78, 13, 124, 64, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 64, -66, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 64, 125, -77, 11, 93, 101, 90, 11, -76, 8, -80, 9, 98, 12, 91, -76, 12, -79, 12, -66, 124, -66, 70, 99, -65, -80, 70, -76, 11, 110, -65, 91, 98, 78, -66, 122, -80, 79, 124, -78, 33, 19, 44, 44, 18, -108, -53, -122, 59, -12, -52, -31, 17, TarConstants.LF_FIFO, -102, 21, -102, 34, -18, -31, -101, 18, 63, -7, -52, -31, -51, -56, -120, 17, -99, 17, TarConstants.LF_BLK, -17, -53, -32, -17, -32, -122, 58, -32, -72, 65, TarConstants.LF_DIR, 110, 7, TarConstants.LF_DIR, 80, 89, 11, 69, -73, TarConstants.LF_DIR, 68, 73, 65, 39, -67, 59, 41, 23, 60, TarConstants.LF_LINK, 22, TarConstants.LF_LINK, 19, TarConstants.LF_NORMAL, 20, -67, 84, 93, -73, TarConstants.LF_GNUTYPE_SPARSE, 73, 93, -75, TarConstants.LF_GNUTYPE_SPARSE, -73, 80};
    private final Object IconCompatParcelizer = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, short r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = 121 - r7
            byte[] r0 = kotlin.alpha.$$c
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.alpha.$$i(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.alpha.$$a
            int r1 = r8 + 4
            int r6 = r6 + 65
            int r7 = 191 - r7
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-1)
            int r7 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.alpha.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.alpha.$$g
            int r6 = r6 + 73
            int r7 = 56 - r7
            int r8 = 143 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r6
            r6 = r7
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r8]
        L23:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-4)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.alpha.d(int, short, int, java.lang.Object[]):void");
    }

    alpha() {
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.alpha.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                alpha.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = MediaBrowserCompatSearchResultReceiver + 119;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 15;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplApi21Parcelizer().write();
            this.write = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = MediaDescriptionCompat + 115;
                MediaBrowserCompatSearchResultReceiver = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplApi21Parcelizer().write();
        this.write = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        Object obj = null;
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
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 38461), Color.blue(0) + 532, Color.alpha(0) + 8, -735610793, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (AudioAttributesCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 2);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-16740595) - Color.rgb(0, 0, 0)), 2340 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 28 - View.MeasureSpec.makeMeasureSpec(0, 0), 188119637, false, $$i(b3, b4, (byte) (b4 - 2)), new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 53;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 + 2);
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.alpha(0) + 36621), TextUtils.indexOf("", "", 0, 0) + 2340, View.resolveSize(0, 0) + 28, 188119637, false, $$i(b5, b6, (byte) (b6 - 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x022b A[PHI: r0
      0x022b: PHI (r0v9 int) = (r0v8 int), (r0v35 int) binds: [B:49:0x0229, B:46:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022d A[PHI: r0
      0x022d: PHI (r0v32 int) = (r0v8 int), (r0v35 int) binds: [B:49:0x0229, B:46:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r27, short r28, int r29, int r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.alpha.b(int, short, int, int, byte, java.lang.Object[]):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 48721, new char[]{14575, 34491, 17500, 1005, 49549, 36640, 20168, 3293, 51769, 35278, 22318, 5431, 54456, 37502, 20503, 8126, 56653, 40182}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 6, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 56), TextUtils.indexOf((CharSequence) "", '0') + 572914531, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1518246960, (byte) (103 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 64056, new char[]{14575, 49851, 52316, 55277, 53645, 56096, 59080, 57565, 59959, 62925, 65392, 63817, 33931, 36466, 34816, 37810, 40264, 39148, 41628, 44086, 47046, 45457, 47918, 18118, 16487, 18953}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(64319 - AndroidCharacter.getMirror('0'), new char[]{14573, 50164, 52962, 51665, 54487, 57259, 55968, 58790, 57478, 60281, 63092, 61762, 64601, 34604, 33320, 36102, 34833, 37663}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i2 = MediaBrowserCompatSearchResultReceiver + 51;
                MediaDescriptionCompat = i2 % 128;
                int i3 = i2 % 2;
            }
            if (baseContext != null) {
                if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i4 = MediaDescriptionCompat + 91;
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
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - ((Process.getThreadPriority(0) + 20) >> 6)), ((byte) KeyEvent.getModifierMetaStateMask()) + 6055, 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 3, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 114), 572914519 - ImageFormat.getBitsPerPixel(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1518246956, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 69), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 39528, new char[]{14526, 41574, 3579, 63263, 21141, 15448, 43003, 373, 60643, 22106, 12676, 39701, 1594, 57776, 19312, 13981, 36959, 31696, 58665, 16614, 10852, 38353, 32584, 56010, 17892, 12076, 35489, 29719, 57219, 47366, 9462, 36459, 27102, 54097, 48794, 6588, 33636, 28331, 51231, 45971, 7438, 63738, 25122, 52659, 46862, 4743, 64581, 26479, 49838, 44076, 6045, 61711, 23683, 50800, 41448, 2918, 63198, 20507, 15253, 42724, '/', 60404, 21783, 12428}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b((-1) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) (29 - Process.getGidForName("")), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 572914484, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1518247010, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 37), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 29379, new char[]{14566, 19005, 56692, 24747, 62433, 1367, 34827, 7120, 44754, 12304, 17185, 54895, 22947, 60647, 32259, 33106, 5264, 42973, 10499, 48229, 53110, 21173, 58854, 30474, 64071, 3477, 37083, 8722, 46393, 14449, 19442, 57072, 24603, 62280, 1682, 35295, 6913, 44604, 12657, 17598, 55268, 22836, 60422, 32640, 33493, 5144, 42851, 10854, 48558, 49392, 21119, 58690, 26764, 64474, 3345, 36924, 9074, 46830, 14830, 19297, 56837, 24960, 62666, 1554, 35104, 7293, 44979}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 38, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 30), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 572914474, 1518247078 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) (Gravity.getAbsoluteGravity(0, 0) + 125), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 3, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 141), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 572914471, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1518247084, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6031 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 24 - ((Process.getThreadPriority(0) + 20) >> 6), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char cIndexOf = (char) (13183 - TextUtils.indexOf("", "", 0));
            int iRed = 1649 - Color.red(0);
            int i6 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
            short s = (short) 187;
            Object[] objArr13 = new Object[1];
            c($$a[140], s, (byte) (s & 108), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, iRed, i6, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i7 = MediaDescriptionCompat + 109;
            MediaBrowserCompatSearchResultReceiver = i7 % 128;
            if (i7 % 2 == 0) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char mode = (char) (13183 - View.MeasureSpec.getMode(0));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1650;
                    int scrollDefaultDelay = 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b = $$a[5];
                    Object[] objArr14 = new Object[1];
                    c(b, (short) (b | 144), r0[8], objArr14);
                    objRemoteActionCompatParcelizer4 = startForeground.read(mode, iLastIndexOf, scrollDefaultDelay, -1033747278, false, (String) objArr14[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
                int i8 = 86 / 0;
            } else {
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 13183);
                    int iIndexOf = 1649 - TextUtils.indexOf("", "", 0, 0);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
                    byte b2 = $$a[5];
                    Object[] objArr15 = new Object[1];
                    c(b2, (short) (b2 | 144), r0[8], objArr15);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cResolveSizeAndState, iIndexOf, absoluteGravity, -1033747278, false, (String) objArr15[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
            }
        } else {
            Object[] objArr16 = new Object[1];
            a(52748 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{14564, 63204, 42222, 21198, 140, 16085, 60589, 39597, 18609, 1731, 13491, 57998, 36985, 20085, 31857, 10822}, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            b(((Process.getThreadPriority(0) + 20) >> 6) - 2, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 28), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 572914526, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1518247119, (byte) (51 - TextUtils.indexOf((CharSequence) "", '0')), objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, 1245109858};
                byte[] bArr = $$g;
                byte b3 = bArr[84];
                byte b4 = bArr[17];
                Object[] objArr19 = new Object[1];
                d(b3, b4, (short) (b4 | 139), objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                d(bArr[17], (byte) (-bArr[27]), (short) 84, objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
                    int iLastIndexOf2 = 1648 - TextUtils.lastIndexOf("", '0');
                    int i9 = 26 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte b5 = $$a[5];
                    Object[] objArr21 = new Object[1];
                    c(b5, (short) (b5 | 144), r10[8], objArr21);
                    objRemoteActionCompatParcelizer6 = startForeground.read(defaultSize, iLastIndexOf2, i9, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 8173, new char[]{14575, 6385, 30920, 22735, 47269, 39090, 63628, 55511, 14441, 6244, 30730, 22630, 47163, 38944, 63508, 55316, 14835, 6636, 31184, 22946, 47545, 39296}, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2486, new char[]{14571, 12603, 11101, 9589, 8089, 2518, 1020, 31795, 30243, 24654, 23192, 21673, 20171, 47334, 45365}, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13182);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1649;
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 27;
                        byte b6 = $$a[5];
                        Object[] objArr24 = new Object[1];
                        c(b6, (short) (b6 | 111), r5[8], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c, scrollBarSize, iLastIndexOf3, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 13183);
                        int keyRepeatDelay = 1649 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                        short s2 = (short) 187;
                        Object[] objArr25 = new Object[1];
                        c($$a[140], s2, (byte) (s2 & 108), objArr25);
                        objRemoteActionCompatParcelizer8 = startForeground.read(cAlpha, keyRepeatDelay, scrollDefaultDelay2, -133433128, false, (String) objArr25[0], null);
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
        int i10 = ((int[]) objArr[3])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6054, ImageFormat.getBitsPerPixel(0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i12 = MediaBrowserCompatSearchResultReceiver;
            int i13 = i12 + 85;
            MediaDescriptionCompat = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 + 91;
            MediaDescriptionCompat = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr26 = {-898094348, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) KeyEvent.normalizeMetaState(0), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), 24 - View.MeasureSpec.makeMeasureSpec(0, 0));
                byte[] bArr2 = $$g;
                Object[] objArr27 = new Object[1];
                d(bArr2[81], bArr2[11], (short) 65, objArr27);
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
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.write;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i3 = MediaDescriptionCompat + 1;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
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
        int i2 = MediaDescriptionCompat + 61;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi21Parcelizer().af_();
        int i4 = MediaBrowserCompatSearchResultReceiver + 13;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 107;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        if (this.read) {
            return;
        }
        int i2 = MediaDescriptionCompat + 105;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.read = true;
        int i4 = MediaBrowserCompatSearchResultReceiver + 109;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 5;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatSearchResultReceiver + 23;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 45;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 64042, new char[]{14575, 49851, 52316, 55277, 53645, 56096, 59080, 57565, 59959, 62925, 65392, 63817, 33931, 36466, 34816, 37810, 40264, 39148, 41628, 44086, 47046, 45457, 47918, 18118, 16487, 18953}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 64271, new char[]{14573, 50164, 52962, 51665, 54487, 57259, 55968, 58790, 57478, 60281, 63092, 61762, 64601, 34604, 33320, 36102, 34833, 37663}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i3 = MediaDescriptionCompat + 97;
                MediaBrowserCompatSearchResultReceiver = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatSearchResultReceiver + 53;
            MediaDescriptionCompat = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 4536), 6054 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.alpha(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 6030 - (ViewConfiguration.getEdgeSlop() >> 16), 23 - TextUtils.lastIndexOf("", '0'), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 4535), MotionEvent.axisFromString("") + 6055, Color.argb(0, 0, 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), MotionEvent.axisFromString("") + 6031, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        int i6 = MediaBrowserCompatSearchResultReceiver + 63;
        MediaDescriptionCompat = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(64091 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{14575, 49851, 52316, 55277, 53645, 56096, 59080, 57565, 59959, 62925, 65392, 63817, 33931, 36466, 34816, 37810, 40264, 39148, 41628, 44086, 47046, 45457, 47918, 18118, 16487, 18953}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) + 64234, new char[]{14573, 50164, 52962, 51665, 54487, 57259, 55968, 58790, 57478, 60281, 63092, 61762, 64601, 34604, 33320, 36102, 34833, 37663}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaDescriptionCompat + 47;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = MediaDescriptionCompat + 111;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), KeyEvent.keyCodeFromString("") + 6054, 41 - ImageFormat.getBitsPerPixel(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6030, 24 - Color.argb(0, 0, 0, 0), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i4 = 80 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), 6054 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.green(0), 6030 - View.MeasureSpec.getSize(0), View.MeasureSpec.getMode(0) + 24, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        String strValueOf;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        String strValueOf2;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 43;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 48731, new char[]{14575, 34491, 17500, 1005, 49549, 36640, 20168, 3293, 51769, 35278, 22318, 5431, 54456, 37502, 20503, 8126, 56653, 40182}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 3, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 25), 572914520 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) + 1518246912, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 67), objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (applicationContext != null) {
                int i4 = MediaBrowserCompatSearchResultReceiver + 9;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.getOffsetBefore("", 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6053, KeyEvent.getDeadChar(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 39, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 198), 572914520 - View.resolveSize(0, 0), 1518246966 - View.combineMeasuredStates(0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 72), objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a(39563 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{14526, 41574, 3579, 63263, 21141, 15448, 43003, 373, 60643, 22106, 12676, 39701, 1594, 57776, 19312, 13981, 36959, 31696, 58665, 16614, 10852, 38353, 32584, 56010, 17892, 12076, 35489, 29719, 57219, 47366, 9462, 36459, 27102, 54097, 48794, 6588, 33636, 28331, 51231, 45971, 7438, 63738, 25122, 52659, 46862, 4743, 64581, 26479, 49838, 44076, 6045, 61711, 23683, 50800, 41448, 2918, 63198, 20507, 15253, 42724, '/', 60404, 21783, 12428}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 12, (short) (30 - ExpandableListView.getPackedPositionType(0L)), 572914519 - View.resolveSizeAndState(0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1518247004, (byte) (38 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 29379, new char[]{14566, 19005, 56692, 24747, 62433, 1367, 34827, 7120, 44754, 12304, 17185, 54895, 22947, 60647, 32259, 33106, 5264, 42973, 10499, 48229, 53110, 21173, 58854, 30474, 64071, 3477, 37083, 8722, 46393, 14449, 19442, 57072, 24603, 62280, 1682, 35295, 6913, 44604, 12657, 17598, 55268, 22836, 60422, 32640, 33493, 5144, 42851, 10854, 48558, 49392, 21119, 58690, 26764, 64474, 3345, 36924, 9074, 46830, 14830, 19297, 56837, 24960, 62666, 1554, 35104, 7293, 44979}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 37, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 30), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 572914474, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 1518247042, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 121), objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 37, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 572914467, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 1518247047, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17), objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 6030 - TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            int i6 = MediaDescriptionCompat + 107;
            MediaBrowserCompatSearchResultReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th2) {
                Object[] objArr12 = new Object[1];
                b((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 3, (short) (106 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 572914477 - Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) + 1518247021, (byte) (ExpandableListView.getPackedPositionType(0L) - 12), objArr12);
                String str6 = (String) objArr12[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    PrintStream printStream = new PrintStream(byteArrayOutputStream);
                    th2.printStackTrace(printStream);
                    printStream.close();
                    strValueOf2 = byteArrayOutputStream.toString(CharsetNames.UTF_8);
                } catch (Throwable unused) {
                    strValueOf2 = String.valueOf(th2);
                }
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(strValueOf2);
                arrayList.add(str6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - (ViewConfiguration.getTapTimeout() >> 16)), 6055 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                try {
                    Object[] objArr13 = {-1715700529, 81604378625L, arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls2 = (Class) startForeground.IconCompatParcelizer((char) (KeyEvent.getMaxKeyCode() >> 16), 6030 - TextUtils.indexOf("", "", 0), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte[] bArr = $$g;
                    Object[] objArr14 = new Object[1];
                    d(bArr[81], bArr[11], (short) 65, objArr14);
                    cls2.getMethod((String) objArr14[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr13);
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            }
        }
        try {
            Object[] objArr15 = {-1715700529};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), 1991 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 12, -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr16 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr15)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char scrollBarSize = (char) (19323 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int windowTouchSlop = 2759 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 99;
                    Object[] objArr17 = new Object[1];
                    c((byte) ($$a[45] + 1), (short) 78, (byte) 24, objArr17);
                    objRemoteActionCompatParcelizer5 = startForeground.read(scrollBarSize, windowTouchSlop, minimumFlingVelocity, 1799372695, false, (String) objArr17[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 9580), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3445, 144 - (ViewConfiguration.getLongPressTimeout() >> 16))});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr16);
                try {
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-18205161);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 61148);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2146;
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12;
                        byte[] bArr2 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) (-bArr2[9]), (short) (-bArr2[22]), bArr2[5], objArr18);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cCombineMeasuredStates, iLastIndexOf, maximumFlingVelocity, -2136739198, false, (String) objArr18[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer6).getLong(null) != -1) {
                        int i8 = MediaDescriptionCompat + 25;
                        MediaBrowserCompatSearchResultReceiver = i8 % 128;
                        if (i8 % 2 == 0) {
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char size = (char) (61148 - View.MeasureSpec.getSize(0));
                                int iIndexOf = 2145 - TextUtils.indexOf("", "", 0, 0);
                                int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 12;
                                byte[] bArr3 = $$a;
                                Object[] objArr19 = new Object[1];
                                c(bArr3[140], bArr3[21], bArr3[164], objArr19);
                                objRemoteActionCompatParcelizer7 = startForeground.read(size, iIndexOf, windowTouchSlop2, -1530294468, false, (String) objArr19[0], null);
                            }
                            throw null;
                        }
                        Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer8 == null) {
                            char tapTimeout = (char) (61148 - (ViewConfiguration.getTapTimeout() >> 16));
                            int maximumFlingVelocity2 = 2145 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int absoluteGravity = 12 - Gravity.getAbsoluteGravity(0, 0);
                            byte[] bArr4 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr4[140], bArr4[21], bArr4[164], objArr20);
                            objRemoteActionCompatParcelizer8 = startForeground.read(tapTimeout, maximumFlingVelocity2, absoluteGravity, -1530294468, false, (String) objArr20[0], null);
                        }
                        list = (List) ((Field) objRemoteActionCompatParcelizer8).get(null);
                    } else {
                        Object[] objArr21 = new Object[1];
                        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 52712, new char[]{14564, 63204, 42222, 21198, 140, 16085, 60589, 39597, 18609, 1731, 13491, 57998, 36985, 20085, 31857, 10822}, objArr21);
                        Class<?> cls3 = Class.forName((String) objArr21[0]);
                        Object[] objArr22 = new Object[1];
                        b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 3, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 59), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 572914522, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1518247119, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17), objArr22);
                        int iIntValue2 = ((Integer) cls3.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr23 = {-1715700529};
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-173351824);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                objRemoteActionCompatParcelizer9 = startForeground.read((char) (TextUtils.getOffsetBefore("", 0) + 45845), 913 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 10, -1948051227, false, null, new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr24 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer9).newInstance(objArr23)};
                                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(1891595430);
                                if (objRemoteActionCompatParcelizer10 == null) {
                                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 61147);
                                    int offsetAfter = 2145 - TextUtils.getOffsetAfter("", 0);
                                    int size2 = 12 - View.MeasureSpec.getSize(0);
                                    Object[] objArr25 = new Object[1];
                                    c(r9[37], (short) ($$a[78] - 1), r9[45], objArr25);
                                    objRemoteActionCompatParcelizer10 = startForeground.read(c, offsetAfter, size2, 251047987, false, (String) objArr25[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), View.resolveSize(0, 0) + 557, 18 - (ViewConfiguration.getScrollBarSize() >> 8))});
                                }
                                list = (List) ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr24);
                                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-629126231);
                                if (objRemoteActionCompatParcelizer11 == null) {
                                    char cCombineMeasuredStates2 = (char) (61148 - View.combineMeasuredStates(0, 0));
                                    int keyRepeatTimeout = 2145 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int mirror = AndroidCharacter.getMirror('0') - '$';
                                    byte[] bArr5 = $$a;
                                    Object[] objArr26 = new Object[1];
                                    c(bArr5[140], bArr5[21], bArr5[164], objArr26);
                                    objRemoteActionCompatParcelizer11 = startForeground.read(cCombineMeasuredStates2, keyRepeatTimeout, mirror, -1530294468, false, (String) objArr26[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer11).set(null, list);
                                Object[] objArr27 = new Object[1];
                                a(8209 - KeyEvent.getDeadChar(0, 0), new char[]{14575, 6385, 30920, 22735, 47269, 39090, 63628, 55511, 14441, 6244, 30730, 22630, 47163, 38944, 63508, 55316, 14835, 6636, 31184, 22946, 47545, 39296}, objArr27);
                                Class<?> cls4 = Class.forName((String) objArr27[0]);
                                Object[] objArr28 = new Object[1];
                                a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 2520, new char[]{14571, 12603, 11101, 9589, 8089, 2518, 1020, 31795, 30243, 24654, 23192, 21673, 20171, 47334, 45365}, objArr28);
                                long jLongValue = ((Long) cls4.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue);
                                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(301834150);
                                if (objRemoteActionCompatParcelizer12 == null) {
                                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 61148);
                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2146;
                                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12;
                                    Object[] objArr29 = new Object[1];
                                    c((byte) ($$a[45] + 1), (short) 78, (byte) 24, objArr29);
                                    objRemoteActionCompatParcelizer12 = startForeground.read(capsMode, bitsPerPixel, fadingEdgeLength, 1874090803, false, (String) objArr29[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer12).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-18205161);
                                if (objRemoteActionCompatParcelizer13 == null) {
                                    char cRed = (char) (Color.red(0) + 61148);
                                    int i9 = 2145 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                    int i10 = 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    byte[] bArr6 = $$a;
                                    Object[] objArr30 = new Object[1];
                                    c((byte) (-bArr6[9]), (short) (-bArr6[22]), bArr6[5], objArr30);
                                    objRemoteActionCompatParcelizer13 = startForeground.read(cRed, i9, i10, -2136739198, false, (String) objArr30[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer13).set(null, lValueOf2);
                            } catch (Throwable th4) {
                                Throwable cause3 = th4.getCause();
                                if (cause3 == null) {
                                    throw th4;
                                }
                                throw cause3;
                            }
                        } catch (Throwable th5) {
                            Throwable cause4 = th5.getCause();
                            if (cause4 == null) {
                                throw th5;
                            }
                            throw cause4;
                        }
                    }
                    for (Object[] objArr31 : list) {
                        int i11 = ((int[]) objArr31[3])[0];
                        int i12 = ((int[]) objArr31[1])[0];
                        if (i12 != i11) {
                            ArrayList arrayList2 = new ArrayList();
                            String[] strArr = (String[]) objArr31[2];
                            if (strArr != null) {
                                int i13 = 0;
                                while (i13 < strArr.length) {
                                    int i14 = MediaBrowserCompatSearchResultReceiver + 25;
                                    MediaDescriptionCompat = i14 % 128;
                                    int i15 = i14 % 2;
                                    arrayList2.add(strArr[i13]);
                                    i13++;
                                    int i16 = MediaBrowserCompatSearchResultReceiver + 45;
                                    MediaDescriptionCompat = i16 % 128;
                                    int i17 = i16 % 2;
                                }
                            }
                            long j = -1;
                            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                            long j3 = 0;
                            long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                            try {
                                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                                if (objRemoteActionCompatParcelizer14 == null) {
                                    objRemoteActionCompatParcelizer14 = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), 6054 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                                }
                                Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer14).invoke(null, null);
                                try {
                                    Object[] objArr32 = {-1715700529, Long.valueOf(j4), arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
                                    Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTapTimeout() >> 16), 6030 - TextUtils.indexOf("", "", 0, 0), 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                    byte[] bArr7 = $$g;
                                    Object[] objArr33 = new Object[1];
                                    d(bArr7[81], bArr7[11], (short) 65, objArr33);
                                    cls5.getMethod((String) objArr33[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr32);
                                    int i18 = MediaBrowserCompatSearchResultReceiver + 125;
                                    MediaDescriptionCompat = i18 % 128;
                                    int i19 = i18 % 2;
                                } catch (Throwable th6) {
                                    Throwable cause5 = th6.getCause();
                                    if (cause5 == null) {
                                        throw th6;
                                    }
                                    throw cause5;
                                }
                            } catch (Throwable th7) {
                                Throwable cause6 = th7.getCause();
                                if (cause6 == null) {
                                    throw th7;
                                }
                                throw cause6;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    Object[] objArr34 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 6, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 230), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 572914472, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1518247143, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 119), objArr34);
                    String str7 = (String) objArr34[0];
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                        th8.printStackTrace(printStream2);
                        printStream2.close();
                        strValueOf = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                    } catch (Throwable unused2) {
                        strValueOf = String.valueOf(th8);
                    }
                    ArrayList arrayList3 = new ArrayList(2);
                    arrayList3.add(strValueOf);
                    arrayList3.add(str7);
                    Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer15 == null) {
                        objRemoteActionCompatParcelizer15 = startForeground.read((char) (4535 - View.MeasureSpec.getSize(0)), TextUtils.getOffsetAfter("", 0) + 6054, 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer15).invoke(null, null);
                    Object[] objArr35 = {-1715700529, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionChild(0L) + 6031, TextUtils.getCapsMode("", 0, 0) + 24);
                    byte[] bArr8 = $$g;
                    Object[] objArr36 = new Object[1];
                    d(bArr8[81], bArr8[11], (short) 65, objArr36);
                    cls6.getMethod((String) objArr36[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr35);
                }
                Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer16 == null) {
                    char cMyPid = (char) (13183 - (Process.myPid() >> 22));
                    int iMyPid = (Process.myPid() >> 22) + 1649;
                    int i20 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    short s = (short) 187;
                    Object[] objArr37 = new Object[1];
                    c($$a[140], s, (byte) (s & 108), objArr37);
                    objRemoteActionCompatParcelizer16 = startForeground.read(cMyPid, iMyPid, i20, -133433128, false, (String) objArr37[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer16).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer17 == null) {
                        char trimmedLength = (char) (13183 - TextUtils.getTrimmedLength(""));
                        int i21 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int packedPositionGroup = 26 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b = $$a[5];
                        Object[] objArr38 = new Object[1];
                        c(b, (short) (b | 144), r4[8], objArr38);
                        objRemoteActionCompatParcelizer17 = startForeground.read(trimmedLength, i21, packedPositionGroup, -1033747278, false, (String) objArr38[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer17).get(null);
                } else {
                    Object[] objArr39 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 52737, new char[]{14564, 63204, 42222, 21198, 140, 16085, 60589, 39597, 18609, 1731, 13491, 57998, 36985, 20085, 31857, 10822}, objArr39);
                    Class<?> cls7 = Class.forName((String) objArr39[0]);
                    Object[] objArr40 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 37, (short) (62 - TextUtils.lastIndexOf("", '0', 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 572914526, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 1518247084, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 15), objArr40);
                    try {
                        Object[] objArr41 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr40[0], Object.class).invoke(null, this)).intValue()), 0, 1492271476};
                        byte b2 = $$g[84];
                        Object[] objArr42 = new Object[1];
                        d(b2, r1[13], b2, objArr42);
                        Class<?> cls8 = Class.forName((String) objArr42[0]);
                        byte b3 = (byte) ($$h >>> 2);
                        Object[] objArr43 = new Object[1];
                        d(b3, (byte) (b3 + 5), r1[17], objArr43);
                        objArr = (Object[]) cls8.getMethod((String) objArr43[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
                        Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer18 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13184);
                            int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 1649;
                            int windowTouchSlop3 = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b4 = $$a[5];
                            Object[] objArr44 = new Object[1];
                            c(b4, (short) (b4 | 144), r6[8], objArr44);
                            objRemoteActionCompatParcelizer18 = startForeground.read(cLastIndexOf, scrollBarSize2, windowTouchSlop3, -1033747278, false, (String) objArr44[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer18).set(null, objArr);
                        try {
                            Object[] objArr45 = new Object[1];
                            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 8173, new char[]{14575, 6385, 30920, 22735, 47269, 39090, 63628, 55511, 14441, 6244, 30730, 22630, 47163, 38944, 63508, 55316, 14835, 6636, 31184, 22946, 47545, 39296}, objArr45);
                            Class<?> cls9 = Class.forName((String) objArr45[0]);
                            Object[] objArr46 = new Object[1];
                            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 2517, new char[]{14571, 12603, 11101, 9589, 8089, 2518, 1020, 31795, 30243, 24654, 23192, 21673, 20171, 47334, 45365}, objArr46);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr46[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 13183);
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
                                int i22 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                                byte b5 = $$a[5];
                                Object[] objArr47 = new Object[1];
                                c(b5, (short) (b5 | 111), r9[8], objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(cIndexOf, touchSlop, i22, 54351865, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer20 == null) {
                                char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13182);
                                int i23 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1649;
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 26;
                                short s2 = (short) 187;
                                Object[] objArr48 = new Object[1];
                                c($$a[140], s2, (byte) (s2 & 108), objArr48);
                                objRemoteActionCompatParcelizer20 = startForeground.read(c2, i23, edgeSlop, -133433128, false, (String) objArr48[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf4);
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
                int i24 = ((int[]) objArr[3])[0];
                int i25 = ((int[]) objArr[2])[0];
                if (i25 != i24) {
                    long j5 = -1;
                    long j6 = 0;
                    long j7 = (((long) (i25 ^ i24)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)))) | (((long) 2) << 32) | (j6 - ((j6 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer21 == null) {
                        objRemoteActionCompatParcelizer21 = startForeground.read((char) (MotionEvent.axisFromString("") + 4536), AndroidCharacter.getMirror('0') + 6006, 43 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer21).invoke(null, null);
                    Object[] objArr49 = {-1715700529, Long.valueOf(j7), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6029, ExpandableListView.getPackedPositionChild(0L) + 25);
                    byte[] bArr9 = $$g;
                    Object[] objArr50 = new Object[1];
                    d(bArr9[81], bArr9[11], (short) 65, objArr50);
                    cls10.getMethod((String) objArr50[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr49);
                }
                Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer22 == null) {
                    int touchSlop2 = 943 - (ViewConfiguration.getTouchSlop() >> 8);
                    int iResolveSize = View.resolveSize(0, 0) + 36;
                    byte[] bArr10 = $$a;
                    Object[] objArr51 = new Object[1];
                    c((byte) (-bArr10[9]), (short) (-bArr10[22]), bArr10[5], objArr51);
                    objRemoteActionCompatParcelizer22 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), touchSlop2, iResolveSize, -167186806, false, (String) objArr51[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer22).getLong(null) != -1) {
                    int i26 = MediaBrowserCompatSearchResultReceiver + 125;
                    MediaDescriptionCompat = i26 % 128;
                    if (i26 % 2 != 0) {
                        Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer23 == null) {
                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int i27 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 942;
                            int iBlue = Color.blue(0) + 36;
                            byte[] bArr11 = $$a;
                            Object[] objArr52 = new Object[1];
                            c(bArr11[140], bArr11[21], bArr11[164], objArr52);
                            objRemoteActionCompatParcelizer23 = startForeground.read(packedPositionChild, i27, iBlue, -1398865628, false, (String) objArr52[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
                        int i28 = 92 / 0;
                    } else {
                        Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer24 == null) {
                            char windowTouchSlop4 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int windowTouchSlop5 = 943 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int trimmedLength2 = 36 - TextUtils.getTrimmedLength("");
                            byte[] bArr12 = $$a;
                            Object[] objArr53 = new Object[1];
                            c(bArr12[140], bArr12[21], bArr12[164], objArr53);
                            objRemoteActionCompatParcelizer24 = startForeground.read(windowTouchSlop4, windowTouchSlop5, trimmedLength2, -1398865628, false, (String) objArr53[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer24).get(null);
                    }
                } else {
                    Object[] objArr54 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 52712, new char[]{14564, 63204, 42222, 21198, 140, 16085, 60589, 39597, 18609, 1731, 13491, 57998, 36985, 20085, 31857, 10822}, objArr54);
                    Class<?> cls11 = Class.forName((String) objArr54[0]);
                    Object[] objArr55 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 113, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 62), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 572914490, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1518247085, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 16), objArr55);
                    Object[] objArr56 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr55[0], Object.class).invoke(null, this)).intValue()), 0, -555733512};
                    Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer25 == null) {
                        char cMyPid2 = (char) (Process.myPid() >> 22);
                        int iArgb = Color.argb(0, 0, 0, 0) + 943;
                        int i29 = 37 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte b6 = $$a[5];
                        Object[] objArr57 = new Object[1];
                        c(b6, b6, r5[33], objArr57);
                        objRemoteActionCompatParcelizer25 = startForeground.read(cMyPid2, iArgb, i29, -2131402098, false, (String) objArr57[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer25).invoke(null, objArr56);
                    Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer26 == null) {
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 943;
                        int iBlue2 = 36 - Color.blue(0);
                        byte[] bArr13 = $$a;
                        Object[] objArr58 = new Object[1];
                        c(bArr13[140], bArr13[21], bArr13[164], objArr58);
                        objRemoteActionCompatParcelizer26 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), longPressTimeout, iBlue2, -1398865628, false, (String) objArr58[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer26).set(null, objArr2);
                    try {
                        Object[] objArr59 = new Object[1];
                        a(View.resolveSizeAndState(0, 0, 0) + 8209, new char[]{14575, 6385, 30920, 22735, 47269, 39090, 63628, 55511, 14441, 6244, 30730, 22630, 47163, 38944, 63508, 55316, 14835, 6636, 31184, 22946, 47545, 39296}, objArr59);
                        Class<?> cls12 = Class.forName((String) objArr59[0]);
                        Object[] objArr60 = new Object[1];
                        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2486, new char[]{14571, 12603, 11101, 9589, 8089, 2518, 1020, 31795, 30243, 24654, 23192, 21673, 20171, 47334, 45365}, objArr60);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr60[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer27 == null) {
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int iAxisFromString = 942 - MotionEvent.axisFromString("");
                            int threadPriority = 36 - ((Process.getThreadPriority(0) + 20) >> 6);
                            Object[] objArr61 = new Object[1];
                            c((byte) ($$a[45] + 1), (short) 78, (byte) 24, objArr61);
                            objRemoteActionCompatParcelizer27 = startForeground.read(mode, iAxisFromString, threadPriority, -629981381, false, (String) objArr61[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer28 == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int offsetAfter2 = 943 - TextUtils.getOffsetAfter("", 0);
                            int offsetAfter3 = 36 - TextUtils.getOffsetAfter("", 0);
                            byte[] bArr14 = $$a;
                            Object[] objArr62 = new Object[1];
                            c((byte) (-bArr14[9]), (short) (-bArr14[22]), bArr14[5], objArr62);
                            objRemoteActionCompatParcelizer28 = startForeground.read(cMyTid, offsetAfter2, offsetAfter3, -167186806, false, (String) objArr62[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer28).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i30 = ((int[]) objArr2[2])[0];
                int i31 = ((int[]) objArr2[0])[0];
                if (i31 != i30) {
                    long j8 = -1;
                    long j9 = 0;
                    long j10 = (((long) (i31 ^ i30)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer29 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer29 == null) {
                        objRemoteActionCompatParcelizer29 = startForeground.read((char) (Color.red(0) + 4535), 6054 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer29).invoke(null, null);
                    Object[] objArr63 = {-1715700529, Long.valueOf(j10), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) Color.blue(0), TextUtils.lastIndexOf("", '0', 0) + 6031, 24 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    byte[] bArr15 = $$g;
                    Object[] objArr64 = new Object[1];
                    d(bArr15[81], bArr15[11], (short) 65, objArr64);
                    cls13.getMethod((String) objArr64[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr63);
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 105;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 83;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
