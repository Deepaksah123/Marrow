###### Class com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy (com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy)
.class public abstract Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy$Provider;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract findNameForIsGetter(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract findNameForMutator(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract findNameForRegularGetter(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract modifyFieldName(Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;Ljava/lang/String;)Ljava/lang/String;
.end method

###### Class com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider (com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy$Provider)
.class public abstract Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy$Provider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Provider"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract forBuilder(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;"
        }
    .end annotation
.end method

.method public abstract forPOJO(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;"
        }
    .end annotation
.end method

.method public abstract forRecord(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;"
        }
    .end annotation
.end method
