###### Class com.fasterxml.jackson.databind.introspect.ClassIntrospector (com.fasterxml.jackson.databind.introspect.ClassIntrospector)
.class public abstract Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .registers 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract forClassAnnotations(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;)Lcom/fasterxml/jackson/databind/BeanDescription;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;",
            ")",
            "Lcom/fasterxml/jackson/databind/BeanDescription;"
        }
    .end annotation
.end method

.method public abstract forCreation(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;)Lcom/fasterxml/jackson/databind/BeanDescription;
.end method

.method public abstract forDeserialization(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;)Lcom/fasterxml/jackson/databind/BeanDescription;
.end method

.method public abstract forDeserializationWithBuilder(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/BeanDescription;
.end method

.method public abstract forSerialization(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;)Lcom/fasterxml/jackson/databind/BeanDescription;
.end method

###### Class com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver (com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)
.class public interface abstract Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MixInResolver"
.end annotation


# virtual methods
.method public abstract findMixInClassFor(Ljava/lang/Class;)Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method
