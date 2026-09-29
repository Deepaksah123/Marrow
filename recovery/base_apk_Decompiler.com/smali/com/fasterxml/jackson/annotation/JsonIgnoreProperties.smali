###### Class com.fasterxml.jackson.annotation.JsonIgnoreProperties (com.fasterxml.jackson.annotation.JsonIgnoreProperties)
.class public interface abstract annotation Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
        allowGetters = false
        allowSetters = false
        ignoreUnknown = false
        value = {}
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
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
.method public abstract allowGetters()Z
.end method

.method public abstract allowSetters()Z
.end method

.method public abstract ignoreUnknown()Z
.end method

.method public abstract value()[Ljava/lang/String;
.end method

###### Class com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value (com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value)
.class public Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
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
.field protected static final EMPTY:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;


# instance fields
.field protected final _allowGetters:Z

.field protected final _allowSetters:Z

.field protected final _ignoreUnknown:Z

.field protected final _ignored:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected final _merge:Z


# direct methods
.method static constructor <clinit>()V
    .registers 7

    .line 118
    new-instance v6, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;-><init>(Ljava/util/Set;ZZZZ)V

    sput-object v6, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    return-void
.end method

.method protected constructor <init>(Ljava/util/Set;ZZZZ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZZZ)V"
        }
    .end annotation

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_c

    .line 137
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    goto :goto_e

    .line 139
    :cond_c
    iput-object p1, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    .line 141
    :goto_e
    iput-boolean p2, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    .line 142
    iput-boolean p3, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    .line 143
    iput-boolean p4, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    .line 144
    iput-boolean p5, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge:Z

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

    .line 415
    array-length v0, p0

    if-eqz v0, :cond_18

    .line 418
    new-instance v0, Ljava/util/HashSet;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 419
    array-length v1, p0

    const/4 v2, 0x0

    :goto_d
    if-ge v2, v1, :cond_17

    aget-object v3, p0, v2

    .line 420
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_17
    return-object v0

    .line 416
    :cond_18
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static _empty(Ljava/util/Set;ZZZZ)Z
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZZZ)Z"
        }
    .end annotation

    .line 441
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    iget-boolean v1, v0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    const/4 v2, 0x0

    if-ne p1, v1, :cond_1e

    iget-boolean p1, v0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    if-ne p2, p1, :cond_1e

    iget-boolean p1, v0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    if-ne p3, p1, :cond_1e

    iget-boolean p1, v0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge:Z

    if-ne p4, p1, :cond_1e

    if-eqz p0, :cond_1c

    .line 445
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p0

    if-eqz p0, :cond_1c

    return v2

    :cond_1c
    const/4 p0, 0x1

    return p0

    :cond_1e
    return v2
.end method

.method private static _equals(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;)Z
    .registers 4

    .line 405
    iget-boolean v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    iget-boolean v1, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    if-ne v0, v1, :cond_24

    iget-boolean v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge:Z

    iget-boolean v1, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge:Z

    if-ne v0, v1, :cond_24

    iget-boolean v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    iget-boolean v1, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    if-ne v0, v1, :cond_24

    iget-boolean v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    iget-boolean v1, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    if-ne v0, v1, :cond_24

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    iget-object p1, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    .line 410
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_24

    const/4 p0, 0x1

    return p0

    :cond_24
    const/4 p0, 0x0

    return p0
.end method

