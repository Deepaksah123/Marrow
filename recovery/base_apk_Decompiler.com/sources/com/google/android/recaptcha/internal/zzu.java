package com.google.android.recaptcha.internal;

import kotlin.TestGroupLSModel;
import kotlin.getConfigExpirySeconds;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(String.valueOf(this.zzb / ((long) this.zza)), 10, ' ');
        String strIconCompatParcelizer2 = TestGroupLSModel.IconCompatParcelizer(String.valueOf(this.zzc), 10, ' ');
        String strIconCompatParcelizer3 = TestGroupLSModel.IconCompatParcelizer(String.valueOf(this.zzb), 10, ' ');
        String strIconCompatParcelizer4 = TestGroupLSModel.IconCompatParcelizer(String.valueOf(this.zza), 5, ' ');
        StringBuilder sb = new StringBuilder("avgExecutionTime: ");
        sb.append(strIconCompatParcelizer);
        sb.append(" us| maxExecutionTime: ");
        sb.append(strIconCompatParcelizer2);
        sb.append(" us| totalTime: ");
        sb.append(strIconCompatParcelizer3);
        sb.append(" us| #Usages: ");
        sb.append(strIconCompatParcelizer4);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzu zzuVar) {
        return getConfigExpirySeconds.read(Long.valueOf(this.zzb), Long.valueOf(zzuVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
