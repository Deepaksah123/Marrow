###### Class com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers (com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers)
.class public Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static _constructCreatorKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .registers 3

    .line 127
    instance-of v0, p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    if-eqz v0, :cond_1f

    .line 128
    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;->getAnnotated()Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 129
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->canOverrideAccessModifiers()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 130
    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->OVERRIDE_PUBLIC_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    invoke-static {p1, p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->checkAndFixAccess(Ljava/lang/reflect/Member;Z)V

    .line 132
    :cond_19
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringCtorKeyDeserializer;

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringCtorKeyDeserializer;-><init>(Ljava/lang/reflect/Constructor;)V

    return-object p0

    .line 134
    :cond_1f
    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getAnnotated()Ljava/lang/reflect/Method;

    move-result-object p1

    .line 135
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->canOverrideAccessModifiers()Z

    move-result v0

    if-eqz v0, :cond_34

    .line 136
    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->OVERRIDE_PUBLIC_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    invoke-static {p1, p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->checkAndFixAccess(Ljava/lang/reflect/Member;Z)V

    .line 138
    :cond_34
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringFactoryKeyDeserializer;

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringFactoryKeyDeserializer;-><init>(Ljava/lang/reflect/Method;)V

    return-object p0
.end method

.method private static _findExplicitStringFactoryMethod(Ljava/util/List;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            "Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;",
            ">;>;)",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 164
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_5
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    .line 166
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->metadata:Ljava/lang/Object;

    if-eqz v2, :cond_5

    if-nez v0, :cond_1c

    .line 168
    iget-object v0, v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->annotated:Lcom/fasterxml/jackson/databind/introspect/Annotated;

    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    goto :goto_5

    .line 172
    :cond_1c
    iget-object p0, v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->annotated:Lcom/fasterxml/jackson/databind/introspect/Annotated;

    check-cast p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p0

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->nameOf(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3c
    return-object v0
.end method

.method private static _findStringConstructor(Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;",
            "Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;",
            ">;"
        }
    .end annotation

    .line 146
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/BeanDescription;->getConstructorsWithMode()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    .line 150
    iget-object v1, v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->annotated:Lcom/fasterxml/jackson/databind/introspect/Annotated;

    check-cast v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 151
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterCount()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_8

    .line 152
    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getRawParameterType(I)Ljava/lang/Class;

    move-result-object v1

    if-ne v2, v1, :cond_8

    return-object v0

    :cond_29
    const/4 p0, 0x0

    return-object p0
.end method

.method public static constructDelegatingKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationConfig;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/KeyDeserializer;"
        }
    .end annotation

    .line 66
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;-><init>(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object p0
.end method

.method public static constructEnumKeyDeserializer(Lcom/fasterxml/jackson/databind/util/EnumResolver;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Lcom/fasterxml/jackson/databind/util/EnumResolver;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .registers 4

    .line 60
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;-><init>(Lcom/fasterxml/jackson/databind/util/EnumResolver;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Lcom/fasterxml/jackson/databind/util/EnumResolver;)V

    return-object v0
.end method

.method public static constructEnumKeyDeserializer(Lcom/fasterxml/jackson/databind/util/EnumResolver;Lcom/fasterxml/jackson/databind/util/EnumResolver;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .registers 4

    .line 52
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;-><init>(Lcom/fasterxml/jackson/databind/util/EnumResolver;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Lcom/fasterxml/jackson/databind/util/EnumResolver;)V

    return-object v0
.end method

.method public static findStringBasedKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 84
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->introspectForCreation(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/BeanDescription;

    move-result-object p1

    .line 86
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;->_findStringConstructor(Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 88
    iget-object v1, v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->metadata:Ljava/lang/Object;

    if-eqz v1, :cond_17

    .line 89
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->annotated:Lcom/fasterxml/jackson/databind/introspect/Annotated;

    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    invoke-static {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;->_constructCreatorKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object p0

    return-object p0

    .line 94
    :cond_17
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/BeanDescription;->getFactoryMethodsWithMode()Ljava/util/List;

    move-result-object p1

    .line 99
    new-instance v1, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers$$ExternalSyntheticLambda0;-><init>()V

    invoke-interface {p1, v1}, Ljava/util/List;->removeIf(Ljava/util/function/Predicate;)Z

    .line 106
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;->_findExplicitStringFactoryMethod(Ljava/util/List;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    move-result-object v1

    if-eqz v1, :cond_2e

    .line 108
    invoke-static {p0, v1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;->_constructCreatorKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object p0

    return-object p0

    :cond_2e
    if-eqz v0, :cond_39

    .line 112
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->annotated:Lcom/fasterxml/jackson/databind/introspect/Annotated;

    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    invoke-static {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;->_constructCreatorKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object p0

    return-object p0

    .line 116
    :cond_39
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4f

    const/4 v0, 0x0

    .line 119
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    iget-object p1, p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->annotated:Lcom/fasterxml/jackson/databind/introspect/Annotated;

    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    invoke-static {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;->_constructCreatorKeyDeserializer(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object p0

    return-object p0

    :cond_4f
    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic lambda$findStringBasedKeyDeserializer$0(Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;)Z
    .registers 5

    .line 100
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->annotated:Lcom/fasterxml/jackson/databind/introspect/Annotated;

    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1f

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->annotated:Lcom/fasterxml/jackson/databind/introspect/Annotated;

    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    const/4 v2, 0x0

    .line 101
    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getRawParameterType(I)Ljava/lang/Class;

    move-result-object v0

    const-class v3, Ljava/lang/String;

    if-ne v0, v3, :cond_1f

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->metadata:Ljava/lang/Object;

    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->PROPERTIES:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    if-eq p0, v0, :cond_1f

    return v2

    :cond_1f
    return v1
.end method


# virtual methods
.method public findKeyDeserializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 192
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p0

    .line 194
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 195
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->wrapperType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0

    .line 197
    :cond_e
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->forType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers$$ExternalSyntheticLambda0 (com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers$$ExternalSyntheticLambda0)
.class public final synthetic Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .registers 2

    .line 0
    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;->lambda$findStringBasedKeyDeserializer$0(Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;)Z

    move-result p0

    return p0
.end method
