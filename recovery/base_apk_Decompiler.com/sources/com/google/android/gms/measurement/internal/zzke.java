package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzke implements Runnable {
    final /* synthetic */ zzlh zza;
    final /* synthetic */ Runnable zzb;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzX();
    }

    zzke(zzkg zzkgVar, zzlh zzlhVar, Runnable runnable) {
        this.zza = zzlhVar;
        this.zzb = runnable;
    }
}
