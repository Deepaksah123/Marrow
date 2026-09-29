package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class JsonNodeFactory implements Serializable {
    public static final JsonNodeFactory instance = new JsonNodeFactory();

    @Deprecated
    private final boolean _cfgBigDecimalExact;

    public int getMaxElementIndexForInsert() {
        return 9999;
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    protected JsonNodeFactory() {
        this(false);
    }

    public boolean willStripTrailingBigDecimalZeroes() {
        return !this._cfgBigDecimalExact;
    }

    public BooleanNode booleanNode(boolean z) {
        return z ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    public JsonNode missingNode() {
        return MissingNode.getInstance();
    }

    public NumericNode numberNode(int i) {
        return IntNode.valueOf(i);
    }

    public NumericNode numberNode(long j) {
        return LongNode.valueOf(j);
    }

    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return nullNode();
        }
        return BigIntegerNode.valueOf(bigInteger);
    }

    public NumericNode numberNode(float f) {
        return FloatNode.valueOf(f);
    }

    public NumericNode numberNode(double d) {
        return DoubleNode.valueOf(d);
    }

    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return nullNode();
        }
        return DecimalNode.valueOf(bigDecimal);
    }

    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }

    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode rawValueNode(RawValue rawValue) {
        return new POJONode(rawValue);
    }
}
