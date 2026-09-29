package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzig extends zzif {
    @Override // com.google.android.recaptcha.internal.zzif
    final int zza(Map.Entry entry) {
        return ((zziq) entry.getKey()).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final zzij zzb(Object obj) {
        return ((zzip) obj).zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final zzij zzc(Object obj) {
        return ((zzip) obj).zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final Object zzd(zzie zzieVar, zzke zzkeVar, int i) {
        return zzieVar.zza(zzkeVar, i);
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final Object zze(Object obj, zzkq zzkqVar, Object obj2, zzie zzieVar, zzij zzijVar, Object obj3, zzll zzllVar) throws IOException {
        Object objZze;
        zzir zzirVar = (zzir) obj2;
        zzmb zzmbVar = zzirVar.zzb.zzb;
        Object objZzk = null;
        if (zzmbVar == zzmb.ENUM) {
            zzkqVar.zzg();
            throw null;
        }
        switch (zzmbVar) {
            case DOUBLE:
                objZzk = Double.valueOf(zzkqVar.zza());
                break;
            case FLOAT:
                objZzk = Float.valueOf(zzkqVar.zzb());
                break;
            case INT64:
                objZzk = Long.valueOf(zzkqVar.zzl());
                break;
            case UINT64:
                objZzk = Long.valueOf(zzkqVar.zzo());
                break;
            case INT32:
                objZzk = Integer.valueOf(zzkqVar.zzg());
                break;
            case FIXED64:
                objZzk = Long.valueOf(zzkqVar.zzk());
                break;
            case FIXED32:
                objZzk = Integer.valueOf(zzkqVar.zzf());
                break;
            case BOOL:
                objZzk = Boolean.valueOf(zzkqVar.zzN());
                break;
            case STRING:
                objZzk = zzkqVar.zzr();
                break;
            case GROUP:
                Object objZze2 = zzijVar.zze(zzirVar.zzb);
                if (!(objZze2 instanceof zzit)) {
                    throw null;
                }
                zzkr zzkrVarZzb = zzkn.zza().zzb(objZze2.getClass());
                if (!((zzit) objZze2).zzG()) {
                    Object objZze3 = zzkrVarZzb.zze();
                    zzkrVarZzb.zzg(objZze3, objZze2);
                    zzijVar.zzi(zzirVar.zzb, objZze3);
                    objZze2 = objZze3;
                }
                zzkqVar.zzt(objZze2, zzkrVarZzb, zzieVar);
                return obj3;
            case MESSAGE:
                Object objZze4 = zzijVar.zze(zzirVar.zzb);
                if (!(objZze4 instanceof zzit)) {
                    throw null;
                }
                zzkr zzkrVarZzb2 = zzkn.zza().zzb(objZze4.getClass());
                if (!((zzit) objZze4).zzG()) {
                    Object objZze5 = zzkrVarZzb2.zze();
                    zzkrVarZzb2.zzg(objZze5, objZze4);
                    zzijVar.zzi(zzirVar.zzb, objZze5);
                    objZze4 = objZze5;
                }
                zzkqVar.zzu(objZze4, zzkrVarZzb2, zzieVar);
                return obj3;
            case BYTES:
                objZzk = zzkqVar.zzp();
                break;
            case UINT32:
                objZzk = Integer.valueOf(zzkqVar.zzj());
                break;
            case ENUM:
                throw new IllegalStateException("Shouldn't reach here.");
            case SFIXED32:
                objZzk = Integer.valueOf(zzkqVar.zzh());
                break;
            case SFIXED64:
                objZzk = Long.valueOf(zzkqVar.zzm());
                break;
            case SINT32:
                objZzk = Integer.valueOf(zzkqVar.zzi());
                break;
            case SINT64:
                objZzk = Long.valueOf(zzkqVar.zzn());
                break;
        }
        int iOrdinal = zzirVar.zzb.zzb.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objZze = zzijVar.zze(zzirVar.zzb)) != null) {
            objZzk = ((zzke) objZze).zzX().zzc((zzke) objZzk).zzk();
        }
        zzijVar.zzi(zzirVar.zzb, objZzk);
        return obj3;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final void zzf(Object obj) {
        ((zzip) obj).zzb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final void zzg(zzkq zzkqVar, Object obj, zzie zzieVar, zzij zzijVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final void zzh(zzgw zzgwVar, Object obj, zzie zzieVar, zzij zzijVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final void zzi(zzmd zzmdVar, Map.Entry entry) throws IOException {
        zziq zziqVar = (zziq) entry.getKey();
        switch (zziqVar.zzb) {
            case DOUBLE:
                zzmdVar.zzf(zziqVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case FLOAT:
                zzmdVar.zzo(zziqVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case INT64:
                zzmdVar.zzt(zziqVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case UINT64:
                zzmdVar.zzK(zziqVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case INT32:
                zzmdVar.zzr(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case FIXED64:
                zzmdVar.zzm(zziqVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case FIXED32:
                zzmdVar.zzk(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case BOOL:
                zzmdVar.zzb(zziqVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case STRING:
                zzmdVar.zzG(zziqVar.zza, (String) entry.getValue());
                break;
            case GROUP:
                zzmdVar.zzq(zziqVar.zza, entry.getValue(), zzkn.zza().zzb(entry.getValue().getClass()));
                break;
            case MESSAGE:
                zzmdVar.zzv(zziqVar.zza, entry.getValue(), zzkn.zza().zzb(entry.getValue().getClass()));
                break;
            case BYTES:
                zzmdVar.zzd(zziqVar.zza, (zzgw) entry.getValue());
                break;
            case UINT32:
                zzmdVar.zzI(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case ENUM:
                zzmdVar.zzr(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case SFIXED32:
                zzmdVar.zzx(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case SFIXED64:
                zzmdVar.zzz(zziqVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case SINT32:
                zzmdVar.zzB(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case SINT64:
                zzmdVar.zzD(zziqVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    zzig() {
    }

    @Override // com.google.android.recaptcha.internal.zzif
    final boolean zzj(zzke zzkeVar) {
        return zzkeVar instanceof zzip;
    }
}
