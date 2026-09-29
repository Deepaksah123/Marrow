package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C0201setMcqCount;
import kotlin.College;
import kotlin.IntermediateLoginResponseBody;
import kotlin.SampleVideos;
import kotlin.TopUserCompanion;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca implements zzbu {
    public static final zzbv zza = new zzbv(null);
    private final TopUserCompanion zzb;
    private final zzcl zzc;
    private final zzee zzd;
    private final Map zze;
    private final Map zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcjVar, SampleVideos sampleVideos) {
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new zzbx(zzcjVar, list, this, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcjVar, SampleVideos sampleVideos) {
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new zzby(exc, zzcjVar, this, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(zzpr zzprVar, zzcj zzcjVar) throws zzae {
        zzfh zzfhVarZzb = zzfh.zzb();
        int iZza = zzcjVar.zza();
        zzdd zzddVar = (zzdd) this.zze.get(Integer.valueOf(zzprVar.zzf()));
        if (zzddVar == null) {
            throw new zzae(5, 2, null);
        }
        int iZzg = zzprVar.zzg();
        zzpq[] zzpqVarArr = (zzpq[]) zzprVar.zzj().toArray(new zzpq[0]);
        zzddVar.zza(iZzg, zzcjVar, (zzpq[]) Arrays.copyOf(zzpqVarArr, zzpqVarArr.length));
        if (iZza == zzcjVar.zza()) {
            zzcjVar.zzg(zzcjVar.zza() + 1);
        }
        zzfhVarZzb.zzf();
        long jZza = zzfhVarZzb.zza(TimeUnit.MICROSECONDS);
        int iZzk = zzprVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzv.zza(iZzk - 2, jZza);
        zzprVar.zzk();
        zzprVar.zzg();
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer(zzprVar.zzj(), null, null, null, 0, null, new zzbw(this), 31);
    }

    @Override // com.google.android.recaptcha.internal.zzbu
    public final void zza(String str) {
        C0201setMcqCount.IconCompatParcelizer(this.zzb, null, null, new zzbz(new zzcj(this.zzc), this, str, null), 3);
    }

    public zzca(TopUserCompanion topUserCompanion, zzcl zzclVar, zzee zzeeVar, Map map) {
        this.zzb = topUserCompanion;
        this.zzc = zzclVar;
        this.zzd = zzeeVar;
        this.zze = map;
        this.zzf = zzclVar.zzb().zzc();
    }
}
