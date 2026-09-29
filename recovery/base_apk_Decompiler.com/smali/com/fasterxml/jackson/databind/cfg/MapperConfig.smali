###### Class com.fasterxml.jackson.databind.cfg.MapperConfig (com.fasterxml.jackson.databind.cfg.MapperConfig)
.class public abstract Lcom/fasterxml/jackson/databind/cfg/MapperConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field protected static final EMPTY_FORMAT:Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

.field protected static final EMPTY_INCLUDE:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;


# instance fields
.field public final _base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

.field public final _mapperFeatures:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 51
    invoke-static {}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->empty()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->EMPTY_INCLUDE:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    .line 56
    invoke-static {}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->empty()Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->EMPTY_FORMAT:Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;J)V
    .registers 4

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    .line 80
    iput-wide p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;J)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "TT;>;J)V"
        }
    .end annotation

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    .line 86
    iput-wide p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "TT;>;",
            "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;",
            ")V"
        }
    .end annotation

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    .line 92
    iget-wide p1, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    iput-wide p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    return-void
.end method

.method public static collectFeatureDefaults(Ljava/lang/Class;)I
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Enum<",
            "TF;>;:",
            "Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;",
            ">(",
            "Ljava/lang/Class<",
            "TF;>;)I"
        }
    .end annotation

    .line 108
    invoke-virtual {p0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Enum;

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_9
    if-ge v1, v0, :cond_1d

    aget-object v3, p0, v1

    .line 109
    check-cast v3, Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;

    invoke-interface {v3}, Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;->enabledByDefault()Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 110
    invoke-interface {v3}, Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;->getMask()I

    move-result v3

    or-int/2addr v2, v3

    :cond_1a
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_1d
    return v2
.end method


# virtual methods
.method public final canOverrideAccessModifiers()Z
    .registers 2

    .line 205
    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->CAN_OVERRIDE_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    return p0
.end method

.method public compileString(Ljava/lang/String;)Lcom/fasterxml/jackson/core/SerializableString;
    .registers 2

    .line 245
    new-instance p0, Lcom/fasterxml/jackson/core/io/SerializedString;

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/SerializedString;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public final constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/JavaType;"
        }
    .end annotation

    .line 337
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    return-object p0
.end method

.method public final getAccessorNaming()Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy$Provider;
    .registers 1

    .line 277
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getAccessorNaming()Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy$Provider;

    move-result-object p0

    return-object p0
.end method

.method public getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;
    .registers 2

    .line 265
    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->USE_ANNOTATIONS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 266
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object p0

    return-object p0

    .line 268
    :cond_f
    sget-object p0, Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;->instance:Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;

    return-object p0
.end method

.method public getBase64Variant()Lcom/fasterxml/jackson/core/Base64Variant;
    .registers 1

    .line 665
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getBase64Variant()Lcom/fasterxml/jackson/core/Base64Variant;

    move-result-object p0

    return-object p0
.end method

.method public getClassIntrospector()Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;
    .registers 1

    .line 255
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getClassIntrospector()Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;

    move-result-object p0

    return-object p0
.end method

.method public abstract getConfigOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;"
        }
    .end annotation
.end method

.method public final getDateFormat()Ljava/text/DateFormat;
    .registers 1

    .line 621
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getDateFormat()Ljava/text/DateFormat;

    move-result-object p0

    return-object p0
.end method

.method public abstract getDefaultInclusion(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;"
        }
    .end annotation
.end method

