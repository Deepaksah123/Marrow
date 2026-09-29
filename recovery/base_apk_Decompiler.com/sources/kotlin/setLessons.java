package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.marrow.TrainingApplication;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public class setLessons {
    private static final byte[] $$d;
    private static boolean read = false;
    private static final byte[] $$g = {114, -20, -35, -46, -61, 61, 2, 19, -29, 37, -15, 23, -11, -10, 22, 15, -8, -22, 27, 22, -35, 32, -7, 28, -9, 1, 14, 5, -47, TarConstants.LF_LINK, -6, -16, 35, 8, -6, 15, -7, 10, 3, -9, 0, 7};
    private static final int $$h = 3;
    private static final int $$e = 186;
    private static final byte[] $$a = {29, -75, -112, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -41, 9, TarConstants.LF_SYMLINK, -41, 5, -4, 26, -16, -46, 67, -6, 18, -2, -52, 41, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, -4, 26, -16, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, 20, -29, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, 3, 20, -44, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, -68};
    private static final int $$b = 225;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 106 - r6
            int r0 = 21 - r7
            byte[] r1 = kotlin.setLessons.$$a
            int r8 = r8 + 99
            byte[] r0 = new byte[r0]
            int r7 = 20 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
        L28:
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + (-5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setLessons.a(int, byte, short, java.lang.Object[]):void");
    }

    private static void b(short s, int i, int i2, Object[] objArr) {
        int i3 = (i2 * 4) + 73;
        byte[] bArr = $$d;
        int i4 = i * 3;
        int i5 = 4 - (s * 2);
        byte[] bArr2 = new byte[20 - i4];
        int i6 = 19 - i4;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i3 = i5 + i6;
            i5++;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i3;
            i7 = i8;
            i3 = bArr[i5] + i9;
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 111
            byte[] r0 = kotlin.setLessons.$$g
            int r7 = r7 * 35
            int r7 = r7 + 4
            int r5 = r5 * 32
            int r1 = r5 + 4
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-4)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setLessons.c(int, int, int, java.lang.Object[]):void");
    }

    public final native int read(boolean z);

    public final native int write(Object[] objArr);

    /* JADX WARN: Type inference failed for: r1v101, types: [boolean, int] */
    static {
        Object[] objArr;
        byte[] bArr = {38, -16, -7, 121, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
        $$d = bArr;
        byte b = (byte) 0;
        try {
            Object[] objArr2 = new Object[1];
            a((byte) 102, (byte) 15, b, objArr2);
            String str = (String) objArr2[0];
            ClassLoader classLoader = setLessons.class.getClassLoader();
            try {
                Object[] objArr3 = {96126657};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2072911000);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (26153 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1343 - (ViewConfiguration.getFadingEdgeLength() >> 16), 18 - ExpandableListView.getPackedPositionChild(0L), -96983043, false, null, new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr4 = {str, classLoader, false, -1806460230, ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr3), -1806460230};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-893064501);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char scrollBarFadeDuration = (char) (61148 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int maximumDrawingCacheSize = 2145 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int bitsPerPixel = 11 - ImageFormat.getBitsPerPixel(0);
                        byte b2 = (byte) (bArr[6] + 1);
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        b(b2, b3, b3, objArr5);
                        objRemoteActionCompatParcelizer2 = startForeground.read(scrollBarFadeDuration, maximumDrawingCacheSize, bitsPerPixel, -1265815970, false, (String) objArr5[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (TextUtils.getTrimmedLength("") + 11524), 576 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 41 - (ViewConfiguration.getLongPressTimeout() >> 16)), Integer.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr4);
                    int i = ((int[]) objArr6[3])[0];
                    int i2 = ((int[]) objArr6[1])[0];
                    if (i2 == i) {
                        Object[] objArr7 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                        int i3 = ((int[]) objArr6[0])[0];
                        int i4 = ((int[]) objArr6[1])[0];
                        int i5 = ((int[]) objArr6[3])[0];
                        String[] strArr = (String[]) objArr6[2];
                        int iNextInt = new Random().nextInt(663281491);
                        int i6 = ~iNextInt;
                        int i7 = i3 + (-1341543182) + ((iNextInt | 616572352) * 988) + ((1360330778 | (~(616703456 | i6))) * (-1976)) + (((~(iNextInt | (-1360461883))) | 616572352 | (~(1360461882 | i6))) * 988);
                        int i8 = (i7 << 13) ^ i7;
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) objArr7[0])[0] = i9 ^ (i9 << 5);
                        Object[] objArr8 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                        int i10 = ((int[]) objArr7[0])[0];
                        int i11 = ((int[]) objArr7[1])[0];
                        int i12 = ((int[]) objArr7[3])[0];
                        String[] strArr2 = strArr;
                        int i13 = i10 + ((((~((-1558562263) | r7)) | 1142334866) * 262) - 1594459734) + (((~((~((int) Runtime.getRuntime().freeMemory())) | (-1558562263))) | 1142334866) * 262);
                        int i14 = (i13 << 13) ^ i13;
                        int i15 = i14 ^ (i14 >>> 17);
                        ((int[]) objArr8[0])[0] = i15 ^ (i15 << 5);
                        objArr = new Object[]{new int[1], new int[]{i}, strArr2, new int[]{i}};
                        int i16 = ((int[]) objArr8[0])[0];
                        int i17 = ((int[]) objArr8[1])[0];
                        int i18 = ((int[]) objArr8[3])[0];
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i19 = ~iFreeMemory;
                        int i20 = i16 + 1004936344 + (((~((-1331698447) | i19)) | (~(1870207758 | iFreeMemory))) * (-831)) + ((~((-1224740867) | iFreeMemory)) * (-1662)) + (((~(iFreeMemory | 1331698446)) | (~(i19 | (-645466893))) | (~(645466892 | iFreeMemory))) * 831);
                        int i21 = (i20 << 13) ^ i20;
                        int i22 = i21 ^ (i21 >>> 17);
                        ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) objArr6[2];
                        if (strArr3 != null) {
                            for (String str2 : strArr3) {
                                arrayList.add(str2);
                            }
                        }
                        Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                        }
                        if (Looper.myLooper() == null) {
                            applicationContext = null;
                        }
                        long j = i ^ i2;
                        long j2 = -1;
                        try {
                            Object[] objArr9 = {applicationContext, Long.valueOf((((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & j) ^ 1101265030994722816L), 256408118L};
                            byte[] bArr2 = $$g;
                            byte b4 = bArr2[25];
                            byte b5 = bArr2[40];
                            Object[] objArr10 = new Object[1];
                            c(b4, b5, b5, objArr10);
                            Class<?> cls = Class.forName((String) objArr10[0]);
                            byte b6 = bArr2[40];
                            byte b7 = bArr2[25];
                            Object[] objArr11 = new Object[1];
                            c(b6, b7, b7, objArr11);
                            cls.getMethod((String) objArr11[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr9);
                            Object[] objArr12 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                            int i23 = ((int[]) objArr6[0])[0];
                            int i24 = ((int[]) objArr6[1])[0];
                            int i25 = ((int[]) objArr6[3])[0];
                            String[] strArr4 = (String[]) objArr6[2];
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int i26 = 2052370630 + (((~((-937366353) | startUptimeMillis)) | 33882384 | (~(1039798986 | startUptimeMillis))) * (-754));
                            int i27 = ~((-33882385) | startUptimeMillis);
                            int i28 = ~startUptimeMillis;
                            int i29 = i23 + i26 + ((i27 | (~(1073681370 | i28))) * (-754)) + ((i28 | (-937366353)) * 754);
                            int i30 = (i29 << 13) ^ i29;
                            int i31 = i30 ^ (i30 >>> 17);
                            ((int[]) objArr12[0])[0] = i31 ^ (i31 << 5);
                            long j3 = -1;
                            long j4 = 0;
                            long j5 = (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32)) | (((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32)) & j);
                            try {
                                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 4536), 6053 - ImageFormat.getBitsPerPixel(0), 42 - ExpandableListView.getPackedPositionType(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                                }
                                Object objInvoke = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                                try {
                                    Object[] objArr13 = {96126657, Long.valueOf(j5), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
                                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1458445422);
                                    if (objRemoteActionCompatParcelizer4 == null) {
                                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 6031 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 24, 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                                    }
                                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke, objArr13);
                                    Object[] objArr14 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                                    int i32 = ((int[]) objArr12[0])[0];
                                    int i33 = ((int[]) objArr12[1])[0];
                                    int i34 = ((int[]) objArr12[3])[0];
                                    String[] strArr5 = (String[]) objArr12[2];
                                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                    int i35 = i32 + 525870346 + (((~((-1619233460) | iMaxMemory)) | 100899) * 336) + (((~(iMaxMemory | 357931879)) | (-1977064440)) * (-168)) + (((~((~iMaxMemory) | 357931879)) | (-1619233460)) * 168);
                                    int i36 = (i35 << 13) ^ i35;
                                    int i37 = i36 ^ (i36 >>> 17);
                                    ((int[]) objArr14[0])[0] = i37 ^ (i37 << 5);
                                    Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                                    objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
                                    int i38 = ((int[]) objArr14[0])[0];
                                    int i39 = ((int[]) objArr14[1])[0];
                                    int i40 = ((int[]) objArr14[3])[0];
                                    String[] strArr6 = (String[]) objArr14[2];
                                    int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                    int i41 = ~iMaxMemory2;
                                    int i42 = i38 + 380232390 + (((~((-910518019) | i41)) | (~((-1066647321) | iMaxMemory2))) * 210) + (((~(iMaxMemory2 | (-4472835))) | (~(i41 | (-160602137)))) * 210);
                                    int i43 = (i42 << 13) ^ i42;
                                    int i44 = i43 ^ (i43 >>> 17);
                                    ((int[]) objArr[0])[0] = i44 ^ (i44 << 5);
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
                    }
                    try {
                        byte b8 = (byte) ($$b & 383);
                        byte[] bArr3 = $$a;
                        byte b9 = (byte) (-bArr3[9]);
                        Object[] objArr15 = new Object[1];
                        a(b8, b9, (byte) (b9 + 3), objArr15);
                        Class<?> cls2 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        a((byte) 81, b, (byte) (b | 7), objArr16);
                        Class<?> cls3 = Class.forName((String) objArr16[0]);
                        byte b10 = bArr3[8];
                        Object[] objArr17 = new Object[1];
                        a((byte) 61, b10, (byte) (b10 + 2), objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        a(bArr3[35], bArr3[21], (byte) (-bArr3[9]), objArr18);
                        Object objInvoke2 = cls2.getMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0]);
                        byte b11 = (byte) (bArr3[55] - 1);
                        byte b12 = bArr3[43];
                        Object[] objArr19 = new Object[1];
                        a(b11, b12, (byte) (b12 + 1), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        byte b13 = bArr3[37];
                        Object[] objArr20 = new Object[1];
                        a(b13, (byte) (b13 & 15), (byte) (-bArr3[9]), objArr20);
                        Object objInvoke3 = cls5.getMethod((String) objArr20[0], new Class[0]).invoke(setLessons.class, new Object[0]);
                        if (Build.VERSION.SDK_INT <= 24) {
                            byte b14 = bArr3[58];
                            Object[] objArr21 = new Object[1];
                            a(b14, b14, bArr3[5], objArr21);
                            Method declaredMethod = cls2.getDeclaredMethod((String) objArr21[0], cls4, cls3);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(objInvoke2, str, objInvoke3);
                        } else {
                            byte b15 = bArr3[5];
                            Object[] objArr22 = new Object[1];
                            a(b, b15, b15, objArr22);
                            Method declaredMethod2 = cls2.getDeclaredMethod((String) objArr22[0], cls3, cls4);
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(objInvoke2, objInvoke3, str);
                        }
                        int i45 = ((int[]) objArr[0])[0];
                        int i46 = ((((i45 * i45) - (~(-(295164404 * i45)))) - 1) - (~(-(i45 * 223223640)))) - 1;
                        int i47 = (i46 ^ 1898920868) + ((1898920868 & i46) << 1);
                        int i48 = i47 >> 18;
                        int i49 = (((i48 | (-32767)) << 1) - (i48 ^ (-32767))) / 16384;
                        int i50 = ((i49 | 1) << 1) - (i49 ^ 1);
                        int i51 = (i47 & i50) + (i50 | i47);
                        int i52 = i47 >> 21;
                        int i53 = ((i52 & (-4095)) + (i52 | (-4095))) / 2048;
                        int i54 = -((((i53 | 1) << 1) - (i53 ^ 1)) ^ i51);
                        int i55 = (i54 ^ 3) + ((3 & i54) << 1);
                        int i56 = i55 >> 20;
                        int i57 = ((i56 & (-8191)) + (i56 | (-8191))) / 4096;
                        read = 2307 / (((-((((i57 | 1) << 1) - (i57 ^ 1)) + 1)) & i55) * 769);
                    } catch (InvocationTargetException e) {
                        Throwable cause4 = e.getCause();
                        if (cause4 == null) {
                            throw e;
                        }
                        throw cause4;
                    }
                } catch (Throwable th4) {
                    Throwable cause5 = th4.getCause();
                    if (cause5 == null) {
                        throw th4;
                    }
                    throw cause5;
                }
            } catch (Throwable th5) {
                Throwable cause6 = th5.getCause();
                if (cause6 == null) {
                    throw th5;
                }
                throw cause6;
            }
        } catch (UnsatisfiedLinkError e2) {
            getLessonAuthor.write(e2);
        }
    }

    public static boolean read() {
        return read;
    }
}
