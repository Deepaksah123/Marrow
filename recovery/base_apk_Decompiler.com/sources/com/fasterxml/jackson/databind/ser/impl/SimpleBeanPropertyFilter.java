package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleBeanPropertyFilter implements BeanPropertyFilter, PropertyFilter {
    protected boolean include(BeanPropertyWriter beanPropertyWriter) {
        return true;
    }

    protected boolean include(PropertyWriter propertyWriter) {
        return true;
    }

    protected SimpleBeanPropertyFilter() {
    }

    public static PropertyFilter from(final BeanPropertyFilter beanPropertyFilter) {
        return new PropertyFilter() { // from class: com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.1
            @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
            public final void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
                beanPropertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, (BeanPropertyWriter) propertyWriter);
            }

            @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
            public final void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
                beanPropertyFilter.depositSchemaProperty((BeanPropertyWriter) propertyWriter, objectNode, serializerProvider);
            }

            @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
            public final void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
                beanPropertyFilter.depositSchemaProperty((BeanPropertyWriter) propertyWriter, jsonObjectFormatVisitor, serializerProvider);
            }
        };
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, BeanPropertyWriter beanPropertyWriter) throws Exception {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
        } else {
            if (jsonGenerator.canOmitFields()) {
                return;
            }
            beanPropertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(objectNode, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
        if (include(propertyWriter)) {
            propertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
        } else {
            if (jsonGenerator.canOmitFields()) {
                return;
            }
            propertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    @Deprecated
    public void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(objectNode, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    public void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }
}
