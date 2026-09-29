###### Class com.fasterxml.jackson.databind.ser.PropertyWriter (com.fasterxml.jackson.databind.ser.PropertyWriter)
.class public abstract Lcom/fasterxml/jackson/databind/ser/PropertyWriter;
.super Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/PropertyMetadata;)V
    .registers 2

    .line 27
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;-><init>(Lcom/fasterxml/jackson/databind/PropertyMetadata;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;)V
    .registers 2

    .line 31
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->getMetadata()Lcom/fasterxml/jackson/databind/PropertyMetadata;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;-><init>(Lcom/fasterxml/jackson/databind/PropertyMetadata;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/ser/PropertyWriter;)V
    .registers 2

    .line 35
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;-><init>(Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;)V

    return-void
.end method


# virtual methods
.method public abstract depositSchemaProperty(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation
.end method

.method public abstract depositSchemaProperty(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract serializeAsOmittedField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
