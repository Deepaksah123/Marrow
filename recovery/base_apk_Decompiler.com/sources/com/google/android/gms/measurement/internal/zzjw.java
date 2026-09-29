package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
final class zzjw implements Runnable {
    final /* synthetic */ zzjy zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.zza.zza;
        Context contextZzaw = zzjzVar.zzt.zzaw();
        this.zza.zza.zzt.zzay();
        zzjz.zzo(zzjzVar, new ComponentName(contextZzaw, "com.google.android.gms.measurement.AppMeasurementService"));
    }

    zzjw(zzjy zzjyVar) {
        this.zza = zzjyVar;
    }
}
