package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: loaded from: classes4.dex */
public interface JsonObjectFormatVisitor extends JsonFormatVisitorWithSerializerProvider {
    void optionalProperty(BeanProperty beanProperty) throws JsonMappingException;

    void property(BeanProperty beanProperty) throws JsonMappingException;
}
