###### Class com.fasterxml.jackson.databind.introspect.BasicBeanDescription (com.fasterxml.jackson.databind.introspect.BasicBeanDescription)
.class public Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;
.super Lcom/fasterxml/jackson/databind/BeanDescription;
.source "SourceFile"


# static fields
.field private static final NO_VIEWS:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field protected final _annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

.field protected final _classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

.field protected final _config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;"
        }
    .end annotation
.end field

.field protected _defaultViews:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field protected _defaultViewsResolved:Z

.field protected _objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

.field protected final _propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

.field protected _properties:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x0

    .line 31
    new-array v0, v0, [Ljava/lang/Class;

    sput-object v0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->NO_VIEWS:[Ljava/lang/Class;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;",
            ">;)V"
        }
    .end annotation

    .line 115
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/databind/BeanDescription;-><init>(Lcom/fasterxml/jackson/databind/JavaType;)V

    const/4 p2, 0x0

    .line 116
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    .line 117
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    if-nez p1, :cond_d

    .line 120
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    goto :goto_13

    .line 122
    :cond_d
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 124
    :goto_13
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    .line 125
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties:Ljava/util/List;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;)V
    .registers 4

    .line 130
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getClassDef()Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;-><init>(Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)V

    .line 131
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getObjectIdInfo()Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)V
    .registers 4

    .line 96
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/databind/BeanDescription;-><init>(Lcom/fasterxml/jackson/databind/JavaType;)V

    .line 97
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    .line 98
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getConfig()Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    if-nez p1, :cond_11

    const/4 p1, 0x0

    .line 101
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    goto :goto_17

    .line 103
    :cond_11
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 105
    :goto_17
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    return-void
.end method

.method public static forDeserialization(Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;)Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;
    .registers 2

    .line 139
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;-><init>(Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;)V

    return-object v0
.end method

.method public static forOtherUse(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;"
        }
    .end annotation

    .line 159
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;-><init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Ljava/util/List;)V

    return-object v0
.end method

.method public static forSerialization(Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;)Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;
    .registers 2

    .line 147
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;-><init>(Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;)V

    return-object v0
.end method


