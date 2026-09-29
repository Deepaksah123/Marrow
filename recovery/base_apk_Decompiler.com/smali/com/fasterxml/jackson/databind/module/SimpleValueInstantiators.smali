###### Class com.fasterxml.jackson.databind.module.SimpleValueInstantiators (com.fasterxml.jackson.databind.module.SimpleValueInstantiators)
.class public Lcom/fasterxml/jackson/databind/module/SimpleValueInstantiators;
.super Lcom/fasterxml/jackson/databind/deser/ValueInstantiators$Base;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected _classMappings:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/fasterxml/jackson/databind/type/ClassKey;",
            "Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 30
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiators$Base;-><init>()V

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleValueInstantiators;->_classMappings:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public findValueInstantiator(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;)Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
    .registers 4

    .line 45
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/module/SimpleValueInstantiators;->_classMappings:Ljava/util/HashMap;

    new-instance p1, Lcom/fasterxml/jackson/databind/type/ClassKey;

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/BeanDescription;->getBeanClass()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/fasterxml/jackson/databind/type/ClassKey;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;

    if-nez p0, :cond_14

    return-object p3

    :cond_14
    return-object p0
.end method
