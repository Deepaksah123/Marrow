###### Class com.fasterxml.jackson.databind.node.BaseJsonNode (com.fasterxml.jackson.databind.node.BaseJsonNode)
.class public abstract Lcom/fasterxml/jackson/databind/node/BaseJsonNode;
.super Lcom/fasterxml/jackson/databind/JsonNode;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method protected constructor <init>()V
    .registers 1

    .line 35
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/JsonNode;-><init>()V

    return-void
.end method


# virtual methods
.method protected _jsonPointerIfValid(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonPointer;
    .registers 3

    .line 270
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_11

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x2f

    if-eq p0, v0, :cond_11

    const/4 p0, 0x0

    return-object p0

    .line 271
    :cond_11
    invoke-static {p1}, Lcom/fasterxml/jackson/core/JsonPointer;->compile(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonPointer;

    move-result-object p0

    return-object p0
.end method

.method protected varargs _reportWrongNodeOperation(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 265
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected varargs _reportWrongNodeType(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 261
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected _withArray(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 5

    const/4 p0, 0x0

    return-object p0
.end method

.method protected _withXxxMayReplace(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;)Z
    .registers 4

    .line 169
    sget-object p0, Lcom/fasterxml/jackson/databind/node/BaseJsonNode$1;->$SwitchMap$com$fasterxml$jackson$databind$JsonNode$OverwriteMode:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p0, p0, p2

    const/4 p2, 0x1

    if-eq p0, p2, :cond_1d

    const/4 v0, 0x2

    if-eq p0, v0, :cond_18

    const/4 v0, 0x3

    if-eq p0, v0, :cond_12

    return p2

    .line 175
    :cond_12
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->isContainerNode()Z

    move-result p0

    xor-int/2addr p0, p2

    return p0

    .line 173
    :cond_18
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result p0

    return p0

    :cond_1d
    const/4 p0, 0x0

    return p0
.end method

.method protected _withXxxVerifyReplace(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;ZLcom/fasterxml/jackson/databind/JsonNode;)V
    .registers 6

    .line 160
    invoke-virtual {p0, p5, p3}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;->_withXxxMayReplace(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;)Z

    move-result p4

    if-nez p4, :cond_1b

    .line 163
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonPointer;->getMatchingProperty()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p4, p2, p1, p3}, [Ljava/lang/Object;

    move-result-object p1

    .line 161
    const-string p2, "Cannot replace `JsonNode` of type `%s` for property \"%s\" in JSON Pointer \"%s\" (mode `OverwriteMode.%s`)"

    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;->_reportWrongNodeType(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1b
    return-void
.end method

.method public abstract serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    .line 242
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->nodeToString(Lcom/fasterxml/jackson/databind/node/BaseJsonNode;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public withArray(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 6

    .line 187
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonPointer;->matches()Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 188
    instance-of v0, p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    if-eqz v0, :cond_d

    .line 189
    check-cast p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    return-object p0

    .line 192
    :cond_d
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 191
    const-string v1, "Can only call `withArray()` with empty JSON Pointer on `ArrayNode`, not `%s`"

    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;->_reportWrongNodeType(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    :cond_1e
    invoke-virtual {p0, p1, p1, p2, p3}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;->_withArray(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p2

    if-nez p2, :cond_35

    .line 198
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 197
    const-string p3, "Cannot replace context node (of type `%s`) using `withArray()` with  JSON Pointer \'%s\'"

    invoke-virtual {p0, p3, p1}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;->_reportWrongNodeType(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_35
    return-object p2
.end method

.method writeReplace()Ljava/lang/Object;
    .registers 1

    .line 32
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/node/NodeSerialization;->from(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/node/NodeSerialization;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.node.BaseJsonNode.AnonymousClass1 (com.fasterxml.jackson.databind.node.BaseJsonNode$1)
.class synthetic Lcom/fasterxml/jackson/databind/node/BaseJsonNode$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/node/BaseJsonNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$fasterxml$jackson$databind$JsonNode$OverwriteMode:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 169
    invoke-static {}, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->values()[Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/fasterxml/jackson/databind/node/BaseJsonNode$1;->$SwitchMap$com$fasterxml$jackson$databind$JsonNode$OverwriteMode:[I

    :try_start_9
    sget-object v1, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->NONE:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v0, Lcom/fasterxml/jackson/databind/node/BaseJsonNode$1;->$SwitchMap$com$fasterxml$jackson$databind$JsonNode$OverwriteMode:[I

    sget-object v1, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->NULLS:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1d
    sget-object v0, Lcom/fasterxml/jackson/databind/node/BaseJsonNode$1;->$SwitchMap$com$fasterxml$jackson$databind$JsonNode$OverwriteMode:[I

    sget-object v1, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->SCALARS:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_28} :catch_28

    :catch_28
    :try_start_28
    sget-object v0, Lcom/fasterxml/jackson/databind/node/BaseJsonNode$1;->$SwitchMap$com$fasterxml$jackson$databind$JsonNode$OverwriteMode:[I

    sget-object v1, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->ALL:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_33} :catch_33

    :catch_33
    return-void
.end method
