package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzja implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjz zzf;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        Bundle bundle = new Bundle();
        try {
            zzjz zzjzVar = this.zzf;
            zzej zzejVar = zzjzVar.zzb;
            if (zzejVar == null) {
                zzjzVar.zzt.zzaA().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzt.zzv().zzS(this.zze, bundle);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzlk> listZzh = zzejVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            Bundle bundle2 = new Bundle();
            if (listZzh != null) {
                for (zzlk zzlkVar : listZzh) {
                    String str = zzlkVar.zze;
                    if (str != null) {
                        bundle2.putString(zzlkVar.zzb, str);
                    } else {
                        Long l = zzlkVar.zzd;
                        if (l != null) {
                            bundle2.putLong(zzlkVar.zzb, l.longValue());
                        } else {
                            Double d = zzlkVar.zzg;
                            if (d != null) {
                                bundle2.putDouble(zzlkVar.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.zzf.zzQ();
                this.zzf.zzt.zzv().zzS(this.zze, bundle2);
            } catch (RemoteException e) {
                e = e;
                bundle = bundle2;
                try {
                    this.zzf.zzt.zzaA().zzd().zzc("Failed to get user properties; remote exception", this.zza, e);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                } catch (Throwable th2) {
                    bundle2 = bundle;
                    th = th2;
                    th = th;
                    bundle = bundle2;
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                bundle = bundle2;
                this.zzf.zzt.zzv().zzS(this.zze, bundle);
                throw th;
            }
        } catch (RemoteException e2) {
            e = e2;
        } catch (Throwable th4) {
            th = th4;
            this.zzf.zzt.zzv().zzS(this.zze, bundle);
            throw th;
        }
    }

    zzja(zzjz zzjzVar, String str, String str2, zzq zzqVar, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjzVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z;
        this.zze = zzcfVar;
    }
}
