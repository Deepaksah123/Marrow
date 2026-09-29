###### Class com.fasterxml.jackson.databind.ext.NioPathSerializer (com.fasterxml.jackson.databind.ext.NioPathSerializer)
.class public Lcom/fasterxml/jackson/databind/ext/NioPathSerializer;
.super Lcom/fasterxml/jackson/databind/ser/std/StdScalarSerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/ser/std/StdScalarSerializer<",
        "Ljava/nio/file/Path;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 22
    const-class v0, Ljava/nio/file/Path;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/ser/std/StdScalarSerializer;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18
    check-cast p1, Ljava/nio/file/Path;

    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ext/NioPathSerializer;->serialize(Ljava/nio/file/Path;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method

.method public serialize(Ljava/nio/file/Path;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27
    invoke-interface {p1}, Ljava/nio/file/Path;->toUri()Ljava/net/URI;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18
    check-cast p1, Ljava/nio/file/Path;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/databind/ext/NioPathSerializer;->serializeWithType(Ljava/nio/file/Path;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V

    return-void
.end method

.method public serializeWithType(Ljava/nio/file/Path;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 37
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 38
    const-class v1, Ljava/nio/file/Path;

    invoke-virtual {p4, p1, v1, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->typeId(Ljava/lang/Object;Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/type/WritableTypeId;

    move-result-object v0

    .line 37
    invoke-virtual {p4, p2, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypePrefix(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/core/type/WritableTypeId;)Lcom/fasterxml/jackson/core/type/WritableTypeId;

    move-result-object v0

    .line 39
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ext/NioPathSerializer;->serialize(Ljava/nio/file/Path;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 40
    invoke-virtual {p4, p2, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypeSuffix(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/core/type/WritableTypeId;)Lcom/fasterxml/jackson/core/type/WritableTypeId;

    return-void
.end method
