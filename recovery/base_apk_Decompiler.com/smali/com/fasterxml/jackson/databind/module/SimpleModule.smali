###### Class com.fasterxml.jackson.databind.module.SimpleModule (com.fasterxml.jackson.databind.module.SimpleModule)
.class public Lcom/fasterxml/jackson/databind/module/SimpleModule;
.super Lcom/fasterxml/jackson/databind/Module;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final MODULE_ID_SEQ:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field protected _abstractTypes:Lcom/fasterxml/jackson/databind/module/SimpleAbstractTypeResolver;

.field protected _deserializerModifier:Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;

.field protected _deserializers:Lcom/fasterxml/jackson/databind/module/SimpleDeserializers;

.field protected final _hasExplicitName:Z

.field protected _keyDeserializers:Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;

.field protected _keySerializers:Lcom/fasterxml/jackson/databind/module/SimpleSerializers;

.field protected _mixins:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field protected final _name:Ljava/lang/String;

.field protected _namingStrategy:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

.field protected _serializerModifier:Lcom/fasterxml/jackson/databind/ser/BeanSerializerModifier;

.field protected _serializers:Lcom/fasterxml/jackson/databind/module/SimpleSerializers;

.field protected _subtypes:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lcom/fasterxml/jackson/databind/jsontype/NamedType;",
            ">;"
        }
    .end annotation
.end field

.field protected _valueInstantiators:Lcom/fasterxml/jackson/databind/module/SimpleValueInstantiators;

.field protected final _version:Lcom/fasterxml/jackson/core/Version;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->MODULE_ID_SEQ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    .line 121
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/Module;-><init>()V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_serializers:Lcom/fasterxml/jackson/databind/module/SimpleSerializers;

    .line 65
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_deserializers:Lcom/fasterxml/jackson/databind/module/SimpleDeserializers;

    .line 67
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_keySerializers:Lcom/fasterxml/jackson/databind/module/SimpleSerializers;

    .line 68
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_keyDeserializers:Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;

    .line 75
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_abstractTypes:Lcom/fasterxml/jackson/databind/module/SimpleAbstractTypeResolver;

    .line 82
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_valueInstantiators:Lcom/fasterxml/jackson/databind/module/SimpleValueInstantiators;

    .line 87
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_deserializerModifier:Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;

    .line 92
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_serializerModifier:Lcom/fasterxml/jackson/databind/ser/BeanSerializerModifier;

    .line 98
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_mixins:Ljava/util/HashMap;

    .line 103
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_subtypes:Ljava/util/LinkedHashSet;

    .line 108
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_namingStrategy:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/fasterxml/jackson/databind/module/SimpleModule;

    if-ne v0, v1, :cond_37

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SimpleModule-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/fasterxml/jackson/databind/module/SimpleModule;->MODULE_ID_SEQ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 127
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3f

    .line 128
    :cond_37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_3f
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_name:Ljava/lang/String;

    .line 129
    invoke-static {}, Lcom/fasterxml/jackson/core/Version;->unknownVersion()Lcom/fasterxml/jackson/core/Version;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_version:Lcom/fasterxml/jackson/core/Version;

    const/4 v0, 0x0

    .line 131
    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_hasExplicitName:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/Version;)V
    .registers 4

    .line 159
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/Module;-><init>()V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_serializers:Lcom/fasterxml/jackson/databind/module/SimpleSerializers;

    .line 65
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_deserializers:Lcom/fasterxml/jackson/databind/module/SimpleDeserializers;

    .line 67
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_keySerializers:Lcom/fasterxml/jackson/databind/module/SimpleSerializers;

    .line 68
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_keyDeserializers:Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;

    .line 75
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_abstractTypes:Lcom/fasterxml/jackson/databind/module/SimpleAbstractTypeResolver;

    .line 82
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_valueInstantiators:Lcom/fasterxml/jackson/databind/module/SimpleValueInstantiators;

    .line 87
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_deserializerModifier:Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;

    .line 92
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_serializerModifier:Lcom/fasterxml/jackson/databind/ser/BeanSerializerModifier;

    .line 98
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_mixins:Ljava/util/HashMap;

    .line 103
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_subtypes:Ljava/util/LinkedHashSet;

    .line 108
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_namingStrategy:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 160
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_name:Ljava/lang/String;

    .line 161
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_version:Lcom/fasterxml/jackson/core/Version;

    const/4 p1, 0x1

    .line 163
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_hasExplicitName:Z

    return-void
