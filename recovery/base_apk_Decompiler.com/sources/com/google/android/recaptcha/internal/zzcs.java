package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcs implements zzdd {
    public static final zzcs zza = new zzcs();

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        boolean z = true;
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, null);
        }
        if (objZza instanceof String) {
            try {
                try {
                    objZza = zzcjVar.zzh().zza((String) objZza);
                } catch (zzae e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw new zzae(6, 8, e2);
            }
        }
        zzck zzckVarZzc = zzcjVar.zzc();
        try {
            zzci.zza(objZza);
        } catch (zzae e3) {
            if (e3.zzb() == 8 || e3.zzb() == 6) {
                z = false;
            } else if (e3.zzb() != 47) {
                throw e3;
            }
        }
        zzckVarZzc.zzf(i, Boolean.valueOf(z));
    }

    private zzcs() {
    }
}
