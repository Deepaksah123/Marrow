package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlm {
    private static final zzlm zza = new zzlm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzlm() {
        this(0, new int[8], new Object[8], true);
    }

    static zzlm zze(zzlm zzlmVar, zzlm zzlmVar2) {
        int i = zzlmVar.zzb + zzlmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzlmVar.zzc, i);
        System.arraycopy(zzlmVar2.zzc, 0, iArrCopyOf, zzlmVar.zzb, zzlmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzlmVar.zzd, i);
        System.arraycopy(zzlmVar2.zzd, 0, objArrCopyOf, zzlmVar.zzb, zzlmVar2.zzb);
        return new zzlm(i, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzm(int i) {
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
        if (obj == null || !(obj instanceof zzlm)) {
            return false;
        }
        zzlm zzlmVar = (zzlm) obj;
        int i = this.zzb;
        if (i == zzlmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzlmVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzlmVar.zzd;
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
        int iZzz;
        int iZzy;
        int iZzy2;
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
                    iZzy2 = zzhh.zzy(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int iZzd = ((zzgw) this.zzd[i3]).zzd();
                    iZzy2 = zzhh.zzy(i5 << 3) + zzhh.zzy(iZzd) + iZzd;
                } else if (i6 == 3) {
                    iZzz = ((zzlm) this.zzd[i3]).zza();
                    int iZzy3 = zzhh.zzy(i5 << 3);
                    iZzy = iZzy3 + iZzy3;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(zzje.zza());
                    }
                    iZzy2 = zzhh.zzy(i5 << 3) + 4;
                }
                i2 += iZzy2;
            } else {
                iZzz = zzhh.zzz(((Long) this.zzd[i3]).longValue());
                iZzy = zzhh.zzy(i5 << 3);
            }
            iZzy2 = iZzz + iZzy;
            i2 += iZzy2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzy = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int iZzd = ((zzgw) this.zzd[i2]).zzd();
            int iZzy2 = zzhh.zzy(iZzd);
            int iZzy3 = zzhh.zzy(16);
            int iZzy4 = zzhh.zzy(i3 >>> 3);
            int iZzy5 = zzhh.zzy(8);
            iZzy += iZzy5 + iZzy5 + iZzy3 + iZzy4 + zzhh.zzy(24) + iZzy2 + iZzd;
        }
        this.zze = iZzy;
        return iZzy;
    }

    final zzlm zzd(zzlm zzlmVar) {
        if (zzlmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzlmVar.zzb;
        zzm(i);
        System.arraycopy(zzlmVar.zzc, 0, this.zzc, this.zzb, zzlmVar.zzb);
        System.arraycopy(zzlmVar.zzd, 0, this.zzd, this.zzb, zzlmVar.zzb);
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
            zzkg.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zzk(zzmd zzmdVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzmdVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzmd zzmdVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzmdVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzmdVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzmdVar.zzd(i4, (zzgw) obj);
                } else if (i3 == 3) {
                    zzmdVar.zzF(i4);
                    ((zzlm) obj).zzl(zzmdVar);
                    zzmdVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzje.zza());
                    }
                    zzmdVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzlm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzlm zzc() {
        return zza;
    }

    static zzlm zzf() {
        return new zzlm(0, new int[8], new Object[8], true);
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
