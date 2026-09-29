###### Class com.fasterxml.jackson.annotation.ObjectIdGenerators (com.fasterxml.jackson.annotation.ObjectIdGenerators)
.class public Lcom/fasterxml/jackson/annotation/ObjectIdGenerators;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base;,
        Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$None;,
        Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

###### Class com.fasterxml.jackson.annotation.ObjectIdGenerators.Base (com.fasterxml.jackson.annotation.ObjectIdGenerators$Base)
.class public abstract Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base;
.super Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/ObjectIdGenerators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Base"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/fasterxml/jackson/annotation/ObjectIdGenerator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final _scope:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Class;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base;->_scope:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public canUseFor(Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/annotation/ObjectIdGenerator<",
            "*>;)Z"
        }
    .end annotation

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_14

    invoke-virtual {p1}, Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;->getScope()Ljava/lang/Class;

    move-result-object p1

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base;->_scope:Ljava/lang/Class;

    if-ne p1, p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public final getScope()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 37
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base;->_scope:Ljava/lang/Class;

    return-object p0
.end method

###### Class com.fasterxml.jackson.annotation.ObjectIdGenerators.None (com.fasterxml.jackson.annotation.ObjectIdGenerators$None)
.class public abstract Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$None;
.super Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/ObjectIdGenerators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "None"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/annotation/ObjectIdGenerator<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 61
    invoke-direct {p0}, Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;-><init>()V

    return-void
.end method

###### Class com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator (com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator)
.class public abstract Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator;
.super Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/ObjectIdGenerators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PropertyGenerator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 75
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic canUseFor(Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;)Z
    .registers 2

    .line 72
    invoke-super {p0, p1}, Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$Base;->canUseFor(Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;)Z

    move-result p0

    return p0
.end method
