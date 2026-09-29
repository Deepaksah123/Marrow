###### Class com.fasterxml.jackson.databind.node.NumericNode (com.fasterxml.jackson.databind.node.NumericNode)
.class public abstract Lcom/fasterxml/jackson/databind/node/NumericNode;
.super Lcom/fasterxml/jackson/databind/node/ValueNode;
.source "SourceFile"


# direct methods
.method protected constructor <init>()V
    .registers 1

    .line 16
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/ValueNode;-><init>()V

    return-void
.end method


# virtual methods
.method public final asDouble()D
    .registers 3

    .line 70
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public final asDouble(D)D
    .registers 3

    .line 75
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public final asInt()I
    .registers 1

    .line 50
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->intValue()I

    move-result p0

    return p0
.end method

.method public final asInt(I)I
    .registers 2

    .line 55
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->intValue()I

    move-result p0

    return p0
.end method

.method public final asLong()J
    .registers 3

    .line 60
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final asLong(J)J
    .registers 3

    .line 65
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public final getNodeType()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
    .registers 1

    .line 21
    sget-object p0, Lcom/fasterxml/jackson/databind/node/JsonNodeType;->NUMBER:Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    return-object p0
.end method
