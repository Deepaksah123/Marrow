package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class zzak extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzak) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) throws RecaptchaException, ApiException {
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        int i = this.zza;
        SdkPayloadData.IconCompatParcelizer(obj);
        if (i != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j = this.zzd;
        this.zza = 1;
        Object objZzc = zzam.zzc(application, str, j, null, this);
        return objZzc == objIconCompatParcelizer ? objIconCompatParcelizer : objZzc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzak(Application application, String str, long j, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzak(this.zzb, this.zzc, this.zzd, sampleVideos);
    }
}
