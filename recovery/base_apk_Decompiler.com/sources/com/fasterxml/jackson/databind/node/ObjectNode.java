package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    protected final Map<String, JsonNode> _children;

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode get(int i) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final boolean isObject() {
        return true;
    }

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new LinkedHashMap();
    }

    public JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingProperty());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode withArray(String str) {
        JsonPointer jsonPointer_jsonPointerIfValid = _jsonPointerIfValid(str);
        if (jsonPointer_jsonPointerIfValid != null) {
            return withArray(jsonPointer_jsonPointerIfValid);
        }
        JsonNode jsonNode = this._children.get(str);
        if (jsonNode != null) {
            if (jsonNode instanceof ArrayNode) {
                return (ArrayNode) jsonNode;
            }
            StringBuilder sb = new StringBuilder("Property '");
            sb.append(str);
            sb.append("' has value that is not of type `ArrayNode` (but `");
            sb.append(jsonNode.getClass().getName());
            sb.append("`)");
            throw new UnsupportedOperationException(sb.toString());
        }
        ArrayNode arrayNode = arrayNode();
        this._children.put(str, arrayNode);
        return arrayNode;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    protected ArrayNode _withArray(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        if (jsonPointer2.matches()) {
            return null;
        }
        JsonNode jsonNode_at = _at(jsonPointer2);
        if (jsonNode_at != null && (jsonNode_at instanceof BaseJsonNode)) {
            ArrayNode arrayNode_withArray = ((BaseJsonNode) jsonNode_at)._withArray(jsonPointer, jsonPointer2.tail(), overwriteMode, z);
            if (arrayNode_withArray != null) {
                return arrayNode_withArray;
            }
            _withXxxVerifyReplace(jsonPointer, jsonPointer2, overwriteMode, z, jsonNode_at);
        }
        return _withArrayAddTailProperty(jsonPointer2, z);
    }

    protected ArrayNode _withArrayAddTailProperty(JsonPointer jsonPointer, boolean z) {
        String matchingProperty = jsonPointer.getMatchingProperty();
        JsonPointer jsonPointerTail = jsonPointer.tail();
        if (jsonPointerTail.matches()) {
            return putArray(matchingProperty);
        }
        if (z && jsonPointerTail.mayMatchElement()) {
            return putArray(matchingProperty)._withArrayAddTailElement(jsonPointerTail, z);
        }
        return putObject(matchingProperty)._withArrayAddTailProperty(jsonPointerTail, z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int size() {
        return this._children.size();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.values().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode get(String str) {
        return this._children.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<String> fieldNames() {
        return this._children.keySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return this._children.entrySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                return entry.getValue();
            }
            JsonNode jsonNodeFindValue = entry.getValue().findValue(str);
            if (jsonNodeFindValue != null) {
                return jsonNodeFindValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (serializerProvider != null) {
            boolean zIsEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            boolean zIsEnabled2 = serializerProvider.isEnabled(JsonNodeFeature.WRITE_NULL_PROPERTIES);
            if (!zIsEnabled || !zIsEnabled2) {
                jsonGenerator.writeStartObject(this);
                serializeFilteredContents(jsonGenerator, serializerProvider, !zIsEnabled, !zIsEnabled2);
                jsonGenerator.writeEndObject();
                return;
            }
        }
        jsonGenerator.writeStartObject(this);
        for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
            JsonNode value = entry.getValue();
            jsonGenerator.writeFieldName(entry.getKey());
            value.serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        boolean z;
        boolean z2;
        if (serializerProvider != null) {
            z = !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            z2 = !serializerProvider.isEnabled(JsonNodeFeature.WRITE_NULL_PROPERTIES);
        } else {
            z = false;
            z2 = false;
        }
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_OBJECT));
        if (z || z2) {
            serializeFilteredContents(jsonGenerator, serializerProvider, z, z2);
        } else {
            for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
                JsonNode value = entry.getValue();
                jsonGenerator.writeFieldName(entry.getKey());
                value.serialize(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    protected void serializeFilteredContents(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, boolean z, boolean z2) throws IOException {
        for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                if (!z2 || !baseJsonNode.isNull()) {
                    jsonGenerator.writeFieldName(entry.getKey());
                    baseJsonNode.serialize(jsonGenerator, serializerProvider);
                }
            }
        }
    }

    public <T extends JsonNode> T set(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        this._children.put(str, jsonNode);
        return this;
    }

    public JsonNode replace(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return this._children.put(str, jsonNode);
    }

    public ArrayNode putArray(String str) {
        ArrayNode arrayNode = arrayNode();
        _put(str, arrayNode);
        return arrayNode;
    }

    public ObjectNode putObject(String str) {
        ObjectNode objectNode = objectNode();
        _put(str, objectNode);
        return objectNode;
    }

    public ObjectNode put(String str, String str2) {
        JsonNode jsonNodeTextNode;
        if (str2 == null) {
            jsonNodeTextNode = nullNode();
        } else {
            jsonNodeTextNode = textNode(str2);
        }
        return _put(str, jsonNodeTextNode);
    }

    public ObjectNode put(String str, boolean z) {
        return _put(str, booleanNode(z));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    protected boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    protected ObjectNode _put(String str, JsonNode jsonNode) {
        this._children.put(str, jsonNode);
        return this;
    }
}
