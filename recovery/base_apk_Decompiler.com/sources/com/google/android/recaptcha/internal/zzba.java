package com.google.android.recaptcha.internal;

import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzba {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzba)) {
            return false;
        }
        zzba zzbaVar = (zzba) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) zzbaVar.zza, (Object) this.zza) && zzbaVar.zzb == this.zzb && zzbaVar.zzc == this.zzc;
    }

    public zzba(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
