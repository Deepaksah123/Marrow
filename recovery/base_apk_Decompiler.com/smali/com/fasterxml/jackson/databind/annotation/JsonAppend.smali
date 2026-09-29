###### Class com.fasterxml.jackson.databind.annotation.JsonAppend (com.fasterxml.jackson.databind.annotation.JsonAppend)
.class public interface abstract annotation Lcom/fasterxml/jackson/databind/annotation/JsonAppend;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/databind/annotation/JsonAppend;
        attrs = {}
        prepend = false
        props = {}
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/annotation/JsonAppend$Attr;,
        Lcom/fasterxml/jackson/databind/annotation/JsonAppend$Prop;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract attrs()[Lcom/fasterxml/jackson/databind/annotation/JsonAppend$Attr;
.end method

.method public abstract prepend()Z
.end method

.method public abstract props()[Lcom/fasterxml/jackson/databind/annotation/JsonAppend$Prop;
.end method

###### Class com.fasterxml.jackson.databind.annotation.JsonAppend.Attr (com.fasterxml.jackson.databind.annotation.JsonAppend$Attr)
.class public interface abstract annotation Lcom/fasterxml/jackson/databind/annotation/JsonAppend$Attr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/databind/annotation/JsonAppend$Attr;
        include = .enum Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->NON_NULL:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
        propName = ""
        propNamespace = ""
        required = false
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/annotation/JsonAppend;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "Attr"
.end annotation


# virtual methods
.method public abstract include()Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
.end method

.method public abstract propName()Ljava/lang/String;
.end method

.method public abstract propNamespace()Ljava/lang/String;
.end method

.method public abstract required()Z
.end method

.method public abstract value()Ljava/lang/String;
.end method

###### Class com.fasterxml.jackson.databind.annotation.JsonAppend.Prop (com.fasterxml.jackson.databind.annotation.JsonAppend$Prop)
.class public interface abstract annotation Lcom/fasterxml/jackson/databind/annotation/JsonAppend$Prop;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/databind/annotation/JsonAppend$Prop;
        include = .enum Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->NON_NULL:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
        name = ""
        namespace = ""
        required = false
        type = Ljava/lang/Object;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/annotation/JsonAppend;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "Prop"
.end annotation


# virtual methods
.method public abstract include()Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract namespace()Ljava/lang/String;
.end method

.method public abstract required()Z
.end method

.method public abstract type()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract value()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/ser/VirtualBeanPropertyWriter;",
            ">;"
        }
    .end annotation
.end method
