package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes5.dex */
final class zzcc extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzcd zzb;
    final /* synthetic */ String zzc;

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        getYear.IconCompatParcelizer();
        SdkPayloadData.IconCompatParcelizer(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str);
            sb.append("\"");
            arrayList.add(sb.toString());
        }
        zzcd zzcdVar = this.zzb;
        String str2 = this.zzc;
        WebView webView = zzcdVar.zza;
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList, ",", null, null, 0, null, null, 62);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        sb2.append(strRemoteActionCompatParcelizer);
        sb2.append(")");
        webView.evaluateJavascript(sb2.toString(), null);
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcc(String[] strArr, zzcd zzcdVar, String str, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zza = strArr;
        this.zzb = zzcdVar;
        this.zzc = str;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzcc(this.zza, this.zzb, this.zzc, sampleVideos);
    }
}
