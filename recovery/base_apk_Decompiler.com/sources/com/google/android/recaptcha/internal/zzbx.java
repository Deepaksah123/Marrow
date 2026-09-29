package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.College;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes5.dex */
final class zzbx extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzca zzd;
    private /* synthetic */ Object zze;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        int i = this.zza;
        SdkPayloadData.IconCompatParcelizer(obj);
        if (i == 0) {
            TopUserCompanion topUserCompanion = (TopUserCompanion) this.zze;
            zzfh zzfhVarZzb = zzfh.zzb();
            while (true) {
                zzcj zzcjVar = this.zzb;
                if (zzcjVar.zza() < 0) {
                    break;
                }
                if (zzcjVar.zza() >= this.zzc.size() || !College.IconCompatParcelizer(topUserCompanion)) {
                    break;
                }
                try {
                    this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zza()), this.zzb);
                } catch (Exception e) {
                    zzca zzcaVar = this.zzd;
                    zzcj zzcjVar2 = this.zzb;
                    this.zza = 1;
                    if (zzcaVar.zzh(e, zzcjVar2, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
            }
            zzfhVarZzb.zzf();
            QBankStatsResponse.RemoteActionCompatParcelizer(zzfhVarZzb.zza(TimeUnit.MICROSECONDS));
            return getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbx(zzcj zzcjVar, List list, zzca zzcaVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = zzcjVar;
        this.zzc = list;
        this.zzd = zzcaVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        zzbx zzbxVar = new zzbx(this.zzb, this.zzc, this.zzd, sampleVideos);
        zzbxVar.zze = obj;
        return zzbxVar;
    }
}
