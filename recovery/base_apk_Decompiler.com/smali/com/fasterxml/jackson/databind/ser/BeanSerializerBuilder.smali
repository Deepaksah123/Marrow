###### Class com.fasterxml.jackson.databind.ser.BeanSerializerBuilder (com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)
.class public Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final NO_PROPERTIES:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;


# instance fields
.field protected _anyGetter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

.field protected final _beanDesc:Lcom/fasterxml/jackson/databind/BeanDescription;

.field protected _config:Lcom/fasterxml/jackson/databind/SerializationConfig;

.field protected _filterId:Ljava/lang/Object;

.field protected _filteredProperties:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

.field protected _objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

.field protected _properties:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;",
            ">;"
        }
    .end annotation
.end field

.field protected _typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x0

    .line 19
    new-array v0, v0, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    sput-object v0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->NO_PROPERTIES:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/BeanDescription;)V
    .registers 3

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    .line 77
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_beanDesc:Lcom/fasterxml/jackson/databind/BeanDescription;

    return-void
.end method


# virtual methods
.method public build()Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    if-eqz v0, :cond_1b

    .line 190
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_config:Lcom/fasterxml/jackson/databind/SerializationConfig;

    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->CAN_OVERRIDE_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 191
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_config:Lcom/fasterxml/jackson/databind/SerializationConfig;

    sget-object v2, Lcom/fasterxml/jackson/databind/MapperFeature;->OVERRIDE_PUBLIC_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->fixAccess(Z)V

    .line 194
    :cond_1b
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_anyGetter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    if-eqz v0, :cond_24

    .line 195
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_config:Lcom/fasterxml/jackson/databind/SerializationConfig;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->fixAccess(Lcom/fasterxml/jackson/databind/SerializationConfig;)V

    .line 201
    :cond_24
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    if-eqz v0, :cond_54

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_54

    .line 208
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 209
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_config:Lcom/fasterxml/jackson/databind/SerializationConfig;

    sget-object v2, Lcom/fasterxml/jackson/databind/MapperFeature;->CAN_OVERRIDE_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v1

    if-eqz v1, :cond_60

    .line 210
    array-length v1, v0

    const/4 v2, 0x0

    :goto_48
    if-ge v2, v1, :cond_60

    .line 211
    aget-object v3, v0, v2

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_config:Lcom/fasterxml/jackson/databind/SerializationConfig;

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->fixAccess(Lcom/fasterxml/jackson/databind/SerializationConfig;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_48

    .line 202
    :cond_54
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_anyGetter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    if-nez v0, :cond_5e

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    if-nez v0, :cond_5e

    const/4 p0, 0x0

    return-object p0

    .line 206
    :cond_5e
    sget-object v0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->NO_PROPERTIES:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 216
    :cond_60
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_filteredProperties:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    if-eqz v1, :cond_8f

    .line 217
    array-length v1, v1

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_6e

    goto :goto_8f

    .line 218
    :cond_6e
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    .line 220
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_filteredProperties:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    array-length p0, p0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 218
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 223
    :cond_8f
    :goto_8f
    new-instance v1, Lcom/fasterxml/jackson/databind/ser/BeanSerializer;

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_beanDesc:Lcom/fasterxml/jackson/databind/BeanDescription;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/BeanDescription;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_filteredProperties:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-direct {v1, v2, p0, v0, v3}, Lcom/fasterxml/jackson/databind/ser/BeanSerializer;-><init>(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V

    return-object v1
.end method

.method public createDummy()Lcom/fasterxml/jackson/databind/ser/BeanSerializer;
    .registers 2

    .line 234
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_beanDesc:Lcom/fasterxml/jackson/databind/BeanDescription;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/BeanDescription;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/fasterxml/jackson/databind/ser/BeanSerializer;->createDummy(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;)Lcom/fasterxml/jackson/databind/ser/BeanSerializer;

    move-result-object p0

    return-object p0
.end method

.method public getAnyGetter()Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;
    .registers 1

    .line 166
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_anyGetter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    return-object p0
.end method

.method public getBeanDescription()Lcom/fasterxml/jackson/databind/BeanDescription;
    .registers 1

    .line 157
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_beanDesc:Lcom/fasterxml/jackson/databind/BeanDescription;

    return-object p0
.end method

.method public getFilterId()Ljava/lang/Object;
    .registers 1

    .line 168
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_filterId:Ljava/lang/Object;

    return-object p0
.end method

.method public getObjectIdWriter()Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;
    .registers 1

    .line 172
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    return-object p0
.end method

.method public getProperties()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;",
            ">;"
        }
    .end annotation

    .line 159
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    return-object p0
.end method

.method public getTypeId()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
    .registers 1

    .line 170
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    return-object p0
.end method

.method public setAnyGetter(Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;)V
    .registers 2

    .line 128
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_anyGetter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    return-void
.end method

.method protected setConfig(Lcom/fasterxml/jackson/databind/SerializationConfig;)V
    .registers 2

    .line 104
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_config:Lcom/fasterxml/jackson/databind/SerializationConfig;

    return-void
.end method

.method public setFilterId(Ljava/lang/Object;)V
    .registers 2

    .line 132
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_filterId:Ljava/lang/Object;

    return-void
.end method

.method public setFilteredProperties([Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V
    .registers 4

    if-eqz p1, :cond_2b

    .line 118
    array-length v0, p1

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_c

    goto :goto_2b

    .line 119
    :cond_c
    array-length p1, p1

    .line 121
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 119
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 124
    :cond_2b
    :goto_2b
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_filteredProperties:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    return-void
.end method

.method public setObjectIdWriter(Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;)V
    .registers 2

    .line 144
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    return-void
.end method

.method public setProperties(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;",
            ">;)V"
        }
    .end annotation

    .line 108
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_properties:Ljava/util/List;

    return-void
.end method

.method public setTypeId(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)V
    .registers 5

    .line 137
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    if-nez v0, :cond_7

    .line 140
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    return-void

    .line 138
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Multiple type ids specified with "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
