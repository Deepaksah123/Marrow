package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.RequestPayload;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StreamReadException extends JsonProcessingException {
    protected transient JsonParser _processor;
    public RequestPayload _requestPayload;

    public StreamReadException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation());
        this._processor = jsonParser;
    }

    public StreamReadException(JsonParser jsonParser, String str, Throwable th) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation(), th);
        this._processor = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public JsonParser getProcessor() {
        return this._processor;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(message);
        sb.append("\nRequest payload : ");
        sb.append(this._requestPayload.toString());
        return sb.toString();
    }
}
