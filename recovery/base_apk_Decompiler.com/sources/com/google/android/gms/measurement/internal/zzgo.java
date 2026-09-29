package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzgo implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgv zzc;

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }

    zzgo(zzgv zzgvVar, zzau zzauVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzauVar;
        this.zzb = zzqVar;
    }
}
