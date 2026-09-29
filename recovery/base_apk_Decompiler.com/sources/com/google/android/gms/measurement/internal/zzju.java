package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes5.dex */
final class zzju implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzjy zzb;

    @Override // java.lang.Runnable
    public final void run() {
        zzjz.zzo(this.zzb.zza, this.zza);
    }

    zzju(zzjy zzjyVar, ComponentName componentName) {
        this.zzb = zzjyVar;
        this.zza = componentName;
    }
}
