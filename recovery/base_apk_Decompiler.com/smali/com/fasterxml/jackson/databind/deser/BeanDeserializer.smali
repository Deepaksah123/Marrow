###### Class com.fasterxml.jackson.databind.deser.BeanDeserializer (com.fasterxml.jackson.databind.deser.BeanDeserializer)
.class public Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;
    }
.end annotation


# instance fields
.field private volatile transient _currentlyTransforming:Lcom/fasterxml/jackson/databind/util/NameTransformer;

.field protected transient _nullFromCreator:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;)V
    .registers 3

    .line 82
    iget-boolean v0, p1, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignoreAllUnknown:Z

    invoke-direct {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;)V
    .registers 3

    .line 113
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)V
    .registers 3

    .line 94
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/util/NameTransformer;)V
    .registers 3

    .line 90
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/util/NameTransformer;)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Ljava/util/Set;Ljava/util/Set;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 109
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Ljava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Z)V
    .registers 3

    .line 86
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBuilder;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;Ljava/util/Map;Ljava/util/HashSet;ZLjava/util/Set;Z)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBuilder;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            "Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;",
            ">;",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 73
    invoke-direct/range {p0 .. p8}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBuilder;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;Ljava/util/Map;Ljava/util/Set;ZLjava/util/Set;Z)V

    return-void
.end method

