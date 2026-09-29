package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhb {
    public static final zzhb zza = new zzhb(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzhb(Boolean bool, Boolean bool2, int i) {
        EnumMap enumMap = new EnumMap(zzha.class);
        this.zzb = enumMap;
        enumMap.put(zzha.AD_STORAGE, bool);
        enumMap.put(zzha.ANALYTICS_STORAGE, bool2);
        this.zzc = i;
    }

    public static zzhb zzb(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzhb(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            enumMap.put(zzhaVar, zzp(bundle.getString(zzhaVar.zzd)));
        }
        return new zzhb(enumMap, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.measurement.internal.zzhb zzc(java.lang.String r5, int r6) {
        /*
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzha> r1 = com.google.android.gms.measurement.internal.zzha.class
            r0.<init>(r1)
            if (r5 == 0) goto L3a
            r1 = 0
        La:
            com.google.android.gms.measurement.internal.zzha[] r2 = com.google.android.gms.measurement.internal.zzha.zzc
            int r2 = r2.length
            r2 = 2
            if (r1 >= r2) goto L3a
            com.google.android.gms.measurement.internal.zzha[] r2 = com.google.android.gms.measurement.internal.zzha.zzc
            r2 = r2[r1]
            int r3 = r1 + 2
            int r4 = r5.length()
            if (r3 >= r4) goto L37
            char r3 = r5.charAt(r3)
            r4 = 45
            if (r3 == r4) goto L33
            r4 = 48
            if (r3 == r4) goto L30
            r4 = 49
            if (r3 == r4) goto L2d
            goto L33
        L2d:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L34
        L30:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L34
        L33:
            r3 = 0
        L34:
            r0.put(r2, r3)
        L37:
            int r1 = r1 + 1
            goto La
        L3a:
            com.google.android.gms.measurement.internal.zzhb r5 = new com.google.android.gms.measurement.internal.zzhb
            r5.<init>(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhb.zzc(java.lang.String, int):com.google.android.gms.measurement.internal.zzhb");
    }

    public static String zzh(Bundle bundle) {
        String string;
        for (zzha zzhaVar : zzha.values()) {
            if (bundle.containsKey(zzhaVar.zzd) && (string = bundle.getString(zzhaVar.zzd)) != null && zzp(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzk(int i, int i2) {
        return i <= i2;
    }

    static final int zzo(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzp(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhb)) {
            return false;
        }
        zzhb zzhbVar = (zzhb) obj;
        for (zzha zzhaVar : zzha.values()) {
            if (zzo((Boolean) this.zzb.get(zzhaVar)) != zzo((Boolean) zzhbVar.zzb.get(zzhaVar))) {
                return false;
            }
        }
        return this.zzc == zzhbVar.zzc;
    }

    public final int hashCode() {
        int iZzo = this.zzc * 17;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            iZzo = (iZzo * 31) + zzo((Boolean) it.next());
        }
        return iZzo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: source=");
        sb.append(this.zzc);
        for (zzha zzhaVar : zzha.values()) {
            sb.append(", ");
            sb.append(zzhaVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public final zzhb zzd(zzhb zzhbVar) {
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean boolValueOf = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool = (Boolean) zzhbVar.zzb.get(zzhaVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(zzhaVar, boolValueOf);
        }
        return new zzhb(enumMap, 100);
    }

    public final zzhb zze(zzhb zzhbVar) {
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                bool = (Boolean) zzhbVar.zzb.get(zzhaVar);
            }
            enumMap.put(zzhaVar, bool);
        }
        return new zzhb(enumMap, this.zzc);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzha.AD_STORAGE);
    }

    public final Boolean zzg() {
        return (Boolean) this.zzb.get(zzha.ANALYTICS_STORAGE);
    }

    public final String zzi() {
        StringBuilder sb = new StringBuilder("G1");
        zzha[] zzhaVarArr = zzha.zzc;
        int length = zzhaVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVarArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean zzj(zzha zzhaVar) {
        Boolean bool = (Boolean) this.zzb.get(zzhaVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzl() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzm(zzhb zzhbVar) {
        return zzn(zzhbVar, (zzha[]) this.zzb.keySet().toArray(new zzha[0]));
    }

    public final boolean zzn(zzhb zzhbVar, zzha... zzhaVarArr) {
        for (zzha zzhaVar : zzhaVarArr) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            if (bool == Boolean.FALSE && bool2 != Boolean.FALSE) {
                return true;
            }
        }
        return false;
    }

    public zzhb(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzha.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    public final int zza() {
        return this.zzc;
    }
}
