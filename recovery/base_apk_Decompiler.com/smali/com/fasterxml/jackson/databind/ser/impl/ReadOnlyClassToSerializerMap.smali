###### Class com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap (com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap)
.class public final Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;
    }
.end annotation


# instance fields
.field private final _buckets:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

.field private final _mask:I

.field private final _size:I


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/util/LRUMap;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/util/LRUMap<",
            "Lcom/fasterxml/jackson/databind/util/TypeKey;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/LRUMap;->size()I

    move-result v0

    invoke-static {v0}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->findSize(I)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_size:I

    add-int/lit8 v1, v0, -0x1

    .line 28
    iput v1, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_mask:I

    .line 29
    new-array v0, v0, [Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    .line 30
    new-instance v1, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, v0}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0;-><init>(Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;)V

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/util/LRUMap;->contents(Ljava/util/function/BiConsumer;)V

    .line 34
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_buckets:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    return-void
.end method

.method private static final findSize(I)I
    .registers 2

    const/16 v0, 0x40

    if-gt p0, v0, :cond_6

    add-int/2addr p0, p0

    goto :goto_9

    :cond_6
    shr-int/lit8 v0, p0, 0x2

    add-int/2addr p0, v0

    :goto_9
    const/16 v0, 0x8

    :goto_b
    if-ge v0, p0, :cond_f

    add-int/2addr v0, v0

    goto :goto_b

    :cond_f
    return v0
.end method

.method public static from(Lcom/fasterxml/jackson/databind/util/LRUMap;)Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/util/LRUMap<",
            "Lcom/fasterxml/jackson/databind/util/TypeKey;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;"
        }
    .end annotation

    .line 52
    new-instance v0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;-><init>(Lcom/fasterxml/jackson/databind/util/LRUMap;)V

    return-object v0
.end method


# virtual methods
.method final synthetic lambda$new$0$com-fasterxml-jackson-databind-ser-impl-ReadOnlyClassToSerializerMap([Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;Lcom/fasterxml/jackson/databind/util/TypeKey;Lcom/fasterxml/jackson/databind/JsonSerializer;)V
    .registers 6

    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_mask:I

    and-int/2addr p0, v0

    .line 32
    new-instance v0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    aget-object v1, p1, p0

    invoke-direct {v0, v1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;-><init>(Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;Lcom/fasterxml/jackson/databind/util/TypeKey;Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    aput-object v0, p1, p0

    return-void
.end method

.method public final typedValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_buckets:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/TypeKey;->typedHash(Lcom/fasterxml/jackson/databind/JavaType;)I

    move-result v1

    iget p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_mask:I

    and-int/2addr p0, v1

    aget-object p0, v0, p0

    const/4 v0, 0x0

    if-nez p0, :cond_f

    return-object v0

    .line 69
    :cond_f
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->matchesTyped(Lcom/fasterxml/jackson/databind/JavaType;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 70
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    return-object p0

    .line 72
    :cond_18
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->next:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    if-eqz p0, :cond_25

    .line 73
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->matchesTyped(Lcom/fasterxml/jackson/databind/JavaType;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 74
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    return-object p0

    :cond_25
    return-object v0
.end method

.method public final typedValueSerializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_buckets:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/TypeKey;->typedHash(Ljava/lang/Class;)I

    move-result v1

    iget p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_mask:I

    and-int/2addr p0, v1

    aget-object p0, v0, p0

    const/4 v0, 0x0

    if-nez p0, :cond_f

    return-object v0

    .line 86
    :cond_f
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->matchesTyped(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 87
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    return-object p0

    .line 89
    :cond_18
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->next:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    if-eqz p0, :cond_25

    .line 90
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->matchesTyped(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 91
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    return-object p0

    :cond_25
    return-object v0
.end method

.method public final untypedValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_buckets:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/TypeKey;->untypedHash(Lcom/fasterxml/jackson/databind/JavaType;)I

    move-result v1

    iget p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_mask:I

    and-int/2addr p0, v1

    aget-object p0, v0, p0

    const/4 v0, 0x0

    if-nez p0, :cond_f

    return-object v0

    .line 103
    :cond_f
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->matchesUntyped(Lcom/fasterxml/jackson/databind/JavaType;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 104
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    return-object p0

    .line 106
    :cond_18
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->next:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    if-eqz p0, :cond_25

    .line 107
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->matchesUntyped(Lcom/fasterxml/jackson/databind/JavaType;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 108
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    return-object p0

    :cond_25
    return-object v0
.end method

.method public final untypedValueSerializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_buckets:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/TypeKey;->untypedHash(Ljava/lang/Class;)I

    move-result v1

    iget p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->_mask:I

    and-int/2addr p0, v1

    aget-object p0, v0, p0

    const/4 v0, 0x0

    if-nez p0, :cond_f

    return-object v0

    .line 120
    :cond_f
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->matchesUntyped(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 121
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    return-object p0

    .line 123
    :cond_18
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->next:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    if-eqz p0, :cond_25

    .line 124
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->matchesUntyped(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 125
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    return-object p0

    :cond_25
    return-object v0
.end method

###### Class com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.Bucket (com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket)
.class final Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Bucket"
.end annotation


# instance fields
.field protected final _class:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _isTyped:Z

.field protected final _type:Lcom/fasterxml/jackson/databind/JavaType;

.field public final next:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

.field public final value:Lcom/fasterxml/jackson/databind/JsonSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;Lcom/fasterxml/jackson/databind/util/TypeKey;Lcom/fasterxml/jackson/databind/JsonSerializer;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;",
            "Lcom/fasterxml/jackson/databind/util/TypeKey;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->next:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    .line 150
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->value:Lcom/fasterxml/jackson/databind/JsonSerializer;

    .line 151
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/util/TypeKey;->isTyped()Z

    move-result p1

    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_isTyped:Z

    .line 152
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/util/TypeKey;->getRawType()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_class:Ljava/lang/Class;

    .line 153
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/util/TypeKey;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    return-void
.end method


# virtual methods
.method public final matchesTyped(Lcom/fasterxml/jackson/databind/JavaType;)Z
    .registers 3

    .line 165
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_isTyped:Z

    if-eqz v0, :cond_e

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method public final matchesTyped(Ljava/lang/Class;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_class:Ljava/lang/Class;

    if-ne v0, p1, :cond_a

    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_isTyped:Z

    if-eqz p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public final matchesUntyped(Lcom/fasterxml/jackson/databind/JavaType;)Z
    .registers 3

    .line 169
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_isTyped:Z

    if-nez v0, :cond_e

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method public final matchesUntyped(Ljava/lang/Class;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_class:Ljava/lang/Class;

    if-ne v0, p1, :cond_a

    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;->_isTyped:Z

    if-nez p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

###### Class com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0 (com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0)
.class public final synthetic Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic f$0:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;

.field public final synthetic f$1:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;


# direct methods
.method public synthetic constructor <init>(Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0;->f$0:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0;->f$1:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 4

    .line 0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0;->f$0:Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0;->f$1:[Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;

    check-cast p1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    check-cast p2, Lcom/fasterxml/jackson/databind/JsonSerializer;

    invoke-virtual {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->lambda$new$0$com-fasterxml-jackson-databind-ser-impl-ReadOnlyClassToSerializerMap([Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap$Bucket;Lcom/fasterxml/jackson/databind/util/TypeKey;Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    return-void
.end method
