package com.google.android.recaptcha.internal;

import kotlin.SampleVideos;
import kotlin.getTotalMcq;
import kotlin.setDownloadPercent;

/* JADX INFO: loaded from: classes3.dex */
final class zzai extends getTotalMcq {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzam zzf;
    int zzg;
    setDownloadPercent zzh;
    zzt zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzai(zzam zzamVar, SampleVideos sampleVideos) {
        super(sampleVideos);
        this.zzf = zzamVar;
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zza(null, null, 0L, null, null, null, null, this);
    }
}
