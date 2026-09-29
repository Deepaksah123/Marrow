package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.IntermediateLoginResponseBody;
import kotlin.setCustomerEmail;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeg implements zzee {
    private final zzef zza;
    private final zzed zzb;

    private final zzpf zzb(String str, List list) throws zzae {
        if (str.length() == 0) {
            throw new zzae(3, 17, null);
        }
        try {
            zzec zzecVar = new zzec(this.zza.zza(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Collection<Long>) list)), 255L, zzec.zzb);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) setCustomerEmail.read(setCustomerEmail.read(str.charAt(i)) ^ setCustomerEmail.read((int) zzecVar.zza())));
            }
            return zzpf.zzg(zzfy.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            throw new zzae(3, 18, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzee
    public final zzpf zza(zzpn zzpnVar) throws zzae {
        zzfh zzfhVarZzb = zzfh.zzb();
        zzpf zzpfVarZzb = zzb(zzpnVar.zzi(), zzpnVar.zzj());
        zzfhVarZzb.zzf();
        zzv.zza(zzx.zzm.zza(), zzfhVarZzb.zza(TimeUnit.MICROSECONDS));
        return zzpfVarZzb;
    }

    public zzeg(zzef zzefVar, zzed zzedVar) {
        this.zza = zzefVar;
        this.zzb = zzedVar;
    }
}
