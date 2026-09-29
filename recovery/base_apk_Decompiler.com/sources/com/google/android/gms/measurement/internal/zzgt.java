package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzgt implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgv zzb;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zzb.zza.zzA();
        this.zzb.zza.zzL(this.zza);
    }

    zzgt(zzgv zzgvVar, zzq zzqVar) {
        this.zzb = zzgvVar;
        this.zza = zzqVar;
    }
}
