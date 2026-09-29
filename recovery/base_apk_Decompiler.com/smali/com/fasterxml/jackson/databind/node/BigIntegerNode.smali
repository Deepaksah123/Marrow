###### Class com.fasterxml.jackson.databind.node.BigIntegerNode (com.fasterxml.jackson.databind.node.BigIntegerNode)
.class public Lcom/fasterxml/jackson/databind/node/BigIntegerNode;
.super Lcom/fasterxml/jackson/databind/node/NumericNode;
.source "SourceFile"


# static fields
.field private static final MAX_INTEGER:Ljava/math/BigInteger;

.field private static final MAX_LONG:Ljava/math/BigInteger;

.field private static final MIN_INTEGER:Ljava/math/BigInteger;

.field private static final MIN_LONG:Ljava/math/BigInteger;


# instance fields
.field protected final _value:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-wide/32 v0, -0x80000000

    .line 17
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->MIN_INTEGER:Ljava/math/BigInteger;

    const-wide/32 v0, 0x7fffffff

    .line 18
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->MAX_INTEGER:Ljava/math/BigInteger;

    const-wide/high16 v0, -0x8000000000000000L

    .line 19
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->MIN_LONG:Ljava/math/BigInteger;

    const-wide v0, 0x7fffffffffffffffL

    .line 20
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->MAX_LONG:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .registers 2

    .line 30
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/NumericNode;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    return-void
.end method

.method public static valueOf(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/BigIntegerNode;
    .registers 2

    .line 32
    new-instance v0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;-><init>(Ljava/math/BigInteger;)V

    return-object v0
.end method


# virtual methods
.method public asBoolean(Z)Z
    .registers 2

    .line 98
    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public asText()Ljava/lang/String;
    .registers 1

    .line 93
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public asToken()Lcom/fasterxml/jackson/core/JsonToken;
    .registers 1

    .line 41
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0
.end method

.method public doubleValue()D
    .registers 3

    .line 80
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
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

    .line 113
    :cond_8
    instance-of v1, p1, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;

    if-nez v1, :cond_d

    return v0

    .line 116
    :cond_d
    check-cast p1, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;

    iget-object p1, p1, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public hashCode()I
    .registers 1

    .line 121
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public intValue()I
    .registers 1

    .line 68
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public longValue()J
    .registers 3

    .line 71
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

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

    .line 105
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->_value:Ljava/math/BigInteger;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(Ljava/math/BigInteger;)V

    return-void
.end method
