###### Class com.fasterxml.jackson.databind.deser.ValueInstantiator (com.fasterxml.jackson.databind.deser.ValueInstantiator)
.class public abstract Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/ValueInstantiator$Base;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canCreateFromBigDecimal()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateFromBigInteger()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateFromBoolean()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateFromDouble()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateFromInt()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateFromLong()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateFromObjectWith()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateFromString()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateUsingArrayDelegate()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canCreateUsingDefault()Z
    .registers 1

    .line 172
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getDefaultCreator()Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;

    move-result-object p0

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public canCreateUsingDelegate()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canInstantiate()Z
    .registers 2

    .line 114
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateUsingDefault()Z

    move-result v0

    if-nez v0, :cond_38

    .line 115
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateUsingDelegate()Z

    move-result v0

    if-nez v0, :cond_38

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateUsingArrayDelegate()Z

    move-result v0

    if-nez v0, :cond_38

    .line 116
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateFromObjectWith()Z

    move-result v0

    if-nez v0, :cond_38

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateFromString()Z

    move-result v0

    if-nez v0, :cond_38

    .line 117
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateFromInt()Z

    move-result v0

    if-nez v0, :cond_38

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateFromLong()Z

    move-result v0

    if-nez v0, :cond_38

    .line 118
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateFromDouble()Z

    move-result v0

    if-nez v0, :cond_38

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->canCreateFromBoolean()Z

    move-result p0

    if-nez p0, :cond_38

    const/4 p0, 0x0

    return p0

    :cond_38
    const/4 p0, 0x1

    return p0
.end method

.method public createContextual(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    return-object p0
.end method

.method public createFromBigDecimal(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/math/BigDecimal;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 364
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v3, 0x0

    const-string v4, "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)"

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createFromBigInteger(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/math/BigInteger;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 350
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v3, 0x0

    const-string v4, "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)"

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createFromBoolean(Lcom/fasterxml/jackson/databind/DeserializationContext;Z)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 371
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    .line 373
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v3, 0x0

    .line 371
    const-string v4, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)"

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createFromDouble(Lcom/fasterxml/jackson/databind/DeserializationContext;D)Ljava/lang/Object;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 357
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    .line 359
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v3, 0x0

    .line 357
    const-string v4, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)"

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createFromInt(Lcom/fasterxml/jackson/databind/DeserializationContext;I)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 337
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    .line 339
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v3, 0x0

    .line 337
    const-string v4, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)"

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createFromLong(Lcom/fasterxml/jackson/databind/DeserializationContext;J)Ljava/lang/Object;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 343
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    .line 345
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v3, 0x0

    .line 343
    const-string v4, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)"

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createFromObjectWith(Lcom/fasterxml/jackson/databind/DeserializationContext;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 301
    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->getParameters([Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createFromObjectWith(Lcom/fasterxml/jackson/databind/DeserializationContext;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createFromObjectWith(Lcom/fasterxml/jackson/databind/DeserializationContext;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 262
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x0

    const-string v4, "no creator with arguments specified"

    const/4 p2, 0x0

    new-array v5, p2, [Ljava/lang/Object;

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createFromString(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 330
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getParser()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v3

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v5

    const-string v4, "no String-argument constructor/factory method to deserialize from String value (\'%s\')"

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createUsingArrayDelegate(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 318
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x0

    const-string v4, "no array delegate creator specified"

    const/4 p2, 0x0

    new-array v5, p2, [Ljava/lang/Object;

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createUsingDefault(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 248
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x0

    const-string v4, "no default no-arguments constructor found"

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/Object;

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createUsingDefaultOrWithoutArguments(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 275
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x0

    const-string v4, "neither default (no-arguments) nor with-arguments Creator found"

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/Object;

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public createUsingDelegate(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 309
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x0

    const-string v4, "no delegate creator specified"

    const/4 p2, 0x0

    new-array v5, p2, [Ljava/lang/Object;

    move-object v0, p1

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleMissingInstantiator(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getArrayDelegateCreator()Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public getArrayDelegateType(Lcom/fasterxml/jackson/databind/DeserializationConfig;)Lcom/fasterxml/jackson/databind/JavaType;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public getDefaultCreator()Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public getDelegateCreator()Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public getDelegateType(Lcom/fasterxml/jackson/databind/DeserializationConfig;)Lcom/fasterxml/jackson/databind/JavaType;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public getFromObjectArguments(Lcom/fasterxml/jackson/databind/DeserializationConfig;)[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public getValueClass()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 93
    const-class p0, Ljava/lang/Object;

    return-object p0
.end method

.method public getValueTypeDesc()Ljava/lang/String;
    .registers 1

    .line 101
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_9

    .line 103
    const-string p0, "UNKNOWN"

    return-object p0

    .line 105
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.ValueInstantiator.Base (com.fasterxml.jackson.databind.deser.ValueInstantiator$Base)
.class public Lcom/fasterxml/jackson/databind/deser/ValueInstantiator$Base;
.super Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Base"
.end annotation


# instance fields
.field protected final _valueType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/JavaType;)V
    .registers 2

    .line 490
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;-><init>()V

    .line 491
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator$Base;->_valueType:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 486
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;-><init>()V

    .line 487
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator$Base;->_valueType:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public getValueClass()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 501
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator$Base;->_valueType:Ljava/lang/Class;

    return-object p0
.end method

.method public getValueTypeDesc()Ljava/lang/String;
    .registers 1

    .line 496
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator$Base;->_valueType:Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
