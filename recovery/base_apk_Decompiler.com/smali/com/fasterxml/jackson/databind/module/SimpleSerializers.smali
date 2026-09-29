###### Class com.fasterxml.jackson.databind.module.SimpleSerializers (com.fasterxml.jackson.databind.module.SimpleSerializers)
.class public Lcom/fasterxml/jackson/databind/module/SimpleSerializers;
.super Lcom/fasterxml/jackson/databind/ser/Serializers$Base;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected _classMappings:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/fasterxml/jackson/databind/type/ClassKey;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;>;"
        }
    .end annotation
.end field

.field protected _hasEnumSerializer:Z

.field protected _interfaceMappings:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/fasterxml/jackson/databind/type/ClassKey;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 57
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/ser/Serializers$Base;-><init>()V

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_classMappings:Ljava/util/HashMap;

    .line 42
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_interfaceMappings:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_hasEnumSerializer:Z

    return-void
.end method


# virtual methods
.method protected _findInterfaceMapping(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/type/ClassKey;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/type/ClassKey;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 213
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v0, :cond_22

    aget-object v2, p1, v1

    .line 214
    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/databind/type/ClassKey;->reset(Ljava/lang/Class;)V

    .line 215
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_interfaceMappings:Ljava/util/HashMap;

    invoke-virtual {v3, p2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/fasterxml/jackson/databind/JsonSerializer;

    if-eqz v3, :cond_18

    return-object v3

    .line 219
    :cond_18
    invoke-virtual {p0, v2, p2}, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_findInterfaceMapping(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/type/ClassKey;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v2

    if-eqz v2, :cond_1f

    return-object v2

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_22
    const/4 p0, 0x0

    return-object p0
.end method

.method public findArraySerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/type/ArrayType;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializationConfig;",
            "Lcom/fasterxml/jackson/databind/type/ArrayType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 172
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/Serializers$Base;->findSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p0

    return-object p0
.end method

.method public findCollectionLikeSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/type/CollectionLikeType;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializationConfig;",
            "Lcom/fasterxml/jackson/databind/type/CollectionLikeType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 186
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/Serializers$Base;->findSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p0

    return-object p0
.end method

.method public findCollectionSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializationConfig;",
            "Lcom/fasterxml/jackson/databind/type/CollectionType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 179
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/Serializers$Base;->findSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p0

    return-object p0
.end method

.method public findMapLikeSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/type/MapLikeType;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializationConfig;",
            "Lcom/fasterxml/jackson/databind/type/MapLikeType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 202
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/Serializers$Base;->findSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p0

    return-object p0
.end method

.method public findMapSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/type/MapType;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializationConfig;",
            "Lcom/fasterxml/jackson/databind/type/MapType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 194
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/Serializers$Base;->findSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p0

    return-object p0
.end method

.method public findSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializationConfig;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 111
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p1

    .line 112
    new-instance p3, Lcom/fasterxml/jackson/databind/type/ClassKey;

    invoke-direct {p3, p1}, Lcom/fasterxml/jackson/databind/type/ClassKey;-><init>(Ljava/lang/Class;)V

    .line 116
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 117
    iget-object p2, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_interfaceMappings:Ljava/util/HashMap;

    if-eqz p2, :cond_59

    .line 118
    invoke-virtual {p2, p3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/fasterxml/jackson/databind/JsonSerializer;

    if-eqz p2, :cond_59

    return-object p2

    .line 124
    :cond_1c
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_classMappings:Ljava/util/HashMap;

    if-eqz v0, :cond_59

    .line 125
    invoke-virtual {v0, p3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonSerializer;

    if-eqz v0, :cond_29

    return-object v0

    .line 131
    :cond_29
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_hasEnumSerializer:Z

    if-eqz v0, :cond_43

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JavaType;->isEnumType()Z

    move-result p2

    if-eqz p2, :cond_43

    .line 132
    const-class p2, Ljava/lang/Enum;

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/type/ClassKey;->reset(Ljava/lang/Class;)V

    .line 133
    iget-object p2, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_classMappings:Ljava/util/HashMap;

    invoke-virtual {p2, p3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/fasterxml/jackson/databind/JsonSerializer;

    if-eqz p2, :cond_43

    return-object p2

    :cond_43
    move-object p2, p1

    :goto_44
    if-eqz p2, :cond_59

    .line 141
    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/type/ClassKey;->reset(Ljava/lang/Class;)V

    .line 142
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_classMappings:Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonSerializer;

    if-eqz v0, :cond_54

    return-object v0

    .line 140
    :cond_54
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p2

    goto :goto_44

    .line 150
    :cond_59
    iget-object p2, p0, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_interfaceMappings:Ljava/util/HashMap;

    if-eqz p2, :cond_77

    .line 151
    invoke-virtual {p0, p1, p3}, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_findInterfaceMapping(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/type/ClassKey;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p2

    if-eqz p2, :cond_64

    return-object p2

    .line 156
    :cond_64
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result p2

    if-nez p2, :cond_77

    .line 157
    :cond_6a
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_77

    .line 158
    invoke-virtual {p0, p1, p3}, Lcom/fasterxml/jackson/databind/module/SimpleSerializers;->_findInterfaceMapping(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/type/ClassKey;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p2

    if-eqz p2, :cond_6a

    return-object p2

    :cond_77
    const/4 p0, 0x0

    return-object p0
.end method
