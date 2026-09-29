package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.IntentSenderRequest;
import kotlin.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

/* JADX INFO: loaded from: classes5.dex */
final class zac implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 zac;
    final /* synthetic */ GoogleApiAvailability zad;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.read(new IntentSenderRequest.RemoteActionCompatParcelizer(errorResolutionPendingIntent.getIntentSender()).RemoteActionCompatParcelizer());
    }

    zac(GoogleApiAvailability googleApiAvailability, Activity activity, int i, r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 r8lambdaibk6u1hk7j3awkl_wn934v2uvi8) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = i;
        this.zac = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8;
    }
}
