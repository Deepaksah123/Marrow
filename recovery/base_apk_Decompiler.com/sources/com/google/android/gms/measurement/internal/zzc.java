package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzc implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzd zzb;

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzj(this.zza);
    }

    zzc(zzd zzdVar, long j) {
        this.zzb = zzdVar;
        this.zza = j;
    }
}
