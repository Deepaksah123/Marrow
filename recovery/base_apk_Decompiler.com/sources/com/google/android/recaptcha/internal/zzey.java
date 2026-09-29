package com.google.android.recaptcha.internal;

import kotlin.C0201setMcqCount;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class zzey extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzoe zzb;
    final /* synthetic */ zzbb zzc;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) throws Exception {
        getYear.IconCompatParcelizer();
        SdkPayloadData.IconCompatParcelizer(obj);
        try {
            zzez zzezVar = this.zza;
            C0201setMcqCount.IconCompatParcelizer(this.zza.zzq.zzb(), null, null, new zzex(this.zza, zzezVar.zzf().zzb(this.zzb, zzezVar.zzp), null), 3);
        } catch (zzp e) {
            zzez zzezVar2 = this.zza;
            zzezVar2.zzi.zzb(this.zzc, e, null);
            this.zza.zzk().AudioAttributesCompatParcelizer((Throwable) e);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzey(zzez zzezVar, zzoe zzoeVar, zzbb zzbbVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zza = zzezVar;
        this.zzb = zzoeVar;
        this.zzc = zzbbVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzey(this.zza, this.zzb, this.zzc, sampleVideos);
    }
}
