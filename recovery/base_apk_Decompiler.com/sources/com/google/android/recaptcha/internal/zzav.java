package com.google.android.recaptcha.internal;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.recaptcha.RecaptchaAction;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getAvcProfileAndLevel;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
final class zzav extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    final /* synthetic */ zzbd zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzog zzd;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzav) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) throws zzp {
        getYear.IconCompatParcelizer();
        SdkPayloadData.IconCompatParcelizer(obj);
        zzbb zzbbVarZza = this.zza.zza(zzne.FETCH_TOKEN);
        zzbg zzbgVar = this.zzb.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        zzob zzobVarZzf = zzoc.zzf();
        zzaw zzawVar = this.zzb;
        zzobVarZzf.zzr(zzawVar.zzg());
        zzobVarZzf.zzd(this.zzc.getAction());
        zzobVarZzf.zzq(zzawVar.zzg.zzI());
        zzobVarZzf.zzp(zzawVar.zzg.zzH());
        zzog zzogVar = this.zzd;
        zzobVarZzf.zzt(zzogVar.zzH());
        zzobVarZzf.zze(zzogVar.zzj());
        zzobVarZzf.zzs(zzogVar.zzI());
        zzoc zzocVar = (zzoc) zzobVarZzf.zzj();
        try {
            URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(new URL(this.zzb.zzf.zzd()).openConnection());
            toMagicModuleMetaRepoModel.read(uRLConnection, "");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/x-protobuffer");
            try {
                httpURLConnection.connect();
                zzoi zzoiVarZzf = zzoj.zzf();
                zzoiVarZzf.zzd(zzocVar.zzi());
                zzoiVarZzf.zzq(zzocVar.zzk());
                zzoiVarZzf.zzt(zzocVar.zzI());
                zzoiVarZzf.zzp(zzocVar.zzH());
                zzoiVarZzf.zzr(zzocVar.zzJ());
                zzoiVarZzf.zzs(zzocVar.zzK());
                zzoiVarZzf.zze(zzocVar.zzj());
                httpURLConnection.getOutputStream().write(((zzoj) zzoiVarZzf.zzj()).zzd());
                if (httpURLConnection.getResponseCode() != 200) {
                    throw zzbr.zza(httpURLConnection.getResponseCode());
                }
                try {
                    zzol zzolVarZzg = zzol.zzg(httpURLConnection.getInputStream());
                    this.zzb.zzi.zza(zzbbVarZza);
                    return zzolVarZzg;
                } catch (Exception unused) {
                    throw new zzp(zzn.zzc, zzl.zzR, null);
                }
            } catch (Exception e) {
                if (e instanceof zzp) {
                    throw ((zzp) e);
                }
                throw new zzp(zzn.zze, zzl.zzQ, null);
            }
        } catch (Exception e2) {
            zzp zzpVar = e2 instanceof zzp ? (zzp) e2 : new zzp(zzn.zzc, zzl.zzam, null);
            this.zzb.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzav(zzbd zzbdVar, zzaw zzawVar, RecaptchaAction recaptchaAction, zzog zzogVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zza = zzbdVar;
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = zzogVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzav(this.zza, this.zzb, this.zzc, this.zzd, sampleVideos);
    }
}
