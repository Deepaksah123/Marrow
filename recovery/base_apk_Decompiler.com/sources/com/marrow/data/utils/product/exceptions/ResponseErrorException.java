package com.marrow.data.utils.product.exceptions;

import com.marrow.data.models.ResponseError;

/* JADX INFO: loaded from: classes.dex */
public class ResponseErrorException extends RuntimeException {
    ResponseError error;

    public ResponseErrorException(ResponseError responseError) {
        super(responseError != null ? responseError.toString() : "");
        this.error = responseError;
    }

    public ResponseErrorException(ResponseError responseError, Throwable th) {
        super(responseError != null ? responseError.toString() : "", th);
        this.error = responseError;
    }

    public ResponseError getError() {
        return this.error;
    }
}