.method private handleUnresolvedReference(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 558
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;-><init>(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)V

    .line 559
    invoke-virtual {p4}, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->getRoid()Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->appendReferring(Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;)V

    return-object p0
.end method

.method private final vanillaDeserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 303
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingDefault(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p3

    .line 305
    invoke-virtual {p1, p3}, Lcom/fasterxml/jackson/core/JsonParser;->setCurrentValue(Ljava/lang/Object;)V

    const/4 v0, 0x5

    .line 306
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasTokenId(I)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 307
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v0

    .line 309
    :cond_14
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 310
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v1

    if-eqz v1, :cond_28

    .line 314
    :try_start_1f
    invoke-virtual {v1, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_22} :catch_23

    goto :goto_2b

    :catch_23
    move-exception v1

    .line 316
    invoke-virtual {p0, v1, p3, v0, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_2b

    .line 320
    :cond_28
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleUnknownVanilla(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    :goto_2b
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_14

    :cond_31
    return-object p3
.end method


# virtual methods
.method protected _creatorReturnedNullException()Ljava/lang/Exception;
    .registers 3

    .line 1117
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_nullFromCreator:Ljava/lang/Exception;

    if-nez v0, :cond_d

    .line 1118
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "JSON Creator returned null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_nullFromCreator:Ljava/lang/Exception;

    .line 1120
    :cond_d
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_nullFromCreator:Ljava/lang/Exception;

    return-object p0
.end method

.method public _deserializeFromArray(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 609
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_arrayDelegateDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-nez v0, :cond_84

    .line 611
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_delegateDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-nez v0, :cond_84

    .line 619
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_findCoercionFromEmptyArray(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object v0

    .line 620
    sget-object v1, Lcom/fasterxml/jackson/databind/DeserializationFeature;->UNWRAP_SINGLE_VALUE_ARRAYS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v1

    if-nez v1, :cond_18

    .line 622
    sget-object v2, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->Fail:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    if-eq v0, v2, :cond_7b

    .line 623
    :cond_18
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    .line 624
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v2, v3, :cond_4c

    .line 625
    sget-object v1, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_47

    const/4 v1, 0x2

    if-eq v0, v1, :cond_42

    const/4 v1, 0x3

    if-eq v0, v1, :cond_42

    .line 633
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v3

    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    const/4 v6, 0x0

    const/4 p0, 0x0

    new-array v7, p0, [Ljava/lang/Object;

    move-object v2, p2

    move-object v5, p1

    invoke-virtual/range {v2 .. v7}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 630
    :cond_42
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 627
    :cond_47
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->getEmptyValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4c
    if-eqz v1, :cond_7b

    .line 638
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v2, v0, :cond_6b

    .line 639
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v4

    .line 640
    sget-object v5, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 642
    invoke-static {v4}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->getTypeDescription(Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object v8

    .line 640
    const-string v7, "Cannot deserialize value of type %s from deeply-nested Array: only single wrapper allowed with `%s`"

    move-object v3, p2

    move-object v6, p1

    invoke-virtual/range {v3 .. v8}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 645
    :cond_6b
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    .line 646
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v1, v2, :cond_7a

    .line 647
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleMissingEndArrayForSingle(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    :cond_7a
    return-object v0

    .line 654
    :cond_7b
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 612
    :cond_84
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    .line 613
    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p1

    .line 612
    invoke-virtual {v1, p2, p1}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingArrayDelegate(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 614
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_injectables:[Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;

    if-eqz v0, :cond_95

    .line 615
    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->injectValues(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V

    :cond_95
    return-object p1
.end method

.method protected final _deserializeOther(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p3, :cond_48

    .line 195
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_52

    goto :goto_48

    .line 214
    :pswitch_e
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_vanillaProcessing:Z

    if-eqz v0, :cond_17

    .line 215
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->vanillaDeserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 217
    :cond_17
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_objectIdReader:Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;

    if-eqz p3, :cond_20

    .line 218
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithObjectId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 220
    :cond_20
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->deserializeFromObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 211
    :pswitch_25
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeFromArray(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 208
    :pswitch_2a
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeFromNull(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 206
    :pswitch_2f
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->deserializeFromBoolean(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 203
    :pswitch_34
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->deserializeFromEmbedded(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 201
    :pswitch_39
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->deserializeFromDouble(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 199
    :pswitch_3e
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->deserializeFromNumber(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 197
    :pswitch_43
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->deserializeFromString(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 224
    :cond_48
    :goto_48
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_52
    .packed-switch 0x1
        :pswitch_43
        :pswitch_3e
        :pswitch_39
        :pswitch_34
        :pswitch_2f
        :pswitch_2f
        :pswitch_2a
        :pswitch_25
        :pswitch_e
        :pswitch_e
    .end packed-switch
.end method

.method protected _deserializeUsingPropertyBased(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 416
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_propertyBasedCreator:Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;

    .line 417
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_objectIdReader:Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;

    invoke-virtual {v0, p1, p2, v1}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->startBuilding(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;

    move-result-object v1

    .line 419
    iget-boolean v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_needViewProcesing:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_12

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getActiveView()Ljava/lang/Class;

    move-result-object v2

    goto :goto_13

    :cond_12
    move-object v2, v3

    .line 421
    :goto_13
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v4

    move-object v5, v3

    move-object v6, v5

    .line 423
    :goto_19
    sget-object v7, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v4, v7, :cond_f5

    .line 424
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v4

    .line 425
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 426
    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->findCreatorProperty(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v7

    .line 428
    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->readIdProperty(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_32

    if-nez v7, :cond_32

    goto/16 :goto_ef

    :cond_32
    if-eqz v7, :cond_86

    if-eqz v2, :cond_41

    .line 435
    invoke-virtual {v7, v2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->visibleInView(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_41

    .line 436
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto/16 :goto_ef

    .line 439
    :cond_41
    invoke-virtual {p0, p1, p2, v7}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeWithErrorWrapping(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Ljava/lang/Object;

    move-result-object v4

    .line 440
    invoke-virtual {v1, v7, v4}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->assignParameter(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_ef

    .line 441
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 444
    :try_start_4e
    invoke-virtual {v0, p2, v1}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->build(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;

    move-result-object v0
    :try_end_52
    .catch Ljava/lang/Exception; {:try_start_4e .. :try_end_52} :catch_53

    goto :goto_58

    :catch_53
    move-exception v0

    .line 446
    invoke-virtual {p0, v0, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->wrapInstantiationProblem(Ljava/lang/Throwable;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    :goto_58
    if-nez v0, :cond_67

    .line 449
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object p1

    .line 450
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_creatorReturnedNullException()Ljava/lang/Exception;

    move-result-object p0

    .line 449
    invoke-virtual {p2, p1, v3, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleInstantiationProblem(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 453
    :cond_67
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->setCurrentValue(Ljava/lang/Object;)V

    .line 456
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_7b

    .line 457
    invoke-virtual {p0, p1, p2, v0, v5}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handlePolymorphic(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_7b
    if-eqz v5, :cond_81

    .line 460
    invoke-virtual {p0, p2, v0, v5}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleUnknownProperties(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Ljava/lang/Object;

    move-result-object v0

    .line 463
    :cond_81
    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 468
    :cond_86
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v7, v4}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v7

    if-eqz v7, :cond_ae

    .line 473
    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v8}, Lcom/fasterxml/jackson/databind/JavaType;->isRecordType()Z

    move-result v8

    if-nez v8, :cond_ae

    .line 475
    :try_start_96
    invoke-virtual {p0, p1, p2, v7}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeWithErrorWrapping(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v7, v4}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->bufferProperty(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Ljava/lang/Object;)V
    :try_end_9d
    .catch Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference; {:try_start_96 .. :try_end_9d} :catch_9e

    goto :goto_ef

    :catch_9e
    move-exception v4

    .line 480
    invoke-direct {p0, p2, v7, v1, v4}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleUnresolvedReference(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;

    move-result-object v4

    if-nez v6, :cond_aa

    .line 483
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 485
    :cond_aa
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_ef

    .line 490
    :cond_ae
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignorableProps:Ljava/util/Set;

    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_includableProps:Ljava/util/Set;

    invoke-static {v4, v7, v8}, Lcom/fasterxml/jackson/databind/util/IgnorePropertiesUtil;->shouldIgnore(Ljava/lang/Object;Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v7

    if-eqz v7, :cond_c0

    .line 491
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {p0, p1, p2, v7, v4}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleIgnoredProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_ef

    .line 495
    :cond_c0
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    if-eqz v7, :cond_db

    .line 497
    :try_start_c4
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    invoke-virtual {v8, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v7, v4, v8}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->bufferAnyProperty(Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_cf
    .catch Ljava/lang/Exception; {:try_start_c4 .. :try_end_cf} :catch_d0

    goto :goto_ef

    :catch_d0
    move-exception v7

    .line 499
    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v8}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {p0, v7, v8, v4, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_ef

    .line 507
    :cond_db
    iget-boolean v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignoreAllUnknown:Z

    if-eqz v7, :cond_e3

    .line 509
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_ef

    :cond_e3
    if-nez v5, :cond_e9

    .line 514
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferForInputBuffering(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v5

    .line 516
    :cond_e9
    invoke-virtual {v5, v4}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 517
    invoke-virtual {v5, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentStructure(Lcom/fasterxml/jackson/core/JsonParser;)V

    .line 423
    :cond_ef
    :goto_ef
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v4

    goto/16 :goto_19

    .line 523
    :cond_f5
    :try_start_f5
    invoke-virtual {v0, p2, v1}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->build(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;

    move-result-object p1
    :try_end_f9
    .catch Ljava/lang/Exception; {:try_start_f5 .. :try_end_f9} :catch_fa

    goto :goto_ff

    :catch_fa
    move-exception p1

    .line 525
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->wrapInstantiationProblem(Ljava/lang/Throwable;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-object p1, v3

    .line 529
    :goto_ff
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_injectables:[Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;

    if-eqz v0, :cond_106

    .line 530
    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->injectValues(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V

    :cond_106
    if-eqz v6, :cond_11c

    .line 534
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;

    .line 535
    invoke-virtual {v1, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->setBean(Ljava/lang/Object;)V

    goto :goto_10c

    :cond_11c
    if-eqz v5, :cond_134

    .line 540
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_12f

    .line 541
    invoke-virtual {p0, v3, p2, p1, v5}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handlePolymorphic(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 544
    :cond_12f
    invoke-virtual {p0, p2, p1, v5}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleUnknownProperties(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_134
    return-object p1
.end method

.method protected final _deserializeWithErrorWrapping(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 568
    :try_start_0
    invoke-virtual {p3, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_4} :catch_5

    return-object p0

    :catch_5
    move-exception p1

    .line 570
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, v0, p3, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method protected _deserializeWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 972
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_needViewProcesing:Z

    if-eqz v0, :cond_9

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getActiveView()Ljava/lang/Class;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    .line 973
    :goto_a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    :goto_e
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v2, :cond_6b

    .line 974
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v1

    .line 975
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    .line 976
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v3, v1}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v3

    if-eqz v3, :cond_40

    .line 979
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonToken;->isScalarValue()Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 980
    invoke-virtual {p4, p1, p2, v1, p3}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->handleTypePropertyValue(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Object;)Z

    :cond_2b
    if-eqz v0, :cond_37

    .line 982
    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->visibleInView(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_37

    .line 983
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_66

    .line 987
    :cond_37
    :try_start_37
    invoke-virtual {v3, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    :try_end_3a
    .catch Ljava/lang/Exception; {:try_start_37 .. :try_end_3a} :catch_3b

    goto :goto_66

    :catch_3b
    move-exception v2

    .line 989
    invoke-virtual {p0, v2, p3, v1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_66

    .line 994
    :cond_40
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignorableProps:Ljava/util/Set;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_includableProps:Ljava/util/Set;

    invoke-static {v1, v2, v3}, Lcom/fasterxml/jackson/databind/util/IgnorePropertiesUtil;->shouldIgnore(Ljava/lang/Object;Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_4e

    .line 995
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleIgnoredProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_66

    .line 999
    :cond_4e
    invoke-virtual {p4, p1, p2, v1, p3}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->handlePropertyValue(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_66

    .line 1003
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    if-eqz v2, :cond_63

    .line 1005
    :try_start_58
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    invoke-virtual {v2, p1, p2, p3, v1}, Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5d
    .catch Ljava/lang/Exception; {:try_start_58 .. :try_end_5d} :catch_5e

    goto :goto_66

    :catch_5e
    move-exception v2

    .line 1007
    invoke-virtual {p0, v2, p3, v1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_66

    .line 1012
    :cond_63
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->handleUnknownProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    .line 973
    :cond_66
    :goto_66
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    goto :goto_e

    .line 1015
    :cond_6b
    invoke-virtual {p4, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->complete(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected asArrayDeserializer()Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;
    .registers 3

    .line 158
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->getPropertiesInInsertionOrder()[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v0

    .line 159
    new-instance v1, Lcom/fasterxml/jackson/databind/deser/impl/BeanAsArrayDeserializer;

    invoke-direct {v1, p0, v0}, Lcom/fasterxml/jackson/databind/deser/impl/BeanAsArrayDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)V

    return-object v1
.end method

.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 175
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isExpectedStartObjectToken()Z

    move-result v0

    if-eqz v0, :cond_24

    .line 176
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_vanillaProcessing:Z

    if-eqz v0, :cond_13

    .line 177
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->vanillaDeserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 181
    :cond_13
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 182
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_objectIdReader:Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;

    if-eqz v0, :cond_1f

    .line 183
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithObjectId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 185
    :cond_1f
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->deserializeFromObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 187
    :cond_24
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeOther(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 241
    invoke-virtual {p1, p3}, Lcom/fasterxml/jackson/core/JsonParser;->setCurrentValue(Ljava/lang/Object;)V

    .line 242
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_injectables:[Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;

    if-eqz v0, :cond_a

    .line 243
    invoke-virtual {p0, p2, p3}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->injectValues(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V

    .line 245
    :cond_a
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_unwrappedPropertyHandler:Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;

    if-eqz v0, :cond_13

    .line 246
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 248
    :cond_13
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_externalTypeIdHandler:Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;

    if-eqz v0, :cond_1c

    .line 249
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 254
    :cond_1c
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isExpectedStartObjectToken()Z

    move-result v0

    if-eqz v0, :cond_29

    .line 255
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_34

    goto :goto_60

    :cond_29
    const/4 v0, 0x5

    .line 260
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasTokenId(I)Z

    move-result v0

    if-eqz v0, :cond_60

    .line 261
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v0

    .line 266
    :cond_34
    iget-boolean v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_needViewProcesing:Z

    if-eqz v1, :cond_43

    .line 267
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getActiveView()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_43

    .line 269
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithView(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 273
    :cond_43
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 274
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v1

    if-eqz v1, :cond_57

    .line 278
    :try_start_4e
    invoke-virtual {v1, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    :try_end_51
    .catch Ljava/lang/Exception; {:try_start_4e .. :try_end_51} :catch_52

    goto :goto_5a

    :catch_52
    move-exception v1

    .line 280
    invoke-virtual {p0, v1, p3, v0, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_5a

    .line 284
    :cond_57
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleUnknownVanilla(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    :goto_5a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_43

    :cond_60
    :goto_60
    return-object p3
.end method

.method protected deserializeFromNull(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 590
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->requiresCustomCodec()Z

    move-result v0

    if-eqz v0, :cond_27

    .line 592
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferForInputBuffering(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v0

    .line 593
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 594
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/util/TokenBuffer;->asParser(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p1

    .line 595
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 597
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_vanillaProcessing:Z

    if-eqz v0, :cond_1f

    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-direct {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->vanillaDeserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_23

    .line 598
    :cond_1f
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->deserializeFromObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    .line 599
    :goto_23
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->close()V

    return-object p0

    .line 602
    :cond_27
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public deserializeFromObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 339
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_objectIdReader:Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;

    const/4 v1, 0x5

    if-eqz v0, :cond_24

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_objectIdReader:Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;->maySerializeAsObject()Z

    move-result v0

    if-eqz v0, :cond_24

    .line 340
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/JsonParser;->hasTokenId(I)Z

    move-result v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_objectIdReader:Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;

    .line 341
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;->isValidReferencePropertyName(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonParser;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 342
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeFromObjectId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 345
    :cond_24
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_nonStandardCreation:Z

    if-eqz v0, :cond_3f

    .line 346
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_unwrappedPropertyHandler:Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;

    if-eqz v0, :cond_31

    .line 347
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 349
    :cond_31
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_externalTypeIdHandler:Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;

    if-eqz v0, :cond_3a

    .line 350
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 352
    :cond_3a
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeFromObjectUsingNonDefault(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 367
    :cond_3f
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingDefault(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    .line 369
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->setCurrentValue(Ljava/lang/Object;)V

    .line 370
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->canReadObjectId()Z

    move-result v2

    if-eqz v2, :cond_57

    .line 371
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getObjectId()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_57

    .line 373
    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_handleTypedObjectId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    :cond_57
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_injectables:[Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;

    if-eqz v2, :cond_5e

    .line 377
    invoke-virtual {p0, p2, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->injectValues(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V

    .line 379
    :cond_5e
    iget-boolean v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_needViewProcesing:Z

    if-eqz v2, :cond_6d

    .line 380
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getActiveView()Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_6d

    .line 382
    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithView(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 385
    :cond_6d
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/JsonParser;->hasTokenId(I)Z

    move-result v1

    if-eqz v1, :cond_94

    .line 386
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v1

    .line 388
    :cond_77
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 389
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v2

    if-eqz v2, :cond_8b

    .line 392
    :try_start_82
    invoke-virtual {v2, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    :try_end_85
    .catch Ljava/lang/Exception; {:try_start_82 .. :try_end_85} :catch_86

    goto :goto_8e

    :catch_86
    move-exception v2

    .line 394
    invoke-virtual {p0, v2, v0, v1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_8e

    .line 398
    :cond_8b
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleUnknownVanilla(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    :goto_8e
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_77

    :cond_94
    return-object v0
.end method

.method protected deserializeUsingPropertyBasedWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1023
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_externalTypeIdHandler:Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->start()Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;

    move-result-object v0

    .line 1024
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_propertyBasedCreator:Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;

    .line 1025
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_objectIdReader:Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;

    invoke-virtual {v1, p1, p2, v2}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->startBuilding(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;

    move-result-object v2

    .line 1026
    iget-boolean v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_needViewProcesing:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_18

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getActiveView()Ljava/lang/Class;

    move-result-object v3

    goto :goto_19

    :cond_18
    move-object v3, v4

    .line 1028
    :goto_19
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v5

    .line 1029
    :goto_1d
    sget-object v6, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v5, v6, :cond_d9

    .line 1030
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v5

    .line 1031
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v6

    .line 1033
    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->findCreatorProperty(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v7

    .line 1035
    invoke-virtual {v2, v5}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->readIdProperty(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_35

    if-eqz v7, :cond_d3

    :cond_35
    if-eqz v7, :cond_81

    .line 1042
    invoke-virtual {v0, p1, p2, v5, v4}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->handlePropertyValue(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d3

    .line 1047
    invoke-virtual {p0, p1, p2, v7}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeWithErrorWrapping(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Ljava/lang/Object;

    move-result-object v6

    .line 1046
    invoke-virtual {v2, v7, v6}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->assignParameter(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d3

    .line 1048
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 1051
    :try_start_4a
    invoke-virtual {v1, p2, v2}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->build(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;

    move-result-object v1
    :try_end_4e
    .catch Ljava/lang/Exception; {:try_start_4a .. :try_end_4e} :catch_76

    .line 1056
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_71

    .line 1059
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    .line 1061
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object p0

    .line 1059
    const-string v0, "Cannot create polymorphic instances with external type ids (%s -> %s)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lcom/fasterxml/jackson/databind/DatabindContext;->reportBadDefinition(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 1063
    :cond_71
    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :catch_76
    move-exception v6

    .line 1053
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v7}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {p0, v6, v7, v5, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_d3

    .line 1069
    :cond_81
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v7, v5}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v7

    if-eqz v7, :cond_a6

    .line 1072
    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/JsonToken;->isScalarValue()Z

    move-result v6

    if-eqz v6, :cond_92

    .line 1073
    invoke-virtual {v0, p1, p2, v5, v4}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->handleTypePropertyValue(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Object;)Z

    :cond_92
    if-eqz v3, :cond_9e

    .line 1076
    invoke-virtual {v7, v3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->visibleInView(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_9e

    .line 1077
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_d3

    .line 1079
    :cond_9e
    invoke-virtual {v7, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v7, v5}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->bufferProperty(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Ljava/lang/Object;)V

    goto :goto_d3

    .line 1084
    :cond_a6
    invoke-virtual {v0, p1, p2, v5, v4}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->handlePropertyValue(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d3

    .line 1088
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignorableProps:Ljava/util/Set;

    iget-object v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_includableProps:Ljava/util/Set;

    invoke-static {v5, v6, v7}, Lcom/fasterxml/jackson/databind/util/IgnorePropertiesUtil;->shouldIgnore(Ljava/lang/Object;Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v6

    if-eqz v6, :cond_be

    .line 1089
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {p0, p1, p2, v6, v5}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleIgnoredProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_d3

    .line 1093
    :cond_be
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    if-eqz v6, :cond_ce

    .line 1094
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    iget-object v7, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    .line 1095
    invoke-virtual {v7, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v7

    .line 1094
    invoke-virtual {v2, v6, v5, v7}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->bufferAnyProperty(Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_d3

    .line 1099
    :cond_ce
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->_valueClass:Ljava/lang/Class;

    invoke-virtual {p0, p1, p2, v6, v5}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->handleUnknownProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1029
    :cond_d3
    :goto_d3
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v5

    goto/16 :goto_1d

    .line 1104
    :cond_d9
    :try_start_d9
    invoke-virtual {v0, p1, p2, v2, v1}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->complete(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;)Ljava/lang/Object;

    move-result-object p0
    :try_end_dd
    .catch Ljava/lang/Exception; {:try_start_d9 .. :try_end_dd} :catch_de

    return-object p0

    :catch_de
    move-exception p1

    .line 1106
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->wrapInstantiationProblem(Ljava/lang/Throwable;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected deserializeUsingPropertyBasedWithUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 835
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_propertyBasedCreator:Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;

    .line 836
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_objectIdReader:Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;

    invoke-virtual {v0, p1, p2, v1}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->startBuilding(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;

    move-result-object v1

    .line 838
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferForInputBuffering(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v2

    .line 839
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 841
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    .line 842
    :goto_13
    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    const/4 v5, 0x0

    if-ne v3, v4, :cond_e1

    .line 843
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v3

    .line 844
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 846
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->findCreatorProperty(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v4

    .line 848
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->readIdProperty(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2b

    if-eqz v4, :cond_db

    :cond_2b
    if-eqz v4, :cond_8a

    .line 854
    invoke-virtual {p0, p1, p2, v4}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeWithErrorWrapping(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Ljava/lang/Object;

    move-result-object v3

    .line 853
    invoke-virtual {v1, v4, v3}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->assignParameter(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_db

    .line 855
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    .line 858
    :try_start_3b
    invoke-virtual {v0, p2, v1}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->build(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3f
    .catch Ljava/lang/Exception; {:try_start_3b .. :try_end_3f} :catch_40

    goto :goto_45

    :catch_40
    move-exception v0

    .line 860
    invoke-virtual {p0, v0, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->wrapInstantiationProblem(Ljava/lang/Throwable;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    .line 863
    :goto_45
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->setCurrentValue(Ljava/lang/Object;)V

    .line 865
    :goto_48
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v3, v1, :cond_54

    .line 867
    invoke-virtual {v2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentStructure(Lcom/fasterxml/jackson/core/JsonParser;)V

    .line 868
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    goto :goto_48

    .line 872
    :cond_54
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v3, v1, :cond_6b

    .line 873
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 875
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 873
    const-string v6, "Attempted to unwrap \'%s\' value"

    invoke-virtual {p2, p0, v1, v6, v3}, Lcom/fasterxml/jackson/databind/DeserializationContext;->reportWrongTokenException(Lcom/fasterxml/jackson/databind/JsonDeserializer;Lcom/fasterxml/jackson/core/JsonToken;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 877
    :cond_6b
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 878
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_83

    const/4 p0, 0x0

    .line 881
    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "Cannot create polymorphic instances with unwrapped values"

    invoke-virtual {p2, v4, p1, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->reportInputMismatch(Lcom/fasterxml/jackson/databind/BeanProperty;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    .line 885
    :cond_83
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_unwrappedPropertyHandler:Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;

    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;->processUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 890
    :cond_8a
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v4, v3}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v4

    if-eqz v4, :cond_9a

    .line 892
    invoke-virtual {p0, p1, p2, v4}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeWithErrorWrapping(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->bufferProperty(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Ljava/lang/Object;)V

    goto :goto_db

    .line 896
    :cond_9a
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignorableProps:Ljava/util/Set;

    iget-object v5, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_includableProps:Ljava/util/Set;

    invoke-static {v3, v4, v5}, Lcom/fasterxml/jackson/databind/util/IgnorePropertiesUtil;->shouldIgnore(Ljava/lang/Object;Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v4

    if-eqz v4, :cond_ac

    .line 897
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {p0, p1, p2, v4, v3}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleIgnoredProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_db

    .line 904
    :cond_ac
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    if-nez v4, :cond_b7

    .line 906
    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 907
    invoke-virtual {v2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentStructure(Lcom/fasterxml/jackson/core/JsonParser;)V

    goto :goto_db

    .line 910
    :cond_b7
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferAsCopyOfValue(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v4

    .line 911
    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 912
    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/util/TokenBuffer;->append(Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    .line 914
    :try_start_c1
    iget-object v5, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    iget-object v6, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    .line 915
    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/util/TokenBuffer;->asParserOnFirstToken()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v4

    invoke-virtual {v6, v4, p2}, Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v4

    .line 914
    invoke-virtual {v1, v5, v3, v4}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->bufferAnyProperty(Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_d0
    .catch Ljava/lang/Exception; {:try_start_c1 .. :try_end_d0} :catch_d1

    goto :goto_db

    :catch_d1
    move-exception v4

    .line 917
    iget-object v5, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p0, v4, v5, v3, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    .line 842
    :cond_db
    :goto_db
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    goto/16 :goto_13

    .line 926
    :cond_e1
    :try_start_e1
    invoke-virtual {v0, p2, v1}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;->build(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;

    move-result-object v0
    :try_end_e5
    .catch Ljava/lang/Exception; {:try_start_e1 .. :try_end_e5} :catch_ec

    .line 931
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_unwrappedPropertyHandler:Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;

    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;->processUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :catch_ec
    move-exception p1

    .line 928
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->wrapInstantiationProblem(Ljava/lang/Throwable;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    return-object v5
.end method

.method protected deserializeWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 944
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_propertyBasedCreator:Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;

    if-eqz v0, :cond_9

    .line 945
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeUsingPropertyBasedWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 947
    :cond_9
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_delegateDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-eqz v0, :cond_1a

    .line 953
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_delegateDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 954
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    .line 953
    invoke-virtual {v0, p2, p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingDelegate(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 957
    :cond_1a
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingDefault(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected deserializeWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 964
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_externalTypeIdHandler:Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;

    .line 965
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;->start()Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;

    move-result-object v0

    .line 964
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_deserializeWithExternalTypeId(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected deserializeWithUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 705
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_delegateDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-eqz v0, :cond_11

    .line 706
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_delegateDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p2, p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingDelegate(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 708
    :cond_11
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_propertyBasedCreator:Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;

    if-eqz v0, :cond_1a

    .line 709
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->deserializeUsingPropertyBasedWithUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 711
    :cond_1a
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferForInputBuffering(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v0

    .line 712
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 713
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {v1, p2}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingDefault(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v1

    .line 716
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/JsonParser;->setCurrentValue(Ljava/lang/Object;)V

    .line 718
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_injectables:[Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;

    if-eqz v2, :cond_31

    .line 719
    invoke-virtual {p0, p2, v1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->injectValues(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V

    .line 721
    :cond_31
    iget-boolean v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_needViewProcesing:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_3b

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getActiveView()Ljava/lang/Class;

    move-result-object v2

    goto :goto_3c

    :cond_3b
    move-object v2, v3

    :goto_3c
    const/4 v4, 0x5

    .line 722
    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/core/JsonParser;->hasTokenId(I)Z

    move-result v4

    if-eqz v4, :cond_47

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v3

    :cond_47
    :goto_47
    if-eqz v3, :cond_9f

    .line 725
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 726
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v4, v3}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v4

    if-eqz v4, :cond_69

    if-eqz v2, :cond_60

    .line 728
    invoke-virtual {v4, v2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->visibleInView(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_60

    .line 729
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_9a

    .line 733
    :cond_60
    :try_start_60
    invoke-virtual {v4, p1, p2, v1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    :try_end_63
    .catch Ljava/lang/Exception; {:try_start_60 .. :try_end_63} :catch_64

    goto :goto_9a

    :catch_64
    move-exception v4

    .line 735
    invoke-virtual {p0, v4, v1, v3, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_9a

    .line 740
    :cond_69
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignorableProps:Ljava/util/Set;

    iget-object v5, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_includableProps:Ljava/util/Set;

    invoke-static {v3, v4, v5}, Lcom/fasterxml/jackson/databind/util/IgnorePropertiesUtil;->shouldIgnore(Ljava/lang/Object;Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v4

    if-eqz v4, :cond_77

    .line 741
    invoke-virtual {p0, p1, p2, v1, v3}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleIgnoredProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_9a

    .line 748
    :cond_77
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    if-nez v4, :cond_82

    .line 750
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 751
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentStructure(Lcom/fasterxml/jackson/core/JsonParser;)V

    goto :goto_9a

    .line 755
    :cond_82
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferAsCopyOfValue(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v4

    .line 756
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 757
    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/util/TokenBuffer;->append(Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    .line 759
    :try_start_8c
    iget-object v5, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/util/TokenBuffer;->asParserOnFirstToken()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v4

    invoke-virtual {v5, v4, p2, v1, v3}, Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_95
    .catch Ljava/lang/Exception; {:try_start_8c .. :try_end_95} :catch_96

    goto :goto_9a

    :catch_96
    move-exception v4

    .line 761
    invoke-virtual {p0, v4, v1, v3, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    .line 724
    :goto_9a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v3

    goto :goto_47

    .line 764
    :cond_9f
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 765
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_unwrappedPropertyHandler:Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;->processUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Ljava/lang/Object;

    return-object v1
.end method

.method protected deserializeWithUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 774
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 775
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_c

    .line 776
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 778
    :cond_c
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferForInputBuffering(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v1

    .line 779
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 780
    iget-boolean v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_needViewProcesing:Z

    if-eqz v2, :cond_1c

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getActiveView()Ljava/lang/Class;

    move-result-object v2

    goto :goto_1d

    :cond_1c
    const/4 v2, 0x0

    .line 781
    :goto_1d
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v3, :cond_7b

    .line 782
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v0

    .line 783
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v3

    .line 784
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    if-eqz v3, :cond_45

    if-eqz v2, :cond_3c

    .line 786
    invoke-virtual {v3, v2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->visibleInView(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_3c

    .line 787
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_76

    .line 791
    :cond_3c
    :try_start_3c
    invoke-virtual {v3, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    :try_end_3f
    .catch Ljava/lang/Exception; {:try_start_3c .. :try_end_3f} :catch_40

    goto :goto_76

    :catch_40
    move-exception v3

    .line 793
    invoke-virtual {p0, v3, p3, v0, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_76

    .line 797
    :cond_45
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignorableProps:Ljava/util/Set;

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_includableProps:Ljava/util/Set;

    invoke-static {v0, v3, v4}, Lcom/fasterxml/jackson/databind/util/IgnorePropertiesUtil;->shouldIgnore(Ljava/lang/Object;Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v3

    if-eqz v3, :cond_53

    .line 798
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleIgnoredProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_76

    .line 805
    :cond_53
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    if-nez v3, :cond_5e

    .line 807
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 808
    invoke-virtual {v1, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentStructure(Lcom/fasterxml/jackson/core/JsonParser;)V

    goto :goto_76

    .line 811
    :cond_5e
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferAsCopyOfValue(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v3

    .line 812
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 813
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/util/TokenBuffer;->append(Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    .line 815
    :try_start_68
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/util/TokenBuffer;->asParserOnFirstToken()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v3

    invoke-virtual {v4, v3, p2, p3, v0}, Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_71
    .catch Ljava/lang/Exception; {:try_start_68 .. :try_end_71} :catch_72

    goto :goto_76

    :catch_72
    move-exception v3

    .line 817
    invoke-virtual {p0, v3, p3, v0, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    .line 781
    :goto_76
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    goto :goto_1d

    .line 822
    :cond_7b
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 823
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_unwrappedPropertyHandler:Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;

    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;->processUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/util/TokenBuffer;)Ljava/lang/Object;

    return-object p3
.end method

.method protected final deserializeWithView(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    .line 667
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasTokenId(I)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 668
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v0

    .line 670
    :cond_b
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 672
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v1

    if-eqz v1, :cond_29

    .line 674
    invoke-virtual {v1, p4}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->visibleInView(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_20

    .line 675
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_2c

    .line 679
    :cond_20
    :try_start_20
    invoke-virtual {v1, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_23} :catch_24

    goto :goto_2c

    :catch_24
    move-exception v1

    .line 681
    invoke-virtual {p0, v1, p3, v0, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->wrapAndThrow(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    goto :goto_2c

    .line 685
    :cond_29
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->handleUnknownVanilla(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    .line 686
    :goto_2c
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    :cond_32
    return-object p3
.end method

.method public unwrappingDeserializer(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/util/NameTransformer;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;

    if-ne v0, v1, :cond_1c

    .line 126
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_currentlyTransforming:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    if-ne v0, p1, :cond_d

    goto :goto_1c

    .line 129
    :cond_d
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_currentlyTransforming:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    const/4 v0, 0x0

    .line 131
    :try_start_10
    new-instance v1, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;

    invoke-direct {v1, p0, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/util/NameTransformer;)V
    :try_end_15
    .catchall {:try_start_10 .. :try_end_15} :catchall_18

    .line 132
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_currentlyTransforming:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    return-object v1

    :catchall_18
    move-exception p1

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->_currentlyTransforming:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    throw p1

    :cond_1c
    :goto_1c
    return-object p0
.end method

.method public withBeanProperties(Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;
    .registers 3

    .line 153
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;)V

    return-object v0
.end method

.method public withByNameInclusion(Ljava/util/Set;Ljava/util/Set;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;"
        }
    .end annotation

    .line 143
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method public bridge synthetic withByNameInclusion(Ljava/util/Set;Ljava/util/Set;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;
    .registers 3

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->withByNameInclusion(Ljava/util/Set;Ljava/util/Set;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;

    move-result-object p0

    return-object p0
.end method

.method public withIgnoreAllUnknown(Z)Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;
    .registers 3

    .line 148
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Z)V

    return-object v0
.end method

.method public withObjectIdReader(Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;
    .registers 3

    .line 137
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)V

    return-object v0
.end method

.method public bridge synthetic withObjectIdReader(Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;
    .registers 2

    .line 20
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;->withObjectIdReader(Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.BeanDeserializer.AnonymousClass1 (com.fasterxml.jackson.databind.deser.BeanDeserializer$1)
.class synthetic Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

.field static final synthetic $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 625
    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->values()[Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    const/4 v1, 0x1

    :try_start_a
    sget-object v2, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->AsEmpty:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_12} :catch_12

    :catch_12
    const/4 v0, 0x2

    :try_start_13
    sget-object v2, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    sget-object v3, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->AsNull:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_1d} :catch_1d

    :catch_1d
    const/4 v2, 0x3

    :try_start_1e
    sget-object v3, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction:[I

    sget-object v4, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->TryConvert:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v3, v4
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_28} :catch_28

    .line 195
    :catch_28
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonToken;->values()[Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    array-length v3, v3

    new-array v3, v3, [I

    sput-object v3, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    :try_start_31
    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v3, v4
    :try_end_39
    .catch Ljava/lang/NoSuchFieldError; {:try_start_31 .. :try_end_39} :catch_39

    :catch_39
    :try_start_39
    sget-object v1, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v1, v3
    :try_end_43
    .catch Ljava/lang/NoSuchFieldError; {:try_start_39 .. :try_end_43} :catch_43

    :catch_43
    :try_start_43
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_4d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_43 .. :try_end_4d} :catch_4d

    :catch_4d
    :try_start_4d
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_58
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4d .. :try_end_58} :catch_58

    :catch_58
    :try_start_58
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_63
    .catch Ljava/lang/NoSuchFieldError; {:try_start_58 .. :try_end_63} :catch_63

    :catch_63
    :try_start_63
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_6e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_63 .. :try_end_6e} :catch_6e

    :catch_6e
    :try_start_6e
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_79
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6e .. :try_end_79} :catch_79

    :catch_79
    :try_start_79
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_85
    .catch Ljava/lang/NoSuchFieldError; {:try_start_79 .. :try_end_85} :catch_85

    :catch_85
    :try_start_85
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_91
    .catch Ljava/lang/NoSuchFieldError; {:try_start_85 .. :try_end_91} :catch_91

    :catch_91
    :try_start_91
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xa

    aput v2, v0, v1
    :try_end_9d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_91 .. :try_end_9d} :catch_9d

    :catch_9d
    return-void
.end method

###### Class com.fasterxml.jackson.databind.deser.BeanDeserializer.BeanReferring (com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring)
.class Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;
.super Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "BeanReferring"
.end annotation


# instance fields
.field private _bean:Ljava/lang/Object;

.field private final _context:Lcom/fasterxml/jackson/databind/DeserializationContext;

.field private final _prop:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;


# direct methods
.method constructor <init>(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)V
    .registers 6

    .line 1135
    invoke-direct {p0, p2, p3}, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;-><init>(Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;Lcom/fasterxml/jackson/databind/JavaType;)V

    .line 1136
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_context:Lcom/fasterxml/jackson/databind/DeserializationContext;

    .line 1137
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_prop:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    return-void
.end method


# virtual methods
.method public handleResolvedForwardReference(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1147
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_bean:Ljava/lang/Object;

    if-nez p1, :cond_1f

    .line 1148
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_context:Lcom/fasterxml/jackson/databind/DeserializationContext;

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_prop:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    .line 1150
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_prop:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    .line 1148
    const-string v2, "Cannot resolve ObjectId forward reference using property \'%s\' (of type %s): Bean not yet resolved"

    invoke-virtual {p1, v0, v2, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->reportInputMismatch(Lcom/fasterxml/jackson/databind/BeanProperty;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1152
    :cond_1f
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_prop:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_bean:Ljava/lang/Object;

    invoke-virtual {p1, p0, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public setBean(Ljava/lang/Object;)V
    .registers 2

    .line 1141
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer$BeanReferring;->_bean:Ljava/lang/Object;

    return-void
.end method
