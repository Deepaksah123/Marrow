package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.C0177getRfBanners;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.VideoSessionResponseBody;
import kotlin.getCollegeName;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.getYearOfAdmission;
import kotlin.setEndTimestamp;
import kotlin.setModifiedEndTimestampMs;

/* JADX INFO: loaded from: classes3.dex */
final class zzc extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        int i = this.zza;
        SdkPayloadData.IconCompatParcelizer(obj);
        if (i == 0) {
            TopUserCompanion topUserCompanion = (TopUserCompanion) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new zzb((zza) it.next(), this.zzc, this.zzd, null)));
            }
            getYearOfAdmission[] getyearofadmissionArr = (getYearOfAdmission[]) arrayList.toArray(new getYearOfAdmission[0]);
            getYearOfAdmission[] getyearofadmissionArr2 = (getYearOfAdmission[]) Arrays.copyOf(getyearofadmissionArr, getyearofadmissionArr.length);
            this.zza = 1;
            obj = setEndTimestamp.IconCompatParcelizer(getyearofadmissionArr2, this);
            if (obj == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
        }
        String str = this.zzc;
        zzof zzofVarZzf = zzog.zzf();
        zzofVarZzf.zzd(str);
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Object remoteActionCompatParcelizer = ((C0177getRfBanners) it2.next()).getRemoteActionCompatParcelizer();
            if (C0177getRfBanners.write(remoteActionCompatParcelizer)) {
                zzofVarZzf.zzg((zzog) remoteActionCompatParcelizer);
            }
        }
        return (zzog) zzofVarZzf.zzj();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zzg zzgVar, String str, long j, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        zzc zzcVar = new zzc(this.zzb, this.zzc, this.zzd, sampleVideos);
        zzcVar.zze = obj;
        return zzcVar;
    }
}
