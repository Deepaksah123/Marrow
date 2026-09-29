package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ArrayNode extends ContainerNode<ArrayNode> implements Serializable {
    private final List<JsonNode> _children;

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode get(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isArray() {
        return true;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    public JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingIndex());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode withArray(String str) {
        JsonPointer jsonPointer_jsonPointerIfValid = _jsonPointerIfValid(str);
        if (jsonPointer_jsonPointerIfValid != null) {
            return withArray(jsonPointer_jsonPointerIfValid);
        }
        return (ArrayNode) super.withArray(str);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    protected ArrayNode _withArray(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        if (jsonPointer2.matches()) {
            return this;
        }
        JsonNode jsonNode_at = _at(jsonPointer2);
        if (jsonNode_at != null && (jsonNode_at instanceof BaseJsonNode)) {
            ArrayNode arrayNode_withArray = ((BaseJsonNode) jsonNode_at)._withArray(jsonPointer, jsonPointer2.tail(), overwriteMode, z);
            if (arrayNode_withArray != null) {
                return arrayNode_withArray;
            }
            _withXxxVerifyReplace(jsonPointer, jsonPointer2, overwriteMode, z, jsonNode_at);
        }
        return _withArrayAddTailElement(jsonPointer2, z);
    }

    protected ArrayNode _withArrayAddTailElement(JsonPointer jsonPointer, boolean z) {
        int matchingIndex = jsonPointer.getMatchingIndex();
        if (matchingIndex < 0) {
            return null;
        }
        JsonPointer jsonPointerTail = jsonPointer.tail();
        if (jsonPointerTail.matches()) {
            ArrayNode arrayNode = arrayNode();
            _withXxxSetArrayElement(matchingIndex, arrayNode);
            return arrayNode;
        }
        if (z && jsonPointerTail.mayMatchElement()) {
            ArrayNode arrayNode2 = arrayNode();
            _withXxxSetArrayElement(matchingIndex, arrayNode2);
            return arrayNode2._withArrayAddTailElement(jsonPointerTail, z);
        }
        ArrayNode arrayNode3 = arrayNode();
        _withXxxSetArrayElement(matchingIndex, arrayNode3);
        return arrayNode3._withArrayAddTailElement(jsonPointerTail, z);
    }

    protected void _withXxxSetArrayElement(int i, JsonNode jsonNode) {
        if (i >= size()) {
            int maxElementIndexForInsert = this._nodeFactory.getMaxElementIndexForInsert();
            if (i > maxElementIndexForInsert) {
                _reportWrongNodeOperation("Too big Array index (%d; max %d) to use for insert with `JsonPointer`", Integer.valueOf(i), Integer.valueOf(maxElementIndexForInsert));
            }
            while (i >= size()) {
                addNull();
            }
        }
        set(i, jsonNode);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int size() {
        return this._children.size();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode get(int i) {
        if (i < 0 || i >= this._children.size()) {
            return null;
        }
        return this._children.get(i);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<JsonNode> list = this._children;
        int size = list.size();
        jsonGenerator.writeStartArray(this, size);
        for (int i = 0; i < size; i++) {
            list.get(i).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindValue = it.next().findValue(str);
            if (jsonNodeFindValue != null) {
                return jsonNodeFindValue;
            }
        }
        return null;
    }

    public JsonNode set(int i, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        if (i < 0 || i >= this._children.size()) {
            StringBuilder sb = new StringBuilder("Illegal index ");
            sb.append(i);
            sb.append(", array size ");
            sb.append(size());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this._children.set(i, jsonNode);
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode addNull() {
        return _add(nullNode());
    }

    public ArrayNode add(String str) {
        return _add(str == null ? nullNode() : textNode(str));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    protected ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }
}
