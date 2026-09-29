###### Class com.fasterxml.jackson.databind.node.DecimalNode (com.fasterxml.jackson.databind.node.DecimalNode)
.class public Lcom/fasterxml/jackson/databind/node/DecimalNode;
.super Lcom/fasterxml/jackson/databind/node/NumericNode;
.source "SourceFile"


# static fields
.field private static final MAX_INTEGER:Ljava/math/BigDecimal;

.field private static final MAX_LONG:Ljava/math/BigDecimal;

.field private static final MIN_INTEGER:Ljava/math/BigDecimal;

.field private static final MIN_LONG:Ljava/math/BigDecimal;

.field public static final ZERO:Lcom/fasterxml/jackson/databind/node/DecimalNode;


# instance fields
.field protected final _value:Ljava/math/BigDecimal;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 18
    new-instance v0, Lcom/fasterxml/jackson/databind/node/DecimalNode;

    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/DecimalNode;-><init>(Ljava/math/BigDecimal;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->ZERO:Lcom/fasterxml/jackson/databind/node/DecimalNode;

    const-wide/32 v0, -0x80000000

    .line 20
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->MIN_INTEGER:Ljava/math/BigDecimal;

    const-wide/32 v0, 0x7fffffff

    .line 21
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->MAX_INTEGER:Ljava/math/BigDecimal;

    const-wide/high16 v0, -0x8000000000000000L

    .line 22
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->MIN_LONG:Ljava/math/BigDecimal;

    const-wide v0, 0x7fffffffffffffffL

    .line 23
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->MAX_LONG:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>(Ljava/math/BigDecimal;)V
    .registers 2

    .line 33
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/NumericNode;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->_value:Ljava/math/BigDecimal;

    return-void
.end method

.method public static valueOf(Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/node/DecimalNode;
    .registers 2

    .line 35
    new-instance v0, Lcom/fasterxml/jackson/databind/node/DecimalNode;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/DecimalNode;-><init>(Ljava/math/BigDecimal;)V

    return-object v0
.end method


# virtual methods
.method public asText()Ljava/lang/String;
    .registers 1

    .line 103
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->_value:Ljava/math/BigDecimal;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public asToken()Lcom/fasterxml/jackson/core/JsonToken;
    .registers 1

    .line 43
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0
.end method

.method public doubleValue()D
    .registers 3

    .line 96
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->_value:Ljava/math/BigDecimal;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

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

    .line 128
    :cond_8
    instance-of v2, p1, Lcom/fasterxml/jackson/databind/node/DecimalNode;

    if-eqz v2, :cond_19

    .line 129
    check-cast p1, Lcom/fasterxml/jackson/databind/node/DecimalNode;

    iget-object p1, p1, Lcom/fasterxml/jackson/databind/node/DecimalNode;->_value:Ljava/math/BigDecimal;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->_value:Ljava/math/BigDecimal;

    invoke-virtual {p1, p0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-nez p0, :cond_19

    return v0

    :cond_19
    return v1
.end method

.method public hashCode()I
    .registers 3

    .line 135
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public intValue()I
    .registers 1

    .line 81
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->_value:Ljava/math/BigDecimal;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public longValue()J
    .registers 3

    .line 84
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->_value:Ljava/math/BigDecimal;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 120
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/DecimalNode;->_value:Ljava/math/BigDecimal;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(Ljava/math/BigDecimal;)V

    return-void
.end method