# virtual methods
.method protected _createConverter(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/util/Converter;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/fasterxml/jackson/databind/util/Converter<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return-object v0

    .line 830
    :cond_4
    instance-of v1, p1, Lcom/fasterxml/jackson/databind/util/Converter;

    if-eqz v1, :cond_b

    .line 831
    check-cast p1, Lcom/fasterxml/jackson/databind/util/Converter;

    return-object p1

    .line 833
    :cond_b
    instance-of v1, p1, Ljava/lang/Class;

    if-eqz v1, :cond_62

    .line 837
    check-cast p1, Ljava/lang/Class;

    .line 839
    const-class v1, Lcom/fasterxml/jackson/databind/util/Converter$None;

    if-eq p1, v1, :cond_61

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->isBogusClass(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_61

    .line 842
    const-class v1, Lcom/fasterxml/jackson/databind/util/Converter;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_44

    .line 846
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getHandlerInstantiator()Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;

    move-result-object v1

    if-nez v1, :cond_2c

    goto :goto_34

    .line 847
    :cond_2c
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v1, v0, v2, p1}, Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;->converterInstance(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/util/Converter;

    move-result-object v0

    :goto_34
    if-nez v0, :cond_43

    .line 849
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    .line 850
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->canOverrideAccessModifiers()Z

    move-result p0

    .line 849
    invoke-static {p1, p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->createInstance(Ljava/lang/Class;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/util/Converter;

    return-object p0

    :cond_43
    return-object v0

    .line 843
    :cond_44
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "AnnotationIntrospector returned Class "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 844
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; expected Class<Converter>"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_61
    return-object v0

    .line 834
    :cond_62
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "AnnotationIntrospector returned Converter definition of type "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 835
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; expected type Converter or Class<Converter> instead"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected _properties()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;",
            ">;"
        }
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties:Ljava/util/List;

    if-nez v0, :cond_c

    .line 164
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getProperties()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties:Ljava/util/List;

    .line 166
    :cond_c
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties:Ljava/util/List;

    return-object p0
.end method

.method public addProperty(Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;)Z
    .registers 3

    .line 198
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->getFullName()Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->hasProperty(Lcom/fasterxml/jackson/databind/PropertyName;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 p0, 0x0

    return p0

    .line 201
    :cond_c
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0
.end method

.method public findAnyGetter()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 493
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    if-eqz v0, :cond_54

    .line 494
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getAnyGetterMethod()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object v0

    if-eqz v0, :cond_2b

    .line 498
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object p0

    .line 499
    const-class v1, Ljava/util/Map;

    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_17

    return-object v0

    .line 502
    :cond_17
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 500
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid \'any-getter\' annotation on method %s(): return type is not instance of java.util.Map"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 507
    :cond_2b
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getAnyGetterField()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object p0

    if-eqz p0, :cond_54

    .line 511
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object v0

    .line 512
    const-class v1, Ljava/util/Map;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_40

    return-object p0

    .line 515
    :cond_40
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 513
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid \'any-getter\' annotation on field \'%s\': type is not instance of java.util.Map"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    const/4 p0, 0x0

    return-object p0
.end method

.method public findAnySetterAccessor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 303
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    if-eqz v0, :cond_63

    .line 304
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getAnySetterMethod()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    move-result-object v0

    if-eqz v0, :cond_31

    const/4 p0, 0x0

    .line 312
    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getRawParameterType(I)Ljava/lang/Class;

    move-result-object p0

    .line 313
    const-class v1, Ljava/lang/String;

    if-eq p0, v1, :cond_30

    const-class v1, Ljava/lang/Object;

    if-ne p0, v1, :cond_18

    goto :goto_30

    .line 316
    :cond_18
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 314
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid \'any-setter\' annotation on method \'%s()\': first argument not of type String or Object, but %s"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_30
    :goto_30
    return-object v0

    .line 320
    :cond_31
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getAnySetterField()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object p0

    if-eqz p0, :cond_63

    .line 324
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object v0

    .line 325
    const-class v1, Ljava/util/Map;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_62

    .line 326
    const-class v1, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4e

    goto :goto_62

    .line 329
    :cond_4e
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 327
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid \'any-setter\' annotation on field \'%s\': type is not instance of `java.util.Map` or `JsonNode`"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    :goto_62
    return-object p0

    :cond_63
    const/4 p0, 0x0

    return-object p0
.end method

.method public findBackReferences()Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;",
            ">;"
        }
    .end annotation

    .line 528
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move-object v1, v0

    :cond_a
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_58

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;

    .line 529
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->findReferenceType()Lcom/fasterxml/jackson/databind/AnnotationIntrospector$ReferenceProperty;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 530
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector$ReferenceProperty;->isBackReference()Z

    move-result v4

    if-eqz v4, :cond_a

    .line 533
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector$ReferenceProperty;->getName()Ljava/lang/String;

    move-result-object v3

    if-nez v0, :cond_36

    .line 535
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 536
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 537
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_3c

    .line 539
    :cond_36
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_40

    .line 543
    :goto_3c
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 540
    :cond_40
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Multiple back-reference properties with name "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->name(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_58
    return-object v0
.end method

.method public findDefaultConstructor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;
    .registers 1

    .line 297
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getDefaultConstructor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    move-result-object p0

    return-object p0
.end method

.method public findDefaultViews()[Ljava/lang/Class;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 437
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_defaultViewsResolved:Z

    if-nez v0, :cond_23

    const/4 v0, 0x1

    .line 438
    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_defaultViewsResolved:Z

    .line 439
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    if-nez v0, :cond_d

    const/4 v0, 0x0

    goto :goto_13

    :cond_d
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    .line 440
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findViews(Lcom/fasterxml/jackson/databind/introspect/Annotated;)[Ljava/lang/Class;

    move-result-object v0

    :goto_13
    if-nez v0, :cond_21

    .line 443
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    sget-object v2, Lcom/fasterxml/jackson/databind/MapperFeature;->DEFAULT_VIEW_INCLUSION:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v1

    if-nez v1, :cond_21

    .line 444
    sget-object v0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->NO_VIEWS:[Ljava/lang/Class;

    .line 447
    :cond_21
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_defaultViews:[Ljava/lang/Class;

    .line 449
    :cond_23
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_defaultViews:[Ljava/lang/Class;

    return-object p0
.end method

.method public findDeserializationConverter()Lcom/fasterxml/jackson/databind/util/Converter;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/databind/util/Converter<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 768
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 771
    :cond_6
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findDeserializationConverter(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_createConverter(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/util/Converter;

    move-result-object p0

    return-object p0
.end method

.method public findExpectedFormat(Lcom/fasterxml/jackson/annotation/JsonFormat$Value;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;
    .registers 4

    .line 413
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    if-eqz v0, :cond_14

    .line 414
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findFormat(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object v0

    if-eqz v0, :cond_14

    if-nez p1, :cond_10

    move-object p1, v0

    goto :goto_14

    .line 419
    :cond_10
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonFormat$Value;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object p1

    .line 423
    :cond_14
    :goto_14
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getDefaultPropertyFormat(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object p0

    if-eqz p0, :cond_2a

    if-nez p1, :cond_25

    return-object p0

    .line 428
    :cond_25
    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonFormat$Value;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object p0

    return-object p0

    :cond_2a
    return-object p1
.end method

.method protected findFactoryMethodMetadata(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            "Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;",
            ">;"
        }
    .end annotation

    .line 696
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getRawReturnType()Ljava/lang/Class;

    move-result-object v0

    .line 697
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/BeanDescription;->getBeanClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_10

    return-object v1

    .line 704
    :cond_10
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    invoke-virtual {v0, p0, p1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findCreatorAnnotation(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    move-result-object p0

    if-eqz p0, :cond_24

    .line 706
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DISABLED:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    if-ne p0, v0, :cond_1f

    return-object v1

    .line 709
    :cond_1f
    invoke-static {p1, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->of(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    move-result-object p0

    return-object p0

    .line 711
    :cond_24
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getName()Ljava/lang/String;

    move-result-object v0

    .line 713
    const-string v2, "valueOf"

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3c

    .line 714
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterCount()I

    move-result v2

    if-ne v2, v3, :cond_3c

    .line 715
    invoke-static {p1, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->of(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    move-result-object p0

    return-object p0

    .line 719
    :cond_3c
    const-string v2, "fromString"

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_60

    .line 720
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterCount()I

    move-result v0

    if-ne v0, v3, :cond_60

    const/4 v0, 0x0

    .line 721
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getRawParameterType(I)Ljava/lang/Class;

    move-result-object v0

    .line 722
    const-class v2, Ljava/lang/String;

    if-eq v0, v2, :cond_5b

    const-class v2, Ljava/lang/CharSequence;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_60

    .line 723
    :cond_5b
    invoke-static {p1, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->of(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    move-result-object p0

    return-object p0

    :cond_60
    return-object v1
.end method

.method public findInjectables()Ljava/util/Map;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;",
            ">;"
        }
    .end annotation

    .line 339
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    if-eqz p0, :cond_9

    .line 340
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getInjectables()Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 342
    :cond_9
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public findJsonKeyAccessor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
    .registers 1

    .line 244
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 245
    :cond_6
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getJsonKeyAccessor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object p0

    return-object p0
.end method

.method public findJsonValueAccessor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
    .registers 1

    .line 257
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 258
    :cond_6
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getJsonValueAccessor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object p0

    return-object p0
.end method

.method public findMethod(Ljava/lang/String;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;"
        }
    .end annotation

    .line 399
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->findMethod(Ljava/lang/String;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    move-result-object p0

    return-object p0
.end method

.method public findPOJOBuilder()Ljava/lang/Class;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 754
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    .line 755
    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findPOJOBuilder(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public findPOJOBuilderConfig()Lcom/fasterxml/jackson/databind/annotation/JsonPOJOBuilder$Value;
    .registers 2

    .line 761
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    .line 762
    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findPOJOBuilderConfig(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/annotation/JsonPOJOBuilder$Value;

    move-result-object p0

    return-object p0
.end method

.method public findProperties()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;",
            ">;"
        }
    .end annotation

    .line 239
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public findProperty(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;
    .registers 4

    .line 217
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;

    .line 218
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->hasName(Lcom/fasterxml/jackson/databind/PropertyName;)Z

    move-result v1

    if-eqz v1, :cond_8

    return-object v0

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method public findPropertyInclusion(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 3

    .line 475
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    if-eqz v0, :cond_14

    .line 476
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findPropertyInclusion(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    if-eqz p0, :cond_14

    if-nez p1, :cond_f

    return-object p0

    .line 478
    :cond_f
    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    return-object p0

    :cond_14
    return-object p1
.end method

.method public findSerializationConverter()Lcom/fasterxml/jackson/databind/util/Converter;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/databind/util/Converter<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 461
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 464
    :cond_6
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findSerializationConverter(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_createConverter(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/util/Converter;

    move-result-object p0

    return-object p0
.end method

.method public getClassAnnotations()Lcom/fasterxml/jackson/databind/util/Annotations;
    .registers 1

    .line 278
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getAnnotations()Lcom/fasterxml/jackson/databind/util/Annotations;

    move-result-object p0

    return-object p0
.end method

.method public getClassInfo()Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;
    .registers 1

    .line 232
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    return-object p0
.end method

.method public getConstructors()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;",
            ">;"
        }
    .end annotation

    .line 347
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getConstructors()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public getConstructorsWithMode()Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;",
            "Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;",
            ">;>;"
        }
    .end annotation

    .line 352
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getConstructors()Ljava/util/List;

    move-result-object v0

    .line 353
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 354
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 356
    :cond_11
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 357
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1a
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 358
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    invoke-virtual {v3, v4, v2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findCreatorAnnotation(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    move-result-object v3

    .line 359
    sget-object v4, Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DISABLED:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    if-eq v3, v4, :cond_1a

    .line 362
    invoke-static {v2, v3}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;->of(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_3a
    return-object v1
.end method

.method public getFactoryMethods()Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            ">;"
        }
    .end annotation

    .line 573
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getFactoryMethods()Ljava/util/List;

    move-result-object v0

    .line 574
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    return-object v0

    .line 578
    :cond_d
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_12
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 579
    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->isFactoryMethod(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Z

    move-result v3

    if-eqz v3, :cond_12

    if-nez v1, :cond_2b

    .line 581
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 583
    :cond_2b
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_2f
    if-nez v1, :cond_36

    .line 587
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_36
    return-object v1
.end method

.method public getFactoryMethodsWithMode()Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            "Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;",
            ">;>;"
        }
    .end annotation

    .line 595
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getFactoryMethods()Ljava/util/List;

    move-result-object v0

    .line 596
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 597
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 600
    :cond_11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_16
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 602
    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->findFactoryMethodMetadata(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedAndMetadata;

    move-result-object v2

    if-eqz v2, :cond_16

    if-nez v1, :cond_2f

    .line 605
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 607
    :cond_2f
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_33
    if-nez v1, :cond_3a

    .line 611
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_3a
    return-object v1
.end method

.method public getIgnoredPropertyNames()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 263
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_propCollector:Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    goto :goto_a

    .line 264
    :cond_6
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/POJOPropertiesCollector;->getIgnoredPropertyNames()Ljava/util/Set;

    move-result-object p0

    :goto_a
    if-nez p0, :cond_10

    .line 266
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    :cond_10
    return-object p0
.end method

.method public getObjectIdInfo()Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;
    .registers 1

    .line 235
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    return-object p0
.end method

.method public hasKnownClassAnnotations()Z
    .registers 1

    .line 273
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->hasAnnotations()Z

    move-result p0

    return p0
.end method

.method public hasProperty(Lcom/fasterxml/jackson/databind/PropertyName;)Z
    .registers 2

    .line 209
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->findProperty(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;

    move-result-object p0

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public instantiateBean(Z)Ljava/lang/Object;
    .registers 4

    .line 369
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getDefaultConstructor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    move-result-object v0

    if-nez v0, :cond_a

    const/4 p0, 0x0

    return-object p0

    :cond_a
    if-eqz p1, :cond_17

    .line 374
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->OVERRIDE_PUBLIC_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->fixAccess(Z)V

    .line 377
    :cond_17
    :try_start_17
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->call()Ljava/lang/Object;

    move-result-object p0
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_1b} :catch_1c

    return-object p0

    :catch_1c
    move-exception p1

    .line 380
    :goto_1d
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_28

    .line 381
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_1d

    .line 383
    :cond_28
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->throwIfError(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 384
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->throwIfRTE(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to instantiate bean of type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_classInfo:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    .line 386
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getAnnotated()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": ("

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ") "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->exceptionMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method protected isFactoryMethod(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Z
    .registers 5

    .line 659
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getRawReturnType()Ljava/lang/Class;

    move-result-object v0

    .line 660
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/BeanDescription;->getBeanClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_10

    return v1

    .line 668
    :cond_10
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_annotationIntrospector:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    invoke-virtual {v0, p0, p1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findCreatorAnnotation(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    move-result-object p0

    const/4 v0, 0x1

    if-eqz p0, :cond_20

    .line 669
    sget-object v2, Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DISABLED:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    if-eq p0, v2, :cond_20

    return v0

    .line 672
    :cond_20
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getName()Ljava/lang/String;

    move-result-object p0

    .line 674
    const-string v2, "valueOf"

    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33

    .line 675
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterCount()I

    move-result v2

    if-ne v2, v0, :cond_33

    return v0

    .line 680
    :cond_33
    const-string v2, "fromString"

    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_52

    .line 681
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterCount()I

    move-result p0

    if-ne p0, v0, :cond_52

    .line 682
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getRawParameterType(I)Ljava/lang/Class;

    move-result-object p0

    .line 683
    const-class p1, Ljava/lang/String;

    if-eq p0, p1, :cond_51

    const-class p1, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_52

    :cond_51
    return v0

    :cond_52
    return v1
.end method

.method public removeProperty(Ljava/lang/String;)Z
    .registers 3

    .line 184
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/BasicBeanDescription;->_properties()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 185
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_23

    .line 186
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;

    .line 187
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 188
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    const/4 p0, 0x1

    return p0

    :cond_23
    const/4 p0, 0x0

    return p0
.end method
