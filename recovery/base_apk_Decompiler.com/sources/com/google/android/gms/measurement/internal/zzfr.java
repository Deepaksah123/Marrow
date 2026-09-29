package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import kotlin.ActionMenuViewLayoutParams;

/* JADX INFO: loaded from: classes5.dex */
final class zzfr extends ActionMenuViewLayoutParams {
    final /* synthetic */ zzfu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfr(zzfu zzfuVar, int i) {
        super(20);
        this.zza = zzfuVar;
    }

    @Override // kotlin.ActionMenuViewLayoutParams
    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfu.zzd(this.zza, str);
    }
}