.end method


# virtual methods
.method public getModuleName()Ljava/lang/String;
    .registers 1

    .line 524
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_name:Ljava/lang/String;

    return-object p0
.end method

.method public getTypeId()Ljava/lang/Object;
    .registers 3

    .line 211
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_hasExplicitName:Z

    if-eqz v0, :cond_7

    .line 212
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_name:Ljava/lang/String;

    return-object p0

    .line 219
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/fasterxml/jackson/databind/module/SimpleModule;

    if-ne v0, v1, :cond_12

    .line 220
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_name:Ljava/lang/String;

    return-object p0

    .line 224
    :cond_12
    invoke-super {p0}, Lcom/fasterxml/jackson/databind/Module;->getTypeId()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public setupModule(Lcom/fasterxml/jackson/databind/Module$SetupContext;)V
    .registers 4

    .line 537
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_serializers:Lcom/fasterxml/jackson/databind/module/SimpleSerializers;

    if-eqz v0, :cond_7

    .line 538
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addSerializers(Lcom/fasterxml/jackson/databind/ser/Serializers;)V

    .line 540
    :cond_7
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_deserializers:Lcom/fasterxml/jackson/databind/module/SimpleDeserializers;

    if-eqz v0, :cond_e

    .line 541
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addDeserializers(Lcom/fasterxml/jackson/databind/deser/Deserializers;)V

    .line 543
    :cond_e
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_keySerializers:Lcom/fasterxml/jackson/databind/module/SimpleSerializers;

    if-eqz v0, :cond_15

    .line 544
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addKeySerializers(Lcom/fasterxml/jackson/databind/ser/Serializers;)V

    .line 546
    :cond_15
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_keyDeserializers:Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;

    if-eqz v0, :cond_1c

    .line 547
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addKeyDeserializers(Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;)V

    .line 549
    :cond_1c
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_abstractTypes:Lcom/fasterxml/jackson/databind/module/SimpleAbstractTypeResolver;

    if-eqz v0, :cond_23

    .line 550
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addAbstractTypeResolver(Lcom/fasterxml/jackson/databind/AbstractTypeResolver;)V

    .line 552
    :cond_23
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_valueInstantiators:Lcom/fasterxml/jackson/databind/module/SimpleValueInstantiators;

    if-eqz v0, :cond_2a

    .line 553
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addValueInstantiators(Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V

    .line 555
    :cond_2a
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_deserializerModifier:Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;

    if-eqz v0, :cond_31

    .line 556
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addBeanDeserializerModifier(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;)V

    .line 558
    :cond_31
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_serializerModifier:Lcom/fasterxml/jackson/databind/ser/BeanSerializerModifier;

    if-eqz v0, :cond_38

    .line 559
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addBeanSerializerModifier(Lcom/fasterxml/jackson/databind/ser/BeanSerializerModifier;)V

    .line 561
    :cond_38
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_subtypes:Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_53

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lez v0, :cond_53

    .line 562
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_subtypes:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    new-array v1, v1, [Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/jsontype/NamedType;

    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->registerSubtypes([Lcom/fasterxml/jackson/databind/jsontype/NamedType;)V

    .line 564
    :cond_53
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_namingStrategy:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    if-eqz v0, :cond_5a

    .line 565
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->setNamingStrategy(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)V

    .line 567
    :cond_5a
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_mixins:Ljava/util/HashMap;

    if-eqz p0, :cond_82

    .line 568
    invoke-virtual {p0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_66
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_82

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 569
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-interface {p1, v1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->setMixInAnnotations(Ljava/lang/Class;Ljava/lang/Class;)V

    goto :goto_66

    :cond_82
    return-void
.end method

.method public version()Lcom/fasterxml/jackson/core/Version;
    .registers 1

    .line 575
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/module/SimpleModule;->_version:Lcom/fasterxml/jackson/core/Version;

    return-object p0
.end method
