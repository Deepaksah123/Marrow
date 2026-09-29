###### Class com.fasterxml.jackson.databind.node.IntNode (com.fasterxml.jackson.databind.node.IntNode)
.class public Lcom/fasterxml/jackson/databind/node/IntNode;
.super Lcom/fasterxml/jackson/databind/node/NumericNode;
.source "SourceFile"


# static fields
.field private static final CANONICALS:[Lcom/fasterxml/jackson/databind/node/IntNode;


# instance fields
.field protected final _value:I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    const/16 v0, 0xc

    .line 27
    new-array v1, v0, [Lcom/fasterxml/jackson/databind/node/IntNode;

    sput-object v1, Lcom/fasterxml/jackson/databind/node/IntNode;->CANONICALS:[Lcom/fasterxml/jackson/databind/node/IntNode;

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_17

    .line 29
    sget-object v2, Lcom/fasterxml/jackson/databind/node/IntNode;->CANONICALS:[Lcom/fasterxml/jackson/databind/node/IntNode;

    new-instance v3, Lcom/fasterxml/jackson/databind/node/IntNode;

    add-int/lit8 v4, v1, -0x1

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/IntNode;-><init>(I)V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_17
    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    .line 44
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/NumericNode;-><init>()V

    iput p1, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    return-void
.end method

.method public static valueOf(I)Lcom/fasterxml/jackson/databind/node/IntNode;
    .registers 2

    const/16 v0, 0xa

    if-gt p0, v0, :cond_e

    const/4 v0, -0x1

    if-lt p0, v0, :cond_e

    .line 48
    sget-object v0, Lcom/fasterxml/jackson/databind/node/IntNode;->CANONICALS:[Lcom/fasterxml/jackson/databind/node/IntNode;

    add-int/lit8 p0, p0, 0x1

    aget-object p0, v0, p0

    return-object p0

    .line 47
    :cond_e
    new-instance v0, Lcom/fasterxml/jackson/databind/node/IntNode;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/IntNode;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public asBoolean(Z)Z
    .registers 2

    .line 111
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public asText()Ljava/lang/String;
    .registers 1

    .line 106
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->toString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public asToken()Lcom/fasterxml/jackson/core/JsonToken;
    .registers 1

    .line 57
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0
.end method

.method public doubleValue()D
    .registers 3

    .line 95
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    int-to-double v0, p0

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

    .line 126
    :cond_8
    instance-of v2, p1, Lcom/fasterxml/jackson/databind/node/IntNode;

    if-eqz v2, :cond_15

    .line 127
    check-cast p1, Lcom/fasterxml/jackson/databind/node/IntNode;

    iget p1, p1, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    iget p0, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    if-ne p1, p0, :cond_15

    return v0

    :cond_15
    return v1
.end method

.method public hashCode()I
    .registers 1

    .line 133
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    return p0
.end method

.method public intValue()I
    .registers 1

    .line 86
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    return p0
.end method

.method public isInt()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public longValue()J
    .registers 3

    .line 89
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    int-to-long v0, p0

    return-wide v0
.end method

.method public final serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 118
    iget p0, p0, Lcom/fasterxml/jackson/databind/node/IntNode;->_value:I

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(I)V

    return-void
.end method
