package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zziv implements Runnable {
    final /* synthetic */ zziz zza;

    zziv(zziz zzizVar) {
        this.zza = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziz zzizVar = this.zza;
        zzizVar.zza = zzizVar.zzh;
    }
}
