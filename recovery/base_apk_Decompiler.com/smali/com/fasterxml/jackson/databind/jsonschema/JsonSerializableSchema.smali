###### Class com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema (com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema)
.class public interface abstract annotation Lcom/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema;
        id = ""
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract id()Ljava/lang/String;
.end method
