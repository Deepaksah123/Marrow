package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
final class zzgs implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgv zzb;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        this.zzb.zza.zzA();
        return this.zzb.zza.zzh().zzu(this.zza);
    }

    zzgs(zzgv zzgvVar, String str) {
        this.zzb = zzgvVar;
        this.zza = str;
    }
}
