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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.zzpm;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzpk;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzpk extends zzpi {
    private static long AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static char[] IconCompatParcelizer;
    private static char RemoteActionCompatParcelizer;
    private static char[] read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final byte[] $$l = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15};
    private static final int $$m = 186;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {45, 96, -22, -65, 16, 2, -59, 61, 12, 4, -4, 9, -3, -51, TarConstants.LF_CONTIG, 17, -6, 18, 1, -2, -1, -50, 61, 10, 10, -65, 57, 16, 2, 4, 6, 3, -60, TarConstants.LF_GNUTYPE_LONGLINK, 3, -7, 7, -58, 80, 4, -21, -9, 0, 7, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -46, TarConstants.LF_LINK, -7, 25, -81, 33, 56, -13, 9, 10, -42, TarConstants.LF_CONTIG, 4, 2, -5, -3, 23, 3, -11, 18, -38, 40, 7, 0, -38, 35, 22, -10, -17, 21, 21, -11, 6, 11, 1, 21, -17, 17, -1, -5, 15, -11};
    private static final int $$k = 177;
    private static final byte[] $$d = {67, -110, -113, 74, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 253;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r6, int r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 101
            byte[] r0 = kotlin.zzpk.$$l
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpk.$$n(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 65
            byte[] r0 = kotlin.zzpk.$$d
            int r7 = r7 + 4
            int r5 = r5 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r5 = r5 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpk.g(int, int, short, java.lang.Object[]):void");
    }

    private static void h(int i, byte b, short s, Object[] objArr) {
        int i2 = b + 82;
        byte[] bArr = $$j;
        int i3 = i + 4;
        byte[] bArr2 = new byte[43 - s];
        int i4 = 42 - s;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i2 + i3;
            i3++;
            i2 = i6 - 4;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i2 = (i2 + bArr[i3]) - 4;
            i5 = i7;
        }
    }

    /* JADX INFO: renamed from: o.zzpk$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzpk$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "read", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) zzpk.class);
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
            int i4 = $11 + 59;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i2 >> i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.myTid() >> 22) + 36621), 2339 - TextUtils.indexOf((CharSequence) "", '0'), View.MeasureSpec.getSize(0) + 28, 480654850, false, $$n(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9701, Process.getGidForName("") + 27, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23784, TextUtils.indexOf("", "", 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-16740595) - Color.rgb(0, 0, 0)), 2340 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 28 - View.MeasureSpec.getSize(0), 480654850, false, $$n(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 9701 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 23783 - ImageFormat.getBitsPerPixel(0), 33 - ExpandableListView.getPackedPositionGroup(0L), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        int i7 = $10 + 117;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (downloadService.write < i) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 23784 - ExpandableListView.getPackedPositionType(0L), 32 - ExpandableListView.getPackedPositionChild(0L), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
            int i9 = $11 + 45;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    @Override // kotlin.zzpi, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, new char[]{23, ' ', 22, '!', 20, 23, 22, 3, 20, 25, 2, '\"', 31, 22, 3, 31, 13923, 13923}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 86), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 31, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), AndroidCharacter.getMirror('0') - '0', objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{23, ' ', 22, '!', 20, 23, 22, 3, 18, 2, 1, 5, 25, 4, 16, 28, '\n', 18, 16, 22, '!', 15, '#', '\"', 21, 22}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 94), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, (char) ((-16777216) - Color.rgb(0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i2 = MediaBrowserCompatItemReceiver + 47;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4534), 6054 - View.MeasureSpec.makeMeasureSpec(0, 0), 42 - Color.argb(0, 0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 13, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 45802), 23 - (Process.myPid() >> 22), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 63, new char[]{25, 0, 0, 25, 26, 19, 31, 19, 7, 26, 18, 15, 25, 24, 19, 15, 21, ' ', 23, 14, 14, 16, 5, 14, 17, 24, 24, 25, '\r', 29, 18, 29, 26, 0, 17, 6, '#', 18, 6, 29, '\r', 27, 15, 18, 18, '!', 27, 23, 29, '\f', 6, 26, '#', 23, '\b', 14, '\f', '!', 31, 3, '\t', ' ', 7, 29}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 99), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((ViewConfiguration.getWindowTouchSlop() >> 8) + 64, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 31797), 71 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 18, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + TarConstants.PREFIXLEN_XSTAR, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (55144 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 167, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), 208 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myTid() >> 22), 6030 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i4 = AudioAttributesImplApi26Parcelizer + 29;
                    MediaBrowserCompatItemReceiver = i4 % 128;
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
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char cRgb = (char) ((-16764033) - Color.rgb(0, 0, 0));
            int iRgb = Color.rgb(0, 0, 0) + 16778865;
            int iResolveSize = 26 - View.resolveSize(0, 0);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            g(bArr[53], bArr[140], (byte) ($$e & 42), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cRgb, iRgb, iResolveSize, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i6 = AudioAttributesImplApi26Parcelizer + 45;
            MediaBrowserCompatItemReceiver = i6 % 128;
            if (i6 % 2 == 0) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 13184);
                    int i7 = 1648 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iIndexOf = 26 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr2 = $$d;
                    Object[] objArr14 = new Object[1];
                    g(bArr2[65], bArr2[5], bArr2[8], objArr14);
                    objRemoteActionCompatParcelizer4 = startForeground.read(bitsPerPixel, i7, iIndexOf, -1033747278, false, (String) objArr14[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer5 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 13184);
                int iArgb = 1649 - Color.argb(0, 0, 0, 0);
                int i8 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte[] bArr3 = $$d;
                Object[] objArr15 = new Object[1];
                g(bArr3[65], bArr3[5], bArr3[8], objArr15);
                objRemoteActionCompatParcelizer5 = startForeground.read(modifierMetaStateMask, iArgb, i8, -1033747278, false, (String) objArr15[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
        } else {
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 12, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 59028), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 243, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new char[]{23, 22, '\"', 30, 16, 28, 16, 22, 2, 21, 27, '\b', '\r', 20, 27, 3}, (byte) (70 - Gravity.getAbsoluteGravity(0, 0)), objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, -531370795};
                byte[] bArr4 = $$j;
                Object[] objArr19 = new Object[1];
                h(bArr4[42], bArr4[15], (byte) (-bArr4[89]), objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                h((byte) (bArr4[50] - 1), (byte) (-bArr4[49]), (byte) (-bArr4[55]), objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char size = (char) (13183 - View.MeasureSpec.getSize(0));
                    int i9 = 1650 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                    byte[] bArr5 = $$d;
                    Object[] objArr21 = new Object[1];
                    g(bArr5[65], bArr5[5], bArr5[8], objArr21);
                    objRemoteActionCompatParcelizer6 = startForeground.read(size, i9, longPressTimeout, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 18, new char[]{23, ' ', 22, '!', 20, 23, 22, 3, 20, 25, 1, '\"', 14, 28, '\t', '\"', 20, '\f', 1, 23, 7, '\r'}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 119), objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    f(Gravity.getAbsoluteGravity(0, 0) + 15, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 250, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c = (char) (13184 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int trimmedLength = TextUtils.getTrimmedLength("") + 1649;
                        int iArgb2 = 26 - Color.argb(0, 0, 0, 0);
                        Object[] objArr24 = new Object[1];
                        g((short) ($$d[3] + 1), r8[5], r8[8], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c, trimmedLength, iArgb2, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 13183);
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1648;
                        int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr6 = $$d;
                        Object[] objArr25 = new Object[1];
                        g(bArr6[53], bArr6[140], (byte) ($$e & 42), objArr25);
                        objRemoteActionCompatParcelizer8 = startForeground.read(offsetAfter, i10, touchSlop, -133433128, false, (String) objArr25[0], null);
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
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) (4535 - (KeyEvent.getMaxKeyCode() >> 16)), 6054 - Drawable.resolveOpacity(0, 0), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
            try {
                Object[] objArr26 = {279969902, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.getCapsMode("", 0, 0), 6029 - MotionEvent.axisFromString(""), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                byte[] bArr7 = $$j;
                Object[] objArr27 = new Object[1];
                h(bArr7[96], bArr7[42], bArr7[115], objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        setContentView(R.layout.activity_schema_list);
        if (p0 == null) {
            int i13 = AudioAttributesImplApi26Parcelizer + 39;
            MediaBrowserCompatItemReceiver = i13 % 128;
            if (i13 % 2 == 0) {
                zzpm.Companion companion = zzpm.INSTANCE;
                CmcdConfigurationRequestConfig.write(this, R.id.container, zzpm.Companion.AudioAttributesCompatParcelizer());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            zzpm.Companion companion2 = zzpm.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.container, zzpm.Companion.AudioAttributesCompatParcelizer());
            int i14 = MediaBrowserCompatItemReceiver + 79;
            AudioAttributesImplApi26Parcelizer = i14 % 128;
            int i15 = i14 % 2;
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
            int i4 = $11 + 71;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $11 + 123;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myPid() >> 22), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7015, Color.alpha(0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(RemoteActionCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 1), ImageFormat.getBitsPerPixel(0) + 7016, View.MeasureSpec.getSize(0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 20126 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19367, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i9 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                int i10 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i10];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                            } else {
                                int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        int i14 = 0;
        while (i14 < i) {
            int i15 = $10 + 9;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr4[i14] = (char) (cArr4[i14] ^ 29927);
                i14 += 77;
            } else {
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
                i14++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // kotlin.zzpi, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 1;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new char[]{23, ' ', 22, '!', 20, 23, 22, 3, 18, 2, 1, 5, 25, 4, 16, 28, '\n', 18, 16, 22, '!', 15, '#', '\"', 21, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(KeyEvent.keyCodeFromString("") + 18, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 37), TextUtils.indexOf("", "", 0) + 5, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = MediaBrowserCompatItemReceiver + 97;
            AudioAttributesImplApi26Parcelizer = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatItemReceiver + 55;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getTapTimeout() >> 16)), 6054 - TextUtils.getOffsetAfter("", 0), 16777258 + Color.rgb(0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (Process.myPid() >> 22) + 6030, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x010f  */
    @Override // kotlin.zzpi, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpk.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0326  */
    @Override // kotlin.zzpi, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpk.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 91;
        AudioAttributesImplApi21Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.zzpi, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 29;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 19;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        read = new char[]{6488, 6475, 6428, 6496, 6406, 6468, 6494, 6467, 6429, 6464, 6492, 6427, 6474, 6430, 6507, 6416, 6481, 6417, 6469, 6471, 6473, 6476, 6465, 6426, 6424, 6431, 6491, 6524, 6505, 6425, 6478, 6523, 6520, 6477, 6490, 6470};
        RemoteActionCompatParcelizer = (char) 11444;
        IconCompatParcelizer = new char[]{56417, 59450, 46279, 16520, 3412, 56431, 59446, 46304, 16531, 3413, 55785, 58786, 45668, 32260, 2747, 55158, 58112, 45019, 29806, '*', 52420, 39059, 42333, 28514, 23419, 1967, 62346, 48734, 27374, 22202, 330, 52557, 47600, 25636, 20573, 7376, 51044, 45879, 32661, 11201, 5723, 49900, 36588, 31006, 9503, 4525, 56353, 34897, 29904, 16179, 60213, 55190, 33731, 20081, 15008, 59012, 53532, 40265, 18857, 13439, 57353, 44249, 38719, 17213, 3989, 64462, 42609, 37549, 24283, 2389, 62949, 41164, 38096, 51281, 15399, 29091, 42263, 39191, 52927, 690, 30221, 43917, 40954, 54050, 2252, 31896, 45163, 58470, 55792, 3394, 16706, 46768, 60132, 56919, 4997, 18431, 47996, 61644, 9410, 6201, 19563, 33245, 62727, 10618, 7904, 21223, 34310, 64467, 12192, 25383, 22721, 36039, 49211, 13373, 27099, 23897, 37247, 50860, 14926, 28235, 41941, 38822, 52082, 147, 29891, 43063, 39988, 53719, 1371, 31101, 44793, 57884, 54858, 3002, 32743, 56420, 59447, 46310, 16529, 3395, 55741, 58873, 45578, 32272, 2730, 55155, 58117, 44993, 29821, '1', 52440, 39058, 42327, 29169, 15871, 51796, 38431, 41652, 28528, 15109, 51151, 35945, 22584, 25819, 12427, 64864, 35322, 21913, 25154, 11776, 64165, 34659, 21270, 8131, 9316, 61478, 48334, 18644, 5418, 8695, 60802, 47633, 18156, 4780, 57210, 60237, 47064, 31854, 2096, 54467, 57478, 44336, 31156, 1436, 53771, 40615, 43706, 30552, 792, 53154, 38007, 40993, 2898, 16138, 25540, 38834, 55929, 3794, 56382, 59506, 46320, 16598, 3334, 55733, 58855, 45588, 32345, 2803, 55164, 58193, 45022, 29730, 'j', 52379, 39112, 42244, 29103, 15848, 51778, 38469, 41718, 28472, 15106, 51084, 35947, 22635, 25759, 12442, 64813, 35323, 21981, 25154, 11844, 64247, 15096, 3772, 21114, 42526, 60288, 16245, 809, 21717, 39053, 60539, 12759, 1422, 18773, 37605, 59045, 10846, 56425, 59439, 46323, 16529, 3395, 55778, 58802, 45687, 32273, 2730, 55158, 58141, 45009, 29794, ';'};
        AudioAttributesCompatParcelizer = 8315616736283912259L;
    }
}
