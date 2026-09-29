package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.getTrackTypeForHdlr;

/* JADX INFO: loaded from: classes5.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final getTrackTypeForHdlr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new getTrackTypeForHdlr("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, kotlin.AtomContainerAtom
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.d.RemoteActionCompatParcelizer("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.c.f.a(bundle);
        if (apiExceptionA != null) {
            this.a.trySetException(apiExceptionA);
        } else {
            this.a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
