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
final class zze extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) throws zzp {
        Object objZzb;
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        int i = this.zza;
        SdkPayloadData.IconCompatParcelizer(obj);
        if (i != 0) {
            objZzb = ((C0177getRfBanners) obj).getRemoteActionCompatParcelizer();
        } else {
            zza zzaVar = this.zzb;
            long j = this.zzc;
            zzoe zzoeVar = this.zzd;
            this.zza = 1;
            objZzb = zzaVar.zzb(j, zzoeVar, this);
            if (objZzb == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
        }
        return C0177getRfBanners.AudioAttributesCompatParcelizer(objZzb);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zze(zza zzaVar, long j, zzoe zzoeVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = zzaVar;
        this.zzc = j;
        this.zzd = zzoeVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zze(this.zzb, this.zzc, this.zzd, sampleVideos);
    }
}
