package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonParser implements Closeable {
    public static final JacksonFeatureSet<StreamReadCapability> DEFAULT_READ_CAPABILITIES = JacksonFeatureSet.fromDefaults(StreamReadCapability.values());
    public int _features;
    protected transient RequestPayload _requestPayload;

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public abstract void clearCurrentToken();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract BigInteger getBigIntegerValue() throws IOException;

    public abstract byte[] getBinaryValue(Base64Variant base64Variant) throws IOException;

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName() throws IOException;

    public abstract JsonToken getCurrentToken();

    @Deprecated
    public abstract int getCurrentTokenId();

    public abstract BigDecimal getDecimalValue() throws IOException;

    public abstract double getDoubleValue() throws IOException;

    public Object getEmbeddedObject() throws IOException {
        return null;
    }

    public abstract float getFloatValue() throws IOException;

    public abstract int getIntValue() throws IOException;

    public abstract long getLongValue() throws IOException;

    public abstract NumberType getNumberType() throws IOException;

    public abstract Number getNumberValue() throws IOException;

    public Object getObjectId() throws IOException {
        return null;
    }

    public abstract JsonStreamContext getParsingContext();

    public abstract String getText() throws IOException;

    public abstract char[] getTextCharacters() throws IOException;

    public abstract int getTextLength() throws IOException;

    public abstract int getTextOffset() throws IOException;

    public abstract JsonLocation getTokenLocation();

    public Object getTypeId() throws IOException {
        return null;
    }

    public int getValueAsInt(int i) throws IOException {
        return i;
    }

    public long getValueAsLong(long j) throws IOException {
        return j;
    }

    public abstract String getValueAsString(String str) throws IOException;

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasToken(JsonToken jsonToken);

    public abstract boolean hasTokenId(int i);

    public boolean isNaN() throws IOException {
        return false;
    }

    public abstract JsonToken nextToken() throws IOException;

    public JsonParser overrideFormatFeatures(int i, int i2) {
        return this;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public abstract JsonParser skipChildren() throws IOException;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true),
        USE_FAST_DOUBLE_PARSER(false),
        USE_FAST_BIG_NUMBER_PARSER(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        Feature(boolean z) {
            this._defaultState = z;
        }

        public final boolean enabledByDefault() {
            return this._defaultState;
        }

        public final boolean enabledIn(int i) {
            return (this._mask & i) != 0;
        }

        public final int getMask() {
            return this._mask;
        }
    }

    public JsonParser() {
        this._features = JsonFactory.DEFAULT_PARSER_FEATURE_FLAGS;
    }

    public JsonParser(int i) {
        this._features = i;
    }

    public StreamReadConstraints streamReadConstraints() {
        return StreamReadConstraints.defaults();
    }

    public void setSchema(FormatSchema formatSchema) {
        StringBuilder sb = new StringBuilder("Parser of type ");
        sb.append(getClass().getName());
        sb.append(" does not support schema of type '");
        sb.append(formatSchema.getSchemaType());
        sb.append("'");
        throw new UnsupportedOperationException(sb.toString());
    }

    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return DEFAULT_READ_CAPABILITIES;
    }

    public void setCurrentValue(Object obj) {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.setCurrentValue(obj);
        }
    }

    public boolean isEnabled(Feature feature) {
        return feature.enabledIn(this._features);
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return streamReadFeature.mappedFeature().enabledIn(this._features);
    }

    @Deprecated
    public JsonParser setFeatureMask(int i) {
        this._features = i;
        return this;
    }

    public JsonParser overrideStdFeatures(int i, int i2) {
        return setFeatureMask((i & i2) | ((~i2) & this._features));
    }

    public String nextFieldName() throws IOException {
        if (nextToken() == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return null;
    }

    public String nextTextValue() throws IOException {
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public JsonToken currentToken() {
        return getCurrentToken();
    }

    public int currentTokenId() {
        return getCurrentTokenId();
    }

    public boolean isExpectedStartArrayToken() {
        return currentToken() == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return currentToken() == JsonToken.START_OBJECT;
    }

    public boolean isExpectedNumberIntToken() {
        return currentToken() == JsonToken.VALUE_NUMBER_INT;
    }

    public String currentName() throws IOException {
        return getCurrentName();
    }

    public Object getNumberValueDeferred() throws IOException {
        return getNumberValue();
    }

    public byte getByteValue() throws IOException {
        int intValue = getIntValue();
        if (intValue < -128 || intValue > 255) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", getText()), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) intValue;
    }

    public short getShortValue() throws IOException {
        int intValue = getIntValue();
        if (intValue < -32768 || intValue > 32767) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", getText()), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) intValue;
    }

    public boolean getBooleanValue() throws IOException {
        JsonToken jsonTokenCurrentToken = currentToken();
        if (jsonTokenCurrentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (jsonTokenCurrentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, String.format("Current token (%s) not of boolean type", jsonTokenCurrentToken)).withRequestPayload(this._requestPayload);
    }

    public byte[] getBinaryValue() throws IOException {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        _reportUnsupportedOperation();
        return 0;
    }

    public int getValueAsInt() throws IOException {
        return getValueAsInt(0);
    }

    public long getValueAsLong() throws IOException {
        return getValueAsLong(0L);
    }

    public String getValueAsString() throws IOException {
        return getValueAsString(null);
    }

    public <T extends TreeNode> T readValueAsTree() throws IOException {
        return (T) _codec().readTree(this);
    }

    protected ObjectCodec _codec() {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec;
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    protected JsonParseException _constructError(String str) {
        return new JsonParseException(this, str).withRequestPayload(this._requestPayload);
    }

    protected void _reportUnsupportedOperation() {
        StringBuilder sb = new StringBuilder("Operation not supported by parser of type ");
        sb.append(getClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }
}
