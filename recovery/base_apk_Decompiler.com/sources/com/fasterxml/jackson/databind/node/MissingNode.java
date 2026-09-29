package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class MissingNode extends ValueNode {
    private static final MissingNode instance = new MissingNode();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    protected MissingNode() {
    }

    protected final Object readResolve() {
        return instance;
    }

    public static MissingNode getInstance() {
        return instance;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode
    public final JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String asText() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNull();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.writeNull();
    }

    public final int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public final String toString() {
        return "";
    }
}
