package com.google.android.recaptcha.internal;

import kotlin.SampleVideos;
import kotlin.getTotalMcq;

/* JADX INFO: loaded from: classes3.dex */
final class zzao extends getTotalMcq {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;
    zzaw zzd;
    zzbb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzao(zzaw zzawVar, SampleVideos sampleVideos) {
        super(sampleVideos);
        this.zzb = zzawVar;
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzj(0L, null, null, this);
    }
}
