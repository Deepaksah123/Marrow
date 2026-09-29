package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ObjectMapper extends ObjectCodec implements Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    protected final CoercionConfigs _coercionConfigs;
    protected final ConfigOverrides _configOverrides;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected InjectableValues _injectableValues;
    public final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected SerializerFactory _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected SubtypeResolver _subtypeResolver;
    protected TypeFactory _typeFactory;

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings(null, jacksonAnnotationIntrospector, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), null, Base64Variants.getDefaultVariant(), LaissezFaireSubTypeValidator.instance, new DefaultAccessorNamingStrategy.Provider());
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings baseSettingsWithClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        CoercionConfigs coercionConfigs = new CoercionConfigs();
        this._coercionConfigs = coercionConfigs;
        this._serializationConfig = new SerializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, DatatypeFeatures.defaultFeatures());
        this._deserializationConfig = new DeserializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, coercionConfigs, DatatypeFeatures.defaultFeatures());
        boolean zRequiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        if (this._serializationConfig.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY) ^ zRequiresPropertyOrdering) {
            configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, zRequiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    protected ClassIntrospector defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    protected ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, formatSchema, injectableValues);
    }

    protected ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    protected ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        return new ObjectWriter(this, serializationConfig, javaType, prettyPrinter);
    }

    public ObjectMapper registerModule(Module module) {
        Object typeId;
        _assertNotNull("module", module);
        if (module.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (module.version() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator<? extends Module> it = module.getDependencies().iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = module.getTypeId()) != null) {
            if (this._registeredModuleTypes == null) {
                this._registeredModuleTypes = new LinkedHashSet();
            }
            if (!this._registeredModuleTypes.add(typeId)) {
                return this;
            }
        }
        module.setupModule(new Module.SetupContext() { // from class: com.fasterxml.jackson.databind.ObjectMapper.1
            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(MapperFeature mapperFeature) {
                return ObjectMapper.this.isEnabled(mapperFeature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(DeserializationFeature deserializationFeature) {
                return ObjectMapper.this.isEnabled(deserializationFeature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addDeserializers(Deserializers deserializers) {
                DeserializerFactory deserializerFactoryWithAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(deserializers);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAdditionalDeserializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addKeyDeserializers(KeyDeserializers keyDeserializers) {
                DeserializerFactory deserializerFactoryWithAdditionalKeyDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalKeyDeserializers(keyDeserializers);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAdditionalKeyDeserializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
                DeserializerFactory deserializerFactoryWithDeserializerModifier = ObjectMapper.this._deserializationContext._factory.withDeserializerModifier(beanDeserializerModifier);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithDeserializerModifier);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addSerializers(Serializers serializers) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(serializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addKeySerializers(Serializers serializers) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(serializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
                DeserializerFactory deserializerFactoryWithAbstractTypeResolver = ObjectMapper.this._deserializationContext._factory.withAbstractTypeResolver(abstractTypeResolver);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAbstractTypeResolver);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addValueInstantiators(ValueInstantiators valueInstantiators) {
                DeserializerFactory deserializerFactoryWithValueInstantiators = ObjectMapper.this._deserializationContext._factory.withValueInstantiators(valueInstantiators);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithValueInstantiators);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationConfig = objectMapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
                ObjectMapper objectMapper2 = ObjectMapper.this;
                objectMapper2._serializationConfig = objectMapper2._serializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationConfig = objectMapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
                ObjectMapper objectMapper2 = ObjectMapper.this;
                objectMapper2._serializationConfig = objectMapper2._serializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void registerSubtypes(NamedType... namedTypeArr) {
                ObjectMapper.this.registerSubtypes(namedTypeArr);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
                ObjectMapper.this.addMixIn(cls, cls2);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
                ObjectMapper.this.setPropertyNamingStrategy(propertyNamingStrategy);
            }
        });
        return this;
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(outputStream, jsonEncoding);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(writer);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    public SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public JavaType constructType(Type type) {
        _assertNotNull("t", type);
        return this._typeFactory.constructType(type);
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    @Deprecated
    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(mapperFeature) : this._serializationConfig.without(mapperFeature);
        this._deserializationConfig = z ? this._deserializationConfig.with(mapperFeature) : this._deserializationConfig.without(mapperFeature);
        return this;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.currentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        JsonNode jsonNode = (JsonNode) _readValue(deserializationConfig, jsonParser, constructType(JsonNode.class));
        return jsonNode == null ? getNodeFactory().nullNode() : jsonNode;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.getPrettyPrinter() == null) {
            jsonGenerator.setPrettyPrinter(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseableValue(jsonGenerator, obj, serializationConfig);
            return;
        }
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public <T> T readValue(String str, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.constructType(cls));
    }

    public <T> T readValue(String str, TypeReference<T> typeReference) throws JsonProcessingException {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(String str, JavaType javaType) throws JsonProcessingException {
        _assertNotNull("content", str);
        try {
            return (T) _readMapAndClose(this._jsonFactory.createParser(str), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator(segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        try {
            ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(this._jsonFactory._getBufferRecycler());
            try {
                _writeValueAndClose(createGenerator(byteArrayBuilder, JsonEncoding.UTF8), obj);
                byte[] byteArray = byteArrayBuilder.toByteArray();
                byteArrayBuilder.release();
                byteArrayBuilder.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayBuilder.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null, null, this._injectableValues);
    }

    protected DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    protected final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseable(jsonGenerator, obj, serializationConfig);
            return;
        }
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            jsonGenerator.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, e);
        }
    }

    private final void _writeCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
        } catch (Exception e) {
            e = e;
        }
        try {
            closeable.close();
            jsonGenerator.close();
        } catch (Exception e2) {
            e = e2;
            closeable = null;
            ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
        }
    }

    private final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE(null, closeable, e);
        }
    }

    protected Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
        } else {
            rootValue = (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) ? null : defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), null);
        }
        jsonParser.clearCurrentToken();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
        }
        return rootValue;
    }

    protected Object _readMapAndClose(JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        try {
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                rootValue = null;
            } else {
                rootValue = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), null);
                defaultDeserializationContextCreateDeserializationContext.checkUnresolvedObjectId();
            }
            if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
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

    protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    protected JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) throws IOException {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != null) {
            return jsonTokenCurrentToken;
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            return jsonTokenNextToken;
        }
        throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
    }

    protected final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            deserializationContext.reportTrailingTokens(ClassUtil.rawClass(javaType), jsonParser, jsonTokenNextToken);
        }
    }

    protected JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws DatabindException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type ".concat(String.valueOf(javaType)));
        }
        this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
