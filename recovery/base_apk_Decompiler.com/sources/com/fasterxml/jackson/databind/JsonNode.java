package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonNode extends JsonSerializable.Base implements TreeNode, Iterable<JsonNode> {

    /* JADX INFO: loaded from: classes4.dex */
    public enum OverwriteMode {
        NONE,
        NULLS,
        SCALARS,
        ALL
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public double asDouble(double d) {
        return d;
    }

    public int asInt(int i) {
        return i;
    }

    public long asLong(long j) {
        return j;
    }

    public abstract String asText();

    public boolean booleanValue() {
        return false;
    }

    public double doubleValue() {
        return 0.0d;
    }

    public abstract JsonNode findValue(String str);

    public abstract JsonNode get(int i);

    public JsonNode get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public long longValue() {
        return 0L;
    }

    public int size() {
        return 0;
    }

    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        return nodeType == JsonNodeType.OBJECT || nodeType == JsonNodeType.ARRAY;
    }

    public Iterator<String> fieldNames() {
        return ClassUtil.emptyIterator();
    }

    public final boolean isTextual() {
        return getNodeType() == JsonNodeType.STRING;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0L);
    }

    public double asDouble() {
        return asDouble(0.0d);
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public boolean has(String str) {
        return get(str) != null;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return ClassUtil.emptyIterator();
    }

    public <T extends JsonNode> T withArray(String str) {
        StringBuilder sb = new StringBuilder("`JsonNode` not of type `ObjectNode` (but `");
        sb.append(getClass().getName());
        sb.append(")`, cannot call `withArray()` on it");
        throw new UnsupportedOperationException(sb.toString());
    }

    public final ArrayNode withArray(JsonPointer jsonPointer) {
        return withArray(jsonPointer, OverwriteMode.NULLS, true);
    }

    public ArrayNode withArray(JsonPointer jsonPointer, OverwriteMode overwriteMode, boolean z) {
        StringBuilder sb = new StringBuilder("`withArray(JsonPointer)` not implemented by ");
        sb.append(getClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }
}
