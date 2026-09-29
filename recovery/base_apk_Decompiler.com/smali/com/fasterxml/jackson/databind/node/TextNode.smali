###### Class com.fasterxml.jackson.databind.node.TextNode (com.fasterxml.jackson.databind.node.TextNode)
.class public Lcom/fasterxml/jackson/databind/node/TextNode;
.super Lcom/fasterxml/jackson/databind/node/ValueNode;
.source "SourceFile"


# static fields
.field static final EMPTY_STRING_NODE:Lcom/fasterxml/jackson/databind/node/TextNode;


# instance fields
.field protected final _value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 21
    new-instance v0, Lcom/fasterxml/jackson/databind/node/TextNode;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/TextNode;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/node/TextNode;->EMPTY_STRING_NODE:Lcom/fasterxml/jackson/databind/node/TextNode;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    .line 25
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/ValueNode;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;
    .registers 2

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 41
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 42
    sget-object p0, Lcom/fasterxml/jackson/databind/node/TextNode;->EMPTY_STRING_NODE:Lcom/fasterxml/jackson/databind/node/TextNode;

    return-object p0

    .line 44
    :cond_d
    new-instance v0, Lcom/fasterxml/jackson/databind/node/TextNode;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/TextNode;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public asBoolean(Z)Z
    .registers 3

    .line 112
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    if-eqz p0, :cond_1c

    .line 113
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 114
    const-string v0, "true"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 p0, 0x1

    return p0

    .line 117
    :cond_12
    const-string v0, "false"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1c

    const/4 p0, 0x0

    return p0

    :cond_1c
    return p1
.end method

.method public asDouble(D)D
    .registers 3

    .line 136
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseAsDouble(Ljava/lang/String;D)D

    move-result-wide p0

    return-wide p0
.end method

.method public asInt(I)I
    .registers 2

    .line 126
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseAsInt(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public asLong(J)J
    .registers 3

    .line 131
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseAsLong(Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public asText()Ljava/lang/String;
    .registers 1

    .line 100
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    return-object p0
.end method

.method public asToken()Lcom/fasterxml/jackson/core/JsonToken;
    .registers 1

    .line 52
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    if-ne p1, p0, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    const/4 v0, 0x0

    if-nez p1, :cond_8

    return v0

    .line 166
    :cond_8
    instance-of v1, p1, Lcom/fasterxml/jackson/databind/node/TextNode;

    if-eqz v1, :cond_17

    .line 167
    check-cast p1, Lcom/fasterxml/jackson/databind/node/TextNode;

    iget-object p1, p1, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_17
    return v0
.end method

.method public getNodeType()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
    .registers 1

    .line 49
    sget-object p0, Lcom/fasterxml/jackson/databind/node/JsonNodeType;->STRING:Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    .line 173
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public final serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 148
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/TextNode;->_value:Ljava/lang/String;

    if-nez p0, :cond_8

    .line 149
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V

    return-void

    .line 151
    :cond_8
    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    return-void
.end method
