package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.BrowserPublicKeyCredentialRequestOptions;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setClientDataHash;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseSegmentUrl;", "RemoteActionCompatParcelizer", "Lo/parseSegmentUrl;", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setClientDataHash extends getAuthenticationExtensions {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int AudioAttributesImplApi21Parcelizer;
    private static char AudioAttributesImplApi26Parcelizer;
    private static char IconCompatParcelizer;
    private static char MediaBrowserCompatCustomActionResultReceiver;
    private static char MediaBrowserCompatItemReceiver;
    private static char[] read;
    private static char write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseSegmentUrl write;
    private static final byte[] $$l = {14, -40, -35, 110};
    private static final int $$m = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {27, -119, -113, 73, -66, 22, 1, 4, 6, 33, -4, -13, -6, 1, 1, -18, 16, 18, -5, 0, -4, -14, -66, 82, -6, -10, 10, -16, 25, 11, -2, -44, 43, -3, 2, -16, 18, -37, 16, 16, -16, 1, 6, -4, 16, -22, 12, 18, 7, 1, 4, -16, -37, 33, 16, -12, 5, -2, -44, 43, -3, 2, -16, 18, -37, 16, 16, -16, 1, 6, -4, 16, -22, 12, -66, 56, -3, 14, -47, 40, -2, 5, -34, 21, 16, -22, -17, 24, -6, 10, -81, 45, 18, 7, 1, 4, -16, -37, 33, 16, -12, 5, -2, -44, 43, -3, 2, -16, 18, -37, 16, 16, -16, 1, 6, -4, 16, -22, 12, -20};
    private static final int $$k = 69;
    private static final byte[] $$d = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 23, -13, 96, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 125;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r7, short r8, int r9) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r9 = r9 * 4
            int r9 = 122 - r9
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = kotlin.setClientDataHash.$$l
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setClientDataHash.$$n(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 4
            byte[] r1 = kotlin.setClientDataHash.$$d
            int r6 = 190 - r6
            int r7 = 114 - r7
            byte[] r0 = new byte[r0]
            int r5 = r5 + 3
            r2 = -1
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L25:
            r4 = r1[r6]
        L27:
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setClientDataHash.g(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 74 - r7
            byte[] r0 = kotlin.setClientDataHash.$$j
            int r8 = 111 - r8
            int r1 = r6 + 20
            byte[] r1 = new byte[r1]
            int r6 = r6 + 19
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2a
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
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setClientDataHash.h(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.setClientDataHash$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setClientDataHash$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "read", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent read(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) setClientDataHash.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i3] = cArr[isstopped.read];
            char c = 1;
            cArr3[1] = cArr[isstopped.read + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 17;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 1193402106669854891L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplApi26Parcelizer);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i10 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1504;
                        int iArgb = Color.argb(0, 0, 0, 0) + 21;
                        byte b = (byte) ($$m - 5);
                        byte b2 = b;
                        String str$$n = $$n(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(longPressTimeout, i10, iArgb, 1322448859, false, str$$n, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i11 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatItemReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) ($$m - 5);
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 1505, 22 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1322448859, false, $$n(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i11 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 9015 - MotionEvent.axisFromString(""), MotionEvent.axisFromString("") + 59, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i12 = $10 + 25;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.getAuthenticationExtensions, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        parseSegmentUrl parsesegmenturl;
        parseSegmentUrl parsesegmenturl2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(18 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{17, '\t', '\'', 24, 6, 20, '(', 17, '+', '\r', 17, '!', 27, '.', '\t', '.', 13840, 13840}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 3), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, new char[]{43152, 52529, 52103, 42897, 58378, 6546}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 23, new char[]{17, '\t', '\'', 24, 6, 20, '(', 17, 14, 30, '!', 14, 4, 18, 27, '\t', 27, '\b', 25, 30, 21, 17, 23, '.', 17, '%'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) + 30), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(17 - ImageFormat.getBitsPerPixel(0), new char[]{34776, 10558, 59005, 11632, 37755, 4387, 1826, 41978, 63055, 32939, 13038, 20540, 64365, 65143, 43556, 51681, 37428, 5651}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i2 = MediaBrowserCompatMediaItem + 15;
                    RatingCompat = i2 % 128;
                    int i3 = i2 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - MotionEvent.axisFromString("")), (Process.myTid() >> 22) + 6054, 42 - (KeyEvent.getMaxKeyCode() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 47, new char[]{'\f', '.', 14, '$', '\n', '\'', 17, 14, '.', 15, '+', 3, '*', '%', '(', '-', 16, '+', '\b', 18, '.', '-', '$', 0, '(', '$', ',', 15, '/', '&', 22, 19, '/', 23, 16, '.', 18, '\r', 16, 6, '-', 3, 5, '+', '$', 4, '%', '*'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 34), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, new char[]{34062, 33907, 56039, 31678, 59423, 11387, 18879, 3520, 55111, 55571, 50994, 38784, 53109, 22628, 18511, 53026, 54286, 28729, 9419, 62452, 30362, 5994, 47178, 48881, 59634, 61773, 6380, 34277, 25521, 59507, 43904, 63101, 46977, 39597, 5899, 5983, 3513, 39620, 35311, 52854, 58650, 41299, 64178, 48569, 64635, 5943, 37341, 7470, 32565, 16300, 35547, 53500, 22055, 27066, 51867, 59927, 42114, 20370, 50830, 13606, 16051, 5650, 39916, 21216}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 15, new char[]{19, ')', 17, '%', '/', '!', 18, '.', 13884, 13884, 5, '/', '%', 18, 13884, 13884, '%', 18, 19, ')', '!', '/', '/', 24, 2, '+', '$', 3, '.', 17, ')', '(', ',', 15, '\t', 2, 23, 2, '*', '&', '/', '!', '+', 16, '\f', 25, 16, 17, '-', '(', '%', 14, '\'', 19, '.', '\n', ')', 19, '0', 19, 16, 4, 25, '.'}, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 61), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32, new char[]{15887, 17102, 29326, 36168, 19293, 19909, 41687, 59175, 24045, 18299, 26846, 15394, 13480, 24210, 64661, 13310, 34054, 10684, 60153, 4122, 52397, 628, 3146, 38222, 27631, 24547, 64365, 65143, 12878, 8890, 7203, 7531, 58451, 46006, 41780, 52913, 30429, 61140, 58451, 46006, 3146, 38222, 61979, 22557, 52957, 61980, 19359, 23161, 39135, 60054, 21133, 9953, 30731, 42011, 52711, 35580, 60079, 50024, 64420, 51871, 41691, 65131, 16324, 42562, 15339, 18041, 5834, 17117}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(TextUtils.indexOf((CharSequence) "", '0') + 7, new char[]{5, 15, '$', '/', 26, '!'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 74), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 32, new char[]{'!', '/', 16, 6, 19, 25, 13853, 13853, '#', '(', '$', '(', '$', '#', '.', 15, ',', 1, '$', 6, 19, 27, 20, '$', '%', 0, 19, 23, '\t', 2, 7, '\'', '%', 19, 13854, 13854}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 3), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 6029 - Process.getGidForName(""), 24 - View.MeasureSpec.getSize(0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char c = (char) (13184 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1648;
            int iRgb = (-16777190) - Color.rgb(0, 0, 0);
            byte b = (byte) ($$e & 170);
            Object[] objArr13 = new Object[1];
            g(b, (short) (b | 147), $$d[62], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, i4, iRgb, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 13183);
                int i5 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1648;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                Object[] objArr14 = new Object[1];
                g((byte) (-$$d[8]), (short) 144, r0[9], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, i5, maximumDrawingCacheSize, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f(TextUtils.getCapsMode("", 0, 0) + 16, new char[]{37166, 57222, 25301, 31247, 16169, 53984, 14787, 21475, 56381, 20600, 42965, 8730, 12878, 8890, 65202, 3488}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(ExpandableListView.getPackedPositionChild(0L) + 17, new char[]{34984, 33434, 37755, 4387, 43556, 51681, 2149, 58329, 19271, 12970, '/', 53721, 58503, 39101, 31664, 28418}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = RatingCompat + 43;
            MediaBrowserCompatMediaItem = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 883498981};
                byte[] bArr = $$j;
                Object[] objArr18 = new Object[1];
                h(bArr[56], (byte) ($$k + 1), bArr[19], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = bArr[19];
                byte b3 = (byte) (b2 | 46);
                Object[] objArr19 = new Object[1];
                h(b2, b3, (byte) (b3 & 247), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 13183);
                    int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1648;
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 27;
                    Object[] objArr20 = new Object[1];
                    g((byte) (-$$d[8]), (short) 144, r3[9], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(longPressTimeout, i8, modifierMetaStateMask, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13, new char[]{17, '\t', '\'', 24, 6, 20, '(', 17, '+', '\r', 18, 5, 29, 11, 30, 2, ')', 29, '\r', '*', '\f', '\n'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 32), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 22, new char[]{'*', '\t', 14, 30, '\t', '+', ')', 3, 2, 23, '\t', 21, '\b', ')', 13828}, (byte) (5 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iMyTid = 26 - (Process.myTid() >> 22);
                        Object[] objArr23 = new Object[1];
                        g((byte) (-$$d[8]), (short) 111, r6[9], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(scrollBarFadeDuration, scrollDefaultDelay, iMyTid, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char touchSlop = (char) (13183 - (ViewConfiguration.getTouchSlop() >> 8));
                        int offsetBefore = 1649 - TextUtils.getOffsetBefore("", 0);
                        int i9 = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                        byte b4 = (byte) ($$e & 170);
                        Object[] objArr24 = new Object[1];
                        g(b4, (short) (b4 | 147), $$d[62], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(touchSlop, offsetBefore, i9, -133433128, false, (String) objArr24[0], null);
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
        int i10 = ((int[]) objArr[3])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4534), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6054, 42 - View.MeasureSpec.makeMeasureSpec(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            parsesegmenturl = null;
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i12 = RatingCompat + 9;
            MediaBrowserCompatMediaItem = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr25 = {-381107545, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 6030 - (Process.myPid() >> 22), Color.blue(0) + 24);
                byte[] bArr2 = $$j;
                byte b5 = (byte) (bArr2[48] + 1);
                byte b6 = bArr2[0];
                Object[] objArr26 = new Object[1];
                h(b5, b6, (byte) (b6 + 2), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            parsesegmenturl = null;
        }
        CmcdConfigurationRequestConfig.write(this, null, R.attr.colorSurfaceVariant6, R.attr.colorSurfaceVariant6, false, 9);
        super.onCreate(p0);
        parseSegmentUrl parsesegmenturlIconCompatParcelizer = parseSegmentUrl.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parsesegmenturlIconCompatParcelizer, "");
        this.write = parsesegmenturlIconCompatParcelizer;
        if (parsesegmenturlIconCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parsesegmenturl2 = parsesegmenturl;
        } else {
            parsesegmenturl2 = parsesegmenturlIconCompatParcelizer;
        }
        setContentView(parsesegmenturl2.IconCompatParcelizer());
        if (p0 == null) {
            BrowserPublicKeyCredentialRequestOptions.Companion remoteActionCompatParcelizer = BrowserPublicKeyCredentialRequestOptions.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.container, BrowserPublicKeyCredentialRequestOptions.Companion.RemoteActionCompatParcelizer());
        }
    }

    private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = read;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Drawable.resolveOpacity(0, 0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7015, 30 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7015, (ViewConfiguration.getJumpTapTimeout() >> 16) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 79;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            int i9 = $10 + 79;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 48194), TextUtils.indexOf((CharSequence) "", '0') + 20127, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.indexOf("", "", 0), 19368 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 19, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            int i12 = $11 + 85;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i14 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i14];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i15];
                        } else {
                            int i16 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i17 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i16];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i17];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    @Override // kotlin.getAuthenticationExtensions, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setClientDataHash.onResume():void");
    }

    @Override // kotlin.getAuthenticationExtensions, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 69;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new char[]{17, '\t', '\'', 24, 6, 20, '(', 17, 14, 30, '!', 14, 4, 18, 27, '\t', 27, '\b', 25, 30, 21, 17, 23, '.', 17, '%'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 57), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, new char[]{34776, 10558, 59005, 11632, 37755, 4387, 1826, 41978, 63055, 32939, 13038, 20540, 64365, 65143, 43556, 51681, 37428, 5651}, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i3 = MediaBrowserCompatMediaItem + 65;
                    RatingCompat = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 4 % 5;
                    }
                }
            }
            if (baseContext != null) {
                int i5 = RatingCompat + 71;
                MediaBrowserCompatMediaItem = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.argb(0, 0, 0, 0)), 6054 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 6030 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0') + 25, -861814097, false, "read", new Class[]{Context.class});
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
            return;
        }
        getBaseContext();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0831 A[Catch: all -> 0x02bd, TryCatch #16 {all -> 0x02bd, blocks: (B:211:0x0ea9, B:213:0x0eaf, B:214:0x0ed5, B:247:0x12b5, B:249:0x12bb, B:250:0x12e3, B:228:0x106c, B:230:0x108f, B:231:0x10d7, B:178:0x0a3e, B:180:0x0a44, B:181:0x0a6e, B:134:0x082b, B:136:0x0831, B:137:0x085b, B:22:0x00e8, B:24:0x00ee, B:25:0x0115, B:27:0x0233, B:29:0x0264, B:30:0x02b7), top: B:301:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06dc A[Catch: all -> 0x0793, TryCatch #12 {all -> 0x0793, blocks: (B:94:0x06d6, B:96:0x06dc, B:97:0x0704), top: B:293:0x06d6, outer: #1 }] */
    @Override // kotlin.getAuthenticationExtensions, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setClientDataHash.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 0;
        MediaBrowserCompatItemReceiver();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 43;
        AudioAttributesImplApi21Parcelizer = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.getAuthenticationExtensions, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 113;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatMediaItem + 49;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    static void MediaBrowserCompatItemReceiver() {
        read = new char[]{11454, 6417, 6431, 11444, 6523, 11451, 6522, 6468, 6491, 6467, 6470, 6475, 11448, 6465, 6464, 6424, 6473, 11441, 6430, 6406, 6474, 11447, 6494, 6492, 6524, 6490, 6426, 11445, 6488, 11443, 11449, 6520, 6481, 11450, 6507, 6478, 6469, 11440, 6476, 6416, 6425, 6405, 11446, 6428, 6477, 6427, 6505, 6429, 6471};
        IconCompatParcelizer = (char) 11445;
        write = (char) 30717;
        MediaBrowserCompatItemReceiver = (char) 23937;
        MediaBrowserCompatCustomActionResultReceiver = (char) 5350;
        AudioAttributesImplApi26Parcelizer = (char) 32732;
    }
}
