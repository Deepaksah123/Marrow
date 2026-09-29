package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdf implements zzdd {
    public static final zzdf zza = new zzdf();

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
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
                objZza = zzcjVar.zzh().zza((String) objZza);
            } catch (zzae e) {
                throw e;
            } catch (Exception e2) {
                throw new zzae(6, 8, e2);
            }
        }
        zzcjVar.zzc().zzf(i, zzci.zza(objZza));
    }

    private zzdf() {
    }
}
