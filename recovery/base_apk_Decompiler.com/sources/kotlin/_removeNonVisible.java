package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.marrow.TrainingApplication;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u0000 \u00022\u00020\u0001:\u0001\u0002"}, d2 = {"Lo/_removeNonVisible;", "", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class _removeNonVisible {
    private static final byte[] $$d;
    private static final byte[] $$g = {14, -10, 42, -103, 61, -61, -2, -19, 29, -37, 15, -23, 11, 10, -22, -15, 8, 22, -27, -22, 35, -32, 7, -28, 9, -1, -14, -5, 47, -49, 6, 16, -35, -8, 6, -15, 7, -10, -3, 9, 0, -7};
    private static final int $$h = TarConstants.PREFIXLEN;
    private static final int $$e = 64;
    private static final byte[] $$a = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128, -42, 8, 3, 5, 11, -4, 26, -16, -46, 67, -6, 18, -2, -52, 41, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, -4, 26, -16, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, 20, -29, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, 3, 20, -44, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, -68};
    private static final int $$b = 60;
    private static final read read = new read(null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 6
            int r8 = 108 - r8
            byte[] r0 = kotlin._removeNonVisible.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._removeNonVisible.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 73
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = 20 - r7
            byte[] r0 = kotlin._removeNonVisible.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._removeNonVisible.b(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 114 - r8
            byte[] r0 = kotlin._removeNonVisible.$$g
            int r6 = r6 * 32
            int r1 = r6 + 4
            int r7 = r7 * 35
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-4)
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._removeNonVisible.c(int, int, short, java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_removeNonVisible$read;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        CharSequence charSequence;
        byte[] bArr = {36, -60, 17, 26, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
        $$d = bArr;
        byte b = (byte) 0;
        Object[] objArr = new Object[1];
        a(b, (byte) (b - 1), r2[8], objArr);
        String str = (String) objArr[0];
        ClassLoader classLoader = _removeNonVisible.class.getClassLoader();
        try {
            Object[] objArr2 = {96126657};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2072911000);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (Drawable.resolveOpacity(0, 0) + 26153), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1343, AndroidCharacter.getMirror('0') - 29, -96983043, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {str, classLoader, false, 1972468596, ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr2), 1972468596};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-893064501);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 61148);
                int iRed = Color.red(0) + 2145;
                int minimumFlingVelocity = 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b2 = (byte) (bArr[6] - 1);
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                b(b2, b3, b3, objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, iRed, minimumFlingVelocity, -1265815970, false, (String) objArr4[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (11524 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 575, 41 - Gravity.getAbsoluteGravity(0, 0)), Integer.TYPE});
            }
            Object[] objArr5 = (Object[]) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            int i = ((int[]) objArr5[3])[0];
            int i2 = ((int[]) objArr5[1])[0];
            if (i2 == i) {
                Object[] objArr6 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i3 = ((int[]) objArr5[0])[0];
                int i4 = ((int[]) objArr5[1])[0];
                int i5 = ((int[]) objArr5[3])[0];
                String[] strArr = (String[]) objArr5[2];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i6 = ~elapsedCpuTime;
                int i7 = ~((-1692922) | i6);
                int i8 = ~((-1975472418) | elapsedCpuTime);
                int i9 = i3 + (-1021537868) + ((i7 | i8) * 1150) + (((~(1975472417 | i6)) | i8) * (-575)) + (((~(elapsedCpuTime | (-1692922))) | (~(i6 | 1692921))) * 575);
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr6[0])[0] = i11 ^ (i11 << 5);
                Object[] objArr7 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i12 = ((int[]) objArr6[0])[0];
                int i13 = ((int[]) objArr6[1])[0];
                int i14 = ((int[]) objArr6[3])[0];
                String[] strArr2 = strArr;
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i15 = (-1822944038) + (((~(704788934 | iFreeMemory)) | 1272376404) * 672);
                int i16 = ~iFreeMemory;
                int i17 = i12 + i15 + (((~(iFreeMemory | 1272376404)) | (~((-704788935) | i16))) * (-672)) + (((~((-1272376405) | i16)) | 1104462864) * 672);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr7[0])[0] = i19 ^ (i19 << 5);
                Object[] objArr8 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
                int i20 = ((int[]) objArr7[0])[0];
                int i21 = ((int[]) objArr7[1])[0];
                int i22 = ((int[]) objArr7[3])[0];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i23 = ~startUptimeMillis;
                int i24 = i20 + (-1558894576) + (((~(i23 | 1971758066)) | (-1977000955) | (~((-164385) | startUptimeMillis))) * 717) + (((~(startUptimeMillis | 1971758066)) | (~(i23 | (-164385))) | (-1977000955)) * 717);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr8[0])[0] = i26 ^ (i26 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr5[2];
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
                    Object[] objArr9 = {applicationContext, Long.valueOf((((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & j) ^ 1101265030994722816L), 256408118L};
                    byte[] bArr2 = $$g;
                    byte b4 = bArr2[25];
                    Object[] objArr10 = new Object[1];
                    c((byte) (-b4), bArr2[40], (byte) (-b4), objArr10);
                    Class<?> cls = Class.forName((String) objArr10[0]);
                    byte b5 = bArr2[40];
                    Object[] objArr11 = new Object[1];
                    c(b5, (byte) (-bArr2[25]), b5, objArr11);
                    cls.getMethod((String) objArr11[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr9);
                    Object[] objArr12 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i27 = ((int[]) objArr5[0])[0];
                    int i28 = ((int[]) objArr5[1])[0];
                    int i29 = ((int[]) objArr5[3])[0];
                    String[] strArr4 = (String[]) objArr5[2];
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i30 = ~iElapsedRealtime;
                    int i31 = i27 + (-659179110) + ((547619074 | i30) * (-192)) + (((~((-1260098813) | i30)) | 169447452) * (-384)) + (((~(iElapsedRealtime | 1807717886)) | (~(i30 | (-1090651361))) | (~((-169447453) | iElapsedRealtime))) * PsExtractor.AUDIO_STREAM);
                    int i32 = (i31 << 13) ^ i31;
                    int i33 = i32 ^ (i32 >>> 17);
                    ((int[]) objArr12[0])[0] = i33 ^ (i33 << 5);
                    long j3 = -1;
                    long j4 = ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & j;
                    long j5 = 0;
                    long j6 = j4 | (((long) 10) << 32) | (j5 - ((j5 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        charSequence = "";
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4583 - AndroidCharacter.getMirror('0')), TextUtils.indexOf(charSequence, charSequence, 0, 0) + 6054, (ViewConfiguration.getTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    } else {
                        charSequence = "";
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr13 = {96126657, Long.valueOf(j6), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1458445422);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.indexOf(charSequence, charSequence, 0, 0), 6030 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke, objArr13);
                    Object[] objArr14 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i34 = ((int[]) objArr12[0])[0];
                    int i35 = ((int[]) objArr12[1])[0];
                    int i36 = ((int[]) objArr12[3])[0];
                    String[] strArr5 = (String[]) objArr12[2];
                    int i37 = (int) Runtime.getRuntime().totalMemory();
                    int i38 = i34 + (-683536602) + (((~((-945563676) | i37)) | (~(1031601663 | i37))) * 69) + (((~(i37 | 945617215)) | (~((-1031548124) | i37)) | 85984448) * (-69)) + 3694260;
                    int i39 = (i38 << 13) ^ i38;
                    int i40 = i39 ^ (i39 >>> 17);
                    ((int[]) objArr14[0])[0] = i40 ^ (i40 << 5);
                    Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                    Object[] objArr15 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i41 = ((int[]) objArr14[0])[0];
                    int i42 = ((int[]) objArr14[1])[0];
                    int i43 = ((int[]) objArr14[3])[0];
                    String[] strArr6 = (String[]) objArr14[2];
                    int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                    int i44 = (-1488610218) + (((~((-211595349) | iElapsedRealtime2)) | 75530256 | (~(1765569990 | iElapsedRealtime2))) * (-754));
                    int i45 = ~((-75530257) | iElapsedRealtime2);
                    int i46 = ~iElapsedRealtime2;
                    int i47 = i41 + i44 + ((i45 | (~(1841100246 | i46))) * (-754)) + ((i46 | (-211595349)) * 754);
                    int i48 = (i47 << 13) ^ i47;
                    int i49 = i48 ^ (i48 >>> 17);
                    ((int[]) objArr15[0])[0] = i49 ^ (i49 << 5);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            try {
                byte[] bArr3 = $$a;
                Object[] objArr16 = new Object[1];
                a(bArr3[8], (byte) (-bArr3[9]), (byte) (-bArr3[16]), objArr16);
                Class<?> cls2 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                a((byte) ($$b >>> 2), bArr3[61], (byte) (-bArr3[16]), objArr17);
                Class<?> cls3 = Class.forName((String) objArr17[0]);
                Object[] objArr18 = new Object[1];
                a(bArr3[58], bArr3[19], (byte) (-bArr3[16]), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b6 = (byte) (-bArr3[9]);
                Object[] objArr19 = new Object[1];
                a(b6, (byte) (b6 | TarConstants.LF_CHR), bArr3[7], objArr19);
                Object objInvoke2 = cls2.getMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0]);
                Object[] objArr20 = new Object[1];
                a(bArr3[23], bArr3[0], (byte) (-bArr3[16]), objArr20);
                Class<?> cls5 = Class.forName((String) objArr20[0]);
                byte b7 = bArr3[5];
                Object[] objArr21 = new Object[1];
                a(b7, (byte) (b7 | 70), bArr3[7], objArr21);
                Object objInvoke3 = cls5.getMethod((String) objArr21[0], new Class[0]).invoke(_removeNonVisible.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Object[] objArr22 = new Object[1];
                    a(bArr3[7], (byte) 91, b, objArr22);
                    Method declaredMethod = cls2.getDeclaredMethod((String) objArr22[0], cls4, cls3);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke2, str, objInvoke3);
                    return;
                }
                Object[] objArr23 = new Object[1];
                a(bArr3[43], (byte) 101, b, objArr23);
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
}
