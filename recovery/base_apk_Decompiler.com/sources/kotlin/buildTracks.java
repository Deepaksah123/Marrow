package kotlin;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class buildTracks {
    private static final byte[] $$a;
    private static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    public static final Map onCommand;
    private static Object onFastForward;
    private static Object onMediaButtonEvent;
    private static byte[] onPause;
    private static byte[] onPlay;
    public static final Map onPlayFromMediaId;
    private static long onPlayFromSearch;
    private static int onPlayFromUri;
    private static long onPrepare;
    private static int onPrepareFromUri;
    private static int onRemoveQueueItem;
    private static long onRemoveQueueItemAt;
    private static boolean onRewind;
    private static int onSeekTo;
    private static byte[] onSetRepeatMode;
    private static int onSetShuffleMode;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0037 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.buildTracks.$16
            int r1 = r1 + 37
            int r2 = r1 % 128
            kotlin.buildTracks.$17 = r2
            int r1 = r1 % r0
            byte[] r1 = kotlin.buildTracks.$$a
            int r6 = r6 + 1
            int r8 = r8 + 4
            int r7 = 119 - r7
            byte[] r3 = new byte[r6]
            r4 = 0
            if (r1 != 0) goto L29
            int r2 = r2 + 89
            int r7 = r2 % 128
            kotlin.buildTracks.$16 = r7
            int r2 = r2 % r0
            if (r2 == 0) goto L25
            r7 = 99
            int r7 = r7 / r4
        L25:
            r7 = r6
            r0 = r8
            r2 = r4
            goto L39
        L29:
            r0 = r4
        L2a:
            int r2 = r0 + 1
            byte r5 = (byte) r7
            r3[r0] = r5
            if (r2 != r6) goto L37
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3, r4)
            return r6
        L37:
            r0 = r1[r8]
        L39:
            int r8 = r8 + 1
            int r7 = r7 + r0
            int r7 = r7 + 1
            r0 = r2
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildTracks.$$c(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x04a8 A[Catch: Exception -> 0x021f, TryCatch #11 {Exception -> 0x021f, blocks: (B:110:0x047a, B:113:0x0489, B:115:0x048d, B:124:0x049d, B:123:0x049a, B:129:0x04a2, B:131:0x04a8, B:132:0x04a9, B:140:0x04be, B:142:0x04c5, B:143:0x04c6, B:148:0x04d5, B:150:0x04dc, B:151:0x04dd, B:158:0x04f5, B:160:0x04fc, B:161:0x04fd, B:163:0x0506, B:111:0x047f, B:119:0x0494), top: B:194:0x047a, inners: #13, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a9 A[Catch: Exception -> 0x021f, TryCatch #11 {Exception -> 0x021f, blocks: (B:110:0x047a, B:113:0x0489, B:115:0x048d, B:124:0x049d, B:123:0x049a, B:129:0x04a2, B:131:0x04a8, B:132:0x04a9, B:140:0x04be, B:142:0x04c5, B:143:0x04c6, B:148:0x04d5, B:150:0x04dc, B:151:0x04dd, B:158:0x04f5, B:160:0x04fc, B:161:0x04fd, B:163:0x0506, B:111:0x047f, B:119:0x0494), top: B:194:0x047a, inners: #13, #16 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.URL RemoteActionCompatParcelizer(java.lang.String r22, android.content.pm.ApplicationInfo r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildTracks.RemoteActionCompatParcelizer(java.lang.String, android.content.pm.ApplicationInfo):java.net.URL");
    }

    private buildTracks() {
    }

    public static Object AudioAttributesCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = (i3 & 69) + (i3 | 69);
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            Map map = onPlayFromMediaId;
            int i5 = onPrepareFromUri;
            map.get(Integer.valueOf((i | i5) & (~(i & i5))));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map map2 = onPlayFromMediaId;
        int i6 = onPrepareFromUri;
        Object obj2 = map2.get(Integer.valueOf((i | i6) & (~(i & i6))));
        int i7 = $10 + 7;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 99 / 0;
        }
        return obj2;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instruction units count: 8266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildTracks.<clinit>():void");
    }

    public static Object read(int i, int i2, char c, int i3, boolean z, String str, Class[] clsArr) throws Throwable {
        Object[] objArr;
        Integer numValueOf;
        Class<?> cls;
        byte b;
        Object declaredMethod;
        int i4 = 2 % 2;
        Map map = onPlayFromMediaId;
        Object obj = map.get(Integer.valueOf(i3));
        int i5 = $10;
        int i6 = (i5 ^ 69) + ((i5 & 69) << 1);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        if (obj != null) {
            return obj;
        }
        Integer numValueOf2 = Integer.valueOf(i3);
        Object obj2 = onMediaButtonEvent;
        int i8 = $10;
        int i9 = (i8 ^ 31) + ((i8 & 31) << 1);
        $11 = i9 % 128;
        try {
            if (i9 % 2 == 0) {
                objArr = new Object[5];
                objArr[4] = Character.valueOf(c);
                numValueOf = Integer.valueOf(i2);
            } else {
                objArr = new Object[3];
                objArr[2] = Character.valueOf(c);
                numValueOf = Integer.valueOf(i2);
            }
            objArr[1] = numValueOf;
            objArr[0] = Integer.valueOf(i);
            byte[] bArr = $$a;
            String str$$c = $$c(bArr[22], bArr[16], (short) 613);
            Object obj3 = onFastForward;
            int i10 = $11;
            int i11 = (i10 & 23) + (i10 | 23);
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cls = Class.forName(str$$c, true, (ClassLoader) obj3);
                b = bArr[31359];
            } else {
                cls = Class.forName(str$$c, true, (ClassLoader) obj3);
                b = bArr[199];
            }
            String str$$c2 = $$c(b, bArr[23], (short) 1067);
            Class<?>[] clsArr2 = new Class[3];
            int i12 = $11;
            int i13 = (i12 & 19) + (i12 | 19);
            $10 = i13 % 128;
            int i14 = i13 % 2;
            clsArr2[0] = Integer.TYPE;
            clsArr2[1] = Integer.TYPE;
            clsArr2[2] = Character.TYPE;
            Class cls2 = (Class) cls.getMethod(str$$c2, clsArr2).invoke(obj2, objArr);
            int i15 = $11;
            int i16 = (i15 ^ 93) + ((i15 & 93) << 1);
            int i17 = i16 % 128;
            $10 = i17;
            int i18 = i16 % 2;
            if (str == null) {
                if (!z) {
                    declaredMethod = cls2.getConstructor(clsArr);
                } else {
                    int i19 = (i17 ^ 11) + ((i17 & 11) << 1);
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    declaredMethod = cls2.getDeclaredConstructor(clsArr);
                    int i21 = $11;
                    int i22 = (i21 ^ 39) + ((i21 & 39) << 1);
                    $10 = i22 % 128;
                    int i23 = i22 % 2;
                }
                int i24 = $10 + 3;
                $11 = i24 % 128;
                int i25 = i24 % 2;
            } else if (clsArr == null) {
                int i26 = (i15 & 3) + (i15 | 3);
                int i27 = i26 % 128;
                $10 = i27;
                int i28 = i26 % 2;
                if (z) {
                    int i29 = (i27 ^ 29) + ((i27 & 29) << 1);
                    $11 = i29 % 128;
                    if (i29 % 2 == 0) {
                        cls2.getDeclaredField(str);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    declaredMethod = cls2.getDeclaredField(str);
                } else {
                    declaredMethod = cls2.getField(str);
                }
            } else if (!z) {
                declaredMethod = cls2.getMethod(str, clsArr);
                int i30 = $10;
                int i31 = (i30 ^ 7) + ((i30 & 7) << 1);
                $11 = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 3 % 4;
                }
            } else {
                int i33 = i15 + 91;
                $10 = i33 % 128;
                int i34 = i33 % 2;
                declaredMethod = cls2.getDeclaredMethod(str, clsArr);
            }
            map.put(numValueOf2, declaredMethod);
            return declaredMethod;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object read(int i, int i2, char c) throws Throwable {
        Object[] objArr;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = (i4 ^ 71) + ((i4 & 71) << 1);
        $11 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Object obj2 = onMediaButtonEvent;
        int i6 = i4 + 107;
        $11 = i6 % 128;
        char c2 = 4;
        try {
            if (i6 % 2 == 0) {
                objArr = new Object[4];
                objArr[4] = Character.valueOf(c);
            } else {
                objArr = new Object[3];
                objArr[2] = Character.valueOf(c);
            }
            int i7 = $10;
            int i8 = ((i7 | 97) << 1) - (i7 ^ 97);
            $11 = i8 % 128;
            int i9 = i8 % 2;
            objArr[1] = Integer.valueOf(i2);
            objArr[0] = Integer.valueOf(i);
            byte[] bArr = $$a;
            String str$$c = $$c(bArr[22], bArr[16], (short) 613);
            ClassLoader classLoader = (ClassLoader) onFastForward;
            int i10 = $11;
            int i11 = ((i10 | 25) << 1) - (i10 ^ 25);
            $10 = i11 % 128;
            int i12 = i11 % 2;
            Class<?> cls = Class.forName(str$$c, true, classLoader);
            byte b = bArr[199];
            int i13 = $10 + 69;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            String str$$c2 = $$c(b, bArr[23], (short) 1067);
            Class<?>[] clsArr = new Class[3];
            int i15 = $10 + 61;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                clsArr[0] = Integer.TYPE;
                clsArr[0] = Integer.TYPE;
            } else {
                clsArr[0] = Integer.TYPE;
                clsArr[1] = Integer.TYPE;
                c2 = 2;
            }
            int i16 = $11;
            int i17 = ((i16 | 23) << 1) - (i16 ^ 23);
            $10 = i17 % 128;
            if (i17 % 2 == 0) {
                clsArr[c2] = Character.TYPE;
                return cls.getMethod(str$$c2, clsArr).invoke(obj2, objArr);
            }
            clsArr[c2] = Character.TYPE;
            cls.getMethod(str$$c2, clsArr).invoke(obj2, objArr);
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int RemoteActionCompatParcelizer(Object obj) throws Throwable {
        String str$$c;
        Class<?>[] clsArr;
        int i = 2 % 2;
        int i2 = $10;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        int i4 = i3 % 128;
        $11 = i4;
        int i5 = i3 % 2;
        Object obj2 = onMediaButtonEvent;
        int i6 = (i4 & 105) + (i4 | 105);
        $10 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i4 + 1;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[22], bArr[16], (short) 613), true, (ClassLoader) onFastForward);
            int i10 = $10;
            int i11 = i10 + 115;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            byte b = bArr[61];
            int i13 = (i10 & 63) + (i10 | 63);
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                str$$c = $$c(b, bArr[129], (short) 2303);
                clsArr = new Class[0];
            } else {
                str$$c = $$c(b, bArr[129], (short) 1086);
                clsArr = new Class[1];
            }
            clsArr[0] = Object.class;
            Object objInvoke = cls.getMethod(str$$c, clsArr).invoke(obj2, objArr);
            int i14 = $11 + 35;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                ((Integer) objInvoke).intValue();
                throw null;
            }
            int iIntValue = ((Integer) objInvoke).intValue();
            int i15 = $10;
            int i16 = (i15 & 73) + (i15 | 73);
            $11 = i16 % 128;
            int i17 = i16 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int read(int i) throws Throwable {
        Class<?> cls;
        char c;
        Method method;
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = i3 + 87;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object obj = onMediaButtonEvent;
        int i6 = i3 + 125;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            int i8 = $10;
            int i9 = (i8 & 61) + (i8 | 61);
            $11 = i9 % 128;
            int i10 = i9 % 2;
            byte b = $$a[22];
            int i11 = i8 + 81;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            String str$$c = $$c(b, r5[16], (short) 613);
            Object obj2 = onFastForward;
            int i13 = $11 + 125;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cls = Class.forName(str$$c, true, (ClassLoader) obj2);
                c = 31000;
            } else {
                cls = Class.forName(str$$c, true, (ClassLoader) obj2);
                c = 348;
            }
            String str$$c2 = $$c(r5[c], r5[14], (short) ($$b | 558));
            Class<?>[] clsArr = new Class[1];
            int i14 = $11;
            int i15 = ((i14 | 89) << 1) - (i14 ^ 89);
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                clsArr[1] = Integer.TYPE;
                method = cls.getMethod(str$$c2, clsArr);
            } else {
                clsArr[0] = Integer.TYPE;
                method = cls.getMethod(str$$c2, clsArr);
            }
            int iIntValue = ((Integer) method.invoke(obj, objArr)).intValue();
            int i16 = $11 + 43;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
