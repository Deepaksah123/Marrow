package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes5.dex */
final class zzhz implements zzlo {
    final /* synthetic */ zzik zza;

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzD(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle);
        } else {
            this.zza.zzF(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle, str);
        }
    }

    zzhz(zzik zzikVar) {
        this.zza = zzikVar;
    }
}
