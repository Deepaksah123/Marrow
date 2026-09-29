package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DatabindException extends JsonProcessingException {
    public abstract void prependPath(Object obj, String str);

    protected DatabindException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    public DatabindException(String str) {
        super(str);
    }

    protected DatabindException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public DatabindException(String str, Throwable th) {
        this(str, null, th);
    }
}
