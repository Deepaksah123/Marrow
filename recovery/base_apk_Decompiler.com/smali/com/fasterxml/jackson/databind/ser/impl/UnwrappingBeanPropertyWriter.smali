###### Class com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter (com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter)
.class public Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;
.super Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected final _nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/databind/util/NameTransformer;)V
    .registers 3

    .line 43
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;-><init>(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V

    .line 44
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;Lcom/fasterxml/jackson/databind/util/NameTransformer;Lcom/fasterxml/jackson/core/io/SerializedString;)V
    .registers 4

    .line 49
    invoke-direct {p0, p1, p3}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;-><init>(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/core/io/SerializedString;)V

    .line 50
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    return-void
.end method


# virtual methods
.method public _depositSchemaProperty(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/JsonNode;)V
    .registers 6

    .line 183
    const-string v0, "properties"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p2

    if-eqz p2, :cond_30

    .line 185
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object p2

    .line 186
    :goto_c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_30

    .line 187
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 188
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 189
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    if-eqz v2, :cond_26

    .line 190
    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/util/NameTransformer;->transform(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 192
    :cond_26
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p1, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->set(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_c

    :cond_30
    return-void
.end method

.method public _findAndAddDynamic(Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/SerializerProvider;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 209
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_nonTrivialBaseType:Lcom/fasterxml/jackson/databind/JavaType;

    if-eqz p1, :cond_f

    .line 210
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_nonTrivialBaseType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {p3, p1, p2}, Lcom/fasterxml/jackson/databind/SerializerProvider;->constructSpecializedType(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    .line 211
    invoke-virtual {p3, p1, p0}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p1

    goto :goto_13

    .line 213
    :cond_f
    invoke-virtual {p3, p2, p0}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findValueSerializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p1

    .line 215
    :goto_13
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    .line 216
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonSerializer;->isUnwrappingSerializer()Z

    move-result v0

    if-eqz v0, :cond_28

    instance-of v0, p1, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanSerializer;

    if-eqz v0, :cond_28

    .line 220
    move-object v0, p1

    check-cast v0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanSerializer;

    iget-object v0, v0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanSerializer;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    invoke-static {p3, v0}, Lcom/fasterxml/jackson/databind/util/NameTransformer;->chainedTransformer(Lcom/fasterxml/jackson/databind/util/NameTransformer;Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/util/NameTransformer;

    move-result-object p3

    .line 222
    :cond_28
    invoke-virtual {p1, p3}, Lcom/fasterxml/jackson/databind/JsonSerializer;->unwrappingSerializer(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p1

    .line 224
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_dynamicSerializers:Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;

    invoke-virtual {p3, p2, p1}, Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;->newWith(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;

    move-result-object p2

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_dynamicSerializers:Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;

    return-object p1
.end method

.method protected _new(Lcom/fasterxml/jackson/databind/util/NameTransformer;Lcom/fasterxml/jackson/core/io/SerializedString;)Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;
    .registers 4

    .line 72
    new-instance v0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;-><init>(Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;Lcom/fasterxml/jackson/databind/util/NameTransformer;Lcom/fasterxml/jackson/core/io/SerializedString;)V

    return-object v0
.end method

.method public assignSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1b

    .line 138
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    .line 139
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonSerializer;->isUnwrappingSerializer()Z

    move-result v1

    if-eqz v1, :cond_17

    instance-of v1, p1, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanSerializer;

    if-eqz v1, :cond_17

    .line 143
    move-object v1, p1

    check-cast v1, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanSerializer;

    iget-object v1, v1, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanSerializer;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    invoke-static {v0, v1}, Lcom/fasterxml/jackson/databind/util/NameTransformer;->chainedTransformer(Lcom/fasterxml/jackson/databind/util/NameTransformer;Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/util/NameTransformer;

    move-result-object v0

    .line 145
    :cond_17
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonSerializer;->unwrappingSerializer(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object p1

    .line 147
    :cond_1b
    invoke-super {p0, p1}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->assignSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    return-void
.end method

.method public depositSchemaProperty(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 161
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {p2, v0, p0}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    .line 162
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonSerializer;->unwrappingSerializer(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    .line 164
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonSerializer;->isUnwrappingSerializer()Z

    move-result v1

    if-eqz v1, :cond_21

    .line 165
    new-instance v1, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1;-><init>(Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;)V

    .line 173
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    .line 165
    invoke-virtual {v0, v1, p0}, Lcom/fasterxml/jackson/databind/JsonSerializer;->acceptJsonFormatVisitor(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;Lcom/fasterxml/jackson/databind/JavaType;)V

    return-void

    .line 175
    :cond_21
    invoke-super {p0, p1, p2}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->depositSchemaProperty(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method

.method public bridge synthetic rename(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;
    .registers 2

    .line 24
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->rename(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;

    move-result-object p0

    return-object p0
.end method

.method public rename(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;
    .registers 4

    .line 56
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_name:Lcom/fasterxml/jackson/core/io/SerializedString;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/SerializedString;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/util/NameTransformer;->transform(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 60
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_nameTransformer:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    invoke-static {p1, v1}, Lcom/fasterxml/jackson/databind/util/NameTransformer;->chainedTransformer(Lcom/fasterxml/jackson/databind/util/NameTransformer;Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/util/NameTransformer;

    move-result-object p1

    .line 62
    new-instance v1, Lcom/fasterxml/jackson/core/io/SerializedString;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/core/io/SerializedString;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v1}, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_new(Lcom/fasterxml/jackson/databind/util/NameTransformer;Lcom/fasterxml/jackson/core/io/SerializedString;)Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;

    move-result-object p0

    return-object p0
.end method

.method public serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 90
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_56

    .line 96
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_serializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    if-nez v1, :cond_1c

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 99
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_dynamicSerializers:Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;

    .line 100
    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;->serializerFor(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v3

    if-nez v3, :cond_1b

    .line 102
    invoke-virtual {p0, v2, v1, p3}, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_findAndAddDynamic(Lcom/fasterxml/jackson/databind/ser/impl/PropertySerializerMap;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/SerializerProvider;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v1

    goto :goto_1c

    :cond_1b
    move-object v1, v3

    .line 105
    :cond_1c
    :goto_1c
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_suppressableValue:Ljava/lang/Object;

    if-eqz v2, :cond_35

    .line 106
    sget-object v2, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->MARKER_FOR_EMPTY:Ljava/lang/Object;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_suppressableValue:Ljava/lang/Object;

    if-ne v2, v3, :cond_2d

    .line 107
    invoke-virtual {v1, p3, v0}, Lcom/fasterxml/jackson/databind/JsonSerializer;->isEmpty(Lcom/fasterxml/jackson/databind/SerializerProvider;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    return-void

    .line 110
    :cond_2d
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_suppressableValue:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_56

    :cond_35
    if-ne v0, p1, :cond_3e

    .line 116
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->_handleSelfReference(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/JsonSerializer;)Z

    move-result p1

    if-eqz p1, :cond_3e

    goto :goto_56

    .line 122
    :cond_3e
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonSerializer;->isUnwrappingSerializer()Z

    move-result p1

    if-nez p1, :cond_49

    .line 123
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_name:Lcom/fasterxml/jackson/core/io/SerializedString;

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Lcom/fasterxml/jackson/core/SerializableString;)V

    .line 126
    :cond_49
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_typeSerializer:Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;

    if-nez p1, :cond_51

    .line 127
    invoke-virtual {v1, v0, p2, p3}, Lcom/fasterxml/jackson/databind/JsonSerializer;->serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void

    .line 129
    :cond_51
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->_typeSerializer:Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;

    invoke-virtual {v1, v0, p2, p3, p0}, Lcom/fasterxml/jackson/databind/JsonSerializer;->serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V

    :cond_56
    :goto_56
    return-void
.end method

###### Class com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.AnonymousClass1 (com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1)
.class Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1;
.super Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper$Base;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;->depositSchemaProperty(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;

.field final synthetic val$visitor:Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;


# direct methods
.method constructor <init>(Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;)V
    .registers 4

    .line 165
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1;->this$0:Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;

    iput-object p3, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1;->val$visitor:Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;

    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper$Base;-><init>(Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method


# virtual methods
.method public expectObjectFormat(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 171
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1;->val$visitor:Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;

    return-object p0
.end method
