###### Class com.fasterxml.jackson.databind.node.InternalNodeMapper (com.fasterxml.jackson.databind.node.InternalNodeMapper)
.class final Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;,
        Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;
    }
.end annotation


# static fields
.field private static final JSON_MAPPER:Lcom/fasterxml/jackson/databind/json/JsonMapper;

.field private static final NODE_READER:Lcom/fasterxml/jackson/databind/ObjectReader;

.field private static final PRETTY_WRITER:Lcom/fasterxml/jackson/databind/ObjectWriter;

.field private static final STD_WRITER:Lcom/fasterxml/jackson/databind/ObjectWriter;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 22
    new-instance v0, Lcom/fasterxml/jackson/databind/json/JsonMapper;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/json/JsonMapper;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->JSON_MAPPER:Lcom/fasterxml/jackson/databind/json/JsonMapper;

    .line 24
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writer()Lcom/fasterxml/jackson/databind/ObjectWriter;

    move-result-object v1

    sput-object v1, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->STD_WRITER:Lcom/fasterxml/jackson/databind/ObjectWriter;

    .line 25
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writer()Lcom/fasterxml/jackson/databind/ObjectWriter;

    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/ObjectWriter;->withDefaultPrettyPrinter()Lcom/fasterxml/jackson/databind/ObjectWriter;

    move-result-object v1

    sput-object v1, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->PRETTY_WRITER:Lcom/fasterxml/jackson/databind/ObjectWriter;

    .line 28
    const-class v1, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readerFor(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->NODE_READER:Lcom/fasterxml/jackson/databind/ObjectReader;

    return-void
.end method

.method constructor <init>()V
    .registers 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static _wrapper(Lcom/fasterxml/jackson/databind/node/BaseJsonNode;)Lcom/fasterxml/jackson/databind/JsonSerializable;
    .registers 2

    .line 59
    new-instance v0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;-><init>(Lcom/fasterxml/jackson/databind/node/BaseJsonNode;)V

    return-object v0
.end method

.method public static bytesToNode([B)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    sget-object v0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->NODE_READER:Lcom/fasterxml/jackson/databind/ObjectReader;

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonNode;

    return-object p0
.end method

.method public static nodeToString(Lcom/fasterxml/jackson/databind/node/BaseJsonNode;)Ljava/lang/String;
    .registers 2

    .line 34
    :try_start_0
    sget-object v0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->STD_WRITER:Lcom/fasterxml/jackson/databind/ObjectWriter;

    invoke-static {p0}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->_wrapper(Lcom/fasterxml/jackson/databind/node/BaseJsonNode;)Lcom/fasterxml/jackson/databind/JsonSerializable;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/ObjectWriter;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_a} :catch_b

    return-object p0

    :catch_b
    move-exception p0

    .line 36
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static valueToBytes(Ljava/lang/Object;)[B
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 51
    sget-object v0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->JSON_MAPPER:Lcom/fasterxml/jackson/databind/json/JsonMapper;

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writeValueAsBytes(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.node.InternalNodeMapper.IteratorStack (com.fasterxml.jackson.databind.node.InternalNodeMapper$IteratorStack)
.class final Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "IteratorStack"
.end annotation


# instance fields
.field private _end:I

.field private _stack:[Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Iterator<",
            "*>;"
        }
    .end annotation
.end field

.field private _top:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final popOrNull()Ljava/util/Iterator;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "*>;"
        }
    .end annotation

    .line 192
    iget v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_top:I

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 197
    :cond_6
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_stack:[Ljava/util/Iterator;

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_top:I

    aget-object p0, v1, v0

    return-object p0
.end method

.method public final push(Ljava/util/Iterator;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "*>;)V"
        }
    .end annotation

    .line 176
    iget v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_top:I

    iget v1, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_end:I

    if-ge v0, v1, :cond_f

    .line 177
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_stack:[Ljava/util/Iterator;

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_top:I

    aput-object p1, v1, v0

    return-void

    .line 180
    :cond_f
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_stack:[Ljava/util/Iterator;

    if-nez v0, :cond_1c

    const/16 v0, 0xa

    .line 181
    iput v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_end:I

    .line 182
    new-array v0, v0, [Ljava/util/Iterator;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_stack:[Ljava/util/Iterator;

    goto :goto_37

    :cond_1c
    shr-int/lit8 v0, v1, 0x1

    const/16 v2, 0x14

    .line 185
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/16 v2, 0xfa0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v1, v0

    iput v1, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_end:I

    .line 186
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_stack:[Ljava/util/Iterator;

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/Iterator;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_stack:[Ljava/util/Iterator;

    .line 188
    :goto_37
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_stack:[Ljava/util/Iterator;

    iget v1, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_top:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->_top:I

    aput-object p1, v0, v1

    return-void
.end method

###### Class com.fasterxml.jackson.databind.node.InternalNodeMapper.WrapperForSerializer (com.fasterxml.jackson.databind.node.InternalNodeMapper$WrapperForSerializer)
.class public Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;
.super Lcom/fasterxml/jackson/databind/JsonSerializable$Base;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "WrapperForSerializer"
.end annotation


# instance fields
.field protected _context:Lcom/fasterxml/jackson/databind/SerializerProvider;

.field protected final _root:Lcom/fasterxml/jackson/databind/node/BaseJsonNode;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/node/BaseJsonNode;)V
    .registers 2

    .line 78
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/JsonSerializable$Base;-><init>()V

    .line 79
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_root:Lcom/fasterxml/jackson/databind/node/BaseJsonNode;

    return-void
.end method


# virtual methods
.method protected _serializeNonRecursive(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/JsonNode;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    instance-of v0, p2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-eqz v0, :cond_18

    .line 99
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v0

    invoke-virtual {p1, p0, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject(Ljava/lang/Object;I)V

    .line 100
    new-instance v0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;-><init>()V

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_serializeNonRecursive(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;Ljava/util/Iterator;)V

    return-void

    .line 101
    :cond_18
    instance-of v0, p2, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    if-eqz v0, :cond_30

    .line 102
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v0

    invoke-virtual {p1, p0, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray(Ljava/lang/Object;I)V

    .line 103
    new-instance v0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;-><init>()V

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->elements()Ljava/util/Iterator;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_serializeNonRecursive(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;Ljava/util/Iterator;)V

    return-void

    .line 105
    :cond_30
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_context:Lcom/fasterxml/jackson/databind/SerializerProvider;

    invoke-virtual {p2, p1, p0}, Lcom/fasterxml/jackson/databind/JsonNode;->serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method

.method protected _serializeNonRecursive(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;Ljava/util/Iterator;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;",
            "Ljava/util/Iterator<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 116
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_73

    .line 120
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 121
    instance-of v1, v0, Ljava/util/Map$Entry;

    if-eqz v1, :cond_20

    .line 123
    check-cast v0, Ljava/util/Map$Entry;

    .line 124
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 125
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_22

    .line 127
    :cond_20
    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 129
    :goto_22
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-eqz v1, :cond_35

    .line 130
    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->push(Ljava/util/Iterator;)V

    .line 131
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object p3

    .line 132
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject(Ljava/lang/Object;I)V

    goto :goto_0

    .line 133
    :cond_35
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    if-eqz v1, :cond_48

    .line 134
    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->push(Ljava/util/Iterator;)V

    .line 135
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->elements()Ljava/util/Iterator;

    move-result-object p3

    .line 136
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray(Ljava/lang/Object;I)V

    goto :goto_0

    .line 137
    :cond_48
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/node/POJONode;

    if-eqz v1, :cond_6d

    .line 140
    :try_start_4c
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_context:Lcom/fasterxml/jackson/databind/SerializerProvider;

    invoke-virtual {v0, p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    :try_end_51
    .catch Ljava/io/IOException; {:try_start_4c .. :try_end_51} :catch_52
    .catch Ljava/lang/RuntimeException; {:try_start_4c .. :try_end_51} :catch_52

    goto :goto_0

    :catch_52
    move-exception v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 142
    const-string v1, "[ERROR: (%s) %s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 146
    :cond_6d
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_context:Lcom/fasterxml/jackson/databind/SerializerProvider;

    invoke-virtual {v0, p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    goto :goto_0

    .line 149
    :cond_73
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->getOutputContext()Lcom/fasterxml/jackson/core/JsonStreamContext;

    move-result-object p3

    invoke-virtual {p3}, Lcom/fasterxml/jackson/core/JsonStreamContext;->inArray()Z

    move-result p3

    if-eqz p3, :cond_81

    .line 150
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    goto :goto_84

    .line 152
    :cond_81
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 154
    :goto_84
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$IteratorStack;->popOrNull()Ljava/util/Iterator;

    move-result-object p3

    if-nez p3, :cond_0

    return-void
.end method

.method public serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_context:Lcom/fasterxml/jackson/databind/SerializerProvider;

    .line 85
    iget-object p2, p0, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_root:Lcom/fasterxml/jackson/databind/node/BaseJsonNode;

    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->_serializeNonRecursive(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/JsonNode;)V

    return-void
.end method

.method public serializeWithType(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 93
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper$WrapperForSerializer;->serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method
