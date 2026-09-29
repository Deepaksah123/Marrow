package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setThumbStrokeColorResource extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$l = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15};
    private static final int $$m = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarConstants.LF_NORMAL, -108, 98, 5, -64, 58, -1, 16, -31, 28, 6, -18, 12, -41, TarConstants.LF_BLK, -14, 1, 0, 14, -12, 0, -31, TarConstants.LF_SYMLINK, -2, -16, 20, -10, 7, 0, -24, 31, -78, 30, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 77, 1, -21, 13, -4, -8, 12, -14};
    private static final int $$k = 152;
    private static final byte[] $$d = {25, 68, TarConstants.LF_LINK, 97, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 184;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static long AudioAttributesCompatParcelizer = -3498762522182953692L;
    private static int MediaBrowserCompatCustomActionResultReceiver = -992919238;
    private static char AudioAttributesImplApi26Parcelizer = 54564;
    private static long AudioAttributesImplApi21Parcelizer = -914117263931121998L;
    private final Object IconCompatParcelizer = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r6, short r7, short r8) {
        /*
            byte[] r0 = kotlin.setThumbStrokeColorResource.$$l
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r6 = r6 * 2
            int r6 = r6 + 103
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbStrokeColorResource.$$n(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 4
            byte[] r1 = kotlin.setThumbStrokeColorResource.$$d
            int r8 = 190 - r8
            int r7 = 114 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
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
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbStrokeColorResource.g(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 60 - r5
            int r7 = 119 - r7
            byte[] r1 = kotlin.setThumbStrokeColorResource.$$j
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            int r5 = 59 - r5
            r2 = -1
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L25
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L23:
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbStrokeColorResource.h(int, int, int, java.lang.Object[]):void");
    }

    setThumbStrokeColorResource() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setThumbStrokeColorResource.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setThumbStrokeColorResource.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 37;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 79;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
            this.write = getsubjectstatWrite;
            int i3 = 25 / 0;
            if (!getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                return;
            }
        } else {
            getSubjectStat getsubjectstatWrite2 = AudioAttributesImplBaseParcelizer().write();
            this.write = getsubjectstatWrite2;
            if (!getsubjectstatWrite2.RemoteActionCompatParcelizer()) {
                return;
            }
        }
        int i4 = AudioAttributesImplBaseParcelizer + 61;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        if (i5 != 0) {
            throw null;
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i3 = $11 + 55;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = $11 + 105;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38460 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 532, TextUtils.indexOf("", "", 0) + 8, -735610793, false, $$n((byte) ($$m & 63), b, b), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (AudioAttributesImplApi21Parcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b2 = (byte) 0;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36622 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 2341, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, 188119637, false, $$n((byte) ($$m & 62), b2, b2), new Class[]{Object.class, Object.class});
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
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b3 = (byte) 0;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (36621 - (ViewConfiguration.getPressedStateDuration() >> 16)), 2340 - (ViewConfiguration.getScrollBarSize() >> 8), 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 188119637, false, $$n((byte) ($$m & 62), b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void e(char[] cArr, int i, char[] cArr2, char[] cArr3, char c, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-16754468) - Color.rgb(0, 0, 0), MotionEvent.axisFromString("") + 37, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - ((Process.getThreadPriority(0) + 20) >> 6)), 2721 - (Process.myPid() >> 22), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37, 1895162189, false, $$n(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 15713 - TextUtils.indexOf("", ""), 65 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (Process.getGidForName("") + 40977), View.resolveSizeAndState(0, 0, 0) + 6122, 29 - ExpandableListView.getPackedPositionType(0L), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            int i6 = $10 + 19;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 117;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 100, new char[]{44021, 7430, 22404, 19542, 58753, 44418, 57669, 52715, 9081, 39280, 43317, 16918, 47058, 39596, '#', 41289, 40745, 62947}, new char[]{51622, 17158, 3262, 65212}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 48105), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, 1558344488 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{30490, 11352, 24245, 27748, 27572}, new char[]{10394, 57971, 16476, 849}, (char) (20801 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 6732, new char[]{52504, 55130, 63879, 33772, 42018, 20113, 20691, 30028, 8048, 8636, 51723, 60440, 63140, 39155, 48443, 18323, 27103, 29197, 5223, 16055, 49961, 58688, 36757, 37367, 47648, 23704}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 8202, new char[]{52506, 60705, 36177, 44428, 19880, 28150, 3075, 11267, 52321, 60572, 36055, 44287, 20230, 28497, 3963, 12211, 53190, 61418}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - KeyEvent.normalizeMetaState(0)), 6054 - (Process.myPid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 23011, new char[]{52506, 38049, 32403, 49368, 43694, 3260, 54934, 47200, 549, 58394, 19976, 4207, 64000, 23574, 10219, 35247, 21401, 13729, 40880, 25054, 52174, 44397, 30529, 55563, 41849, 1338, 61279, 46823, 6310, 58001, 17549, 12026, 61628, 23238, 15413, 34427, 26703, 12891, 37941, 32341, 49173, 43967, 3490, 55171, 47613, 1001, 58761, 20383}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, new char[]{44738, 29578, 30153, 17012, 28597, 60559, 38167, 24059, 40111, 54281, 8599, 53098, 27307, 49894, 5962, 14274, 29173, 46411, 60682, 19205, 29486, 57927, 32633, 1258, 40946, 59059, 12149, 44459, 35629, 24464, 3544, 51517, 44132, 56985, 29194, 65199, 43188, 6192, 6462, 9662, 35201, 49979, 25604, 40676, 5859, 6931, 35270, 8996, 24110, 27832, 18146, 27624, 23731, 46836, 37647, 2752, 55288, 5638, 17064, 28779, 34763, 33687, 45717, 1861}, new char[]{27498, 30271, 44124, 35505}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((-16728833) - Color.rgb(0, 0, 0), new char[]{52507, 29111, 46310, 64480, 16052, 32176, 41184, 59320, 10981, 27114, 44218, 54205, 5813, 21995, 39151, 57324, 689, 16887, 34037, 52133, 3751, 19875, 61600, 14242, 31400, 47611, 64763, 9125, 26286, 42412, 59562, 12192, 21165, 37319, 54416, 7105, 24260, 40391, 49296, 1990, 19088, 35228, 52426, 29596, 46798, 62872, 14491, 32713, 41628, 57810, 9425, 27605, 44676, 60804, 4224, 22483, 39552, 55772, 7306, 17374, 34443, 50573, 2189, 20352}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, (-1678422194) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{29865, 44572, 27122, 60224, 38334, 62219, 4483, 12415, 24489, 45723, 64057, 52537, 22670, 34292, 56105, 33719, 20956, 39616, 65492, 31363, 42629, 39459, 52195, 18685, 42438, 35679, 63342, 34329, 28991, 58617, 5351, 19863, 20679, 40110, 33001, 44176, 44047, 32283, 38774, 46911, 21154, 38513, 12309, 1263, 14552, 45450, 39068, 64348, 58606, 63178, 33194, 53513, 2989, 7892, 21787, 13571, 17992, 32680, 39487, 10978, 54884, 46952, 1229, 10199, 33663, 15728, 51184}, new char[]{19768, 62799, 40859, 21241}, (char) (Gravity.getAbsoluteGravity(0, 0) + 63903), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, View.resolveSize(0, 0), new char[]{53993, 55272, 38218, 60171, 39241, 51837}, new char[]{27226, 24621, 22455, 47493}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 34125), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 34739, new char[]{52555, 19195, 49789, 23127, 54147, 27444, 58234, 30893, 61644, 2058, 33249, 6640, 37243, 10563, 42631, 15922, 46717, 53165, 18370, 57097, 21735, 60644, 25643, 64577, 30167, 36149, 1334, 33450, 6874, 37467, 11232, 41906, 15144, 45835, 51337, 16438}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), AndroidCharacter.getMirror('0') + 5982, 24 - KeyEvent.getDeadChar(0, 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char cResolveSize = (char) (13183 - View.resolveSize(0, 0));
            int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0, 0);
            int jumpTapTimeout = 26 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i4 = $$e;
            Object[] objArr13 = new Object[1];
            g((byte) (i4 & 110), (byte) (-$$d[62]), (short) (i4 + 3), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cResolveSize, iLastIndexOf, jumpTapTimeout, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char keyRepeatTimeout = (char) (13183 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 27;
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                g(bArr[8], bArr[2], (short) ($$e & 980), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(keyRepeatTimeout, capsMode, bitsPerPixel, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{55940, 3177, 30418, 44589, 14692, 50231, 37240, 31009, 33742, 18844, 20726, 30973, 3552, 5602, 15053, 42277}, new char[]{48201, 64500, 11126, 41000}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 10248), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{9431, 33841, 14132, 49713, 62438, 53296, 19989, 57222, 58142, 59270, 25192, 51428, 44411, 48407, 51171, 63892}, new char[]{60390, 64263, 7210, 13505}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 49426), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 592918917};
                byte b = $$j[17];
                Object[] objArr18 = new Object[1];
                h(b, (byte) (b | 94), r0[58], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h((byte) 56, r0[72], r0[3], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char offsetAfter = (char) (13183 - TextUtils.getOffsetAfter("", 0));
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 1649;
                    int iAxisFromString = 25 - MotionEvent.axisFromString("");
                    byte[] bArr2 = $$d;
                    Object[] objArr20 = new Object[1];
                    g(bArr2[8], bArr2[2], (short) ($$e & 980), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(offsetAfter, capsMode2, iAxisFromString, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 40236, new char[]{52504, 20538, 63303, 6796, 47522, 56561, 25107, 33132, 9342, 19359, 61077, 3525, 37660, 13891, 21883, 63679, 8132, 41671, 49215, 26433, 35486, 10659}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 915492822, new char[]{13913, 21901, 36020, 18913, 54587, 37335, 40435, 65151, 49570, 23777, 28049, 32593, 65063, 52532, 64617}, new char[]{19719, 28336, 35017, 21082}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 23140), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 13183);
                        int iMyPid = 1649 - (Process.myPid() >> 22);
                        int iMyTid = (Process.myTid() >> 22) + 26;
                        byte[] bArr3 = $$d;
                        Object[] objArr23 = new Object[1];
                        g(bArr3[8], bArr3[2], (short) 111, objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(deadChar, iMyPid, iMyTid, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char minimumFlingVelocity = (char) (13183 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1648;
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 26;
                        int i6 = $$e;
                        Object[] objArr24 = new Object[1];
                        g((byte) (i6 & 110), (byte) (-$$d[62]), (short) (i6 + 3), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(minimumFlingVelocity, i5, deadChar2, -133433128, false, (String) objArr24[0], null);
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
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 4535), 6054 - (KeyEvent.getMaxKeyCode() >> 16), 41 - MotionEvent.axisFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i9 = MediaBrowserCompatItemReceiver;
            int i10 = i9 + 111;
            AudioAttributesImplBaseParcelizer = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 95;
            AudioAttributesImplBaseParcelizer = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr25 = {1251855956, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.getMode(0), 6029 - MotionEvent.axisFromString(""), (ViewConfiguration.getTouchSlop() >> 8) + 24);
                byte b2 = (byte) ($$j[30] + 1);
                byte b3 = b2;
                Object[] objArr26 = new Object[1];
                h(b2, b3, (byte) (b3 + 5), objArr26);
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
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.write;
        if (getsubjectstat != null) {
            int i2 = MediaBrowserCompatItemReceiver + 101;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 == 0) {
                int i4 = 4 / 0;
            }
            int i5 = AudioAttributesImplBaseParcelizer + 63;
            MediaBrowserCompatItemReceiver = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            }
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 69;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (i3 == 0) {
            return ishighlightedAudioAttributesImplBaseParcelizer.af_();
        }
        ishighlightedAudioAttributesImplBaseParcelizer.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplBaseParcelizer + 27;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 83;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (!this.read) {
            this.read = true;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 115;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 73;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatItemReceiver + 17;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((ViewConfiguration.getFadingEdgeLength() >> 16) + 6733, new char[]{52504, 55130, 63879, 33772, 42018, 20113, 20691, 30028, 8048, 8636, 51723, 60440, 63140, 39155, 48443, 18323, 27103, 29197, 5223, 16055, 49961, 58688, 36757, 37367, 47648, 23704}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 8202, new char[]{52506, 60705, 36177, 44428, 19880, 28150, 3075, 11267, 52321, 60572, 36055, 44287, 20230, 28497, 3963, 12211, 53190, 61418}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = AudioAttributesImplBaseParcelizer + 67;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplBaseParcelizer + 71;
            MediaBrowserCompatItemReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = AudioAttributesImplBaseParcelizer + 117;
            MediaBrowserCompatItemReceiver = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - View.combineMeasuredStates(0, 0)), (Process.myTid() >> 22) + 6054, TextUtils.indexOf("", "", 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 6030 - TextUtils.indexOf("", ""), 24 - TextUtils.getTrimmedLength(""), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplBaseParcelizer + 63;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6733, new char[]{52504, 55130, 63879, 33772, 42018, 20113, 20691, 30028, 8048, 8636, 51723, 60440, 63140, 39155, 48443, 18323, 27103, 29197, 5223, 16055, 49961, 58688, 36757, 37367, 47648, 23704}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 8122, new char[]{52506, 60705, 36177, 44428, 19880, 28150, 3075, 11267, 52321, 60572, 36055, 44287, 20230, 28497, 3963, 12211, 53190, 61418}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatItemReceiver + 117;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - ExpandableListView.getPackedPositionChild(0L)), ExpandableListView.getPackedPositionType(0L) + 6054, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 6030, ImageFormat.getBitsPerPixel(0) + 25, -861814097, false, "read", new Class[]{Context.class});
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
        int i6 = AudioAttributesImplBaseParcelizer + 105;
        MediaBrowserCompatItemReceiver = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00e4  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r38) {
        /*
            Method dump skipped, instruction units count: 6540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbStrokeColorResource.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 43;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplBaseParcelizer + 87;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }
}
