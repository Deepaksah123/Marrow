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
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.ui.activities.base.BaseActivity;
import com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkProcessorActivity;
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
public abstract class getCombineUpright extends BaseActivity implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat read;
    private static final byte[] $$l = {TarConstants.LF_SYMLINK, -57, 8, -14};
    private static final int $$o = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {42, 85, 82, -118, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 64, -32, -25, 0, -6, 7, 29, -45, 10, -2, 1, 12, -20, 4, -2, -11, 28, -20, -10, 9, -2, -14, 12, -14, 46, -45, 10, -2, 1, 21, -21, -24, 33, -12, -12, -10, 15, -15, 12, 3, -4};
    private static final int $$k = 218;
    private static final byte[] $$d = {91, -41, -108, -7, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 141;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;
    private static char[] IconCompatParcelizer = {6468, 6835, 6833, 6505, 6490, 6407, 6428, 6842, 6475, 6472, 6832, 6481, 6418, 6836, 6429, 6478, 6496, 6476, 6406, 6520, 6427, 6838, 6839, 6524, 6489, 6430, 6424, 6470, 6491, 6474, 6473, 6465, 6834, 6425, 6507, 6492, 6494, 6426, 6493, 6416, 6431, 6471, 6469, 6479, 6417, 6477, 6488, 6464, 6837};
    private static char MediaBrowserCompatCustomActionResultReceiver = 11445;
    private static long MediaMetadataCompat = -1463101691750316144L;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$p(short r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = kotlin.getCombineUpright.$$l
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r6 = r6 * 2
            int r6 = 121 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2f
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2f:
            int r7 = r7 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCombineUpright.$$p(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.getCombineUpright.$$d
            int r7 = r7 + 65
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r7 = r8
            r4 = r2
            goto L25
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r6 = r6 + 1
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
        L25:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCombineUpright.i(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = kotlin.getCombineUpright.$$j
            int r8 = r8 + 73
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2d
        L12:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCombineUpright.j(short, short, byte, java.lang.Object[]):void");
    }

    public getCombineUpright() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getCombineUpright.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getCombineUpright.this.onCommand();
            }
        });
        int i2 = MediaDescriptionCompat + 91;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 57;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatMediaItem().write();
            this.read = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                int i3 = MediaBrowserCompatSearchResultReceiver + 21;
                MediaDescriptionCompat = i3 % 128;
                int i4 = i3 % 2;
                this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatMediaItem().write();
        this.read = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r24, char[] r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCombineUpright.h(int, char[], java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r32, char[] r33, byte r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCombineUpright.g(int, char[], byte, java.lang.Object[]):void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 65;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 96, new char[]{'\"', 23, 18, 3, '&', '\"', 18, 19, '#', '\"', 19, 20, 6, '\'', '\n', '+', 13814, 13814}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 98), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        h((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 61282, new char[]{37942, 31553, 19144, 23067, 10675}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(26 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{'\"', 23, 18, 3, '&', '\"', 18, 19, ' ', ',', 4, 25, 1, '\n', '&', 28, '&', 29, '\'', 7, 26, ',', 3, '.', 31, 16}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 18), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(18 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{'\n', '$', 13867, 13867, '0', 24, '&', 0, 13869, 13869, 3, 28, '\t', 29, '&', 28, '0', '\"'}, (byte) (66 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4535), 6054 - (ViewConfiguration.getTapTimeout() >> 16), View.MeasureSpec.getMode(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 13039, new char[]{37944, 42653, 61837, 3300, 24564, 27264, 42376, 61596, 1015, 24294, 26902, 42003, 63322, 618, 23925, 26707, 47963, 63005, 302, 23650, 28308, 47569, 62687, 1975, 21163, 28038, 47297, 52123, 1788, 20973, 27667, 48902, 51806, 1338, 20523, 25351, 48661, 51495, 1067, 22377, 25031, 48259, 53180, 6847, 21927, 24789, 45975, 52899}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(65 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{22, '\f', '\f', 22, '%', '!', '\'', 26, 19, '#', 15, 31, '!', '(', 18, 24, 31, ',', '%', 2, ' ', '.', 2, '0', 30, '\"', '(', '!', '/', '%', '(', 23, 27, 5, '\"', 15, 16, '$', 19, 27, '(', ')', 31, 15, 18, 16, 31, 19, 23, '/', 19, 21, 30, '/', 0, 20, '$', 18, '+', '\n', 17, '*', 19, ')'}, (byte) (18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, new char[]{30, '\"', 31, 16, 30, '(', 11, '$', 13931, 13931, 19, 28, '%', ' ', 13931, 13931, '%', ' ', 30, '\"', '(', 30, 16, ')', '-', '.', 16, '-', 18, 27, ' ', '(', 2, '\"', '&', '/', 31, ',', 14, 16, 30, '(', '/', 24, '\t', '$', 23, '!', 15, 18, 16, 29, ' ', 26, 15, '\r', '\"', 30, 15, 28, 26, '\'', ' ', '.'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 99), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 18, new char[]{'*', '(', '\'', '*', '!', 7, 13825, 13825, 16, 31, 28, 3, 18, 11, '#', '\'', 24, 20, ' ', 14, '(', '*', 3, '.', 28, '%', '\t', 29, '#', '*', 15, '.', '%', 31, 3, 18, 31, 21, '%', 31, 3, '.', 15, 11, '#', '0', 2, '!', '-', ' ', 3, '!', 22, '0', '*', 31, '(', 0, '%', '&', 3, '/', '&', '+', 21, ')', 13877}, (byte) (76 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 62209, new char[]{37986, 26374, 29324, 20022, 22969, 21846}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 59110, new char[]{37993, 29497, 23199, 8597, 2337, 4342, 65432, 50991, 44782, 46472, 40195, 25842, 17369, 11073, 13029, 6576, 57695, 51439, 55200, 48971, 34373, 28070, 30025, 23555, 15349, 887, 59988, 61864, 55672, 41049, 36738, 38704, 32266, 17801, 11627, 13364}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), 6030 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 25, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
            int packedPositionGroup = 26 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr13 = new Object[1];
            i(r7[17], (byte) (-$$d[113]), (byte) 40, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(absoluteGravity, touchSlop, packedPositionGroup, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char longPressTimeout = (char) (13183 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int size = View.MeasureSpec.getSize(0) + 1649;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                i((short) (-bArr[65]), bArr[5], (byte) (-bArr[8]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(longPressTimeout, size, minimumFlingVelocity, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            h(TextUtils.getCapsMode("", 0, 0) + 22613, new char[]{37937, 52335, 9351, 40133, 62753, 11678, 34244, 65126, 22164, 36488, 59226, 24453, 47060, 59518, 16536, 47309}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, new char[]{'&', 24, '0', 24, '&', 28, '\'', 7, 23, '%', '!', '*', ')', '0', 24, 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 69), objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i4 = MediaDescriptionCompat + 111;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1907098284};
                byte[] bArr2 = $$j;
                short s = bArr2[9];
                int i6 = $$k;
                Object[] objArr18 = new Object[1];
                j(s, (byte) (s & 43), (byte) (i6 & 63), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                j((short) (-bArr2[54]), (byte) (i6 & 52), bArr2[44], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 13184);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1649;
                    int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                    byte[] bArr3 = $$d;
                    Object[] objArr20 = new Object[1];
                    i((short) (-bArr3[65]), bArr3[5], (byte) (-bArr3[8]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cAxisFromString, maximumDrawingCacheSize, i7, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 57567, new char[]{37946, 29910, 22009, 13952, 6072, 61533, 53613, 45632, 37676, 29651, 23723, 15817, 7814, 65455, 55365, 47475, 39430, 31499, 23489, 9453, 1412, 59055}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 17932, new char[]{37950, 53838, 6344, 18240, 36300, 62563, 13033, 31046, 42998, 61051, 21645, 37660, 55710, 19, 20128}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
                        int iAlpha = Color.alpha(0) + 1649;
                        int iGreen = 26 - Color.green(0);
                        Object[] objArr23 = new Object[1];
                        i((short) 75, r12[5], (byte) (-$$d[8]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, iAlpha, iGreen, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13182);
                        int i8 = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 26;
                        Object[] objArr24 = new Object[1];
                        i(r7[17], (byte) (-$$d[113]), (byte) 40, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c2, i8, edgeSlop, -133433128, false, (String) objArr24[0], null);
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
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4535), 6054 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i11 = MediaDescriptionCompat + 25;
            MediaBrowserCompatSearchResultReceiver = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr25 = {1231309320, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ExpandableListView.getPackedPositionChild(0L) + 6031, View.MeasureSpec.makeMeasureSpec(0, 0) + 24);
                Object[] objArr26 = new Object[1];
                j(r1[96], (byte) (-$$j[127]), r1[16], objArr26);
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
        MediaDescriptionCompat();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        Object obj = null;
        if (getsubjectstat != null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 89;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 89;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 97;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatMediaItem().af_();
        int i4 = MediaBrowserCompatSearchResultReceiver + 67;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 19;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatMediaItem() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void onCommand() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 + 5;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        if (this.write) {
            return;
        }
        int i5 = i2 + 43;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        this.write = true;
        ((updateScoreForMatch) af_()).write((DeeplinkProcessorActivity) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        int i7 = MediaBrowserCompatSearchResultReceiver + 121;
        MediaDescriptionCompat = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 83;
        MediaDescriptionCompat = i2 % 128;
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

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 37;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 45;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            g((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25, new char[]{'\"', 23, 18, 3, '&', '\"', 18, 19, ' ', ',', 4, 25, 1, '\n', '&', 28, '&', 29, '\'', 7, 26, ',', 3, '.', 31, 16}, (byte) (53 - TextUtils.getOffsetBefore("", 0)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 96, new char[]{'\n', '$', 13867, 13867, '0', 24, '&', 0, 13869, 13869, 3, 28, '\t', 29, '&', 28, '0', '\"'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 31), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatSearchResultReceiver + 89;
            MediaDescriptionCompat = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 4535), KeyEvent.getDeadChar(0, 0) + 6054, 42 - KeyEvent.getDeadChar(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 6030 - View.combineMeasuredStates(0, 0), 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - (ViewConfiguration.getEdgeSlop() >> 16)), 6054 - TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), 6030 - TextUtils.indexOf("", "", 0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                int i7 = MediaBrowserCompatSearchResultReceiver + 35;
                MediaDescriptionCompat = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 5;
                }
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCombineUpright.onPause():void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, new char[]{'\"', 23, 18, 3, '&', '\"', 18, 19, '#', '\"', 19, 20, 6, '\'', '\n', '+', 13814, 13814}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 9), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 61248, new char[]{37942, 31553, 19144, 23067, 10675}, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.red(0) + 4535), 6054 - (ViewConfiguration.getEdgeSlop() >> 16), 42 - View.MeasureSpec.makeMeasureSpec(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 13033, new char[]{37944, 42653, 61837, 3300, 24564, 27264, 42376, 61596, 1015, 24294, 26902, 42003, 63322, 618, 23925, 26707, 47963, 63005, 302, 23650, 28308, 47569, 62687, 1975, 21163, 28038, 47297, 52123, 1788, 20973, 27667, 48902, 51806, 1338, 20523, 25351, 48661, 51495, 1067, 22377, 25031, 48259, 53180, 6847, 21927, 24789, 45975, 52899}, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    g(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 60, new char[]{22, '\f', '\f', 22, '%', '!', '\'', 26, 19, '#', 15, 31, '!', '(', 18, 24, 31, ',', '%', 2, ' ', '.', 2, '0', 30, '\"', '(', '!', '/', '%', '(', 23, 27, 5, '\"', 15, 16, '$', 19, 27, '(', ')', 31, 15, 18, 16, 31, 19, 23, '/', 19, 21, 30, '/', 0, 20, '$', 18, '+', '\n', 17, '*', 19, ')'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8), objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 60, new char[]{30, '\"', 31, 16, 30, '(', 11, '$', 13931, 13931, 19, 28, '%', ' ', 13931, 13931, '%', ' ', 30, '\"', '(', 30, 16, ')', '-', '.', 16, '-', 18, 27, ' ', '(', 2, '\"', '&', '/', 31, ',', 14, 16, 30, '(', '/', 24, '\t', '$', 23, '!', 15, 18, 16, 29, ' ', 26, 15, '\r', '\"', 30, 15, 28, 26, '\'', ' ', '.'}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 110), objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 48, new char[]{'*', '(', '\'', '*', '!', 7, 13825, 13825, 16, 31, 28, 3, 18, 11, '#', '\'', 24, 20, ' ', 14, '(', '*', 3, '.', 28, '%', '\t', 29, '#', '*', 15, '.', '%', 31, 3, 18, 31, 21, '%', 31, 3, '.', 15, 11, '#', '0', 2, '!', '-', ' ', 3, '!', 22, '0', '*', 31, '(', 0, '%', '&', 3, '/', '&', '+', 21, ')', 13877}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 66), objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 62288, new char[]{37986, 26374, 29324, 20022, 22969, 21846}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 59173, new char[]{37993, 29497, 23199, 8597, 2337, 4342, 65432, 50991, 44782, 46472, 40195, 25842, 17369, 11073, 13029, 6576, 57695, 51439, 55200, 48971, 34373, 28070, 30025, 23555, 15349, 887, 59988, 61864, 55672, 41049, 36738, 38704, 32266, 17801, 11627, 13364}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6029, TextUtils.indexOf("", "") + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                    int i4 = MediaBrowserCompatSearchResultReceiver + 37;
                    MediaDescriptionCompat = i4 % 128;
                    int i5 = i4 % 2;
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
            try {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cCombineMeasuredStates = (char) (61148 - View.combineMeasuredStates(0, 0));
                    int scrollBarSize = 2145 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 12;
                    Object[] objArr12 = new Object[1];
                    i((short) (-$$d[2]), r9[9], r9[5], objArr12);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cCombineMeasuredStates, scrollBarSize, windowTouchSlop, -2136739198, false, (String) objArr12[0], null);
                }
                long j = ((Field) objRemoteActionCompatParcelizer3).getLong(null);
                Object[] objArr13 = new Object[1];
                h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 57536, new char[]{37946, 29910, 22009, 13952, 6072, 61533, 53613, 45632, 37676, 29651, 23723, 15817, 7814, 65455, 55365, 47475, 39430, 31499, 23489, 9453, 1412, 59055}, objArr13);
                Class<?> cls2 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 18037, new char[]{37950, 53838, 6344, 18240, 36300, 62563, 13033, 31046, 42998, 61051, 21645, 37660, 55710, 19, 20128}, objArr14);
                long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(301834150);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char touchSlop = (char) (61148 - (ViewConfiguration.getTouchSlop() >> 8));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2146;
                    int trimmedLength = 12 - TextUtils.getTrimmedLength("");
                    Object[] objArr15 = new Object[1];
                    i((short) 111, (byte) (r15[29] - 1), (byte) ($$d[4] - 1), objArr15);
                    objRemoteActionCompatParcelizer4 = startForeground.read(touchSlop, iLastIndexOf, trimmedLength, 1874090803, false, (String) objArr15[0], null);
                }
                if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c = (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 61148);
                        int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2144;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 12;
                        short s = (short) ($$e - 3);
                        byte[] bArr = $$d;
                        Object[] objArr16 = new Object[1];
                        i(s, (byte) (-bArr[113]), (byte) (-bArr[164]), objArr16);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c, i6, tapTimeout, -1530294468, false, (String) objArr16[0], null);
                    }
                    list = (List) ((Field) objRemoteActionCompatParcelizer5).get(null);
                } else {
                    Object[] objArr17 = new Object[1];
                    h(22613 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{37937, 52335, 9351, 40133, 62753, 11678, 34244, 65126, 22164, 36488, 59226, 24453, 47060, 59518, 16536, 47309}, objArr17);
                    Class<?> cls3 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    g(16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{'&', 24, '0', 24, '&', 28, '\'', 7, 23, '%', '!', '*', ')', '0', 24, 3}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 39), objArr18);
                    int iIntValue2 = ((Integer) cls3.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr19 = {12015603};
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-173351824);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            objRemoteActionCompatParcelizer6 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45845), KeyEvent.getDeadChar(0, 0) + 913, (ViewConfiguration.getPressedStateDuration() >> 16) + 10, -1948051227, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr20 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer6).newInstance(objArr19)};
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(1891595430);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char fadingEdgeLength = (char) (61148 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                int i7 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2145;
                                int i8 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12;
                                Object[] objArr21 = new Object[1];
                                i((short) 167, r8[75], (byte) (-$$d[45]), objArr21);
                                objRemoteActionCompatParcelizer7 = startForeground.read(fadingEdgeLength, i7, i8, 251047987, false, (String) objArr21[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 557, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17)});
                            }
                            list = (List) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr20);
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                char c2 = (char) (61149 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int i9 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2145;
                                int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 12;
                                short s2 = (short) ($$e - 3);
                                byte[] bArr2 = $$d;
                                Object[] objArr22 = new Object[1];
                                i(s2, (byte) (-bArr2[113]), (byte) (-bArr2[164]), objArr22);
                                objRemoteActionCompatParcelizer8 = startForeground.read(c2, i9, windowTouchSlop2, -1530294468, false, (String) objArr22[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer8).set(null, list);
                            Object[] objArr23 = new Object[1];
                            h(57571 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{37946, 29910, 22009, 13952, 6072, 61533, 53613, 45632, 37676, 29651, 23723, 15817, 7814, 65455, 55365, 47475, 39430, 31499, 23489, 9453, 1412, 59055}, objArr23);
                            Class<?> cls4 = Class.forName((String) objArr23[0]);
                            Object[] objArr24 = new Object[1];
                            h(18041 - ExpandableListView.getPackedPositionType(0L), new char[]{37950, 53838, 6344, 18240, 36300, 62563, 13033, 31046, 42998, 61051, 21645, 37660, 55710, 19, 20128}, objArr24);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(301834150);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                char maximumDrawingCacheSize = (char) (61148 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int mode = View.MeasureSpec.getMode(0) + 2145;
                                int iNormalizeMetaState = 12 - KeyEvent.normalizeMetaState(0);
                                byte[] bArr3 = $$d;
                                Object[] objArr25 = new Object[1];
                                i((short) 111, (byte) (bArr3[29] - 1), (byte) (bArr3[4] - 1), objArr25);
                                objRemoteActionCompatParcelizer9 = startForeground.read(maximumDrawingCacheSize, mode, iNormalizeMetaState, 1874090803, false, (String) objArr25[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-18205161);
                            if (objRemoteActionCompatParcelizer10 == null) {
                                char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 61147);
                                int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2144;
                                int i11 = 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                Object[] objArr26 = new Object[1];
                                i((short) (-$$d[2]), r8[9], r8[5], objArr26);
                                objRemoteActionCompatParcelizer10 = startForeground.read(c3, i10, i11, -2136739198, false, (String) objArr26[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer10).set(null, lValueOf2);
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
                for (Object[] objArr27 : list) {
                    int i12 = ((int[]) objArr27[3])[0];
                    int i13 = ((int[]) objArr27[1])[0];
                    if (i13 != i12) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr27[2];
                        if (strArr != null) {
                            for (String str6 : strArr) {
                                arrayList.add(str6);
                            }
                        }
                        long j2 = -1;
                        long j3 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                        long j4 = 0;
                        long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
                        try {
                            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                            if (objRemoteActionCompatParcelizer11 == null) {
                                objRemoteActionCompatParcelizer11 = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0, 0)), 6054 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                            }
                            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
                            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                            int i14 = MediaDescriptionCompat + 63;
                            MediaBrowserCompatSearchResultReceiver = i14 % 128;
                            int i15 = i14 % 2;
                            try {
                                Object[] objArr28 = {12015603, Long.valueOf(j5), arrayList, strRemoteActionCompatParcelizer, false};
                                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) Color.argb(0, 0, 0, 0), 6029 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23);
                                Object[] objArr29 = new Object[1];
                                j(r6[96], (byte) (-$$j[127]), r6[16], objArr29);
                                cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr28);
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
                }
            } catch (Throwable th6) {
                Throwable cause6 = th6.getCause();
                if (cause6 == null) {
                    throw th6;
                }
                throw cause6;
            }
        } catch (Throwable th7) {
            Object[] objArr30 = new Object[1];
            h(14387 - (Process.myTid() >> 22), new char[]{37999, 44122, 58372, 15606, 29870, 35986, 50526, 7436, 22010, 28070, 42389}, objArr30);
            String str7 = (String) objArr30[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th7.printStackTrace(printStream);
                printStream.close();
                strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
            } catch (Throwable unused) {
                strValueOf = String.valueOf(th7);
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(strValueOf);
            arrayList2.add(str7);
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer12 == null) {
                objRemoteActionCompatParcelizer12 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 4536), 6053 - ExpandableListView.getPackedPositionChild(0L), 42 - TextUtils.getTrimmedLength(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
            String strRemoteActionCompatParcelizer2 = TrainingApplication.RemoteActionCompatParcelizer();
            int i16 = MediaBrowserCompatSearchResultReceiver + 17;
            MediaDescriptionCompat = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr31 = {12015603, 81604378625L, arrayList2, strRemoteActionCompatParcelizer2, false};
            Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollBarSize() >> 8), 6030 - View.resolveSize(0, 0), 24 - TextUtils.indexOf("", ""));
            Object[] objArr32 = new Object[1];
            j(r4[96], (byte) (-$$j[127]), r4[16], objArr32);
            cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr31);
        }
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            try {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr33 = new Object[1];
                h(AndroidCharacter.getMirror('0') + 25409, new char[]{37987, 63259, 21135, 48696, 6571, 25949, 49354, 11380, 36837, 60048, 30213}, objArr33);
                String str8 = (String) objArr33[0];
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
                arrayList3.add(str8);
                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer13 == null) {
                    objRemoteActionCompatParcelizer13 = startForeground.read((char) (4535 - TextUtils.getOffsetAfter("", 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, TextUtils.lastIndexOf("", '0') + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer13).invoke(null, null);
                Object[] objArr34 = {12015603, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls7 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0) + 6030, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23);
                Object[] objArr35 = new Object[1];
                j(r4[96], (byte) (-$$j[127]), r4[16], objArr35);
                cls7.getMethod((String) objArr35[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr34);
            }
        }
        try {
            Object[] objArr36 = {12015603};
            Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer14 == null) {
                objRemoteActionCompatParcelizer14 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1991, TextUtils.getOffsetAfter("", 0) + 12, -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr37 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer14).newInstance(objArr36)};
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19323);
                    int capsMode = 2759 - TextUtils.getCapsMode("", 0, 0);
                    int iIndexOf = 98 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr4 = $$d;
                    Object[] objArr38 = new Object[1];
                    i((short) 111, (byte) (bArr4[29] - 1), (byte) (bArr4[4] - 1), objArr38);
                    objRemoteActionCompatParcelizer15 = startForeground.read(keyRepeatTimeout, capsMode, iIndexOf, 1799372695, false, (String) objArr38[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (9580 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 3446 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 144)});
                }
                ((Method) objRemoteActionCompatParcelizer15).invoke(null, objArr37);
                int i18 = MediaDescriptionCompat + 49;
                MediaBrowserCompatSearchResultReceiver = i18 % 128;
                int i19 = i18 % 2;
                Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer16 == null) {
                    char longPressTimeout = (char) (13183 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int iResolveSize = 1649 - View.resolveSize(0, 0);
                    int defaultSize = 26 - View.getDefaultSize(0, 0);
                    Object[] objArr39 = new Object[1];
                    i(r6[17], (byte) (-$$d[113]), (byte) 40, objArr39);
                    objRemoteActionCompatParcelizer16 = startForeground.read(longPressTimeout, iResolveSize, defaultSize, -133433128, false, (String) objArr39[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer16).getLong(null) != -1) {
                    int i20 = MediaBrowserCompatSearchResultReceiver + 89;
                    MediaDescriptionCompat = i20 % 128;
                    if (i20 % 2 == 0) {
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char c4 = (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                            int trimmedLength2 = 1649 - TextUtils.getTrimmedLength("");
                            int mirror = AndroidCharacter.getMirror('0') - 22;
                            byte[] bArr5 = $$d;
                            Object[] objArr40 = new Object[1];
                            i((short) (-bArr5[65]), bArr5[5], (byte) (-bArr5[8]), objArr40);
                            objRemoteActionCompatParcelizer17 = startForeground.read(c4, trimmedLength2, mirror, -1033747278, false, (String) objArr40[0], null);
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer18 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13183);
                        int i21 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1649;
                        int iAxisFromString = 25 - MotionEvent.axisFromString("");
                        byte[] bArr6 = $$d;
                        Object[] objArr41 = new Object[1];
                        i((short) (-bArr6[65]), bArr6[5], (byte) (-bArr6[8]), objArr41);
                        objRemoteActionCompatParcelizer18 = startForeground.read(scrollBarFadeDuration, i21, iAxisFromString, -1033747278, false, (String) objArr41[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer18).get(null);
                } else {
                    Object[] objArr42 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 22609, new char[]{37937, 52335, 9351, 40133, 62753, 11678, 34244, 65126, 22164, 36488, 59226, 24453, 47060, 59518, 16536, 47309}, objArr42);
                    Class<?> cls8 = Class.forName((String) objArr42[0]);
                    Object[] objArr43 = new Object[1];
                    g((ViewConfiguration.getJumpTapTimeout() >> 16) + 16, new char[]{'&', 24, '0', 24, '&', 28, '\'', 7, 23, '%', '!', '*', ')', '0', 24, 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 5), objArr43);
                    try {
                        Object[] objArr44 = {Integer.valueOf(((Integer) cls8.getMethod((String) objArr43[0], Object.class).invoke(null, this)).intValue()), 0, -1411430447};
                        byte[] bArr7 = $$j;
                        byte b = bArr7[59];
                        Object[] objArr45 = new Object[1];
                        j((short) 91, b, (byte) (b + 3), objArr45);
                        Class<?> cls9 = Class.forName((String) objArr45[0]);
                        short s3 = (short) TsExtractor.TS_STREAM_TYPE_AC3;
                        byte b2 = bArr7[44];
                        Object[] objArr46 = new Object[1];
                        j(s3, b2, (byte) (b2 | 41), objArr46);
                        objArr = (Object[]) cls9.getMethod((String) objArr46[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr44);
                        Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer19 == null) {
                            char cGreen = (char) (Color.green(0) + 13183);
                            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 1649;
                            int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0', 0);
                            byte[] bArr8 = $$d;
                            Object[] objArr47 = new Object[1];
                            i((short) (-bArr8[65]), bArr8[5], (byte) (-bArr8[8]), objArr47);
                            objRemoteActionCompatParcelizer19 = startForeground.read(cGreen, iIndexOf2, iLastIndexOf2, -1033747278, false, (String) objArr47[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer19).set(null, objArr);
                        try {
                            Object[] objArr48 = new Object[1];
                            h((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 57570, new char[]{37946, 29910, 22009, 13952, 6072, 61533, 53613, 45632, 37676, 29651, 23723, 15817, 7814, 65455, 55365, 47475, 39430, 31499, 23489, 9453, 1412, 59055}, objArr48);
                            Class<?> cls10 = Class.forName((String) objArr48[0]);
                            Object[] objArr49 = new Object[1];
                            h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 18031, new char[]{37950, 53838, 6344, 18240, 36300, 62563, 13033, 31046, 42998, 61051, 21645, 37660, 55710, 19, 20128}, objArr49);
                            long jLongValue3 = ((Long) cls10.getDeclaredMethod((String) objArr49[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue3);
                            Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer20 == null) {
                                char cBlue = (char) (Color.blue(0) + 13183);
                                int pressedStateDuration = 1649 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int keyRepeatTimeout2 = 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                Object[] objArr50 = new Object[1];
                                i((short) 75, r12[5], (byte) (-$$d[8]), objArr50);
                                objRemoteActionCompatParcelizer20 = startForeground.read(cBlue, pressedStateDuration, keyRepeatTimeout2, 54351865, false, (String) objArr50[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                            Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer21 == null) {
                                char cGreen2 = (char) (Color.green(0) + 13183);
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1649;
                                int i22 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                                Object[] objArr51 = new Object[1];
                                i(r8[17], (byte) (-$$d[113]), (byte) 40, objArr51);
                                objRemoteActionCompatParcelizer21 = startForeground.read(cGreen2, absoluteGravity, i22, -133433128, false, (String) objArr51[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer21).set(null, lValueOf4);
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
                int i23 = ((int[]) objArr[3])[0];
                int i24 = ((int[]) objArr[2])[0];
                if (i24 != i23) {
                    long j6 = -1;
                    long j7 = ((long) (i24 ^ i23)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)));
                    long j8 = 0;
                    long j9 = j7 | (((long) 2) << 32) | (j8 - ((j8 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        objRemoteActionCompatParcelizer22 = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 4535), 6054 - ExpandableListView.getPackedPositionType(0L), 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer22).invoke(null, null);
                    Object[] objArr52 = {12015603, Long.valueOf(j9), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls11 = (Class) startForeground.IconCompatParcelizer((char) ((-16777216) - Color.rgb(0, 0, 0)), 6029 - TextUtils.lastIndexOf("", '0'), 23 - TextUtils.lastIndexOf("", '0', 0, 0));
                    Object[] objArr53 = new Object[1];
                    j(r2[96], (byte) (-$$j[127]), r2[16], objArr53);
                    cls11.getMethod((String) objArr53[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr52);
                }
                Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer23 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 943;
                    int iIndexOf3 = 36 - TextUtils.indexOf("", "", 0);
                    Object[] objArr54 = new Object[1];
                    i((short) (-$$d[2]), r4[9], r4[5], objArr54);
                    objRemoteActionCompatParcelizer23 = startForeground.read(cLastIndexOf, threadPriority, iIndexOf3, -167186806, false, (String) objArr54[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer23).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char c5 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iMyPid = (Process.myPid() >> 22) + 943;
                        int iAlpha = 36 - Color.alpha(0);
                        short s4 = (short) ($$e - 3);
                        byte[] bArr9 = $$d;
                        Object[] objArr55 = new Object[1];
                        i(s4, (byte) (-bArr9[113]), (byte) (-bArr9[164]), objArr55);
                        objRemoteActionCompatParcelizer24 = startForeground.read(c5, iMyPid, iAlpha, -1398865628, false, (String) objArr55[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer24).get(null);
                } else {
                    Object[] objArr56 = new Object[1];
                    h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 22502, new char[]{37937, 52335, 9351, 40133, 62753, 11678, 34244, 65126, 22164, 36488, 59226, 24453, 47060, 59518, 16536, 47309}, objArr56);
                    Class<?> cls12 = Class.forName((String) objArr56[0]);
                    Object[] objArr57 = new Object[1];
                    g(Color.rgb(0, 0, 0) + 16777232, new char[]{'&', 24, '0', 24, '&', 28, '\'', 7, 23, '%', '!', '*', ')', '0', 24, 3}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 36), objArr57);
                    Object[] objArr58 = {Integer.valueOf(((Integer) cls12.getMethod((String) objArr57[0], Object.class).invoke(null, this)).intValue()), 0, 106076344};
                    Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer25 == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 944;
                        int i25 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35;
                        byte[] bArr10 = $$d;
                        Object[] objArr59 = new Object[1];
                        i((short) 186, bArr10[5], bArr10[103], objArr59);
                        objRemoteActionCompatParcelizer25 = startForeground.read(packedPositionChild, iLastIndexOf3, i25, -2131402098, false, (String) objArr59[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer25).invoke(null, objArr58);
                    Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer26 == null) {
                        char cBlue2 = (char) Color.blue(0);
                        int i26 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 942;
                        int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36;
                        short s5 = (short) ($$e - 3);
                        byte[] bArr11 = $$d;
                        Object[] objArr60 = new Object[1];
                        i(s5, (byte) (-bArr11[113]), (byte) (-bArr11[164]), objArr60);
                        objRemoteActionCompatParcelizer26 = startForeground.read(cBlue2, i26, scrollBarFadeDuration2, -1398865628, false, (String) objArr60[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer26).set(null, objArr2);
                    try {
                        Object[] objArr61 = new Object[1];
                        h(((Process.getThreadPriority(0) + 20) >> 6) + 57571, new char[]{37946, 29910, 22009, 13952, 6072, 61533, 53613, 45632, 37676, 29651, 23723, 15817, 7814, 65455, 55365, 47475, 39430, 31499, 23489, 9453, 1412, 59055}, objArr61);
                        Class<?> cls13 = Class.forName((String) objArr61[0]);
                        Object[] objArr62 = new Object[1];
                        h(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 18037, new char[]{37950, 53838, 6344, 18240, 36300, 62563, 13033, 31046, 42998, 61051, 21645, 37660, 55710, 19, 20128}, objArr62);
                        long jLongValue4 = ((Long) cls13.getDeclaredMethod((String) objArr62[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue4);
                        Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer27 == null) {
                            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            int i27 = 944 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i28 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte[] bArr12 = $$d;
                            Object[] objArr63 = new Object[1];
                            i((short) 111, (byte) (bArr12[29] - 1), (byte) (bArr12[4] - 1), objArr63);
                            objRemoteActionCompatParcelizer27 = startForeground.read(cLastIndexOf2, i27, i28, -629981381, false, (String) objArr63[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                        Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer28 == null) {
                            char cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                            int iIndexOf4 = 943 - TextUtils.indexOf("", "");
                            int iAxisFromString2 = 35 - MotionEvent.axisFromString("");
                            Object[] objArr64 = new Object[1];
                            i((short) (-$$d[2]), r3[9], r3[5], objArr64);
                            objRemoteActionCompatParcelizer28 = startForeground.read(cRgb, iIndexOf4, iAxisFromString2, -167186806, false, (String) objArr64[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer28).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i29 = ((int[]) objArr2[2])[0];
                int i30 = ((int[]) objArr2[0])[0];
                if (i30 != i29) {
                    long j10 = -1;
                    long j11 = 0;
                    long j12 = (((long) (i30 ^ i29)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)))) | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer29 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer29 == null) {
                        objRemoteActionCompatParcelizer29 = startForeground.read((char) (4535 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, 42 - (Process.myTid() >> 22), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer29).invoke(null, null);
                    Object[] objArr65 = {12015603, Long.valueOf(j12), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls14 = (Class) startForeground.IconCompatParcelizer((char) Color.red(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6029, TextUtils.getCapsMode("", 0, 0) + 24);
                    Object[] objArr66 = new Object[1];
                    j(r2[96], (byte) (-$$j[127]), r2[16], objArr66);
                    cls14.getMethod((String) objArr66[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr65);
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
        int i2 = MediaDescriptionCompat + 105;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaDescriptionCompat + 91;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }
}
