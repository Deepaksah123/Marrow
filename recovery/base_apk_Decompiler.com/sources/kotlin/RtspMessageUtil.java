package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.kt.base.BaseDaggerActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class RtspMessageUtil<P extends getExtendedEsFrChar> extends BaseDaggerActivity<P> {
    private static final byte[] $$l = {45, 96, -22, -65};
    private static final int $$o = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {124, -87, 60, -63, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$q = 74;
    private static final byte[] $$d = {79, -100, -79, 21, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 89;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;
    private static char RemoteActionCompatParcelizer = 57709;
    private static char write = 20571;
    private static char AudioAttributesCompatParcelizer = 44550;
    private static char IconCompatParcelizer = 9934;
    private static char[] read = {44946, 44984, 44987, 44986, 44991, 44985, 44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 45002, 45036, 45052, 45049, 45030, 45027, 45010, 45021, 45031, 45027, 45037, 45024, 44882, 44886, 44880, 44883, 44881, 44886, 44881, 44881, 44880, 44882};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(short r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 122 - r8
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = kotlin.RtspMessageUtil.$$l
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RtspMessageUtil.$$r(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.RtspMessageUtil.$$d
            int r7 = 190 - r7
            int r8 = 114 - r8
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = -1
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L26:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RtspMessageUtil.g(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.RtspMessageUtil.$$p
            int r8 = r8 + 65
            int r7 = r7 * 3
            int r1 = 31 - r7
            int r6 = r6 * 3
            int r6 = 54 - r6
            byte[] r1 = new byte[r1]
            int r7 = 30 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RtspMessageUtil.h(short, byte, byte, java.lang.Object[]):void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public NavigationBarViewSavedState onAddQueueItem() {
        int i = 2 % 2;
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(CmcdConfigurationRequestConfig.write(), null, null, 6, null);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 125;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return navigationBarViewSavedState;
        }
        throw null;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i3 = $10 + 83;
            $11 = i3 % 128;
            int i4 = 58224;
            if (i3 % 2 == 0) {
                cArr3[1] = cArr[isstopped.read];
                int i5 = isstopped.read;
                cArr3[1] = cArr[0];
            } else {
                cArr3[0] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            }
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $11 + 35;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (((long) AudioAttributesCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(IconCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 1505 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 22 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1322448859, false, $$r(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) RemoteActionCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1505 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 21 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1322448859, false, $$r(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i6++;
                    int i9 = $10 + 83;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 3 / 5;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[isstopped.read] = cArr3[0];
            cArr2[isstopped.read + 1] = cArr3[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 9016 - ExpandableListView.getPackedPositionGroup(0L), 58 - Color.red(0), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = read;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11613, (-16777196) - Color.rgb(0, 0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i8++;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.red(0) + 22959, (KeyEvent.getMaxKeyCode() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31590), 9862 - TextUtils.indexOf((CharSequence) "", '0'), View.MeasureSpec.getSize(0) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 37823), 9754 - Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i11 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i11, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i11);
            int i12 = $10 + 107;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 4;
            }
        }
        if (z) {
            char[] cArr6 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i14 = $10 + 105;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 << buildsetstopreasonintent.RemoteActionCompatParcelizer) % 0];
                    i2 = buildsetstopreasonintent.RemoteActionCompatParcelizer >> 1;
                } else {
                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    i2 = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i2;
                int i15 = $11 + 85;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
            i = 2;
            cArr3 = cArr6;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i17 = $11 + 105;
            $10 = i17 % 128;
            int i18 = i17 % i;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[i]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 5;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 18, new char[]{5350, 24254, 48496, 40840, 60149, 54397, 53385, 33036, 21177, 48951, 41392, 57423, 49123, 27917, 57649, 52344, 56908, 50506}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, new char[]{10643, 52959, 19597, 55531, 60486, 60326}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = MediaDescriptionCompat + 75;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                e(View.MeasureSpec.makeMeasureSpec(0, 0) + 26, new char[]{5350, 24254, 48496, 40840, 60149, 54397, 53385, 33036, 52422, 63086, 28901, 58419, 51964, 42708, 41262, 35977, 5035, 30923, 42429, 5583, 41441, 2275, 16350, 45341, 5861, 1155}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, new char[]{43274, 177, 35537, 28516, 50476, 55762, 20437, 35932, 54165, 53691, 6498, 15244, 23476, 8462, 41262, 35977, 58104, 28899}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 69;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4536), 6054 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 13, new char[]{51591, 53971, 40201, 31997, 63826, 62048, 18957, 47721, 3542, 38510, 58124, 40262, 15699, 19084, 7841, 11864, 21857, 44159, 26598, 52170, 38506, 61272, 24511, 45833, 38946, 44499, 60088, 45527, 30913, 11453, 26338, 17129, 19628, 18575, 5723, 42938, 41710, 48047, 14109, 21762, 52647, 40524, 50930, 19801, 13623, 24265, 65310, 6987}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 60, new char[]{49589, 54037, 26598, 52170, 49278, 55892, 31027, 32112, 2736, 53829, 20420, 38823, 55365, 64704, 31869, 57989, 44601, 56301, 58150, 39965, 41672, 27538, 40164, 24398, 63573, 23883, 18512, 31977, 62303, 41816, 26338, 17129, 48470, 25486, 1922, 25913, 47541, 4167, 48777, 26814, 25072, 63229, 56290, 48117, 19327, 42764, 61378, 52081, 60364, 43849, 27029, 796, 54235, 48721, 15710, 64476, 38946, 44499, 23507, 43196, 60628, 43474, 16226, 35788}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(64 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{63573, 23883, 5861, 1155, 34098, 21722, 65485, 36970, 16371, 16736, 64292, 15593, 11131, 20560, 16371, 16736, 11131, 20560, 63573, 23883, 24737, 39276, 39308, 13987, 29555, 32438, 12186, 43563, 13890, 31750, 5802, 40420, 60088, 45527, 9350, 54258, 44601, 56301, 51175, 63971, 34098, 21722, 65512, 47801, 49143, 12154, 1160, 50149, 18512, 46431, 20376, 40245, 15094, 5978, 52157, 56413, 29622, 60187, 43108, 6111, 39700, 3149, 41672, 27538}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 63, new char[]{13439, 13476, 50195, 53113, 18479, 50044, 3720, 53528, 57758, 3568, 4444, 48625, 37889, 2711, 8578, 60714, 45828, 46869, 30217, 64648, 14071, 64086, 16350, 45341, 36759, 40077, 23476, 8462, 51980, 31965, 18027, 37146, 14467, 48713, 49304, 13065, 21566, 55307, 14467, 48713, 16350, 45341, 17453, 54536, 62947, 27454, 55525, 3590, 42997, 4140, 25109, 64739, 779, 39307, 57426, 20635, 32159, 50030, 4136, 24589, 32021, 39642, 48456, 20591, 22503, 50836, 12726, 57725}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(false, new byte[]{1, 1, 0, 0, 1, 1}, new int[]{0, 6, 0, 4}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(35 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{24737, 39276, 14109, 21762, 46366, 29965, 29033, 53233, 40800, 47365, 60486, 23938, 8061, 20931, 3542, 38510, 34272, 10284, 55297, 10529, 15867, 13464, 37409, 52347, 24754, 63812, 64252, 25964, 9350, 54258, 49754, 25832, 6004, 1835, 44333, 31596}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - Color.blue(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i8 = MediaDescriptionCompat + 21;
                    MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
                    int i9 = i8 % 2;
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
            char c = (char) (13183 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 27;
            byte[] bArr = $$d;
            byte b = (byte) (bArr[61] - 1);
            Object[] objArr13 = new Object[1];
            g(b, (short) (b | 147), (byte) (-bArr[62]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, tapTimeout, packedPositionChild, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cKeyCodeFromString = (char) (13183 - KeyEvent.keyCodeFromString(""));
                int iMyTid = (Process.myTid() >> 22) + 1649;
                int iIndexOf = 26 - TextUtils.indexOf("", "", 0);
                Object[] objArr14 = new Object[1];
                g(r3[8], (short) 144, (byte) (-$$d[9]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cKeyCodeFromString, iMyTid, iIndexOf, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16, new char[]{15141, 55860, 42096, 2082, 29408, 19135, 5350, 24254, 15074, 16456, 32138, 34282, 51980, 31965, 16561, 48562}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, new char[]{17297, 33521, 50476, 55762, 41262, 35977, 42429, 5583, 4017, 53882, 25896, 54611, 27688, 60327, 20358, 27354}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 1450658915};
                byte[] bArr2 = $$p;
                Object[] objArr18 = new Object[1];
                h(bArr2[12], bArr2[27], (byte) 46, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = (byte) ($$q & 63);
                byte b3 = bArr2[49];
                Object[] objArr19 = new Object[1];
                h(b2, b3, b3, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cGreen = (char) (13183 - Color.green(0));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1649;
                    int tapTimeout2 = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                    Object[] objArr20 = new Object[1];
                    g(r7[8], (short) 144, (byte) (-$$d[9]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cGreen, edgeSlop, tapTimeout2, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{6, 22, 0, 0}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 11, new char[]{5647, 61577, 52422, 63086, 4866, 12757, 3673, 3730, 46699, 31604, 16872, 11868, 59726, 8515, 21742, 52181}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 13184);
                        int scrollBarFadeDuration = 1649 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                        Object[] objArr23 = new Object[1];
                        g(r8[8], (short) 111, (byte) (-$$d[9]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(bitsPerPixel, scrollBarFadeDuration, longPressTimeout, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char jumpTapTimeout = (char) (13183 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iIndexOf2 = 1648 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                        byte[] bArr3 = $$d;
                        byte b4 = (byte) (bArr3[61] - 1);
                        Object[] objArr24 = new Object[1];
                        g(b4, (short) (b4 | 147), (byte) (-bArr3[62]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(jumpTapTimeout, iIndexOf2, longPressTimeout2, -133433128, false, (String) objArr24[0], null);
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
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 6054, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i12 = MediaDescriptionCompat + 97;
            MediaBrowserCompatCustomActionResultReceiver = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr25 = {2015692795, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (TextUtils.lastIndexOf("", '0', 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 6030, (ViewConfiguration.getTapTimeout() >> 16) + 24);
                byte[] bArr4 = $$p;
                Object[] objArr26 = new Object[1];
                h(bArr4[49], bArr4[42], bArr4[12], objArr26);
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
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 85;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 3;
            MediaDescriptionCompat = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{5350, 24254, 48496, 40840, 60149, 54397, 53385, 33036, 52422, 63086, 28901, 58419, 51964, 42708, 41262, 35977, 5035, 30923, 42429, 5583, 41441, 2275, 16350, 45341, 5861, 1155}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{43274, 177, 35537, 28516, 50476, 55762, 20437, 35932, 54165, 53691, 6498, 15244, 23476, 8462, 41262, 35977, 58104, 28899}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 53;
                MediaDescriptionCompat = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 3;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.getCapsMode("", 0, 0)), 6054 - ExpandableListView.getPackedPositionGroup(0L), 'Z' - AndroidCharacter.getMirror('0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6029, View.MeasureSpec.makeMeasureSpec(0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 65;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 16, new char[]{5350, 24254, 48496, 40840, 60149, 54397, 53385, 33036, 52422, 63086, 28901, 58419, 51964, 42708, 41262, 35977, 5035, 30923, 42429, 5583, 41441, 2275, 16350, 45341, 5861, 1155}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(18 - KeyEvent.getDeadChar(0, 0), new char[]{43274, 177, 35537, 28516, 50476, 55762, 20437, 35932, 54165, 53691, 6498, 15244, 23476, 8462, 41262, 35977, 58104, 28899}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 105;
            MediaDescriptionCompat = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i5 = MediaDescriptionCompat + 91;
                MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
                int i6 = i5 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6054, 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(0), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0270  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 5490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RtspMessageUtil.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 57;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
