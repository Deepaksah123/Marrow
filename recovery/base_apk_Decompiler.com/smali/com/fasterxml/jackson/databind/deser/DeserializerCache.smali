###### Class com.fasterxml.jackson.databind.deser.DeserializerCache (com.fasterxml.jackson.databind.deser.DeserializerCache)
.class public final Lcom/fasterxml/jackson/databind/deser/DeserializerCache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected final _cachedDeserializers:Lcom/fasterxml/jackson/databind/util/LRUMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/util/LRUMap<",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field protected final _incompleteDeserializers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    const/16 v0, 0x7d0

    .line 54
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 4

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    shr-int/lit8 v0, p1, 0x2

    const/16 v1, 0x40

    .line 58
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 59
    new-instance v1, Lcom/fasterxml/jackson/databind/util/LRUMap;

    invoke-direct {v1, v0, p1}, Lcom/fasterxml/jackson/databind/util/LRUMap;-><init>(II)V

    iput-object v1, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_cachedDeserializers:Lcom/fasterxml/jackson/databind/util/LRUMap;

    return-void
.end method

.method private _hasCustomHandlers(Lcom/fasterxml/jackson/databind/JavaType;)Z
    .registers 4

    .line 549
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->isContainerType()Z

    move-result p0

    if-eqz p0, :cond_2b

    .line 551
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getContentType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    const/4 v0, 0x1

    if-eqz p0, :cond_1a

    .line 553
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JavaType;->getValueHandler()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_19

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JavaType;->getTypeHandler()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1a

    :cond_19
    return v0

    .line 558
    :cond_1a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->isMapLikeType()Z

    move-result p0

    if-eqz p0, :cond_2b

    .line 559
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getKeyType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    .line 560
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JavaType;->getValueHandler()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2b

    return v0

    :cond_2b
    const/4 p0, 0x0

    return p0
.end method

