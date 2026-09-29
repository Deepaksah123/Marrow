package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.C0177getRfBanners;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCaseImplWhenMappings;
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
final class zzf extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;
    private /* synthetic */ Object zze;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        MagicModuleUseCaseImplWhenMappings.write writeVar;
        Object objWrite;
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        if (this.zza != 0) {
            writeVar = (MagicModuleUseCaseImplWhenMappings.write) this.zze;
            SdkPayloadData.IconCompatParcelizer(obj);
        } else {
            SdkPayloadData.IconCompatParcelizer(obj);
            TopUserCompanion topUserCompanion = (TopUserCompanion) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new zze((zza) it.next(), this.zzc, this.zzd, null)));
            }
            MagicModuleUseCaseImplWhenMappings.write writeVar2 = new MagicModuleUseCaseImplWhenMappings.write();
            getYearOfAdmission[] getyearofadmissionArr = (getYearOfAdmission[]) arrayList.toArray(new getYearOfAdmission[0]);
            getYearOfAdmission[] getyearofadmissionArr2 = (getYearOfAdmission[]) Arrays.copyOf(getyearofadmissionArr, getyearofadmissionArr.length);
            this.zze = writeVar2;
            this.zza = 1;
            Object objIconCompatParcelizer2 = setEndTimestamp.IconCompatParcelizer(getyearofadmissionArr2, this);
            if (objIconCompatParcelizer2 == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
            obj = objIconCompatParcelizer2;
            writeVar = writeVar2;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(((C0177getRfBanners) it2.next()).getRemoteActionCompatParcelizer());
            if (thIconCompatParcelizer != null) {
                T zzpVar = 0;
                if (writeVar.write != 0) {
                    zzpVar = new zzp(zzn.zzc, zzl.zzal, null);
                } else if (thIconCompatParcelizer instanceof zzp) {
                    zzpVar = (zzp) thIconCompatParcelizer;
                }
                writeVar.write = zzpVar;
            }
        }
        zzp zzpVar2 = (zzp) writeVar.write;
        if (zzpVar2 != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            objWrite = SdkPayloadData.write(zzpVar2);
        } else {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            objWrite = getShowPopup.INSTANCE;
        }
        return C0177getRfBanners.AudioAttributesCompatParcelizer(C0177getRfBanners.read(objWrite));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(zzg zzgVar, long j, zzoe zzoeVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = zzgVar;
        this.zzc = j;
        this.zzd = zzoeVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, sampleVideos);
        zzfVar.zze = obj;
        return zzfVar;
    }
}
