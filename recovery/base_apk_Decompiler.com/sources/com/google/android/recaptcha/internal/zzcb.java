package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;
import kotlin.IntermediateLoginResponseBody;
import kotlin.TestGroupLSModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcb {
    public static final zzcb zza = new zzcb();
    private static Set zzb;
    private static Set zzc;
    private static Long zzd;
    private static int zze;

    public static final void zza(zznz zznzVar) {
        zzb = IntermediateLoginResponseBody.onPlayFromUri(zznzVar.zzf().zzi());
        zzc = IntermediateLoginResponseBody.onPlayFromUri(zznzVar.zzg().zzi());
    }

    public static final boolean zzb(String str) {
        Set set = zzb;
        if (set == null || zzc == null) {
            if (zzd == null) {
                zzd = Long.valueOf(System.currentTimeMillis());
            }
            zze++;
            return true;
        }
        toMagicModuleMetaRepoModel.read(set, "");
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = zzc;
        toMagicModuleMetaRepoModel.read(set2, "");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }

    private static final boolean zzc(String str, Set set) {
        Iterator it = TestGroupLSModel.IconCompatParcelizer(str, new char[]{'.'}, false, 0).iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    private zzcb() {
    }
}
