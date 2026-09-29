package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class zzes extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    final /* synthetic */ zzez zza;
    final /* synthetic */ String zzb;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        getYear.IconCompatParcelizer();
        SdkPayloadData.IconCompatParcelizer(obj);
        WebView webViewZzc = this.zza.zzc();
        StringBuilder sb = new StringBuilder("recaptcha.m.Main.execute(\"");
        sb.append(this.zzb);
        sb.append("\")");
        webViewZzc.evaluateJavascript(sb.toString(), null);
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzes(zzez zzezVar, String str, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zza = zzezVar;
        this.zzb = str;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzes(this.zza, this.zzb, sampleVideos);
    }
}
