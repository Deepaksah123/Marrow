###### Class com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver (com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver)
.class public Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;
.super Lcom/fasterxml/jackson/databind/jsontype/impl/TypeIdResolverBase;
.source "SourceFile"


# instance fields
.field protected final _caseInsensitive:Z

.field protected final _config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _idToType:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ">;"
        }
    .end annotation
.end field

.field protected final _typeToId:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/HashMap;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeIdResolverBase;-><init>(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/type/TypeFactory;)V

    .line 43
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    .line 44
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_typeToId:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_idToType:Ljava/util/Map;

    .line 46
    sget-object p2, Lcom/fasterxml/jackson/databind/MapperFeature;->ACCEPT_CASE_INSENSITIVE_VALUES:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_caseInsensitive:Z

    return-void
.end method

.method protected static _defaultTypeId(Ljava/lang/Class;)Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 195
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2e

    .line 196
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-gez v0, :cond_d

    return-object p0

    :cond_d
    add-int/lit8 v0, v0, 0x1

    .line 197
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static construct(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Ljava/util/Collection;ZZ)Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Ljava/util/Collection<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;ZZ)",
            "Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;"
        }
    .end annotation

    if-eq p3, p4, :cond_72

    if-eqz p3, :cond_b

    .line 61
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    const/4 v1, 0x0

    goto :goto_16

    .line 64
    :cond_b
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 68
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 70
    :goto_16
    sget-object v2, Lcom/fasterxml/jackson/databind/MapperFeature;->ACCEPT_CASE_INSENSITIVE_VALUES:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v2

    if-eqz p2, :cond_6c

    .line 73
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_22
    :goto_22
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 76
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v4

    .line 77
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->hasName()Z

    move-result v5

    if-eqz v5, :cond_3d

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_41

    :cond_3d
    invoke-static {v4}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_defaultTypeId(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    :goto_41
    if-eqz p3, :cond_4a

    .line 79
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4a
    if-eqz p4, :cond_22

    if-eqz v2, :cond_52

    .line 84
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 88
    :cond_52
    invoke-virtual {v1, v3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/fasterxml/jackson/databind/JavaType;

    if-eqz v5, :cond_64

    .line 90
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_22

    .line 94
    :cond_64
    invoke-virtual {p0, v4}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_22

    .line 98
    :cond_6c
    new-instance p2, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;

    invoke-direct {p2, p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;-><init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/HashMap;)V

    return-object p2

    .line 53
    :cond_72
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method


# virtual methods
.method protected _typeFromId(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JavaType;
    .registers 3

    .line 155
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_caseInsensitive:Z

    if-eqz v0, :cond_8

    .line 156
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 162
    :cond_8
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_idToType:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JavaType;

    return-object p0
.end method

.method public getDescForKnownTypeIds()Ljava/lang/String;
    .registers 4

    .line 169
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 170
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_idToType:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_f
    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 171
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JavaType;->isConcrete()Z

    move-result v2

    if-eqz v2, :cond_f

    .line 172
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 175
    :cond_2f
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected idFromClass(Ljava/lang/Class;)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p1, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 116
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 117
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_typeToId:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_44

    .line 122
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeIdResolverBase;->_typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    invoke-virtual {v2, p1}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p1

    .line 125
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isAnnotationProcessingEnabled()Z

    move-result v2

    if-eqz v2, :cond_38

    .line 126
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    invoke-virtual {v1, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->introspectClassAnnotations(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/BeanDescription;

    move-result-object v1

    .line 127
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v2

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/BeanDescription;->getClassInfo()Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findTypeName(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Ljava/lang/String;

    move-result-object v1

    :cond_38
    if-nez v1, :cond_3f

    .line 131
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_defaultTypeId(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    move-object v1, p1

    .line 133
    :cond_3f
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_typeToId:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, v0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_44
    return-object v1
.end method

.method public idFromValue(Ljava/lang/Object;)Ljava/lang/String;
    .registers 2

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->idFromClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public idFromValueAndType(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p1, :cond_7

    .line 143
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->idFromClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 145
    :cond_7
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->idFromValue(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_idToType:Ljava/util/Map;

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "[%s; id-to-type=%s]"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public typeFromId(Lcom/fasterxml/jackson/databind/DatabindContext;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JavaType;
    .registers 3

    .line 150
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/jsontype/impl/TypeNameIdResolver;->_typeFromId(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    return-object p0
.end method
