###### Class com.fasterxml.jackson.databind.deser.ValueInstantiators (com.fasterxml.jackson.databind.deser.ValueInstantiators)
.class public interface abstract Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/ValueInstantiators$Base;
    }
.end annotation


# virtual methods
.method public abstract findValueInstantiator(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;)Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
.end method

###### Class com.fasterxml.jackson.databind.deser.ValueInstantiators.Base (com.fasterxml.jackson.databind.deser.ValueInstantiators$Base)
.class public Lcom/fasterxml/jackson/databind/deser/ValueInstantiators$Base;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Base"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findValueInstantiator(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;)Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
    .registers 4

    return-object p3
.end method
