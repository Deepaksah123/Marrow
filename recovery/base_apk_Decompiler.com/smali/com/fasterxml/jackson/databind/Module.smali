###### Class com.fasterxml.jackson.databind.Module (com.fasterxml.jackson.databind.Module)
.class public abstract Lcom/fasterxml/jackson/databind/Module;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/Module$SetupContext;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDependencies()Ljava/lang/Iterable;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/fasterxml/jackson/databind/Module;",
            ">;"
        }
    .end annotation

    .line 87
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public abstract getModuleName()Ljava/lang/String;
.end method

.method public getTypeId()Ljava/lang/Object;
    .registers 1

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public abstract setupModule(Lcom/fasterxml/jackson/databind/Module$SetupContext;)V
.end method

.method public abstract version()Lcom/fasterxml/jackson/core/Version;
.end method

###### Class com.fasterxml.jackson.databind.Module.SetupContext (com.fasterxml.jackson.databind.Module$SetupContext)
.class public interface abstract Lcom/fasterxml/jackson/databind/Module$SetupContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/Module;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "SetupContext"
.end annotation


# virtual methods
.method public abstract addAbstractTypeResolver(Lcom/fasterxml/jackson/databind/AbstractTypeResolver;)V
.end method

.method public abstract addBeanDeserializerModifier(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;)V
.end method

.method public abstract addBeanSerializerModifier(Lcom/fasterxml/jackson/databind/ser/BeanSerializerModifier;)V
.end method

.method public abstract addDeserializers(Lcom/fasterxml/jackson/databind/deser/Deserializers;)V
.end method

.method public abstract addKeyDeserializers(Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;)V
.end method

.method public abstract addKeySerializers(Lcom/fasterxml/jackson/databind/ser/Serializers;)V
.end method

.method public abstract addSerializers(Lcom/fasterxml/jackson/databind/ser/Serializers;)V
.end method

.method public abstract addValueInstantiators(Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V
.end method

.method public abstract appendAnnotationIntrospector(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)V
.end method

.method public abstract insertAnnotationIntrospector(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)V
.end method

.method public abstract isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z
.end method

.method public abstract isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z
.end method

.method public varargs abstract registerSubtypes([Lcom/fasterxml/jackson/databind/jsontype/NamedType;)V
.end method

.method public abstract setMixInAnnotations(Ljava/lang/Class;Ljava/lang/Class;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract setNamingStrategy(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)V
.end method
