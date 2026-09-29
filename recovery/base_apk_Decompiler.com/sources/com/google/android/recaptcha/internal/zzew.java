package com.google.android.recaptcha.internal;

import kotlin.C0177getRfBanners;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getUserStartedTimestampMs;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class zzew extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ zzez zzb;
    final /* synthetic */ zzoe zzc;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        int i = this.zza;
        SdkPayloadData.IconCompatParcelizer(obj);
        if (i == 0) {
            zzez zzezVar = this.zzb;
            zzezVar.zzi.zza(zzezVar.zzp.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzh().zzj(this.zzc.zzJ())));
            this.zzb.zzn.zzd();
            this.zzb.zzn.zze();
            zzez.zzl(this.zzb, this.zzc);
            this.zzb.zzk().hashCode();
            getUserStartedTimestampMs getuserstartedtimestampmsZzk = this.zzb.zzk();
            this.zza = 1;
            if (getuserstartedtimestampmsZzk.AudioAttributesCompatParcelizer((SampleVideos) this) == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
        }
        return C0177getRfBanners.AudioAttributesCompatParcelizer(C0177getRfBanners.read(getShowPopup.INSTANCE));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzew(zzez zzezVar, zzoe zzoeVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = zzezVar;
        this.zzc = zzoeVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzew(this.zzb, this.zzc, sampleVideos);
    }
}
