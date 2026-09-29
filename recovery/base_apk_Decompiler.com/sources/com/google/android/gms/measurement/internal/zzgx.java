package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzgx extends zzgw {
    private boolean zza;

    zzgx(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    protected void zzaC() {
    }

    protected abstract boolean zzf();

    protected final void zzv() {
        if (!zzy()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzt.zzB();
        this.zza = true;
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzaC();
        this.zzt.zzB();
        this.zza = true;
    }

    final boolean zzy() {
        return this.zza;
    }
}
