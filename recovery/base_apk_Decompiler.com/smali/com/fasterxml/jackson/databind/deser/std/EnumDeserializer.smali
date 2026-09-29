###### Class com.fasterxml.jackson.databind.deser.std.EnumDeserializer (com.fasterxml.jackson.databind.deser.std.EnumDeserializer)
.class public Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JacksonStdImpl;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer<",
        "Ljava/lang/Object;",
        ">;",
        "Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;"
    }
.end annotation


# instance fields
.field protected final _caseInsensitive:Ljava/lang/Boolean;

.field private final _enumDefaultValue:Ljava/lang/Enum;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Enum<",
            "*>;"
        }
    .end annotation
.end field

.field protected _enumsByIndex:[Ljava/lang/Object;

.field protected final _isFromIntValue:Z

.field protected final _lookupByEnumNaming:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

.field protected final _lookupByName:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

.field protected volatile _lookupByToString:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

.field private _useDefaultValueForUnknownEnum:Ljava/lang/Boolean;

.field private _useNullForUnknownEnum:Ljava/lang/Boolean;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .registers 6

    .line 106
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer;)V

    .line 107
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByName:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByName:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    .line 108
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumsByIndex:[Ljava/lang/Object;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumsByIndex:[Ljava/lang/Object;

    .line 109
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumDefaultValue:Ljava/lang/Enum;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumDefaultValue:Ljava/lang/Enum;

    .line 110
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_caseInsensitive:Ljava/lang/Boolean;

    .line 111
    iget-boolean p2, p1, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_isFromIntValue:Z

    iput-boolean p2, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_isFromIntValue:Z

    .line 112
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_useDefaultValueForUnknownEnum:Ljava/lang/Boolean;

    .line 113
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_useNullForUnknownEnum:Ljava/lang/Boolean;

    .line 114
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByEnumNaming:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByEnumNaming:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/util/EnumResolver;ZLcom/fasterxml/jackson/databind/util/EnumResolver;)V
    .registers 5

    .line 91
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->getEnumClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer;-><init>(Ljava/lang/Class;)V

    .line 92
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->constructLookup()Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByName:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    .line 93
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->getRawEnums()[Ljava/lang/Enum;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumsByIndex:[Ljava/lang/Object;

    .line 94
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->getDefaultValue()Ljava/lang/Enum;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumDefaultValue:Ljava/lang/Enum;

    .line 95
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_caseInsensitive:Ljava/lang/Boolean;

    .line 96
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->isFromIntValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_isFromIntValue:Z

    if-nez p3, :cond_29

    const/4 p1, 0x0

    goto :goto_2d

    .line 97
    :cond_29
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->constructLookup()Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    move-result-object p1

    :goto_2d
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByEnumNaming:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    return-void
.end method

.method private final _deserializeAltString(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;Ljava/lang/String;)Ljava/lang/Object;
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 350
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 351
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_58

    .line 354
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->useDefaultValueForUnknownEnum(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 355
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumDefaultValue:Ljava/lang/Enum;

    return-object p0

    .line 357
    :cond_14
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->useNullForUnknownEnum(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z

    move-result p1

    if-eqz p1, :cond_1b

    return-object v1

    .line 362
    :cond_1b
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_33

    .line 363
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_findCoercionFromEmptyString(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object v4

    .line 364
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v5

    const-string v7, "empty String (\"\")"

    move-object v2, p0

    move-object v3, p2

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_checkCoercionFail(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/cfg/CoercionAction;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p1

    goto :goto_44

    .line 367
    :cond_33
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_findCoercionFromBlankString(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object v4

    .line 368
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v5

    const-string v7, "blank String (all whitespace)"

    move-object v2, p0

    move-object v3, p2

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_checkCoercionFail(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/cfg/CoercionAction;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p1

    .line 371
    :goto_44
    sget-object p3, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x2

    if-eq p1, p3, :cond_53

    const/4 p3, 0x3

    if-eq p1, p3, :cond_53

    return-object v1

    .line 374
    :cond_53
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->getEmptyValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 382
    :cond_58
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_caseInsensitive:Ljava/lang/Boolean;

    invoke-virtual {p4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_69

    .line 383
    invoke-virtual {p3, p1}, Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;->findCaseInsensitive(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p4

    if-eqz p4, :cond_69

    return-object p4

    .line 388
    :cond_69
    sget-object p4, Lcom/fasterxml/jackson/databind/DeserializationFeature;->FAIL_ON_NUMBERS_FOR_ENUMS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, p4}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p4

    if-nez p4, :cond_a5

    iget-boolean p4, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_isFromIntValue:Z

    if-nez p4, :cond_a5

    const/4 p4, 0x0

    .line 391
    invoke-virtual {p1, p4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x30

    if-lt v0, v2, :cond_a5

    const/16 v2, 0x39

    if-gt v0, v2, :cond_a5

    .line 394
    :try_start_82
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 395
    sget-object v2, Lcom/fasterxml/jackson/databind/MapperFeature;->ALLOW_COERCION_OF_SCALARS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v2

    if-nez v2, :cond_9b

    .line 396
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use"

    new-array p4, p4, [Ljava/lang/Object;

    invoke-virtual {p2, v0, p1, v2, p4}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdStringValue(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_9b
    if-ltz v0, :cond_a5

    .line 400
    iget-object p4, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumsByIndex:[Ljava/lang/Object;

    array-length v2, p4

    if-ge v0, v2, :cond_a5

    .line 401
    aget-object p0, p4, v0
    :try_end_a4
    .catch Ljava/lang/NumberFormatException; {:try_start_82 .. :try_end_a4} :catch_a5

    return-object p0

    .line 409
    :catch_a5
    :cond_a5
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->useDefaultValueForUnknownEnum(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z

    move-result p4

    if-eqz p4, :cond_ae

    .line 410
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumDefaultValue:Ljava/lang/Enum;

    return-object p0

    .line 412
    :cond_ae
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->useNullForUnknownEnum(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z

    move-result p4

    if-eqz p4, :cond_b5

    return-object v1

    .line 415
    :cond_b5
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumClass()Ljava/lang/Class;

    move-result-object p0

    .line 416
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;->keys()Ljava/util/List;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    .line 415
    const-string p4, "not one of the values accepted for Enum class: %s"

    invoke-virtual {p2, p0, p1, p4, p3}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdStringValue(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private _resolveCurrentLookup(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;
    .registers 3

    .line 289
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByEnumNaming:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    if-eqz v0, :cond_5

    return-object v0

    .line 292
    :cond_5
    sget-object v0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->READ_ENUMS_USING_TO_STRING:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 293
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_getToStringLookup(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    move-result-object p0

    return-object p0

    :cond_12
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByName:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    return-object p0
.end method

.method public static deserializerForCreator(Lcom/fasterxml/jackson/databind/DeserializationConfig;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationConfig;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            "Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;",
            "[",
            "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .line 155
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->canOverrideAccessModifiers()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 156
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getMember()Ljava/lang/reflect/Method;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->OVERRIDE_PUBLIC_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    .line 157
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    .line 156
    invoke-static {v0, p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->checkAndFixAccess(Ljava/lang/reflect/Member;Z)V

    .line 160
    :cond_13
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/FactoryBasedEnumDeserializer;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterType(I)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/deser/std/FactoryBasedEnumDeserializer;-><init>(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)V

    return-object p0
.end method

.method public static deserializerForNoArgsCreator(Lcom/fasterxml/jackson/databind/DeserializationConfig;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationConfig;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .line 175
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->canOverrideAccessModifiers()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 176
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getMember()Ljava/lang/reflect/Method;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->OVERRIDE_PUBLIC_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    .line 177
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    .line 176
    invoke-static {v0, p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->checkAndFixAccess(Ljava/lang/reflect/Member;Z)V

    .line 179
    :cond_13
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/FactoryBasedEnumDeserializer;

    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/FactoryBasedEnumDeserializer;-><init>(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)V

    return-object p0
.end method


# virtual methods
.method protected _deserializeOther(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 422
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 423
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_deserializeFromArray(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 425
    :cond_d
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected _enumClass()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 429
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method protected _fromInteger(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;I)Ljava/lang/Object;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 301
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->logicalType()Lcom/fasterxml/jackson/databind/type/LogicalType;

    move-result-object p1

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->Integer:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    invoke-virtual {p2, p1, v0, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findCoercionAction(Lcom/fasterxml/jackson/databind/type/LogicalType;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p1

    .line 305
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->Fail:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    if-ne p1, v0, :cond_4d

    .line 306
    sget-object v0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->FAIL_ON_NUMBERS_FOR_ENUMS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 307
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    const-string v0, "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow"

    invoke-virtual {p2, p0, p1, v0, p3}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdNumberValue(Ljava/lang/Class;Ljava/lang/Number;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 312
    :cond_2c
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Integer value ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    move-object v2, p0

    move-object v3, p2

    move-object v4, p1

    invoke-virtual/range {v2 .. v7}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_checkCoercionFail(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/cfg/CoercionAction;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    .line 315
    :cond_4d
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_96

    const/4 v2, 0x2

    if-eq p1, v2, :cond_91

    if-ltz p3, :cond_66

    .line 323
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumsByIndex:[Ljava/lang/Object;

    array-length v2, p1

    if-ge p3, v2, :cond_66

    .line 324
    aget-object p0, p1, p3

    return-object p0

    .line 326
    :cond_66
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->useDefaultValueForUnknownEnum(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z

    move-result p1

    if-eqz p1, :cond_6f

    .line 327
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumDefaultValue:Ljava/lang/Enum;

    return-object p0

    .line 329
    :cond_6f
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->useNullForUnknownEnum(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z

    move-result p1

    if-nez p1, :cond_90

    .line 330
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumClass()Ljava/lang/Class;

    move-result-object p1

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumsByIndex:[Ljava/lang/Object;

    array-length p0, p0

    sub-int/2addr p0, v1

    .line 332
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 330
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const-string v0, "index value outside legal index range [0..%s]"

    invoke-virtual {p2, p1, p3, v0, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdNumberValue(Ljava/lang/Class;Ljava/lang/Number;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_90
    return-object v0

    .line 319
    :cond_91
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->getEmptyValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_96
    return-object v0
.end method

.method protected _fromString(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 274
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_resolveCurrentLookup(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    move-result-object v0

    .line 275
    invoke-virtual {v0, p3}, Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;->find(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    .line 277
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    if-eq v1, p3, :cond_17

    .line 278
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;->find(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_17

    return-object p3

    .line 279
    :cond_17
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_deserializeAltString(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1c
    return-object v1
.end method

.method protected _getToStringLookup(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;
    .registers 3

    .line 433
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByToString:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    if-nez v0, :cond_20

    .line 435
    monitor-enter p0

    .line 436
    :try_start_5
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByToString:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    if-nez v0, :cond_1b

    .line 438
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object p1

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->constructUsingToString(Lcom/fasterxml/jackson/databind/DeserializationConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/util/EnumResolver;

    move-result-object p1

    .line 439
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->constructLookup()Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;

    move-result-object v0

    .line 440
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_lookupByToString:Lcom/fasterxml/jackson/databind/util/CompactStringObjectMap;
    :try_end_1b
    .catchall {:try_start_5 .. :try_end_1b} :catchall_1d

    .line 442
    :cond_1b
    monitor-exit p0

    return-object v0

    :catchall_1d
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_20
    return-object v0
.end method

.method public createContextual(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 209
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;->ACCEPT_CASE_INSENSITIVE_PROPERTIES:Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->findFormatFeature(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;Ljava/lang/Class;Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_caseInsensitive:Ljava/lang/Boolean;

    .line 210
    invoke-virtual {v0, v1}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 211
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;->READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE:Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;

    invoke-virtual {p0, p1, p2, v1, v2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->findFormatFeature(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;Ljava/lang/Class;Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_useDefaultValueForUnknownEnum:Ljava/lang/Boolean;

    .line 212
    invoke-virtual {v1, v2}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    .line 213
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;->READ_UNKNOWN_ENUM_VALUES_AS_NULL:Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;

    invoke-virtual {p0, p1, p2, v2, v3}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->findFormatFeature(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;Ljava/lang/Class;Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    iget-object p2, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_useNullForUnknownEnum:Ljava/lang/Boolean;

    .line 214
    invoke-virtual {p1, p2}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    .line 215
    invoke-virtual {p0, v0, v1, p1}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->withResolved(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;

    move-result-object p0

    return-object p0
.end method

.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 247
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 248
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_fromString(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 252
    :cond_11
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 255
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_isFromIntValue:Z

    if-eqz v0, :cond_26

    .line 258
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_fromString(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 260
    :cond_26
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getIntValue()I

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_fromInteger(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 263
    :cond_2f
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isExpectedStartObjectToken()Z

    move-result v0

    if-eqz v0, :cond_40

    .line 264
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->_valueClass:Ljava/lang/Class;

    .line 265
    invoke-virtual {p2, p1, p0, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->extractScalarFromObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/JsonDeserializer;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 264
    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_fromString(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 267
    :cond_40
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_deserializeOther(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getEmptyValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 238
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumDefaultValue:Ljava/lang/Enum;

    return-object p0
.end method

.method public isCachable()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public logicalType()Lcom/fasterxml/jackson/databind/type/LogicalType;
    .registers 1

    .line 233
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Enum:Lcom/fasterxml/jackson/databind/type/LogicalType;

    return-object p0
.end method

.method protected useDefaultValueForUnknownEnum(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z
    .registers 3

    .line 455
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_enumDefaultValue:Ljava/lang/Enum;

    if-eqz v0, :cond_18

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_useDefaultValueForUnknownEnum:Ljava/lang/Boolean;

    .line 456
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    .line 457
    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-eqz p0, :cond_18

    :cond_16
    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method protected useNullForUnknownEnum(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z
    .registers 3

    .line 449
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_useNullForUnknownEnum:Ljava/lang/Boolean;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->READ_UNKNOWN_ENUM_VALUES_AS_NULL:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    .line 450
    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-nez p0, :cond_14

    const/4 p0, 0x0

    return p0

    :cond_14
    const/4 p0, 0x1

    return p0
.end method

.method public withResolved(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;
    .registers 5

    .line 187
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_caseInsensitive:Ljava/lang/Boolean;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_useDefaultValueForUnknownEnum:Ljava/lang/Boolean;

    .line 188
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;->_useNullForUnknownEnum:Ljava/lang/Boolean;

    .line 189
    invoke-static {v0, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    return-object p0

    .line 192
    :cond_19
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.EnumDeserializer.AnonymousClass1 (com.fasterxml.jackson.databind.deser.std.EnumDeserializer$1)
.class synthetic Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 315
    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->values()[Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    :try_start_9
    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->AsNull:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->AsEmpty:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1d
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/EnumDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->TryConvert:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_28} :catch_28

    :catch_28
    return-void
.end method
