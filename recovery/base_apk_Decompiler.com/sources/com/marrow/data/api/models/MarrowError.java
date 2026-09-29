package com.marrow.data.api.models;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/api/models/MarrowError;", "T", "Lcom/marrow/data/api/models/MarrowResponse;", "", "p0", "<init>", "(Ljava/lang/Throwable;)V", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarrowError<T> extends MarrowResponse<T> {
    private final Throwable throwable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarrowError(Throwable th) {
        super(null);
        toMagicModuleMetaRepoModel.write(th, "");
        this.throwable = th;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }
}
