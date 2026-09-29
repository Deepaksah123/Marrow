package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import in.juspay.hyper.core.JuspayLogger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.getProvider;
import kotlin.notifyDownloadChanged;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class CustomtabResult extends Activity {
    public static final String CUSTOMTAB_RESULT = "customtab-result";
    private static final String LOG_TAG = "CustomtabResult";
    private static final byte[] $$c = {62, -25, -124, -119};
    private static final int $$f = 32;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {112, 17, 101, TarConstants.LF_CONTIG, 58, -64, -5, -22, 41, -56, -4, 10, -26, 4, -13, -6, 26, -35, -10, -7, -4, -17, -33, -19, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, 58, -64, -5, -22, 25, -27, -20, 1, 4, -19, 6, -15, -10, 16, -36, -1, 65, -53, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$e = 60;
    private static final byte[] $$a = {36, -60, 17, 26, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 140;
    private static int read = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static long AudioAttributesCompatParcelizer = -6452953545124885571L;
    private static int write = 1000326324;

    private static String $$g(short s, short s2, int i) {
        int i2 = 4 - (s * 2);
        byte[] bArr = $$c;
        int i3 = s2 * 3;
        int i4 = 121 - (i * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = (-i4) + i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = bArr[i2];
            i2++;
            i4 = (-i8) + i4;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 44 - r6
            int r7 = r7 + 4
            byte[] r1 = in.juspay.hypersdk.core.CustomtabResult.$$a
            int r8 = r8 + 65
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r7
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabResult.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = in.juspay.hypersdk.core.CustomtabResult.$$d
            int r1 = 46 - r5
            int r6 = r6 + 4
            int r7 = r7 + 73
            byte[] r1 = new byte[r1]
            int r5 = 45 - r5
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-7)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabResult.d(short, byte, short, java.lang.Object[]):void");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38462 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 532, ExpandableListView.getPackedPositionChild(0L) + 9, -735610793, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (AudioAttributesCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 36621), Color.argb(0, 0, 0, 0) + 2340, 29 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 188119637, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $11 + 27;
                $10 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (36622 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2340 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 29, 188119637, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r24, int r25, boolean r26, char[] r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabResult.b(int, int, boolean, char[], int, java.lang.Object[]):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 1194, new char[]{22551, 23823, 21052, 22337, 19525, 16748, 18072, 31737, 28833, 30154, 27326, 28635, 25872, 6706, 8023, 5194, 2421, 3714}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 211, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, false, new char[]{65517, 1, 65532, 5, 17}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 10558, new char[]{22551, 28967, 2668, 9145, 64741, 38436, 44904, 30945, 4591, 11057, 50288, 40429, 46787, 16422, 6512, 12974, 52208, 58672, 48748, 22434, 24782, 14901, 54126, 60602, 34303, 24373}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 44482, new char[]{22549, 62960, 994, 20957, 61407, 15783, 19376, 39314, 14238, 17805, 37732, 8558, 32625, 36160, 56136, 26914, 34601, 54587}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getTrimmedLength("") + 4535), 6053 - MotionEvent.axisFromString(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(KeyEvent.normalizeMetaState(0) + 218, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 11, true, new char[]{23, 22, 25, 24, 27, 65509, 65514, 24, 26, 27, 65518, 65517, 65514, 65518, 65512, 25, 65516, 23, 24, 23, 26, 65515, 65511, 26, 65509, 65511, 65510, 65512, 22, 65513, 27, 65517, 65518, 27, 26, 65512, 65509, 24, 26, 65509, 65514, 25, 27, 26, 65518, 65512, 65515, 65513}, (ViewConfiguration.getEdgeSlop() >> 16) + 8, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46769, new char[]{22598, 61092, 13687, 31829, 33413, 51554, 4199, 42647, 60875, 13432, 31480, 33167, 51210, 7866, 42428, 60447, 13063, 31186, 32869, 55148, 7572, 42187, 60276, 12712, 30860, 36622, 54717, 7405, 41747, 59980, 12538, 18217, 36454, 54419, 7062, 41590, 59636, 16337, 17923, 36017, 54246, 6680, 41246, 63401, 15998, 17677, 35721, 53869, 6518, 44974, 63185, 15621, 17331, 35562, 53524, 6212, 44790, 62841, 15369, 17118, 35135, 53310, 26267, 44494}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 204, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 63, false, new char[]{29, 65518, 65514, 65521, 26, 29, 29, 65521, 26, 27, 65514, 65515, 65514, 65516, 65515, 65522, 30, 29, 65522, 65516, 65519, 65514, 65521, 65517, 26, 65520, 30, 26, 30, 65516, 31, 65514, 65515, 30, 65513, 28, 65515, 65513, 26, 65518, 29, 31, 26, 65514, 65519, 65516, 28, 65514, 27, 65518, 27, 65519, 65520, 65519, 65521, 27, 65514, 26, 29, 65514, 65515, 28, 65521, 29}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 20, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(22343 - Gravity.getAbsoluteGravity(0, 0), new char[]{22558, 3909, 63116, 24019, 1305, 60463, 21491, 15016, 57898, 18792, 12505, 38935, 20315, 13983, 40443, 17706, 11368, 37797, 31483, 8733, 35214, 28877, 55326, 36722, 30399, 56813, 34083, 27754, 54209, 47881, 25098, 51592, 45283, 6192, 53098, 46759, 7673, 50500, 44169, 5062, 64284, 41548, 2558, 61688, 22573, 3936, 63131, 24094, 1366, 60552, 21383, 15162, 57972, 18850, 12521, 38980, 20362, 13974, 40470, 17689, 11517, 37880, 31538, 8810, 35288, 28933, 55371}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + PsExtractor.AUDIO_STREAM, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 30, false, new char[]{2, 65532, 0, 7, 65532, 65535}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 203, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, false, new char[]{'#', '&', 65521, '!', 65526, 65526, 65522, 65521, '\"', 65527, 65526, 65522, 65521, 65521, 65517, 65528, '&', 65528, '&', 65517, 65524, 65526, 65524, 65527, 65517, 65529, '\"', 65522, 65520, 65517, '&', 65527, '!', 65522, 65527, '%'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 24 - ExpandableListView.getPackedPositionGroup(0L), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char c = (char) (13183 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1650;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
            byte b = $$a[5];
            Object[] objArr13 = new Object[1];
            c(b, b, r3[140], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, iLastIndexOf, longPressTimeout, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i2 = read + 99;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c2 = (char) (13184 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1649;
                int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0');
                byte[] bArr = $$a;
                Object[] objArr14 = new Object[1];
                c(bArr[30], bArr[27], bArr[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c2, longPressTimeout2, iLastIndexOf2, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            int i4 = read + 17;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Object[] objArr15 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 132, 15 - Process.getGidForName(""), true, new char[]{65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 9, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(View.combineMeasuredStates(0, 0) + 65353, new char[]{22559, 42843, 42625, 42435, 42278, 42098, 41908, 41712, 41590, 41350, 41183, 41021, 44889, 44716, 44524, 44372}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = RemoteActionCompatParcelizer + 63;
            read = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1854606927};
                byte[] bArr2 = $$d;
                byte b2 = (byte) (-bArr2[73]);
                byte b3 = bArr2[83];
                Object[] objArr18 = new Object[1];
                d(b2, b3, (byte) (b3 & 38), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d(bArr2[16], bArr2[1], (byte) (bArr2[75] - 1), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char defaultSize = (char) (13183 - View.getDefaultSize(0, 0));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1649;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 26;
                    byte[] bArr3 = $$a;
                    Object[] objArr20 = new Object[1];
                    c(bArr3[30], bArr3[27], bArr3[5], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(defaultSize, scrollBarFadeDuration, scrollBarSize, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 27010, new char[]{22551, 12699, 35604, 25741, 65045, 22416, 8448, 47821, 5121, 60830, 18246, 53380, 43563, 930, 40232, 30398, 49195, 22918, 13100, 36000, 26153, 65442}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(7993 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{22547, 18211, 26213, 1453, 9441, 50190, 58180, 33451, 41435, 16662, 24608, 3953, 11955, 52734, 60685}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 13184);
                        int iIndexOf = 1648 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int iArgb = Color.argb(0, 0, 0, 0) + 26;
                        byte[] bArr4 = $$a;
                        Object[] objArr23 = new Object[1];
                        c(bArr4[30], (short) 76, bArr4[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(packedPositionChild, iIndexOf, iArgb, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char packedPositionType = (char) (13183 - ExpandableListView.getPackedPositionType(0L));
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1649;
                        int iIndexOf2 = 26 - TextUtils.indexOf("", "", 0);
                        byte b4 = $$a[5];
                        Object[] objArr24 = new Object[1];
                        c(b4, b4, r6[140], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(packedPositionType, iResolveOpacity, iIndexOf2, -133433128, false, (String) objArr24[0], null);
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
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4534), TextUtils.lastIndexOf("", '0') + 6055, KeyEvent.keyCodeFromString("") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-862193592, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 6030 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 25);
                byte[] bArr5 = $$d;
                Object[] objArr26 = new Object[1];
                d((byte) (bArr5[1] + 1), bArr5[25], (byte) (-bArr5[35]), objArr26);
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
        Intent intent = new Intent("customtab-result");
        try {
            intent.putExtra("response", getIntent().getDataString());
        } catch (Exception e) {
            JuspayLogger.e(LOG_TAG, "Couldn't find data from url", e);
        }
        intent.putExtra("status", "SUCCESS");
        getProvider.getInstance(this).AudioAttributesCompatParcelizer(intent);
        startActivity(new Intent(this, (Class<?>) CustomtabActivity.class));
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabResult.onResume():void");
    }

    @Override // android.app.Activity
    protected void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = read + 33;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 10524, new char[]{22551, 28967, 2668, 9145, 64741, 38436, 44904, 30945, 4591, 11057, 50288, 40429, 46787, 16422, 6512, 12974, 52208, 58672, 48748, 22434, 24782, 14901, 54126, 60602, 34303, 24373}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0) + 44531, new char[]{22549, 62960, 994, 20957, 61407, 15783, 19376, 39314, 14238, 17805, 37732, 8558, 32625, 36160, 56136, 26914, 34601, 54587}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = read + 49;
                RemoteActionCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            int i6 = read + 29;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, (ViewConfiguration.getEdgeSlop() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), KeyEvent.keyCodeFromString("") + 6030, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(41:0|2|(2:(2:9|(2:11|(1:17)(1:16))(2:18|19))(1:20)|(9:22|294|23|(1:25)|26|27|28|(1:30)|31)(1:7))(0)|35|(28:291|37|(2:39|(3:41|(2:43|48)|47)(3:44|(2:46|48)|47))(1:48)|84|286|85|(1:87)|88|(1:90)|91|(4:93|(1:95)|96|97)(19:98|99|278|100|(1:102)|103|104|295|105|(1:107)|108|109|110|(1:112)|113|(1:115)|116|(1:118)|119)|120|(4:123|(13:300|125|(3:127|(4:130|(3:306|132|309)(4:305|133|134|308)|307|128)|304)|135|287|136|(1:138)|139|140|141|280|142|303)(1:302)|301|121)|299|177|(1:179)|180|(3:182|(1:184)|185)(13:187|289|188|189|(1:191)|192|272|193|194|(1:196)|197|(1:199)|200)|186|201|(6:203|204|(1:206)|207|208|209)|210|(1:212)|213|(2:215|(4:217|(1:219)|220|221)(3:222|(1:224)|225))(14:227|228|(1:230)|231|232|(1:234)|235|292|236|237|(1:239)|240|(1:242)|243)|226|244|(7:246|247|(1:249)|250|251|252|253)(1:310))|52|284|53|(1:55)|56|274|57|(1:59)|60|61|84|286|85|(0)|88|(0)|91|(0)(0)|120|(1:121)|299|177|(0)|180|(0)(0)|186|201|(0)|210|(0)|213|(0)(0)|226|244|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0bd0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0bd1, code lost:
    
        r3 = new java.lang.Object[1];
        b(196 - android.widget.ExpandableListView.getPackedPositionGroup(0), (((android.content.Context) java.lang.Class.forName(r22).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 10, false, new char[]{4, 65535, 4, 1, 2, 65533, 4, 1, 65531, 65535, 65533}, ((android.content.Context) java.lang.Class.forName(r22).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 26, r3);
        r2 = (java.lang.String) r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0c2e, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0c45, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0c49, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0c58, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0c5c, code lost:
    
        if (r1 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0c5e, code lost:
    
        r1 = kotlin.startForeground.read((char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 4534), 6055 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), android.graphics.Color.red(0) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0c85, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0c91, code lost:
    
        r6 = new java.lang.Object[]{1941626675, 81604378625L, r3, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 6030, 24 - android.view.View.getDefaultSize(0, 0));
        r3 = in.juspay.hypersdk.core.CustomtabResult.$$d;
        r10 = new java.lang.Object[1];
        d((byte) (r3[1] + 1), r3[25], (byte) (-r3[35]), r10);
        r2.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0a92 A[Catch: all -> 0x0bd0, TryCatch #7 {all -> 0x0bd0, blocks: (B:85:0x05f4, B:87:0x05fa, B:88:0x063d, B:90:0x06cc, B:91:0x0713, B:93:0x0729, B:95:0x0732, B:96:0x0774, B:120:0x0a88, B:121:0x0a8c, B:123:0x0a92, B:125:0x0aa8, B:128:0x0ab5, B:132:0x0ac4, B:133:0x0acc, B:140:0x0b28, B:146:0x0baa, B:148:0x0bb0, B:149:0x0bb1, B:151:0x0bb3, B:153:0x0bba, B:154:0x0bbb, B:98:0x0789, B:110:0x0928, B:112:0x092e, B:113:0x0973, B:115:0x09e5, B:116:0x0a26, B:118:0x0a3c, B:119:0x0a82, B:156:0x0bbd, B:158:0x0bc4, B:159:0x0bc5, B:161:0x0bc7, B:163:0x0bce, B:164:0x0bcf, B:100:0x0862, B:102:0x0876, B:103:0x089d, B:142:0x0b2d, B:136:0x0af5, B:138:0x0afb, B:139:0x0b21, B:105:0x08a4, B:107:0x08b8, B:108:0x091c), top: B:286:0x05f4, outer: #12, inners: #3, #4, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0d64  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x103b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x111d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1166  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x1210  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x14ac  */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05fa A[Catch: all -> 0x0bd0, TryCatch #7 {all -> 0x0bd0, blocks: (B:85:0x05f4, B:87:0x05fa, B:88:0x063d, B:90:0x06cc, B:91:0x0713, B:93:0x0729, B:95:0x0732, B:96:0x0774, B:120:0x0a88, B:121:0x0a8c, B:123:0x0a92, B:125:0x0aa8, B:128:0x0ab5, B:132:0x0ac4, B:133:0x0acc, B:140:0x0b28, B:146:0x0baa, B:148:0x0bb0, B:149:0x0bb1, B:151:0x0bb3, B:153:0x0bba, B:154:0x0bbb, B:98:0x0789, B:110:0x0928, B:112:0x092e, B:113:0x0973, B:115:0x09e5, B:116:0x0a26, B:118:0x0a3c, B:119:0x0a82, B:156:0x0bbd, B:158:0x0bc4, B:159:0x0bc5, B:161:0x0bc7, B:163:0x0bce, B:164:0x0bcf, B:100:0x0862, B:102:0x0876, B:103:0x089d, B:142:0x0b2d, B:136:0x0af5, B:138:0x0afb, B:139:0x0b21, B:105:0x08a4, B:107:0x08b8, B:108:0x091c), top: B:286:0x05f4, outer: #12, inners: #3, #4, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06cc A[Catch: all -> 0x0bd0, TryCatch #7 {all -> 0x0bd0, blocks: (B:85:0x05f4, B:87:0x05fa, B:88:0x063d, B:90:0x06cc, B:91:0x0713, B:93:0x0729, B:95:0x0732, B:96:0x0774, B:120:0x0a88, B:121:0x0a8c, B:123:0x0a92, B:125:0x0aa8, B:128:0x0ab5, B:132:0x0ac4, B:133:0x0acc, B:140:0x0b28, B:146:0x0baa, B:148:0x0bb0, B:149:0x0bb1, B:151:0x0bb3, B:153:0x0bba, B:154:0x0bbb, B:98:0x0789, B:110:0x0928, B:112:0x092e, B:113:0x0973, B:115:0x09e5, B:116:0x0a26, B:118:0x0a3c, B:119:0x0a82, B:156:0x0bbd, B:158:0x0bc4, B:159:0x0bc5, B:161:0x0bc7, B:163:0x0bce, B:164:0x0bcf, B:100:0x0862, B:102:0x0876, B:103:0x089d, B:142:0x0b2d, B:136:0x0af5, B:138:0x0afb, B:139:0x0b21, B:105:0x08a4, B:107:0x08b8, B:108:0x091c), top: B:286:0x05f4, outer: #12, inners: #3, #4, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0729 A[Catch: all -> 0x0bd0, TryCatch #7 {all -> 0x0bd0, blocks: (B:85:0x05f4, B:87:0x05fa, B:88:0x063d, B:90:0x06cc, B:91:0x0713, B:93:0x0729, B:95:0x0732, B:96:0x0774, B:120:0x0a88, B:121:0x0a8c, B:123:0x0a92, B:125:0x0aa8, B:128:0x0ab5, B:132:0x0ac4, B:133:0x0acc, B:140:0x0b28, B:146:0x0baa, B:148:0x0bb0, B:149:0x0bb1, B:151:0x0bb3, B:153:0x0bba, B:154:0x0bbb, B:98:0x0789, B:110:0x0928, B:112:0x092e, B:113:0x0973, B:115:0x09e5, B:116:0x0a26, B:118:0x0a3c, B:119:0x0a82, B:156:0x0bbd, B:158:0x0bc4, B:159:0x0bc5, B:161:0x0bc7, B:163:0x0bce, B:164:0x0bcf, B:100:0x0862, B:102:0x0876, B:103:0x089d, B:142:0x0b2d, B:136:0x0af5, B:138:0x0afb, B:139:0x0b21, B:105:0x08a4, B:107:0x08b8, B:108:0x091c), top: B:286:0x05f4, outer: #12, inners: #3, #4, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0789 A[Catch: all -> 0x0bd0, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0bd0, blocks: (B:85:0x05f4, B:87:0x05fa, B:88:0x063d, B:90:0x06cc, B:91:0x0713, B:93:0x0729, B:95:0x0732, B:96:0x0774, B:120:0x0a88, B:121:0x0a8c, B:123:0x0a92, B:125:0x0aa8, B:128:0x0ab5, B:132:0x0ac4, B:133:0x0acc, B:140:0x0b28, B:146:0x0baa, B:148:0x0bb0, B:149:0x0bb1, B:151:0x0bb3, B:153:0x0bba, B:154:0x0bbb, B:98:0x0789, B:110:0x0928, B:112:0x092e, B:113:0x0973, B:115:0x09e5, B:116:0x0a26, B:118:0x0a3c, B:119:0x0a82, B:156:0x0bbd, B:158:0x0bc4, B:159:0x0bc5, B:161:0x0bc7, B:163:0x0bce, B:164:0x0bcf, B:100:0x0862, B:102:0x0876, B:103:0x089d, B:142:0x0b2d, B:136:0x0af5, B:138:0x0afb, B:139:0x0b21, B:105:0x08a4, B:107:0x08b8, B:108:0x091c), top: B:286:0x05f4, outer: #12, inners: #3, #4, #8, #13 }] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabResult.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = read + 71;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
