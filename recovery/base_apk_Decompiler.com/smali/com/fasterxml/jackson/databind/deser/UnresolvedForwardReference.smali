###### Class com.fasterxml.jackson.databind.deser.UnresolvedForwardReference (com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)
.class public Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;
.super Lcom/fasterxml/jackson/databind/JsonMappingException;
.source "SourceFile"


# instance fields
.field private _roid:Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;

.field private _unresolvedIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/deser/UnresolvedId;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V
    .registers 3

    .line 36
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 37
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->_unresolvedIds:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;)V
    .registers 5

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/io/Closeable;Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;)V

    .line 29
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->_roid:Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;

    return-void
.end method


# virtual methods
.method public addUnresolvedId(Ljava/lang/Object;Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonLocation;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/core/JsonLocation;",
            ")V"
        }
    .end annotation

    .line 55
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->_unresolvedIds:Ljava/util/List;

    new-instance v0, Lcom/fasterxml/jackson/databind/deser/UnresolvedId;

    invoke-direct {v0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/UnresolvedId;-><init>(Ljava/lang/Object;Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonLocation;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public fillInStackTrace()Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;
    .registers 1

    monitor-enter p0

    .line 94
    monitor-exit p0

    return-object p0
.end method

.method public bridge synthetic fillInStackTrace()Ljava/lang/Throwable;
    .registers 1

    .line 19
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->fillInStackTrace()Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;

    move-result-object p0

    return-object p0
.end method

.method public getMessage()Ljava/lang/String;
    .registers 3

    .line 65
    invoke-super {p0}, Lcom/fasterxml/jackson/databind/JsonMappingException;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 66
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->_unresolvedIds:Ljava/util/List;

    if-nez v1, :cond_9

    return-object v0

    .line 70
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->_unresolvedIds:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 72
    :cond_14
    :goto_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_33

    .line 73
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/deser/UnresolvedId;

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 76
    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_14

    :cond_33
    const/16 p0, 0x2e

    .line 79
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getRoid()Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;
    .registers 1

    .line 47
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->_roid:Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;

    return-object p0
.end method

.method public getUnresolvedId()Ljava/lang/Object;
    .registers 1

    .line 51
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->_roid:Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->getKey()Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;

    move-result-object p0

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;->key:Ljava/lang/Object;

    return-object p0
.end method

.method public withStackTrace()Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;
    .registers 1

    .line 104
    invoke-super {p0}, Lcom/fasterxml/jackson/databind/JsonMappingException;->fillInStackTrace()Ljava/lang/Throwable;

    return-object p0
.end method
