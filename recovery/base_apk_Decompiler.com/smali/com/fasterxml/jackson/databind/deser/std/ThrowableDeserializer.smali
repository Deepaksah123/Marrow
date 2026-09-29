###### Class com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer (com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer)
.class public Lcom/fasterxml/jackson/databind/deser/std/ThrowableDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 34
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;)V

    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_vanillaProcessing:Z

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;Lcom/fasterxml/jackson/databind/util/NameTransformer;)V
    .registers 3

    .line 58
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;Lcom/fasterxml/jackson/databind/util/NameTransformer;)V

    return-void
.end method

.method public static construct(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;)Lcom/fasterxml/jackson/databind/deser/std/ThrowableDeserializer;
    .registers 2

    .line 50
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/ThrowableDeserializer;

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/ThrowableDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;)V

    return-object p0
.end method


# virtual methods
.method public deserializeFromObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_propertyBasedCreator:Lcom/fasterxml/jackson/databind/deser/impl/PropertyBasedCreator;

    if-eqz v0, :cond_9

    .line 83
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/ThrowableDeserializer;->_deserializeUsingPropertyBased(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 85
    :cond_9
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_delegateDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-eqz v0, :cond_1a

    .line 86
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_delegateDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 87
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    .line 86
    invoke-virtual {v0, p2, p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingDelegate(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 89
    :cond_1a
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->isAbstract()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_36

    .line 90
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueInstantiator()Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    move-result-object v4

    const-string v6, "abstract type (need to add/enable type information?)"

    new-array v7, v1, [Ljava/lang/Object;

    move-object v2, p2

    move-object v5, p1

    invoke-virtual/range {v2 .. v7}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 93
    :cond_36
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateFromString()Z

    move-result v0

    .line 94
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateUsingDefault()Z

    move-result v2

    if-nez v0, :cond_59

    if-nez v2, :cond_59

    .line 97
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueInstantiator()Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    move-result-object v5

    const-string v7, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator"

    new-array v8, v1, [Ljava/lang/Object;

    move-object v3, p2

    move-object v6, p1

    invoke-virtual/range {v3 .. v8}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_59
    const/4 v2, 0x0

    move v5, v1

    move-object v3, v2

    move-object v4, v3

    move-object v6, v4

    .line 106
    :goto_5e
    sget-object v7, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v7}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v7

    if-nez v7, :cond_eb

    .line 107
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v7

    .line 108
    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v8, v7}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->find(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v8

    .line 109
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    if-eqz v8, :cond_95

    if-eqz v3, :cond_7c

    .line 113
    invoke-virtual {v8, p1, p2, v3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V

    goto/16 :goto_e6

    :cond_7c
    if-nez v4, :cond_87

    .line 118
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_beanProperties:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;

    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;->size()I

    move-result v4

    add-int/2addr v4, v4

    .line 119
    new-array v4, v4, [Ljava/lang/Object;

    .line 121
    :cond_87
    aput-object v8, v4, v5

    add-int/lit8 v7, v5, 0x2

    add-int/lit8 v5, v5, 0x1

    .line 122
    invoke-virtual {v8, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v8

    aput-object v8, v4, v5

    move v5, v7

    goto :goto_e6

    .line 131
    :cond_95
    const-string v8, "message"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_ac

    if-eqz v0, :cond_ac

    .line 133
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getValueAsString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, p2, v7}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createFromString(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Throwable;

    goto :goto_e6

    .line 140
    :cond_ac
    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignorableProps:Ljava/util/Set;

    if-eqz v8, :cond_bc

    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_ignorableProps:Ljava/util/Set;

    invoke-interface {v8, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_bc

    .line 141
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_e6

    .line 144
    :cond_bc
    const-string v8, "suppressed"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_cd

    .line 145
    const-class v6, [Ljava/lang/Throwable;

    invoke-virtual {p2, p1, v6}, Lcom/fasterxml/jackson/databind/DeserializationContext;->readValue(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/lang/Throwable;

    goto :goto_e6

    .line 148
    :cond_cd
    const-string v8, "localizedMessage"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_d9

    .line 149
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_e6

    .line 152
    :cond_d9
    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    if-eqz v8, :cond_e3

    .line 153
    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_anySetter:Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;

    invoke-virtual {v8, p1, p2, v3, v7}, Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_e6

    .line 161
    :cond_e3
    invoke-virtual {p0, p1, p2, v3, v7}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->handleUnknownProperty(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    :goto_e6
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_5e

    :cond_eb
    if-nez v3, :cond_102

    if-eqz v0, :cond_f9

    .line 172
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {p0, p2, v2}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createFromString(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/lang/Throwable;

    goto :goto_102

    .line 174
    :cond_f9
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase;->_valueInstantiator:Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createUsingDefault(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/lang/Throwable;

    :cond_102
    :goto_102
    if-eqz v4, :cond_115

    move p0, v1

    :goto_105
    if-ge p0, v5, :cond_115

    .line 181
    aget-object p1, v4, p0

    check-cast p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    add-int/lit8 p2, p0, 0x1

    .line 182
    aget-object p2, v4, p2

    invoke-virtual {p1, v3, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 p0, p0, 0x2

    goto :goto_105

    :cond_115
    if-eqz v6, :cond_122

    .line 188
    array-length p0, v6

    :goto_118
    if-ge v1, p0, :cond_122

    aget-object p1, v6, v1

    .line 189
    invoke-virtual {v3, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_118

    :cond_122
    return-object v3
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

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/fasterxml/jackson/databind/deser/std/ThrowableDeserializer;

    if-eq v0, v1, :cond_9

    return-object p0

    .line 69
    :cond_9
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/ThrowableDeserializer;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/ThrowableDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/BeanDeserializer;Lcom/fasterxml/jackson/databind/util/NameTransformer;)V

    return-object v0
.end method
