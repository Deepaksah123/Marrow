package com.fasterxml.jackson.core;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class JacksonException extends IOException {
    public abstract JsonLocation getLocation();

    public abstract String getOriginalMessage();

    public abstract Object getProcessor();

    public JacksonException(String str) {
        super(str);
    }

    public JacksonException(String str, Throwable th) {
        super(str, th);
    }
}
