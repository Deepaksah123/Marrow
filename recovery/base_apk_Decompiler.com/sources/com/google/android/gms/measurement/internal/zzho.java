package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzho implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzik zzb;

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzm().zzf.zzb(this.zza);
        this.zzb.zzt.zzaA().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }

    zzho(zzik zzikVar, long j) {
        this.zzb = zzikVar;
        this.zza = j;
    }
}
