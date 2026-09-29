package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes2.dex */
public final class J2 {
    private static final byte[] $$g = {24, -109, -85, -94, 61, -61, -2, -19, 29, -37, 15, -23, 11, 10, -22, -15, 8, 22, -27, -22, 35, -32, 7, -28, 9, -1, -14, -5, 47, -49, 6, 16, -35, -8, 6, -15, 7, -10, -3, 9, 0, -7};
    private static final int $$h = 124;
    private static final byte[] $$d = {28, -38, TarConstants.LF_DIR, -29, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$e = 22;
    private static final byte[] $$a = {10, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 13, 109, 38, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -42, -38, -3, 4, -10, 2, -3, -20, 29, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, 12, -22, -12, -8, 9, -8, 19, -34, 2, -21, 12, -22, -12, 68};
    private static final int $$b = 185;

    public J2() throws Throwable {
        int i;
        Object[] objArr = new Object[1];
        b((byte) (-1), (byte) (-$$a[38]), r2[95], objArr);
        String str = (String) objArr[0];
        ClassLoader classLoader = J2.class.getClassLoader();
        try {
            Object[] objArr2 = {96126657};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2072911000);
            Object[] objArr3 = {str, classLoader, false, -486353678, ((Constructor) (objRemoteActionCompatParcelizer == null ? startForeground.read((char) (26153 - TextUtils.indexOf("", "", 0, 0)), KeyEvent.normalizeMetaState(0) + 1343, 18 - TextUtils.lastIndexOf("", '0', 0), -96983043, false, null, new Class[]{Integer.TYPE}) : objRemoteActionCompatParcelizer)).newInstance(objArr2), -486353678};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-893064501);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cLastIndexOf = (char) (61147 - TextUtils.lastIndexOf("", '0'));
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2145;
                int iAlpha = Color.alpha(0) + 12;
                byte b = (byte) ($$d[6] - 1);
                byte b2 = b;
                Object[] objArr4 = new Object[1];
                c(b, b2, b2, objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(cLastIndexOf, packedPositionGroup, iAlpha, -1265815970, false, (String) objArr4[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (Color.alpha(0) + 11524), 575 - Drawable.resolveOpacity(0, 0), 41 - (Process.myTid() >> 22)), Integer.TYPE});
            }
            Object[] objArr5 = (Object[]) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            int i2 = ((int[]) objArr5[3])[0];
            int i3 = ((int[]) objArr5[1])[0];
            if (i3 == i2) {
                Object[] objArr6 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i4 = ((int[]) objArr5[0])[0];
                int i5 = ((int[]) objArr5[1])[0];
                int i6 = ((int[]) objArr5[3])[0];
                String[] strArr = (String[]) objArr5[2];
                int iMyPid = Process.myPid();
                int i7 = i4 + (((~((-1644167333) | iMyPid)) | 134550848) * 449) + 1912830966 + (((~((~iMyPid) | (-1644167333))) | 134550848) * 449);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr6[0])[0] = i9 ^ (i9 << 5);
                Object[] objArr7 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i10 = ((int[]) objArr6[0])[0];
                int i11 = ((int[]) objArr6[1])[0];
                int i12 = ((int[]) objArr6[3])[0];
                String[] strArr2 = strArr;
                int i13 = ~(((int) Process.getElapsedCpuTime()) | 1785224626);
                int i14 = i10 + (((1144736742 + (((-191940713) | i13) * (-220))) + ((i13 | (-1803083259)) * 220)) - 1198496852);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr7[0])[0] = i16 ^ (i16 << 5);
                Object[] objArr8 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
                int i17 = ((int[]) objArr7[0])[0];
                int i18 = ((int[]) objArr7[1])[0];
                int i19 = ((int[]) objArr7[3])[0];
                int i20 = ~((int) Runtime.getRuntime().freeMemory());
                int i21 = i17 + 1521058474 + ((~(1607991287 | i20)) * 52) + (((~(373501875 | i20)) | (~((-1603663464) | i20)) | 1234489412) * (-52)) + (((~(i20 | (-373501876))) | 4327824) * 52);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr8[0])[0] = i23 ^ (i23 << 5);
                i = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr5[2];
                if (strArr3 != null) {
                    for (String str2 : strArr3) {
                        arrayList.add(str2);
                    }
                }
                Context context = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                long j = i2 ^ i3;
                long j2 = -1;
                try {
                    Object[] objArr9 = {Looper.myLooper() == null ? null : context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context, Long.valueOf((((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & j) ^ 1101265030994722816L), 256408118L};
                    byte[] bArr = $$g;
                    byte b3 = bArr[25];
                    Object[] objArr10 = new Object[1];
                    d((byte) (-b3), bArr[40], (byte) (-b3), objArr10);
                    Class<?> cls = Class.forName((String) objArr10[0]);
                    byte b4 = bArr[40];
                    Object[] objArr11 = new Object[1];
                    d(b4, (byte) (-bArr[25]), b4, objArr11);
                    cls.getMethod((String) objArr11[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr9);
                    Object[] objArr12 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i24 = ((int[]) objArr5[0])[0];
                    int i25 = ((int[]) objArr5[1])[0];
                    int i26 = ((int[]) objArr5[3])[0];
                    String[] strArr4 = (String[]) objArr5[2];
                    int iMyUid = Process.myUid();
                    int i27 = ~iMyUid;
                    int i28 = i24 + 233836244 + (((-1451361425) | (~((-525803915) | i27))) * (-865)) + ((~(iMyUid | 525803914)) * 865) + (((~((-1451361425) | i27)) | (~(i27 | 525803914))) * 865);
                    int i29 = (i28 << 13) ^ i28;
                    int i30 = i29 ^ (i29 >>> 17);
                    ((int[]) objArr12[0])[0] = i30 ^ (i30 << 5);
                    long j3 = -1;
                    long j4 = ((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32)) & j;
                    long j5 = 0;
                    long j6 = j4 | (((long) 10) << 32) | (j5 - ((j5 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    Object objInvoke = ((Method) (objRemoteActionCompatParcelizer3 == null ? startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 4535), ExpandableListView.getPackedPositionType(0L) + 6054, 42 - (ViewConfiguration.getTapTimeout() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]) : objRemoteActionCompatParcelizer3)).invoke(null, null);
                    Object[] objArr13 = {96126657, Long.valueOf(j6), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1458445422);
                    ((Method) (objRemoteActionCompatParcelizer4 == null ? startForeground.read((char) View.combineMeasuredStates(0, 0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE}) : objRemoteActionCompatParcelizer4)).invoke(objInvoke, objArr13);
                    Object[] objArr14 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i31 = ((int[]) objArr12[0])[0];
                    int i32 = ((int[]) objArr12[1])[0];
                    int i33 = ((int[]) objArr12[3])[0];
                    String[] strArr5 = (String[]) objArr12[2];
                    int iMyTid = Process.myTid();
                    int i34 = (-1874059398) + (((~((-203308788) | iMyTid)) | 135931427 | (~((-1773856552) | iMyTid))) * (-880));
                    int i35 = (~((-203308788) | (~iMyTid))) | 1773856551;
                    int i36 = ~(iMyTid | 203308787);
                    int i37 = i31 + i34 + ((i35 | i36) * (-880)) + (i36 * 880);
                    int i38 = (i37 << 13) ^ i37;
                    int i39 = i38 ^ (i38 >>> 17);
                    ((int[]) objArr14[0])[0] = i39 ^ (i39 << 5);
                    Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                    Object[] objArr15 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i40 = ((int[]) objArr14[0])[0];
                    int i41 = ((int[]) objArr14[1])[0];
                    int i42 = ((int[]) objArr14[3])[0];
                    String[] strArr6 = (String[]) objArr14[2];
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i43 = i40 + ((~(iElapsedRealtime | 1048786933)) * UnixStat.DEFAULT_FILE_PERM) + 1799250174 + (((~((~iElapsedRealtime) | 1048786933)) | 906044965) * UnixStat.DEFAULT_FILE_PERM);
                    int i44 = (i43 << 13) ^ i43;
                    int i45 = i44 ^ (i44 >>> 17);
                    i = 0;
                    ((int[]) objArr15[0])[0] = i45 ^ (i45 << 5);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            byte b5 = (byte) i;
            try {
                byte[] bArr2 = $$a;
                Object[] objArr16 = new Object[1];
                b(b5, bArr2[12], bArr2[5], objArr16);
                Class<?> cls2 = Class.forName((String) objArr16[0]);
                byte b6 = bArr2[7];
                byte b7 = bArr2[12];
                Object[] objArr17 = new Object[1];
                b(b6, b7, (byte) (b7 - 2), objArr17);
                Class<?> cls3 = Class.forName((String) objArr17[0]);
                Object[] objArr18 = new Object[1];
                b((byte) 36, bArr2[12], (byte) (-bArr2[34]), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                b((byte) (bArr2[13] - 1), (byte) (-bArr2[34]), (byte) (-bArr2[17]), objArr19);
                Object objInvoke2 = cls2.getMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0]);
                Object[] objArr20 = new Object[1];
                b((byte) 60, bArr2[12], bArr2[10], objArr20);
                Class<?> cls5 = Class.forName((String) objArr20[0]);
                byte b8 = (byte) (-bArr2[34]);
                Object[] objArr21 = new Object[1];
                b((byte) 74, b8, (byte) (b8 + 2), objArr21);
                Object objInvoke3 = cls5.getMethod((String) objArr21[0], new Class[0]).invoke(J2.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Object[] objArr22 = new Object[1];
                    b((byte) 87, b5, bArr2[0], objArr22);
                    Method declaredMethod = cls2.getDeclaredMethod((String) objArr22[0], cls4, cls3);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke2, str, objInvoke3);
                    return;
                }
                Object[] objArr23 = new Object[1];
                b((byte) 97, b5, bArr2[37], objArr23);
                Method declaredMethod2 = cls2.getDeclaredMethod((String) objArr23[0], cls3, cls4);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(objInvoke2, objInvoke3, str);
            } catch (InvocationTargetException e) {
                Throwable cause2 = e.getCause();
                if (cause2 == null) {
                    throw e;
                }
                throw cause2;
            }
        } catch (Throwable th2) {
            Throwable cause3 = th2.getCause();
            if (cause3 == null) {
                throw th2;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 108 - r7
            int r6 = r6 + 4
            byte[] r0 = com.fingerprintjs.android.fpjs_pro_internal.J2.$$a
            int r1 = 21 - r8
            byte[] r1 = new byte[r1]
            int r8 = 20 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-5)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fingerprintjs.android.fpjs_pro_internal.J2.b(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = 20 - r6
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r8 = r8 + 73
            byte[] r1 = com.fingerprintjs.android.fpjs_pro_internal.J2.$$d
            byte[] r0 = new byte[r0]
            int r6 = 19 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2f:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fingerprintjs.android.fpjs_pro_internal.J2.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 35
            int r7 = 38 - r7
            int r8 = r8 * 32
            int r8 = 36 - r8
            byte[] r0 = com.fingerprintjs.android.fpjs_pro_internal.J2.$$g
            int r9 = r9 * 3
            int r9 = 114 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-4)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fingerprintjs.android.fpjs_pro_internal.J2.d(int, short, byte, java.lang.Object[]):void");
    }

    public final native D0 a(String str);
}
