package com.marrow.data.api.models;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/marrow/data/api/models/Success;", "T", "Lcom/marrow/data/api/models/MarrowResponse;", "p0", "<init>", "(Ljava/lang/Object;)V", "data", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Success<T> extends MarrowResponse<T> {
    private final T data;

    public Success(T t) {
        super(null);
        this.data = t;
    }

    public final T getData() {
        return this.data;
    }
}
