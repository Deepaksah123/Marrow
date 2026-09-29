package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zznl {
    private static final zznl zza = new zznl(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznl() {
        this(0, new int[8], new Object[8], true);
    }

    static zznl zze(zznl zznlVar, zznl zznlVar2) {
        int i = zznlVar.zzb + zznlVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zznlVar.zzc, i);
        System.arraycopy(zznlVar2.zzc, 0, iArrCopyOf, zznlVar.zzb, zznlVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zznlVar.zzd, i);
        System.arraycopy(zznlVar2.zzd, 0, objArrCopyOf, zznlVar.zzb, zznlVar2.zzb);
        return new zznl(i, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznl)) {
            return false;
        }
        zznl zznlVar = (zznl) obj;
        int i = this.zzb;
        if (i == zznlVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zznlVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zznlVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        Object[] objArr = this.zzd;
        int i4 = this.zzb;
        for (int i5 = 0; i5 < i4; i5++) {
            iHashCode = (iHashCode * 31) + objArr[i5].hashCode();
        }
        return ((((i + 527) * 31) + i2) * 31) + iHashCode;
    }

    public final int zza() {
        int iZzy;
        int iZzx;
        int iZzx2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).longValue();
                    iZzx2 = zzki.zzx(i5 << 3) + 8;
                } else if (i6 == 2) {
                    zzka zzkaVar = (zzka) this.zzd[i3];
                    int i7 = zzki.zzb;
                    int iZzd = zzkaVar.zzd();
                    iZzx2 = zzki.zzx(i5 << 3) + zzki.zzx(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int i8 = zzki.zzb;
                    iZzy = ((zznl) this.zzd[i3]).zza();
                    int iZzx3 = zzki.zzx(i5 << 3);
                    iZzx = iZzx3 + iZzx3;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(zzll.zza());
                    }
                    ((Integer) this.zzd[i3]).intValue();
                    iZzx2 = zzki.zzx(i5 << 3) + 4;
                }
                i2 += iZzx2;
            } else {
                iZzy = zzki.zzy(((Long) this.zzd[i3]).longValue());
                iZzx = zzki.zzx(i5 << 3);
            }
            iZzx2 = iZzy + iZzx;
            i2 += iZzx2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzx = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            zzka zzkaVar = (zzka) this.zzd[i2];
            int i4 = zzki.zzb;
            int iZzd = zzkaVar.zzd();
            int iZzx2 = zzki.zzx(iZzd);
            int iZzx3 = zzki.zzx(16);
            int iZzx4 = zzki.zzx(i3 >>> 3);
            int iZzx5 = zzki.zzx(8);
            iZzx += iZzx5 + iZzx5 + iZzx3 + iZzx4 + zzki.zzx(24) + iZzx2 + iZzd;
        }
        this.zze = iZzx;
        return iZzx;
    }

    final zznl zzd(zznl zznlVar) {
        if (zznlVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zznlVar.zzb;
        zzl(i);
        System.arraycopy(zznlVar.zzc, 0, this.zzc, this.zzb, zznlVar.zzb);
        System.arraycopy(zznlVar.zzd, 0, this.zzd, this.zzb, zznlVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzmk.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzoc zzocVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzocVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzocVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzocVar.zzd(i4, (zzka) obj);
                } else if (i3 == 3) {
                    zzocVar.zzE(i4);
                    ((zznl) obj).zzk(zzocVar);
                    zzocVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzll.zza());
                    }
                    zzocVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zznl(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zznl zzc() {
        return zza;
    }

    static zznl zzf() {
        return new zznl(0, new int[8], new Object[8], true);
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
