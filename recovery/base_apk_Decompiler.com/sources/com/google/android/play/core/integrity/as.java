package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.IndexSeeker;
import kotlin.assertInTrackEntry;
import kotlin.canApplyEditWithGaplessInfo;
import kotlin.getTrackTypeForHdlr;

/* JADX INFO: loaded from: classes5.dex */
final class as extends canApplyEditWithGaplessInfo {
    final TaskCompletionSource a;
    final IndexSeeker b;
    private final getTrackTypeForHdlr c = new getTrackTypeForHdlr("RequestDialogCallbackImpl");
    private final String d;
    private final k e;
    private final Activity f;

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, IndexSeeker indexSeeker) {
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = indexSeeker;
    }

    @Override // kotlin.maybeSkipRemainingMetaAtomHeaderBytes
    public final void b(Bundle bundle) {
        this.b.AudioAttributesCompatParcelizer(this.a);
        this.c.RemoteActionCompatParcelizer("onRequestDialog(%s)", this.d);
        ApiException apiExceptionA = this.e.a(bundle);
        if (apiExceptionA != null) {
            this.a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.c.read("onRequestDialog(%s): got null dialog intent", this.d);
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) assertInTrackEntry.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.write()));
        this.c.write("Starting dialog intent...", new Object[0]);
        this.f.startActivityForResult(intent, 0);
    }
}
