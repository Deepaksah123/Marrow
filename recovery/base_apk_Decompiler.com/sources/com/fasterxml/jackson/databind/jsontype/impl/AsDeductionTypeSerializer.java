package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class AsDeductionTypeSerializer extends TypeSerializerBase {
    private static final AsDeductionTypeSerializer INSTANCE = new AsDeductionTypeSerializer();

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public AsDeductionTypeSerializer forProperty(BeanProperty beanProperty) {
        return this;
    }

    protected AsDeductionTypeSerializer() {
        super(null, null);
    }

    public static AsDeductionTypeSerializer instance() {
        return INSTANCE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        if (!writableTypeId.valueShape.isStructStart() || jsonGenerator.canWriteTypeId()) {
            return null;
        }
        return jsonGenerator.writeTypePrefix(writableTypeId);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        if (writableTypeId == null) {
            return null;
        }
        return jsonGenerator.writeTypeSuffix(writableTypeId);
    }
}