.method public getDefaultInclusion(Ljava/lang/Class;Ljava/lang/Class;Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;",
            ")",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;"
        }
    .end annotation

    .line 497
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getConfigOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getInclude()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p1

    .line 498
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getConfigOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getIncludeAsProperty()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    .line 500
    filled-new-array {p3, p1, p0}, [Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    invoke-static {p0}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->mergeAll([Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    return-object p0
.end method

.method public abstract getDefaultMergeable()Ljava/lang/Boolean;
.end method

.method public abstract getDefaultPropertyFormat(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonFormat$Value;"
        }
    .end annotation
.end method

.method public abstract getDefaultPropertyInclusion(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;"
        }
    .end annotation
.end method

.method public getDefaultPropertyInclusion(Ljava/lang/Class;Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;",
            ")",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;"
        }
    .end annotation

    .line 460
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getConfigOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getInclude()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    if-eqz p0, :cond_b

    return-object p0

    :cond_b
    return-object p2
.end method

.method public abstract getDefaultSetterInfo()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;
.end method

.method public final getDefaultTyper(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<",
            "*>;"
        }
    .end annotation

    .line 297
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getTypeResolverBuilder()Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;

    move-result-object p0

    return-object p0
.end method

.method public abstract getDefaultVisibilityChecker(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker<",
            "*>;"
        }
    .end annotation
.end method

.method public final getHandlerInstantiator()Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;
    .registers 1

    .line 281
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getHandlerInstantiator()Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;

    move-result-object p0

    return-object p0
.end method

.method public final getLocale()Ljava/util/Locale;
    .registers 1

    .line 628
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getLocale()Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public getPolymorphicTypeValidator()Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;
    .registers 3

    .line 314
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getPolymorphicTypeValidator()Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;

    move-result-object v0

    .line 316
    sget-object v1, Lcom/fasterxml/jackson/databind/jsontype/impl/LaissezFaireSubTypeValidator;->instance:Lcom/fasterxml/jackson/databind/jsontype/impl/LaissezFaireSubTypeValidator;

    if-ne v0, v1, :cond_18

    .line 317
    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    if-eqz p0, :cond_18

    .line 318
    new-instance p0, Lcom/fasterxml/jackson/databind/jsontype/DefaultBaseTypeLimitingValidator;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/jsontype/DefaultBaseTypeLimitingValidator;-><init>()V

    return-object p0

    :cond_18
    return-object v0
.end method

.method public final getPropertyNamingStrategy()Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .registers 1

    .line 272
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getPropertyNamingStrategy()Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    move-result-object p0

    return-object p0
.end method

.method public final getTimeZone()Ljava/util/TimeZone;
    .registers 1

    .line 635
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getTimeZone()Ljava/util/TimeZone;

    move-result-object p0

    return-object p0
.end method

.method public final getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;
    .registers 1

    .line 325
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object p0

    return-object p0
.end method

.method public introspectClassAnnotations(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/BeanDescription;
    .registers 3

    .line 376
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getClassIntrospector()Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p0}, Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;->forClassAnnotations(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;)Lcom/fasterxml/jackson/databind/BeanDescription;

    move-result-object p0

    return-object p0
.end method

.method public introspectClassAnnotations(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/BeanDescription;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/BeanDescription;"
        }
    .end annotation

    .line 368
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->introspectClassAnnotations(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/BeanDescription;

    move-result-object p0

    return-object p0
.end method

.method public final isAnnotationProcessingEnabled()Z
    .registers 2

    .line 190
    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->USE_ANNOTATIONS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    return p0
.end method

.method public final isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z
    .registers 4

    .line 150
    iget-wide v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/databind/MapperFeature;->enabledIn(J)Z

    move-result p0

    return p0
.end method

.method public abstract isEnabled(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;)Z
.end method

.method public final shouldSortPropertiesAlphabetically()Z
    .registers 2

    .line 213
    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->SORT_PROPERTIES_ALPHABETICALLY:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    return p0
.end method

.method public typeIdResolverInstance(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/jsontype/TypeIdResolver;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/introspect/Annotated;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeIdResolver;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeIdResolver;"
        }
    .end annotation

    .line 717
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getHandlerInstantiator()Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 719
    invoke-virtual {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;->typeIdResolverInstance(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/jsontype/TypeIdResolver;

    move-result-object p1

    if-eqz p1, :cond_d

    return-object p1

    .line 724
    :cond_d
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->canOverrideAccessModifiers()Z

    move-result p0

    invoke-static {p2, p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->createInstance(Ljava/lang/Class;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/jsontype/TypeIdResolver;

    return-object p0
.end method

.method public typeResolverBuilderInstance(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/introspect/Annotated;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<",
            "*>;>;)",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<",
            "*>;"
        }
    .end annotation

    .line 700
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getHandlerInstantiator()Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 702
    invoke-virtual {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;->typeResolverBuilderInstance(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;

    move-result-object p1

    if-eqz p1, :cond_d

    return-object p1

    .line 707
    :cond_d
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->canOverrideAccessModifiers()Z

    move-result p0

    invoke-static {p2, p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->createInstance(Ljava/lang/Class;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;

    return-object p0
.end method
