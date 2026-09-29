package com.marrow.ui.activities.onboarding.deeplinkroute;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
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
import kotlin.buildSetStopReasonIntent;
import kotlin.clearDownloadManagerHelpers;
import kotlin.setCombineUpright;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
public final class DeeplinkActivity extends setCombineUpright {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {118, 56, TarConstants.LF_SYMLINK, 93, 67, -74, 2, 15, -5, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, 34, -18, -11, 10, 13, -10, 15, -6, -1, 25, -27, 8, 74, -44, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$h = 21;
    private static final byte[] $$a = {20, 28, 18, 12, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 226;
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    private static int AudioAttributesCompatParcelizer = 1000326179;
    private static char[] read = {45033, 44885, 44884, 44887, 44885, 44885, 44906, 44864, 44864, 44865, 44907, 44887, 44887, 44924, 44884, 44879, 44884, 44907, 44904, 44914, 44906, 44877, 44866, 44906, 44924, 44914, 44904, 44906, 44927, 44887, 44879, 44879, 44876, 44876, 44867, 44905, 44914, 44904, 44864, 44866, 44877, 44866, 44864, 44884, 44906, 44904, 44925, 44925, 44906, 44906, 44885, 44879, 44885, 44884, 44887, 44884, 44879, 44886, 44885, 44906, 44915, 44925, 44887, 44877, 44817, 44730, 44705, 44708, 44711, 44705, 44730, 44722, 44735, 44735, 44727, 44717, 44689, 44731, 44734, 44694, 44944, 44984, 44985, 44989, 44991, 44990, 44988, 44989, 44988, 44988, 44991};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkActivity.$$a
            int r7 = 114 - r7
            int r1 = r5 + 4
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r0[r6]
        L24:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            int r6 = r6 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkActivity.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkActivity.$$g
            int r6 = 111 - r6
            int r8 = 55 - r8
            int r7 = r7 * 2
            int r7 = r7 + 6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r8]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L28:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + 2
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkActivity.d(byte, short, byte, java.lang.Object[]):void");
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        int i5 = $10 + 31;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(AudioAttributesCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getTrimmedLength(""), Color.argb(0, 0, 0, 0) + 23704, 32 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - Drawable.resolveOpacity(0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 18945, 28 - TextUtils.indexOf("", ""), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
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
        }
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
            int i8 = $11 + 119;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                try {
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - Color.green(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 18944, 28 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $10 + 47;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i11 = 14 / 0;
            objArr[0] = str;
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = read;
        if (cArr != null) {
            int i6 = $11 + 55;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 11613 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.argb(0, 0, 0, 0) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = $10 + 105;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22958, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - ExpandableListView.getPackedPositionGroup(0L)), 9862 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 65 - KeyEvent.getDeadChar(0, 0), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                        int i13 = $11 + 39;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                try {
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 9754 - TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    int i15 = $10 + 45;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i17 = $10 + 15;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i19 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i19, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i19);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01e9  */
    @Override // kotlin.setCombineUpright, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkActivity.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.setCombineUpright, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a('<' - AndroidCharacter.getMirror('0'), false, new char[]{17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 83, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 119, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(10 - TextUtils.indexOf((CharSequence) "", '0', 0), true, new char[]{2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535}, ((byte) KeyEvent.getModifierMetaStateMask()) + 19, 130 - Color.red(0), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = write + 7;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = write + 109;
            IconCompatParcelizer = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getPressedStateDuration() >> 16)), 6054 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 42 - (ViewConfiguration.getScrollBarSize() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0), 6029 - TextUtils.lastIndexOf("", '0', 0), Color.red(0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4534 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6054, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 6029 - Process.getGidForName(""), View.resolveSizeAndState(0, 0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    @Override // kotlin.setCombineUpright, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkActivity.onPause():void");
    }

    @Override // kotlin.setCombineUpright, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Context applicationContext;
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        int i2 = 0;
        Object[] objArr3 = new Object[1];
        a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, false, new char[]{'\f', 0, 2, 16, 16, 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65517, 15}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 97, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 113, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 45, true, new char[]{1, 65517, 17, 5, 65532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 104, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 127, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (context == null) {
                applicationContext = context;
            } else if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
                int i3 = IconCompatParcelizer + 99;
                write = i3 % 128;
                int i4 = i3 % 2;
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
            if (applicationContext != null) {
                int i5 = write + 39;
                IconCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4534), 6054 - View.MeasureSpec.getSize(0), 42 - TextUtils.getCapsMode("", 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 12, false, new char[]{65517, 27, 65513, 22, 65512, 65510, 65511, 65509, 26, 65511, 65515, 26, 23, 24, 23, 65516, 25, 65512, 65518, 65514, 65517, 65518, 27, 26, 24, 65514, 65509, 27, 24, 25, 22, 23, 65513, 65515, 65512, 65518, 26, 27, 25, 65514, 65509, 26, 24, 65509, 65512, 26, 27, 65518}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 44, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 89, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, false, new char[]{'!', '!', '#', 65518, '!', 65517, 65526, 65522, 65517, 65518, 65526, 65521, 65522, 65525, '#', '\"', ' ', 65522, '\"', 65520, 65524, 65517, ' ', ' ', 65517, 65524, 30, 65524, 65523, 65522, 65524, '!', 31, 65517, 65518, '!', 65523, 30, '\"', 30, 65526, 65523, 65525, 65521, 65526, 31, 65518, 65518, 65517, 65526, 65524, 65519, 65517, 65517, 65521, 31, 65520, '#', 65519, 65520, 65517, 65525, 65524, 31}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 27, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 56, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(false, new byte[]{1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}, new int[]{0, 64, TarConstants.CHKSUM_OFFSET, 10}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a((ViewConfiguration.getFadingEdgeLength() >> 16) + 21, false, new char[]{65485, 65535, 14, 7, 65485, 7, '\f', 5, 3, 17, 18, 65485, 20, 65488, 65485, 3, 20, 3, '\f', 18, 17, 6, 18, 18, 14, 17, 65496, 65485, 65485, 2, 65535, 7, '\n', 23, 16, '\r', 19, '\f', 2, 17, 65484, 18, 6, 16, 3, 65535, 18, 1, 65535, 17, 18, 65484, 5, 19, 65535, 16, 2, 17, 15, 19, 65535, 16, 3, 65484, 1, '\r', 11}, 66 - TextUtils.lastIndexOf("", '0', 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 118, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 6, false, new char[]{65535, 2, 65532, 0, 7, 65532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 109, 74 - TextUtils.indexOf("", ""), objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 18, true, new char[]{65522, '!', 65527, '&', 65517, 65520, 65522, '\"', 65529, 65517, 65527, 65524, 65526, 65524, 65517, '&', 65528, '&', 65528, 65517, 65521, 65521, 65522, 65526, 65527, '\"', 65521, 65522, 65526, 65526, '!', 65521, '&', '#', '%', 65527}, 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 31, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.rgb(0, 0, 0) + 16783246, 24 - View.resolveSize(0, 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
        try {
            try {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 61148);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2145;
                    int i7 = 12 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte b = $$a[5];
                    byte b2 = b;
                    Object[] objArr12 = new Object[1];
                    c(b2, (short) (b2 | 109), b, objArr12);
                    objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionGroup, jumpTapTimeout, i7, -2136739198, false, (String) objArr12[0], null);
                }
                long j = ((Field) objRemoteActionCompatParcelizer3).getLong(null);
                Object[] objArr13 = new Object[1];
                a((ViewConfiguration.getLongPressTimeout() >> 16) + 7, true, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 92, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 119, objArr13);
                Class<?> cls2 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 88, true, new char[]{'\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, 15 - TextUtils.getOffsetBefore("", 0), 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr14);
                long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(301834150);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 61148);
                    int iBlue = Color.blue(0) + 2145;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 13;
                    byte[] bArr = $$a;
                    Object[] objArr15 = new Object[1];
                    c((byte) (bArr[4] - 1), (short) 112, bArr[70], objArr15);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cMyTid, iBlue, iLastIndexOf, 1874090803, false, (String) objArr15[0], null);
                }
                if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char deadChar = (char) (61148 - KeyEvent.getDeadChar(0, 0));
                        int maxKeyCode = 2145 - (KeyEvent.getMaxKeyCode() >> 16);
                        int jumpTapTimeout2 = 12 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        Object[] objArr16 = new Object[1];
                        c((byte) (-$$a[164]), (short) 139, r4[62], objArr16);
                        objRemoteActionCompatParcelizer5 = startForeground.read(deadChar, maxKeyCode, jumpTapTimeout2, -1530294468, false, (String) objArr16[0], null);
                    }
                    list = (List) ((Field) objRemoteActionCompatParcelizer5).get(null);
                } else {
                    Object[] objArr17 = new Object[1];
                    a(TextUtils.getCapsMode("", 0, 0) + 1, false, new char[]{11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3}, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 112, objArr17);
                    Class<?> cls3 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    b(false, new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, new int[]{64, 16, 199, 3}, objArr18);
                    int iIntValue2 = ((Integer) cls3.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr19 = {-1520676913};
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-173351824);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            objRemoteActionCompatParcelizer6 = startForeground.read((char) (KeyEvent.keyCodeFromString("") + 45845), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 912, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, -1948051227, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr20 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer6).newInstance(objArr19)};
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(1891595430);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char c = (char) (61149 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2145;
                                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 12;
                                byte[] bArr2 = $$a;
                                Object[] objArr21 = new Object[1];
                                c((byte) (-bArr2[45]), (short) 168, (byte) (-bArr2[61]), objArr21);
                                objRemoteActionCompatParcelizer7 = startForeground.read(c, scrollBarSize, iIndexOf, 251047987, false, (String) objArr21[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0), 557 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - TextUtils.getTrimmedLength(""))});
                            }
                            list = (List) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr20);
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                char c2 = (char) (61149 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int minimumFlingVelocity = 2145 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int minimumFlingVelocity2 = 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                Object[] objArr22 = new Object[1];
                                c((byte) (-$$a[164]), (short) 139, r6[62], objArr22);
                                objRemoteActionCompatParcelizer8 = startForeground.read(c2, minimumFlingVelocity, minimumFlingVelocity2, -1530294468, false, (String) objArr22[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer8).set(null, list);
                            Object[] objArr23 = new Object[1];
                            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 29, true, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 88, objArr23);
                            Class<?> cls4 = Class.forName((String) objArr23[0]);
                            Object[] objArr24 = new Object[1];
                            a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, true, new char[]{'\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 11, 127 - (Process.myPid() >> 22), objArr24);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(301834150);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 61148);
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 2146;
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12;
                                Object[] objArr25 = new Object[1];
                                c((byte) ($$a[4] - 1), (short) 112, r11[70], objArr25);
                                objRemoteActionCompatParcelizer9 = startForeground.read(capsMode, iLastIndexOf2, fadingEdgeLength, 1874090803, false, (String) objArr25[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-18205161);
                            if (objRemoteActionCompatParcelizer10 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 61148);
                                int size = 2145 - View.MeasureSpec.getSize(0);
                                int keyRepeatTimeout = 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte b3 = $$a[5];
                                byte b4 = b3;
                                Object[] objArr26 = new Object[1];
                                c(b4, (short) (b4 | 109), b3, objArr26);
                                objRemoteActionCompatParcelizer10 = startForeground.read(cIndexOf, size, keyRepeatTimeout, -2136739198, false, (String) objArr26[0], null);
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
                    int i8 = IconCompatParcelizer + 45;
                    write = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = ((int[]) objArr27[3])[i2];
                    int i11 = ((int[]) objArr27[1])[i2];
                    if (i11 != i10) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr27[2];
                        if (strArr != null) {
                            for (int i12 = i2; i12 < strArr.length; i12++) {
                                arrayList.add(strArr[i12]);
                            }
                        }
                        long j2 = ((long) i2) << 32;
                        long j3 = -1;
                        long j4 = (j3 - ((j3 >> 63) << 32)) | j2;
                        long j5 = 0;
                        long j6 = (j4 & ((long) (i11 ^ i10))) | (((long) 10) << 32) | (j5 - ((j5 >> 63) << 32));
                        try {
                            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                            if (objRemoteActionCompatParcelizer11 == null) {
                                objRemoteActionCompatParcelizer11 = startForeground.read((char) (TextUtils.indexOf("", "") + 4535), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, 42 - ExpandableListView.getPackedPositionType(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                            }
                            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
                            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                            int i13 = write + 61;
                            IconCompatParcelizer = i13 % 128;
                            int i14 = i13 % 2;
                            try {
                                Object[] objArr28 = {-1520676913, Long.valueOf(j6), arrayList, strRemoteActionCompatParcelizer, false};
                                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.makeMeasureSpec(0, 0) + 6030, 24 - TextUtils.getOffsetBefore("", 0));
                                byte b5 = (byte) ($$h | 8);
                                byte[] bArr3 = $$g;
                                Object[] objArr29 = new Object[1];
                                d(b5, (byte) (-bArr3[27]), (byte) (-bArr3[69]), objArr29);
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
                    i2 = 0;
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
            b(true, new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{80, 11, 0, 1}, objArr30);
            String str6 = (String) objArr30[0];
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
            arrayList2.add(str6);
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer12 == null) {
                objRemoteActionCompatParcelizer12 = startForeground.read((char) (4535 - ExpandableListView.getPackedPositionGroup(0L)), Gravity.getAbsoluteGravity(0, 0) + 6054, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
            String strRemoteActionCompatParcelizer2 = TrainingApplication.RemoteActionCompatParcelizer();
            int i15 = IconCompatParcelizer + 99;
            write = i15 % 128;
            int i16 = i15 % 2;
            Object[] objArr31 = {-1520676913, 81604378625L, arrayList2, strRemoteActionCompatParcelizer2, false};
            Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (Process.myPid() >> 22), 6030 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 24);
            byte b6 = (byte) ($$h | 8);
            byte[] bArr4 = $$g;
            Object[] objArr32 = new Object[1];
            d(b6, (byte) (-bArr4[27]), (byte) (-bArr4[69]), objArr32);
            cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr31);
        }
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            try {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr33 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 91, false, new char[]{65535, 3, 4, 2, 65534, 0, 4, 65533, 2, 65532, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 72, objArr33);
                String str7 = (String) objArr33[0];
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
                arrayList3.add(str7);
                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer13 == null) {
                    objRemoteActionCompatParcelizer13 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 4535), Color.blue(0) + 6054, 43 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer13).invoke(null, null);
                Object[] objArr34 = {-1520676913, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls7 = (Class) startForeground.IconCompatParcelizer((char) ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0', 0) + 6031, AndroidCharacter.getMirror('0') - 24);
                byte b7 = (byte) ($$h | 8);
                byte[] bArr5 = $$g;
                Object[] objArr35 = new Object[1];
                d(b7, (byte) (-bArr5[27]), (byte) (-bArr5[69]), objArr35);
                cls7.getMethod((String) objArr35[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr34);
            }
        }
        try {
            Object[] objArr36 = {-1520676913};
            Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer14 == null) {
                objRemoteActionCompatParcelizer14 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), 1991 - Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 12, -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr37 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer14).newInstance(objArr36)};
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char cIndexOf2 = (char) (19322 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int i17 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2760;
                    int i18 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 98;
                    Object[] objArr38 = new Object[1];
                    c((byte) ($$a[4] - 1), (short) 112, r6[70], objArr38);
                    objRemoteActionCompatParcelizer15 = startForeground.read(cIndexOf2, i17, i18, 1799372695, false, (String) objArr38[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (9580 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0) + 3447, Color.blue(0) + 144)});
                }
                ((Method) objRemoteActionCompatParcelizer15).invoke(null, objArr37);
                Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer16 == null) {
                    char cRed = (char) (13183 - Color.red(0));
                    int iCombineMeasuredStates = 1649 - View.combineMeasuredStates(0, 0);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 27;
                    byte[] bArr6 = $$a;
                    Object[] objArr39 = new Object[1];
                    c((byte) 40, bArr6[5], bArr6[62], objArr39);
                    objRemoteActionCompatParcelizer16 = startForeground.read(cRed, iCombineMeasuredStates, iLastIndexOf3, -133433128, false, (String) objArr39[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer16).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer17 == null) {
                        char packedPositionGroup2 = (char) (13183 - ExpandableListView.getPackedPositionGroup(0L));
                        int pressedStateDuration = 1649 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i19 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                        byte[] bArr7 = $$a;
                        Object[] objArr40 = new Object[1];
                        c((byte) (-bArr7[8]), (short) (-bArr7[27]), bArr7[9], objArr40);
                        objRemoteActionCompatParcelizer17 = startForeground.read(packedPositionGroup2, pressedStateDuration, i19, -1033747278, false, (String) objArr40[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer17).get(null);
                } else {
                    Object[] objArr41 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 3, false, new char[]{11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 33, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 7, objArr41);
                    Class<?> cls8 = Class.forName((String) objArr41[0]);
                    Object[] objArr42 = new Object[1];
                    b(false, new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, new int[]{64, 16, 199, 3}, objArr42);
                    int iIntValue3 = ((Integer) cls8.getMethod((String) objArr42[0], Object.class).invoke(null, this)).intValue();
                    int i20 = IconCompatParcelizer + 3;
                    write = i20 % 128;
                    int i21 = i20 % 2;
                    try {
                        Object[] objArr43 = {Integer.valueOf(iIntValue3), 0, 1521718407};
                        byte[] bArr8 = $$g;
                        byte b8 = bArr8[22];
                        byte b9 = b8;
                        Object[] objArr44 = new Object[1];
                        d(b9, (byte) (b9 | 20), b8, objArr44);
                        Class<?> cls9 = Class.forName((String) objArr44[0]);
                        Object[] objArr45 = new Object[1];
                        d((byte) ($$h | 8), (byte) (-bArr8[27]), (byte) (-bArr8[69]), objArr45);
                        objArr = (Object[]) cls9.getMethod((String) objArr45[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr43);
                        Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer18 == null) {
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 13183);
                            int maxKeyCode2 = 1649 - (KeyEvent.getMaxKeyCode() >> 16);
                            int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 26;
                            byte[] bArr9 = $$a;
                            Object[] objArr46 = new Object[1];
                            c((byte) (-bArr9[8]), (short) (-bArr9[27]), bArr9[9], objArr46);
                            objRemoteActionCompatParcelizer18 = startForeground.read(edgeSlop, maxKeyCode2, edgeSlop2, -1033747278, false, (String) objArr46[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer18).set(null, objArr);
                        try {
                            Object[] objArr47 = new Object[1];
                            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 3, true, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 14, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 122, objArr47);
                            Class<?> cls10 = Class.forName((String) objArr47[0]);
                            Object[] objArr48 = new Object[1];
                            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 23, true, new char[]{'\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, 15 - View.resolveSize(0, 0), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, objArr48);
                            long jLongValue3 = ((Long) cls10.getDeclaredMethod((String) objArr48[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue3);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char size2 = (char) (13183 - View.MeasureSpec.getSize(0));
                                int iIndexOf2 = TextUtils.indexOf("", "") + 1649;
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                                Object[] objArr49 = new Object[1];
                                c((byte) (-$$a[8]), (short) 76, r11[9], objArr49);
                                objRemoteActionCompatParcelizer19 = startForeground.read(size2, iIndexOf2, iResolveOpacity, 54351865, false, (String) objArr49[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                            Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer20 == null) {
                                char gidForName = (char) (Process.getGidForName("") + 13184);
                                int absoluteGravity = 1649 - Gravity.getAbsoluteGravity(0, 0);
                                int bitsPerPixel = 25 - ImageFormat.getBitsPerPixel(0);
                                byte[] bArr10 = $$a;
                                Object[] objArr50 = new Object[1];
                                c((byte) 40, bArr10[5], bArr10[62], objArr50);
                                objRemoteActionCompatParcelizer20 = startForeground.read(gidForName, absoluteGravity, bitsPerPixel, -133433128, false, (String) objArr50[0], null);
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
                int i22 = ((int[]) objArr[3])[0];
                int i23 = ((int[]) objArr[2])[0];
                if (i23 != i22) {
                    long j7 = -1;
                    long j8 = 0;
                    long j9 = (((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32))) & ((long) (i23 ^ i22))) | (((long) 2) << 32) | (j8 - ((j8 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer21 == null) {
                        objRemoteActionCompatParcelizer21 = startForeground.read((char) (4535 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 6054 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 42 - (Process.myPid() >> 22), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer21).invoke(null, null);
                    Object[] objArr51 = {-1520676913, Long.valueOf(j9), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls11 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 6030 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 24);
                    byte b10 = (byte) ($$h | 8);
                    byte[] bArr11 = $$g;
                    Object[] objArr52 = new Object[1];
                    d(b10, (byte) (-bArr11[27]), (byte) (-bArr11[69]), objArr52);
                    cls11.getMethod((String) objArr52[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr51);
                }
                Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer22 == null) {
                    char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i24 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 943;
                    int iRed = Color.red(0) + 36;
                    byte b11 = $$a[5];
                    byte b12 = b11;
                    Object[] objArr53 = new Object[1];
                    c(b12, (short) (b12 | 109), b11, objArr53);
                    objRemoteActionCompatParcelizer22 = startForeground.read(jumpTapTimeout3, i24, iRed, -167186806, false, (String) objArr53[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer22).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        int i25 = 943 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 36;
                        Object[] objArr54 = new Object[1];
                        c((byte) (-$$a[164]), (short) 139, r3[62], objArr54);
                        objRemoteActionCompatParcelizer23 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), i25, touchSlop, -1398865628, false, (String) objArr54[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
                } else {
                    Object[] objArr55 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 113, false, new char[]{11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3}, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 87, objArr55);
                    Class<?> cls12 = Class.forName((String) objArr55[0]);
                    Object[] objArr56 = new Object[1];
                    b(false, new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, new int[]{64, 16, 199, 3}, objArr56);
                    Object[] objArr57 = {Integer.valueOf(((Integer) cls12.getMethod((String) objArr56[0], Object.class).invoke(null, this)).intValue()), 0, -1218276437};
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int gidForName2 = 942 - Process.getGidForName("");
                        int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36;
                        byte b13 = $$a[103];
                        Object[] objArr58 = new Object[1];
                        c(b13, (short) (b13 | 160), r2[9], objArr58);
                        objRemoteActionCompatParcelizer24 = startForeground.read(scrollBarFadeDuration, gidForName2, minimumFlingVelocity3, -2131402098, false, (String) objArr58[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer24).invoke(null, objArr57);
                    Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer25 == null) {
                        char c3 = (char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int iKeyCodeFromString = 943 - KeyEvent.keyCodeFromString("");
                        int threadPriority = 36 - ((Process.getThreadPriority(0) + 20) >> 6);
                        Object[] objArr59 = new Object[1];
                        c((byte) (-$$a[164]), (short) 139, r6[62], objArr59);
                        objRemoteActionCompatParcelizer25 = startForeground.read(c3, iKeyCodeFromString, threadPriority, -1398865628, false, (String) objArr59[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer25).set(null, objArr2);
                    try {
                        Object[] objArr60 = new Object[1];
                        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 112, true, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 12, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 113, objArr60);
                        Class<?> cls13 = Class.forName((String) objArr60[0]);
                        Object[] objArr61 = new Object[1];
                        a(12 - (ViewConfiguration.getWindowTouchSlop() >> 8), true, new char[]{'\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, 15 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 78, objArr61);
                        long jLongValue4 = ((Long) cls13.getDeclaredMethod((String) objArr61[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue4);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int maximumFlingVelocity = 943 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iArgb = Color.argb(0, 0, 0, 0) + 36;
                            Object[] objArr62 = new Object[1];
                            c((byte) ($$a[4] - 1), (short) 112, r8[70], objArr62);
                            objRemoteActionCompatParcelizer26 = startForeground.read(packedPositionType, maximumFlingVelocity, iArgb, -629981381, false, (String) objArr62[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                        Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer27 == null) {
                            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                            int iRgb = (-16776273) - Color.rgb(0, 0, 0);
                            int trimmedLength = 36 - TextUtils.getTrimmedLength("");
                            byte b14 = $$a[5];
                            byte b15 = b14;
                            Object[] objArr63 = new Object[1];
                            c(b15, (short) (b15 | 109), b14, objArr63);
                            objRemoteActionCompatParcelizer27 = startForeground.read(absoluteGravity2, iRgb, trimmedLength, -167186806, false, (String) objArr63[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i26 = ((int[]) objArr2[2])[0];
                int i27 = ((int[]) objArr2[0])[0];
                if (i27 != i26) {
                    long j10 = -1;
                    long j11 = ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32))) & ((long) (i27 ^ i26));
                    long j12 = 0;
                    long j13 = j11 | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer28 == null) {
                        objRemoteActionCompatParcelizer28 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 4535), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6053, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer28).invoke(null, null);
                    Object[] objArr64 = {-1520676913, Long.valueOf(j13), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls14 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6029, 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    byte b16 = (byte) ($$h | 8);
                    byte[] bArr12 = $$g;
                    Object[] objArr65 = new Object[1];
                    d(b16, (byte) (-bArr12[27]), (byte) (-bArr12[69]), objArr65);
                    cls14.getMethod((String) objArr65[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr64);
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

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_deeplink_processor;
        }
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 19;
        write = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        write = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // kotlin.setCombineUpright, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IconCompatParcelizer + 95;
        write = i4 % 128;
        int i5 = i4 % 2;
    }
}
