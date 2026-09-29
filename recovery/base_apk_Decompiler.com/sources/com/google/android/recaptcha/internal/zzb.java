package com.google.android.recaptcha.internal;

import kotlin.C0177getRfBanners;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class zzb extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) throws zzp {
        Object objZza;
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        int i = this.zza;
        SdkPayloadData.IconCompatParcelizer(obj);
        if (i != 0) {
            objZza = ((C0177getRfBanners) obj).getRemoteActionCompatParcelizer();
        } else {
            zza zzaVar = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZza = zzaVar.zza(str, j, this);
            if (objZza == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
        }
        return C0177getRfBanners.AudioAttributesCompatParcelizer(objZza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzb(zza zzaVar, String str, long j, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzb(this.zzb, this.zzc, this.zzd, sampleVideos);
    }
}
