###### Class com.fasterxml.jackson.databind.introspect.MethodGenericTypeResolver (com.fasterxml.jackson.databind.introspect.MethodGenericTypeResolver)
.class final Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bindMethodTypeParameters(Ljava/lang/reflect/Method;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;)Lcom/fasterxml/jackson/databind/type/TypeBindings;
    .registers 12

    .line 56
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    .line 57
    array-length v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_b1

    .line 59
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getBindings()Lcom/fasterxml/jackson/databind/type/TypeBindings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b1

    .line 63
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object p0

    .line 64
    instance-of v1, p0, Ljava/lang/reflect/ParameterizedType;

    if-nez v1, :cond_1b

    return-object v2

    .line 70
    :cond_1b
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 73
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return-object v2

    .line 81
    :cond_2c
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    .line 82
    new-instance v1, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v0

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    .line 84
    :goto_3d
    array-length v5, p0

    if-ge v4, v5, :cond_a5

    .line 85
    aget-object v5, p0, v4

    .line 88
    invoke-static {v5}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->maybeGetTypeVariable(Ljava/lang/reflect/Type;)Ljava/lang/reflect/TypeVariable;

    move-result-object v5

    if-eqz v5, :cond_a2

    .line 90
    invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4f

    return-object v2

    .line 95
    :cond_4f
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getBindings()Lcom/fasterxml/jackson/databind/type/TypeBindings;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->getBoundType(I)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v6

    if-nez v6, :cond_5a

    return-object v2

    .line 101
    :cond_5a
    invoke-static {v0, v5}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->findByName([Ljava/lang/reflect/TypeVariable;Ljava/lang/String;)Ljava/lang/reflect/TypeVariable;

    move-result-object v7

    if-nez v7, :cond_61

    return-object v2

    .line 105
    :cond_61
    invoke-interface {v7}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {p2, v6, v7}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->pessimisticallyValidateBounds(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Lcom/fasterxml/jackson/databind/JavaType;[Ljava/lang/reflect/Type;)Z

    move-result v7

    if-eqz v7, :cond_a2

    .line 107
    invoke-virtual {v1, v5}, Ljava/util/AbstractList;->indexOf(Ljava/lang/Object;)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_9c

    .line 109
    invoke-virtual {v3, v7}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/fasterxml/jackson/databind/JavaType;

    .line 110
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a2

    .line 113
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/fasterxml/jackson/databind/JavaType;->isTypeOrSubTypeOf(Ljava/lang/Class;)Z

    move-result v8

    .line 114
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/fasterxml/jackson/databind/JavaType;->isTypeOrSubTypeOf(Ljava/lang/Class;)Z

    move-result v5

    if-nez v8, :cond_93

    if-nez v5, :cond_93

    return-object v2

    :cond_93
    xor-int/2addr v8, v5

    if-eqz v8, :cond_a2

    if-eqz v5, :cond_a2

    .line 121
    invoke-virtual {v3, v7, v6}, Ljava/util/AbstractList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_a2

    .line 124
    :cond_9c
    invoke-virtual {v1, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 125
    invoke-virtual {v3, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_a2
    :goto_a2
    add-int/lit8 v4, v4, 0x1

    goto :goto_3d

    .line 131
    :cond_a5
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_ac

    return-object v2

    .line 134
    :cond_ac
    invoke-static {v1, v3}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->create(Ljava/util/List;Ljava/util/List;)Lcom/fasterxml/jackson/databind/type/TypeBindings;

    move-result-object p0

    return-object p0

    :cond_b1
    return-object v2
.end method

.method private static findByName([Ljava/lang/reflect/TypeVariable;Ljava/lang/String;)Ljava/lang/reflect/TypeVariable;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation

    if-eqz p0, :cond_18

    if-eqz p1, :cond_18

    .line 217
    array-length v0, p0

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v0, :cond_18

    aget-object v2, p0, v1

    .line 218
    invoke-interface {v2}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    return-object v2

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_18
    const/4 p0, 0x0

    return-object p0
.end method

.method private static maybeGetParameterizedType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;
    .registers 4

    .line 159
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_7

    .line 160
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    return-object p0

    .line 163
    :cond_7
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    const/4 v1, 0x0

    if-eqz v0, :cond_26

    .line 164
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 166
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_16

    return-object v1

    .line 169
    :cond_16
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    .line 170
    array-length v0, p0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_26

    const/4 v0, 0x0

    .line 171
    aget-object p0, p0, v0

    invoke-static {p0}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->maybeGetParameterizedType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object p0

    return-object p0

    :cond_26
    return-object v1
.end method

.method private static maybeGetTypeVariable(Ljava/lang/reflect/Type;)Ljava/lang/reflect/TypeVariable;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation

    .line 139
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_7

    .line 140
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    return-object p0

    .line 143
    :cond_7
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    const/4 v1, 0x0

    if-eqz v0, :cond_26

    .line 144
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 146
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_16

    return-object v1

    .line 149
    :cond_16
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    .line 150
    array-length v0, p0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_26

    const/4 v0, 0x0

    .line 151
    aget-object p0, p0, v0

    invoke-static {p0}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->maybeGetTypeVariable(Ljava/lang/reflect/Type;)Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    return-object p0

    :cond_26
    return-object v1
.end method

.method public static narrowMethodTypeParameters(Ljava/lang/reflect/Method;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;)Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;
    .registers 4

    .line 42
    invoke-static {p0, p1, p3}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->bindMethodTypeParameters(Ljava/lang/reflect/Method;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;)Lcom/fasterxml/jackson/databind/type/TypeBindings;

    move-result-object p0

    if-nez p0, :cond_7

    return-object p3

    .line 43
    :cond_7
    new-instance p1, Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext$Basic;

    invoke-direct {p1, p2, p0}, Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext$Basic;-><init>(Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/type/TypeBindings;)V

    return-object p1
.end method

.method private static pessimisticallyValidateBound(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/reflect/Type;)Z
    .registers 7

    .line 189
    invoke-interface {p0, p2}, Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;->resolveType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JavaType;->isTypeOrSubTypeOf(Ljava/lang/Class;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_10

    return v1

    .line 192
    :cond_10
    invoke-static {p2}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->maybeGetParameterizedType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object p2

    if-eqz p2, :cond_4b

    .line 196
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4b

    .line 197
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p2

    .line 198
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getBindings()Lcom/fasterxml/jackson/databind/type/TypeBindings;

    move-result-object p1

    .line 199
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->size()I

    move-result v0

    array-length v2, p2

    if-eq v0, v2, :cond_34

    return v1

    :cond_34
    move v0, v1

    .line 202
    :goto_35
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->size()I

    move-result v2

    if-ge v0, v2, :cond_4b

    .line 203
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->getBoundType(I)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    .line 204
    aget-object v3, p2, v0

    .line 205
    invoke-static {p0, v2, v3}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->pessimisticallyValidateBound(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/reflect/Type;)Z

    move-result v2

    if-nez v2, :cond_48

    return v1

    :cond_48
    add-int/lit8 v0, v0, 0x1

    goto :goto_35

    :cond_4b
    const/4 p0, 0x1

    return p0
.end method

.method private static pessimisticallyValidateBounds(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Lcom/fasterxml/jackson/databind/JavaType;[Ljava/lang/reflect/Type;)Z
    .registers 7

    .line 179
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_3
    if-ge v2, v0, :cond_11

    aget-object v3, p2, v2

    .line 180
    invoke-static {p0, p1, v3}, Lcom/fasterxml/jackson/databind/introspect/MethodGenericTypeResolver;->pessimisticallyValidateBound(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/reflect/Type;)Z

    move-result v3

    if-nez v3, :cond_e

    return v1

    :cond_e
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_11
    const/4 p0, 0x1

    return p0
.end method
