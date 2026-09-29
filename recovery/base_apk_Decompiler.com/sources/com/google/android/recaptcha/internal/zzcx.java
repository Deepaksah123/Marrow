package com.google.android.recaptcha.internal;

import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.getShowPopup;

/* JADX INFO: loaded from: classes5.dex */
final class zzcx extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody {
    final /* synthetic */ zzcj zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i = this.zzc;
        if (i != -1) {
            this.zza.zzc().zzf(i, objArr);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcx(zzcj zzcjVar, String str, int i) {
        super(2);
        this.zza = zzcjVar;
        this.zzb = str;
        this.zzc = i;
    }
}
