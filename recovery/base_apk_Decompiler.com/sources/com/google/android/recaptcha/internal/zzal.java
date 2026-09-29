package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
final class zzal extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    final /* synthetic */ Application zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbd zzc;
    final /* synthetic */ zzbq zzd;
    final /* synthetic */ zzab zze;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        getYear.IconCompatParcelizer();
        SdkPayloadData.IconCompatParcelizer(obj);
        zzbd zzbdVar = this.zzc;
        Application application = this.zza;
        String strZza = zzaf.zza(application);
        String packageName = application.getPackageName();
        String strZzd = zzbdVar.zzd();
        zzq zzqVar = new zzq(application);
        int i = Build.VERSION.SDK_INT;
        String strZza2 = zzqVar.zza("_GRECAPTCHA_KC");
        if (strZza2 == null) {
            strZza2 = "";
        }
        String strEncode = URLEncoder.encode(this.zzb, CharsetNames.UTF_8);
        String strEncode2 = URLEncoder.encode(packageName, CharsetNames.UTF_8);
        String strEncode3 = URLEncoder.encode(strZza, CharsetNames.UTF_8);
        String strEncode4 = URLEncoder.encode("18.4.0", CharsetNames.UTF_8);
        String strEncode5 = URLEncoder.encode(strZzd, CharsetNames.UTF_8);
        StringBuilder sb = new StringBuilder("k=");
        sb.append(strEncode);
        sb.append("&pk=");
        sb.append(strEncode2);
        sb.append("&mst=");
        sb.append(strEncode3);
        sb.append("&msv=");
        sb.append(strEncode4);
        sb.append("&msi=");
        sb.append(strEncode5);
        sb.append("&mov=");
        sb.append(i);
        sb.append("&mkc=");
        sb.append(strZza2);
        byte[] bytes = sb.toString().getBytes(Charset.forName(CharsetNames.UTF_8));
        zzbq zzbqVar = this.zzd;
        zzab zzabVar = this.zze;
        return zzbqVar.zza(zzabVar.zzb(), bytes, this.zzc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(Application application, String str, zzbd zzbdVar, zzbq zzbqVar, zzab zzabVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbdVar;
        this.zzd = zzbqVar;
        this.zze = zzabVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, sampleVideos);
    }
}
