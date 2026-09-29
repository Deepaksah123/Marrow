package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlin.C0201setMcqCount;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbj extends TimerTask {
    final /* synthetic */ zzbm zza;

    public zzbj(zzbm zzbmVar) {
        this.zza = zzbmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzbm zzbmVar = this.zza;
        C0201setMcqCount.IconCompatParcelizer(zzbmVar.zzd, null, null, new zzbk(zzbmVar, null), 3);
    }
}
