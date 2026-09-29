package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes3.dex */
final class zan extends zabw {
    final /* synthetic */ Dialog zaa;
    final /* synthetic */ zao zab;

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zap.zag(this.zab.zaa);
        if (this.zaa.isShowing()) {
            this.zaa.dismiss();
        }
    }

    zan(zao zaoVar, Dialog dialog) {
        this.zab = zaoVar;
        this.zaa = dialog;
    }
}
