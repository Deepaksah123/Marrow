###### Class com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor (com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)
.class public interface abstract Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWithSerializerProvider;


# virtual methods
.method public abstract optionalProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation
.end method

.method public abstract property(Lcom/fasterxml/jackson/databind/BeanProperty;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation
.end method
