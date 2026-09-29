###### Class com.fasterxml.jackson.databind.JsonNode (com.fasterxml.jackson.databind.JsonNode)
.class public abstract Lcom/fasterxml/jackson/databind/JsonNode;
.super Lcom/fasterxml/jackson/databind/JsonSerializable$Base;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/core/TreeNode;
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/JsonSerializable$Base;",
        "Lcom/fasterxml/jackson/core/TreeNode;",
        "Ljava/lang/Iterable<",
        "Lcom/fasterxml/jackson/databind/JsonNode;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 91
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/JsonSerializable$Base;-><init>()V

    return-void
.end method


# virtual methods
.method public asBoolean()Z
    .registers 2

    const/4 v0, 0x0

    .line 741
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean(Z)Z

    move-result p0

    return p0
.end method

.method public asBoolean(Z)Z
    .registers 2

    return p1
.end method

.method public asDouble()D
    .registers 3

    const-wide/16 v0, 0x0

    .line 713
    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asDouble(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public asDouble(D)D
    .registers 3

    return-wide p1
.end method

.method public asInt()I
    .registers 2

    const/4 v0, 0x0

    .line 657
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt(I)I

    move-result p0

    return p0
.end method

.method public asInt(I)I
    .registers 2

    return p1
.end method

.method public asLong()J
    .registers 3

    const-wide/16 v0, 0x0

    .line 685
    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asLong(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public asLong(J)J
    .registers 3

    return-wide p1
.end method

.method public abstract asText()Ljava/lang/String;
.end method

.method public booleanValue()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public doubleValue()D
    .registers 3

    const-wide/16 v0, 0x0

    return-wide v0
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

    .line 1014
    invoke-static {}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->emptyIterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public fieldNames()Ljava/util/Iterator;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 236
    invoke-static {}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->emptyIterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public fields()Ljava/util/Iterator;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ">;>;"
        }
    .end annotation

    .line 1022
    invoke-static {}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->emptyIterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public abstract findValue(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
.end method

.method public abstract get(I)Lcom/fasterxml/jackson/databind/JsonNode;
.end method

.method public get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract getNodeType()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
.end method

.method public has(Ljava/lang/String;)Z
    .registers 2

    .line 932
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public intValue()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public isArray()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final isContainerNode()Z
    .registers 2

    .line 150
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->getNodeType()Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    move-result-object p0

    .line 151
    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeType;->OBJECT:Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    if-eq p0, v0, :cond_e

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeType;->ARRAY:Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    if-eq p0, v0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method public isInt()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final isNull()Z
    .registers 2

    .line 413
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->getNodeType()Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    move-result-object p0

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeType;->NULL:Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    if-ne p0, v0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public isObject()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final isTextual()Z
    .registers 2

    .line 397
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->getNodeType()Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    move-result-object p0

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeType;->STRING:Lcom/fasterxml/jackson/databind/node/JsonNodeType;

    if-ne p0, v0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ">;"
        }
    .end annotation

    .line 1005
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->elements()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public longValue()J
    .registers 3

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public size()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public withArray(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1310
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "`JsonNode` not of type `ObjectNode` (but `"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1311
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")`, cannot call `withArray()` on it"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final withArray(Lcom/fasterxml/jackson/core/JsonPointer;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 4

    .line 1340
    sget-object v0, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->NULLS:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->withArray(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

.method public withArray(Lcom/fasterxml/jackson/core/JsonPointer;Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;Z)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 4

    .line 1408
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "`withArray(JsonPointer)` not implemented by "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1409
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

###### Class com.fasterxml.jackson.databind.JsonNode.OverwriteMode (com.fasterxml.jackson.databind.JsonNode$OverwriteMode)
.class public final enum Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/JsonNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "OverwriteMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

.field public static final enum ALL:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

.field public static final enum NONE:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

.field public static final enum NULLS:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

.field public static final enum SCALARS:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;


# direct methods
.method static constructor <clinit>()V
    .registers 6

    .line 64
    new-instance v0, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->NONE:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    .line 70
    new-instance v1, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    const-string v2, "NULLS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->NULLS:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    .line 76
    new-instance v2, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    const-string v3, "SCALARS"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->SCALARS:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    .line 82
    new-instance v3, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    const-string v4, "ALL"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->ALL:Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    .line 59
    filled-new-array {v0, v1, v2, v3}, [Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->$VALUES:[Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;
    .registers 2

    .line 59
    const-class v0, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;
    .registers 1

    .line 59
    sget-object v0, Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->$VALUES:[Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/JsonNode$OverwriteMode;

    return-object v0
.end method
