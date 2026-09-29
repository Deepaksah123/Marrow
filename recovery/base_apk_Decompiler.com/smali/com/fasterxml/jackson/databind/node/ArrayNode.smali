###### Class com.fasterxml.jackson.databind.node.ArrayNode (com.fasterxml.jackson.databind.node.ArrayNode)
.class public Lcom/fasterxml/jackson/databind/node/ArrayNode;
.super Lcom/fasterxml/jackson/databind/node/ContainerNode;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/node/ContainerNode<",
        "Lcom/fasterxml/jackson/databind/node/ArrayNode;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private final _children:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V
    .registers 2

    .line 30
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/node/ContainerNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 31
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected _add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 3

    .line 1201
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public _at(Lcom/fasterxml/jackson/core/JsonPointer;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 2

    .line 52
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonPointer;->getMatchingIndex()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0
.end method

.method protected _withArray(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 12

    .line 125
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonPointer;->matches()Z

    move-result v0

    if-eqz v0, :cond_7

    return-object p0

    .line 128
    :cond_7
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_at(Lcom/fasterxml/jackson/core/JsonPointer;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    if-eqz v6, :cond_27

    .line 130
    instance-of v0, v6, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;

    if-eqz v0, :cond_27

    .line 131
    move-object v0, v6

    check-cast v0, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;

    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonPointer;->tail()Lcom/fasterxml/jackson/core/JsonPointer;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p3, p4}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;->_withArray(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v0

    if-eqz v0, :cond_1f

    return-object v0

    :cond_1f
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    .line 137
    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_withXxxVerifyReplace(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;ZLcom/fasterxml/jackson/databind/JsonNode;)V

    .line 140
    :cond_27
    invoke-virtual {p0, p2, p4}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_withArrayAddTailElement(Lcom/fasterxml/jackson/core/JsonPointer;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

.method protected _withArrayAddTailElement(Lcom/fasterxml/jackson/core/JsonPointer;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 5

    .line 172
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonPointer;->getMatchingIndex()I

    move-result v0

    if-gez v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 176
    :cond_8
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonPointer;->tail()Lcom/fasterxml/jackson/core/JsonPointer;

    move-result-object p1

    .line 179
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonPointer;->matches()Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 180
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p1

    .line 181
    invoke-virtual {p0, v0, p1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_withXxxSetArrayElement(ILcom/fasterxml/jackson/databind/JsonNode;)V

    return-object p1

    :cond_1a
    if-eqz p2, :cond_2e

    .line 186
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonPointer;->mayMatchElement()Z

    move-result v1

    if-eqz v1, :cond_2e

    .line 187
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v1

    .line 188
    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_withXxxSetArrayElement(ILcom/fasterxml/jackson/databind/JsonNode;)V

    .line 189
    invoke-virtual {v1, p1, p2}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_withArrayAddTailElement(Lcom/fasterxml/jackson/core/JsonPointer;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0

    .line 191
    :cond_2e
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v1

    .line 192
    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_withXxxSetArrayElement(ILcom/fasterxml/jackson/databind/JsonNode;)V

    .line 193
    invoke-virtual {v1, p1, p2}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_withArrayAddTailElement(Lcom/fasterxml/jackson/core/JsonPointer;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

.method protected _withXxxSetArrayElement(ILcom/fasterxml/jackson/databind/JsonNode;)V
    .registers 5

    .line 199
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v0

    if-lt p1, v0, :cond_29

    .line 200
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/ContainerNode;->_nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->getMaxElementIndexForInsert()I

    move-result v0

    if-le p1, v0, :cond_1f

    .line 203
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 202
    const-string v1, "Too big Array index (%d; max %d) to use for insert with `JsonPointer`"

    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_reportWrongNodeOperation(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    :cond_1f
    :goto_1f
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v0

    if-lt p1, v0, :cond_29

    .line 206
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->addNull()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_1f

    .line 209
    :cond_29
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->set(ILcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method

.method public add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 2

    if-nez p1, :cond_6

    .line 430
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p1

    .line 432
    :cond_6
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    return-object p0
.end method

.method public add(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 2

    if-nez p1, :cond_7

    .line 694
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p1

    goto :goto_b

    :cond_7
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;

    move-result-object p1

    :goto_b
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

.method public addNull()Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 2

    .line 568
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

.method public elements()Ljava/util/Iterator;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ">;"
        }
    .end annotation

    .line 251
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
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

    .line 1168
    :cond_8
    instance-of v1, p1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    if-eqz v1, :cond_17

    .line 1169
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    check-cast p1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    iget-object p1, p1, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_17
    return v0
.end method

.method public findValue(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 3

    .line 346
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 347
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/JsonNode;->findValue(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    if-eqz v0, :cond_6

    return-object v0

    :cond_19
    const/4 p0, 0x0

    return-object p0
.end method

.method public get(I)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 3

    if-ltz p1, :cond_13

    .line 256
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_13

    .line 257
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonNode;

    return-object p0

    :cond_13
    const/4 p0, 0x0

    return-object p0
.end method

.method public get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public getNodeType()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
    .registers 1

    .line 231
    sget-object p0, Lcom/fasterxml/jackson/databind/node/JsonNodeType;->ARRAY:Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    .line 1183
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public isArray()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public isEmpty(Lcom/fasterxml/jackson/databind/SerializerProvider;)Z
    .registers 2

    .line 220
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 315
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    .line 316
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 317
    invoke-virtual {p1, p0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray(Ljava/lang/Object;I)V

    const/4 p0, 0x0

    :goto_a
    if-ge p0, v1, :cond_18

    .line 319
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 320
    invoke-virtual {v2, p1, p2}, Lcom/fasterxml/jackson/databind/JsonNode;->serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_a

    .line 322
    :cond_18
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    return-void
.end method

.method public serializeWithType(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 329
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 330
    invoke-virtual {p3, p0, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->typeId(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/type/WritableTypeId;

    move-result-object v0

    .line 329
    invoke-virtual {p3, p1, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypePrefix(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/core/type/WritableTypeId;)Lcom/fasterxml/jackson/core/type/WritableTypeId;

    move-result-object v0

    .line 331
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 332
    check-cast v1, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;

    invoke-virtual {v1, p1, p2}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;->serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    goto :goto_10

    .line 334
    :cond_22
    invoke-virtual {p3, p1, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypeSuffix(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/core/type/WritableTypeId;)Lcom/fasterxml/jackson/core/type/WritableTypeId;

    return-void
.end method

.method public set(ILcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 5

    if-nez p2, :cond_6

    .line 414
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p2

    :cond_6
    if-ltz p1, :cond_19

    .line 416
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_19

    .line 419
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonNode;

    return-object p0

    .line 417
    :cond_19
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Illegal index "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", array size "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public size()I
    .registers 1

    .line 243
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_children:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public bridge synthetic withArray(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 2

    .line 21
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->withArray(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

.method public withArray(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 3

    .line 89
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->_jsonPointerIfValid(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonPointer;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 91
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->withArray(Lcom/fasterxml/jackson/core/JsonPointer;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0

    .line 93
    :cond_b
    invoke-super {p0, p1}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->withArray(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    return-object p0
.end method
