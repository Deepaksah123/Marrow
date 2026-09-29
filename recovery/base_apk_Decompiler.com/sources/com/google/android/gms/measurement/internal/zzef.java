package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzef {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzec zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    private volatile Object zzg = null;
    private volatile Object zzh = null;

    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzf
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.zzab r4 = com.google.android.gms.measurement.internal.zzed.zza
            if (r4 != 0) goto Le
            java.lang.Object r3 = r3.zzd
            return r3
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzef.zza
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzab.zza()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.zzh     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L1e
            java.lang.Object r3 = r3.zzd     // Catch: java.lang.Throwable -> L6b
            goto L20
        L1e:
            java.lang.Object r3 = r3.zzh     // Catch: java.lang.Throwable -> L6b
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            return r3
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            java.util.List r4 = com.google.android.gms.measurement.internal.zzeg.zzb()     // Catch: java.lang.SecurityException -> L59
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L59
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L59
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L59
            com.google.android.gms.measurement.internal.zzef r0 = (com.google.android.gms.measurement.internal.zzef) r0     // Catch: java.lang.SecurityException -> L59
            boolean r1 = com.google.android.gms.measurement.internal.zzab.zza()     // Catch: java.lang.SecurityException -> L59
            if (r1 != 0) goto L51
            com.google.android.gms.measurement.internal.zzec r1 = r0.zzc     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L59
            if (r1 == 0) goto L46
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L59
            goto L47
        L46:
            r1 = 0
        L47:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzef.zza     // Catch: java.lang.SecurityException -> L59
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L59
            r0.zzh = r1     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            goto L2b
        L4e:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.SecurityException -> L59
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L59
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L59
            throw r4     // Catch: java.lang.SecurityException -> L59
        L59:
            com.google.android.gms.measurement.internal.zzec r4 = r3.zzc
            if (r4 != 0) goto L60
            java.lang.Object r3 = r3.zzd
            return r3
        L60:
            java.lang.Object r3 = r4.zza()     // Catch: java.lang.IllegalStateException -> L65 java.lang.SecurityException -> L68
            return r3
        L65:
            java.lang.Object r3 = r3.zzd
            return r3
        L68:
            java.lang.Object r3 = r3.zzd
            return r3
        L6b:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            throw r3
        L6e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzef.zza(java.lang.Object):java.lang.Object");
    }

    /* synthetic */ zzef(String str, Object obj, Object obj2, zzec zzecVar, zzee zzeeVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzecVar;
    }

    public final String zzb() {
        return this.zzb;
    }
}
