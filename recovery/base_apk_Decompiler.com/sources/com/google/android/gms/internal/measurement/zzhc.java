package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
final class zzhc extends zzhz {
    private final Context zza;
    private final zzim zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhz)) {
            return false;
        }
        zzhz zzhzVar = (zzhz) obj;
        if (!this.zza.equals(zzhzVar.zza())) {
            return false;
        }
        zzim zzimVar = this.zzb;
        if (zzimVar == null) {
            if (zzhzVar.zzb() != null) {
                return false;
            }
        } else if (!zzimVar.equals(zzhzVar.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        zzim zzimVar = this.zzb;
        return (zzimVar == null ? 0 : zzimVar.hashCode()) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    zzhc(Context context, zzim zzimVar) {
        this.zza = context;
        this.zzb = zzimVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    final zzim zzb() {
        return this.zzb;
    }
}
