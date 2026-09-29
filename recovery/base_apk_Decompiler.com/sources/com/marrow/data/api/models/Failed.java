package com.marrow.data.api.models;

import com.marrow.data.models.ResponseError;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/marrow/data/api/models/Failed;", "T", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/models/ResponseError;", "p0", "<init>", "(Lcom/marrow/data/models/ResponseError;)V", "", "(I)V", "", "p1", "(ILjava/lang/String;)V", "error", "Lcom/marrow/data/models/ResponseError;", "getError", "()Lcom/marrow/data/models/ResponseError;", "getErrorCode", "()I", "errorCode"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Failed<T> extends MarrowResponse<T> {
    private final ResponseError error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Failed(ResponseError responseError) {
        super(null);
        toMagicModuleMetaRepoModel.write(responseError, "");
        this.error = responseError;
    }

    public final ResponseError getError() {
        return this.error;
    }

    public Failed(int i) {
        this(new ResponseError(i, "", false, 4, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Failed(int i, String str) {
        this(new ResponseError(i, str, false, 4, null));
        toMagicModuleMetaRepoModel.write(str, "");
    }

    public final int getErrorCode() {
        return this.error.getErrorCode();
    }
}
