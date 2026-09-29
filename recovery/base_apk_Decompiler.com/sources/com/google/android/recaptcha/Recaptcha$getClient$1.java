package com.google.android.recaptcha;

import kotlin.C0177getRfBanners;
import kotlin.SampleVideos;
import kotlin.getTotalMcq;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class Recaptcha$getClient$1 extends getTotalMcq {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, SampleVideos sampleVideos) {
        super(sampleVideos);
        this.zzb = recaptcha;
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM176getClientBWLJW6A = this.zzb.m176getClientBWLJW6A(null, null, 0L, this);
        return objM176getClientBWLJW6A == getYear.IconCompatParcelizer() ? objM176getClientBWLJW6A : C0177getRfBanners.AudioAttributesCompatParcelizer(objM176getClientBWLJW6A);
    }
}
