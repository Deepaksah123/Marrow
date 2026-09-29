package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
final class zzla implements Callable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzlh zzb;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        if (this.zzb.zzq((String) Preconditions.checkNotNull(this.zza.zza)).zzj(zzha.ANALYTICS_STORAGE) && zzhb.zzc(this.zza.zzv, 100).zzj(zzha.ANALYTICS_STORAGE)) {
            return this.zzb.zzd(this.zza).zzw();
        }
        this.zzb.zzaA().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }

    zzla(zzlh zzlhVar, zzq zzqVar) {
        this.zzb = zzlhVar;
        this.zza = zzqVar;
    }
}
