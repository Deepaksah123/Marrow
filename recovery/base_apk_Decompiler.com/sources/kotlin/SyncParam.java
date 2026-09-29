package kotlin;

import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.wallet.WalletConstants;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.ZipFile;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;

/* JADX INFO: loaded from: classes5.dex */
public class SyncParam {
    private static final byte[] $$a;
    private static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    public static final Map handleMediaPlayPauseIfPendingOnHandler;
    private static Object onFastForward;
    private static byte[] onMediaButtonEvent;
    private static Object onPause;
    private static byte[] onPlay;
    public static final Map onPlayFromMediaId;
    private static int onPrepare;
    private static long onPrepareFromMediaId;
    private static long onPrepareFromSearch;
    private static int onPrepareFromUri;
    private static boolean onRemoveQueueItem;
    private static int onRemoveQueueItemAt;
    private static int onRewind;
    private static int onSeekTo;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[PHI: r1 r4 r9 r10 r11
      0x0033: PHI (r1v12 byte[]) = (r1v4 byte[]), (r1v13 byte[]) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r4v8 int) = (r4v0 int), (r4v10 int) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r9v4 byte[]) = (r9v1 byte[]), (r9v5 byte[]) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r10v10 int) = (r10v0 int), (r10v11 int) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r11v9 int) = (r11v1 int), (r11v10 int) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1 r9 r10 r11
      0x002d: PHI (r1v5 byte[]) = (r1v4 byte[]), (r1v13 byte[]) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r9v2 byte[]) = (r9v1 byte[]), (r9v5 byte[]) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r10v1 int) = (r10v0 int), (r10v11 int) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r11v2 int) = (r11v1 int), (r11v10 int) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, int r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.SyncParam.$17
            int r1 = r1 + 37
            int r2 = r1 % 128
            kotlin.SyncParam.$16 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L21
            byte[] r1 = kotlin.SyncParam.$$a
            r3 = 3722(0xe8a, float:5.216E-42)
            int r11 = r3 >>> r11
            int r3 = r10 + 100
            r4 = 17
            int r4 = r4 % r9
            byte[] r9 = new byte[r3]
            int r10 = r10 + 171
            if (r1 != 0) goto L33
            goto L2d
        L21:
            byte[] r1 = kotlin.SyncParam.$$a
            int r11 = 1073 - r11
            int r3 = r10 + 1
            int r4 = 119 - r9
            byte[] r9 = new byte[r3]
            if (r1 != 0) goto L33
        L2d:
            r4 = r11
            r3 = r1
            r5 = r2
            r11 = r10
            r1 = r4
            goto L51
        L33:
            r3 = r2
        L34:
            byte r5 = (byte) r4
            r9[r3] = r5
            int r5 = r3 + 1
            if (r3 != r10) goto L41
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9, r2)
            return r10
        L41:
            r3 = r1[r11]
            int r6 = kotlin.SyncParam.$17
            int r6 = r6 + 3
            int r7 = r6 % 128
            kotlin.SyncParam.$16 = r7
            int r6 = r6 % r0
            r8 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r8
        L51:
            int r4 = r4 + r10
            int r4 = r4 + (-2)
            int r10 = r1 + 1
            r1 = r3
            r3 = r5
            r8 = r11
            r11 = r10
            r10 = r8
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SyncParam.$$c(byte, int, int):java.lang.String");
    }

    private static URL RemoteActionCompatParcelizer(String str, ApplicationInfo applicationInfo) throws Throwable {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        int i;
        int i2;
        char c;
        byte b6;
        byte b7;
        int i3;
        String str$$c;
        ZipFile zipFile;
        byte b8;
        int i4;
        int i5;
        byte b9;
        byte b10;
        Object obj;
        Class<?> cls;
        int i6 = 2 % 2;
        try {
            ArrayList<File> arrayList = new ArrayList();
            byte[] bArr = $$a;
            int i7 = $10 + 75;
            int i8 = i7 % 128;
            $11 = i8;
            if (i7 % 2 == 0) {
                b = bArr[206];
                b2 = bArr[18877];
                b3 = 19391;
            } else {
                b = bArr[206];
                b2 = bArr[163];
                b3 = 1036;
            }
            int i9 = i8 + 53;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            Class<?> cls2 = Class.forName($$c(b, b2, (short) ((b2 ^ b3) | (b3 & b2))));
            byte b11 = bArr[41];
            int i11 = $10;
            int i12 = (i11 & 37) + (i11 | 37);
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                b4 = b11;
                b5 = bArr[82];
                i = b5 ^ 17140;
                i2 = b5 & 17140;
            } else {
                b4 = b11;
                b5 = bArr[14];
                i = b5 ^ X5455_ExtendedTimestamp.CREATE_TIME_BIT;
                i2 = b5 & X5455_ExtendedTimestamp.CREATE_TIME_BIT;
            }
            if (cls2.getField($$c(b4, b5, (short) (i | i2))).get(applicationInfo) != null) {
                int i13 = $11;
                int i14 = i13 + 15;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                byte b12 = bArr[206];
                int i16 = ((i13 | 39) << 1) - (i13 ^ 39);
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    byte b13 = bArr[29686];
                    cls = Class.forName($$c(b12, b13, (short) ((b13 & 16814) | (b13 ^ 16814))));
                } else {
                    byte b14 = bArr[163];
                    cls = Class.forName($$c(b12, b14, (short) (b14 | 1036)));
                }
                byte b15 = bArr[41];
                byte b16 = bArr[14];
                int i17 = $10 + 51;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                Object obj2 = cls.getField($$c(b15, b16, (short) ((b16 ^ X5455_ExtendedTimestamp.CREATE_TIME_BIT) | (b16 & X5455_ExtendedTimestamp.CREATE_TIME_BIT)))).get(applicationInfo);
                int i19 = $11;
                int i20 = ((i19 | 55) << 1) - (i19 ^ 55);
                int i21 = i20 % 128;
                $10 = i21;
                int i22 = i20 % 2;
                try {
                    Object[] objArr = {obj2};
                    int i23 = ((i21 | 47) << 1) - (i21 ^ 47);
                    $11 = i23 % 128;
                    int i24 = i23 % 2;
                    Class<?> cls3 = Class.forName($$c(bArr[59], bArr[16], (short) AnalyticsListener.EVENT_PLAYER_RELEASED));
                    int i25 = $11;
                    int i26 = ((i25 | 61) << 1) - (i25 ^ 61);
                    $10 = i26 % 128;
                    arrayList.add((i26 % 2 != 0 ? cls3.getDeclaredConstructor(String.class) : cls3.getDeclaredConstructor(String.class)).newInstance(objArr));
                    int i27 = $10;
                    int i28 = ((i27 | 47) << 1) - (i27 ^ 47);
                    $11 = i28 % 128;
                    int i29 = i28 % 2;
                    c = 206;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                c = 206;
            }
            byte b17 = bArr[c];
            byte b18 = bArr[163];
            Class<?> cls4 = Class.forName($$c(b17, b18, (short) ((b18 ^ 1036) | (b18 & 1036))));
            byte b19 = bArr[41];
            byte b20 = bArr[12];
            int i30 = $10;
            int i31 = ((i30 | 7) << 1) - (i30 ^ 7);
            $11 = i31 % 128;
            int i32 = i31 % 2;
            int i33 = AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED;
            if (i32 == 0) {
                cls4.getField($$c(b19, b20, (short) AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED)).get(applicationInfo);
                throw null;
            }
            if (cls4.getField($$c(b19, b20, (short) AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED)).get(applicationInfo) != null) {
                byte b21 = bArr[206];
                int i34 = $10;
                int i35 = ((i34 | 9) << 1) - (i34 ^ 9);
                $11 = i35 % 128;
                if (i35 % 2 == 0) {
                    b8 = bArr[12254];
                    i4 = b8 ^ 18127;
                    i5 = b8 & 18127;
                } else {
                    b8 = bArr[163];
                    i4 = b8 ^ 1036;
                    i5 = b8 & 1036;
                }
                Class<?> cls5 = Class.forName($$c(b21, b8, (short) (i4 | i5)));
                int i36 = $11;
                int i37 = (i36 ^ 95) + ((i36 & 95) << 1);
                $10 = i37 % 128;
                if (i37 % 2 != 0) {
                    b9 = bArr[41];
                    b10 = bArr[127];
                    i33 = 23414;
                } else {
                    b9 = bArr[41];
                    b10 = bArr[12];
                }
                int i38 = ((i36 | 15) << 1) - (i36 ^ 15);
                $10 = i38 % 128;
                if (i38 % 2 != 0) {
                    obj = cls5.getField($$c(b9, b10, (short) i33)).get(applicationInfo);
                    int i39 = 92 / 0;
                } else {
                    obj = cls5.getField($$c(b9, b10, (short) i33)).get(applicationInfo);
                }
                Object[] objArr2 = (Object[]) obj;
                int length = objArr2.length;
                int i40 = 0;
                while (i40 < length) {
                    int i41 = $10;
                    int i42 = i41 + 73;
                    $11 = i42 % 128;
                    int i43 = i42 % 2;
                    Object obj3 = objArr2[i40];
                    int i44 = (i41 ^ 57) + ((i41 & 57) << 1);
                    $11 = i44 % 128;
                    int i45 = i44 % 2;
                    try {
                        Object[] objArr3 = {obj3};
                        byte[] bArr2 = $$a;
                        arrayList.add(Class.forName($$c(bArr2[59], bArr2[16], (short) AnalyticsListener.EVENT_PLAYER_RELEASED)).getDeclaredConstructor(String.class).newInstance(objArr3));
                        int i46 = (i40 ^ 74) + ((i40 & 74) << 1);
                        i40 = ((i46 | (-73)) << 1) - (i46 ^ (-73));
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            for (File file : arrayList) {
                int i47 = $10 + 115;
                $11 = i47 % 128;
                int i48 = i47 % 2;
                try {
                    byte[] bArr3 = $$a;
                    byte b22 = bArr3[59];
                    byte b23 = bArr3[16];
                    short s = (short) AnalyticsListener.EVENT_PLAYER_RELEASED;
                    Class<?> cls6 = Class.forName($$c(b22, b23, s));
                    int i49 = $11 + 67;
                    int i50 = i49 % 128;
                    $10 = i50;
                    if (i49 % 2 != 0) {
                        b6 = bArr3[18631];
                        b7 = bArr3[109];
                        i3 = 23243;
                    } else {
                        b6 = bArr3[131];
                        b7 = bArr3[54];
                        i3 = 1003;
                    }
                    int i51 = i50 + 73;
                    $11 = i51 % 128;
                    if (i51 % 2 == 0) {
                        try {
                            cls6.getMethod($$c(b6, b7, (short) i3), null).invoke(file, null);
                            throw null;
                        } catch (Throwable th3) {
                            th = th3;
                            Throwable cause3 = th.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th;
                        }
                    }
                    if (((Boolean) cls6.getMethod($$c(b6, b7, (short) i3), null).invoke(file, null)).booleanValue()) {
                        int i52 = $10;
                        int i53 = (i52 & 95) + (i52 | 95);
                        $11 = i53 % 128;
                        int i54 = i53 % 2;
                        try {
                            byte b24 = bArr3[59];
                            byte b25 = bArr3[16];
                            int i55 = ((i52 | 75) << 1) - (i52 ^ 75);
                            $11 = i55 % 128;
                            int i56 = i55 % 2;
                            Class<?> cls7 = Class.forName($$c(b24, b25, s));
                            byte b26 = bArr3[6];
                            byte b27 = bArr3[355];
                            String str2 = (String) cls7.getMethod($$c(b26, b27, (short) ((b27 ^ 992) | (b27 & 992))), null).invoke(file, null);
                            try {
                                str$$c = $$c(bArr3[761], bArr3[69], (short) 992);
                                int i57 = $10;
                                int i58 = (i57 & 73) + (i57 | 73);
                                $11 = i58 % 128;
                                int i59 = i58 % 2;
                            } catch (Exception unused) {
                            }
                            if (str2.endsWith(str$$c)) {
                                StringBuilder sb = new StringBuilder();
                                byte b28 = bArr3[59];
                                byte b29 = bArr3[14];
                                sb.append($$c(b28, b29, (short) ((b29 & 981) | (b29 ^ 981))));
                                int i60 = $10;
                                int i61 = ((i60 | 63) << 1) - (i60 ^ 63);
                                $11 = i61 % 128;
                                int i62 = i61 % 2;
                                try {
                                    sb.append((String) Class.forName($$c(bArr3[59], bArr3[16], s)).getMethod($$c(bArr3[6], bArr3[12], (short) 981), null).invoke(file, null));
                                    byte b30 = bArr3[28];
                                    sb.append($$c((byte) 86, b30, (short) ((b30 ^ 967) | (b30 & 967))));
                                    sb.append(str);
                                    try {
                                        Object[] objArr4 = {sb.toString()};
                                        Class<?> cls8 = Class.forName($$c(bArr3[59], bArr3[16], (short) 967));
                                        Class<?>[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = String.class;
                                            URL url = (URL) cls8.getDeclaredConstructor(clsArr).newInstance(objArr4);
                                            try {
                                                zipFile = new ZipFile(file);
                                                try {
                                                } finally {
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            if (zipFile.getEntry(str.substring(1)) != null) {
                                                int i63 = $11;
                                                int i64 = (i63 ^ 49) + ((i63 & 49) << 1);
                                                $10 = i64 % 128;
                                                if (i64 % 2 == 0) {
                                                    zipFile.close();
                                                    return url;
                                                }
                                                zipFile.close();
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                            zipFile.close();
                                            Runtime.getRuntime().freeMemory();
                                            Process.getElapsedCpuTime();
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Throwable cause4 = th.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause5 = th6.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th6;
                                }
                            }
                        } catch (Throwable th7) {
                            Throwable cause6 = th7.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
            return null;
        } catch (Exception unused3) {
            return null;
        }
    }

    private SyncParam() {
    }

    public static Object AudioAttributesCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = $11 + 125;
        $10 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onPlayFromMediaId.get(Integer.valueOf(i ^ onPrepareFromUri));
            obj.hashCode();
            throw null;
        }
        Object obj2 = onPlayFromMediaId.get(Integer.valueOf(i ^ onPrepareFromUri));
        int i4 = $10 + 105;
        $11 = i4 % 128;
        if (i4 % 2 != 0) {
            return obj2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0449, code lost:
    
        if (((java.lang.Boolean) r5.getMethod($$c(r2, r9, (short) 684), null).invoke(r4, null)).booleanValue() != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1b88, code lost:
    
        r7.getDeclaredConstructor(r13).newInstance(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x1b8f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x1b90, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x1b93, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x1b94, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x1b96, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x1b9b, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x1ba2, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x1ba3, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x1bbe, code lost:
    
        r6 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x1bc3, code lost:
    
        r1 = r41.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        kotlin.SyncParam.onPause = r1.newInstance(r2, java.lang.Boolean.valueOf(!r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x1bec, code lost:
    
        if (r6 == null) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x1bee, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x1bf2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x1bf3, code lost:
    
        r1 = r0;
        r2 = r40 == true ? 1 : 0;
        r30 = r30;
        r36 = r36;
        r45 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x1bfe, code lost:
    
        if (r40 == 0) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x1c00, code lost:
    
        r2 = r40 == true ? 1 : 0;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x1c04, code lost:
    
        if (r2 < 26) goto L751;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x1c07, code lost:
    
        r1 = 2;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x1c10, code lost:
    
        r2 = r40 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x1c13, code lost:
    
        r3 = new java.lang.Object[]{-1693812565, 445566967};
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(1344538224);
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1c30, code lost:
    
        if (r1 != null) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x1c36, code lost:
    
        r1 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
        r1 = (char) ((r1 ^ 46412) + ((r1 & 46412) << 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x1c45, code lost:
    
        r5 = 12868 - (~(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
        r6 = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
        r49 = (r6 ^ 28) + ((r6 & 28) << 1);
        r6 = kotlin.SyncParam.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x1c66, code lost:
    
        r7 = r6[85];
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x1c69, code lost:
    
        r6 = r6[12];
        r1 = kotlin.startForeground.read(r1, r5, r49, 778945253, false, $$c(r7, r6, r6), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x1c89, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x1c8b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1c93, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1c99, code lost:
    
        r1 = 2;
        r3 = 2 % 2;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x1c9c, code lost:
    
        r3 = r1 % r1;
        r7 = ';';
        r11 = false;
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1ca8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x1caa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x1cb1, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x1cb2, code lost:
    
        r3 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x1cb6, code lost:
    
        if (r3 != null) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x1cb8, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x1cb9, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x1cba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x1cbb, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1003:0x187b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1136:0x198f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1165:0x193e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x045d A[Catch: all -> 0x045f, TryCatch #32 {all -> 0x045f, blocks: (B:117:0x0457, B:119:0x045d, B:120:0x045e), top: B:1050:0x0457 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x045e A[Catch: all -> 0x045f, TRY_LEAVE, TryCatch #32 {all -> 0x045f, blocks: (B:117:0x0457, B:119:0x045d, B:120:0x045e), top: B:1050:0x0457 }] */
    /* JADX WARN: Removed duplicated region for block: B:1252:0x1bbe A[EDGE_INSN: B:1252:0x1bbe->B:740:0x1bbe BREAK  A[LOOP:4: B:385:0x0dc2->B:697:0x1b51], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1267:? A[Catch: all -> 0x1f98, SYNTHETIC, TryCatch #63 {all -> 0x1f98, blocks: (B:915:0x1f50, B:916:0x1f53, B:778:0x1cb2, B:780:0x1cb8, B:781:0x1cb9, B:921:0x1f6c, B:923:0x1f7a, B:924:0x1f7b, B:926:0x1f7d, B:928:0x1f96, B:929:0x1f97, B:245:0x0843), top: B:1076:0x0843, inners: #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:727:0x1ba2 A[Catch: all -> 0x1b6a, TryCatch #36 {all -> 0x1b6a, blocks: (B:697:0x1b51, B:704:0x1b71, B:706:0x1b78, B:707:0x1b79, B:709:0x1b7b, B:711:0x1b84, B:712:0x1b85, B:725:0x1b9c, B:727:0x1ba2, B:728:0x1ba3, B:730:0x1ba5, B:732:0x1bae, B:733:0x1baf, B:692:0x1af1, B:679:0x1a51), top: B:1055:0x1b51, inners: #46, #71 }] */
    /* JADX WARN: Removed duplicated region for block: B:728:0x1ba3 A[Catch: all -> 0x1b6a, TryCatch #36 {all -> 0x1b6a, blocks: (B:697:0x1b51, B:704:0x1b71, B:706:0x1b78, B:707:0x1b79, B:709:0x1b7b, B:711:0x1b84, B:712:0x1b85, B:725:0x1b9c, B:727:0x1ba2, B:728:0x1ba3, B:730:0x1ba5, B:732:0x1bae, B:733:0x1baf, B:692:0x1af1, B:679:0x1a51), top: B:1055:0x1b51, inners: #46, #71 }] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x1cb8 A[Catch: all -> 0x1f98, TryCatch #63 {all -> 0x1f98, blocks: (B:915:0x1f50, B:916:0x1f53, B:778:0x1cb2, B:780:0x1cb8, B:781:0x1cb9, B:921:0x1f6c, B:923:0x1f7a, B:924:0x1f7b, B:926:0x1f7d, B:928:0x1f96, B:929:0x1f97, B:245:0x0843), top: B:1076:0x0843, inners: #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:781:0x1cb9 A[Catch: all -> 0x1f98, TRY_LEAVE, TryCatch #63 {all -> 0x1f98, blocks: (B:915:0x1f50, B:916:0x1f53, B:778:0x1cb2, B:780:0x1cb8, B:781:0x1cb9, B:921:0x1f6c, B:923:0x1f7a, B:924:0x1f7b, B:926:0x1f7d, B:928:0x1f96, B:929:0x1f97, B:245:0x0843), top: B:1076:0x0843, inners: #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:866:0x1e76 A[Catch: all -> 0x1f37, TryCatch #11 {all -> 0x1f37, blocks: (B:814:0x1d2f, B:819:0x1d9c, B:821:0x1da2, B:822:0x1da3, B:800:0x1d07, B:802:0x1d0d, B:803:0x1d0e, B:836:0x1dca, B:838:0x1de2, B:839:0x1de3, B:841:0x1de5, B:843:0x1dfd, B:844:0x1dfe, B:864:0x1e6f, B:866:0x1e76, B:867:0x1e77, B:871:0x1e7f, B:873:0x1e98, B:874:0x1e99, B:883:0x1eca, B:885:0x1ed6, B:886:0x1ed7, B:888:0x1ed9, B:890:0x1ef1, B:891:0x1ef2, B:896:0x1f08, B:898:0x1f18, B:899:0x1f19, B:901:0x1f1b, B:903:0x1f35, B:904:0x1f36, B:401:0x0ec7, B:815:0x1d6b, B:816:0x1d99, B:578:0x15e4, B:377:0x0d52, B:574:0x159c, B:576:0x15b1, B:373:0x0cdb), top: B:1012:0x0ec7, inners: #49, #64, #93, #102, #108, #130 }] */
    /* JADX WARN: Removed duplicated region for block: B:867:0x1e77 A[Catch: all -> 0x1f37, TryCatch #11 {all -> 0x1f37, blocks: (B:814:0x1d2f, B:819:0x1d9c, B:821:0x1da2, B:822:0x1da3, B:800:0x1d07, B:802:0x1d0d, B:803:0x1d0e, B:836:0x1dca, B:838:0x1de2, B:839:0x1de3, B:841:0x1de5, B:843:0x1dfd, B:844:0x1dfe, B:864:0x1e6f, B:866:0x1e76, B:867:0x1e77, B:871:0x1e7f, B:873:0x1e98, B:874:0x1e99, B:883:0x1eca, B:885:0x1ed6, B:886:0x1ed7, B:888:0x1ed9, B:890:0x1ef1, B:891:0x1ef2, B:896:0x1f08, B:898:0x1f18, B:899:0x1f19, B:901:0x1f1b, B:903:0x1f35, B:904:0x1f36, B:401:0x0ec7, B:815:0x1d6b, B:816:0x1d99, B:578:0x15e4, B:377:0x0d52, B:574:0x159c, B:576:0x15b1, B:373:0x0cdb), top: B:1012:0x0ec7, inners: #49, #64, #93, #102, #108, #130 }] */
    /* JADX WARN: Removed duplicated region for block: B:915:0x1f50 A[Catch: all -> 0x1f98, TRY_ENTER, TryCatch #63 {all -> 0x1f98, blocks: (B:915:0x1f50, B:916:0x1f53, B:778:0x1cb2, B:780:0x1cb8, B:781:0x1cb9, B:921:0x1f6c, B:923:0x1f7a, B:924:0x1f7b, B:926:0x1f7d, B:928:0x1f96, B:929:0x1f97, B:245:0x0843), top: B:1076:0x0843, inners: #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:943:0x1fcd A[Catch: Exception -> 0x209f, TRY_ENTER, TryCatch #40 {Exception -> 0x209f, blocks: (B:8:0x00e4, B:10:0x00fc, B:12:0x010d, B:42:0x0225, B:971:0x2096, B:973:0x209d, B:974:0x209e, B:47:0x026f, B:961:0x2082, B:963:0x2089, B:964:0x208a, B:966:0x208c, B:968:0x2093, B:969:0x2094, B:57:0x02fa, B:62:0x0348, B:64:0x034e, B:65:0x034f, B:66:0x0350, B:68:0x0394, B:77:0x03d8, B:81:0x03e1, B:85:0x03ea, B:89:0x03f3, B:95:0x03ff, B:943:0x1fcd, B:945:0x1fd1, B:958:0x205b, B:946:0x1fde, B:947:0x1fe2, B:952:0x202b, B:954:0x2031, B:955:0x2032, B:948:0x1ffa, B:949:0x2028, B:58:0x030d, B:52:0x02c3, B:54:0x02e8, B:49:0x027f, B:51:0x02b0, B:43:0x0247), top: B:1062:0x00e4, inners: #3, #18, #51, #55, #60 }] */
    /* JADX WARN: Type inference failed for: r10v99, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r13v87, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r14v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v141 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v196 */
    /* JADX WARN: Type inference failed for: r2v255 */
    /* JADX WARN: Type inference failed for: r2v256 */
    /* JADX WARN: Type inference failed for: r2v257 */
    /* JADX WARN: Type inference failed for: r36v1 */
    /* JADX WARN: Type inference failed for: r36v13 */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r36v20 */
    /* JADX WARN: Type inference failed for: r36v23 */
    /* JADX WARN: Type inference failed for: r36v24 */
    /* JADX WARN: Type inference failed for: r36v25 */
    /* JADX WARN: Type inference failed for: r36v26 */
    /* JADX WARN: Type inference failed for: r36v27 */
    /* JADX WARN: Type inference failed for: r36v28 */
    /* JADX WARN: Type inference failed for: r36v29 */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v4 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r3v174, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v84, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v85, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r40v4 */
    /* JADX WARN: Type inference failed for: r4v204, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v107, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r6v108 */
    /* JADX WARN: Type inference failed for: r6v109 */
    /* JADX WARN: Type inference failed for: r6v114 */
    /* JADX WARN: Type inference failed for: r6v115 */
    /* JADX WARN: Type inference failed for: r6v135 */
    /* JADX WARN: Type inference failed for: r6v143, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v145, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v184 */
    /* JADX WARN: Type inference failed for: r6v252, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v258, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v260 */
    /* JADX WARN: Type inference failed for: r6v269 */
    /* JADX WARN: Type inference failed for: r6v280 */
    /* JADX WARN: Type inference failed for: r6v320 */
    /* JADX WARN: Type inference failed for: r6v421 */
    /* JADX WARN: Type inference failed for: r6v425 */
    /* JADX WARN: Type inference failed for: r6v426 */
    /* JADX WARN: Type inference failed for: r6v427 */
    /* JADX WARN: Type inference failed for: r6v428 */
    /* JADX WARN: Type inference failed for: r6v432 */
    /* JADX WARN: Type inference failed for: r6v433 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v155 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v188 */
    /* JADX WARN: Type inference failed for: r7v189 */
    /* JADX WARN: Type inference failed for: r7v190 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r8v165, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v87, types: [java.lang.Class] */
    static {
        /*
            Method dump skipped, instruction units count: 8406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SyncParam.<clinit>():void");
    }

    public static Object read(int i, int i2, char c, int i3, boolean z, String str, Class[] clsArr) throws Throwable {
        Object[] objArr;
        Integer numValueOf;
        String str$$c;
        Object obj;
        Object method;
        int i4 = 2 % 2;
        Map map = onPlayFromMediaId;
        Object obj2 = map.get(Integer.valueOf(i3));
        if (obj2 != null) {
            return obj2;
        }
        Integer numValueOf2 = Integer.valueOf(i3);
        Object obj3 = onPause;
        int i5 = $11;
        int i6 = ((i5 | 41) << 1) - (i5 ^ 41);
        $10 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 7;
        $10 = i8 % 128;
        try {
            if (i8 % 2 != 0) {
                objArr = new Object[3];
                objArr[2] = Character.valueOf(c);
                numValueOf = Integer.valueOf(i2);
            } else {
                objArr = new Object[3];
                objArr[2] = Character.valueOf(c);
                numValueOf = Integer.valueOf(i2);
            }
            objArr[1] = numValueOf;
            objArr[0] = Integer.valueOf(i);
            byte b = $$a[14];
            int i9 = $11;
            int i10 = ((i9 | 5) << 1) - (i9 ^ 5);
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                str$$c = $$c(b, r9[87], (short) 21959);
                obj = onFastForward;
            } else {
                str$$c = $$c(b, r9[85], (short) 450);
                obj = onFastForward;
            }
            Class<?> cls = Class.forName(str$$c, true, (ClassLoader) obj);
            String str$$c2 = $$c(r9[28], r9[41], (short) 392);
            Class<?>[] clsArr2 = new Class[3];
            Class<?> cls2 = Integer.TYPE;
            int i11 = $10 + 11;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            clsArr2[0] = cls2;
            clsArr2[1] = Integer.TYPE;
            clsArr2[2] = Character.TYPE;
            Method method2 = cls.getMethod(str$$c2, clsArr2);
            int i13 = $11 + 39;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            Class cls3 = (Class) method2.invoke(obj3, objArr);
            int i15 = $10 + 9;
            int i16 = i15 % 128;
            $11 = i16;
            Object obj4 = null;
            if (i15 % 2 == 0) {
                throw null;
            }
            if (str == null) {
                if (z) {
                    int i17 = i16 + 95;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        cls3.getDeclaredConstructor(clsArr);
                        obj4.hashCode();
                        throw null;
                    }
                    method = cls3.getDeclaredConstructor(clsArr);
                } else {
                    method = cls3.getConstructor(clsArr);
                }
            } else if (clsArr == null) {
                int i18 = (i16 ^ 107) + ((i16 & 107) << 1);
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
                if (z) {
                    int i19 = (i16 ^ 19) + ((i16 & 19) << 1);
                    $10 = i19 % 128;
                    if (i19 % 2 != 0) {
                        method = cls3.getDeclaredField(str);
                        int i20 = 24 / 0;
                    } else {
                        method = cls3.getDeclaredField(str);
                    }
                } else {
                    method = cls3.getField(str);
                }
            } else if (!(!z)) {
                method = cls3.getDeclaredMethod(str, clsArr);
            } else {
                method = cls3.getMethod(str, clsArr);
                int i21 = $10;
                int i22 = ((i21 | 103) << 1) - (i21 ^ 103);
                $11 = i22 % 128;
                int i23 = i22 % 2;
            }
            map.put(numValueOf2, method);
            return method;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object RemoteActionCompatParcelizer(int i, int i2, char c) throws Throwable {
        Class<?> cls;
        byte b;
        char c2;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = (i4 ^ 29) + ((i4 & 29) << 1);
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        Object obj = onPause;
        int i8 = (i6 ^ 103) + ((i6 & 103) << 1);
        $11 = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Character.valueOf(c);
            int i10 = $11;
            int i11 = (i10 ^ 107) + ((i10 & 107) << 1);
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[1] = Integer.valueOf(i2);
                objArr[1] = Integer.valueOf(i);
            } else {
                objArr[1] = Integer.valueOf(i2);
                objArr[0] = Integer.valueOf(i);
            }
            int i12 = $11;
            int i13 = (i12 ^ 41) + ((i12 & 41) << 1);
            $10 = i13 % 128;
            int i14 = i13 % 2;
            byte[] bArr = $$a;
            byte b2 = bArr[14];
            byte b3 = bArr[85];
            int i15 = (i12 ^ 113) + ((i12 & 113) << 1);
            $10 = i15 % 128;
            int i16 = i15 % 2;
            String str$$c = $$c(b2, b3, (short) 450);
            ClassLoader classLoader = (ClassLoader) onFastForward;
            int i17 = $10;
            int i18 = (i17 & 57) + (i17 | 57);
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cls = Class.forName(str$$c, true, classLoader);
                b = bArr[86];
                c2 = ' ';
            } else {
                cls = Class.forName(str$$c, true, classLoader);
                b = bArr[28];
                c2 = ')';
            }
            String str$$c2 = $$c(b, bArr[c2], (short) 392);
            Class<?>[] clsArr = new Class[3];
            clsArr[0] = Integer.TYPE;
            clsArr[1] = Integer.TYPE;
            Class<?> cls2 = Character.TYPE;
            int i19 = $11;
            int i20 = ((i19 | 63) << 1) - (i19 ^ 63);
            $10 = i20 % 128;
            int i21 = i20 % 2;
            clsArr[2] = cls2;
            Object objInvoke = cls.getMethod(str$$c2, clsArr).invoke(obj, objArr);
            int i22 = $10;
            int i23 = (i22 & 71) + (i22 | 71);
            $11 = i23 % 128;
            int i24 = i23 % 2;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int RemoteActionCompatParcelizer(Object obj) throws Throwable {
        byte b;
        byte b2;
        int i;
        int i2 = 2 % 2;
        Object obj2 = onPause;
        int i3 = $10;
        int i4 = (i3 ^ 17) + ((i3 & 17) << 1);
        $11 = i4 % 128;
        int i5 = i4 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i6 = ~(((-979033699) & startUptimeMillis) | ((-979033699) ^ startUptimeMillis));
            int i7 = ((i6 & 805850176) | (805850176 ^ i6)) * (-566);
            int i8 = (((((-449787852) ^ i7) + ((i7 & (-449787852)) << 1)) - (-383336032)) - (~(-(-((~((startUptimeMillis & (-173183523)) | ((-173183523) ^ startUptimeMillis))) * 566))))) - 1;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i9 = ~iFreeMemory;
            int i10 = ~((i9 & 385344930) | (i9 ^ 385344930));
            int i11 = -(-(((i10 & 5308546) | (5308546 ^ i10)) * (-970)));
            int i12 = ((1863917438 ^ i11) + ((i11 & 1863917438) << 1)) - 1122403168;
            int i13 = ~iFreeMemory;
            int i14 = ((~((i13 & 385344930) | (i13 ^ 385344930))) | 380036384) * 970;
            if (i8 > ((i12 | i14) << 1) - (i14 ^ i12)) {
                b = bArr[14];
                b2 = bArr[70];
                i = 14474;
            } else {
                b = bArr[14];
                b2 = bArr[85];
                i = 450;
            }
            Class<?> cls = Class.forName($$c(b, b2, (short) i), true, (ClassLoader) onFastForward);
            int i15 = $11 + 51;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            Integer num = (Integer) cls.getMethod($$c(bArr[28], bArr[41], (short) 392), Object.class).invoke(obj2, objArr);
            int i17 = $10 + 101;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            int iIntValue = num.intValue();
            int i19 = $11 + 71;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int write(int i) throws Throwable {
        Class<?> cls;
        byte b;
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = i3 + 19;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Object obj = onPause;
        int i5 = ((i3 | 115) << 1) - (i3 ^ 115);
        $10 = i5 % 128;
        int i6 = i5 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            byte b2 = bArr[14];
            int i7 = $10 + 49;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            String str$$c = $$c(b2, bArr[85], (short) 450);
            Object obj2 = onFastForward;
            int i9 = $10 + 97;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cls = Class.forName(str$$c, true, (ClassLoader) obj2);
                b = bArr[108];
            } else {
                cls = Class.forName(str$$c, true, (ClassLoader) obj2);
                b = bArr[54];
            }
            byte b3 = b;
            byte b4 = bArr[69];
            short s = (short) WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR;
            int i10 = $10;
            int i11 = (i10 ^ 93) + ((i10 & 93) << 1);
            $11 = i11 % 128;
            int i12 = i11 % 2;
            Integer num = (Integer) cls.getMethod($$c(b3, b4, s), Integer.TYPE).invoke(obj, objArr);
            int i13 = $10 + 51;
            $11 = i13 % 128;
            if (i13 % 2 != 0) {
                return num.intValue();
            }
            int i14 = 62 / 0;
            return num.intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
