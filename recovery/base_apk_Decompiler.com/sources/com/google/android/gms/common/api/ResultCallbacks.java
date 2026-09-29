package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        Status status = r.getStatus();
        if (status.isSuccess()) {
            onSuccess(r);
            return;
        }
        onFailure(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).release();
            } catch (RuntimeException unused) {
            }
        }
    }

    public abstract void onSuccess(R r);
}
