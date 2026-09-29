package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Pair;
import kotlin.VideoSessionResponseBody;
import kotlin.VideoTimelineResponseBody;
import kotlin.getCollegeName;
import kotlin.getQues;
import kotlin.newYearNameItem;
import kotlin.setAction;
import kotlin.setModifiedEndTimestampMs;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaw implements RecaptchaClient, RecaptchaTasksClient {
    public static final zzan zza = new zzan(null);
    private static final newYearNameItem zzb = new newYearNameItem("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzc;
    private final zzg zzd;
    private final String zze;
    private final zzab zzf;
    private final zzoe zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzq zzj;
    private final zzbs zzk;
    private final zzt zzl;

    public static final /* synthetic */ void zzi(zzaw zzawVar, long j, RecaptchaAction recaptchaAction, zzbd zzbdVar) throws zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.EXECUTE_NATIVE);
        zzbg zzbgVar = zzawVar.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        zzp zzpVar = !zzb.write(recaptchaAction.getAction()) ? new zzp(zzn.zzi, zzl.zzq, null) : null;
        if (j < 5000) {
            zzpVar = new zzp(zzn.zzc, zzl.zzT, null);
        }
        if (zzpVar == null) {
            zzawVar.zzi.zza(zzbbVarZza);
        } else {
            zzawVar.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(long r6, java.lang.String r8, com.google.android.recaptcha.internal.zzbd r9, kotlin.SampleVideos r10) throws com.google.android.recaptcha.internal.zzp {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzao
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzao r0 = (com.google.android.recaptcha.internal.zzao) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzao r0 = new com.google.android.recaptcha.internal.zzao
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.zza
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.zzc
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.google.android.recaptcha.internal.zzbb r5 = r0.zze
            com.google.android.recaptcha.internal.zzaw r6 = r0.zzd
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)     // Catch: java.lang.Exception -> L30
            r9 = r5
            r5 = r6
            goto L57
        L30:
            r7 = move-exception
            goto L64
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            com.google.android.recaptcha.internal.zzne r10 = com.google.android.recaptcha.internal.zzne.COLLECT_SIGNALS
            com.google.android.recaptcha.internal.zzbb r9 = r9.zza(r10)
            com.google.android.recaptcha.internal.zzbg r10 = r5.zzi
            r2 = 2
            com.google.android.recaptcha.internal.zzbg.zzc(r10, r9, r4, r2, r4)
            com.google.android.recaptcha.internal.zzg r10 = r5.zzd     // Catch: java.lang.Exception -> L60
            r0.zzd = r5     // Catch: java.lang.Exception -> L60
            r0.zze = r9     // Catch: java.lang.Exception -> L60
            r0.zzc = r3     // Catch: java.lang.Exception -> L60
            java.lang.Object r10 = r10.zza(r8, r6, r0)     // Catch: java.lang.Exception -> L60
            if (r10 == r1) goto L5f
        L57:
            com.google.android.recaptcha.internal.zzog r10 = (com.google.android.recaptcha.internal.zzog) r10     // Catch: java.lang.Exception -> L60
            com.google.android.recaptcha.internal.zzbg r6 = r5.zzi     // Catch: java.lang.Exception -> L60
            r6.zza(r9)     // Catch: java.lang.Exception -> L60
            return r10
        L5f:
            return r1
        L60:
            r6 = move-exception
            r7 = r6
            r6 = r5
            r5 = r9
        L64:
            boolean r8 = r7 instanceof com.google.android.recaptcha.internal.zzp
            if (r8 == 0) goto L6b
            com.google.android.recaptcha.internal.zzp r7 = (com.google.android.recaptcha.internal.zzp) r7
            goto L75
        L6b:
            com.google.android.recaptcha.internal.zzn r7 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r8 = com.google.android.recaptcha.internal.zzl.zzan
            com.google.android.recaptcha.internal.zzp r9 = new com.google.android.recaptcha.internal.zzp
            r9.<init>(r7, r8, r4)
            r7 = r9
        L75:
            com.google.android.recaptcha.internal.zzbg r6 = r6.zzi
            r6.zzb(r5, r7, r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.zzj(long, java.lang.String, com.google.android.recaptcha.internal.zzbd, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzk(com.google.android.recaptcha.RecaptchaAction r16, long r17, kotlin.SampleVideos r19) {
        /*
            r15 = this;
            r9 = r15
            r0 = r19
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzas
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzas r1 = (com.google.android.recaptcha.internal.zzas) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.zzc = r2
            goto L1b
        L16:
            com.google.android.recaptcha.internal.zzas r1 = new com.google.android.recaptcha.internal.zzas
            r1.<init>(r15, r0)
        L1b:
            r0 = r1
            java.lang.Object r1 = r0.zza
            java.lang.Object r10 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.zzc
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L3c
            if (r2 != r11) goto L34
            com.google.android.recaptcha.internal.zzbd r2 = r0.zze
            com.google.android.recaptcha.internal.zzaw r3 = r0.zzd
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)     // Catch: java.lang.Exception -> L32
            goto L79
        L32:
            r0 = move-exception
            goto L84
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r7 = r1.toString()
            com.google.android.recaptcha.internal.zzbd r1 = r9.zzh
            com.google.android.recaptcha.internal.zzbd r13 = r1.zzb()
            r13.zzc(r7)
            com.google.android.recaptcha.internal.zzbg r1 = r9.zzi
            com.google.android.recaptcha.internal.zzne r2 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r2 = r13.zza(r2)
            r3 = 2
            com.google.android.recaptcha.internal.zzbg.zzc(r1, r2, r12, r3, r12)
            com.google.android.recaptcha.internal.zzat r14 = new com.google.android.recaptcha.internal.zzat     // Catch: java.lang.Exception -> L81
            r8 = 0
            r1 = r14
            r2 = r15
            r3 = r17
            r5 = r16
            r6 = r13
            r1.<init>(r2, r3, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L81
            r0.zzd = r9     // Catch: java.lang.Exception -> L81
            r0.zze = r13     // Catch: java.lang.Exception -> L81
            r0.zzc = r11     // Catch: java.lang.Exception -> L81
            r1 = r17
            java.lang.Object r1 = kotlin.NestfputmCountryCode.write(r1, r14, r0)     // Catch: java.lang.Exception -> L81
            if (r1 == r10) goto L80
            r3 = r9
            r2 = r13
        L79:
            o.getRfBanners r1 = (kotlin.C0177getRfBanners) r1     // Catch: java.lang.Exception -> L32
            java.lang.Object r0 = r1.getRemoteActionCompatParcelizer()     // Catch: java.lang.Exception -> L32
            return r0
        L80:
            return r10
        L81:
            r0 = move-exception
            r3 = r9
            r2 = r13
        L84:
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzp
            if (r1 == 0) goto L8b
            com.google.android.recaptcha.internal.zzp r0 = (com.google.android.recaptcha.internal.zzp) r0
            goto L9d
        L8b:
            java.lang.Class r0 = r0.getClass()
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r4 = com.google.android.recaptcha.internal.zzl.zzaj
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.recaptcha.internal.zzp r5 = new com.google.android.recaptcha.internal.zzp
            r5.<init>(r1, r4, r0)
            r0 = r5
        L9d:
            com.google.android.recaptcha.internal.zzbg r1 = r3.zzi
            com.google.android.recaptcha.internal.zzne r3 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r2 = r2.zza(r3)
            r1.zzb(r2, r0, r12)
            com.google.android.recaptcha.RecaptchaException r0 = r0.zzc()
            o.getRfBanners$IconCompatParcelizer r1 = kotlin.C0177getRfBanners.IconCompatParcelizer
            java.lang.Object r0 = kotlin.SdkPayloadData.write(r0)
            java.lang.Object r0 = kotlin.C0177getRfBanners.read(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.zzk(com.google.android.recaptcha.RecaptchaAction, long, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(zzol zzolVar, zzbd zzbdVar) throws zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.POST_EXECUTE);
        zzbg zzbgVar = this.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        try {
            List<zzon> listZzj = zzolVar.zzj();
            LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listZzj, 10)), 16));
            for (zzon zzonVar : listZzj) {
                Pair pairWrite = setAction.write(zzonVar.zzg(), zzonVar.zzi());
                linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
            }
            this.zzj.zzb(linkedHashMap);
            this.zzi.zza(zzbbVarZza);
        } catch (Exception e) {
            zzp zzpVar = e instanceof zzp ? (zzp) e : new zzp(zzn.zzc, zzl.zzan, null);
            this.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo177execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r11, long r12, kotlin.SampleVideos<? super kotlin.C0177getRfBanners<java.lang.String>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzap
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzap r0 = (com.google.android.recaptcha.internal.zzap) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzap r0 = new com.google.android.recaptcha.internal.zzap
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L51
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            com.google.android.recaptcha.internal.zzt r14 = r10.zzl
            o.TopUserCompanion r14 = r14.zzb()
            o.CurrentQuery r14 = r14.getIconCompatParcelizer()
            com.google.android.recaptcha.internal.zzaq r2 = new com.google.android.recaptcha.internal.zzaq
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.zzc = r3
            java.lang.Object r14 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            o.getRfBanners r14 = (kotlin.C0177getRfBanners) r14
            java.lang.Object r10 = r14.getRemoteActionCompatParcelizer()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.mo177execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo178executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, kotlin.SampleVideos<? super kotlin.C0177getRfBanners<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzar
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzar r0 = (com.google.android.recaptcha.internal.zzar) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzar r0 = new com.google.android.recaptcha.internal.zzar
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getRfBanners r6 = (kotlin.C0177getRfBanners) r6
            java.lang.Object r4 = r6.getRemoteActionCompatParcelizer()
            return r4
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r4 = r4.mo177execute0E7RQCE(r5, r2, r0)
            if (r4 != r1) goto L45
            return r1
        L45:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.mo178executegIAlus(com.google.android.recaptcha.RecaptchaAction, o.SampleVideos):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzj.zza(setModifiedEndTimestampMs.IconCompatParcelizer(this.zzl.zzb(), VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new zzau(this, recaptchaAction, 10000L, null)));
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzj.zza(setModifiedEndTimestampMs.IconCompatParcelizer(this.zzl.zzb(), VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new zzau(this, recaptchaAction, j, null)));
    }

    public zzaw(Application application, zzg zzgVar, String str, zzt zztVar, zzab zzabVar, zzoe zzoeVar, zzbd zzbdVar, zzbg zzbgVar, zzq zzqVar, zzbs zzbsVar) {
        this.zzc = application;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzl = zztVar;
        this.zzf = zzabVar;
        this.zzg = zzoeVar;
        this.zzh = zzbdVar;
        this.zzi = zzbgVar;
        this.zzj = zzqVar;
        this.zzk = zzbsVar;
    }

    public final String zzg() {
        return this.zze;
    }
}
