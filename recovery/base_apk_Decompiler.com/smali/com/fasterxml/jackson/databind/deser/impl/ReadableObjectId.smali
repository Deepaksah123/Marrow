###### Class com.fasterxml.jackson.databind.deser.impl.ReadableObjectId (com.fasterxml.jackson.databind.deser.impl.ReadableObjectId)
.class public Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;
    }
.end annotation


# instance fields
.field protected _item:Ljava/lang/Object;

.field protected final _key:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;

.field protected _referringProperties:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;",
            ">;"
        }
    .end annotation
.end field

.field protected _resolver:Lcom/fasterxml/jackson/annotation/ObjectIdResolver;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;)V
    .registers 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_key:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;

    return-void
.end method


# virtual methods
.method public appendReferring(Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;)V
    .registers 3

    .line 45
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_referringProperties:Ljava/util/LinkedList;

    if-nez v0, :cond_b

    .line 46
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_referringProperties:Ljava/util/LinkedList;

    .line 48
    :cond_b
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_referringProperties:Ljava/util/LinkedList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public bindItem(Ljava/lang/Object;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_resolver:Lcom/fasterxml/jackson/annotation/ObjectIdResolver;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_key:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;

    invoke-interface {v0, v1, p1}, Lcom/fasterxml/jackson/annotation/ObjectIdResolver;->bindItem(Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;Ljava/lang/Object;)V

    .line 58
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_item:Ljava/lang/Object;

    .line 59
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_key:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;

    iget-object v0, v0, Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;->key:Ljava/lang/Object;

    .line 60
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_referringProperties:Ljava/util/LinkedList;

    if-eqz v1, :cond_28

    .line 61
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    .line 62
    iput-object v2, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_referringProperties:Ljava/util/LinkedList;

    .line 63
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_28

    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;

    invoke-virtual {p0, v0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;->handleResolvedForwardReference(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_18

    :cond_28
    return-void
.end method

.method public getKey()Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;
    .registers 1

    .line 41
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_key:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;

    return-object p0
.end method

.method public hasReferringProperties()Z
    .registers 1

    .line 74
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_referringProperties:Ljava/util/LinkedList;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public referringProperties()Ljava/util/Iterator;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_referringProperties:Ljava/util/LinkedList;

    if-nez p0, :cond_d

    .line 79
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0

    .line 81
    :cond_d
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public resolve()Ljava/lang/Object;
    .registers 3

    .line 70
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_resolver:Lcom/fasterxml/jackson/annotation/ObjectIdResolver;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_key:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;

    invoke-interface {v0, v1}, Lcom/fasterxml/jackson/annotation/ObjectIdResolver;->resolveId(Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_item:Ljava/lang/Object;

    return-object v0
.end method

.method public setResolver(Lcom/fasterxml/jackson/annotation/ObjectIdResolver;)V
    .registers 2

    .line 37
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_resolver:Lcom/fasterxml/jackson/annotation/ObjectIdResolver;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    .line 119
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;->_key:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator$IdKey;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public tryToResolveUnresolved(Lcom/fasterxml/jackson/databind/DeserializationContext;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

###### Class com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring (com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring)
.class public abstract Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Referring"
.end annotation


# instance fields
.field private final _beanType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final _reference:Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;Lcom/fasterxml/jackson/databind/JavaType;)V
    .registers 3

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;->_reference:Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;

    .line 139
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;->_beanType:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;Ljava/lang/Class;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;->_reference:Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;

    .line 134
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;->_beanType:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public getBeanType()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 143
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;->_beanType:Ljava/lang/Class;

    return-object p0
.end method

.method public getLocation()Lcom/fasterxml/jackson/core/JsonLocation;
    .registers 1

    .line 142
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;->_reference:Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JacksonException;->getLocation()Lcom/fasterxml/jackson/core/JsonLocation;

    move-result-object p0

    return-object p0
.end method

.method public abstract handleResolvedForwardReference(Ljava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public hasId(Ljava/lang/Object;)Z
    .registers 2

    .line 147
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ReadableObjectId$Referring;->_reference:Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/UnresolvedForwardReference;->getUnresolvedId()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