.method private static _merge(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 427
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    return-object p1

    .line 429
    :cond_7
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    return-object p0

    .line 432
    :cond_e
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 433
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 434
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public static construct(Ljava/util/Set;ZZZZ)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZZZ)",
            "Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;"
        }
    .end annotation

    .line 169
    invoke-static {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_empty(Ljava/util/Set;ZZZZ)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 170
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    return-object p0

    .line 172
    :cond_9
    new-instance v6, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;-><init>(Ljava/util/Set;ZZZZ)V

    return-object v6
.end method

.method public static empty()Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
    .registers 1

    .line 192
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    return-object v0
.end method

.method public static from(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
    .registers 5

    if-nez p0, :cond_5

    .line 149
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    return-object p0

    .line 151
    :cond_5
    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;->value()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_asSet([Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    .line 152
    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;->ignoreUnknown()Z

    move-result v1

    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;->allowGetters()Z

    move-result v2

    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;->allowSetters()Z

    move-result p0

    const/4 v3, 0x0

    .line 151
    invoke-static {v0, v1, v2, p0, v3}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->construct(Ljava/util/Set;ZZZZ)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    move-result-object p0

    return-object p0
.end method

.method public static merge(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
    .registers 2

    if-nez p0, :cond_3

    return-object p1

    .line 207
    :cond_3
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    move-result-object p0

    return-object p0
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

    .line 399
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_1b

    check-cast p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    .line 400
    invoke-static {p0, p1}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_equals(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;)Z

    move-result p0

    if-eqz p0, :cond_1b

    return v0

    :cond_1b
    return v1
.end method

.method public findIgnoredForDeserialization()Ljava/util/Set;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 357
    iget-boolean v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    if-eqz v0, :cond_9

    .line 358
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 360
    :cond_9
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    return-object p0
.end method

.method public findIgnoredForSerialization()Ljava/util/Set;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 343
    iget-boolean v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    if-eqz v0, :cond_9

    .line 344
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 346
    :cond_9
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    return-object p0
.end method

.method public getIgnoreUnknown()Z
    .registers 1

    .line 364
    iget-boolean p0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    return p0
.end method

.method public hashCode()I
    .registers 5

    .line 387
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    iget-boolean v1, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    if-eqz v1, :cond_c

    const/4 v1, 0x1

    goto :goto_d

    :cond_c
    const/4 v1, -0x3

    :goto_d
    iget-boolean v2, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    if-eqz v2, :cond_13

    const/4 v2, 0x3

    goto :goto_14

    :cond_13
    const/4 v2, -0x7

    :goto_14
    iget-boolean v3, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    if-eqz v3, :cond_1a

    const/4 v3, 0x7

    goto :goto_1c

    :cond_1a
    const/16 v3, -0xb

    :goto_1c
    iget-boolean p0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge:Z

    if-eqz p0, :cond_23

    const/16 p0, 0xb

    goto :goto_25

    :cond_23
    const/16 p0, -0xd

    :goto_25
    add-int/2addr v0, v1

    add-int/2addr v0, v2

    add-int/2addr v0, v3

    add-int/2addr v0, p0

    return v0
.end method

.method protected readResolve()Ljava/lang/Object;
    .registers 6

    .line 325
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    iget-boolean v1, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    iget-boolean v2, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    iget-boolean v3, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    iget-boolean v4, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge:Z

    invoke-static {v0, v1, v2, v3, v4}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_empty(Ljava/util/Set;ZZZZ)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 326
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    :cond_12
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    .line 381
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    iget-boolean v1, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    .line 382
    iget-boolean v2, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    iget-boolean v3, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    iget-boolean p0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 381
    const-string v0, "JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public withOverrides(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
    .registers 7

    if-eqz p1, :cond_40

    .line 247
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    if-ne p1, v0, :cond_7

    goto :goto_40

    .line 252
    :cond_7
    iget-boolean v0, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge:Z

    if-nez v0, :cond_c

    return-object p1

    .line 255
    :cond_c
    invoke-static {p0, p1}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_equals(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;)Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_40

    .line 260
    :cond_13
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    iget-object v1, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignored:Ljava/util/Set;

    invoke-static {v0, v1}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_merge(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 261
    iget-boolean v1, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_27

    iget-boolean v1, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_ignoreUnknown:Z

    if-nez v1, :cond_27

    move v1, v2

    goto :goto_28

    :cond_27
    move v1, v3

    .line 262
    :goto_28
    iget-boolean v4, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    if-nez v4, :cond_32

    iget-boolean v4, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowGetters:Z

    if-nez v4, :cond_32

    move v4, v2

    goto :goto_33

    :cond_32
    move v4, v3

    .line 263
    :goto_33
    iget-boolean p0, p0, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    if-nez p0, :cond_3b

    iget-boolean p0, p1, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->_allowSetters:Z

    if-eqz p0, :cond_3c

    :cond_3b
    move v2, v3

    .line 266
    :cond_3c
    invoke-static {v0, v1, v4, v2, v3}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->construct(Ljava/util/Set;ZZZZ)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    move-result-object p0

    :cond_40
    :goto_40
    return-object p0
.end method
