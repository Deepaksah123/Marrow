package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;

/* JADX INFO: loaded from: classes3.dex */
final class zzat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ zzbd zze;
    final /* synthetic */ String zzf;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzat) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r13 != r0) goto L10;
     */
    @Override // kotlin.getMonthName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws com.google.android.recaptcha.internal.zzp {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
            int r1 = r12.zza
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            r2 = 1
            if (r1 == 0) goto Lf
            if (r1 == r2) goto L2b
            goto L3c
        Lf:
            com.google.android.recaptcha.internal.zzaw r13 = r12.zzb
            long r3 = r12.zzc
            com.google.android.recaptcha.RecaptchaAction r1 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r5 = r12.zze
            com.google.android.recaptcha.internal.zzaw.zzi(r13, r3, r1, r5)
            com.google.android.recaptcha.internal.zzaw r6 = r12.zzb
            long r7 = r12.zzc
            java.lang.String r9 = r12.zzf
            com.google.android.recaptcha.internal.zzbd r10 = r12.zze
            r12.zza = r2
            r11 = r12
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzaw.zzd(r6, r7, r9, r10, r11)
            if (r13 == r0) goto L63
        L2b:
            com.google.android.recaptcha.internal.zzaw r1 = r12.zzb
            com.google.android.recaptcha.RecaptchaAction r2 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r3 = r12.zze
            com.google.android.recaptcha.internal.zzog r13 = (com.google.android.recaptcha.internal.zzog) r13
            r4 = 2
            r12.zza = r4
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzaw.zzf(r1, r2, r13, r3, r12)
            if (r13 == r0) goto L63
        L3c:
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r1 = r12.zze
            com.google.android.recaptcha.internal.zzol r13 = (com.google.android.recaptcha.internal.zzol) r13
            com.google.android.recaptcha.internal.zzaw.zzh(r0, r13, r1)
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r12 = r12.zze
            com.google.android.recaptcha.internal.zzbg r0 = com.google.android.recaptcha.internal.zzaw.zzb(r0)
            com.google.android.recaptcha.internal.zzne r1 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r12 = r12.zza(r1)
            r0.zza(r12)
            java.lang.String r12 = r13.zzi()
            java.lang.Object r12 = kotlin.C0177getRfBanners.read(r12)
            o.getRfBanners r12 = kotlin.C0177getRfBanners.AudioAttributesCompatParcelizer(r12)
            return r12
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzat.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzat(zzaw zzawVar, long j, RecaptchaAction recaptchaAction, zzbd zzbdVar, String str, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = zzawVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
        this.zze = zzbdVar;
        this.zzf = str;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzat(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, sampleVideos);
    }
}
