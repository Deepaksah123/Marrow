package com.google.android.recaptcha.internal;

import kotlin.C0177getRfBanners;
import kotlin.SampleVideos;
import kotlin.getTotalMcq;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class zzd extends getTotalMcq {
    /* synthetic */ Object zza;
    final /* synthetic */ zzg zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(zzg zzgVar, SampleVideos sampleVideos) {
        super(sampleVideos);
        this.zzb = zzgVar;
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzb = this.zzb.zzb(0L, null, this);
        return objZzb == getYear.IconCompatParcelizer() ? objZzb : C0177getRfBanners.AudioAttributesCompatParcelizer(objZzb);
    }
}
