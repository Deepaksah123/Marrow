package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes5.dex */
final class zzmo {
    private static final zzmn zza;
    private static final zzmn zzb;

    static {
        zzmn zzmnVar;
        try {
            zzmnVar = (zzmn) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzmnVar = null;
        }
        zza = zzmnVar;
        zzb = new zzmn();
    }

    static zzmn zza() {
        return zza;
    }

    static zzmn zzb() {
        return zzb;
    }
}
