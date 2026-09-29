package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: loaded from: classes2.dex */
public interface NullValueProvider {
    Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;

    default Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }
}
