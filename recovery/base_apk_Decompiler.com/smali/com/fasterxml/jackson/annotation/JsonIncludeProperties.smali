###### Class com.fasterxml.jackson.annotation.JsonIncludeProperties (com.fasterxml.jackson.annotation.JsonIncludeProperties)
.class public interface abstract annotation Lcom/fasterxml/jackson/annotation/JsonIncludeProperties;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/annotation/JsonIncludeProperties;
        value = {}
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->CONSTRUCTOR:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract value()[Ljava/lang/String;
.end method

###### Class com.fasterxml.jackson.annotation.JsonIncludeProperties.Value (com.fasterxml.jackson.annotation.JsonIncludeProperties$Value)
.class public Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/JsonIncludeProperties;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Value"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field protected static final ALL:Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;


# instance fields
.field protected final _included:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 57
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;-><init>(Ljava/util/Set;)V

    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->ALL:Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;

    return-void
.end method

.method protected constructor <init>(Ljava/util/Set;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_included:Ljava/util/Set;

    return-void
.end method

.method private static _asSet([Ljava/lang/String;)Ljava/util/Set;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_18

    .line 154
    array-length v0, p0

    if-eqz v0, :cond_18

    .line 157
    new-instance v0, Ljava/util/HashSet;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 158
    array-length v1, p0

    const/4 v2, 0x0

    :goto_d
    if-ge v2, v1, :cond_17

    aget-object v3, p0, v2

    .line 159
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_17
    return-object v0

    .line 155
    :cond_18
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static _equals(Ljava/util/Set;Ljava/util/Set;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    if-nez p0, :cond_8

    if-nez p1, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0

    .line 149
    :cond_8
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static all()Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;
    .registers 1

    .line 80
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->ALL:Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;

    return-object v0
.end method

.method public static from(Lcom/fasterxml/jackson/annotation/JsonIncludeProperties;)Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;
    .registers 2

    if-nez p0, :cond_5

    .line 73
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->ALL:Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;

    return-object p0

    .line 75
    :cond_5
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;

    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties;->value()[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_asSet([Ljava/lang/String;)Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;-><init>(Ljava/util/Set;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-nez p1, :cond_8

    return v1

    .line 142
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_1f

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_included:Ljava/util/Set;

    check-cast p1, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;

    iget-object p1, p1, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_included:Ljava/util/Set;

    invoke-static {p0, p1}, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_equals(Ljava/util/Set;Ljava/util/Set;)Z

    move-result p0

    if-eqz p0, :cond_1f

    return v0

    :cond_1f
    return v1
.end method

.method public getIncluded()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 94
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_included:Ljava/util/Set;

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    .line 135
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_included:Ljava/util/Set;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .line 129
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_included:Ljava/util/Set;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "JsonIncludeProperties.Value(included=%s)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public withOverrides(Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;)Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;
    .registers 5

    if-eqz p1, :cond_34

    .line 109
    invoke-virtual {p1}, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->getIncluded()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_34

    .line 113
    :cond_9
    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_included:Ljava/util/Set;

    if-nez v1, :cond_e

    return-object p1

    .line 117
    :cond_e
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 118
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 119
    iget-object v2, p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;->_included:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 120
    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_17

    .line 124
    :cond_2f
    new-instance p0, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;-><init>(Ljava/util/Set;)V

    :cond_34
    :goto_34
    return-object p0
.end method
