package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbp {
    public static final zzbp zza = new zzbp();

    public static final zzno zza(zzz zzzVar, zzz zzzVar2) {
        zznn zznnVarZzf = zzno.zzf();
        zznnVarZzf.zzp(zzmg.zzb(zzzVar.zzb()));
        zznnVarZzf.zzq(zzme.zza(zzzVar.zza(TimeUnit.NANOSECONDS)));
        zznnVarZzf.zzd(zzmg.zzb(zzzVar2.zzb()));
        zznnVarZzf.zze(zzme.zza(zzzVar2.zza(TimeUnit.NANOSECONDS)));
        return (zzno) zznnVarZzf.zzj();
    }

    private zzbp() {
    }
}
