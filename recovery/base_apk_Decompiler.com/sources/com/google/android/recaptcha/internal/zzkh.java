package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzkh<T> implements zzkr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzlv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzke zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzjs zzm;
    private final zzll zzn;
    private final zzif zzo;
    private final zzkk zzp;
    private final zzjz zzq;

    private final Object zzA(Object obj, int i) {
        zzkr zzkrVarZzx = zzx(i);
        int iZzu = zzu(i);
        if (!zzN(obj, i)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, 1048575 & iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzkr zzkrVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i);
            Unsafe unsafe = zzb;
            long j = iZzu & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzkr zzkrVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i);
            Unsafe unsafe = zzb;
            long j = iZzu & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = this.zzc[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzkr zzkrVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzkq zzkqVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzlv.zzs(obj, j, zzkqVar.zzs());
        } else if (this.zzi) {
            zzlv.zzs(obj, j, zzkqVar.zzr());
        } else {
            zzlv.zzs(obj, j, zzkqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzlv.zzq(obj, j, (1 << (iZzr >>> 20)) | zzlv.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzlv.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return ((1 << (iZzr >>> 20)) & zzlv.zzc(obj, j)) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzlv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzlv.zzb(obj, j2)) != 0;
            case 2:
                return zzlv.zzd(obj, j2) != 0;
            case 3:
                return zzlv.zzd(obj, j2) != 0;
            case 4:
                return zzlv.zzc(obj, j2) != 0;
            case 5:
                return zzlv.zzd(obj, j2) != 0;
            case 6:
                return zzlv.zzc(obj, j2) != 0;
            case 7:
                return zzlv.zzw(obj, j2);
            case 8:
                Object objZzf = zzlv.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzgw) {
                    return !zzgw.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzlv.zzf(obj, j2) != null;
            case 10:
                return !zzgw.zzb.equals(zzlv.zzf(obj, j2));
            case 11:
                return zzlv.zzc(obj, j2) != 0;
            case 12:
                return zzlv.zzc(obj, j2) != 0;
            case 13:
                return zzlv.zzc(obj, j2) != 0;
            case 14:
                return zzlv.zzd(obj, j2) != 0;
            case 15:
                return zzlv.zzc(obj, j2) != 0;
            case 16:
                return zzlv.zzd(obj, j2) != 0;
            case 17:
                return zzlv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzkr zzkrVar) {
        return zzkrVar.zzl(zzlv.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzlv.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzlv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzmd zzmdVar) throws IOException {
        if (obj instanceof String) {
            zzmdVar.zzG(i, (String) obj);
        } else {
            zzmdVar.zzd(i, (zzgw) obj);
        }
    }

    static zzlm zzd(Object obj) {
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVar = zzitVar.zzc;
        if (zzlmVar != zzlm.zzc()) {
            return zzlmVar;
        }
        zzlm zzlmVarZzf = zzlm.zzf();
        zzitVar.zzc = zzlmVarZzf;
        return zzlmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0363  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.recaptcha.internal.zzkh zzm(java.lang.Class r33, com.google.android.recaptcha.internal.zzkb r34, com.google.android.recaptcha.internal.zzkk r35, com.google.android.recaptcha.internal.zzjs r36, com.google.android.recaptcha.internal.zzll r37, com.google.android.recaptcha.internal.zzif r38, com.google.android.recaptcha.internal.zzjz r39) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzkb, com.google.android.recaptcha.internal.zzkk, com.google.android.recaptcha.internal.zzjs, com.google.android.recaptcha.internal.zzll, com.google.android.recaptcha.internal.zzif, com.google.android.recaptcha.internal.zzjz):com.google.android.recaptcha.internal.zzkh");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzlv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzlv.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzlv.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzlv.zzf(obj, j)).longValue();
    }

    private final zzix zzw(int i) {
        int i2 = i / 3;
        return (zzix) this.zzd[i2 + i2 + 1];
    }

    private final zzkr zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzkr zzkrVar = (zzkr) objArr[i3];
        if (zzkrVar != null) {
            return zzkrVar;
        }
        zzkr zzkrVarZzb = zzkn.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzkrVarZzb;
        return zzkrVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzll zzllVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzlv.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x052e  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v122, types: [com.google.android.recaptcha.internal.zzjm] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v191, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269, types: [int] */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r0v281 */
    /* JADX WARN: Type inference failed for: r0v282 */
    /* JADX WARN: Type inference failed for: r0v283 */
    /* JADX WARN: Type inference failed for: r0v284 */
    /* JADX WARN: Type inference failed for: r0v285 */
    /* JADX WARN: Type inference failed for: r0v286 */
    /* JADX WARN: Type inference failed for: r0v287 */
    /* JADX WARN: Type inference failed for: r0v288 */
    /* JADX WARN: Type inference failed for: r0v289 */
    /* JADX WARN: Type inference failed for: r0v290 */
    /* JADX WARN: Type inference failed for: r0v291 */
    /* JADX WARN: Type inference failed for: r0v292 */
    /* JADX WARN: Type inference failed for: r0v293 */
    /* JADX WARN: Type inference failed for: r0v294 */
    /* JADX WARN: Type inference failed for: r0v295 */
    /* JADX WARN: Type inference failed for: r0v296 */
    /* JADX WARN: Type inference failed for: r0v297 */
    /* JADX WARN: Type inference failed for: r0v298 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62, types: [int] */
    /* JADX WARN: Type inference failed for: r2v112 */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v92, types: [int] */
    /* JADX WARN: Type inference failed for: r2v95, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zza(java.lang.Object):int");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzu = zzu(i3);
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i4 = iArr[i3];
            long j = iZzu & 1048575;
            int iFloatToIntBits = 37;
            switch (iZzt) {
                case 0:
                    i = i2 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzlv.zza(obj, j));
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzlv.zzb(obj, j));
                    i2 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    iFloatToIntBits = zzjc.zza(zzlv.zzw(obj, j));
                    i2 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    iFloatToIntBits = ((String) zzlv.zzf(obj, j)).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 9:
                    i = i2 * 53;
                    Object objZzf = zzlv.zzf(obj, j);
                    if (objZzf != null) {
                        iFloatToIntBits = objZzf.hashCode();
                    }
                    i2 = i + iFloatToIntBits;
                    break;
                case 10:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 17:
                    i = i2 * 53;
                    Object objZzf2 = zzlv.zzf(obj, j);
                    if (objZzf2 != null) {
                        iFloatToIntBits = objZzf2.hashCode();
                    }
                    i2 = i + iFloatToIntBits;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzjc.zza(zzS(obj, j));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = ((String) zzlv.zzf(obj, j)).hashCode();
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode = (i2 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (iHashCode * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0d7b, code lost:
    
        if (r4 == 1048575) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0d7d, code lost:
    
        r30.putInt(r7, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0d83, code lost:
    
        r11 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0d88, code lost:
    
        if (r11 >= r8.zzl) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0d8a, code lost:
    
        zzy(r34, r8.zzj[r11], null, r8.zzn, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0d9d, code lost:
    
        if (r10 != 0) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0d9f, code lost:
    
        if (r6 != r12) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0da6, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0da7, code lost:
    
        if (r6 > r12) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0da9, code lost:
    
        if (r9 != r10) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0dab, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0db0, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:576:0x099b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0c52 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x09ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0c68 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzgj r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzgj):int");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i2 = iArr[i];
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzlv.zzo(obj, j, zzlv.zza(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzlv.zzp(obj, j, zzlv.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzlv.zzm(obj, j, zzlv.zzw(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    zzlv.zzs(obj, j, zzjz.zzb(zzlv.zzf(obj, j), zzlv.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i2, i)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzI(obj, i2, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i2, i)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzI(obj, i2, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzkt.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzkt.zzq(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgj zzgjVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.recaptcha.internal.zzmd r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzmd):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzH;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzlv.zza(obj, j)) != Double.doubleToLongBits(zzlv.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzlv.zzb(obj, j)) != Float.floatToIntBits(zzlv.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzlv.zzw(obj, j) != zzlv.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j));
                    break;
                case 50:
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzr = zzr(i) & 1048575;
                    if (zzlv.zzc(obj, jZzr) != zzlv.zzc(obj2, jZzr) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzl(java.lang.Object):boolean");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzh(Object obj, zzkq zzkqVar, zzie zzieVar) throws Throwable {
        zzll zzllVar;
        Object obj2;
        int iZzc;
        int iZzq;
        Object obj3;
        zzif zzifVar;
        zzie zzieVar2;
        zzll zzllVar2;
        Object obj4;
        Object obj5 = obj;
        zzie zzieVar3 = zzieVar;
        zzD(obj);
        zzll zzllVar3 = this.zzn;
        zzif zzifVar2 = this.zzo;
        zzij zzijVarZzc = null;
        Object objZzc = null;
        while (true) {
            try {
                iZzc = zzkqVar.zzc();
                iZzq = zzq(iZzc);
            } catch (Throwable th) {
                th = th;
            }
            if (iZzq >= 0) {
                obj3 = objZzc;
                zzllVar = zzllVar3;
                obj2 = obj5;
                try {
                    int iZzu = zzu(iZzq);
                    try {
                    } catch (zzjd unused) {
                        objZzc = obj3;
                        zzifVar = zzifVar2;
                        zzieVar2 = zzieVar3;
                    }
                    switch (zzt(iZzu)) {
                        case 0:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzo(obj2, iZzu & 1048575, zzkqVar.zza());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 1:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzp(obj2, iZzu & 1048575, zzkqVar.zzb());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 2:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzl());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 3:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzo());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 4:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzg());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 5:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzk());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 6:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzf());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 7:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzm(obj2, iZzu & 1048575, zzkqVar.zzN());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 8:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzG(obj2, iZzu, zzkqVar);
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 9:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzke zzkeVar = (zzke) zzA(obj2, iZzq);
                            zzkqVar.zzu(zzkeVar, zzx(iZzq), zzieVar2);
                            zzJ(obj2, iZzq, zzkeVar);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 10:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzs(obj2, iZzu & 1048575, zzkqVar.zzp());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 11:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzj());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 12:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            int iZze = zzkqVar.zze();
                            zzix zzixVarZzw = zzw(iZzq);
                            if (zzixVarZzw == null || zzixVarZzw.zza(iZze)) {
                                zzlv.zzq(obj2, iZzu & 1048575, iZze);
                                zzH(obj2, iZzq);
                            } else {
                                objZzc = zzkt.zzp(obj2, iZzc, iZze, objZzc, zzllVar);
                            }
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 13:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzh());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 14:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzm());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 15:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzq(obj2, iZzu & 1048575, zzkqVar.zzi());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 16:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzlv.zzr(obj2, iZzu & 1048575, zzkqVar.zzn());
                            zzH(obj2, iZzq);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 17:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzke zzkeVar2 = (zzke) zzA(obj2, iZzq);
                            zzkqVar.zzt(zzkeVar2, zzx(iZzq), zzieVar2);
                            zzJ(obj2, iZzq, zzkeVar2);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 18:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzx(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 19:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzB(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 20:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzE(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 21:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzM(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 22:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzD(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 23:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzA(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 24:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzz(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 25:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzv(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 26:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            if (zzM(iZzu)) {
                                ((zzhd) zzkqVar).zzK(this.zzm.zza(obj2, iZzu & 1048575), true);
                            } else {
                                ((zzhd) zzkqVar).zzK(this.zzm.zza(obj2, iZzu & 1048575), false);
                            }
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 27:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzF(this.zzm.zza(obj2, iZzu & 1048575), zzx(iZzq), zzieVar2);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 28:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzw(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 29:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzL(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 30:
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            List listZza = this.zzm.zza(obj2, iZzu & 1048575);
                            zzkqVar.zzy(listZza);
                            objZzc = zzkt.zzo(obj, iZzc, listZza, zzw(iZzq), obj3, zzllVar);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 31:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzG(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 32:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzH(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 33:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzI(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 34:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzJ(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 35:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzx(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 36:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzB(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 37:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzE(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 38:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzM(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 39:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzD(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 40:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzA(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 41:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzz(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 42:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzv(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 43:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            zzkqVar.zzL(this.zzm.zza(obj2, iZzu & 1048575));
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 44:
                            List listZza2 = this.zzm.zza(obj2, iZzu & 1048575);
                            zzkqVar.zzy(listZza2);
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            objZzc = zzkt.zzo(obj, iZzc, listZza2, zzw(iZzq), obj3, zzllVar);
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 45:
                            zzkqVar.zzG(this.zzm.zza(obj2, iZzu & 1048575));
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 46:
                            zzkqVar.zzH(this.zzm.zza(obj2, iZzu & 1048575));
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 47:
                            zzkqVar.zzI(this.zzm.zza(obj2, iZzu & 1048575));
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 48:
                            zzkqVar.zzJ(this.zzm.zza(obj2, iZzu & 1048575));
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 49:
                            zzkqVar.zzC(this.zzm.zza(obj2, iZzu & 1048575), zzx(iZzq), zzieVar3);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 50:
                            Object objZzz = zzz(iZzq);
                            long jZzu = zzu(iZzq) & 1048575;
                            Object objZzf = zzlv.zzf(obj2, jZzu);
                            if (objZzf == null) {
                                objZzf = zzjy.zza().zzb();
                                zzlv.zzs(obj2, jZzu, objZzf);
                            } else if (zzjz.zza(objZzf)) {
                                Object objZzb = zzjy.zza().zzb();
                                zzjz.zzb(objZzb, objZzf);
                                zzlv.zzs(obj2, jZzu, objZzb);
                                objZzf = objZzb;
                            }
                            throw null;
                        case 51:
                            zzlv.zzs(obj2, iZzu & 1048575, Double.valueOf(zzkqVar.zza()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 52:
                            zzlv.zzs(obj2, iZzu & 1048575, Float.valueOf(zzkqVar.zzb()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 53:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzl()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 54:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzo()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 55:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzg()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 56:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzk()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 57:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzf()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 58:
                            zzlv.zzs(obj2, iZzu & 1048575, Boolean.valueOf(zzkqVar.zzN()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 59:
                            zzG(obj2, iZzu, zzkqVar);
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 60:
                            zzke zzkeVar3 = (zzke) zzB(obj2, iZzc, iZzq);
                            zzkqVar.zzu(zzkeVar3, zzx(iZzq), zzieVar3);
                            zzK(obj2, iZzc, iZzq, zzkeVar3);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 61:
                            zzlv.zzs(obj2, iZzu & 1048575, zzkqVar.zzp());
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 62:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzj()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 63:
                            int iZze2 = zzkqVar.zze();
                            zzix zzixVarZzw2 = zzw(iZzq);
                            if (zzixVarZzw2 != null && !zzixVarZzw2.zza(iZze2)) {
                                objZzc = zzkt.zzp(obj2, iZzc, iZze2, obj3, zzllVar);
                                obj5 = obj2;
                            }
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(iZze2));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 64:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzh()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 65:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzm()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 66:
                            zzlv.zzs(obj2, iZzu & 1048575, Integer.valueOf(zzkqVar.zzi()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 67:
                            zzlv.zzs(obj2, iZzu & 1048575, Long.valueOf(zzkqVar.zzn()));
                            zzI(obj2, iZzc, iZzq);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        case 68:
                            zzke zzkeVar4 = (zzke) zzB(obj2, iZzc, iZzq);
                            zzkqVar.zzt(zzkeVar4, zzx(iZzq), zzieVar3);
                            zzK(obj2, iZzc, iZzq, zzkeVar4);
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                        default:
                            objZzc = obj3;
                            zzifVar = zzifVar2;
                            zzieVar2 = zzieVar3;
                            if (objZzc == null) {
                                try {
                                    try {
                                        objZzc = zzllVar.zzc(obj2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (zzjd unused2) {
                                    zzllVar.zzs(zzkqVar);
                                    if (objZzc == null) {
                                        objZzc = zzllVar.zzc(obj2);
                                    }
                                    if (!zzllVar.zzr(objZzc, zzkqVar)) {
                                        for (int i = this.zzk; i < this.zzl; i++) {
                                            zzy(obj, this.zzj[i], objZzc, zzllVar, obj);
                                        }
                                    }
                                    obj5 = obj2;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar3 = zzllVar;
                                }
                            }
                            if (!zzllVar.zzr(objZzc, zzkqVar)) {
                                for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                    zzy(obj, this.zzj[i2], objZzc, zzllVar, obj);
                                }
                            }
                            obj5 = obj2;
                            zzifVar2 = zzifVar;
                            zzieVar3 = zzieVar2;
                            break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objZzc = obj3;
                }
            } else {
                if (iZzc != Integer.MAX_VALUE) {
                    try {
                        Object objZzd = !this.zzh ? null : zzifVar2.zzd(zzieVar3, this.zzg, iZzc);
                        if (objZzd != null) {
                            if (zzijVarZzc == null) {
                                zzijVarZzc = zzifVar2.zzc(obj5);
                            }
                            zzij zzijVar = zzijVarZzc;
                            obj3 = objZzc;
                            zzllVar2 = zzllVar3;
                            obj4 = obj5;
                            try {
                                zzifVar2.zze(obj, zzkqVar, objZzd, zzieVar, zzijVar, obj3, zzllVar2);
                                zzijVarZzc = zzijVar;
                                obj2 = obj4;
                                zzllVar = zzllVar2;
                                objZzc = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj5 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            obj3 = objZzc;
                            zzllVar2 = zzllVar3;
                            obj4 = obj5;
                            try {
                                zzllVar2.zzs(zzkqVar);
                                objZzc = obj3 == null ? zzllVar2.zzc(obj4) : obj3;
                                try {
                                    if (zzllVar2.zzr(objZzc, zzkqVar)) {
                                        obj5 = obj4;
                                        zzllVar3 = zzllVar2;
                                    } else {
                                        int i3 = this.zzk;
                                        while (i3 < this.zzl) {
                                            zzll zzllVar4 = zzllVar2;
                                            zzy(obj, this.zzj[i3], objZzc, zzllVar4, obj);
                                            i3++;
                                            obj4 = obj4;
                                            zzllVar2 = zzllVar4;
                                        }
                                        obj2 = obj4;
                                        zzllVar = zzllVar2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj4;
                                    zzllVar = zzllVar2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj4;
                                zzllVar = zzllVar2;
                                objZzc = obj3;
                            }
                        }
                        obj2 = obj4;
                        zzllVar = zzllVar2;
                    } catch (Throwable th7) {
                        th = th7;
                        zzllVar = zzllVar3;
                        obj2 = obj5;
                    }
                    objZzc = obj3;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzy(obj, this.zzj[i4], objZzc, zzllVar, obj);
                    }
                    if (objZzc != null) {
                        zzllVar.zzn(obj2, objZzc);
                    }
                    throw th;
                }
                for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                    zzy(obj, this.zzj[i5], objZzc, zzllVar3, obj);
                }
                zzllVar = zzllVar3;
                obj2 = obj5;
            }
            zzllVar3 = zzllVar;
        }
        if (objZzc != null) {
            zzllVar.zzn(obj2, objZzc);
        }
    }

    private zzkh(int[] iArr, Object[] objArr, int i, int i2, zzke zzkeVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzkeVar instanceof zzit;
        boolean z2 = false;
        if (zzifVar != null && zzifVar.zzj(zzkeVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzkkVar;
        this.zzm = zzjsVar;
        this.zzn = zzllVar;
        this.zzo = zzifVar;
        this.zzg = zzkeVar;
        this.zzq = zzjzVar;
    }
}
