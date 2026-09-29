package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import kotlin.AtomLeafAtom;
import kotlin.getTrackTypeForHdlr;

/* JADX INFO: loaded from: classes5.dex */
final class ai extends AtomLeafAtom {
    final /* synthetic */ aj a;
    private final getTrackTypeForHdlr b = new getTrackTypeForHdlr("OnRequestIntegrityTokenCallback");
    private final TaskCompletionSource c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.a = ajVar;
        this.c = taskCompletionSource;
    }

    @Override // kotlin.canTrimSamplesWithTimestampChange
    public final void b(Bundle bundle) {
        this.a.a.AudioAttributesCompatParcelizer(this.c);
        this.b.RemoteActionCompatParcelizer("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.a.f.a(bundle);
        if (apiExceptionA != null) {
            this.c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString(LoggedUserResponse.KEY_TOKEN);
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.a.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
