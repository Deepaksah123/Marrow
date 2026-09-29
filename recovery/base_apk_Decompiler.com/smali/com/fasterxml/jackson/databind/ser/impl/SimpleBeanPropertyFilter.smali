###### Class com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter (com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter)
.class public Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;
.implements Lcom/fasterxml/jackson/databind/ser/PropertyFilter;


# direct methods
.method protected constructor <init>()V
    .registers 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static from(Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;)Lcom/fasterxml/jackson/databind/ser/PropertyFilter;
    .registers 2

    .line 98
    new-instance v0, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter$1;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter$1;-><init>(Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;)V

    return-object v0
.end method


# virtual methods
.method public depositSchemaProperty(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 201
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;->include(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 202
    invoke-virtual {p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/PropertyWriter;->depositSchemaProperty(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    :cond_9
    return-void
.end method

.method public depositSchemaProperty(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 190
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;->include(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 191
    invoke-virtual {p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/PropertyWriter;->depositSchemaProperty(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    :cond_9
    return-void
.end method

.method public depositSchemaProperty(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 250
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;->include(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 251
    invoke-virtual {p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/PropertyWriter;->depositSchemaProperty(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    :cond_9
    return-void
.end method

.method public depositSchemaProperty(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 240
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;->include(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 241
    invoke-virtual {p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/PropertyWriter;->depositSchemaProperty(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    :cond_9
    return-void
.end method

.method protected include(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)Z
    .registers 2

    const/4 p0, 0x1

    return p0
.end method

.method protected include(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;)Z
    .registers 2

    const/4 p0, 0x1

    return p0
.end method

.method public serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 177
    invoke-virtual {p0, p4}, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;->include(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)Z

    move-result p0

    if-eqz p0, :cond_a

    .line 178
    invoke-virtual {p4, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/PropertyWriter;->serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void

    .line 179
    :cond_a
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->canOmitFields()Z

    move-result p0

    if-nez p0, :cond_13

    .line 180
    invoke-virtual {p4, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/PropertyWriter;->serializeAsOmittedField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    :cond_13
    return-void
.end method

.method public serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/ser/PropertyWriter;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 217
    invoke-virtual {p0, p4}, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;->include(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;)Z

    move-result p0

    if-eqz p0, :cond_a

    .line 218
    invoke-virtual {p4, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/PropertyWriter;->serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void

    .line 219
    :cond_a
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->canOmitFields()Z

    move-result p0

    if-nez p0, :cond_13

    .line 220
    invoke-virtual {p4, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/PropertyWriter;->serializeAsOmittedField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    :cond_13
    return-void
.end method

###### Class com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.AnonymousClass1 (com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$1)
.class final Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/ser/PropertyFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;->from(Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;)Lcom/fasterxml/jackson/databind/ser/PropertyFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic val$src:Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;


# direct methods
.method constructor <init>(Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;)V
    .registers 2

    .line 98
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter$1;->val$src:Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final depositSchemaProperty(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 117
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter$1;->val$src:Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;

    check-cast p1, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-interface {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;->depositSchemaProperty(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method

.method public final depositSchemaProperty(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 110
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter$1;->val$src:Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;

    check-cast p1, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-interface {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;->depositSchemaProperty(Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method

.method public final serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/ser/PropertyWriter;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 103
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter$1;->val$src:Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;

    check-cast p4, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-interface {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;->serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V

    return-void
.end method
