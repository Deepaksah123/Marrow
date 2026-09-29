###### Class com.fasterxml.jackson.databind.node.FloatNode (com.fasterxml.jackson.databind.node.FloatNode)
.class public Lcom/fasterxml/jackson/databind/node/FloatNode;
.super Lcom/fasterxml/jackson/databind/node/NumericNode;
.source "SourceFile"


# instance fields
.field protected final _value:F


# direct methods
.method public constructor <init>(F)V
    .registers 2

    .line 29
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/NumericNode;-><init>()V

    iput p1, p0, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    return-void
.end method

.method public static valueOf(F)Lcom/fasterxml/jackson/databind/node/FloatNode;
    .registers 2

    .line 31
    new-instance v0, Lcom/fasterxml/jackson/databind/node/FloatNode;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/FloatNode;-><init>(F)V

    return-object v0
.end method


# virtual methods
.method public asText()Ljava/lang/String;
    .registers 1

    .line 100
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->toString(F)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public asToken()Lcom/fasterxml/jackson/core/JsonToken;
    .registers 1

    .line 39
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0
.end method

.method public doubleValue()D
    .registers 3

    .line 88
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    float-to-double v0, p0

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-nez p1, :cond_8

    return v1

    .line 120
    :cond_8
    instance-of v2, p1, Lcom/fasterxml/jackson/databind/node/FloatNode;

    if-eqz v2, :cond_19

    .line 123
    check-cast p1, Lcom/fasterxml/jackson/databind/node/FloatNode;

    iget p1, p1, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    .line 124
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    if-nez p0, :cond_19

    return v0

    :cond_19
    return v1
.end method

.method public hashCode()I
    .registers 1

    .line 131
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p0

    return p0
.end method

.method public intValue()I
    .registers 1

    .line 79
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    float-to-int p0, p0

    return p0
.end method

.method public longValue()J
    .registers 3

    .line 82
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    float-to-long v0, p0

    return-wide v0
.end method

.method public final serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 112
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/FloatNode;->_value:F

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(F)V

    return-void
.end method