.method private _verifyAsClass(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const/4 p0, 0x0

    if-nez p1, :cond_4

    return-object p0

    .line 573
    :cond_4
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_14

    .line 576
    check-cast p1, Ljava/lang/Class;

    if-eq p1, p3, :cond_13

    .line 577
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->isBogusClass(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_13

    return-object p1

    :cond_13
    return-object p0

    .line 574
    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "AnnotationIntrospector."

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "() returned value of type "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": expected type JsonSerializer or Class<JsonSerializer> instead"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private modifyTypeByAnnotation(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JavaType;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 484
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v0

    if-nez v0, :cond_7

    return-object p3

    .line 492
    :cond_7
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isMapLikeType()Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 493
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->getKeyType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v1

    if-eqz v1, :cond_2b

    .line 497
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JavaType;->getValueHandler()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2b

    .line 498
    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findKeyDeserializer(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2b

    .line 500
    invoke-virtual {p1, p2, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->keyDeserializerInstance(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object v1

    if-eqz v1, :cond_2b

    .line 502
    check-cast p3, Lcom/fasterxml/jackson/databind/type/MapLikeType;

    invoke-virtual {p3, v1}, Lcom/fasterxml/jackson/databind/type/MapLikeType;->withKeyValueHandler(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/type/MapLikeType;

    move-result-object p3

    .line 508
    :cond_2b
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->getContentType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v1

    if-eqz v1, :cond_5a

    .line 510
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JavaType;->getValueHandler()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5a

    .line 511
    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findContentDeserializer(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5a

    .line 514
    instance-of v2, v1, Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-eqz v2, :cond_44

    .line 515
    check-cast v1, Lcom/fasterxml/jackson/databind/JsonDeserializer;

    goto :goto_54

    .line 517
    :cond_44
    const-string v2, "findContentDeserializer"

    const-class v3, Lcom/fasterxml/jackson/databind/JsonDeserializer$None;

    invoke-direct {p0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_verifyAsClass(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_53

    .line 519
    invoke-virtual {p1, p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->deserializerInstance(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v1

    goto :goto_54

    :cond_53
    const/4 v1, 0x0

    :goto_54
    if-eqz v1, :cond_5a

    .line 523
    invoke-virtual {p3, v1}, Lcom/fasterxml/jackson/databind/JavaType;->withContentValueHandler(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p3

    .line 531
    :cond_5a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object p0

    invoke-virtual {v0, p0, p2, p3}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->refineDeserializationType(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected final _createAndCache2(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 264
    :try_start_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_createDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p2
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_5} :catch_6

    goto :goto_f

    :catch_6
    move-exception p2

    .line 268
    invoke-static {p2}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->exceptionMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/fasterxml/jackson/databind/DatabindContext;->reportBadDefinition(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Ljava/lang/Object;

    move-object p2, v0

    :goto_f
    if-nez p2, :cond_12

    return-object v0

    .line 278
    :cond_12
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_hasCustomHandlers(Lcom/fasterxml/jackson/databind/JavaType;)Z

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->isCachable()Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 v0, 0x1

    goto :goto_21

    :cond_20
    const/4 v0, 0x0

    .line 292
    :goto_21
    instance-of v1, p2, Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;

    if-eqz v1, :cond_35

    .line 293
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {v1, p3, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    move-object v1, p2

    check-cast v1, Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;

    invoke-interface {v1, p1}, Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;->resolve(Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    .line 295
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {p1, p3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_35
    if-eqz v0, :cond_3c

    .line 298
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_cachedDeserializers:Lcom/fasterxml/jackson/databind/util/LRUMap;

    invoke-virtual {p0, p3, p2}, Lcom/fasterxml/jackson/databind/util/LRUMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3c
    return-object p2
.end method

.method protected final _createAndCacheValueDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 228
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    monitor-enter v0

    .line 230
    :try_start_3
    invoke-virtual {p0, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_findCachedDeserializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_3 .. :try_end_7} :catchall_45

    if-eqz v1, :cond_b

    .line 232
    monitor-exit v0

    return-object v1

    .line 234
    :cond_b
    :try_start_b
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    if-lez v1, :cond_1f

    .line 237
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {v2, p3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/databind/JsonDeserializer;
    :try_end_1b
    .catchall {:try_start_b .. :try_end_1b} :catchall_45

    if-eqz v2, :cond_1f

    .line 239
    monitor-exit v0

    return-object v2

    .line 244
    :cond_1f
    :try_start_1f
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_createAndCache2(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p1
    :try_end_23
    .catchall {:try_start_1f .. :try_end_23} :catchall_34

    if-nez v1, :cond_32

    .line 247
    :try_start_25
    iget-object p2, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    move-result p2

    if-lez p2, :cond_32

    .line 248
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->clear()V
    :try_end_32
    .catchall {:try_start_25 .. :try_end_32} :catchall_45

    :cond_32
    monitor-exit v0

    return-object p1

    :catchall_34
    move-exception p1

    if-nez v1, :cond_44

    .line 247
    :try_start_37
    iget-object p2, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    move-result p2

    if-lez p2, :cond_44

    .line 248
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->clear()V

    .line 250
    :cond_44
    throw p1
    :try_end_45
    .catchall {:try_start_37 .. :try_end_45} :catchall_45

    :catchall_45
    move-exception p0

    .line 251
    monitor-exit v0

    throw p0
.end method

.method protected final _createDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 319
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object v0

    .line 322
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isAbstract()Z

    move-result v1

    if-nez v1, :cond_16

    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isMapLikeType()Z

    move-result v1

    if-nez v1, :cond_16

    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isCollectionLikeType()Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 323
    :cond_16
    invoke-virtual {p2, v0, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->mapAbstractType(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p3

    .line 325
    :cond_1a
    invoke-virtual {v0, p3}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->introspect(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/BeanDescription;

    move-result-object v1

    .line 328
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/BeanDescription;->getClassInfo()Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v2

    .line 327
    invoke-virtual {p0, p1, v2}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->findDeserializerFromAnnotation(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v2

    if-eqz v2, :cond_29

    return-object v2

    .line 334
    :cond_29
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/BeanDescription;->getClassInfo()Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v2

    invoke-direct {p0, p1, v2, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->modifyTypeByAnnotation(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    if-eq v2, p3, :cond_38

    .line 337
    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->introspect(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/BeanDescription;

    move-result-object v1

    move-object p3, v2

    .line 341
    :cond_38
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/BeanDescription;->findPOJOBuilder()Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_43

    .line 343
    invoke-virtual {p2, p1, p3, v1, v2}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createBuilderBasedDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 348
    :cond_43
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/BeanDescription;->findDeserializationConverter()Lcom/fasterxml/jackson/databind/util/Converter;

    move-result-object v2

    if-nez v2, :cond_4e

    .line 350
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_createDeserializer2(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 353
    :cond_4e
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DatabindContext;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/fasterxml/jackson/databind/util/Converter;->getInputType(Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v3

    .line 355
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {v3, p3}, Lcom/fasterxml/jackson/databind/JavaType;->hasRawClass(Ljava/lang/Class;)Z

    move-result p3

    if-nez p3, :cond_64

    .line 356
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->introspect(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/BeanDescription;

    move-result-object v1

    .line 359
    :cond_64
    new-instance p3, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;

    invoke-virtual {p0, p1, p2, v3, v1}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_createDeserializer2(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    invoke-direct {p3, v2, v3, p0}, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;-><init>(Lcom/fasterxml/jackson/databind/util/Converter;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object p3
.end method

.method protected final _createDeserializer2(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 366
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object p0

    .line 371
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isEnumType()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 372
    invoke-virtual {p2, p1, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createEnumDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 374
    :cond_f
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isContainerType()Z

    move-result v0

    if-eqz v0, :cond_6b

    .line 375
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isArrayType()Z

    move-result v0

    if-eqz v0, :cond_22

    .line 376
    check-cast p3, Lcom/fasterxml/jackson/databind/type/ArrayType;

    invoke-virtual {p2, p1, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createArrayDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/type/ArrayType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 378
    :cond_22
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isMapLikeType()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_47

    .line 384
    invoke-virtual {p4, v1}, Lcom/fasterxml/jackson/databind/BeanDescription;->findExpectedFormat(Lcom/fasterxml/jackson/annotation/JsonFormat$Value;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object v0

    .line 385
    invoke-virtual {v0}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->getShape()Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;

    move-result-object v0

    sget-object v2, Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;->OBJECT:Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;

    if-eq v0, v2, :cond_47

    .line 386
    check-cast p3, Lcom/fasterxml/jackson/databind/type/MapLikeType;

    .line 387
    instance-of p0, p3, Lcom/fasterxml/jackson/databind/type/MapType;

    if-eqz p0, :cond_42

    .line 388
    check-cast p3, Lcom/fasterxml/jackson/databind/type/MapType;

    invoke-virtual {p2, p1, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createMapDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/type/MapType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 390
    :cond_42
    invoke-virtual {p2, p1, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createMapLikeDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/type/MapLikeType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 393
    :cond_47
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->isCollectionLikeType()Z

    move-result v0

    if-eqz v0, :cond_6b

    .line 399
    invoke-virtual {p4, v1}, Lcom/fasterxml/jackson/databind/BeanDescription;->findExpectedFormat(Lcom/fasterxml/jackson/annotation/JsonFormat$Value;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object v0

    .line 400
    invoke-virtual {v0}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->getShape()Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;->OBJECT:Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;

    if-eq v0, v1, :cond_6b

    .line 401
    check-cast p3, Lcom/fasterxml/jackson/databind/type/CollectionLikeType;

    .line 402
    instance-of p0, p3, Lcom/fasterxml/jackson/databind/type/CollectionType;

    if-eqz p0, :cond_66

    .line 403
    check-cast p3, Lcom/fasterxml/jackson/databind/type/CollectionType;

    invoke-virtual {p2, p1, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createCollectionDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 405
    :cond_66
    invoke-virtual {p2, p1, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createCollectionLikeDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/type/CollectionLikeType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 409
    :cond_6b
    invoke-virtual {p3}, Lcom/fasterxml/jackson/core/type/ResolvedType;->isReferenceType()Z

    move-result v0

    if-eqz v0, :cond_78

    .line 410
    check-cast p3, Lcom/fasterxml/jackson/databind/type/ReferenceType;

    invoke-virtual {p2, p1, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createReferenceDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/type/ReferenceType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 412
    :cond_78
    const-class v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_89

    .line 413
    invoke-virtual {p2, p0, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createTreeDeserializer(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 415
    :cond_89
    invoke-virtual {p2, p1, p3, p4}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createBeanDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0
.end method

.method protected final _findCachedDeserializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_13

    .line 207
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_hasCustomHandlers(Lcom/fasterxml/jackson/databind/JavaType;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 p0, 0x0

    return-object p0

    .line 210
    :cond_a
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_cachedDeserializers:Lcom/fasterxml/jackson/databind/util/LRUMap;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/util/LRUMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonDeserializer;

    return-object p0

    .line 205
    :cond_13
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Null JavaType passed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected final _handleUnknownKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 603
    const-string p0, "Cannot find a (Map) Key deserializer for type "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lcom/fasterxml/jackson/databind/DatabindContext;->reportBadDefinition(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/KeyDeserializer;

    return-object p0
.end method

.method protected final _handleUnknownValueDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 593
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p0

    .line 594
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->isConcrete(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_1b

    .line 595
    const-string p0, "Cannot find a Value deserializer for abstract type "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lcom/fasterxml/jackson/databind/DatabindContext;->reportBadDefinition(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonDeserializer;

    return-object p0

    .line 597
    :cond_1b
    const-string p0, "Cannot find a Value deserializer for type "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lcom/fasterxml/jackson/databind/DatabindContext;->reportBadDefinition(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonDeserializer;

    return-object p0
.end method

.method protected final findConverter(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/databind/util/Converter;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/introspect/Annotated;",
            ")",
            "Lcom/fasterxml/jackson/databind/util/Converter<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 458
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findDeserializationConverter(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_c

    const/4 p0, 0x0

    return-object p0

    .line 462
    :cond_c
    invoke-virtual {p1, p2, p0}, Lcom/fasterxml/jackson/databind/DatabindContext;->converterInstance(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/util/Converter;

    move-result-object p0

    return-object p0
.end method

.method protected final findConvertingDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/introspect/Annotated;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 446
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->findConverter(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/databind/util/Converter;

    move-result-object p0

    if-nez p0, :cond_7

    return-object p3

    .line 450
    :cond_7
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DatabindContext;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/fasterxml/jackson/databind/util/Converter;->getInputType(Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    .line 451
    new-instance p2, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;

    invoke-direct {p2, p0, p1, p3}, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;-><init>(Lcom/fasterxml/jackson/databind/util/Converter;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object p2
.end method

.method protected final findDeserializerFromAnnotation(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/introspect/Annotated;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 427
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findDeserializer(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c

    const/4 p0, 0x0

    return-object p0

    .line 431
    :cond_c
    invoke-virtual {p1, p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->deserializerInstance(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v0

    .line 433
    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->findConvertingDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0
.end method

.method public final findKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 166
    invoke-virtual {p2, p1, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;->createKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object p2

    if-nez p2, :cond_b

    .line 168
    invoke-virtual {p0, p1, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_handleUnknownKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object p0

    return-object p0

    .line 171
    :cond_b
    instance-of p0, p2, Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;

    if-eqz p0, :cond_15

    .line 172
    move-object p0, p2

    check-cast p0, Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;

    invoke-interface {p0, p1}, Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;->resolve(Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    :cond_15
    return-object p2
.end method

.method public final findValueDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 139
    invoke-virtual {p0, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_findCachedDeserializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v0

    if-nez v0, :cond_12

    .line 142
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_createAndCacheValueDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p2

    if-nez p2, :cond_11

    .line 148
    invoke-virtual {p0, p1, p3}, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_handleUnknownValueDeserializer(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    :cond_11
    return-object p2

    :cond_12
    return-object v0
.end method

.method final writeReplace()Ljava/lang/Object;
    .registers 2

    .line 70
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/DeserializerCache;->_incompleteDeserializers:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->clear()V

    return-object p0
.end method
