###### Class com.fasterxml.jackson.databind.ser.SerializerCache (com.fasterxml.jackson.databind.ser.SerializerCache)
.class public final Lcom/fasterxml/jackson/databind/ser/SerializerCache;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final _readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;",
            ">;"
        }
    .end annotation
.end field

.field private final _sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/util/LRUMap<",
            "Lcom/fasterxml/jackson/databind/util/TypeKey;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    const/16 v0, 0xfa0

    .line 47
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/ser/SerializerCache;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 4

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    shr-int/lit8 v0, p1, 0x2

    const/16 v1, 0x40

    .line 51
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 52
    new-instance v1, Lcom/fasterxml/jackson/databind/util/LRUMap;

    invoke-direct {v1, v0, p1}, Lcom/fasterxml/jackson/databind/util/LRUMap;-><init>(II)V

    iput-object v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    .line 53
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private final _makeReadOnlyLookupMap()Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;
    .registers 3

    monitor-enter p0

    .line 72
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;

    if-nez v0, :cond_16

    .line 74
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    invoke-static {v0}, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;->from(Lcom/fasterxml/jackson/databind/util/LRUMap;)Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_18

    .line 77
    :cond_16
    monitor-exit p0

    return-object v0

    :catchall_18
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final addAndResolveNonTypedSerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 176
    monitor-enter p0

    .line 177
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Lcom/fasterxml/jackson/databind/JavaType;Z)V

    invoke-virtual {v0, v1, p2}, Lcom/fasterxml/jackson/databind/util/LRUMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_15

    .line 178
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_20

    .line 185
    :cond_15
    instance-of p1, p2, Lcom/fasterxml/jackson/databind/ser/ResolvableSerializer;

    if-eqz p1, :cond_1e

    .line 186
    :try_start_19
    check-cast p2, Lcom/fasterxml/jackson/databind/ser/ResolvableSerializer;

    invoke-interface {p2, p3}, Lcom/fasterxml/jackson/databind/ser/ResolvableSerializer;->resolve(Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    :try_end_1e
    .catchall {:try_start_19 .. :try_end_1e} :catchall_20

    .line 188
    :cond_1e
    monitor-exit p0

    return-void

    :catchall_20
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final addAndResolveNonTypedSerializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 202
    monitor-enter p0

    .line 203
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Ljava/lang/Class;Z)V

    invoke-virtual {v0, v1, p3}, Lcom/fasterxml/jackson/databind/util/LRUMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 204
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    invoke-direct {v1, p2, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Lcom/fasterxml/jackson/databind/JavaType;Z)V

    invoke-virtual {v0, v1, p3}, Lcom/fasterxml/jackson/databind/util/LRUMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_1c

    if-nez p2, :cond_22

    .line 206
    :cond_1c
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_22
    .catchall {:try_start_1 .. :try_end_22} :catchall_2d

    .line 208
    :cond_22
    instance-of p1, p3, Lcom/fasterxml/jackson/databind/ser/ResolvableSerializer;

    if-eqz p1, :cond_2b

    .line 209
    :try_start_26
    check-cast p3, Lcom/fasterxml/jackson/databind/ser/ResolvableSerializer;

    invoke-interface {p3, p4}, Lcom/fasterxml/jackson/databind/ser/ResolvableSerializer;->resolve(Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    :try_end_2b
    .catchall {:try_start_26 .. :try_end_2b} :catchall_2d

    .line 211
    :cond_2b
    monitor-exit p0

    return-void

    :catchall_2d
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final addTypedSerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonSerializer;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 135
    monitor-enter p0

    .line 136
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Lcom/fasterxml/jackson/databind/JavaType;Z)V

    invoke-virtual {v0, v1, p2}, Lcom/fasterxml/jackson/databind/util/LRUMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_15

    .line 138
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_17

    .line 140
    :cond_15
    monitor-exit p0

    return-void

    :catchall_17
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final addTypedSerializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonSerializer;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 145
    monitor-enter p0

    .line 146
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Ljava/lang/Class;Z)V

    invoke-virtual {v0, v1, p2}, Lcom/fasterxml/jackson/databind/util/LRUMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_15

    .line 148
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_17

    .line 150
    :cond_15
    monitor-exit p0

    return-void

    :catchall_17
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final getReadOnlyLookupMap()Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;
    .registers 2

    .line 62
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_readOnlyMap:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;

    if-eqz v0, :cond_b

    return-object v0

    .line 66
    :cond_b
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_makeReadOnlyLookupMap()Lcom/fasterxml/jackson/databind/ser/impl/ReadOnlyClassToSerializerMap;

    move-result-object p0

    return-object p0
.end method

.method public final typedValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 5
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

    .line 110
    monitor-enter p0

    .line 111
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Lcom/fasterxml/jackson/databind/JavaType;Z)V

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/util/LRUMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonSerializer;

    monitor-exit p0
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_11

    return-object p1

    :catchall_11
    move-exception p1

    .line 112
    monitor-exit p0

    throw p1
.end method

.method public final typedValueSerializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 5
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

    .line 117
    monitor-enter p0

    .line 118
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Ljava/lang/Class;Z)V

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/util/LRUMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonSerializer;

    monitor-exit p0
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_11

    return-object p1

    :catchall_11
    move-exception p1

    .line 119
    monitor-exit p0

    throw p1
.end method

.method public final untypedValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 5
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

    .line 103
    monitor-enter p0

    .line 104
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Lcom/fasterxml/jackson/databind/JavaType;Z)V

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/util/LRUMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonSerializer;

    monitor-exit p0
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_11

    return-object p1

    :catchall_11
    move-exception p1

    .line 105
    monitor-exit p0

    throw p1
.end method

.method public final untypedValueSerializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 5
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

    .line 96
    monitor-enter p0

    .line 97
    :try_start_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache;->_sharedMap:Lcom/fasterxml/jackson/databind/util/LRUMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/util/TypeKey;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/fasterxml/jackson/databind/util/TypeKey;-><init>(Ljava/lang/Class;Z)V

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/util/LRUMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonSerializer;

    monitor-exit p0
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_11

    return-object p1

    :catchall_11
    move-exception p1

    .line 98
    monitor-exit p0

    throw p1
.end method
