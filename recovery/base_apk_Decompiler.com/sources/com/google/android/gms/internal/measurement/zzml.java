package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private final zzlf zzA(int i) {
        int i2 = i / 3;
        return (zzlf) this.zzd[i2 + i2 + 1];
    }

    private final zzmt zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzmt zzmtVar = (zzmt) this.zzd[i3];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzmtVarZzb = zzmq.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzmtVarZzb;
        return zzmtVarZzb;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzmt zzmtVarZzB = zzB(i);
        int iZzy = zzy(i);
        if (!zzP(obj, i)) {
            return zzmtVarZzB.zze();
        }
        Object object = zzb.getObject(obj, 1048575 & iZzy);
        if (zzS(object)) {
            return object;
        }
        Object objZze = zzmtVarZzB.zze();
        if (object != null) {
            zzmtVarZzB.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzE(Object obj, int i, int i2) {
        zzmt zzmtVarZzB = zzB(i2);
        if (!zzT(obj, i, i2)) {
            return zzmtVarZzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i2) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object objZze = zzmtVarZzB.zze();
        if (object != null) {
            zzmtVarZzB.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (zzP(obj2, i)) {
            int iZzy = zzy(i);
            Unsafe unsafe = zzb;
            long j = iZzy & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzmtVarZzB = zzB(i);
            if (!zzP(obj, i)) {
                if (zzS(object)) {
                    Object objZze = zzmtVarZzB.zze();
                    zzmtVarZzB.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzS(object2)) {
                Object objZze2 = zzmtVarZzB.zze();
                zzmtVarZzB.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzmtVarZzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzT(obj2, i2, i)) {
            int iZzy = zzy(i);
            Unsafe unsafe = zzb;
            long j = iZzy & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzmtVarZzB = zzB(i);
            if (!zzT(obj, i2, i)) {
                if (zzS(object)) {
                    Object objZze = zzmtVarZzB.zze();
                    zzmtVarZzB.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzS(object2)) {
                Object objZze2 = zzmtVarZzB.zze();
                zzmtVarZzB.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzmtVarZzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i) {
        int iZzv = zzv(i);
        long j = 1048575 & iZzv;
        if (j == 1048575) {
            return;
        }
        zznu.zzq(obj, j, (1 << (iZzv >>> 20)) | zznu.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zznu.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzoc zzocVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzP(obj, i) == zzP(obj2, i);
    }

    private final boolean zzP(Object obj, int i) {
        int iZzv = zzv(i);
        long j = iZzv & 1048575;
        if (j != 1048575) {
            return ((1 << (iZzv >>> 20)) & zznu.zzc(obj, j)) != 0;
        }
        int iZzy = zzy(i);
        long j2 = iZzy & 1048575;
        switch (zzx(iZzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j2)) != 0;
            case 2:
                return zznu.zzd(obj, j2) != 0;
            case 3:
                return zznu.zzd(obj, j2) != 0;
            case 4:
                return zznu.zzc(obj, j2) != 0;
            case 5:
                return zznu.zzd(obj, j2) != 0;
            case 6:
                return zznu.zzc(obj, j2) != 0;
            case 7:
                return zznu.zzw(obj, j2);
            case 8:
                Object objZzf = zznu.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzka) {
                    return !zzka.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zznu.zzf(obj, j2) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j2));
            case 11:
                return zznu.zzc(obj, j2) != 0;
            case 12:
                return zznu.zzc(obj, j2) != 0;
            case 13:
                return zznu.zzc(obj, j2) != 0;
            case 14:
                return zznu.zzd(obj, j2) != 0;
            case 15:
                return zznu.zzc(obj, j2) != 0;
            case 16:
                return zznu.zzd(obj, j2) != 0;
            case 17:
                return zznu.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzP(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzR(Object obj, int i, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zznu.zzc(obj, (long) (zzv(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zznu.zzf(obj, j)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i, (String) obj);
        } else {
            zzocVar.zzd(i, (zzka) obj);
        }
    }

    static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zznlVarZzf = zznl.zzf();
        zzlbVar.zzc = zznlVarZzf;
        return zznlVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r34, com.google.android.gms.internal.measurement.zzmf r35, com.google.android.gms.internal.measurement.zzmn r36, com.google.android.gms.internal.measurement.zzlw r37, com.google.android.gms.internal.measurement.zznk r38, com.google.android.gms.internal.measurement.zzko r39, com.google.android.gms.internal.measurement.zzmd r40) {
        /*
            Method dump skipped, instruction units count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zznu.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zznu.zzf(obj, j)).floatValue();
    }

    private final int zzo(Object obj) {
        int i;
        int iZzx;
        int iZzx2;
        int iZzy;
        int iZzx3;
        int iZzx4;
        int iZzx5;
        int iZzx6;
        int iZzn;
        int iZzx7;
        int iZzy2;
        int iZzx8;
        int iZzx9;
        Unsafe unsafe = zzb;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzy3 = zzy(i5);
            int[] iArr = this.zzc;
            int i6 = iArr[i5];
            int iZzx10 = zzx(iZzy3);
            if (iZzx10 <= 17) {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i4) {
                    i3 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzy3 & 1048575;
            switch (iZzx10) {
                case 0:
                    if ((i3 & i) != 0) {
                        iZzx = zzki.zzx(i6 << 3);
                        iZzn = iZzx + 8;
                        i2 += iZzn;
                    }
                    break;
                case 1:
                    if ((i3 & i) != 0) {
                        iZzx2 = zzki.zzx(i6 << 3);
                        iZzn = iZzx2 + 4;
                        i2 += iZzn;
                    }
                    break;
                case 2:
                    if ((i3 & i) != 0) {
                        iZzy = zzki.zzy(unsafe.getLong(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 3:
                    if ((i3 & i) != 0) {
                        iZzy = zzki.zzy(unsafe.getLong(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 4:
                    if ((i3 & i) != 0) {
                        iZzy = zzki.zzu(unsafe.getInt(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 5:
                    if ((i3 & i) != 0) {
                        iZzx = zzki.zzx(i6 << 3);
                        iZzn = iZzx + 8;
                        i2 += iZzn;
                    }
                    break;
                case 6:
                    if ((i3 & i) != 0) {
                        iZzx2 = zzki.zzx(i6 << 3);
                        iZzn = iZzx2 + 4;
                        i2 += iZzn;
                    }
                    break;
                case 7:
                    if ((i3 & i) != 0) {
                        iZzx4 = zzki.zzx(i6 << 3);
                        iZzn = iZzx4 + 1;
                        i2 += iZzn;
                    }
                    break;
                case 8:
                    if ((i3 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzka) {
                            int i9 = zzki.zzb;
                            int iZzd = ((zzka) object).zzd();
                            iZzx5 = zzki.zzx(iZzd) + iZzd;
                            iZzx6 = zzki.zzx(i6 << 3);
                            iZzn = iZzx6 + iZzx5;
                            i2 += iZzn;
                        } else {
                            iZzy = zzki.zzw((String) object);
                            iZzx3 = zzki.zzx(i6 << 3);
                            i2 += iZzx3 + iZzy;
                        }
                    }
                    break;
                case 9:
                    if ((i3 & i) != 0) {
                        iZzn = zzmv.zzn(i6, unsafe.getObject(obj, j), zzB(i5));
                        i2 += iZzn;
                    }
                    break;
                case 10:
                    if ((i3 & i) != 0) {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j);
                        int i10 = zzki.zzb;
                        int iZzd2 = zzkaVar.zzd();
                        iZzx5 = zzki.zzx(iZzd2) + iZzd2;
                        iZzx6 = zzki.zzx(i6 << 3);
                        iZzn = iZzx6 + iZzx5;
                        i2 += iZzn;
                    }
                    break;
                case 11:
                    if ((i3 & i) != 0) {
                        iZzy = zzki.zzx(unsafe.getInt(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 12:
                    if ((i3 & i) != 0) {
                        iZzy = zzki.zzu(unsafe.getInt(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 13:
                    if ((i3 & i) != 0) {
                        iZzx2 = zzki.zzx(i6 << 3);
                        iZzn = iZzx2 + 4;
                        i2 += iZzn;
                    }
                    break;
                case 14:
                    if ((i3 & i) != 0) {
                        iZzx = zzki.zzx(i6 << 3);
                        iZzn = iZzx + 8;
                        i2 += iZzn;
                    }
                    break;
                case 15:
                    if ((i3 & i) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzx3 = zzki.zzx(i6 << 3);
                        iZzy = zzki.zzx((i11 + i11) ^ (i11 >> 31));
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 16:
                    if ((i & i3) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzx7 = zzki.zzx(i6 << 3);
                        iZzy2 = zzki.zzy((j2 >> 63) ^ (j2 + j2));
                        iZzn = iZzy2 + iZzx7;
                        i2 += iZzn;
                    }
                    break;
                case 17:
                    if ((i3 & i) != 0) {
                        iZzn = zzki.zzt(i6, (zzmi) unsafe.getObject(obj, j), zzB(i5));
                        i2 += iZzn;
                    }
                    break;
                case 18:
                    iZzn = zzmv.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 19:
                    iZzn = zzmv.zze(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 20:
                    iZzn = zzmv.zzl(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 21:
                    iZzn = zzmv.zzw(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 22:
                    iZzn = zzmv.zzj(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 23:
                    iZzn = zzmv.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 24:
                    iZzn = zzmv.zze(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 25:
                    iZzn = zzmv.zza(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 26:
                    iZzn = zzmv.zzt(i6, (List) unsafe.getObject(obj, j));
                    i2 += iZzn;
                    break;
                case 27:
                    iZzn = zzmv.zzo(i6, (List) unsafe.getObject(obj, j), zzB(i5));
                    i2 += iZzn;
                    break;
                case 28:
                    iZzn = zzmv.zzb(i6, (List) unsafe.getObject(obj, j));
                    i2 += iZzn;
                    break;
                case 29:
                    iZzn = zzmv.zzu(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 30:
                    iZzn = zzmv.zzc(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 31:
                    iZzn = zzmv.zze(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 32:
                    iZzn = zzmv.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 33:
                    iZzn = zzmv.zzp(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 34:
                    iZzn = zzmv.zzr(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += iZzn;
                    break;
                case 35:
                    iZzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 36:
                    iZzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 37:
                    iZzy = zzmv.zzm((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 38:
                    iZzy = zzmv.zzx((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 39:
                    iZzy = zzmv.zzk((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 40:
                    iZzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 41:
                    iZzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzmv.zza;
                    iZzy = list.size();
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 43:
                    iZzy = zzmv.zzv((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 44:
                    iZzy = zzmv.zzd((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 45:
                    iZzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 46:
                    iZzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 47:
                    iZzy = zzmv.zzq((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 48:
                    iZzy = zzmv.zzs((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i6 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 49:
                    iZzn = zzmv.zzi(i6, (List) unsafe.getObject(obj, j), zzB(i5));
                    i2 += iZzn;
                    break;
                case 50:
                    zzmd.zza(i6, unsafe.getObject(obj, j), zzC(i5));
                    break;
                case 51:
                    if (zzT(obj, i6, i5)) {
                        iZzx = zzki.zzx(i6 << 3);
                        iZzn = iZzx + 8;
                        i2 += iZzn;
                    }
                    break;
                case 52:
                    if (zzT(obj, i6, i5)) {
                        iZzx2 = zzki.zzx(i6 << 3);
                        iZzn = iZzx2 + 4;
                        i2 += iZzn;
                    }
                    break;
                case 53:
                    if (zzT(obj, i6, i5)) {
                        iZzy = zzki.zzy(zzz(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 54:
                    if (zzT(obj, i6, i5)) {
                        iZzy = zzki.zzy(zzz(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 55:
                    if (zzT(obj, i6, i5)) {
                        iZzy = zzki.zzu(zzp(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 56:
                    if (zzT(obj, i6, i5)) {
                        iZzx = zzki.zzx(i6 << 3);
                        iZzn = iZzx + 8;
                        i2 += iZzn;
                    }
                    break;
                case 57:
                    if (zzT(obj, i6, i5)) {
                        iZzx2 = zzki.zzx(i6 << 3);
                        iZzn = iZzx2 + 4;
                        i2 += iZzn;
                    }
                    break;
                case 58:
                    if (zzT(obj, i6, i5)) {
                        iZzx4 = zzki.zzx(i6 << 3);
                        iZzn = iZzx4 + 1;
                        i2 += iZzn;
                    }
                    break;
                case 59:
                    if (zzT(obj, i6, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzka) {
                            int i13 = zzki.zzb;
                            int iZzd3 = ((zzka) object2).zzd();
                            iZzx5 = zzki.zzx(iZzd3) + iZzd3;
                            iZzx6 = zzki.zzx(i6 << 3);
                            iZzn = iZzx6 + iZzx5;
                            i2 += iZzn;
                        } else {
                            iZzy = zzki.zzw((String) object2);
                            iZzx3 = zzki.zzx(i6 << 3);
                            i2 += iZzx3 + iZzy;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i6, i5)) {
                        iZzn = zzmv.zzn(i6, unsafe.getObject(obj, j), zzB(i5));
                        i2 += iZzn;
                    }
                    break;
                case 61:
                    if (zzT(obj, i6, i5)) {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j);
                        int i14 = zzki.zzb;
                        int iZzd4 = zzkaVar2.zzd();
                        iZzx5 = zzki.zzx(iZzd4) + iZzd4;
                        iZzx6 = zzki.zzx(i6 << 3);
                        iZzn = iZzx6 + iZzx5;
                        i2 += iZzn;
                    }
                    break;
                case 62:
                    if (zzT(obj, i6, i5)) {
                        iZzy = zzki.zzx(zzp(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 63:
                    if (zzT(obj, i6, i5)) {
                        iZzy = zzki.zzu(zzp(obj, j));
                        iZzx3 = zzki.zzx(i6 << 3);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 64:
                    if (zzT(obj, i6, i5)) {
                        iZzx2 = zzki.zzx(i6 << 3);
                        iZzn = iZzx2 + 4;
                        i2 += iZzn;
                    }
                    break;
                case 65:
                    if (zzT(obj, i6, i5)) {
                        iZzx = zzki.zzx(i6 << 3);
                        iZzn = iZzx + 8;
                        i2 += iZzn;
                    }
                    break;
                case 66:
                    if (zzT(obj, i6, i5)) {
                        int iZzp = zzp(obj, j);
                        iZzx3 = zzki.zzx(i6 << 3);
                        iZzy = zzki.zzx((iZzp + iZzp) ^ (iZzp >> 31));
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 67:
                    if (zzT(obj, i6, i5)) {
                        long jZzz = zzz(obj, j);
                        iZzx7 = zzki.zzx(i6 << 3);
                        iZzy2 = zzki.zzy((jZzz >> 63) ^ (jZzz + jZzz));
                        iZzn = iZzy2 + iZzx7;
                        i2 += iZzn;
                    }
                    break;
                case 68:
                    if (zzT(obj, i6, i5)) {
                        iZzn = zzki.zzt(i6, (zzmi) unsafe.getObject(obj, j), zzB(i5));
                        i2 += iZzn;
                    }
                    break;
            }
        }
        zznk zznkVar = this.zzn;
        int iZza = zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return i2 + iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zznu.zzf(obj, j)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzmc) object).zze()) {
            zzmc zzmcVarZzb = zzmc.zza().zzb();
            zzmd.zzb(zzmcVarZzb, object);
            unsafe.putObject(obj, j, zzmcVarZzb);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iZzm = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzjnVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    int iZzj = zzjo.zzj(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjnVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzjo.zzp(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzjo.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int iZzm2 = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzjnVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int iZzj2 = zzjo.zzj(bArr, i, zzjnVar);
                    int i9 = zzjnVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zznz.zze(bArr, iZzj2, iZzj2 + i9)) {
                            throw zzll.zzc();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzlj.zzb));
                        iZzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzj2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    Object objZzE = zzE(obj, i4, i8);
                    int iZzo = zzjo.zzo(objZzE, zzB(i8), bArr, i, i2, zzjnVar);
                    zzM(obj, i4, i8, objZzE);
                    return iZzo;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    int iZza = zzjo.zza(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, zzjnVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return iZza;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int iZzj3 = zzjo.zzj(bArr, i, zzjnVar);
                    int i10 = zzjnVar.zza;
                    zzlf zzlfVarZzA = zzA(i8);
                    if (zzlfVarZzA != null && !zzlfVarZzA.zza(i10)) {
                        zzd(obj).zzj(i3, Long.valueOf(i10));
                        return iZzj3;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int iZzj4 = zzjo.zzj(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj4;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int iZzm3 = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm3;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    Object objZzE2 = zzE(obj, i4, i8);
                    int iZzn = zzjo.zzn(objZzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzjnVar);
                    zzM(obj, i4, i8, objZzE2);
                    return iZzn;
                }
                return i;
            default:
                return i;
        }
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzjn zzjnVar) throws IOException {
        int iZzl;
        int iZzc = i;
        Unsafe unsafe = zzb;
        zzli zzliVarZzd = (zzli) unsafe.getObject(obj, j2);
        if (!zzliVarZzd.zzc()) {
            int size = zzliVarZzd.size();
            zzliVarZzd = zzliVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzliVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzkk zzkkVar = (zzkk) zzliVarZzd;
                    int iZzj = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i8 = zzjnVar.zza + iZzj;
                    while (iZzj < i8) {
                        zzkkVar.zze(Double.longBitsToDouble(zzjo.zzp(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i8) {
                        return iZzj;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 1) {
                    zzkk zzkkVar2 = (zzkk) zzliVarZzd;
                    zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i)));
                    int i9 = iZzc + 8;
                    while (i9 < i2) {
                        int iZzj2 = zzjo.zzj(bArr, i9, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return i9;
                        }
                        zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, iZzj2)));
                        i9 = iZzj2 + 8;
                    }
                    return i9;
                }
                return iZzc;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzku zzkuVar = (zzku) zzliVarZzd;
                    int iZzj3 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i10 = zzjnVar.zza + iZzj3;
                    while (iZzj3 < i10) {
                        zzkuVar.zze(Float.intBitsToFloat(zzjo.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i10) {
                        return iZzj3;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 5) {
                    zzku zzkuVar2 = (zzku) zzliVarZzd;
                    zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i)));
                    int i11 = iZzc + 4;
                    while (i11 < i2) {
                        int iZzj4 = zzjo.zzj(bArr, i11, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return i11;
                        }
                        zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, iZzj4)));
                        i11 = iZzj4 + 4;
                    }
                    return i11;
                }
                return iZzc;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzlx zzlxVar = (zzlx) zzliVarZzd;
                    int iZzj5 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i12 = zzjnVar.zza + iZzj5;
                    while (iZzj5 < i12) {
                        iZzj5 = zzjo.zzm(bArr, iZzj5, zzjnVar);
                        zzlxVar.zzg(zzjnVar.zzb);
                    }
                    if (iZzj5 == i12) {
                        return iZzj5;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 0) {
                    zzlx zzlxVar2 = (zzlx) zzliVarZzd;
                    int iZzm = zzjo.zzm(bArr, iZzc, zzjnVar);
                    zzlxVar2.zzg(zzjnVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzjo.zzj(bArr, iZzm, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzjo.zzm(bArr, iZzj6, zzjnVar);
                        zzlxVar2.zzg(zzjnVar.zzb);
                    }
                    return iZzm;
                }
                return iZzc;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzjo.zzf(bArr, iZzc, zzliVarZzd, zzjnVar);
                }
                if (i5 == 0) {
                    return zzjo.zzl(i3, bArr, i, i2, zzliVarZzd, zzjnVar);
                }
                return iZzc;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzlx zzlxVar3 = (zzlx) zzliVarZzd;
                    int iZzj7 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i13 = zzjnVar.zza + iZzj7;
                    while (iZzj7 < i13) {
                        zzlxVar3.zzg(zzjo.zzp(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i13) {
                        return iZzj7;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 1) {
                    zzlx zzlxVar4 = (zzlx) zzliVarZzd;
                    zzlxVar4.zzg(zzjo.zzp(bArr, i));
                    int i14 = iZzc + 8;
                    while (i14 < i2) {
                        int iZzj8 = zzjo.zzj(bArr, i14, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return i14;
                        }
                        zzlxVar4.zzg(zzjo.zzp(bArr, iZzj8));
                        i14 = iZzj8 + 8;
                    }
                    return i14;
                }
                return iZzc;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzlc zzlcVar = (zzlc) zzliVarZzd;
                    int iZzj9 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i15 = zzjnVar.zza + iZzj9;
                    while (iZzj9 < i15) {
                        zzlcVar.zzh(zzjo.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i15) {
                        return iZzj9;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 5) {
                    zzlc zzlcVar2 = (zzlc) zzliVarZzd;
                    zzlcVar2.zzh(zzjo.zzb(bArr, i));
                    int i16 = iZzc + 4;
                    while (i16 < i2) {
                        int iZzj10 = zzjo.zzj(bArr, i16, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return i16;
                        }
                        zzlcVar2.zzh(zzjo.zzb(bArr, iZzj10));
                        i16 = iZzj10 + 4;
                    }
                    return i16;
                }
                return iZzc;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzjp zzjpVar = (zzjp) zzliVarZzd;
                    int iZzj11 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i17 = zzjnVar.zza + iZzj11;
                    while (iZzj11 < i17) {
                        iZzj11 = zzjo.zzm(bArr, iZzj11, zzjnVar);
                        zzjpVar.zze(zzjnVar.zzb != 0);
                    }
                    if (iZzj11 == i17) {
                        return iZzj11;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 0) {
                    zzjp zzjpVar2 = (zzjp) zzliVarZzd;
                    int iZzm2 = zzjo.zzm(bArr, iZzc, zzjnVar);
                    zzjpVar2.zze(zzjnVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj12 = zzjo.zzj(bArr, iZzm2, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzjo.zzm(bArr, iZzj12, zzjnVar);
                        zzjpVar2.zze(zzjnVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzc;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj13 = zzjo.zzj(bArr, iZzc, zzjnVar);
                        int i18 = zzjnVar.zza;
                        if (i18 < 0) {
                            throw zzll.zzd();
                        }
                        if (i18 == 0) {
                            zzliVarZzd.add("");
                        } else {
                            zzliVarZzd.add(new String(bArr, iZzj13, i18, zzlj.zzb));
                            iZzj13 += i18;
                        }
                        while (iZzj13 < i2) {
                            int iZzj14 = zzjo.zzj(bArr, iZzj13, zzjnVar);
                            if (i3 != zzjnVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzjo.zzj(bArr, iZzj14, zzjnVar);
                            int i19 = zzjnVar.zza;
                            if (i19 < 0) {
                                throw zzll.zzd();
                            }
                            if (i19 == 0) {
                                zzliVarZzd.add("");
                            } else {
                                zzliVarZzd.add(new String(bArr, iZzj13, i19, zzlj.zzb));
                                iZzj13 += i19;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i20 = zzjnVar.zza;
                    if (i20 < 0) {
                        throw zzll.zzd();
                    }
                    if (i20 == 0) {
                        zzliVarZzd.add("");
                    } else {
                        int i21 = iZzj15 + i20;
                        if (!zznz.zze(bArr, iZzj15, i21)) {
                            throw zzll.zzc();
                        }
                        zzliVarZzd.add(new String(bArr, iZzj15, i20, zzlj.zzb));
                        iZzj15 = i21;
                    }
                    while (iZzj15 < i2) {
                        int iZzj16 = zzjo.zzj(bArr, iZzj15, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzjo.zzj(bArr, iZzj16, zzjnVar);
                        int i22 = zzjnVar.zza;
                        if (i22 < 0) {
                            throw zzll.zzd();
                        }
                        if (i22 == 0) {
                            zzliVarZzd.add("");
                        } else {
                            int i23 = iZzj15 + i22;
                            if (!zznz.zze(bArr, iZzj15, i23)) {
                                throw zzll.zzc();
                            }
                            zzliVarZzd.add(new String(bArr, iZzj15, i22, zzlj.zzb));
                            iZzj15 = i23;
                        }
                    }
                    return iZzj15;
                }
                return iZzc;
            case 27:
                if (i5 == 2) {
                    return zzjo.zze(zzB(i6), i3, bArr, i, i2, zzliVarZzd, zzjnVar);
                }
                return iZzc;
            case 28:
                if (i5 == 2) {
                    int iZzj17 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i24 = zzjnVar.zza;
                    if (i24 < 0) {
                        throw zzll.zzd();
                    }
                    if (i24 > bArr.length - iZzj17) {
                        throw zzll.zzf();
                    }
                    if (i24 == 0) {
                        zzliVarZzd.add(zzka.zzb);
                    } else {
                        zzliVarZzd.add(zzka.zzl(bArr, iZzj17, i24));
                        iZzj17 += i24;
                    }
                    while (iZzj17 < i2) {
                        int iZzj18 = zzjo.zzj(bArr, iZzj17, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzjo.zzj(bArr, iZzj18, zzjnVar);
                        int i25 = zzjnVar.zza;
                        if (i25 < 0) {
                            throw zzll.zzd();
                        }
                        if (i25 > bArr.length - iZzj17) {
                            throw zzll.zzf();
                        }
                        if (i25 == 0) {
                            zzliVarZzd.add(zzka.zzb);
                        } else {
                            zzliVarZzd.add(zzka.zzl(bArr, iZzj17, i25));
                            iZzj17 += i25;
                        }
                    }
                    return iZzj17;
                }
                return iZzc;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZzl = zzjo.zzl(i3, bArr, i, i2, zzliVarZzd, zzjnVar);
                    }
                    return iZzc;
                }
                iZzl = zzjo.zzf(bArr, iZzc, zzliVarZzd, zzjnVar);
                zzlf zzlfVarZzA = zzA(i6);
                zznk zznkVar = this.zzn;
                int i26 = zzmv.zza;
                if (zzlfVarZzA != null) {
                    Object objZzA = null;
                    if (zzliVarZzd instanceof RandomAccess) {
                        int size2 = zzliVarZzd.size();
                        int i27 = 0;
                        for (int i28 = 0; i28 < size2; i28++) {
                            int iIntValue = ((Integer) zzliVarZzd.get(i28)).intValue();
                            if (zzlfVarZzA.zza(iIntValue)) {
                                if (i28 != i27) {
                                    zzliVarZzd.set(i27, Integer.valueOf(iIntValue));
                                }
                                i27++;
                            } else {
                                objZzA = zzmv.zzA(obj, i4, iIntValue, objZzA, zznkVar);
                            }
                        }
                        if (i27 != size2) {
                            zzliVarZzd.subList(i27, size2).clear();
                            return iZzl;
                        }
                    } else {
                        Iterator it = zzliVarZzd.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Integer) it.next()).intValue();
                            if (!zzlfVarZzA.zza(iIntValue2)) {
                                objZzA = zzmv.zzA(obj, i4, iIntValue2, objZzA, zznkVar);
                                it.remove();
                            }
                        }
                    }
                }
                return iZzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzlc zzlcVar3 = (zzlc) zzliVarZzd;
                    int iZzj19 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i29 = zzjnVar.zza + iZzj19;
                    while (iZzj19 < i29) {
                        iZzj19 = zzjo.zzj(bArr, iZzj19, zzjnVar);
                        zzlcVar3.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    if (iZzj19 == i29) {
                        return iZzj19;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 0) {
                    zzlc zzlcVar4 = (zzlc) zzliVarZzd;
                    int iZzj20 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    while (iZzj20 < i2) {
                        int iZzj21 = zzjo.zzj(bArr, iZzj20, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzjo.zzj(bArr, iZzj21, zzjnVar);
                        zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    return iZzj20;
                }
                return iZzc;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzlx zzlxVar5 = (zzlx) zzliVarZzd;
                    int iZzj22 = zzjo.zzj(bArr, iZzc, zzjnVar);
                    int i30 = zzjnVar.zza + iZzj22;
                    while (iZzj22 < i30) {
                        iZzj22 = zzjo.zzm(bArr, iZzj22, zzjnVar);
                        zzlxVar5.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    if (iZzj22 == i30) {
                        return iZzj22;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 0) {
                    zzlx zzlxVar6 = (zzlx) zzliVarZzd;
                    int iZzm3 = zzjo.zzm(bArr, iZzc, zzjnVar);
                    zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj23 = zzjo.zzj(bArr, iZzm3, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzjo.zzm(bArr, iZzj23, zzjnVar);
                        zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzc;
            default:
                if (i5 == 3) {
                    zzmt zzmtVarZzB = zzB(i6);
                    int i31 = (i3 & (-8)) | 4;
                    iZzc = zzjo.zzc(zzmtVarZzB, bArr, i, i2, i31, zzjnVar);
                    zzliVarZzd.add(zzjnVar.zzc);
                    while (iZzc < i2) {
                        int iZzj24 = zzjo.zzj(bArr, iZzc, zzjnVar);
                        if (i3 == zzjnVar.zza) {
                            iZzc = zzjo.zzc(zzmtVarZzB, bArr, iZzj24, i2, i31, zzjnVar);
                            zzliVarZzd.add(zzjnVar.zzc);
                        }
                    }
                }
                return iZzc;
        }
    }

    private final int zzt(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, 0);
    }

    private final int zzu(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, i2);
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i2) {
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

    private static int zzx(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j) {
        return ((Long) zznu.zzf(obj, j)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int iZzx;
        int iZzx2;
        int iZzy;
        int iZzx3;
        int iZzx4;
        int iZzx5;
        int iZzx6;
        int iZzn;
        int iZzx7;
        int iZzy2;
        int iZzx8;
        int iZzx9;
        if (!this.zzi) {
            return zzo(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzy3 = zzy(i2);
            int iZzx10 = zzx(iZzy3);
            int i3 = this.zzc[i2];
            if (iZzx10 >= zzkt.DOUBLE_LIST_PACKED.zza() && iZzx10 <= zzkt.SINT64_LIST_PACKED.zza()) {
                int i4 = this.zzc[i2 + 2];
            }
            long j = iZzy3 & 1048575;
            switch (iZzx10) {
                case 0:
                    if (zzP(obj, i2)) {
                        iZzx = zzki.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                    }
                    break;
                case 1:
                    if (zzP(obj, i2)) {
                        iZzx2 = zzki.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                    }
                    break;
                case 2:
                    if (zzP(obj, i2)) {
                        iZzy = zzki.zzy(zznu.zzd(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 3:
                    if (zzP(obj, i2)) {
                        iZzy = zzki.zzy(zznu.zzd(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 4:
                    if (zzP(obj, i2)) {
                        iZzy = zzki.zzu(zznu.zzc(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 5:
                    if (zzP(obj, i2)) {
                        iZzx = zzki.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                    }
                    break;
                case 6:
                    if (zzP(obj, i2)) {
                        iZzx2 = zzki.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                    }
                    break;
                case 7:
                    if (zzP(obj, i2)) {
                        iZzx4 = zzki.zzx(i3 << 3);
                        iZzn = iZzx4 + 1;
                        i += iZzn;
                    }
                    break;
                case 8:
                    if (zzP(obj, i2)) {
                        Object objZzf = zznu.zzf(obj, j);
                        if (objZzf instanceof zzka) {
                            int i5 = zzki.zzb;
                            int iZzd = ((zzka) objZzf).zzd();
                            iZzx5 = zzki.zzx(iZzd) + iZzd;
                            iZzx6 = zzki.zzx(i3 << 3);
                            iZzn = iZzx6 + iZzx5;
                            i += iZzn;
                        } else {
                            iZzy = zzki.zzw((String) objZzf);
                            iZzx3 = zzki.zzx(i3 << 3);
                            i += iZzx3 + iZzy;
                        }
                    }
                    break;
                case 9:
                    if (zzP(obj, i2)) {
                        iZzn = zzmv.zzn(i3, zznu.zzf(obj, j), zzB(i2));
                        i += iZzn;
                    }
                    break;
                case 10:
                    if (zzP(obj, i2)) {
                        zzka zzkaVar = (zzka) zznu.zzf(obj, j);
                        int i6 = zzki.zzb;
                        int iZzd2 = zzkaVar.zzd();
                        iZzx5 = zzki.zzx(iZzd2) + iZzd2;
                        iZzx6 = zzki.zzx(i3 << 3);
                        iZzn = iZzx6 + iZzx5;
                        i += iZzn;
                    }
                    break;
                case 11:
                    if (zzP(obj, i2)) {
                        iZzy = zzki.zzx(zznu.zzc(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 12:
                    if (zzP(obj, i2)) {
                        iZzy = zzki.zzu(zznu.zzc(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 13:
                    if (zzP(obj, i2)) {
                        iZzx2 = zzki.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                    }
                    break;
                case 14:
                    if (zzP(obj, i2)) {
                        iZzx = zzki.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                    }
                    break;
                case 15:
                    if (zzP(obj, i2)) {
                        int iZzc = zznu.zzc(obj, j);
                        iZzx3 = zzki.zzx(i3 << 3);
                        iZzy = zzki.zzx((iZzc + iZzc) ^ (iZzc >> 31));
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 16:
                    if (zzP(obj, i2)) {
                        long jZzd = zznu.zzd(obj, j);
                        iZzx7 = zzki.zzx(i3 << 3);
                        iZzy2 = zzki.zzy((jZzd >> 63) ^ (jZzd + jZzd));
                        iZzn = iZzy2 + iZzx7;
                        i += iZzn;
                    }
                    break;
                case 17:
                    if (zzP(obj, i2)) {
                        iZzn = zzki.zzt(i3, (zzmi) zznu.zzf(obj, j), zzB(i2));
                        i += iZzn;
                    }
                    break;
                case 18:
                    iZzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 19:
                    iZzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 20:
                    iZzn = zzmv.zzl(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 21:
                    iZzn = zzmv.zzw(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 22:
                    iZzn = zzmv.zzj(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 23:
                    iZzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 24:
                    iZzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 25:
                    iZzn = zzmv.zza(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 26:
                    iZzn = zzmv.zzt(i3, (List) zznu.zzf(obj, j));
                    i += iZzn;
                    break;
                case 27:
                    iZzn = zzmv.zzo(i3, (List) zznu.zzf(obj, j), zzB(i2));
                    i += iZzn;
                    break;
                case 28:
                    iZzn = zzmv.zzb(i3, (List) zznu.zzf(obj, j));
                    i += iZzn;
                    break;
                case 29:
                    iZzn = zzmv.zzu(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 30:
                    iZzn = zzmv.zzc(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 31:
                    iZzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 32:
                    iZzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 33:
                    iZzn = zzmv.zzp(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 34:
                    iZzn = zzmv.zzr(i3, (List) zznu.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 35:
                    iZzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 36:
                    iZzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 37:
                    iZzy = zzmv.zzm((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 38:
                    iZzy = zzmv.zzx((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 39:
                    iZzy = zzmv.zzk((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 40:
                    iZzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 41:
                    iZzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i7 = zzmv.zza;
                    iZzy = list.size();
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 43:
                    iZzy = zzmv.zzv((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 44:
                    iZzy = zzmv.zzd((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 45:
                    iZzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 46:
                    iZzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 47:
                    iZzy = zzmv.zzq((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 48:
                    iZzy = zzmv.zzs((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iZzx8 = zzki.zzx(iZzy);
                        iZzx9 = zzki.zzx(i3 << 3);
                        iZzx3 = iZzx8 + iZzx9;
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 49:
                    iZzn = zzmv.zzi(i3, (List) zznu.zzf(obj, j), zzB(i2));
                    i += iZzn;
                    break;
                case 50:
                    zzmd.zza(i3, zznu.zzf(obj, j), zzC(i2));
                    break;
                case 51:
                    if (zzT(obj, i3, i2)) {
                        iZzx = zzki.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                    }
                    break;
                case 52:
                    if (zzT(obj, i3, i2)) {
                        iZzx2 = zzki.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                    }
                    break;
                case 53:
                    if (zzT(obj, i3, i2)) {
                        iZzy = zzki.zzy(zzz(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 54:
                    if (zzT(obj, i3, i2)) {
                        iZzy = zzki.zzy(zzz(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 55:
                    if (zzT(obj, i3, i2)) {
                        iZzy = zzki.zzu(zzp(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 56:
                    if (zzT(obj, i3, i2)) {
                        iZzx = zzki.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                    }
                    break;
                case 57:
                    if (zzT(obj, i3, i2)) {
                        iZzx2 = zzki.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                    }
                    break;
                case 58:
                    if (zzT(obj, i3, i2)) {
                        iZzx4 = zzki.zzx(i3 << 3);
                        iZzn = iZzx4 + 1;
                        i += iZzn;
                    }
                    break;
                case 59:
                    if (zzT(obj, i3, i2)) {
                        Object objZzf2 = zznu.zzf(obj, j);
                        if (objZzf2 instanceof zzka) {
                            int i8 = zzki.zzb;
                            int iZzd3 = ((zzka) objZzf2).zzd();
                            iZzx5 = zzki.zzx(iZzd3) + iZzd3;
                            iZzx6 = zzki.zzx(i3 << 3);
                            iZzn = iZzx6 + iZzx5;
                            i += iZzn;
                        } else {
                            iZzy = zzki.zzw((String) objZzf2);
                            iZzx3 = zzki.zzx(i3 << 3);
                            i += iZzx3 + iZzy;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i3, i2)) {
                        iZzn = zzmv.zzn(i3, zznu.zzf(obj, j), zzB(i2));
                        i += iZzn;
                    }
                    break;
                case 61:
                    if (zzT(obj, i3, i2)) {
                        zzka zzkaVar2 = (zzka) zznu.zzf(obj, j);
                        int i9 = zzki.zzb;
                        int iZzd4 = zzkaVar2.zzd();
                        iZzx5 = zzki.zzx(iZzd4) + iZzd4;
                        iZzx6 = zzki.zzx(i3 << 3);
                        iZzn = iZzx6 + iZzx5;
                        i += iZzn;
                    }
                    break;
                case 62:
                    if (zzT(obj, i3, i2)) {
                        iZzy = zzki.zzx(zzp(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 63:
                    if (zzT(obj, i3, i2)) {
                        iZzy = zzki.zzu(zzp(obj, j));
                        iZzx3 = zzki.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 64:
                    if (zzT(obj, i3, i2)) {
                        iZzx2 = zzki.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                    }
                    break;
                case 65:
                    if (zzT(obj, i3, i2)) {
                        iZzx = zzki.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                    }
                    break;
                case 66:
                    if (zzT(obj, i3, i2)) {
                        int iZzp = zzp(obj, j);
                        iZzx3 = zzki.zzx(i3 << 3);
                        iZzy = zzki.zzx((iZzp + iZzp) ^ (iZzp >> 31));
                        i += iZzx3 + iZzy;
                    }
                    break;
                case 67:
                    if (zzT(obj, i3, i2)) {
                        long jZzz = zzz(obj, j);
                        iZzx7 = zzki.zzx(i3 << 3);
                        iZzy2 = zzki.zzy((jZzz >> 63) ^ (jZzz + jZzz));
                        iZzn = iZzy2 + iZzx7;
                        i += iZzn;
                    }
                    break;
                case 68:
                    if (zzT(obj, i3, i2)) {
                        iZzn = zzki.zzt(i3, (zzmi) zznu.zzf(obj, j), zzB(i2));
                        i += iZzn;
                    }
                    break;
            }
        }
        zznk zznkVar = this.zzn;
        return i + zznkVar.zza(zznkVar.zzd(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0439, code lost:
    
        if (r6 == 1048575) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x043b, code lost:
    
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0441, code lost:
    
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0445, code lost:
    
        if (r2 >= r8.zzl) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0447, code lost:
    
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0459, code lost:
    
        if (r5 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0460, code lost:
    
        if (r8.zzA(r4) != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0462, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0465, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x046d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x046e, code lost:
    
        if (r9 != 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0472, code lost:
    
        if (r0 != r33) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0479, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x047c, code lost:
    
        if (r0 > r33) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x047e, code lost:
    
        if (r3 != r9) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0480, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0485, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zzjn r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzy = zzy(i);
            int i2 = this.zzc[i];
            long j = iZzy & 1048575;
            switch (zzx(iZzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zznu.zzo(obj, j, zznu.zza(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 1:
                    if (zzP(obj2, i)) {
                        zznu.zzp(obj, j, zznu.zzb(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 2:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 3:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 4:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 5:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 6:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 7:
                    if (zzP(obj2, i)) {
                        zznu.zzm(obj, j, zznu.zzw(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 8:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 11:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 12:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 13:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 14:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 15:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 16:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzmv.zza;
                    zznu.zzs(obj, j, zzmd.zzb(zznu.zzf(obj, j), zznu.zzf(obj2, j)));
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
                    if (zzT(obj2, i2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzK(obj, i2, i);
                    }
                    break;
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzK(obj, i2, i);
                    }
                    break;
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzmv.zzB(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d5, code lost:
    
        if (r4 != r24) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d7, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0328, code lost:
    
        if (r4 != r14) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032b, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0095. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzjn r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzV;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzy = zzy(i);
            long j = iZzy & 1048575;
            switch (zzx(iZzy)) {
                case 0:
                    if (!zzO(obj, obj2, i) || Double.doubleToLongBits(zznu.zza(obj, j)) != Double.doubleToLongBits(zznu.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzO(obj, obj2, i) || Float.floatToIntBits(zznu.zzb(obj, j)) != Float.floatToIntBits(zznu.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j) != zznu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j) != zznu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j) != zznu.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j) != zznu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j) != zznu.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzO(obj, obj2, i) || zznu.zzw(obj, j) != zznu.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzO(obj, obj2, i) || !zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzO(obj, obj2, i) || !zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzO(obj, obj2, i) || !zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j) != zznu.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j) != zznu.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j) != zznu.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j) != zznu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j) != zznu.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j) != zznu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzO(obj, obj2, i) || !zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
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
                    zZzV = zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j));
                    break;
                case 50:
                    zZzV = zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j));
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
                    long jZzv = zzv(i) & 1048575;
                    if (zznu.zzc(obj, jZzv) != zznu.zzc(obj2, jZzv) || !zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzV) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzk(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int iZzy = zzy(i6);
                int i7 = this.zzc[i6];
                switch (zzx(iZzy)) {
                    case 0:
                        if (zzP(obj, i6)) {
                            zzocVar.zzf(i7, zznu.zza(obj, iZzy & 1048575));
                        }
                        break;
                    case 1:
                        if (zzP(obj, i6)) {
                            zzocVar.zzo(i7, zznu.zzb(obj, iZzy & 1048575));
                        }
                        break;
                    case 2:
                        if (zzP(obj, i6)) {
                            zzocVar.zzt(i7, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 3:
                        if (zzP(obj, i6)) {
                            zzocVar.zzJ(i7, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 4:
                        if (zzP(obj, i6)) {
                            zzocVar.zzr(i7, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 5:
                        if (zzP(obj, i6)) {
                            zzocVar.zzm(i7, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 6:
                        if (zzP(obj, i6)) {
                            zzocVar.zzk(i7, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 7:
                        if (zzP(obj, i6)) {
                            zzocVar.zzb(i7, zznu.zzw(obj, iZzy & 1048575));
                        }
                        break;
                    case 8:
                        if (zzP(obj, i6)) {
                            zzV(i7, zznu.zzf(obj, iZzy & 1048575), zzocVar);
                        }
                        break;
                    case 9:
                        if (zzP(obj, i6)) {
                            zzocVar.zzv(i7, zznu.zzf(obj, iZzy & 1048575), zzB(i6));
                        }
                        break;
                    case 10:
                        if (zzP(obj, i6)) {
                            zzocVar.zzd(i7, (zzka) zznu.zzf(obj, iZzy & 1048575));
                        }
                        break;
                    case 11:
                        if (zzP(obj, i6)) {
                            zzocVar.zzH(i7, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 12:
                        if (zzP(obj, i6)) {
                            zzocVar.zzi(i7, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 13:
                        if (zzP(obj, i6)) {
                            zzocVar.zzw(i7, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 14:
                        if (zzP(obj, i6)) {
                            zzocVar.zzy(i7, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 15:
                        if (zzP(obj, i6)) {
                            zzocVar.zzA(i7, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 16:
                        if (zzP(obj, i6)) {
                            zzocVar.zzC(i7, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 17:
                        if (zzP(obj, i6)) {
                            zzocVar.zzq(i7, zznu.zzf(obj, iZzy & 1048575), zzB(i6));
                        }
                        break;
                    case 18:
                        zzmv.zzF(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 19:
                        zzmv.zzJ(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 20:
                        zzmv.zzM(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 21:
                        zzmv.zzU(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 22:
                        zzmv.zzL(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 23:
                        zzmv.zzI(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 24:
                        zzmv.zzH(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 25:
                        zzmv.zzD(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar);
                        break;
                    case 27:
                        zzmv.zzN(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, zzB(i6));
                        break;
                    case 28:
                        zzmv.zzE(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar);
                        break;
                    case 29:
                        zzmv.zzT(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzG(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzO(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 32:
                        zzmv.zzP(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzQ(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzR(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzF(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzJ(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzM(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzU(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzL(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzI(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzH(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzD(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzT(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzG(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzO(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzP(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzQ(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 48:
                        zzmv.zzR(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 49:
                        zzmv.zzK(i7, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, zzB(i6));
                        break;
                    case 50:
                        zzN(zzocVar, i7, zznu.zzf(obj, iZzy & 1048575), i6);
                        break;
                    case 51:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzf(i7, zzm(obj, iZzy & 1048575));
                        }
                        break;
                    case 52:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzo(i7, zzn(obj, iZzy & 1048575));
                        }
                        break;
                    case 53:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzt(i7, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 54:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzJ(i7, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 55:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzr(i7, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 56:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzm(i7, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 57:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzk(i7, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 58:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzb(i7, zzU(obj, iZzy & 1048575));
                        }
                        break;
                    case 59:
                        if (zzT(obj, i7, i6)) {
                            zzV(i7, zznu.zzf(obj, iZzy & 1048575), zzocVar);
                        }
                        break;
                    case 60:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzv(i7, zznu.zzf(obj, iZzy & 1048575), zzB(i6));
                        }
                        break;
                    case 61:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzd(i7, (zzka) zznu.zzf(obj, iZzy & 1048575));
                        }
                        break;
                    case 62:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzH(i7, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 63:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzi(i7, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 64:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzw(i7, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 65:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzy(i7, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 66:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzA(i7, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 67:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzC(i7, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 68:
                        if (zzT(obj, i7, i6)) {
                            zzocVar.zzq(i7, zznu.zzf(obj, iZzy & 1048575), zzB(i6));
                        }
                        break;
                }
            }
            zznk zznkVar = this.zzn;
            zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i8 < length2) {
            int iZzy2 = zzy(i8);
            int[] iArr = this.zzc;
            int i11 = iArr[i8];
            int iZzx = zzx(iZzy2);
            if (iZzx <= 17) {
                int i12 = iArr[i8 + 2];
                int i13 = i12 & i5;
                if (i13 != i10) {
                    i9 = unsafe.getInt(obj, i13);
                    i10 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = i4;
            }
            long j = iZzy2 & i5;
            switch (iZzx) {
                case 0:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzf(i11, zznu.zza(obj, j));
                    }
                    break;
                case 1:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzo(i11, zznu.zzb(obj, j));
                    }
                    break;
                case 2:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzt(i11, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzJ(i11, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzr(i11, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzm(i11, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzk(i11, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzb(i11, zznu.zzw(obj, j));
                    }
                    break;
                case 8:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzV(i11, unsafe.getObject(obj, j), zzocVar);
                    }
                    break;
                case 9:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzv(i11, unsafe.getObject(obj, j), zzB(i8));
                    }
                    break;
                case 10:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzd(i11, (zzka) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzH(i11, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzi(i11, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzw(i11, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzy(i11, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzA(i11, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzC(i11, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzocVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
                    }
                    break;
                case 18:
                    i2 = 0;
                    zzmv.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 19:
                    i2 = 0;
                    zzmv.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 20:
                    i2 = 0;
                    zzmv.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 21:
                    i2 = 0;
                    zzmv.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 22:
                    i2 = 0;
                    zzmv.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 23:
                    i2 = 0;
                    zzmv.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 24:
                    i2 = 0;
                    zzmv.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 25:
                    i2 = 0;
                    zzmv.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 26:
                    zzmv.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar);
                    i2 = 0;
                    break;
                case 27:
                    zzmv.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, zzB(i8));
                    i2 = 0;
                    break;
                case 28:
                    zzmv.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar);
                    i2 = 0;
                    break;
                case 29:
                    i3 = 0;
                    zzmv.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    i2 = i3;
                    break;
                case 30:
                    i3 = 0;
                    zzmv.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    i2 = i3;
                    break;
                case 31:
                    i3 = 0;
                    zzmv.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    i2 = i3;
                    break;
                case 32:
                    i3 = 0;
                    zzmv.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    i2 = i3;
                    break;
                case 33:
                    i3 = 0;
                    zzmv.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    i2 = i3;
                    break;
                case 34:
                    i3 = 0;
                    zzmv.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                    i2 = i3;
                    break;
                case 35:
                    zzmv.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 36:
                    zzmv.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 37:
                    zzmv.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 38:
                    zzmv.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 39:
                    zzmv.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 40:
                    zzmv.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 41:
                    zzmv.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 42:
                    zzmv.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 43:
                    zzmv.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 44:
                    zzmv.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 45:
                    zzmv.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 46:
                    zzmv.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 47:
                    zzmv.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 48:
                    zzmv.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                    i2 = 0;
                    break;
                case 49:
                    zzmv.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, zzB(i8));
                    i2 = 0;
                    break;
                case 50:
                    zzN(zzocVar, i11, unsafe.getObject(obj, j), i8);
                    i2 = 0;
                    break;
                case 51:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzf(i11, zzm(obj, j));
                    }
                    i2 = 0;
                    break;
                case 52:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzo(i11, zzn(obj, j));
                    }
                    i2 = 0;
                    break;
                case 53:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzt(i11, zzz(obj, j));
                    }
                    i2 = 0;
                    break;
                case 54:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzJ(i11, zzz(obj, j));
                    }
                    i2 = 0;
                    break;
                case 55:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzr(i11, zzp(obj, j));
                    }
                    i2 = 0;
                    break;
                case 56:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzm(i11, zzz(obj, j));
                    }
                    i2 = 0;
                    break;
                case 57:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzk(i11, zzp(obj, j));
                    }
                    i2 = 0;
                    break;
                case 58:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzb(i11, zzU(obj, j));
                    }
                    i2 = 0;
                    break;
                case 59:
                    if (zzT(obj, i11, i8)) {
                        zzV(i11, unsafe.getObject(obj, j), zzocVar);
                    }
                    i2 = 0;
                    break;
                case 60:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzv(i11, unsafe.getObject(obj, j), zzB(i8));
                    }
                    i2 = 0;
                    break;
                case 61:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzd(i11, (zzka) unsafe.getObject(obj, j));
                    }
                    i2 = 0;
                    break;
                case 62:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzH(i11, zzp(obj, j));
                    }
                    i2 = 0;
                    break;
                case 63:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzi(i11, zzp(obj, j));
                    }
                    i2 = 0;
                    break;
                case 64:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzw(i11, zzp(obj, j));
                    }
                    i2 = 0;
                    break;
                case 65:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzy(i11, zzz(obj, j));
                    }
                    i2 = 0;
                    break;
                case 66:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzA(i11, zzp(obj, j));
                    }
                    i2 = 0;
                    break;
                case 67:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzC(i11, zzz(obj, j));
                    }
                    i2 = 0;
                    break;
                case 68:
                    if (zzT(obj, i11, i8)) {
                        zzocVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
                    }
                    i2 = 0;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            i8 += 3;
            i4 = i2;
            i5 = 1048575;
        }
        zznk zznkVar2 = this.zzn;
        zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
    }

    private zzml(int[] iArr, Object[] objArr, int i, int i2, zzmi zzmiVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        this.zzh = zzkoVar != null && zzkoVar.zzc(zzmiVar);
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }
}
