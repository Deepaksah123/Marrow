package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes5.dex */
class zzgw implements zzgy {
    protected final zzgd zzt;

    zzgw(zzgd zzgdVar) {
        Preconditions.checkNotNull(zzgdVar);
        this.zzt = zzgdVar;
    }

    public void zzaz() {
        this.zzt.zzaB().zzaz();
    }

    public void zzg() {
        this.zzt.zzaB().zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzet zzaA() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzga zzaB() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Context zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Clock zzax() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzab zzay() {
        throw null;
    }
}
