package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
final class zzo extends zzp<Void> {
    zzo(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzd(null);
        } else {
            zzc(new zzq(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    final boolean zzb() {
        return true;
    }
}
