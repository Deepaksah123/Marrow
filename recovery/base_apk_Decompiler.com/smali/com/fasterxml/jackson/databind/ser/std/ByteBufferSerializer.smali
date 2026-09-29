###### Class com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer (com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer)
.class public Lcom/fasterxml/jackson/databind/ser/std/ByteBufferSerializer;
.super Lcom/fasterxml/jackson/databind/ser/std/StdScalarSerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/ser/std/StdScalarSerializer<",
        "Ljava/nio/ByteBuffer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 16
    const-class v0, Ljava/nio/ByteBuffer;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/ser/std/StdScalarSerializer;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public acceptJsonFormatVisitor(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;Lcom/fasterxml/jackson/databind/JavaType;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 43
    invoke-interface {p1, p2}, Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;->expectArrayFormat(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonArrayFormatVisitor;

    move-result-object p0

    if-eqz p0, :cond_b

    .line 45
    sget-object p1, Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;->INTEGER:Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;

    invoke-interface {p0, p1}, Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonArrayFormatVisitor;->itemsFormat(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;)V

    :cond_b
    return-void
.end method

.method public bridge synthetic serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/std/ByteBufferSerializer;->serialize(Ljava/nio/ByteBuffer;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method

.method public serialize(Ljava/nio/ByteBuffer;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result p0

    if-eqz p0, :cond_1c

    .line 23
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p0

    .line 24
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    add-int/2addr v0, p0

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    sub-int/2addr p1, p0

    invoke-virtual {p2, p3, v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBinary([BII)V

    return-void

    .line 29
    :cond_1c
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result p1

    if-lez p1, :cond_29

    .line 31
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 33
    :cond_29
    new-instance p1, Lcom/fasterxml/jackson/databind/util/ByteBufferBackedInputStream;

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/databind/util/ByteBufferBackedInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    .line 34
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p0

    invoke-virtual {p2, p1, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBinary(Ljava/io/InputStream;I)I

    .line 35
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void
.end method
