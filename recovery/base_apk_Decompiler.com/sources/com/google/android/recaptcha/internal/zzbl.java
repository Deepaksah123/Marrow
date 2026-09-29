package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class zzbl extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    final /* synthetic */ zzbm zza;
    final /* synthetic */ zzpd zzb;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        getYear.IconCompatParcelizer();
        SdkPayloadData.IconCompatParcelizer(obj);
        zzbm zzbmVar = this.zza;
        zzpd zzpdVar = this.zzb;
        synchronized (zzbh.class) {
            if (zzbmVar.zze != null) {
                byte[] bArrZzd = zzpdVar.zzd();
                zzba zzbaVar = new zzba(zzfy.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                zzaz zzazVar = zzbmVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzbaVar.zzc());
                contentValues.put("ts", Long.valueOf(zzbaVar.zzb()));
                zzazVar.getWritableDatabase().insert("ce", null, contentValues);
                int iZzb = zzbmVar.zze.zzb() - 500;
                if (iZzb > 0) {
                    zzbmVar.zze.zza(IntermediateLoginResponseBody.write((Iterable) zzbmVar.zze.zzd(), iZzb));
                }
                if (zzbmVar.zze.zzb() >= 20) {
                    zzbmVar.zzg();
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbl(zzbm zzbmVar, zzpd zzpdVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zza = zzbmVar;
        this.zzb = zzpdVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzbl(this.zza, this.zzb, sampleVideos);
    }
}
