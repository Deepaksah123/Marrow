package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.C0177getRfBanners;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes5.dex */
final class zzaq extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        Object objZzk;
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        int i = this.zza;
        SdkPayloadData.IconCompatParcelizer(obj);
        if (i != 0) {
            objZzk = ((C0177getRfBanners) obj).getRemoteActionCompatParcelizer();
        } else {
            zzaw zzawVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZzk = zzawVar.zzk(recaptchaAction, j, this);
            if (objZzk == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
        }
        return C0177getRfBanners.AudioAttributesCompatParcelizer(objZzk);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaq(zzaw zzawVar, RecaptchaAction recaptchaAction, long j, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzaq(this.zzb, this.zzc, this.zzd, sampleVideos);
    }
}
