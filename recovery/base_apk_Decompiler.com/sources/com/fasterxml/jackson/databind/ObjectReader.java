package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectReader extends ObjectCodec implements Serializable {
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders = null;
    private final TokenFilter _filter = null;
    protected final InjectableValues _injectableValues;
    protected transient JavaType _jsonNodeType;
    protected final JsonFactory _parserFactory;
    protected final JsonDeserializer<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    protected ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
    }

    protected JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, this._schema);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != null) {
            return jsonTokenCurrentToken;
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken == null) {
            deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        }
        return jsonTokenNextToken;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._config.initialize(this._parserFactory.createParser(reader), this._schema);
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr), this._schema);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return _bindAsTreeOrNull(jsonParser);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return (T) _bindAndClose(_considerFilter(createParser(reader), false));
    }

    public <T> T readValue(byte[] bArr) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, 0, bArr.length);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr), false));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    protected Object _bind(JsonParser jsonParser, Object obj) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            }
        } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
            obj = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), this._valueToUpdate);
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
        }
        return obj;
    }

    protected Object _bindAndClose(JsonParser jsonParser) throws IOException {
        Object rootValue;
        try {
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                rootValue = this._valueToUpdate;
                if (rootValue == null) {
                    rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
                }
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                rootValue = this._valueToUpdate;
            } else {
                rootValue = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), this._valueToUpdate);
            }
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return rootValue;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    protected final JsonNode _bindAsTreeOrNull(JsonParser jsonParser) throws IOException {
        JsonNode jsonNodeNullNode;
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (JsonNode) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null && (jsonTokenCurrentToken = jsonParser.nextToken()) == null) {
            return null;
        }
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
            jsonNodeNullNode = this._config.getNodeFactory().nullNode();
        } else {
            jsonNodeNullNode = (JsonNode) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext), null);
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return jsonNodeNullNode;
    }

    protected JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        return (this._filter == null || FilteringParserDelegate.class.isInstance(jsonParser)) ? jsonParser : new FilteringParserDelegate(jsonParser, this._filter, TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z);
    }

    protected final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            Class<?> clsRawClass = ClassUtil.rawClass(javaType);
            if (clsRawClass == null && (obj = this._valueToUpdate) != null) {
                clsRawClass = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(clsRawClass, jsonParser, jsonTokenNextToken);
        }
    }

    protected Object _detectBindAndClose(byte[] bArr, int i, int i2) throws IOException {
        DataFormatReaders.Match matchFindFormat = this._dataFormatReaders.findFormat(bArr, i, i2);
        if (!matchFindFormat.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, matchFindFormat);
        }
        return matchFindFormat.getReader()._bindAndClose(matchFindFormat.createParserWithMatch());
    }

    protected void _reportUnkownFormat(DataFormatReaders dataFormatReaders, DataFormatReaders.Match match) throws IOException {
        StringBuilder sb = new StringBuilder("Cannot detect format from input, does not look like any of detectable formats ");
        sb.append(dataFormatReaders.toString());
        throw new JsonParseException(null, sb.toString());
    }

    protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    protected DefaultDeserializationContext createDummyDeserializationContext() {
        return this._context.createDummyInstance(this._config);
    }

    protected void _reportUndetectableSource(Object obj) throws StreamReadException {
        StringBuilder sb = new StringBuilder("Cannot use source of type ");
        sb.append(obj.getClass().getName());
        sb.append(" with format auto-detection: must be byte- not char-based");
        throw new JsonParseException(null, sb.toString());
    }

    protected JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        JsonDeserializer<Object> jsonDeserializer2 = this._rootDeserializers.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type ".concat(String.valueOf(javaType)));
        }
        this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected JsonDeserializer<Object> _findTreeDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        JavaType javaType_jsonNodeType = _jsonNodeType();
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this._rootDeserializers.get(javaType_jsonNodeType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType_jsonNodeType);
            if (jsonDeserializerFindRootValueDeserializer == null) {
                deserializationContext.reportBadDefinition(javaType_jsonNodeType, "Cannot find a deserializer for type ".concat(String.valueOf(javaType_jsonNodeType)));
            }
            this._rootDeserializers.put(javaType_jsonNodeType, jsonDeserializerFindRootValueDeserializer);
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            try {
                jsonDeserializerFindRootValueDeserializer = createDummyDeserializationContext().findRootValueDeserializer(javaType);
                if (jsonDeserializerFindRootValueDeserializer != null) {
                    this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
                }
            } catch (JacksonException unused) {
            }
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected final JavaType _jsonNodeType() {
        JavaType javaType = this._jsonNodeType;
        if (javaType != null) {
            return javaType;
        }
        JavaType javaTypeConstructType = getTypeFactory().constructType(JsonNode.class);
        this._jsonNodeType = javaTypeConstructType;
        return javaTypeConstructType;
    }

    protected final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
