package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
final class zzlb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb = "_err";
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzlc zzd;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zzd.zza.zzF((zzau) Preconditions.checkNotNull(this.zzd.zza.zzv().zzz(this.zza, this.zzb, this.zzc, TtmlNode.TEXT_EMPHASIS_AUTO, this.zzd.zza.zzax().currentTimeMillis(), false, true)), this.zza);
    }

    zzlb(zzlc zzlcVar, String str, String str2, Bundle bundle) {
        this.zzd = zzlcVar;
        this.zza = str;
        this.zzc = bundle;
    }
}
