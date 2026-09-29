package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.IndexSeeker;
import kotlin.evaluate;

/* JADX INFO: loaded from: classes5.dex */
final class at {
    private final evaluate a;
    private final evaluate b;

    at(evaluate evaluateVar, evaluate evaluateVar2) {
        this.a = evaluateVar;
        this.b = evaluateVar2;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, IndexSeeker indexSeeker) {
        return new as((Context) this.a.a(), (k) this.b.a(), activity, taskCompletionSource, indexSeeker);
    }
}
