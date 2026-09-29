package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzft implements com.google.android.gms.internal.measurement.zzo {
    final /* synthetic */ String zza;
    final /* synthetic */ zzfu zzb;

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.zzb.zzg.get(this.zza);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }

    zzft(zzfu zzfuVar, String str) {
        this.zzb = zzfuVar;
        this.zza = str;
    }
}
