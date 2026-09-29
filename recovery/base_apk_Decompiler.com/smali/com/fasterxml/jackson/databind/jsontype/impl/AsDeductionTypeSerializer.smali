###### Class com.fasterxml.jackson.databind.jsontype.impl.AsDeductionTypeSerializer (com.fasterxml.jackson.databind.jsontype.impl.AsDeductionTypeSerializer)
.class public Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;
.super Lcom/fasterxml/jackson/databind/jsontype/impl/TypeSerializerBase;
.source "SourceFile"


# static fields
.field private static final INSTANCE:Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 15
    new-instance v0, Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;->INSTANCE:Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;

    return-void
.end method

.method protected constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, v0, v0}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeSerializerBase;-><init>(Lcom/fasterxml/jackson/databind/jsontype/TypeIdResolver;Lcom/fasterxml/jackson/databind/BeanProperty;)V

    return-void
.end method

.method public static instance()Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;
    .registers 1

    .line 22
    sget-object v0, Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;->INSTANCE:Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic forProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;
    .registers 2

    .line 13
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;->forProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;

    move-result-object p0

    return-object p0
.end method

.method public forProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/jsontype/impl/AsDeductionTypeSerializer;
    .registers 2

    return-object p0
.end method

.method public getTypeInclusion()Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;
    .registers 1

    .line 32
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;->EXISTING_PROPERTY:Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;

    return-object p0
.end method

.method public writeTypePrefix(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/core/type/WritableTypeId;)Lcom/fasterxml/jackson/core/type/WritableTypeId;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    iget-object p0, p2, Lcom/fasterxml/jackson/core/type/WritableTypeId;->valueShape:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonToken;->isStructStart()Z

    move-result p0

    if-eqz p0, :cond_13

    .line 44
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->canWriteTypeId()Z

    move-result p0

    if-nez p0, :cond_13

    .line 45
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeTypePrefix(Lcom/fasterxml/jackson/core/type/WritableTypeId;)Lcom/fasterxml/jackson/core/type/WritableTypeId;

    move-result-object p0

    return-object p0

    :cond_13
    const/4 p0, 0x0

    return-object p0
.end method

.method public writeTypeSuffix(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/core/type/WritableTypeId;)Lcom/fasterxml/jackson/core/type/WritableTypeId;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 55
    :cond_4
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeTypeSuffix(Lcom/fasterxml/jackson/core/type/WritableTypeId;)Lcom/fasterxml/jackson/core/type/WritableTypeId;

    move-result-object p0

    return-object p0
.end method
