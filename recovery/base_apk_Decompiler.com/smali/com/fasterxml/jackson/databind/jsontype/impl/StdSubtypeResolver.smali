###### Class com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver (com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)
.class public Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;
.super Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected _registeredSubtypes:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 24
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;-><init>()V

    return-void
.end method


# virtual methods
.method protected _collectAndResolve(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Ljava/util/HashMap;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;",
            "Ljava/util/HashMap<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;)V"
        }
    .end annotation

    .line 241
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->hasName()Z

    move-result v0

    if-nez v0, :cond_16

    .line 242
    invoke-virtual {p4, p1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findTypeName(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 244
    new-instance v1, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {v1, p2, v0}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    move-object p2, v1

    .line 250
    :cond_16
    new-instance v0, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;-><init>(Ljava/lang/Class;)V

    .line 253
    invoke-virtual {p5, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3b

    .line 255
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->hasName()Z

    move-result p0

    if-eqz p0, :cond_6b

    .line 256
    invoke-virtual {p5, v0}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 257
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->hasName()Z

    move-result p0

    if-nez p0, :cond_6b

    .line 258
    invoke-virtual {p5, v0, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 264
    :cond_3b
    invoke-virtual {p5, v0, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    invoke-virtual {p4, p1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findSubtypes(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_6b

    .line 266
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_6b

    .line 267
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 269
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object p2

    .line 268
    invoke-static {p3, p2}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v1

    move-object v0, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 270
    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolve(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Ljava/util/HashMap;)V

    goto :goto_4e

    :cond_6b
    return-void
.end method

.method protected _collectAndResolveByTypeId(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/util/Set;Ljava/util/Map;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;)V"
        }
    .end annotation

    .line 283
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v0

    .line 284
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->hasName()Z

    move-result v1

    if-nez v1, :cond_1a

    .line 285
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findTypeName(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1a

    .line 287
    new-instance v2, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {v2, p2, v1}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    move-object p2, v2

    .line 290
    :cond_1a
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->hasName()Z

    move-result v1

    if-eqz v1, :cond_27

    .line 291
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p5, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    :cond_27
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object p2

    invoke-interface {p4, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5e

    .line 296
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findSubtypes(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5e

    .line 297
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5e

    .line 298
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_41
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 300
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object p2

    .line 299
    invoke-static {p3, p2}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v1

    move-object v0, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 301
    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolveByTypeId(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/util/Set;Ljava/util/Map;)V

    goto :goto_41

    :cond_5e
    return-void
.end method

.method protected _combineNamedAndUnnamed(Ljava/lang/Class;Ljava/util/Set;Ljava/util/Map;)Ljava/util/Collection;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;)",
            "Ljava/util/Collection<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;"
        }
    .end annotation

    .line 314
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 319
    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_11
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 320
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_11

    .line 322
    :cond_25
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_29
    :goto_29
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Class;

    if-ne p3, p1, :cond_41

    .line 325
    invoke-virtual {p3}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-nez v0, :cond_29

    .line 328
    :cond_41
    new-instance v0, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    invoke-direct {v0, p3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_29

    :cond_4a
    return-object p0
.end method

.method public collectAndResolveSubtypesByClass(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Ljava/util/Collection;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Ljava/util/Collection<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;"
        }
    .end annotation

    .line 135
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v6

    .line 136
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 139
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_registeredSubtypes:Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_3e

    .line 140
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object v8

    .line 141
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_registeredSubtypes:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_17
    :goto_17
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 143
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 145
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    .line 144
    invoke-static {p1, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v1

    move-object v0, p0

    move-object v3, p1

    move-object v4, v6

    move-object v5, v7

    .line 146
    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolve(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Ljava/util/HashMap;)V

    goto :goto_17

    .line 151
    :cond_3e
    new-instance v2, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p2

    move-object v3, p1

    move-object v4, v6

    move-object v5, v7

    .line 152
    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolve(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Ljava/util/HashMap;)V

    .line 153
    new-instance p0, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method public collectAndResolveSubtypesByClass(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/util/Collection;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Ljava/util/Collection<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;"
        }
    .end annotation

    .line 85
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v6

    if-eqz p3, :cond_b

    .line 90
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p3

    goto :goto_11

    :cond_b
    if-eqz p2, :cond_89

    .line 92
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object p3

    .line 97
    :goto_11
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 99
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_registeredSubtypes:Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_45

    .line 100
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1e
    :goto_1e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_45

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 102
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 104
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    .line 103
    invoke-static {p1, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v1

    move-object v0, p0

    move-object v3, p1

    move-object v4, v6

    move-object v5, v7

    .line 105
    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolve(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Ljava/util/HashMap;)V

    goto :goto_1e

    :cond_45
    if-eqz p2, :cond_6e

    .line 112
    invoke-virtual {v6, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findSubtypes(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_6e

    .line 114
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_51
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 116
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    .line 115
    invoke-static {p1, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v1

    move-object v0, p0

    move-object v3, p1

    move-object v4, v6

    move-object v5, v7

    .line 117
    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolve(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Ljava/util/HashMap;)V

    goto :goto_51

    .line 122
    :cond_6e
    new-instance v2, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    const/4 p2, 0x0

    invoke-direct {v2, p3, p2}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 123
    invoke-static {p1, p3}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v1

    move-object v0, p0

    move-object v3, p1

    move-object v4, v6

    move-object v5, v7

    .line 126
    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolve(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Ljava/util/HashMap;)V

    .line 128
    new-instance p0, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0

    .line 94
    :cond_89
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Both property and base type are nulls"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public collectAndResolveSubtypesByTypeId(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Ljava/util/Collection;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Ljava/util/Collection<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;"
        }
    .end annotation

    .line 207
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object v0

    .line 208
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 209
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 211
    new-instance v3, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v1, p0

    move-object v2, p2

    move-object v4, p1

    move-object v5, v7

    move-object v6, v8

    .line 212
    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolveByTypeId(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/util/Set;Ljava/util/Map;)V

    .line 214
    iget-object p2, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_registeredSubtypes:Ljava/util/LinkedHashSet;

    if-eqz p2, :cond_4b

    .line 215
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_24
    :goto_24
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 217
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_24

    .line 219
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v1

    .line 218
    invoke-static {p1, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v2

    move-object v1, p0

    move-object v4, p1

    move-object v5, v7

    move-object v6, v8

    .line 220
    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolveByTypeId(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/util/Set;Ljava/util/Map;)V

    goto :goto_24

    .line 224
    :cond_4b
    invoke-virtual {p0, v0, v7, v8}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_combineNamedAndUnnamed(Ljava/lang/Class;Ljava/util/Set;Ljava/util/Map;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public collectAndResolveSubtypesByTypeId(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/util/Collection;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Ljava/util/Collection<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;"
        }
    .end annotation

    .line 166
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v0

    .line 167
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p3

    .line 170
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 171
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 174
    new-instance v3, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    const/4 v1, 0x0

    invoke-direct {v3, p3, v1}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 175
    invoke-static {p1, p3}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v2

    move-object v1, p0

    move-object v4, p1

    move-object v5, v7

    move-object v6, v8

    .line 177
    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolveByTypeId(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/util/Set;Ljava/util/Map;)V

    if-eqz p2, :cond_4c

    .line 181
    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findSubtypes(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4c

    .line 183
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2f
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 184
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v2

    move-object v1, p0

    move-object v4, p1

    move-object v5, v7

    move-object v6, v8

    .line 185
    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolveByTypeId(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/util/Set;Ljava/util/Map;)V

    goto :goto_2f

    .line 190
    :cond_4c
    iget-object p2, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_registeredSubtypes:Ljava/util/LinkedHashSet;

    if-eqz p2, :cond_7b

    .line 191
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_54
    :goto_54
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    .line 193
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_54

    .line 195
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/jsontype/NamedType;->getType()Ljava/lang/Class;

    move-result-object v0

    .line 194
    invoke-static {p1, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClassResolver;->resolveWithoutSuperTypes(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v2

    move-object v1, p0

    move-object v4, p1

    move-object v5, v7

    move-object v6, v8

    .line 196
    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_collectAndResolveByTypeId(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/jsontype/NamedType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/util/Set;Ljava/util/Map;)V

    goto :goto_54

    .line 200
    :cond_7b
    invoke-virtual {p0, p3, v7, v8}, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_combineNamedAndUnnamed(Ljava/lang/Class;Ljava/util/Set;Ljava/util/Map;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public varargs registerSubtypes([Lcom/fasterxml/jackson/databind/jsontype/NamedType;)V
    .registers 6

    .line 47
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_registeredSubtypes:Ljava/util/LinkedHashSet;

    if-nez v0, :cond_b

    .line 48
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_registeredSubtypes:Ljava/util/LinkedHashSet;

    .line 50
    :cond_b
    array-length v0, p1

    const/4 v1, 0x0

    :goto_d
    if-ge v1, v0, :cond_19

    aget-object v2, p1, v1

    .line 51
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/jsontype/impl/StdSubtypeResolver;->_registeredSubtypes:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_19
    return-void
.end method
