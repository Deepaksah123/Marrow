###### Class com.fasterxml.jackson.databind.node.JsonNodeFactory (com.fasterxml.jackson.databind.node.JsonNodeFactory)
.class public Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;


# instance fields
.field private final _cfgBigDecimalExact:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 60
    new-instance v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    return-void
.end method

.method protected constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 79
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .registers 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->_cfgBigDecimalExact:Z

    return-void
.end method


# virtual methods
.method public arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 2

    .line 339
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    return-object v0
.end method

.method public binaryNode([B)Lcom/fasterxml/jackson/databind/node/BinaryNode;
    .registers 2

    .line 317
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/BinaryNode;->valueOf([B)Lcom/fasterxml/jackson/databind/node/BinaryNode;

    move-result-object p0

    return-object p0
.end method

.method public booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;
    .registers 2

    if-eqz p1, :cond_7

    .line 133
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/BooleanNode;->getTrue()Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/BooleanNode;->getFalse()Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object p0

    return-object p0
.end method

.method public getMaxElementIndexForInsert()I
    .registers 1

    const/16 p0, 0x270f

    return p0
.end method

.method public missingNode()Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 1

    .line 144
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/MissingNode;->getInstance()Lcom/fasterxml/jackson/databind/node/MissingNode;

    move-result-object p0

    return-object p0
.end method

.method public nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;
    .registers 1

    .line 141
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p0

    return-object p0
.end method

.method public numberNode(D)Lcom/fasterxml/jackson/databind/node/NumericNode;
    .registers 3

    .line 264
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/databind/node/DoubleNode;->valueOf(D)Lcom/fasterxml/jackson/databind/node/DoubleNode;

    move-result-object p0

    return-object p0
.end method

.method public numberNode(F)Lcom/fasterxml/jackson/databind/node/NumericNode;
    .registers 2

    .line 246
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/FloatNode;->valueOf(F)Lcom/fasterxml/jackson/databind/node/FloatNode;

    move-result-object p0

    return-object p0
.end method

.method public numberNode(I)Lcom/fasterxml/jackson/databind/node/NumericNode;
    .registers 2

    .line 194
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/IntNode;->valueOf(I)Lcom/fasterxml/jackson/databind/node/IntNode;

    move-result-object p0

    return-object p0
.end method

.method public numberNode(J)Lcom/fasterxml/jackson/databind/node/NumericNode;
    .registers 3

    .line 213
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/databind/node/LongNode;->valueOf(J)Lcom/fasterxml/jackson/databind/node/LongNode;

    move-result-object p0

    return-object p0
.end method

.method public numberNode(Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/node/ValueNode;
    .registers 2

    if-nez p1, :cond_7

    .line 291
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p0

    return-object p0

    .line 295
    :cond_7
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/DecimalNode;->valueOf(Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/node/DecimalNode;

    move-result-object p0

    return-object p0
.end method

.method public numberNode(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/ValueNode;
    .registers 2

    if-nez p1, :cond_7

    .line 236
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p0

    return-object p0

    .line 238
    :cond_7
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/BigIntegerNode;->valueOf(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/BigIntegerNode;

    move-result-object p0

    return-object p0
.end method

.method public objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .registers 2

    .line 353
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    return-object v0
.end method

.method public pojoNode(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/node/ValueNode;
    .registers 2

    .line 362
    new-instance p0, Lcom/fasterxml/jackson/databind/node/POJONode;

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/node/POJONode;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public rawValueNode(Lcom/fasterxml/jackson/databind/util/RawValue;)Lcom/fasterxml/jackson/databind/node/ValueNode;
    .registers 2

    .line 366
    new-instance p0, Lcom/fasterxml/jackson/databind/node/POJONode;

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/node/POJONode;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;
    .registers 2

    .line 309
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/TextNode;->valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;

    move-result-object p0

    return-object p0
.end method

.method public willStripTrailingBigDecimalZeroes()Z
    .registers 1

    .line 118
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->_cfgBigDecimalExact:Z

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method
