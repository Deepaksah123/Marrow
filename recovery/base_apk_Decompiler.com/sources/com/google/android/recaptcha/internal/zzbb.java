package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbb {
    private final zzne zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze = null;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbb)) {
            return false;
        }
        zzbb zzbbVar = (zzbb) obj;
        if (zzbbVar.zza != this.zza || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) zzbbVar.zzb, (Object) this.zzb) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) zzbbVar.zzc, (Object) this.zzc) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) zzbbVar.zzd, (Object) this.zzd)) {
            return false;
        }
        String str = zzbbVar.zze;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, null});
    }

    public zzbb(zzne zzneVar, String str, String str2, String str3, String str4) {
        this.zza = zzneVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final zzne zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
