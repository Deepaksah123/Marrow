package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.getOrderDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class zzef {
    private List zza = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();

    public final long zza(long[] jArr) {
        Iterator it = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) this.zza, (Iterable) getOrderDetails.write(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = getOrderDetails.write(jArr);
    }
}
