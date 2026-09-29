###### Class com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer (com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)
.class public Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer<",
        "Lcom/fasterxml/jackson/databind/JsonNode;",
        ">;"
    }
.end annotation


# static fields
.field private static final instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 33
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;->instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;

    return-void
.end method

.method protected constructor <init>()V
    .registers 3

    .line 39
    const-class v0, Lcom/fasterxml/jackson/databind/JsonNode;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;-><init>(Ljava/lang/Class;Ljava/lang/Boolean;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;ZZ)V
    .registers 4

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;ZZ)V

    return-void
.end method

.method public static getDeserializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "+",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ">;"
        }
    .end annotation

    .line 58
    const-class v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-ne p0, v0, :cond_9

    .line 59
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;->getInstance()Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;

    move-result-object p0

    return-object p0

    .line 61
    :cond_9
    const-class v0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    if-ne p0, v0, :cond_12

    .line 62
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;->getInstance()Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;

    move-result-object p0

    return-object p0

    .line 65
    :cond_12
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;->instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;

    return-object p0
.end method


# virtual methods
.method protected _createWithMerge(ZZ)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;ZZ)V

    return-object v0
.end method

.method public bridge synthetic createContextual(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 25
    invoke-super {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->createContextual(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0
.end method

.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 96
    new-instance v4, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;

    invoke-direct {v4}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;-><init>()V

    .line 97
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object v3

    .line 98
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentTokenId()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_34

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2f

    const/4 v1, 0x3

    if-eq v0, v1, :cond_23

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1e

    .line 109
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;->_deserializeAnyScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0

    .line 106
    :cond_1e
    invoke-virtual {p0, p1, p2, v3, v4}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;->_deserializeObjectAtName(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0

    .line 104
    :cond_23
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    move-result-object p0

    return-object p0

    .line 102
    :cond_2f
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0

    .line 100
    :cond_34
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JacksonException;
        }
    .end annotation

    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25
    invoke-super {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getAbsentValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 2

    .line 76
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object p0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 25
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;->getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic isCachable()Z
    .registers 1

    .line 25
    invoke-super {p0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->isCachable()Z

    move-result p0

    return p0
.end method

.method public bridge synthetic logicalType()Lcom/fasterxml/jackson/databind/type/LogicalType;
    .registers 1

    .line 25
    invoke-super {p0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->logicalType()Lcom/fasterxml/jackson/databind/type/LogicalType;

    move-result-object p0

    return-object p0
.end method

.method public supportsUpdate(Lcom/fasterxml/jackson/databind/DeserializationConfig;)Ljava/lang/Boolean;
    .registers 2

    .line 114
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_supportsUpdates:Ljava/lang/Boolean;

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer (com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer)
.class final Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ArrayDeserializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer<",
        "Lcom/fasterxml/jackson/databind/node/ArrayNode;",
        ">;"
    }
.end annotation


# static fields
.field protected static final _instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 193
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;->_instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;

    return-void
.end method

.method protected constructor <init>()V
    .registers 3

    .line 195
    const-class v0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;-><init>(Ljava/lang/Class;Ljava/lang/Boolean;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;ZZ)V
    .registers 4

    .line 201
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;ZZ)V

    return-void
.end method

.method public static getInstance()Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;
    .registers 1

    .line 197
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;->_instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;

    return-object v0
.end method


# virtual methods
.method protected final _createWithMerge(ZZ)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .line 207
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;ZZ)V

    return-object v0
.end method

.method public final deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 213
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isExpectedStartArrayToken()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 214
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object v4

    .line 215
    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v0

    .line 216
    new-instance v5, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;

    invoke-direct {v5}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;-><init>()V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    return-object v0

    .line 220
    :cond_1b
    const-class p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    return-object p0
.end method

.method public final deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/ArrayNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 230
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isExpectedStartArrayToken()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 231
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object v4

    new-instance v5, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;

    invoke-direct {v5}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;-><init>()V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    return-object p3

    .line 235
    :cond_17
    const-class p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    return-object p0
.end method

.method public final bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JacksonException;
        }
    .end annotation

    .line 188
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

.method public final bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JacksonException;
        }
    .end annotation

    .line 188
    check-cast p3, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ArrayDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/ArrayNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer (com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer)
.class final Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ObjectDeserializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer<",
        "Lcom/fasterxml/jackson/databind/node/ObjectNode;",
        ">;"
    }
.end annotation


# static fields
.field protected static final _instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 131
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;->_instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;

    return-void
.end method

.method protected constructor <init>()V
    .registers 3

    .line 133
    const-class v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;-><init>(Ljava/lang/Class;Ljava/lang/Boolean;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;ZZ)V
    .registers 4

    .line 139
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;ZZ)V

    return-void
.end method

.method public static getInstance()Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;
    .registers 1

    .line 135
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;->_instance:Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;

    return-object v0
.end method


# virtual methods
.method protected final _createWithMerge(ZZ)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .line 145
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;ZZ)V

    return-object v0
.end method

.method public final deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 151
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object v3

    .line 152
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isExpectedStartObjectToken()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 153
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v6

    .line 154
    new-instance v4, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;

    invoke-direct {v4}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    return-object v6

    .line 157
    :cond_1b
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 158
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;-><init>()V

    invoke-virtual {p0, p1, p2, v3, v0}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;->_deserializeObjectAtName(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0

    .line 162
    :cond_2d
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result p0

    if-eqz p0, :cond_3a

    .line 163
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0

    .line 165
    :cond_3a
    const-class p0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    return-object p0
.end method

.method public final deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/ObjectNode;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 177
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isExpectedStartObjectToken()Z

    move-result v0

    if-nez v0, :cond_17

    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v0

    if-nez v0, :cond_17

    .line 181
    const-class p0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    return-object p0

    .line 178
    :cond_17
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;-><init>()V

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;->updateObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    return-object p0
.end method

.method public final bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JacksonException;
        }
    .end annotation

    .line 126
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0
.end method

.method public final bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JacksonException;
        }
    .end annotation

    .line 126
    check-cast p3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/std/JsonNodeDeserializer$ObjectDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/ObjectNode;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0
.end method
